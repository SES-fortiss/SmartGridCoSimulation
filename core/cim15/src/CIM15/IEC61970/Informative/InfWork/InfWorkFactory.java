/**
 */
package CIM15.IEC61970.Informative.InfWork;

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
public class InfWorkFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfWorkFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfWorkFactory INSTANCE = CIM15.IEC61970.Informative.InfWork.InfWorkFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfWorkFactory init() {
		try {
			InfWorkFactory theInfWorkFactory = (InfWorkFactory)EPackage.Registry.INSTANCE.getEFactory(InfWorkPackage.eNS_URI);
			if (theInfWorkFactory != null) {
				return theInfWorkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfWorkFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfWorkFactory() {
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
			case InfWorkPackage.EQUIPMENT_ITEM: return createEquipmentItem();
			case InfWorkPackage.APPOINTMENT: return createAppointment();
			case InfWorkPackage.WORK_STATUS_ENTRY: return createWorkStatusEntry();
			case InfWorkPackage.BUSINESS_CASE: return createBusinessCase();
			case InfWorkPackage.TYPE_MATERIAL: return createTypeMaterial();
			case InfWorkPackage.DESIGN_LOCATION: return createDesignLocation();
			case InfWorkPackage.OVERHEAD_COST: return createOverheadCost();
			case InfWorkPackage.CREW: return createCrew();
			case InfWorkPackage.DIAGNOSIS_DATA_SET: return createDiagnosisDataSet();
			case InfWorkPackage.CU_ASSET: return createCUAsset();
			case InfWorkPackage.REQUEST: return createRequest();
			case InfWorkPackage.DESIGN: return createDesign();
			case InfWorkPackage.WORK_TASK: return createWorkTask();
			case InfWorkPackage.CONDITION_FACTOR: return createConditionFactor();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT: return createQualificationRequirement();
			case InfWorkPackage.WORK_LOCATION: return createWorkLocation();
			case InfWorkPackage.COST_TYPE: return createCostType();
			case InfWorkPackage.CU_MATERIAL_ITEM: return createCUMaterialItem();
			case InfWorkPackage.PROPERTY_UNIT: return createPropertyUnit();
			case InfWorkPackage.PROJECT: return createProject();
			case InfWorkPackage.CU_LABOR_ITEM: return createCULaborItem();
			case InfWorkPackage.LABOR_ITEM: return createLaborItem();
			case InfWorkPackage.WORK_FLOW_STEP: return createWorkFlowStep();
			case InfWorkPackage.INSPECTION_DATA_SET: return createInspectionDataSet();
			case InfWorkPackage.WORK_COST_DETAIL: return createWorkCostDetail();
			case InfWorkPackage.COMPATIBLE_UNIT: return createCompatibleUnit();
			case InfWorkPackage.WORK_COST_SUMMARY: return createWorkCostSummary();
			case InfWorkPackage.NON_STANDARD_ITEM: return createNonStandardItem();
			case InfWorkPackage.INFO_QUESTION: return createInfoQuestion();
			case InfWorkPackage.REGULATION: return createRegulation();
			case InfWorkPackage.CONTRACTOR_ITEM: return createContractorItem();
			case InfWorkPackage.CU_ALLOWABLE_ACTION: return createCUAllowableAction();
			case InfWorkPackage.CU_LABOR_CODE: return createCULaborCode();
			case InfWorkPackage.ACCESS_PERMIT: return createAccessPermit();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM: return createCUWorkEquipmentItem();
			case InfWorkPackage.DESIGN_LOCATION_CU: return createDesignLocationCU();
			case InfWorkPackage.MAINTENANCE_DATA_SET: return createMaintenanceDataSet();
			case InfWorkPackage.MISC_COST_ITEM: return createMiscCostItem();
			case InfWorkPackage.MATERIAL_ITEM: return createMaterialItem();
			case InfWorkPackage.SHIFT_PATTERN: return createShiftPattern();
			case InfWorkPackage.CAPABILITY: return createCapability();
			case InfWorkPackage.USAGE: return createUsage();
			case InfWorkPackage.ONE_CALL_REQUEST: return createOneCallRequest();
			case InfWorkPackage.ASSIGNMENT: return createAssignment();
			case InfWorkPackage.CU_CONTRACTOR_ITEM: return createCUContractorItem();
			case InfWorkPackage.CU_GROUP: return createCUGroup();
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
			case InfWorkPackage.CONDITION_FACTOR_KIND:
				return createConditionFactorKindFromString(eDataType, initialValue);
			case InfWorkPackage.WORK_ACTION_KIND:
				return createWorkActionKindFromString(eDataType, initialValue);
			case InfWorkPackage.DESIGN_KIND:
				return createDesignKindFromString(eDataType, initialValue);
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
			case InfWorkPackage.CONDITION_FACTOR_KIND:
				return convertConditionFactorKindToString(eDataType, instanceValue);
			case InfWorkPackage.WORK_ACTION_KIND:
				return convertWorkActionKindToString(eDataType, instanceValue);
			case InfWorkPackage.DESIGN_KIND:
				return convertDesignKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentItem createEquipmentItem() {
		EquipmentItem equipmentItem = new EquipmentItem();
		return equipmentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		Appointment appointment = new Appointment();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusEntry createWorkStatusEntry() {
		WorkStatusEntry workStatusEntry = new WorkStatusEntry();
		return workStatusEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCase createBusinessCase() {
		BusinessCase businessCase = new BusinessCase();
		return businessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial createTypeMaterial() {
		TypeMaterial typeMaterial = new TypeMaterial();
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation createDesignLocation() {
		DesignLocation designLocation = new DesignLocation();
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadCost createOverheadCost() {
		OverheadCost overheadCost = new OverheadCost();
		return overheadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew createCrew() {
		Crew crew = new Crew();
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosisDataSet createDiagnosisDataSet() {
		DiagnosisDataSet diagnosisDataSet = new DiagnosisDataSet();
		return diagnosisDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAsset createCUAsset() {
		CUAsset cuAsset = new CUAsset();
		return cuAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		Request request = new Request();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design createDesign() {
		Design design = new Design();
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask createWorkTask() {
		WorkTask workTask = new WorkTask();
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionFactor createConditionFactor() {
		ConditionFactor conditionFactor = new ConditionFactor();
		return conditionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualificationRequirement createQualificationRequirement() {
		QualificationRequirement qualificationRequirement = new QualificationRequirement();
		return qualificationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkLocation createWorkLocation() {
		WorkLocation workLocation = new WorkLocation();
		return workLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType createCostType() {
		CostType costType = new CostType();
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUMaterialItem createCUMaterialItem() {
		CUMaterialItem cuMaterialItem = new CUMaterialItem();
		return cuMaterialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyUnit createPropertyUnit() {
		PropertyUnit propertyUnit = new PropertyUnit();
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		Project project = new Project();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborItem createCULaborItem() {
		CULaborItem cuLaborItem = new CULaborItem();
		return cuLaborItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaborItem createLaborItem() {
		LaborItem laborItem = new LaborItem();
		return laborItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowStep createWorkFlowStep() {
		WorkFlowStep workFlowStep = new WorkFlowStep();
		return workFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionDataSet createInspectionDataSet() {
		InspectionDataSet inspectionDataSet = new InspectionDataSet();
		return inspectionDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail createWorkCostDetail() {
		WorkCostDetail workCostDetail = new WorkCostDetail();
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleUnit createCompatibleUnit() {
		CompatibleUnit compatibleUnit = new CompatibleUnit();
		return compatibleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostSummary createWorkCostSummary() {
		WorkCostSummary workCostSummary = new WorkCostSummary();
		return workCostSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonStandardItem createNonStandardItem() {
		NonStandardItem nonStandardItem = new NonStandardItem();
		return nonStandardItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoQuestion createInfoQuestion() {
		InfoQuestion infoQuestion = new InfoQuestion();
		return infoQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regulation createRegulation() {
		Regulation regulation = new Regulation();
		return regulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractorItem createContractorItem() {
		ContractorItem contractorItem = new ContractorItem();
		return contractorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAllowableAction createCUAllowableAction() {
		CUAllowableAction cuAllowableAction = new CUAllowableAction();
		return cuAllowableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborCode createCULaborCode() {
		CULaborCode cuLaborCode = new CULaborCode();
		return cuLaborCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPermit createAccessPermit() {
		AccessPermit accessPermit = new AccessPermit();
		return accessPermit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUWorkEquipmentItem createCUWorkEquipmentItem() {
		CUWorkEquipmentItem cuWorkEquipmentItem = new CUWorkEquipmentItem();
		return cuWorkEquipmentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocationCU createDesignLocationCU() {
		DesignLocationCU designLocationCU = new DesignLocationCU();
		return designLocationCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceDataSet createMaintenanceDataSet() {
		MaintenanceDataSet maintenanceDataSet = new MaintenanceDataSet();
		return maintenanceDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiscCostItem createMiscCostItem() {
		MiscCostItem miscCostItem = new MiscCostItem();
		return miscCostItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem createMaterialItem() {
		MaterialItem materialItem = new MaterialItem();
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftPattern createShiftPattern() {
		ShiftPattern shiftPattern = new ShiftPattern();
		return shiftPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		Capability capability = new Capability();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		Usage usage = new Usage();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCallRequest createOneCallRequest() {
		OneCallRequest oneCallRequest = new OneCallRequest();
		return oneCallRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		Assignment assignment = new Assignment();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUContractorItem createCUContractorItem() {
		CUContractorItem cuContractorItem = new CUContractorItem();
		return cuContractorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUGroup createCUGroup() {
		CUGroup cuGroup = new CUGroup();
		return cuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionFactorKind createConditionFactorKindFromString(EDataType eDataType, String initialValue) {
		ConditionFactorKind result = ConditionFactorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionFactorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkActionKind createWorkActionKindFromString(EDataType eDataType, String initialValue) {
		WorkActionKind result = WorkActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignKind createDesignKindFromString(EDataType eDataType, String initialValue) {
		DesignKind result = DesignKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfWorkPackage getInfWorkPackage() {
		return (InfWorkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfWorkPackage getPackage() {
		return InfWorkPackage.eINSTANCE;
	}

} //InfWorkFactory
