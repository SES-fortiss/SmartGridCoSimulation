/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

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
 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportFactory
 * @generated
 */
public class InfGMLSupportPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfGMLSupport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfGMLSupport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfGMLSupport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfGMLSupportPackage eINSTANCE = CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType <em>Gml Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureType()
	 * @generated
	 */
	public static final int GML_FEATURE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE__GML_FEATURE_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram()
	 * @generated
	 */
	public static final int DIAGRAM = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Y1 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__Y1_INITIAL_VIEW = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram Objects3</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__DIAGRAM_OBJECTS3 = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__COORDINATE_SYSTEM = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__GML_DIAGRAM_OBJECTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>X2 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__X2_INITIAL_VIEW = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>X1 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__X1_INITIAL_VIEW = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__DESIGN_LOCATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__ORIENTATION = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Y2 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__Y2_INITIAL_VIEW = CommonPackage.DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Map
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getMap()
	 * @generated
	 */
	public static final int MAP = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__UUID = DIAGRAM__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__NAMES = DIAGRAM__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__DIAGRAM_OBJECTS = DIAGRAM__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__MRID = DIAGRAM__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ALIAS_NAME = DIAGRAM__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__NAME = DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__MODELING_AUTHORITY_SET = DIAGRAM__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__CHANGE_ITEMS = DIAGRAM__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__TO_DOCUMENT_ROLES = DIAGRAM__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ELECTRONIC_ADDRESS = DIAGRAM__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__REVISION_NUMBER = DIAGRAM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__NETWORK_DATA_SETS = DIAGRAM__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__FROM_DOCUMENT_ROLES = DIAGRAM__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__SCHEDULE_PARAMETER_INFOS = DIAGRAM__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ERP_ORGANISATION_ROLES = DIAGRAM__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__CREATED_DATE_TIME = DIAGRAM__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__MEASUREMENTS = DIAGRAM__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__LAST_MODIFIED_DATE_TIME = DIAGRAM__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ACTIVITY_RECORDS = DIAGRAM__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__SUBJECT = DIAGRAM__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__CHANGE_SETS = DIAGRAM__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ERP_PERSON_ROLES = DIAGRAM__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__SCHEDULED_EVENTS = DIAGRAM__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__TITLE = DIAGRAM__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__DOC_STATUS = DIAGRAM__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ASSET_ROLES = DIAGRAM__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__STATUS = DIAGRAM__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__POWER_SYSTEM_RESOURCE_ROLES = DIAGRAM__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__CATEGORY = DIAGRAM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Y1 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__Y1_INITIAL_VIEW = DIAGRAM__Y1_INITIAL_VIEW;

	/**
	 * The feature id for the '<em><b>Diagram Objects3</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__DIAGRAM_OBJECTS3 = DIAGRAM__DIAGRAM_OBJECTS3;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__COORDINATE_SYSTEM = DIAGRAM__COORDINATE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__KIND = DIAGRAM__KIND;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__GML_DIAGRAM_OBJECTS = DIAGRAM__GML_DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>X2 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__X2_INITIAL_VIEW = DIAGRAM__X2_INITIAL_VIEW;

	/**
	 * The feature id for the '<em><b>X1 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__X1_INITIAL_VIEW = DIAGRAM__X1_INITIAL_VIEW;

	/**
	 * The feature id for the '<em><b>Design Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__DESIGN_LOCATIONS = DIAGRAM__DESIGN_LOCATIONS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__ORIENTATION = DIAGRAM__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Y2 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__Y2_INITIAL_VIEW = DIAGRAM__Y2_INITIAL_VIEW;

	/**
	 * The feature id for the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__PAGE_NUMBER = DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Loc Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP__MAP_LOC_GRID = DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP_FEATURE_COUNT = DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MAP_OPERATION_COUNT = DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject <em>Gml Diagram Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject()
	 * @generated
	 */
	public static final int GML_DIAGRAM_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_SELECTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__DIAGRAMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_OBSERVATINS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gml Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gml Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_DIAGRAM_OBJECT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry <em>Gml Point Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointGeometry()
	 * @generated
	 */
	public static final int GML_POINT_GEOMETRY = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__UUID = GML_DIAGRAM_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__NAMES = GML_DIAGRAM_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__DIAGRAM_OBJECTS = GML_DIAGRAM_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__MRID = GML_DIAGRAM_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__ALIAS_NAME = GML_DIAGRAM_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__NAME = GML_DIAGRAM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__MODELING_AUTHORITY_SET = GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_SELECTORS = GML_DIAGRAM_OBJECT__GML_SELECTORS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__DIAGRAMS = GML_DIAGRAM_OBJECT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__COORDINATE_SYSTEMS = GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_POINT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_LINE_SYMBOLS = GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_RASTER_SYMBOLS = GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_OBSERVATINS = GML_DIAGRAM_OBJECT__GML_OBSERVATINS;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_TEXT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY__GML_POLYGON_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS;

	/**
	 * The number of structural features of the '<em>Gml Point Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY_FEATURE_COUNT = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gml Point Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_GEOMETRY_OPERATION_COUNT = GML_DIAGRAM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo <em>Gml Halo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlHalo()
	 * @generated
	 */
	public static final int GML_HALO = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__RADIUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gml Halo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gml Halo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_HALO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour <em>Gml Colour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour()
	 * @generated
	 */
	public static final int GML_COLOUR = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__RED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__GREEN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__BLUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Fills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__GML_FILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Fonts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__GML_FONTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Strokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR__GML_STROKES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gml Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gml Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_COLOUR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont <em>Gml Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont()
	 * @generated
	 */
	public static final int GML_FONT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Absolute Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__ABSOLUTE_SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__GML_SVG_PARAMETERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__FAMILY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__WEIGHT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT__GML_COLOUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gml Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Gml Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FONT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol <em>Gml Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSymbol()
	 * @generated
	 */
	public static final int GML_SYMBOL = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__VERSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__GML_FEATURE_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL__GML_BASE_SYMBOL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SYMBOL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol <em>Gml Polygon Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonSymbol()
	 * @generated
	 */
	public static final int GML_POLYGON_SYMBOL = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__NAMES = GML_SYMBOL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__DIAGRAM_OBJECTS = GML_SYMBOL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Fill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__GML_FILL = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Stroke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL__GML_STROKE = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gml Polygon Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gml Polygon Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke <em>Gml Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke()
	 * @generated
	 */
	public static final int GML_STROKE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__GML_COLOUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__LINE_CAP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__WIDTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__GML_POLYGON_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__LINEJOIN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Marks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__GML_MARKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__GML_SVG_PARAMETERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__DASH_ARRAY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__LINE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__DASH_OFFSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__GML_LINE_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Gml Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Gml Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_STROKE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol <em>Gml Base Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlBaseSymbol()
	 * @generated
	 */
	public static final int GML_BASE_SYMBOL = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL__GML_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Base Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Base Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_BASE_SYMBOL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition <em>Gml Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPosition()
	 * @generated
	 */
	public static final int GML_POSITION = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION__UUID = CommonPackage.POSITION_POINT__UUID;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION__XPOSITION = CommonPackage.POSITION_POINT__XPOSITION;

	/**
	 * The feature id for the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION__ZPOSITION = CommonPackage.POSITION_POINT__ZPOSITION;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION__SEQUENCE_NUMBER = CommonPackage.POSITION_POINT__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION__YPOSITION = CommonPackage.POSITION_POINT__YPOSITION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION__LOCATION = CommonPackage.POSITION_POINT__LOCATION;

	/**
	 * The number of structural features of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION_FEATURE_COUNT = CommonPackage.POSITION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gml Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POSITION_OPERATION_COUNT = CommonPackage.POSITION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol <em>Gml Text Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol()
	 * @generated
	 */
	public static final int GML_TEXT_SYMBOL = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__NAMES = GML_SYMBOL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__DIAGRAM_OBJECTS = GML_SYMBOL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__LABEL = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Fill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_FILL = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Label Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__LABEL_TYPE = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__FIELD_ID = GML_SYMBOL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__MIN_FONT_SIZE = GML_SYMBOL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__PROPERTY = GML_SYMBOL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Halo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_HALO = GML_SYMBOL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gml Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_FONT = GML_SYMBOL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Gml Text Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Gml Text Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TEXT_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry <em>Gml Polygon Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonGeometry()
	 * @generated
	 */
	public static final int GML_POLYGON_GEOMETRY = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__UUID = GML_DIAGRAM_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__NAMES = GML_DIAGRAM_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__DIAGRAM_OBJECTS = GML_DIAGRAM_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__MRID = GML_DIAGRAM_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__ALIAS_NAME = GML_DIAGRAM_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__NAME = GML_DIAGRAM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__MODELING_AUTHORITY_SET = GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_SELECTORS = GML_DIAGRAM_OBJECT__GML_SELECTORS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__DIAGRAMS = GML_DIAGRAM_OBJECT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__COORDINATE_SYSTEMS = GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_POINT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_LINE_SYMBOLS = GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_RASTER_SYMBOLS = GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_OBSERVATINS = GML_DIAGRAM_OBJECT__GML_OBSERVATINS;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_TEXT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY__GML_POLYGON_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS;

	/**
	 * The number of structural features of the '<em>Gml Polygon Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY_FEATURE_COUNT = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gml Polygon Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POLYGON_GEOMETRY_OPERATION_COUNT = GML_DIAGRAM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation <em>Gml Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation()
	 * @generated
	 */
	public static final int GML_OBSERVATION = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Result Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__RESULT_OF = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__GML_DIAGRAM_OBJECTS = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__TARGET = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__CHANGE_ITEMS = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__USING = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__GML_VALUES = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION__DATE_TIME = CIM15Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gml Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Gml Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_OBSERVATION_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark <em>Gml Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark()
	 * @generated
	 */
	public static final int GML_MARK = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Graphics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__GML_GRAPHICS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Well Known Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__WELL_KNOWN_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Strokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__GML_STROKES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml FIlls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK__GML_FILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gml Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gml Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_MARK_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic <em>Gml Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGraphic()
	 * @generated
	 */
	public static final int GML_GRAPHIC = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Marks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__GML_MARKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__GML_POINT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__ROTATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Symbol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__SYMBOL_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__MIN_SIZE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>XScale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__XSCALE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>YScale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC__YSCALE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gml Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gml Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GRAPHIC_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement <em>Gml Label Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement()
	 * @generated
	 */
	public static final int GML_LABEL_PLACEMENT = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__DISPLACEMENT_X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__ROTATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__DISPLACEMENT_Y = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anchor X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__ANCHOR_X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Anchor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__ANCHOR_Y = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT__OFFSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gml Label Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Gml Label Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_PLACEMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle <em>Gml Geometry Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle()
	 * @generated
	 */
	public static final int GML_GEOMETRY_STYLE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Geometry Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__GEOMETRY_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__SYMBOL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Feature Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__GML_FEATURE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE__GML_LABEL_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Geometry Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Geometry Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_GEOMETRY_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry <em>Gml Line Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineGeometry()
	 * @generated
	 */
	public static final int GML_LINE_GEOMETRY = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__UUID = GML_DIAGRAM_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__NAMES = GML_DIAGRAM_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__DIAGRAM_OBJECTS = GML_DIAGRAM_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__MRID = GML_DIAGRAM_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__ALIAS_NAME = GML_DIAGRAM_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__NAME = GML_DIAGRAM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__MODELING_AUTHORITY_SET = GML_DIAGRAM_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Selectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_SELECTORS = GML_DIAGRAM_OBJECT__GML_SELECTORS;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__DIAGRAMS = GML_DIAGRAM_OBJECT__DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Coordinate Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__COORDINATE_SYSTEMS = GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_POINT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_LINE_SYMBOLS = GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_RASTER_SYMBOLS = GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Observatins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_OBSERVATINS = GML_DIAGRAM_OBJECT__GML_OBSERVATINS;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_TEXT_SYMBOLS = GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__GML_POLYGON_SYMBOLS = GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS;

	/**
	 * The feature id for the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY__SOURCE_SIDE = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Line Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY_FEATURE_COUNT = GML_DIAGRAM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Line Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_GEOMETRY_OPERATION_COUNT = GML_DIAGRAM_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue <em>Gml Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue()
	 * @generated
	 */
	public static final int GML_VALUE = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__GML_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__TIME_PERIOD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measurement Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__MEASUREMENT_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE__VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_VALUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol <em>Gml Line Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineSymbol()
	 * @generated
	 */
	public static final int GML_LINE_SYMBOL = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__NAMES = GML_SYMBOL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__DIAGRAM_OBJECTS = GML_SYMBOL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Stroke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__GML_STROKE = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__SOURCE_SIDE = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gml Line Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gml Line Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LINE_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol <em>Gml Point Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointSymbol()
	 * @generated
	 */
	public static final int GML_POINT_SYMBOL = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__NAMES = GML_SYMBOL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__DIAGRAM_OBJECTS = GML_SYMBOL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gml Graphic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__GML_GRAPHIC = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gml Point Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gml Point Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_POINT_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle <em>Gml Topology Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTopologyStyle()
	 * @generated
	 */
	public static final int GML_TOPOLOGY_STYLE = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Lable Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__GML_LABLE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Feature Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gml Topology Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gml Topology Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_TOPOLOGY_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector <em>Gml Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSelector()
	 * @generated
	 */
	public static final int GML_SELECTOR = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR__GML_DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gml Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gml Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SELECTOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter <em>Gml Svg Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter()
	 * @generated
	 */
	public static final int GML_SVG_PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Stokes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__GML_STOKES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__ATTRIBUTE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Fonts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__GML_FONTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Fills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER__GML_FILLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gml Svg Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Gml Svg Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_SVG_PARAMETER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle <em>Gml Label Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle()
	 * @generated
	 */
	public static final int GML_LABEL_STYLE = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__TRANSFORM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__LABEL_EXPRESSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gml Topology Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__GML_TOPOLOGY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__GML_GEOMETRY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Feature Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE__GML_FEATURE_STYLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gml Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gml Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_LABEL_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill <em>Gml Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill()
	 * @generated
	 */
	public static final int GML_FILL = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__GML_COLOUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gml Marks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__GML_MARKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__OPACITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__GML_TEXT_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__GML_SVG_PARAMETERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL__GML_POLYGON_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gml Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gml Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FILL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle <em>Gml Feature Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle()
	 * @generated
	 */
	public static final int GML_FEATURE_STYLE = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Semantic Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__FEATURE_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__VERSION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__FEATURE_TYPE_NAME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__FEATURE_CONSTRAINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__GML_GEOMETRY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gml Symbols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__GML_SYMBOLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gml Tobology Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gml Label Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__GML_LABEL_STYLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gml Feature Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__GML_FEATURE_TYPES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__BASE_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Query Grammar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE__QUERY_GRAMMAR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Gml Feature Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Gml Feature Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_FEATURE_STYLE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol <em>Gml Raster Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol()
	 * @generated
	 */
	public static final int GML_RASTER_SYMBOL = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__UUID = GML_SYMBOL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__NAMES = GML_SYMBOL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__DIAGRAM_OBJECTS = GML_SYMBOL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__MRID = GML_SYMBOL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__ALIAS_NAME = GML_SYMBOL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__NAME = GML_SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__MODELING_AUTHORITY_SET = GML_SYMBOL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__VERSION = GML_SYMBOL__VERSION;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__LEVEL = GML_SYMBOL__LEVEL;

	/**
	 * The feature id for the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__GML_FEATURE_STYLES = GML_SYMBOL__GML_FEATURE_STYLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__TYPE = GML_SYMBOL__TYPE;

	/**
	 * The feature id for the '<em><b>Gml Base Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__GML_BASE_SYMBOL = GML_SYMBOL__GML_BASE_SYMBOL;

	/**
	 * The feature id for the '<em><b>Gray Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__GRAY_SOURCENAME = GML_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__GREEN_SOURCE_NAME = GML_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__OPACITY = GML_SYMBOL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relief Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__RELIEF_FACTOR = GML_SYMBOL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gml Diagram Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT = GML_SYMBOL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Red Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__RED_SOURCENAME = GML_SYMBOL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overlapbehaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR = GML_SYMBOL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Brighness Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__BRIGHNESS_ONLY = GML_SYMBOL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Blue Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL__BLUE_SOURCENAME = GML_SYMBOL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gml Raster Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL_FEATURE_COUNT = GML_SYMBOL_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gml Raster Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GML_RASTER_SYMBOL_OPERATION_COUNT = GML_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind <em>Query Grammar Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getQueryGrammarKind()
	 * @generated
	 */
	public static final int QUERY_GRAMMAR_KIND = 31;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind <em>Diagram Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagramKind()
	 * @generated
	 */
	public static final int DIAGRAM_KIND = 32;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPointGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlHaloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlColourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPolygonSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlStrokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlBaseSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlTextSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPolygonGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlMarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlGraphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLabelPlacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlGeometryStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLineGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLineSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlDiagramObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlPointSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlTopologyStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlSvgParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlLabelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlFeatureStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmlRasterSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryGrammarKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagramKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfGMLSupportPackage() {
		super(eNS_URI, InfGMLSupportFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfGMLSupportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfGMLSupportPackage init() {
		if (isInited) return (InfGMLSupportPackage)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI);

		// Obtain or create and register package
		InfGMLSupportPackage theInfGMLSupportPackage = (InfGMLSupportPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfGMLSupportPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfGMLSupportPackage());

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
		theInfGMLSupportPackage.fixPackageContents();
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
		theInfGMLSupportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfGMLSupportPackage.eNS_URI, theInfGMLSupportPackage);
		return theInfGMLSupportPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType <em>Gml Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Feature Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType
	 * @generated
	 */
	public EClass getGmlFeatureType() {
		if (gmlFeatureTypeEClass == null) {
			gmlFeatureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(0);
		}
		return gmlFeatureTypeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Feature Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles()
	 * @see #getGmlFeatureType()
	 * @generated
	 */
	public EReference getGmlFeatureType_GmlFeatureStyles() {
        return (EReference)getGmlFeatureType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Map
	 * @generated
	 */
	public EClass getMap() {
		if (mapEClass == null) {
			mapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(1);
		}
		return mapEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Map#getPageNumber()
	 * @see #getMap()
	 * @generated
	 */
	public EAttribute getMap_PageNumber() {
        return (EAttribute)getMap().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Loc Grid</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid()
	 * @see #getMap()
	 * @generated
	 */
	public EAttribute getMap_MapLocGrid() {
        return (EAttribute)getMap().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry <em>Gml Point Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Point Geometry</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry
	 * @generated
	 */
	public EClass getGmlPointGeometry() {
		if (gmlPointGeometryEClass == null) {
			gmlPointGeometryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(2);
		}
		return gmlPointGeometryEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo <em>Gml Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Halo</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo
	 * @generated
	 */
	public EClass getGmlHalo() {
		if (gmlHaloEClass == null) {
			gmlHaloEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(3);
		}
		return gmlHaloEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getRadius()
	 * @see #getGmlHalo()
	 * @generated
	 */
	public EAttribute getGmlHalo_Radius() {
        return (EAttribute)getGmlHalo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getOpacity()
	 * @see #getGmlHalo()
	 * @generated
	 */
	public EAttribute getGmlHalo_Opacity() {
        return (EAttribute)getGmlHalo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols()
	 * @see #getGmlHalo()
	 * @generated
	 */
	public EReference getGmlHalo_GmlTextSymbols() {
        return (EReference)getGmlHalo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Colour</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour
	 * @generated
	 */
	public EClass getGmlColour() {
		if (gmlColourEClass == null) {
			gmlColourEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(4);
		}
		return gmlColourEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getRed()
	 * @see #getGmlColour()
	 * @generated
	 */
	public EAttribute getGmlColour_Red() {
        return (EAttribute)getGmlColour().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen()
	 * @see #getGmlColour()
	 * @generated
	 */
	public EAttribute getGmlColour_Green() {
        return (EAttribute)getGmlColour().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue()
	 * @see #getGmlColour()
	 * @generated
	 */
	public EAttribute getGmlColour_Blue() {
        return (EAttribute)getGmlColour().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fills</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills()
	 * @see #getGmlColour()
	 * @generated
	 */
	public EReference getGmlColour_GmlFills() {
        return (EReference)getGmlColour().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fonts</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts()
	 * @see #getGmlColour()
	 * @generated
	 */
	public EReference getGmlColour_GmlFonts() {
        return (EReference)getGmlColour().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Strokes</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes()
	 * @see #getGmlColour()
	 * @generated
	 */
	public EReference getGmlColour_GmlStrokes() {
        return (EReference)getGmlColour().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Font</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont
	 * @generated
	 */
	public EClass getGmlFont() {
		if (gmlFontEClass == null) {
			gmlFontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(5);
		}
		return gmlFontEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EAttribute getGmlFont_AbsoluteSize() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EReference getGmlFont_GmlTextSymbols() {
        return (EReference)getGmlFont().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Svg Parameters</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EReference getGmlFont_GmlSvgParameters() {
        return (EReference)getGmlFont().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getSize()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EAttribute getGmlFont_Size() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EAttribute getGmlFont_Style() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EAttribute getGmlFont_Family() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EAttribute getGmlFont_Weight() {
        return (EAttribute)getGmlFont().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Colour</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour()
	 * @see #getGmlFont()
	 * @generated
	 */
	public EReference getGmlFont_GmlColour() {
        return (EReference)getGmlFont().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol <em>Gml Polygon Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Polygon Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol
	 * @generated
	 */
	public EClass getGmlPolygonSymbol() {
		if (gmlPolygonSymbolEClass == null) {
			gmlPolygonSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(6);
		}
		return gmlPolygonSymbolEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject()
	 * @see #getGmlPolygonSymbol()
	 * @generated
	 */
	public EReference getGmlPolygonSymbol_GmlDiagramObject() {
        return (EReference)getGmlPolygonSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Fill</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill()
	 * @see #getGmlPolygonSymbol()
	 * @generated
	 */
	public EReference getGmlPolygonSymbol_GmlFill() {
        return (EReference)getGmlPolygonSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Stroke</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke()
	 * @see #getGmlPolygonSymbol()
	 * @generated
	 */
	public EReference getGmlPolygonSymbol_GmlStroke() {
        return (EReference)getGmlPolygonSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Stroke</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke
	 * @generated
	 */
	public EClass getGmlStroke() {
		if (gmlStrokeEClass == null) {
			gmlStrokeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(7);
		}
		return gmlStrokeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Colour</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EReference getGmlStroke_GmlColour() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Cap</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_LineCap() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_Width() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Polygon Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EReference getGmlStroke_GmlPolygonSymbols() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linejoin</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_Linejoin() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Marks</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EReference getGmlStroke_GmlMarks() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Svg Parameters</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EReference getGmlStroke_GmlSvgParameters() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash Array</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_DashArray() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_LineStyle() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash Offset</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_DashOffset() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Line Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EReference getGmlStroke_GmlLineSymbols() {
        return (EReference)getGmlStroke().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity()
	 * @see #getGmlStroke()
	 * @generated
	 */
	public EAttribute getGmlStroke_Opacity() {
        return (EAttribute)getGmlStroke().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol <em>Gml Base Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Base Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol
	 * @generated
	 */
	public EClass getGmlBaseSymbol() {
		if (gmlBaseSymbolEClass == null) {
			gmlBaseSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(8);
		}
		return gmlBaseSymbolEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols <em>Gml Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols()
	 * @see #getGmlBaseSymbol()
	 * @generated
	 */
	public EReference getGmlBaseSymbol_GmlSymbols() {
        return (EReference)getGmlBaseSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Position</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition
	 * @generated
	 */
	public EClass getGmlPosition() {
		if (gmlPositionEClass == null) {
			gmlPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(9);
		}
		return gmlPositionEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol <em>Gml Text Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Text Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol
	 * @generated
	 */
	public EClass getGmlTextSymbol() {
		if (gmlTextSymbolEClass == null) {
			gmlTextSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(10);
		}
		return gmlTextSymbolEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_Label() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Fill</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlFill() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Label Placement</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlLabelPlacement() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_LabelType() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_FieldID() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Font Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_MinFontSize() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EAttribute getGmlTextSymbol_Property() {
        return (EAttribute)getGmlTextSymbol().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo <em>Gml Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Halo</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlHalo() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Font</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlFont() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject()
	 * @see #getGmlTextSymbol()
	 * @generated
	 */
	public EReference getGmlTextSymbol_GmlDiagramObject() {
        return (EReference)getGmlTextSymbol().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry <em>Gml Polygon Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Polygon Geometry</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry
	 * @generated
	 */
	public EClass getGmlPolygonGeometry() {
		if (gmlPolygonGeometryEClass == null) {
			gmlPolygonGeometryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(11);
		}
		return gmlPolygonGeometryEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Observation</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation
	 * @generated
	 */
	public EClass getGmlObservation() {
		if (gmlObservationEClass == null) {
			gmlObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(13);
		}
		return gmlObservationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Of</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EAttribute getGmlObservation_ResultOf() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EReference getGmlObservation_GmlDiagramObjects() {
        return (EReference)getGmlObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EAttribute getGmlObservation_Target() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EReference getGmlObservation_ChangeItems() {
        return (EReference)getGmlObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EAttribute getGmlObservation_Using() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Values</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EReference getGmlObservation_GmlValues() {
        return (EReference)getGmlObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime()
	 * @see #getGmlObservation()
	 * @generated
	 */
	public EAttribute getGmlObservation_DateTime() {
        return (EAttribute)getGmlObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark <em>Gml Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Mark</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark
	 * @generated
	 */
	public EClass getGmlMark() {
		if (gmlMarkEClass == null) {
			gmlMarkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(14);
		}
		return gmlMarkEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics <em>Gml Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Graphics</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics()
	 * @see #getGmlMark()
	 * @generated
	 */
	public EReference getGmlMark_GmlGraphics() {
        return (EReference)getGmlMark().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Known Name</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName()
	 * @see #getGmlMark()
	 * @generated
	 */
	public EAttribute getGmlMark_WellKnownName() {
        return (EAttribute)getGmlMark().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Strokes</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes()
	 * @see #getGmlMark()
	 * @generated
	 */
	public EReference getGmlMark_GmlStrokes() {
        return (EReference)getGmlMark().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls <em>Gml FIlls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml FIlls</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls()
	 * @see #getGmlMark()
	 * @generated
	 */
	public EReference getGmlMark_GmlFIlls() {
        return (EReference)getGmlMark().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic <em>Gml Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Graphic</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic
	 * @generated
	 */
	public EClass getGmlGraphic() {
		if (gmlGraphicEClass == null) {
			gmlGraphicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(15);
		}
		return gmlGraphicEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Marks</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EReference getGmlGraphic_GmlMarks() {
        return (EReference)getGmlGraphic().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Point Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EReference getGmlGraphic_GmlPointSymbols() {
        return (EReference)getGmlGraphic().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_Rotation() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_Size() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID <em>Symbol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_SymbolID() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_MinSize() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_Opacity() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale <em>XScale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XScale</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_XScale() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale <em>YScale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YScale</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale()
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public EAttribute getGmlGraphic_YScale() {
        return (EAttribute)getGmlGraphic().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Label Placement</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement
	 * @generated
	 */
	public EClass getGmlLabelPlacement() {
		if (gmlLabelPlacementEClass == null) {
			gmlLabelPlacementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(16);
		}
		return gmlLabelPlacementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displacement X</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_DisplacementX() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_Rotation() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displacement Y</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_DisplacementY() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_Type() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor X</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_AnchorX() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Y</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_AnchorY() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EReference getGmlLabelPlacement_GmlTextSymbols() {
        return (EReference)getGmlLabelPlacement().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset()
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public EAttribute getGmlLabelPlacement_Offset() {
        return (EAttribute)getGmlLabelPlacement().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle <em>Gml Geometry Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Geometry Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle
	 * @generated
	 */
	public EClass getGmlGeometryStyle() {
		if (gmlGeometryStyleEClass == null) {
			gmlGeometryStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(17);
		}
		return gmlGeometryStyleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry Property</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	public EAttribute getGmlGeometryStyle_GeometryProperty() {
        return (EAttribute)getGmlGeometryStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	public EAttribute getGmlGeometryStyle_GeometryType() {
        return (EAttribute)getGmlGeometryStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	public EAttribute getGmlGeometryStyle_Symbol() {
        return (EAttribute)getGmlGeometryStyle().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Feature Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	public EReference getGmlGeometryStyle_GmlFeatureStyle() {
        return (EReference)getGmlGeometryStyle().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Label Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle()
	 * @see #getGmlGeometryStyle()
	 * @generated
	 */
	public EReference getGmlGeometryStyle_GmlLabelStyle() {
        return (EReference)getGmlGeometryStyle().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry <em>Gml Line Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Line Geometry</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry
	 * @generated
	 */
	public EClass getGmlLineGeometry() {
		if (gmlLineGeometryEClass == null) {
			gmlLineGeometryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(18);
		}
		return gmlLineGeometryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Side</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide()
	 * @see #getGmlLineGeometry()
	 * @generated
	 */
	public EAttribute getGmlLineGeometry_SourceSide() {
        return (EAttribute)getGmlLineGeometry().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue <em>Gml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Value</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue
	 * @generated
	 */
	public EClass getGmlValue() {
		if (gmlValueEClass == null) {
			gmlValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(19);
		}
		return gmlValueEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Observation</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation()
	 * @see #getGmlValue()
	 * @generated
	 */
	public EReference getGmlValue_GmlObservation() {
        return (EReference)getGmlValue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime()
	 * @see #getGmlValue()
	 * @generated
	 */
	public EAttribute getGmlValue_DateTime() {
        return (EAttribute)getGmlValue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Period</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod()
	 * @see #getGmlValue()
	 * @generated
	 */
	public EAttribute getGmlValue_TimePeriod() {
        return (EAttribute)getGmlValue().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue()
	 * @see #getGmlValue()
	 * @generated
	 */
	public EReference getGmlValue_MeasurementValue() {
        return (EReference)getGmlValue().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getValue()
	 * @see #getGmlValue()
	 * @generated
	 */
	public EAttribute getGmlValue_Value() {
        return (EAttribute)getGmlValue().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol <em>Gml Line Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Line Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol
	 * @generated
	 */
	public EClass getGmlLineSymbol() {
		if (gmlLineSymbolEClass == null) {
			gmlLineSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(20);
		}
		return gmlLineSymbolEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Stroke</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke()
	 * @see #getGmlLineSymbol()
	 * @generated
	 */
	public EReference getGmlLineSymbol_GmlStroke() {
        return (EReference)getGmlLineSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Side</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide()
	 * @see #getGmlLineSymbol()
	 * @generated
	 */
	public EAttribute getGmlLineSymbol_SourceSide() {
        return (EAttribute)getGmlLineSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject()
	 * @see #getGmlLineSymbol()
	 * @generated
	 */
	public EReference getGmlLineSymbol_GmlDiagramObject() {
        return (EReference)getGmlLineSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Diagram Object</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject
	 * @generated
	 */
	public EClass getGmlDiagramObject() {
		if (gmlDiagramObjectEClass == null) {
			gmlDiagramObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(21);
		}
		return gmlDiagramObjectEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors <em>Gml Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Selectors</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlSelectors() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagrams</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_Diagrams() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems <em>Coordinate Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coordinate Systems</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_CoordinateSystems() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Point Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlPointSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Line Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlLineSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols <em>Gml Raster Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Raster Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlRasterSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins <em>Gml Observatins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Observatins</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlObservatins() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlTextSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Polygon Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols()
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public EReference getGmlDiagramObject_GmlPolygonSymbols() {
        return (EReference)getGmlDiagramObject().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol <em>Gml Point Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Point Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol
	 * @generated
	 */
	public EClass getGmlPointSymbol() {
		if (gmlPointSymbolEClass == null) {
			gmlPointSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(22);
		}
		return gmlPointSymbolEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Graphic</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic()
	 * @see #getGmlPointSymbol()
	 * @generated
	 */
	public EReference getGmlPointSymbol_GmlGraphic() {
        return (EReference)getGmlPointSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject()
	 * @see #getGmlPointSymbol()
	 * @generated
	 */
	public EReference getGmlPointSymbol_GmlDiagramObject() {
        return (EReference)getGmlPointSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle <em>Gml Topology Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Topology Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle
	 * @generated
	 */
	public EClass getGmlTopologyStyle() {
		if (gmlTopologyStyleEClass == null) {
			gmlTopologyStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(23);
		}
		return gmlTopologyStyleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Lable Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle()
	 * @see #getGmlTopologyStyle()
	 * @generated
	 */
	public EReference getGmlTopologyStyle_GmlLableStyle() {
        return (EReference)getGmlTopologyStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Feature Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle()
	 * @see #getGmlTopologyStyle()
	 * @generated
	 */
	public EReference getGmlTopologyStyle_GmlFeatureStyle() {
        return (EReference)getGmlTopologyStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector <em>Gml Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Selector</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector
	 * @generated
	 */
	public EClass getGmlSelector() {
		if (gmlSelectorEClass == null) {
			gmlSelectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(24);
		}
		return gmlSelectorEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems()
	 * @see #getGmlSelector()
	 * @generated
	 */
	public EReference getGmlSelector_ChangeItems() {
        return (EReference)getGmlSelector().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects()
	 * @see #getGmlSelector()
	 * @generated
	 */
	public EReference getGmlSelector_GmlDiagramObjects() {
        return (EReference)getGmlSelector().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter <em>Gml Svg Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Svg Parameter</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter
	 * @generated
	 */
	public EClass getGmlSvgParameter() {
		if (gmlSvgParameterEClass == null) {
			gmlSvgParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(25);
		}
		return gmlSvgParameterEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes <em>Gml Stokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Stokes</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	public EReference getGmlSvgParameter_GmlStokes() {
        return (EReference)getGmlSvgParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	public EAttribute getGmlSvgParameter_Attribute() {
        return (EAttribute)getGmlSvgParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	public EAttribute getGmlSvgParameter_Value() {
        return (EAttribute)getGmlSvgParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fonts</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	public EReference getGmlSvgParameter_GmlFonts() {
        return (EReference)getGmlSvgParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Fills</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills()
	 * @see #getGmlSvgParameter()
	 * @generated
	 */
	public EReference getGmlSvgParameter_GmlFills() {
        return (EReference)getGmlSvgParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Label Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle
	 * @generated
	 */
	public EClass getGmlLabelStyle() {
		if (gmlLabelStyleEClass == null) {
			gmlLabelStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(26);
		}
		return gmlLabelStyleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public EAttribute getGmlLabelStyle_Transform() {
        return (EAttribute)getGmlLabelStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public EAttribute getGmlLabelStyle_LabelExpression() {
        return (EAttribute)getGmlLabelStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles <em>Gml Topology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Topology Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public EReference getGmlLabelStyle_GmlTopologyStyles() {
        return (EReference)getGmlLabelStyle().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Geometry Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public EReference getGmlLabelStyle_GmlGeometryStyles() {
        return (EReference)getGmlLabelStyle().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public EAttribute getGmlLabelStyle_Style() {
        return (EAttribute)getGmlLabelStyle().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Feature Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle()
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public EReference getGmlLabelStyle_GmlFeatureStyle() {
        return (EReference)getGmlLabelStyle().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Fill</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill
	 * @generated
	 */
	public EClass getGmlFill() {
		if (gmlFillEClass == null) {
			gmlFillEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(27);
		}
		return gmlFillEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Colour</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour()
	 * @see #getGmlFill()
	 * @generated
	 */
	public EReference getGmlFill_GmlColour() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Marks</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks()
	 * @see #getGmlFill()
	 * @generated
	 */
	public EReference getGmlFill_GmlMarks() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity()
	 * @see #getGmlFill()
	 * @generated
	 */
	public EAttribute getGmlFill_Opacity() {
        return (EAttribute)getGmlFill().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Text Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols()
	 * @see #getGmlFill()
	 * @generated
	 */
	public EReference getGmlFill_GmlTextSymbols() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Svg Parameters</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters()
	 * @see #getGmlFill()
	 * @generated
	 */
	public EReference getGmlFill_GmlSvgParameters() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Polygon Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols()
	 * @see #getGmlFill()
	 * @generated
	 */
	public EReference getGmlFill_GmlPolygonSymbols() {
        return (EReference)getGmlFill().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram
	 * @generated
	 */
	public EClass getDiagram() {
		if (diagramEClass == null) {
			diagramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(28);
		}
		return diagramEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY1InitialView <em>Y1 Initial View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Initial View</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY1InitialView()
	 * @see #getDiagram()
	 * @generated
	 */
	public EAttribute getDiagram_Y1InitialView() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDiagramObjects3 <em>Diagram Objects3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagram Objects3</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDiagramObjects3()
	 * @see #getDiagram()
	 * @generated
	 */
	public EReference getDiagram_DiagramObjects3() {
        return (EReference)getDiagram().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinate System</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem()
	 * @see #getDiagram()
	 * @generated
	 */
	public EReference getDiagram_CoordinateSystem() {
        return (EReference)getDiagram().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getKind()
	 * @see #getDiagram()
	 * @generated
	 */
	public EAttribute getDiagram_Kind() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects()
	 * @see #getDiagram()
	 * @generated
	 */
	public EReference getDiagram_GmlDiagramObjects() {
        return (EReference)getDiagram().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX2InitialView <em>X2 Initial View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2 Initial View</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX2InitialView()
	 * @see #getDiagram()
	 * @generated
	 */
	public EAttribute getDiagram_X2InitialView() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX1InitialView <em>X1 Initial View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1 Initial View</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX1InitialView()
	 * @see #getDiagram()
	 * @generated
	 */
	public EAttribute getDiagram_X1InitialView() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations()
	 * @see #getDiagram()
	 * @generated
	 */
	public EReference getDiagram_DesignLocations() {
        return (EReference)getDiagram().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getOrientation()
	 * @see #getDiagram()
	 * @generated
	 */
	public EAttribute getDiagram_Orientation() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY2InitialView <em>Y2 Initial View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Initial View</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY2InitialView()
	 * @see #getDiagram()
	 * @generated
	 */
	public EAttribute getDiagram_Y2InitialView() {
        return (EAttribute)getDiagram().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol <em>Gml Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol
	 * @generated
	 */
	public EClass getGmlSymbol() {
		if (gmlSymbolEClass == null) {
			gmlSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(29);
		}
		return gmlSymbolEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	public EAttribute getGmlSymbol_Version() {
        return (EAttribute)getGmlSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	public EAttribute getGmlSymbol_Level() {
        return (EAttribute)getGmlSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Feature Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	public EReference getGmlSymbol_GmlFeatureStyles() {
        return (EReference)getGmlSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	public EAttribute getGmlSymbol_Type() {
        return (EAttribute)getGmlSymbol().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol <em>Gml Base Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Base Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol()
	 * @see #getGmlSymbol()
	 * @generated
	 */
	public EReference getGmlSymbol_GmlBaseSymbol() {
        return (EReference)getGmlSymbol().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Feature Style</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle
	 * @generated
	 */
	public EClass getGmlFeatureStyle() {
		if (gmlFeatureStyleEClass == null) {
			gmlFeatureStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(30);
		}
		return gmlFeatureStyleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Type Identifier</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_SemanticTypeIdentifier() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_FeatureType() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_Version() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Type Name</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_FeatureTypeName() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Constraint</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_FeatureConstraint() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Geometry Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlGeometryStyles() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols <em>Gml Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Symbols</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlSymbols() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles <em>Gml Tobology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Tobology Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlTobologyStyles() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles <em>Gml Label Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Label Styles</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlLabelStyles() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes <em>Gml Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Feature Types</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EReference getGmlFeatureStyle_GmlFeatureTypes() {
        return (EReference)getGmlFeatureStyle().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_BaseType() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Grammar</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar()
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public EAttribute getGmlFeatureStyle_QueryGrammar() {
        return (EAttribute)getGmlFeatureStyle().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol <em>Gml Raster Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Raster Symbol</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol
	 * @generated
	 */
	public EClass getGmlRasterSymbol() {
		if (gmlRasterSymbolEClass == null) {
			gmlRasterSymbolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(32);
		}
		return gmlRasterSymbolEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gray Sourcename</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_GraySourcename() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green Source Name</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_GreenSourceName() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_Opacity() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relief Factor</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_ReliefFactor() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gml Diagram Object</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EReference getGmlRasterSymbol_GmlDiagramObject() {
        return (EReference)getGmlRasterSymbol().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Sourcename</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_RedSourcename() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlapbehaviour</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_Overlapbehaviour() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brighness Only</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_BrighnessOnly() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue Sourcename</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename()
	 * @see #getGmlRasterSymbol()
	 * @generated
	 */
	public EAttribute getGmlRasterSymbol_BlueSourcename() {
        return (EAttribute)getGmlRasterSymbol().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind <em>Query Grammar Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Grammar Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @generated
	 */
	public EEnum getQueryGrammarKind() {
		if (queryGrammarKindEEnum == null) {
			queryGrammarKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(12);
		}
		return queryGrammarKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind <em>Diagram Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagram Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @generated
	 */
	public EEnum getDiagramKind() {
		if (diagramKindEEnum == null) {
			diagramKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI).getEClassifiers().get(31);
		}
		return diagramKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfGMLSupportFactory getInfGMLSupportFactory() {
		return (InfGMLSupportFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfGMLSupport." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType <em>Gml Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureType()
		 * @generated
		 */
		public static final EClass GML_FEATURE_TYPE = eINSTANCE.getGmlFeatureType();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FEATURE_TYPE__GML_FEATURE_STYLES = eINSTANCE.getGmlFeatureType_GmlFeatureStyles();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.Map
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getMap()
		 * @generated
		 */
		public static final EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Page Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAP__PAGE_NUMBER = eINSTANCE.getMap_PageNumber();

		/**
		 * The meta object literal for the '<em><b>Map Loc Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MAP__MAP_LOC_GRID = eINSTANCE.getMap_MapLocGrid();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry <em>Gml Point Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointGeometry()
		 * @generated
		 */
		public static final EClass GML_POINT_GEOMETRY = eINSTANCE.getGmlPointGeometry();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo <em>Gml Halo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlHalo()
		 * @generated
		 */
		public static final EClass GML_HALO = eINSTANCE.getGmlHalo();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_HALO__RADIUS = eINSTANCE.getGmlHalo_Radius();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_HALO__OPACITY = eINSTANCE.getGmlHalo_Opacity();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_HALO__GML_TEXT_SYMBOLS = eINSTANCE.getGmlHalo_GmlTextSymbols();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour <em>Gml Colour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlColour()
		 * @generated
		 */
		public static final EClass GML_COLOUR = eINSTANCE.getGmlColour();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_COLOUR__RED = eINSTANCE.getGmlColour_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_COLOUR__GREEN = eINSTANCE.getGmlColour_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_COLOUR__BLUE = eINSTANCE.getGmlColour_Blue();

		/**
		 * The meta object literal for the '<em><b>Gml Fills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_COLOUR__GML_FILLS = eINSTANCE.getGmlColour_GmlFills();

		/**
		 * The meta object literal for the '<em><b>Gml Fonts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_COLOUR__GML_FONTS = eINSTANCE.getGmlColour_GmlFonts();

		/**
		 * The meta object literal for the '<em><b>Gml Strokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_COLOUR__GML_STROKES = eINSTANCE.getGmlColour_GmlStrokes();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont <em>Gml Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFont()
		 * @generated
		 */
		public static final EClass GML_FONT = eINSTANCE.getGmlFont();

		/**
		 * The meta object literal for the '<em><b>Absolute Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FONT__ABSOLUTE_SIZE = eINSTANCE.getGmlFont_AbsoluteSize();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FONT__GML_TEXT_SYMBOLS = eINSTANCE.getGmlFont_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Svg Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FONT__GML_SVG_PARAMETERS = eINSTANCE.getGmlFont_GmlSvgParameters();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FONT__SIZE = eINSTANCE.getGmlFont_Size();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FONT__STYLE = eINSTANCE.getGmlFont_Style();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FONT__FAMILY = eINSTANCE.getGmlFont_Family();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FONT__WEIGHT = eINSTANCE.getGmlFont_Weight();

		/**
		 * The meta object literal for the '<em><b>Gml Colour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FONT__GML_COLOUR = eINSTANCE.getGmlFont_GmlColour();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol <em>Gml Polygon Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonSymbol()
		 * @generated
		 */
		public static final EClass GML_POLYGON_SYMBOL = eINSTANCE.getGmlPolygonSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlPolygonSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Gml Fill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_POLYGON_SYMBOL__GML_FILL = eINSTANCE.getGmlPolygonSymbol_GmlFill();

		/**
		 * The meta object literal for the '<em><b>Gml Stroke</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_POLYGON_SYMBOL__GML_STROKE = eINSTANCE.getGmlPolygonSymbol_GmlStroke();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke <em>Gml Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlStroke()
		 * @generated
		 */
		public static final EClass GML_STROKE = eINSTANCE.getGmlStroke();

		/**
		 * The meta object literal for the '<em><b>Gml Colour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_STROKE__GML_COLOUR = eINSTANCE.getGmlStroke_GmlColour();

		/**
		 * The meta object literal for the '<em><b>Line Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__LINE_CAP = eINSTANCE.getGmlStroke_LineCap();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__WIDTH = eINSTANCE.getGmlStroke_Width();

		/**
		 * The meta object literal for the '<em><b>Gml Polygon Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_STROKE__GML_POLYGON_SYMBOLS = eINSTANCE.getGmlStroke_GmlPolygonSymbols();

		/**
		 * The meta object literal for the '<em><b>Linejoin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__LINEJOIN = eINSTANCE.getGmlStroke_Linejoin();

		/**
		 * The meta object literal for the '<em><b>Gml Marks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_STROKE__GML_MARKS = eINSTANCE.getGmlStroke_GmlMarks();

		/**
		 * The meta object literal for the '<em><b>Gml Svg Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_STROKE__GML_SVG_PARAMETERS = eINSTANCE.getGmlStroke_GmlSvgParameters();

		/**
		 * The meta object literal for the '<em><b>Dash Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__DASH_ARRAY = eINSTANCE.getGmlStroke_DashArray();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__LINE_STYLE = eINSTANCE.getGmlStroke_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__DASH_OFFSET = eINSTANCE.getGmlStroke_DashOffset();

		/**
		 * The meta object literal for the '<em><b>Gml Line Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_STROKE__GML_LINE_SYMBOLS = eINSTANCE.getGmlStroke_GmlLineSymbols();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_STROKE__OPACITY = eINSTANCE.getGmlStroke_Opacity();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol <em>Gml Base Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlBaseSymbol()
		 * @generated
		 */
		public static final EClass GML_BASE_SYMBOL = eINSTANCE.getGmlBaseSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_BASE_SYMBOL__GML_SYMBOLS = eINSTANCE.getGmlBaseSymbol_GmlSymbols();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition <em>Gml Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPosition()
		 * @generated
		 */
		public static final EClass GML_POSITION = eINSTANCE.getGmlPosition();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol <em>Gml Text Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTextSymbol()
		 * @generated
		 */
		public static final EClass GML_TEXT_SYMBOL = eINSTANCE.getGmlTextSymbol();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_TEXT_SYMBOL__LABEL = eINSTANCE.getGmlTextSymbol_Label();

		/**
		 * The meta object literal for the '<em><b>Gml Fill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TEXT_SYMBOL__GML_FILL = eINSTANCE.getGmlTextSymbol_GmlFill();

		/**
		 * The meta object literal for the '<em><b>Gml Label Placement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT = eINSTANCE.getGmlTextSymbol_GmlLabelPlacement();

		/**
		 * The meta object literal for the '<em><b>Label Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_TEXT_SYMBOL__LABEL_TYPE = eINSTANCE.getGmlTextSymbol_LabelType();

		/**
		 * The meta object literal for the '<em><b>Field ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_TEXT_SYMBOL__FIELD_ID = eINSTANCE.getGmlTextSymbol_FieldID();

		/**
		 * The meta object literal for the '<em><b>Min Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_TEXT_SYMBOL__MIN_FONT_SIZE = eINSTANCE.getGmlTextSymbol_MinFontSize();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_TEXT_SYMBOL__PROPERTY = eINSTANCE.getGmlTextSymbol_Property();

		/**
		 * The meta object literal for the '<em><b>Gml Halo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TEXT_SYMBOL__GML_HALO = eINSTANCE.getGmlTextSymbol_GmlHalo();

		/**
		 * The meta object literal for the '<em><b>Gml Font</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TEXT_SYMBOL__GML_FONT = eINSTANCE.getGmlTextSymbol_GmlFont();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlTextSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry <em>Gml Polygon Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPolygonGeometry()
		 * @generated
		 */
		public static final EClass GML_POLYGON_GEOMETRY = eINSTANCE.getGmlPolygonGeometry();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation <em>Gml Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlObservation()
		 * @generated
		 */
		public static final EClass GML_OBSERVATION = eINSTANCE.getGmlObservation();

		/**
		 * The meta object literal for the '<em><b>Result Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_OBSERVATION__RESULT_OF = eINSTANCE.getGmlObservation_ResultOf();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_OBSERVATION__GML_DIAGRAM_OBJECTS = eINSTANCE.getGmlObservation_GmlDiagramObjects();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_OBSERVATION__TARGET = eINSTANCE.getGmlObservation_Target();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_OBSERVATION__CHANGE_ITEMS = eINSTANCE.getGmlObservation_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_OBSERVATION__USING = eINSTANCE.getGmlObservation_Using();

		/**
		 * The meta object literal for the '<em><b>Gml Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_OBSERVATION__GML_VALUES = eINSTANCE.getGmlObservation_GmlValues();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_OBSERVATION__DATE_TIME = eINSTANCE.getGmlObservation_DateTime();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark <em>Gml Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlMark()
		 * @generated
		 */
		public static final EClass GML_MARK = eINSTANCE.getGmlMark();

		/**
		 * The meta object literal for the '<em><b>Gml Graphics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_MARK__GML_GRAPHICS = eINSTANCE.getGmlMark_GmlGraphics();

		/**
		 * The meta object literal for the '<em><b>Well Known Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_MARK__WELL_KNOWN_NAME = eINSTANCE.getGmlMark_WellKnownName();

		/**
		 * The meta object literal for the '<em><b>Gml Strokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_MARK__GML_STROKES = eINSTANCE.getGmlMark_GmlStrokes();

		/**
		 * The meta object literal for the '<em><b>Gml FIlls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_MARK__GML_FILLS = eINSTANCE.getGmlMark_GmlFIlls();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic <em>Gml Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGraphic()
		 * @generated
		 */
		public static final EClass GML_GRAPHIC = eINSTANCE.getGmlGraphic();

		/**
		 * The meta object literal for the '<em><b>Gml Marks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_GRAPHIC__GML_MARKS = eINSTANCE.getGmlGraphic_GmlMarks();

		/**
		 * The meta object literal for the '<em><b>Gml Point Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_GRAPHIC__GML_POINT_SYMBOLS = eINSTANCE.getGmlGraphic_GmlPointSymbols();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__ROTATION = eINSTANCE.getGmlGraphic_Rotation();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__SIZE = eINSTANCE.getGmlGraphic_Size();

		/**
		 * The meta object literal for the '<em><b>Symbol ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__SYMBOL_ID = eINSTANCE.getGmlGraphic_SymbolID();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__MIN_SIZE = eINSTANCE.getGmlGraphic_MinSize();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__OPACITY = eINSTANCE.getGmlGraphic_Opacity();

		/**
		 * The meta object literal for the '<em><b>XScale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__XSCALE = eINSTANCE.getGmlGraphic_XScale();

		/**
		 * The meta object literal for the '<em><b>YScale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GRAPHIC__YSCALE = eINSTANCE.getGmlGraphic_YScale();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement <em>Gml Label Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelPlacement()
		 * @generated
		 */
		public static final EClass GML_LABEL_PLACEMENT = eINSTANCE.getGmlLabelPlacement();

		/**
		 * The meta object literal for the '<em><b>Displacement X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__DISPLACEMENT_X = eINSTANCE.getGmlLabelPlacement_DisplacementX();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__ROTATION = eINSTANCE.getGmlLabelPlacement_Rotation();

		/**
		 * The meta object literal for the '<em><b>Displacement Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__DISPLACEMENT_Y = eINSTANCE.getGmlLabelPlacement_DisplacementY();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__TYPE = eINSTANCE.getGmlLabelPlacement_Type();

		/**
		 * The meta object literal for the '<em><b>Anchor X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__ANCHOR_X = eINSTANCE.getGmlLabelPlacement_AnchorX();

		/**
		 * The meta object literal for the '<em><b>Anchor Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__ANCHOR_Y = eINSTANCE.getGmlLabelPlacement_AnchorY();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS = eINSTANCE.getGmlLabelPlacement_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_PLACEMENT__OFFSET = eINSTANCE.getGmlLabelPlacement_Offset();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle <em>Gml Geometry Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlGeometryStyle()
		 * @generated
		 */
		public static final EClass GML_GEOMETRY_STYLE = eINSTANCE.getGmlGeometryStyle();

		/**
		 * The meta object literal for the '<em><b>Geometry Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY = eINSTANCE.getGmlGeometryStyle_GeometryProperty();

		/**
		 * The meta object literal for the '<em><b>Geometry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GEOMETRY_STYLE__GEOMETRY_TYPE = eINSTANCE.getGmlGeometryStyle_GeometryType();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_GEOMETRY_STYLE__SYMBOL = eINSTANCE.getGmlGeometryStyle_Symbol();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_GEOMETRY_STYLE__GML_FEATURE_STYLE = eINSTANCE.getGmlGeometryStyle_GmlFeatureStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Label Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_GEOMETRY_STYLE__GML_LABEL_STYLE = eINSTANCE.getGmlGeometryStyle_GmlLabelStyle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry <em>Gml Line Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineGeometry()
		 * @generated
		 */
		public static final EClass GML_LINE_GEOMETRY = eINSTANCE.getGmlLineGeometry();

		/**
		 * The meta object literal for the '<em><b>Source Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LINE_GEOMETRY__SOURCE_SIDE = eINSTANCE.getGmlLineGeometry_SourceSide();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue <em>Gml Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlValue()
		 * @generated
		 */
		public static final EClass GML_VALUE = eINSTANCE.getGmlValue();

		/**
		 * The meta object literal for the '<em><b>Gml Observation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_VALUE__GML_OBSERVATION = eINSTANCE.getGmlValue_GmlObservation();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_VALUE__DATE_TIME = eINSTANCE.getGmlValue_DateTime();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_VALUE__TIME_PERIOD = eINSTANCE.getGmlValue_TimePeriod();

		/**
		 * The meta object literal for the '<em><b>Measurement Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_VALUE__MEASUREMENT_VALUE = eINSTANCE.getGmlValue_MeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_VALUE__VALUE = eINSTANCE.getGmlValue_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol <em>Gml Line Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLineSymbol()
		 * @generated
		 */
		public static final EClass GML_LINE_SYMBOL = eINSTANCE.getGmlLineSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Stroke</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_LINE_SYMBOL__GML_STROKE = eINSTANCE.getGmlLineSymbol_GmlStroke();

		/**
		 * The meta object literal for the '<em><b>Source Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LINE_SYMBOL__SOURCE_SIDE = eINSTANCE.getGmlLineSymbol_SourceSide();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlLineSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject <em>Gml Diagram Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlDiagramObject()
		 * @generated
		 */
		public static final EClass GML_DIAGRAM_OBJECT = eINSTANCE.getGmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Gml Selectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_SELECTORS = eINSTANCE.getGmlDiagramObject_GmlSelectors();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__DIAGRAMS = eINSTANCE.getGmlDiagramObject_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Coordinate Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS = eINSTANCE.getGmlDiagramObject_CoordinateSystems();

		/**
		 * The meta object literal for the '<em><b>Gml Point Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlPointSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Line Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlLineSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Raster Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlRasterSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Observatins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_OBSERVATINS = eINSTANCE.getGmlDiagramObject_GmlObservatins();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Polygon Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS = eINSTANCE.getGmlDiagramObject_GmlPolygonSymbols();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol <em>Gml Point Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlPointSymbol()
		 * @generated
		 */
		public static final EClass GML_POINT_SYMBOL = eINSTANCE.getGmlPointSymbol();

		/**
		 * The meta object literal for the '<em><b>Gml Graphic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_POINT_SYMBOL__GML_GRAPHIC = eINSTANCE.getGmlPointSymbol_GmlGraphic();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlPointSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle <em>Gml Topology Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlTopologyStyle()
		 * @generated
		 */
		public static final EClass GML_TOPOLOGY_STYLE = eINSTANCE.getGmlTopologyStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Lable Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TOPOLOGY_STYLE__GML_LABLE_STYLE = eINSTANCE.getGmlTopologyStyle_GmlLableStyle();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE = eINSTANCE.getGmlTopologyStyle_GmlFeatureStyle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector <em>Gml Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSelector()
		 * @generated
		 */
		public static final EClass GML_SELECTOR = eINSTANCE.getGmlSelector();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SELECTOR__CHANGE_ITEMS = eINSTANCE.getGmlSelector_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SELECTOR__GML_DIAGRAM_OBJECTS = eINSTANCE.getGmlSelector_GmlDiagramObjects();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter <em>Gml Svg Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSvgParameter()
		 * @generated
		 */
		public static final EClass GML_SVG_PARAMETER = eINSTANCE.getGmlSvgParameter();

		/**
		 * The meta object literal for the '<em><b>Gml Stokes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SVG_PARAMETER__GML_STOKES = eINSTANCE.getGmlSvgParameter_GmlStokes();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_SVG_PARAMETER__ATTRIBUTE = eINSTANCE.getGmlSvgParameter_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_SVG_PARAMETER__VALUE = eINSTANCE.getGmlSvgParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Gml Fonts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SVG_PARAMETER__GML_FONTS = eINSTANCE.getGmlSvgParameter_GmlFonts();

		/**
		 * The meta object literal for the '<em><b>Gml Fills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SVG_PARAMETER__GML_FILLS = eINSTANCE.getGmlSvgParameter_GmlFills();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle <em>Gml Label Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlLabelStyle()
		 * @generated
		 */
		public static final EClass GML_LABEL_STYLE = eINSTANCE.getGmlLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_STYLE__TRANSFORM = eINSTANCE.getGmlLabelStyle_Transform();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_STYLE__LABEL_EXPRESSION = eINSTANCE.getGmlLabelStyle_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Gml Topology Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_LABEL_STYLE__GML_TOPOLOGY_STYLES = eINSTANCE.getGmlLabelStyle_GmlTopologyStyles();

		/**
		 * The meta object literal for the '<em><b>Gml Geometry Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_LABEL_STYLE__GML_GEOMETRY_STYLES = eINSTANCE.getGmlLabelStyle_GmlGeometryStyles();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_LABEL_STYLE__STYLE = eINSTANCE.getGmlLabelStyle_Style();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_LABEL_STYLE__GML_FEATURE_STYLE = eINSTANCE.getGmlLabelStyle_GmlFeatureStyle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill <em>Gml Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFill()
		 * @generated
		 */
		public static final EClass GML_FILL = eINSTANCE.getGmlFill();

		/**
		 * The meta object literal for the '<em><b>Gml Colour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FILL__GML_COLOUR = eINSTANCE.getGmlFill_GmlColour();

		/**
		 * The meta object literal for the '<em><b>Gml Marks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FILL__GML_MARKS = eINSTANCE.getGmlFill_GmlMarks();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FILL__OPACITY = eINSTANCE.getGmlFill_Opacity();

		/**
		 * The meta object literal for the '<em><b>Gml Text Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FILL__GML_TEXT_SYMBOLS = eINSTANCE.getGmlFill_GmlTextSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Svg Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FILL__GML_SVG_PARAMETERS = eINSTANCE.getGmlFill_GmlSvgParameters();

		/**
		 * The meta object literal for the '<em><b>Gml Polygon Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FILL__GML_POLYGON_SYMBOLS = eINSTANCE.getGmlFill_GmlPolygonSymbols();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagram()
		 * @generated
		 */
		public static final EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Y1 Initial View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGRAM__Y1_INITIAL_VIEW = eINSTANCE.getDiagram_Y1InitialView();

		/**
		 * The meta object literal for the '<em><b>Diagram Objects3</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DIAGRAM__DIAGRAM_OBJECTS3 = eINSTANCE.getDiagram_DiagramObjects3();

		/**
		 * The meta object literal for the '<em><b>Coordinate System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DIAGRAM__COORDINATE_SYSTEM = eINSTANCE.getDiagram_CoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGRAM__KIND = eINSTANCE.getDiagram_Kind();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DIAGRAM__GML_DIAGRAM_OBJECTS = eINSTANCE.getDiagram_GmlDiagramObjects();

		/**
		 * The meta object literal for the '<em><b>X2 Initial View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGRAM__X2_INITIAL_VIEW = eINSTANCE.getDiagram_X2InitialView();

		/**
		 * The meta object literal for the '<em><b>X1 Initial View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGRAM__X1_INITIAL_VIEW = eINSTANCE.getDiagram_X1InitialView();

		/**
		 * The meta object literal for the '<em><b>Design Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DIAGRAM__DESIGN_LOCATIONS = eINSTANCE.getDiagram_DesignLocations();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGRAM__ORIENTATION = eINSTANCE.getDiagram_Orientation();

		/**
		 * The meta object literal for the '<em><b>Y2 Initial View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DIAGRAM__Y2_INITIAL_VIEW = eINSTANCE.getDiagram_Y2InitialView();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol <em>Gml Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlSymbol()
		 * @generated
		 */
		public static final EClass GML_SYMBOL = eINSTANCE.getGmlSymbol();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_SYMBOL__VERSION = eINSTANCE.getGmlSymbol_Version();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_SYMBOL__LEVEL = eINSTANCE.getGmlSymbol_Level();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SYMBOL__GML_FEATURE_STYLES = eINSTANCE.getGmlSymbol_GmlFeatureStyles();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_SYMBOL__TYPE = eINSTANCE.getGmlSymbol_Type();

		/**
		 * The meta object literal for the '<em><b>Gml Base Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_SYMBOL__GML_BASE_SYMBOL = eINSTANCE.getGmlSymbol_GmlBaseSymbol();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle <em>Gml Feature Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlFeatureStyle()
		 * @generated
		 */
		public static final EClass GML_FEATURE_STYLE = eINSTANCE.getGmlFeatureStyle();

		/**
		 * The meta object literal for the '<em><b>Semantic Type Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER = eINSTANCE.getGmlFeatureStyle_SemanticTypeIdentifier();

		/**
		 * The meta object literal for the '<em><b>Feature Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__FEATURE_TYPE = eINSTANCE.getGmlFeatureStyle_FeatureType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__VERSION = eINSTANCE.getGmlFeatureStyle_Version();

		/**
		 * The meta object literal for the '<em><b>Feature Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__FEATURE_TYPE_NAME = eINSTANCE.getGmlFeatureStyle_FeatureTypeName();

		/**
		 * The meta object literal for the '<em><b>Feature Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__FEATURE_CONSTRAINT = eINSTANCE.getGmlFeatureStyle_FeatureConstraint();

		/**
		 * The meta object literal for the '<em><b>Gml Geometry Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FEATURE_STYLE__GML_GEOMETRY_STYLES = eINSTANCE.getGmlFeatureStyle_GmlGeometryStyles();

		/**
		 * The meta object literal for the '<em><b>Gml Symbols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FEATURE_STYLE__GML_SYMBOLS = eINSTANCE.getGmlFeatureStyle_GmlSymbols();

		/**
		 * The meta object literal for the '<em><b>Gml Tobology Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES = eINSTANCE.getGmlFeatureStyle_GmlTobologyStyles();

		/**
		 * The meta object literal for the '<em><b>Gml Label Styles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FEATURE_STYLE__GML_LABEL_STYLES = eINSTANCE.getGmlFeatureStyle_GmlLabelStyles();

		/**
		 * The meta object literal for the '<em><b>Gml Feature Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_FEATURE_STYLE__GML_FEATURE_TYPES = eINSTANCE.getGmlFeatureStyle_GmlFeatureTypes();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__BASE_TYPE = eINSTANCE.getGmlFeatureStyle_BaseType();

		/**
		 * The meta object literal for the '<em><b>Query Grammar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_FEATURE_STYLE__QUERY_GRAMMAR = eINSTANCE.getGmlFeatureStyle_QueryGrammar();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol <em>Gml Raster Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getGmlRasterSymbol()
		 * @generated
		 */
		public static final EClass GML_RASTER_SYMBOL = eINSTANCE.getGmlRasterSymbol();

		/**
		 * The meta object literal for the '<em><b>Gray Sourcename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__GRAY_SOURCENAME = eINSTANCE.getGmlRasterSymbol_GraySourcename();

		/**
		 * The meta object literal for the '<em><b>Green Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__GREEN_SOURCE_NAME = eINSTANCE.getGmlRasterSymbol_GreenSourceName();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__OPACITY = eINSTANCE.getGmlRasterSymbol_Opacity();

		/**
		 * The meta object literal for the '<em><b>Relief Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__RELIEF_FACTOR = eINSTANCE.getGmlRasterSymbol_ReliefFactor();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT = eINSTANCE.getGmlRasterSymbol_GmlDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Red Sourcename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__RED_SOURCENAME = eINSTANCE.getGmlRasterSymbol_RedSourcename();

		/**
		 * The meta object literal for the '<em><b>Overlapbehaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR = eINSTANCE.getGmlRasterSymbol_Overlapbehaviour();

		/**
		 * The meta object literal for the '<em><b>Brighness Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__BRIGHNESS_ONLY = eINSTANCE.getGmlRasterSymbol_BrighnessOnly();

		/**
		 * The meta object literal for the '<em><b>Blue Sourcename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GML_RASTER_SYMBOL__BLUE_SOURCENAME = eINSTANCE.getGmlRasterSymbol_BlueSourcename();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind <em>Query Grammar Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getQueryGrammarKind()
		 * @generated
		 */
		public static final EEnum QUERY_GRAMMAR_KIND = eINSTANCE.getQueryGrammarKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind <em>Diagram Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind
		 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagramKind()
		 * @generated
		 */
		public static final EEnum DIAGRAM_KIND = eINSTANCE.getDiagramKind();

	}

} //InfGMLSupportPackage
