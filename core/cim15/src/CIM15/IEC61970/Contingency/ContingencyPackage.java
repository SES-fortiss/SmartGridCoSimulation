/**
 */
package CIM15.IEC61970.Contingency;

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
 * @see CIM15.IEC61970.Contingency.ContingencyFactory
 * @generated
 */
public class ContingencyPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Contingency";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Contingency";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimContingency";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ContingencyPackage eINSTANCE = CIM15.IEC61970.Contingency.ContingencyPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Contingency.ContingencyElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Contingency.ContingencyElement
	 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingencyElement()
	 * @generated
	 */
	public static final int CONTINGENCY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Contingency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT__CONTINGENCY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_ELEMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Contingency.ContingencyEquipment <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipment
	 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingencyEquipment()
	 * @generated
	 */
	public static final int CONTINGENCY_EQUIPMENT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__UUID = CONTINGENCY_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__NAMES = CONTINGENCY_ELEMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__DIAGRAM_OBJECTS = CONTINGENCY_ELEMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__MRID = CONTINGENCY_ELEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__ALIAS_NAME = CONTINGENCY_ELEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__NAME = CONTINGENCY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__MODELING_AUTHORITY_SET = CONTINGENCY_ELEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Contingency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__CONTINGENCY = CONTINGENCY_ELEMENT__CONTINGENCY;

	/**
	 * The feature id for the '<em><b>Contingent Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS = CONTINGENCY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT__EQUIPMENT = CONTINGENCY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT_FEATURE_COUNT = CONTINGENCY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_EQUIPMENT_OPERATION_COUNT = CONTINGENCY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Contingency.Contingency <em>Contingency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Contingency.Contingency
	 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingency()
	 * @generated
	 */
	public static final int CONTINGENCY = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Must Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__MUST_STUDY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contingency Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY__CONTINGENCY_ELEMENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contingency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contingency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTINGENCY_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind <em>Equipment Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingencyEquipmentStatusKind()
	 * @generated
	 */
	public static final int CONTINGENCY_EQUIPMENT_STATUS_KIND = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contingencyEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contingencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contingencyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contingencyEquipmentStatusKindEEnum = null;

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
	 * @see CIM15.IEC61970.Contingency.ContingencyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContingencyPackage() {
		super(eNS_URI, ContingencyFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link ContingencyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ContingencyPackage init() {
		if (isInited) return (ContingencyPackage)EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI);

		// Obtain or create and register package
		ContingencyPackage theContingencyPackage = (ContingencyPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContingencyPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContingencyPackage());

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
		theContingencyPackage.fixPackageContents();
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
		theContingencyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContingencyPackage.eNS_URI, theContingencyPackage);
		return theContingencyPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Contingency.ContingencyEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipment
	 * @generated
	 */
	public EClass getContingencyEquipment() {
		if (contingencyEquipmentEClass == null) {
			contingencyEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI).getEClassifiers().get(0);
		}
		return contingencyEquipmentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contingent Status</em>'.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipment#getContingentStatus()
	 * @see #getContingencyEquipment()
	 * @generated
	 */
	public EAttribute getContingencyEquipment_ContingentStatus() {
        return (EAttribute)getContingencyEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipment</em>'.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipment#getEquipment()
	 * @see #getContingencyEquipment()
	 * @generated
	 */
	public EReference getContingencyEquipment_Equipment() {
        return (EReference)getContingencyEquipment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Contingency.Contingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contingency</em>'.
	 * @see CIM15.IEC61970.Contingency.Contingency
	 * @generated
	 */
	public EClass getContingency() {
		if (contingencyEClass == null) {
			contingencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI).getEClassifiers().get(2);
		}
		return contingencyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Study</em>'.
	 * @see CIM15.IEC61970.Contingency.Contingency#isMustStudy()
	 * @see #getContingency()
	 * @generated
	 */
	public EAttribute getContingency_MustStudy() {
        return (EAttribute)getContingency().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Contingency.Contingency#getContingencyElement <em>Contingency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contingency Element</em>'.
	 * @see CIM15.IEC61970.Contingency.Contingency#getContingencyElement()
	 * @see #getContingency()
	 * @generated
	 */
	public EReference getContingency_ContingencyElement() {
        return (EReference)getContingency().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Contingency.ContingencyElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CIM15.IEC61970.Contingency.ContingencyElement
	 * @generated
	 */
	public EClass getContingencyElement() {
		if (contingencyElementEClass == null) {
			contingencyElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI).getEClassifiers().get(3);
		}
		return contingencyElementEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contingency</em>'.
	 * @see CIM15.IEC61970.Contingency.ContingencyElement#getContingency()
	 * @see #getContingencyElement()
	 * @generated
	 */
	public EReference getContingencyElement_Contingency() {
        return (EReference)getContingencyElement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind <em>Equipment Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Equipment Status Kind</em>'.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @generated
	 */
	public EEnum getContingencyEquipmentStatusKind() {
		if (contingencyEquipmentStatusKindEEnum == null) {
			contingencyEquipmentStatusKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI).getEClassifiers().get(1);
		}
		return contingencyEquipmentStatusKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ContingencyFactory getContingencyFactory() {
		return (ContingencyFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Contingency." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Contingency.ContingencyEquipment <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Contingency.ContingencyEquipment
		 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingencyEquipment()
		 * @generated
		 */
		public static final EClass CONTINGENCY_EQUIPMENT = eINSTANCE.getContingencyEquipment();

		/**
		 * The meta object literal for the '<em><b>Contingent Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS = eINSTANCE.getContingencyEquipment_ContingentStatus();

		/**
		 * The meta object literal for the '<em><b>Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTINGENCY_EQUIPMENT__EQUIPMENT = eINSTANCE.getContingencyEquipment_Equipment();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Contingency.Contingency <em>Contingency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Contingency.Contingency
		 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingency()
		 * @generated
		 */
		public static final EClass CONTINGENCY = eINSTANCE.getContingency();

		/**
		 * The meta object literal for the '<em><b>Must Study</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTINGENCY__MUST_STUDY = eINSTANCE.getContingency_MustStudy();

		/**
		 * The meta object literal for the '<em><b>Contingency Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTINGENCY__CONTINGENCY_ELEMENT = eINSTANCE.getContingency_ContingencyElement();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Contingency.ContingencyElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Contingency.ContingencyElement
		 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingencyElement()
		 * @generated
		 */
		public static final EClass CONTINGENCY_ELEMENT = eINSTANCE.getContingencyElement();

		/**
		 * The meta object literal for the '<em><b>Contingency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTINGENCY_ELEMENT__CONTINGENCY = eINSTANCE.getContingencyElement_Contingency();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind <em>Equipment Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind
		 * @see CIM15.IEC61970.Contingency.ContingencyPackage#getContingencyEquipmentStatusKind()
		 * @generated
		 */
		public static final EEnum CONTINGENCY_EQUIPMENT_STATUS_KIND = eINSTANCE.getContingencyEquipmentStatusKind();

	}

} //ContingencyPackage
