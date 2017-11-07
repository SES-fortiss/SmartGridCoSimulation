/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

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
 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportFactory
 * @generated
 */
public class InfERPSupportPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfERPSupport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfERPSupport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfERPSupport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfERPSupportPackage eINSTANCE = CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem()
	 * @generated
	 */
	public static final int ERP_REC_DELV_LINE_ITEM = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Receive Delivery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Material Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp PO Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Erp Rec Delv Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Erp Rec Delv Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_DELV_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget <em>Erp Ledger Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerBudget()
	 * @generated
	 */
	public static final int ERP_LEDGER_BUDGET = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Led Bud Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Ledger Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Ledger Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_BUDGET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry <em>Erp Time Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeEntry()
	 * @generated
	 */
	public static final int ERP_TIME_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Time Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY__ERP_TIME_SHEET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_ENTRY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency <em>Erp Competency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpCompetency()
	 * @generated
	 */
	public static final int ERP_COMPETENCY = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Competency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Competency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_COMPETENCY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder <em>Erp Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPurchaseOrder()
	 * @generated
	 */
	public static final int ERP_PURCHASE_ORDER = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PURCHASE_ORDER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder <em>Erp Eng Change Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpEngChangeOrder()
	 * @generated
	 */
	public static final int ERP_ENG_CHANGE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>Erp Eng Change Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erp Eng Change Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ENG_CHANGE_ORDER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting <em>Erp Project Accounting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting()
	 * @generated
	 */
	public static final int ERP_PROJECT_ACCOUNTING = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__WORKS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__PROJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Time Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Erp Project Accounting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Erp Project Accounting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PROJECT_ACCOUNTING_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem <em>Erp Rec Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem()
	 * @generated
	 */
	public static final int ERP_REC_LINE_ITEM = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Receivable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__ERP_RECEIVABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__ERP_PAYMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Erp Rec Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Erp Rec Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REC_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem <em>Erp Payable Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem()
	 * @generated
	 */
	public static final int ERP_PAYABLE_LINE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__ERP_PAYMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__ERP_JOURNAL_ENTRIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Payable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__ERP_PAYABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Erp Payable Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Erp Payable Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem <em>Erp Led Bud Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedBudLineItem()
	 * @generated
	 */
	public static final int ERP_LED_BUD_LINE_ITEM = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Led Bud Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Ledger Budget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Led Bud Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Led Bud Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LED_BUD_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition <em>Erp Requisition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRequisition()
	 * @generated
	 */
	public static final int ERP_REQUISITION = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION__ERP_REQ_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Requisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Requisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQUISITION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation <em>Erp Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation()
	 * @generated
	 */
	public static final int ERP_ORGANISATION = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__UUID = CommonPackage.ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__NAMES = CommonPackage.ORGANISATION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__DIAGRAM_OBJECTS = CommonPackage.ORGANISATION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__MRID = CommonPackage.ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__ALIAS_NAME = CommonPackage.ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__NAME = CommonPackage.ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__MODELING_AUTHORITY_SET = CommonPackage.ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__PHONE2 = CommonPackage.ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__PHONE1 = CommonPackage.ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__STREET_ADDRESS = CommonPackage.ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__POSTAL_ADDRESS = CommonPackage.ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__ELECTRONIC_ADDRESS = CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__BUSINESS_ROLES = CommonPackage.ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__CATEGORY = CommonPackage.ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__CODE = CommonPackage.ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__INDUSTRY_ID = CommonPackage.ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__GOVERNMENT_ID = CommonPackage.ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__ASSET_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__REQUESTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__OPT_OUT = CommonPackage.ORGANISATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__CREWS = CommonPackage.ORGANISATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__CHANGE_ITEMS = CommonPackage.ORGANISATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__ERP_PERSON_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__IS_COST_CENTER = CommonPackage.ORGANISATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__IS_PROFIT_CENTER = CommonPackage.ORGANISATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__ACTIVITY_RECORDS = CommonPackage.ORGANISATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__PARENT_ORGANISATION_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__LOCATIONS = CommonPackage.ORGANISATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__CHILD_ORGANISATION_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__LAND_PROPERTY_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__DOCUMENT_ROLES = CommonPackage.ORGANISATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION__MODE = CommonPackage.ORGANISATION_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Erp Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION_FEATURE_COUNT = CommonPackage.ORGANISATION_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Erp Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ORGANISATION_OPERATION_COUNT = CommonPackage.ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice <em>Erp Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice()
	 * @generated
	 */
	public static final int ERP_INVOICE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mailed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__MAILED_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__TRANSACTION_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__DUE_DATE = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bill Media Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__BILL_MEDIA_KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__REFERENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transfer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__TRANSFER_TYPE = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pro Forma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__PRO_FORMA = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE__CUSTOMER_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Erp Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Erp Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole <em>Doc Erp Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocErpPersonRole()
	 * @generated
	 */
	public static final int DOC_ERP_PERSON_ROLE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__DOCUMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ERP_PERSON_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount <em>Erp Bank Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBankAccount()
	 * @generated
	 */
	public static final int ERP_BANK_ACCOUNT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__UUID = InfCommonPackage.BANK_ACCOUNT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__NAMES = InfCommonPackage.BANK_ACCOUNT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__DIAGRAM_OBJECTS = InfCommonPackage.BANK_ACCOUNT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__MRID = InfCommonPackage.BANK_ACCOUNT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ALIAS_NAME = InfCommonPackage.BANK_ACCOUNT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__NAME = InfCommonPackage.BANK_ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__MODELING_AUTHORITY_SET = InfCommonPackage.BANK_ACCOUNT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__CHANGE_ITEMS = InfCommonPackage.BANK_ACCOUNT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__TO_DOCUMENT_ROLES = InfCommonPackage.BANK_ACCOUNT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ELECTRONIC_ADDRESS = InfCommonPackage.BANK_ACCOUNT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__REVISION_NUMBER = InfCommonPackage.BANK_ACCOUNT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__NETWORK_DATA_SETS = InfCommonPackage.BANK_ACCOUNT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__FROM_DOCUMENT_ROLES = InfCommonPackage.BANK_ACCOUNT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__SCHEDULE_PARAMETER_INFOS = InfCommonPackage.BANK_ACCOUNT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ERP_ORGANISATION_ROLES = InfCommonPackage.BANK_ACCOUNT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__CREATED_DATE_TIME = InfCommonPackage.BANK_ACCOUNT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__MEASUREMENTS = InfCommonPackage.BANK_ACCOUNT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__LAST_MODIFIED_DATE_TIME = InfCommonPackage.BANK_ACCOUNT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ACTIVITY_RECORDS = InfCommonPackage.BANK_ACCOUNT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__SUBJECT = InfCommonPackage.BANK_ACCOUNT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__CHANGE_SETS = InfCommonPackage.BANK_ACCOUNT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ERP_PERSON_ROLES = InfCommonPackage.BANK_ACCOUNT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__SCHEDULED_EVENTS = InfCommonPackage.BANK_ACCOUNT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__TITLE = InfCommonPackage.BANK_ACCOUNT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__DOC_STATUS = InfCommonPackage.BANK_ACCOUNT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ASSET_ROLES = InfCommonPackage.BANK_ACCOUNT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__STATUS = InfCommonPackage.BANK_ACCOUNT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = InfCommonPackage.BANK_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__CATEGORY = InfCommonPackage.BANK_ACCOUNT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Service Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__SERVICE_SUPPLIER = InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__BANK = InfCommonPackage.BANK_ACCOUNT__BANK;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__ACCOUNT_NUMBER = InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER;

	/**
	 * The feature id for the '<em><b>Bank ABA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT__BANK_ABA = InfCommonPackage.BANK_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT_FEATURE_COUNT = InfCommonPackage.BANK_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BANK_ACCOUNT_OPERATION_COUNT = InfCommonPackage.BANK_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuote <em>Erp Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuote
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuote()
	 * @generated
	 */
	public static final int ERP_QUOTE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE__ERP_QUOTE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson <em>Erp Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson()
	 * @generated
	 */
	public static final int ERP_PERSON = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__SERVICE_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__APPOINTMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Labor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__LABOR_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Land Property Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__LAND_PROPERTY_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__ACTIVITY_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__MEASUREMENT_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__SKILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__LAST_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Landline Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__LANDLINE_PHONE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Mobile Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__MOBILE_PHONE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__FIRST_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__GOVERNMENT_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Erp Personnel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__ERP_PERSONNEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Crafts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__CRAFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Customer Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__CUSTOMER_DATA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Call Backs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__CALL_BACKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__MNAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__SUFFIX = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Special Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__SPECIAL_NEED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__PREFIX = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Switching Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__SWITCHING_STEP_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Erp Competency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON__ERP_COMPETENCY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Erp Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 29;

	/**
	 * The number of operations of the '<em>Erp Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSON_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster <em>Erp Item Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpItemMaster()
	 * @generated
	 */
	public static final int ERP_ITEM_MASTER = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Item Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Item Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ITEM_MASTER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM <em>Erp BOM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBOM()
	 * @generated
	 */
	public static final int ERP_BOM = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__DESIGN = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM__ERP_BOM_ITEM_DATAS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount <em>Erp Inventory Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventoryCount()
	 * @generated
	 */
	public static final int ERP_INVENTORY_COUNT = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Material Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__MATERIAL_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT__ASSET_MODEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Inventory Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Inventory Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_COUNT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory <em>Erp Issue Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpIssueInventory()
	 * @generated
	 */
	public static final int ERP_ISSUE_INVENTORY = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Issue Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Issue Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_ISSUE_INVENTORY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable <em>Erp Payable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayable()
	 * @generated
	 */
	public static final int ERP_PAYABLE = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Contractor Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__CONTRACTOR_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Payable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Payable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYABLE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedger <em>Erp Ledger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedger
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedger()
	 * @generated
	 */
	public static final int ERP_LEDGER = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER__ERP_LEDGER_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem <em>Erp PO Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem()
	 * @generated
	 */
	public static final int ERP_PO_LINE_ITEM = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Purchase Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Rec Del Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Material Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__MATERIAL_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Req Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Erp PO Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Erp PO Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PO_LINE_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry <em>Erp Ledger Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry()
	 * @generated
	 */
	public static final int ERP_LEDGER_ENTRY = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__ACCOUNT_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Ledger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__ERP_LEDGER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__USER_ATTRIBUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Jounal Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__POSTED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY__ACCOUNT_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Erp Ledger Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Erp Ledger Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_LEDGER_ENTRY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment <em>Erp Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment()
	 * @generated
	 */
	public static final int ERP_PAYMENT = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ERP_REC_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terms Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT__TERMS_PAYMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Erp Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Erp Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PAYMENT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable <em>Erp Receivable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceivable()
	 * @generated
	 */
	public static final int ERP_RECEIVABLE = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE__ERP_REC_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Receivable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Receivable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVABLE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole <em>Doc Org Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocOrgRole()
	 * @generated
	 */
	public static final int DOC_ORG_ROLE = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__DOCUMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ORG_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem <em>Erp Req Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem()
	 * @generated
	 */
	public static final int ERP_REQ_LINE_ITEM = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__ERP_REQUISITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__TYPE_MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__DELIVERY_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp PO Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Erp Req Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Erp Req Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_REQ_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet <em>Erp Time Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeSheet()
	 * @generated
	 */
	public static final int ERP_TIME_SHEET = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Time Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET__ERP_TIME_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Time Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Time Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_TIME_SHEET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory <em>Erp Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventory()
	 * @generated
	 */
	public static final int ERP_INVENTORY = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVENTORY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts <em>Erp Chart Of Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpChartOfAccounts()
	 * @generated
	 */
	public static final int ERP_CHART_OF_ACCOUNTS = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>Erp Chart Of Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erp Chart Of Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_CHART_OF_ACCOUNTS_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData <em>Erp Site Level Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSiteLevelData()
	 * @generated
	 */
	public static final int ERP_SITE_LEVEL_DATA = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Land Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA__LAND_PROPERTY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Site Level Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Site Level Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SITE_LEVEL_DATA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole <em>Org Erp Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgErpPersonRole()
	 * @generated
	 */
	public static final int ORG_ERP_PERSON_ROLE = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__ERP_PERSON = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE__CLIENT_ID = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org Erp Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ERP_PERSON_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery <em>Erp Receive Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceiveDelivery()
	 * @generated
	 */
	public static final int ERP_RECEIVE_DELIVERY = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Receive Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Receive Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_RECEIVE_DELIVERY_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder <em>Erp Sales Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSalesOrder()
	 * @generated
	 */
	public static final int ERP_SALES_ORDER = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The number of structural features of the '<em>Erp Sales Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erp Sales Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_SALES_ORDER_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry <em>Erp Journal Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry()
	 * @generated
	 */
	public static final int ERP_JOURNAL_ENTRY = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__SOURCE_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__COST_TYPES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Posting Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__POSTING_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Journal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ERP_JOURNAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY__ACCOUNT_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Erp Journal Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Erp Journal Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_ENTRY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem()
	 * @generated
	 */
	public static final int ERP_INVOICE_LINE_ITEM = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__LINE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gl Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__GL_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__LINE_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Net Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__NET_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Billing Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Rec Delv Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Erp Payable Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Component Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Line Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__LINE_VERSION = CommonPackage.DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Gl Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__GL_ACCOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bill Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__BILL_PERIOD = CommonPackage.DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Erp Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_INVOICE = CommonPackage.DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Previous Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Erp Rec Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Erp Invoice Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Erp Invoice Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_INVOICE_LINE_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole <em>Org Org Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgOrgRole()
	 * @generated
	 */
	public static final int ORG_ORG_ROLE = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Parent Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__PARENT_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__CHILD_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE__CLIENT_ID = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org Org Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ORG_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournal <em>Erp Journal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournal
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournal()
	 * @generated
	 */
	public static final int ERP_JOURNAL = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL__ERP_JOURNAL_ENTRIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Erp Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Erp Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_JOURNAL_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel <em>Erp Personnel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPersonnel()
	 * @generated
	 */
	public static final int ERP_PERSONNEL = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erp Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erp Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_PERSONNEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem <em>Erp Quote Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem()
	 * @generated
	 */
	public static final int ERP_QUOTE_LINE_ITEM = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Erp Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__ERP_QUOTE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__DESIGN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Req Line Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM__REQUEST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Erp Quote Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Erp Quote Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_QUOTE_LINE_ITEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData <em>Erp Bom Item Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBomItemData()
	 * @generated
	 */
	public static final int ERP_BOM_ITEM_DATA = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__TYPE_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp BOM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__ERP_BOM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA__DESIGN_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Erp Bom Item Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Erp Bom Item Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ERP_BOM_ITEM_DATA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind <em>Erp Invoice Line Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItemKind()
	 * @generated
	 */
	public static final int ERP_INVOICE_LINE_ITEM_KIND = 43;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind <em>Erp Invoice Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceKind()
	 * @generated
	 */
	public static final int ERP_INVOICE_KIND = 44;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind <em>Erp Account Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpAccountKind()
	 * @generated
	 */
	public static final int ERP_ACCOUNT_KIND = 45;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind <em>Bill Media Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getBillMediaKind()
	 * @generated
	 */
	public static final int BILL_MEDIA_KIND = 46;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpRecDelvLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpLedgerBudgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpTimeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpCompetencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPurchaseOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpEngChangeOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpProjectAccountingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpRecLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPayableLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpLedBudLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpRequisitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpOrganisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpInvoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docErpPersonRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpBankAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpQuoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpItemMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpBOMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpInventoryCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpIssueInventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPayableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpLedgerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPOLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpLedgerEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpReceivableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docOrgRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpReqLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpTimeSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpInventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpChartOfAccountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpSiteLevelDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgErpPersonRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpReceiveDeliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpSalesOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpJournalEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpInvoiceLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgOrgRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpJournalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpPersonnelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpQuoteLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erpBomItemDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum erpInvoiceLineItemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum erpInvoiceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum erpAccountKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum billMediaKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfERPSupportPackage() {
		super(eNS_URI, InfERPSupportFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfERPSupportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfERPSupportPackage init() {
		if (isInited) return (InfERPSupportPackage)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI);

		// Obtain or create and register package
		InfERPSupportPackage theInfERPSupportPackage = (InfERPSupportPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfERPSupportPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfERPSupportPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		CIM15Package theCIM15Package = (CIM15Package)(EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) instanceof CIM15Package ? EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) : CIM15Package.eINSTANCE);
		IEC61970Package theIEC61970Package = (IEC61970Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		SCADAPackage theSCADAPackage = (SCADAPackage)(EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) instanceof SCADAPackage ? EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) : SCADAPackage.eINSTANCE);
		ProductionPackage theProductionPackage = (ProductionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		GenerationDynamicsPackage theGenerationDynamicsPackage = (GenerationDynamicsPackage)(EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) instanceof GenerationDynamicsPackage ? EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) : GenerationDynamicsPackage.eINSTANCE);
		InfWorkPackage theInfWorkPackage = (InfWorkPackage)(EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) instanceof InfWorkPackage ? EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) : InfWorkPackage.eINSTANCE);
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
		theInfERPSupportPackage.fixPackageContents();
		theCIM15Package.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theProductionPackage.fixPackageContents();
		theGenerationDynamicsPackage.fixPackageContents();
		theInfWorkPackage.fixPackageContents();
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
		theInfERPSupportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfERPSupportPackage.eNS_URI, theInfERPSupportPackage);
		return theInfERPSupportPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Rec Delv Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem
	 * @generated
	 */
	public EClass getErpRecDelvLineItem() {
		if (erpRecDelvLineItemEClass == null) {
			erpRecDelvLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(0);
		}
		return erpRecDelvLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public EReference getErpRecDelvLineItem_Assets() {
        return (EReference)getErpRecDelvLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public EReference getErpRecDelvLineItem_ErpInvoiceLineItem() {
        return (EReference)getErpRecDelvLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public EReference getErpRecDelvLineItem_Status() {
        return (EReference)getErpRecDelvLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Receive Delivery</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public EReference getErpRecDelvLineItem_ErpReceiveDelivery() {
        return (EReference)getErpRecDelvLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public EReference getErpRecDelvLineItem_MaterialItems() {
        return (EReference)getErpRecDelvLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp PO Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem()
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public EReference getErpRecDelvLineItem_ErpPOLineItem() {
        return (EReference)getErpRecDelvLineItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Ledger Budget</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget
	 * @generated
	 */
	public EClass getErpLedgerBudget() {
		if (erpLedgerBudgetEClass == null) {
			erpLedgerBudgetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(1);
		}
		return erpLedgerBudgetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Led Bud Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems()
	 * @see #getErpLedgerBudget()
	 * @generated
	 */
	public EReference getErpLedgerBudget_ErpLedBudLineItems() {
        return (EReference)getErpLedgerBudget().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry <em>Erp Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Time Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry
	 * @generated
	 */
	public EClass getErpTimeEntry() {
		if (erpTimeEntryEClass == null) {
			erpTimeEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(2);
		}
		return erpTimeEntryEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Project Accounting</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting()
	 * @see #getErpTimeEntry()
	 * @generated
	 */
	public EReference getErpTimeEntry_ErpProjectAccounting() {
        return (EReference)getErpTimeEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus()
	 * @see #getErpTimeEntry()
	 * @generated
	 */
	public EReference getErpTimeEntry_Status() {
        return (EReference)getErpTimeEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Time Sheet</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet()
	 * @see #getErpTimeEntry()
	 * @generated
	 */
	public EReference getErpTimeEntry_ErpTimeSheet() {
        return (EReference)getErpTimeEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency <em>Erp Competency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Competency</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency
	 * @generated
	 */
	public EClass getErpCompetency() {
		if (erpCompetencyEClass == null) {
			erpCompetencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(3);
		}
		return erpCompetencyEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons()
	 * @see #getErpCompetency()
	 * @generated
	 */
	public EReference getErpCompetency_ErpPersons() {
        return (EReference)getErpCompetency().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Purchase Order</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder
	 * @generated
	 */
	public EClass getErpPurchaseOrder() {
		if (erpPurchaseOrderEClass == null) {
			erpPurchaseOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(4);
		}
		return erpPurchaseOrderEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp PO Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems()
	 * @see #getErpPurchaseOrder()
	 * @generated
	 */
	public EReference getErpPurchaseOrder_ErpPOLineItems() {
        return (EReference)getErpPurchaseOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder <em>Erp Eng Change Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Eng Change Order</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder
	 * @generated
	 */
	public EClass getErpEngChangeOrder() {
		if (erpEngChangeOrderEClass == null) {
			erpEngChangeOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(5);
		}
		return erpEngChangeOrderEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Project Accounting</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting
	 * @generated
	 */
	public EClass getErpProjectAccounting() {
		if (erpProjectAccountingEClass == null) {
			erpProjectAccountingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(6);
		}
		return erpProjectAccountingEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	public EReference getErpProjectAccounting_Works() {
        return (EReference)getErpProjectAccounting().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	public EReference getErpProjectAccounting_Projects() {
        return (EReference)getErpProjectAccounting().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Time Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	public EReference getErpProjectAccounting_ErpTimeEntries() {
        return (EReference)getErpProjectAccounting().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Cost Details</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails()
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	public EReference getErpProjectAccounting_WorkCostDetails() {
        return (EReference)getErpProjectAccounting().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem <em>Erp Rec Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Rec Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem
	 * @generated
	 */
	public EClass getErpRecLineItem() {
		if (erpRecLineItemEClass == null) {
			erpRecLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(7);
		}
		return erpRecLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable <em>Erp Receivable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Receivable</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpReceivable()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	public EReference getErpRecLineItem_ErpReceivable() {
        return (EReference)getErpRecLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getStatus()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	public EReference getErpRecLineItem_Status() {
        return (EReference)getErpRecLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	public EReference getErpRecLineItem_ErpInvoiceLineItem() {
        return (EReference)getErpRecLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payments</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	public EReference getErpRecLineItem_ErpPayments() {
        return (EReference)getErpRecLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries()
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	public EReference getErpRecLineItem_ErpJournalEntries() {
        return (EReference)getErpRecLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem <em>Erp Payable Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Payable Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem
	 * @generated
	 */
	public EClass getErpPayableLineItem() {
		if (erpPayableLineItemEClass == null) {
			erpPayableLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(10);
		}
		return erpPayableLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payments</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	public EReference getErpPayableLineItem_ErpPayments() {
        return (EReference)getErpPayableLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	public EReference getErpPayableLineItem_ErpJournalEntries() {
        return (EReference)getErpPayableLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	public EReference getErpPayableLineItem_ErpInvoiceLineItem() {
        return (EReference)getErpPayableLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable <em>Erp Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Payable</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayable()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	public EReference getErpPayableLineItem_ErpPayable() {
        return (EReference)getErpPayableLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getStatus()
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	public EReference getErpPayableLineItem_Status() {
        return (EReference)getErpPayableLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Led Bud Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem
	 * @generated
	 */
	public EClass getErpLedBudLineItem() {
		if (erpLedBudLineItemEClass == null) {
			erpLedBudLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(11);
		}
		return erpLedBudLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Led Bud Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem()
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	public EReference getErpLedBudLineItem_ErpLedBudLineItem() {
        return (EReference)getErpLedBudLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger Budget</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget()
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	public EReference getErpLedBudLineItem_ErpLedgerBudget() {
        return (EReference)getErpLedBudLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus()
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	public EReference getErpLedBudLineItem_Status() {
        return (EReference)getErpLedBudLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition <em>Erp Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Requisition</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition
	 * @generated
	 */
	public EClass getErpRequisition() {
		if (erpRequisitionEClass == null) {
			erpRequisitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(12);
		}
		return erpRequisitionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Req Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems()
	 * @see #getErpRequisition()
	 * @generated
	 */
	public EReference getErpRequisition_ErpReqLineItems() {
        return (EReference)getErpRequisition().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation
	 * @generated
	 */
	public EClass getErpOrganisation() {
		if (erpOrganisationEClass == null) {
			erpOrganisationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(13);
		}
		return erpOrganisationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_Category() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_Code() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Industry ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_IndustryID() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Government ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_GovernmentID() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles <em>Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_AssetRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requests</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_Requests() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt Out</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_OptOut() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_Crews() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_ChangeItems() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Person Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_ErpPersonRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cost Center</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_IsCostCenter() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Profit Center</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_IsProfitCenter() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_ActivityRecords() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles <em>Parent Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Organisation Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_ParentOrganisationRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_Locations() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles <em>Child Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Organisation Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_ChildOrganisationRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resource Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_PowerSystemResourceRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Property Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_LandPropertyRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EReference getErpOrganisation_DocumentRoles() {
        return (EReference)getErpOrganisation().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode()
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public EAttribute getErpOrganisation_Mode() {
        return (EAttribute)getErpOrganisation().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Invoice</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice
	 * @generated
	 */
	public EClass getErpInvoice() {
		if (erpInvoiceEClass == null) {
			erpInvoiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(14);
		}
		return erpInvoiceEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EReference getErpInvoice_ErpInvoiceLineItems() {
        return (EReference)getErpInvoice().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mailed Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_MailedDate() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_TransactionDateTime() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_Amount() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_DueDate() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Media Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_BillMediaKind() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_ReferenceNumber() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_Kind() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_TransferType() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pro Forma</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EAttribute getErpInvoice_ProForma() {
        return (EAttribute)getErpInvoice().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount()
	 * @see #getErpInvoice()
	 * @generated
	 */
	public EReference getErpInvoice_CustomerAccount() {
        return (EReference)getErpInvoice().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole <em>Doc Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Erp Person Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole
	 * @generated
	 */
	public EClass getDocErpPersonRole() {
		if (docErpPersonRoleEClass == null) {
			docErpPersonRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(15);
		}
		return docErpPersonRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument()
	 * @see #getDocErpPersonRole()
	 * @generated
	 */
	public EReference getDocErpPersonRole_Document() {
        return (EReference)getDocErpPersonRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson()
	 * @see #getDocErpPersonRole()
	 * @generated
	 */
	public EReference getDocErpPersonRole_ErpPerson() {
        return (EReference)getDocErpPersonRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount <em>Erp Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Bank Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount
	 * @generated
	 */
	public EClass getErpBankAccount() {
		if (erpBankAccountEClass == null) {
			erpBankAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(16);
		}
		return erpBankAccountEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank ABA</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA()
	 * @see #getErpBankAccount()
	 * @generated
	 */
	public EAttribute getErpBankAccount_BankABA() {
        return (EAttribute)getErpBankAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuote <em>Erp Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Quote</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuote
	 * @generated
	 */
	public EClass getErpQuote() {
		if (erpQuoteEClass == null) {
			erpQuoteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(18);
		}
		return erpQuoteEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Quote Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems()
	 * @see #getErpQuote()
	 * @generated
	 */
	public EReference getErpQuote_ErpQuoteLineItems() {
        return (EReference)getErpQuote().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Person</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson
	 * @generated
	 */
	public EClass getErpPerson() {
		if (erpPersonEClass == null) {
			erpPersonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(19);
		}
		return erpPersonEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ServiceLocation() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ErpOrganisationRoles() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_Appointments() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_Crews() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_Category() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems <em>Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_LaborItems() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Property Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_LandPropertyRoles() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ActivityRecords() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_MeasurementValues() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_Skills() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_LastName() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone <em>Landline Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Landline Phone</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_LandlinePhone() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone <em>Mobile Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mobile Phone</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_MobilePhone() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ChangeItems() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_FirstName() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_Status() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getDocumentRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_DocumentRoles() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Government ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_GovernmentID() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Personnel</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ErpPersonnel() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts <em>Crafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crafts</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_Crafts() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Data</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_CustomerData() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Call Backs</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_CallBacks() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MName</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMName()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_MName() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_Suffix() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Need</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_SpecialNeed() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EAttribute getErpPerson_Prefix() {
        return (EAttribute)getErpPerson().getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles <em>Switching Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switching Step Roles</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_SwitchingStepRoles() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ElectronicAddress() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(27);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency <em>Erp Competency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Competency</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency()
	 * @see #getErpPerson()
	 * @generated
	 */
	public EReference getErpPerson_ErpCompetency() {
        return (EReference)getErpPerson().getEStructuralFeatures().get(28);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster <em>Erp Item Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Item Master</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster
	 * @generated
	 */
	public EClass getErpItemMaster() {
		if (erpItemMasterEClass == null) {
			erpItemMasterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(20);
		}
		return erpItemMasterEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset()
	 * @see #getErpItemMaster()
	 * @generated
	 */
	public EReference getErpItemMaster_Asset() {
        return (EReference)getErpItemMaster().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster#getStatus()
	 * @see #getErpItemMaster()
	 * @generated
	 */
	public EReference getErpItemMaster_Status() {
        return (EReference)getErpItemMaster().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM <em>Erp BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp BOM</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM
	 * @generated
	 */
	public EClass getErpBOM() {
		if (erpBOMEClass == null) {
			erpBOMEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(21);
		}
		return erpBOMEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign()
	 * @see #getErpBOM()
	 * @generated
	 */
	public EReference getErpBOM_Design() {
        return (EReference)getErpBOM().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Bom Item Datas</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas()
	 * @see #getErpBOM()
	 * @generated
	 */
	public EReference getErpBOM_ErpBomItemDatas() {
        return (EReference)getErpBOM().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount <em>Erp Inventory Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Inventory Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount
	 * @generated
	 */
	public EClass getErpInventoryCount() {
		if (erpInventoryCountEClass == null) {
			erpInventoryCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(22);
		}
		return erpInventoryCountEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus()
	 * @see #getErpInventoryCount()
	 * @generated
	 */
	public EReference getErpInventoryCount_Status() {
        return (EReference)getErpInventoryCount().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem()
	 * @see #getErpInventoryCount()
	 * @generated
	 */
	public EReference getErpInventoryCount_MaterialItem() {
        return (EReference)getErpInventoryCount().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel()
	 * @see #getErpInventoryCount()
	 * @generated
	 */
	public EReference getErpInventoryCount_AssetModel() {
        return (EReference)getErpInventoryCount().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory <em>Erp Issue Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Issue Inventory</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory
	 * @generated
	 */
	public EClass getErpIssueInventory() {
		if (erpIssueInventoryEClass == null) {
			erpIssueInventoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(23);
		}
		return erpIssueInventoryEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset()
	 * @see #getErpIssueInventory()
	 * @generated
	 */
	public EReference getErpIssueInventory_TypeAsset() {
        return (EReference)getErpIssueInventory().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus()
	 * @see #getErpIssueInventory()
	 * @generated
	 */
	public EReference getErpIssueInventory_Status() {
        return (EReference)getErpIssueInventory().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial()
	 * @see #getErpIssueInventory()
	 * @generated
	 */
	public EReference getErpIssueInventory_TypeMaterial() {
        return (EReference)getErpIssueInventory().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable <em>Erp Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Payable</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable
	 * @generated
	 */
	public EClass getErpPayable() {
		if (erpPayableEClass == null) {
			erpPayableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(24);
		}
		return erpPayableEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contractor Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems()
	 * @see #getErpPayable()
	 * @generated
	 */
	public EReference getErpPayable_ContractorItems() {
        return (EReference)getErpPayable().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payable Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable#getErpPayableLineItems()
	 * @see #getErpPayable()
	 * @generated
	 */
	public EReference getErpPayable_ErpPayableLineItems() {
        return (EReference)getErpPayable().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedger <em>Erp Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Ledger</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedger
	 * @generated
	 */
	public EClass getErpLedger() {
		if (erpLedgerEClass == null) {
			erpLedgerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(25);
		}
		return erpLedgerEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Ledger Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries()
	 * @see #getErpLedger()
	 * @generated
	 */
	public EReference getErpLedger_ErpLedgerEntries() {
        return (EReference)getErpLedger().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp PO Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem
	 * @generated
	 */
	public EClass getErpPOLineItem() {
		if (erpPOLineItemEClass == null) {
			erpPOLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(26);
		}
		return erpPOLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Purchase Order</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	public EReference getErpPOLineItem_ErpPurchaseOrder() {
        return (EReference)getErpPOLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Rec Del Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	public EReference getErpPOLineItem_ErpRecDelLineItem() {
        return (EReference)getErpPOLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model Catalogue Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	public EReference getErpPOLineItem_AssetModelCatalogueItem() {
        return (EReference)getErpPOLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	public EReference getErpPOLineItem_MaterialItem() {
        return (EReference)getErpPOLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Req Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem()
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	public EReference getErpPOLineItem_ErpReqLineItem() {
        return (EReference)getErpPOLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Ledger Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry
	 * @generated
	 */
	public EClass getErpLedgerEntry() {
		if (erpLedgerEntryEClass == null) {
			erpLedgerEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(27);
		}
		return erpLedgerEntryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EAttribute getErpLedgerEntry_TransactionDateTime() {
        return (EAttribute)getErpLedgerEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EAttribute getErpLedgerEntry_AccountKind() {
        return (EAttribute)getErpLedgerEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger <em>Erp Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EReference getErpLedgerEntry_ErpLedger() {
        return (EReference)getErpLedgerEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EReference getErpLedgerEntry_Status() {
        return (EReference)getErpLedgerEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EReference getErpLedgerEntry_ErpLedgerEntry() {
        return (EReference)getErpLedgerEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EReference getErpLedgerEntry_UserAttributes() {
        return (EReference)getErpLedgerEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EAttribute getErpLedgerEntry_Amount() {
        return (EAttribute)getErpLedgerEntry().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Jounal Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EReference getErpLedgerEntry_ErpJounalEntry() {
        return (EReference)getErpLedgerEntry().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EAttribute getErpLedgerEntry_PostedDateTime() {
        return (EAttribute)getErpLedgerEntry().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID()
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public EAttribute getErpLedgerEntry_AccountID() {
        return (EAttribute)getErpLedgerEntry().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment <em>Erp Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Payment</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment
	 * @generated
	 */
	public EClass getErpPayment() {
		if (erpPaymentEClass == null) {
			erpPaymentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(28);
		}
		return erpPaymentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems()
	 * @see #getErpPayment()
	 * @generated
	 */
	public EReference getErpPayment_ErpRecLineItems() {
        return (EReference)getErpPayment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payable Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems()
	 * @see #getErpPayment()
	 * @generated
	 */
	public EReference getErpPayment_ErpPayableLineItems() {
        return (EReference)getErpPayment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems()
	 * @see #getErpPayment()
	 * @generated
	 */
	public EReference getErpPayment_ErpInvoiceLineItems() {
        return (EReference)getErpPayment().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Payment</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment()
	 * @see #getErpPayment()
	 * @generated
	 */
	public EAttribute getErpPayment_TermsPayment() {
        return (EAttribute)getErpPayment().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable <em>Erp Receivable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Receivable</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable
	 * @generated
	 */
	public EClass getErpReceivable() {
		if (erpReceivableEClass == null) {
			erpReceivableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(29);
		}
		return erpReceivableEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable#getErpRecLineItems()
	 * @see #getErpReceivable()
	 * @generated
	 */
	public EReference getErpReceivable_ErpRecLineItems() {
        return (EReference)getErpReceivable().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole <em>Doc Org Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Org Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole
	 * @generated
	 */
	public EClass getDocOrgRole() {
		if (docOrgRoleEClass == null) {
			docOrgRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(30);
		}
		return docOrgRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument()
	 * @see #getDocOrgRole()
	 * @generated
	 */
	public EReference getDocOrgRole_Document() {
        return (EReference)getDocOrgRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation()
	 * @see #getDocOrgRole()
	 * @generated
	 */
	public EReference getDocOrgRole_ErpOrganisation() {
        return (EReference)getDocOrgRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Req Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem
	 * @generated
	 */
	public EClass getErpReqLineItem() {
		if (erpReqLineItemEClass == null) {
			erpReqLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(31);
		}
		return erpReqLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EReference getErpReqLineItem_ErpQuoteLineItem() {
        return (EReference)getErpReqLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EReference getErpReqLineItem_Status() {
        return (EReference)getErpReqLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EAttribute getErpReqLineItem_Cost() {
        return (EAttribute)getErpReqLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Requisition</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EReference getErpReqLineItem_ErpRequisition() {
        return (EReference)getErpReqLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EAttribute getErpReqLineItem_Quantity() {
        return (EAttribute)getErpReqLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EReference getErpReqLineItem_TypeMaterial() {
        return (EReference)getErpReqLineItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EAttribute getErpReqLineItem_DeliveryDate() {
        return (EAttribute)getErpReqLineItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp PO Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EReference getErpReqLineItem_ErpPOLineItem() {
        return (EReference)getErpReqLineItem().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EAttribute getErpReqLineItem_Code() {
        return (EAttribute)getErpReqLineItem().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset()
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public EReference getErpReqLineItem_TypeAsset() {
        return (EReference)getErpReqLineItem().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet <em>Erp Time Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Time Sheet</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet
	 * @generated
	 */
	public EClass getErpTimeSheet() {
		if (erpTimeSheetEClass == null) {
			erpTimeSheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(32);
		}
		return erpTimeSheetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Time Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries()
	 * @see #getErpTimeSheet()
	 * @generated
	 */
	public EReference getErpTimeSheet_ErpTimeEntries() {
        return (EReference)getErpTimeSheet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory <em>Erp Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Inventory</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory
	 * @generated
	 */
	public EClass getErpInventory() {
		if (erpInventoryEClass == null) {
			erpInventoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(33);
		}
		return erpInventoryEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset()
	 * @see #getErpInventory()
	 * @generated
	 */
	public EReference getErpInventory_Asset() {
        return (EReference)getErpInventory().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory#getStatus()
	 * @see #getErpInventory()
	 * @generated
	 */
	public EReference getErpInventory_Status() {
        return (EReference)getErpInventory().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts <em>Erp Chart Of Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Chart Of Accounts</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts
	 * @generated
	 */
	public EClass getErpChartOfAccounts() {
		if (erpChartOfAccountsEClass == null) {
			erpChartOfAccountsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(34);
		}
		return erpChartOfAccountsEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData <em>Erp Site Level Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Site Level Data</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData
	 * @generated
	 */
	public EClass getErpSiteLevelData() {
		if (erpSiteLevelDataEClass == null) {
			erpSiteLevelDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(35);
		}
		return erpSiteLevelDataEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus()
	 * @see #getErpSiteLevelData()
	 * @generated
	 */
	public EReference getErpSiteLevelData_Status() {
        return (EReference)getErpSiteLevelData().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Land Property</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty()
	 * @see #getErpSiteLevelData()
	 * @generated
	 */
	public EReference getErpSiteLevelData_LandProperty() {
        return (EReference)getErpSiteLevelData().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole <em>Org Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Erp Person Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole
	 * @generated
	 */
	public EClass getOrgErpPersonRole() {
		if (orgErpPersonRoleEClass == null) {
			orgErpPersonRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(36);
		}
		return orgErpPersonRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson()
	 * @see #getOrgErpPersonRole()
	 * @generated
	 */
	public EReference getOrgErpPersonRole_ErpPerson() {
        return (EReference)getOrgErpPersonRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation()
	 * @see #getOrgErpPersonRole()
	 * @generated
	 */
	public EReference getOrgErpPersonRole_ErpOrganisation() {
        return (EReference)getOrgErpPersonRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID()
	 * @see #getOrgErpPersonRole()
	 * @generated
	 */
	public EAttribute getOrgErpPersonRole_ClientID() {
        return (EAttribute)getOrgErpPersonRole().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Receive Delivery</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery
	 * @generated
	 */
	public EClass getErpReceiveDelivery() {
		if (erpReceiveDeliveryEClass == null) {
			erpReceiveDeliveryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(37);
		}
		return erpReceiveDeliveryEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Delv Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems()
	 * @see #getErpReceiveDelivery()
	 * @generated
	 */
	public EReference getErpReceiveDelivery_ErpRecDelvLineItems() {
        return (EReference)getErpReceiveDelivery().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder <em>Erp Sales Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Sales Order</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder
	 * @generated
	 */
	public EClass getErpSalesOrder() {
		if (erpSalesOrderEClass == null) {
			erpSalesOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(38);
		}
		return erpSalesOrderEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry <em>Erp Journal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Journal Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry
	 * @generated
	 */
	public EClass getErpJournalEntry() {
		if (erpJournalEntryEClass == null) {
			erpJournalEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(39);
		}
		return erpJournalEntryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EAttribute getErpJournalEntry_TransactionDateTime() {
        return (EAttribute)getErpJournalEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_Status() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems <em>Erp Payable Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payable Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_ErpPayableLineItems() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_ErpInvoiceLineItem() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems <em>Erp Rec Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_ErpRecLineItems() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EAttribute getErpJournalEntry_SourceID() {
        return (EAttribute)getErpJournalEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Ledger Entry</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_ErpLedgerEntry() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes <em>Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cost Types</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_CostTypes() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posting Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EAttribute getErpJournalEntry_PostingDateTime() {
        return (EAttribute)getErpJournalEntry().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EAttribute getErpJournalEntry_Amount() {
        return (EAttribute)getErpJournalEntry().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Journal</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EReference getErpJournalEntry_ErpJournal() {
        return (EReference)getErpJournalEntry().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID()
	 * @see #getErpJournalEntry()
	 * @generated
	 */
	public EAttribute getErpJournalEntry_AccountID() {
        return (EAttribute)getErpJournalEntry().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem
	 * @generated
	 */
	public EClass getErpInvoiceLineItem() {
		if (erpInvoiceLineItemEClass == null) {
			erpInvoiceLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(40);
		}
		return erpInvoiceLineItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_LineNumber() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_GlDateTime() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Payments</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpPayments() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_LineAmount() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ContainerErpInvoiceLineItem() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_NetAmount() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Billing Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_WorkBillingInfos() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpQuoteLineItem() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_Kind() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_UserAttributes() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Rec Delv Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpRecDelvLineItem() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Payable Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpPayableLineItem() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Erp Invoice Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ComponentErpInvoiceLineItems() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Version</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_LineVersion() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_GlAccount() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod <em>Bill Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bill Period</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_BillPeriod() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpInvoice() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Amount</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EAttribute getErpInvoiceLineItem_PreviousAmount() {
        return (EAttribute)getErpInvoiceLineItem().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Billing Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_CustomerBillingInfos() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Rec Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpRecLineItem() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries()
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public EReference getErpInvoiceLineItem_ErpJournalEntries() {
        return (EReference)getErpInvoiceLineItem().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole <em>Org Org Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Org Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole
	 * @generated
	 */
	public EClass getOrgOrgRole() {
		if (orgOrgRoleEClass == null) {
			orgOrgRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(41);
		}
		return orgOrgRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation()
	 * @see #getOrgOrgRole()
	 * @generated
	 */
	public EReference getOrgOrgRole_ParentOrganisation() {
        return (EReference)getOrgOrgRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation()
	 * @see #getOrgOrgRole()
	 * @generated
	 */
	public EReference getOrgOrgRole_ChildOrganisation() {
        return (EReference)getOrgOrgRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID()
	 * @see #getOrgOrgRole()
	 * @generated
	 */
	public EAttribute getOrgOrgRole_ClientID() {
        return (EAttribute)getOrgOrgRole().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournal <em>Erp Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Journal</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournal
	 * @generated
	 */
	public EClass getErpJournal() {
		if (erpJournalEClass == null) {
			erpJournalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(42);
		}
		return erpJournalEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Journal Entries</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries()
	 * @see #getErpJournal()
	 * @generated
	 */
	public EReference getErpJournal_ErpJournalEntries() {
        return (EReference)getErpJournal().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel <em>Erp Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Personnel</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel
	 * @generated
	 */
	public EClass getErpPersonnel() {
		if (erpPersonnelEClass == null) {
			erpPersonnelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(43);
		}
		return erpPersonnelEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel#getStatus()
	 * @see #getErpPersonnel()
	 * @generated
	 */
	public EReference getErpPersonnel_Status() {
        return (EReference)getErpPersonnel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons()
	 * @see #getErpPersonnel()
	 * @generated
	 */
	public EReference getErpPersonnel_ErpPersons() {
        return (EReference)getErpPersonnel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Quote Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem
	 * @generated
	 */
	public EClass getErpQuoteLineItem() {
		if (erpQuoteLineItemEClass == null) {
			erpQuoteLineItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(45);
		}
		return erpQuoteLineItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Quote</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_ErpQuote() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model Catalogue Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_AssetModelCatalogueItem() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_Status() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_Design() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Invoice Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_ErpInvoiceLineItem() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Req Line Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_ErpReqLineItem() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest()
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public EReference getErpQuoteLineItem_Request() {
        return (EReference)getErpQuoteLineItem().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData <em>Erp Bom Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erp Bom Item Data</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData
	 * @generated
	 */
	public EClass getErpBomItemData() {
		if (erpBomItemDataEClass == null) {
			erpBomItemDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(46);
		}
		return erpBomItemDataEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset()
	 * @see #getErpBomItemData()
	 * @generated
	 */
	public EReference getErpBomItemData_TypeAsset() {
        return (EReference)getErpBomItemData().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp BOM</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM()
	 * @see #getErpBomItemData()
	 * @generated
	 */
	public EReference getErpBomItemData_ErpBOM() {
        return (EReference)getErpBomItemData().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation()
	 * @see #getErpBomItemData()
	 * @generated
	 */
	public EReference getErpBomItemData_DesignLocation() {
        return (EReference)getErpBomItemData().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind <em>Erp Invoice Line Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Erp Invoice Line Item Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @generated
	 */
	public EEnum getErpInvoiceLineItemKind() {
		if (erpInvoiceLineItemKindEEnum == null) {
			erpInvoiceLineItemKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(8);
		}
		return erpInvoiceLineItemKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind <em>Erp Invoice Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Erp Invoice Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @generated
	 */
	public EEnum getErpInvoiceKind() {
		if (erpInvoiceKindEEnum == null) {
			erpInvoiceKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(9);
		}
		return erpInvoiceKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind <em>Erp Account Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Erp Account Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @generated
	 */
	public EEnum getErpAccountKind() {
		if (erpAccountKindEEnum == null) {
			erpAccountKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(17);
		}
		return erpAccountKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind <em>Bill Media Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bill Media Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @generated
	 */
	public EEnum getBillMediaKind() {
		if (billMediaKindEEnum == null) {
			billMediaKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI).getEClassifiers().get(44);
		}
		return billMediaKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfERPSupportFactory getInfERPSupportFactory() {
		return (InfERPSupportFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfERPSupport." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecDelvLineItem()
		 * @generated
		 */
		public static final EClass ERP_REC_DELV_LINE_ITEM = eINSTANCE.getErpRecDelvLineItem();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_DELV_LINE_ITEM__ASSETS = eINSTANCE.getErpRecDelvLineItem_Assets();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpRecDelvLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_DELV_LINE_ITEM__STATUS = eINSTANCE.getErpRecDelvLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Receive Delivery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY = eINSTANCE.getErpRecDelvLineItem_ErpReceiveDelivery();

		/**
		 * The meta object literal for the '<em><b>Material Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS = eINSTANCE.getErpRecDelvLineItem_MaterialItems();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM = eINSTANCE.getErpRecDelvLineItem_ErpPOLineItem();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget <em>Erp Ledger Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerBudget()
		 * @generated
		 */
		public static final EClass ERP_LEDGER_BUDGET = eINSTANCE.getErpLedgerBudget();

		/**
		 * The meta object literal for the '<em><b>Erp Led Bud Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS = eINSTANCE.getErpLedgerBudget_ErpLedBudLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry <em>Erp Time Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeEntry()
		 * @generated
		 */
		public static final EClass ERP_TIME_ENTRY = eINSTANCE.getErpTimeEntry();

		/**
		 * The meta object literal for the '<em><b>Erp Project Accounting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING = eINSTANCE.getErpTimeEntry_ErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_TIME_ENTRY__STATUS = eINSTANCE.getErpTimeEntry_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Time Sheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_TIME_ENTRY__ERP_TIME_SHEET = eINSTANCE.getErpTimeEntry_ErpTimeSheet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency <em>Erp Competency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpCompetency()
		 * @generated
		 */
		public static final EClass ERP_COMPETENCY = eINSTANCE.getErpCompetency();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_COMPETENCY__ERP_PERSONS = eINSTANCE.getErpCompetency_ErpPersons();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder <em>Erp Purchase Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPurchaseOrder()
		 * @generated
		 */
		public static final EClass ERP_PURCHASE_ORDER = eINSTANCE.getErpPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS = eINSTANCE.getErpPurchaseOrder_ErpPOLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder <em>Erp Eng Change Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpEngChangeOrder()
		 * @generated
		 */
		public static final EClass ERP_ENG_CHANGE_ORDER = eINSTANCE.getErpEngChangeOrder();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting <em>Erp Project Accounting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpProjectAccounting()
		 * @generated
		 */
		public static final EClass ERP_PROJECT_ACCOUNTING = eINSTANCE.getErpProjectAccounting();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PROJECT_ACCOUNTING__WORKS = eINSTANCE.getErpProjectAccounting_Works();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PROJECT_ACCOUNTING__PROJECTS = eINSTANCE.getErpProjectAccounting_Projects();

		/**
		 * The meta object literal for the '<em><b>Erp Time Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES = eINSTANCE.getErpProjectAccounting_ErpTimeEntries();

		/**
		 * The meta object literal for the '<em><b>Work Cost Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS = eINSTANCE.getErpProjectAccounting_WorkCostDetails();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem <em>Erp Rec Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRecLineItem()
		 * @generated
		 */
		public static final EClass ERP_REC_LINE_ITEM = eINSTANCE.getErpRecLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Receivable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_LINE_ITEM__ERP_RECEIVABLE = eINSTANCE.getErpRecLineItem_ErpReceivable();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_LINE_ITEM__STATUS = eINSTANCE.getErpRecLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpRecLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_LINE_ITEM__ERP_PAYMENTS = eINSTANCE.getErpRecLineItem_ErpPayments();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REC_LINE_ITEM__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpRecLineItem_ErpJournalEntries();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem <em>Erp Payable Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayableLineItem()
		 * @generated
		 */
		public static final EClass ERP_PAYABLE_LINE_ITEM = eINSTANCE.getErpPayableLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE_LINE_ITEM__ERP_PAYMENTS = eINSTANCE.getErpPayableLineItem_ErpPayments();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE_LINE_ITEM__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpPayableLineItem_ErpJournalEntries();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpPayableLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE_LINE_ITEM__ERP_PAYABLE = eINSTANCE.getErpPayableLineItem_ErpPayable();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE_LINE_ITEM__STATUS = eINSTANCE.getErpPayableLineItem_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem <em>Erp Led Bud Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedBudLineItem()
		 * @generated
		 */
		public static final EClass ERP_LED_BUD_LINE_ITEM = eINSTANCE.getErpLedBudLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Led Bud Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM = eINSTANCE.getErpLedBudLineItem_ErpLedBudLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Budget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET = eINSTANCE.getErpLedBudLineItem_ErpLedgerBudget();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LED_BUD_LINE_ITEM__STATUS = eINSTANCE.getErpLedBudLineItem_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition <em>Erp Requisition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpRequisition()
		 * @generated
		 */
		public static final EClass ERP_REQUISITION = eINSTANCE.getErpRequisition();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQUISITION__ERP_REQ_LINE_ITEMS = eINSTANCE.getErpRequisition_ErpReqLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation <em>Erp Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpOrganisation()
		 * @generated
		 */
		public static final EClass ERP_ORGANISATION = eINSTANCE.getErpOrganisation();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__CATEGORY = eINSTANCE.getErpOrganisation_Category();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__CODE = eINSTANCE.getErpOrganisation_Code();

		/**
		 * The meta object literal for the '<em><b>Industry ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__INDUSTRY_ID = eINSTANCE.getErpOrganisation_IndustryID();

		/**
		 * The meta object literal for the '<em><b>Government ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__GOVERNMENT_ID = eINSTANCE.getErpOrganisation_GovernmentID();

		/**
		 * The meta object literal for the '<em><b>Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__ASSET_ROLES = eINSTANCE.getErpOrganisation_AssetRoles();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__REQUESTS = eINSTANCE.getErpOrganisation_Requests();

		/**
		 * The meta object literal for the '<em><b>Opt Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__OPT_OUT = eINSTANCE.getErpOrganisation_OptOut();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__CREWS = eINSTANCE.getErpOrganisation_Crews();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__CHANGE_ITEMS = eINSTANCE.getErpOrganisation_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Erp Person Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__ERP_PERSON_ROLES = eINSTANCE.getErpOrganisation_ErpPersonRoles();

		/**
		 * The meta object literal for the '<em><b>Is Cost Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__IS_COST_CENTER = eINSTANCE.getErpOrganisation_IsCostCenter();

		/**
		 * The meta object literal for the '<em><b>Is Profit Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__IS_PROFIT_CENTER = eINSTANCE.getErpOrganisation_IsProfitCenter();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__ACTIVITY_RECORDS = eINSTANCE.getErpOrganisation_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Parent Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__PARENT_ORGANISATION_ROLES = eINSTANCE.getErpOrganisation_ParentOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__LOCATIONS = eINSTANCE.getErpOrganisation_Locations();

		/**
		 * The meta object literal for the '<em><b>Child Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__CHILD_ORGANISATION_ROLES = eINSTANCE.getErpOrganisation_ChildOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Power System Resource Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES = eINSTANCE.getErpOrganisation_PowerSystemResourceRoles();

		/**
		 * The meta object literal for the '<em><b>Land Property Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__LAND_PROPERTY_ROLES = eINSTANCE.getErpOrganisation_LandPropertyRoles();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ORGANISATION__DOCUMENT_ROLES = eINSTANCE.getErpOrganisation_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_ORGANISATION__MODE = eINSTANCE.getErpOrganisation_Mode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice <em>Erp Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoice()
		 * @generated
		 */
		public static final EClass ERP_INVOICE = eINSTANCE.getErpInvoice();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getErpInvoice_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Mailed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__MAILED_DATE = eINSTANCE.getErpInvoice_MailedDate();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__TRANSACTION_DATE_TIME = eINSTANCE.getErpInvoice_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__AMOUNT = eINSTANCE.getErpInvoice_Amount();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__DUE_DATE = eINSTANCE.getErpInvoice_DueDate();

		/**
		 * The meta object literal for the '<em><b>Bill Media Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__BILL_MEDIA_KIND = eINSTANCE.getErpInvoice_BillMediaKind();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__REFERENCE_NUMBER = eINSTANCE.getErpInvoice_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__KIND = eINSTANCE.getErpInvoice_Kind();

		/**
		 * The meta object literal for the '<em><b>Transfer Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__TRANSFER_TYPE = eINSTANCE.getErpInvoice_TransferType();

		/**
		 * The meta object literal for the '<em><b>Pro Forma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE__PRO_FORMA = eINSTANCE.getErpInvoice_ProForma();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE__CUSTOMER_ACCOUNT = eINSTANCE.getErpInvoice_CustomerAccount();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole <em>Doc Erp Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocErpPersonRole()
		 * @generated
		 */
		public static final EClass DOC_ERP_PERSON_ROLE = eINSTANCE.getDocErpPersonRole();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOC_ERP_PERSON_ROLE__DOCUMENT = eINSTANCE.getDocErpPersonRole_Document();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOC_ERP_PERSON_ROLE__ERP_PERSON = eINSTANCE.getDocErpPersonRole_ErpPerson();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount <em>Erp Bank Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBankAccount()
		 * @generated
		 */
		public static final EClass ERP_BANK_ACCOUNT = eINSTANCE.getErpBankAccount();

		/**
		 * The meta object literal for the '<em><b>Bank ABA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_BANK_ACCOUNT__BANK_ABA = eINSTANCE.getErpBankAccount_BankABA();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuote <em>Erp Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuote
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuote()
		 * @generated
		 */
		public static final EClass ERP_QUOTE = eINSTANCE.getErpQuote();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE__ERP_QUOTE_LINE_ITEMS = eINSTANCE.getErpQuote_ErpQuoteLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson <em>Erp Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPerson()
		 * @generated
		 */
		public static final EClass ERP_PERSON = eINSTANCE.getErpPerson();

		/**
		 * The meta object literal for the '<em><b>Service Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__SERVICE_LOCATION = eINSTANCE.getErpPerson_ServiceLocation();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__ERP_ORGANISATION_ROLES = eINSTANCE.getErpPerson_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__APPOINTMENTS = eINSTANCE.getErpPerson_Appointments();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__CREWS = eINSTANCE.getErpPerson_Crews();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__CATEGORY = eINSTANCE.getErpPerson_Category();

		/**
		 * The meta object literal for the '<em><b>Labor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__LABOR_ITEMS = eINSTANCE.getErpPerson_LaborItems();

		/**
		 * The meta object literal for the '<em><b>Land Property Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__LAND_PROPERTY_ROLES = eINSTANCE.getErpPerson_LandPropertyRoles();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__ACTIVITY_RECORDS = eINSTANCE.getErpPerson_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__MEASUREMENT_VALUES = eINSTANCE.getErpPerson_MeasurementValues();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__SKILLS = eINSTANCE.getErpPerson_Skills();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__LAST_NAME = eINSTANCE.getErpPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Landline Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__LANDLINE_PHONE = eINSTANCE.getErpPerson_LandlinePhone();

		/**
		 * The meta object literal for the '<em><b>Mobile Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__MOBILE_PHONE = eINSTANCE.getErpPerson_MobilePhone();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__CHANGE_ITEMS = eINSTANCE.getErpPerson_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__FIRST_NAME = eINSTANCE.getErpPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__STATUS = eINSTANCE.getErpPerson_Status();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__DOCUMENT_ROLES = eINSTANCE.getErpPerson_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Government ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__GOVERNMENT_ID = eINSTANCE.getErpPerson_GovernmentID();

		/**
		 * The meta object literal for the '<em><b>Erp Personnel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__ERP_PERSONNEL = eINSTANCE.getErpPerson_ErpPersonnel();

		/**
		 * The meta object literal for the '<em><b>Crafts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__CRAFTS = eINSTANCE.getErpPerson_Crafts();

		/**
		 * The meta object literal for the '<em><b>Customer Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__CUSTOMER_DATA = eINSTANCE.getErpPerson_CustomerData();

		/**
		 * The meta object literal for the '<em><b>Call Backs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__CALL_BACKS = eINSTANCE.getErpPerson_CallBacks();

		/**
		 * The meta object literal for the '<em><b>MName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__MNAME = eINSTANCE.getErpPerson_MName();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__SUFFIX = eINSTANCE.getErpPerson_Suffix();

		/**
		 * The meta object literal for the '<em><b>Special Need</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__SPECIAL_NEED = eINSTANCE.getErpPerson_SpecialNeed();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PERSON__PREFIX = eINSTANCE.getErpPerson_Prefix();

		/**
		 * The meta object literal for the '<em><b>Switching Step Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__SWITCHING_STEP_ROLES = eINSTANCE.getErpPerson_SwitchingStepRoles();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__ELECTRONIC_ADDRESS = eINSTANCE.getErpPerson_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Erp Competency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSON__ERP_COMPETENCY = eINSTANCE.getErpPerson_ErpCompetency();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster <em>Erp Item Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpItemMaster()
		 * @generated
		 */
		public static final EClass ERP_ITEM_MASTER = eINSTANCE.getErpItemMaster();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ITEM_MASTER__ASSET = eINSTANCE.getErpItemMaster_Asset();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ITEM_MASTER__STATUS = eINSTANCE.getErpItemMaster_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM <em>Erp BOM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBOM()
		 * @generated
		 */
		public static final EClass ERP_BOM = eINSTANCE.getErpBOM();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_BOM__DESIGN = eINSTANCE.getErpBOM_Design();

		/**
		 * The meta object literal for the '<em><b>Erp Bom Item Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_BOM__ERP_BOM_ITEM_DATAS = eINSTANCE.getErpBOM_ErpBomItemDatas();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount <em>Erp Inventory Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventoryCount()
		 * @generated
		 */
		public static final EClass ERP_INVENTORY_COUNT = eINSTANCE.getErpInventoryCount();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVENTORY_COUNT__STATUS = eINSTANCE.getErpInventoryCount_Status();

		/**
		 * The meta object literal for the '<em><b>Material Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVENTORY_COUNT__MATERIAL_ITEM = eINSTANCE.getErpInventoryCount_MaterialItem();

		/**
		 * The meta object literal for the '<em><b>Asset Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVENTORY_COUNT__ASSET_MODEL = eINSTANCE.getErpInventoryCount_AssetModel();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory <em>Erp Issue Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpIssueInventory()
		 * @generated
		 */
		public static final EClass ERP_ISSUE_INVENTORY = eINSTANCE.getErpIssueInventory();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ISSUE_INVENTORY__TYPE_ASSET = eINSTANCE.getErpIssueInventory_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ISSUE_INVENTORY__STATUS = eINSTANCE.getErpIssueInventory_Status();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_ISSUE_INVENTORY__TYPE_MATERIAL = eINSTANCE.getErpIssueInventory_TypeMaterial();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable <em>Erp Payable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayable()
		 * @generated
		 */
		public static final EClass ERP_PAYABLE = eINSTANCE.getErpPayable();

		/**
		 * The meta object literal for the '<em><b>Contractor Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE__CONTRACTOR_ITEMS = eINSTANCE.getErpPayable_ContractorItems();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYABLE__ERP_PAYABLE_LINE_ITEMS = eINSTANCE.getErpPayable_ErpPayableLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedger <em>Erp Ledger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedger
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedger()
		 * @generated
		 */
		public static final EClass ERP_LEDGER = eINSTANCE.getErpLedger();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER__ERP_LEDGER_ENTRIES = eINSTANCE.getErpLedger_ErpLedgerEntries();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem <em>Erp PO Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPOLineItem()
		 * @generated
		 */
		public static final EClass ERP_PO_LINE_ITEM = eINSTANCE.getErpPOLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Purchase Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PO_LINE_ITEM__ERP_PURCHASE_ORDER = eINSTANCE.getErpPOLineItem_ErpPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Del Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM = eINSTANCE.getErpPOLineItem_ErpRecDelLineItem();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PO_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = eINSTANCE.getErpPOLineItem_AssetModelCatalogueItem();

		/**
		 * The meta object literal for the '<em><b>Material Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PO_LINE_ITEM__MATERIAL_ITEM = eINSTANCE.getErpPOLineItem_MaterialItem();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM = eINSTANCE.getErpPOLineItem_ErpReqLineItem();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry <em>Erp Ledger Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpLedgerEntry()
		 * @generated
		 */
		public static final EClass ERP_LEDGER_ENTRY = eINSTANCE.getErpLedgerEntry();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME = eINSTANCE.getErpLedgerEntry_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Account Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_LEDGER_ENTRY__ACCOUNT_KIND = eINSTANCE.getErpLedgerEntry_AccountKind();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER_ENTRY__ERP_LEDGER = eINSTANCE.getErpLedgerEntry_ErpLedger();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER_ENTRY__STATUS = eINSTANCE.getErpLedgerEntry_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY = eINSTANCE.getErpLedgerEntry_ErpLedgerEntry();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER_ENTRY__USER_ATTRIBUTES = eINSTANCE.getErpLedgerEntry_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_LEDGER_ENTRY__AMOUNT = eINSTANCE.getErpLedgerEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Erp Jounal Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY = eINSTANCE.getErpLedgerEntry_ErpJounalEntry();

		/**
		 * The meta object literal for the '<em><b>Posted Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_LEDGER_ENTRY__POSTED_DATE_TIME = eINSTANCE.getErpLedgerEntry_PostedDateTime();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_LEDGER_ENTRY__ACCOUNT_ID = eINSTANCE.getErpLedgerEntry_AccountID();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment <em>Erp Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPayment()
		 * @generated
		 */
		public static final EClass ERP_PAYMENT = eINSTANCE.getErpPayment();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYMENT__ERP_REC_LINE_ITEMS = eINSTANCE.getErpPayment_ErpRecLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS = eINSTANCE.getErpPayment_ErpPayableLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getErpPayment_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Terms Payment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_PAYMENT__TERMS_PAYMENT = eINSTANCE.getErpPayment_TermsPayment();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable <em>Erp Receivable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceivable()
		 * @generated
		 */
		public static final EClass ERP_RECEIVABLE = eINSTANCE.getErpReceivable();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_RECEIVABLE__ERP_REC_LINE_ITEMS = eINSTANCE.getErpReceivable_ErpRecLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole <em>Doc Org Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getDocOrgRole()
		 * @generated
		 */
		public static final EClass DOC_ORG_ROLE = eINSTANCE.getDocOrgRole();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOC_ORG_ROLE__DOCUMENT = eINSTANCE.getDocOrgRole_Document();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOC_ORG_ROLE__ERP_ORGANISATION = eINSTANCE.getDocOrgRole_ErpOrganisation();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem <em>Erp Req Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReqLineItem()
		 * @generated
		 */
		public static final EClass ERP_REQ_LINE_ITEM = eINSTANCE.getErpReqLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM = eINSTANCE.getErpReqLineItem_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQ_LINE_ITEM__STATUS = eINSTANCE.getErpReqLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_REQ_LINE_ITEM__COST = eINSTANCE.getErpReqLineItem_Cost();

		/**
		 * The meta object literal for the '<em><b>Erp Requisition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQ_LINE_ITEM__ERP_REQUISITION = eINSTANCE.getErpReqLineItem_ErpRequisition();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_REQ_LINE_ITEM__QUANTITY = eINSTANCE.getErpReqLineItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Type Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQ_LINE_ITEM__TYPE_MATERIAL = eINSTANCE.getErpReqLineItem_TypeMaterial();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_REQ_LINE_ITEM__DELIVERY_DATE = eINSTANCE.getErpReqLineItem_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM = eINSTANCE.getErpReqLineItem_ErpPOLineItem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_REQ_LINE_ITEM__CODE = eINSTANCE.getErpReqLineItem_Code();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_REQ_LINE_ITEM__TYPE_ASSET = eINSTANCE.getErpReqLineItem_TypeAsset();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet <em>Erp Time Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpTimeSheet()
		 * @generated
		 */
		public static final EClass ERP_TIME_SHEET = eINSTANCE.getErpTimeSheet();

		/**
		 * The meta object literal for the '<em><b>Erp Time Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_TIME_SHEET__ERP_TIME_ENTRIES = eINSTANCE.getErpTimeSheet_ErpTimeEntries();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory <em>Erp Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInventory()
		 * @generated
		 */
		public static final EClass ERP_INVENTORY = eINSTANCE.getErpInventory();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVENTORY__ASSET = eINSTANCE.getErpInventory_Asset();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVENTORY__STATUS = eINSTANCE.getErpInventory_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts <em>Erp Chart Of Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpChartOfAccounts()
		 * @generated
		 */
		public static final EClass ERP_CHART_OF_ACCOUNTS = eINSTANCE.getErpChartOfAccounts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData <em>Erp Site Level Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSiteLevelData()
		 * @generated
		 */
		public static final EClass ERP_SITE_LEVEL_DATA = eINSTANCE.getErpSiteLevelData();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_SITE_LEVEL_DATA__STATUS = eINSTANCE.getErpSiteLevelData_Status();

		/**
		 * The meta object literal for the '<em><b>Land Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_SITE_LEVEL_DATA__LAND_PROPERTY = eINSTANCE.getErpSiteLevelData_LandProperty();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole <em>Org Erp Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgErpPersonRole()
		 * @generated
		 */
		public static final EClass ORG_ERP_PERSON_ROLE = eINSTANCE.getOrgErpPersonRole();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORG_ERP_PERSON_ROLE__ERP_PERSON = eINSTANCE.getOrgErpPersonRole_ErpPerson();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORG_ERP_PERSON_ROLE__ERP_ORGANISATION = eINSTANCE.getOrgErpPersonRole_ErpOrganisation();

		/**
		 * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ORG_ERP_PERSON_ROLE__CLIENT_ID = eINSTANCE.getOrgErpPersonRole_ClientID();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery <em>Erp Receive Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpReceiveDelivery()
		 * @generated
		 */
		public static final EClass ERP_RECEIVE_DELIVERY = eINSTANCE.getErpReceiveDelivery();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delv Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS = eINSTANCE.getErpReceiveDelivery_ErpRecDelvLineItems();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder <em>Erp Sales Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpSalesOrder()
		 * @generated
		 */
		public static final EClass ERP_SALES_ORDER = eINSTANCE.getErpSalesOrder();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry <em>Erp Journal Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournalEntry()
		 * @generated
		 */
		public static final EClass ERP_JOURNAL_ENTRY = eINSTANCE.getErpJournalEntry();

		/**
		 * The meta object literal for the '<em><b>Transaction Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME = eINSTANCE.getErpJournalEntry_TransactionDateTime();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__STATUS = eINSTANCE.getErpJournalEntry_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS = eINSTANCE.getErpJournalEntry_ErpPayableLineItems();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpJournalEntry_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS = eINSTANCE.getErpJournalEntry_ErpRecLineItems();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_JOURNAL_ENTRY__SOURCE_ID = eINSTANCE.getErpJournalEntry_SourceID();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY = eINSTANCE.getErpJournalEntry_ErpLedgerEntry();

		/**
		 * The meta object literal for the '<em><b>Cost Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__COST_TYPES = eINSTANCE.getErpJournalEntry_CostTypes();

		/**
		 * The meta object literal for the '<em><b>Posting Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_JOURNAL_ENTRY__POSTING_DATE_TIME = eINSTANCE.getErpJournalEntry_PostingDateTime();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_JOURNAL_ENTRY__AMOUNT = eINSTANCE.getErpJournalEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Erp Journal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL_ENTRY__ERP_JOURNAL = eINSTANCE.getErpJournalEntry_ErpJournal();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_JOURNAL_ENTRY__ACCOUNT_ID = eINSTANCE.getErpJournalEntry_AccountID();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItem()
		 * @generated
		 */
		public static final EClass ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__LINE_NUMBER = eINSTANCE.getErpInvoiceLineItem_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Gl Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__GL_DATE_TIME = eINSTANCE.getErpInvoiceLineItem_GlDateTime();

		/**
		 * The meta object literal for the '<em><b>Erp Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS = eINSTANCE.getErpInvoiceLineItem_ErpPayments();

		/**
		 * The meta object literal for the '<em><b>Line Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__LINE_AMOUNT = eINSTANCE.getErpInvoiceLineItem_LineAmount();

		/**
		 * The meta object literal for the '<em><b>Container Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ContainerErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Net Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__NET_AMOUNT = eINSTANCE.getErpInvoiceLineItem_NetAmount();

		/**
		 * The meta object literal for the '<em><b>Work Billing Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS = eINSTANCE.getErpInvoiceLineItem_WorkBillingInfos();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__KIND = eINSTANCE.getErpInvoiceLineItem_Kind();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES = eINSTANCE.getErpInvoiceLineItem_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delv Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpRecDelvLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Payable Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpPayableLineItem();

		/**
		 * The meta object literal for the '<em><b>Component Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS = eINSTANCE.getErpInvoiceLineItem_ComponentErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Line Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__LINE_VERSION = eINSTANCE.getErpInvoiceLineItem_LineVersion();

		/**
		 * The meta object literal for the '<em><b>Gl Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__GL_ACCOUNT = eINSTANCE.getErpInvoiceLineItem_GlAccount();

		/**
		 * The meta object literal for the '<em><b>Bill Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__BILL_PERIOD = eINSTANCE.getErpInvoiceLineItem_BillPeriod();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_INVOICE = eINSTANCE.getErpInvoiceLineItem_ErpInvoice();

		/**
		 * The meta object literal for the '<em><b>Previous Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT = eINSTANCE.getErpInvoiceLineItem_PreviousAmount();

		/**
		 * The meta object literal for the '<em><b>Customer Billing Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS = eINSTANCE.getErpInvoiceLineItem_CustomerBillingInfos();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM = eINSTANCE.getErpInvoiceLineItem_ErpRecLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpInvoiceLineItem_ErpJournalEntries();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole <em>Org Org Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getOrgOrgRole()
		 * @generated
		 */
		public static final EClass ORG_ORG_ROLE = eINSTANCE.getOrgOrgRole();

		/**
		 * The meta object literal for the '<em><b>Parent Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORG_ORG_ROLE__PARENT_ORGANISATION = eINSTANCE.getOrgOrgRole_ParentOrganisation();

		/**
		 * The meta object literal for the '<em><b>Child Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORG_ORG_ROLE__CHILD_ORGANISATION = eINSTANCE.getOrgOrgRole_ChildOrganisation();

		/**
		 * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ORG_ORG_ROLE__CLIENT_ID = eINSTANCE.getOrgOrgRole_ClientID();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournal <em>Erp Journal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournal
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpJournal()
		 * @generated
		 */
		public static final EClass ERP_JOURNAL = eINSTANCE.getErpJournal();

		/**
		 * The meta object literal for the '<em><b>Erp Journal Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_JOURNAL__ERP_JOURNAL_ENTRIES = eINSTANCE.getErpJournal_ErpJournalEntries();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel <em>Erp Personnel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpPersonnel()
		 * @generated
		 */
		public static final EClass ERP_PERSONNEL = eINSTANCE.getErpPersonnel();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSONNEL__STATUS = eINSTANCE.getErpPersonnel_Status();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_PERSONNEL__ERP_PERSONS = eINSTANCE.getErpPersonnel_ErpPersons();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem <em>Erp Quote Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpQuoteLineItem()
		 * @generated
		 */
		public static final EClass ERP_QUOTE_LINE_ITEM = eINSTANCE.getErpQuoteLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__ERP_QUOTE = eINSTANCE.getErpQuoteLineItem_ErpQuote();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM = eINSTANCE.getErpQuoteLineItem_AssetModelCatalogueItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__STATUS = eINSTANCE.getErpQuoteLineItem_Status();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__DESIGN = eINSTANCE.getErpQuoteLineItem_Design();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM = eINSTANCE.getErpQuoteLineItem_ErpInvoiceLineItem();

		/**
		 * The meta object literal for the '<em><b>Erp Req Line Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM = eINSTANCE.getErpQuoteLineItem_ErpReqLineItem();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_QUOTE_LINE_ITEM__REQUEST = eINSTANCE.getErpQuoteLineItem_Request();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData <em>Erp Bom Item Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpBomItemData()
		 * @generated
		 */
		public static final EClass ERP_BOM_ITEM_DATA = eINSTANCE.getErpBomItemData();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_BOM_ITEM_DATA__TYPE_ASSET = eINSTANCE.getErpBomItemData_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Erp BOM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_BOM_ITEM_DATA__ERP_BOM = eINSTANCE.getErpBomItemData_ErpBOM();

		/**
		 * The meta object literal for the '<em><b>Design Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ERP_BOM_ITEM_DATA__DESIGN_LOCATION = eINSTANCE.getErpBomItemData_DesignLocation();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind <em>Erp Invoice Line Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceLineItemKind()
		 * @generated
		 */
		public static final EEnum ERP_INVOICE_LINE_ITEM_KIND = eINSTANCE.getErpInvoiceLineItemKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind <em>Erp Invoice Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpInvoiceKind()
		 * @generated
		 */
		public static final EEnum ERP_INVOICE_KIND = eINSTANCE.getErpInvoiceKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind <em>Erp Account Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getErpAccountKind()
		 * @generated
		 */
		public static final EEnum ERP_ACCOUNT_KIND = eINSTANCE.getErpAccountKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind <em>Bill Media Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind
		 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage#getBillMediaKind()
		 * @generated
		 */
		public static final EEnum BILL_MEDIA_KIND = eINSTANCE.getBillMediaKind();

	}

} //InfERPSupportPackage
