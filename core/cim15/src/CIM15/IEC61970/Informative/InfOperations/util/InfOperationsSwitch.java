/**
 */
package CIM15.IEC61970.Informative.InfOperations.util;

import CIM15.Element;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Core.ConnectivityNodeContainer;
import CIM15.IEC61970.Core.EquipmentContainer;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Informative.InfCommon.Role;

import CIM15.IEC61970.Informative.InfOperations.*;

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
 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage
 * @generated
 */
public class InfOperationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfOperationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfOperationsSwitch() {
		if (modelPackage == null) {
			modelPackage = InfOperationsPackage.eINSTANCE;
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
			case InfOperationsPackage.OUTAGE_RECORD: {
				OutageRecord outageRecord = (OutageRecord)theEObject;
				T result = caseOutageRecord(outageRecord);
				if (result == null) result = caseDocument(outageRecord);
				if (result == null) result = caseIdentifiedObject(outageRecord);
				if (result == null) result = caseElement(outageRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.OUTAGE_REPORT: {
				OutageReport outageReport = (OutageReport)theEObject;
				T result = caseOutageReport(outageReport);
				if (result == null) result = caseDocument(outageReport);
				if (result == null) result = caseIdentifiedObject(outageReport);
				if (result == null) result = caseElement(outageReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.CHANGE_ITEM: {
				ChangeItem changeItem = (ChangeItem)theEObject;
				T result = caseChangeItem(changeItem);
				if (result == null) result = caseIdentifiedObject(changeItem);
				if (result == null) result = caseElement(changeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.PSR_EVENT: {
				PSREvent psrEvent = (PSREvent)theEObject;
				T result = casePSREvent(psrEvent);
				if (result == null) result = caseActivityRecord(psrEvent);
				if (result == null) result = caseIdentifiedObject(psrEvent);
				if (result == null) result = caseElement(psrEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.PLANNED_OUTAGE: {
				PlannedOutage plannedOutage = (PlannedOutage)theEObject;
				T result = casePlannedOutage(plannedOutage);
				if (result == null) result = caseDocument(plannedOutage);
				if (result == null) result = caseIdentifiedObject(plannedOutage);
				if (result == null) result = caseElement(plannedOutage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.CIRCUIT_SECTION: {
				CircuitSection circuitSection = (CircuitSection)theEObject;
				T result = caseCircuitSection(circuitSection);
				if (result == null) result = caseIdentifiedObject(circuitSection);
				if (result == null) result = caseElement(circuitSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.SAFETY_DOCUMENT: {
				SafetyDocument safetyDocument = (SafetyDocument)theEObject;
				T result = caseSafetyDocument(safetyDocument);
				if (result == null) result = caseDocument(safetyDocument);
				if (result == null) result = caseIdentifiedObject(safetyDocument);
				if (result == null) result = caseElement(safetyDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.OPERATIONAL_RESTRICTION: {
				OperationalRestriction operationalRestriction = (OperationalRestriction)theEObject;
				T result = caseOperationalRestriction(operationalRestriction);
				if (result == null) result = caseDocument(operationalRestriction);
				if (result == null) result = caseIdentifiedObject(operationalRestriction);
				if (result == null) result = caseElement(operationalRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.CHANGE_SET: {
				ChangeSet changeSet = (ChangeSet)theEObject;
				T result = caseChangeSet(changeSet);
				if (result == null) result = caseIdentifiedObject(changeSet);
				if (result == null) result = caseElement(changeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.SWITCHING_SCHEDULE: {
				SwitchingSchedule switchingSchedule = (SwitchingSchedule)theEObject;
				T result = caseSwitchingSchedule(switchingSchedule);
				if (result == null) result = caseDocument(switchingSchedule);
				if (result == null) result = caseIdentifiedObject(switchingSchedule);
				if (result == null) result = caseElement(switchingSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.CIRCUIT: {
				Circuit circuit = (Circuit)theEObject;
				T result = caseCircuit(circuit);
				if (result == null) result = caseEquipmentContainer(circuit);
				if (result == null) result = caseConnectivityNodeContainer(circuit);
				if (result == null) result = casePowerSystemResource(circuit);
				if (result == null) result = caseIdentifiedObject(circuit);
				if (result == null) result = caseElement(circuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.NETWORK_DATA_SET: {
				NetworkDataSet networkDataSet = (NetworkDataSet)theEObject;
				T result = caseNetworkDataSet(networkDataSet);
				if (result == null) result = caseIdentifiedObject(networkDataSet);
				if (result == null) result = caseElement(networkDataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.OUTAGE_STEP: {
				OutageStep outageStep = (OutageStep)theEObject;
				T result = caseOutageStep(outageStep);
				if (result == null) result = caseIdentifiedObject(outageStep);
				if (result == null) result = caseElement(outageStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.ORG_PSR_ROLE: {
				OrgPsrRole orgPsrRole = (OrgPsrRole)theEObject;
				T result = caseOrgPsrRole(orgPsrRole);
				if (result == null) result = caseRole(orgPsrRole);
				if (result == null) result = caseIdentifiedObject(orgPsrRole);
				if (result == null) result = caseElement(orgPsrRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.OUTAGE_CODE: {
				OutageCode outageCode = (OutageCode)theEObject;
				T result = caseOutageCode(outageCode);
				if (result == null) result = caseIdentifiedObject(outageCode);
				if (result == null) result = caseElement(outageCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.INCIDENT_CODE: {
				IncidentCode incidentCode = (IncidentCode)theEObject;
				T result = caseIncidentCode(incidentCode);
				if (result == null) result = caseIdentifiedObject(incidentCode);
				if (result == null) result = caseElement(incidentCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.LAND_BASE: {
				LandBase landBase = (LandBase)theEObject;
				T result = caseLandBase(landBase);
				if (result == null) result = caseDocument(landBase);
				if (result == null) result = caseIdentifiedObject(landBase);
				if (result == null) result = caseElement(landBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE: {
				ErpPersonScheduleStepRole erpPersonScheduleStepRole = (ErpPersonScheduleStepRole)theEObject;
				T result = caseErpPersonScheduleStepRole(erpPersonScheduleStepRole);
				if (result == null) result = caseRole(erpPersonScheduleStepRole);
				if (result == null) result = caseIdentifiedObject(erpPersonScheduleStepRole);
				if (result == null) result = caseElement(erpPersonScheduleStepRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.SWITCHING_STEP: {
				SwitchingStep switchingStep = (SwitchingStep)theEObject;
				T result = caseSwitchingStep(switchingStep);
				if (result == null) result = caseIdentifiedObject(switchingStep);
				if (result == null) result = caseElement(switchingStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.CALL_BACK: {
				CallBack callBack = (CallBack)theEObject;
				T result = caseCallBack(callBack);
				if (result == null) result = caseIdentifiedObject(callBack);
				if (result == null) result = caseElement(callBack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.TROUBLE_TICKET: {
				TroubleTicket troubleTicket = (TroubleTicket)theEObject;
				T result = caseTroubleTicket(troubleTicket);
				if (result == null) result = caseDocument(troubleTicket);
				if (result == null) result = caseIdentifiedObject(troubleTicket);
				if (result == null) result = caseElement(troubleTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.INCIDENT_RECORD: {
				IncidentRecord incidentRecord = (IncidentRecord)theEObject;
				T result = caseIncidentRecord(incidentRecord);
				if (result == null) result = caseDocument(incidentRecord);
				if (result == null) result = caseIdentifiedObject(incidentRecord);
				if (result == null) result = caseElement(incidentRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.OUTAGE_NOTIFICATION: {
				OutageNotification outageNotification = (OutageNotification)theEObject;
				T result = caseOutageNotification(outageNotification);
				if (result == null) result = caseDocument(outageNotification);
				if (result == null) result = caseIdentifiedObject(outageNotification);
				if (result == null) result = caseElement(outageNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE: {
				OutageStepPsrRole outageStepPsrRole = (OutageStepPsrRole)theEObject;
				T result = caseOutageStepPsrRole(outageStepPsrRole);
				if (result == null) result = caseRole(outageStepPsrRole);
				if (result == null) result = caseIdentifiedObject(outageStepPsrRole);
				if (result == null) result = caseElement(outageStepPsrRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageRecord(OutageRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageReport(OutageReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeItem(ChangeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSR Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSR Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSREvent(PSREvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Outage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Outage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedOutage(PlannedOutage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitSection(CircuitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyDocument(SafetyDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRestriction(OperationalRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeSet(ChangeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switching Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switching Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchingSchedule(SwitchingSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuit(Circuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Data Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkDataSet(NetworkDataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageStep(OutageStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Psr Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Psr Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgPsrRole(OrgPsrRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageCode(OutageCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incident Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incident Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncidentCode(IncidentCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Land Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Land Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandBase(LandBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Person Schedule Step Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Person Schedule Step Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPersonScheduleStepRole(ErpPersonScheduleStepRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switching Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switching Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchingStep(SwitchingStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBack(CallBack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trouble Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trouble Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTroubleTicket(TroubleTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incident Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incident Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncidentRecord(IncidentRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageNotification(OutageNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage Step Psr Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage Step Psr Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageStepPsrRole(OutageStepPsrRole object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentContainer(EquipmentContainer object) {
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

} //InfOperationsSwitch
