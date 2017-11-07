/**
 */
package CIM15.IEC61970.Informative.InfWork.util;

import CIM15.Element;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Location;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet;

import CIM15.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM15.IEC61970.Informative.InfWork.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfWork.InfWorkPackage
 * @generated
 */
public class InfWorkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfWorkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfWorkSwitch() {
		if (modelPackage == null) {
			modelPackage = InfWorkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfWorkPackage.EQUIPMENT_ITEM: {
				EquipmentItem equipmentItem = (EquipmentItem)theEObject;
				T result = caseEquipmentItem(equipmentItem);
				if (result == null) result = caseIdentifiedObject(equipmentItem);
				if (result == null) result = caseElement(equipmentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = caseScheduledEvent(appointment);
				if (result == null) result = caseIdentifiedObject(appointment);
				if (result == null) result = caseElement(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.WORK_STATUS_ENTRY: {
				WorkStatusEntry workStatusEntry = (WorkStatusEntry)theEObject;
				T result = caseWorkStatusEntry(workStatusEntry);
				if (result == null) result = caseActivityRecord(workStatusEntry);
				if (result == null) result = caseIdentifiedObject(workStatusEntry);
				if (result == null) result = caseElement(workStatusEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.BUSINESS_CASE: {
				BusinessCase businessCase = (BusinessCase)theEObject;
				T result = caseBusinessCase(businessCase);
				if (result == null) result = caseDocument(businessCase);
				if (result == null) result = caseIdentifiedObject(businessCase);
				if (result == null) result = caseElement(businessCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.TYPE_MATERIAL: {
				TypeMaterial typeMaterial = (TypeMaterial)theEObject;
				T result = caseTypeMaterial(typeMaterial);
				if (result == null) result = caseDocument(typeMaterial);
				if (result == null) result = caseIdentifiedObject(typeMaterial);
				if (result == null) result = caseElement(typeMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.DESIGN_LOCATION: {
				DesignLocation designLocation = (DesignLocation)theEObject;
				T result = caseDesignLocation(designLocation);
				if (result == null) result = caseIdentifiedObject(designLocation);
				if (result == null) result = caseElement(designLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.OVERHEAD_COST: {
				OverheadCost overheadCost = (OverheadCost)theEObject;
				T result = caseOverheadCost(overheadCost);
				if (result == null) result = caseIdentifiedObject(overheadCost);
				if (result == null) result = caseElement(overheadCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CREW: {
				Crew crew = (Crew)theEObject;
				T result = caseCrew(crew);
				if (result == null) result = caseIdentifiedObject(crew);
				if (result == null) result = caseElement(crew);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.DIAGNOSIS_DATA_SET: {
				DiagnosisDataSet diagnosisDataSet = (DiagnosisDataSet)theEObject;
				T result = caseDiagnosisDataSet(diagnosisDataSet);
				if (result == null) result = caseProcedureDataSet(diagnosisDataSet);
				if (result == null) result = caseDocument(diagnosisDataSet);
				if (result == null) result = caseIdentifiedObject(diagnosisDataSet);
				if (result == null) result = caseElement(diagnosisDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_ASSET: {
				CUAsset cuAsset = (CUAsset)theEObject;
				T result = caseCUAsset(cuAsset);
				if (result == null) result = caseIdentifiedObject(cuAsset);
				if (result == null) result = caseElement(cuAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = caseDocument(request);
				if (result == null) result = caseIdentifiedObject(request);
				if (result == null) result = caseElement(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.DESIGN: {
				Design design = (Design)theEObject;
				T result = caseDesign(design);
				if (result == null) result = caseDocument(design);
				if (result == null) result = caseIdentifiedObject(design);
				if (result == null) result = caseElement(design);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.WORK_TASK: {
				WorkTask workTask = (WorkTask)theEObject;
				T result = caseWorkTask(workTask);
				if (result == null) result = caseDocument(workTask);
				if (result == null) result = caseIdentifiedObject(workTask);
				if (result == null) result = caseElement(workTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CONDITION_FACTOR: {
				ConditionFactor conditionFactor = (ConditionFactor)theEObject;
				T result = caseConditionFactor(conditionFactor);
				if (result == null) result = caseIdentifiedObject(conditionFactor);
				if (result == null) result = caseElement(conditionFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.QUALIFICATION_REQUIREMENT: {
				QualificationRequirement qualificationRequirement = (QualificationRequirement)theEObject;
				T result = caseQualificationRequirement(qualificationRequirement);
				if (result == null) result = caseIdentifiedObject(qualificationRequirement);
				if (result == null) result = caseElement(qualificationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.WORK_LOCATION: {
				WorkLocation workLocation = (WorkLocation)theEObject;
				T result = caseWorkLocation(workLocation);
				if (result == null) result = caseLocation(workLocation);
				if (result == null) result = caseIdentifiedObject(workLocation);
				if (result == null) result = caseElement(workLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.COST_TYPE: {
				CostType costType = (CostType)theEObject;
				T result = caseCostType(costType);
				if (result == null) result = caseIdentifiedObject(costType);
				if (result == null) result = caseElement(costType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_MATERIAL_ITEM: {
				CUMaterialItem cuMaterialItem = (CUMaterialItem)theEObject;
				T result = caseCUMaterialItem(cuMaterialItem);
				if (result == null) result = caseIdentifiedObject(cuMaterialItem);
				if (result == null) result = caseElement(cuMaterialItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.PROPERTY_UNIT: {
				PropertyUnit propertyUnit = (PropertyUnit)theEObject;
				T result = casePropertyUnit(propertyUnit);
				if (result == null) result = caseIdentifiedObject(propertyUnit);
				if (result == null) result = caseElement(propertyUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseDocument(project);
				if (result == null) result = caseIdentifiedObject(project);
				if (result == null) result = caseElement(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_LABOR_ITEM: {
				CULaborItem cuLaborItem = (CULaborItem)theEObject;
				T result = caseCULaborItem(cuLaborItem);
				if (result == null) result = caseIdentifiedObject(cuLaborItem);
				if (result == null) result = caseElement(cuLaborItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.LABOR_ITEM: {
				LaborItem laborItem = (LaborItem)theEObject;
				T result = caseLaborItem(laborItem);
				if (result == null) result = caseIdentifiedObject(laborItem);
				if (result == null) result = caseElement(laborItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.WORK_FLOW_STEP: {
				WorkFlowStep workFlowStep = (WorkFlowStep)theEObject;
				T result = caseWorkFlowStep(workFlowStep);
				if (result == null) result = caseIdentifiedObject(workFlowStep);
				if (result == null) result = caseElement(workFlowStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.INSPECTION_DATA_SET: {
				InspectionDataSet inspectionDataSet = (InspectionDataSet)theEObject;
				T result = caseInspectionDataSet(inspectionDataSet);
				if (result == null) result = caseProcedureDataSet(inspectionDataSet);
				if (result == null) result = caseDocument(inspectionDataSet);
				if (result == null) result = caseIdentifiedObject(inspectionDataSet);
				if (result == null) result = caseElement(inspectionDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.WORK_COST_DETAIL: {
				WorkCostDetail workCostDetail = (WorkCostDetail)theEObject;
				T result = caseWorkCostDetail(workCostDetail);
				if (result == null) result = caseDocument(workCostDetail);
				if (result == null) result = caseIdentifiedObject(workCostDetail);
				if (result == null) result = caseElement(workCostDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.COMPATIBLE_UNIT: {
				CompatibleUnit compatibleUnit = (CompatibleUnit)theEObject;
				T result = caseCompatibleUnit(compatibleUnit);
				if (result == null) result = caseDocument(compatibleUnit);
				if (result == null) result = caseIdentifiedObject(compatibleUnit);
				if (result == null) result = caseElement(compatibleUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.WORK_COST_SUMMARY: {
				WorkCostSummary workCostSummary = (WorkCostSummary)theEObject;
				T result = caseWorkCostSummary(workCostSummary);
				if (result == null) result = caseDocument(workCostSummary);
				if (result == null) result = caseIdentifiedObject(workCostSummary);
				if (result == null) result = caseElement(workCostSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.NON_STANDARD_ITEM: {
				NonStandardItem nonStandardItem = (NonStandardItem)theEObject;
				T result = caseNonStandardItem(nonStandardItem);
				if (result == null) result = caseDocument(nonStandardItem);
				if (result == null) result = caseIdentifiedObject(nonStandardItem);
				if (result == null) result = caseElement(nonStandardItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.INFO_QUESTION: {
				InfoQuestion infoQuestion = (InfoQuestion)theEObject;
				T result = caseInfoQuestion(infoQuestion);
				if (result == null) result = caseDocument(infoQuestion);
				if (result == null) result = caseIdentifiedObject(infoQuestion);
				if (result == null) result = caseElement(infoQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.REGULATION: {
				Regulation regulation = (Regulation)theEObject;
				T result = caseRegulation(regulation);
				if (result == null) result = caseDocument(regulation);
				if (result == null) result = caseIdentifiedObject(regulation);
				if (result == null) result = caseElement(regulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CONTRACTOR_ITEM: {
				ContractorItem contractorItem = (ContractorItem)theEObject;
				T result = caseContractorItem(contractorItem);
				if (result == null) result = caseIdentifiedObject(contractorItem);
				if (result == null) result = caseElement(contractorItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_ALLOWABLE_ACTION: {
				CUAllowableAction cuAllowableAction = (CUAllowableAction)theEObject;
				T result = caseCUAllowableAction(cuAllowableAction);
				if (result == null) result = caseIdentifiedObject(cuAllowableAction);
				if (result == null) result = caseElement(cuAllowableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_LABOR_CODE: {
				CULaborCode cuLaborCode = (CULaborCode)theEObject;
				T result = caseCULaborCode(cuLaborCode);
				if (result == null) result = caseIdentifiedObject(cuLaborCode);
				if (result == null) result = caseElement(cuLaborCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.ACCESS_PERMIT: {
				AccessPermit accessPermit = (AccessPermit)theEObject;
				T result = caseAccessPermit(accessPermit);
				if (result == null) result = caseDocument(accessPermit);
				if (result == null) result = caseIdentifiedObject(accessPermit);
				if (result == null) result = caseElement(accessPermit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM: {
				CUWorkEquipmentItem cuWorkEquipmentItem = (CUWorkEquipmentItem)theEObject;
				T result = caseCUWorkEquipmentItem(cuWorkEquipmentItem);
				if (result == null) result = caseIdentifiedObject(cuWorkEquipmentItem);
				if (result == null) result = caseElement(cuWorkEquipmentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.DESIGN_LOCATION_CU: {
				DesignLocationCU designLocationCU = (DesignLocationCU)theEObject;
				T result = caseDesignLocationCU(designLocationCU);
				if (result == null) result = caseIdentifiedObject(designLocationCU);
				if (result == null) result = caseElement(designLocationCU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.MAINTENANCE_DATA_SET: {
				MaintenanceDataSet maintenanceDataSet = (MaintenanceDataSet)theEObject;
				T result = caseMaintenanceDataSet(maintenanceDataSet);
				if (result == null) result = caseProcedureDataSet(maintenanceDataSet);
				if (result == null) result = caseDocument(maintenanceDataSet);
				if (result == null) result = caseIdentifiedObject(maintenanceDataSet);
				if (result == null) result = caseElement(maintenanceDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.MISC_COST_ITEM: {
				MiscCostItem miscCostItem = (MiscCostItem)theEObject;
				T result = caseMiscCostItem(miscCostItem);
				if (result == null) result = caseIdentifiedObject(miscCostItem);
				if (result == null) result = caseElement(miscCostItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.MATERIAL_ITEM: {
				MaterialItem materialItem = (MaterialItem)theEObject;
				T result = caseMaterialItem(materialItem);
				if (result == null) result = caseIdentifiedObject(materialItem);
				if (result == null) result = caseElement(materialItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.SHIFT_PATTERN: {
				ShiftPattern shiftPattern = (ShiftPattern)theEObject;
				T result = caseShiftPattern(shiftPattern);
				if (result == null) result = caseIdentifiedObject(shiftPattern);
				if (result == null) result = caseElement(shiftPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseIdentifiedObject(capability);
				if (result == null) result = caseElement(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.USAGE: {
				Usage usage = (Usage)theEObject;
				T result = caseUsage(usage);
				if (result == null) result = caseIdentifiedObject(usage);
				if (result == null) result = caseElement(usage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.ONE_CALL_REQUEST: {
				OneCallRequest oneCallRequest = (OneCallRequest)theEObject;
				T result = caseOneCallRequest(oneCallRequest);
				if (result == null) result = caseDocument(oneCallRequest);
				if (result == null) result = caseIdentifiedObject(oneCallRequest);
				if (result == null) result = caseElement(oneCallRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseDocument(assignment);
				if (result == null) result = caseIdentifiedObject(assignment);
				if (result == null) result = caseElement(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_CONTRACTOR_ITEM: {
				CUContractorItem cuContractorItem = (CUContractorItem)theEObject;
				T result = caseCUContractorItem(cuContractorItem);
				if (result == null) result = caseIdentifiedObject(cuContractorItem);
				if (result == null) result = caseElement(cuContractorItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfWorkPackage.CU_GROUP: {
				CUGroup cuGroup = (CUGroup)theEObject;
				T result = caseCUGroup(cuGroup);
				if (result == null) result = caseIdentifiedObject(cuGroup);
				if (result == null) result = caseElement(cuGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentItem(EquipmentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Status Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Status Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkStatusEntry(WorkStatusEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessCase(BusinessCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMaterial(TypeMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignLocation(DesignLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverheadCost(OverheadCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crew</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crew</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrew(Crew object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnosis Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnosis Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosisDataSet(DiagnosisDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCUAsset(CUAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesign(Design object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkTask(WorkTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionFactor(ConditionFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualification Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualification Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualificationRequirement(QualificationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkLocation(WorkLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostType(CostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Material Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Material Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCUMaterialItem(CUMaterialItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyUnit(PropertyUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Labor Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Labor Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCULaborItem(CULaborItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labor Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labor Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaborItem(LaborItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Flow Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Flow Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkFlowStep(WorkFlowStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inspection Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inspection Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInspectionDataSet(InspectionDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Cost Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Cost Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkCostDetail(WorkCostDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatible Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatible Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompatibleUnit(CompatibleUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Cost Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Cost Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkCostSummary(WorkCostSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Standard Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Standard Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonStandardItem(NonStandardItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoQuestion(InfoQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulation(Regulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contractor Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contractor Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractorItem(ContractorItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Allowable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Allowable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCUAllowableAction(CUAllowableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Labor Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Labor Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCULaborCode(CULaborCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Permit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Permit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessPermit(AccessPermit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Work Equipment Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Work Equipment Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCUWorkEquipmentItem(CUWorkEquipmentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Location CU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Location CU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignLocationCU(DesignLocationCU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintenance Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintenance Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenanceDataSet(MaintenanceDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Misc Cost Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Misc Cost Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiscCostItem(MiscCostItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialItem(MaterialItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftPattern(ShiftPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Call Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Call Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneCallRequest(OneCallRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Contractor Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Contractor Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCUContractorItem(CUContractorItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CU Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CU Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCUGroup(CUGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledEvent(ScheduledEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityRecord(ActivityRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDataSet(ProcedureDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfWorkSwitch
