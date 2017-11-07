/**
 */
package CIM15.IEC61970.Core;

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
 * @see CIM15.IEC61970.Core.CoreFactory
 * @generated
 */
public class CorePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimCore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CorePackage eINSTANCE = CIM15.IEC61970.Core.CorePackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @see CIM15.IEC61970.Core.CorePackage#getIdentifiedObject()
	 * @generated
	 */
	public static final int IDENTIFIED_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__NAMES = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__DIAGRAM_OBJECTS = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__MRID = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__ALIAS_NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Identified Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Identified Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIED_OBJECT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.PowerSystemResource
	 * @see CIM15.IEC61970.Core.CorePackage#getPowerSystemResource()
	 * @generated
	 */
	public static final int POWER_SYSTEM_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__CHANGE_ITEMS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__OPERATING_SHARE = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__PSR_LISTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__REPORTING_GROUP = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__PSR_TYPE = IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__ASSETS = IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES = IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__LOCATION = IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__PSR_EVENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS = IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE = IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Power System Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SYSTEM_RESOURCE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.NameTypeAuthority <em>Name Type Authority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.NameTypeAuthority
	 * @see CIM15.IEC61970.Core.CorePackage#getNameTypeAuthority()
	 * @generated
	 */
	public static final int NAME_TYPE_AUTHORITY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_AUTHORITY__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_AUTHORITY__NAME_TYPES = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_AUTHORITY__NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_AUTHORITY__DESCRIPTION = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name Type Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_AUTHORITY_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Name Type Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_AUTHORITY_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.Equipment <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.Equipment
	 * @see CIM15.IEC61970.Core.CorePackage#getEquipment()
	 * @generated
	 */
	public static final int EQUIPMENT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__UUID = POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__NAMES = POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__DIAGRAM_OBJECTS = POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__MRID = POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__MODELING_AUTHORITY_SET = POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__CHANGE_ITEMS = POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__SCHEDULE_STEPS = POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__SAFETY_DOCUMENTS = POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__OPERATING_SHARE = POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__DOCUMENT_ROLES = POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__PSR_LISTS = POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__MEASUREMENTS = POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__REPORTING_GROUP = POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__PSR_TYPE = POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__ASSETS = POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__ERP_ORGANISATION_ROLES = POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__LOCATION = POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__PSR_EVENT = POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__NETWORK_DATA_SETS = POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__OUTAGE_SCHEDULE = POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__CONTINGENCY_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__CUSTOMER_AGREEMENTS = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__NORMALLY_IN_SERVICE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__AGGREGATE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT__EQUIPMENT_CONTAINER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.ConductingEquipment <em>Conducting Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.ConductingEquipment
	 * @see CIM15.IEC61970.Core.CorePackage#getConductingEquipment()
	 * @generated
	 */
	public static final int CONDUCTING_EQUIPMENT = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__UUID = EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__NAMES = EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__DIAGRAM_OBJECTS = EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__MRID = EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__ALIAS_NAME = EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__NAME = EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__MODELING_AUTHORITY_SET = EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__CHANGE_ITEMS = EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__SCHEDULE_STEPS = EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__SAFETY_DOCUMENTS = EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__OPERATING_SHARE = EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__DOCUMENT_ROLES = EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__PSR_LISTS = EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__MEASUREMENTS = EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__REPORTING_GROUP = EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__PSR_TYPE = EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__ASSETS = EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__ERP_ORGANISATION_ROLES = EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__LOCATION = EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__PSR_EVENT = EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__NETWORK_DATA_SETS = EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__OUTAGE_SCHEDULE = EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__CONTINGENCY_EQUIPMENT = EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__CUSTOMER_AGREEMENTS = EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__NORMALLY_IN_SERVICE = EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__AGGREGATE = EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__EQUIPMENT_CONTAINER = EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__BASE_VOLTAGE = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__CLEARANCE_TAGS = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__TERMINALS = EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES = EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT__SV_STATUS = EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Conducting Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTING_EQUIPMENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.RegularTimePoint <em>Regular Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.RegularTimePoint
	 * @see CIM15.IEC61970.Core.CorePackage#getRegularTimePoint()
	 * @generated
	 */
	public static final int REGULAR_TIME_POINT = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT__VALUE2 = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT__VALUE1 = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT__INTERVAL_SCHEDULE = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT__SEQUENCE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Regular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_TIME_POINT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.ConnectivityNode <em>Connectivity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.ConnectivityNode
	 * @see CIM15.IEC61970.Core.CorePackage#getConnectivityNode()
	 * @generated
	 */
	public static final int CONNECTIVITY_NODE = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectivity Node Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE__TERMINALS = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connectivity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connectivity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.PSRType <em>PSR Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.PSRType
	 * @see CIM15.IEC61970.Core.CorePackage#getPSRType()
	 * @generated
	 */
	public static final int PSR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE__POWER_SYSTEM_RESOURCES = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_TYPE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer
	 * @see CIM15.IEC61970.Core.CorePackage#getConnectivityNodeContainer()
	 * @generated
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__UUID = POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__NAMES = POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__DIAGRAM_OBJECTS = POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__MRID = POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME = POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__NAME = POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__MODELING_AUTHORITY_SET = POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__CHANGE_ITEMS = POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__SCHEDULE_STEPS = POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__SAFETY_DOCUMENTS = POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__OPERATING_SHARE = POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__DOCUMENT_ROLES = POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__PSR_LISTS = POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__MEASUREMENTS = POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__REPORTING_GROUP = POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__PSR_TYPE = POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__ASSETS = POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__ERP_ORGANISATION_ROLES = POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__LOCATION = POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__PSR_EVENT = POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__NETWORK_DATA_SETS = POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__OUTAGE_SCHEDULE = POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connectivity Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connectivity Node Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIVITY_NODE_CONTAINER_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.EquipmentContainer <em>Equipment Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.EquipmentContainer
	 * @see CIM15.IEC61970.Core.CorePackage#getEquipmentContainer()
	 * @generated
	 */
	public static final int EQUIPMENT_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__UUID = CONNECTIVITY_NODE_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__NAMES = CONNECTIVITY_NODE_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS = CONNECTIVITY_NODE_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__MRID = CONNECTIVITY_NODE_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__ALIAS_NAME = CONNECTIVITY_NODE_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__NAME = CONNECTIVITY_NODE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET = CONNECTIVITY_NODE_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__CHANGE_ITEMS = CONNECTIVITY_NODE_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__SCHEDULE_STEPS = CONNECTIVITY_NODE_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS = CONNECTIVITY_NODE_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__OPERATING_SHARE = CONNECTIVITY_NODE_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__DOCUMENT_ROLES = CONNECTIVITY_NODE_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__PSR_LISTS = CONNECTIVITY_NODE_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__MEASUREMENTS = CONNECTIVITY_NODE_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__REPORTING_GROUP = CONNECTIVITY_NODE_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__PSR_TYPE = CONNECTIVITY_NODE_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__ASSETS = CONNECTIVITY_NODE_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES = CONNECTIVITY_NODE_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__LOCATION = CONNECTIVITY_NODE_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__PSR_EVENT = CONNECTIVITY_NODE_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__NETWORK_DATA_SETS = CONNECTIVITY_NODE_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE = CONNECTIVITY_NODE_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE = CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__CONNECTIVITY_NODES = CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER__EQUIPMENTS = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equipment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER_FEATURE_COUNT = CONNECTIVITY_NODE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equipment Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUIPMENT_CONTAINER_OPERATION_COUNT = CONNECTIVITY_NODE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.Bay <em>Bay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.Bay
	 * @see CIM15.IEC61970.Core.CorePackage#getBay()
	 * @generated
	 */
	public static final int BAY = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__UUID = EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__NAMES = EQUIPMENT_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__DIAGRAM_OBJECTS = EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__MRID = EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__MODELING_AUTHORITY_SET = EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__CHANGE_ITEMS = EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__SCHEDULE_STEPS = EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__SAFETY_DOCUMENTS = EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__OPERATING_SHARE = EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__DOCUMENT_ROLES = EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__PSR_LISTS = EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__MEASUREMENTS = EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__REPORTING_GROUP = EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__PSR_TYPE = EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__ASSETS = EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__ERP_ORGANISATION_ROLES = EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__LOCATION = EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__PSR_EVENT = EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__NETWORK_DATA_SETS = EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__OUTAGE_SCHEDULE = EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__TOPOLOGICAL_NODE = EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__EQUIPMENTS = EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Voltage Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__VOLTAGE_LEVEL = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bay Power Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__BAY_POWER_MEAS_FLAG = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bay Energy Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__BAY_ENERGY_MEAS_FLAG = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Bar Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__BUS_BAR_CONFIGURATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__SUBSTATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Breaker Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY__BREAKER_CONFIGURATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BAY_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.ReportingGroup <em>Reporting Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.ReportingGroup
	 * @see CIM15.IEC61970.Core.CorePackage#getReportingGroup()
	 * @generated
	 */
	public static final int REPORTING_GROUP = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Bus Name Marker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__BUS_NAME_MARKER = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reporting Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__REPORTING_SUPER_GROUP = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP__POWER_SYSTEM_RESOURCE = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reporting Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reporting Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_GROUP_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.BasePower <em>Base Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.BasePower
	 * @see CIM15.IEC61970.Core.CorePackage#getBasePower()
	 * @generated
	 */
	public static final int BASE_POWER = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER__BASE_POWER = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_POWER_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.PsrList <em>Psr List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.PsrList
	 * @see CIM15.IEC61970.Core.CorePackage#getPsrList()
	 * @generated
	 */
	public static final int PSR_LIST = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__POWER_SYSTEM_RESOURCES = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type PSR List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST__TYPE_PSR_LIST = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Psr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Psr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PSR_LIST_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule
	 * @see CIM15.IEC61970.Core.CorePackage#getBasicIntervalSchedule()
	 * @generated
	 */
	public static final int BASIC_INTERVAL_SCHEDULE = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__START_TIME = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Basic Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Basic Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_INTERVAL_SCHEDULE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.Curve <em>Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.Curve
	 * @see CIM15.IEC61970.Core.CorePackage#getCurve()
	 * @generated
	 */
	public static final int CURVE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__XUNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__Y1_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__Y2_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__Y3_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__CURVE_DATAS = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__Y1_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__XMULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__Y3_UNIT = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__Y2_MULTIPLIER = IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE__CURVE_STYLE = IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.GeographicalRegion <em>Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.GeographicalRegion
	 * @see CIM15.IEC61970.Core.CorePackage#getGeographicalRegion()
	 * @generated
	 */
	public static final int GEOGRAPHICAL_REGION = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION__REGIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHICAL_REGION_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.CurveData <em>Curve Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.CurveData
	 * @see CIM15.IEC61970.Core.CorePackage#getCurveData()
	 * @generated
	 */
	public static final int CURVE_DATA = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Y3value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA__Y3VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA__XVALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA__CURVE = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA__Y2VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA__Y1VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Curve Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Curve Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURVE_DATA_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.SubGeographicalRegion <em>Sub Geographical Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.SubGeographicalRegion
	 * @see CIM15.IEC61970.Core.CorePackage#getSubGeographicalRegion()
	 * @generated
	 */
	public static final int SUB_GEOGRAPHICAL_REGION = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Substations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__SUBSTATIONS = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__LINES = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION__REGION = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sub Geographical Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_GEOGRAPHICAL_REGION_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.NameType <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.NameType
	 * @see CIM15.IEC61970.Core.CorePackage#getNameType()
	 * @generated
	 */
	public static final int NAME_TYPE = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE__NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE__NAMES = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Type Authority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE__NAME_TYPE_AUTHORITY = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE__DESCRIPTION = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_TYPE_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.Substation <em>Substation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.Substation
	 * @see CIM15.IEC61970.Core.CorePackage#getSubstation()
	 * @generated
	 */
	public static final int SUBSTATION = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__UUID = EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__NAMES = EQUIPMENT_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__DIAGRAM_OBJECTS = EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__MRID = EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__MODELING_AUTHORITY_SET = EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__CHANGE_ITEMS = EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__SCHEDULE_STEPS = EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__SAFETY_DOCUMENTS = EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__OPERATING_SHARE = EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__DOCUMENT_ROLES = EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__PSR_LISTS = EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__MEASUREMENTS = EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__REPORTING_GROUP = EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__PSR_TYPE = EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__ASSETS = EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__ERP_ORGANISATION_ROLES = EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__LOCATION = EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__PSR_EVENT = EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__NETWORK_DATA_SETS = EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__OUTAGE_SCHEDULE = EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__TOPOLOGICAL_NODE = EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__EQUIPMENTS = EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Bays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__BAYS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voltage Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__VOLTAGE_LEVELS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION__REGION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Substation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.Name <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.Name
	 * @see CIM15.IEC61970.Core.CorePackage#getName_()
	 * @generated
	 */
	public static final int NAME = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME__NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME__NAME_TYPE = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identified Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME__IDENTIFIED_OBJECT = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NAME_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.BaseVoltage <em>Base Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.BaseVoltage
	 * @see CIM15.IEC61970.Core.CorePackage#getBaseVoltage()
	 * @generated
	 */
	public static final int BASE_VOLTAGE = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__NOMINAL_VOLTAGE = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is DC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__IS_DC = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voltage Level</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__VOLTAGE_LEVEL = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE__CONDUCTING_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Base Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Base Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VOLTAGE_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.Terminal <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.Terminal
	 * @see CIM15.IEC61970.Core.CorePackage#getTerminal()
	 * @generated
	 */
	public static final int TERMINAL = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Bushing Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__BUSHING_INFO = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tie Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__TIE_FLOW = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Second Mutual Coupling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__HAS_SECOND_MUTUAL_COUPLING = IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__PHASES = IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__OPERATIONAL_LIMIT_SET = IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__MEASUREMENTS = IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__CONNECTED = IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__CONDUCTING_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Regulating Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__REGULATING_CONTROL = IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Has First Mutual Coupling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__HAS_FIRST_MUTUAL_COUPLING = IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Auxiliary Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__AUXILIARY_EQUIPMENT = IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__TRANSFORMER_END = IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Connectivity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__CONNECTIVITY_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__BRANCH_GROUP_TERMINAL = IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Bus Name Marker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__BUS_NAME_MARKER = IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__SEQUENCE_NUMBER = IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sv Power Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__SV_POWER_FLOW = IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL__TOPOLOGICAL_NODE = IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TERMINAL_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.IrregularIntervalSchedule <em>Irregular Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.IrregularIntervalSchedule
	 * @see CIM15.IEC61970.Core.CorePackage#getIrregularIntervalSchedule()
	 * @generated
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__UUID = BASIC_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__NAMES = BASIC_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS = BASIC_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__MRID = BASIC_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__ALIAS_NAME = BASIC_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__NAME = BASIC_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET = BASIC_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__START_TIME = BASIC_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Irregular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Irregular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT = BASIC_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.RegularIntervalSchedule
	 * @see CIM15.IEC61970.Core.CorePackage#getRegularIntervalSchedule()
	 * @generated
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__UUID = BASIC_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__NAMES = BASIC_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS = BASIC_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__MRID = BASIC_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME = BASIC_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__NAME = BASIC_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET = BASIC_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__START_TIME = BASIC_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT = BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__END_TIME = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__TIME_STEP = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE__TIME_POINTS = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Regular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT = BASIC_INTERVAL_SCHEDULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Regular Interval Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT = BASIC_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.OperatingParticipant <em>Operating Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.OperatingParticipant
	 * @see CIM15.IEC61970.Core.CorePackage#getOperatingParticipant()
	 * @generated
	 */
	public static final int OPERATING_PARTICIPANT = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT__OPERATING_SHARE = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operating Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operating Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_PARTICIPANT_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.OperatingShare <em>Operating Share</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.OperatingShare
	 * @see CIM15.IEC61970.Core.CorePackage#getOperatingShare()
	 * @generated
	 */
	public static final int OPERATING_SHARE = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SHARE__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SHARE__POWER_SYSTEM_RESOURCE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operating Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SHARE__OPERATING_PARTICIPANT = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SHARE__PERCENTAGE = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operating Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SHARE_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operating Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SHARE_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.VoltageLevel <em>Voltage Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.VoltageLevel
	 * @see CIM15.IEC61970.Core.CorePackage#getVoltageLevel()
	 * @generated
	 */
	public static final int VOLTAGE_LEVEL = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__UUID = EQUIPMENT_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__NAMES = EQUIPMENT_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__DIAGRAM_OBJECTS = EQUIPMENT_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__MRID = EQUIPMENT_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__ALIAS_NAME = EQUIPMENT_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__NAME = EQUIPMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__MODELING_AUTHORITY_SET = EQUIPMENT_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__CHANGE_ITEMS = EQUIPMENT_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__SCHEDULE_STEPS = EQUIPMENT_CONTAINER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__SAFETY_DOCUMENTS = EQUIPMENT_CONTAINER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__OPERATING_SHARE = EQUIPMENT_CONTAINER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__DOCUMENT_ROLES = EQUIPMENT_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__PSR_LISTS = EQUIPMENT_CONTAINER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__MEASUREMENTS = EQUIPMENT_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__REPORTING_GROUP = EQUIPMENT_CONTAINER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__PSR_TYPE = EQUIPMENT_CONTAINER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__ASSETS = EQUIPMENT_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__ERP_ORGANISATION_ROLES = EQUIPMENT_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__LOCATION = EQUIPMENT_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__PSR_EVENT = EQUIPMENT_CONTAINER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__NETWORK_DATA_SETS = EQUIPMENT_CONTAINER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__OUTAGE_SCHEDULE = EQUIPMENT_CONTAINER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__TOPOLOGICAL_NODE = EQUIPMENT_CONTAINER__TOPOLOGICAL_NODE;

	/**
	 * The feature id for the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__CONNECTIVITY_NODES = EQUIPMENT_CONTAINER__CONNECTIVITY_NODES;

	/**
	 * The feature id for the '<em><b>Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__EQUIPMENTS = EQUIPMENT_CONTAINER__EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>High Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__BAYS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__SUBSTATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL__BASE_VOLTAGE = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Voltage Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Voltage Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LEVEL_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.ReportingSuperGroup <em>Reporting Super Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.ReportingSuperGroup
	 * @see CIM15.IEC61970.Core.CorePackage#getReportingSuperGroup()
	 * @generated
	 */
	public static final int REPORTING_SUPER_GROUP = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__UUID = IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__NAMES = IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__DIAGRAM_OBJECTS = IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__MRID = IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__ALIAS_NAME = IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__NAME = IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__MODELING_AUTHORITY_SET = IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP__REPORTING_GROUP = IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reporting Super Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP_FEATURE_COUNT = IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reporting Super Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_SUPER_GROUP_OPERATION_COUNT = IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.IrregularTimePoint <em>Irregular Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.IrregularTimePoint
	 * @see CIM15.IEC61970.Core.CorePackage#getIrregularTimePoint()
	 * @generated
	 */
	public static final int IRREGULAR_TIME_POINT = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Interval Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT__TIME = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT__VALUE1 = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT__VALUE2 = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Irregular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Irregular Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IRREGULAR_TIME_POINT_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.BreakerConfiguration <em>Breaker Configuration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.BreakerConfiguration
	 * @see CIM15.IEC61970.Core.CorePackage#getBreakerConfiguration()
	 * @generated
	 */
	public static final int BREAKER_CONFIGURATION = 31;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.CompanyType <em>Company Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.CompanyType
	 * @see CIM15.IEC61970.Core.CorePackage#getCompanyType()
	 * @generated
	 */
	public static final int COMPANY_TYPE = 32;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.PhaseCode <em>Phase Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see CIM15.IEC61970.Core.CorePackage#getPhaseCode()
	 * @generated
	 */
	public static final int PHASE_CODE = 33;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.CurveStyle <em>Curve Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.CurveStyle
	 * @see CIM15.IEC61970.Core.CorePackage#getCurveStyle()
	 * @generated
	 */
	public static final int CURVE_STYLE = 34;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Core.BusbarConfiguration <em>Busbar Configuration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Core.BusbarConfiguration
	 * @see CIM15.IEC61970.Core.CorePackage#getBusbarConfiguration()
	 * @generated
	 */
	public static final int BUSBAR_CONFIGURATION = 35;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSystemResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypeAuthorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductingEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularTimePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityNodeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basePowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psrListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicIntervalScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographicalRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curveDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subGeographicalRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irregularIntervalScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularIntervalScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingShareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportingSuperGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irregularTimePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breakerConfigurationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum companyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phaseCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum curveStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busbarConfigurationEEnum = null;

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
	 * @see CIM15.IEC61970.Core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackage() {
		super(eNS_URI, CoreFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackage());

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
		theCorePackage.fixPackageContents();
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
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource
	 * @generated
	 */
	public EClass getPowerSystemResource() {
		if (powerSystemResourceEClass == null) {
			powerSystemResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(0);
		}
		return powerSystemResourceEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getChangeItems()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_ChangeItems() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedule Steps</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getScheduleSteps()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_ScheduleSteps() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getSafetyDocuments <em>Safety Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Safety Documents</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getSafetyDocuments()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_SafetyDocuments() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operating Share</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getOperatingShare()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_OperatingShare() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getDocumentRoles()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_DocumentRoles() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getPsrLists <em>Psr Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Psr Lists</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getPsrLists()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_PsrLists() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getMeasurements()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_Measurements() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reporting Group</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getReportingGroup()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_ReportingGroup() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PSR Type</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getPSRType()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_PSRType() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getAssets()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_Assets() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_ErpOrganisationRoles() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getLocation()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_Location() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getPSREvent <em>PSR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PSR Event</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getPSREvent()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_PSREvent() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PowerSystemResource#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Data Sets</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getNetworkDataSets()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_NetworkDataSets() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outage Schedule</em>'.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getOutageSchedule()
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public EReference getPowerSystemResource_OutageSchedule() {
        return (EReference)getPowerSystemResource().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.NameTypeAuthority <em>Name Type Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type Authority</em>'.
	 * @see CIM15.IEC61970.Core.NameTypeAuthority
	 * @generated
	 */
	public EClass getNameTypeAuthority() {
		if (nameTypeAuthorityEClass == null) {
			nameTypeAuthorityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(1);
		}
		return nameTypeAuthorityEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.NameTypeAuthority#getNameTypes <em>Name Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Name Types</em>'.
	 * @see CIM15.IEC61970.Core.NameTypeAuthority#getNameTypes()
	 * @see #getNameTypeAuthority()
	 * @generated
	 */
	public EReference getNameTypeAuthority_NameTypes() {
        return (EReference)getNameTypeAuthority().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.NameTypeAuthority#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61970.Core.NameTypeAuthority#getName()
	 * @see #getNameTypeAuthority()
	 * @generated
	 */
	public EAttribute getNameTypeAuthority_Name() {
        return (EAttribute)getNameTypeAuthority().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.NameTypeAuthority#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CIM15.IEC61970.Core.NameTypeAuthority#getDescription()
	 * @see #getNameTypeAuthority()
	 * @generated
	 */
	public EAttribute getNameTypeAuthority_Description() {
        return (EAttribute)getNameTypeAuthority().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CIM15.IEC61970.Core.Equipment
	 * @generated
	 */
	public EClass getEquipment() {
		if (equipmentEClass == null) {
			equipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(2);
		}
		return equipmentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contingency Equipment</em>'.
	 * @see CIM15.IEC61970.Core.Equipment#getContingencyEquipment()
	 * @see #getEquipment()
	 * @generated
	 */
	public EReference getEquipment_ContingencyEquipment() {
        return (EReference)getEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Equipment#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see CIM15.IEC61970.Core.Equipment#getCustomerAgreements()
	 * @see #getEquipment()
	 * @generated
	 */
	public EReference getEquipment_CustomerAgreements() {
        return (EReference)getEquipment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Equipment#isNormallyInService <em>Normally In Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normally In Service</em>'.
	 * @see CIM15.IEC61970.Core.Equipment#isNormallyInService()
	 * @see #getEquipment()
	 * @generated
	 */
	public EAttribute getEquipment_NormallyInService() {
        return (EAttribute)getEquipment().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate</em>'.
	 * @see CIM15.IEC61970.Core.Equipment#isAggregate()
	 * @see #getEquipment()
	 * @generated
	 */
	public EAttribute getEquipment_Aggregate() {
        return (EAttribute)getEquipment().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment Container</em>'.
	 * @see CIM15.IEC61970.Core.Equipment#getEquipmentContainer()
	 * @see #getEquipment()
	 * @generated
	 */
	public EReference getEquipment_EquipmentContainer() {
        return (EReference)getEquipment().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conducting Equipment</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment
	 * @generated
	 */
	public EClass getConductingEquipment() {
		if (conductingEquipmentEClass == null) {
			conductingEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(3);
		}
		return conductingEquipmentEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getBaseVoltage()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public EReference getConductingEquipment_BaseVoltage() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConductingEquipment#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clearance Tags</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getClearanceTags()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public EReference getConductingEquipment_ClearanceTags() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protection Equipments</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getProtectionEquipments()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public EReference getConductingEquipment_ProtectionEquipments() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getTerminals()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public EReference getConductingEquipment_Terminals() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConductingEquipment#getOutageStepRoles <em>Outage Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outage Step Roles</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getOutageStepRoles()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public EReference getConductingEquipment_OutageStepRoles() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Status</em>'.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getSvStatus()
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public EReference getConductingEquipment_SvStatus() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.RegularTimePoint <em>Regular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Time Point</em>'.
	 * @see CIM15.IEC61970.Core.RegularTimePoint
	 * @generated
	 */
	public EClass getRegularTimePoint() {
		if (regularTimePointEClass == null) {
			regularTimePointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(4);
		}
		return regularTimePointEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.RegularTimePoint#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see CIM15.IEC61970.Core.RegularTimePoint#getValue2()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	public EAttribute getRegularTimePoint_Value2() {
        return (EAttribute)getRegularTimePoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.RegularTimePoint#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see CIM15.IEC61970.Core.RegularTimePoint#getValue1()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	public EAttribute getRegularTimePoint_Value1() {
        return (EAttribute)getRegularTimePoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Schedule</em>'.
	 * @see CIM15.IEC61970.Core.RegularTimePoint#getIntervalSchedule()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	public EReference getRegularTimePoint_IntervalSchedule() {
        return (EReference)getRegularTimePoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.RegularTimePoint#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61970.Core.RegularTimePoint#getSequenceNumber()
	 * @see #getRegularTimePoint()
	 * @generated
	 */
	public EAttribute getRegularTimePoint_SequenceNumber() {
        return (EAttribute)getRegularTimePoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.ConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNode
	 * @generated
	 */
	public EClass getConnectivityNode() {
		if (connectivityNodeEClass == null) {
			connectivityNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(5);
		}
		return connectivityNodeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNode#getTopologicalNode()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	public EReference getConnectivityNode_TopologicalNode() {
        return (EReference)getConnectivityNode().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node Container</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	public EReference getConnectivityNode_ConnectivityNodeContainer() {
        return (EReference)getConnectivityNode().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConnectivityNode#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNode#getTerminals()
	 * @see #getConnectivityNode()
	 * @generated
	 */
	public EReference getConnectivityNode_Terminals() {
        return (EReference)getConnectivityNode().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.PSRType <em>PSR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSR Type</em>'.
	 * @see CIM15.IEC61970.Core.PSRType
	 * @generated
	 */
	public EClass getPSRType() {
		if (psrTypeEClass == null) {
			psrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(6);
		}
		return psrTypeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PSRType#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM15.IEC61970.Core.PSRType#getPowerSystemResources()
	 * @see #getPSRType()
	 * @generated
	 */
	public EReference getPSRType_PowerSystemResources() {
        return (EReference)getPSRType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Node Container</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer
	 * @generated
	 */
	public EClass getConnectivityNodeContainer() {
		if (connectivityNodeContainerEClass == null) {
			connectivityNodeContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(7);
		}
		return connectivityNodeContainerEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode()
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	public EReference getConnectivityNodeContainer_TopologicalNode() {
        return (EReference)getConnectivityNodeContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectivity Nodes</em>'.
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes()
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	public EReference getConnectivityNodeContainer_ConnectivityNodes() {
        return (EReference)getConnectivityNodeContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.Bay <em>Bay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bay</em>'.
	 * @see CIM15.IEC61970.Core.Bay
	 * @generated
	 */
	public EClass getBay() {
		if (bayEClass == null) {
			bayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(8);
		}
		return bayEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voltage Level</em>'.
	 * @see CIM15.IEC61970.Core.Bay#getVoltageLevel()
	 * @see #getBay()
	 * @generated
	 */
	public EReference getBay_VoltageLevel() {
        return (EReference)getBay().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bay Power Meas Flag</em>'.
	 * @see CIM15.IEC61970.Core.Bay#isBayPowerMeasFlag()
	 * @see #getBay()
	 * @generated
	 */
	public EAttribute getBay_BayPowerMeasFlag() {
        return (EAttribute)getBay().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bay Energy Meas Flag</em>'.
	 * @see CIM15.IEC61970.Core.Bay#isBayEnergyMeasFlag()
	 * @see #getBay()
	 * @generated
	 */
	public EAttribute getBay_BayEnergyMeasFlag() {
        return (EAttribute)getBay().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Bar Configuration</em>'.
	 * @see CIM15.IEC61970.Core.Bay#getBusBarConfiguration()
	 * @see #getBay()
	 * @generated
	 */
	public EAttribute getBay_BusBarConfiguration() {
        return (EAttribute)getBay().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Bay#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substation</em>'.
	 * @see CIM15.IEC61970.Core.Bay#getSubstation()
	 * @see #getBay()
	 * @generated
	 */
	public EReference getBay_Substation() {
        return (EReference)getBay().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breaker Configuration</em>'.
	 * @see CIM15.IEC61970.Core.Bay#getBreakerConfiguration()
	 * @see #getBay()
	 * @generated
	 */
	public EAttribute getBay_BreakerConfiguration() {
        return (EAttribute)getBay().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment Container</em>'.
	 * @see CIM15.IEC61970.Core.EquipmentContainer
	 * @generated
	 */
	public EClass getEquipmentContainer() {
		if (equipmentContainerEClass == null) {
			equipmentContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(9);
		}
		return equipmentContainerEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.EquipmentContainer#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipments</em>'.
	 * @see CIM15.IEC61970.Core.EquipmentContainer#getEquipments()
	 * @see #getEquipmentContainer()
	 * @generated
	 */
	public EReference getEquipmentContainer_Equipments() {
        return (EReference)getEquipmentContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.ReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting Group</em>'.
	 * @see CIM15.IEC61970.Core.ReportingGroup
	 * @generated
	 */
	public EClass getReportingGroup() {
		if (reportingGroupEClass == null) {
			reportingGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(10);
		}
		return reportingGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bus Name Marker</em>'.
	 * @see CIM15.IEC61970.Core.ReportingGroup#getBusNameMarker()
	 * @see #getReportingGroup()
	 * @generated
	 */
	public EReference getReportingGroup_BusNameMarker() {
        return (EReference)getReportingGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporting Super Group</em>'.
	 * @see CIM15.IEC61970.Core.ReportingGroup#getReportingSuperGroup()
	 * @see #getReportingGroup()
	 * @generated
	 */
	public EReference getReportingGroup_ReportingSuperGroup() {
        return (EReference)getReportingGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ReportingGroup#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.Core.ReportingGroup#getTopologicalNode()
	 * @see #getReportingGroup()
	 * @generated
	 */
	public EReference getReportingGroup_TopologicalNode() {
        return (EReference)getReportingGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Core.ReportingGroup#getPowerSystemResource()
	 * @see #getReportingGroup()
	 * @generated
	 */
	public EReference getReportingGroup_PowerSystemResource() {
        return (EReference)getReportingGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.BasePower <em>Base Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Power</em>'.
	 * @see CIM15.IEC61970.Core.BasePower
	 * @generated
	 */
	public EClass getBasePower() {
		if (basePowerEClass == null) {
			basePowerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(11);
		}
		return basePowerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BasePower#getBasePower <em>Base Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Power</em>'.
	 * @see CIM15.IEC61970.Core.BasePower#getBasePower()
	 * @see #getBasePower()
	 * @generated
	 */
	public EAttribute getBasePower_BasePower() {
        return (EAttribute)getBasePower().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.PsrList <em>Psr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Psr List</em>'.
	 * @see CIM15.IEC61970.Core.PsrList
	 * @generated
	 */
	public EClass getPsrList() {
		if (psrListEClass == null) {
			psrListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(12);
		}
		return psrListEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.PsrList#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM15.IEC61970.Core.PsrList#getPowerSystemResources()
	 * @see #getPsrList()
	 * @generated
	 */
	public EReference getPsrList_PowerSystemResources() {
        return (EReference)getPsrList().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type PSR List</em>'.
	 * @see CIM15.IEC61970.Core.PsrList#getTypePSRList()
	 * @see #getPsrList()
	 * @generated
	 */
	public EAttribute getPsrList_TypePSRList() {
        return (EAttribute)getPsrList().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Object</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public EClass getIdentifiedObject() {
		if (identifiedObjectEClass == null) {
			identifiedObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(13);
		}
		return identifiedObjectEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.IdentifiedObject#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Names</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getNames()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public EReference getIdentifiedObject_Names() {
        return (EReference)getIdentifiedObject().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagram Objects</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getDiagramObjects()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public EReference getIdentifiedObject_DiagramObjects() {
        return (EReference)getIdentifiedObject().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MRID</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getMRID()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public EAttribute getIdentifiedObject_MRID() {
        return (EAttribute)getIdentifiedObject().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getAliasName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public EAttribute getIdentifiedObject_AliasName() {
        return (EAttribute)getIdentifiedObject().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getName()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public EAttribute getIdentifiedObject_Name() {
        return (EAttribute)getIdentifiedObject().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modeling Authority Set</em>'.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet()
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public EReference getIdentifiedObject_ModelingAuthoritySet() {
        return (EReference)getIdentifiedObject().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Interval Schedule</em>'.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule
	 * @generated
	 */
	public EClass getBasicIntervalSchedule() {
		if (basicIntervalScheduleEClass == null) {
			basicIntervalScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(14);
		}
		return basicIntervalScheduleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule#getStartTime()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_StartTime() {
        return (EAttribute)getBasicIntervalSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1 Multiplier</em>'.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_Value1Multiplier() {
        return (EAttribute)getBasicIntervalSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2 Unit</em>'.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_Value2Unit() {
        return (EAttribute)getBasicIntervalSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1 Unit</em>'.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Unit()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_Value1Unit() {
        return (EAttribute)getBasicIntervalSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2 Multiplier</em>'.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier()
	 * @see #getBasicIntervalSchedule()
	 * @generated
	 */
	public EAttribute getBasicIntervalSchedule_Value2Multiplier() {
        return (EAttribute)getBasicIntervalSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve</em>'.
	 * @see CIM15.IEC61970.Core.Curve
	 * @generated
	 */
	public EClass getCurve() {
		if (curveEClass == null) {
			curveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(15);
		}
		return curveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XUnit</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getXUnit()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_XUnit() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Multiplier</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getY1Multiplier()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_Y1Multiplier() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Unit</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getY2Unit()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_Y2Unit() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3 Multiplier</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getY3Multiplier()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_Y3Multiplier() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Curve#getCurveDatas <em>Curve Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Curve Datas</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getCurveDatas()
	 * @see #getCurve()
	 * @generated
	 */
	public EReference getCurve_CurveDatas() {
        return (EReference)getCurve().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1 Unit</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getY1Unit()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_Y1Unit() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMultiplier</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getXMultiplier()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_XMultiplier() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3 Unit</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getY3Unit()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_Y3Unit() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2 Multiplier</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getY2Multiplier()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_Y2Multiplier() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve Style</em>'.
	 * @see CIM15.IEC61970.Core.Curve#getCurveStyle()
	 * @see #getCurve()
	 * @generated
	 */
	public EAttribute getCurve_CurveStyle() {
        return (EAttribute)getCurve().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.GeographicalRegion <em>Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Region</em>'.
	 * @see CIM15.IEC61970.Core.GeographicalRegion
	 * @generated
	 */
	public EClass getGeographicalRegion() {
		if (geographicalRegionEClass == null) {
			geographicalRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(16);
		}
		return geographicalRegionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regions</em>'.
	 * @see CIM15.IEC61970.Core.GeographicalRegion#getRegions()
	 * @see #getGeographicalRegion()
	 * @generated
	 */
	public EReference getGeographicalRegion_Regions() {
        return (EReference)getGeographicalRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.CurveData <em>Curve Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curve Data</em>'.
	 * @see CIM15.IEC61970.Core.CurveData
	 * @generated
	 */
	public EClass getCurveData() {
		if (curveDataEClass == null) {
			curveDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(17);
		}
		return curveDataEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3value</em>'.
	 * @see CIM15.IEC61970.Core.CurveData#getY3value()
	 * @see #getCurveData()
	 * @generated
	 */
	public EAttribute getCurveData_Y3value() {
        return (EAttribute)getCurveData().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvalue</em>'.
	 * @see CIM15.IEC61970.Core.CurveData#getXvalue()
	 * @see #getCurveData()
	 * @generated
	 */
	public EAttribute getCurveData_Xvalue() {
        return (EAttribute)getCurveData().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.CurveData#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curve</em>'.
	 * @see CIM15.IEC61970.Core.CurveData#getCurve()
	 * @see #getCurveData()
	 * @generated
	 */
	public EReference getCurveData_Curve() {
        return (EReference)getCurveData().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2value</em>'.
	 * @see CIM15.IEC61970.Core.CurveData#getY2value()
	 * @see #getCurveData()
	 * @generated
	 */
	public EAttribute getCurveData_Y2value() {
        return (EAttribute)getCurveData().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1value</em>'.
	 * @see CIM15.IEC61970.Core.CurveData#getY1value()
	 * @see #getCurveData()
	 * @generated
	 */
	public EAttribute getCurveData_Y1value() {
        return (EAttribute)getCurveData().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.SubGeographicalRegion <em>Sub Geographical Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Geographical Region</em>'.
	 * @see CIM15.IEC61970.Core.SubGeographicalRegion
	 * @generated
	 */
	public EClass getSubGeographicalRegion() {
		if (subGeographicalRegionEClass == null) {
			subGeographicalRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(18);
		}
		return subGeographicalRegionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substations</em>'.
	 * @see CIM15.IEC61970.Core.SubGeographicalRegion#getSubstations()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	public EReference getSubGeographicalRegion_Substations() {
        return (EReference)getSubGeographicalRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.SubGeographicalRegion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see CIM15.IEC61970.Core.SubGeographicalRegion#getLines()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	public EReference getSubGeographicalRegion_Lines() {
        return (EReference)getSubGeographicalRegion().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CIM15.IEC61970.Core.SubGeographicalRegion#getRegion()
	 * @see #getSubGeographicalRegion()
	 * @generated
	 */
	public EReference getSubGeographicalRegion_Region() {
        return (EReference)getSubGeographicalRegion().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type</em>'.
	 * @see CIM15.IEC61970.Core.NameType
	 * @generated
	 */
	public EClass getNameType() {
		if (nameTypeEClass == null) {
			nameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(19);
		}
		return nameTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.NameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61970.Core.NameType#getName()
	 * @see #getNameType()
	 * @generated
	 */
	public EAttribute getNameType_Name() {
        return (EAttribute)getNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.NameType#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Names</em>'.
	 * @see CIM15.IEC61970.Core.NameType#getNames()
	 * @see #getNameType()
	 * @generated
	 */
	public EReference getNameType_Names() {
        return (EReference)getNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.NameType#getNameTypeAuthority <em>Name Type Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Type Authority</em>'.
	 * @see CIM15.IEC61970.Core.NameType#getNameTypeAuthority()
	 * @see #getNameType()
	 * @generated
	 */
	public EReference getNameType_NameTypeAuthority() {
        return (EReference)getNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.NameType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CIM15.IEC61970.Core.NameType#getDescription()
	 * @see #getNameType()
	 * @generated
	 */
	public EAttribute getNameType_Description() {
        return (EAttribute)getNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.Substation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation</em>'.
	 * @see CIM15.IEC61970.Core.Substation
	 * @generated
	 */
	public EClass getSubstation() {
		if (substationEClass == null) {
			substationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(20);
		}
		return substationEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Substation#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bays</em>'.
	 * @see CIM15.IEC61970.Core.Substation#getBays()
	 * @see #getSubstation()
	 * @generated
	 */
	public EReference getSubstation_Bays() {
        return (EReference)getSubstation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Substation#getVoltageLevels <em>Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Levels</em>'.
	 * @see CIM15.IEC61970.Core.Substation#getVoltageLevels()
	 * @see #getSubstation()
	 * @generated
	 */
	public EReference getSubstation_VoltageLevels() {
        return (EReference)getSubstation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see CIM15.IEC61970.Core.Substation#getRegion()
	 * @see #getSubstation()
	 * @generated
	 */
	public EReference getSubstation_Region() {
        return (EReference)getSubstation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see CIM15.IEC61970.Core.Name
	 * @generated
	 */
	public EClass getName_() {
		if (nameEClass == null) {
			nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(22);
		}
		return nameEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61970.Core.Name#getName()
	 * @see #getName_()
	 * @generated
	 */
	public EAttribute getName_Name() {
        return (EAttribute)getName_().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Name#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Type</em>'.
	 * @see CIM15.IEC61970.Core.Name#getNameType()
	 * @see #getName_()
	 * @generated
	 */
	public EReference getName_NameType() {
        return (EReference)getName_().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Name#getIdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identified Object</em>'.
	 * @see CIM15.IEC61970.Core.Name#getIdentifiedObject()
	 * @see #getName_()
	 * @generated
	 */
	public EReference getName_IdentifiedObject() {
        return (EReference)getName_().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.BaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Voltage</em>'.
	 * @see CIM15.IEC61970.Core.BaseVoltage
	 * @generated
	 */
	public EClass getBaseVoltage() {
		if (baseVoltageEClass == null) {
			baseVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(23);
		}
		return baseVoltageEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.BaseVoltage#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.Core.BaseVoltage#getTopologicalNode()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public EReference getBaseVoltage_TopologicalNode() {
        return (EReference)getBaseVoltage().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see CIM15.IEC61970.Core.BaseVoltage#getNominalVoltage()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public EAttribute getBaseVoltage_NominalVoltage() {
        return (EAttribute)getBaseVoltage().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is DC</em>'.
	 * @see CIM15.IEC61970.Core.BaseVoltage#isIsDC()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public EAttribute getBaseVoltage_IsDC() {
        return (EAttribute)getBaseVoltage().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Level</em>'.
	 * @see CIM15.IEC61970.Core.BaseVoltage#getVoltageLevel()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public EReference getBaseVoltage_VoltageLevel() {
        return (EReference)getBaseVoltage().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conducting Equipment</em>'.
	 * @see CIM15.IEC61970.Core.BaseVoltage#getConductingEquipment()
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public EReference getBaseVoltage_ConductingEquipment() {
        return (EReference)getBaseVoltage().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.Core.Terminal
	 * @generated
	 */
	public EClass getTerminal() {
		if (terminalEClass == null) {
			terminalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(24);
		}
		return terminalEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bushing Info</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getBushingInfo()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_BushingInfo() {
        return (EReference)getTerminal().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tie Flow</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getTieFlow()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_TieFlow() {
        return (EReference)getTerminal().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Second Mutual Coupling</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getHasSecond_MutualCoupling()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_HasSecond_MutualCoupling() {
        return (EReference)getTerminal().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Terminal#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getPhases()
	 * @see #getTerminal()
	 * @generated
	 */
	public EAttribute getTerminal_Phases() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Set</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getOperationalLimitSet()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_OperationalLimitSet() {
        return (EReference)getTerminal().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getMeasurements()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_Measurements() {
        return (EReference)getTerminal().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Terminal#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#isConnected()
	 * @see #getTerminal()
	 * @generated
	 */
	public EAttribute getTerminal_Connected() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getConductingEquipment()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_ConductingEquipment() {
        return (EReference)getTerminal().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regulating Control</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getRegulatingControl()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_RegulatingControl() {
        return (EReference)getTerminal().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has First Mutual Coupling</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getHasFirst_MutualCoupling()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_HasFirst_MutualCoupling() {
        return (EReference)getTerminal().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getAuxiliaryEquipment <em>Auxiliary Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Equipment</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getAuxiliaryEquipment()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_AuxiliaryEquipment() {
        return (EReference)getTerminal().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer End</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getTransformerEnd()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_TransformerEnd() {
        return (EReference)getTerminal().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectivity Node</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getConnectivityNode()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_ConnectivityNode() {
        return (EReference)getTerminal().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branch Group Terminal</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getBranchGroupTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_BranchGroupTerminal() {
        return (EReference)getTerminal().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Terminal#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Name Marker</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getBusNameMarker()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_BusNameMarker() {
        return (EReference)getTerminal().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getSequenceNumber()
	 * @see #getTerminal()
	 * @generated
	 */
	public EAttribute getTerminal_SequenceNumber() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sv Power Flow</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getSvPowerFlow()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_SvPowerFlow() {
        return (EReference)getTerminal().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.Core.Terminal#getTopologicalNode()
	 * @see #getTerminal()
	 * @generated
	 */
	public EReference getTerminal_TopologicalNode() {
        return (EReference)getTerminal().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.IrregularIntervalSchedule <em>Irregular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irregular Interval Schedule</em>'.
	 * @see CIM15.IEC61970.Core.IrregularIntervalSchedule
	 * @generated
	 */
	public EClass getIrregularIntervalSchedule() {
		if (irregularIntervalScheduleEClass == null) {
			irregularIntervalScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(25);
		}
		return irregularIntervalScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.IrregularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see CIM15.IEC61970.Core.IrregularIntervalSchedule#getTimePoints()
	 * @see #getIrregularIntervalSchedule()
	 * @generated
	 */
	public EReference getIrregularIntervalSchedule_TimePoints() {
        return (EReference)getIrregularIntervalSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Interval Schedule</em>'.
	 * @see CIM15.IEC61970.Core.RegularIntervalSchedule
	 * @generated
	 */
	public EClass getRegularIntervalSchedule() {
		if (regularIntervalScheduleEClass == null) {
			regularIntervalScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(28);
		}
		return regularIntervalScheduleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see CIM15.IEC61970.Core.RegularIntervalSchedule#getEndTime()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	public EAttribute getRegularIntervalSchedule_EndTime() {
        return (EAttribute)getRegularIntervalSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Step</em>'.
	 * @see CIM15.IEC61970.Core.RegularIntervalSchedule#getTimeStep()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	public EAttribute getRegularIntervalSchedule_TimeStep() {
        return (EAttribute)getRegularIntervalSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Points</em>'.
	 * @see CIM15.IEC61970.Core.RegularIntervalSchedule#getTimePoints()
	 * @see #getRegularIntervalSchedule()
	 * @generated
	 */
	public EReference getRegularIntervalSchedule_TimePoints() {
        return (EReference)getRegularIntervalSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.OperatingParticipant <em>Operating Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Participant</em>'.
	 * @see CIM15.IEC61970.Core.OperatingParticipant
	 * @generated
	 */
	public EClass getOperatingParticipant() {
		if (operatingParticipantEClass == null) {
			operatingParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(30);
		}
		return operatingParticipantEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.OperatingParticipant#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operating Share</em>'.
	 * @see CIM15.IEC61970.Core.OperatingParticipant#getOperatingShare()
	 * @see #getOperatingParticipant()
	 * @generated
	 */
	public EReference getOperatingParticipant_OperatingShare() {
        return (EReference)getOperatingParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.OperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Share</em>'.
	 * @see CIM15.IEC61970.Core.OperatingShare
	 * @generated
	 */
	public EClass getOperatingShare() {
		if (operatingShareEClass == null) {
			operatingShareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(31);
		}
		return operatingShareEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Core.OperatingShare#getPowerSystemResource()
	 * @see #getOperatingShare()
	 * @generated
	 */
	public EReference getOperatingShare_PowerSystemResource() {
        return (EReference)getOperatingShare().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operating Participant</em>'.
	 * @see CIM15.IEC61970.Core.OperatingShare#getOperatingParticipant()
	 * @see #getOperatingShare()
	 * @generated
	 */
	public EReference getOperatingShare_OperatingParticipant() {
        return (EReference)getOperatingShare().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see CIM15.IEC61970.Core.OperatingShare#getPercentage()
	 * @see #getOperatingShare()
	 * @generated
	 */
	public EAttribute getOperatingShare_Percentage() {
        return (EAttribute)getOperatingShare().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.VoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Level</em>'.
	 * @see CIM15.IEC61970.Core.VoltageLevel
	 * @generated
	 */
	public EClass getVoltageLevel() {
		if (voltageLevelEClass == null) {
			voltageLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(33);
		}
		return voltageLevelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Voltage Limit</em>'.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getHighVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	public EAttribute getVoltageLevel_HighVoltageLimit() {
        return (EAttribute)getVoltageLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.VoltageLevel#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bays</em>'.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getBays()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	public EReference getVoltageLevel_Bays() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substation</em>'.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getSubstation()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	public EReference getVoltageLevel_Substation() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Voltage Limit</em>'.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getLowVoltageLimit()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	public EAttribute getVoltageLevel_LowVoltageLimit() {
        return (EAttribute)getVoltageLevel().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Voltage</em>'.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getBaseVoltage()
	 * @see #getVoltageLevel()
	 * @generated
	 */
	public EReference getVoltageLevel_BaseVoltage() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.ReportingSuperGroup <em>Reporting Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting Super Group</em>'.
	 * @see CIM15.IEC61970.Core.ReportingSuperGroup
	 * @generated
	 */
	public EClass getReportingSuperGroup() {
		if (reportingSuperGroupEClass == null) {
			reportingSuperGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(34);
		}
		return reportingSuperGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Core.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reporting Group</em>'.
	 * @see CIM15.IEC61970.Core.ReportingSuperGroup#getReportingGroup()
	 * @see #getReportingSuperGroup()
	 * @generated
	 */
	public EReference getReportingSuperGroup_ReportingGroup() {
        return (EReference)getReportingSuperGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Core.IrregularTimePoint <em>Irregular Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irregular Time Point</em>'.
	 * @see CIM15.IEC61970.Core.IrregularTimePoint
	 * @generated
	 */
	public EClass getIrregularTimePoint() {
		if (irregularTimePointEClass == null) {
			irregularTimePointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(35);
		}
		return irregularTimePointEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Schedule</em>'.
	 * @see CIM15.IEC61970.Core.IrregularTimePoint#getIntervalSchedule()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	public EReference getIrregularTimePoint_IntervalSchedule() {
        return (EReference)getIrregularTimePoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see CIM15.IEC61970.Core.IrregularTimePoint#getTime()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	public EAttribute getIrregularTimePoint_Time() {
        return (EAttribute)getIrregularTimePoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see CIM15.IEC61970.Core.IrregularTimePoint#getValue1()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	public EAttribute getIrregularTimePoint_Value1() {
        return (EAttribute)getIrregularTimePoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see CIM15.IEC61970.Core.IrregularTimePoint#getValue2()
	 * @see #getIrregularTimePoint()
	 * @generated
	 */
	public EAttribute getIrregularTimePoint_Value2() {
        return (EAttribute)getIrregularTimePoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Core.BreakerConfiguration <em>Breaker Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Breaker Configuration</em>'.
	 * @see CIM15.IEC61970.Core.BreakerConfiguration
	 * @generated
	 */
	public EEnum getBreakerConfiguration() {
		if (breakerConfigurationEEnum == null) {
			breakerConfigurationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(21);
		}
		return breakerConfigurationEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Core.CompanyType <em>Company Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Company Type</em>'.
	 * @see CIM15.IEC61970.Core.CompanyType
	 * @generated
	 */
	public EEnum getCompanyType() {
		if (companyTypeEEnum == null) {
			companyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(26);
		}
		return companyTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Core.PhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phase Code</em>'.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @generated
	 */
	public EEnum getPhaseCode() {
		if (phaseCodeEEnum == null) {
			phaseCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(27);
		}
		return phaseCodeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Core.CurveStyle <em>Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Curve Style</em>'.
	 * @see CIM15.IEC61970.Core.CurveStyle
	 * @generated
	 */
	public EEnum getCurveStyle() {
		if (curveStyleEEnum == null) {
			curveStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(29);
		}
		return curveStyleEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Core.BusbarConfiguration <em>Busbar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Busbar Configuration</em>'.
	 * @see CIM15.IEC61970.Core.BusbarConfiguration
	 * @generated
	 */
	public EEnum getBusbarConfiguration() {
		if (busbarConfigurationEEnum == null) {
			busbarConfigurationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(32);
		}
		return busbarConfigurationEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Core." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.PowerSystemResource
		 * @see CIM15.IEC61970.Core.CorePackage#getPowerSystemResource()
		 * @generated
		 */
		public static final EClass POWER_SYSTEM_RESOURCE = eINSTANCE.getPowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__CHANGE_ITEMS = eINSTANCE.getPowerSystemResource_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Schedule Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS = eINSTANCE.getPowerSystemResource_ScheduleSteps();

		/**
		 * The meta object literal for the '<em><b>Safety Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS = eINSTANCE.getPowerSystemResource_SafetyDocuments();

		/**
		 * The meta object literal for the '<em><b>Operating Share</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__OPERATING_SHARE = eINSTANCE.getPowerSystemResource_OperatingShare();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES = eINSTANCE.getPowerSystemResource_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Psr Lists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__PSR_LISTS = eINSTANCE.getPowerSystemResource_PsrLists();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__MEASUREMENTS = eINSTANCE.getPowerSystemResource_Measurements();

		/**
		 * The meta object literal for the '<em><b>Reporting Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__REPORTING_GROUP = eINSTANCE.getPowerSystemResource_ReportingGroup();

		/**
		 * The meta object literal for the '<em><b>PSR Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__PSR_TYPE = eINSTANCE.getPowerSystemResource_PSRType();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__ASSETS = eINSTANCE.getPowerSystemResource_Assets();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES = eINSTANCE.getPowerSystemResource_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__LOCATION = eINSTANCE.getPowerSystemResource_Location();

		/**
		 * The meta object literal for the '<em><b>PSR Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__PSR_EVENT = eINSTANCE.getPowerSystemResource_PSREvent();

		/**
		 * The meta object literal for the '<em><b>Network Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS = eINSTANCE.getPowerSystemResource_NetworkDataSets();

		/**
		 * The meta object literal for the '<em><b>Outage Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE = eINSTANCE.getPowerSystemResource_OutageSchedule();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.NameTypeAuthority <em>Name Type Authority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.NameTypeAuthority
		 * @see CIM15.IEC61970.Core.CorePackage#getNameTypeAuthority()
		 * @generated
		 */
		public static final EClass NAME_TYPE_AUTHORITY = eINSTANCE.getNameTypeAuthority();

		/**
		 * The meta object literal for the '<em><b>Name Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NAME_TYPE_AUTHORITY__NAME_TYPES = eINSTANCE.getNameTypeAuthority_NameTypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NAME_TYPE_AUTHORITY__NAME = eINSTANCE.getNameTypeAuthority_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NAME_TYPE_AUTHORITY__DESCRIPTION = eINSTANCE.getNameTypeAuthority_Description();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.Equipment <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.Equipment
		 * @see CIM15.IEC61970.Core.CorePackage#getEquipment()
		 * @generated
		 */
		public static final EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Contingency Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT__CONTINGENCY_EQUIPMENT = eINSTANCE.getEquipment_ContingencyEquipment();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT__CUSTOMER_AGREEMENTS = eINSTANCE.getEquipment_CustomerAgreements();

		/**
		 * The meta object literal for the '<em><b>Normally In Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EQUIPMENT__NORMALLY_IN_SERVICE = eINSTANCE.getEquipment_NormallyInService();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EQUIPMENT__AGGREGATE = eINSTANCE.getEquipment_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Equipment Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT__EQUIPMENT_CONTAINER = eINSTANCE.getEquipment_EquipmentContainer();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.ConductingEquipment <em>Conducting Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.ConductingEquipment
		 * @see CIM15.IEC61970.Core.CorePackage#getConductingEquipment()
		 * @generated
		 */
		public static final EClass CONDUCTING_EQUIPMENT = eINSTANCE.getConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTING_EQUIPMENT__BASE_VOLTAGE = eINSTANCE.getConductingEquipment_BaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Clearance Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTING_EQUIPMENT__CLEARANCE_TAGS = eINSTANCE.getConductingEquipment_ClearanceTags();

		/**
		 * The meta object literal for the '<em><b>Protection Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS = eINSTANCE.getConductingEquipment_ProtectionEquipments();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTING_EQUIPMENT__TERMINALS = eINSTANCE.getConductingEquipment_Terminals();

		/**
		 * The meta object literal for the '<em><b>Outage Step Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES = eINSTANCE.getConductingEquipment_OutageStepRoles();

		/**
		 * The meta object literal for the '<em><b>Sv Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTING_EQUIPMENT__SV_STATUS = eINSTANCE.getConductingEquipment_SvStatus();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.RegularTimePoint <em>Regular Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.RegularTimePoint
		 * @see CIM15.IEC61970.Core.CorePackage#getRegularTimePoint()
		 * @generated
		 */
		public static final EClass REGULAR_TIME_POINT = eINSTANCE.getRegularTimePoint();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULAR_TIME_POINT__VALUE2 = eINSTANCE.getRegularTimePoint_Value2();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULAR_TIME_POINT__VALUE1 = eINSTANCE.getRegularTimePoint_Value1();

		/**
		 * The meta object literal for the '<em><b>Interval Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULAR_TIME_POINT__INTERVAL_SCHEDULE = eINSTANCE.getRegularTimePoint_IntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULAR_TIME_POINT__SEQUENCE_NUMBER = eINSTANCE.getRegularTimePoint_SequenceNumber();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.ConnectivityNode <em>Connectivity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.ConnectivityNode
		 * @see CIM15.IEC61970.Core.CorePackage#getConnectivityNode()
		 * @generated
		 */
		public static final EClass CONNECTIVITY_NODE = eINSTANCE.getConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTIVITY_NODE__TOPOLOGICAL_NODE = eINSTANCE.getConnectivityNode_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER = eINSTANCE.getConnectivityNode_ConnectivityNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTIVITY_NODE__TERMINALS = eINSTANCE.getConnectivityNode_Terminals();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.PSRType <em>PSR Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.PSRType
		 * @see CIM15.IEC61970.Core.CorePackage#getPSRType()
		 * @generated
		 */
		public static final EClass PSR_TYPE = eINSTANCE.getPSRType();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PSR_TYPE__POWER_SYSTEM_RESOURCES = eINSTANCE.getPSRType_PowerSystemResources();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer
		 * @see CIM15.IEC61970.Core.CorePackage#getConnectivityNodeContainer()
		 * @generated
		 */
		public static final EClass CONNECTIVITY_NODE_CONTAINER = eINSTANCE.getConnectivityNodeContainer();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE = eINSTANCE.getConnectivityNodeContainer_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Connectivity Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES = eINSTANCE.getConnectivityNodeContainer_ConnectivityNodes();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.Bay <em>Bay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.Bay
		 * @see CIM15.IEC61970.Core.CorePackage#getBay()
		 * @generated
		 */
		public static final EClass BAY = eINSTANCE.getBay();

		/**
		 * The meta object literal for the '<em><b>Voltage Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BAY__VOLTAGE_LEVEL = eINSTANCE.getBay_VoltageLevel();

		/**
		 * The meta object literal for the '<em><b>Bay Power Meas Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BAY__BAY_POWER_MEAS_FLAG = eINSTANCE.getBay_BayPowerMeasFlag();

		/**
		 * The meta object literal for the '<em><b>Bay Energy Meas Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BAY__BAY_ENERGY_MEAS_FLAG = eINSTANCE.getBay_BayEnergyMeasFlag();

		/**
		 * The meta object literal for the '<em><b>Bus Bar Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BAY__BUS_BAR_CONFIGURATION = eINSTANCE.getBay_BusBarConfiguration();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BAY__SUBSTATION = eINSTANCE.getBay_Substation();

		/**
		 * The meta object literal for the '<em><b>Breaker Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BAY__BREAKER_CONFIGURATION = eINSTANCE.getBay_BreakerConfiguration();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.EquipmentContainer <em>Equipment Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.EquipmentContainer
		 * @see CIM15.IEC61970.Core.CorePackage#getEquipmentContainer()
		 * @generated
		 */
		public static final EClass EQUIPMENT_CONTAINER = eINSTANCE.getEquipmentContainer();

		/**
		 * The meta object literal for the '<em><b>Equipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EQUIPMENT_CONTAINER__EQUIPMENTS = eINSTANCE.getEquipmentContainer_Equipments();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.ReportingGroup <em>Reporting Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.ReportingGroup
		 * @see CIM15.IEC61970.Core.CorePackage#getReportingGroup()
		 * @generated
		 */
		public static final EClass REPORTING_GROUP = eINSTANCE.getReportingGroup();

		/**
		 * The meta object literal for the '<em><b>Bus Name Marker</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REPORTING_GROUP__BUS_NAME_MARKER = eINSTANCE.getReportingGroup_BusNameMarker();

		/**
		 * The meta object literal for the '<em><b>Reporting Super Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REPORTING_GROUP__REPORTING_SUPER_GROUP = eINSTANCE.getReportingGroup_ReportingSuperGroup();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REPORTING_GROUP__TOPOLOGICAL_NODE = eINSTANCE.getReportingGroup_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REPORTING_GROUP__POWER_SYSTEM_RESOURCE = eINSTANCE.getReportingGroup_PowerSystemResource();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.BasePower <em>Base Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.BasePower
		 * @see CIM15.IEC61970.Core.CorePackage#getBasePower()
		 * @generated
		 */
		public static final EClass BASE_POWER = eINSTANCE.getBasePower();

		/**
		 * The meta object literal for the '<em><b>Base Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASE_POWER__BASE_POWER = eINSTANCE.getBasePower_BasePower();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.PsrList <em>Psr List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.PsrList
		 * @see CIM15.IEC61970.Core.CorePackage#getPsrList()
		 * @generated
		 */
		public static final EClass PSR_LIST = eINSTANCE.getPsrList();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PSR_LIST__POWER_SYSTEM_RESOURCES = eINSTANCE.getPsrList_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Type PSR List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PSR_LIST__TYPE_PSR_LIST = eINSTANCE.getPsrList_TypePSRList();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.IdentifiedObject
		 * @see CIM15.IEC61970.Core.CorePackage#getIdentifiedObject()
		 * @generated
		 */
		public static final EClass IDENTIFIED_OBJECT = eINSTANCE.getIdentifiedObject();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference IDENTIFIED_OBJECT__NAMES = eINSTANCE.getIdentifiedObject_Names();

		/**
		 * The meta object literal for the '<em><b>Diagram Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference IDENTIFIED_OBJECT__DIAGRAM_OBJECTS = eINSTANCE.getIdentifiedObject_DiagramObjects();

		/**
		 * The meta object literal for the '<em><b>MRID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IDENTIFIED_OBJECT__MRID = eINSTANCE.getIdentifiedObject_MRID();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IDENTIFIED_OBJECT__ALIAS_NAME = eINSTANCE.getIdentifiedObject_AliasName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IDENTIFIED_OBJECT__NAME = eINSTANCE.getIdentifiedObject_Name();

		/**
		 * The meta object literal for the '<em><b>Modeling Authority Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET = eINSTANCE.getIdentifiedObject_ModelingAuthoritySet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.BasicIntervalSchedule
		 * @see CIM15.IEC61970.Core.CorePackage#getBasicIntervalSchedule()
		 * @generated
		 */
		public static final EClass BASIC_INTERVAL_SCHEDULE = eINSTANCE.getBasicIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_INTERVAL_SCHEDULE__START_TIME = eINSTANCE.getBasicIntervalSchedule_StartTime();

		/**
		 * The meta object literal for the '<em><b>Value1 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER = eINSTANCE.getBasicIntervalSchedule_Value1Multiplier();

		/**
		 * The meta object literal for the '<em><b>Value2 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT = eINSTANCE.getBasicIntervalSchedule_Value2Unit();

		/**
		 * The meta object literal for the '<em><b>Value1 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT = eINSTANCE.getBasicIntervalSchedule_Value1Unit();

		/**
		 * The meta object literal for the '<em><b>Value2 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER = eINSTANCE.getBasicIntervalSchedule_Value2Multiplier();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.Curve <em>Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.Curve
		 * @see CIM15.IEC61970.Core.CorePackage#getCurve()
		 * @generated
		 */
		public static final EClass CURVE = eINSTANCE.getCurve();

		/**
		 * The meta object literal for the '<em><b>XUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__XUNIT = eINSTANCE.getCurve_XUnit();

		/**
		 * The meta object literal for the '<em><b>Y1 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__Y1_MULTIPLIER = eINSTANCE.getCurve_Y1Multiplier();

		/**
		 * The meta object literal for the '<em><b>Y2 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__Y2_UNIT = eINSTANCE.getCurve_Y2Unit();

		/**
		 * The meta object literal for the '<em><b>Y3 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__Y3_MULTIPLIER = eINSTANCE.getCurve_Y3Multiplier();

		/**
		 * The meta object literal for the '<em><b>Curve Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CURVE__CURVE_DATAS = eINSTANCE.getCurve_CurveDatas();

		/**
		 * The meta object literal for the '<em><b>Y1 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__Y1_UNIT = eINSTANCE.getCurve_Y1Unit();

		/**
		 * The meta object literal for the '<em><b>XMultiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__XMULTIPLIER = eINSTANCE.getCurve_XMultiplier();

		/**
		 * The meta object literal for the '<em><b>Y3 Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__Y3_UNIT = eINSTANCE.getCurve_Y3Unit();

		/**
		 * The meta object literal for the '<em><b>Y2 Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__Y2_MULTIPLIER = eINSTANCE.getCurve_Y2Multiplier();

		/**
		 * The meta object literal for the '<em><b>Curve Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE__CURVE_STYLE = eINSTANCE.getCurve_CurveStyle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.GeographicalRegion <em>Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.GeographicalRegion
		 * @see CIM15.IEC61970.Core.CorePackage#getGeographicalRegion()
		 * @generated
		 */
		public static final EClass GEOGRAPHICAL_REGION = eINSTANCE.getGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GEOGRAPHICAL_REGION__REGIONS = eINSTANCE.getGeographicalRegion_Regions();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.CurveData <em>Curve Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.CurveData
		 * @see CIM15.IEC61970.Core.CorePackage#getCurveData()
		 * @generated
		 */
		public static final EClass CURVE_DATA = eINSTANCE.getCurveData();

		/**
		 * The meta object literal for the '<em><b>Y3value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE_DATA__Y3VALUE = eINSTANCE.getCurveData_Y3value();

		/**
		 * The meta object literal for the '<em><b>Xvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE_DATA__XVALUE = eINSTANCE.getCurveData_Xvalue();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CURVE_DATA__CURVE = eINSTANCE.getCurveData_Curve();

		/**
		 * The meta object literal for the '<em><b>Y2value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE_DATA__Y2VALUE = eINSTANCE.getCurveData_Y2value();

		/**
		 * The meta object literal for the '<em><b>Y1value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURVE_DATA__Y1VALUE = eINSTANCE.getCurveData_Y1value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.SubGeographicalRegion <em>Sub Geographical Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.SubGeographicalRegion
		 * @see CIM15.IEC61970.Core.CorePackage#getSubGeographicalRegion()
		 * @generated
		 */
		public static final EClass SUB_GEOGRAPHICAL_REGION = eINSTANCE.getSubGeographicalRegion();

		/**
		 * The meta object literal for the '<em><b>Substations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUB_GEOGRAPHICAL_REGION__SUBSTATIONS = eINSTANCE.getSubGeographicalRegion_Substations();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUB_GEOGRAPHICAL_REGION__LINES = eINSTANCE.getSubGeographicalRegion_Lines();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUB_GEOGRAPHICAL_REGION__REGION = eINSTANCE.getSubGeographicalRegion_Region();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.NameType <em>Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.NameType
		 * @see CIM15.IEC61970.Core.CorePackage#getNameType()
		 * @generated
		 */
		public static final EClass NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NAME_TYPE__NAME = eINSTANCE.getNameType_Name();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NAME_TYPE__NAMES = eINSTANCE.getNameType_Names();

		/**
		 * The meta object literal for the '<em><b>Name Type Authority</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NAME_TYPE__NAME_TYPE_AUTHORITY = eINSTANCE.getNameType_NameTypeAuthority();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NAME_TYPE__DESCRIPTION = eINSTANCE.getNameType_Description();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.Substation <em>Substation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.Substation
		 * @see CIM15.IEC61970.Core.CorePackage#getSubstation()
		 * @generated
		 */
		public static final EClass SUBSTATION = eINSTANCE.getSubstation();

		/**
		 * The meta object literal for the '<em><b>Bays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUBSTATION__BAYS = eINSTANCE.getSubstation_Bays();

		/**
		 * The meta object literal for the '<em><b>Voltage Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUBSTATION__VOLTAGE_LEVELS = eINSTANCE.getSubstation_VoltageLevels();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUBSTATION__REGION = eINSTANCE.getSubstation_Region();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.Name <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.Name
		 * @see CIM15.IEC61970.Core.CorePackage#getName_()
		 * @generated
		 */
		public static final EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NAME__NAME = eINSTANCE.getName_Name();

		/**
		 * The meta object literal for the '<em><b>Name Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NAME__NAME_TYPE = eINSTANCE.getName_NameType();

		/**
		 * The meta object literal for the '<em><b>Identified Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NAME__IDENTIFIED_OBJECT = eINSTANCE.getName_IdentifiedObject();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.BaseVoltage <em>Base Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.BaseVoltage
		 * @see CIM15.IEC61970.Core.CorePackage#getBaseVoltage()
		 * @generated
		 */
		public static final EClass BASE_VOLTAGE = eINSTANCE.getBaseVoltage();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BASE_VOLTAGE__TOPOLOGICAL_NODE = eINSTANCE.getBaseVoltage_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASE_VOLTAGE__NOMINAL_VOLTAGE = eINSTANCE.getBaseVoltage_NominalVoltage();

		/**
		 * The meta object literal for the '<em><b>Is DC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASE_VOLTAGE__IS_DC = eINSTANCE.getBaseVoltage_IsDC();

		/**
		 * The meta object literal for the '<em><b>Voltage Level</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BASE_VOLTAGE__VOLTAGE_LEVEL = eINSTANCE.getBaseVoltage_VoltageLevel();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BASE_VOLTAGE__CONDUCTING_EQUIPMENT = eINSTANCE.getBaseVoltage_ConductingEquipment();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.Terminal <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.Terminal
		 * @see CIM15.IEC61970.Core.CorePackage#getTerminal()
		 * @generated
		 */
		public static final EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Bushing Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__BUSHING_INFO = eINSTANCE.getTerminal_BushingInfo();

		/**
		 * The meta object literal for the '<em><b>Tie Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__TIE_FLOW = eINSTANCE.getTerminal_TieFlow();

		/**
		 * The meta object literal for the '<em><b>Has Second Mutual Coupling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__HAS_SECOND_MUTUAL_COUPLING = eINSTANCE.getTerminal_HasSecond_MutualCoupling();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TERMINAL__PHASES = eINSTANCE.getTerminal_Phases();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__OPERATIONAL_LIMIT_SET = eINSTANCE.getTerminal_OperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__MEASUREMENTS = eINSTANCE.getTerminal_Measurements();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TERMINAL__CONNECTED = eINSTANCE.getTerminal_Connected();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__CONDUCTING_EQUIPMENT = eINSTANCE.getTerminal_ConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>Regulating Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__REGULATING_CONTROL = eINSTANCE.getTerminal_RegulatingControl();

		/**
		 * The meta object literal for the '<em><b>Has First Mutual Coupling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__HAS_FIRST_MUTUAL_COUPLING = eINSTANCE.getTerminal_HasFirst_MutualCoupling();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Equipment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__AUXILIARY_EQUIPMENT = eINSTANCE.getTerminal_AuxiliaryEquipment();

		/**
		 * The meta object literal for the '<em><b>Transformer End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__TRANSFORMER_END = eINSTANCE.getTerminal_TransformerEnd();

		/**
		 * The meta object literal for the '<em><b>Connectivity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__CONNECTIVITY_NODE = eINSTANCE.getTerminal_ConnectivityNode();

		/**
		 * The meta object literal for the '<em><b>Branch Group Terminal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__BRANCH_GROUP_TERMINAL = eINSTANCE.getTerminal_BranchGroupTerminal();

		/**
		 * The meta object literal for the '<em><b>Bus Name Marker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__BUS_NAME_MARKER = eINSTANCE.getTerminal_BusNameMarker();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TERMINAL__SEQUENCE_NUMBER = eINSTANCE.getTerminal_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Sv Power Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__SV_POWER_FLOW = eINSTANCE.getTerminal_SvPowerFlow();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TERMINAL__TOPOLOGICAL_NODE = eINSTANCE.getTerminal_TopologicalNode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.IrregularIntervalSchedule <em>Irregular Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.IrregularIntervalSchedule
		 * @see CIM15.IEC61970.Core.CorePackage#getIrregularIntervalSchedule()
		 * @generated
		 */
		public static final EClass IRREGULAR_INTERVAL_SCHEDULE = eINSTANCE.getIrregularIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS = eINSTANCE.getIrregularIntervalSchedule_TimePoints();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.RegularIntervalSchedule
		 * @see CIM15.IEC61970.Core.CorePackage#getRegularIntervalSchedule()
		 * @generated
		 */
		public static final EClass REGULAR_INTERVAL_SCHEDULE = eINSTANCE.getRegularIntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULAR_INTERVAL_SCHEDULE__END_TIME = eINSTANCE.getRegularIntervalSchedule_EndTime();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGULAR_INTERVAL_SCHEDULE__TIME_STEP = eINSTANCE.getRegularIntervalSchedule_TimeStep();

		/**
		 * The meta object literal for the '<em><b>Time Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGULAR_INTERVAL_SCHEDULE__TIME_POINTS = eINSTANCE.getRegularIntervalSchedule_TimePoints();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.OperatingParticipant <em>Operating Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.OperatingParticipant
		 * @see CIM15.IEC61970.Core.CorePackage#getOperatingParticipant()
		 * @generated
		 */
		public static final EClass OPERATING_PARTICIPANT = eINSTANCE.getOperatingParticipant();

		/**
		 * The meta object literal for the '<em><b>Operating Share</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATING_PARTICIPANT__OPERATING_SHARE = eINSTANCE.getOperatingParticipant_OperatingShare();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.OperatingShare <em>Operating Share</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.OperatingShare
		 * @see CIM15.IEC61970.Core.CorePackage#getOperatingShare()
		 * @generated
		 */
		public static final EClass OPERATING_SHARE = eINSTANCE.getOperatingShare();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATING_SHARE__POWER_SYSTEM_RESOURCE = eINSTANCE.getOperatingShare_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Operating Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATING_SHARE__OPERATING_PARTICIPANT = eINSTANCE.getOperatingShare_OperatingParticipant();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATING_SHARE__PERCENTAGE = eINSTANCE.getOperatingShare_Percentage();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.VoltageLevel <em>Voltage Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.VoltageLevel
		 * @see CIM15.IEC61970.Core.CorePackage#getVoltageLevel()
		 * @generated
		 */
		public static final EClass VOLTAGE_LEVEL = eINSTANCE.getVoltageLevel();

		/**
		 * The meta object literal for the '<em><b>High Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT = eINSTANCE.getVoltageLevel_HighVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Bays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_LEVEL__BAYS = eINSTANCE.getVoltageLevel_Bays();

		/**
		 * The meta object literal for the '<em><b>Substation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_LEVEL__SUBSTATION = eINSTANCE.getVoltageLevel_Substation();

		/**
		 * The meta object literal for the '<em><b>Low Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT = eINSTANCE.getVoltageLevel_LowVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Base Voltage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_LEVEL__BASE_VOLTAGE = eINSTANCE.getVoltageLevel_BaseVoltage();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.ReportingSuperGroup <em>Reporting Super Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.ReportingSuperGroup
		 * @see CIM15.IEC61970.Core.CorePackage#getReportingSuperGroup()
		 * @generated
		 */
		public static final EClass REPORTING_SUPER_GROUP = eINSTANCE.getReportingSuperGroup();

		/**
		 * The meta object literal for the '<em><b>Reporting Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REPORTING_SUPER_GROUP__REPORTING_GROUP = eINSTANCE.getReportingSuperGroup_ReportingGroup();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.IrregularTimePoint <em>Irregular Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.IrregularTimePoint
		 * @see CIM15.IEC61970.Core.CorePackage#getIrregularTimePoint()
		 * @generated
		 */
		public static final EClass IRREGULAR_TIME_POINT = eINSTANCE.getIrregularTimePoint();

		/**
		 * The meta object literal for the '<em><b>Interval Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE = eINSTANCE.getIrregularTimePoint_IntervalSchedule();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IRREGULAR_TIME_POINT__TIME = eINSTANCE.getIrregularTimePoint_Time();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IRREGULAR_TIME_POINT__VALUE1 = eINSTANCE.getIrregularTimePoint_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IRREGULAR_TIME_POINT__VALUE2 = eINSTANCE.getIrregularTimePoint_Value2();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.BreakerConfiguration <em>Breaker Configuration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.BreakerConfiguration
		 * @see CIM15.IEC61970.Core.CorePackage#getBreakerConfiguration()
		 * @generated
		 */
		public static final EEnum BREAKER_CONFIGURATION = eINSTANCE.getBreakerConfiguration();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.CompanyType <em>Company Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.CompanyType
		 * @see CIM15.IEC61970.Core.CorePackage#getCompanyType()
		 * @generated
		 */
		public static final EEnum COMPANY_TYPE = eINSTANCE.getCompanyType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.PhaseCode <em>Phase Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.PhaseCode
		 * @see CIM15.IEC61970.Core.CorePackage#getPhaseCode()
		 * @generated
		 */
		public static final EEnum PHASE_CODE = eINSTANCE.getPhaseCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.CurveStyle <em>Curve Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.CurveStyle
		 * @see CIM15.IEC61970.Core.CorePackage#getCurveStyle()
		 * @generated
		 */
		public static final EEnum CURVE_STYLE = eINSTANCE.getCurveStyle();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Core.BusbarConfiguration <em>Busbar Configuration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Core.BusbarConfiguration
		 * @see CIM15.IEC61970.Core.CorePackage#getBusbarConfiguration()
		 * @generated
		 */
		public static final EEnum BUSBAR_CONFIGURATION = eINSTANCE.getBusbarConfiguration();

	}

} //CorePackage
