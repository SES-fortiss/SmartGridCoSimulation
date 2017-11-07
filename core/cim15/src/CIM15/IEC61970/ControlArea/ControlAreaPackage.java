/**
 */
package CIM15.IEC61970.ControlArea;

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
 * @see CIM15.IEC61970.ControlArea.ControlAreaFactory
 * @generated
 */
public class ControlAreaPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ControlArea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#ControlArea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimControlArea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ControlAreaPackage eINSTANCE = CIM15.IEC61970.ControlArea.ControlAreaPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.ControlArea.AltTieMeas <em>Alt Tie Meas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getAltTieMeas()
	 * @generated
	 */
	public static final int ALT_TIE_MEAS = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_TIE_MEAS__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Analog Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_TIE_MEAS__ANALOG_VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_TIE_MEAS__TIE_FLOW = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_TIE_MEAS__PRIORITY = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alt Tie Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_TIE_MEAS_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alt Tie Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_TIE_MEAS_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getAltGeneratingUnitMeas()
	 * @generated
	 */
	public static final int ALT_GENERATING_UNIT_MEAS = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_GENERATING_UNIT_MEAS__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Analog Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_GENERATING_UNIT_MEAS__PRIORITY = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alt Generating Unit Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_GENERATING_UNIT_MEAS_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alt Generating Unit Meas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ALT_GENERATING_UNIT_MEAS_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.ControlArea.TieFlow <em>Tie Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.ControlArea.TieFlow
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getTieFlow()
	 * @generated
	 */
	public static final int TIE_FLOW = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW__ALT_TIE_MEAS = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW__POSITIVE_FLOW_IN = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW__TERMINAL = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW__CONTROL_AREA = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tie Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIE_FLOW_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.ControlArea.ControlArea <em>Control Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.ControlArea.ControlArea
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getControlArea()
	 * @generated
	 */
	public static final int CONTROL_AREA = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__TIE_FLOW = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>PTolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__PTOLERANCE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__ENERGY_AREA = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA__NET_INTERCHANGE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Control Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getControlAreaGeneratingUnit()
	 * @generated
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Alt Generating Unit Meas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_AREA_GENERATING_UNIT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.ControlArea.ControlAreaTypeKind
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getControlAreaTypeKind()
	 * @generated
	 */
	public static final int CONTROL_AREA_TYPE_KIND = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altTieMeasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altGeneratingUnitMeasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tieFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlAreaGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlAreaTypeKindEEnum = null;

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
	 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlAreaPackage() {
		super(eNS_URI, ControlAreaFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link ControlAreaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ControlAreaPackage init() {
		if (isInited) return (ControlAreaPackage)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI);

		// Obtain or create and register package
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlAreaPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlAreaPackage());

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
		theControlAreaPackage.fixPackageContents();
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
		theControlAreaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlAreaPackage.eNS_URI, theControlAreaPackage);
		return theControlAreaPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.ControlArea.AltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Tie Meas</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas
	 * @generated
	 */
	public EClass getAltTieMeas() {
		if (altTieMeasEClass == null) {
			altTieMeasEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI).getEClassifiers().get(0);
		}
		return altTieMeasEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog Value</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas#getAnalogValue()
	 * @see #getAltTieMeas()
	 * @generated
	 */
	public EReference getAltTieMeas_AnalogValue() {
        return (EReference)getAltTieMeas().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tie Flow</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas#getTieFlow()
	 * @see #getAltTieMeas()
	 * @generated
	 */
	public EReference getAltTieMeas_TieFlow() {
        return (EReference)getAltTieMeas().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas#getPriority()
	 * @see #getAltTieMeas()
	 * @generated
	 */
	public EAttribute getAltTieMeas_Priority() {
        return (EAttribute)getAltTieMeas().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Generating Unit Meas</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas
	 * @generated
	 */
	public EClass getAltGeneratingUnitMeas() {
		if (altGeneratingUnitMeasEClass == null) {
			altGeneratingUnitMeasEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI).getEClassifiers().get(1);
		}
		return altGeneratingUnitMeasEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog Value</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue()
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 */
	public EReference getAltGeneratingUnitMeas_AnalogValue() {
        return (EReference)getAltGeneratingUnitMeas().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority()
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 */
	public EAttribute getAltGeneratingUnitMeas_Priority() {
        return (EAttribute)getAltGeneratingUnitMeas().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area Generating Unit</em>'.
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit()
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 */
	public EReference getAltGeneratingUnitMeas_ControlAreaGeneratingUnit() {
        return (EReference)getAltGeneratingUnitMeas().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.ControlArea.TieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tie Flow</em>'.
	 * @see CIM15.IEC61970.ControlArea.TieFlow
	 * @generated
	 */
	public EClass getTieFlow() {
		if (tieFlowEClass == null) {
			tieFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tieFlowEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.ControlArea.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Tie Meas</em>'.
	 * @see CIM15.IEC61970.ControlArea.TieFlow#getAltTieMeas()
	 * @see #getTieFlow()
	 * @generated
	 */
	public EReference getTieFlow_AltTieMeas() {
        return (EReference)getTieFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CIM15.IEC61970.ControlArea.TieFlow#isPositiveFlowIn()
	 * @see #getTieFlow()
	 * @generated
	 */
	public EAttribute getTieFlow_PositiveFlowIn() {
        return (EAttribute)getTieFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.ControlArea.TieFlow#getTerminal()
	 * @see #getTieFlow()
	 * @generated
	 */
	public EReference getTieFlow_Terminal() {
        return (EReference)getTieFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CIM15.IEC61970.ControlArea.TieFlow#getControlArea()
	 * @see #getTieFlow()
	 * @generated
	 */
	public EReference getTieFlow_ControlArea() {
        return (EReference)getTieFlow().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.ControlArea.ControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Area</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea
	 * @generated
	 */
	public EClass getControlArea() {
		if (controlAreaEClass == null) {
			controlAreaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI).getEClassifiers().get(3);
		}
		return controlAreaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getType()
	 * @see #getControlArea()
	 * @generated
	 */
	public EAttribute getControlArea_Type() {
        return (EAttribute)getControlArea().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit()
	 * @see #getControlArea()
	 * @generated
	 */
	public EReference getControlArea_ControlAreaGeneratingUnit() {
        return (EReference)getControlArea().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getTieFlow()
	 * @see #getControlArea()
	 * @generated
	 */
	public EReference getControlArea_TieFlow() {
        return (EReference)getControlArea().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PTolerance</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getPTolerance()
	 * @see #getControlArea()
	 * @generated
	 */
	public EAttribute getControlArea_PTolerance() {
        return (EAttribute)getControlArea().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Area</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getEnergyArea()
	 * @see #getControlArea()
	 * @generated
	 */
	public EReference getControlArea_EnergyArea() {
        return (EReference)getControlArea().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Interchange</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getNetInterchange()
	 * @see #getControlArea()
	 * @generated
	 */
	public EAttribute getControlArea_NetInterchange() {
        return (EAttribute)getControlArea().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit
	 * @generated
	 */
	public EClass getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnitEClass == null) {
			controlAreaGeneratingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI).getEClassifiers().get(5);
		}
		return controlAreaGeneratingUnitEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Generating Unit Meas</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	public EReference getControlAreaGeneratingUnit_AltGeneratingUnitMeas() {
        return (EReference)getControlAreaGeneratingUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	public EReference getControlAreaGeneratingUnit_GeneratingUnit() {
        return (EReference)getControlAreaGeneratingUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea()
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	public EReference getControlAreaGeneratingUnit_ControlArea() {
        return (EReference)getControlAreaGeneratingUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaTypeKind
	 * @generated
	 */
	public EEnum getControlAreaTypeKind() {
		if (controlAreaTypeKindEEnum == null) {
			controlAreaTypeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI).getEClassifiers().get(4);
		}
		return controlAreaTypeKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ControlAreaFactory getControlAreaFactory() {
		return (ControlAreaFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.ControlArea." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.ControlArea.AltTieMeas <em>Alt Tie Meas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.ControlArea.AltTieMeas
		 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getAltTieMeas()
		 * @generated
		 */
		public static final EClass ALT_TIE_MEAS = eINSTANCE.getAltTieMeas();

		/**
		 * The meta object literal for the '<em><b>Analog Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ALT_TIE_MEAS__ANALOG_VALUE = eINSTANCE.getAltTieMeas_AnalogValue();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ALT_TIE_MEAS__TIE_FLOW = eINSTANCE.getAltTieMeas_TieFlow();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ALT_TIE_MEAS__PRIORITY = eINSTANCE.getAltTieMeas_Priority();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas
		 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getAltGeneratingUnitMeas()
		 * @generated
		 */
		public static final EClass ALT_GENERATING_UNIT_MEAS = eINSTANCE.getAltGeneratingUnitMeas();

		/**
		 * The meta object literal for the '<em><b>Analog Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE = eINSTANCE.getAltGeneratingUnitMeas_AnalogValue();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ALT_GENERATING_UNIT_MEAS__PRIORITY = eINSTANCE.getAltGeneratingUnitMeas_Priority();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getAltGeneratingUnitMeas_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.ControlArea.TieFlow <em>Tie Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.ControlArea.TieFlow
		 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getTieFlow()
		 * @generated
		 */
		public static final EClass TIE_FLOW = eINSTANCE.getTieFlow();

		/**
		 * The meta object literal for the '<em><b>Alt Tie Meas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIE_FLOW__ALT_TIE_MEAS = eINSTANCE.getTieFlow_AltTieMeas();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIE_FLOW__POSITIVE_FLOW_IN = eINSTANCE.getTieFlow_PositiveFlowIn();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIE_FLOW__TERMINAL = eINSTANCE.getTieFlow_Terminal();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIE_FLOW__CONTROL_AREA = eINSTANCE.getTieFlow_ControlArea();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.ControlArea.ControlArea <em>Control Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.ControlArea.ControlArea
		 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getControlArea()
		 * @generated
		 */
		public static final EClass CONTROL_AREA = eINSTANCE.getControlArea();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL_AREA__TYPE = eINSTANCE.getControlArea_Type();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlArea_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_AREA__TIE_FLOW = eINSTANCE.getControlArea_TieFlow();

		/**
		 * The meta object literal for the '<em><b>PTolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL_AREA__PTOLERANCE = eINSTANCE.getControlArea_PTolerance();

		/**
		 * The meta object literal for the '<em><b>Energy Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_AREA__ENERGY_AREA = eINSTANCE.getControlArea_EnergyArea();

		/**
		 * The meta object literal for the '<em><b>Net Interchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL_AREA__NET_INTERCHANGE = eINSTANCE.getControlArea_NetInterchange();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit
		 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getControlAreaGeneratingUnit()
		 * @generated
		 */
		public static final EClass CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Alt Generating Unit Meas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS = eINSTANCE.getControlAreaGeneratingUnit_AltGeneratingUnitMeas();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT = eINSTANCE.getControlAreaGeneratingUnit_GeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA = eINSTANCE.getControlAreaGeneratingUnit_ControlArea();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.ControlArea.ControlAreaTypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.ControlArea.ControlAreaTypeKind
		 * @see CIM15.IEC61970.ControlArea.ControlAreaPackage#getControlAreaTypeKind()
		 * @generated
		 */
		public static final EEnum CONTROL_AREA_TYPE_KIND = eINSTANCE.getControlAreaTypeKind();

	}

} //ControlAreaPackage
