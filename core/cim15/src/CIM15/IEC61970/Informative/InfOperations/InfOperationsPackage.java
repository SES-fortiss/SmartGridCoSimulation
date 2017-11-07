/**
 */
package CIM15.IEC61970.Informative.InfOperations;

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
 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsFactory
 * @generated
 */
public class InfOperationsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfOperations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfOperations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfOperations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfOperationsPackage eINSTANCE = CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord <em>Outage Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord()
	 * @generated
	 */
	public static final int OUTAGE_RECORD = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Outage Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__OUTAGE_CODES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__END_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage Report</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__OUTAGE_REPORT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__IS_PLANNED = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Damage Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__DAMAGE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__ACTION_TAKEN = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outage Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__OUTAGE_STEPS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD__MODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Outage Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Outage Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_RECORD_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport <em>Outage Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport()
	 * @generated
	 */
	public static final int OUTAGE_REPORT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Outage Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__OUTAGE_RECORD = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__CUSTOMER_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__AVERAGE_CML = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outage History</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__OUTAGE_HISTORY = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outage Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__OUTAGE_DURATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT__TOTAL_CML = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Outage Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Outage Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_REPORT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem <em>Change Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem()
	 * @generated
	 */
	public static final int CHANGE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__GML_SELECTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__ORGANISATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__DOCUMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__GML_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__ERP_PERSON = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__POWER_SYSTEM_RESOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Change Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__CHANGE_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Network Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM__NETWORK_DATA_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Change Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Change Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent <em>PSR Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREvent()
	 * @generated
	 */
	public static final int PSR_EVENT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__NAMES = CommonPackage.ACTIVITY_RECORD__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__DIAGRAM_OBJECTS = CommonPackage.ACTIVITY_RECORD__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__KIND = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT__POWER_SYSTEM_RESOURCE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PSR Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PSR Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage <em>Planned Outage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getPlannedOutage()
	 * @generated
	 */
	public static final int PLANNED_OUTAGE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__CUSTOMER_DATAS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE__OUTAGE_SCHEDULES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Planned Outage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Planned Outage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_OUTAGE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection <em>Circuit Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection()
	 * @generated
	 */
	public static final int CIRCUIT_SECTION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Conductor Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__CONDUCTOR_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__CONNECTION_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Circuits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION__CIRCUITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Circuit Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Circuit Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_SECTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument <em>Safety Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSafetyDocument()
	 * @generated
	 */
	public static final int SAFETY_DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__CLEARANCE_TAGS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__SCHEDULE_STEPS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Safety Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Safety Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_DOCUMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction <em>Operational Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OperationalRestriction
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOperationalRestriction()
	 * @generated
	 */
	public static final int OPERATIONAL_RESTRICTION = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Active Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION__ACTIVE_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operational Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_RESTRICTION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet <em>Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet()
	 * @generated
	 */
	public static final int CHANGE_SET = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__NETWORK_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule <em>Switching Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule()
	 * @generated
	 */
	public static final int SWITCHING_SCHEDULE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__SCHEDULE_STEPS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__WORK_TASK = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__REASON = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__CREWS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE__INTERVAL = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Switching Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Switching Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_SCHEDULE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.Circuit <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.Circuit
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuit()
	 * @generated
	 */
	public static final int CIRCUIT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__UUID = CorePackage.EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__NAMES = CorePackage.EQUIPMENT_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__MRID = CorePackage.EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__ALIAS_NAME = CorePackage.EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__NAME = CorePackage.EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__CHANGE_ITEMS = CorePackage.EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__SCHEDULE_STEPS = CorePackage.EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__OPERATING_SHARE = CorePackage.EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__DOCUMENT_ROLES = CorePackage.EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__PSR_LISTS = CorePackage.EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__MEASUREMENTS = CorePackage.EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__REPORTING_GROUP = CorePackage.EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__PSR_TYPE = CorePackage.EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__ASSETS = CorePackage.EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__LOCATION = CorePackage.EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__PSR_EVENT = CorePackage.EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__TOPOLOGICAL_NODE = CorePackage.EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__CONNECTIVITY_NODES = CorePackage.EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__EQUIPMENTS = CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Circuit Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT__CIRCUIT_SECTIONS = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_FEATURE_COUNT = CorePackage.EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUIT_OPERATION_COUNT = CorePackage.EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet <em>Network Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet()
	 * @generated
	 */
	public static final int NETWORK_DATA_SET = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__CHANGE_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Network Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Network Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_DATA_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep <em>Outage Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep()
	 * @generated
	 */
	public static final int OUTAGE_STEP = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__AVERAGE_CML = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__DAMAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Special Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Critical Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shock Reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__SHOCK_REPORTED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>No Power Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__NO_POWER_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Caller Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__CALLER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Conducting Equipment Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fatality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__FATALITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Job Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__JOB_PRIORITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Total Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__TOTAL_CUSTOMER_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Injury</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__INJURY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Outage Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__OUTAGE_RECORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__TOTAL_CML = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Outage Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP__OUTAGE_CODES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Outage Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Outage Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole <em>Org Psr Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOrgPsrRole()
	 * @generated
	 */
	public static final int ORG_PSR_ROLE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Org Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Org Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_PSR_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode <em>Outage Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageCode()
	 * @generated
	 */
	public static final int OUTAGE_CODE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__SUB_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outage Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__OUTAGE_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outage Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE__OUTAGE_STEPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Outage Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Outage Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_CODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode <em>Incident Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentCode()
	 * @generated
	 */
	public static final int INCIDENT_CODE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Incident Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__INCIDENT_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE__SUB_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incident Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incident Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_CODE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.LandBase <em>Land Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.LandBase
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getLandBase()
	 * @generated
	 */
	public static final int LAND_BASE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>Land Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Land Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LAND_BASE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole <em>Erp Person Schedule Step Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getErpPersonScheduleStepRole()
	 * @generated
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switching Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Person Schedule Step Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Person Schedule Step Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_SCHEDULE_STEP_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep <em>Switching Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep()
	 * @generated
	 */
	public static final int SWITCHING_STEP = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Safety Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__SAFETY_DOCUMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__STATUS_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__TEXT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Control Action Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Control Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__REQUIRED_CONTROL_ACTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switching Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__SWITCHING_SCHEDULE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Person Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__ERP_PERSON_ROLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Desired End State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP__DESIRED_END_STATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Switching Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Switching Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHING_STEP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack <em>Call Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack()
	 * @generated
	 */
	public static final int CALL_BACK = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__APPOINTMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__COMMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__ADVICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trouble Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__TROUBLE_TICKETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contact Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__CONTACT_DETAIL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Problem Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK__PROBLEM_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Call Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Call Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CALL_BACK_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket <em>Trouble Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket()
	 * @generated
	 */
	public static final int TROUBLE_TICKET = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Call Backs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CALL_BACKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trouble Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__TROUBLE_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Call Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__FIRST_CALL_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inform Before Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__INFORM_BEFORE_RESTORED = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reporting Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__REPORTING_KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__PRIORITY = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Customer Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CUSTOMER_DATA = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inform After Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__INFORM_AFTER_RESTORED = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__ADVICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Incident Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__INCIDENT_RECORD = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hazard Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__HAZARD_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Call Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET__CALL_BACK = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Trouble Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Trouble Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TROUBLE_TICKET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord <em>Incident Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentRecord()
	 * @generated
	 */
	public static final int INCIDENT_RECORD = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trouble Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__TROUBLE_TICKETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incident Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD__INCIDENT_CODES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Incident Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Incident Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCIDENT_RECORD_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification <em>Outage Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification()
	 * @generated
	 */
	public static final int OUTAGE_NOTIFICATION = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Expected Interruption Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__DURATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__CUSTOMER_DATAS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION__REASON = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outage Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Outage Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_NOTIFICATION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole <em>Outage Step Psr Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStepPsrRole()
	 * @generated
	 */
	public static final int OUTAGE_STEP_PSR_ROLE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Outage Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Outage Step Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Outage Step Psr Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_STEP_PSR_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind <em>Switching Step Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStepStatusKind()
	 * @generated
	 */
	public static final int SWITCHING_STEP_STATUS_KIND = 24;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind <em>Circuit Connection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitConnectionKind()
	 * @generated
	 */
	public static final int CIRCUIT_CONNECTION_KIND = 25;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.PSREventKind <em>PSR Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREventKind
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREventKind()
	 * @generated
	 */
	public static final int PSR_EVENT_KIND = 26;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind <em>Trouble Reporting Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleReportingKind()
	 * @generated
	 */
	public static final int TROUBLE_REPORTING_KIND = 27;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItemKind <em>Change Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItemKind()
	 * @generated
	 */
	public static final int CHANGE_ITEM_KIND = 28;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageKind <em>Outage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageKind
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageKind()
	 * @generated
	 */
	public static final int OUTAGE_KIND = 29;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outageRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outageReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psrEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedOutageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchingScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outageStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgPsrRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outageCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incidentCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPersonScheduleStepRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchingStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass troubleTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incidentRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outageNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outageStepPsrRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum switchingStepStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum circuitConnectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum psrEventKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum troubleReportingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeItemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outageKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfOperationsPackage() {
		super(eNS_URI, InfOperationsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfOperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfOperationsPackage init() {
		if (isInited) return (InfOperationsPackage)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI);

		// Obtain or create and register package
		InfOperationsPackage theInfOperationsPackage = (InfOperationsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfOperationsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfOperationsPackage());

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
		theInfOperationsPackage.fixPackageContents();
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
		theInfOperationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfOperationsPackage.eNS_URI, theInfOperationsPackage);
		return theInfOperationsPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Record</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord
	 * @generated
	 */
	public EClass getOutageRecord() {
		if (outageRecordEClass == null) {
			outageRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return outageRecordEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Codes</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EReference getOutageRecord_OutageCodes() {
        return (EReference)getOutageRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EAttribute getOutageRecord_EndDateTime() {
        return (EAttribute)getOutageRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Report</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EReference getOutageRecord_OutageReport() {
        return (EReference)getOutageRecord().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Planned</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EAttribute getOutageRecord_IsPlanned() {
        return (EAttribute)getOutageRecord().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EAttribute getOutageRecord_DamageCode() {
        return (EAttribute)getOutageRecord().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Taken</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EAttribute getOutageRecord_ActionTaken() {
        return (EAttribute)getOutageRecord().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Steps</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EReference getOutageRecord_OutageSteps() {
        return (EReference)getOutageRecord().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getMode()
	 * @see #getOutageRecord()
	 * @generated
	 */
	public EAttribute getOutageRecord_Mode() {
        return (EAttribute)getOutageRecord().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Report</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport
	 * @generated
	 */
	public EClass getOutageReport() {
		if (outageReportEClass == null) {
			outageReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return outageReportEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Record</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord()
	 * @see #getOutageReport()
	 * @generated
	 */
	public EReference getOutageReport_OutageRecord() {
        return (EReference)getOutageReport().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount()
	 * @see #getOutageReport()
	 * @generated
	 */
	public EAttribute getOutageReport_CustomerCount() {
        return (EAttribute)getOutageReport().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Cml</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getAverageCml()
	 * @see #getOutageReport()
	 * @generated
	 */
	public EAttribute getOutageReport_AverageCml() {
        return (EAttribute)getOutageReport().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage History</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory()
	 * @see #getOutageReport()
	 * @generated
	 */
	public EReference getOutageReport_OutageHistory() {
        return (EReference)getOutageReport().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outage Duration</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration()
	 * @see #getOutageReport()
	 * @generated
	 */
	public EAttribute getOutageReport_OutageDuration() {
        return (EAttribute)getOutageReport().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cml</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getTotalCml()
	 * @see #getOutageReport()
	 * @generated
	 */
	public EAttribute getOutageReport_TotalCml() {
        return (EAttribute)getOutageReport().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem <em>Change Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem
	 * @generated
	 */
	public EClass getChangeItem() {
		if (changeItemEClass == null) {
			changeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return changeItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Selector</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_GmlSelector() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_Organisation() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getDocument()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_Document() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getAsset()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_Asset() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EAttribute getChangeItem_SequenceNumber() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getStatus()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_Status() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getKind()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EAttribute getChangeItem_Kind() {
        return (EAttribute)getChangeItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Observation</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_GmlObservation() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_ErpPerson() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_PowerSystemResource() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_ChangeSet() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getLocation()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_Location() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet()
	 * @see #getChangeItem()
	 * @generated
	 */
	public EReference getChangeItem_NetworkDataSet() {
        return (EReference)getChangeItem().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent <em>PSR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSR Event</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent
	 * @generated
	 */
	public EClass getPSREvent() {
		if (psrEventEClass == null) {
			psrEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return psrEventEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent#getKind()
	 * @see #getPSREvent()
	 * @generated
	 */
	public EAttribute getPSREvent_Kind() {
        return (EAttribute)getPSREvent().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource()
	 * @see #getPSREvent()
	 * @generated
	 */
	public EReference getPSREvent_PowerSystemResource() {
        return (EReference)getPSREvent().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Outage</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage
	 * @generated
	 */
	public EClass getPlannedOutage() {
		if (plannedOutageEClass == null) {
			plannedOutageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return plannedOutageEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getKind()
	 * @see #getPlannedOutage()
	 * @generated
	 */
	public EAttribute getPlannedOutage_Kind() {
        return (EAttribute)getPlannedOutage().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Datas</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas()
	 * @see #getPlannedOutage()
	 * @generated
	 */
	public EReference getPlannedOutage_CustomerDatas() {
        return (EReference)getPlannedOutage().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules <em>Outage Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Schedules</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules()
	 * @see #getPlannedOutage()
	 * @generated
	 */
	public EReference getPlannedOutage_OutageSchedules() {
        return (EReference)getPlannedOutage().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Section</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection
	 * @generated
	 */
	public EClass getCircuitSection() {
		if (circuitSectionEClass == null) {
			circuitSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return circuitSectionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets()
	 * @see #getCircuitSection()
	 * @generated
	 */
	public EReference getCircuitSection_ConductorAssets() {
        return (EReference)getCircuitSection().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind()
	 * @see #getCircuitSection()
	 * @generated
	 */
	public EAttribute getCircuitSection_ConnectionKind() {
        return (EAttribute)getCircuitSection().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getCircuits <em>Circuits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circuits</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection#getCircuits()
	 * @see #getCircuitSection()
	 * @generated
	 */
	public EReference getCircuitSection_Circuits() {
        return (EReference)getCircuitSection().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Document</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument
	 * @generated
	 */
	public EClass getSafetyDocument() {
		if (safetyDocumentEClass == null) {
			safetyDocumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return safetyDocumentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clearance Tags</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags()
	 * @see #getSafetyDocument()
	 * @generated
	 */
	public EReference getSafetyDocument_ClearanceTags() {
        return (EReference)getSafetyDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Steps</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps()
	 * @see #getSafetyDocument()
	 * @generated
	 */
	public EReference getSafetyDocument_ScheduleSteps() {
        return (EReference)getSafetyDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource()
	 * @see #getSafetyDocument()
	 * @generated
	 */
	public EReference getSafetyDocument_PowerSystemResource() {
        return (EReference)getSafetyDocument().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction <em>Operational Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Restriction</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OperationalRestriction
	 * @generated
	 */
	public EClass getOperationalRestriction() {
		if (operationalRestrictionEClass == null) {
			operationalRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return operationalRestrictionEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod <em>Active Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active Period</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod()
	 * @see #getOperationalRestriction()
	 * @generated
	 */
	public EReference getOperationalRestriction_ActivePeriod() {
        return (EReference)getOperationalRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet
	 * @generated
	 */
	public EClass getChangeSet() {
		if (changeSetEClass == null) {
			changeSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return changeSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets()
	 * @see #getChangeSet()
	 * @generated
	 */
	public EReference getChangeSet_NetworkDataSets() {
        return (EReference)getChangeSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems()
	 * @see #getChangeSet()
	 * @generated
	 */
	public EReference getChangeSet_ChangeItems() {
        return (EReference)getChangeSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getStatus()
	 * @see #getChangeSet()
	 * @generated
	 */
	public EReference getChangeSet_Status() {
        return (EReference)getChangeSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getDocuments()
	 * @see #getChangeSet()
	 * @generated
	 */
	public EReference getChangeSet_Documents() {
        return (EReference)getChangeSet().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switching Schedule</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule
	 * @generated
	 */
	public EClass getSwitchingSchedule() {
		if (switchingScheduleEClass == null) {
			switchingScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return switchingScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Steps</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	public EReference getSwitchingSchedule_ScheduleSteps() {
        return (EReference)getSwitchingSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	public EReference getSwitchingSchedule_WorkTask() {
        return (EReference)getSwitchingSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	public EAttribute getSwitchingSchedule_Reason() {
        return (EAttribute)getSwitchingSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	public EReference getSwitchingSchedule_Crews() {
        return (EReference)getSwitchingSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval()
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	public EReference getSwitchingSchedule_Interval() {
        return (EReference)getSwitchingSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.Circuit
	 * @generated
	 */
	public EClass getCircuit() {
		if (circuitEClass == null) {
			circuitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return circuitEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.Circuit#getCircuitSections <em>Circuit Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Circuit Sections</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.Circuit#getCircuitSections()
	 * @see #getCircuit()
	 * @generated
	 */
	public EReference getCircuit_CircuitSections() {
        return (EReference)getCircuit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet
	 * @generated
	 */
	public EClass getNetworkDataSet() {
		if (networkDataSetEClass == null) {
			networkDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return networkDataSetEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public EReference getNetworkDataSet_Status() {
        return (EReference)getNetworkDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public EReference getNetworkDataSet_Documents() {
        return (EReference)getNetworkDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public EReference getNetworkDataSet_ChangeItems() {
        return (EReference)getNetworkDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public EAttribute getNetworkDataSet_Category() {
        return (EAttribute)getNetworkDataSet().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Sets</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public EReference getNetworkDataSet_ChangeSets() {
        return (EReference)getNetworkDataSet().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources()
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public EReference getNetworkDataSet_PowerSystemResources() {
        return (EReference)getNetworkDataSet().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Step</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep
	 * @generated
	 */
	public EClass getOutageStep() {
		if (outageStepEClass == null) {
			outageStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return outageStepEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Cml</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getAverageCml()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_AverageCml() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#isDamage()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_Damage() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Customer Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_SpecialCustomerCount() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Customer Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_CriticalCustomerCount() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Restore Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_EstimatedRestoreDateTime() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getCrews()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EReference getOutageStep_Crews() {
        return (EReference)getOutageStep().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shock Reported</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#isShockReported()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_ShockReported() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval <em>No Power Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Power Interval</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EReference getOutageStep_NoPowerInterval() {
        return (EReference)getOutageStep().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caller Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getCallerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_CallerCount() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipment Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EReference getOutageStep_ConductingEquipmentRoles() {
        return (EReference)getOutageStep().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fatality</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#isFatality()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_Fatality() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Priority</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getJobPriority()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_JobPriority() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Customer Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_TotalCustomerCount() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getStatus()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EReference getOutageStep_Status() {
        return (EReference)getOutageStep().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injury</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#isInjury()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_Injury() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Record</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EReference getOutageStep_OutageRecord() {
        return (EReference)getOutageStep().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cml</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCml()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EAttribute getOutageStep_TotalCml() {
        return (EAttribute)getOutageStep().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Codes</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes()
	 * @see #getOutageStep()
	 * @generated
	 */
	public EReference getOutageStep_OutageCodes() {
        return (EReference)getOutageStep().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole <em>Org Psr Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Psr Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole
	 * @generated
	 */
	public EClass getOrgPsrRole() {
		if (orgPsrRoleEClass == null) {
			orgPsrRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return orgPsrRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation()
	 * @see #getOrgPsrRole()
	 * @generated
	 */
	public EReference getOrgPsrRole_ErpOrganisation() {
        return (EReference)getOrgPsrRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource()
	 * @see #getOrgPsrRole()
	 * @generated
	 */
	public EReference getOrgPsrRole_PowerSystemResource() {
        return (EReference)getOrgPsrRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode <em>Outage Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode
	 * @generated
	 */
	public EClass getOutageCode() {
		if (outageCodeEClass == null) {
			outageCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return outageCodeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode#getSubCode()
	 * @see #getOutageCode()
	 * @generated
	 */
	public EAttribute getOutageCode_SubCode() {
        return (EAttribute)getOutageCode().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords <em>Outage Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Records</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords()
	 * @see #getOutageCode()
	 * @generated
	 */
	public EReference getOutageCode_OutageRecords() {
        return (EReference)getOutageCode().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Steps</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps()
	 * @see #getOutageCode()
	 * @generated
	 */
	public EReference getOutageCode_OutageSteps() {
        return (EReference)getOutageCode().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode <em>Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incident Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode
	 * @generated
	 */
	public EClass getIncidentCode() {
		if (incidentCodeEClass == null) {
			incidentCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return incidentCodeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords <em>Incident Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incident Records</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords()
	 * @see #getIncidentCode()
	 * @generated
	 */
	public EReference getIncidentCode_IncidentRecords() {
        return (EReference)getIncidentCode().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode#getSubCode <em>Sub Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode#getSubCode()
	 * @see #getIncidentCode()
	 * @generated
	 */
	public EAttribute getIncidentCode_SubCode() {
        return (EAttribute)getIncidentCode().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.LandBase <em>Land Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Land Base</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.LandBase
	 * @generated
	 */
	public EClass getLandBase() {
		if (landBaseEClass == null) {
			landBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return landBaseEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole <em>Erp Person Schedule Step Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Person Schedule Step Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole
	 * @generated
	 */
	public EClass getErpPersonScheduleStepRole() {
		if (erpPersonScheduleStepRoleEClass == null) {
			erpPersonScheduleStepRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return erpPersonScheduleStepRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson()
	 * @see #getErpPersonScheduleStepRole()
	 * @generated
	 */
	public EReference getErpPersonScheduleStepRole_ErpPerson() {
        return (EReference)getErpPersonScheduleStepRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switching Step</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep()
	 * @see #getErpPersonScheduleStepRole()
	 * @generated
	 */
	public EReference getErpPersonScheduleStepRole_SwitchingStep() {
        return (EReference)getErpPersonScheduleStepRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switching Step</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep
	 * @generated
	 */
	public EClass getSwitchingStep() {
		if (switchingStepEClass == null) {
			switchingStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return switchingStepEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Safety Document</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EReference getSwitchingStep_SafetyDocument() {
        return (EReference)getSwitchingStep().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EAttribute getSwitchingStep_StatusKind() {
        return (EAttribute)getSwitchingStep().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getText()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EAttribute getSwitchingStep_Text() {
        return (EAttribute)getSwitchingStep().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval <em>Required Control Action Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Control Action Interval</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EReference getSwitchingStep_RequiredControlActionInterval() {
        return (EReference)getSwitchingStep().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Control Action</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EAttribute getSwitchingStep_RequiredControlAction() {
        return (EAttribute)getSwitchingStep().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switching Schedule</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EReference getSwitchingStep_SwitchingSchedule() {
        return (EReference)getSwitchingStep().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EReference getSwitchingStep_PowerSystemResources() {
        return (EReference)getSwitchingStep().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EReference getSwitchingStep_ErpPersonRole() {
        return (EReference)getSwitchingStep().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired End State</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState()
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public EAttribute getSwitchingStep_DesiredEndState() {
        return (EAttribute)getSwitchingStep().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.CallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Back</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack
	 * @generated
	 */
	public EClass getCallBack() {
		if (callBackEClass == null) {
			callBackEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return callBackEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getAppointments()
	 * @see #getCallBack()
	 * @generated
	 */
	public EReference getCallBack_Appointments() {
        return (EReference)getCallBack().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getDateTime()
	 * @see #getCallBack()
	 * @generated
	 */
	public EAttribute getCallBack_DateTime() {
        return (EAttribute)getCallBack().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getErpPersons()
	 * @see #getCallBack()
	 * @generated
	 */
	public EReference getCallBack_ErpPersons() {
        return (EReference)getCallBack().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getComment()
	 * @see #getCallBack()
	 * @generated
	 */
	public EAttribute getCallBack_Comment() {
        return (EAttribute)getCallBack().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advice</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getAdvice()
	 * @see #getCallBack()
	 * @generated
	 */
	public EAttribute getCallBack_Advice() {
        return (EAttribute)getCallBack().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trouble Tickets</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets()
	 * @see #getCallBack()
	 * @generated
	 */
	public EReference getCallBack_TroubleTickets() {
        return (EReference)getCallBack().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getStatus()
	 * @see #getCallBack()
	 * @generated
	 */
	public EReference getCallBack_Status() {
        return (EReference)getCallBack().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Detail</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getContactDetail()
	 * @see #getCallBack()
	 * @generated
	 */
	public EAttribute getCallBack_ContactDetail() {
        return (EAttribute)getCallBack().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getProblemInfo()
	 * @see #getCallBack()
	 * @generated
	 */
	public EAttribute getCallBack_ProblemInfo() {
        return (EAttribute)getCallBack().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket <em>Trouble Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trouble Ticket</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket
	 * @generated
	 */
	public EClass getTroubleTicket() {
		if (troubleTicketEClass == null) {
			troubleTicketEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return troubleTicketEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Backs</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EReference getTroubleTicket_CallBacks() {
        return (EReference)getTroubleTicket().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod <em>Trouble Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trouble Period</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EReference getTroubleTicket_TroublePeriod() {
        return (EReference)getTroubleTicket().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Call Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_FirstCallDateTime() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Restore Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_EstimatedRestoreDateTime() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inform Before Restored</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_InformBeforeRestored() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reporting Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_ReportingKind() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getPriority()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_Priority() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Data</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EReference getTroubleTicket_CustomerData() {
        return (EReference)getTroubleTicket().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inform After Restored</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_InformAfterRestored() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advice</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_Advice() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incident Record</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EReference getTroubleTicket_IncidentRecord() {
        return (EReference)getTroubleTicket().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_HazardCode() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Back</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack()
	 * @see #getTroubleTicket()
	 * @generated
	 */
	public EAttribute getTroubleTicket_CallBack() {
        return (EAttribute)getTroubleTicket().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incident Record</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord
	 * @generated
	 */
	public EClass getIncidentRecord() {
		if (incidentRecordEClass == null) {
			incidentRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return incidentRecordEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trouble Tickets</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets()
	 * @see #getIncidentRecord()
	 * @generated
	 */
	public EReference getIncidentRecord_TroubleTickets() {
        return (EReference)getIncidentRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod()
	 * @see #getIncidentRecord()
	 * @generated
	 */
	public EReference getIncidentRecord_Period() {
        return (EReference)getIncidentRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes <em>Incident Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incident Codes</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes()
	 * @see #getIncidentRecord()
	 * @generated
	 */
	public EReference getIncidentRecord_IncidentCodes() {
        return (EReference)getIncidentRecord().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification <em>Outage Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Notification</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification
	 * @generated
	 */
	public EClass getOutageNotification() {
		if (outageNotificationEClass == null) {
			outageNotificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return outageNotificationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Interruption Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount()
	 * @see #getOutageNotification()
	 * @generated
	 */
	public EAttribute getOutageNotification_ExpectedInterruptionCount() {
        return (EAttribute)getOutageNotification().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification#getDuration()
	 * @see #getOutageNotification()
	 * @generated
	 */
	public EAttribute getOutageNotification_Duration() {
        return (EAttribute)getOutageNotification().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Datas</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas()
	 * @see #getOutageNotification()
	 * @generated
	 */
	public EReference getOutageNotification_CustomerDatas() {
        return (EReference)getOutageNotification().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification#getReason()
	 * @see #getOutageNotification()
	 * @generated
	 */
	public EAttribute getOutageNotification_Reason() {
        return (EAttribute)getOutageNotification().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole <em>Outage Step Psr Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outage Step Psr Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole
	 * @generated
	 */
	public EClass getOutageStepPsrRole() {
		if (outageStepPsrRoleEClass == null) {
			outageStepPsrRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return outageStepPsrRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Step</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep()
	 * @see #getOutageStepPsrRole()
	 * @generated
	 */
	public EReference getOutageStepPsrRole_OutageStep() {
        return (EReference)getOutageStepPsrRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment()
	 * @see #getOutageStepPsrRole()
	 * @generated
	 */
	public EReference getOutageStepPsrRole_ConductingEquipment() {
        return (EReference)getOutageStepPsrRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind <em>Switching Step Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Switching Step Status Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @generated
	 */
	public EEnum getSwitchingStepStatusKind() {
		if (switchingStepStatusKindEEnum == null) {
			switchingStepStatusKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return switchingStepStatusKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind <em>Circuit Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Circuit Connection Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @generated
	 */
	public EEnum getCircuitConnectionKind() {
		if (circuitConnectionKindEEnum == null) {
			circuitConnectionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return circuitConnectionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfOperations.PSREventKind <em>PSR Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PSR Event Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREventKind
	 * @generated
	 */
	public EEnum getPSREventKind() {
		if (psrEventKindEEnum == null) {
			psrEventKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return psrEventKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind <em>Trouble Reporting Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trouble Reporting Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @generated
	 */
	public EEnum getTroubleReportingKind() {
		if (troubleReportingKindEEnum == null) {
			troubleReportingKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return troubleReportingKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItemKind <em>Change Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Item Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @generated
	 */
	public EEnum getChangeItemKind() {
		if (changeItemKindEEnum == null) {
			changeItemKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return changeItemKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfOperations.OutageKind <em>Outage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Outage Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageKind
	 * @generated
	 */
	public EEnum getOutageKind() {
		if (outageKindEEnum == null) {
			outageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return outageKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfOperationsFactory getInfOperationsFactory() {
		return (InfOperationsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfOperations." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord <em>Outage Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageRecord()
		 * @generated
		 */
		public static final EClass OUTAGE_RECORD = eINSTANCE.getOutageRecord();

		/**
		 * The meta object literal for the '<em><b>Outage Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_RECORD__OUTAGE_CODES = eINSTANCE.getOutageRecord_OutageCodes();

		/**
		 * The meta object literal for the '<em><b>End Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_RECORD__END_DATE_TIME = eINSTANCE.getOutageRecord_EndDateTime();

		/**
		 * The meta object literal for the '<em><b>Outage Report</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_RECORD__OUTAGE_REPORT = eINSTANCE.getOutageRecord_OutageReport();

		/**
		 * The meta object literal for the '<em><b>Is Planned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_RECORD__IS_PLANNED = eINSTANCE.getOutageRecord_IsPlanned();

		/**
		 * The meta object literal for the '<em><b>Damage Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_RECORD__DAMAGE_CODE = eINSTANCE.getOutageRecord_DamageCode();

		/**
		 * The meta object literal for the '<em><b>Action Taken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_RECORD__ACTION_TAKEN = eINSTANCE.getOutageRecord_ActionTaken();

		/**
		 * The meta object literal for the '<em><b>Outage Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_RECORD__OUTAGE_STEPS = eINSTANCE.getOutageRecord_OutageSteps();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_RECORD__MODE = eINSTANCE.getOutageRecord_Mode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport <em>Outage Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageReport()
		 * @generated
		 */
		public static final EClass OUTAGE_REPORT = eINSTANCE.getOutageReport();

		/**
		 * The meta object literal for the '<em><b>Outage Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_REPORT__OUTAGE_RECORD = eINSTANCE.getOutageReport_OutageRecord();

		/**
		 * The meta object literal for the '<em><b>Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_REPORT__CUSTOMER_COUNT = eINSTANCE.getOutageReport_CustomerCount();

		/**
		 * The meta object literal for the '<em><b>Average Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_REPORT__AVERAGE_CML = eINSTANCE.getOutageReport_AverageCml();

		/**
		 * The meta object literal for the '<em><b>Outage History</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_REPORT__OUTAGE_HISTORY = eINSTANCE.getOutageReport_OutageHistory();

		/**
		 * The meta object literal for the '<em><b>Outage Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_REPORT__OUTAGE_DURATION = eINSTANCE.getOutageReport_OutageDuration();

		/**
		 * The meta object literal for the '<em><b>Total Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_REPORT__TOTAL_CML = eINSTANCE.getOutageReport_TotalCml();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem <em>Change Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItem()
		 * @generated
		 */
		public static final EClass CHANGE_ITEM = eINSTANCE.getChangeItem();

		/**
		 * The meta object literal for the '<em><b>Gml Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__GML_SELECTOR = eINSTANCE.getChangeItem_GmlSelector();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__ORGANISATION = eINSTANCE.getChangeItem_Organisation();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__DOCUMENT = eINSTANCE.getChangeItem_Document();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__ASSET = eINSTANCE.getChangeItem_Asset();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHANGE_ITEM__SEQUENCE_NUMBER = eINSTANCE.getChangeItem_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__STATUS = eINSTANCE.getChangeItem_Status();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHANGE_ITEM__KIND = eINSTANCE.getChangeItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Gml Observation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__GML_OBSERVATION = eINSTANCE.getChangeItem_GmlObservation();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__ERP_PERSON = eINSTANCE.getChangeItem_ErpPerson();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__POWER_SYSTEM_RESOURCE = eINSTANCE.getChangeItem_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Change Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__CHANGE_SET = eINSTANCE.getChangeItem_ChangeSet();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__LOCATION = eINSTANCE.getChangeItem_Location();

		/**
		 * The meta object literal for the '<em><b>Network Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_ITEM__NETWORK_DATA_SET = eINSTANCE.getChangeItem_NetworkDataSet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent <em>PSR Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREvent()
		 * @generated
		 */
		public static final EClass PSR_EVENT = eINSTANCE.getPSREvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PSR_EVENT__KIND = eINSTANCE.getPSREvent_Kind();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PSR_EVENT__POWER_SYSTEM_RESOURCE = eINSTANCE.getPSREvent_PowerSystemResource();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage <em>Planned Outage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getPlannedOutage()
		 * @generated
		 */
		public static final EClass PLANNED_OUTAGE = eINSTANCE.getPlannedOutage();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PLANNED_OUTAGE__KIND = eINSTANCE.getPlannedOutage_Kind();

		/**
		 * The meta object literal for the '<em><b>Customer Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLANNED_OUTAGE__CUSTOMER_DATAS = eINSTANCE.getPlannedOutage_CustomerDatas();

		/**
		 * The meta object literal for the '<em><b>Outage Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PLANNED_OUTAGE__OUTAGE_SCHEDULES = eINSTANCE.getPlannedOutage_OutageSchedules();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection <em>Circuit Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitSection()
		 * @generated
		 */
		public static final EClass CIRCUIT_SECTION = eINSTANCE.getCircuitSection();

		/**
		 * The meta object literal for the '<em><b>Conductor Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CIRCUIT_SECTION__CONDUCTOR_ASSETS = eINSTANCE.getCircuitSection_ConductorAssets();

		/**
		 * The meta object literal for the '<em><b>Connection Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CIRCUIT_SECTION__CONNECTION_KIND = eINSTANCE.getCircuitSection_ConnectionKind();

		/**
		 * The meta object literal for the '<em><b>Circuits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CIRCUIT_SECTION__CIRCUITS = eINSTANCE.getCircuitSection_Circuits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument <em>Safety Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSafetyDocument()
		 * @generated
		 */
		public static final EClass SAFETY_DOCUMENT = eINSTANCE.getSafetyDocument();

		/**
		 * The meta object literal for the '<em><b>Clearance Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SAFETY_DOCUMENT__CLEARANCE_TAGS = eINSTANCE.getSafetyDocument_ClearanceTags();

		/**
		 * The meta object literal for the '<em><b>Schedule Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SAFETY_DOCUMENT__SCHEDULE_STEPS = eINSTANCE.getSafetyDocument_ScheduleSteps();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE = eINSTANCE.getSafetyDocument_PowerSystemResource();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction <em>Operational Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OperationalRestriction
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOperationalRestriction()
		 * @generated
		 */
		public static final EClass OPERATIONAL_RESTRICTION = eINSTANCE.getOperationalRestriction();

		/**
		 * The meta object literal for the '<em><b>Active Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATIONAL_RESTRICTION__ACTIVE_PERIOD = eINSTANCE.getOperationalRestriction_ActivePeriod();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet <em>Change Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeSet()
		 * @generated
		 */
		public static final EClass CHANGE_SET = eINSTANCE.getChangeSet();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_SET__NETWORK_DATA_SETS = eINSTANCE.getChangeSet_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_SET__CHANGE_ITEMS = eINSTANCE.getChangeSet_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_SET__STATUS = eINSTANCE.getChangeSet_Status();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHANGE_SET__DOCUMENTS = eINSTANCE.getChangeSet_Documents();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule <em>Switching Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingSchedule()
		 * @generated
		 */
		public static final EClass SWITCHING_SCHEDULE = eINSTANCE.getSwitchingSchedule();

		/**
		 * The meta object literal for the '<em><b>Schedule Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_SCHEDULE__SCHEDULE_STEPS = eINSTANCE.getSwitchingSchedule_ScheduleSteps();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_SCHEDULE__WORK_TASK = eINSTANCE.getSwitchingSchedule_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCHING_SCHEDULE__REASON = eINSTANCE.getSwitchingSchedule_Reason();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_SCHEDULE__CREWS = eINSTANCE.getSwitchingSchedule_Crews();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_SCHEDULE__INTERVAL = eINSTANCE.getSwitchingSchedule_Interval();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.Circuit <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.Circuit
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuit()
		 * @generated
		 */
		public static final EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '<em><b>Circuit Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CIRCUIT__CIRCUIT_SECTIONS = eINSTANCE.getCircuit_CircuitSections();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet <em>Network Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getNetworkDataSet()
		 * @generated
		 */
		public static final EClass NETWORK_DATA_SET = eINSTANCE.getNetworkDataSet();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NETWORK_DATA_SET__STATUS = eINSTANCE.getNetworkDataSet_Status();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NETWORK_DATA_SET__DOCUMENTS = eINSTANCE.getNetworkDataSet_Documents();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NETWORK_DATA_SET__CHANGE_ITEMS = eINSTANCE.getNetworkDataSet_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NETWORK_DATA_SET__CATEGORY = eINSTANCE.getNetworkDataSet_Category();

		/**
		 * The meta object literal for the '<em><b>Change Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NETWORK_DATA_SET__CHANGE_SETS = eINSTANCE.getNetworkDataSet_ChangeSets();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES = eINSTANCE.getNetworkDataSet_PowerSystemResources();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep <em>Outage Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStep()
		 * @generated
		 */
		public static final EClass OUTAGE_STEP = eINSTANCE.getOutageStep();

		/**
		 * The meta object literal for the '<em><b>Average Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__AVERAGE_CML = eINSTANCE.getOutageStep_AverageCml();

		/**
		 * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__DAMAGE = eINSTANCE.getOutageStep_Damage();

		/**
		 * The meta object literal for the '<em><b>Special Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT = eINSTANCE.getOutageStep_SpecialCustomerCount();

		/**
		 * The meta object literal for the '<em><b>Critical Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT = eINSTANCE.getOutageStep_CriticalCustomerCount();

		/**
		 * The meta object literal for the '<em><b>Estimated Restore Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME = eINSTANCE.getOutageStep_EstimatedRestoreDateTime();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP__CREWS = eINSTANCE.getOutageStep_Crews();

		/**
		 * The meta object literal for the '<em><b>Shock Reported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__SHOCK_REPORTED = eINSTANCE.getOutageStep_ShockReported();

		/**
		 * The meta object literal for the '<em><b>No Power Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP__NO_POWER_INTERVAL = eINSTANCE.getOutageStep_NoPowerInterval();

		/**
		 * The meta object literal for the '<em><b>Caller Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__CALLER_COUNT = eINSTANCE.getOutageStep_CallerCount();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES = eINSTANCE.getOutageStep_ConductingEquipmentRoles();

		/**
		 * The meta object literal for the '<em><b>Fatality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__FATALITY = eINSTANCE.getOutageStep_Fatality();

		/**
		 * The meta object literal for the '<em><b>Job Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__JOB_PRIORITY = eINSTANCE.getOutageStep_JobPriority();

		/**
		 * The meta object literal for the '<em><b>Total Customer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__TOTAL_CUSTOMER_COUNT = eINSTANCE.getOutageStep_TotalCustomerCount();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP__STATUS = eINSTANCE.getOutageStep_Status();

		/**
		 * The meta object literal for the '<em><b>Injury</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__INJURY = eINSTANCE.getOutageStep_Injury();

		/**
		 * The meta object literal for the '<em><b>Outage Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP__OUTAGE_RECORD = eINSTANCE.getOutageStep_OutageRecord();

		/**
		 * The meta object literal for the '<em><b>Total Cml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_STEP__TOTAL_CML = eINSTANCE.getOutageStep_TotalCml();

		/**
		 * The meta object literal for the '<em><b>Outage Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP__OUTAGE_CODES = eINSTANCE.getOutageStep_OutageCodes();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole <em>Org Psr Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOrgPsrRole()
		 * @generated
		 */
		public static final EClass ORG_PSR_ROLE = eINSTANCE.getOrgPsrRole();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORG_PSR_ROLE__ERP_ORGANISATION = eINSTANCE.getOrgPsrRole_ErpOrganisation();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORG_PSR_ROLE__POWER_SYSTEM_RESOURCE = eINSTANCE.getOrgPsrRole_PowerSystemResource();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode <em>Outage Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageCode()
		 * @generated
		 */
		public static final EClass OUTAGE_CODE = eINSTANCE.getOutageCode();

		/**
		 * The meta object literal for the '<em><b>Sub Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_CODE__SUB_CODE = eINSTANCE.getOutageCode_SubCode();

		/**
		 * The meta object literal for the '<em><b>Outage Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_CODE__OUTAGE_RECORDS = eINSTANCE.getOutageCode_OutageRecords();

		/**
		 * The meta object literal for the '<em><b>Outage Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_CODE__OUTAGE_STEPS = eINSTANCE.getOutageCode_OutageSteps();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode <em>Incident Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentCode()
		 * @generated
		 */
		public static final EClass INCIDENT_CODE = eINSTANCE.getIncidentCode();

		/**
		 * The meta object literal for the '<em><b>Incident Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INCIDENT_CODE__INCIDENT_RECORDS = eINSTANCE.getIncidentCode_IncidentRecords();

		/**
		 * The meta object literal for the '<em><b>Sub Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INCIDENT_CODE__SUB_CODE = eINSTANCE.getIncidentCode_SubCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.LandBase <em>Land Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.LandBase
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getLandBase()
		 * @generated
		 */
		public static final EClass LAND_BASE = eINSTANCE.getLandBase();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole <em>Erp Person Schedule Step Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getErpPersonScheduleStepRole()
		 * @generated
		 */
		public static final EClass ERP_PERSON_SCHEDULE_STEP_ROLE = eINSTANCE.getErpPersonScheduleStepRole();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON = eINSTANCE.getErpPersonScheduleStepRole_ErpPerson();

		/**
		 * The meta object literal for the '<em><b>Switching Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP = eINSTANCE.getErpPersonScheduleStepRole_SwitchingStep();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep <em>Switching Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStep()
		 * @generated
		 */
		public static final EClass SWITCHING_STEP = eINSTANCE.getSwitchingStep();

		/**
		 * The meta object literal for the '<em><b>Safety Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_STEP__SAFETY_DOCUMENT = eINSTANCE.getSwitchingStep_SafetyDocument();

		/**
		 * The meta object literal for the '<em><b>Status Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCHING_STEP__STATUS_KIND = eINSTANCE.getSwitchingStep_StatusKind();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCHING_STEP__TEXT = eINSTANCE.getSwitchingStep_Text();

		/**
		 * The meta object literal for the '<em><b>Required Control Action Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL = eINSTANCE.getSwitchingStep_RequiredControlActionInterval();

		/**
		 * The meta object literal for the '<em><b>Required Control Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCHING_STEP__REQUIRED_CONTROL_ACTION = eINSTANCE.getSwitchingStep_RequiredControlAction();

		/**
		 * The meta object literal for the '<em><b>Switching Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_STEP__SWITCHING_SCHEDULE = eINSTANCE.getSwitchingStep_SwitchingSchedule();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_STEP__POWER_SYSTEM_RESOURCES = eINSTANCE.getSwitchingStep_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Erp Person Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SWITCHING_STEP__ERP_PERSON_ROLE = eINSTANCE.getSwitchingStep_ErpPersonRole();

		/**
		 * The meta object literal for the '<em><b>Desired End State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SWITCHING_STEP__DESIRED_END_STATE = eINSTANCE.getSwitchingStep_DesiredEndState();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack <em>Call Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.CallBack
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCallBack()
		 * @generated
		 */
		public static final EClass CALL_BACK = eINSTANCE.getCallBack();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CALL_BACK__APPOINTMENTS = eINSTANCE.getCallBack_Appointments();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CALL_BACK__DATE_TIME = eINSTANCE.getCallBack_DateTime();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CALL_BACK__ERP_PERSONS = eINSTANCE.getCallBack_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CALL_BACK__COMMENT = eINSTANCE.getCallBack_Comment();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CALL_BACK__ADVICE = eINSTANCE.getCallBack_Advice();

		/**
		 * The meta object literal for the '<em><b>Trouble Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CALL_BACK__TROUBLE_TICKETS = eINSTANCE.getCallBack_TroubleTickets();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CALL_BACK__STATUS = eINSTANCE.getCallBack_Status();

		/**
		 * The meta object literal for the '<em><b>Contact Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CALL_BACK__CONTACT_DETAIL = eINSTANCE.getCallBack_ContactDetail();

		/**
		 * The meta object literal for the '<em><b>Problem Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CALL_BACK__PROBLEM_INFO = eINSTANCE.getCallBack_ProblemInfo();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket <em>Trouble Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleTicket()
		 * @generated
		 */
		public static final EClass TROUBLE_TICKET = eINSTANCE.getTroubleTicket();

		/**
		 * The meta object literal for the '<em><b>Call Backs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TROUBLE_TICKET__CALL_BACKS = eINSTANCE.getTroubleTicket_CallBacks();

		/**
		 * The meta object literal for the '<em><b>Trouble Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TROUBLE_TICKET__TROUBLE_PERIOD = eINSTANCE.getTroubleTicket_TroublePeriod();

		/**
		 * The meta object literal for the '<em><b>First Call Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__FIRST_CALL_DATE_TIME = eINSTANCE.getTroubleTicket_FirstCallDateTime();

		/**
		 * The meta object literal for the '<em><b>Estimated Restore Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME = eINSTANCE.getTroubleTicket_EstimatedRestoreDateTime();

		/**
		 * The meta object literal for the '<em><b>Inform Before Restored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__INFORM_BEFORE_RESTORED = eINSTANCE.getTroubleTicket_InformBeforeRestored();

		/**
		 * The meta object literal for the '<em><b>Reporting Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__REPORTING_KIND = eINSTANCE.getTroubleTicket_ReportingKind();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__PRIORITY = eINSTANCE.getTroubleTicket_Priority();

		/**
		 * The meta object literal for the '<em><b>Customer Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TROUBLE_TICKET__CUSTOMER_DATA = eINSTANCE.getTroubleTicket_CustomerData();

		/**
		 * The meta object literal for the '<em><b>Inform After Restored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__INFORM_AFTER_RESTORED = eINSTANCE.getTroubleTicket_InformAfterRestored();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__ADVICE = eINSTANCE.getTroubleTicket_Advice();

		/**
		 * The meta object literal for the '<em><b>Incident Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TROUBLE_TICKET__INCIDENT_RECORD = eINSTANCE.getTroubleTicket_IncidentRecord();

		/**
		 * The meta object literal for the '<em><b>Hazard Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__HAZARD_CODE = eINSTANCE.getTroubleTicket_HazardCode();

		/**
		 * The meta object literal for the '<em><b>Call Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TROUBLE_TICKET__CALL_BACK = eINSTANCE.getTroubleTicket_CallBack();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord <em>Incident Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getIncidentRecord()
		 * @generated
		 */
		public static final EClass INCIDENT_RECORD = eINSTANCE.getIncidentRecord();

		/**
		 * The meta object literal for the '<em><b>Trouble Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INCIDENT_RECORD__TROUBLE_TICKETS = eINSTANCE.getIncidentRecord_TroubleTickets();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INCIDENT_RECORD__PERIOD = eINSTANCE.getIncidentRecord_Period();

		/**
		 * The meta object literal for the '<em><b>Incident Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INCIDENT_RECORD__INCIDENT_CODES = eINSTANCE.getIncidentRecord_IncidentCodes();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification <em>Outage Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageNotification()
		 * @generated
		 */
		public static final EClass OUTAGE_NOTIFICATION = eINSTANCE.getOutageNotification();

		/**
		 * The meta object literal for the '<em><b>Expected Interruption Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT = eINSTANCE.getOutageNotification_ExpectedInterruptionCount();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_NOTIFICATION__DURATION = eINSTANCE.getOutageNotification_Duration();

		/**
		 * The meta object literal for the '<em><b>Customer Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_NOTIFICATION__CUSTOMER_DATAS = eINSTANCE.getOutageNotification_CustomerDatas();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OUTAGE_NOTIFICATION__REASON = eINSTANCE.getOutageNotification_Reason();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole <em>Outage Step Psr Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageStepPsrRole()
		 * @generated
		 */
		public static final EClass OUTAGE_STEP_PSR_ROLE = eINSTANCE.getOutageStepPsrRole();

		/**
		 * The meta object literal for the '<em><b>Outage Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP = eINSTANCE.getOutageStepPsrRole_OutageStep();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT = eINSTANCE.getOutageStepPsrRole_ConductingEquipment();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind <em>Switching Step Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStepStatusKind()
		 * @generated
		 */
		public static final EEnum SWITCHING_STEP_STATUS_KIND = eINSTANCE.getSwitchingStepStatusKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind <em>Circuit Connection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getCircuitConnectionKind()
		 * @generated
		 */
		public static final EEnum CIRCUIT_CONNECTION_KIND = eINSTANCE.getCircuitConnectionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.PSREventKind <em>PSR Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.PSREventKind
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getPSREventKind()
		 * @generated
		 */
		public static final EEnum PSR_EVENT_KIND = eINSTANCE.getPSREventKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind <em>Trouble Reporting Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getTroubleReportingKind()
		 * @generated
		 */
		public static final EEnum TROUBLE_REPORTING_KIND = eINSTANCE.getTroubleReportingKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItemKind <em>Change Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItemKind
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getChangeItemKind()
		 * @generated
		 */
		public static final EEnum CHANGE_ITEM_KIND = eINSTANCE.getChangeItemKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfOperations.OutageKind <em>Outage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfOperations.OutageKind
		 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage#getOutageKind()
		 * @generated
		 */
		public static final EEnum OUTAGE_KIND = eINSTANCE.getOutageKind();

	}

} //InfOperationsPackage
