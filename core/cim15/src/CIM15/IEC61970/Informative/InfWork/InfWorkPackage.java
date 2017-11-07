/**
 */
package CIM15.IEC61970.Informative.InfWork;

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
 * @see CIM15.IEC61970.Informative.InfWork.InfWorkFactory
 * @generated
 */
public class InfWorkPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfWork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfWork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfWork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfWorkPackage eINSTANCE = CIM15.IEC61970.Informative.InfWork.InfWorkPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem <em>Equipment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getEquipmentItem()
	 * @generated
	 */
	public static final int EQUIPMENT_ITEM = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Appointment <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment()
	 * @generated
	 */
	public static final int APPOINTMENT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__UUID = InfCommonPackage.SCHEDULED_EVENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__NAMES = InfCommonPackage.SCHEDULED_EVENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__DIAGRAM_OBJECTS = InfCommonPackage.SCHEDULED_EVENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__MRID = InfCommonPackage.SCHEDULED_EVENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__ALIAS_NAME = InfCommonPackage.SCHEDULED_EVENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__NAME = InfCommonPackage.SCHEDULED_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__MODELING_AUTHORITY_SET = InfCommonPackage.SCHEDULED_EVENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__DOCUMENT = InfCommonPackage.SCHEDULED_EVENT__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Activity Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__ACTIVITY_RECORD = InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__STATUS = InfCommonPackage.SCHEDULED_EVENT__STATUS;

	/**
	 * The feature id for the '<em><b>Time Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__TIME_POINT = InfCommonPackage.SCHEDULED_EVENT__TIME_POINT;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__DURATION = InfCommonPackage.SCHEDULED_EVENT__DURATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__CATEGORY = InfCommonPackage.SCHEDULED_EVENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__SCHEDULE_PARAMETER_INFO = InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__ASSETS = InfCommonPackage.SCHEDULED_EVENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Call Ahead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__CALL_AHEAD = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__ADDRESS = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__ERP_PERSONS = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__REMARK = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meeting Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__MEETING_INTERVAL = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Call Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT__CALL_BACK = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_FEATURE_COUNT = InfCommonPackage.SCHEDULED_EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_OPERATION_COUNT = InfCommonPackage.SCHEDULED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry <em>Work Status Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkStatusEntry
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkStatusEntry()
	 * @generated
	 */
	public static final int WORK_STATUS_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__NAMES = CommonPackage.ACTIVITY_RECORD__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__DIAGRAM_OBJECTS = CommonPackage.ACTIVITY_RECORD__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY__PERCENT_COMPLETE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Status Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Status Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_STATUS_ENTRY_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase <em>Business Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getBusinessCase()
	 * @generated
	 */
	public static final int BUSINESS_CASE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE__CORPORATE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Business Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CASE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial <em>Type Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial()
	 * @generated
	 */
	public static final int TYPE_MATERIAL = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__STOCK_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Issue Inventories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ERP_ISSUE_INVENTORIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__COST_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CU Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__CU_MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__ERP_REQ_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__QUANTITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Est Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL__EST_UNIT_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Type Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Type Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_MATERIAL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation <em>Design Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation()
	 * @generated
	 */
	public static final int DESIGN_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__MATERIAL_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__DESIGNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__DESIGN_LOCATION_CUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__WORK_LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__DIAGRAMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Misc Cost Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__MISC_COST_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__ERP_BOM_ITEM_DATAS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Span Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__SPAN_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Condition Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION__CONDITION_FACTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Design Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Design Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost <em>Overhead Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost()
	 * @generated
	 */
	public static final int OVERHEAD_COST = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__WORK_COST_DETAILS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Overhead Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Overhead Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_COST_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Crew <em>Crew</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Crew
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCrew()
	 * @generated
	 */
	public static final int CREW = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__TOOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switching Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__SWITCHING_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__ROUTE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__CAPABILITIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Crew Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__CREW_MEMBERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outage Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__OUTAGE_STEPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Equipment Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__WORK_EQUIPMENT_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__ASSIGNMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__ORGANISATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Shift Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__SHIFT_PATTERNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW__VEHICLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Crew</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREW_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet <em>Diagnosis Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet()
	 * @generated
	 */
	public static final int DIAGNOSIS_DATA_SET = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__UUID = InfAssetsPackage.PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__NAMES = InfAssetsPackage.PROCEDURE_DATA_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__DIAGRAM_OBJECTS = InfAssetsPackage.PROCEDURE_DATA_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__MRID = InfAssetsPackage.PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ALIAS_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__NAME = InfAssetsPackage.PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__MODELING_AUTHORITY_SET = InfAssetsPackage.PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__CHANGE_ITEMS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__TO_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ELECTRONIC_ADDRESS = InfAssetsPackage.PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__REVISION_NUMBER = InfAssetsPackage.PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__NETWORK_DATA_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__FROM_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__SCHEDULE_PARAMETER_INFOS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ERP_ORGANISATION_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__CREATED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__MEASUREMENTS = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__LAST_MODIFIED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ACTIVITY_RECORDS = InfAssetsPackage.PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__SUBJECT = InfAssetsPackage.PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__CHANGE_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ERP_PERSON_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__SCHEDULED_EVENTS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__TITLE = InfAssetsPackage.PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__DOC_STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ASSET_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__CATEGORY = InfAssetsPackage.PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__PROPERTIES = InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__TRANSFORMER_OBSERVATIONS = InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__PROCEDURE = InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__COMPLETED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__MEASUREMENT_VALUES = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Final Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__FINAL_CAUSE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__FINAL_REMARK = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__PHASE_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preliminary Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Preliminary Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__PRELIMINARY_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Root Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ROOT_REMARK = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Root Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ROOT_CAUSE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Preliminary Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__EFFECT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Final Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__FINAL_ORIGIN = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Final Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__FINAL_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Root Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__ROOT_ORIGIN = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET__FAILURE_MODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Diagnosis Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET_FEATURE_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Diagnosis Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSIS_DATA_SET_OPERATION_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset <em>CU Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset()
	 * @generated
	 */
	public static final int CU_ASSET = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Asset Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__TYPE_ASSET_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CU Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CU Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ASSET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Request <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Request
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getRequest()
	 * @generated
	 */
	public static final int REQUEST = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ERP_QUOTE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ACTION_NEEDED = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__PRIORITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__CORPORATE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__ORGANISATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Design <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Design
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesign()
	 * @generated
	 */
	public static final int DESIGN = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__DESIGN_LOCATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__WORK_COST_DETAILS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__COST_ESTIMATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__CONDITION_FACTORS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__WORK_TASKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp BO Ms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ERP_BO_MS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__WORK = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Design Locations CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__DESIGN_LOCATIONS_CUS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__ERP_QUOTE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN__PRICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask <em>Work Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask()
	 * @generated
	 */
	public static final int WORK_TASK = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Equipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__EQUIPMENT_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__USAGES = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Misc Cost Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__MISC_COST_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CREWS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__WORK = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Overhead Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__OVERHEAD_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__DESIGN_LOCATION_CUS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Switching Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__SWITCHING_SCHEDULES = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Work Flow Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__WORK_FLOW_STEP = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__PRIORITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__DESIGN = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Qualification Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__QUALIFICATION_REQUIREMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__CAPABILITIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__WORK_COST_DETAILS = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sched Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__SCHED_OVERRIDE = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__ASSETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__LABOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK__MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Work Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Work Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_TASK_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor <em>Condition Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor()
	 * @generated
	 */
	public static final int CONDITION_FACTOR = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__DESIGNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__DESIGN_LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cf Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__CF_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR__DESIGN_LOCATION_CUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Condition Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Condition Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_FACTOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement <em>Qualification Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement()
	 * @generated
	 */
	public static final int QUALIFICATION_REQUIREMENT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__SKILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CU Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualification ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__QUALIFICATION_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT__SPECIFICATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Qualification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Qualification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFICATION_REQUIREMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation <em>Work Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation()
	 * @generated
	 */
	public static final int WORK_LOCATION = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__UUID = CommonPackage.LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__NAMES = CommonPackage.LOCATION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__DIAGRAM_OBJECTS = CommonPackage.LOCATION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__MRID = CommonPackage.LOCATION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__ALIAS_NAME = CommonPackage.LOCATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__NAME = CommonPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__MODELING_AUTHORITY_SET = CommonPackage.LOCATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__MAIN_ADDRESS = CommonPackage.LOCATION__MAIN_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__PHONE1 = CommonPackage.LOCATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__PHONE2 = CommonPackage.LOCATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__POWER_SYSTEM_RESOURCES = CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__SECONDARY_ADDRESS = CommonPackage.LOCATION__SECONDARY_ADDRESS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__CHANGE_ITEMS = CommonPackage.LOCATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__RED_LINES = CommonPackage.LOCATION__RED_LINES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__CATEGORY = CommonPackage.LOCATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__DIMENSIONS_INFO = CommonPackage.LOCATION__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__LAND_PROPERTIES = CommonPackage.LOCATION__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__ASSETS = CommonPackage.LOCATION__ASSETS;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__HAZARDS = CommonPackage.LOCATION__HAZARDS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__STATUS = CommonPackage.LOCATION__STATUS;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__CREWS = CommonPackage.LOCATION__CREWS;

	/**
	 * The feature id for the '<em><b>Position Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__POSITION_POINTS = CommonPackage.LOCATION__POSITION_POINTS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__ELECTRONIC_ADDRESS = CommonPackage.LOCATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__DIRECTIONS = CommonPackage.LOCATION__DIRECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__MEASUREMENTS = CommonPackage.LOCATION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__ROUTES = CommonPackage.LOCATION__ROUTES;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__GEO_INFO_REFERENCE = CommonPackage.LOCATION__GEO_INFO_REFERENCE;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__COORDINATE_SYSTEM = CommonPackage.LOCATION__COORDINATE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__CORPORATE_CODE = CommonPackage.LOCATION__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__ERP_ORGANISATIONS = CommonPackage.LOCATION__ERP_ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__DIRECTION = CommonPackage.LOCATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>One Call Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__ONE_CALL_REQUEST = CommonPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subdivision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__SUBDIVISION = CommonPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nearest Intersection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__NEAREST_INTERSECTION = CommonPackage.LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__BLOCK = CommonPackage.LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__DESIGN_LOCATIONS = CommonPackage.LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION__LOT = CommonPackage.LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION_FEATURE_COUNT = CommonPackage.LOCATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Work Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_LOCATION_OPERATION_COUNT = CommonPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CostType <em>Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CostType
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCostType()
	 * @generated
	 */
	public static final int COST_TYPE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__STAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__ERP_JOURNAL_ENTRIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Cost Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__PARENT_COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Cost Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__CHILD_COST_TYPES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__WORK_COST_DETAILS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Amount Assignable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__AMOUNT_ASSIGNABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COST_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem <em>CU Material Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem()
	 * @generated
	 */
	public static final int CU_MATERIAL_ITEM = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__PROPERTY_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__CORPORATE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>CU Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>CU Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_MATERIAL_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit <em>Property Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit()
	 * @generated
	 */
	public static final int PROPERTY_UNIT = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Accounting Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__ACCOUNTING_USAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__PROPERTY_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CU Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__CU_MATERIAL_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT__WORK_COST_DETAILS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Property Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Property Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_UNIT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Project <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Project
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getProject()
	 * @generated
	 */
	public static final int PROJECT = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Business Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__BUSINESS_CASE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__BUDGET = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__SUB_PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__ERP_PROJECT_ACCOUNTING = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__REQUESTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT__PARENT_PROJECT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem <em>CU Labor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem()
	 * @generated
	 */
	public static final int CU_LABOR_ITEM = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__LABOR_DURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__LABOR_RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CU Labor Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__CU_LABOR_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Qualification Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>CU Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>CU Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.LaborItem <em>Labor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem()
	 * @generated
	 */
	public static final int LABOR_ITEM = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__LABOR_RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__LABOR_DURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Labor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep <em>Work Flow Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep()
	 * @generated
	 */
	public static final int WORK_FLOW_STEP = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP__WORK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Work Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Work Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_FLOW_STEP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet <em>Inspection Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.InspectionDataSet
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getInspectionDataSet()
	 * @generated
	 */
	public static final int INSPECTION_DATA_SET = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__UUID = InfAssetsPackage.PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__NAMES = InfAssetsPackage.PROCEDURE_DATA_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__DIAGRAM_OBJECTS = InfAssetsPackage.PROCEDURE_DATA_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__MRID = InfAssetsPackage.PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ALIAS_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__NAME = InfAssetsPackage.PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__MODELING_AUTHORITY_SET = InfAssetsPackage.PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__CHANGE_ITEMS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__TO_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ELECTRONIC_ADDRESS = InfAssetsPackage.PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__REVISION_NUMBER = InfAssetsPackage.PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__NETWORK_DATA_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__FROM_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__SCHEDULE_PARAMETER_INFOS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ERP_ORGANISATION_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__CREATED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__MEASUREMENTS = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__LAST_MODIFIED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ACTIVITY_RECORDS = InfAssetsPackage.PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__SUBJECT = InfAssetsPackage.PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__CHANGE_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ERP_PERSON_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__SCHEDULED_EVENTS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__TITLE = InfAssetsPackage.PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__DOC_STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ASSET_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__CATEGORY = InfAssetsPackage.PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__PROPERTIES = InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__TRANSFORMER_OBSERVATIONS = InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__PROCEDURE = InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__COMPLETED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__MEASUREMENT_VALUES = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>According To Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET__LOCATION_CONDITION = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inspection Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET_FEATURE_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inspection Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_DATA_SET_OPERATION_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail <em>Work Cost Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail()
	 * @generated
	 */
	public static final int WORK_COST_DETAIL = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__WORK_TASK = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__IS_DEBIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__DESIGN = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Misc Cost Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__MISC_COST_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Cost Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__WORK_COST_SUMMARY = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__TRANSACTION_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__PROPERTY_UNITS = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__LABOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Equipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__EQUIPMENT_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Overhead Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__OVERHEAD_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL__COST_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Work Cost Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Work Cost Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_DETAIL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit <em>Compatible Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit()
	 * @generated
	 */
	public static final int COMPATIBLE_UNIT = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__DESIGN_LOCATION_CUS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CU Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_GROUP = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CU Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_ASSETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__PROPERTY_UNIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__QUANTITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__COST_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Est Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__EST_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CU Allowable Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__PROCEDURES = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>CU Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>CU Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_MATERIAL_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>CU Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT__CU_LABOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Compatible Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Compatible Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPATIBLE_UNIT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostSummary <em>Work Cost Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostSummary
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostSummary()
	 * @generated
	 */
	public static final int WORK_COST_SUMMARY = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY__WORK_COST_DETAIL = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Cost Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Cost Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_COST_SUMMARY_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.NonStandardItem <em>Non Standard Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.NonStandardItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getNonStandardItem()
	 * @generated
	 */
	public static final int NON_STANDARD_ITEM = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Standard Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Standard Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_STANDARD_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion <em>Info Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion()
	 * @generated
	 */
	public static final int INFO_QUESTION = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ANSWER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answer Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ANSWER_REMARK = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__QUESTION_TEXT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Answer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__ANSWER_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Question Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__QUESTION_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Question Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__QUESTION_REMARK = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Question Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION__QUESTION_CATEGORY = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Info Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Info Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFO_QUESTION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Regulation <em>Regulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Regulation
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getRegulation()
	 * @generated
	 */
	public static final int REGULATION = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION__REFERENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem <em>Contractor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem()
	 * @generated
	 */
	public static final int CONTRACTOR_ITEM = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__BID_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Payables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__ERP_PAYABLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACTOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CUAllowableAction <em>CU Allowable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CUAllowableAction
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUAllowableAction()
	 * @generated
	 */
	public static final int CU_ALLOWABLE_ACTION = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CU Allowable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CU Allowable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_ALLOWABLE_ACTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode <em>CU Labor Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborCode()
	 * @generated
	 */
	public static final int CU_LABOR_CODE = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>CU Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__CU_LABOR_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CU Labor Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CU Labor Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_LABOR_CODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit <em>Access Permit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit()
	 * @generated
	 */
	public static final int ACCESS_PERMIT = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Application Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__APPLICATION_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__PAYMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__EFFECTIVE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__EXPIRATION_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Permit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT__PERMIT_ID = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Access Permit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Access Permit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_PERMIT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem <em>CU Work Equipment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem()
	 * @generated
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Equip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CU Work Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CU Work Equipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_WORK_EQUIPMENT_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU <em>Design Location CU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU()
	 * @generated
	 */
	public static final int DESIGN_LOCATION_CU = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Condition Factors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__CONDITION_FACTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energization Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__ENERGIZATION_FLAG = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__CU_USAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__REMOVAL_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cu Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__CU_ACTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cu Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__CU_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cu Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__CU_QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__DESIGNS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>CU Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__CU_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Design Location CU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Design Location CU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_LOCATION_CU_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet <em>Maintenance Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getMaintenanceDataSet()
	 * @generated
	 */
	public static final int MAINTENANCE_DATA_SET = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__UUID = InfAssetsPackage.PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__NAMES = InfAssetsPackage.PROCEDURE_DATA_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__DIAGRAM_OBJECTS = InfAssetsPackage.PROCEDURE_DATA_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__MRID = InfAssetsPackage.PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__ALIAS_NAME = InfAssetsPackage.PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__NAME = InfAssetsPackage.PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__MODELING_AUTHORITY_SET = InfAssetsPackage.PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__CHANGE_ITEMS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__TO_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__ELECTRONIC_ADDRESS = InfAssetsPackage.PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__REVISION_NUMBER = InfAssetsPackage.PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__NETWORK_DATA_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__FROM_DOCUMENT_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__SCHEDULE_PARAMETER_INFOS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__ERP_ORGANISATION_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__CREATED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__MEASUREMENTS = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__LAST_MODIFIED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__ACTIVITY_RECORDS = InfAssetsPackage.PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__SUBJECT = InfAssetsPackage.PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__CHANGE_SETS = InfAssetsPackage.PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__ERP_PERSON_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__SCHEDULED_EVENTS = InfAssetsPackage.PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__TITLE = InfAssetsPackage.PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__DOC_STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__ASSET_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__STATUS = InfAssetsPackage.PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = InfAssetsPackage.PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__CATEGORY = InfAssetsPackage.PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__PROPERTIES = InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__TRANSFORMER_OBSERVATIONS = InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__PROCEDURE = InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__COMPLETED_DATE_TIME = InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__MEASUREMENT_VALUES = InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Condition After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__CONDITION_AFTER = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__CONDITION_BEFORE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maint Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET__MAINT_CODE = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Maintenance Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET_FEATURE_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Maintenance Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_DATA_SET_OPERATION_COUNT = InfAssetsPackage.PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem <em>Misc Cost Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem()
	 * @generated
	 */
	public static final int MISC_COST_ITEM = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__COST_PER_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__EXTERNAL_REF_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Misc Cost Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Misc Cost Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MISC_COST_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem <em>Material Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem()
	 * @generated
	 */
	public static final int MATERIAL_ITEM = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__ERP_INVENTORY_COUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__COST_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__USAGES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__ERP_PO_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Material Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__MATERIAL_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__EXTERNAL_REF_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Work Cost Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__WORK_COST_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__ACTUAL_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Material Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern <em>Shift Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern()
	 * @generated
	 */
	public static final int SHIFT_PATTERN = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycle Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__CYCLE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__VALIDITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assignment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN__ASSIGNMENT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Shift Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Shift Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_PATTERN_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Capability <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Capability
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCapability()
	 * @generated
	 */
	public static final int CAPABILITY = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__CREW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Performance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__PERFORMANCE_FACTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__WORK_TASKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crafts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__CRAFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY__VALIDITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Usage <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Usage
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getUsage()
	 * @generated
	 */
	public static final int USAGE = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__WORK_EQUIPMENT_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Material Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE__MATERIAL_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest <em>One Call Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest()
	 * @generated
	 */
	public static final int ONE_CALL_REQUEST = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Work Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__WORK_LOCATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Marked Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__MARKED_INDICATOR = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Explosives Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__EXPLOSIVES_USED = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Marking Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST__MARKING_INSTRUCTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>One Call Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>One Call Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CALL_REQUEST_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.Assignment <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.Assignment
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getAssignment()
	 * @generated
	 */
	public static final int ASSIGNMENT = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__CREWS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT__EFFECTIVE_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem <em>CU Contractor Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUContractorItem()
	 * @generated
	 */
	public static final int CU_CONTRACTOR_ITEM = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Bid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__BID_AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__ACTIVITY_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CU Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CU Contractor Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_CONTRACTOR_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.CUGroup <em>CU Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup()
	 * @generated
	 */
	public static final int CU_GROUP = 45;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__COMPATIBLE_UNITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent CU Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__PARENT_CU_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child CU Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__CHILD_CU_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Design Location CUs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP__DESIGN_LOCATION_CUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CU Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>CU Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CU_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactorKind <em>Condition Factor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactorKind
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactorKind()
	 * @generated
	 */
	public static final int CONDITION_FACTOR_KIND = 46;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.WorkActionKind <em>Work Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkActionKind()
	 * @generated
	 */
	public static final int WORK_ACTION_KIND = 47;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfWork.DesignKind <em>Design Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfWork.DesignKind
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesignKind()
	 * @generated
	 */
	public static final int DESIGN_KIND = 48;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workStatusEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overheadCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosisDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualificationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuMaterialItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuLaborItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laborItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workFlowStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectionDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCostDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibleUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workCostSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonStandardItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractorItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuAllowableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuLaborCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPermitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuWorkEquipmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLocationCUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miscCostItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneCallRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuContractorItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionFactorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workActionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfWorkPackage() {
		super(eNS_URI, InfWorkFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfWorkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfWorkPackage init() {
		if (isInited) return (InfWorkPackage)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI);

		// Obtain or create and register package
		InfWorkPackage theInfWorkPackage = (InfWorkPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfWorkPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfWorkPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		CIM15Package theCIM15Package = (CIM15Package)(EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) instanceof CIM15Package ? EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) : CIM15Package.eINSTANCE);
		IEC61970Package theIEC61970Package = (IEC61970Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		SCADAPackage theSCADAPackage = (SCADAPackage)(EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) instanceof SCADAPackage ? EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) : SCADAPackage.eINSTANCE);
		ProductionPackage theProductionPackage = (ProductionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		GenerationDynamicsPackage theGenerationDynamicsPackage = (GenerationDynamicsPackage)(EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) instanceof GenerationDynamicsPackage ? EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) : GenerationDynamicsPackage.eINSTANCE);
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
		LoadControlPackage theLoadControlPackage = (LoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		IEC62325Package theIEC62325Package = (IEC62325Package)(EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) instanceof IEC62325Package ? EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) : IEC62325Package.eINSTANCE);
		PackageDependenciesPackage thePackageDependenciesPackage = (PackageDependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);

		// Load packages
		theCIM15Package.loadPackage();

		// Fix loaded packages
		theInfWorkPackage.fixPackageContents();
		theCIM15Package.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theProductionPackage.fixPackageContents();
		theGenerationDynamicsPackage.fixPackageContents();
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
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfWorkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfWorkPackage.eNS_URI, theInfWorkPackage);
		return theInfWorkPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem <em>Equipment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem
	 * @generated
	 */
	public EClass getEquipmentItem() {
		if (equipmentItemEClass == null) {
			equipmentItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(0);
		}
		return equipmentItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	public EReference getEquipmentItem_WorkTask() {
        return (EReference)getEquipmentItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getCode()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	public EAttribute getEquipmentItem_Code() {
        return (EAttribute)getEquipmentItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	public EReference getEquipmentItem_WorkCostDetail() {
        return (EReference)getEquipmentItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getCost()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	public EAttribute getEquipmentItem_Cost() {
        return (EAttribute)getEquipmentItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getStatus()
	 * @see #getEquipmentItem()
	 * @generated
	 */
	public EReference getEquipmentItem_Status() {
        return (EReference)getEquipmentItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment
	 * @generated
	 */
	public EClass getAppointment() {
		if (appointmentEClass == null) {
			appointmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(1);
		}
		return appointmentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Ahead</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#isCallAhead()
	 * @see #getAppointment()
	 * @generated
	 */
	public EAttribute getAppointment_CallAhead() {
        return (EAttribute)getAppointment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getAddress()
	 * @see #getAppointment()
	 * @generated
	 */
	public EReference getAppointment_Address() {
        return (EReference)getAppointment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getErpPersons()
	 * @see #getAppointment()
	 * @generated
	 */
	public EReference getAppointment_ErpPersons() {
        return (EReference)getAppointment().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getRemark()
	 * @see #getAppointment()
	 * @generated
	 */
	public EAttribute getAppointment_Remark() {
        return (EAttribute)getAppointment().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getMeetingInterval <em>Meeting Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meeting Interval</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getMeetingInterval()
	 * @see #getAppointment()
	 * @generated
	 */
	public EReference getAppointment_MeetingInterval() {
        return (EReference)getAppointment().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call Back</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getCallBack()
	 * @see #getAppointment()
	 * @generated
	 */
	public EReference getAppointment_CallBack() {
        return (EReference)getAppointment().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry <em>Work Status Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Status Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkStatusEntry
	 * @generated
	 */
	public EClass getWorkStatusEntry() {
		if (workStatusEntryEClass == null) {
			workStatusEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(2);
		}
		return workStatusEntryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Complete</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete()
	 * @see #getWorkStatusEntry()
	 * @generated
	 */
	public EAttribute getWorkStatusEntry_PercentComplete() {
        return (EAttribute)getWorkStatusEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Case</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase
	 * @generated
	 */
	public EClass getBusinessCase() {
		if (businessCaseEClass == null) {
			businessCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(3);
		}
		return businessCaseEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase#getProjects()
	 * @see #getBusinessCase()
	 * @generated
	 */
	public EReference getBusinessCase_Projects() {
        return (EReference)getBusinessCase().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase#getWorks()
	 * @see #getBusinessCase()
	 * @generated
	 */
	public EReference getBusinessCase_Works() {
        return (EReference)getBusinessCase().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode()
	 * @see #getBusinessCase()
	 * @generated
	 */
	public EAttribute getBusinessCase_CorporateCode() {
        return (EAttribute)getBusinessCase().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial
	 * @generated
	 */
	public EClass getTypeMaterial() {
		if (typeMaterialEClass == null) {
			typeMaterialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(4);
		}
		return typeMaterialEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#isStockItem()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EAttribute getTypeMaterial_StockItem() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories <em>Erp Issue Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Issue Inventories</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EReference getTypeMaterial_ErpIssueInventories() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCostType()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EAttribute getTypeMaterial_CostType() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EReference getTypeMaterial_MaterialItems() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EReference getTypeMaterial_CUMaterialItems() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Req Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EReference getTypeMaterial_ErpReqLineItems() {
        return (EReference)getTypeMaterial().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getQuantity()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EAttribute getTypeMaterial_Quantity() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Unit Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost()
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public EAttribute getTypeMaterial_EstUnitCost() {
        return (EAttribute)getTypeMaterial().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation
	 * @generated
	 */
	public EClass getDesignLocation() {
		if (designLocationEClass == null) {
			designLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(5);
		}
		return designLocationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getStatus()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_Status() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_MaterialItems() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesigns()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_Designs() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_DesignLocationCUs() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_WorkLocations() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagrams</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getDiagrams()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_Diagrams() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misc Cost Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_MiscCostItems() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Bom Item Datas</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_ErpBomItemDatas() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Length</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getSpanLength()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EAttribute getDesignLocation_SpanLength() {
        return (EAttribute)getDesignLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Factors</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors()
	 * @see #getDesignLocation()
	 * @generated
	 */
	public EReference getDesignLocation_ConditionFactors() {
        return (EReference)getDesignLocation().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost
	 * @generated
	 */
	public EClass getOverheadCost() {
		if (overheadCostEClass == null) {
			overheadCostEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(6);
		}
		return overheadCostEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getCode()
	 * @see #getOverheadCost()
	 * @generated
	 */
	public EAttribute getOverheadCost_Code() {
        return (EAttribute)getOverheadCost().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getCost()
	 * @see #getOverheadCost()
	 * @generated
	 */
	public EAttribute getOverheadCost_Cost() {
        return (EAttribute)getOverheadCost().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getStatus()
	 * @see #getOverheadCost()
	 * @generated
	 */
	public EReference getOverheadCost_Status() {
        return (EReference)getOverheadCost().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails()
	 * @see #getOverheadCost()
	 * @generated
	 */
	public EReference getOverheadCost_WorkCostDetails() {
        return (EReference)getOverheadCost().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks()
	 * @see #getOverheadCost()
	 * @generated
	 */
	public EReference getOverheadCost_WorkTasks() {
        return (EReference)getOverheadCost().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Crew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew
	 * @generated
	 */
	public EClass getCrew() {
		if (crewEClass == null) {
			crewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(7);
		}
		return crewEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getTools()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Tools() {
        return (EReference)getCrew().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Schedules</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_SwitchingSchedules() {
        return (EReference)getCrew().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getRoute()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Route() {
        return (EReference)getCrew().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getCapabilities()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Capabilities() {
        return (EReference)getCrew().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCrewMembers <em>Crew Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crew Members</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getCrewMembers()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_CrewMembers() {
        return (EReference)getCrew().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Steps</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getOutageSteps()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_OutageSteps() {
        return (EReference)getCrew().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets <em>Work Equipment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Equipment Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_WorkEquipmentAssets() {
        return (EReference)getCrew().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getAssignments()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Assignments() {
        return (EReference)getCrew().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getCategory()
	 * @see #getCrew()
	 * @generated
	 */
	public EAttribute getCrew_Category() {
        return (EAttribute)getCrew().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getLocations()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Locations() {
        return (EReference)getCrew().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getWorkTasks()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_WorkTasks() {
        return (EReference)getCrew().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getOrganisations()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Organisations() {
        return (EReference)getCrew().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getShiftPatterns <em>Shift Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shift Patterns</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getShiftPatterns()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_ShiftPatterns() {
        return (EReference)getCrew().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Crew#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getVehicles()
	 * @see #getCrew()
	 * @generated
	 */
	public EReference getCrew_Vehicles() {
        return (EReference)getCrew().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet <em>Diagnosis Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnosis Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet
	 * @generated
	 */
	public EClass getDiagnosisDataSet() {
		if (diagnosisDataSetEClass == null) {
			diagnosisDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(8);
		}
		return diagnosisDataSetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Cause</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalCause() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Remark</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalRemark() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PhaseCode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PreliminaryDateTime() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PreliminaryCode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Remark</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_RootRemark() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Cause</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_RootCause() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Remark</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_PreliminaryRemark() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_Effect() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Origin</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalOrigin() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FinalCode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Origin</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_RootOrigin() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Mode</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode()
	 * @see #getDiagnosisDataSet()
	 * @generated
	 */
	public EAttribute getDiagnosisDataSet_FailureMode() {
        return (EAttribute)getDiagnosisDataSet().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CUAsset <em>CU Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset
	 * @generated
	 */
	public EClass getCUAsset() {
		if (cuAssetEClass == null) {
			cuAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(9);
		}
		return cuAssetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits()
	 * @see #getCUAsset()
	 * @generated
	 */
	public EReference getCUAsset_CompatibleUnits() {
        return (EReference)getCUAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAsset()
	 * @see #getCUAsset()
	 * @generated
	 */
	public EReference getCUAsset_TypeAsset() {
        return (EReference)getCUAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getQuantity()
	 * @see #getCUAsset()
	 * @generated
	 */
	public EAttribute getCUAsset_Quantity() {
        return (EAttribute)getCUAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Asset Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode()
	 * @see #getCUAsset()
	 * @generated
	 */
	public EAttribute getCUAsset_TypeAssetCode() {
        return (EAttribute)getCUAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getStatus()
	 * @see #getCUAsset()
	 * @generated
	 */
	public EReference getCUAsset_Status() {
        return (EReference)getCUAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request
	 * @generated
	 */
	public EClass getRequest() {
		if (requestEClass == null) {
			requestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(10);
		}
		return requestEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem()
	 * @see #getRequest()
	 * @generated
	 */
	public EReference getRequest_ErpQuoteLineItem() {
        return (EReference)getRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Request#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getProjects()
	 * @see #getRequest()
	 * @generated
	 */
	public EReference getRequest_Projects() {
        return (EReference)getRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Request#getActionNeeded <em>Action Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Needed</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getActionNeeded()
	 * @see #getRequest()
	 * @generated
	 */
	public EAttribute getRequest_ActionNeeded() {
        return (EAttribute)getRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Request#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getPriority()
	 * @see #getRequest()
	 * @generated
	 */
	public EAttribute getRequest_Priority() {
        return (EAttribute)getRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Request#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getCorporateCode()
	 * @see #getRequest()
	 * @generated
	 */
	public EAttribute getRequest_CorporateCode() {
        return (EAttribute)getRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Request#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getOrganisation()
	 * @see #getRequest()
	 * @generated
	 */
	public EReference getRequest_Organisation() {
        return (EReference)getRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Request#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getWorks()
	 * @see #getRequest()
	 * @generated
	 */
	public EReference getRequest_Works() {
        return (EReference)getRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design
	 * @generated
	 */
	public EClass getDesign() {
		if (designEClass == null) {
			designEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(11);
		}
		return designEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Design#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getDesignLocations()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_DesignLocations() {
        return (EReference)getDesign().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Design#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getWorkCostDetails()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_WorkCostDetails() {
        return (EReference)getDesign().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Estimate</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getCostEstimate()
	 * @see #getDesign()
	 * @generated
	 */
	public EAttribute getDesign_CostEstimate() {
        return (EAttribute)getDesign().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Design#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Factors</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getConditionFactors()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_ConditionFactors() {
        return (EReference)getDesign().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Design#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getWorkTasks()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_WorkTasks() {
        return (EReference)getDesign().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Design#getErpBOMs <em>Erp BO Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp BO Ms</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getErpBOMs()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_ErpBOMs() {
        return (EReference)getDesign().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getKind()
	 * @see #getDesign()
	 * @generated
	 */
	public EAttribute getDesign_Kind() {
        return (EAttribute)getDesign().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getWork()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_Work() {
        return (EReference)getDesign().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs <em>Design Locations CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations CUs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_DesignLocationsCUs() {
        return (EReference)getDesign().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem()
	 * @see #getDesign()
	 * @generated
	 */
	public EReference getDesign_ErpQuoteLineItem() {
        return (EReference)getDesign().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getPrice()
	 * @see #getDesign()
	 * @generated
	 */
	public EAttribute getDesign_Price() {
        return (EAttribute)getDesign().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.WorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask
	 * @generated
	 */
	public EClass getWorkTask() {
		if (workTaskEClass == null) {
			workTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(12);
		}
		return workTaskEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getEquipmentItems <em>Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipment Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getEquipmentItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_EquipmentItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getUsages()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_Usages() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misc Cost Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_MiscCostItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getCrews()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_Crews() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getWork()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_Work() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overhead Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getOverheadCost()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_OverheadCost() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_DesignLocationCUs() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getContractorItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_ContractorItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Schedules</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_SwitchingSchedules() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Flow Step</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_WorkFlowStep() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getPriority()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EAttribute getWorkTask_Priority() {
        return (EAttribute)getWorkTask().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getDesign()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_Design() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification Requirements</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_QualificationRequirements() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getCapabilities()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_Capabilities() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_WorkCostDetails() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Override</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getSchedOverride()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EAttribute getWorkTask_SchedOverride() {
        return (EAttribute)getWorkTask().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getAssets()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_Assets() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getLaborItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_LaborItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getMaterialItems()
	 * @see #getWorkTask()
	 * @generated
	 */
	public EReference getWorkTask_MaterialItems() {
        return (EReference)getWorkTask().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor <em>Condition Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Factor</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor
	 * @generated
	 */
	public EClass getConditionFactor() {
		if (conditionFactorEClass == null) {
			conditionFactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(13);
		}
		return conditionFactorEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesigns()
	 * @see #getConditionFactor()
	 * @generated
	 */
	public EReference getConditionFactor_Designs() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations()
	 * @see #getConditionFactor()
	 * @generated
	 */
	public EReference getConditionFactor_DesignLocations() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getKind()
	 * @see #getConditionFactor()
	 * @generated
	 */
	public EAttribute getConditionFactor_Kind() {
        return (EAttribute)getConditionFactor().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getStatus()
	 * @see #getConditionFactor()
	 * @generated
	 */
	public EReference getConditionFactor_Status() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getCfValue <em>Cf Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cf Value</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getCfValue()
	 * @see #getConditionFactor()
	 * @generated
	 */
	public EAttribute getConditionFactor_CfValue() {
        return (EAttribute)getConditionFactor().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs()
	 * @see #getConditionFactor()
	 * @generated
	 */
	public EReference getConditionFactor_DesignLocationCUs() {
        return (EReference)getConditionFactor().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement <em>Qualification Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualification Requirement</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement
	 * @generated
	 */
	public EClass getQualificationRequirement() {
		if (qualificationRequirementEClass == null) {
			qualificationRequirementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(14);
		}
		return qualificationRequirementEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	public EReference getQualificationRequirement_WorkTasks() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSkills()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	public EReference getQualificationRequirement_Skills() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Labor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	public EReference getQualificationRequirement_CULaborItems() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	public EAttribute getQualificationRequirement_QualificationID() {
        return (EAttribute)getQualificationRequirement().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications()
	 * @see #getQualificationRequirement()
	 * @generated
	 */
	public EReference getQualificationRequirement_Specifications() {
        return (EReference)getQualificationRequirement().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation <em>Work Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation
	 * @generated
	 */
	public EClass getWorkLocation() {
		if (workLocationEClass == null) {
			workLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(15);
		}
		return workLocationEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One Call Request</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest()
	 * @see #getWorkLocation()
	 * @generated
	 */
	public EReference getWorkLocation_OneCallRequest() {
        return (EReference)getWorkLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subdivision</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getSubdivision()
	 * @see #getWorkLocation()
	 * @generated
	 */
	public EAttribute getWorkLocation_Subdivision() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nearest Intersection</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection()
	 * @see #getWorkLocation()
	 * @generated
	 */
	public EAttribute getWorkLocation_NearestIntersection() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getBlock()
	 * @see #getWorkLocation()
	 * @generated
	 */
	public EAttribute getWorkLocation_Block() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations()
	 * @see #getWorkLocation()
	 * @generated
	 */
	public EReference getWorkLocation_DesignLocations() {
        return (EReference)getWorkLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getLot()
	 * @see #getWorkLocation()
	 * @generated
	 */
	public EAttribute getWorkLocation_Lot() {
        return (EAttribute)getWorkLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType
	 * @generated
	 */
	public EClass getCostType() {
		if (costTypeEClass == null) {
			costTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(16);
		}
		return costTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getStage()
	 * @see #getCostType()
	 * @generated
	 */
	public EAttribute getCostType_Stage() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CostType#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getErpJournalEntries()
	 * @see #getCostType()
	 * @generated
	 */
	public EReference getCostType_ErpJournalEntries() {
        return (EReference)getCostType().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getParentCostType()
	 * @see #getCostType()
	 * @generated
	 */
	public EReference getCostType_ParentCostType() {
        return (EReference)getCostType().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getCode()
	 * @see #getCostType()
	 * @generated
	 */
	public EAttribute getCostType_Code() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CostType#getChildCostTypes <em>Child Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Cost Types</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getChildCostTypes()
	 * @see #getCostType()
	 * @generated
	 */
	public EReference getCostType_ChildCostTypes() {
        return (EReference)getCostType().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CostType#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getWorkCostDetails()
	 * @see #getCostType()
	 * @generated
	 */
	public EReference getCostType_WorkCostDetails() {
        return (EReference)getCostType().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CostType#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getCompatibleUnits()
	 * @see #getCostType()
	 * @generated
	 */
	public EReference getCostType_CompatibleUnits() {
        return (EReference)getCostType().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getLevel()
	 * @see #getCostType()
	 * @generated
	 */
	public EAttribute getCostType_Level() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CostType#isAmountAssignable <em>Amount Assignable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Assignable</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#isAmountAssignable()
	 * @see #getCostType()
	 * @generated
	 */
	public EAttribute getCostType_AmountAssignable() {
        return (EAttribute)getCostType().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CostType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getStatus()
	 * @see #getCostType()
	 * @generated
	 */
	public EReference getCostType_Status() {
        return (EReference)getCostType().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem <em>CU Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Material Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem
	 * @generated
	 */
	public EClass getCUMaterialItem() {
		if (cuMaterialItemEClass == null) {
			cuMaterialItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(17);
		}
		return cuMaterialItemEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getStatus()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	public EReference getCUMaterialItem_Status() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	public EReference getCUMaterialItem_PropertyUnits() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	public EReference getCUMaterialItem_CompatibleUnits() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	public EAttribute getCUMaterialItem_Quantity() {
        return (EAttribute)getCUMaterialItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	public EAttribute getCUMaterialItem_CorporateCode() {
        return (EAttribute)getCUMaterialItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial()
	 * @see #getCUMaterialItem()
	 * @generated
	 */
	public EReference getCUMaterialItem_TypeMaterial() {
        return (EReference)getCUMaterialItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Unit</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit
	 * @generated
	 */
	public EClass getPropertyUnit() {
		if (propertyUnitEClass == null) {
			propertyUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(18);
		}
		return propertyUnitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accounting Usage</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EAttribute getPropertyUnit_AccountingUsage() {
        return (EAttribute)getPropertyUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getStatus()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EReference getPropertyUnit_Status() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EAttribute getPropertyUnit_PropertyAccount() {
        return (EAttribute)getPropertyUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EReference getPropertyUnit_CompatibleUnits() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EAttribute getPropertyUnit_ActivityCode() {
        return (EAttribute)getPropertyUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EReference getPropertyUnit_CUMaterialItems() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails()
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public EReference getPropertyUnit_WorkCostDetails() {
        return (EReference)getPropertyUnit().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project
	 * @generated
	 */
	public EClass getProject() {
		if (projectEClass == null) {
			projectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(20);
		}
		return projectEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Case</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getBusinessCase()
	 * @see #getProject()
	 * @generated
	 */
	public EReference getProject_BusinessCase() {
        return (EReference)getProject().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getBudget()
	 * @see #getProject()
	 * @generated
	 */
	public EAttribute getProject_Budget() {
        return (EAttribute)getProject().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Project#getSubProjects <em>Sub Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Projects</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getSubProjects()
	 * @see #getProject()
	 * @generated
	 */
	public EReference getProject_SubProjects() {
        return (EReference)getProject().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Project Accounting</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getErpProjectAccounting()
	 * @see #getProject()
	 * @generated
	 */
	public EReference getProject_ErpProjectAccounting() {
        return (EReference)getProject().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Project#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requests</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getRequests()
	 * @see #getProject()
	 * @generated
	 */
	public EReference getProject_Requests() {
        return (EReference)getProject().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Project#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getWorks()
	 * @see #getProject()
	 * @generated
	 */
	public EReference getProject_Works() {
        return (EReference)getProject().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Project</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getParentProject()
	 * @see #getProject()
	 * @generated
	 */
	public EReference getProject_ParentProject() {
        return (EReference)getProject().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem <em>CU Labor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Labor Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem
	 * @generated
	 */
	public EClass getCULaborItem() {
		if (cuLaborItemEClass == null) {
			cuLaborItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(22);
		}
		return cuLaborItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Duration</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EAttribute getCULaborItem_LaborDuration() {
        return (EAttribute)getCULaborItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Rate</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborRate()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EAttribute getCULaborItem_LaborRate() {
        return (EAttribute)getCULaborItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getActivityCode()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EAttribute getCULaborItem_ActivityCode() {
        return (EAttribute)getCULaborItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EReference getCULaborItem_CompatibleUnits() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Labor Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EReference getCULaborItem_CULaborCode() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getStatus()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EReference getCULaborItem_Status() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification Requirements</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements()
	 * @see #getCULaborItem()
	 * @generated
	 */
	public EReference getCULaborItem_QualificationRequirements() {
        return (EReference)getCULaborItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.LaborItem <em>Labor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labor Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem
	 * @generated
	 */
	public EClass getLaborItem() {
		if (laborItemEClass == null) {
			laborItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(23);
		}
		return laborItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getCost()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EAttribute getLaborItem_Cost() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getErpPersons()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EReference getLaborItem_ErpPersons() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkTask()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EReference getLaborItem_WorkTask() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getLaborRate <em>Labor Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Rate</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getLaborRate()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EAttribute getLaborItem_LaborRate() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getStatus()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EReference getLaborItem_Status() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getLaborDuration <em>Labor Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labor Duration</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getLaborDuration()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EAttribute getLaborItem_LaborDuration() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getActivityCode()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EAttribute getLaborItem_ActivityCode() {
        return (EAttribute)getLaborItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail()
	 * @see #getLaborItem()
	 * @generated
	 */
	public EReference getLaborItem_WorkCostDetail() {
        return (EReference)getLaborItem().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep <em>Work Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow Step</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep
	 * @generated
	 */
	public EClass getWorkFlowStep() {
		if (workFlowStepEClass == null) {
			workFlowStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(24);
		}
		return workFlowStepEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	public EReference getWorkFlowStep_WorkTasks() {
        return (EReference)getWorkFlowStep().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	public EAttribute getWorkFlowStep_SequenceNumber() {
        return (EAttribute)getWorkFlowStep().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getStatus()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	public EReference getWorkFlowStep_Status() {
        return (EReference)getWorkFlowStep().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWork()
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	public EReference getWorkFlowStep_Work() {
        return (EReference)getWorkFlowStep().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet <em>Inspection Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InspectionDataSet
	 * @generated
	 */
	public EClass getInspectionDataSet() {
		if (inspectionDataSetEClass == null) {
			inspectionDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(25);
		}
		return inspectionDataSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>According To Schedules</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules()
	 * @see #getInspectionDataSet()
	 * @generated
	 */
	public EReference getInspectionDataSet_AccordingToSchedules() {
        return (EReference)getInspectionDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Condition</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition()
	 * @see #getInspectionDataSet()
	 * @generated
	 */
	public EAttribute getInspectionDataSet_LocationCondition() {
        return (EAttribute)getInspectionDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail
	 * @generated
	 */
	public EClass getWorkCostDetail() {
		if (workCostDetailEClass == null) {
			workCostDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(26);
		}
		return workCostDetailEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_WorkTask() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getType()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EAttribute getWorkCostDetail_Type() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Debit</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EAttribute getWorkCostDetail_IsDebit() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorks()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_Works() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getDesign()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_Design() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Misc Cost Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_MiscCostItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Summary</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_WorkCostSummary() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EAttribute getWorkCostDetail_TransactionDateTime() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_PropertyUnits() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Project Accounting</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_ErpProjectAccounting() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_LaborItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_MaterialItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getEquipmentItems <em>Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipment Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getEquipmentItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_EquipmentItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getAmount()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EAttribute getWorkCostDetail_Amount() {
        return (EAttribute)getWorkCostDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_ContractorItems() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overhead Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_OverheadCost() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getCostType()
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public EReference getWorkCostDetail_CostType() {
        return (EReference)getWorkCostDetail().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit <em>Compatible Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatible Unit</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit
	 * @generated
	 */
	public EClass getCompatibleUnit() {
		if (compatibleUnitEClass == null) {
			compatibleUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(27);
		}
		return compatibleUnitEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Work Equipment Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CUWorkEquipmentItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_DesignLocationCUs() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Group</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CUGroup() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets <em>CU Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CUAssets() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Unit</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_PropertyUnit() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EAttribute getCompatibleUnit_Quantity() {
        return (EAttribute)getCompatibleUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCostType()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CostType() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EAttribute getCompatibleUnit_EstCost() {
        return (EAttribute)getCompatibleUnit().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Allowable Action</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CUAllowableAction() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedures</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_Procedures() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUContractorItems <em>CU Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Contractor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUContractorItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CUContractorItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CUMaterialItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Labor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems()
	 * @see #getCompatibleUnit()
	 * @generated
	 */
	public EReference getCompatibleUnit_CULaborItems() {
        return (EReference)getCompatibleUnit().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.WorkCostSummary <em>Work Cost Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Cost Summary</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostSummary
	 * @generated
	 */
	public EClass getWorkCostSummary() {
		if (workCostSummaryEClass == null) {
			workCostSummaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(28);
		}
		return workCostSummaryEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail()
	 * @see #getWorkCostSummary()
	 * @generated
	 */
	public EReference getWorkCostSummary_WorkCostDetail() {
        return (EReference)getWorkCostSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.NonStandardItem <em>Non Standard Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Standard Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.NonStandardItem
	 * @generated
	 */
	public EClass getNonStandardItem() {
		if (nonStandardItemEClass == null) {
			nonStandardItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(29);
		}
		return nonStandardItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.NonStandardItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.NonStandardItem#getCode()
	 * @see #getNonStandardItem()
	 * @generated
	 */
	public EAttribute getNonStandardItem_Code() {
        return (EAttribute)getNonStandardItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.NonStandardItem#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.NonStandardItem#getAmount()
	 * @see #getNonStandardItem()
	 * @generated
	 */
	public EAttribute getNonStandardItem_Amount() {
        return (EAttribute)getNonStandardItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion <em>Info Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Question</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion
	 * @generated
	 */
	public EClass getInfoQuestion() {
		if (infoQuestionEClass == null) {
			infoQuestionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(30);
		}
		return infoQuestionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getAnswer()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_Answer() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getAnswerRemark <em>Answer Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Remark</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getAnswerRemark()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_AnswerRemark() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionText <em>Question Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Text</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionText()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionText() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getAnswerDateTime <em>Answer Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getAnswerDateTime()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_AnswerDateTime() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCode <em>Question Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCode()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionCode() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionRemark <em>Question Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Remark</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionRemark()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionRemark() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCategory <em>Question Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Category</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion#getQuestionCategory()
	 * @see #getInfoQuestion()
	 * @generated
	 */
	public EAttribute getInfoQuestion_QuestionCategory() {
        return (EAttribute)getInfoQuestion().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Regulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Regulation
	 * @generated
	 */
	public EClass getRegulation() {
		if (regulationEClass == null) {
			regulationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(31);
		}
		return regulationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Regulation#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Regulation#getReferenceNumber()
	 * @see #getRegulation()
	 * @generated
	 */
	public EAttribute getRegulation_ReferenceNumber() {
        return (EAttribute)getRegulation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem <em>Contractor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contractor Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem
	 * @generated
	 */
	public EClass getContractorItem() {
		if (contractorItemEClass == null) {
			contractorItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(32);
		}
		return contractorItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkTask()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EReference getContractorItem_WorkTask() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bid Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getBidAmount()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EAttribute getContractorItem_BidAmount() {
        return (EAttribute)getContractorItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getErpPayables <em>Erp Payables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payables</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getErpPayables()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EReference getContractorItem_ErpPayables() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getStatus()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EReference getContractorItem_Status() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getActivityCode()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EAttribute getContractorItem_ActivityCode() {
        return (EAttribute)getContractorItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getCost()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EAttribute getContractorItem_Cost() {
        return (EAttribute)getContractorItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail()
	 * @see #getContractorItem()
	 * @generated
	 */
	public EReference getContractorItem_WorkCostDetail() {
        return (EReference)getContractorItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CUAllowableAction <em>CU Allowable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Allowable Action</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAllowableAction
	 * @generated
	 */
	public EClass getCUAllowableAction() {
		if (cuAllowableActionEClass == null) {
			cuAllowableActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(33);
		}
		return cuAllowableActionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits()
	 * @see #getCUAllowableAction()
	 * @generated
	 */
	public EReference getCUAllowableAction_CompatibleUnits() {
        return (EReference)getCUAllowableAction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CUAllowableAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAllowableAction#getStatus()
	 * @see #getCUAllowableAction()
	 * @generated
	 */
	public EReference getCUAllowableAction_Status() {
        return (EReference)getCUAllowableAction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode <em>CU Labor Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Labor Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode
	 * @generated
	 */
	public EClass getCULaborCode() {
		if (cuLaborCodeEClass == null) {
			cuLaborCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(34);
		}
		return cuLaborCodeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Labor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems()
	 * @see #getCULaborCode()
	 * @generated
	 */
	public EReference getCULaborCode_CULaborItems() {
        return (EReference)getCULaborCode().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode#getCode()
	 * @see #getCULaborCode()
	 * @generated
	 */
	public EAttribute getCULaborCode_Code() {
        return (EAttribute)getCULaborCode().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode#getStatus()
	 * @see #getCULaborCode()
	 * @generated
	 */
	public EReference getCULaborCode_Status() {
        return (EReference)getCULaborCode().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit <em>Access Permit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Permit</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit
	 * @generated
	 */
	public EClass getAccessPermit() {
		if (accessPermitEClass == null) {
			accessPermitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(35);
		}
		return accessPermitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber()
	 * @see #getAccessPermit()
	 * @generated
	 */
	public EAttribute getAccessPermit_ApplicationNumber() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit#getPayment()
	 * @see #getAccessPermit()
	 * @generated
	 */
	public EAttribute getAccessPermit_Payment() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate()
	 * @see #getAccessPermit()
	 * @generated
	 */
	public EAttribute getAccessPermit_EffectiveDate() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate()
	 * @see #getAccessPermit()
	 * @generated
	 */
	public EAttribute getAccessPermit_ExpirationDate() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permit ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit#getPermitID()
	 * @see #getAccessPermit()
	 * @generated
	 */
	public EAttribute getAccessPermit_PermitID() {
        return (EAttribute)getAccessPermit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem <em>CU Work Equipment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Work Equipment Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem
	 * @generated
	 */
	public EClass getCUWorkEquipmentItem() {
		if (cuWorkEquipmentItemEClass == null) {
			cuWorkEquipmentItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(36);
		}
		return cuWorkEquipmentItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	public EReference getCUWorkEquipmentItem_TypeAsset() {
        return (EReference)getCUWorkEquipmentItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	public EReference getCUWorkEquipmentItem_Status() {
        return (EReference)getCUWorkEquipmentItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	public EAttribute getCUWorkEquipmentItem_Rate() {
        return (EAttribute)getCUWorkEquipmentItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	public EReference getCUWorkEquipmentItem_CompatibleUnits() {
        return (EReference)getCUWorkEquipmentItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equip Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode()
	 * @see #getCUWorkEquipmentItem()
	 * @generated
	 */
	public EAttribute getCUWorkEquipmentItem_EquipCode() {
        return (EAttribute)getCUWorkEquipmentItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU <em>Design Location CU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Location CU</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU
	 * @generated
	 */
	public EClass getDesignLocationCU() {
		if (designLocationCUEClass == null) {
			designLocationCUEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(37);
		}
		return designLocationCUEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors <em>Condition Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Factors</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_ConditionFactors() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energization Flag</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EAttribute getDesignLocationCU_EnergizationFlag() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Usage</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuUsage() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_CompatibleUnits() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EAttribute getDesignLocationCU_RemovalDate() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_WorkTasks() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Action</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuAction() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuAccount() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cu Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EAttribute getDesignLocationCU_CuQuantity() {
        return (EAttribute)getDesignLocationCU().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_Designs() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups <em>CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CU Groups</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_CUGroups() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_DesignLocation() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getStatus()
	 * @see #getDesignLocationCU()
	 * @generated
	 */
	public EReference getDesignLocationCU_Status() {
        return (EReference)getDesignLocationCU().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet <em>Maintenance Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet
	 * @generated
	 */
	public EClass getMaintenanceDataSet() {
		if (maintenanceDataSetEClass == null) {
			maintenanceDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(38);
		}
		return maintenanceDataSetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition After</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter()
	 * @see #getMaintenanceDataSet()
	 * @generated
	 */
	public EAttribute getMaintenanceDataSet_ConditionAfter() {
        return (EAttribute)getMaintenanceDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Before</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore()
	 * @see #getMaintenanceDataSet()
	 * @generated
	 */
	public EAttribute getMaintenanceDataSet_ConditionBefore() {
        return (EAttribute)getMaintenanceDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode()
	 * @see #getMaintenanceDataSet()
	 * @generated
	 */
	public EAttribute getMaintenanceDataSet_MaintCode() {
        return (EAttribute)getMaintenanceDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem <em>Misc Cost Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Misc Cost Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem
	 * @generated
	 */
	public EClass getMiscCostItem() {
		if (miscCostItemEClass == null) {
			miscCostItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(39);
		}
		return miscCostItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EReference getMiscCostItem_DesignLocation() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getQuantity()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EAttribute getMiscCostItem_Quantity() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getStatus()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EReference getMiscCostItem_Status() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Unit</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EAttribute getMiscCostItem_CostPerUnit() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ref ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EAttribute getMiscCostItem_ExternalRefID() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getAccount()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EAttribute getMiscCostItem_Account() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostType()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EAttribute getMiscCostItem_CostType() {
        return (EAttribute)getMiscCostItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EReference getMiscCostItem_WorkTask() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail()
	 * @see #getMiscCostItem()
	 * @generated
	 */
	public EReference getMiscCostItem_WorkCostDetail() {
        return (EReference)getMiscCostItem().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem
	 * @generated
	 */
	public EClass getMaterialItem() {
		if (materialItemEClass == null) {
			materialItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(40);
		}
		return materialItemEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Inventory Counts</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_ErpInventoryCounts() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Description</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostDescription()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_CostDescription() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getUsages()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_Usages() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp PO Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_ErpPOLineItems() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getQuantity()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_Quantity() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Delv Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_ErpRecDelvLineItems() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_DesignLocation() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getStatus()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_Status() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_MaterialCode() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ref ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_ExternalRefID() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostType()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_CostType() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_TypeMaterial() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Cost Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_WorkCostDetail() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getAccount()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_Account() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getActualCost()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EAttribute getMaterialItem_ActualCost() {
        return (EAttribute)getMaterialItem().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkTask()
	 * @see #getMaterialItem()
	 * @generated
	 */
	public EReference getMaterialItem_WorkTask() {
        return (EReference)getMaterialItem().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern <em>Shift Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Pattern</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern
	 * @generated
	 */
	public EClass getShiftPattern() {
		if (shiftPatternEClass == null) {
			shiftPatternEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(41);
		}
		return shiftPatternEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCrews()
	 * @see #getShiftPattern()
	 * @generated
	 */
	public EReference getShiftPattern_Crews() {
        return (EReference)getShiftPattern().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern#getStatus()
	 * @see #getShiftPattern()
	 * @generated
	 */
	public EReference getShiftPattern_Status() {
        return (EReference)getShiftPattern().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount()
	 * @see #getShiftPattern()
	 * @generated
	 */
	public EAttribute getShiftPattern_CycleCount() {
        return (EAttribute)getShiftPattern().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Interval</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval()
	 * @see #getShiftPattern()
	 * @generated
	 */
	public EReference getShiftPattern_ValidityInterval() {
        return (EReference)getShiftPattern().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType()
	 * @see #getShiftPattern()
	 * @generated
	 */
	public EAttribute getShiftPattern_AssignmentType() {
        return (EAttribute)getShiftPattern().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability
	 * @generated
	 */
	public EClass getCapability() {
		if (capabilityEClass == null) {
			capabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(43);
		}
		return capabilityEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getCrew()
	 * @see #getCapability()
	 * @generated
	 */
	public EReference getCapability_Crew() {
        return (EReference)getCapability().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getCategory()
	 * @see #getCapability()
	 * @generated
	 */
	public EAttribute getCapability_Category() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Factor</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getPerformanceFactor()
	 * @see #getCapability()
	 * @generated
	 */
	public EAttribute getCapability_PerformanceFactor() {
        return (EAttribute)getCapability().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Capability#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Tasks</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getWorkTasks()
	 * @see #getCapability()
	 * @generated
	 */
	public EReference getCapability_WorkTasks() {
        return (EReference)getCapability().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.Capability#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getStatus()
	 * @see #getCapability()
	 * @generated
	 */
	public EReference getCapability_Status() {
        return (EReference)getCapability().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crafts</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getCrafts()
	 * @see #getCapability()
	 * @generated
	 */
	public EReference getCapability_Crafts() {
        return (EReference)getCapability().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.Capability#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Interval</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getValidityInterval()
	 * @see #getCapability()
	 * @generated
	 */
	public EReference getCapability_ValidityInterval() {
        return (EReference)getCapability().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage
	 * @generated
	 */
	public EClass getUsage() {
		if (usageEClass == null) {
			usageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(44);
		}
		return usageEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getWorkTask()
	 * @see #getUsage()
	 * @generated
	 */
	public EReference getUsage_WorkTask() {
        return (EReference)getUsage().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Equipment Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset()
	 * @see #getUsage()
	 * @generated
	 */
	public EReference getUsage_WorkEquipmentAsset() {
        return (EReference)getUsage().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.Usage#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getStatus()
	 * @see #getUsage()
	 * @generated
	 */
	public EReference getUsage_Status() {
        return (EReference)getUsage().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getMaterialItem()
	 * @see #getUsage()
	 * @generated
	 */
	public EReference getUsage_MaterialItem() {
        return (EReference)getUsage().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest <em>One Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Call Request</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest
	 * @generated
	 */
	public EClass getOneCallRequest() {
		if (oneCallRequestEClass == null) {
			oneCallRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(45);
		}
		return oneCallRequestEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	public EReference getOneCallRequest_WorkLocations() {
        return (EReference)getOneCallRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marked Indicator</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	public EAttribute getOneCallRequest_MarkedIndicator() {
        return (EAttribute)getOneCallRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explosives Used</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	public EAttribute getOneCallRequest_ExplosivesUsed() {
        return (EAttribute)getOneCallRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marking Instruction</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction()
	 * @see #getOneCallRequest()
	 * @generated
	 */
	public EAttribute getOneCallRequest_MarkingInstruction() {
        return (EAttribute)getOneCallRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Assignment
	 * @generated
	 */
	public EClass getAssignment() {
		if (assignmentEClass == null) {
			assignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(46);
		}
		return assignmentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.Assignment#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Assignment#getCrews()
	 * @see #getAssignment()
	 * @generated
	 */
	public EReference getAssignment_Crews() {
        return (EReference)getAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.Assignment#getEffectivePeriod <em>Effective Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effective Period</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.Assignment#getEffectivePeriod()
	 * @see #getAssignment()
	 * @generated
	 */
	public EReference getAssignment_EffectivePeriod() {
        return (EReference)getAssignment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem <em>CU Contractor Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Contractor Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem
	 * @generated
	 */
	public EClass getCUContractorItem() {
		if (cuContractorItemEClass == null) {
			cuContractorItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(47);
		}
		return cuContractorItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem#getBidAmount <em>Bid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bid Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem#getBidAmount()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	public EAttribute getCUContractorItem_BidAmount() {
        return (EAttribute)getCUContractorItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	public EReference getCUContractorItem_CompatibleUnits() {
        return (EReference)getCUContractorItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem#getActivityCode <em>Activity Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem#getActivityCode()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	public EAttribute getCUContractorItem_ActivityCode() {
        return (EAttribute)getCUContractorItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem#getStatus()
	 * @see #getCUContractorItem()
	 * @generated
	 */
	public EReference getCUContractorItem_Status() {
        return (EReference)getCUContractorItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfWork.CUGroup <em>CU Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CU Group</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup
	 * @generated
	 */
	public EClass getCUGroup() {
		if (cuGroupEClass == null) {
			cuGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(48);
		}
		return cuGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits()
	 * @see #getCUGroup()
	 * @generated
	 */
	public EReference getCUGroup_CompatibleUnits() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups <em>Parent CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent CU Groups</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups()
	 * @see #getCUGroup()
	 * @generated
	 */
	public EReference getCUGroup_ParentCUGroups() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups <em>Child CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child CU Groups</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups()
	 * @see #getCUGroup()
	 * @generated
	 */
	public EReference getCUGroup_ChildCUGroups() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getStatus()
	 * @see #getCUGroup()
	 * @generated
	 */
	public EReference getCUGroup_Status() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Location CUs</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs()
	 * @see #getCUGroup()
	 * @generated
	 */
	public EReference getCUGroup_DesignLocationCUs() {
        return (EReference)getCUGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactorKind <em>Condition Factor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Factor Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactorKind
	 * @generated
	 */
	public EEnum getConditionFactorKind() {
		if (conditionFactorKindEEnum == null) {
			conditionFactorKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(19);
		}
		return conditionFactorKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfWork.WorkActionKind <em>Work Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Action Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
	 * @generated
	 */
	public EEnum getWorkActionKind() {
		if (workActionKindEEnum == null) {
			workActionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(21);
		}
		return workActionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfWork.DesignKind <em>Design Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Design Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignKind
	 * @generated
	 */
	public EEnum getDesignKind() {
		if (designKindEEnum == null) {
			designKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI).getEClassifiers().get(42);
		}
		return designKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfWorkFactory getInfWorkFactory() {
		return (InfWorkFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfWork." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem <em>Equipment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getEquipmentItem()
		 * @generated
		 */
		public static final EClass EQUIPMENT_ITEM = eINSTANCE.getEquipmentItem();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT_ITEM__WORK_TASK = eINSTANCE.getEquipmentItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EQUIPMENT_ITEM__CODE = eINSTANCE.getEquipmentItem_Code();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT_ITEM__WORK_COST_DETAIL = eINSTANCE.getEquipmentItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EQUIPMENT_ITEM__COST = eINSTANCE.getEquipmentItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT_ITEM__STATUS = eINSTANCE.getEquipmentItem_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Appointment <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Appointment
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getAppointment()
		 * @generated
		 */
		public static final EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Call Ahead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPOINTMENT__CALL_AHEAD = eINSTANCE.getAppointment_CallAhead();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPOINTMENT__ADDRESS = eINSTANCE.getAppointment_Address();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPOINTMENT__ERP_PERSONS = eINSTANCE.getAppointment_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPOINTMENT__REMARK = eINSTANCE.getAppointment_Remark();

		/**
		 * The meta object literal for the '<em><b>Meeting Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPOINTMENT__MEETING_INTERVAL = eINSTANCE.getAppointment_MeetingInterval();

		/**
		 * The meta object literal for the '<em><b>Call Back</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPOINTMENT__CALL_BACK = eINSTANCE.getAppointment_CallBack();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry <em>Work Status Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkStatusEntry
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkStatusEntry()
		 * @generated
		 */
		public static final EClass WORK_STATUS_ENTRY = eINSTANCE.getWorkStatusEntry();

		/**
		 * The meta object literal for the '<em><b>Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_STATUS_ENTRY__PERCENT_COMPLETE = eINSTANCE.getWorkStatusEntry_PercentComplete();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase <em>Business Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getBusinessCase()
		 * @generated
		 */
		public static final EClass BUSINESS_CASE = eINSTANCE.getBusinessCase();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BUSINESS_CASE__PROJECTS = eINSTANCE.getBusinessCase_Projects();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BUSINESS_CASE__WORKS = eINSTANCE.getBusinessCase_Works();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BUSINESS_CASE__CORPORATE_CODE = eINSTANCE.getBusinessCase_CorporateCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial <em>Type Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getTypeMaterial()
		 * @generated
		 */
		public static final EClass TYPE_MATERIAL = eINSTANCE.getTypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Stock Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TYPE_MATERIAL__STOCK_ITEM = eINSTANCE.getTypeMaterial_StockItem();

		/**
		 * The meta object literal for the '<em><b>Erp Issue Inventories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPE_MATERIAL__ERP_ISSUE_INVENTORIES = eINSTANCE.getTypeMaterial_ErpIssueInventories();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TYPE_MATERIAL__COST_TYPE = eINSTANCE.getTypeMaterial_CostType();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPE_MATERIAL__MATERIAL_ITEMS = eINSTANCE.getTypeMaterial_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>CU Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPE_MATERIAL__CU_MATERIAL_ITEMS = eINSTANCE.getTypeMaterial_CUMaterialItems();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPE_MATERIAL__ERP_REQ_LINE_ITEMS = eINSTANCE.getTypeMaterial_ErpReqLineItems();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TYPE_MATERIAL__QUANTITY = eINSTANCE.getTypeMaterial_Quantity();

		/**
		 * The meta object literal for the '<em><b>Est Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TYPE_MATERIAL__EST_UNIT_COST = eINSTANCE.getTypeMaterial_EstUnitCost();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation <em>Design Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocation()
		 * @generated
		 */
		public static final EClass DESIGN_LOCATION = eINSTANCE.getDesignLocation();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__STATUS = eINSTANCE.getDesignLocation_Status();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__MATERIAL_ITEMS = eINSTANCE.getDesignLocation_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Designs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__DESIGNS = eINSTANCE.getDesignLocation_Designs();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__DESIGN_LOCATION_CUS = eINSTANCE.getDesignLocation_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Work Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__WORK_LOCATIONS = eINSTANCE.getDesignLocation_WorkLocations();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__DIAGRAMS = eINSTANCE.getDesignLocation_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Misc Cost Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__MISC_COST_ITEMS = eINSTANCE.getDesignLocation_MiscCostItems();

		/**
		 * The meta object literal for the '<em><b>Erp Bom Item Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__ERP_BOM_ITEM_DATAS = eINSTANCE.getDesignLocation_ErpBomItemDatas();

		/**
		 * The meta object literal for the '<em><b>Span Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION__SPAN_LENGTH = eINSTANCE.getDesignLocation_SpanLength();

		/**
		 * The meta object literal for the '<em><b>Condition Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION__CONDITION_FACTORS = eINSTANCE.getDesignLocation_ConditionFactors();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost <em>Overhead Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getOverheadCost()
		 * @generated
		 */
		public static final EClass OVERHEAD_COST = eINSTANCE.getOverheadCost();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OVERHEAD_COST__CODE = eINSTANCE.getOverheadCost_Code();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OVERHEAD_COST__COST = eINSTANCE.getOverheadCost_Cost();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OVERHEAD_COST__STATUS = eINSTANCE.getOverheadCost_Status();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OVERHEAD_COST__WORK_COST_DETAILS = eINSTANCE.getOverheadCost_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OVERHEAD_COST__WORK_TASKS = eINSTANCE.getOverheadCost_WorkTasks();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Crew <em>Crew</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Crew
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCrew()
		 * @generated
		 */
		public static final EClass CREW = eINSTANCE.getCrew();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__TOOLS = eINSTANCE.getCrew_Tools();

		/**
		 * The meta object literal for the '<em><b>Switching Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__SWITCHING_SCHEDULES = eINSTANCE.getCrew_SwitchingSchedules();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__ROUTE = eINSTANCE.getCrew_Route();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__CAPABILITIES = eINSTANCE.getCrew_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Crew Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__CREW_MEMBERS = eINSTANCE.getCrew_CrewMembers();

		/**
		 * The meta object literal for the '<em><b>Outage Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__OUTAGE_STEPS = eINSTANCE.getCrew_OutageSteps();

		/**
		 * The meta object literal for the '<em><b>Work Equipment Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__WORK_EQUIPMENT_ASSETS = eINSTANCE.getCrew_WorkEquipmentAssets();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__ASSIGNMENTS = eINSTANCE.getCrew_Assignments();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREW__CATEGORY = eINSTANCE.getCrew_Category();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__LOCATIONS = eINSTANCE.getCrew_Locations();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__WORK_TASKS = eINSTANCE.getCrew_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__ORGANISATIONS = eINSTANCE.getCrew_Organisations();

		/**
		 * The meta object literal for the '<em><b>Shift Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__SHIFT_PATTERNS = eINSTANCE.getCrew_ShiftPatterns();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CREW__VEHICLES = eINSTANCE.getCrew_Vehicles();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet <em>Diagnosis Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDiagnosisDataSet()
		 * @generated
		 */
		public static final EClass DIAGNOSIS_DATA_SET = eINSTANCE.getDiagnosisDataSet();

		/**
		 * The meta object literal for the '<em><b>Final Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__FINAL_CAUSE = eINSTANCE.getDiagnosisDataSet_FinalCause();

		/**
		 * The meta object literal for the '<em><b>Final Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__FINAL_REMARK = eINSTANCE.getDiagnosisDataSet_FinalRemark();

		/**
		 * The meta object literal for the '<em><b>Phase Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__PHASE_CODE = eINSTANCE.getDiagnosisDataSet_PhaseCode();

		/**
		 * The meta object literal for the '<em><b>Preliminary Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME = eINSTANCE.getDiagnosisDataSet_PreliminaryDateTime();

		/**
		 * The meta object literal for the '<em><b>Preliminary Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__PRELIMINARY_CODE = eINSTANCE.getDiagnosisDataSet_PreliminaryCode();

		/**
		 * The meta object literal for the '<em><b>Root Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__ROOT_REMARK = eINSTANCE.getDiagnosisDataSet_RootRemark();

		/**
		 * The meta object literal for the '<em><b>Root Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__ROOT_CAUSE = eINSTANCE.getDiagnosisDataSet_RootCause();

		/**
		 * The meta object literal for the '<em><b>Preliminary Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK = eINSTANCE.getDiagnosisDataSet_PreliminaryRemark();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__EFFECT = eINSTANCE.getDiagnosisDataSet_Effect();

		/**
		 * The meta object literal for the '<em><b>Final Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__FINAL_ORIGIN = eINSTANCE.getDiagnosisDataSet_FinalOrigin();

		/**
		 * The meta object literal for the '<em><b>Final Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__FINAL_CODE = eINSTANCE.getDiagnosisDataSet_FinalCode();

		/**
		 * The meta object literal for the '<em><b>Root Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__ROOT_ORIGIN = eINSTANCE.getDiagnosisDataSet_RootOrigin();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGNOSIS_DATA_SET__FAILURE_MODE = eINSTANCE.getDiagnosisDataSet_FailureMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset <em>CU Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CUAsset
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUAsset()
		 * @generated
		 */
		public static final EClass CU_ASSET = eINSTANCE.getCUAsset();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_ASSET__COMPATIBLE_UNITS = eINSTANCE.getCUAsset_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_ASSET__TYPE_ASSET = eINSTANCE.getCUAsset_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_ASSET__QUANTITY = eINSTANCE.getCUAsset_Quantity();

		/**
		 * The meta object literal for the '<em><b>Type Asset Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_ASSET__TYPE_ASSET_CODE = eINSTANCE.getCUAsset_TypeAssetCode();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_ASSET__STATUS = eINSTANCE.getCUAsset_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Request <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Request
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getRequest()
		 * @generated
		 */
		public static final EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUEST__ERP_QUOTE_LINE_ITEM = eINSTANCE.getRequest_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUEST__PROJECTS = eINSTANCE.getRequest_Projects();

		/**
		 * The meta object literal for the '<em><b>Action Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUEST__ACTION_NEEDED = eINSTANCE.getRequest_ActionNeeded();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUEST__PRIORITY = eINSTANCE.getRequest_Priority();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REQUEST__CORPORATE_CODE = eINSTANCE.getRequest_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUEST__ORGANISATION = eINSTANCE.getRequest_Organisation();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REQUEST__WORKS = eINSTANCE.getRequest_Works();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Design <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Design
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesign()
		 * @generated
		 */
		public static final EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__DESIGN_LOCATIONS = eINSTANCE.getDesign_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__WORK_COST_DETAILS = eINSTANCE.getDesign_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Cost Estimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN__COST_ESTIMATE = eINSTANCE.getDesign_CostEstimate();

		/**
		 * The meta object literal for the '<em><b>Condition Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__CONDITION_FACTORS = eINSTANCE.getDesign_ConditionFactors();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__WORK_TASKS = eINSTANCE.getDesign_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Erp BO Ms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__ERP_BO_MS = eINSTANCE.getDesign_ErpBOMs();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN__KIND = eINSTANCE.getDesign_Kind();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__WORK = eINSTANCE.getDesign_Work();

		/**
		 * The meta object literal for the '<em><b>Design Locations CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__DESIGN_LOCATIONS_CUS = eINSTANCE.getDesign_DesignLocationsCUs();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN__ERP_QUOTE_LINE_ITEM = eINSTANCE.getDesign_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN__PRICE = eINSTANCE.getDesign_Price();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask <em>Work Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkTask
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkTask()
		 * @generated
		 */
		public static final EClass WORK_TASK = eINSTANCE.getWorkTask();

		/**
		 * The meta object literal for the '<em><b>Equipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__EQUIPMENT_ITEMS = eINSTANCE.getWorkTask_EquipmentItems();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__USAGES = eINSTANCE.getWorkTask_Usages();

		/**
		 * The meta object literal for the '<em><b>Misc Cost Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__MISC_COST_ITEMS = eINSTANCE.getWorkTask_MiscCostItems();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__CREWS = eINSTANCE.getWorkTask_Crews();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__WORK = eINSTANCE.getWorkTask_Work();

		/**
		 * The meta object literal for the '<em><b>Overhead Cost</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__OVERHEAD_COST = eINSTANCE.getWorkTask_OverheadCost();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__DESIGN_LOCATION_CUS = eINSTANCE.getWorkTask_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__CONTRACTOR_ITEMS = eINSTANCE.getWorkTask_ContractorItems();

		/**
		 * The meta object literal for the '<em><b>Switching Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__SWITCHING_SCHEDULES = eINSTANCE.getWorkTask_SwitchingSchedules();

		/**
		 * The meta object literal for the '<em><b>Work Flow Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__WORK_FLOW_STEP = eINSTANCE.getWorkTask_WorkFlowStep();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_TASK__PRIORITY = eINSTANCE.getWorkTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__DESIGN = eINSTANCE.getWorkTask_Design();

		/**
		 * The meta object literal for the '<em><b>Qualification Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__QUALIFICATION_REQUIREMENTS = eINSTANCE.getWorkTask_QualificationRequirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__CAPABILITIES = eINSTANCE.getWorkTask_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__WORK_COST_DETAILS = eINSTANCE.getWorkTask_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Sched Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_TASK__SCHED_OVERRIDE = eINSTANCE.getWorkTask_SchedOverride();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__ASSETS = eINSTANCE.getWorkTask_Assets();

		/**
		 * The meta object literal for the '<em><b>Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__LABOR_ITEMS = eINSTANCE.getWorkTask_LaborItems();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_TASK__MATERIAL_ITEMS = eINSTANCE.getWorkTask_MaterialItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor <em>Condition Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactor()
		 * @generated
		 */
		public static final EClass CONDITION_FACTOR = eINSTANCE.getConditionFactor();

		/**
		 * The meta object literal for the '<em><b>Designs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDITION_FACTOR__DESIGNS = eINSTANCE.getConditionFactor_Designs();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDITION_FACTOR__DESIGN_LOCATIONS = eINSTANCE.getConditionFactor_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDITION_FACTOR__KIND = eINSTANCE.getConditionFactor_Kind();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDITION_FACTOR__STATUS = eINSTANCE.getConditionFactor_Status();

		/**
		 * The meta object literal for the '<em><b>Cf Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDITION_FACTOR__CF_VALUE = eINSTANCE.getConditionFactor_CfValue();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDITION_FACTOR__DESIGN_LOCATION_CUS = eINSTANCE.getConditionFactor_DesignLocationCUs();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement <em>Qualification Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getQualificationRequirement()
		 * @generated
		 */
		public static final EClass QUALIFICATION_REQUIREMENT = eINSTANCE.getQualificationRequirement();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference QUALIFICATION_REQUIREMENT__WORK_TASKS = eINSTANCE.getQualificationRequirement_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference QUALIFICATION_REQUIREMENT__SKILLS = eINSTANCE.getQualificationRequirement_Skills();

		/**
		 * The meta object literal for the '<em><b>CU Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS = eINSTANCE.getQualificationRequirement_CULaborItems();

		/**
		 * The meta object literal for the '<em><b>Qualification ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALIFICATION_REQUIREMENT__QUALIFICATION_ID = eINSTANCE.getQualificationRequirement_QualificationID();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference QUALIFICATION_REQUIREMENT__SPECIFICATIONS = eINSTANCE.getQualificationRequirement_Specifications();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation <em>Work Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkLocation()
		 * @generated
		 */
		public static final EClass WORK_LOCATION = eINSTANCE.getWorkLocation();

		/**
		 * The meta object literal for the '<em><b>One Call Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_LOCATION__ONE_CALL_REQUEST = eINSTANCE.getWorkLocation_OneCallRequest();

		/**
		 * The meta object literal for the '<em><b>Subdivision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_LOCATION__SUBDIVISION = eINSTANCE.getWorkLocation_Subdivision();

		/**
		 * The meta object literal for the '<em><b>Nearest Intersection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_LOCATION__NEAREST_INTERSECTION = eINSTANCE.getWorkLocation_NearestIntersection();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_LOCATION__BLOCK = eINSTANCE.getWorkLocation_Block();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_LOCATION__DESIGN_LOCATIONS = eINSTANCE.getWorkLocation_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>Lot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_LOCATION__LOT = eINSTANCE.getWorkLocation_Lot();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CostType <em>Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CostType
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCostType()
		 * @generated
		 */
		public static final EClass COST_TYPE = eINSTANCE.getCostType();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COST_TYPE__STAGE = eINSTANCE.getCostType_Stage();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COST_TYPE__ERP_JOURNAL_ENTRIES = eINSTANCE.getCostType_ErpJournalEntries();

		/**
		 * The meta object literal for the '<em><b>Parent Cost Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COST_TYPE__PARENT_COST_TYPE = eINSTANCE.getCostType_ParentCostType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COST_TYPE__CODE = eINSTANCE.getCostType_Code();

		/**
		 * The meta object literal for the '<em><b>Child Cost Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COST_TYPE__CHILD_COST_TYPES = eINSTANCE.getCostType_ChildCostTypes();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COST_TYPE__WORK_COST_DETAILS = eINSTANCE.getCostType_WorkCostDetails();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COST_TYPE__COMPATIBLE_UNITS = eINSTANCE.getCostType_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COST_TYPE__LEVEL = eINSTANCE.getCostType_Level();

		/**
		 * The meta object literal for the '<em><b>Amount Assignable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COST_TYPE__AMOUNT_ASSIGNABLE = eINSTANCE.getCostType_AmountAssignable();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COST_TYPE__STATUS = eINSTANCE.getCostType_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem <em>CU Material Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUMaterialItem()
		 * @generated
		 */
		public static final EClass CU_MATERIAL_ITEM = eINSTANCE.getCUMaterialItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_MATERIAL_ITEM__STATUS = eINSTANCE.getCUMaterialItem_Status();

		/**
		 * The meta object literal for the '<em><b>Property Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_MATERIAL_ITEM__PROPERTY_UNITS = eINSTANCE.getCUMaterialItem_PropertyUnits();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_MATERIAL_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCUMaterialItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_MATERIAL_ITEM__QUANTITY = eINSTANCE.getCUMaterialItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_MATERIAL_ITEM__CORPORATE_CODE = eINSTANCE.getCUMaterialItem_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_MATERIAL_ITEM__TYPE_MATERIAL = eINSTANCE.getCUMaterialItem_TypeMaterial();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit <em>Property Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getPropertyUnit()
		 * @generated
		 */
		public static final EClass PROPERTY_UNIT = eINSTANCE.getPropertyUnit();

		/**
		 * The meta object literal for the '<em><b>Accounting Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_UNIT__ACCOUNTING_USAGE = eINSTANCE.getPropertyUnit_AccountingUsage();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY_UNIT__STATUS = eINSTANCE.getPropertyUnit_Status();

		/**
		 * The meta object literal for the '<em><b>Property Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_UNIT__PROPERTY_ACCOUNT = eINSTANCE.getPropertyUnit_PropertyAccount();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY_UNIT__COMPATIBLE_UNITS = eINSTANCE.getPropertyUnit_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_UNIT__ACTIVITY_CODE = eINSTANCE.getPropertyUnit_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>CU Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY_UNIT__CU_MATERIAL_ITEMS = eINSTANCE.getPropertyUnit_CUMaterialItems();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY_UNIT__WORK_COST_DETAILS = eINSTANCE.getPropertyUnit_WorkCostDetails();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Project <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Project
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getProject()
		 * @generated
		 */
		public static final EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Business Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROJECT__BUSINESS_CASE = eINSTANCE.getProject_BusinessCase();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROJECT__BUDGET = eINSTANCE.getProject_Budget();

		/**
		 * The meta object literal for the '<em><b>Sub Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROJECT__SUB_PROJECTS = eINSTANCE.getProject_SubProjects();

		/**
		 * The meta object literal for the '<em><b>Erp Project Accounting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROJECT__ERP_PROJECT_ACCOUNTING = eINSTANCE.getProject_ErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROJECT__REQUESTS = eINSTANCE.getProject_Requests();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROJECT__WORKS = eINSTANCE.getProject_Works();

		/**
		 * The meta object literal for the '<em><b>Parent Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROJECT__PARENT_PROJECT = eINSTANCE.getProject_ParentProject();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem <em>CU Labor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborItem()
		 * @generated
		 */
		public static final EClass CU_LABOR_ITEM = eINSTANCE.getCULaborItem();

		/**
		 * The meta object literal for the '<em><b>Labor Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_LABOR_ITEM__LABOR_DURATION = eINSTANCE.getCULaborItem_LaborDuration();

		/**
		 * The meta object literal for the '<em><b>Labor Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_LABOR_ITEM__LABOR_RATE = eINSTANCE.getCULaborItem_LaborRate();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_LABOR_ITEM__ACTIVITY_CODE = eINSTANCE.getCULaborItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_LABOR_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCULaborItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>CU Labor Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_LABOR_ITEM__CU_LABOR_CODE = eINSTANCE.getCULaborItem_CULaborCode();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_LABOR_ITEM__STATUS = eINSTANCE.getCULaborItem_Status();

		/**
		 * The meta object literal for the '<em><b>Qualification Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS = eINSTANCE.getCULaborItem_QualificationRequirements();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.LaborItem <em>Labor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.LaborItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getLaborItem()
		 * @generated
		 */
		public static final EClass LABOR_ITEM = eINSTANCE.getLaborItem();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LABOR_ITEM__COST = eINSTANCE.getLaborItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LABOR_ITEM__ERP_PERSONS = eINSTANCE.getLaborItem_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LABOR_ITEM__WORK_TASK = eINSTANCE.getLaborItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Labor Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LABOR_ITEM__LABOR_RATE = eINSTANCE.getLaborItem_LaborRate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LABOR_ITEM__STATUS = eINSTANCE.getLaborItem_Status();

		/**
		 * The meta object literal for the '<em><b>Labor Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LABOR_ITEM__LABOR_DURATION = eINSTANCE.getLaborItem_LaborDuration();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LABOR_ITEM__ACTIVITY_CODE = eINSTANCE.getLaborItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LABOR_ITEM__WORK_COST_DETAIL = eINSTANCE.getLaborItem_WorkCostDetail();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep <em>Work Flow Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkFlowStep()
		 * @generated
		 */
		public static final EClass WORK_FLOW_STEP = eINSTANCE.getWorkFlowStep();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_FLOW_STEP__WORK_TASKS = eINSTANCE.getWorkFlowStep_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_FLOW_STEP__SEQUENCE_NUMBER = eINSTANCE.getWorkFlowStep_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_FLOW_STEP__STATUS = eINSTANCE.getWorkFlowStep_Status();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_FLOW_STEP__WORK = eINSTANCE.getWorkFlowStep_Work();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet <em>Inspection Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.InspectionDataSet
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getInspectionDataSet()
		 * @generated
		 */
		public static final EClass INSPECTION_DATA_SET = eINSTANCE.getInspectionDataSet();

		/**
		 * The meta object literal for the '<em><b>According To Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES = eINSTANCE.getInspectionDataSet_AccordingToSchedules();

		/**
		 * The meta object literal for the '<em><b>Location Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INSPECTION_DATA_SET__LOCATION_CONDITION = eINSTANCE.getInspectionDataSet_LocationCondition();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail <em>Work Cost Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostDetail()
		 * @generated
		 */
		public static final EClass WORK_COST_DETAIL = eINSTANCE.getWorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__WORK_TASK = eINSTANCE.getWorkCostDetail_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_COST_DETAIL__TYPE = eINSTANCE.getWorkCostDetail_Type();

		/**
		 * The meta object literal for the '<em><b>Is Debit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_COST_DETAIL__IS_DEBIT = eINSTANCE.getWorkCostDetail_IsDebit();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__WORKS = eINSTANCE.getWorkCostDetail_Works();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__DESIGN = eINSTANCE.getWorkCostDetail_Design();

		/**
		 * The meta object literal for the '<em><b>Misc Cost Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__MISC_COST_ITEMS = eINSTANCE.getWorkCostDetail_MiscCostItems();

		/**
		 * The meta object literal for the '<em><b>Work Cost Summary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__WORK_COST_SUMMARY = eINSTANCE.getWorkCostDetail_WorkCostSummary();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_COST_DETAIL__TRANSACTION_DATE_TIME = eINSTANCE.getWorkCostDetail_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Property Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__PROPERTY_UNITS = eINSTANCE.getWorkCostDetail_PropertyUnits();

		/**
		 * The meta object literal for the '<em><b>Erp Project Accounting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING = eINSTANCE.getWorkCostDetail_ErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__LABOR_ITEMS = eINSTANCE.getWorkCostDetail_LaborItems();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__MATERIAL_ITEMS = eINSTANCE.getWorkCostDetail_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Equipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__EQUIPMENT_ITEMS = eINSTANCE.getWorkCostDetail_EquipmentItems();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORK_COST_DETAIL__AMOUNT = eINSTANCE.getWorkCostDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__CONTRACTOR_ITEMS = eINSTANCE.getWorkCostDetail_ContractorItems();

		/**
		 * The meta object literal for the '<em><b>Overhead Cost</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__OVERHEAD_COST = eINSTANCE.getWorkCostDetail_OverheadCost();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_DETAIL__COST_TYPE = eINSTANCE.getWorkCostDetail_CostType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit <em>Compatible Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCompatibleUnit()
		 * @generated
		 */
		public static final EClass COMPATIBLE_UNIT = eINSTANCE.getCompatibleUnit();

		/**
		 * The meta object literal for the '<em><b>CU Work Equipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS = eINSTANCE.getCompatibleUnit_CUWorkEquipmentItems();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__DESIGN_LOCATION_CUS = eINSTANCE.getCompatibleUnit_DesignLocationCUs();

		/**
		 * The meta object literal for the '<em><b>CU Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_GROUP = eINSTANCE.getCompatibleUnit_CUGroup();

		/**
		 * The meta object literal for the '<em><b>CU Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_ASSETS = eINSTANCE.getCompatibleUnit_CUAssets();

		/**
		 * The meta object literal for the '<em><b>Property Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__PROPERTY_UNIT = eINSTANCE.getCompatibleUnit_PropertyUnit();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPATIBLE_UNIT__QUANTITY = eINSTANCE.getCompatibleUnit_Quantity();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__COST_TYPE = eINSTANCE.getCompatibleUnit_CostType();

		/**
		 * The meta object literal for the '<em><b>Est Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMPATIBLE_UNIT__EST_COST = eINSTANCE.getCompatibleUnit_EstCost();

		/**
		 * The meta object literal for the '<em><b>CU Allowable Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION = eINSTANCE.getCompatibleUnit_CUAllowableAction();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__PROCEDURES = eINSTANCE.getCompatibleUnit_Procedures();

		/**
		 * The meta object literal for the '<em><b>CU Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS = eINSTANCE.getCompatibleUnit_CUContractorItems();

		/**
		 * The meta object literal for the '<em><b>CU Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_MATERIAL_ITEMS = eINSTANCE.getCompatibleUnit_CUMaterialItems();

		/**
		 * The meta object literal for the '<em><b>CU Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMPATIBLE_UNIT__CU_LABOR_ITEMS = eINSTANCE.getCompatibleUnit_CULaborItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostSummary <em>Work Cost Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkCostSummary
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkCostSummary()
		 * @generated
		 */
		public static final EClass WORK_COST_SUMMARY = eINSTANCE.getWorkCostSummary();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORK_COST_SUMMARY__WORK_COST_DETAIL = eINSTANCE.getWorkCostSummary_WorkCostDetail();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.NonStandardItem <em>Non Standard Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.NonStandardItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getNonStandardItem()
		 * @generated
		 */
		public static final EClass NON_STANDARD_ITEM = eINSTANCE.getNonStandardItem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NON_STANDARD_ITEM__CODE = eINSTANCE.getNonStandardItem_Code();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NON_STANDARD_ITEM__AMOUNT = eINSTANCE.getNonStandardItem_Amount();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.InfoQuestion <em>Info Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.InfoQuestion
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getInfoQuestion()
		 * @generated
		 */
		public static final EClass INFO_QUESTION = eINSTANCE.getInfoQuestion();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__ANSWER = eINSTANCE.getInfoQuestion_Answer();

		/**
		 * The meta object literal for the '<em><b>Answer Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__ANSWER_REMARK = eINSTANCE.getInfoQuestion_AnswerRemark();

		/**
		 * The meta object literal for the '<em><b>Question Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__QUESTION_TEXT = eINSTANCE.getInfoQuestion_QuestionText();

		/**
		 * The meta object literal for the '<em><b>Answer Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__ANSWER_DATE_TIME = eINSTANCE.getInfoQuestion_AnswerDateTime();

		/**
		 * The meta object literal for the '<em><b>Question Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__QUESTION_CODE = eINSTANCE.getInfoQuestion_QuestionCode();

		/**
		 * The meta object literal for the '<em><b>Question Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__QUESTION_REMARK = eINSTANCE.getInfoQuestion_QuestionRemark();

		/**
		 * The meta object literal for the '<em><b>Question Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INFO_QUESTION__QUESTION_CATEGORY = eINSTANCE.getInfoQuestion_QuestionCategory();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Regulation <em>Regulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Regulation
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getRegulation()
		 * @generated
		 */
		public static final EClass REGULATION = eINSTANCE.getRegulation();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULATION__REFERENCE_NUMBER = eINSTANCE.getRegulation_ReferenceNumber();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem <em>Contractor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getContractorItem()
		 * @generated
		 */
		public static final EClass CONTRACTOR_ITEM = eINSTANCE.getContractorItem();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTRACTOR_ITEM__WORK_TASK = eINSTANCE.getContractorItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Bid Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTRACTOR_ITEM__BID_AMOUNT = eINSTANCE.getContractorItem_BidAmount();

		/**
		 * The meta object literal for the '<em><b>Erp Payables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTRACTOR_ITEM__ERP_PAYABLES = eINSTANCE.getContractorItem_ErpPayables();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTRACTOR_ITEM__STATUS = eINSTANCE.getContractorItem_Status();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTRACTOR_ITEM__ACTIVITY_CODE = eINSTANCE.getContractorItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTRACTOR_ITEM__COST = eINSTANCE.getContractorItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTRACTOR_ITEM__WORK_COST_DETAIL = eINSTANCE.getContractorItem_WorkCostDetail();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CUAllowableAction <em>CU Allowable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CUAllowableAction
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUAllowableAction()
		 * @generated
		 */
		public static final EClass CU_ALLOWABLE_ACTION = eINSTANCE.getCUAllowableAction();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS = eINSTANCE.getCUAllowableAction_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_ALLOWABLE_ACTION__STATUS = eINSTANCE.getCUAllowableAction_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode <em>CU Labor Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCULaborCode()
		 * @generated
		 */
		public static final EClass CU_LABOR_CODE = eINSTANCE.getCULaborCode();

		/**
		 * The meta object literal for the '<em><b>CU Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_LABOR_CODE__CU_LABOR_ITEMS = eINSTANCE.getCULaborCode_CULaborItems();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_LABOR_CODE__CODE = eINSTANCE.getCULaborCode_Code();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_LABOR_CODE__STATUS = eINSTANCE.getCULaborCode_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit <em>Access Permit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.AccessPermit
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getAccessPermit()
		 * @generated
		 */
		public static final EClass ACCESS_PERMIT = eINSTANCE.getAccessPermit();

		/**
		 * The meta object literal for the '<em><b>Application Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCESS_PERMIT__APPLICATION_NUMBER = eINSTANCE.getAccessPermit_ApplicationNumber();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCESS_PERMIT__PAYMENT = eINSTANCE.getAccessPermit_Payment();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCESS_PERMIT__EFFECTIVE_DATE = eINSTANCE.getAccessPermit_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCESS_PERMIT__EXPIRATION_DATE = eINSTANCE.getAccessPermit_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Permit ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCESS_PERMIT__PERMIT_ID = eINSTANCE.getAccessPermit_PermitID();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem <em>CU Work Equipment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUWorkEquipmentItem()
		 * @generated
		 */
		public static final EClass CU_WORK_EQUIPMENT_ITEM = eINSTANCE.getCUWorkEquipmentItem();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET = eINSTANCE.getCUWorkEquipmentItem_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_WORK_EQUIPMENT_ITEM__STATUS = eINSTANCE.getCUWorkEquipmentItem_Status();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_WORK_EQUIPMENT_ITEM__RATE = eINSTANCE.getCUWorkEquipmentItem_Rate();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCUWorkEquipmentItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Equip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE = eINSTANCE.getCUWorkEquipmentItem_EquipCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU <em>Design Location CU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesignLocationCU()
		 * @generated
		 */
		public static final EClass DESIGN_LOCATION_CU = eINSTANCE.getDesignLocationCU();

		/**
		 * The meta object literal for the '<em><b>Condition Factors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__CONDITION_FACTORS = eINSTANCE.getDesignLocationCU_ConditionFactors();

		/**
		 * The meta object literal for the '<em><b>Energization Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION_CU__ENERGIZATION_FLAG = eINSTANCE.getDesignLocationCU_EnergizationFlag();

		/**
		 * The meta object literal for the '<em><b>Cu Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION_CU__CU_USAGE = eINSTANCE.getDesignLocationCU_CuUsage();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__COMPATIBLE_UNITS = eINSTANCE.getDesignLocationCU_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Removal Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION_CU__REMOVAL_DATE = eINSTANCE.getDesignLocationCU_RemovalDate();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__WORK_TASKS = eINSTANCE.getDesignLocationCU_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Cu Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION_CU__CU_ACTION = eINSTANCE.getDesignLocationCU_CuAction();

		/**
		 * The meta object literal for the '<em><b>Cu Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION_CU__CU_ACCOUNT = eINSTANCE.getDesignLocationCU_CuAccount();

		/**
		 * The meta object literal for the '<em><b>Cu Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DESIGN_LOCATION_CU__CU_QUANTITY = eINSTANCE.getDesignLocationCU_CuQuantity();

		/**
		 * The meta object literal for the '<em><b>Designs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__DESIGNS = eINSTANCE.getDesignLocationCU_Designs();

		/**
		 * The meta object literal for the '<em><b>CU Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__CU_GROUPS = eINSTANCE.getDesignLocationCU_CUGroups();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__DESIGN_LOCATION = eINSTANCE.getDesignLocationCU_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DESIGN_LOCATION_CU__STATUS = eINSTANCE.getDesignLocationCU_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet <em>Maintenance Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getMaintenanceDataSet()
		 * @generated
		 */
		public static final EClass MAINTENANCE_DATA_SET = eINSTANCE.getMaintenanceDataSet();

		/**
		 * The meta object literal for the '<em><b>Condition After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAINTENANCE_DATA_SET__CONDITION_AFTER = eINSTANCE.getMaintenanceDataSet_ConditionAfter();

		/**
		 * The meta object literal for the '<em><b>Condition Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAINTENANCE_DATA_SET__CONDITION_BEFORE = eINSTANCE.getMaintenanceDataSet_ConditionBefore();

		/**
		 * The meta object literal for the '<em><b>Maint Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAINTENANCE_DATA_SET__MAINT_CODE = eINSTANCE.getMaintenanceDataSet_MaintCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem <em>Misc Cost Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getMiscCostItem()
		 * @generated
		 */
		public static final EClass MISC_COST_ITEM = eINSTANCE.getMiscCostItem();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MISC_COST_ITEM__DESIGN_LOCATION = eINSTANCE.getMiscCostItem_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MISC_COST_ITEM__QUANTITY = eINSTANCE.getMiscCostItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MISC_COST_ITEM__STATUS = eINSTANCE.getMiscCostItem_Status();

		/**
		 * The meta object literal for the '<em><b>Cost Per Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MISC_COST_ITEM__COST_PER_UNIT = eINSTANCE.getMiscCostItem_CostPerUnit();

		/**
		 * The meta object literal for the '<em><b>External Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MISC_COST_ITEM__EXTERNAL_REF_ID = eINSTANCE.getMiscCostItem_ExternalRefID();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MISC_COST_ITEM__ACCOUNT = eINSTANCE.getMiscCostItem_Account();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MISC_COST_ITEM__COST_TYPE = eINSTANCE.getMiscCostItem_CostType();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MISC_COST_ITEM__WORK_TASK = eINSTANCE.getMiscCostItem_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MISC_COST_ITEM__WORK_COST_DETAIL = eINSTANCE.getMiscCostItem_WorkCostDetail();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem <em>Material Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getMaterialItem()
		 * @generated
		 */
		public static final EClass MATERIAL_ITEM = eINSTANCE.getMaterialItem();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory Counts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__ERP_INVENTORY_COUNTS = eINSTANCE.getMaterialItem_ErpInventoryCounts();

		/**
		 * The meta object literal for the '<em><b>Cost Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__COST_DESCRIPTION = eINSTANCE.getMaterialItem_CostDescription();

		/**
		 * The meta object literal for the '<em><b>Usages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__USAGES = eINSTANCE.getMaterialItem_Usages();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__ERP_PO_LINE_ITEMS = eINSTANCE.getMaterialItem_ErpPOLineItems();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__QUANTITY = eINSTANCE.getMaterialItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS = eINSTANCE.getMaterialItem_ErpRecDelvLineItems();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__DESIGN_LOCATION = eINSTANCE.getMaterialItem_DesignLocation();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__STATUS = eINSTANCE.getMaterialItem_Status();

		/**
		 * The meta object literal for the '<em><b>Material Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__MATERIAL_CODE = eINSTANCE.getMaterialItem_MaterialCode();

		/**
		 * The meta object literal for the '<em><b>External Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__EXTERNAL_REF_ID = eINSTANCE.getMaterialItem_ExternalRefID();

		/**
		 * The meta object literal for the '<em><b>Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__COST_TYPE = eINSTANCE.getMaterialItem_CostType();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__TYPE_MATERIAL = eINSTANCE.getMaterialItem_TypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Work Cost Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__WORK_COST_DETAIL = eINSTANCE.getMaterialItem_WorkCostDetail();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__ACCOUNT = eINSTANCE.getMaterialItem_Account();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MATERIAL_ITEM__ACTUAL_COST = eINSTANCE.getMaterialItem_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATERIAL_ITEM__WORK_TASK = eINSTANCE.getMaterialItem_WorkTask();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern <em>Shift Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getShiftPattern()
		 * @generated
		 */
		public static final EClass SHIFT_PATTERN = eINSTANCE.getShiftPattern();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHIFT_PATTERN__CREWS = eINSTANCE.getShiftPattern_Crews();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHIFT_PATTERN__STATUS = eINSTANCE.getShiftPattern_Status();

		/**
		 * The meta object literal for the '<em><b>Cycle Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT_PATTERN__CYCLE_COUNT = eINSTANCE.getShiftPattern_CycleCount();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHIFT_PATTERN__VALIDITY_INTERVAL = eINSTANCE.getShiftPattern_ValidityInterval();

		/**
		 * The meta object literal for the '<em><b>Assignment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT_PATTERN__ASSIGNMENT_TYPE = eINSTANCE.getShiftPattern_AssignmentType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Capability <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Capability
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCapability()
		 * @generated
		 */
		public static final EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Crew</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAPABILITY__CREW = eINSTANCE.getCapability_Crew();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAPABILITY__CATEGORY = eINSTANCE.getCapability_Category();

		/**
		 * The meta object literal for the '<em><b>Performance Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAPABILITY__PERFORMANCE_FACTOR = eINSTANCE.getCapability_PerformanceFactor();

		/**
		 * The meta object literal for the '<em><b>Work Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAPABILITY__WORK_TASKS = eINSTANCE.getCapability_WorkTasks();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAPABILITY__STATUS = eINSTANCE.getCapability_Status();

		/**
		 * The meta object literal for the '<em><b>Crafts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAPABILITY__CRAFTS = eINSTANCE.getCapability_Crafts();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAPABILITY__VALIDITY_INTERVAL = eINSTANCE.getCapability_ValidityInterval();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Usage <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Usage
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getUsage()
		 * @generated
		 */
		public static final EClass USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USAGE__WORK_TASK = eINSTANCE.getUsage_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Work Equipment Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USAGE__WORK_EQUIPMENT_ASSET = eINSTANCE.getUsage_WorkEquipmentAsset();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USAGE__STATUS = eINSTANCE.getUsage_Status();

		/**
		 * The meta object literal for the '<em><b>Material Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USAGE__MATERIAL_ITEM = eINSTANCE.getUsage_MaterialItem();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest <em>One Call Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getOneCallRequest()
		 * @generated
		 */
		public static final EClass ONE_CALL_REQUEST = eINSTANCE.getOneCallRequest();

		/**
		 * The meta object literal for the '<em><b>Work Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ONE_CALL_REQUEST__WORK_LOCATIONS = eINSTANCE.getOneCallRequest_WorkLocations();

		/**
		 * The meta object literal for the '<em><b>Marked Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ONE_CALL_REQUEST__MARKED_INDICATOR = eINSTANCE.getOneCallRequest_MarkedIndicator();

		/**
		 * The meta object literal for the '<em><b>Explosives Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ONE_CALL_REQUEST__EXPLOSIVES_USED = eINSTANCE.getOneCallRequest_ExplosivesUsed();

		/**
		 * The meta object literal for the '<em><b>Marking Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ONE_CALL_REQUEST__MARKING_INSTRUCTION = eINSTANCE.getOneCallRequest_MarkingInstruction();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.Assignment <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.Assignment
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getAssignment()
		 * @generated
		 */
		public static final EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSIGNMENT__CREWS = eINSTANCE.getAssignment_Crews();

		/**
		 * The meta object literal for the '<em><b>Effective Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSIGNMENT__EFFECTIVE_PERIOD = eINSTANCE.getAssignment_EffectivePeriod();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem <em>CU Contractor Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUContractorItem()
		 * @generated
		 */
		public static final EClass CU_CONTRACTOR_ITEM = eINSTANCE.getCUContractorItem();

		/**
		 * The meta object literal for the '<em><b>Bid Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_CONTRACTOR_ITEM__BID_AMOUNT = eINSTANCE.getCUContractorItem_BidAmount();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_CONTRACTOR_ITEM__COMPATIBLE_UNITS = eINSTANCE.getCUContractorItem_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Activity Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CU_CONTRACTOR_ITEM__ACTIVITY_CODE = eINSTANCE.getCUContractorItem_ActivityCode();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_CONTRACTOR_ITEM__STATUS = eINSTANCE.getCUContractorItem_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.CUGroup <em>CU Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.CUGroup
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getCUGroup()
		 * @generated
		 */
		public static final EClass CU_GROUP = eINSTANCE.getCUGroup();

		/**
		 * The meta object literal for the '<em><b>Compatible Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_GROUP__COMPATIBLE_UNITS = eINSTANCE.getCUGroup_CompatibleUnits();

		/**
		 * The meta object literal for the '<em><b>Parent CU Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_GROUP__PARENT_CU_GROUPS = eINSTANCE.getCUGroup_ParentCUGroups();

		/**
		 * The meta object literal for the '<em><b>Child CU Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_GROUP__CHILD_CU_GROUPS = eINSTANCE.getCUGroup_ChildCUGroups();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_GROUP__STATUS = eINSTANCE.getCUGroup_Status();

		/**
		 * The meta object literal for the '<em><b>Design Location CUs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CU_GROUP__DESIGN_LOCATION_CUS = eINSTANCE.getCUGroup_DesignLocationCUs();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactorKind <em>Condition Factor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactorKind
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactorKind()
		 * @generated
		 */
		public static final EEnum CONDITION_FACTOR_KIND = eINSTANCE.getConditionFactorKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.WorkActionKind <em>Work Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getWorkActionKind()
		 * @generated
		 */
		public static final EEnum WORK_ACTION_KIND = eINSTANCE.getWorkActionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfWork.DesignKind <em>Design Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfWork.DesignKind
		 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage#getDesignKind()
		 * @generated
		 */
		public static final EEnum DESIGN_KIND = eINSTANCE.getDesignKind();

	}

} //InfWorkPackage
