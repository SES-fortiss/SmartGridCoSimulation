/**
 */
package CIM15.IEC61968.Common;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

import CIM15.IEC61968.Assets.AssetsPackage;

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
 * @see CIM15.IEC61968.Common.CommonFactory
 * @generated
 */
public class CommonPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimCommon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonPackage eINSTANCE = CIM15.IEC61968.Common.CommonPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.PostalAddress <em>Postal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.PostalAddress
	 * @see CIM15.IEC61968.Common.CommonPackage#getPostalAddress()
	 * @generated
	 */
	public static final int POSTAL_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Street Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAL_ADDRESS__STREET_DETAIL = 0;

	/**
	 * The feature id for the '<em><b>Po Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAL_ADDRESS__PO_BOX = 1;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAL_ADDRESS__POSTAL_CODE = 2;

	/**
	 * The feature id for the '<em><b>Town Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAL_ADDRESS__TOWN_DETAIL = 3;

	/**
	 * The number of structural features of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAL_ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSTAL_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.Status <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.Status
	 * @see CIM15.IEC61968.Common.CommonPackage#getStatus()
	 * @generated
	 */
	public static final int STATUS = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__REASON = 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS__REMARK = 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.ElectronicAddress <em>Electronic Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.ElectronicAddress
	 * @see CIM15.IEC61968.Common.CommonPackage#getElectronicAddress()
	 * @generated
	 */
	public static final int ELECTRONIC_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__RADIO = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Lan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__LAN = 3;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__USER_ID = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS__WEB = 6;

	/**
	 * The number of structural features of the '<em>Electronic Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Electronic Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRONIC_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.Location <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.Location
	 * @see CIM15.IEC61968.Common.CommonPackage#getLocation()
	 * @generated
	 */
	public static final int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__MAIN_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__PHONE1 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__PHONE2 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__SECONDARY_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__RED_LINES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__DIMENSIONS_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__LAND_PROPERTIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__HAZARDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__CREWS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Position Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__POSITION_POINTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__DIRECTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__ROUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__GEO_INFO_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__COORDINATE_SYSTEM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__CORPORATE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__ERP_ORGANISATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION__DIRECTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.TownDetail <em>Town Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.TownDetail
	 * @see CIM15.IEC61968.Common.CommonPackage#getTownDetail()
	 * @generated
	 */
	public static final int TOWN_DETAIL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL__NAME = 0;

	/**
	 * The feature id for the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL__STATE_OR_PROVINCE = 1;

	/**
	 * The feature id for the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL__SECTION = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL__CODE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL__COUNTRY = 4;

	/**
	 * The number of structural features of the '<em>Town Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Town Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWN_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.CoordinateSystem <em>Coordinate System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.CoordinateSystem
	 * @see CIM15.IEC61968.Common.CommonPackage#getCoordinateSystem()
	 * @generated
	 */
	public static final int COORDINATE_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__DIAGRAMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crs Urn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__CRS_URN = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COORDINATE_SYSTEM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.Document
	 * @see CIM15.IEC61968.Common.CommonPackage#getDocument()
	 * @generated
	 */
	public static final int DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__TO_DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__REVISION_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__NETWORK_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__FROM_DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__SCHEDULE_PARAMETER_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__CREATED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__LAST_MODIFIED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ACTIVITY_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__SUBJECT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__CHANGE_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ERP_PERSON_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__SCHEDULED_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__TITLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__DOC_STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__ASSET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.PositionPoint <em>Position Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.PositionPoint
	 * @see CIM15.IEC61968.Common.CommonPackage#getPositionPoint()
	 * @generated
	 */
	public static final int POSITION_POINT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT__XPOSITION = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT__ZPOSITION = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT__SEQUENCE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT__YPOSITION = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT__LOCATION = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Position Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_POINT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.UserAttribute <em>User Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.UserAttribute
	 * @see CIM15.IEC61968.Common.CommonPackage#getUserAttribute()
	 * @generated
	 */
	public static final int USER_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__ERP_LEDGER_ENTRIES = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__PROCEDURE_DATA_SETS = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__TRANSACTION = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__PROPERTY_SPECIFICATION = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__PROCEDURE = CIM15Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__SEQUENCE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Property Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__PROPERTY_ASSETS = CIM15Package.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rating Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__RATING_SPECIFICATION = CIM15Package.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS = CIM15Package.ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rating Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE__RATING_ASSETS = CIM15Package.ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>User Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>User Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int USER_ATTRIBUTE_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.StreetAddress <em>Street Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.StreetAddress
	 * @see CIM15.IEC61968.Common.CommonPackage#getStreetAddress()
	 * @generated
	 */
	public static final int STREET_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_ADDRESS__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Street Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_ADDRESS__STREET_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Town Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_ADDRESS__TOWN_DETAIL = 2;

	/**
	 * The number of structural features of the '<em>Street Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_ADDRESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Street Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.StreetDetail <em>Street Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.StreetDetail
	 * @see CIM15.IEC61968.Common.CommonPackage#getStreetDetail()
	 * @generated
	 */
	public static final int STREET_DETAIL = 10;

	/**
	 * The feature id for the '<em><b>Within Town Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__WITHIN_TOWN_LIMITS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__BUILDING_NAME = 4;

	/**
	 * The feature id for the '<em><b>Suite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__SUITE_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__SUFFIX = 6;

	/**
	 * The feature id for the '<em><b>Address General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__ADDRESS_GENERAL = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__CODE = 8;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL__NUMBER = 9;

	/**
	 * The number of structural features of the '<em>Street Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Street Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREET_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.TimeSchedule <em>Time Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.TimeSchedule
	 * @see CIM15.IEC61968.Common.CommonPackage#getTimeSchedule()
	 * @generated
	 */
	public static final int TIME_SCHEDULE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__UUID = DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__NAMES = DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__DIAGRAM_OBJECTS = DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__MRID = DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__ALIAS_NAME = DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__MODELING_AUTHORITY_SET = DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__CHANGE_ITEMS = DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__TO_DOCUMENT_ROLES = DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__ELECTRONIC_ADDRESS = DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__REVISION_NUMBER = DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__NETWORK_DATA_SETS = DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__FROM_DOCUMENT_ROLES = DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__SCHEDULE_PARAMETER_INFOS = DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__ERP_ORGANISATION_ROLES = DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__CREATED_DATE_TIME = DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__MEASUREMENTS = DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__LAST_MODIFIED_DATE_TIME = DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__ACTIVITY_RECORDS = DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__SUBJECT = DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__CHANGE_SETS = DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__ERP_PERSON_ROLES = DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__SCHEDULED_EVENTS = DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__DOC_STATUS = DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__ASSET_ROLES = DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__STATUS = DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__POWER_SYSTEM_RESOURCE_ROLES = DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__CATEGORY = DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Recurrence Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__RECURRENCE_PERIOD = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__DISABLED = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__TIME_POINTS = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__OFFSET = DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schedule Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__SCHEDULE_INTERVAL = DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recurrence Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE__RECURRENCE_PATTERN = DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Time Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Time Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULE_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.ActivityRecord <em>Activity Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.ActivityRecord
	 * @see CIM15.IEC61968.Common.CommonPackage#getActivityRecord()
	 * @generated
	 */
	public static final int ACTIVITY_RECORD = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__SEVERITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__CREATED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__ERP_PERSONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__ORGANISATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__REASON = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD__SCHEDULED_EVENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Activity Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Activity Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_RECORD_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.TimePoint <em>Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.TimePoint
	 * @see CIM15.IEC61968.Common.CommonPackage#getTimePoint()
	 * @generated
	 */
	public static final int TIME_POINT = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__WINDOW = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__TIME_SCHEDULE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__SEQUENCE_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__SCHEDULED_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relative Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT__RELATIVE_TIME_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.Organisation <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.Organisation
	 * @see CIM15.IEC61968.Common.CommonPackage#getOrganisation()
	 * @generated
	 */
	public static final int ORGANISATION = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__PHONE2 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__PHONE1 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__STREET_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__POSTAL_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION__BUSINESS_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.TelephoneNumber <em>Telephone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.TelephoneNumber
	 * @see CIM15.IEC61968.Common.CommonPackage#getTelephoneNumber()
	 * @generated
	 */
	public static final int TELEPHONE_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>City Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER__CITY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Local Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER__LOCAL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER__EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER__AREA_CODE = 3;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER__COUNTRY_CODE = 4;

	/**
	 * The number of structural features of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TELEPHONE_NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Common.Agreement <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Common.Agreement
	 * @see CIM15.IEC61968.Common.CommonPackage#getAgreement()
	 * @generated
	 */
	public static final int AGREEMENT = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__UUID = DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__NAMES = DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__DIAGRAM_OBJECTS = DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__MRID = DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__ALIAS_NAME = DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__MODELING_AUTHORITY_SET = DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__CHANGE_ITEMS = DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__TO_DOCUMENT_ROLES = DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__ELECTRONIC_ADDRESS = DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__REVISION_NUMBER = DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__NETWORK_DATA_SETS = DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__FROM_DOCUMENT_ROLES = DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__SCHEDULE_PARAMETER_INFOS = DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__ERP_ORGANISATION_ROLES = DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__CREATED_DATE_TIME = DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__MEASUREMENTS = DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__LAST_MODIFIED_DATE_TIME = DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__ACTIVITY_RECORDS = DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__SUBJECT = DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__CHANGE_SETS = DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__ERP_PERSON_ROLES = DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__SCHEDULED_EVENTS = DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__DOC_STATUS = DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__ASSET_ROLES = DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__STATUS = DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__CATEGORY = DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__SIGN_DATE = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT__VALIDITY_INTERVAL = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AGREEMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass townDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streetAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streetDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

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
	 * @see CIM15.IEC61968.Common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackage() {
		super(eNS_URI, CommonFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackage theCommonPackage = (CommonPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackage());

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
		OperationalLimitsPackage theOperationalLimitsPackage = (OperationalLimitsPackage)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackage ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		OutagePackage theOutagePackage = (OutagePackage)(EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) instanceof OutagePackage ? EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) : OutagePackage.eINSTANCE);
		CutsJumpersPackage theCutsJumpersPackage = (CutsJumpersPackage)(EPackage.Registry.INSTANCE.getEPackage(CutsJumpersPackage.eNS_URI) instanceof CutsJumpersPackage ? EPackage.Registry.INSTANCE.getEPackage(CutsJumpersPackage.eNS_URI) : CutsJumpersPackage.eINSTANCE);
		ProtectionPackage theProtectionPackage = (ProtectionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) instanceof ProtectionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) : ProtectionPackage.eINSTANCE);
		EquivalentsPackage theEquivalentsPackage = (EquivalentsPackage)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackage ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		ContingencyPackage theContingencyPackage = (ContingencyPackage)(EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) instanceof ContingencyPackage ? EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) : ContingencyPackage.eINSTANCE);
		TopologyPackage theTopologyPackage = (TopologyPackage)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackage ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		IEC61968Package theIEC61968Package = (IEC61968Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) instanceof IEC61968Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) : IEC61968Package.eINSTANCE);
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
		theCommonPackage.fixPackageContents();
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
		theOperationalLimitsPackage.fixPackageContents();
		theOutagePackage.fixPackageContents();
		theCutsJumpersPackage.fixPackageContents();
		theProtectionPackage.fixPackageContents();
		theEquivalentsPackage.fixPackageContents();
		theContingencyPackage.fixPackageContents();
		theTopologyPackage.fixPackageContents();
		theIEC61968Package.fixPackageContents();
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
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.PostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address</em>'.
	 * @see CIM15.IEC61968.Common.PostalAddress
	 * @generated
	 */
	public EClass getPostalAddress() {
		if (postalAddressEClass == null) {
			postalAddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(0);
		}
		return postalAddressEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.PostalAddress#getStreetDetail <em>Street Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Street Detail</em>'.
	 * @see CIM15.IEC61968.Common.PostalAddress#getStreetDetail()
	 * @see #getPostalAddress()
	 * @generated
	 */
	public EReference getPostalAddress_StreetDetail() {
        return (EReference)getPostalAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Po Box</em>'.
	 * @see CIM15.IEC61968.Common.PostalAddress#getPoBox()
	 * @see #getPostalAddress()
	 * @generated
	 */
	public EAttribute getPostalAddress_PoBox() {
        return (EAttribute)getPostalAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see CIM15.IEC61968.Common.PostalAddress#getPostalCode()
	 * @see #getPostalAddress()
	 * @generated
	 */
	public EAttribute getPostalAddress_PostalCode() {
        return (EAttribute)getPostalAddress().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.PostalAddress#getTownDetail <em>Town Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Town Detail</em>'.
	 * @see CIM15.IEC61968.Common.PostalAddress#getTownDetail()
	 * @see #getPostalAddress()
	 * @generated
	 */
	public EReference getPostalAddress_TownDetail() {
        return (EReference)getPostalAddress().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.Status
	 * @generated
	 */
	public EClass getStatus() {
		if (statusEClass == null) {
			statusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(1);
		}
		return statusEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Status#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM15.IEC61968.Common.Status#getReason()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_Reason() {
        return (EAttribute)getStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Status#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61968.Common.Status#getDateTime()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_DateTime() {
        return (EAttribute)getStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Status#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61968.Common.Status#getValue()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_Value() {
        return (EAttribute)getStatus().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Status#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see CIM15.IEC61968.Common.Status#getRemark()
	 * @see #getStatus()
	 * @generated
	 */
	public EAttribute getStatus_Remark() {
        return (EAttribute)getStatus().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.ElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress
	 * @generated
	 */
	public EClass getElectronicAddress() {
		if (electronicAddressEClass == null) {
			electronicAddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(2);
		}
		return electronicAddressEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getRadio()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EAttribute getElectronicAddress_Radio() {
        return (EAttribute)getElectronicAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.ElectronicAddress#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getStatus()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EReference getElectronicAddress_Status() {
        return (EReference)getElectronicAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getPassword()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EAttribute getElectronicAddress_Password() {
        return (EAttribute)getElectronicAddress().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lan</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getLan()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EAttribute getElectronicAddress_Lan() {
        return (EAttribute)getElectronicAddress().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getUserID()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EAttribute getElectronicAddress_UserID() {
        return (EAttribute)getElectronicAddress().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getEmail()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EAttribute getElectronicAddress_Email() {
        return (EAttribute)getElectronicAddress().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web</em>'.
	 * @see CIM15.IEC61968.Common.ElectronicAddress#getWeb()
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public EAttribute getElectronicAddress_Web() {
        return (EAttribute)getElectronicAddress().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see CIM15.IEC61968.Common.Location
	 * @generated
	 */
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(3);
		}
		return locationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Location#getMainAddress <em>Main Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Address</em>'.
	 * @see CIM15.IEC61968.Common.Location#getMainAddress()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_MainAddress() {
        return (EReference)getLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Location#getPhone1 <em>Phone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone1</em>'.
	 * @see CIM15.IEC61968.Common.Location#getPhone1()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Phone1() {
        return (EReference)getLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Location#getPhone2 <em>Phone2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone2</em>'.
	 * @see CIM15.IEC61968.Common.Location#getPhone2()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Phone2() {
        return (EReference)getLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM15.IEC61968.Common.Location#getPowerSystemResources()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_PowerSystemResources() {
        return (EReference)getLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Location#getSecondaryAddress <em>Secondary Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secondary Address</em>'.
	 * @see CIM15.IEC61968.Common.Location#getSecondaryAddress()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_SecondaryAddress() {
        return (EReference)getLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61968.Common.Location#getChangeItems()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_ChangeItems() {
        return (EReference)getLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getRedLines <em>Red Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Red Lines</em>'.
	 * @see CIM15.IEC61968.Common.Location#getRedLines()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_RedLines() {
        return (EReference)getLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Location#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61968.Common.Location#getCategory()
	 * @see #getLocation()
	 * @generated
	 */
	public EAttribute getLocation_Category() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions Info</em>'.
	 * @see CIM15.IEC61968.Common.Location#getDimensionsInfo()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_DimensionsInfo() {
        return (EReference)getLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Properties</em>'.
	 * @see CIM15.IEC61968.Common.Location#getLandProperties()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_LandProperties() {
        return (EReference)getLocation().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61968.Common.Location#getAssets()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Assets() {
        return (EReference)getLocation().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see CIM15.IEC61968.Common.Location#getHazards()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Hazards() {
        return (EReference)getLocation().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Location#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.Location#getStatus()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Status() {
        return (EReference)getLocation().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crews</em>'.
	 * @see CIM15.IEC61968.Common.Location#getCrews()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Crews() {
        return (EReference)getLocation().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getPositionPoints <em>Position Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Points</em>'.
	 * @see CIM15.IEC61968.Common.Location#getPositionPoints()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_PositionPoints() {
        return (EReference)getLocation().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Location#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61968.Common.Location#getElectronicAddress()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_ElectronicAddress() {
        return (EReference)getLocation().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directions</em>'.
	 * @see CIM15.IEC61968.Common.Location#getDirections()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Directions() {
        return (EReference)getLocation().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61968.Common.Location#getMeasurements()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Measurements() {
        return (EReference)getLocation().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see CIM15.IEC61968.Common.Location#getRoutes()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_Routes() {
        return (EReference)getLocation().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Info Reference</em>'.
	 * @see CIM15.IEC61968.Common.Location#getGeoInfoReference()
	 * @see #getLocation()
	 * @generated
	 */
	public EAttribute getLocation_GeoInfoReference() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.Location#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinate System</em>'.
	 * @see CIM15.IEC61968.Common.Location#getCoordinateSystem()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_CoordinateSystem() {
        return (EReference)getLocation().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61968.Common.Location#getCorporateCode()
	 * @see #getLocation()
	 * @generated
	 */
	public EAttribute getLocation_CorporateCode() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Location#getErpOrganisations <em>Erp Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisations</em>'.
	 * @see CIM15.IEC61968.Common.Location#getErpOrganisations()
	 * @see #getLocation()
	 * @generated
	 */
	public EReference getLocation_ErpOrganisations() {
        return (EReference)getLocation().getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Location#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see CIM15.IEC61968.Common.Location#getDirection()
	 * @see #getLocation()
	 * @generated
	 */
	public EAttribute getLocation_Direction() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.TownDetail <em>Town Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Town Detail</em>'.
	 * @see CIM15.IEC61968.Common.TownDetail
	 * @generated
	 */
	public EClass getTownDetail() {
		if (townDetailEClass == null) {
			townDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(4);
		}
		return townDetailEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TownDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61968.Common.TownDetail#getName()
	 * @see #getTownDetail()
	 * @generated
	 */
	public EAttribute getTownDetail_Name() {
        return (EAttribute)getTownDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Or Province</em>'.
	 * @see CIM15.IEC61968.Common.TownDetail#getStateOrProvince()
	 * @see #getTownDetail()
	 * @generated
	 */
	public EAttribute getTownDetail_StateOrProvince() {
        return (EAttribute)getTownDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TownDetail#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section</em>'.
	 * @see CIM15.IEC61968.Common.TownDetail#getSection()
	 * @see #getTownDetail()
	 * @generated
	 */
	public EAttribute getTownDetail_Section() {
        return (EAttribute)getTownDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TownDetail#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61968.Common.TownDetail#getCode()
	 * @see #getTownDetail()
	 * @generated
	 */
	public EAttribute getTownDetail_Code() {
        return (EAttribute)getTownDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TownDetail#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see CIM15.IEC61968.Common.TownDetail#getCountry()
	 * @see #getTownDetail()
	 * @generated
	 */
	public EAttribute getTownDetail_Country() {
        return (EAttribute)getTownDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.CoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate System</em>'.
	 * @see CIM15.IEC61968.Common.CoordinateSystem
	 * @generated
	 */
	public EClass getCoordinateSystem() {
		if (coordinateSystemEClass == null) {
			coordinateSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(5);
		}
		return coordinateSystemEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.CoordinateSystem#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagrams</em>'.
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getDiagrams()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	public EReference getCoordinateSystem_Diagrams() {
        return (EReference)getCoordinateSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location</em>'.
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getLocation()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	public EReference getCoordinateSystem_Location() {
        return (EReference)getCoordinateSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crs Urn</em>'.
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getCrsUrn()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	public EAttribute getCoordinateSystem_CrsUrn() {
        return (EAttribute)getCoordinateSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Diagram Objects</em>'.
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	public EReference getCoordinateSystem_GmlDiagramObjects() {
        return (EReference)getCoordinateSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see CIM15.IEC61968.Common.Document
	 * @generated
	 */
	public EClass getDocument() {
		if (documentEClass == null) {
			documentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(6);
		}
		return documentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61968.Common.Document#getChangeItems()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ChangeItems() {
        return (EReference)getDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getToDocumentRoles <em>To Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Document Roles</em>'.
	 * @see CIM15.IEC61968.Common.Document#getToDocumentRoles()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ToDocumentRoles() {
        return (EReference)getDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Document#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61968.Common.Document#getElectronicAddress()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ElectronicAddress() {
        return (EReference)getDocument().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see CIM15.IEC61968.Common.Document#getRevisionNumber()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_RevisionNumber() {
        return (EAttribute)getDocument().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see CIM15.IEC61968.Common.Document#getNetworkDataSets()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_NetworkDataSets() {
        return (EReference)getDocument().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getFromDocumentRoles <em>From Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Document Roles</em>'.
	 * @see CIM15.IEC61968.Common.Document#getFromDocumentRoles()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_FromDocumentRoles() {
        return (EReference)getDocument().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Parameter Infos</em>'.
	 * @see CIM15.IEC61968.Common.Document#getScheduleParameterInfos()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ScheduleParameterInfos() {
        return (EReference)getDocument().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see CIM15.IEC61968.Common.Document#getErpOrganisationRoles()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ErpOrganisationRoles() {
        return (EReference)getDocument().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date Time</em>'.
	 * @see CIM15.IEC61968.Common.Document#getCreatedDateTime()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_CreatedDateTime() {
        return (EAttribute)getDocument().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61968.Common.Document#getMeasurements()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_Measurements() {
        return (EReference)getDocument().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date Time</em>'.
	 * @see CIM15.IEC61968.Common.Document#getLastModifiedDateTime()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_LastModifiedDateTime() {
        return (EAttribute)getDocument().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see CIM15.IEC61968.Common.Document#getActivityRecords()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ActivityRecords() {
        return (EReference)getDocument().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Document#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see CIM15.IEC61968.Common.Document#getSubject()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_Subject() {
        return (EAttribute)getDocument().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Sets</em>'.
	 * @see CIM15.IEC61968.Common.Document#getChangeSets()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ChangeSets() {
        return (EReference)getDocument().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Person Roles</em>'.
	 * @see CIM15.IEC61968.Common.Document#getErpPersonRoles()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ErpPersonRoles() {
        return (EReference)getDocument().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Events</em>'.
	 * @see CIM15.IEC61968.Common.Document#getScheduledEvents()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_ScheduledEvents() {
        return (EReference)getDocument().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see CIM15.IEC61968.Common.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_Title() {
        return (EAttribute)getDocument().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Document#getDocStatus <em>Doc Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc Status</em>'.
	 * @see CIM15.IEC61968.Common.Document#getDocStatus()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_DocStatus() {
        return (EReference)getDocument().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getAssetRoles <em>Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Roles</em>'.
	 * @see CIM15.IEC61968.Common.Document#getAssetRoles()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_AssetRoles() {
        return (EReference)getDocument().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Document#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.Document#getStatus()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_Status() {
        return (EReference)getDocument().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Document#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resource Roles</em>'.
	 * @see CIM15.IEC61968.Common.Document#getPowerSystemResourceRoles()
	 * @see #getDocument()
	 * @generated
	 */
	public EReference getDocument_PowerSystemResourceRoles() {
        return (EReference)getDocument().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Document#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61968.Common.Document#getCategory()
	 * @see #getDocument()
	 * @generated
	 */
	public EAttribute getDocument_Category() {
        return (EAttribute)getDocument().getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Point</em>'.
	 * @see CIM15.IEC61968.Common.PositionPoint
	 * @generated
	 */
	public EClass getPositionPoint() {
		if (positionPointEClass == null) {
			positionPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(7);
		}
		return positionPointEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see CIM15.IEC61968.Common.PositionPoint#getXPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	public EAttribute getPositionPoint_XPosition() {
        return (EAttribute)getPositionPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZPosition</em>'.
	 * @see CIM15.IEC61968.Common.PositionPoint#getZPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	public EAttribute getPositionPoint_ZPosition() {
        return (EAttribute)getPositionPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61968.Common.PositionPoint#getSequenceNumber()
	 * @see #getPositionPoint()
	 * @generated
	 */
	public EAttribute getPositionPoint_SequenceNumber() {
        return (EAttribute)getPositionPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see CIM15.IEC61968.Common.PositionPoint#getYPosition()
	 * @see #getPositionPoint()
	 * @generated
	 */
	public EAttribute getPositionPoint_YPosition() {
        return (EAttribute)getPositionPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM15.IEC61968.Common.PositionPoint#getLocation()
	 * @see #getPositionPoint()
	 * @generated
	 */
	public EReference getPositionPoint_Location() {
        return (EReference)getPositionPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.UserAttribute <em>User Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute
	 * @generated
	 */
	public EClass getUserAttribute() {
		if (userAttributeEClass == null) {
			userAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(8);
		}
		return userAttributeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.UserAttribute#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Ledger Entries</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getErpLedgerEntries()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_ErpLedgerEntries() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.UserAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getName()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EAttribute getUserAttribute_Name() {
        return (EAttribute)getUserAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.UserAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getValue()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EAttribute getUserAttribute_Value() {
        return (EAttribute)getUserAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getProcedureDataSets()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_ProcedureDataSets() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getTransaction()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_Transaction() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Specification</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getPropertySpecification()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_PropertySpecification() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getProcedure()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_Procedure() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getSequenceNumber()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EAttribute getUserAttribute_SequenceNumber() {
        return (EAttribute)getUserAttribute().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.UserAttribute#getPropertyAssets <em>Property Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property Assets</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getPropertyAssets()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_PropertyAssets() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rating Specification</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getRatingSpecification()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_RatingSpecification() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.UserAttribute#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Invoice Line Items</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getErpInvoiceLineItems()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_ErpInvoiceLineItems() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.UserAttribute#getRatingAssets <em>Rating Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rating Assets</em>'.
	 * @see CIM15.IEC61968.Common.UserAttribute#getRatingAssets()
	 * @see #getUserAttribute()
	 * @generated
	 */
	public EReference getUserAttribute_RatingAssets() {
        return (EReference)getUserAttribute().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.StreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street Address</em>'.
	 * @see CIM15.IEC61968.Common.StreetAddress
	 * @generated
	 */
	public EClass getStreetAddress() {
		if (streetAddressEClass == null) {
			streetAddressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(9);
		}
		return streetAddressEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.StreetAddress#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.StreetAddress#getStatus()
	 * @see #getStreetAddress()
	 * @generated
	 */
	public EReference getStreetAddress_Status() {
        return (EReference)getStreetAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.StreetAddress#getStreetDetail <em>Street Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Street Detail</em>'.
	 * @see CIM15.IEC61968.Common.StreetAddress#getStreetDetail()
	 * @see #getStreetAddress()
	 * @generated
	 */
	public EReference getStreetAddress_StreetDetail() {
        return (EReference)getStreetAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.StreetAddress#getTownDetail <em>Town Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Town Detail</em>'.
	 * @see CIM15.IEC61968.Common.StreetAddress#getTownDetail()
	 * @see #getStreetAddress()
	 * @generated
	 */
	public EReference getStreetAddress_TownDetail() {
        return (EReference)getStreetAddress().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.StreetDetail <em>Street Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street Detail</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail
	 * @generated
	 */
	public EClass getStreetDetail() {
		if (streetDetailEClass == null) {
			streetDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(10);
		}
		return streetDetailEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#isWithinTownLimits <em>Within Town Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Within Town Limits</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#isWithinTownLimits()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_WithinTownLimits() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getName()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_Name() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getType()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_Type() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getPrefix()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_Prefix() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Name</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getBuildingName()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_BuildingName() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getSuiteNumber <em>Suite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suite Number</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getSuiteNumber()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_SuiteNumber() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getSuffix()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_Suffix() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getAddressGeneral <em>Address General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address General</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getAddressGeneral()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_AddressGeneral() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getCode()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_Code() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.StreetDetail#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see CIM15.IEC61968.Common.StreetDetail#getNumber()
	 * @see #getStreetDetail()
	 * @generated
	 */
	public EAttribute getStreetDetail_Number() {
        return (EAttribute)getStreetDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.TimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Schedule</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule
	 * @generated
	 */
	public EClass getTimeSchedule() {
		if (timeScheduleEClass == null) {
			timeScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(11);
		}
		return timeScheduleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Period</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule#getRecurrencePeriod()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public EAttribute getTimeSchedule_RecurrencePeriod() {
        return (EAttribute)getTimeSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule#isDisabled()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public EAttribute getTimeSchedule_Disabled() {
        return (EAttribute)getTimeSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.TimeSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule#getTimePoints()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public EReference getTimeSchedule_TimePoints() {
        return (EReference)getTimeSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule#getOffset()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public EAttribute getTimeSchedule_Offset() {
        return (EAttribute)getTimeSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule Interval</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule#getScheduleInterval()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public EReference getTimeSchedule_ScheduleInterval() {
        return (EReference)getTimeSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrence Pattern</em>'.
	 * @see CIM15.IEC61968.Common.TimeSchedule#getRecurrencePattern()
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public EAttribute getTimeSchedule_RecurrencePattern() {
        return (EAttribute)getTimeSchedule().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.ActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Record</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord
	 * @generated
	 */
	public EClass getActivityRecord() {
		if (activityRecordEClass == null) {
			activityRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(12);
		}
		return activityRecordEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getSeverity()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EAttribute getActivityRecord_Severity() {
        return (EAttribute)getActivityRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date Time</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getCreatedDateTime()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EAttribute getActivityRecord_CreatedDateTime() {
        return (EAttribute)getActivityRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.ActivityRecord#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Persons</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getErpPersons()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EReference getActivityRecord_ErpPersons() {
        return (EReference)getActivityRecord().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.ActivityRecord#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getOrganisations()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EReference getActivityRecord_Organisations() {
        return (EReference)getActivityRecord().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.ActivityRecord#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getDocuments()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EReference getActivityRecord_Documents() {
        return (EReference)getActivityRecord().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.ActivityRecord#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getAssets()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EReference getActivityRecord_Assets() {
        return (EReference)getActivityRecord().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.ActivityRecord#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getStatus()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EReference getActivityRecord_Status() {
        return (EReference)getActivityRecord().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getReason()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EAttribute getActivityRecord_Reason() {
        return (EAttribute)getActivityRecord().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getCategory()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EAttribute getActivityRecord_Category() {
        return (EAttribute)getActivityRecord().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled Event</em>'.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getScheduledEvent()
	 * @see #getActivityRecord()
	 * @generated
	 */
	public EReference getActivityRecord_ScheduledEvent() {
        return (EReference)getActivityRecord().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.TimePoint <em>Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Point</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint
	 * @generated
	 */
	public EClass getTimePoint() {
		if (timePointEClass == null) {
			timePointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(13);
		}
		return timePointEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.TimePoint#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getStatus()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EReference getTimePoint_Status() {
        return (EReference)getTimePoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getDateTime()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EAttribute getTimePoint_DateTime() {
        return (EAttribute)getTimePoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.TimePoint#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Window</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getWindow()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EReference getTimePoint_Window() {
        return (EReference)getTimePoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Schedule</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getTimeSchedule()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EReference getTimePoint_TimeSchedule() {
        return (EReference)getTimePoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getSequenceNumber()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EAttribute getTimePoint_SequenceNumber() {
        return (EAttribute)getTimePoint().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.TimePoint#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Events</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getScheduledEvents()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EReference getTimePoint_ScheduledEvents() {
        return (EReference)getTimePoint().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Time Interval</em>'.
	 * @see CIM15.IEC61968.Common.TimePoint#getRelativeTimeInterval()
	 * @see #getTimePoint()
	 * @generated
	 */
	public EAttribute getTimePoint_RelativeTimeInterval() {
        return (EAttribute)getTimePoint().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see CIM15.IEC61968.Common.Organisation
	 * @generated
	 */
	public EClass getOrganisation() {
		if (organisationEClass == null) {
			organisationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(14);
		}
		return organisationEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Organisation#getPhone2 <em>Phone2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone2</em>'.
	 * @see CIM15.IEC61968.Common.Organisation#getPhone2()
	 * @see #getOrganisation()
	 * @generated
	 */
	public EReference getOrganisation_Phone2() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Organisation#getPhone1 <em>Phone1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone1</em>'.
	 * @see CIM15.IEC61968.Common.Organisation#getPhone1()
	 * @see #getOrganisation()
	 * @generated
	 */
	public EReference getOrganisation_Phone1() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Organisation#getStreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Street Address</em>'.
	 * @see CIM15.IEC61968.Common.Organisation#getStreetAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	public EReference getOrganisation_StreetAddress() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Organisation#getPostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Address</em>'.
	 * @see CIM15.IEC61968.Common.Organisation#getPostalAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	public EReference getOrganisation_PostalAddress() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Organisation#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61968.Common.Organisation#getElectronicAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	public EReference getOrganisation_ElectronicAddress() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Common.Organisation#getBusinessRoles <em>Business Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Roles</em>'.
	 * @see CIM15.IEC61968.Common.Organisation#getBusinessRoles()
	 * @see #getOrganisation()
	 * @generated
	 */
	public EReference getOrganisation_BusinessRoles() {
        return (EReference)getOrganisation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number</em>'.
	 * @see CIM15.IEC61968.Common.TelephoneNumber
	 * @generated
	 */
	public EClass getTelephoneNumber() {
		if (telephoneNumberEClass == null) {
			telephoneNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(15);
		}
		return telephoneNumberEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Code</em>'.
	 * @see CIM15.IEC61968.Common.TelephoneNumber#getCityCode()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	public EAttribute getTelephoneNumber_CityCode() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Number</em>'.
	 * @see CIM15.IEC61968.Common.TelephoneNumber#getLocalNumber()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	public EAttribute getTelephoneNumber_LocalNumber() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see CIM15.IEC61968.Common.TelephoneNumber#getExtension()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	public EAttribute getTelephoneNumber_Extension() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see CIM15.IEC61968.Common.TelephoneNumber#getAreaCode()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	public EAttribute getTelephoneNumber_AreaCode() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see CIM15.IEC61968.Common.TelephoneNumber#getCountryCode()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	public EAttribute getTelephoneNumber_CountryCode() {
        return (EAttribute)getTelephoneNumber().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Common.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see CIM15.IEC61968.Common.Agreement
	 * @generated
	 */
	public EClass getAgreement() {
		if (agreementEClass == null) {
			agreementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI).getEClassifiers().get(16);
		}
		return agreementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Date</em>'.
	 * @see CIM15.IEC61968.Common.Agreement#getSignDate()
	 * @see #getAgreement()
	 * @generated
	 */
	public EAttribute getAgreement_SignDate() {
        return (EAttribute)getAgreement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Common.Agreement#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Interval</em>'.
	 * @see CIM15.IEC61968.Common.Agreement#getValidityInterval()
	 * @see #getAgreement()
	 * @generated
	 */
	public EReference getAgreement_ValidityInterval() {
        return (EReference)getAgreement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61968.Common." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.PostalAddress <em>Postal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.PostalAddress
		 * @see CIM15.IEC61968.Common.CommonPackage#getPostalAddress()
		 * @generated
		 */
		public static final EClass POSTAL_ADDRESS = eINSTANCE.getPostalAddress();

		/**
		 * The meta object literal for the '<em><b>Street Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POSTAL_ADDRESS__STREET_DETAIL = eINSTANCE.getPostalAddress_StreetDetail();

		/**
		 * The meta object literal for the '<em><b>Po Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSTAL_ADDRESS__PO_BOX = eINSTANCE.getPostalAddress_PoBox();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSTAL_ADDRESS__POSTAL_CODE = eINSTANCE.getPostalAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Town Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POSTAL_ADDRESS__TOWN_DETAIL = eINSTANCE.getPostalAddress_TownDetail();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.Status <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.Status
		 * @see CIM15.IEC61968.Common.CommonPackage#getStatus()
		 * @generated
		 */
		public static final EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATUS__REASON = eINSTANCE.getStatus_Reason();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATUS__DATE_TIME = eINSTANCE.getStatus_DateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATUS__VALUE = eINSTANCE.getStatus_Value();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATUS__REMARK = eINSTANCE.getStatus_Remark();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.ElectronicAddress <em>Electronic Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.ElectronicAddress
		 * @see CIM15.IEC61968.Common.CommonPackage#getElectronicAddress()
		 * @generated
		 */
		public static final EClass ELECTRONIC_ADDRESS = eINSTANCE.getElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRONIC_ADDRESS__RADIO = eINSTANCE.getElectronicAddress_Radio();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELECTRONIC_ADDRESS__STATUS = eINSTANCE.getElectronicAddress_Status();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRONIC_ADDRESS__PASSWORD = eINSTANCE.getElectronicAddress_Password();

		/**
		 * The meta object literal for the '<em><b>Lan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRONIC_ADDRESS__LAN = eINSTANCE.getElectronicAddress_Lan();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRONIC_ADDRESS__USER_ID = eINSTANCE.getElectronicAddress_UserID();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRONIC_ADDRESS__EMAIL = eINSTANCE.getElectronicAddress_Email();

		/**
		 * The meta object literal for the '<em><b>Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRONIC_ADDRESS__WEB = eINSTANCE.getElectronicAddress_Web();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.Location <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.Location
		 * @see CIM15.IEC61968.Common.CommonPackage#getLocation()
		 * @generated
		 */
		public static final EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Main Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__MAIN_ADDRESS = eINSTANCE.getLocation_MainAddress();

		/**
		 * The meta object literal for the '<em><b>Phone1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__PHONE1 = eINSTANCE.getLocation_Phone1();

		/**
		 * The meta object literal for the '<em><b>Phone2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__PHONE2 = eINSTANCE.getLocation_Phone2();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__POWER_SYSTEM_RESOURCES = eINSTANCE.getLocation_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Secondary Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__SECONDARY_ADDRESS = eINSTANCE.getLocation_SecondaryAddress();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__CHANGE_ITEMS = eINSTANCE.getLocation_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Red Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__RED_LINES = eINSTANCE.getLocation_RedLines();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOCATION__CATEGORY = eINSTANCE.getLocation_Category();

		/**
		 * The meta object literal for the '<em><b>Dimensions Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__DIMENSIONS_INFO = eINSTANCE.getLocation_DimensionsInfo();

		/**
		 * The meta object literal for the '<em><b>Land Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__LAND_PROPERTIES = eINSTANCE.getLocation_LandProperties();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__ASSETS = eINSTANCE.getLocation_Assets();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__HAZARDS = eINSTANCE.getLocation_Hazards();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__STATUS = eINSTANCE.getLocation_Status();

		/**
		 * The meta object literal for the '<em><b>Crews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__CREWS = eINSTANCE.getLocation_Crews();

		/**
		 * The meta object literal for the '<em><b>Position Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__POSITION_POINTS = eINSTANCE.getLocation_PositionPoints();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__ELECTRONIC_ADDRESS = eINSTANCE.getLocation_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Directions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__DIRECTIONS = eINSTANCE.getLocation_Directions();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__MEASUREMENTS = eINSTANCE.getLocation_Measurements();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__ROUTES = eINSTANCE.getLocation_Routes();

		/**
		 * The meta object literal for the '<em><b>Geo Info Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOCATION__GEO_INFO_REFERENCE = eINSTANCE.getLocation_GeoInfoReference();

		/**
		 * The meta object literal for the '<em><b>Coordinate System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__COORDINATE_SYSTEM = eINSTANCE.getLocation_CoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOCATION__CORPORATE_CODE = eINSTANCE.getLocation_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Erp Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOCATION__ERP_ORGANISATIONS = eINSTANCE.getLocation_ErpOrganisations();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOCATION__DIRECTION = eINSTANCE.getLocation_Direction();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.TownDetail <em>Town Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.TownDetail
		 * @see CIM15.IEC61968.Common.CommonPackage#getTownDetail()
		 * @generated
		 */
		public static final EClass TOWN_DETAIL = eINSTANCE.getTownDetail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TOWN_DETAIL__NAME = eINSTANCE.getTownDetail_Name();

		/**
		 * The meta object literal for the '<em><b>State Or Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TOWN_DETAIL__STATE_OR_PROVINCE = eINSTANCE.getTownDetail_StateOrProvince();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TOWN_DETAIL__SECTION = eINSTANCE.getTownDetail_Section();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TOWN_DETAIL__CODE = eINSTANCE.getTownDetail_Code();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TOWN_DETAIL__COUNTRY = eINSTANCE.getTownDetail_Country();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.CoordinateSystem <em>Coordinate System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.CoordinateSystem
		 * @see CIM15.IEC61968.Common.CommonPackage#getCoordinateSystem()
		 * @generated
		 */
		public static final EClass COORDINATE_SYSTEM = eINSTANCE.getCoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COORDINATE_SYSTEM__DIAGRAMS = eINSTANCE.getCoordinateSystem_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COORDINATE_SYSTEM__LOCATION = eINSTANCE.getCoordinateSystem_Location();

		/**
		 * The meta object literal for the '<em><b>Crs Urn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COORDINATE_SYSTEM__CRS_URN = eINSTANCE.getCoordinateSystem_CrsUrn();

		/**
		 * The meta object literal for the '<em><b>Gml Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS = eINSTANCE.getCoordinateSystem_GmlDiagramObjects();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.Document
		 * @see CIM15.IEC61968.Common.CommonPackage#getDocument()
		 * @generated
		 */
		public static final EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__CHANGE_ITEMS = eINSTANCE.getDocument_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>To Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__TO_DOCUMENT_ROLES = eINSTANCE.getDocument_ToDocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__ELECTRONIC_ADDRESS = eINSTANCE.getDocument_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT__REVISION_NUMBER = eINSTANCE.getDocument_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__NETWORK_DATA_SETS = eINSTANCE.getDocument_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>From Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__FROM_DOCUMENT_ROLES = eINSTANCE.getDocument_FromDocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Schedule Parameter Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__SCHEDULE_PARAMETER_INFOS = eINSTANCE.getDocument_ScheduleParameterInfos();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__ERP_ORGANISATION_ROLES = eINSTANCE.getDocument_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Created Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT__CREATED_DATE_TIME = eINSTANCE.getDocument_CreatedDateTime();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__MEASUREMENTS = eINSTANCE.getDocument_Measurements();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT__LAST_MODIFIED_DATE_TIME = eINSTANCE.getDocument_LastModifiedDateTime();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__ACTIVITY_RECORDS = eINSTANCE.getDocument_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT__SUBJECT = eINSTANCE.getDocument_Subject();

		/**
		 * The meta object literal for the '<em><b>Change Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__CHANGE_SETS = eINSTANCE.getDocument_ChangeSets();

		/**
		 * The meta object literal for the '<em><b>Erp Person Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__ERP_PERSON_ROLES = eINSTANCE.getDocument_ErpPersonRoles();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__SCHEDULED_EVENTS = eINSTANCE.getDocument_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Doc Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__DOC_STATUS = eINSTANCE.getDocument_DocStatus();

		/**
		 * The meta object literal for the '<em><b>Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__ASSET_ROLES = eINSTANCE.getDocument_AssetRoles();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__STATUS = eINSTANCE.getDocument_Status();

		/**
		 * The meta object literal for the '<em><b>Power System Resource Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES = eINSTANCE.getDocument_PowerSystemResourceRoles();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOCUMENT__CATEGORY = eINSTANCE.getDocument_Category();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.PositionPoint <em>Position Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.PositionPoint
		 * @see CIM15.IEC61968.Common.CommonPackage#getPositionPoint()
		 * @generated
		 */
		public static final EClass POSITION_POINT = eINSTANCE.getPositionPoint();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_POINT__XPOSITION = eINSTANCE.getPositionPoint_XPosition();

		/**
		 * The meta object literal for the '<em><b>ZPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_POINT__ZPOSITION = eINSTANCE.getPositionPoint_ZPosition();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_POINT__SEQUENCE_NUMBER = eINSTANCE.getPositionPoint_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_POINT__YPOSITION = eINSTANCE.getPositionPoint_YPosition();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POSITION_POINT__LOCATION = eINSTANCE.getPositionPoint_Location();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.UserAttribute <em>User Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.UserAttribute
		 * @see CIM15.IEC61968.Common.CommonPackage#getUserAttribute()
		 * @generated
		 */
		public static final EClass USER_ATTRIBUTE = eINSTANCE.getUserAttribute();

		/**
		 * The meta object literal for the '<em><b>Erp Ledger Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__ERP_LEDGER_ENTRIES = eINSTANCE.getUserAttribute_ErpLedgerEntries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute USER_ATTRIBUTE__NAME = eINSTANCE.getUserAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute USER_ATTRIBUTE__VALUE = eINSTANCE.getUserAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Procedure Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__PROCEDURE_DATA_SETS = eINSTANCE.getUserAttribute_ProcedureDataSets();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__TRANSACTION = eINSTANCE.getUserAttribute_Transaction();

		/**
		 * The meta object literal for the '<em><b>Property Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__PROPERTY_SPECIFICATION = eINSTANCE.getUserAttribute_PropertySpecification();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__PROCEDURE = eINSTANCE.getUserAttribute_Procedure();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute USER_ATTRIBUTE__SEQUENCE_NUMBER = eINSTANCE.getUserAttribute_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Property Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__PROPERTY_ASSETS = eINSTANCE.getUserAttribute_PropertyAssets();

		/**
		 * The meta object literal for the '<em><b>Rating Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__RATING_SPECIFICATION = eINSTANCE.getUserAttribute_RatingSpecification();

		/**
		 * The meta object literal for the '<em><b>Erp Invoice Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS = eINSTANCE.getUserAttribute_ErpInvoiceLineItems();

		/**
		 * The meta object literal for the '<em><b>Rating Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference USER_ATTRIBUTE__RATING_ASSETS = eINSTANCE.getUserAttribute_RatingAssets();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.StreetAddress <em>Street Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.StreetAddress
		 * @see CIM15.IEC61968.Common.CommonPackage#getStreetAddress()
		 * @generated
		 */
		public static final EClass STREET_ADDRESS = eINSTANCE.getStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STREET_ADDRESS__STATUS = eINSTANCE.getStreetAddress_Status();

		/**
		 * The meta object literal for the '<em><b>Street Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STREET_ADDRESS__STREET_DETAIL = eINSTANCE.getStreetAddress_StreetDetail();

		/**
		 * The meta object literal for the '<em><b>Town Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STREET_ADDRESS__TOWN_DETAIL = eINSTANCE.getStreetAddress_TownDetail();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.StreetDetail <em>Street Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.StreetDetail
		 * @see CIM15.IEC61968.Common.CommonPackage#getStreetDetail()
		 * @generated
		 */
		public static final EClass STREET_DETAIL = eINSTANCE.getStreetDetail();

		/**
		 * The meta object literal for the '<em><b>Within Town Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__WITHIN_TOWN_LIMITS = eINSTANCE.getStreetDetail_WithinTownLimits();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__NAME = eINSTANCE.getStreetDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__TYPE = eINSTANCE.getStreetDetail_Type();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__PREFIX = eINSTANCE.getStreetDetail_Prefix();

		/**
		 * The meta object literal for the '<em><b>Building Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__BUILDING_NAME = eINSTANCE.getStreetDetail_BuildingName();

		/**
		 * The meta object literal for the '<em><b>Suite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__SUITE_NUMBER = eINSTANCE.getStreetDetail_SuiteNumber();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__SUFFIX = eINSTANCE.getStreetDetail_Suffix();

		/**
		 * The meta object literal for the '<em><b>Address General</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__ADDRESS_GENERAL = eINSTANCE.getStreetDetail_AddressGeneral();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__CODE = eINSTANCE.getStreetDetail_Code();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STREET_DETAIL__NUMBER = eINSTANCE.getStreetDetail_Number();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.TimeSchedule <em>Time Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.TimeSchedule
		 * @see CIM15.IEC61968.Common.CommonPackage#getTimeSchedule()
		 * @generated
		 */
		public static final EClass TIME_SCHEDULE = eINSTANCE.getTimeSchedule();

		/**
		 * The meta object literal for the '<em><b>Recurrence Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SCHEDULE__RECURRENCE_PERIOD = eINSTANCE.getTimeSchedule_RecurrencePeriod();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SCHEDULE__DISABLED = eINSTANCE.getTimeSchedule_Disabled();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_SCHEDULE__TIME_POINTS = eINSTANCE.getTimeSchedule_TimePoints();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SCHEDULE__OFFSET = eINSTANCE.getTimeSchedule_Offset();

		/**
		 * The meta object literal for the '<em><b>Schedule Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_SCHEDULE__SCHEDULE_INTERVAL = eINSTANCE.getTimeSchedule_ScheduleInterval();

		/**
		 * The meta object literal for the '<em><b>Recurrence Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SCHEDULE__RECURRENCE_PATTERN = eINSTANCE.getTimeSchedule_RecurrencePattern();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.ActivityRecord <em>Activity Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.ActivityRecord
		 * @see CIM15.IEC61968.Common.CommonPackage#getActivityRecord()
		 * @generated
		 */
		public static final EClass ACTIVITY_RECORD = eINSTANCE.getActivityRecord();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTIVITY_RECORD__SEVERITY = eINSTANCE.getActivityRecord_Severity();

		/**
		 * The meta object literal for the '<em><b>Created Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTIVITY_RECORD__CREATED_DATE_TIME = eINSTANCE.getActivityRecord_CreatedDateTime();

		/**
		 * The meta object literal for the '<em><b>Erp Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVITY_RECORD__ERP_PERSONS = eINSTANCE.getActivityRecord_ErpPersons();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVITY_RECORD__ORGANISATIONS = eINSTANCE.getActivityRecord_Organisations();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVITY_RECORD__DOCUMENTS = eINSTANCE.getActivityRecord_Documents();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVITY_RECORD__ASSETS = eINSTANCE.getActivityRecord_Assets();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVITY_RECORD__STATUS = eINSTANCE.getActivityRecord_Status();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTIVITY_RECORD__REASON = eINSTANCE.getActivityRecord_Reason();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTIVITY_RECORD__CATEGORY = eINSTANCE.getActivityRecord_Category();

		/**
		 * The meta object literal for the '<em><b>Scheduled Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVITY_RECORD__SCHEDULED_EVENT = eINSTANCE.getActivityRecord_ScheduledEvent();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.TimePoint <em>Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.TimePoint
		 * @see CIM15.IEC61968.Common.CommonPackage#getTimePoint()
		 * @generated
		 */
		public static final EClass TIME_POINT = eINSTANCE.getTimePoint();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_POINT__STATUS = eINSTANCE.getTimePoint_Status();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_POINT__DATE_TIME = eINSTANCE.getTimePoint_DateTime();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_POINT__WINDOW = eINSTANCE.getTimePoint_Window();

		/**
		 * The meta object literal for the '<em><b>Time Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_POINT__TIME_SCHEDULE = eINSTANCE.getTimePoint_TimeSchedule();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_POINT__SEQUENCE_NUMBER = eINSTANCE.getTimePoint_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_POINT__SCHEDULED_EVENTS = eINSTANCE.getTimePoint_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Relative Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_POINT__RELATIVE_TIME_INTERVAL = eINSTANCE.getTimePoint_RelativeTimeInterval();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.Organisation <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.Organisation
		 * @see CIM15.IEC61968.Common.CommonPackage#getOrganisation()
		 * @generated
		 */
		public static final EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Phone2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORGANISATION__PHONE2 = eINSTANCE.getOrganisation_Phone2();

		/**
		 * The meta object literal for the '<em><b>Phone1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORGANISATION__PHONE1 = eINSTANCE.getOrganisation_Phone1();

		/**
		 * The meta object literal for the '<em><b>Street Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORGANISATION__STREET_ADDRESS = eINSTANCE.getOrganisation_StreetAddress();

		/**
		 * The meta object literal for the '<em><b>Postal Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORGANISATION__POSTAL_ADDRESS = eINSTANCE.getOrganisation_PostalAddress();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORGANISATION__ELECTRONIC_ADDRESS = eINSTANCE.getOrganisation_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Business Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORGANISATION__BUSINESS_ROLES = eINSTANCE.getOrganisation_BusinessRoles();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.TelephoneNumber <em>Telephone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.TelephoneNumber
		 * @see CIM15.IEC61968.Common.CommonPackage#getTelephoneNumber()
		 * @generated
		 */
		public static final EClass TELEPHONE_NUMBER = eINSTANCE.getTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>City Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TELEPHONE_NUMBER__CITY_CODE = eINSTANCE.getTelephoneNumber_CityCode();

		/**
		 * The meta object literal for the '<em><b>Local Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TELEPHONE_NUMBER__LOCAL_NUMBER = eINSTANCE.getTelephoneNumber_LocalNumber();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TELEPHONE_NUMBER__EXTENSION = eINSTANCE.getTelephoneNumber_Extension();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TELEPHONE_NUMBER__AREA_CODE = eINSTANCE.getTelephoneNumber_AreaCode();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TELEPHONE_NUMBER__COUNTRY_CODE = eINSTANCE.getTelephoneNumber_CountryCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Common.Agreement <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Common.Agreement
		 * @see CIM15.IEC61968.Common.CommonPackage#getAgreement()
		 * @generated
		 */
		public static final EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '<em><b>Sign Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AGREEMENT__SIGN_DATE = eINSTANCE.getAgreement_SignDate();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AGREEMENT__VALIDITY_INTERVAL = eINSTANCE.getAgreement_ValidityInterval();

	}

} //CommonPackage
