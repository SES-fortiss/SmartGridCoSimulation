/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfAssetsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfAssetsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfAssetsFactory INSTANCE = CIM15.IEC61970.Informative.InfAssets.InfAssetsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfAssetsFactory init() {
		try {
			InfAssetsFactory theInfAssetsFactory = (InfAssetsFactory)EPackage.Registry.INSTANCE.getEFactory(InfAssetsPackage.eNS_URI);
			if (theInfAssetsFactory != null) {
				return theInfAssetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfAssetsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfAssetsPackage.FACTS_DEVICE: return createFACTSDevice();
			case InfAssetsPackage.DOC_ASSET_ROLE: return createDocAssetRole();
			case InfAssetsPackage.DUCT_BANK: return createDuctBank();
			case InfAssetsPackage.CONDUCTOR_ASSET: return createConductorAsset();
			case InfAssetsPackage.FINANCIAL_INFO: return createFinancialInfo();
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO: return createProtectionEquipmentInfo();
			case InfAssetsPackage.PROCEDURE_DATA_SET: return createProcedureDataSet();
			case InfAssetsPackage.WINDING_INSULATION: return createWindingInsulation();
			case InfAssetsPackage.SPECIFICATION: return createSpecification();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE: return createUndergroundStructure();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO: return createPotentialTransformerInfo();
			case InfAssetsPackage.STRUCTURE: return createStructure();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO: return createCurrentTransformerInfo();
			case InfAssetsPackage.BUSHING_INSULATION_PF: return createBushingInsulationPF();
			case InfAssetsPackage.JOINT: return createJoint();
			case InfAssetsPackage.ELECTRICAL_INFO: return createElectricalInfo();
			case InfAssetsPackage.WORK_EQUIPMENT: return createWorkEquipment();
			case InfAssetsPackage.FAULT_INDICATOR_INFO: return createFaultIndicatorInfo();
			case InfAssetsPackage.DUCT: return createDuct();
			case InfAssetsPackage.POWER_RATING: return createPowerRating();
			case InfAssetsPackage.ASSET_ASSET_ROLE: return createAssetAssetRole();
			case InfAssetsPackage.TRANSFORMER_ASSET: return createTransformerAsset();
			case InfAssetsPackage.PROCEDURE: return createProcedure();
			case InfAssetsPackage.BREAKER_INFO: return createBreakerInfo();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO: return createCompositeSwitchInfo();
			case InfAssetsPackage.CABINET: return createCabinet();
			case InfAssetsPackage.BUSHING: return createBushing();
			case InfAssetsPackage.VEHICLE: return createVehicle();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO: return createSurgeProtectorInfo();
			case InfAssetsPackage.STRUCTURE_SUPPORT: return createStructureSupport();
			case InfAssetsPackage.COM_EQUIPMENT: return createComEquipment();
			case InfAssetsPackage.ASSET_PROPERTY_CURVE: return createAssetPropertyCurve();
			case InfAssetsPackage.FAILURE_EVENT: return createFailureEvent();
			case InfAssetsPackage.DIMENSIONS_INFO: return createDimensionsInfo();
			case InfAssetsPackage.TOWER: return createTower();
			case InfAssetsPackage.MOUNTING_CONNECTION: return createMountingConnection();
			case InfAssetsPackage.MEDIUM: return createMedium();
			case InfAssetsPackage.RECLOSER_INFO: return createRecloserInfo();
			case InfAssetsPackage.FACILITY: return createFacility();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO: return createShuntImpedanceInfo();
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO: return createShuntCompensatorInfo();
			case InfAssetsPackage.MOUNTING_POINT: return createMountingPoint();
			case InfAssetsPackage.SUBSTATION_ASSET: return createSubstationAsset();
			case InfAssetsPackage.STREETLIGHT: return createStreetlight();
			case InfAssetsPackage.TOOL: return createTool();
			case InfAssetsPackage.SVC: return createSVC();
			case InfAssetsPackage.ORG_ASSET_ROLE: return createOrgAssetRole();
			case InfAssetsPackage.TEST_DATA_SET: return createTestDataSet();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL: return createGenericAssetModelOrMaterial();
			case InfAssetsPackage.RELIABILITY_INFO: return createReliabilityInfo();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION: return createTransformerObservation();
			case InfAssetsPackage.POLE: return createPole();
			case InfAssetsPackage.SWITCH_INFO: return createSwitchInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfAssetsPackage.ANCHOR_KIND:
				return createAnchorKindFromString(eDataType, initialValue);
			case InfAssetsPackage.TOWER_CONSTRUCTION_KIND:
				return createTowerConstructionKindFromString(eDataType, initialValue);
			case InfAssetsPackage.PROCEDURE_KIND:
				return createProcedureKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FACILITY_KIND:
				return createFacilityKindFromString(eDataType, initialValue);
			case InfAssetsPackage.MEDIUM_KIND:
				return createMediumKindFromString(eDataType, initialValue);
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_KIND:
				return createUndergroundStructureKindFromString(eDataType, initialValue);
			case InfAssetsPackage.POLE_PRESERVATIVE_KIND:
				return createPolePreservativeKindFromString(eDataType, initialValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_LOCAL_CONTROL_KIND:
				return createShuntImpedanceLocalControlKindFromString(eDataType, initialValue);
			case InfAssetsPackage.COOLING_KIND:
				return createCoolingKindFromString(eDataType, initialValue);
			case InfAssetsPackage.REGULATION_BRANCH_KIND:
				return createRegulationBranchKindFromString(eDataType, initialValue);
			case InfAssetsPackage.VEHICLE_USAGE_KIND:
				return createVehicleUsageKindFromString(eDataType, initialValue);
			case InfAssetsPackage.SUBSTATION_FUNCTION_KIND:
				return createSubstationFunctionKindFromString(eDataType, initialValue);
			case InfAssetsPackage.JOINT_FILL_KIND:
				return createJointFillKindFromString(eDataType, initialValue);
			case InfAssetsPackage.BUSHING_INSULATION_PF_TEST_KIND:
				return createBushingInsulationPfTestKindFromString(eDataType, initialValue);
			case InfAssetsPackage.POLE_TREATMENT_KIND:
				return createPoleTreatmentKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FAULT_INDICATOR_RESET_KIND:
				return createFaultIndicatorResetKindFromString(eDataType, initialValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_CONTROL_KIND:
				return createShuntImpedanceControlKindFromString(eDataType, initialValue);
			case InfAssetsPackage.JOINT_CONFIGURATION_KIND:
				return createJointConfigurationKindFromString(eDataType, initialValue);
			case InfAssetsPackage.POLE_BASE_KIND:
				return createPoleBaseKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FACTS_DEVICE_KIND:
				return createFACTSDeviceKindFromString(eDataType, initialValue);
			case InfAssetsPackage.STRUCTURE_SUPPORT_KIND:
				return createStructureSupportKindFromString(eDataType, initialValue);
			case InfAssetsPackage.BUSHING_INSULATION_KIND:
				return createBushingInsulationKindFromString(eDataType, initialValue);
			case InfAssetsPackage.STRUCTURE_MATERIAL_KIND:
				return createStructureMaterialKindFromString(eDataType, initialValue);
			case InfAssetsPackage.STREETLIGHT_LAMP_KIND:
				return createStreetlightLampKindFromString(eDataType, initialValue);
			case InfAssetsPackage.COMPOSITE_SWITCH_KIND:
				return createCompositeSwitchKindFromString(eDataType, initialValue);
			case InfAssetsPackage.FAILURE_ISOLATION_METHOD_KIND:
				return createFailureIsolationMethodKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfAssetsPackage.ANCHOR_KIND:
				return convertAnchorKindToString(eDataType, instanceValue);
			case InfAssetsPackage.TOWER_CONSTRUCTION_KIND:
				return convertTowerConstructionKindToString(eDataType, instanceValue);
			case InfAssetsPackage.PROCEDURE_KIND:
				return convertProcedureKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FACILITY_KIND:
				return convertFacilityKindToString(eDataType, instanceValue);
			case InfAssetsPackage.MEDIUM_KIND:
				return convertMediumKindToString(eDataType, instanceValue);
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_KIND:
				return convertUndergroundStructureKindToString(eDataType, instanceValue);
			case InfAssetsPackage.POLE_PRESERVATIVE_KIND:
				return convertPolePreservativeKindToString(eDataType, instanceValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_LOCAL_CONTROL_KIND:
				return convertShuntImpedanceLocalControlKindToString(eDataType, instanceValue);
			case InfAssetsPackage.COOLING_KIND:
				return convertCoolingKindToString(eDataType, instanceValue);
			case InfAssetsPackage.REGULATION_BRANCH_KIND:
				return convertRegulationBranchKindToString(eDataType, instanceValue);
			case InfAssetsPackage.VEHICLE_USAGE_KIND:
				return convertVehicleUsageKindToString(eDataType, instanceValue);
			case InfAssetsPackage.SUBSTATION_FUNCTION_KIND:
				return convertSubstationFunctionKindToString(eDataType, instanceValue);
			case InfAssetsPackage.JOINT_FILL_KIND:
				return convertJointFillKindToString(eDataType, instanceValue);
			case InfAssetsPackage.BUSHING_INSULATION_PF_TEST_KIND:
				return convertBushingInsulationPfTestKindToString(eDataType, instanceValue);
			case InfAssetsPackage.POLE_TREATMENT_KIND:
				return convertPoleTreatmentKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FAULT_INDICATOR_RESET_KIND:
				return convertFaultIndicatorResetKindToString(eDataType, instanceValue);
			case InfAssetsPackage.SHUNT_IMPEDANCE_CONTROL_KIND:
				return convertShuntImpedanceControlKindToString(eDataType, instanceValue);
			case InfAssetsPackage.JOINT_CONFIGURATION_KIND:
				return convertJointConfigurationKindToString(eDataType, instanceValue);
			case InfAssetsPackage.POLE_BASE_KIND:
				return convertPoleBaseKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FACTS_DEVICE_KIND:
				return convertFACTSDeviceKindToString(eDataType, instanceValue);
			case InfAssetsPackage.STRUCTURE_SUPPORT_KIND:
				return convertStructureSupportKindToString(eDataType, instanceValue);
			case InfAssetsPackage.BUSHING_INSULATION_KIND:
				return convertBushingInsulationKindToString(eDataType, instanceValue);
			case InfAssetsPackage.STRUCTURE_MATERIAL_KIND:
				return convertStructureMaterialKindToString(eDataType, instanceValue);
			case InfAssetsPackage.STREETLIGHT_LAMP_KIND:
				return convertStreetlightLampKindToString(eDataType, instanceValue);
			case InfAssetsPackage.COMPOSITE_SWITCH_KIND:
				return convertCompositeSwitchKindToString(eDataType, instanceValue);
			case InfAssetsPackage.FAILURE_ISOLATION_METHOD_KIND:
				return convertFailureIsolationMethodKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FACTSDevice createFACTSDevice() {
		FACTSDevice factsDevice = new FACTSDevice();
		return factsDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocAssetRole createDocAssetRole() {
		DocAssetRole docAssetRole = new DocAssetRole();
		return docAssetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctBank createDuctBank() {
		DuctBank ductBank = new DuctBank();
		return ductBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorAsset createConductorAsset() {
		ConductorAsset conductorAsset = new ConductorAsset();
		return conductorAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialInfo createFinancialInfo() {
		FinancialInfo financialInfo = new FinancialInfo();
		return financialInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionEquipmentInfo createProtectionEquipmentInfo() {
		ProtectionEquipmentInfo protectionEquipmentInfo = new ProtectionEquipmentInfo();
		return protectionEquipmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDataSet createProcedureDataSet() {
		ProcedureDataSet procedureDataSet = new ProcedureDataSet();
		return procedureDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInsulation createWindingInsulation() {
		WindingInsulation windingInsulation = new WindingInsulation();
		return windingInsulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		Specification specification = new Specification();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndergroundStructure createUndergroundStructure() {
		UndergroundStructure undergroundStructure = new UndergroundStructure();
		return undergroundStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialTransformerInfo createPotentialTransformerInfo() {
		PotentialTransformerInfo potentialTransformerInfo = new PotentialTransformerInfo();
		return potentialTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		Structure structure = new Structure();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTransformerInfo createCurrentTransformerInfo() {
		CurrentTransformerInfo currentTransformerInfo = new CurrentTransformerInfo();
		return currentTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationPF createBushingInsulationPF() {
		BushingInsulationPF bushingInsulationPF = new BushingInsulationPF();
		return bushingInsulationPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint createJoint() {
		Joint joint = new Joint();
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalInfo createElectricalInfo() {
		ElectricalInfo electricalInfo = new ElectricalInfo();
		return electricalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEquipment createWorkEquipment() {
		WorkEquipment workEquipment = new WorkEquipment();
		return workEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicatorInfo createFaultIndicatorInfo() {
		FaultIndicatorInfo faultIndicatorInfo = new FaultIndicatorInfo();
		return faultIndicatorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duct createDuct() {
		Duct duct = new Duct();
		return duct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRating createPowerRating() {
		PowerRating powerRating = new PowerRating();
		return powerRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetAssetRole createAssetAssetRole() {
		AssetAssetRole assetAssetRole = new AssetAssetRole();
		return assetAssetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAsset createTransformerAsset() {
		TransformerAsset transformerAsset = new TransformerAsset();
		return transformerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		Procedure procedure = new Procedure();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakerInfo createBreakerInfo() {
		BreakerInfo breakerInfo = new BreakerInfo();
		return breakerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitchInfo createCompositeSwitchInfo() {
		CompositeSwitchInfo compositeSwitchInfo = new CompositeSwitchInfo();
		return compositeSwitchInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cabinet createCabinet() {
		Cabinet cabinet = new Cabinet();
		return cabinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bushing createBushing() {
		Bushing bushing = new Bushing();
		return bushing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle createVehicle() {
		Vehicle vehicle = new Vehicle();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeProtectorInfo createSurgeProtectorInfo() {
		SurgeProtectorInfo surgeProtectorInfo = new SurgeProtectorInfo();
		return surgeProtectorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSupport createStructureSupport() {
		StructureSupport structureSupport = new StructureSupport();
		return structureSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComEquipment createComEquipment() {
		ComEquipment comEquipment = new ComEquipment();
		return comEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetPropertyCurve createAssetPropertyCurve() {
		AssetPropertyCurve assetPropertyCurve = new AssetPropertyCurve();
		return assetPropertyCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureEvent createFailureEvent() {
		FailureEvent failureEvent = new FailureEvent();
		return failureEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo createDimensionsInfo() {
		DimensionsInfo dimensionsInfo = new DimensionsInfo();
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tower createTower() {
		Tower tower = new Tower();
		return tower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingConnection createMountingConnection() {
		MountingConnection mountingConnection = new MountingConnection();
		return mountingConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium createMedium() {
		Medium medium = new Medium();
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecloserInfo createRecloserInfo() {
		RecloserInfo recloserInfo = new RecloserInfo();
		return recloserInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility createFacility() {
		Facility facility = new Facility();
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceInfo createShuntImpedanceInfo() {
		ShuntImpedanceInfo shuntImpedanceInfo = new ShuntImpedanceInfo();
		return shuntImpedanceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensatorInfo createShuntCompensatorInfo() {
		ShuntCompensatorInfo shuntCompensatorInfo = new ShuntCompensatorInfo();
		return shuntCompensatorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingPoint createMountingPoint() {
		MountingPoint mountingPoint = new MountingPoint();
		return mountingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationAsset createSubstationAsset() {
		SubstationAsset substationAsset = new SubstationAsset();
		return substationAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Streetlight createStreetlight() {
		Streetlight streetlight = new Streetlight();
		return streetlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		Tool tool = new Tool();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVC createSVC() {
		SVC svc = new SVC();
		return svc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgAssetRole createOrgAssetRole() {
		OrgAssetRole orgAssetRole = new OrgAssetRole();
		return orgAssetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDataSet createTestDataSet() {
		TestDataSet testDataSet = new TestDataSet();
		return testDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAssetModelOrMaterial createGenericAssetModelOrMaterial() {
		GenericAssetModelOrMaterial genericAssetModelOrMaterial = new GenericAssetModelOrMaterial();
		return genericAssetModelOrMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityInfo createReliabilityInfo() {
		ReliabilityInfo reliabilityInfo = new ReliabilityInfo();
		return reliabilityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation createTransformerObservation() {
		TransformerObservation transformerObservation = new TransformerObservation();
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pole createPole() {
		Pole pole = new Pole();
		return pole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchInfo createSwitchInfo() {
		SwitchInfo switchInfo = new SwitchInfo();
		return switchInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorKind createAnchorKindFromString(EDataType eDataType, String initialValue) {
		AnchorKind result = AnchorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnchorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TowerConstructionKind createTowerConstructionKindFromString(EDataType eDataType, String initialValue) {
		TowerConstructionKind result = TowerConstructionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTowerConstructionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureKind createProcedureKindFromString(EDataType eDataType, String initialValue) {
		ProcedureKind result = ProcedureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcedureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityKind createFacilityKindFromString(EDataType eDataType, String initialValue) {
		FacilityKind result = FacilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumKind createMediumKindFromString(EDataType eDataType, String initialValue) {
		MediumKind result = MediumKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediumKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndergroundStructureKind createUndergroundStructureKindFromString(EDataType eDataType, String initialValue) {
		UndergroundStructureKind result = UndergroundStructureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUndergroundStructureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolePreservativeKind createPolePreservativeKindFromString(EDataType eDataType, String initialValue) {
		PolePreservativeKind result = PolePreservativeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolePreservativeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceLocalControlKind createShuntImpedanceLocalControlKindFromString(EDataType eDataType, String initialValue) {
		ShuntImpedanceLocalControlKind result = ShuntImpedanceLocalControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShuntImpedanceLocalControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoolingKind createCoolingKindFromString(EDataType eDataType, String initialValue) {
		CoolingKind result = CoolingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoolingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationBranchKind createRegulationBranchKindFromString(EDataType eDataType, String initialValue) {
		RegulationBranchKind result = RegulationBranchKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegulationBranchKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleUsageKind createVehicleUsageKindFromString(EDataType eDataType, String initialValue) {
		VehicleUsageKind result = VehicleUsageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleUsageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstationFunctionKind createSubstationFunctionKindFromString(EDataType eDataType, String initialValue) {
		SubstationFunctionKind result = SubstationFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstationFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointFillKind createJointFillKindFromString(EDataType eDataType, String initialValue) {
		JointFillKind result = JointFillKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointFillKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationPfTestKind createBushingInsulationPfTestKindFromString(EDataType eDataType, String initialValue) {
		BushingInsulationPfTestKind result = BushingInsulationPfTestKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBushingInsulationPfTestKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleTreatmentKind createPoleTreatmentKindFromString(EDataType eDataType, String initialValue) {
		PoleTreatmentKind result = PoleTreatmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoleTreatmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicatorResetKind createFaultIndicatorResetKindFromString(EDataType eDataType, String initialValue) {
		FaultIndicatorResetKind result = FaultIndicatorResetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFaultIndicatorResetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceControlKind createShuntImpedanceControlKindFromString(EDataType eDataType, String initialValue) {
		ShuntImpedanceControlKind result = ShuntImpedanceControlKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShuntImpedanceControlKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointConfigurationKind createJointConfigurationKindFromString(EDataType eDataType, String initialValue) {
		JointConfigurationKind result = JointConfigurationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointConfigurationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoleBaseKind createPoleBaseKindFromString(EDataType eDataType, String initialValue) {
		PoleBaseKind result = PoleBaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoleBaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FACTSDeviceKind createFACTSDeviceKindFromString(EDataType eDataType, String initialValue) {
		FACTSDeviceKind result = FACTSDeviceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFACTSDeviceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSupportKind createStructureSupportKindFromString(EDataType eDataType, String initialValue) {
		StructureSupportKind result = StructureSupportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureSupportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BushingInsulationKind createBushingInsulationKindFromString(EDataType eDataType, String initialValue) {
		BushingInsulationKind result = BushingInsulationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBushingInsulationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMaterialKind createStructureMaterialKindFromString(EDataType eDataType, String initialValue) {
		StructureMaterialKind result = StructureMaterialKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStructureMaterialKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetlightLampKind createStreetlightLampKindFromString(EDataType eDataType, String initialValue) {
		StreetlightLampKind result = StreetlightLampKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStreetlightLampKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitchKind createCompositeSwitchKindFromString(EDataType eDataType, String initialValue) {
		CompositeSwitchKind result = CompositeSwitchKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeSwitchKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureIsolationMethodKind createFailureIsolationMethodKindFromString(EDataType eDataType, String initialValue) {
		FailureIsolationMethodKind result = FailureIsolationMethodKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureIsolationMethodKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsPackage getInfAssetsPackage() {
		return (InfAssetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfAssetsPackage getPackage() {
		return InfAssetsPackage.eINSTANCE;
	}

} //InfAssetsFactory
