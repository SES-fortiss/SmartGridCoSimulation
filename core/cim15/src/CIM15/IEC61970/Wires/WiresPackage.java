/**
 */
package CIM15.IEC61970.Wires;

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

import CIM15.IEC61970.StateVariables.StateVariablesPackage;

import CIM15.IEC61970.Topology.TopologyPackage;

import CIM15.IEC61970.WiresPhaseModel.WiresPhaseModelPackage;

import CIM15.IEC62325.IEC62325Package;

import CIM15.PackageDependencies.PackageDependenciesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
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
 * @see CIM15.IEC61970.Wires.WiresFactory
 * @generated
 */
public class WiresPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Wires";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Wires";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimWires";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WiresPackage eINSTANCE = CIM15.IEC61970.Wires.WiresPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData <em>Phase Impedance Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseImpedanceData()
	 * @generated
	 */
	public static final int PHASE_IMPEDANCE_DATA = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA__R = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA__X = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA__B = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Phase Impedance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Phase Impedance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_IMPEDANCE_DATA_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TapSchedule <em>Tap Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TapSchedule
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTapSchedule()
	 * @generated
	 */
	public static final int TAP_SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__UUID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__NAMES = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__DIAGRAM_OBJECTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__MRID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__ALIAS_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__MODELING_AUTHORITY_SET = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__START_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__VALUE1_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__VALUE2_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__VALUE1_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__VALUE2_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__END_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__TIME_STEP = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__TIME_POINTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__SEASON = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__DAY_TYPE = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE__TAP_CHANGER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tap Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE_FEATURE_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tap Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_SCHEDULE_OPERATION_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance <em>Transformer Star Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerStarImpedance()
	 * @generated
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__R = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformer Star Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformer Star Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_STAR_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Switch <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Switch
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSwitch()
	 * @generated
	 */
	public static final int SWITCH = 47;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SWITCH_ON_DATE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__NORMAL_OPEN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__RATED_CURRENT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SWITCHING_OPERATIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__LOAD_MGMT_FUNCTIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__RETAINED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__CONNECT_DISCONNECT_FUNCTIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SWITCH_ON_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SWITCH_SCHEDULES = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__SWITCH_PHASES = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH__COMPOSITE_SWITCH = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.ProtectedSwitch <em>Protected Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch
	 * @see CIM15.IEC61970.Wires.WiresPackage#getProtectedSwitch()
	 * @generated
	 */
	public static final int PROTECTED_SWITCH = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__NAMES = SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__DIAGRAM_OBJECTS = SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__NORMALLY_IN_SERVICE = SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__RATED_CURRENT = SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__SWITCH_PHASES = SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Protection Equipments2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2 = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breaking Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__BREAKING_CAPACITY = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH__RECLOSE_SEQUENCES = SWITCH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Protected Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Protected Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Recloser <em>Recloser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Recloser
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRecloser()
	 * @generated
	 */
	public static final int RECLOSER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__UUID = PROTECTED_SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__NAMES = PROTECTED_SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__DIAGRAM_OBJECTS = PROTECTED_SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__MRID = PROTECTED_SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__ALIAS_NAME = PROTECTED_SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__NAME = PROTECTED_SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__MODELING_AUTHORITY_SET = PROTECTED_SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__CHANGE_ITEMS = PROTECTED_SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SCHEDULE_STEPS = PROTECTED_SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SAFETY_DOCUMENTS = PROTECTED_SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__OPERATING_SHARE = PROTECTED_SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__DOCUMENT_ROLES = PROTECTED_SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__PSR_LISTS = PROTECTED_SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__MEASUREMENTS = PROTECTED_SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__REPORTING_GROUP = PROTECTED_SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__PSR_TYPE = PROTECTED_SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__ASSETS = PROTECTED_SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__ERP_ORGANISATION_ROLES = PROTECTED_SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__LOCATION = PROTECTED_SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__PSR_EVENT = PROTECTED_SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__NETWORK_DATA_SETS = PROTECTED_SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__OUTAGE_SCHEDULE = PROTECTED_SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__CONTINGENCY_EQUIPMENT = PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__CUSTOMER_AGREEMENTS = PROTECTED_SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__NORMALLY_IN_SERVICE = PROTECTED_SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__AGGREGATE = PROTECTED_SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__EQUIPMENT_CONTAINER = PROTECTED_SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__BASE_VOLTAGE = PROTECTED_SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__CLEARANCE_TAGS = PROTECTED_SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__PROTECTION_EQUIPMENTS = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__TERMINALS = PROTECTED_SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__OUTAGE_STEP_ROLES = PROTECTED_SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SV_STATUS = PROTECTED_SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SWITCH_ON_DATE = PROTECTED_SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__NORMAL_OPEN = PROTECTED_SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__RATED_CURRENT = PROTECTED_SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SWITCHING_OPERATIONS = PROTECTED_SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__LOAD_MGMT_FUNCTIONS = PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__RETAINED = PROTECTED_SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__CONNECT_DISCONNECT_FUNCTIONS = PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SWITCH_ON_COUNT = PROTECTED_SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SWITCH_SCHEDULES = PROTECTED_SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__SWITCH_PHASES = PROTECTED_SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__COMPOSITE_SWITCH = PROTECTED_SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Protection Equipments2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__PROTECTION_EQUIPMENTS2 = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2;

	/**
	 * The feature id for the '<em><b>Breaking Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__BREAKING_CAPACITY = PROTECTED_SWITCH__BREAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER__RECLOSE_SEQUENCES = PROTECTED_SWITCH__RECLOSE_SEQUENCES;

	/**
	 * The number of structural features of the '<em>Recloser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_FEATURE_COUNT = PROTECTED_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recloser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_OPERATION_COUNT = PROTECTED_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRatioTapChangerTabularPoint()
	 * @generated
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT__X = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT__RATIO = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT__STEP = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ratio Tap Changer Tabular Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ratio Tap Changer Tabular Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_POINT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerTabular()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer Tabular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Phase Tap Changer Tabular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TapChanger <em>Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TapChanger
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChanger()
	 * @generated
	 */
	public static final int TAP_CHANGER = 55;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__TAP_CHANGER_INFO = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__NEUTRAL_U = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__REGULATION_STATUS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__SUBSEQUENT_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__NORMAL_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__LTC_FLAG = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__TAP_SCHEDULES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__LOW_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__NEUTRAL_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__INITIAL_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__TAP_CHANGER_CONTROL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__HIGH_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER__SV_TAP_STEP = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RatioTapChanger <em>Ratio Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RatioTapChanger
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRatioTapChanger()
	 * @generated
	 */
	public static final int RATIO_TAP_CHANGER = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__UUID = TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__NAMES = TAP_CHANGER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__DIAGRAM_OBJECTS = TAP_CHANGER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__MRID = TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__ALIAS_NAME = TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__NAME = TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__MODELING_AUTHORITY_SET = TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__CHANGE_ITEMS = TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__SCHEDULE_STEPS = TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__SAFETY_DOCUMENTS = TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__OPERATING_SHARE = TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__DOCUMENT_ROLES = TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__PSR_LISTS = TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__MEASUREMENTS = TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__REPORTING_GROUP = TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__PSR_TYPE = TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__ASSETS = TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__ERP_ORGANISATION_ROLES = TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__LOCATION = TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__PSR_EVENT = TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__NETWORK_DATA_SETS = TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__OUTAGE_SCHEDULE = TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__TAP_CHANGER_INFO = TAP_CHANGER__TAP_CHANGER_INFO;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__NEUTRAL_U = TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__REGULATION_STATUS = TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__SUBSEQUENT_DELAY = TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__NORMAL_STEP = TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__LTC_FLAG = TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__TAP_SCHEDULES = TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__LOW_STEP = TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__NEUTRAL_STEP = TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__INITIAL_DELAY = TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__TAP_CHANGER_CONTROL = TAP_CHANGER__TAP_CHANGER_CONTROL;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__HIGH_STEP = TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__SV_TAP_STEP = TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT = TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR = TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__TCUL_CONTROL_MODE = TAP_CHANGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER__TRANSFORMER_END = TAP_CHANGER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ratio Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_FEATURE_COUNT = TAP_CHANGER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ratio Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_OPERATION_COUNT = TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChanger <em>Phase Tap Changer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChanger()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__UUID = TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__NAMES = TAP_CHANGER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__DIAGRAM_OBJECTS = TAP_CHANGER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__MRID = TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__ALIAS_NAME = TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__NAME = TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__MODELING_AUTHORITY_SET = TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__CHANGE_ITEMS = TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__SCHEDULE_STEPS = TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__SAFETY_DOCUMENTS = TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__OPERATING_SHARE = TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__DOCUMENT_ROLES = TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__PSR_LISTS = TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__MEASUREMENTS = TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__REPORTING_GROUP = TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__PSR_TYPE = TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__ASSETS = TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__ERP_ORGANISATION_ROLES = TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__LOCATION = TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__PSR_EVENT = TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__NETWORK_DATA_SETS = TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__OUTAGE_SCHEDULE = TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__TAP_CHANGER_INFO = TAP_CHANGER__TAP_CHANGER_INFO;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__NEUTRAL_U = TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__REGULATION_STATUS = TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__SUBSEQUENT_DELAY = TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__NORMAL_STEP = TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__LTC_FLAG = TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__TAP_SCHEDULES = TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__LOW_STEP = TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__NEUTRAL_STEP = TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__INITIAL_DELAY = TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__TAP_CHANGER_CONTROL = TAP_CHANGER__TAP_CHANGER_CONTROL;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__HIGH_STEP = TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__SV_TAP_STEP = TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR = TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER__TRANSFORMER_END = TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_FEATURE_COUNT = TAP_CHANGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Phase Tap Changer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_OPERATION_COUNT = TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear <em>Phase Tap Changer Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerLinear
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerLinear()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__UUID = PHASE_TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__NAMES = PHASE_TAP_CHANGER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__DIAGRAM_OBJECTS = PHASE_TAP_CHANGER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__MRID = PHASE_TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__ALIAS_NAME = PHASE_TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__NAME = PHASE_TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__MODELING_AUTHORITY_SET = PHASE_TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__CHANGE_ITEMS = PHASE_TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__SCHEDULE_STEPS = PHASE_TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__SAFETY_DOCUMENTS = PHASE_TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__OPERATING_SHARE = PHASE_TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__DOCUMENT_ROLES = PHASE_TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__PSR_LISTS = PHASE_TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__MEASUREMENTS = PHASE_TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__REPORTING_GROUP = PHASE_TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__PSR_TYPE = PHASE_TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__ASSETS = PHASE_TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__ERP_ORGANISATION_ROLES = PHASE_TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__LOCATION = PHASE_TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__PSR_EVENT = PHASE_TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__NETWORK_DATA_SETS = PHASE_TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__OUTAGE_SCHEDULE = PHASE_TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__TAP_CHANGER_INFO = PHASE_TAP_CHANGER__TAP_CHANGER_INFO;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__NEUTRAL_U = PHASE_TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__REGULATION_STATUS = PHASE_TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__SUBSEQUENT_DELAY = PHASE_TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__NORMAL_STEP = PHASE_TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__LTC_FLAG = PHASE_TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__TAP_SCHEDULES = PHASE_TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__LOW_STEP = PHASE_TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__NEUTRAL_STEP = PHASE_TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__INITIAL_DELAY = PHASE_TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__TAP_CHANGER_CONTROL = PHASE_TAP_CHANGER__TAP_CHANGER_CONTROL;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__HIGH_STEP = PHASE_TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__SV_TAP_STEP = PHASE_TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__PHASE_TAP_CHANGER_TABULAR = PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__TRANSFORMER_END = PHASE_TAP_CHANGER__TRANSFORMER_END;

	/**
	 * The feature id for the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR__STEP_PHASE_SHIFT_INCREMENT = PHASE_TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR_FEATURE_COUNT = PHASE_TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phase Tap Changer Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_LINEAR_OPERATION_COUNT = PHASE_TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Conductor <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Conductor
	 * @see CIM15.IEC61970.Wires.WiresPackage#getConductor()
	 * @generated
	 */
	public static final int CONDUCTOR = 56;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR__LENGTH = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.ACLineSegment <em>AC Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.ACLineSegment
	 * @see CIM15.IEC61970.Wires.WiresPackage#getACLineSegment()
	 * @generated
	 */
	public static final int AC_LINE_SEGMENT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__UUID = CONDUCTOR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__NAMES = CONDUCTOR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__DIAGRAM_OBJECTS = CONDUCTOR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__MRID = CONDUCTOR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__ALIAS_NAME = CONDUCTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__NAME = CONDUCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__MODELING_AUTHORITY_SET = CONDUCTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CHANGE_ITEMS = CONDUCTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__SCHEDULE_STEPS = CONDUCTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__SAFETY_DOCUMENTS = CONDUCTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__OPERATING_SHARE = CONDUCTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__DOCUMENT_ROLES = CONDUCTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__PSR_LISTS = CONDUCTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__MEASUREMENTS = CONDUCTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__REPORTING_GROUP = CONDUCTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__PSR_TYPE = CONDUCTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__ASSETS = CONDUCTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__ERP_ORGANISATION_ROLES = CONDUCTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__LOCATION = CONDUCTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__PSR_EVENT = CONDUCTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__NETWORK_DATA_SETS = CONDUCTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__OUTAGE_SCHEDULE = CONDUCTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CONTINGENCY_EQUIPMENT = CONDUCTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CUSTOMER_AGREEMENTS = CONDUCTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__NORMALLY_IN_SERVICE = CONDUCTOR__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__AGGREGATE = CONDUCTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__EQUIPMENT_CONTAINER = CONDUCTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__BASE_VOLTAGE = CONDUCTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CLEARANCE_TAGS = CONDUCTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__PROTECTION_EQUIPMENTS = CONDUCTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__TERMINALS = CONDUCTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__OUTAGE_STEP_ROLES = CONDUCTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__SV_STATUS = CONDUCTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__LENGTH = CONDUCTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__G0CH = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE = CONDUCTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conductor Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CONDUCTOR_ASSETS = CONDUCTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__R = CONDUCTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__X = CONDUCTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conductor Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CONDUCTOR_INFO = CONDUCTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__GCH = CONDUCTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__R0 = CONDUCTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__BCH = CONDUCTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__B0CH = CONDUCTOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CUT = CONDUCTOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Phase Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__PHASE_IMPEDANCE = CONDUCTOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Clamp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__CLAMP = CONDUCTOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT__X0 = CONDUCTOR_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>AC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>AC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AC_LINE_SEGMENT_OPERATION_COUNT = CONDUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerEnd <em>Transformer End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerEnd
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerEnd()
	 * @generated
	 */
	public static final int TRANSFORMER_END = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__END_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__RGROUND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__FROM_WINDING_INSULATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core Admittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__CORE_ADMITTANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__GROUNDED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transformer End Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__TRANSFORMER_END_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mag Base U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__MAG_BASE_U = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mag Sat Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__MAG_SAT_FLUX = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__PHASE_TAP_CHANGER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__RATIO_TAP_CHANGER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bmag Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__BMAG_SAT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__XGROUND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>From Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__FROM_MESH_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>To Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__TO_WINDING_INSULATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>To Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__TO_MESH_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Star Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END__STAR_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Transformer End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Transformer End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd <em>Power Transformer End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPowerTransformerEnd()
	 * @generated
	 */
	public static final int POWER_TRANSFORMER_END = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__UUID = TRANSFORMER_END__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__NAMES = TRANSFORMER_END__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__DIAGRAM_OBJECTS = TRANSFORMER_END__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__MRID = TRANSFORMER_END__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__ALIAS_NAME = TRANSFORMER_END__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__NAME = TRANSFORMER_END__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__MODELING_AUTHORITY_SET = TRANSFORMER_END__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__TERMINAL = TRANSFORMER_END__TERMINAL;

	/**
	 * The feature id for the '<em><b>End Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__END_NUMBER = TRANSFORMER_END__END_NUMBER;

	/**
	 * The feature id for the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__RGROUND = TRANSFORMER_END__RGROUND;

	/**
	 * The feature id for the '<em><b>From Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__FROM_WINDING_INSULATIONS = TRANSFORMER_END__FROM_WINDING_INSULATIONS;

	/**
	 * The feature id for the '<em><b>Core Admittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__CORE_ADMITTANCE = TRANSFORMER_END__CORE_ADMITTANCE;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__GROUNDED = TRANSFORMER_END__GROUNDED;

	/**
	 * The feature id for the '<em><b>Transformer End Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__TRANSFORMER_END_INFO = TRANSFORMER_END__TRANSFORMER_END_INFO;

	/**
	 * The feature id for the '<em><b>Mag Base U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__MAG_BASE_U = TRANSFORMER_END__MAG_BASE_U;

	/**
	 * The feature id for the '<em><b>Mag Sat Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__MAG_SAT_FLUX = TRANSFORMER_END__MAG_SAT_FLUX;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__PHASE_TAP_CHANGER = TRANSFORMER_END__PHASE_TAP_CHANGER;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__RATIO_TAP_CHANGER = TRANSFORMER_END__RATIO_TAP_CHANGER;

	/**
	 * The feature id for the '<em><b>Bmag Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__BMAG_SAT = TRANSFORMER_END__BMAG_SAT;

	/**
	 * The feature id for the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__XGROUND = TRANSFORMER_END__XGROUND;

	/**
	 * The feature id for the '<em><b>From Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__FROM_MESH_IMPEDANCE = TRANSFORMER_END__FROM_MESH_IMPEDANCE;

	/**
	 * The feature id for the '<em><b>To Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__TO_WINDING_INSULATIONS = TRANSFORMER_END__TO_WINDING_INSULATIONS;

	/**
	 * The feature id for the '<em><b>To Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__TO_MESH_IMPEDANCE = TRANSFORMER_END__TO_MESH_IMPEDANCE;

	/**
	 * The feature id for the '<em><b>Star Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__STAR_IMPEDANCE = TRANSFORMER_END__STAR_IMPEDANCE;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__POWER_TRANSFORMER = TRANSFORMER_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__X0 = TRANSFORMER_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__B0 = TRANSFORMER_END_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__G0 = TRANSFORMER_END_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__RATED_S = TRANSFORMER_END_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__B = TRANSFORMER_END_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__RATED_U = TRANSFORMER_END_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__G = TRANSFORMER_END_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__R = TRANSFORMER_END_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__X = TRANSFORMER_END_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__R0 = TRANSFORMER_END_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connection Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END__CONNECTION_KIND = TRANSFORMER_END_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Power Transformer End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END_FEATURE_COUNT = TRANSFORMER_END_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Power Transformer End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_END_OPERATION_COUNT = TRANSFORMER_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Connector <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Connector
	 * @see CIM15.IEC61970.Wires.WiresPackage#getConnector()
	 * @generated
	 */
	public static final int CONNECTOR = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Junction <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Junction
	 * @see CIM15.IEC61970.Wires.WiresPackage#getJunction()
	 * @generated
	 */
	public static final int JUNCTION = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__UUID = CONNECTOR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__NAMES = CONNECTOR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__DIAGRAM_OBJECTS = CONNECTOR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__MRID = CONNECTOR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__ALIAS_NAME = CONNECTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__MODELING_AUTHORITY_SET = CONNECTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__CHANGE_ITEMS = CONNECTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__SCHEDULE_STEPS = CONNECTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__SAFETY_DOCUMENTS = CONNECTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__OPERATING_SHARE = CONNECTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__DOCUMENT_ROLES = CONNECTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__PSR_LISTS = CONNECTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__MEASUREMENTS = CONNECTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__REPORTING_GROUP = CONNECTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__PSR_TYPE = CONNECTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__ASSETS = CONNECTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__ERP_ORGANISATION_ROLES = CONNECTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__LOCATION = CONNECTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__PSR_EVENT = CONNECTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__NETWORK_DATA_SETS = CONNECTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__OUTAGE_SCHEDULE = CONNECTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__CONTINGENCY_EQUIPMENT = CONNECTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__CUSTOMER_AGREEMENTS = CONNECTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__NORMALLY_IN_SERVICE = CONNECTOR__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__AGGREGATE = CONNECTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__EQUIPMENT_CONTAINER = CONNECTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__BASE_VOLTAGE = CONNECTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__CLEARANCE_TAGS = CONNECTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__PROTECTION_EQUIPMENTS = CONNECTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__TERMINALS = CONNECTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__OUTAGE_STEP_ROLES = CONNECTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION__SV_STATUS = CONNECTOR__SV_STATUS;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUNCTION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RegulatingCondEq <em>Regulating Cond Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingCondEq()
	 * @generated
	 */
	public static final int REGULATING_COND_EQ = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__CONTROLS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ__REGULATING_CONTROL = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regulating Cond Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Regulating Cond Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_COND_EQ_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Sectionaliser <em>Sectionaliser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Sectionaliser
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSectionaliser()
	 * @generated
	 */
	public static final int SECTIONALISER = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__NAMES = SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__DIAGRAM_OBJECTS = SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__NORMALLY_IN_SERVICE = SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__RATED_CURRENT = SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__SWITCH_PHASES = SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Sectionaliser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sectionaliser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SECTIONALISER_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRatioTapChangerTabular()
	 * @generated
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer Tabular Point</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ratio Tap Changer Tabular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ratio Tap Changer Tabular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_TAP_CHANGER_TABULAR_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PowerTransformer <em>Power Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PowerTransformer
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPowerTransformer()
	 * @generated
	 */
	public static final int POWER_TRANSFORMER = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Transformer Tanks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__TRANSFORMER_TANKS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vector Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__VECTOR_GROUP = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__POWER_TRANSFORMER_INFO = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power Transformer End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER__POWER_TRANSFORMER_END = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Power Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Power Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Fuse <em>Fuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Fuse
	 * @see CIM15.IEC61970.Wires.WiresPackage#getFuse()
	 * @generated
	 */
	public static final int FUSE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__NAMES = SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__DIAGRAM_OBJECTS = SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__NORMALLY_IN_SERVICE = SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__RATED_CURRENT = SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__SWITCH_PHASES = SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Fuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUSE_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.EnergyConsumer <em>Energy Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.EnergyConsumer
	 * @see CIM15.IEC61970.Wires.WiresPackage#getEnergyConsumer()
	 * @generated
	 */
	public static final int ENERGY_CONSUMER = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__QFIXED_PCT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__CUSTOMER_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__PFIXED_PCT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__PFIXED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__LOAD_RESPONSE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__QFIXED = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__POWER_CUT_ZONE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Energy Consumer Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Energy Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_CONSUMER_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Disconnector <em>Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Disconnector
	 * @see CIM15.IEC61970.Wires.WiresPackage#getDisconnector()
	 * @generated
	 */
	public static final int DISCONNECTOR = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__NAMES = SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__DIAGRAM_OBJECTS = SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__NORMALLY_IN_SERVICE = SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__RATED_CURRENT = SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__SWITCH_PHASES = SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve
	 * @see CIM15.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve()
	 * @generated
	 */
	public static final int REACTIVE_CAPABILITY_CURVE = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hydrogen Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coolant Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reactive Capability Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reactive Capability Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_CAPABILITY_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Plant <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Plant
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPlant()
	 * @generated
	 */
	public static final int PLANT = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__UUID = CorePackage.EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__NAMES = CorePackage.EQUIPMENT_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__MRID = CorePackage.EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__CHANGE_ITEMS = CorePackage.EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__SCHEDULE_STEPS = CorePackage.EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__OPERATING_SHARE = CorePackage.EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__DOCUMENT_ROLES = CorePackage.EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__PSR_LISTS = CorePackage.EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__REPORTING_GROUP = CorePackage.EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__PSR_TYPE = CorePackage.EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__ASSETS = CorePackage.EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__LOCATION = CorePackage.EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__PSR_EVENT = CorePackage.EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__TOPOLOGICAL_NODE = CorePackage.EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT__EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANT_OPERATION_COUNT = CorePackage.EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.GroundDisconnector <em>Ground Disconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.GroundDisconnector
	 * @see CIM15.IEC61970.Wires.WiresPackage#getGroundDisconnector()
	 * @generated
	 */
	public static final int GROUND_DISCONNECTOR = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__NAMES = SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__DIAGRAM_OBJECTS = SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__NORMALLY_IN_SERVICE = SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__RATED_CURRENT = SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__SWITCH_PHASES = SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Ground Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ground Disconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_DISCONNECTOR_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Resistor <em>Resistor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Resistor
	 * @see CIM15.IEC61970.Wires.WiresPackage#getResistor()
	 * @generated
	 */
	public static final int RESISTOR = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The number of structural features of the '<em>Resistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESISTOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.SynchronousMachine <em>Synchronous Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.SynchronousMachine
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSynchronousMachine()
	 * @generated
	 */
	public static final int SYNCHRONOUS_MACHINE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__NAMES = REGULATING_COND_EQ__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__DIAGRAM_OBJECTS = REGULATING_COND_EQ__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__NORMALLY_IN_SERVICE = REGULATING_COND_EQ__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__RATED_S = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prime Movers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__PRIME_MOVERS = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__R2 = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__R0 = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Manual To AVR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MANUAL_TO_AVR = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>QPercent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__QPERCENT = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Coolant Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__COOLANT_CONDITION = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Condenser P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__CONDENSER_P = REGULATING_COND_EQ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__XQUAD_TRANS = REGULATING_COND_EQ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS = REGULATING_COND_EQ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__XQUAD_SYNC = REGULATING_COND_EQ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__XDIRECT_SYNC = REGULATING_COND_EQ_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MIN_Q = REGULATING_COND_EQ_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>AVR To Manual Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG = REGULATING_COND_EQ_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__DAMPING = REGULATING_COND_EQ_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__GENERATING_UNIT = REGULATING_COND_EQ_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__OPERATING_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS = REGULATING_COND_EQ_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Coolant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__COOLANT_TYPE = REGULATING_COND_EQ_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>AVR To Manual Lead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD = REGULATING_COND_EQ_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reactive Capability Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES = REGULATING_COND_EQ_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MIN_U = REGULATING_COND_EQ_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MAX_Q = REGULATING_COND_EQ_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Reference Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY = REGULATING_COND_EQ_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__MAX_U = REGULATING_COND_EQ_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__XDIRECT_TRANS = REGULATING_COND_EQ_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Hydro Pump</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__HYDRO_PUMP = REGULATING_COND_EQ_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Inertia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__INERTIA = REGULATING_COND_EQ_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Base Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__BASE_Q = REGULATING_COND_EQ_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__TYPE = REGULATING_COND_EQ_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__R = REGULATING_COND_EQ_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__X0 = REGULATING_COND_EQ_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__X2 = REGULATING_COND_EQ_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE = REGULATING_COND_EQ_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE__X = REGULATING_COND_EQ_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Synchronous Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 35;

	/**
	 * The number of operations of the '<em>Synchronous Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS_MACHINE_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear <em>Phase Tap Changer Non Linear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerNonLinear()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR = 57;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__UUID = PHASE_TAP_CHANGER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__NAMES = PHASE_TAP_CHANGER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__DIAGRAM_OBJECTS = PHASE_TAP_CHANGER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__MRID = PHASE_TAP_CHANGER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__ALIAS_NAME = PHASE_TAP_CHANGER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__NAME = PHASE_TAP_CHANGER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__MODELING_AUTHORITY_SET = PHASE_TAP_CHANGER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__CHANGE_ITEMS = PHASE_TAP_CHANGER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__SCHEDULE_STEPS = PHASE_TAP_CHANGER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__SAFETY_DOCUMENTS = PHASE_TAP_CHANGER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__OPERATING_SHARE = PHASE_TAP_CHANGER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__DOCUMENT_ROLES = PHASE_TAP_CHANGER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__PSR_LISTS = PHASE_TAP_CHANGER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__MEASUREMENTS = PHASE_TAP_CHANGER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__REPORTING_GROUP = PHASE_TAP_CHANGER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__PSR_TYPE = PHASE_TAP_CHANGER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__ASSETS = PHASE_TAP_CHANGER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__ERP_ORGANISATION_ROLES = PHASE_TAP_CHANGER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__LOCATION = PHASE_TAP_CHANGER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__PSR_EVENT = PHASE_TAP_CHANGER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__NETWORK_DATA_SETS = PHASE_TAP_CHANGER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__OUTAGE_SCHEDULE = PHASE_TAP_CHANGER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__TAP_CHANGER_INFO = PHASE_TAP_CHANGER__TAP_CHANGER_INFO;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__NEUTRAL_U = PHASE_TAP_CHANGER__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__REGULATION_STATUS = PHASE_TAP_CHANGER__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__SUBSEQUENT_DELAY = PHASE_TAP_CHANGER__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__NORMAL_STEP = PHASE_TAP_CHANGER__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__LTC_FLAG = PHASE_TAP_CHANGER__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__TAP_SCHEDULES = PHASE_TAP_CHANGER__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__LOW_STEP = PHASE_TAP_CHANGER__LOW_STEP;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__NEUTRAL_STEP = PHASE_TAP_CHANGER__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__INITIAL_DELAY = PHASE_TAP_CHANGER__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__TAP_CHANGER_CONTROL = PHASE_TAP_CHANGER__TAP_CHANGER_CONTROL;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__HIGH_STEP = PHASE_TAP_CHANGER__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__SV_TAP_STEP = PHASE_TAP_CHANGER__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__PHASE_TAP_CHANGER_TABULAR = PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__TRANSFORMER_END = PHASE_TAP_CHANGER__TRANSFORMER_END;

	/**
	 * The feature id for the '<em><b>XMedian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN = PHASE_TAP_CHANGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voltage Step Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT = PHASE_TAP_CHANGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR__XMAX = PHASE_TAP_CHANGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer Non Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR_FEATURE_COUNT = PHASE_TAP_CHANGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Phase Tap Changer Non Linear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_NON_LINEAR_OPERATION_COUNT = PHASE_TAP_CHANGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical <em>Phase Tap Changer Asymetrical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerAsymetrical()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__UUID = PHASE_TAP_CHANGER_NON_LINEAR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__NAMES = PHASE_TAP_CHANGER_NON_LINEAR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__DIAGRAM_OBJECTS = PHASE_TAP_CHANGER_NON_LINEAR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__MRID = PHASE_TAP_CHANGER_NON_LINEAR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__ALIAS_NAME = PHASE_TAP_CHANGER_NON_LINEAR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__NAME = PHASE_TAP_CHANGER_NON_LINEAR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__MODELING_AUTHORITY_SET = PHASE_TAP_CHANGER_NON_LINEAR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__CHANGE_ITEMS = PHASE_TAP_CHANGER_NON_LINEAR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__SCHEDULE_STEPS = PHASE_TAP_CHANGER_NON_LINEAR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__SAFETY_DOCUMENTS = PHASE_TAP_CHANGER_NON_LINEAR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__OPERATING_SHARE = PHASE_TAP_CHANGER_NON_LINEAR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__DOCUMENT_ROLES = PHASE_TAP_CHANGER_NON_LINEAR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__PSR_LISTS = PHASE_TAP_CHANGER_NON_LINEAR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__MEASUREMENTS = PHASE_TAP_CHANGER_NON_LINEAR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__REPORTING_GROUP = PHASE_TAP_CHANGER_NON_LINEAR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__PSR_TYPE = PHASE_TAP_CHANGER_NON_LINEAR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__ASSETS = PHASE_TAP_CHANGER_NON_LINEAR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__ERP_ORGANISATION_ROLES = PHASE_TAP_CHANGER_NON_LINEAR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__LOCATION = PHASE_TAP_CHANGER_NON_LINEAR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__PSR_EVENT = PHASE_TAP_CHANGER_NON_LINEAR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__NETWORK_DATA_SETS = PHASE_TAP_CHANGER_NON_LINEAR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__OUTAGE_SCHEDULE = PHASE_TAP_CHANGER_NON_LINEAR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__TAP_CHANGER_INFO = PHASE_TAP_CHANGER_NON_LINEAR__TAP_CHANGER_INFO;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__NEUTRAL_U = PHASE_TAP_CHANGER_NON_LINEAR__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__REGULATION_STATUS = PHASE_TAP_CHANGER_NON_LINEAR__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__SUBSEQUENT_DELAY = PHASE_TAP_CHANGER_NON_LINEAR__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__NORMAL_STEP = PHASE_TAP_CHANGER_NON_LINEAR__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__LTC_FLAG = PHASE_TAP_CHANGER_NON_LINEAR__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__TAP_SCHEDULES = PHASE_TAP_CHANGER_NON_LINEAR__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__LOW_STEP = PHASE_TAP_CHANGER_NON_LINEAR__LOW_STEP;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__NEUTRAL_STEP = PHASE_TAP_CHANGER_NON_LINEAR__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__INITIAL_DELAY = PHASE_TAP_CHANGER_NON_LINEAR__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__TAP_CHANGER_CONTROL = PHASE_TAP_CHANGER_NON_LINEAR__TAP_CHANGER_CONTROL;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__HIGH_STEP = PHASE_TAP_CHANGER_NON_LINEAR__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__SV_TAP_STEP = PHASE_TAP_CHANGER_NON_LINEAR__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__PHASE_TAP_CHANGER_TABULAR = PHASE_TAP_CHANGER_NON_LINEAR__PHASE_TAP_CHANGER_TABULAR;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__TRANSFORMER_END = PHASE_TAP_CHANGER_NON_LINEAR__TRANSFORMER_END;

	/**
	 * The feature id for the '<em><b>XMedian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__XMEDIAN = PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN;

	/**
	 * The feature id for the '<em><b>Voltage Step Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__VOLTAGE_STEP_INCREMENT = PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__XMAX = PHASE_TAP_CHANGER_NON_LINEAR__XMAX;

	/**
	 * The feature id for the '<em><b>Winding Connection Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL__WINDING_CONNECTION_ANGLE = PHASE_TAP_CHANGER_NON_LINEAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer Asymetrical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL_FEATURE_COUNT = PHASE_TAP_CHANGER_NON_LINEAR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phase Tap Changer Asymetrical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_ASYMETRICAL_OPERATION_COUNT = PHASE_TAP_CHANGER_NON_LINEAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RectifierInverter <em>Rectifier Inverter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RectifierInverter
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRectifierInverter()
	 * @generated
	 */
	public static final int RECTIFIER_INVERTER = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__RATED_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MAX_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bridges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__BRIDGES = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compound Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__COMPOUND_RESISTANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commutating Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__COMMUTATING_RESISTANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MIN_P = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__OPERATING_MODE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MIN_U = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Commutating Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__COMMUTATING_REACTANCE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MAX_P = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__FREQUENCY = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Compound Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Rectifier Inverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Rectifier Inverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFIER_INVERTER_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.SeriesCompensator <em>Series Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.SeriesCompensator
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSeriesCompensator()
	 * @generated
	 */
	public static final int SERIES_COMPENSATOR = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Series Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Series Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_COMPENSATOR_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RegulatingControl <em>Regulating Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RegulatingControl
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingControl()
	 * @generated
	 */
	public static final int REGULATING_CONTROL = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__MODE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__TARGET_RANGE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__REGULATING_COND_EQ = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__TERMINAL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__DISCRETE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__TARGET_VALUE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__REGULATION_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Monitored Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL__MONITORED_PHASE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Regulating Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Regulating Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATING_CONTROL_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TapChangerControl <em>Tap Changer Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TapChangerControl
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChangerControl()
	 * @generated
	 */
	public static final int TAP_CHANGER_CONTROL = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__UUID = REGULATING_CONTROL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__NAMES = REGULATING_CONTROL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__DIAGRAM_OBJECTS = REGULATING_CONTROL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__MRID = REGULATING_CONTROL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__ALIAS_NAME = REGULATING_CONTROL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__NAME = REGULATING_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__MODELING_AUTHORITY_SET = REGULATING_CONTROL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__CHANGE_ITEMS = REGULATING_CONTROL__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__SCHEDULE_STEPS = REGULATING_CONTROL__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__SAFETY_DOCUMENTS = REGULATING_CONTROL__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__OPERATING_SHARE = REGULATING_CONTROL__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__DOCUMENT_ROLES = REGULATING_CONTROL__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__PSR_LISTS = REGULATING_CONTROL__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__MEASUREMENTS = REGULATING_CONTROL__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__REPORTING_GROUP = REGULATING_CONTROL__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__PSR_TYPE = REGULATING_CONTROL__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__ASSETS = REGULATING_CONTROL__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__ERP_ORGANISATION_ROLES = REGULATING_CONTROL__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__LOCATION = REGULATING_CONTROL__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__PSR_EVENT = REGULATING_CONTROL__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__NETWORK_DATA_SETS = REGULATING_CONTROL__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__OUTAGE_SCHEDULE = REGULATING_CONTROL__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__MODE = REGULATING_CONTROL__MODE;

	/**
	 * The feature id for the '<em><b>Target Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__TARGET_RANGE = REGULATING_CONTROL__TARGET_RANGE;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__REGULATING_COND_EQ = REGULATING_CONTROL__REGULATING_COND_EQ;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__TERMINAL = REGULATING_CONTROL__TERMINAL;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__DISCRETE = REGULATING_CONTROL__DISCRETE;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__TARGET_VALUE = REGULATING_CONTROL__TARGET_VALUE;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__REGULATION_SCHEDULE = REGULATING_CONTROL__REGULATION_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Monitored Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__MONITORED_PHASE = REGULATING_CONTROL__MONITORED_PHASE;

	/**
	 * The feature id for the '<em><b>Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__LINE_DROP_R = REGULATING_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__LINE_DROP_X = REGULATING_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__TAP_CHANGER = REGULATING_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reverse Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X = REGULATING_CONTROL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reverse Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R = REGULATING_CONTROL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Drop Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION = REGULATING_CONTROL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Limit Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL__LIMIT_VOLTAGE = REGULATING_CONTROL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tap Changer Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL_FEATURE_COUNT = REGULATING_CONTROL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tap Changer Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_CONTROL_OPERATION_COUNT = REGULATING_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Ground <em>Ground</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Ground
	 * @see CIM15.IEC61970.Wires.WiresPackage#getGround()
	 * @generated
	 */
	public static final int GROUND = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND__WINDING_INSULATIONS = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.CompositeSwitch <em>Composite Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.CompositeSwitch
	 * @see CIM15.IEC61970.Wires.WiresPackage#getCompositeSwitch()
	 * @generated
	 */
	public static final int COMPOSITE_SWITCH = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__NAMES = CorePackage.EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__NORMALLY_IN_SERVICE = CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Composite Switch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH__SWITCHES = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RegulationSchedule <em>Regulation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RegulationSchedule
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulationSchedule()
	 * @generated
	 */
	public static final int REGULATION_SCHEDULE = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__UUID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__NAMES = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__DIAGRAM_OBJECTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__MRID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__ALIAS_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__MODELING_AUTHORITY_SET = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__START_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__VALUE1_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__VALUE2_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__VALUE1_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__VALUE2_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__END_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__TIME_STEP = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__TIME_POINTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__SEASON = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__DAY_TYPE = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__REGULATING_CONTROL = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voltage Control Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regulation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE_FEATURE_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Regulation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_SCHEDULE_OPERATION_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerTankEnd <em>Transformer Tank End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerTankEnd
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerTankEnd()
	 * @generated
	 */
	public static final int TRANSFORMER_TANK_END = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__UUID = TRANSFORMER_END__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__NAMES = TRANSFORMER_END__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__DIAGRAM_OBJECTS = TRANSFORMER_END__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__MRID = TRANSFORMER_END__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__ALIAS_NAME = TRANSFORMER_END__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__NAME = TRANSFORMER_END__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__MODELING_AUTHORITY_SET = TRANSFORMER_END__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__TERMINAL = TRANSFORMER_END__TERMINAL;

	/**
	 * The feature id for the '<em><b>End Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__END_NUMBER = TRANSFORMER_END__END_NUMBER;

	/**
	 * The feature id for the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__RGROUND = TRANSFORMER_END__RGROUND;

	/**
	 * The feature id for the '<em><b>From Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__FROM_WINDING_INSULATIONS = TRANSFORMER_END__FROM_WINDING_INSULATIONS;

	/**
	 * The feature id for the '<em><b>Core Admittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__CORE_ADMITTANCE = TRANSFORMER_END__CORE_ADMITTANCE;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__GROUNDED = TRANSFORMER_END__GROUNDED;

	/**
	 * The feature id for the '<em><b>Transformer End Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__TRANSFORMER_END_INFO = TRANSFORMER_END__TRANSFORMER_END_INFO;

	/**
	 * The feature id for the '<em><b>Mag Base U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__MAG_BASE_U = TRANSFORMER_END__MAG_BASE_U;

	/**
	 * The feature id for the '<em><b>Mag Sat Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__MAG_SAT_FLUX = TRANSFORMER_END__MAG_SAT_FLUX;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__PHASE_TAP_CHANGER = TRANSFORMER_END__PHASE_TAP_CHANGER;

	/**
	 * The feature id for the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__RATIO_TAP_CHANGER = TRANSFORMER_END__RATIO_TAP_CHANGER;

	/**
	 * The feature id for the '<em><b>Bmag Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__BMAG_SAT = TRANSFORMER_END__BMAG_SAT;

	/**
	 * The feature id for the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__XGROUND = TRANSFORMER_END__XGROUND;

	/**
	 * The feature id for the '<em><b>From Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__FROM_MESH_IMPEDANCE = TRANSFORMER_END__FROM_MESH_IMPEDANCE;

	/**
	 * The feature id for the '<em><b>To Winding Insulations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__TO_WINDING_INSULATIONS = TRANSFORMER_END__TO_WINDING_INSULATIONS;

	/**
	 * The feature id for the '<em><b>To Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__TO_MESH_IMPEDANCE = TRANSFORMER_END__TO_MESH_IMPEDANCE;

	/**
	 * The feature id for the '<em><b>Star Impedance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__STAR_IMPEDANCE = TRANSFORMER_END__STAR_IMPEDANCE;

	/**
	 * The feature id for the '<em><b>Transformer Tank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__TRANSFORMER_TANK = TRANSFORMER_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END__PHASES = TRANSFORMER_END_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformer Tank End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END_FEATURE_COUNT = TRANSFORMER_END_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transformer Tank End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_END_OPERATION_COUNT = TRANSFORMER_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Breaker <em>Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Breaker
	 * @see CIM15.IEC61970.Wires.WiresPackage#getBreaker()
	 * @generated
	 */
	public static final int BREAKER = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__UUID = PROTECTED_SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__NAMES = PROTECTED_SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__DIAGRAM_OBJECTS = PROTECTED_SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__MRID = PROTECTED_SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__ALIAS_NAME = PROTECTED_SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__NAME = PROTECTED_SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__MODELING_AUTHORITY_SET = PROTECTED_SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__CHANGE_ITEMS = PROTECTED_SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SCHEDULE_STEPS = PROTECTED_SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SAFETY_DOCUMENTS = PROTECTED_SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__OPERATING_SHARE = PROTECTED_SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__DOCUMENT_ROLES = PROTECTED_SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__PSR_LISTS = PROTECTED_SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__MEASUREMENTS = PROTECTED_SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__REPORTING_GROUP = PROTECTED_SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__PSR_TYPE = PROTECTED_SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__ASSETS = PROTECTED_SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__ERP_ORGANISATION_ROLES = PROTECTED_SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__LOCATION = PROTECTED_SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__PSR_EVENT = PROTECTED_SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__NETWORK_DATA_SETS = PROTECTED_SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__OUTAGE_SCHEDULE = PROTECTED_SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__CONTINGENCY_EQUIPMENT = PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__CUSTOMER_AGREEMENTS = PROTECTED_SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__NORMALLY_IN_SERVICE = PROTECTED_SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__AGGREGATE = PROTECTED_SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__EQUIPMENT_CONTAINER = PROTECTED_SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__BASE_VOLTAGE = PROTECTED_SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__CLEARANCE_TAGS = PROTECTED_SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__PROTECTION_EQUIPMENTS = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__TERMINALS = PROTECTED_SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__OUTAGE_STEP_ROLES = PROTECTED_SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SV_STATUS = PROTECTED_SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SWITCH_ON_DATE = PROTECTED_SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__NORMAL_OPEN = PROTECTED_SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__RATED_CURRENT = PROTECTED_SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SWITCHING_OPERATIONS = PROTECTED_SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__LOAD_MGMT_FUNCTIONS = PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__RETAINED = PROTECTED_SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__CONNECT_DISCONNECT_FUNCTIONS = PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SWITCH_ON_COUNT = PROTECTED_SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SWITCH_SCHEDULES = PROTECTED_SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__SWITCH_PHASES = PROTECTED_SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__COMPOSITE_SWITCH = PROTECTED_SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Protection Equipments2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__PROTECTION_EQUIPMENTS2 = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2;

	/**
	 * The feature id for the '<em><b>Breaking Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__BREAKING_CAPACITY = PROTECTED_SWITCH__BREAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__RECLOSE_SEQUENCES = PROTECTED_SWITCH__RECLOSE_SEQUENCES;

	/**
	 * The feature id for the '<em><b>In Transit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER__IN_TRANSIT_TIME = PROTECTED_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_FEATURE_COUNT = PROTECTED_SWITCH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_OPERATION_COUNT = PROTECTED_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.MutualCoupling <em>Mutual Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.MutualCoupling
	 * @see CIM15.IEC61970.Wires.WiresPackage#getMutualCoupling()
	 * @generated
	 */
	public static final int MUTUAL_COUPLING = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Distance12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__DISTANCE12 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__DISTANCE11 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distance22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__DISTANCE22 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distance21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__DISTANCE21 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>First Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__FIRST_TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__B0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Second Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__SECOND_TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING__G0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Mutual Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Mutual Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MUTUAL_COUPLING_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Line <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Line
	 * @see CIM15.IEC61970.Wires.WiresPackage#getLine()
	 * @generated
	 */
	public static final int LINE = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__UUID = CorePackage.EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__NAMES = CorePackage.EQUIPMENT_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__MRID = CorePackage.EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__CHANGE_ITEMS = CorePackage.EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__SCHEDULE_STEPS = CorePackage.EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__OPERATING_SHARE = CorePackage.EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__DOCUMENT_ROLES = CorePackage.EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__PSR_LISTS = CorePackage.EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__REPORTING_GROUP = CorePackage.EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__PSR_TYPE = CorePackage.EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__ASSETS = CorePackage.EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__LOCATION = CorePackage.EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__PSR_EVENT = CorePackage.EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__NETWORK_DATA_SETS = CorePackage.EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__TOPOLOGICAL_NODE = CorePackage.EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE__REGION = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_OPERATION_COUNT = CorePackage.EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance <em>Per Length Phase Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPerLengthPhaseImpedance()
	 * @generated
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Impedance Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Per Length Phase Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Per Length Phase Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_PHASE_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.FrequencyConverter <em>Frequency Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.FrequencyConverter
	 * @see CIM15.IEC61970.Wires.WiresPackage#getFrequencyConverter()
	 * @generated
	 */
	public static final int FREQUENCY_CONVERTER = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__NAMES = REGULATING_COND_EQ__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__DIAGRAM_OBJECTS = REGULATING_COND_EQ__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__NORMALLY_IN_SERVICE = REGULATING_COND_EQ__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MAX_U = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MAX_P = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__FREQUENCY = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MIN_P = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__MIN_U = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER__OPERATING_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Frequency Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Frequency Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_CONVERTER_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.ShuntCompensator <em>Shunt Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.ShuntCompensator
	 * @see CIM15.IEC61970.Wires.WiresPackage#getShuntCompensator()
	 * @generated
	 */
	public static final int SHUNT_COMPENSATOR = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NAMES = REGULATING_COND_EQ__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__DIAGRAM_OBJECTS = REGULATING_COND_EQ__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NORMALLY_IN_SERVICE = REGULATING_COND_EQ__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Nom Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NOM_Q = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__MAX_U = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>GPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__GPER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage Sensitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NOM_U = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>B0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__B0_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maximum Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__MAXIMUM_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>BPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__BPER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sv Shunt Compensator Sections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>AVR Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__AVR_DELAY = REGULATING_COND_EQ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__MIN_U = REGULATING_COND_EQ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Normal Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__NORMAL_SECTIONS = REGULATING_COND_EQ_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Shunt Compensator Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES = REGULATING_COND_EQ_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reactive Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__REACTIVE_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SWITCH_ON_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__SWITCH_ON_DATE = REGULATING_COND_EQ_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>G0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR__G0_PER_SECTION = REGULATING_COND_EQ_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Shunt Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Shunt Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.VoltageControlZone <em>Voltage Control Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.VoltageControlZone
	 * @see CIM15.IEC61970.Wires.WiresPackage#getVoltageControlZone()
	 * @generated
	 */
	public static final int VOLTAGE_CONTROL_ZONE = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Regulation Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Busbar Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Voltage Control Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Voltage Control Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_ZONE_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.LoadBreakSwitch <em>Load Break Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.LoadBreakSwitch
	 * @see CIM15.IEC61970.Wires.WiresPackage#getLoadBreakSwitch()
	 * @generated
	 */
	public static final int LOAD_BREAK_SWITCH = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__UUID = PROTECTED_SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__NAMES = PROTECTED_SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__DIAGRAM_OBJECTS = PROTECTED_SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__MRID = PROTECTED_SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__ALIAS_NAME = PROTECTED_SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__NAME = PROTECTED_SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__MODELING_AUTHORITY_SET = PROTECTED_SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__CHANGE_ITEMS = PROTECTED_SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SCHEDULE_STEPS = PROTECTED_SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SAFETY_DOCUMENTS = PROTECTED_SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__OPERATING_SHARE = PROTECTED_SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__DOCUMENT_ROLES = PROTECTED_SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__PSR_LISTS = PROTECTED_SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__MEASUREMENTS = PROTECTED_SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__REPORTING_GROUP = PROTECTED_SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__PSR_TYPE = PROTECTED_SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__ASSETS = PROTECTED_SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__ERP_ORGANISATION_ROLES = PROTECTED_SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__LOCATION = PROTECTED_SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__PSR_EVENT = PROTECTED_SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__NETWORK_DATA_SETS = PROTECTED_SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__OUTAGE_SCHEDULE = PROTECTED_SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__CONTINGENCY_EQUIPMENT = PROTECTED_SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__CUSTOMER_AGREEMENTS = PROTECTED_SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__NORMALLY_IN_SERVICE = PROTECTED_SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__AGGREGATE = PROTECTED_SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__EQUIPMENT_CONTAINER = PROTECTED_SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__BASE_VOLTAGE = PROTECTED_SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__CLEARANCE_TAGS = PROTECTED_SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__PROTECTION_EQUIPMENTS = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__TERMINALS = PROTECTED_SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__OUTAGE_STEP_ROLES = PROTECTED_SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SV_STATUS = PROTECTED_SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SWITCH_ON_DATE = PROTECTED_SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__NORMAL_OPEN = PROTECTED_SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__RATED_CURRENT = PROTECTED_SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SWITCHING_OPERATIONS = PROTECTED_SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__LOAD_MGMT_FUNCTIONS = PROTECTED_SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__RETAINED = PROTECTED_SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__CONNECT_DISCONNECT_FUNCTIONS = PROTECTED_SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SWITCH_ON_COUNT = PROTECTED_SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SWITCH_SCHEDULES = PROTECTED_SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__SWITCH_PHASES = PROTECTED_SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__COMPOSITE_SWITCH = PROTECTED_SWITCH__COMPOSITE_SWITCH;

	/**
	 * The feature id for the '<em><b>Protection Equipments2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__PROTECTION_EQUIPMENTS2 = PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2;

	/**
	 * The feature id for the '<em><b>Breaking Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__BREAKING_CAPACITY = PROTECTED_SWITCH__BREAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Reclose Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH__RECLOSE_SEQUENCES = PROTECTED_SWITCH__RECLOSE_SEQUENCES;

	/**
	 * The number of structural features of the '<em>Load Break Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH_FEATURE_COUNT = PROTECTED_SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load Break Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_SWITCH_OPERATION_COUNT = PROTECTED_SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.BusbarSection <em>Busbar Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.BusbarSection
	 * @see CIM15.IEC61970.Wires.WiresPackage#getBusbarSection()
	 * @generated
	 */
	public static final int BUSBAR_SECTION = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__UUID = CONNECTOR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__NAMES = CONNECTOR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__DIAGRAM_OBJECTS = CONNECTOR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__MRID = CONNECTOR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__ALIAS_NAME = CONNECTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__MODELING_AUTHORITY_SET = CONNECTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__CHANGE_ITEMS = CONNECTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__SCHEDULE_STEPS = CONNECTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__SAFETY_DOCUMENTS = CONNECTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__OPERATING_SHARE = CONNECTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__DOCUMENT_ROLES = CONNECTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__PSR_LISTS = CONNECTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__MEASUREMENTS = CONNECTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__REPORTING_GROUP = CONNECTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__PSR_TYPE = CONNECTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__ASSETS = CONNECTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__ERP_ORGANISATION_ROLES = CONNECTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__LOCATION = CONNECTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__PSR_EVENT = CONNECTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__NETWORK_DATA_SETS = CONNECTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__OUTAGE_SCHEDULE = CONNECTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__CONTINGENCY_EQUIPMENT = CONNECTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__CUSTOMER_AGREEMENTS = CONNECTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__NORMALLY_IN_SERVICE = CONNECTOR__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__AGGREGATE = CONNECTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__EQUIPMENT_CONTAINER = CONNECTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__BASE_VOLTAGE = CONNECTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__CLEARANCE_TAGS = CONNECTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__PROTECTION_EQUIPMENTS = CONNECTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__TERMINALS = CONNECTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__OUTAGE_STEP_ROLES = CONNECTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__SV_STATUS = CONNECTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Voltage Control Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Busbar Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Busbar Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSBAR_SECTION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance <em>Transformer Core Admittance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerCoreAdmittance()
	 * @generated
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE = 45;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__G0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__B0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__G = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer End Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE__B = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformer Core Admittance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Transformer Core Admittance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_CORE_ADMITTANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.StaticVarCompensator <em>Static Var Compensator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator
	 * @see CIM15.IEC61970.Wires.WiresPackage#getStaticVarCompensator()
	 * @generated
	 */
	public static final int STATIC_VAR_COMPENSATOR = 46;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__UUID = REGULATING_COND_EQ__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__NAMES = REGULATING_COND_EQ__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__DIAGRAM_OBJECTS = REGULATING_COND_EQ__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__MRID = REGULATING_COND_EQ__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__ALIAS_NAME = REGULATING_COND_EQ__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__NAME = REGULATING_COND_EQ__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__MODELING_AUTHORITY_SET = REGULATING_COND_EQ__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__CHANGE_ITEMS = REGULATING_COND_EQ__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__SCHEDULE_STEPS = REGULATING_COND_EQ__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__SAFETY_DOCUMENTS = REGULATING_COND_EQ__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__OPERATING_SHARE = REGULATING_COND_EQ__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__DOCUMENT_ROLES = REGULATING_COND_EQ__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__PSR_LISTS = REGULATING_COND_EQ__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__MEASUREMENTS = REGULATING_COND_EQ__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__REPORTING_GROUP = REGULATING_COND_EQ__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__PSR_TYPE = REGULATING_COND_EQ__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__ASSETS = REGULATING_COND_EQ__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__ERP_ORGANISATION_ROLES = REGULATING_COND_EQ__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__LOCATION = REGULATING_COND_EQ__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__PSR_EVENT = REGULATING_COND_EQ__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__NETWORK_DATA_SETS = REGULATING_COND_EQ__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__OUTAGE_SCHEDULE = REGULATING_COND_EQ__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__CONTINGENCY_EQUIPMENT = REGULATING_COND_EQ__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__CUSTOMER_AGREEMENTS = REGULATING_COND_EQ__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__NORMALLY_IN_SERVICE = REGULATING_COND_EQ__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__AGGREGATE = REGULATING_COND_EQ__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__EQUIPMENT_CONTAINER = REGULATING_COND_EQ__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__BASE_VOLTAGE = REGULATING_COND_EQ__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__CLEARANCE_TAGS = REGULATING_COND_EQ__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__PROTECTION_EQUIPMENTS = REGULATING_COND_EQ__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__TERMINALS = REGULATING_COND_EQ__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__OUTAGE_STEP_ROLES = REGULATING_COND_EQ__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__SV_STATUS = REGULATING_COND_EQ__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__CONTROLS = REGULATING_COND_EQ__CONTROLS;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__REGULATING_CONTROL = REGULATING_COND_EQ__REGULATING_CONTROL;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__SLOPE = REGULATING_COND_EQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SVC Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE = REGULATING_COND_EQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING = REGULATING_COND_EQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT = REGULATING_COND_EQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING = REGULATING_COND_EQ_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Static Var Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR_FEATURE_COUNT = REGULATING_COND_EQ_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Static Var Compensator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_VAR_COMPENSATOR_OPERATION_COUNT = REGULATING_COND_EQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance <em>Per Length Sequence Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPerLengthSequenceImpedance()
	 * @generated
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE = 48;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__R = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__BCH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__LINE_SEGMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__GCH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Per Length Sequence Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Per Length Sequence Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PER_LENGTH_SEQUENCE_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance <em>Transformer Mesh Impedance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerMeshImpedance()
	 * @generated
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE = 49;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>From Transformer End Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Transformer End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__R = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Transformer End Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__X0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE__R0 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transformer Mesh Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Transformer Mesh Impedance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_MESH_IMPEDANCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.SwitchSchedule <em>Switch Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.SwitchSchedule
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSwitchSchedule()
	 * @generated
	 */
	public static final int SWITCH_SCHEDULE = 50;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__UUID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__NAMES = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__DIAGRAM_OBJECTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__MRID = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__ALIAS_NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__NAME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__MODELING_AUTHORITY_SET = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__START_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__VALUE1_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__VALUE2_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__VALUE1_UNIT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__VALUE2_MULTIPLIER = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__END_TIME = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__TIME_STEP = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__TIME_POINTS = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__SEASON = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__DAY_TYPE = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE__SWITCH = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE_FEATURE_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_SCHEDULE_OPERATION_COUNT = LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.EnergySource <em>Energy Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.EnergySource
	 * @see CIM15.IEC61970.Wires.WiresPackage#getEnergySource()
	 * @generated
	 */
	public static final int ENERGY_SOURCE = 51;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__UUID = CorePackage.CONDUCTING_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__NAMES = CorePackage.CONDUCTING_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__DIAGRAM_OBJECTS = CorePackage.CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__MRID = CorePackage.CONDUCTING_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__ALIAS_NAME = CorePackage.CONDUCTING_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__NAME = CorePackage.CONDUCTING_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__MODELING_AUTHORITY_SET = CorePackage.CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__CHANGE_ITEMS = CorePackage.CONDUCTING_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__SCHEDULE_STEPS = CorePackage.CONDUCTING_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__SAFETY_DOCUMENTS = CorePackage.CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__OPERATING_SHARE = CorePackage.CONDUCTING_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__DOCUMENT_ROLES = CorePackage.CONDUCTING_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__PSR_LISTS = CorePackage.CONDUCTING_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__MEASUREMENTS = CorePackage.CONDUCTING_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__REPORTING_GROUP = CorePackage.CONDUCTING_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__PSR_TYPE = CorePackage.CONDUCTING_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__ASSETS = CorePackage.CONDUCTING_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__ERP_ORGANISATION_ROLES = CorePackage.CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__LOCATION = CorePackage.CONDUCTING_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__PSR_EVENT = CorePackage.CONDUCTING_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__NETWORK_DATA_SETS = CorePackage.CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__OUTAGE_SCHEDULE = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__CONTINGENCY_EQUIPMENT = CorePackage.CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__CUSTOMER_AGREEMENTS = CorePackage.CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__NORMALLY_IN_SERVICE = CorePackage.CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__AGGREGATE = CorePackage.CONDUCTING_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__EQUIPMENT_CONTAINER = CorePackage.CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__BASE_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__CLEARANCE_TAGS = CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__PROTECTION_EQUIPMENTS = CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__TERMINALS = CorePackage.CONDUCTING_EQUIPMENT__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__OUTAGE_STEP_ROLES = CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__SV_STATUS = CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__R0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voltage Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__VOLTAGE_MAGNITUDE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__XN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__NOMINAL_VOLTAGE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__X = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__R = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Voltage Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__VOLTAGE_ANGLE = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__RN = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__X0 = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE__ACTIVE_POWER = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Energy Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE_FEATURE_COUNT = CorePackage.CONDUCTING_EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Energy Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SOURCE_OPERATION_COUNT = CorePackage.CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerTank <em>Transformer Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerTank
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerTank()
	 * @generated
	 */
	public static final int TRANSFORMER_TANK = 52;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__NAMES = CorePackage.EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__NORMALLY_IN_SERVICE = CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Tank Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__POWER_TRANSFORMER = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Tank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__TRANSFORMER_TANK_INFO = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformer Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformer Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerTabularPoint()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT = 53;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT__X = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT__STEP = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT__ANGLE = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer Tabular Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Phase Tap Changer Tabular Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_TABULAR_POINT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.DCLineSegment <em>DC Line Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.DCLineSegment
	 * @see CIM15.IEC61970.Wires.WiresPackage#getDCLineSegment()
	 * @generated
	 */
	public static final int DC_LINE_SEGMENT = 54;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__UUID = CONDUCTOR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__NAMES = CONDUCTOR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__DIAGRAM_OBJECTS = CONDUCTOR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__MRID = CONDUCTOR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__ALIAS_NAME = CONDUCTOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__NAME = CONDUCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__MODELING_AUTHORITY_SET = CONDUCTOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__CHANGE_ITEMS = CONDUCTOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__SCHEDULE_STEPS = CONDUCTOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__SAFETY_DOCUMENTS = CONDUCTOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__OPERATING_SHARE = CONDUCTOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__DOCUMENT_ROLES = CONDUCTOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__PSR_LISTS = CONDUCTOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__MEASUREMENTS = CONDUCTOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__REPORTING_GROUP = CONDUCTOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__PSR_TYPE = CONDUCTOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__ASSETS = CONDUCTOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__ERP_ORGANISATION_ROLES = CONDUCTOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__LOCATION = CONDUCTOR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__PSR_EVENT = CONDUCTOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__NETWORK_DATA_SETS = CONDUCTOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__OUTAGE_SCHEDULE = CONDUCTOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__CONTINGENCY_EQUIPMENT = CONDUCTOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__CUSTOMER_AGREEMENTS = CONDUCTOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__NORMALLY_IN_SERVICE = CONDUCTOR__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__AGGREGATE = CONDUCTOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__EQUIPMENT_CONTAINER = CONDUCTOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__BASE_VOLTAGE = CONDUCTOR__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__CLEARANCE_TAGS = CONDUCTOR__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__PROTECTION_EQUIPMENTS = CONDUCTOR__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__TERMINALS = CONDUCTOR__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__OUTAGE_STEP_ROLES = CONDUCTOR__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__SV_STATUS = CONDUCTOR__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__LENGTH = CONDUCTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>Dc Segment Inductance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dc Segment Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE = CONDUCTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DC Line Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DC_LINE_SEGMENT_OPERATION_COUNT = CONDUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerSymetrical <em>Phase Tap Changer Symetrical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerSymetrical
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerSymetrical()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL = 58;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__UUID = PHASE_TAP_CHANGER_NON_LINEAR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__NAMES = PHASE_TAP_CHANGER_NON_LINEAR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__DIAGRAM_OBJECTS = PHASE_TAP_CHANGER_NON_LINEAR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__MRID = PHASE_TAP_CHANGER_NON_LINEAR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__ALIAS_NAME = PHASE_TAP_CHANGER_NON_LINEAR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__NAME = PHASE_TAP_CHANGER_NON_LINEAR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__MODELING_AUTHORITY_SET = PHASE_TAP_CHANGER_NON_LINEAR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__CHANGE_ITEMS = PHASE_TAP_CHANGER_NON_LINEAR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__SCHEDULE_STEPS = PHASE_TAP_CHANGER_NON_LINEAR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__SAFETY_DOCUMENTS = PHASE_TAP_CHANGER_NON_LINEAR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__OPERATING_SHARE = PHASE_TAP_CHANGER_NON_LINEAR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__DOCUMENT_ROLES = PHASE_TAP_CHANGER_NON_LINEAR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__PSR_LISTS = PHASE_TAP_CHANGER_NON_LINEAR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__MEASUREMENTS = PHASE_TAP_CHANGER_NON_LINEAR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__REPORTING_GROUP = PHASE_TAP_CHANGER_NON_LINEAR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__PSR_TYPE = PHASE_TAP_CHANGER_NON_LINEAR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__ASSETS = PHASE_TAP_CHANGER_NON_LINEAR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__ERP_ORGANISATION_ROLES = PHASE_TAP_CHANGER_NON_LINEAR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__LOCATION = PHASE_TAP_CHANGER_NON_LINEAR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__PSR_EVENT = PHASE_TAP_CHANGER_NON_LINEAR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__NETWORK_DATA_SETS = PHASE_TAP_CHANGER_NON_LINEAR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__OUTAGE_SCHEDULE = PHASE_TAP_CHANGER_NON_LINEAR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Tap Changer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__TAP_CHANGER_INFO = PHASE_TAP_CHANGER_NON_LINEAR__TAP_CHANGER_INFO;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__NEUTRAL_U = PHASE_TAP_CHANGER_NON_LINEAR__NEUTRAL_U;

	/**
	 * The feature id for the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__REGULATION_STATUS = PHASE_TAP_CHANGER_NON_LINEAR__REGULATION_STATUS;

	/**
	 * The feature id for the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__SUBSEQUENT_DELAY = PHASE_TAP_CHANGER_NON_LINEAR__SUBSEQUENT_DELAY;

	/**
	 * The feature id for the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__NORMAL_STEP = PHASE_TAP_CHANGER_NON_LINEAR__NORMAL_STEP;

	/**
	 * The feature id for the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__LTC_FLAG = PHASE_TAP_CHANGER_NON_LINEAR__LTC_FLAG;

	/**
	 * The feature id for the '<em><b>Tap Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__TAP_SCHEDULES = PHASE_TAP_CHANGER_NON_LINEAR__TAP_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__LOW_STEP = PHASE_TAP_CHANGER_NON_LINEAR__LOW_STEP;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__NEUTRAL_STEP = PHASE_TAP_CHANGER_NON_LINEAR__NEUTRAL_STEP;

	/**
	 * The feature id for the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__INITIAL_DELAY = PHASE_TAP_CHANGER_NON_LINEAR__INITIAL_DELAY;

	/**
	 * The feature id for the '<em><b>Tap Changer Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__TAP_CHANGER_CONTROL = PHASE_TAP_CHANGER_NON_LINEAR__TAP_CHANGER_CONTROL;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__HIGH_STEP = PHASE_TAP_CHANGER_NON_LINEAR__HIGH_STEP;

	/**
	 * The feature id for the '<em><b>Sv Tap Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__SV_TAP_STEP = PHASE_TAP_CHANGER_NON_LINEAR__SV_TAP_STEP;

	/**
	 * The feature id for the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__PHASE_TAP_CHANGER_TABULAR = PHASE_TAP_CHANGER_NON_LINEAR__PHASE_TAP_CHANGER_TABULAR;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__TRANSFORMER_END = PHASE_TAP_CHANGER_NON_LINEAR__TRANSFORMER_END;

	/**
	 * The feature id for the '<em><b>XMedian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__XMEDIAN = PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN;

	/**
	 * The feature id for the '<em><b>Voltage Step Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__VOLTAGE_STEP_INCREMENT = PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL__XMAX = PHASE_TAP_CHANGER_NON_LINEAR__XMAX;

	/**
	 * The number of structural features of the '<em>Phase Tap Changer Symetrical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL_FEATURE_COUNT = PHASE_TAP_CHANGER_NON_LINEAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Phase Tap Changer Symetrical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_TAP_CHANGER_SYMETRICAL_OPERATION_COUNT = PHASE_TAP_CHANGER_NON_LINEAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.Jumper <em>Jumper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.Jumper
	 * @see CIM15.IEC61970.Wires.WiresPackage#getJumper()
	 * @generated
	 */
	public static final int JUMPER = 59;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__UUID = SWITCH__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__NAMES = SWITCH__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__DIAGRAM_OBJECTS = SWITCH__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__MRID = SWITCH__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__ALIAS_NAME = SWITCH__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__MODELING_AUTHORITY_SET = SWITCH__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__CHANGE_ITEMS = SWITCH__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SCHEDULE_STEPS = SWITCH__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SAFETY_DOCUMENTS = SWITCH__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__OPERATING_SHARE = SWITCH__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__DOCUMENT_ROLES = SWITCH__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__PSR_LISTS = SWITCH__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__MEASUREMENTS = SWITCH__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__REPORTING_GROUP = SWITCH__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__PSR_TYPE = SWITCH__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__ASSETS = SWITCH__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__ERP_ORGANISATION_ROLES = SWITCH__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__LOCATION = SWITCH__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__PSR_EVENT = SWITCH__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__NETWORK_DATA_SETS = SWITCH__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__OUTAGE_SCHEDULE = SWITCH__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__CONTINGENCY_EQUIPMENT = SWITCH__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__CUSTOMER_AGREEMENTS = SWITCH__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__NORMALLY_IN_SERVICE = SWITCH__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__AGGREGATE = SWITCH__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__EQUIPMENT_CONTAINER = SWITCH__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__BASE_VOLTAGE = SWITCH__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__CLEARANCE_TAGS = SWITCH__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__PROTECTION_EQUIPMENTS = SWITCH__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__TERMINALS = SWITCH__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__OUTAGE_STEP_ROLES = SWITCH__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SV_STATUS = SWITCH__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SWITCH_ON_DATE = SWITCH__SWITCH_ON_DATE;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__NORMAL_OPEN = SWITCH__NORMAL_OPEN;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__RATED_CURRENT = SWITCH__RATED_CURRENT;

	/**
	 * The feature id for the '<em><b>Switching Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SWITCHING_OPERATIONS = SWITCH__SWITCHING_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__LOAD_MGMT_FUNCTIONS = SWITCH__LOAD_MGMT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__RETAINED = SWITCH__RETAINED;

	/**
	 * The feature id for the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__CONNECT_DISCONNECT_FUNCTIONS = SWITCH__CONNECT_DISCONNECT_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SWITCH_ON_COUNT = SWITCH__SWITCH_ON_COUNT;

	/**
	 * The feature id for the '<em><b>Switch Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SWITCH_SCHEDULES = SWITCH__SWITCH_SCHEDULES;

	/**
	 * The feature id for the '<em><b>Switch Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__SWITCH_PHASES = SWITCH__SWITCH_PHASES;

	/**
	 * The feature id for the '<em><b>Composite Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER__COMPOSITE_SWITCH = SWITCH__COMPOSITE_SWITCH;

	/**
	 * The number of structural features of the '<em>Jumper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jumper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JUMPER_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TapChangerKind <em>Tap Changer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TapChangerKind
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChangerKind()
	 * @generated
	 */
	public static final int TAP_CHANGER_KIND = 60;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.WindingType <em>Winding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.WindingType
	 * @see CIM15.IEC61970.Wires.WiresPackage#getWindingType()
	 * @generated
	 */
	public static final int WINDING_TYPE = 61;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSynchronousMachineOperatingMode()
	 * @generated
	 */
	public static final int SYNCHRONOUS_MACHINE_OPERATING_MODE = 62;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.TransformerControlMode
	 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerControlMode()
	 * @generated
	 */
	public static final int TRANSFORMER_CONTROL_MODE = 63;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.CoolantType <em>Coolant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.CoolantType
	 * @see CIM15.IEC61970.Wires.WiresPackage#getCoolantType()
	 * @generated
	 */
	public static final int COOLANT_TYPE = 64;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.SynchronousMachineType
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSynchronousMachineType()
	 * @generated
	 */
	public static final int SYNCHRONOUS_MACHINE_TYPE = 65;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerKind <em>Phase Tap Changer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerKind
	 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerKind()
	 * @generated
	 */
	public static final int PHASE_TAP_CHANGER_KIND = 66;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.SVCControlMode <em>SVC Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.SVCControlMode
	 * @see CIM15.IEC61970.Wires.WiresPackage#getSVCControlMode()
	 * @generated
	 */
	public static final int SVC_CONTROL_MODE = 67;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.RegulatingControlModeKind <em>Regulating Control Mode Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.RegulatingControlModeKind
	 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingControlModeKind()
	 * @generated
	 */
	public static final int REGULATING_CONTROL_MODE_KIND = 68;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Wires.WindingConnection <em>Winding Connection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Wires.WindingConnection
	 * @see CIM15.IEC61970.Wires.WiresPackage#getWindingConnection()
	 * @generated
	 */
	public static final int WINDING_CONNECTION = 69;

	/**
	 * The meta object id for the '<em>Composite Switch Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CIM15.IEC61970.Wires.WiresPackage#getCompositeSwitchType()
	 * @generated
	 */
	public static final int COMPOSITE_SWITCH_TYPE = 70;

	/**
	 * The meta object id for the '<em>Operating Mode</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CIM15.IEC61970.Wires.WiresPackage#getOperatingMode()
	 * @generated
	 */
	public static final int OPERATING_MODE = 71;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseImpedanceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerStarImpedanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recloserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioTapChangerTabularPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerTabularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioTapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerLinearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acLineSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTransformerEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatingCondEqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionaliserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioTapChangerTabularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveCapabilityCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundDisconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resistorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronousMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerAsymetricalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectifierInverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapChangerControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulatingControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectedSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerTankEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutualCouplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perLengthPhaseImpedanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shuntCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageControlZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBreakSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busbarSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerCoreAdmittanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticVarCompensatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perLengthSequenceImpedanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerMeshImpedanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerTankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerTabularPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcLineSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapChangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerNonLinearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTapChangerSymetricalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tapChangerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronousMachineOperatingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coolantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronousMachineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phaseTapChangerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum svcControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regulatingControlModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingConnectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compositeSwitchTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatingModeEDataType = null;

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
	 * @see CIM15.IEC61970.Wires.WiresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WiresPackage() {
		super(eNS_URI, WiresFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link WiresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static WiresPackage init() {
		if (isInited) return (WiresPackage)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI);

		// Obtain or create and register package
		WiresPackage theWiresPackage = (WiresPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WiresPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WiresPackage());

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
		theWiresPackage.fixPackageContents();
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
		theWiresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WiresPackage.eNS_URI, theWiresPackage);
		return theWiresPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Impedance Data</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData
	 * @generated
	 */
	public EClass getPhaseImpedanceData() {
		if (phaseImpedanceDataEClass == null) {
			phaseImpedanceDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(0);
		}
		return phaseImpedanceDataEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData#getR()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	public EAttribute getPhaseImpedanceData_R() {
        return (EAttribute)getPhaseImpedanceData().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData#getX()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	public EAttribute getPhaseImpedanceData_X() {
        return (EAttribute)getPhaseImpedanceData().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData#getPhaseImpedance()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	public EReference getPhaseImpedanceData_PhaseImpedance() {
        return (EReference)getPhaseImpedanceData().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData#getB()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	public EAttribute getPhaseImpedanceData_B() {
        return (EAttribute)getPhaseImpedanceData().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData#getSequenceNumber()
	 * @see #getPhaseImpedanceData()
	 * @generated
	 */
	public EAttribute getPhaseImpedanceData_SequenceNumber() {
        return (EAttribute)getPhaseImpedanceData().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TapSchedule <em>Tap Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Schedule</em>'.
	 * @see CIM15.IEC61970.Wires.TapSchedule
	 * @generated
	 */
	public EClass getTapSchedule() {
		if (tapScheduleEClass == null) {
			tapScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(1);
		}
		return tapScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TapSchedule#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.TapSchedule#getTapChanger()
	 * @see #getTapSchedule()
	 * @generated
	 */
	public EReference getTapSchedule_TapChanger() {
        return (EReference)getTapSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TransformerStarImpedance <em>Transformer Star Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Star Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance
	 * @generated
	 */
	public EClass getTransformerStarImpedance() {
		if (transformerStarImpedanceEClass == null) {
			transformerStarImpedanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(3);
		}
		return transformerStarImpedanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance#getX0()
	 * @see #getTransformerStarImpedance()
	 * @generated
	 */
	public EAttribute getTransformerStarImpedance_X0() {
        return (EAttribute)getTransformerStarImpedance().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance#getX()
	 * @see #getTransformerStarImpedance()
	 * @generated
	 */
	public EAttribute getTransformerStarImpedance_X() {
        return (EAttribute)getTransformerStarImpedance().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance#getR()
	 * @see #getTransformerStarImpedance()
	 * @generated
	 */
	public EAttribute getTransformerStarImpedance_R() {
        return (EAttribute)getTransformerStarImpedance().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance#getR0()
	 * @see #getTransformerStarImpedance()
	 * @generated
	 */
	public EAttribute getTransformerStarImpedance_R0() {
        return (EAttribute)getTransformerStarImpedance().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance#getTransformerEnd()
	 * @see #getTransformerStarImpedance()
	 * @generated
	 */
	public EReference getTransformerStarImpedance_TransformerEnd() {
        return (EReference)getTransformerStarImpedance().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Recloser <em>Recloser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recloser</em>'.
	 * @see CIM15.IEC61970.Wires.Recloser
	 * @generated
	 */
	public EClass getRecloser() {
		if (recloserEClass == null) {
			recloserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(5);
		}
		return recloserEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Tap Changer Tabular Point</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint
	 * @generated
	 */
	public EClass getRatioTapChangerTabularPoint() {
		if (ratioTapChangerTabularPointEClass == null) {
			ratioTapChangerTabularPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(6);
		}
		return ratioTapChangerTabularPointEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getX()
	 * @see #getRatioTapChangerTabularPoint()
	 * @generated
	 */
	public EAttribute getRatioTapChangerTabularPoint_X() {
        return (EAttribute)getRatioTapChangerTabularPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Tap Changer Tabular</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatioTapChangerTabular()
	 * @see #getRatioTapChangerTabularPoint()
	 * @generated
	 */
	public EReference getRatioTapChangerTabularPoint_RatioTapChangerTabular() {
        return (EReference)getRatioTapChangerTabularPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatio()
	 * @see #getRatioTapChangerTabularPoint()
	 * @generated
	 */
	public EAttribute getRatioTapChangerTabularPoint_Ratio() {
        return (EAttribute)getRatioTapChangerTabularPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getStep()
	 * @see #getRatioTapChangerTabularPoint()
	 * @generated
	 */
	public EAttribute getRatioTapChangerTabularPoint_Step() {
        return (EAttribute)getRatioTapChangerTabularPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer Tabular</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular
	 * @generated
	 */
	public EClass getPhaseTapChangerTabular() {
		if (phaseTapChangerTabularEClass == null) {
			phaseTapChangerTabularEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(7);
		}
		return phaseTapChangerTabularEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phase Tap Changer Tabular Point</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChangerTabularPoint()
	 * @see #getPhaseTapChangerTabular()
	 * @generated
	 */
	public EReference getPhaseTapChangerTabular_PhaseTapChangerTabularPoint() {
        return (EReference)getPhaseTapChangerTabular().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phase Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChanger()
	 * @see #getPhaseTapChangerTabular()
	 * @generated
	 */
	public EReference getPhaseTapChangerTabular_PhaseTapChanger() {
        return (EReference)getPhaseTapChangerTabular().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger
	 * @generated
	 */
	public EClass getRatioTapChanger() {
		if (ratioTapChangerEClass == null) {
			ratioTapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(9);
		}
		return ratioTapChangerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Voltage Increment</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger#getStepVoltageIncrement()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	public EAttribute getRatioTapChanger_StepVoltageIncrement() {
        return (EAttribute)getRatioTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.RatioTapChanger#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Tap Changer Tabular</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger#getRatioTapChangerTabular()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	public EReference getRatioTapChanger_RatioTapChangerTabular() {
        return (EReference)getRatioTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcul Control Mode</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger#getTculControlMode()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	public EAttribute getRatioTapChanger_TculControlMode() {
        return (EAttribute)getRatioTapChanger().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger#getTransformerEnd()
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	public EReference getRatioTapChanger_TransformerEnd() {
        return (EReference)getRatioTapChanger().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear <em>Phase Tap Changer Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer Linear</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerLinear
	 * @generated
	 */
	public EClass getPhaseTapChangerLinear() {
		if (phaseTapChangerLinearEClass == null) {
			phaseTapChangerLinearEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(10);
		}
		return phaseTapChangerLinearEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Phase Shift Increment</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerLinear#getStepPhaseShiftIncrement()
	 * @see #getPhaseTapChangerLinear()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerLinear_StepPhaseShiftIncrement() {
        return (EAttribute)getPhaseTapChangerLinear().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AC Line Segment</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment
	 * @generated
	 */
	public EClass getACLineSegment() {
		if (acLineSegmentEClass == null) {
			acLineSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(11);
		}
		return acLineSegmentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0ch</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getG0ch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_G0ch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.ACLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sequence Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getSequenceImpedance()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EReference getACLineSegment_SequenceImpedance() {
        return (EReference)getACLineSegment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Assets</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getConductorAssets()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EReference getACLineSegment_ConductorAssets() {
        return (EReference)getACLineSegment().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getR()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_R() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getX()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_X() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor Info</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getConductorInfo()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EReference getACLineSegment_ConductorInfo() {
        return (EReference)getACLineSegment().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gch</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getGch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_Gch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getR0()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_R0() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bch</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getBch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_Bch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0ch</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getB0ch()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_B0ch() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ACLineSegment#getCut <em>Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cut</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getCut()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EReference getACLineSegment_Cut() {
        return (EReference)getACLineSegment().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.ACLineSegment#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getPhaseImpedance()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EReference getACLineSegment_PhaseImpedance() {
        return (EReference)getACLineSegment().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ACLineSegment#getClamp <em>Clamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clamp</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getClamp()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EReference getACLineSegment_Clamp() {
        return (EReference)getACLineSegment().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getX0()
	 * @see #getACLineSegment()
	 * @generated
	 */
	public EAttribute getACLineSegment_X0() {
        return (EAttribute)getACLineSegment().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PowerTransformerEnd <em>Power Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd
	 * @generated
	 */
	public EClass getPowerTransformerEnd() {
		if (powerTransformerEndEClass == null) {
			powerTransformerEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(12);
		}
		return powerTransformerEndEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Transformer</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getPowerTransformer()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EReference getPowerTransformerEnd_PowerTransformer() {
        return (EReference)getPowerTransformerEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getX0()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_X0() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getB0()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_B0() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getG0()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_G0() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedS()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_RatedS() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getB()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_B() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedU()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_RatedU() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getG()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_G() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getR()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_R() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getX()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_X() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getR0()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_R0() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Kind</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getConnectionKind()
	 * @see #getPowerTransformerEnd()
	 * @generated
	 */
	public EAttribute getPowerTransformerEnd_ConnectionKind() {
        return (EAttribute)getPowerTransformerEnd().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see CIM15.IEC61970.Wires.Junction
	 * @generated
	 */
	public EClass getJunction() {
		if (junctionEClass == null) {
			junctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(13);
		}
		return junctionEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Cond Eq</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq
	 * @generated
	 */
	public EClass getRegulatingCondEq() {
		if (regulatingCondEqEClass == null) {
			regulatingCondEqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(14);
		}
		return regulatingCondEqEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.RegulatingCondEq#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq#getControls()
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	public EReference getRegulatingCondEq_Controls() {
        return (EReference)getRegulatingCondEq().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq#getRegulatingControl()
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	public EReference getRegulatingCondEq_RegulatingControl() {
        return (EReference)getRegulatingCondEq().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Sectionaliser <em>Sectionaliser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sectionaliser</em>'.
	 * @see CIM15.IEC61970.Wires.Sectionaliser
	 * @generated
	 */
	public EClass getSectionaliser() {
		if (sectionaliserEClass == null) {
			sectionaliserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(15);
		}
		return sectionaliserEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Tap Changer Tabular</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular
	 * @generated
	 */
	public EClass getRatioTapChangerTabular() {
		if (ratioTapChangerTabularEClass == null) {
			ratioTapChangerTabularEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(16);
		}
		return ratioTapChangerTabularEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ratio Tap Changer Tabular Point</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChangerTabularPoint()
	 * @see #getRatioTapChangerTabular()
	 * @generated
	 */
	public EReference getRatioTapChangerTabular_RatioTapChangerTabularPoint() {
        return (EReference)getRatioTapChangerTabular().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ratio Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChanger()
	 * @see #getRatioTapChangerTabular()
	 * @generated
	 */
	public EReference getRatioTapChangerTabular_RatioTapChanger() {
        return (EReference)getRatioTapChangerTabular().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Transformer</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformer
	 * @generated
	 */
	public EClass getPowerTransformer() {
		if (powerTransformerEClass == null) {
			powerTransformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(17);
		}
		return powerTransformerEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PowerTransformer#getTransformerTanks <em>Transformer Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Tanks</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getTransformerTanks()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	public EReference getPowerTransformer_TransformerTanks() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PowerTransformer#getVectorGroup <em>Vector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Group</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getVectorGroup()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	public EAttribute getPowerTransformer_VectorGroup() {
        return (EAttribute)getPowerTransformer().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerInfo <em>Power Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Transformer Info</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerInfo()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	public EReference getPowerTransformer_PowerTransformerInfo() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerEnd()
	 * @see #getPowerTransformer()
	 * @generated
	 */
	public EReference getPowerTransformer_PowerTransformerEnd() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Fuse <em>Fuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuse</em>'.
	 * @see CIM15.IEC61970.Wires.Fuse
	 * @generated
	 */
	public EClass getFuse() {
		if (fuseEClass == null) {
			fuseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(18);
		}
		return fuseEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Consumer</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer
	 * @generated
	 */
	public EClass getEnergyConsumer() {
		if (energyConsumerEClass == null) {
			energyConsumerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(19);
		}
		return energyConsumerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed Pct</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getQfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EAttribute getEnergyConsumer_QfixedPct() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EReference getEnergyConsumer_ServiceDeliveryPoints() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Count</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getCustomerCount()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EAttribute getEnergyConsumer_CustomerCount() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed Pct</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getPfixedPct()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EAttribute getEnergyConsumer_PfixedPct() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfixed</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getPfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Pfixed() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Response</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getLoadResponse()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EReference getEnergyConsumer_LoadResponse() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qfixed</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getQfixed()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EAttribute getEnergyConsumer_Qfixed() {
        return (EAttribute)getEnergyConsumer().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Cut Zone</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getPowerCutZone()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EReference getEnergyConsumer_PowerCutZone() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.EnergyConsumer#getEnergyConsumerPhases <em>Energy Consumer Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumer Phases</em>'.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getEnergyConsumerPhases()
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public EReference getEnergyConsumer_EnergyConsumerPhases() {
        return (EReference)getEnergyConsumer().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnector</em>'.
	 * @see CIM15.IEC61970.Wires.Disconnector
	 * @generated
	 */
	public EClass getDisconnector() {
		if (disconnectorEClass == null) {
			disconnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(20);
		}
		return disconnectorEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see CIM15.IEC61970.Wires.Connector
	 * @generated
	 */
	public EClass getConnector() {
		if (connectorEClass == null) {
			connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(21);
		}
		return connectorEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Capability Curve</em>'.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve
	 * @generated
	 */
	public EClass getReactiveCapabilityCurve() {
		if (reactiveCapabilityCurveEClass == null) {
			reactiveCapabilityCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(22);
		}
		return reactiveCapabilityCurveEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initially Used By Synchronous Machines</em>'.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	public EReference getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines() {
        return (EReference)getReactiveCapabilityCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronous Machines</em>'.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	public EReference getReactiveCapabilityCurve_SynchronousMachines() {
        return (EReference)getReactiveCapabilityCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hydrogen Pressure</em>'.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	public EAttribute getReactiveCapabilityCurve_HydrogenPressure() {
        return (EAttribute)getReactiveCapabilityCurve().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coolant Temperature</em>'.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature()
	 * @see #getReactiveCapabilityCurve()
	 * @generated
	 */
	public EAttribute getReactiveCapabilityCurve_CoolantTemperature() {
        return (EAttribute)getReactiveCapabilityCurve().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see CIM15.IEC61970.Wires.Plant
	 * @generated
	 */
	public EClass getPlant() {
		if (plantEClass == null) {
			plantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(24);
		}
		return plantEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.GroundDisconnector <em>Ground Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Disconnector</em>'.
	 * @see CIM15.IEC61970.Wires.GroundDisconnector
	 * @generated
	 */
	public EClass getGroundDisconnector() {
		if (groundDisconnectorEClass == null) {
			groundDisconnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(26);
		}
		return groundDisconnectorEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Resistor <em>Resistor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resistor</em>'.
	 * @see CIM15.IEC61970.Wires.Resistor
	 * @generated
	 */
	public EClass getResistor() {
		if (resistorEClass == null) {
			resistorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(27);
		}
		return resistorEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.SynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronous Machine</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine
	 * @generated
	 */
	public EClass getSynchronousMachine() {
		if (synchronousMachineEClass == null) {
			synchronousMachineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(28);
		}
		return synchronousMachineEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getRatedS()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_RatedS() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prime Movers</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getPrimeMovers()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EReference getSynchronousMachine_PrimeMovers() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R2</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getR2()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_R2() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getR0()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_R0() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual To AVR</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getManualToAVR()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_ManualToAVR() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QPercent</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getQPercent()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_QPercent() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coolant Condition</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getCoolantCondition()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_CoolantCondition() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condenser P</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getCondenserP()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_CondenserP() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Trans</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getXQuadTrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XQuadTrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Subtrans</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XQuadSubtrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Sync</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSync()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XQuadSync() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Sync</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSync()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XDirectSync() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Q</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getMinQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MinQ() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVR To Manual Lag</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLag()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_AVRToManualLag() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damping</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getDamping()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Damping() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getGeneratingUnit()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EReference getSynchronousMachine_GeneratingUnit() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getOperatingMode()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_OperatingMode() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Subtrans</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XDirectSubtrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coolant Type</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getCoolantType()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_CoolantType() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVR To Manual Lead</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLead()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_AVRToManualLead() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reactive Capability Curves</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EReference getSynchronousMachine_ReactiveCapabilityCurves() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getMinU()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MinU() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Q</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getMaxQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MaxQ() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Priority</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getReferencePriority()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_ReferencePriority() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getMaxU()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_MaxU() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Trans</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getXDirectTrans()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_XDirectTrans() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Pump</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getHydroPump()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EReference getSynchronousMachine_HydroPump() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inertia</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getInertia()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Inertia() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(27);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Q</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getBaseQ()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_BaseQ() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(28);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getType()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_Type() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(29);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getR()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_R() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(30);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getX0()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_X0() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(31);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getX2()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_X2() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(32);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Reactive Capability Curve</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EReference getSynchronousMachine_InitialReactiveCapabilityCurve() {
        return (EReference)getSynchronousMachine().getEStructuralFeatures().get(33);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getX()
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public EAttribute getSynchronousMachine_X() {
        return (EAttribute)getSynchronousMachine().getEStructuralFeatures().get(34);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical <em>Phase Tap Changer Asymetrical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer Asymetrical</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical
	 * @generated
	 */
	public EClass getPhaseTapChangerAsymetrical() {
		if (phaseTapChangerAsymetricalEClass == null) {
			phaseTapChangerAsymetricalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(29);
		}
		return phaseTapChangerAsymetricalEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Connection Angle</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical#getWindingConnectionAngle()
	 * @see #getPhaseTapChangerAsymetrical()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerAsymetrical_WindingConnectionAngle() {
        return (EAttribute)getPhaseTapChangerAsymetrical().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RectifierInverter <em>Rectifier Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectifier Inverter</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter
	 * @generated
	 */
	public EClass getRectifierInverter() {
		if (rectifierInverterEClass == null) {
			rectifierInverterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(30);
		}
		return rectifierInverterEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getRatedU()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_RatedU() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getMaxU()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_MaxU() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bridges</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getBridges()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_Bridges() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compound Resistance</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getCompoundResistance()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_CompoundResistance() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commutating Resistance</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getCommutatingResistance()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_CommutatingResistance() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getMinP()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_MinP() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getOperatingMode()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_OperatingMode() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getMinU()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_MinU() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commutating Reactance</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getCommutatingReactance()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_CommutatingReactance() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getMaxP()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_MaxP() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getFrequency()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_Frequency() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Compound Voltage</em>'.
	 * @see CIM15.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage()
	 * @see #getRectifierInverter()
	 * @generated
	 */
	public EAttribute getRectifierInverter_MinCompoundVoltage() {
        return (EAttribute)getRectifierInverter().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.SeriesCompensator <em>Series Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series Compensator</em>'.
	 * @see CIM15.IEC61970.Wires.SeriesCompensator
	 * @generated
	 */
	public EClass getSeriesCompensator() {
		if (seriesCompensatorEClass == null) {
			seriesCompensatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(31);
		}
		return seriesCompensatorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SeriesCompensator#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.SeriesCompensator#getX()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	public EAttribute getSeriesCompensator_X() {
        return (EAttribute)getSeriesCompensator().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.SeriesCompensator#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.SeriesCompensator#getR()
	 * @see #getSeriesCompensator()
	 * @generated
	 */
	public EAttribute getSeriesCompensator_R() {
        return (EAttribute)getSeriesCompensator().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TapChangerControl <em>Tap Changer Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer Control</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl
	 * @generated
	 */
	public EClass getTapChangerControl() {
		if (tapChangerControlEClass == null) {
			tapChangerControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(32);
		}
		return tapChangerControlEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropR <em>Line Drop R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop R</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getLineDropR()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EAttribute getTapChangerControl_LineDropR() {
        return (EAttribute)getTapChangerControl().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropX <em>Line Drop X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop X</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getLineDropX()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EAttribute getTapChangerControl_LineDropX() {
        return (EAttribute)getTapChangerControl().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TapChangerControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getTapChanger()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EReference getTapChangerControl_TapChanger() {
        return (EReference)getTapChangerControl().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Line Drop X</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropX()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EAttribute getTapChangerControl_ReverseLineDropX() {
        return (EAttribute)getTapChangerControl().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Line Drop R</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropR()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EAttribute getTapChangerControl_ReverseLineDropR() {
        return (EAttribute)getTapChangerControl().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChangerControl#isLineDropCompensation <em>Line Drop Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Drop Compensation</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#isLineDropCompensation()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EAttribute getTapChangerControl_LineDropCompensation() {
        return (EAttribute)getTapChangerControl().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Voltage</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getLimitVoltage()
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public EAttribute getTapChangerControl_LimitVoltage() {
        return (EAttribute)getTapChangerControl().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulating Control</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl
	 * @generated
	 */
	public EClass getRegulatingControl() {
		if (regulatingControlEClass == null) {
			regulatingControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(33);
		}
		return regulatingControlEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getMode()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EAttribute getRegulatingControl_Mode() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Range</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getTargetRange()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EAttribute getRegulatingControl_TargetRange() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Cond Eq</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getRegulatingCondEq()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EReference getRegulatingControl_RegulatingCondEq() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getTerminal()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EReference getRegulatingControl_Terminal() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discrete</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#isDiscrete()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EAttribute getRegulatingControl_Discrete() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Value</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getTargetValue()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EAttribute getRegulatingControl_TargetValue() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulation Schedule</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getRegulationSchedule()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EReference getRegulatingControl_RegulationSchedule() {
        return (EReference)getRegulatingControl().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitored Phase</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getMonitoredPhase()
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public EAttribute getRegulatingControl_MonitoredPhase() {
        return (EAttribute)getRegulatingControl().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.ProtectedSwitch <em>Protected Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protected Switch</em>'.
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch
	 * @generated
	 */
	public EClass getProtectedSwitch() {
		if (protectedSwitchEClass == null) {
			protectedSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(36);
		}
		return protectedSwitchEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getProtectionEquipments2 <em>Protection Equipments2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protection Equipments2</em>'.
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch#getProtectionEquipments2()
	 * @see #getProtectedSwitch()
	 * @generated
	 */
	public EReference getProtectedSwitch_ProtectionEquipments2() {
        return (EReference)getProtectedSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breaking Capacity</em>'.
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch#getBreakingCapacity()
	 * @see #getProtectedSwitch()
	 * @generated
	 */
	public EAttribute getProtectedSwitch_BreakingCapacity() {
        return (EAttribute)getProtectedSwitch().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reclose Sequences</em>'.
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch#getRecloseSequences()
	 * @see #getProtectedSwitch()
	 * @generated
	 */
	public EReference getProtectedSwitch_RecloseSequences() {
        return (EReference)getProtectedSwitch().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger
	 * @generated
	 */
	public EClass getPhaseTapChanger() {
		if (phaseTapChangerEClass == null) {
			phaseTapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(37);
		}
		return phaseTapChangerEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Tap Changer Tabular</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerTabular()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	public EReference getPhaseTapChanger_PhaseTapChangerTabular() {
        return (EReference)getPhaseTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger#getTransformerEnd()
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	public EReference getPhaseTapChanger_TransformerEnd() {
        return (EReference)getPhaseTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Ground <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground</em>'.
	 * @see CIM15.IEC61970.Wires.Ground
	 * @generated
	 */
	public EClass getGround() {
		if (groundEClass == null) {
			groundEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(39);
		}
		return groundEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.Ground#getWindingInsulations <em>Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winding Insulations</em>'.
	 * @see CIM15.IEC61970.Wires.Ground#getWindingInsulations()
	 * @see #getGround()
	 * @generated
	 */
	public EReference getGround_WindingInsulations() {
        return (EReference)getGround().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.CompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Switch</em>'.
	 * @see CIM15.IEC61970.Wires.CompositeSwitch
	 * @generated
	 */
	public EClass getCompositeSwitch() {
		if (compositeSwitchEClass == null) {
			compositeSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(40);
		}
		return compositeSwitchEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite Switch Type</em>'.
	 * @see CIM15.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType()
	 * @see #getCompositeSwitch()
	 * @generated
	 */
	public EAttribute getCompositeSwitch_CompositeSwitchType() {
        return (EAttribute)getCompositeSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.CompositeSwitch#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see CIM15.IEC61970.Wires.CompositeSwitch#getSwitches()
	 * @see #getCompositeSwitch()
	 * @generated
	 */
	public EReference getCompositeSwitch_Switches() {
        return (EReference)getCompositeSwitch().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.RegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation Schedule</em>'.
	 * @see CIM15.IEC61970.Wires.RegulationSchedule
	 * @generated
	 */
	public EClass getRegulationSchedule() {
		if (regulationScheduleEClass == null) {
			regulationScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(41);
		}
		return regulationScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Control</em>'.
	 * @see CIM15.IEC61970.Wires.RegulationSchedule#getRegulatingControl()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	public EReference getRegulationSchedule_RegulatingControl() {
        return (EReference)getRegulationSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Control Zones</em>'.
	 * @see CIM15.IEC61970.Wires.RegulationSchedule#getVoltageControlZones()
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	public EReference getRegulationSchedule_VoltageControlZones() {
        return (EReference)getRegulationSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TransformerTankEnd <em>Transformer Tank End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Tank End</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTankEnd
	 * @generated
	 */
	public EClass getTransformerTankEnd() {
		if (transformerTankEndEClass == null) {
			transformerTankEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(42);
		}
		return transformerTankEndEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getTransformerTank <em>Transformer Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Tank</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTankEnd#getTransformerTank()
	 * @see #getTransformerTankEnd()
	 * @generated
	 */
	public EReference getTransformerTankEnd_TransformerTank() {
        return (EReference)getTransformerTankEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTankEnd#getPhases()
	 * @see #getTransformerTankEnd()
	 * @generated
	 */
	public EAttribute getTransformerTankEnd_Phases() {
        return (EAttribute)getTransformerTankEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker</em>'.
	 * @see CIM15.IEC61970.Wires.Breaker
	 * @generated
	 */
	public EClass getBreaker() {
		if (breakerEClass == null) {
			breakerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(43);
		}
		return breakerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Breaker#getInTransitTime <em>In Transit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Transit Time</em>'.
	 * @see CIM15.IEC61970.Wires.Breaker#getInTransitTime()
	 * @see #getBreaker()
	 * @generated
	 */
	public EAttribute getBreaker_InTransitTime() {
        return (EAttribute)getBreaker().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.MutualCoupling <em>Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutual Coupling</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling
	 * @generated
	 */
	public EClass getMutualCoupling() {
		if (mutualCouplingEClass == null) {
			mutualCouplingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(44);
		}
		return mutualCouplingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance12</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getDistance12()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance12() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance11</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getDistance11()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance11() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getR0()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_R0() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance22</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getDistance22()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance22() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance21</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getDistance21()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_Distance21() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Terminal</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getFirst_Terminal()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EReference getMutualCoupling_First_Terminal() {
        return (EReference)getMutualCoupling().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0ch</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getB0ch()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_B0ch() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Terminal</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getSecond_Terminal()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EReference getMutualCoupling_Second_Terminal() {
        return (EReference)getMutualCoupling().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getX0()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_X0() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0ch</em>'.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getG0ch()
	 * @see #getMutualCoupling()
	 * @generated
	 */
	public EAttribute getMutualCoupling_G0ch() {
        return (EAttribute)getMutualCoupling().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see CIM15.IEC61970.Wires.Line
	 * @generated
	 */
	public EClass getLine() {
		if (lineEClass == null) {
			lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(45);
		}
		return lineEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CIM15.IEC61970.Wires.Line#getRegion()
	 * @see #getLine()
	 * @generated
	 */
	public EReference getLine_Region() {
        return (EReference)getLine().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance <em>Per Length Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Length Phase Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance
	 * @generated
	 */
	public EClass getPerLengthPhaseImpedance() {
		if (perLengthPhaseImpedanceEClass == null) {
			perLengthPhaseImpedanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(46);
		}
		return perLengthPhaseImpedanceEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getLineSegments <em>Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line Segments</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getLineSegments()
	 * @see #getPerLengthPhaseImpedance()
	 * @generated
	 */
	public EReference getPerLengthPhaseImpedance_LineSegments() {
        return (EReference)getPerLengthPhaseImpedance().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conductor Count</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getConductorCount()
	 * @see #getPerLengthPhaseImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthPhaseImpedance_ConductorCount() {
        return (EAttribute)getPerLengthPhaseImpedance().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phase Impedance Data</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getPhaseImpedanceData()
	 * @see #getPerLengthPhaseImpedance()
	 * @generated
	 */
	public EReference getPerLengthPhaseImpedance_PhaseImpedanceData() {
        return (EReference)getPerLengthPhaseImpedance().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.FrequencyConverter <em>Frequency Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Converter</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter
	 * @generated
	 */
	public EClass getFrequencyConverter() {
		if (frequencyConverterEClass == null) {
			frequencyConverterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(47);
		}
		return frequencyConverterEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter#getMaxU()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MaxU() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter#getMaxP()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MaxP() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter#getFrequency()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	public EAttribute getFrequencyConverter_Frequency() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter#getMinP()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MinP() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter#getMinU()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	public EAttribute getFrequencyConverter_MinU() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter#getOperatingMode()
	 * @see #getFrequencyConverter()
	 * @generated
	 */
	public EAttribute getFrequencyConverter_OperatingMode() {
        return (EAttribute)getFrequencyConverter().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.ShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Compensator</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator
	 * @generated
	 */
	public EClass getShuntCompensator() {
		if (shuntCompensatorEClass == null) {
			shuntCompensatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(48);
		}
		return shuntCompensatorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Q</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getNomQ()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_NomQ() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max U</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getMaxU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_MaxU() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GPer Section</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getGPerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_GPerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Sensitivity</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_VoltageSensitivity() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom U</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getNomU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_NomU() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0 Per Section</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getB0PerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_B0PerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Sections</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getMaximumSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_MaximumSections() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BPer Section</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getBPerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_BPerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Shunt Compensator Sections</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EReference getShuntCompensator_SvShuntCompensatorSections() {
        return (EReference)getShuntCompensator().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AVR Delay</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getAVRDelay()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_AVRDelay() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min U</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getMinU()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_MinU() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Sections</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getNormalSections()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_NormalSections() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.ShuntCompensator#getShuntCompensatorPhases <em>Shunt Compensator Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shunt Compensator Phases</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getShuntCompensatorPhases()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EReference getShuntCompensator_ShuntCompensatorPhases() {
        return (EReference)getShuntCompensator().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reactive Per Section</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getReactivePerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_ReactivePerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Count</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnCount()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_SwitchOnCount() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Date</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnDate()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_SwitchOnDate() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0 Per Section</em>'.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getG0PerSection()
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public EAttribute getShuntCompensator_G0PerSection() {
        return (EAttribute)getShuntCompensator().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.VoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Control Zone</em>'.
	 * @see CIM15.IEC61970.Wires.VoltageControlZone
	 * @generated
	 */
	public EClass getVoltageControlZone() {
		if (voltageControlZoneEClass == null) {
			voltageControlZoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(49);
		}
		return voltageControlZoneEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulation Schedule</em>'.
	 * @see CIM15.IEC61970.Wires.VoltageControlZone#getRegulationSchedule()
	 * @see #getVoltageControlZone()
	 * @generated
	 */
	public EReference getVoltageControlZone_RegulationSchedule() {
        return (EReference)getVoltageControlZone().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Busbar Section</em>'.
	 * @see CIM15.IEC61970.Wires.VoltageControlZone#getBusbarSection()
	 * @see #getVoltageControlZone()
	 * @generated
	 */
	public EReference getVoltageControlZone_BusbarSection() {
        return (EReference)getVoltageControlZone().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.LoadBreakSwitch <em>Load Break Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Break Switch</em>'.
	 * @see CIM15.IEC61970.Wires.LoadBreakSwitch
	 * @generated
	 */
	public EClass getLoadBreakSwitch() {
		if (loadBreakSwitchEClass == null) {
			loadBreakSwitchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(50);
		}
		return loadBreakSwitchEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.BusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busbar Section</em>'.
	 * @see CIM15.IEC61970.Wires.BusbarSection
	 * @generated
	 */
	public EClass getBusbarSection() {
		if (busbarSectionEClass == null) {
			busbarSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(51);
		}
		return busbarSectionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voltage Control Zone</em>'.
	 * @see CIM15.IEC61970.Wires.BusbarSection#getVoltageControlZone()
	 * @see #getBusbarSection()
	 * @generated
	 */
	public EReference getBusbarSection_VoltageControlZone() {
        return (EReference)getBusbarSection().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd
	 * @generated
	 */
	public EClass getTransformerEnd() {
		if (transformerEndEClass == null) {
			transformerEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(53);
		}
		return transformerEndEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerEnd#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getTerminal()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_Terminal() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#getEndNumber <em>End Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Number</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getEndNumber()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_EndNumber() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#getRground <em>Rground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rground</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getRground()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_Rground() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerEnd#getFromWindingInsulations <em>From Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Winding Insulations</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getFromWindingInsulations()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_FromWindingInsulations() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Admittance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getCoreAdmittance()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_CoreAdmittance() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#isGrounded <em>Grounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounded</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#isGrounded()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_Grounded() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerEnd#getTransformerEndInfo <em>Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer End Info</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getTransformerEndInfo()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_TransformerEndInfo() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagBaseU <em>Mag Base U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mag Base U</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getMagBaseU()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_MagBaseU() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mag Sat Flux</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getMagSatFlux()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_MagSatFlux() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getPhaseTapChanger()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_PhaseTapChanger() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratio Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getRatioTapChanger()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_RatioTapChanger() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#getBmagSat <em>Bmag Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bmag Sat</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getBmagSat()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_BmagSat() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerEnd#getXground <em>Xground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xground</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getXground()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EAttribute getTransformerEnd_Xground() {
        return (EAttribute)getTransformerEnd().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Mesh Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getFromMeshImpedance()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_FromMeshImpedance() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerEnd#getToWindingInsulations <em>To Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Winding Insulations</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getToWindingInsulations()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_ToWindingInsulations() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Mesh Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getToMeshImpedance()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_ToMeshImpedance() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerEnd#getStarImpedance <em>Star Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Star Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getStarImpedance()
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public EReference getTransformerEnd_StarImpedance() {
        return (EReference)getTransformerEnd().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance <em>Transformer Core Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Core Admittance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance
	 * @generated
	 */
	public EClass getTransformerCoreAdmittance() {
		if (transformerCoreAdmittanceEClass == null) {
			transformerCoreAdmittanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(54);
		}
		return transformerCoreAdmittanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG0()
	 * @see #getTransformerCoreAdmittance()
	 * @generated
	 */
	public EAttribute getTransformerCoreAdmittance_G0() {
        return (EAttribute)getTransformerCoreAdmittance().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB0()
	 * @see #getTransformerCoreAdmittance()
	 * @generated
	 */
	public EAttribute getTransformerCoreAdmittance_B0() {
        return (EAttribute)getTransformerCoreAdmittance().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG()
	 * @see #getTransformerCoreAdmittance()
	 * @generated
	 */
	public EAttribute getTransformerCoreAdmittance_G() {
        return (EAttribute)getTransformerCoreAdmittance().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEndInfo <em>Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer End Info</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEndInfo()
	 * @see #getTransformerCoreAdmittance()
	 * @generated
	 */
	public EReference getTransformerCoreAdmittance_TransformerEndInfo() {
        return (EReference)getTransformerCoreAdmittance().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEnd()
	 * @see #getTransformerCoreAdmittance()
	 * @generated
	 */
	public EReference getTransformerCoreAdmittance_TransformerEnd() {
        return (EReference)getTransformerCoreAdmittance().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB()
	 * @see #getTransformerCoreAdmittance()
	 * @generated
	 */
	public EAttribute getTransformerCoreAdmittance_B() {
        return (EAttribute)getTransformerCoreAdmittance().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.StaticVarCompensator <em>Static Var Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Var Compensator</em>'.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator
	 * @generated
	 */
	public EClass getStaticVarCompensator() {
		if (staticVarCompensatorEClass == null) {
			staticVarCompensatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(55);
		}
		return staticVarCompensatorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator#getSlope()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_Slope() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SVC Control Mode</em>'.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator#getSVCControlMode()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_SVCControlMode() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacitive Rating</em>'.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_CapacitiveRating() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Set Point</em>'.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_VoltageSetPoint() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inductive Rating</em>'.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator#getInductiveRating()
	 * @see #getStaticVarCompensator()
	 * @generated
	 */
	public EAttribute getStaticVarCompensator_InductiveRating() {
        return (EAttribute)getStaticVarCompensator().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see CIM15.IEC61970.Wires.Switch
	 * @generated
	 */
	public EClass getSwitch() {
		if (switchEClass == null) {
			switchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(56);
		}
		return switchEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Date</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchOnDate()
	 * @see #getSwitch()
	 * @generated
	 */
	public EAttribute getSwitch_SwitchOnDate() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Open</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#isNormalOpen()
	 * @see #getSwitch()
	 * @generated
	 */
	public EAttribute getSwitch_NormalOpen() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Switch#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getRatedCurrent()
	 * @see #getSwitch()
	 * @generated
	 */
	public EAttribute getSwitch_RatedCurrent() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.Switch#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Operations</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchingOperations()
	 * @see #getSwitch()
	 * @generated
	 */
	public EReference getSwitch_SwitchingOperations() {
        return (EReference)getSwitch().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.Switch#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Mgmt Functions</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getLoadMgmtFunctions()
	 * @see #getSwitch()
	 * @generated
	 */
	public EReference getSwitch_LoadMgmtFunctions() {
        return (EReference)getSwitch().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Switch#isRetained <em>Retained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retained</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#isRetained()
	 * @see #getSwitch()
	 * @generated
	 */
	public EAttribute getSwitch_Retained() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connect Disconnect Functions</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getConnectDisconnectFunctions()
	 * @see #getSwitch()
	 * @generated
	 */
	public EReference getSwitch_ConnectDisconnectFunctions() {
        return (EReference)getSwitch().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch On Count</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchOnCount()
	 * @see #getSwitch()
	 * @generated
	 */
	public EAttribute getSwitch_SwitchOnCount() {
        return (EAttribute)getSwitch().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.Switch#getSwitchSchedules <em>Switch Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Schedules</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchSchedules()
	 * @see #getSwitch()
	 * @generated
	 */
	public EReference getSwitch_SwitchSchedules() {
        return (EReference)getSwitch().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.Switch#getSwitchPhases <em>Switch Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switch Phases</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchPhases()
	 * @see #getSwitch()
	 * @generated
	 */
	public EReference getSwitch_SwitchPhases() {
        return (EReference)getSwitch().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite Switch</em>'.
	 * @see CIM15.IEC61970.Wires.Switch#getCompositeSwitch()
	 * @see #getSwitch()
	 * @generated
	 */
	public EReference getSwitch_CompositeSwitch() {
        return (EReference)getSwitch().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance <em>Per Length Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Per Length Sequence Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance
	 * @generated
	 */
	public EClass getPerLengthSequenceImpedance() {
		if (perLengthSequenceImpedanceEClass == null) {
			perLengthSequenceImpedanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(57);
		}
		return perLengthSequenceImpedanceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getX()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_X() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getR()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_R() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getBch <em>Bch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bch</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getBch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_Bch() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getR0()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_R0() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getLineSegments <em>Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line Segments</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getLineSegments()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EReference getPerLengthSequenceImpedance_LineSegments() {
        return (EReference)getPerLengthSequenceImpedance().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getG0ch <em>G0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0ch</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getG0ch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_G0ch() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getB0ch <em>B0ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0ch</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getB0ch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_B0ch() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getGch <em>Gch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gch</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getGch()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_Gch() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getX0()
	 * @see #getPerLengthSequenceImpedance()
	 * @generated
	 */
	public EAttribute getPerLengthSequenceImpedance_X0() {
        return (EAttribute)getPerLengthSequenceImpedance().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance <em>Transformer Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Mesh Impedance</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance
	 * @generated
	 */
	public EClass getTransformerMeshImpedance() {
		if (transformerMeshImpedanceEClass == null) {
			transformerMeshImpedanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(58);
		}
		return transformerMeshImpedanceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Transformer End Info</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEndInfo()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EReference getTransformerMeshImpedance_FromTransformerEndInfo() {
        return (EReference)getTransformerMeshImpedance().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEnd()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EReference getTransformerMeshImpedance_ToTransformerEnd() {
        return (EReference)getTransformerMeshImpedance().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getR()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EAttribute getTransformerMeshImpedance_R() {
        return (EAttribute)getTransformerMeshImpedance().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEndInfo <em>To Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Transformer End Info</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEndInfo()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EReference getTransformerMeshImpedance_ToTransformerEndInfo() {
        return (EReference)getTransformerMeshImpedance().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getX()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EAttribute getTransformerMeshImpedance_X() {
        return (EAttribute)getTransformerMeshImpedance().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getX0()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EAttribute getTransformerMeshImpedance_X0() {
        return (EAttribute)getTransformerMeshImpedance().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Transformer End</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEnd()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EReference getTransformerMeshImpedance_FromTransformerEnd() {
        return (EReference)getTransformerMeshImpedance().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getR0()
	 * @see #getTransformerMeshImpedance()
	 * @generated
	 */
	public EAttribute getTransformerMeshImpedance_R0() {
        return (EAttribute)getTransformerMeshImpedance().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.SwitchSchedule <em>Switch Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Schedule</em>'.
	 * @see CIM15.IEC61970.Wires.SwitchSchedule
	 * @generated
	 */
	public EClass getSwitchSchedule() {
		if (switchScheduleEClass == null) {
			switchScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(59);
		}
		return switchScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.SwitchSchedule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch</em>'.
	 * @see CIM15.IEC61970.Wires.SwitchSchedule#getSwitch()
	 * @see #getSwitchSchedule()
	 * @generated
	 */
	public EReference getSwitchSchedule_Switch() {
        return (EReference)getSwitchSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.EnergySource <em>Energy Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Source</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource
	 * @generated
	 */
	public EClass getEnergySource() {
		if (energySourceEClass == null) {
			energySourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(60);
		}
		return energySourceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getR0()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_R0() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Magnitude</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getVoltageMagnitude()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_VoltageMagnitude() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xn</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getXn()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_Xn() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getNominalVoltage()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_NominalVoltage() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getX()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_X() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getR()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_R() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Angle</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getVoltageAngle()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_VoltageAngle() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rn</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getRn()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_Rn() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getX0()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_X0() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Power</em>'.
	 * @see CIM15.IEC61970.Wires.EnergySource#getActivePower()
	 * @see #getEnergySource()
	 * @generated
	 */
	public EAttribute getEnergySource_ActivePower() {
        return (EAttribute)getEnergySource().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TransformerTank <em>Transformer Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Tank</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTank
	 * @generated
	 */
	public EClass getTransformerTank() {
		if (transformerTankEClass == null) {
			transformerTankEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(61);
		}
		return transformerTankEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerTank#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getServiceDeliveryPoints()
	 * @see #getTransformerTank()
	 * @generated
	 */
	public EReference getTransformerTank_ServiceDeliveryPoints() {
        return (EReference)getTransformerTank().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankEnds <em>Transformer Tank Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Tank Ends</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getTransformerTankEnds()
	 * @see #getTransformerTank()
	 * @generated
	 */
	public EReference getTransformerTank_TransformerTankEnds() {
        return (EReference)getTransformerTank().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerTank#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Transformer</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getPowerTransformer()
	 * @see #getTransformerTank()
	 * @generated
	 */
	public EReference getTransformerTank_PowerTransformer() {
        return (EReference)getTransformerTank().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Tank Info</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getTransformerTankInfo()
	 * @see #getTransformerTank()
	 * @generated
	 */
	public EReference getTransformerTank_TransformerTankInfo() {
        return (EReference)getTransformerTank().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Observations</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getTransformerObservations()
	 * @see #getTransformerTank()
	 * @generated
	 */
	public EReference getTransformerTank_TransformerObservations() {
        return (EReference)getTransformerTank().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer Tabular Point</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint
	 * @generated
	 */
	public EClass getPhaseTapChangerTabularPoint() {
		if (phaseTapChangerTabularPointEClass == null) {
			phaseTapChangerTabularPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(62);
		}
		return phaseTapChangerTabularPointEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getX()
	 * @see #getPhaseTapChangerTabularPoint()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerTabularPoint_X() {
        return (EAttribute)getPhaseTapChangerTabularPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getStep()
	 * @see #getPhaseTapChangerTabularPoint()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerTabularPoint_Step() {
        return (EAttribute)getPhaseTapChangerTabularPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phase Tap Changer Tabular</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getPhaseTapChangerTabular()
	 * @see #getPhaseTapChangerTabularPoint()
	 * @generated
	 */
	public EReference getPhaseTapChangerTabularPoint_PhaseTapChangerTabular() {
        return (EReference)getPhaseTapChangerTabularPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getAngle()
	 * @see #getPhaseTapChangerTabularPoint()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerTabularPoint_Angle() {
        return (EAttribute)getPhaseTapChangerTabularPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.DCLineSegment <em>DC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DC Line Segment</em>'.
	 * @see CIM15.IEC61970.Wires.DCLineSegment
	 * @generated
	 */
	public EClass getDCLineSegment() {
		if (dcLineSegmentEClass == null) {
			dcLineSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(63);
		}
		return dcLineSegmentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc Segment Inductance</em>'.
	 * @see CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentInductance()
	 * @see #getDCLineSegment()
	 * @generated
	 */
	public EAttribute getDCLineSegment_DcSegmentInductance() {
        return (EAttribute)getDCLineSegment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc Segment Resistance</em>'.
	 * @see CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentResistance()
	 * @see #getDCLineSegment()
	 * @generated
	 */
	public EAttribute getDCLineSegment_DcSegmentResistance() {
        return (EAttribute)getDCLineSegment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger
	 * @generated
	 */
	public EClass getTapChanger() {
		if (tapChangerEClass == null) {
			tapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(64);
		}
		return tapChangerEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerInfo <em>Tap Changer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer Info</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getTapChangerInfo()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EReference getTapChanger_TapChangerInfo() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral U</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getNeutralU()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_NeutralU() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulation Status</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#isRegulationStatus()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_RegulationStatus() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subsequent Delay</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getSubsequentDelay()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_SubsequentDelay() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Step</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getNormalStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_NormalStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ltc Flag</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#isLtcFlag()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_LtcFlag() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Wires.TapChanger#getTapSchedules <em>Tap Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Schedules</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getTapSchedules()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EReference getTapChanger_TapSchedules() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Step</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getLowStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_LowStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Step</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getNeutralStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_NeutralStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Delay</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getInitialDelay()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_InitialDelay() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer Control</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getTapChangerControl()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EReference getTapChanger_TapChangerControl() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Step</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getHighStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EAttribute getTapChanger_HighStep() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Tap Step</em>'.
	 * @see CIM15.IEC61970.Wires.TapChanger#getSvTapStep()
	 * @see #getTapChanger()
	 * @generated
	 */
	public EReference getTapChanger_SvTapStep() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see CIM15.IEC61970.Wires.Conductor
	 * @generated
	 */
	public EClass getConductor() {
		if (conductorEClass == null) {
			conductorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(65);
		}
		return conductorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.Conductor#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CIM15.IEC61970.Wires.Conductor#getLength()
	 * @see #getConductor()
	 * @generated
	 */
	public EAttribute getConductor_Length() {
        return (EAttribute)getConductor().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear <em>Phase Tap Changer Non Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer Non Linear</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear
	 * @generated
	 */
	public EClass getPhaseTapChangerNonLinear() {
		if (phaseTapChangerNonLinearEClass == null) {
			phaseTapChangerNonLinearEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(66);
		}
		return phaseTapChangerNonLinearEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMedian <em>XMedian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMedian</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMedian()
	 * @see #getPhaseTapChangerNonLinear()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerNonLinear_XMedian() {
        return (EAttribute)getPhaseTapChangerNonLinear().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Step Increment</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getVoltageStepIncrement()
	 * @see #getPhaseTapChangerNonLinear()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerNonLinear_VoltageStepIncrement() {
        return (EAttribute)getPhaseTapChangerNonLinear().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMax()
	 * @see #getPhaseTapChangerNonLinear()
	 * @generated
	 */
	public EAttribute getPhaseTapChangerNonLinear_XMax() {
        return (EAttribute)getPhaseTapChangerNonLinear().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.PhaseTapChangerSymetrical <em>Phase Tap Changer Symetrical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Tap Changer Symetrical</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerSymetrical
	 * @generated
	 */
	public EClass getPhaseTapChangerSymetrical() {
		if (phaseTapChangerSymetricalEClass == null) {
			phaseTapChangerSymetricalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(68);
		}
		return phaseTapChangerSymetricalEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Wires.Jumper <em>Jumper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jumper</em>'.
	 * @see CIM15.IEC61970.Wires.Jumper
	 * @generated
	 */
	public EClass getJumper() {
		if (jumperEClass == null) {
			jumperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(69);
		}
		return jumperEClass;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.TapChangerKind <em>Tap Changer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tap Changer Kind</em>'.
	 * @see CIM15.IEC61970.Wires.TapChangerKind
	 * @generated
	 */
	public EEnum getTapChangerKind() {
		if (tapChangerKindEEnum == null) {
			tapChangerKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tapChangerKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.WindingType <em>Winding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Type</em>'.
	 * @see CIM15.IEC61970.Wires.WindingType
	 * @generated
	 */
	public EEnum getWindingType() {
		if (windingTypeEEnum == null) {
			windingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(4);
		}
		return windingTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Operating Mode</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @generated
	 */
	public EEnum getSynchronousMachineOperatingMode() {
		if (synchronousMachineOperatingModeEEnum == null) {
			synchronousMachineOperatingModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(8);
		}
		return synchronousMachineOperatingModeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.TransformerControlMode <em>Transformer Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Control Mode</em>'.
	 * @see CIM15.IEC61970.Wires.TransformerControlMode
	 * @generated
	 */
	public EEnum getTransformerControlMode() {
		if (transformerControlModeEEnum == null) {
			transformerControlModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(23);
		}
		return transformerControlModeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.CoolantType <em>Coolant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coolant Type</em>'.
	 * @see CIM15.IEC61970.Wires.CoolantType
	 * @generated
	 */
	public EEnum getCoolantType() {
		if (coolantTypeEEnum == null) {
			coolantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(25);
		}
		return coolantTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronous Machine Type</em>'.
	 * @see CIM15.IEC61970.Wires.SynchronousMachineType
	 * @generated
	 */
	public EEnum getSynchronousMachineType() {
		if (synchronousMachineTypeEEnum == null) {
			synchronousMachineTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(34);
		}
		return synchronousMachineTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.PhaseTapChangerKind <em>Phase Tap Changer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phase Tap Changer Kind</em>'.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerKind
	 * @generated
	 */
	public EEnum getPhaseTapChangerKind() {
		if (phaseTapChangerKindEEnum == null) {
			phaseTapChangerKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(35);
		}
		return phaseTapChangerKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.SVCControlMode <em>SVC Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SVC Control Mode</em>'.
	 * @see CIM15.IEC61970.Wires.SVCControlMode
	 * @generated
	 */
	public EEnum getSVCControlMode() {
		if (svcControlModeEEnum == null) {
			svcControlModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(38);
		}
		return svcControlModeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.RegulatingControlModeKind <em>Regulating Control Mode Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regulating Control Mode Kind</em>'.
	 * @see CIM15.IEC61970.Wires.RegulatingControlModeKind
	 * @generated
	 */
	public EEnum getRegulatingControlModeKind() {
		if (regulatingControlModeKindEEnum == null) {
			regulatingControlModeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(52);
		}
		return regulatingControlModeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Wires.WindingConnection <em>Winding Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Connection</em>'.
	 * @see CIM15.IEC61970.Wires.WindingConnection
	 * @generated
	 */
	public EEnum getWindingConnection() {
		if (windingConnectionEEnum == null) {
			windingConnectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(67);
		}
		return windingConnectionEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Composite Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Composite Switch Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	public EDataType getCompositeSwitchType() {
		if (compositeSwitchTypeEDataType == null) {
			compositeSwitchTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(70);
		}
		return compositeSwitchTypeEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operating Mode</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	public EDataType getOperatingMode() {
		if (operatingModeEDataType == null) {
			operatingModeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI).getEClassifiers().get(71);
		}
		return operatingModeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public WiresFactory getWiresFactory() {
		return (WiresFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Wires." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData <em>Phase Impedance Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseImpedanceData
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseImpedanceData()
		 * @generated
		 */
		public static final EClass PHASE_IMPEDANCE_DATA = eINSTANCE.getPhaseImpedanceData();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_IMPEDANCE_DATA__R = eINSTANCE.getPhaseImpedanceData_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_IMPEDANCE_DATA__X = eINSTANCE.getPhaseImpedanceData_X();

		/**
		 * The meta object literal for the '<em><b>Phase Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE = eINSTANCE.getPhaseImpedanceData_PhaseImpedance();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_IMPEDANCE_DATA__B = eINSTANCE.getPhaseImpedanceData_B();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER = eINSTANCE.getPhaseImpedanceData_SequenceNumber();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TapSchedule <em>Tap Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TapSchedule
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTapSchedule()
		 * @generated
		 */
		public static final EClass TAP_SCHEDULE = eINSTANCE.getTapSchedule();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_SCHEDULE__TAP_CHANGER = eINSTANCE.getTapSchedule_TapChanger();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance <em>Transformer Star Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerStarImpedance
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerStarImpedance()
		 * @generated
		 */
		public static final EClass TRANSFORMER_STAR_IMPEDANCE = eINSTANCE.getTransformerStarImpedance();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_STAR_IMPEDANCE__X0 = eINSTANCE.getTransformerStarImpedance_X0();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_STAR_IMPEDANCE__X = eINSTANCE.getTransformerStarImpedance_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_STAR_IMPEDANCE__R = eINSTANCE.getTransformerStarImpedance_R();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_STAR_IMPEDANCE__R0 = eINSTANCE.getTransformerStarImpedance_R0();

		/**
		 * The meta object literal for the '<em><b>Transformer End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END = eINSTANCE.getTransformerStarImpedance_TransformerEnd();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Recloser <em>Recloser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Recloser
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRecloser()
		 * @generated
		 */
		public static final EClass RECLOSER = eINSTANCE.getRecloser();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRatioTapChangerTabularPoint()
		 * @generated
		 */
		public static final EClass RATIO_TAP_CHANGER_TABULAR_POINT = eINSTANCE.getRatioTapChangerTabularPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RATIO_TAP_CHANGER_TABULAR_POINT__X = eINSTANCE.getRatioTapChangerTabularPoint_X();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer Tabular</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR = eINSTANCE.getRatioTapChangerTabularPoint_RatioTapChangerTabular();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RATIO_TAP_CHANGER_TABULAR_POINT__RATIO = eINSTANCE.getRatioTapChangerTabularPoint_Ratio();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RATIO_TAP_CHANGER_TABULAR_POINT__STEP = eINSTANCE.getRatioTapChangerTabularPoint_Step();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerTabular()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER_TABULAR = eINSTANCE.getPhaseTapChangerTabular();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer Tabular Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT = eINSTANCE.getPhaseTapChangerTabular_PhaseTapChangerTabularPoint();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER = eINSTANCE.getPhaseTapChangerTabular_PhaseTapChanger();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RatioTapChanger <em>Ratio Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RatioTapChanger
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRatioTapChanger()
		 * @generated
		 */
		public static final EClass RATIO_TAP_CHANGER = eINSTANCE.getRatioTapChanger();

		/**
		 * The meta object literal for the '<em><b>Step Voltage Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT = eINSTANCE.getRatioTapChanger_StepVoltageIncrement();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer Tabular</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR = eINSTANCE.getRatioTapChanger_RatioTapChangerTabular();

		/**
		 * The meta object literal for the '<em><b>Tcul Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RATIO_TAP_CHANGER__TCUL_CONTROL_MODE = eINSTANCE.getRatioTapChanger_TculControlMode();

		/**
		 * The meta object literal for the '<em><b>Transformer End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RATIO_TAP_CHANGER__TRANSFORMER_END = eINSTANCE.getRatioTapChanger_TransformerEnd();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear <em>Phase Tap Changer Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerLinear
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerLinear()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER_LINEAR = eINSTANCE.getPhaseTapChangerLinear();

		/**
		 * The meta object literal for the '<em><b>Step Phase Shift Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_LINEAR__STEP_PHASE_SHIFT_INCREMENT = eINSTANCE.getPhaseTapChangerLinear_StepPhaseShiftIncrement();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.ACLineSegment <em>AC Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.ACLineSegment
		 * @see CIM15.IEC61970.Wires.WiresPackage#getACLineSegment()
		 * @generated
		 */
		public static final EClass AC_LINE_SEGMENT = eINSTANCE.getACLineSegment();

		/**
		 * The meta object literal for the '<em><b>G0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__G0CH = eINSTANCE.getACLineSegment_G0ch();

		/**
		 * The meta object literal for the '<em><b>Sequence Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE = eINSTANCE.getACLineSegment_SequenceImpedance();

		/**
		 * The meta object literal for the '<em><b>Conductor Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AC_LINE_SEGMENT__CONDUCTOR_ASSETS = eINSTANCE.getACLineSegment_ConductorAssets();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__R = eINSTANCE.getACLineSegment_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__X = eINSTANCE.getACLineSegment_X();

		/**
		 * The meta object literal for the '<em><b>Conductor Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AC_LINE_SEGMENT__CONDUCTOR_INFO = eINSTANCE.getACLineSegment_ConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Gch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__GCH = eINSTANCE.getACLineSegment_Gch();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__R0 = eINSTANCE.getACLineSegment_R0();

		/**
		 * The meta object literal for the '<em><b>Bch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__BCH = eINSTANCE.getACLineSegment_Bch();

		/**
		 * The meta object literal for the '<em><b>B0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__B0CH = eINSTANCE.getACLineSegment_B0ch();

		/**
		 * The meta object literal for the '<em><b>Cut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AC_LINE_SEGMENT__CUT = eINSTANCE.getACLineSegment_Cut();

		/**
		 * The meta object literal for the '<em><b>Phase Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AC_LINE_SEGMENT__PHASE_IMPEDANCE = eINSTANCE.getACLineSegment_PhaseImpedance();

		/**
		 * The meta object literal for the '<em><b>Clamp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AC_LINE_SEGMENT__CLAMP = eINSTANCE.getACLineSegment_Clamp();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AC_LINE_SEGMENT__X0 = eINSTANCE.getACLineSegment_X0();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd <em>Power Transformer End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PowerTransformerEnd
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPowerTransformerEnd()
		 * @generated
		 */
		public static final EClass POWER_TRANSFORMER_END = eINSTANCE.getPowerTransformerEnd();

		/**
		 * The meta object literal for the '<em><b>Power Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_TRANSFORMER_END__POWER_TRANSFORMER = eINSTANCE.getPowerTransformerEnd_PowerTransformer();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__X0 = eINSTANCE.getPowerTransformerEnd_X0();

		/**
		 * The meta object literal for the '<em><b>B0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__B0 = eINSTANCE.getPowerTransformerEnd_B0();

		/**
		 * The meta object literal for the '<em><b>G0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__G0 = eINSTANCE.getPowerTransformerEnd_G0();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__RATED_S = eINSTANCE.getPowerTransformerEnd_RatedS();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__B = eINSTANCE.getPowerTransformerEnd_B();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__RATED_U = eINSTANCE.getPowerTransformerEnd_RatedU();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__G = eINSTANCE.getPowerTransformerEnd_G();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__R = eINSTANCE.getPowerTransformerEnd_R();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__X = eINSTANCE.getPowerTransformerEnd_X();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__R0 = eINSTANCE.getPowerTransformerEnd_R0();

		/**
		 * The meta object literal for the '<em><b>Connection Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER_END__CONNECTION_KIND = eINSTANCE.getPowerTransformerEnd_ConnectionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Junction <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Junction
		 * @see CIM15.IEC61970.Wires.WiresPackage#getJunction()
		 * @generated
		 */
		public static final EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RegulatingCondEq <em>Regulating Cond Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RegulatingCondEq
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingCondEq()
		 * @generated
		 */
		public static final EClass REGULATING_COND_EQ = eINSTANCE.getRegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATING_COND_EQ__CONTROLS = eINSTANCE.getRegulatingCondEq_Controls();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATING_COND_EQ__REGULATING_CONTROL = eINSTANCE.getRegulatingCondEq_RegulatingControl();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Sectionaliser <em>Sectionaliser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Sectionaliser
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSectionaliser()
		 * @generated
		 */
		public static final EClass SECTIONALISER = eINSTANCE.getSectionaliser();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRatioTapChangerTabular()
		 * @generated
		 */
		public static final EClass RATIO_TAP_CHANGER_TABULAR = eINSTANCE.getRatioTapChangerTabular();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer Tabular Point</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT = eINSTANCE.getRatioTapChangerTabular_RatioTapChangerTabularPoint();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER = eINSTANCE.getRatioTapChangerTabular_RatioTapChanger();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PowerTransformer <em>Power Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PowerTransformer
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPowerTransformer()
		 * @generated
		 */
		public static final EClass POWER_TRANSFORMER = eINSTANCE.getPowerTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformer Tanks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_TRANSFORMER__TRANSFORMER_TANKS = eINSTANCE.getPowerTransformer_TransformerTanks();

		/**
		 * The meta object literal for the '<em><b>Vector Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_TRANSFORMER__VECTOR_GROUP = eINSTANCE.getPowerTransformer_VectorGroup();

		/**
		 * The meta object literal for the '<em><b>Power Transformer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_TRANSFORMER__POWER_TRANSFORMER_INFO = eINSTANCE.getPowerTransformer_PowerTransformerInfo();

		/**
		 * The meta object literal for the '<em><b>Power Transformer End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_TRANSFORMER__POWER_TRANSFORMER_END = eINSTANCE.getPowerTransformer_PowerTransformerEnd();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Fuse <em>Fuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Fuse
		 * @see CIM15.IEC61970.Wires.WiresPackage#getFuse()
		 * @generated
		 */
		public static final EClass FUSE = eINSTANCE.getFuse();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.EnergyConsumer <em>Energy Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.EnergyConsumer
		 * @see CIM15.IEC61970.Wires.WiresPackage#getEnergyConsumer()
		 * @generated
		 */
		public static final EClass ENERGY_CONSUMER = eINSTANCE.getEnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Qfixed Pct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_CONSUMER__QFIXED_PCT = eINSTANCE.getEnergyConsumer_QfixedPct();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS = eINSTANCE.getEnergyConsumer_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_CONSUMER__CUSTOMER_COUNT = eINSTANCE.getEnergyConsumer_CustomerCount();

		/**
		 * The meta object literal for the '<em><b>Pfixed Pct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_CONSUMER__PFIXED_PCT = eINSTANCE.getEnergyConsumer_PfixedPct();

		/**
		 * The meta object literal for the '<em><b>Pfixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_CONSUMER__PFIXED = eINSTANCE.getEnergyConsumer_Pfixed();

		/**
		 * The meta object literal for the '<em><b>Load Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENERGY_CONSUMER__LOAD_RESPONSE = eINSTANCE.getEnergyConsumer_LoadResponse();

		/**
		 * The meta object literal for the '<em><b>Qfixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_CONSUMER__QFIXED = eINSTANCE.getEnergyConsumer_Qfixed();

		/**
		 * The meta object literal for the '<em><b>Power Cut Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENERGY_CONSUMER__POWER_CUT_ZONE = eINSTANCE.getEnergyConsumer_PowerCutZone();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES = eINSTANCE.getEnergyConsumer_EnergyConsumerPhases();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Disconnector <em>Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Disconnector
		 * @see CIM15.IEC61970.Wires.WiresPackage#getDisconnector()
		 * @generated
		 */
		public static final EClass DISCONNECTOR = eINSTANCE.getDisconnector();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Connector <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Connector
		 * @see CIM15.IEC61970.Wires.WiresPackage#getConnector()
		 * @generated
		 */
		public static final EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve
		 * @see CIM15.IEC61970.Wires.WiresPackage#getReactiveCapabilityCurve()
		 * @generated
		 */
		public static final EClass REACTIVE_CAPABILITY_CURVE = eINSTANCE.getReactiveCapabilityCurve();

		/**
		 * The meta object literal for the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES = eINSTANCE.getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES = eINSTANCE.getReactiveCapabilityCurve_SynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Hydrogen Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE = eINSTANCE.getReactiveCapabilityCurve_HydrogenPressure();

		/**
		 * The meta object literal for the '<em><b>Coolant Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE = eINSTANCE.getReactiveCapabilityCurve_CoolantTemperature();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Plant <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Plant
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPlant()
		 * @generated
		 */
		public static final EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.GroundDisconnector <em>Ground Disconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.GroundDisconnector
		 * @see CIM15.IEC61970.Wires.WiresPackage#getGroundDisconnector()
		 * @generated
		 */
		public static final EClass GROUND_DISCONNECTOR = eINSTANCE.getGroundDisconnector();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Resistor <em>Resistor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Resistor
		 * @see CIM15.IEC61970.Wires.WiresPackage#getResistor()
		 * @generated
		 */
		public static final EClass RESISTOR = eINSTANCE.getResistor();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.SynchronousMachine <em>Synchronous Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.SynchronousMachine
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSynchronousMachine()
		 * @generated
		 */
		public static final EClass SYNCHRONOUS_MACHINE = eINSTANCE.getSynchronousMachine();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__RATED_S = eINSTANCE.getSynchronousMachine_RatedS();

		/**
		 * The meta object literal for the '<em><b>Prime Movers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONOUS_MACHINE__PRIME_MOVERS = eINSTANCE.getSynchronousMachine_PrimeMovers();

		/**
		 * The meta object literal for the '<em><b>R2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__R2 = eINSTANCE.getSynchronousMachine_R2();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__R0 = eINSTANCE.getSynchronousMachine_R0();

		/**
		 * The meta object literal for the '<em><b>Manual To AVR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__MANUAL_TO_AVR = eINSTANCE.getSynchronousMachine_ManualToAVR();

		/**
		 * The meta object literal for the '<em><b>QPercent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__QPERCENT = eINSTANCE.getSynchronousMachine_QPercent();

		/**
		 * The meta object literal for the '<em><b>Coolant Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__COOLANT_CONDITION = eINSTANCE.getSynchronousMachine_CoolantCondition();

		/**
		 * The meta object literal for the '<em><b>Condenser P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__CONDENSER_P = eINSTANCE.getSynchronousMachine_CondenserP();

		/**
		 * The meta object literal for the '<em><b>XQuad Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__XQUAD_TRANS = eINSTANCE.getSynchronousMachine_XQuadTrans();

		/**
		 * The meta object literal for the '<em><b>XQuad Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS = eINSTANCE.getSynchronousMachine_XQuadSubtrans();

		/**
		 * The meta object literal for the '<em><b>XQuad Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__XQUAD_SYNC = eINSTANCE.getSynchronousMachine_XQuadSync();

		/**
		 * The meta object literal for the '<em><b>XDirect Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__XDIRECT_SYNC = eINSTANCE.getSynchronousMachine_XDirectSync();

		/**
		 * The meta object literal for the '<em><b>Min Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__MIN_Q = eINSTANCE.getSynchronousMachine_MinQ();

		/**
		 * The meta object literal for the '<em><b>AVR To Manual Lag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG = eINSTANCE.getSynchronousMachine_AVRToManualLag();

		/**
		 * The meta object literal for the '<em><b>Damping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__DAMPING = eINSTANCE.getSynchronousMachine_Damping();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONOUS_MACHINE__GENERATING_UNIT = eINSTANCE.getSynchronousMachine_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__OPERATING_MODE = eINSTANCE.getSynchronousMachine_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>XDirect Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS = eINSTANCE.getSynchronousMachine_XDirectSubtrans();

		/**
		 * The meta object literal for the '<em><b>Coolant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__COOLANT_TYPE = eINSTANCE.getSynchronousMachine_CoolantType();

		/**
		 * The meta object literal for the '<em><b>AVR To Manual Lead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD = eINSTANCE.getSynchronousMachine_AVRToManualLead();

		/**
		 * The meta object literal for the '<em><b>Reactive Capability Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES = eINSTANCE.getSynchronousMachine_ReactiveCapabilityCurves();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__MIN_U = eINSTANCE.getSynchronousMachine_MinU();

		/**
		 * The meta object literal for the '<em><b>Max Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__MAX_Q = eINSTANCE.getSynchronousMachine_MaxQ();

		/**
		 * The meta object literal for the '<em><b>Reference Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY = eINSTANCE.getSynchronousMachine_ReferencePriority();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__MAX_U = eINSTANCE.getSynchronousMachine_MaxU();

		/**
		 * The meta object literal for the '<em><b>XDirect Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__XDIRECT_TRANS = eINSTANCE.getSynchronousMachine_XDirectTrans();

		/**
		 * The meta object literal for the '<em><b>Hydro Pump</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONOUS_MACHINE__HYDRO_PUMP = eINSTANCE.getSynchronousMachine_HydroPump();

		/**
		 * The meta object literal for the '<em><b>Inertia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__INERTIA = eINSTANCE.getSynchronousMachine_Inertia();

		/**
		 * The meta object literal for the '<em><b>Base Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__BASE_Q = eINSTANCE.getSynchronousMachine_BaseQ();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__TYPE = eINSTANCE.getSynchronousMachine_Type();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__R = eINSTANCE.getSynchronousMachine_R();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__X0 = eINSTANCE.getSynchronousMachine_X0();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__X2 = eINSTANCE.getSynchronousMachine_X2();

		/**
		 * The meta object literal for the '<em><b>Initial Reactive Capability Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE = eINSTANCE.getSynchronousMachine_InitialReactiveCapabilityCurve();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONOUS_MACHINE__X = eINSTANCE.getSynchronousMachine_X();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical <em>Phase Tap Changer Asymetrical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerAsymetrical()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER_ASYMETRICAL = eINSTANCE.getPhaseTapChangerAsymetrical();

		/**
		 * The meta object literal for the '<em><b>Winding Connection Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_ASYMETRICAL__WINDING_CONNECTION_ANGLE = eINSTANCE.getPhaseTapChangerAsymetrical_WindingConnectionAngle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RectifierInverter <em>Rectifier Inverter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RectifierInverter
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRectifierInverter()
		 * @generated
		 */
		public static final EClass RECTIFIER_INVERTER = eINSTANCE.getRectifierInverter();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__RATED_U = eINSTANCE.getRectifierInverter_RatedU();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__MAX_U = eINSTANCE.getRectifierInverter_MaxU();

		/**
		 * The meta object literal for the '<em><b>Bridges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__BRIDGES = eINSTANCE.getRectifierInverter_Bridges();

		/**
		 * The meta object literal for the '<em><b>Compound Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__COMPOUND_RESISTANCE = eINSTANCE.getRectifierInverter_CompoundResistance();

		/**
		 * The meta object literal for the '<em><b>Commutating Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__COMMUTATING_RESISTANCE = eINSTANCE.getRectifierInverter_CommutatingResistance();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__MIN_P = eINSTANCE.getRectifierInverter_MinP();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__OPERATING_MODE = eINSTANCE.getRectifierInverter_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__MIN_U = eINSTANCE.getRectifierInverter_MinU();

		/**
		 * The meta object literal for the '<em><b>Commutating Reactance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__COMMUTATING_REACTANCE = eINSTANCE.getRectifierInverter_CommutatingReactance();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__MAX_P = eINSTANCE.getRectifierInverter_MaxP();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__FREQUENCY = eINSTANCE.getRectifierInverter_Frequency();

		/**
		 * The meta object literal for the '<em><b>Min Compound Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE = eINSTANCE.getRectifierInverter_MinCompoundVoltage();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.SeriesCompensator <em>Series Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.SeriesCompensator
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSeriesCompensator()
		 * @generated
		 */
		public static final EClass SERIES_COMPENSATOR = eINSTANCE.getSeriesCompensator();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERIES_COMPENSATOR__X = eINSTANCE.getSeriesCompensator_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERIES_COMPENSATOR__R = eINSTANCE.getSeriesCompensator_R();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TapChangerControl <em>Tap Changer Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TapChangerControl
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChangerControl()
		 * @generated
		 */
		public static final EClass TAP_CHANGER_CONTROL = eINSTANCE.getTapChangerControl();

		/**
		 * The meta object literal for the '<em><b>Line Drop R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_CONTROL__LINE_DROP_R = eINSTANCE.getTapChangerControl_LineDropR();

		/**
		 * The meta object literal for the '<em><b>Line Drop X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_CONTROL__LINE_DROP_X = eINSTANCE.getTapChangerControl_LineDropX();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_CHANGER_CONTROL__TAP_CHANGER = eINSTANCE.getTapChangerControl_TapChanger();

		/**
		 * The meta object literal for the '<em><b>Reverse Line Drop X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X = eINSTANCE.getTapChangerControl_ReverseLineDropX();

		/**
		 * The meta object literal for the '<em><b>Reverse Line Drop R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R = eINSTANCE.getTapChangerControl_ReverseLineDropR();

		/**
		 * The meta object literal for the '<em><b>Line Drop Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION = eINSTANCE.getTapChangerControl_LineDropCompensation();

		/**
		 * The meta object literal for the '<em><b>Limit Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_CONTROL__LIMIT_VOLTAGE = eINSTANCE.getTapChangerControl_LimitVoltage();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RegulatingControl <em>Regulating Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RegulatingControl
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingControl()
		 * @generated
		 */
		public static final EClass REGULATING_CONTROL = eINSTANCE.getRegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULATING_CONTROL__MODE = eINSTANCE.getRegulatingControl_Mode();

		/**
		 * The meta object literal for the '<em><b>Target Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULATING_CONTROL__TARGET_RANGE = eINSTANCE.getRegulatingControl_TargetRange();

		/**
		 * The meta object literal for the '<em><b>Regulating Cond Eq</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATING_CONTROL__REGULATING_COND_EQ = eINSTANCE.getRegulatingControl_RegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATING_CONTROL__TERMINAL = eINSTANCE.getRegulatingControl_Terminal();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULATING_CONTROL__DISCRETE = eINSTANCE.getRegulatingControl_Discrete();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULATING_CONTROL__TARGET_VALUE = eINSTANCE.getRegulatingControl_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Regulation Schedule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATING_CONTROL__REGULATION_SCHEDULE = eINSTANCE.getRegulatingControl_RegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Monitored Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULATING_CONTROL__MONITORED_PHASE = eINSTANCE.getRegulatingControl_MonitoredPhase();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.ProtectedSwitch <em>Protected Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.ProtectedSwitch
		 * @see CIM15.IEC61970.Wires.WiresPackage#getProtectedSwitch()
		 * @generated
		 */
		public static final EClass PROTECTED_SWITCH = eINSTANCE.getProtectedSwitch();

		/**
		 * The meta object literal for the '<em><b>Protection Equipments2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2 = eINSTANCE.getProtectedSwitch_ProtectionEquipments2();

		/**
		 * The meta object literal for the '<em><b>Breaking Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROTECTED_SWITCH__BREAKING_CAPACITY = eINSTANCE.getProtectedSwitch_BreakingCapacity();

		/**
		 * The meta object literal for the '<em><b>Reclose Sequences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROTECTED_SWITCH__RECLOSE_SEQUENCES = eINSTANCE.getProtectedSwitch_RecloseSequences();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChanger <em>Phase Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChanger
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChanger()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER = eINSTANCE.getPhaseTapChanger();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer Tabular</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR = eINSTANCE.getPhaseTapChanger_PhaseTapChangerTabular();

		/**
		 * The meta object literal for the '<em><b>Transformer End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PHASE_TAP_CHANGER__TRANSFORMER_END = eINSTANCE.getPhaseTapChanger_TransformerEnd();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Ground <em>Ground</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Ground
		 * @see CIM15.IEC61970.Wires.WiresPackage#getGround()
		 * @generated
		 */
		public static final EClass GROUND = eINSTANCE.getGround();

		/**
		 * The meta object literal for the '<em><b>Winding Insulations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GROUND__WINDING_INSULATIONS = eINSTANCE.getGround_WindingInsulations();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.CompositeSwitch <em>Composite Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.CompositeSwitch
		 * @see CIM15.IEC61970.Wires.WiresPackage#getCompositeSwitch()
		 * @generated
		 */
		public static final EClass COMPOSITE_SWITCH = eINSTANCE.getCompositeSwitch();

		/**
		 * The meta object literal for the '<em><b>Composite Switch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE = eINSTANCE.getCompositeSwitch_CompositeSwitchType();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPOSITE_SWITCH__SWITCHES = eINSTANCE.getCompositeSwitch_Switches();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RegulationSchedule <em>Regulation Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RegulationSchedule
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulationSchedule()
		 * @generated
		 */
		public static final EClass REGULATION_SCHEDULE = eINSTANCE.getRegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATION_SCHEDULE__REGULATING_CONTROL = eINSTANCE.getRegulationSchedule_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Voltage Control Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES = eINSTANCE.getRegulationSchedule_VoltageControlZones();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerTankEnd <em>Transformer Tank End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerTankEnd
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerTankEnd()
		 * @generated
		 */
		public static final EClass TRANSFORMER_TANK_END = eINSTANCE.getTransformerTankEnd();

		/**
		 * The meta object literal for the '<em><b>Transformer Tank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK_END__TRANSFORMER_TANK = eINSTANCE.getTransformerTankEnd_TransformerTank();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_TANK_END__PHASES = eINSTANCE.getTransformerTankEnd_Phases();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Breaker <em>Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Breaker
		 * @see CIM15.IEC61970.Wires.WiresPackage#getBreaker()
		 * @generated
		 */
		public static final EClass BREAKER = eINSTANCE.getBreaker();

		/**
		 * The meta object literal for the '<em><b>In Transit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BREAKER__IN_TRANSIT_TIME = eINSTANCE.getBreaker_InTransitTime();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.MutualCoupling <em>Mutual Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.MutualCoupling
		 * @see CIM15.IEC61970.Wires.WiresPackage#getMutualCoupling()
		 * @generated
		 */
		public static final EClass MUTUAL_COUPLING = eINSTANCE.getMutualCoupling();

		/**
		 * The meta object literal for the '<em><b>Distance12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__DISTANCE12 = eINSTANCE.getMutualCoupling_Distance12();

		/**
		 * The meta object literal for the '<em><b>Distance11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__DISTANCE11 = eINSTANCE.getMutualCoupling_Distance11();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__R0 = eINSTANCE.getMutualCoupling_R0();

		/**
		 * The meta object literal for the '<em><b>Distance22</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__DISTANCE22 = eINSTANCE.getMutualCoupling_Distance22();

		/**
		 * The meta object literal for the '<em><b>Distance21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__DISTANCE21 = eINSTANCE.getMutualCoupling_Distance21();

		/**
		 * The meta object literal for the '<em><b>First Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUTUAL_COUPLING__FIRST_TERMINAL = eINSTANCE.getMutualCoupling_First_Terminal();

		/**
		 * The meta object literal for the '<em><b>B0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__B0CH = eINSTANCE.getMutualCoupling_B0ch();

		/**
		 * The meta object literal for the '<em><b>Second Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MUTUAL_COUPLING__SECOND_TERMINAL = eINSTANCE.getMutualCoupling_Second_Terminal();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__X0 = eINSTANCE.getMutualCoupling_X0();

		/**
		 * The meta object literal for the '<em><b>G0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MUTUAL_COUPLING__G0CH = eINSTANCE.getMutualCoupling_G0ch();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Line <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Line
		 * @see CIM15.IEC61970.Wires.WiresPackage#getLine()
		 * @generated
		 */
		public static final EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LINE__REGION = eINSTANCE.getLine_Region();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance <em>Per Length Phase Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPerLengthPhaseImpedance()
		 * @generated
		 */
		public static final EClass PER_LENGTH_PHASE_IMPEDANCE = eINSTANCE.getPerLengthPhaseImpedance();

		/**
		 * The meta object literal for the '<em><b>Line Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS = eINSTANCE.getPerLengthPhaseImpedance_LineSegments();

		/**
		 * The meta object literal for the '<em><b>Conductor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT = eINSTANCE.getPerLengthPhaseImpedance_ConductorCount();

		/**
		 * The meta object literal for the '<em><b>Phase Impedance Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA = eINSTANCE.getPerLengthPhaseImpedance_PhaseImpedanceData();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.FrequencyConverter <em>Frequency Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.FrequencyConverter
		 * @see CIM15.IEC61970.Wires.WiresPackage#getFrequencyConverter()
		 * @generated
		 */
		public static final EClass FREQUENCY_CONVERTER = eINSTANCE.getFrequencyConverter();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FREQUENCY_CONVERTER__MAX_U = eINSTANCE.getFrequencyConverter_MaxU();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FREQUENCY_CONVERTER__MAX_P = eINSTANCE.getFrequencyConverter_MaxP();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FREQUENCY_CONVERTER__FREQUENCY = eINSTANCE.getFrequencyConverter_Frequency();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FREQUENCY_CONVERTER__MIN_P = eINSTANCE.getFrequencyConverter_MinP();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FREQUENCY_CONVERTER__MIN_U = eINSTANCE.getFrequencyConverter_MinU();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FREQUENCY_CONVERTER__OPERATING_MODE = eINSTANCE.getFrequencyConverter_OperatingMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.ShuntCompensator <em>Shunt Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.ShuntCompensator
		 * @see CIM15.IEC61970.Wires.WiresPackage#getShuntCompensator()
		 * @generated
		 */
		public static final EClass SHUNT_COMPENSATOR = eINSTANCE.getShuntCompensator();

		/**
		 * The meta object literal for the '<em><b>Nom Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__NOM_Q = eINSTANCE.getShuntCompensator_NomQ();

		/**
		 * The meta object literal for the '<em><b>Max U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__MAX_U = eINSTANCE.getShuntCompensator_MaxU();

		/**
		 * The meta object literal for the '<em><b>GPer Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__GPER_SECTION = eINSTANCE.getShuntCompensator_GPerSection();

		/**
		 * The meta object literal for the '<em><b>Voltage Sensitivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY = eINSTANCE.getShuntCompensator_VoltageSensitivity();

		/**
		 * The meta object literal for the '<em><b>Nom U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__NOM_U = eINSTANCE.getShuntCompensator_NomU();

		/**
		 * The meta object literal for the '<em><b>B0 Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__B0_PER_SECTION = eINSTANCE.getShuntCompensator_B0PerSection();

		/**
		 * The meta object literal for the '<em><b>Maximum Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__MAXIMUM_SECTIONS = eINSTANCE.getShuntCompensator_MaximumSections();

		/**
		 * The meta object literal for the '<em><b>BPer Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__BPER_SECTION = eINSTANCE.getShuntCompensator_BPerSection();

		/**
		 * The meta object literal for the '<em><b>Sv Shunt Compensator Sections</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS = eINSTANCE.getShuntCompensator_SvShuntCompensatorSections();

		/**
		 * The meta object literal for the '<em><b>AVR Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__AVR_DELAY = eINSTANCE.getShuntCompensator_AVRDelay();

		/**
		 * The meta object literal for the '<em><b>Min U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__MIN_U = eINSTANCE.getShuntCompensator_MinU();

		/**
		 * The meta object literal for the '<em><b>Normal Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__NORMAL_SECTIONS = eINSTANCE.getShuntCompensator_NormalSections();

		/**
		 * The meta object literal for the '<em><b>Shunt Compensator Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES = eINSTANCE.getShuntCompensator_ShuntCompensatorPhases();

		/**
		 * The meta object literal for the '<em><b>Reactive Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__REACTIVE_PER_SECTION = eINSTANCE.getShuntCompensator_ReactivePerSection();

		/**
		 * The meta object literal for the '<em><b>Switch On Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__SWITCH_ON_COUNT = eINSTANCE.getShuntCompensator_SwitchOnCount();

		/**
		 * The meta object literal for the '<em><b>Switch On Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__SWITCH_ON_DATE = eINSTANCE.getShuntCompensator_SwitchOnDate();

		/**
		 * The meta object literal for the '<em><b>G0 Per Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUNT_COMPENSATOR__G0_PER_SECTION = eINSTANCE.getShuntCompensator_G0PerSection();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.VoltageControlZone <em>Voltage Control Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.VoltageControlZone
		 * @see CIM15.IEC61970.Wires.WiresPackage#getVoltageControlZone()
		 * @generated
		 */
		public static final EClass VOLTAGE_CONTROL_ZONE = eINSTANCE.getVoltageControlZone();

		/**
		 * The meta object literal for the '<em><b>Regulation Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE = eINSTANCE.getVoltageControlZone_RegulationSchedule();

		/**
		 * The meta object literal for the '<em><b>Busbar Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION = eINSTANCE.getVoltageControlZone_BusbarSection();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.LoadBreakSwitch <em>Load Break Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.LoadBreakSwitch
		 * @see CIM15.IEC61970.Wires.WiresPackage#getLoadBreakSwitch()
		 * @generated
		 */
		public static final EClass LOAD_BREAK_SWITCH = eINSTANCE.getLoadBreakSwitch();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.BusbarSection <em>Busbar Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.BusbarSection
		 * @see CIM15.IEC61970.Wires.WiresPackage#getBusbarSection()
		 * @generated
		 */
		public static final EClass BUSBAR_SECTION = eINSTANCE.getBusbarSection();

		/**
		 * The meta object literal for the '<em><b>Voltage Control Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE = eINSTANCE.getBusbarSection_VoltageControlZone();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerEnd <em>Transformer End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerEnd
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerEnd()
		 * @generated
		 */
		public static final EClass TRANSFORMER_END = eINSTANCE.getTransformerEnd();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__TERMINAL = eINSTANCE.getTransformerEnd_Terminal();

		/**
		 * The meta object literal for the '<em><b>End Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__END_NUMBER = eINSTANCE.getTransformerEnd_EndNumber();

		/**
		 * The meta object literal for the '<em><b>Rground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__RGROUND = eINSTANCE.getTransformerEnd_Rground();

		/**
		 * The meta object literal for the '<em><b>From Winding Insulations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__FROM_WINDING_INSULATIONS = eINSTANCE.getTransformerEnd_FromWindingInsulations();

		/**
		 * The meta object literal for the '<em><b>Core Admittance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__CORE_ADMITTANCE = eINSTANCE.getTransformerEnd_CoreAdmittance();

		/**
		 * The meta object literal for the '<em><b>Grounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__GROUNDED = eINSTANCE.getTransformerEnd_Grounded();

		/**
		 * The meta object literal for the '<em><b>Transformer End Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__TRANSFORMER_END_INFO = eINSTANCE.getTransformerEnd_TransformerEndInfo();

		/**
		 * The meta object literal for the '<em><b>Mag Base U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__MAG_BASE_U = eINSTANCE.getTransformerEnd_MagBaseU();

		/**
		 * The meta object literal for the '<em><b>Mag Sat Flux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__MAG_SAT_FLUX = eINSTANCE.getTransformerEnd_MagSatFlux();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__PHASE_TAP_CHANGER = eINSTANCE.getTransformerEnd_PhaseTapChanger();

		/**
		 * The meta object literal for the '<em><b>Ratio Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__RATIO_TAP_CHANGER = eINSTANCE.getTransformerEnd_RatioTapChanger();

		/**
		 * The meta object literal for the '<em><b>Bmag Sat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__BMAG_SAT = eINSTANCE.getTransformerEnd_BmagSat();

		/**
		 * The meta object literal for the '<em><b>Xground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END__XGROUND = eINSTANCE.getTransformerEnd_Xground();

		/**
		 * The meta object literal for the '<em><b>From Mesh Impedance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__FROM_MESH_IMPEDANCE = eINSTANCE.getTransformerEnd_FromMeshImpedance();

		/**
		 * The meta object literal for the '<em><b>To Winding Insulations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__TO_WINDING_INSULATIONS = eINSTANCE.getTransformerEnd_ToWindingInsulations();

		/**
		 * The meta object literal for the '<em><b>To Mesh Impedance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__TO_MESH_IMPEDANCE = eINSTANCE.getTransformerEnd_ToMeshImpedance();

		/**
		 * The meta object literal for the '<em><b>Star Impedance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END__STAR_IMPEDANCE = eINSTANCE.getTransformerEnd_StarImpedance();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance <em>Transformer Core Admittance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerCoreAdmittance()
		 * @generated
		 */
		public static final EClass TRANSFORMER_CORE_ADMITTANCE = eINSTANCE.getTransformerCoreAdmittance();

		/**
		 * The meta object literal for the '<em><b>G0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_CORE_ADMITTANCE__G0 = eINSTANCE.getTransformerCoreAdmittance_G0();

		/**
		 * The meta object literal for the '<em><b>B0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_CORE_ADMITTANCE__B0 = eINSTANCE.getTransformerCoreAdmittance_B0();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_CORE_ADMITTANCE__G = eINSTANCE.getTransformerCoreAdmittance_G();

		/**
		 * The meta object literal for the '<em><b>Transformer End Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO = eINSTANCE.getTransformerCoreAdmittance_TransformerEndInfo();

		/**
		 * The meta object literal for the '<em><b>Transformer End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END = eINSTANCE.getTransformerCoreAdmittance_TransformerEnd();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_CORE_ADMITTANCE__B = eINSTANCE.getTransformerCoreAdmittance_B();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.StaticVarCompensator <em>Static Var Compensator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.StaticVarCompensator
		 * @see CIM15.IEC61970.Wires.WiresPackage#getStaticVarCompensator()
		 * @generated
		 */
		public static final EClass STATIC_VAR_COMPENSATOR = eINSTANCE.getStaticVarCompensator();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATIC_VAR_COMPENSATOR__SLOPE = eINSTANCE.getStaticVarCompensator_Slope();

		/**
		 * The meta object literal for the '<em><b>SVC Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE = eINSTANCE.getStaticVarCompensator_SVCControlMode();

		/**
		 * The meta object literal for the '<em><b>Capacitive Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING = eINSTANCE.getStaticVarCompensator_CapacitiveRating();

		/**
		 * The meta object literal for the '<em><b>Voltage Set Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT = eINSTANCE.getStaticVarCompensator_VoltageSetPoint();

		/**
		 * The meta object literal for the '<em><b>Inductive Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING = eINSTANCE.getStaticVarCompensator_InductiveRating();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Switch <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Switch
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSwitch()
		 * @generated
		 */
		public static final EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Switch On Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCH__SWITCH_ON_DATE = eINSTANCE.getSwitch_SwitchOnDate();

		/**
		 * The meta object literal for the '<em><b>Normal Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCH__NORMAL_OPEN = eINSTANCE.getSwitch_NormalOpen();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCH__RATED_CURRENT = eINSTANCE.getSwitch_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Switching Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH__SWITCHING_OPERATIONS = eINSTANCE.getSwitch_SwitchingOperations();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH__LOAD_MGMT_FUNCTIONS = eINSTANCE.getSwitch_LoadMgmtFunctions();

		/**
		 * The meta object literal for the '<em><b>Retained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCH__RETAINED = eINSTANCE.getSwitch_Retained();

		/**
		 * The meta object literal for the '<em><b>Connect Disconnect Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH__CONNECT_DISCONNECT_FUNCTIONS = eINSTANCE.getSwitch_ConnectDisconnectFunctions();

		/**
		 * The meta object literal for the '<em><b>Switch On Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCH__SWITCH_ON_COUNT = eINSTANCE.getSwitch_SwitchOnCount();

		/**
		 * The meta object literal for the '<em><b>Switch Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH__SWITCH_SCHEDULES = eINSTANCE.getSwitch_SwitchSchedules();

		/**
		 * The meta object literal for the '<em><b>Switch Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH__SWITCH_PHASES = eINSTANCE.getSwitch_SwitchPhases();

		/**
		 * The meta object literal for the '<em><b>Composite Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH__COMPOSITE_SWITCH = eINSTANCE.getSwitch_CompositeSwitch();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance <em>Per Length Sequence Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPerLengthSequenceImpedance()
		 * @generated
		 */
		public static final EClass PER_LENGTH_SEQUENCE_IMPEDANCE = eINSTANCE.getPerLengthSequenceImpedance();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__X = eINSTANCE.getPerLengthSequenceImpedance_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__R = eINSTANCE.getPerLengthSequenceImpedance_R();

		/**
		 * The meta object literal for the '<em><b>Bch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__BCH = eINSTANCE.getPerLengthSequenceImpedance_Bch();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__R0 = eINSTANCE.getPerLengthSequenceImpedance_R0();

		/**
		 * The meta object literal for the '<em><b>Line Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PER_LENGTH_SEQUENCE_IMPEDANCE__LINE_SEGMENTS = eINSTANCE.getPerLengthSequenceImpedance_LineSegments();

		/**
		 * The meta object literal for the '<em><b>G0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH = eINSTANCE.getPerLengthSequenceImpedance_G0ch();

		/**
		 * The meta object literal for the '<em><b>B0ch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH = eINSTANCE.getPerLengthSequenceImpedance_B0ch();

		/**
		 * The meta object literal for the '<em><b>Gch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__GCH = eINSTANCE.getPerLengthSequenceImpedance_Gch();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PER_LENGTH_SEQUENCE_IMPEDANCE__X0 = eINSTANCE.getPerLengthSequenceImpedance_X0();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance <em>Transformer Mesh Impedance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerMeshImpedance()
		 * @generated
		 */
		public static final EClass TRANSFORMER_MESH_IMPEDANCE = eINSTANCE.getTransformerMeshImpedance();

		/**
		 * The meta object literal for the '<em><b>From Transformer End Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO = eINSTANCE.getTransformerMeshImpedance_FromTransformerEndInfo();

		/**
		 * The meta object literal for the '<em><b>To Transformer End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END = eINSTANCE.getTransformerMeshImpedance_ToTransformerEnd();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_MESH_IMPEDANCE__R = eINSTANCE.getTransformerMeshImpedance_R();

		/**
		 * The meta object literal for the '<em><b>To Transformer End Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO = eINSTANCE.getTransformerMeshImpedance_ToTransformerEndInfo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_MESH_IMPEDANCE__X = eINSTANCE.getTransformerMeshImpedance_X();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_MESH_IMPEDANCE__X0 = eINSTANCE.getTransformerMeshImpedance_X0();

		/**
		 * The meta object literal for the '<em><b>From Transformer End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END = eINSTANCE.getTransformerMeshImpedance_FromTransformerEnd();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_MESH_IMPEDANCE__R0 = eINSTANCE.getTransformerMeshImpedance_R0();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.SwitchSchedule <em>Switch Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.SwitchSchedule
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSwitchSchedule()
		 * @generated
		 */
		public static final EClass SWITCH_SCHEDULE = eINSTANCE.getSwitchSchedule();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCH_SCHEDULE__SWITCH = eINSTANCE.getSwitchSchedule_Switch();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.EnergySource <em>Energy Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.EnergySource
		 * @see CIM15.IEC61970.Wires.WiresPackage#getEnergySource()
		 * @generated
		 */
		public static final EClass ENERGY_SOURCE = eINSTANCE.getEnergySource();

		/**
		 * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__R0 = eINSTANCE.getEnergySource_R0();

		/**
		 * The meta object literal for the '<em><b>Voltage Magnitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__VOLTAGE_MAGNITUDE = eINSTANCE.getEnergySource_VoltageMagnitude();

		/**
		 * The meta object literal for the '<em><b>Xn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__XN = eINSTANCE.getEnergySource_Xn();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__NOMINAL_VOLTAGE = eINSTANCE.getEnergySource_NominalVoltage();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__X = eINSTANCE.getEnergySource_X();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__R = eINSTANCE.getEnergySource_R();

		/**
		 * The meta object literal for the '<em><b>Voltage Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__VOLTAGE_ANGLE = eINSTANCE.getEnergySource_VoltageAngle();

		/**
		 * The meta object literal for the '<em><b>Rn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__RN = eINSTANCE.getEnergySource_Rn();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__X0 = eINSTANCE.getEnergySource_X0();

		/**
		 * The meta object literal for the '<em><b>Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ENERGY_SOURCE__ACTIVE_POWER = eINSTANCE.getEnergySource_ActivePower();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerTank <em>Transformer Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerTank
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerTank()
		 * @generated
		 */
		public static final EClass TRANSFORMER_TANK = eINSTANCE.getTransformerTank();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS = eINSTANCE.getTransformerTank_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Transformer Tank Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS = eINSTANCE.getTransformerTank_TransformerTankEnds();

		/**
		 * The meta object literal for the '<em><b>Power Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK__POWER_TRANSFORMER = eINSTANCE.getTransformerTank_PowerTransformer();

		/**
		 * The meta object literal for the '<em><b>Transformer Tank Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK__TRANSFORMER_TANK_INFO = eINSTANCE.getTransformerTank_TransformerTankInfo();

		/**
		 * The meta object literal for the '<em><b>Transformer Observations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS = eINSTANCE.getTransformerTank_TransformerObservations();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerTabularPoint()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER_TABULAR_POINT = eINSTANCE.getPhaseTapChangerTabularPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_TABULAR_POINT__X = eINSTANCE.getPhaseTapChangerTabularPoint_X();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_TABULAR_POINT__STEP = eINSTANCE.getPhaseTapChangerTabularPoint_Step();

		/**
		 * The meta object literal for the '<em><b>Phase Tap Changer Tabular</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR = eINSTANCE.getPhaseTapChangerTabularPoint_PhaseTapChangerTabular();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_TABULAR_POINT__ANGLE = eINSTANCE.getPhaseTapChangerTabularPoint_Angle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.DCLineSegment <em>DC Line Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.DCLineSegment
		 * @see CIM15.IEC61970.Wires.WiresPackage#getDCLineSegment()
		 * @generated
		 */
		public static final EClass DC_LINE_SEGMENT = eINSTANCE.getDCLineSegment();

		/**
		 * The meta object literal for the '<em><b>Dc Segment Inductance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE = eINSTANCE.getDCLineSegment_DcSegmentInductance();

		/**
		 * The meta object literal for the '<em><b>Dc Segment Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE = eINSTANCE.getDCLineSegment_DcSegmentResistance();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TapChanger <em>Tap Changer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TapChanger
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChanger()
		 * @generated
		 */
		public static final EClass TAP_CHANGER = eINSTANCE.getTapChanger();

		/**
		 * The meta object literal for the '<em><b>Tap Changer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_CHANGER__TAP_CHANGER_INFO = eINSTANCE.getTapChanger_TapChangerInfo();

		/**
		 * The meta object literal for the '<em><b>Neutral U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__NEUTRAL_U = eINSTANCE.getTapChanger_NeutralU();

		/**
		 * The meta object literal for the '<em><b>Regulation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__REGULATION_STATUS = eINSTANCE.getTapChanger_RegulationStatus();

		/**
		 * The meta object literal for the '<em><b>Subsequent Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__SUBSEQUENT_DELAY = eINSTANCE.getTapChanger_SubsequentDelay();

		/**
		 * The meta object literal for the '<em><b>Normal Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__NORMAL_STEP = eINSTANCE.getTapChanger_NormalStep();

		/**
		 * The meta object literal for the '<em><b>Ltc Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__LTC_FLAG = eINSTANCE.getTapChanger_LtcFlag();

		/**
		 * The meta object literal for the '<em><b>Tap Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_CHANGER__TAP_SCHEDULES = eINSTANCE.getTapChanger_TapSchedules();

		/**
		 * The meta object literal for the '<em><b>Low Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__LOW_STEP = eINSTANCE.getTapChanger_LowStep();

		/**
		 * The meta object literal for the '<em><b>Neutral Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__NEUTRAL_STEP = eINSTANCE.getTapChanger_NeutralStep();

		/**
		 * The meta object literal for the '<em><b>Initial Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__INITIAL_DELAY = eINSTANCE.getTapChanger_InitialDelay();

		/**
		 * The meta object literal for the '<em><b>Tap Changer Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_CHANGER__TAP_CHANGER_CONTROL = eINSTANCE.getTapChanger_TapChangerControl();

		/**
		 * The meta object literal for the '<em><b>High Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER__HIGH_STEP = eINSTANCE.getTapChanger_HighStep();

		/**
		 * The meta object literal for the '<em><b>Sv Tap Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_CHANGER__SV_TAP_STEP = eINSTANCE.getTapChanger_SvTapStep();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Conductor <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Conductor
		 * @see CIM15.IEC61970.Wires.WiresPackage#getConductor()
		 * @generated
		 */
		public static final EClass CONDUCTOR = eINSTANCE.getConductor();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDUCTOR__LENGTH = eINSTANCE.getConductor_Length();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear <em>Phase Tap Changer Non Linear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerNonLinear()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER_NON_LINEAR = eINSTANCE.getPhaseTapChangerNonLinear();

		/**
		 * The meta object literal for the '<em><b>XMedian</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN = eINSTANCE.getPhaseTapChangerNonLinear_XMedian();

		/**
		 * The meta object literal for the '<em><b>Voltage Step Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT = eINSTANCE.getPhaseTapChangerNonLinear_VoltageStepIncrement();

		/**
		 * The meta object literal for the '<em><b>XMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PHASE_TAP_CHANGER_NON_LINEAR__XMAX = eINSTANCE.getPhaseTapChangerNonLinear_XMax();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerSymetrical <em>Phase Tap Changer Symetrical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerSymetrical
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerSymetrical()
		 * @generated
		 */
		public static final EClass PHASE_TAP_CHANGER_SYMETRICAL = eINSTANCE.getPhaseTapChangerSymetrical();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.Jumper <em>Jumper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.Jumper
		 * @see CIM15.IEC61970.Wires.WiresPackage#getJumper()
		 * @generated
		 */
		public static final EClass JUMPER = eINSTANCE.getJumper();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TapChangerKind <em>Tap Changer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TapChangerKind
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChangerKind()
		 * @generated
		 */
		public static final EEnum TAP_CHANGER_KIND = eINSTANCE.getTapChangerKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.WindingType <em>Winding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.WindingType
		 * @see CIM15.IEC61970.Wires.WiresPackage#getWindingType()
		 * @generated
		 */
		public static final EEnum WINDING_TYPE = eINSTANCE.getWindingType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.SynchronousMachineOperatingMode <em>Synchronous Machine Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.SynchronousMachineOperatingMode
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSynchronousMachineOperatingMode()
		 * @generated
		 */
		public static final EEnum SYNCHRONOUS_MACHINE_OPERATING_MODE = eINSTANCE.getSynchronousMachineOperatingMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.TransformerControlMode <em>Transformer Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.TransformerControlMode
		 * @see CIM15.IEC61970.Wires.WiresPackage#getTransformerControlMode()
		 * @generated
		 */
		public static final EEnum TRANSFORMER_CONTROL_MODE = eINSTANCE.getTransformerControlMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.CoolantType <em>Coolant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.CoolantType
		 * @see CIM15.IEC61970.Wires.WiresPackage#getCoolantType()
		 * @generated
		 */
		public static final EEnum COOLANT_TYPE = eINSTANCE.getCoolantType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.SynchronousMachineType <em>Synchronous Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.SynchronousMachineType
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSynchronousMachineType()
		 * @generated
		 */
		public static final EEnum SYNCHRONOUS_MACHINE_TYPE = eINSTANCE.getSynchronousMachineType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.PhaseTapChangerKind <em>Phase Tap Changer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.PhaseTapChangerKind
		 * @see CIM15.IEC61970.Wires.WiresPackage#getPhaseTapChangerKind()
		 * @generated
		 */
		public static final EEnum PHASE_TAP_CHANGER_KIND = eINSTANCE.getPhaseTapChangerKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.SVCControlMode <em>SVC Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.SVCControlMode
		 * @see CIM15.IEC61970.Wires.WiresPackage#getSVCControlMode()
		 * @generated
		 */
		public static final EEnum SVC_CONTROL_MODE = eINSTANCE.getSVCControlMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.RegulatingControlModeKind <em>Regulating Control Mode Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.RegulatingControlModeKind
		 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingControlModeKind()
		 * @generated
		 */
		public static final EEnum REGULATING_CONTROL_MODE_KIND = eINSTANCE.getRegulatingControlModeKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Wires.WindingConnection <em>Winding Connection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Wires.WindingConnection
		 * @see CIM15.IEC61970.Wires.WiresPackage#getWindingConnection()
		 * @generated
		 */
		public static final EEnum WINDING_CONNECTION = eINSTANCE.getWindingConnection();

		/**
		 * The meta object literal for the '<em>Composite Switch Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CIM15.IEC61970.Wires.WiresPackage#getCompositeSwitchType()
		 * @generated
		 */
		public static final EDataType COMPOSITE_SWITCH_TYPE = eINSTANCE.getCompositeSwitchType();

		/**
		 * The meta object literal for the '<em>Operating Mode</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CIM15.IEC61970.Wires.WiresPackage#getOperatingMode()
		 * @generated
		 */
		public static final EDataType OPERATING_MODE = eINSTANCE.getOperatingMode();

	}

} //WiresPackage
