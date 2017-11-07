/**
 */
package CIM15.IEC61968.Metering;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.CommonPackage;

import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61968.IEC61968Package;

import CIM15.IEC61968.LoadControl.LoadControlPackage;

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
 * @see CIM15.IEC61968.Metering.MeteringFactory
 * @generated
 */
public class MeteringPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Metering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Metering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimMetering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeteringPackage eINSTANCE = CIM15.IEC61968.Metering.MeteringPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.SDPLocation <em>SDP Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.SDPLocation
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getSDPLocation()
	 * @generated
	 */
	public static final int SDP_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__UUID = CommonPackage.LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__NAMES = CommonPackage.LOCATION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__DIAGRAM_OBJECTS = CommonPackage.LOCATION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__MRID = CommonPackage.LOCATION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__ALIAS_NAME = CommonPackage.LOCATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__NAME = CommonPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__MODELING_AUTHORITY_SET = CommonPackage.LOCATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Main Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__MAIN_ADDRESS = CommonPackage.LOCATION__MAIN_ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__PHONE1 = CommonPackage.LOCATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__PHONE2 = CommonPackage.LOCATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__POWER_SYSTEM_RESOURCES = CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Secondary Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__SECONDARY_ADDRESS = CommonPackage.LOCATION__SECONDARY_ADDRESS;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__CHANGE_ITEMS = CommonPackage.LOCATION__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Red Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__RED_LINES = CommonPackage.LOCATION__RED_LINES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__CATEGORY = CommonPackage.LOCATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__DIMENSIONS_INFO = CommonPackage.LOCATION__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__LAND_PROPERTIES = CommonPackage.LOCATION__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__ASSETS = CommonPackage.LOCATION__ASSETS;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__HAZARDS = CommonPackage.LOCATION__HAZARDS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__STATUS = CommonPackage.LOCATION__STATUS;

	/**
	 * The feature id for the '<em><b>Crews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__CREWS = CommonPackage.LOCATION__CREWS;

	/**
	 * The feature id for the '<em><b>Position Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__POSITION_POINTS = CommonPackage.LOCATION__POSITION_POINTS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__ELECTRONIC_ADDRESS = CommonPackage.LOCATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__DIRECTIONS = CommonPackage.LOCATION__DIRECTIONS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__MEASUREMENTS = CommonPackage.LOCATION__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__ROUTES = CommonPackage.LOCATION__ROUTES;

	/**
	 * The feature id for the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__GEO_INFO_REFERENCE = CommonPackage.LOCATION__GEO_INFO_REFERENCE;

	/**
	 * The feature id for the '<em><b>Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__COORDINATE_SYSTEM = CommonPackage.LOCATION__COORDINATE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__CORPORATE_CODE = CommonPackage.LOCATION__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__ERP_ORGANISATIONS = CommonPackage.LOCATION__ERP_ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__DIRECTION = CommonPackage.LOCATION__DIRECTION;

	/**
	 * The feature id for the '<em><b>Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__ACCESS_METHOD = CommonPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__SERVICE_DELIVERY_POINTS = CommonPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__REMARK = CommonPackage.LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Site Access Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__SITE_ACCESS_PROBLEM = CommonPackage.LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Occupancy Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION__OCCUPANCY_DATE = CommonPackage.LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION_FEATURE_COUNT = CommonPackage.LOCATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SDP Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SDP_LOCATION_OPERATION_COUNT = CommonPackage.LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.Reading <em>Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.Reading
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getReading()
	 * @generated
	 */
	public static final int READING = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__UUID = MeasPackage.MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__NAMES = MeasPackage.MEASUREMENT_VALUE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__DIAGRAM_OBJECTS = MeasPackage.MEASUREMENT_VALUE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__MRID = MeasPackage.MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__ALIAS_NAME = MeasPackage.MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__NAME = MeasPackage.MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__MODELING_AUTHORITY_SET = MeasPackage.MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__GML_VALUES = MeasPackage.MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__MEASUREMENT_VALUE_QUALITY = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__SENSOR_ACCURACY = MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__PROCEDURE_DATA_SETS = MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__MEASUREMENT_VALUE_SOURCE = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__ERP_PERSON = MeasPackage.MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__REMOTE_SOURCE = MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__TIME_STAMP = MeasPackage.MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__READING_TYPE = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__METER_READINGS = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__VALUE = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reading Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING__READING_QUALITIES = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_FEATURE_COUNT = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_OPERATION_COUNT = MeasPackage.MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint <em>Service Delivery Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint()
	 * @generated
	 */
	public static final int SERVICE_DELIVERY_POINT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>SDP Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__SDP_LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__SERVICE_LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__CHECK_BILLING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__END_DEVICES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__METER_READINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estimated Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__ESTIMATED_LOAD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__SERVICE_CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rated Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__RATED_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pricing Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__PRICING_STRUCTURES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__SERVICE_PRIORITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__GROUNDED = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__ENERGY_CONSUMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service Delivery Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__PHASE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Service Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Ctpt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__CTPT_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__RATED_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__RATED_VOLTAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Transformer Tanks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Service Delivery Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DELIVERY_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.EndDeviceFunction <em>End Device Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceFunction()
	 * @generated
	 */
	public static final int END_DEVICE_FUNCTION = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__UUID = AssetsPackage.ASSET_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__NAMES = AssetsPackage.ASSET_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__DIAGRAM_OBJECTS = AssetsPackage.ASSET_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__MRID = AssetsPackage.ASSET_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__ALIAS_NAME = AssetsPackage.ASSET_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__NAME = AssetsPackage.ASSET_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__ASSET = AssetsPackage.ASSET_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__PASSWORD = AssetsPackage.ASSET_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__HARDWARE_ID = AssetsPackage.ASSET_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__FIRMWARE_ID = AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__PROGRAM_ID = AssetsPackage.ASSET_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__CONFIG_ID = AssetsPackage.ASSET_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__REGISTERS = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__ENABLED = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__COM_EQUIPMENT = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__SUPPORTED = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__END_DEVICE_EVENTS = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION__END_DEVICE = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>End Device Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION_FEATURE_COUNT = AssetsPackage.ASSET_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>End Device Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FUNCTION_OPERATION_COUNT = AssetsPackage.ASSET_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction <em>Electric Metering Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction()
	 * @generated
	 */
	public static final int ELECTRIC_METERING_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__UUID = END_DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__NAMES = END_DEVICE_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__DIAGRAM_OBJECTS = END_DEVICE_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__MRID = END_DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__ALIAS_NAME = END_DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__NAME = END_DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__MODELING_AUTHORITY_SET = END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__ASSET = END_DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__PASSWORD = END_DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__HARDWARE_ID = END_DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__FIRMWARE_ID = END_DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__PROGRAM_ID = END_DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__CONFIG_ID = END_DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__REGISTERS = END_DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__ENABLED = END_DEVICE_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__COM_EQUIPMENT = END_DEVICE_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__SUPPORTED = END_DEVICE_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__END_DEVICE_EVENTS = END_DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__END_DEVICE = END_DEVICE_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>KW Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER = END_DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ct Ratio Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER = END_DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>KWh Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER = END_DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Billing Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER = END_DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vt Ratio Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER = END_DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Demand Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER = END_DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Electric Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION_FEATURE_COUNT = END_DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Electric Metering Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_METERING_FUNCTION_OPERATION_COUNT = END_DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.DemandResponseProgram <em>Demand Response Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getDemandResponseProgram()
	 * @generated
	 */
	public static final int DEMAND_RESPONSE_PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Device Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Demand Response Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Demand Response Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_PROGRAM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ReadingMultiplier <em>Reading Multiplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ReadingMultiplier
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingMultiplier()
	 * @generated
	 */
	public static final int READING_MULTIPLIER = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_MULTIPLIER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Is Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_MULTIPLIER__IS_APPLIED = 1;

	/**
	 * The number of structural features of the '<em>Reading Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_MULTIPLIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reading Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_MULTIPLIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.MeterReading <em>Meter Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.MeterReading
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getMeterReading()
	 * @generated
	 */
	public static final int METER_READING = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__SERVICE_DELIVERY_POINT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__VALUES_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__END_DEVICE_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__READINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__CUSTOMER_AGREEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__METER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING__INTERVAL_BLOCKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Meter Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Meter Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_READING_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ReadingQuality <em>Reading Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ReadingQuality
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingQuality()
	 * @generated
	 */
	public static final int READING_QUALITY = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_QUALITY__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_QUALITY__READING = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_QUALITY__QUALITY = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_QUALITY__INTERVAL_READING = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reading Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_QUALITY_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reading Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_QUALITY_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.EndDeviceEvent <em>End Device Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceEvent()
	 * @generated
	 */
	public static final int END_DEVICE_EVENT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__NAMES = CommonPackage.ACTIVITY_RECORD__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__DIAGRAM_OBJECTS = CommonPackage.ACTIVITY_RECORD__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>End Device Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__END_DEVICE_FUNCTION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__USER_ID = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meter Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT__METER_READING = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>End Device Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>End Device Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.IntervalReading <em>Interval Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.IntervalReading
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getIntervalReading()
	 * @generated
	 */
	public static final int INTERVAL_READING = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__UUID = MeasPackage.MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__NAMES = MeasPackage.MEASUREMENT_VALUE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__DIAGRAM_OBJECTS = MeasPackage.MEASUREMENT_VALUE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__MRID = MeasPackage.MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__ALIAS_NAME = MeasPackage.MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__NAME = MeasPackage.MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__MODELING_AUTHORITY_SET = MeasPackage.MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__GML_VALUES = MeasPackage.MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__MEASUREMENT_VALUE_QUALITY = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__SENSOR_ACCURACY = MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__PROCEDURE_DATA_SETS = MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__MEASUREMENT_VALUE_SOURCE = MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__ERP_PERSON = MeasPackage.MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__REMOTE_SOURCE = MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__TIME_STAMP = MeasPackage.MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__VALUE = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__INTERVAL_BLOCKS = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reading Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING__READING_QUALITIES = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interval Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING_FEATURE_COUNT = MeasPackage.MEASUREMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interval Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_READING_OPERATION_COUNT = MeasPackage.MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.EndDevice <em>End Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.EndDevice
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDevice()
	 * @generated
	 */
	public static final int END_DEVICE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__NAMES = AssetsPackage.ASSET_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__DIAGRAM_OBJECTS = AssetsPackage.ASSET_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>End Device Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__END_DEVICE_INFO = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__SERVICE_DELIVERY_POINT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Zone Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__TIME_ZONE_OFFSET = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__SERVICE_LOCATION = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Device Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__END_DEVICE_FUNCTIONS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amr System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__AMR_SYSTEM = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__END_DEVICE_CONTROLS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__CUSTOMER = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>End Device Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE__END_DEVICE_GROUPS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>End Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>End Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.Meter <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.Meter
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getMeter()
	 * @generated
	 */
	public static final int METER = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__UUID = END_DEVICE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__NAMES = END_DEVICE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__DIAGRAM_OBJECTS = END_DEVICE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__MRID = END_DEVICE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ALIAS_NAME = END_DEVICE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__NAME = END_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__MODELING_AUTHORITY_SET = END_DEVICE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__DOCUMENT_ROLES = END_DEVICE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__MEDIUMS = END_DEVICE__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ERP_REC_DELIVERY_ITEMS = END_DEVICE__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__RATINGS = END_DEVICE__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__TO_ASSET_ROLES = END_DEVICE__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ELECTRONIC_ADDRESS = END_DEVICE__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__FROM_ASSET_ROLES = END_DEVICE__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ASSET_FUNCTIONS = END_DEVICE__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ERP_ITEM_MASTER = END_DEVICE__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__CORPORATE_CODE = END_DEVICE__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ERP_INVENTORY = END_DEVICE__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__RELIABILITY_INFOS = END_DEVICE__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__UTC_NUMBER = END_DEVICE__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ASSET_INFO = END_DEVICE__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__WORK_TASK = END_DEVICE__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__INITIAL_CONDITION = END_DEVICE__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ACCEPTANCE_TEST = END_DEVICE__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ERP_ORGANISATION_ROLES = END_DEVICE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__SCHEDULED_EVENTS = END_DEVICE__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ASSET_CONTAINER = END_DEVICE__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__CATEGORY = END_DEVICE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ASSET_PROPERTY_CURVES = END_DEVICE__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__SERIAL_NUMBER = END_DEVICE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__CHANGE_ITEMS = END_DEVICE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ACTIVITY_RECORDS = END_DEVICE__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__LOCATION = END_DEVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__CRITICAL = END_DEVICE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__STATUS = END_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__APPLICATION = END_DEVICE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__PURCHASE_PRICE = END_DEVICE__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__INITIAL_LOSS_OF_LIFE = END_DEVICE__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__POWER_SYSTEM_RESOURCES = END_DEVICE__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__MANUFACTURED_DATE = END_DEVICE__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__FINANCIAL_INFO = END_DEVICE__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__INSTALLATION_DATE = END_DEVICE__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__PROPERTIES = END_DEVICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__MEASUREMENTS = END_DEVICE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__LOT_NUMBER = END_DEVICE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__SEALS = END_DEVICE__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__ASSETS = END_DEVICE__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__LAND_PROPERTIES = END_DEVICE__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>End Device Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__END_DEVICE_INFO = END_DEVICE__END_DEVICE_INFO;

	/**
	 * The feature id for the '<em><b>Service Delivery Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__SERVICE_DELIVERY_POINT = END_DEVICE__SERVICE_DELIVERY_POINT;

	/**
	 * The feature id for the '<em><b>Time Zone Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__TIME_ZONE_OFFSET = END_DEVICE__TIME_ZONE_OFFSET;

	/**
	 * The feature id for the '<em><b>Service Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__SERVICE_LOCATION = END_DEVICE__SERVICE_LOCATION;

	/**
	 * The feature id for the '<em><b>End Device Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__END_DEVICE_FUNCTIONS = END_DEVICE__END_DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Amr System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__AMR_SYSTEM = END_DEVICE__AMR_SYSTEM;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__END_DEVICE_CONTROLS = END_DEVICE__END_DEVICE_CONTROLS;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__CUSTOMER = END_DEVICE__CUSTOMER;

	/**
	 * The feature id for the '<em><b>End Device Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__END_DEVICE_GROUPS = END_DEVICE__END_DEVICE_GROUPS;

	/**
	 * The feature id for the '<em><b>Meter Replacement Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__METER_REPLACEMENT_WORKS = END_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__METER_READINGS = END_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meter Service Works</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__METER_SERVICE_WORKS = END_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>KR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__KR = END_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>KH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__KH = END_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Form Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__FORM_NUMBER = END_DEVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vending Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER__VENDING_TRANSACTIONS = END_DEVICE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_FEATURE_COUNT = END_DEVICE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_OPERATION_COUNT = END_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.MeterServiceWork <em>Meter Service Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.MeterServiceWork
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getMeterServiceWork()
	 * @generated
	 */
	public static final int METER_SERVICE_WORK = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__UUID = WorkPackage.WORK__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__NAMES = WorkPackage.WORK__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__DIAGRAM_OBJECTS = WorkPackage.WORK__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__MRID = WorkPackage.WORK__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ALIAS_NAME = WorkPackage.WORK__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__NAME = WorkPackage.WORK__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__MODELING_AUTHORITY_SET = WorkPackage.WORK__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__CHANGE_ITEMS = WorkPackage.WORK__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__TO_DOCUMENT_ROLES = WorkPackage.WORK__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ELECTRONIC_ADDRESS = WorkPackage.WORK__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__REVISION_NUMBER = WorkPackage.WORK__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__NETWORK_DATA_SETS = WorkPackage.WORK__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__FROM_DOCUMENT_ROLES = WorkPackage.WORK__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__SCHEDULE_PARAMETER_INFOS = WorkPackage.WORK__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ERP_ORGANISATION_ROLES = WorkPackage.WORK__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__CREATED_DATE_TIME = WorkPackage.WORK__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__MEASUREMENTS = WorkPackage.WORK__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__LAST_MODIFIED_DATE_TIME = WorkPackage.WORK__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ACTIVITY_RECORDS = WorkPackage.WORK__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__SUBJECT = WorkPackage.WORK__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__CHANGE_SETS = WorkPackage.WORK__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ERP_PERSON_ROLES = WorkPackage.WORK__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__SCHEDULED_EVENTS = WorkPackage.WORK__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__TITLE = WorkPackage.WORK__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__DOC_STATUS = WorkPackage.WORK__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ASSET_ROLES = WorkPackage.WORK__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__STATUS = WorkPackage.WORK__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__POWER_SYSTEM_RESOURCE_ROLES = WorkPackage.WORK__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__CATEGORY = WorkPackage.WORK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Designs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__DESIGNS = WorkPackage.WORK__DESIGNS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__KIND = WorkPackage.WORK__KIND;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__PRIORITY = WorkPackage.WORK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Work Cost Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__WORK_COST_DETAILS = WorkPackage.WORK__WORK_COST_DETAILS;

	/**
	 * The feature id for the '<em><b>Erp Project Accounting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__ERP_PROJECT_ACCOUNTING = WorkPackage.WORK__ERP_PROJECT_ACCOUNTING;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__PROJECT = WorkPackage.WORK__PROJECT;

	/**
	 * The feature id for the '<em><b>Request Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__REQUEST_DATE_TIME = WorkPackage.WORK__REQUEST_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Work Flow Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__WORK_FLOW_STEPS = WorkPackage.WORK__WORK_FLOW_STEPS;

	/**
	 * The feature id for the '<em><b>Work Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__WORK_TASKS = WorkPackage.WORK__WORK_TASKS;

	/**
	 * The feature id for the '<em><b>Business Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__BUSINESS_CASE = WorkPackage.WORK__BUSINESS_CASE;

	/**
	 * The feature id for the '<em><b>Work Billing Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__WORK_BILLING_INFO = WorkPackage.WORK__WORK_BILLING_INFO;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__REQUEST = WorkPackage.WORK__REQUEST;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__CUSTOMERS = WorkPackage.WORK__CUSTOMERS;

	/**
	 * The feature id for the '<em><b>Old Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__OLD_METER = WorkPackage.WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK__METER = WorkPackage.WORK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Service Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK_FEATURE_COUNT = WorkPackage.WORK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Service Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int METER_SERVICE_WORK_OPERATION_COUNT = WorkPackage.WORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.PendingCalculation <em>Pending Calculation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.PendingCalculation
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getPendingCalculation()
	 * @generated
	 */
	public static final int PENDING_CALCULATION = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Scalar Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__SCALAR_NUMERATOR = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiply Before Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__MULTIPLY_BEFORE_ADD = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__INTERVAL_BLOCKS = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scalar Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__SCALAR_DENOMINATOR = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scalar Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__SCALAR_FLOAT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__OFFSET = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION__READING_TYPE = CIM15Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pending Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pending Calculation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CALCULATION_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.IntervalBlock <em>Interval Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.IntervalBlock
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getIntervalBlock()
	 * @generated
	 */
	public static final int INTERVAL_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK__READING_TYPE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK__INTERVAL_READINGS = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meter Reading</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK__METER_READING = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pending Calculation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK__PENDING_CALCULATION = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interval Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interval Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_BLOCK_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ComFunction <em>Com Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ComFunction
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getComFunction()
	 * @generated
	 */
	public static final int COM_FUNCTION = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__UUID = END_DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__NAMES = END_DEVICE_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__DIAGRAM_OBJECTS = END_DEVICE_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__MRID = END_DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__ALIAS_NAME = END_DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__NAME = END_DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__MODELING_AUTHORITY_SET = END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__ASSET = END_DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__PASSWORD = END_DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__HARDWARE_ID = END_DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__FIRMWARE_ID = END_DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__PROGRAM_ID = END_DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__CONFIG_ID = END_DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__REGISTERS = END_DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__ENABLED = END_DEVICE_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__COM_EQUIPMENT = END_DEVICE_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__SUPPORTED = END_DEVICE_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__END_DEVICE_EVENTS = END_DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__END_DEVICE = END_DEVICE_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>Amr Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__AMR_ROUTER = END_DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amr Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__AMR_ADDRESS = END_DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Two Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION__TWO_WAY = END_DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Com Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION_FEATURE_COUNT = END_DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Com Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_FUNCTION_OPERATION_COUNT = END_DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.SimpleEndDeviceFunction <em>Simple End Device Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.SimpleEndDeviceFunction
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getSimpleEndDeviceFunction()
	 * @generated
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__UUID = END_DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__NAMES = END_DEVICE_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__DIAGRAM_OBJECTS = END_DEVICE_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__MRID = END_DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__ALIAS_NAME = END_DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__NAME = END_DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET = END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__ASSET = END_DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__PASSWORD = END_DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__HARDWARE_ID = END_DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__FIRMWARE_ID = END_DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__PROGRAM_ID = END_DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__CONFIG_ID = END_DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__REGISTERS = END_DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__ENABLED = END_DEVICE_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__COM_EQUIPMENT = END_DEVICE_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__SUPPORTED = END_DEVICE_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__END_DEVICE_EVENTS = END_DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__END_DEVICE = END_DEVICE_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION__KIND = END_DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple End Device Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION_FEATURE_COUNT = END_DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple End Device Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_END_DEVICE_FUNCTION_OPERATION_COUNT = END_DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.EndDeviceGroup <em>End Device Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceGroup()
	 * @generated
	 */
	public static final int END_DEVICE_GROUP = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>End Device Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__END_DEVICE_CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__END_DEVICES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Demand Response Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP__GROUP_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>End Device Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>End Device Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.Register <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.Register
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getRegister()
	 * @generated
	 */
	public static final int REGISTER = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Reading Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__READING_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__LEFT_DIGIT_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__RIGHT_DIGIT_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Device Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER__END_DEVICE_FUNCTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.EndDeviceControl <em>End Device Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.EndDeviceControl
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceControl()
	 * @generated
	 */
	public static final int END_DEVICE_CONTROL = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Demand Response Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dr Program Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__DR_PROGRAM_LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dr Program Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__CUSTOMER_AGREEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduled Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__SCHEDULED_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Device Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__END_DEVICE_GROUP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__END_DEVICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Price Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL__PRICE_SIGNAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>End Device Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>End Device Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_CONTROL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.DynamicDemand <em>Dynamic Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.DynamicDemand
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getDynamicDemand()
	 * @generated
	 */
	public static final int DYNAMIC_DEMAND = 21;

	/**
	 * The feature id for the '<em><b>Sub Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_DEMAND__SUB_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_DEMAND__INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_DEMAND__KIND = 2;

	/**
	 * The number of structural features of the '<em>Dynamic Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_DEMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dynamic Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_DEMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ReadingType <em>Reading Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ReadingType
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingType()
	 * @generated
	 */
	public static final int READING_TYPE = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__MULTIPLIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__INTERVAL_BLOCKS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dynamic Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__DYNAMIC_CONFIGURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reverse Chronology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__REVERSE_CHRONOLOGY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__DEFAULT_QUALITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interval Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__INTERVAL_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Channel Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__CHANNEL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__READINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Value Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__DEFAULT_VALUE_DATA_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__REGISTER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pending Calculation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE__PENDING_CALCULATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Reading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Reading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int READING_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.EndDeviceFunctionKind <em>End Device Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.EndDeviceFunctionKind
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceFunctionKind()
	 * @generated
	 */
	public static final int END_DEVICE_FUNCTION_KIND = 23;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.ReadingKind <em>Reading Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.ReadingKind
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingKind()
	 * @generated
	 */
	public static final int READING_KIND = 24;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Metering.DemandKind <em>Demand Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Metering.DemandKind
	 * @see CIM15.IEC61968.Metering.MeteringPackage#getDemandKind()
	 * @generated
	 */
	public static final int DEMAND_KIND = 25;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdpLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricMeteringFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandResponseProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingMultiplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterServiceWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pendingCalculationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEndDeviceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicDemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endDeviceFunctionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum readingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum demandKindEEnum = null;

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
	 * @see CIM15.IEC61968.Metering.MeteringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeteringPackage() {
		super(eNS_URI, MeteringFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link MeteringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MeteringPackage init() {
		if (isInited) return (MeteringPackage)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI);

		// Obtain or create and register package
		MeteringPackage theMeteringPackage = (MeteringPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeteringPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeteringPackage());

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
		CommonPackage theCommonPackage = (CommonPackage)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackage ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		AssetModelsPackage theAssetModelsPackage = (AssetModelsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) instanceof AssetModelsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) : AssetModelsPackage.eINSTANCE);
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
		theMeteringPackage.fixPackageContents();
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
		theCommonPackage.fixPackageContents();
		theAssetModelsPackage.fixPackageContents();
		thePaymentMeteringPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeteringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeteringPackage.eNS_URI, theMeteringPackage);
		return theMeteringPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.SDPLocation <em>SDP Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDP Location</em>'.
	 * @see CIM15.IEC61968.Metering.SDPLocation
	 * @generated
	 */
	public EClass getSDPLocation() {
		if (sdpLocationEClass == null) {
			sdpLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(0);
		}
		return sdpLocationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Method</em>'.
	 * @see CIM15.IEC61968.Metering.SDPLocation#getAccessMethod()
	 * @see #getSDPLocation()
	 * @generated
	 */
	public EAttribute getSDPLocation_AccessMethod() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM15.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints()
	 * @see #getSDPLocation()
	 * @generated
	 */
	public EReference getSDPLocation_ServiceDeliveryPoints() {
        return (EReference)getSDPLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see CIM15.IEC61968.Metering.SDPLocation#getRemark()
	 * @see #getSDPLocation()
	 * @generated
	 */
	public EAttribute getSDPLocation_Remark() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Access Problem</em>'.
	 * @see CIM15.IEC61968.Metering.SDPLocation#getSiteAccessProblem()
	 * @see #getSDPLocation()
	 * @generated
	 */
	public EAttribute getSDPLocation_SiteAccessProblem() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupancy Date</em>'.
	 * @see CIM15.IEC61968.Metering.SDPLocation#getOccupancyDate()
	 * @see #getSDPLocation()
	 * @generated
	 */
	public EAttribute getSDPLocation_OccupancyDate() {
        return (EAttribute)getSDPLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.Reading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading</em>'.
	 * @see CIM15.IEC61968.Metering.Reading
	 * @generated
	 */
	public EClass getReading() {
		if (readingEClass == null) {
			readingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(1);
		}
		return readingEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see CIM15.IEC61968.Metering.Reading#getReadingType()
	 * @see #getReading()
	 * @generated
	 */
	public EReference getReading_ReadingType() {
        return (EReference)getReading().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.Reading#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see CIM15.IEC61968.Metering.Reading#getMeterReadings()
	 * @see #getReading()
	 * @generated
	 */
	public EReference getReading_MeterReadings() {
        return (EReference)getReading().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.Reading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61968.Metering.Reading#getValue()
	 * @see #getReading()
	 * @generated
	 */
	public EAttribute getReading_Value() {
        return (EAttribute)getReading().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.Reading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reading Qualities</em>'.
	 * @see CIM15.IEC61968.Metering.Reading#getReadingQualities()
	 * @see #getReading()
	 * @generated
	 */
	public EReference getReading_ReadingQualities() {
        return (EReference)getReading().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Delivery Point</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint
	 * @generated
	 */
	public EClass getServiceDeliveryPoint() {
		if (serviceDeliveryPointEClass == null) {
			serviceDeliveryPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(2);
		}
		return serviceDeliveryPointEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations <em>SDP Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SDP Locations</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_SDPLocations() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Location</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_ServiceLocation() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Billing</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_CheckBilling() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Devices</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEndDevices()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_EndDevices() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_MeterReadings() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Load</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_EstimatedLoad() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Category</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_ServiceCategory() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Power</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_RatedPower() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pricing Structures</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_PricingStructures() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Priority</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_ServicePriority() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounded</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#isGrounded()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_Grounded() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energy Consumer</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_EnergyConsumer() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Delivery Remark</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_ServiceDeliveryRemark() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_PhaseCode() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Supplier</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_ServiceSupplier() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctpt Reference</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_CtptReference() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_CustomerAgreement() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_RatedCurrent() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedVoltage()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EAttribute getServiceDeliveryPoint_RatedVoltage() {
        return (EAttribute)getServiceDeliveryPoint().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getTransformerTanks <em>Transformer Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Tanks</em>'.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getTransformerTanks()
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public EReference getServiceDeliveryPoint_TransformerTanks() {
        return (EReference)getServiceDeliveryPoint().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction <em>Electric Metering Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric Metering Function</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction
	 * @generated
	 */
	public EClass getElectricMeteringFunction() {
		if (electricMeteringFunctionEClass == null) {
			electricMeteringFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(3);
		}
		return electricMeteringFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KW Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_KWMultiplier() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getCtRatioMultiplier <em>Ct Ratio Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ct Ratio Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction#getCtRatioMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	public EReference getElectricMeteringFunction_CtRatioMultiplier() {
        return (EReference)getElectricMeteringFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KWh Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	public EAttribute getElectricMeteringFunction_KWhMultiplier() {
        return (EAttribute)getElectricMeteringFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier <em>Billing Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	public EReference getElectricMeteringFunction_BillingMultiplier() {
        return (EReference)getElectricMeteringFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getVtRatioMultiplier <em>Vt Ratio Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vt Ratio Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction#getVtRatioMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	public EReference getElectricMeteringFunction_VtRatioMultiplier() {
        return (EReference)getElectricMeteringFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier <em>Demand Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Demand Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier()
	 * @see #getElectricMeteringFunction()
	 * @generated
	 */
	public EReference getElectricMeteringFunction_DemandMultiplier() {
        return (EReference)getElectricMeteringFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.DemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand Response Program</em>'.
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram
	 * @generated
	 */
	public EClass getDemandResponseProgram() {
		if (demandResponseProgramEClass == null) {
			demandResponseProgramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(4);
		}
		return demandResponseProgramEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public EReference getDemandResponseProgram_EndDeviceControls() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getValidityInterval <em>Validity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validity Interval</em>'.
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getValidityInterval()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public EReference getDemandResponseProgram_ValidityInterval() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getType()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public EAttribute getDemandResponseProgram_Type() {
        return (EAttribute)getDemandResponseProgram().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public EReference getDemandResponseProgram_CustomerAgreements() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Groups</em>'.
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups()
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public EReference getDemandResponseProgram_EndDeviceGroups() {
        return (EReference)getDemandResponseProgram().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.ReadingMultiplier <em>Reading Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingMultiplier
	 * @generated
	 */
	public EClass getReadingMultiplier() {
		if (readingMultiplierEClass == null) {
			readingMultiplierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(5);
		}
		return readingMultiplierEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingMultiplier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingMultiplier#getValue()
	 * @see #getReadingMultiplier()
	 * @generated
	 */
	public EAttribute getReadingMultiplier_Value() {
        return (EAttribute)getReadingMultiplier().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingMultiplier#isIsApplied <em>Is Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Applied</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingMultiplier#isIsApplied()
	 * @see #getReadingMultiplier()
	 * @generated
	 */
	public EAttribute getReadingMultiplier_IsApplied() {
        return (EAttribute)getReadingMultiplier().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.MeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Reading</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading
	 * @generated
	 */
	public EClass getMeterReading() {
		if (meterReadingEClass == null) {
			meterReadingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(6);
		}
		return meterReadingEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delivery Point</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getServiceDeliveryPoint()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_ServiceDeliveryPoint() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.MeterReading#getValuesInterval <em>Values Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values Interval</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getValuesInterval()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_ValuesInterval() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.MeterReading#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Events</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getEndDeviceEvents()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_EndDeviceEvents() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.MeterReading#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getReadings()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_Readings() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getCustomerAgreement()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_CustomerAgreement() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.MeterReading#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getMeter()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_Meter() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see CIM15.IEC61968.Metering.MeterReading#getIntervalBlocks()
	 * @see #getMeterReading()
	 * @generated
	 */
	public EReference getMeterReading_IntervalBlocks() {
        return (EReference)getMeterReading().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.ReadingQuality <em>Reading Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Quality</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingQuality
	 * @generated
	 */
	public EClass getReadingQuality() {
		if (readingQualityEClass == null) {
			readingQualityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(7);
		}
		return readingQualityEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingQuality#getReading()
	 * @see #getReadingQuality()
	 * @generated
	 */
	public EReference getReadingQuality_Reading() {
        return (EReference)getReadingQuality().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingQuality#getQuality()
	 * @see #getReadingQuality()
	 * @generated
	 */
	public EAttribute getReadingQuality_Quality() {
        return (EAttribute)getReadingQuality().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Reading</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingQuality#getIntervalReading()
	 * @see #getReadingQuality()
	 * @generated
	 */
	public EReference getReadingQuality_IntervalReading() {
        return (EReference)getReadingQuality().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.EndDeviceEvent <em>End Device Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Event</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent
	 * @generated
	 */
	public EClass getEndDeviceEvent() {
		if (endDeviceEventEClass == null) {
			endDeviceEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(8);
		}
		return endDeviceEventEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getEndDeviceFunction <em>End Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Function</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent#getEndDeviceFunction()
	 * @see #getEndDeviceEvent()
	 * @generated
	 */
	public EReference getEndDeviceEvent_EndDeviceFunction() {
        return (EReference)getEndDeviceEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent#getUserID()
	 * @see #getEndDeviceEvent()
	 * @generated
	 */
	public EAttribute getEndDeviceEvent_UserID() {
        return (EAttribute)getEndDeviceEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Reading</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent#getMeterReading()
	 * @see #getEndDeviceEvent()
	 * @generated
	 */
	public EReference getEndDeviceEvent_MeterReading() {
        return (EReference)getEndDeviceEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.IntervalReading <em>Interval Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Reading</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalReading
	 * @generated
	 */
	public EClass getIntervalReading() {
		if (intervalReadingEClass == null) {
			intervalReadingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(9);
		}
		return intervalReadingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.IntervalReading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalReading#getValue()
	 * @see #getIntervalReading()
	 * @generated
	 */
	public EAttribute getIntervalReading_Value() {
        return (EAttribute)getIntervalReading().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.IntervalReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalReading#getIntervalBlocks()
	 * @see #getIntervalReading()
	 * @generated
	 */
	public EReference getIntervalReading_IntervalBlocks() {
        return (EReference)getIntervalReading().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.IntervalReading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reading Qualities</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalReading#getReadingQualities()
	 * @see #getIntervalReading()
	 * @generated
	 */
	public EReference getIntervalReading_ReadingQualities() {
        return (EReference)getIntervalReading().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see CIM15.IEC61968.Metering.Meter
	 * @generated
	 */
	public EClass getMeter() {
		if (meterEClass == null) {
			meterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(10);
		}
		return meterEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.Meter#getMeterReplacementWorks <em>Meter Replacement Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Replacement Works</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getMeterReplacementWorks()
	 * @see #getMeter()
	 * @generated
	 */
	public EReference getMeter_MeterReplacementWorks() {
        return (EReference)getMeter().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.Meter#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Readings</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getMeterReadings()
	 * @see #getMeter()
	 * @generated
	 */
	public EReference getMeter_MeterReadings() {
        return (EReference)getMeter().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.Meter#getMeterServiceWorks <em>Meter Service Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meter Service Works</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getMeterServiceWorks()
	 * @see #getMeter()
	 * @generated
	 */
	public EReference getMeter_MeterServiceWorks() {
        return (EReference)getMeter().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.Meter#getKR <em>KR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KR</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getKR()
	 * @see #getMeter()
	 * @generated
	 */
	public EAttribute getMeter_KR() {
        return (EAttribute)getMeter().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.Meter#getKH <em>KH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KH</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getKH()
	 * @see #getMeter()
	 * @generated
	 */
	public EAttribute getMeter_KH() {
        return (EAttribute)getMeter().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.Meter#getFormNumber <em>Form Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Number</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getFormNumber()
	 * @see #getMeter()
	 * @generated
	 */
	public EAttribute getMeter_FormNumber() {
        return (EAttribute)getMeter().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.Meter#getVendingTransactions <em>Vending Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vending Transactions</em>'.
	 * @see CIM15.IEC61968.Metering.Meter#getVendingTransactions()
	 * @see #getMeter()
	 * @generated
	 */
	public EReference getMeter_VendingTransactions() {
        return (EReference)getMeter().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.MeterServiceWork <em>Meter Service Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Service Work</em>'.
	 * @see CIM15.IEC61968.Metering.MeterServiceWork
	 * @generated
	 */
	public EClass getMeterServiceWork() {
		if (meterServiceWorkEClass == null) {
			meterServiceWorkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(11);
		}
		return meterServiceWorkEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.MeterServiceWork#getOldMeter <em>Old Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Meter</em>'.
	 * @see CIM15.IEC61968.Metering.MeterServiceWork#getOldMeter()
	 * @see #getMeterServiceWork()
	 * @generated
	 */
	public EReference getMeterServiceWork_OldMeter() {
        return (EReference)getMeterServiceWork().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.MeterServiceWork#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see CIM15.IEC61968.Metering.MeterServiceWork#getMeter()
	 * @see #getMeterServiceWork()
	 * @generated
	 */
	public EReference getMeterServiceWork_Meter() {
        return (EReference)getMeterServiceWork().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.PendingCalculation <em>Pending Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pending Calculation</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation
	 * @generated
	 */
	public EClass getPendingCalculation() {
		if (pendingCalculationEClass == null) {
			pendingCalculationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(13);
		}
		return pendingCalculationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Numerator</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getScalarNumerator()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EAttribute getPendingCalculation_ScalarNumerator() {
        return (EAttribute)getPendingCalculation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.PendingCalculation#isMultiplyBeforeAdd <em>Multiply Before Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiply Before Add</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#isMultiplyBeforeAdd()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EAttribute getPendingCalculation_MultiplyBeforeAdd() {
        return (EAttribute)getPendingCalculation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getIntervalBlocks()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EReference getPendingCalculation_IntervalBlocks() {
        return (EReference)getPendingCalculation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Denominator</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getScalarDenominator()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EAttribute getPendingCalculation_ScalarDenominator() {
        return (EAttribute)getPendingCalculation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarFloat <em>Scalar Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Float</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getScalarFloat()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EAttribute getPendingCalculation_ScalarFloat() {
        return (EAttribute)getPendingCalculation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.PendingCalculation#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getOffset()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EAttribute getPendingCalculation_Offset() {
        return (EAttribute)getPendingCalculation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.PendingCalculation#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getReadingType()
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public EReference getPendingCalculation_ReadingType() {
        return (EReference)getPendingCalculation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.IntervalBlock <em>Interval Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Block</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalBlock
	 * @generated
	 */
	public EClass getIntervalBlock() {
		if (intervalBlockEClass == null) {
			intervalBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(14);
		}
		return intervalBlockEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getReadingType()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	public EReference getIntervalBlock_ReadingType() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Readings</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getIntervalReadings()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	public EReference getIntervalBlock_IntervalReadings() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Reading</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getMeterReading()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	public EReference getIntervalBlock_MeterReading() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pending Calculation</em>'.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getPendingCalculation()
	 * @see #getIntervalBlock()
	 * @generated
	 */
	public EReference getIntervalBlock_PendingCalculation() {
        return (EReference)getIntervalBlock().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.EndDeviceFunction <em>End Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Function</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction
	 * @generated
	 */
	public EClass getEndDeviceFunction() {
		if (endDeviceFunctionEClass == null) {
			endDeviceFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(15);
		}
		return endDeviceFunctionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registers</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getRegisters()
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public EReference getEndDeviceFunction_Registers() {
        return (EReference)getEndDeviceFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#isEnabled()
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public EAttribute getEndDeviceFunction_Enabled() {
        return (EAttribute)getEndDeviceFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getComEquipment <em>Com Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Equipment</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getComEquipment()
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public EReference getEndDeviceFunction_ComEquipment() {
        return (EReference)getEndDeviceFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isSupported <em>Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#isSupported()
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public EAttribute getEndDeviceFunction_Supported() {
        return (EAttribute)getEndDeviceFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Events</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getEndDeviceEvents()
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public EReference getEndDeviceFunction_EndDeviceEvents() {
        return (EReference)getEndDeviceFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDevice <em>End Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getEndDevice()
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public EReference getEndDeviceFunction_EndDevice() {
        return (EReference)getEndDeviceFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.ComFunction <em>Com Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Function</em>'.
	 * @see CIM15.IEC61968.Metering.ComFunction
	 * @generated
	 */
	public EClass getComFunction() {
		if (comFunctionEClass == null) {
			comFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(16);
		}
		return comFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amr Router</em>'.
	 * @see CIM15.IEC61968.Metering.ComFunction#getAmrRouter()
	 * @see #getComFunction()
	 * @generated
	 */
	public EAttribute getComFunction_AmrRouter() {
        return (EAttribute)getComFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amr Address</em>'.
	 * @see CIM15.IEC61968.Metering.ComFunction#getAmrAddress()
	 * @see #getComFunction()
	 * @generated
	 */
	public EAttribute getComFunction_AmrAddress() {
        return (EAttribute)getComFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Two Way</em>'.
	 * @see CIM15.IEC61968.Metering.ComFunction#isTwoWay()
	 * @see #getComFunction()
	 * @generated
	 */
	public EAttribute getComFunction_TwoWay() {
        return (EAttribute)getComFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.EndDevice <em>End Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice
	 * @generated
	 */
	public EClass getEndDevice() {
		if (endDeviceEClass == null) {
			endDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(17);
		}
		return endDeviceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceInfo <em>End Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Info</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceInfo()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_EndDeviceInfo() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDevice#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delivery Point</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getServiceDeliveryPoint()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_ServiceDeliveryPoint() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone Offset</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getTimeZoneOffset()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EAttribute getEndDevice_TimeZoneOffset() {
        return (EAttribute)getEndDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDevice#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Location</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getServiceLocation()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_ServiceLocation() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceFunctions <em>End Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Functions</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceFunctions()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_EndDeviceFunctions() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDevice#getAmrSystem <em>Amr System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amr System</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getAmrSystem()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EAttribute getEndDevice_AmrSystem() {
        return (EAttribute)getEndDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceControls()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_EndDeviceControls() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDevice#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getCustomer()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_Customer() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Groups</em>'.
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceGroups()
	 * @see #getEndDevice()
	 * @generated
	 */
	public EReference getEndDevice_EndDeviceGroups() {
        return (EReference)getEndDevice().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.SimpleEndDeviceFunction <em>Simple End Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple End Device Function</em>'.
	 * @see CIM15.IEC61968.Metering.SimpleEndDeviceFunction
	 * @generated
	 */
	public EClass getSimpleEndDeviceFunction() {
		if (simpleEndDeviceFunctionEClass == null) {
			simpleEndDeviceFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(18);
		}
		return simpleEndDeviceFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.SimpleEndDeviceFunction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.Metering.SimpleEndDeviceFunction#getKind()
	 * @see #getSimpleEndDeviceFunction()
	 * @generated
	 */
	public EAttribute getSimpleEndDeviceFunction_Kind() {
        return (EAttribute)getSimpleEndDeviceFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.EndDeviceGroup <em>End Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Group</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup
	 * @generated
	 */
	public EClass getEndDeviceGroup() {
		if (endDeviceGroupEClass == null) {
			endDeviceGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(19);
		}
		return endDeviceGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Controls</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	public EReference getEndDeviceGroup_EndDeviceControls() {
        return (EReference)getEndDeviceGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Devices</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getEndDevices()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	public EReference getEndDeviceGroup_EndDevices() {
        return (EReference)getEndDeviceGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demand Response Program</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	public EReference getEndDeviceGroup_DemandResponseProgram() {
        return (EReference)getEndDeviceGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Address</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getGroupAddress()
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	public EAttribute getEndDeviceGroup_GroupAddress() {
        return (EAttribute)getEndDeviceGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see CIM15.IEC61968.Metering.Register
	 * @generated
	 */
	public EClass getRegister() {
		if (registerEClass == null) {
			registerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(21);
		}
		return registerEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reading Type</em>'.
	 * @see CIM15.IEC61968.Metering.Register#getReadingType()
	 * @see #getRegister()
	 * @generated
	 */
	public EReference getRegister_ReadingType() {
        return (EReference)getRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Digit Count</em>'.
	 * @see CIM15.IEC61968.Metering.Register#getLeftDigitCount()
	 * @see #getRegister()
	 * @generated
	 */
	public EAttribute getRegister_LeftDigitCount() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Digit Count</em>'.
	 * @see CIM15.IEC61968.Metering.Register#getRightDigitCount()
	 * @see #getRegister()
	 * @generated
	 */
	public EAttribute getRegister_RightDigitCount() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.Register#getEndDeviceFunction <em>End Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Function</em>'.
	 * @see CIM15.IEC61968.Metering.Register#getEndDeviceFunction()
	 * @see #getRegister()
	 * @generated
	 */
	public EReference getRegister_EndDeviceFunction() {
        return (EReference)getRegister().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.EndDeviceControl <em>End Device Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Control</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl
	 * @generated
	 */
	public EClass getEndDeviceControl() {
		if (endDeviceControlEClass == null) {
			endDeviceControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(22);
		}
		return endDeviceControlEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Demand Response Program</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EReference getEndDeviceControl_DemandResponseProgram() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dr Program Level</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getDrProgramLevel()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EAttribute getEndDeviceControl_DrProgramLevel() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dr Program Mandatory</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EAttribute getEndDeviceControl_DrProgramMandatory() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getCustomerAgreement()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EReference getEndDeviceControl_CustomerAgreement() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getType()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EAttribute getEndDeviceControl_Type() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduled Interval</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getScheduledInterval()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EReference getEndDeviceControl_ScheduledInterval() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device Group</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EReference getEndDeviceControl_EndDeviceGroup() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDevice <em>End Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Device</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getEndDevice()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EReference getEndDeviceControl_EndDevice() {
        return (EReference)getEndDeviceControl().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Signal</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getPriceSignal()
	 * @see #getEndDeviceControl()
	 * @generated
	 */
	public EAttribute getEndDeviceControl_PriceSignal() {
        return (EAttribute)getEndDeviceControl().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.DynamicDemand <em>Dynamic Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Demand</em>'.
	 * @see CIM15.IEC61968.Metering.DynamicDemand
	 * @generated
	 */
	public EClass getDynamicDemand() {
		if (dynamicDemandEClass == null) {
			dynamicDemandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(23);
		}
		return dynamicDemandEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Interval</em>'.
	 * @see CIM15.IEC61968.Metering.DynamicDemand#getSubInterval()
	 * @see #getDynamicDemand()
	 * @generated
	 */
	public EAttribute getDynamicDemand_SubInterval() {
        return (EAttribute)getDynamicDemand().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see CIM15.IEC61968.Metering.DynamicDemand#getInterval()
	 * @see #getDynamicDemand()
	 * @generated
	 */
	public EAttribute getDynamicDemand_Interval() {
        return (EAttribute)getDynamicDemand().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.Metering.DynamicDemand#getKind()
	 * @see #getDynamicDemand()
	 * @generated
	 */
	public EAttribute getDynamicDemand_Kind() {
        return (EAttribute)getDynamicDemand().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Metering.ReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Type</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType
	 * @generated
	 */
	public EClass getReadingType() {
		if (readingTypeEClass == null) {
			readingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(25);
		}
		return readingTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getMultiplier()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_Multiplier() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interval Blocks</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getIntervalBlocks()
	 * @see #getReadingType()
	 * @generated
	 */
	public EReference getReadingType_IntervalBlocks() {
        return (EReference)getReadingType().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getUnit()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_Unit() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getKind()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_Kind() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Metering.ReadingType#getDynamicConfiguration <em>Dynamic Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamic Configuration</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getDynamicConfiguration()
	 * @see #getReadingType()
	 * @generated
	 */
	public EReference getReadingType_DynamicConfiguration() {
        return (EReference)getReadingType().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Chronology</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#isReverseChronology()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_ReverseChronology() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Quality</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getDefaultQuality()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_DefaultQuality() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Length</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getIntervalLength()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_IntervalLength() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Number</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getChannelNumber()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_ChannelNumber() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Metering.ReadingType#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getReadings()
	 * @see #getReadingType()
	 * @generated
	 */
	public EReference getReadingType_Readings() {
        return (EReference)getReadingType().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Data Type</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getDefaultValueDataType()
	 * @see #getReadingType()
	 * @generated
	 */
	public EAttribute getReadingType_DefaultValueDataType() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getRegister()
	 * @see #getReadingType()
	 * @generated
	 */
	public EReference getReadingType_Register() {
        return (EReference)getReadingType().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Metering.ReadingType#getPendingCalculation <em>Pending Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pending Calculation</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingType#getPendingCalculation()
	 * @see #getReadingType()
	 * @generated
	 */
	public EReference getReadingType_PendingCalculation() {
        return (EReference)getReadingType().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Metering.EndDeviceFunctionKind <em>End Device Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>End Device Function Kind</em>'.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunctionKind
	 * @generated
	 */
	public EEnum getEndDeviceFunctionKind() {
		if (endDeviceFunctionKindEEnum == null) {
			endDeviceFunctionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(12);
		}
		return endDeviceFunctionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Metering.ReadingKind <em>Reading Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reading Kind</em>'.
	 * @see CIM15.IEC61968.Metering.ReadingKind
	 * @generated
	 */
	public EEnum getReadingKind() {
		if (readingKindEEnum == null) {
			readingKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(20);
		}
		return readingKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Metering.DemandKind <em>Demand Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Demand Kind</em>'.
	 * @see CIM15.IEC61968.Metering.DemandKind
	 * @generated
	 */
	public EEnum getDemandKind() {
		if (demandKindEEnum == null) {
			demandKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI).getEClassifiers().get(24);
		}
		return demandKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public MeteringFactory getMeteringFactory() {
		return (MeteringFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61968.Metering." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.SDPLocation <em>SDP Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.SDPLocation
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getSDPLocation()
		 * @generated
		 */
		public static final EClass SDP_LOCATION = eINSTANCE.getSDPLocation();

		/**
		 * The meta object literal for the '<em><b>Access Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SDP_LOCATION__ACCESS_METHOD = eINSTANCE.getSDPLocation_AccessMethod();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SDP_LOCATION__SERVICE_DELIVERY_POINTS = eINSTANCE.getSDPLocation_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SDP_LOCATION__REMARK = eINSTANCE.getSDPLocation_Remark();

		/**
		 * The meta object literal for the '<em><b>Site Access Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SDP_LOCATION__SITE_ACCESS_PROBLEM = eINSTANCE.getSDPLocation_SiteAccessProblem();

		/**
		 * The meta object literal for the '<em><b>Occupancy Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SDP_LOCATION__OCCUPANCY_DATE = eINSTANCE.getSDPLocation_OccupancyDate();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.Reading <em>Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.Reading
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getReading()
		 * @generated
		 */
		public static final EClass READING = eINSTANCE.getReading();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING__READING_TYPE = eINSTANCE.getReading_ReadingType();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING__METER_READINGS = eINSTANCE.getReading_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING__VALUE = eINSTANCE.getReading_Value();

		/**
		 * The meta object literal for the '<em><b>Reading Qualities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING__READING_QUALITIES = eINSTANCE.getReading_ReadingQualities();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint <em>Service Delivery Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getServiceDeliveryPoint()
		 * @generated
		 */
		public static final EClass SERVICE_DELIVERY_POINT = eINSTANCE.getServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>SDP Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__SDP_LOCATIONS = eINSTANCE.getServiceDeliveryPoint_SDPLocations();

		/**
		 * The meta object literal for the '<em><b>Service Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__SERVICE_LOCATION = eINSTANCE.getServiceDeliveryPoint_ServiceLocation();

		/**
		 * The meta object literal for the '<em><b>Check Billing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__CHECK_BILLING = eINSTANCE.getServiceDeliveryPoint_CheckBilling();

		/**
		 * The meta object literal for the '<em><b>End Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__END_DEVICES = eINSTANCE.getServiceDeliveryPoint_EndDevices();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__METER_READINGS = eINSTANCE.getServiceDeliveryPoint_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Estimated Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__ESTIMATED_LOAD = eINSTANCE.getServiceDeliveryPoint_EstimatedLoad();

		/**
		 * The meta object literal for the '<em><b>Service Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__SERVICE_CATEGORY = eINSTANCE.getServiceDeliveryPoint_ServiceCategory();

		/**
		 * The meta object literal for the '<em><b>Rated Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__RATED_POWER = eINSTANCE.getServiceDeliveryPoint_RatedPower();

		/**
		 * The meta object literal for the '<em><b>Pricing Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__PRICING_STRUCTURES = eINSTANCE.getServiceDeliveryPoint_PricingStructures();

		/**
		 * The meta object literal for the '<em><b>Service Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__SERVICE_PRIORITY = eINSTANCE.getServiceDeliveryPoint_ServicePriority();

		/**
		 * The meta object literal for the '<em><b>Grounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__GROUNDED = eINSTANCE.getServiceDeliveryPoint_Grounded();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__ENERGY_CONSUMER = eINSTANCE.getServiceDeliveryPoint_EnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK = eINSTANCE.getServiceDeliveryPoint_ServiceDeliveryRemark();

		/**
		 * The meta object literal for the '<em><b>Phase Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__PHASE_CODE = eINSTANCE.getServiceDeliveryPoint_PhaseCode();

		/**
		 * The meta object literal for the '<em><b>Service Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER = eINSTANCE.getServiceDeliveryPoint_ServiceSupplier();

		/**
		 * The meta object literal for the '<em><b>Ctpt Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__CTPT_REFERENCE = eINSTANCE.getServiceDeliveryPoint_CtptReference();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT = eINSTANCE.getServiceDeliveryPoint_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__RATED_CURRENT = eINSTANCE.getServiceDeliveryPoint_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Rated Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_DELIVERY_POINT__RATED_VOLTAGE = eINSTANCE.getServiceDeliveryPoint_RatedVoltage();

		/**
		 * The meta object literal for the '<em><b>Transformer Tanks</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS = eINSTANCE.getServiceDeliveryPoint_TransformerTanks();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction <em>Electric Metering Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ElectricMeteringFunction
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getElectricMeteringFunction()
		 * @generated
		 */
		public static final EClass ELECTRIC_METERING_FUNCTION = eINSTANCE.getElectricMeteringFunction();

		/**
		 * The meta object literal for the '<em><b>KW Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_KWMultiplier();

		/**
		 * The meta object literal for the '<em><b>Ct Ratio Multiplier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_CtRatioMultiplier();

		/**
		 * The meta object literal for the '<em><b>KWh Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_KWhMultiplier();

		/**
		 * The meta object literal for the '<em><b>Billing Multiplier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_BillingMultiplier();

		/**
		 * The meta object literal for the '<em><b>Vt Ratio Multiplier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_VtRatioMultiplier();

		/**
		 * The meta object literal for the '<em><b>Demand Multiplier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER = eINSTANCE.getElectricMeteringFunction_DemandMultiplier();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.DemandResponseProgram <em>Demand Response Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.DemandResponseProgram
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getDemandResponseProgram()
		 * @generated
		 */
		public static final EClass DEMAND_RESPONSE_PROGRAM = eINSTANCE.getDemandResponseProgram();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS = eINSTANCE.getDemandResponseProgram_EndDeviceControls();

		/**
		 * The meta object literal for the '<em><b>Validity Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL = eINSTANCE.getDemandResponseProgram_ValidityInterval();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEMAND_RESPONSE_PROGRAM__TYPE = eINSTANCE.getDemandResponseProgram_Type();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS = eINSTANCE.getDemandResponseProgram_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>End Device Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS = eINSTANCE.getDemandResponseProgram_EndDeviceGroups();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ReadingMultiplier <em>Reading Multiplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ReadingMultiplier
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingMultiplier()
		 * @generated
		 */
		public static final EClass READING_MULTIPLIER = eINSTANCE.getReadingMultiplier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_MULTIPLIER__VALUE = eINSTANCE.getReadingMultiplier_Value();

		/**
		 * The meta object literal for the '<em><b>Is Applied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_MULTIPLIER__IS_APPLIED = eINSTANCE.getReadingMultiplier_IsApplied();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.MeterReading <em>Meter Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.MeterReading
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getMeterReading()
		 * @generated
		 */
		public static final EClass METER_READING = eINSTANCE.getMeterReading();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__SERVICE_DELIVERY_POINT = eINSTANCE.getMeterReading_ServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Values Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__VALUES_INTERVAL = eINSTANCE.getMeterReading_ValuesInterval();

		/**
		 * The meta object literal for the '<em><b>End Device Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__END_DEVICE_EVENTS = eINSTANCE.getMeterReading_EndDeviceEvents();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__READINGS = eINSTANCE.getMeterReading_Readings();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__CUSTOMER_AGREEMENT = eINSTANCE.getMeterReading_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__METER = eINSTANCE.getMeterReading_Meter();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_READING__INTERVAL_BLOCKS = eINSTANCE.getMeterReading_IntervalBlocks();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ReadingQuality <em>Reading Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ReadingQuality
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingQuality()
		 * @generated
		 */
		public static final EClass READING_QUALITY = eINSTANCE.getReadingQuality();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_QUALITY__READING = eINSTANCE.getReadingQuality_Reading();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_QUALITY__QUALITY = eINSTANCE.getReadingQuality_Quality();

		/**
		 * The meta object literal for the '<em><b>Interval Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_QUALITY__INTERVAL_READING = eINSTANCE.getReadingQuality_IntervalReading();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.EndDeviceEvent <em>End Device Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.EndDeviceEvent
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceEvent()
		 * @generated
		 */
		public static final EClass END_DEVICE_EVENT = eINSTANCE.getEndDeviceEvent();

		/**
		 * The meta object literal for the '<em><b>End Device Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_EVENT__END_DEVICE_FUNCTION = eINSTANCE.getEndDeviceEvent_EndDeviceFunction();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_EVENT__USER_ID = eINSTANCE.getEndDeviceEvent_UserID();

		/**
		 * The meta object literal for the '<em><b>Meter Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_EVENT__METER_READING = eINSTANCE.getEndDeviceEvent_MeterReading();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.IntervalReading <em>Interval Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.IntervalReading
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getIntervalReading()
		 * @generated
		 */
		public static final EClass INTERVAL_READING = eINSTANCE.getIntervalReading();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INTERVAL_READING__VALUE = eINSTANCE.getIntervalReading_Value();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERVAL_READING__INTERVAL_BLOCKS = eINSTANCE.getIntervalReading_IntervalBlocks();

		/**
		 * The meta object literal for the '<em><b>Reading Qualities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERVAL_READING__READING_QUALITIES = eINSTANCE.getIntervalReading_ReadingQualities();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.Meter <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.Meter
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getMeter()
		 * @generated
		 */
		public static final EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>Meter Replacement Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER__METER_REPLACEMENT_WORKS = eINSTANCE.getMeter_MeterReplacementWorks();

		/**
		 * The meta object literal for the '<em><b>Meter Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER__METER_READINGS = eINSTANCE.getMeter_MeterReadings();

		/**
		 * The meta object literal for the '<em><b>Meter Service Works</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER__METER_SERVICE_WORKS = eINSTANCE.getMeter_MeterServiceWorks();

		/**
		 * The meta object literal for the '<em><b>KR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METER__KR = eINSTANCE.getMeter_KR();

		/**
		 * The meta object literal for the '<em><b>KH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METER__KH = eINSTANCE.getMeter_KH();

		/**
		 * The meta object literal for the '<em><b>Form Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute METER__FORM_NUMBER = eINSTANCE.getMeter_FormNumber();

		/**
		 * The meta object literal for the '<em><b>Vending Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER__VENDING_TRANSACTIONS = eINSTANCE.getMeter_VendingTransactions();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.MeterServiceWork <em>Meter Service Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.MeterServiceWork
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getMeterServiceWork()
		 * @generated
		 */
		public static final EClass METER_SERVICE_WORK = eINSTANCE.getMeterServiceWork();

		/**
		 * The meta object literal for the '<em><b>Old Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_SERVICE_WORK__OLD_METER = eINSTANCE.getMeterServiceWork_OldMeter();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference METER_SERVICE_WORK__METER = eINSTANCE.getMeterServiceWork_Meter();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.PendingCalculation <em>Pending Calculation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.PendingCalculation
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getPendingCalculation()
		 * @generated
		 */
		public static final EClass PENDING_CALCULATION = eINSTANCE.getPendingCalculation();

		/**
		 * The meta object literal for the '<em><b>Scalar Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PENDING_CALCULATION__SCALAR_NUMERATOR = eINSTANCE.getPendingCalculation_ScalarNumerator();

		/**
		 * The meta object literal for the '<em><b>Multiply Before Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PENDING_CALCULATION__MULTIPLY_BEFORE_ADD = eINSTANCE.getPendingCalculation_MultiplyBeforeAdd();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PENDING_CALCULATION__INTERVAL_BLOCKS = eINSTANCE.getPendingCalculation_IntervalBlocks();

		/**
		 * The meta object literal for the '<em><b>Scalar Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PENDING_CALCULATION__SCALAR_DENOMINATOR = eINSTANCE.getPendingCalculation_ScalarDenominator();

		/**
		 * The meta object literal for the '<em><b>Scalar Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PENDING_CALCULATION__SCALAR_FLOAT = eINSTANCE.getPendingCalculation_ScalarFloat();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PENDING_CALCULATION__OFFSET = eINSTANCE.getPendingCalculation_Offset();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PENDING_CALCULATION__READING_TYPE = eINSTANCE.getPendingCalculation_ReadingType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.IntervalBlock <em>Interval Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.IntervalBlock
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getIntervalBlock()
		 * @generated
		 */
		public static final EClass INTERVAL_BLOCK = eINSTANCE.getIntervalBlock();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERVAL_BLOCK__READING_TYPE = eINSTANCE.getIntervalBlock_ReadingType();

		/**
		 * The meta object literal for the '<em><b>Interval Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERVAL_BLOCK__INTERVAL_READINGS = eINSTANCE.getIntervalBlock_IntervalReadings();

		/**
		 * The meta object literal for the '<em><b>Meter Reading</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERVAL_BLOCK__METER_READING = eINSTANCE.getIntervalBlock_MeterReading();

		/**
		 * The meta object literal for the '<em><b>Pending Calculation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INTERVAL_BLOCK__PENDING_CALCULATION = eINSTANCE.getIntervalBlock_PendingCalculation();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.EndDeviceFunction <em>End Device Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.EndDeviceFunction
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceFunction()
		 * @generated
		 */
		public static final EClass END_DEVICE_FUNCTION = eINSTANCE.getEndDeviceFunction();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_FUNCTION__REGISTERS = eINSTANCE.getEndDeviceFunction_Registers();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_FUNCTION__ENABLED = eINSTANCE.getEndDeviceFunction_Enabled();

		/**
		 * The meta object literal for the '<em><b>Com Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_FUNCTION__COM_EQUIPMENT = eINSTANCE.getEndDeviceFunction_ComEquipment();

		/**
		 * The meta object literal for the '<em><b>Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_FUNCTION__SUPPORTED = eINSTANCE.getEndDeviceFunction_Supported();

		/**
		 * The meta object literal for the '<em><b>End Device Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_FUNCTION__END_DEVICE_EVENTS = eINSTANCE.getEndDeviceFunction_EndDeviceEvents();

		/**
		 * The meta object literal for the '<em><b>End Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_FUNCTION__END_DEVICE = eINSTANCE.getEndDeviceFunction_EndDevice();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ComFunction <em>Com Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ComFunction
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getComFunction()
		 * @generated
		 */
		public static final EClass COM_FUNCTION = eINSTANCE.getComFunction();

		/**
		 * The meta object literal for the '<em><b>Amr Router</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COM_FUNCTION__AMR_ROUTER = eINSTANCE.getComFunction_AmrRouter();

		/**
		 * The meta object literal for the '<em><b>Amr Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COM_FUNCTION__AMR_ADDRESS = eINSTANCE.getComFunction_AmrAddress();

		/**
		 * The meta object literal for the '<em><b>Two Way</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COM_FUNCTION__TWO_WAY = eINSTANCE.getComFunction_TwoWay();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.EndDevice <em>End Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.EndDevice
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDevice()
		 * @generated
		 */
		public static final EClass END_DEVICE = eINSTANCE.getEndDevice();

		/**
		 * The meta object literal for the '<em><b>End Device Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__END_DEVICE_INFO = eINSTANCE.getEndDevice_EndDeviceInfo();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__SERVICE_DELIVERY_POINT = eINSTANCE.getEndDevice_ServiceDeliveryPoint();

		/**
		 * The meta object literal for the '<em><b>Time Zone Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE__TIME_ZONE_OFFSET = eINSTANCE.getEndDevice_TimeZoneOffset();

		/**
		 * The meta object literal for the '<em><b>Service Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__SERVICE_LOCATION = eINSTANCE.getEndDevice_ServiceLocation();

		/**
		 * The meta object literal for the '<em><b>End Device Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__END_DEVICE_FUNCTIONS = eINSTANCE.getEndDevice_EndDeviceFunctions();

		/**
		 * The meta object literal for the '<em><b>Amr System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE__AMR_SYSTEM = eINSTANCE.getEndDevice_AmrSystem();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__END_DEVICE_CONTROLS = eINSTANCE.getEndDevice_EndDeviceControls();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__CUSTOMER = eINSTANCE.getEndDevice_Customer();

		/**
		 * The meta object literal for the '<em><b>End Device Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE__END_DEVICE_GROUPS = eINSTANCE.getEndDevice_EndDeviceGroups();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.SimpleEndDeviceFunction <em>Simple End Device Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.SimpleEndDeviceFunction
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getSimpleEndDeviceFunction()
		 * @generated
		 */
		public static final EClass SIMPLE_END_DEVICE_FUNCTION = eINSTANCE.getSimpleEndDeviceFunction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SIMPLE_END_DEVICE_FUNCTION__KIND = eINSTANCE.getSimpleEndDeviceFunction_Kind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.EndDeviceGroup <em>End Device Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.EndDeviceGroup
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceGroup()
		 * @generated
		 */
		public static final EClass END_DEVICE_GROUP = eINSTANCE.getEndDeviceGroup();

		/**
		 * The meta object literal for the '<em><b>End Device Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_GROUP__END_DEVICE_CONTROLS = eINSTANCE.getEndDeviceGroup_EndDeviceControls();

		/**
		 * The meta object literal for the '<em><b>End Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_GROUP__END_DEVICES = eINSTANCE.getEndDeviceGroup_EndDevices();

		/**
		 * The meta object literal for the '<em><b>Demand Response Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM = eINSTANCE.getEndDeviceGroup_DemandResponseProgram();

		/**
		 * The meta object literal for the '<em><b>Group Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_GROUP__GROUP_ADDRESS = eINSTANCE.getEndDeviceGroup_GroupAddress();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.Register <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.Register
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getRegister()
		 * @generated
		 */
		public static final EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>Reading Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGISTER__READING_TYPE = eINSTANCE.getRegister_ReadingType();

		/**
		 * The meta object literal for the '<em><b>Left Digit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGISTER__LEFT_DIGIT_COUNT = eINSTANCE.getRegister_LeftDigitCount();

		/**
		 * The meta object literal for the '<em><b>Right Digit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGISTER__RIGHT_DIGIT_COUNT = eINSTANCE.getRegister_RightDigitCount();

		/**
		 * The meta object literal for the '<em><b>End Device Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGISTER__END_DEVICE_FUNCTION = eINSTANCE.getRegister_EndDeviceFunction();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.EndDeviceControl <em>End Device Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.EndDeviceControl
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceControl()
		 * @generated
		 */
		public static final EClass END_DEVICE_CONTROL = eINSTANCE.getEndDeviceControl();

		/**
		 * The meta object literal for the '<em><b>Demand Response Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM = eINSTANCE.getEndDeviceControl_DemandResponseProgram();

		/**
		 * The meta object literal for the '<em><b>Dr Program Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_CONTROL__DR_PROGRAM_LEVEL = eINSTANCE.getEndDeviceControl_DrProgramLevel();

		/**
		 * The meta object literal for the '<em><b>Dr Program Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY = eINSTANCE.getEndDeviceControl_DrProgramMandatory();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_CONTROL__CUSTOMER_AGREEMENT = eINSTANCE.getEndDeviceControl_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_CONTROL__TYPE = eINSTANCE.getEndDeviceControl_Type();

		/**
		 * The meta object literal for the '<em><b>Scheduled Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_CONTROL__SCHEDULED_INTERVAL = eINSTANCE.getEndDeviceControl_ScheduledInterval();

		/**
		 * The meta object literal for the '<em><b>End Device Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_CONTROL__END_DEVICE_GROUP = eINSTANCE.getEndDeviceControl_EndDeviceGroup();

		/**
		 * The meta object literal for the '<em><b>End Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_CONTROL__END_DEVICE = eINSTANCE.getEndDeviceControl_EndDevice();

		/**
		 * The meta object literal for the '<em><b>Price Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_CONTROL__PRICE_SIGNAL = eINSTANCE.getEndDeviceControl_PriceSignal();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.DynamicDemand <em>Dynamic Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.DynamicDemand
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getDynamicDemand()
		 * @generated
		 */
		public static final EClass DYNAMIC_DEMAND = eINSTANCE.getDynamicDemand();

		/**
		 * The meta object literal for the '<em><b>Sub Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DYNAMIC_DEMAND__SUB_INTERVAL = eINSTANCE.getDynamicDemand_SubInterval();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DYNAMIC_DEMAND__INTERVAL = eINSTANCE.getDynamicDemand_Interval();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DYNAMIC_DEMAND__KIND = eINSTANCE.getDynamicDemand_Kind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ReadingType <em>Reading Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ReadingType
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingType()
		 * @generated
		 */
		public static final EClass READING_TYPE = eINSTANCE.getReadingType();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__MULTIPLIER = eINSTANCE.getReadingType_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Interval Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_TYPE__INTERVAL_BLOCKS = eINSTANCE.getReadingType_IntervalBlocks();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__UNIT = eINSTANCE.getReadingType_Unit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__KIND = eINSTANCE.getReadingType_Kind();

		/**
		 * The meta object literal for the '<em><b>Dynamic Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_TYPE__DYNAMIC_CONFIGURATION = eINSTANCE.getReadingType_DynamicConfiguration();

		/**
		 * The meta object literal for the '<em><b>Reverse Chronology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__REVERSE_CHRONOLOGY = eINSTANCE.getReadingType_ReverseChronology();

		/**
		 * The meta object literal for the '<em><b>Default Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__DEFAULT_QUALITY = eINSTANCE.getReadingType_DefaultQuality();

		/**
		 * The meta object literal for the '<em><b>Interval Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__INTERVAL_LENGTH = eINSTANCE.getReadingType_IntervalLength();

		/**
		 * The meta object literal for the '<em><b>Channel Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__CHANNEL_NUMBER = eINSTANCE.getReadingType_ChannelNumber();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_TYPE__READINGS = eINSTANCE.getReadingType_Readings();

		/**
		 * The meta object literal for the '<em><b>Default Value Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute READING_TYPE__DEFAULT_VALUE_DATA_TYPE = eINSTANCE.getReadingType_DefaultValueDataType();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_TYPE__REGISTER = eINSTANCE.getReadingType_Register();

		/**
		 * The meta object literal for the '<em><b>Pending Calculation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference READING_TYPE__PENDING_CALCULATION = eINSTANCE.getReadingType_PendingCalculation();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.EndDeviceFunctionKind <em>End Device Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.EndDeviceFunctionKind
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceFunctionKind()
		 * @generated
		 */
		public static final EEnum END_DEVICE_FUNCTION_KIND = eINSTANCE.getEndDeviceFunctionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.ReadingKind <em>Reading Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.ReadingKind
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getReadingKind()
		 * @generated
		 */
		public static final EEnum READING_KIND = eINSTANCE.getReadingKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Metering.DemandKind <em>Demand Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Metering.DemandKind
		 * @see CIM15.IEC61968.Metering.MeteringPackage#getDemandKind()
		 * @generated
		 */
		public static final EEnum DEMAND_KIND = eINSTANCE.getDemandKind();

	}

} //MeteringPackage
