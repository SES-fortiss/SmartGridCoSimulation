/**
 */
package CIM15.IEC61970.Informative.InfAssets.util;

import CIM15.Element;

import CIM15.IEC61968.Assets.Asset;
import CIM15.IEC61968.Assets.AssetContainer;
import CIM15.IEC61968.Assets.AssetInfo;
import CIM15.IEC61968.Assets.AssetModel;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Core.Curve;
import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.*;

import CIM15.IEC61970.Informative.InfCommon.Role;

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
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage
 * @generated
 */
public class InfAssetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfAssetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetsSwitch() {
		if (modelPackage == null) {
			modelPackage = InfAssetsPackage.eINSTANCE;
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
			case InfAssetsPackage.FACTS_DEVICE: {
				FACTSDevice factsDevice = (FACTSDevice)theEObject;
				T result = caseFACTSDevice(factsDevice);
				if (result == null) result = caseAsset(factsDevice);
				if (result == null) result = caseIdentifiedObject(factsDevice);
				if (result == null) result = caseElement(factsDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DOC_ASSET_ROLE: {
				DocAssetRole docAssetRole = (DocAssetRole)theEObject;
				T result = caseDocAssetRole(docAssetRole);
				if (result == null) result = caseRole(docAssetRole);
				if (result == null) result = caseIdentifiedObject(docAssetRole);
				if (result == null) result = caseElement(docAssetRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DUCT_BANK: {
				DuctBank ductBank = (DuctBank)theEObject;
				T result = caseDuctBank(ductBank);
				if (result == null) result = caseAssetContainer(ductBank);
				if (result == null) result = caseAsset(ductBank);
				if (result == null) result = caseIdentifiedObject(ductBank);
				if (result == null) result = caseElement(ductBank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.CONDUCTOR_ASSET: {
				ConductorAsset conductorAsset = (ConductorAsset)theEObject;
				T result = caseConductorAsset(conductorAsset);
				if (result == null) result = caseAsset(conductorAsset);
				if (result == null) result = caseIdentifiedObject(conductorAsset);
				if (result == null) result = caseElement(conductorAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FINANCIAL_INFO: {
				FinancialInfo financialInfo = (FinancialInfo)theEObject;
				T result = caseFinancialInfo(financialInfo);
				if (result == null) result = caseIdentifiedObject(financialInfo);
				if (result == null) result = caseElement(financialInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO: {
				ProtectionEquipmentInfo protectionEquipmentInfo = (ProtectionEquipmentInfo)theEObject;
				T result = caseProtectionEquipmentInfo(protectionEquipmentInfo);
				if (result == null) result = caseAssetInfo(protectionEquipmentInfo);
				if (result == null) result = caseIdentifiedObject(protectionEquipmentInfo);
				if (result == null) result = caseElement(protectionEquipmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.PROCEDURE_DATA_SET: {
				ProcedureDataSet procedureDataSet = (ProcedureDataSet)theEObject;
				T result = caseProcedureDataSet(procedureDataSet);
				if (result == null) result = caseDocument(procedureDataSet);
				if (result == null) result = caseIdentifiedObject(procedureDataSet);
				if (result == null) result = caseElement(procedureDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.WINDING_INSULATION: {
				WindingInsulation windingInsulation = (WindingInsulation)theEObject;
				T result = caseWindingInsulation(windingInsulation);
				if (result == null) result = caseIdentifiedObject(windingInsulation);
				if (result == null) result = caseElement(windingInsulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseDocument(specification);
				if (result == null) result = caseIdentifiedObject(specification);
				if (result == null) result = caseElement(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.UNDERGROUND_STRUCTURE: {
				UndergroundStructure undergroundStructure = (UndergroundStructure)theEObject;
				T result = caseUndergroundStructure(undergroundStructure);
				if (result == null) result = caseStructure(undergroundStructure);
				if (result == null) result = caseAssetContainer(undergroundStructure);
				if (result == null) result = caseAsset(undergroundStructure);
				if (result == null) result = caseIdentifiedObject(undergroundStructure);
				if (result == null) result = caseElement(undergroundStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO: {
				PotentialTransformerInfo potentialTransformerInfo = (PotentialTransformerInfo)theEObject;
				T result = casePotentialTransformerInfo(potentialTransformerInfo);
				if (result == null) result = caseAssetInfo(potentialTransformerInfo);
				if (result == null) result = caseIdentifiedObject(potentialTransformerInfo);
				if (result == null) result = caseElement(potentialTransformerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = caseAssetContainer(structure);
				if (result == null) result = caseAsset(structure);
				if (result == null) result = caseIdentifiedObject(structure);
				if (result == null) result = caseElement(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO: {
				CurrentTransformerInfo currentTransformerInfo = (CurrentTransformerInfo)theEObject;
				T result = caseCurrentTransformerInfo(currentTransformerInfo);
				if (result == null) result = caseAssetInfo(currentTransformerInfo);
				if (result == null) result = caseIdentifiedObject(currentTransformerInfo);
				if (result == null) result = caseElement(currentTransformerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.BUSHING_INSULATION_PF: {
				BushingInsulationPF bushingInsulationPF = (BushingInsulationPF)theEObject;
				T result = caseBushingInsulationPF(bushingInsulationPF);
				if (result == null) result = caseIdentifiedObject(bushingInsulationPF);
				if (result == null) result = caseElement(bushingInsulationPF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.JOINT: {
				Joint joint = (Joint)theEObject;
				T result = caseJoint(joint);
				if (result == null) result = caseAsset(joint);
				if (result == null) result = caseIdentifiedObject(joint);
				if (result == null) result = caseElement(joint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ELECTRICAL_INFO: {
				ElectricalInfo electricalInfo = (ElectricalInfo)theEObject;
				T result = caseElectricalInfo(electricalInfo);
				if (result == null) result = caseAssetInfo(electricalInfo);
				if (result == null) result = caseIdentifiedObject(electricalInfo);
				if (result == null) result = caseElement(electricalInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.WORK_EQUIPMENT: {
				WorkEquipment workEquipment = (WorkEquipment)theEObject;
				T result = caseWorkEquipment(workEquipment);
				if (result == null) result = caseAsset(workEquipment);
				if (result == null) result = caseIdentifiedObject(workEquipment);
				if (result == null) result = caseElement(workEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FAULT_INDICATOR_INFO: {
				FaultIndicatorInfo faultIndicatorInfo = (FaultIndicatorInfo)theEObject;
				T result = caseFaultIndicatorInfo(faultIndicatorInfo);
				if (result == null) result = caseAssetInfo(faultIndicatorInfo);
				if (result == null) result = caseIdentifiedObject(faultIndicatorInfo);
				if (result == null) result = caseElement(faultIndicatorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DUCT: {
				Duct duct = (Duct)theEObject;
				T result = caseDuct(duct);
				if (result == null) result = caseAssetContainer(duct);
				if (result == null) result = caseAsset(duct);
				if (result == null) result = caseIdentifiedObject(duct);
				if (result == null) result = caseElement(duct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.POWER_RATING: {
				PowerRating powerRating = (PowerRating)theEObject;
				T result = casePowerRating(powerRating);
				if (result == null) result = caseIdentifiedObject(powerRating);
				if (result == null) result = caseElement(powerRating);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ASSET_ASSET_ROLE: {
				AssetAssetRole assetAssetRole = (AssetAssetRole)theEObject;
				T result = caseAssetAssetRole(assetAssetRole);
				if (result == null) result = caseRole(assetAssetRole);
				if (result == null) result = caseIdentifiedObject(assetAssetRole);
				if (result == null) result = caseElement(assetAssetRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TRANSFORMER_ASSET: {
				TransformerAsset transformerAsset = (TransformerAsset)theEObject;
				T result = caseTransformerAsset(transformerAsset);
				if (result == null) result = caseAsset(transformerAsset);
				if (result == null) result = caseIdentifiedObject(transformerAsset);
				if (result == null) result = caseElement(transformerAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDocument(procedure);
				if (result == null) result = caseIdentifiedObject(procedure);
				if (result == null) result = caseElement(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.BREAKER_INFO: {
				BreakerInfo breakerInfo = (BreakerInfo)theEObject;
				T result = caseBreakerInfo(breakerInfo);
				if (result == null) result = caseSwitchInfo(breakerInfo);
				if (result == null) result = caseAssetInfo(breakerInfo);
				if (result == null) result = caseIdentifiedObject(breakerInfo);
				if (result == null) result = caseElement(breakerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO: {
				CompositeSwitchInfo compositeSwitchInfo = (CompositeSwitchInfo)theEObject;
				T result = caseCompositeSwitchInfo(compositeSwitchInfo);
				if (result == null) result = caseAssetInfo(compositeSwitchInfo);
				if (result == null) result = caseIdentifiedObject(compositeSwitchInfo);
				if (result == null) result = caseElement(compositeSwitchInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.CABINET: {
				Cabinet cabinet = (Cabinet)theEObject;
				T result = caseCabinet(cabinet);
				if (result == null) result = caseAssetContainer(cabinet);
				if (result == null) result = caseAsset(cabinet);
				if (result == null) result = caseIdentifiedObject(cabinet);
				if (result == null) result = caseElement(cabinet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.BUSHING: {
				Bushing bushing = (Bushing)theEObject;
				T result = caseBushing(bushing);
				if (result == null) result = caseAsset(bushing);
				if (result == null) result = caseIdentifiedObject(bushing);
				if (result == null) result = caseElement(bushing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.VEHICLE: {
				Vehicle vehicle = (Vehicle)theEObject;
				T result = caseVehicle(vehicle);
				if (result == null) result = caseAsset(vehicle);
				if (result == null) result = caseIdentifiedObject(vehicle);
				if (result == null) result = caseElement(vehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SURGE_PROTECTOR_INFO: {
				SurgeProtectorInfo surgeProtectorInfo = (SurgeProtectorInfo)theEObject;
				T result = caseSurgeProtectorInfo(surgeProtectorInfo);
				if (result == null) result = caseAssetInfo(surgeProtectorInfo);
				if (result == null) result = caseIdentifiedObject(surgeProtectorInfo);
				if (result == null) result = caseElement(surgeProtectorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.STRUCTURE_SUPPORT: {
				StructureSupport structureSupport = (StructureSupport)theEObject;
				T result = caseStructureSupport(structureSupport);
				if (result == null) result = caseAsset(structureSupport);
				if (result == null) result = caseIdentifiedObject(structureSupport);
				if (result == null) result = caseElement(structureSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.COM_EQUIPMENT: {
				ComEquipment comEquipment = (ComEquipment)theEObject;
				T result = caseComEquipment(comEquipment);
				if (result == null) result = caseAsset(comEquipment);
				if (result == null) result = caseIdentifiedObject(comEquipment);
				if (result == null) result = caseElement(comEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ASSET_PROPERTY_CURVE: {
				AssetPropertyCurve assetPropertyCurve = (AssetPropertyCurve)theEObject;
				T result = caseAssetPropertyCurve(assetPropertyCurve);
				if (result == null) result = caseCurve(assetPropertyCurve);
				if (result == null) result = caseIdentifiedObject(assetPropertyCurve);
				if (result == null) result = caseElement(assetPropertyCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FAILURE_EVENT: {
				FailureEvent failureEvent = (FailureEvent)theEObject;
				T result = caseFailureEvent(failureEvent);
				if (result == null) result = caseActivityRecord(failureEvent);
				if (result == null) result = caseIdentifiedObject(failureEvent);
				if (result == null) result = caseElement(failureEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.DIMENSIONS_INFO: {
				DimensionsInfo dimensionsInfo = (DimensionsInfo)theEObject;
				T result = caseDimensionsInfo(dimensionsInfo);
				if (result == null) result = caseIdentifiedObject(dimensionsInfo);
				if (result == null) result = caseElement(dimensionsInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TOWER: {
				Tower tower = (Tower)theEObject;
				T result = caseTower(tower);
				if (result == null) result = caseStructure(tower);
				if (result == null) result = caseAssetContainer(tower);
				if (result == null) result = caseAsset(tower);
				if (result == null) result = caseIdentifiedObject(tower);
				if (result == null) result = caseElement(tower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.MOUNTING_CONNECTION: {
				MountingConnection mountingConnection = (MountingConnection)theEObject;
				T result = caseMountingConnection(mountingConnection);
				if (result == null) result = caseIdentifiedObject(mountingConnection);
				if (result == null) result = caseElement(mountingConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.MEDIUM: {
				Medium medium = (Medium)theEObject;
				T result = caseMedium(medium);
				if (result == null) result = caseIdentifiedObject(medium);
				if (result == null) result = caseElement(medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.RECLOSER_INFO: {
				RecloserInfo recloserInfo = (RecloserInfo)theEObject;
				T result = caseRecloserInfo(recloserInfo);
				if (result == null) result = caseSwitchInfo(recloserInfo);
				if (result == null) result = caseAssetInfo(recloserInfo);
				if (result == null) result = caseIdentifiedObject(recloserInfo);
				if (result == null) result = caseElement(recloserInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.FACILITY: {
				Facility facility = (Facility)theEObject;
				T result = caseFacility(facility);
				if (result == null) result = caseAssetContainer(facility);
				if (result == null) result = caseAsset(facility);
				if (result == null) result = caseIdentifiedObject(facility);
				if (result == null) result = caseElement(facility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO: {
				ShuntImpedanceInfo shuntImpedanceInfo = (ShuntImpedanceInfo)theEObject;
				T result = caseShuntImpedanceInfo(shuntImpedanceInfo);
				if (result == null) result = caseAssetInfo(shuntImpedanceInfo);
				if (result == null) result = caseIdentifiedObject(shuntImpedanceInfo);
				if (result == null) result = caseElement(shuntImpedanceInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO: {
				ShuntCompensatorInfo shuntCompensatorInfo = (ShuntCompensatorInfo)theEObject;
				T result = caseShuntCompensatorInfo(shuntCompensatorInfo);
				if (result == null) result = caseAssetInfo(shuntCompensatorInfo);
				if (result == null) result = caseIdentifiedObject(shuntCompensatorInfo);
				if (result == null) result = caseElement(shuntCompensatorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.MOUNTING_POINT: {
				MountingPoint mountingPoint = (MountingPoint)theEObject;
				T result = caseMountingPoint(mountingPoint);
				if (result == null) result = caseIdentifiedObject(mountingPoint);
				if (result == null) result = caseElement(mountingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SUBSTATION_ASSET: {
				SubstationAsset substationAsset = (SubstationAsset)theEObject;
				T result = caseSubstationAsset(substationAsset);
				if (result == null) result = caseAsset(substationAsset);
				if (result == null) result = caseIdentifiedObject(substationAsset);
				if (result == null) result = caseElement(substationAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.STREETLIGHT: {
				Streetlight streetlight = (Streetlight)theEObject;
				T result = caseStreetlight(streetlight);
				if (result == null) result = caseAsset(streetlight);
				if (result == null) result = caseIdentifiedObject(streetlight);
				if (result == null) result = caseElement(streetlight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseAsset(tool);
				if (result == null) result = caseIdentifiedObject(tool);
				if (result == null) result = caseElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SVC: {
				SVC svc = (SVC)theEObject;
				T result = caseSVC(svc);
				if (result == null) result = caseFACTSDevice(svc);
				if (result == null) result = caseAsset(svc);
				if (result == null) result = caseIdentifiedObject(svc);
				if (result == null) result = caseElement(svc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.ORG_ASSET_ROLE: {
				OrgAssetRole orgAssetRole = (OrgAssetRole)theEObject;
				T result = caseOrgAssetRole(orgAssetRole);
				if (result == null) result = caseRole(orgAssetRole);
				if (result == null) result = caseIdentifiedObject(orgAssetRole);
				if (result == null) result = caseElement(orgAssetRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TEST_DATA_SET: {
				TestDataSet testDataSet = (TestDataSet)theEObject;
				T result = caseTestDataSet(testDataSet);
				if (result == null) result = caseProcedureDataSet(testDataSet);
				if (result == null) result = caseDocument(testDataSet);
				if (result == null) result = caseIdentifiedObject(testDataSet);
				if (result == null) result = caseElement(testDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL: {
				GenericAssetModelOrMaterial genericAssetModelOrMaterial = (GenericAssetModelOrMaterial)theEObject;
				T result = caseGenericAssetModelOrMaterial(genericAssetModelOrMaterial);
				if (result == null) result = caseAssetModel(genericAssetModelOrMaterial);
				if (result == null) result = caseIdentifiedObject(genericAssetModelOrMaterial);
				if (result == null) result = caseElement(genericAssetModelOrMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.RELIABILITY_INFO: {
				ReliabilityInfo reliabilityInfo = (ReliabilityInfo)theEObject;
				T result = caseReliabilityInfo(reliabilityInfo);
				if (result == null) result = caseIdentifiedObject(reliabilityInfo);
				if (result == null) result = caseElement(reliabilityInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.TRANSFORMER_OBSERVATION: {
				TransformerObservation transformerObservation = (TransformerObservation)theEObject;
				T result = caseTransformerObservation(transformerObservation);
				if (result == null) result = caseIdentifiedObject(transformerObservation);
				if (result == null) result = caseElement(transformerObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.POLE: {
				Pole pole = (Pole)theEObject;
				T result = casePole(pole);
				if (result == null) result = caseStructure(pole);
				if (result == null) result = caseAssetContainer(pole);
				if (result == null) result = caseAsset(pole);
				if (result == null) result = caseIdentifiedObject(pole);
				if (result == null) result = caseElement(pole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfAssetsPackage.SWITCH_INFO: {
				SwitchInfo switchInfo = (SwitchInfo)theEObject;
				T result = caseSwitchInfo(switchInfo);
				if (result == null) result = caseAssetInfo(switchInfo);
				if (result == null) result = caseIdentifiedObject(switchInfo);
				if (result == null) result = caseElement(switchInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FACTS Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FACTS Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFACTSDevice(FACTSDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Asset Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Asset Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocAssetRole(DocAssetRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuctBank(DuctBank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductorAsset(ConductorAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialInfo(FinancialInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Equipment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Equipment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectionEquipmentInfo(ProtectionEquipmentInfo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Winding Insulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winding Insulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindingInsulation(WindingInsulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underground Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underground Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndergroundStructure(UndergroundStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potential Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potential Transformer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentialTransformerInfo(PotentialTransformerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Transformer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentTransformerInfo(CurrentTransformerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bushing Insulation PF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bushing Insulation PF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBushingInsulationPF(BushingInsulationPF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoint(Joint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalInfo(ElectricalInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkEquipment(WorkEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Indicator Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Indicator Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultIndicatorInfo(FaultIndicatorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuct(Duct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Rating</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Rating</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerRating(PowerRating object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Asset Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Asset Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetAssetRole(AssetAssetRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerAsset(TransformerAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breaker Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breaker Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakerInfo(BreakerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Switch Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Switch Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSwitchInfo(CompositeSwitchInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabinet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabinet(Cabinet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bushing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bushing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBushing(Bushing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surge Protector Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surge Protector Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgeProtectorInfo(SurgeProtectorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureSupport(StructureSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComEquipment(ComEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Property Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Property Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetPropertyCurve(AssetPropertyCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureEvent(FailureEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensions Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensions Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionsInfo(DimensionsInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTower(Tower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mounting Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mounting Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMountingConnection(MountingConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedium(Medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recloser Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recloser Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecloserInfo(RecloserInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacility(Facility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shunt Impedance Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shunt Impedance Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuntImpedanceInfo(ShuntImpedanceInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shunt Compensator Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuntCompensatorInfo(ShuntCompensatorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mounting Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mounting Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMountingPoint(MountingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstationAsset(SubstationAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streetlight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streetlight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreetlight(Streetlight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVC(SVC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Asset Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Asset Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgAssetRole(OrgAssetRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestDataSet(TestDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Asset Model Or Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Asset Model Or Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAssetModelOrMaterial(GenericAssetModelOrMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliabilityInfo(ReliabilityInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerObservation(TransformerObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePole(Pole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchInfo(SwitchInfo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetContainer(AssetContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetInfo(AssetInfo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetModel(AssetModel object) {
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

} //InfAssetsSwitch
