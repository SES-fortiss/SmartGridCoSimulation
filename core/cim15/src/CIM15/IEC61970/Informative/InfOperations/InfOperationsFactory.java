/**
 */
package CIM15.IEC61970.Informative.InfOperations;

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
public class InfOperationsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfOperationsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfOperationsFactory INSTANCE = CIM15.IEC61970.Informative.InfOperations.InfOperationsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfOperationsFactory init() {
		try {
			InfOperationsFactory theInfOperationsFactory = (InfOperationsFactory)EPackage.Registry.INSTANCE.getEFactory(InfOperationsPackage.eNS_URI);
			if (theInfOperationsFactory != null) {
				return theInfOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfOperationsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfOperationsFactory() {
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
			case InfOperationsPackage.OUTAGE_RECORD: return createOutageRecord();
			case InfOperationsPackage.OUTAGE_REPORT: return createOutageReport();
			case InfOperationsPackage.CHANGE_ITEM: return createChangeItem();
			case InfOperationsPackage.PSR_EVENT: return createPSREvent();
			case InfOperationsPackage.PLANNED_OUTAGE: return createPlannedOutage();
			case InfOperationsPackage.CIRCUIT_SECTION: return createCircuitSection();
			case InfOperationsPackage.SAFETY_DOCUMENT: return createSafetyDocument();
			case InfOperationsPackage.OPERATIONAL_RESTRICTION: return createOperationalRestriction();
			case InfOperationsPackage.CHANGE_SET: return createChangeSet();
			case InfOperationsPackage.SWITCHING_SCHEDULE: return createSwitchingSchedule();
			case InfOperationsPackage.CIRCUIT: return createCircuit();
			case InfOperationsPackage.NETWORK_DATA_SET: return createNetworkDataSet();
			case InfOperationsPackage.OUTAGE_STEP: return createOutageStep();
			case InfOperationsPackage.ORG_PSR_ROLE: return createOrgPsrRole();
			case InfOperationsPackage.OUTAGE_CODE: return createOutageCode();
			case InfOperationsPackage.INCIDENT_CODE: return createIncidentCode();
			case InfOperationsPackage.LAND_BASE: return createLandBase();
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE: return createErpPersonScheduleStepRole();
			case InfOperationsPackage.SWITCHING_STEP: return createSwitchingStep();
			case InfOperationsPackage.CALL_BACK: return createCallBack();
			case InfOperationsPackage.TROUBLE_TICKET: return createTroubleTicket();
			case InfOperationsPackage.INCIDENT_RECORD: return createIncidentRecord();
			case InfOperationsPackage.OUTAGE_NOTIFICATION: return createOutageNotification();
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE: return createOutageStepPsrRole();
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
			case InfOperationsPackage.SWITCHING_STEP_STATUS_KIND:
				return createSwitchingStepStatusKindFromString(eDataType, initialValue);
			case InfOperationsPackage.CIRCUIT_CONNECTION_KIND:
				return createCircuitConnectionKindFromString(eDataType, initialValue);
			case InfOperationsPackage.PSR_EVENT_KIND:
				return createPSREventKindFromString(eDataType, initialValue);
			case InfOperationsPackage.TROUBLE_REPORTING_KIND:
				return createTroubleReportingKindFromString(eDataType, initialValue);
			case InfOperationsPackage.CHANGE_ITEM_KIND:
				return createChangeItemKindFromString(eDataType, initialValue);
			case InfOperationsPackage.OUTAGE_KIND:
				return createOutageKindFromString(eDataType, initialValue);
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
			case InfOperationsPackage.SWITCHING_STEP_STATUS_KIND:
				return convertSwitchingStepStatusKindToString(eDataType, instanceValue);
			case InfOperationsPackage.CIRCUIT_CONNECTION_KIND:
				return convertCircuitConnectionKindToString(eDataType, instanceValue);
			case InfOperationsPackage.PSR_EVENT_KIND:
				return convertPSREventKindToString(eDataType, instanceValue);
			case InfOperationsPackage.TROUBLE_REPORTING_KIND:
				return convertTroubleReportingKindToString(eDataType, instanceValue);
			case InfOperationsPackage.CHANGE_ITEM_KIND:
				return convertChangeItemKindToString(eDataType, instanceValue);
			case InfOperationsPackage.OUTAGE_KIND:
				return convertOutageKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageRecord createOutageRecord() {
		OutageRecord outageRecord = new OutageRecord();
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageReport createOutageReport() {
		OutageReport outageReport = new OutageReport();
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeItem createChangeItem() {
		ChangeItem changeItem = new ChangeItem();
		return changeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSREvent createPSREvent() {
		PSREvent psrEvent = new PSREvent();
		return psrEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedOutage createPlannedOutage() {
		PlannedOutage plannedOutage = new PlannedOutage();
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitSection createCircuitSection() {
		CircuitSection circuitSection = new CircuitSection();
		return circuitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyDocument createSafetyDocument() {
		SafetyDocument safetyDocument = new SafetyDocument();
		return safetyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalRestriction createOperationalRestriction() {
		OperationalRestriction operationalRestriction = new OperationalRestriction();
		return operationalRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSet createChangeSet() {
		ChangeSet changeSet = new ChangeSet();
		return changeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingSchedule createSwitchingSchedule() {
		SwitchingSchedule switchingSchedule = new SwitchingSchedule();
		return switchingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit createCircuit() {
		Circuit circuit = new Circuit();
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDataSet createNetworkDataSet() {
		NetworkDataSet networkDataSet = new NetworkDataSet();
		return networkDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStep createOutageStep() {
		OutageStep outageStep = new OutageStep();
		return outageStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgPsrRole createOrgPsrRole() {
		OrgPsrRole orgPsrRole = new OrgPsrRole();
		return orgPsrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageCode createOutageCode() {
		OutageCode outageCode = new OutageCode();
		return outageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentCode createIncidentCode() {
		IncidentCode incidentCode = new IncidentCode();
		return incidentCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandBase createLandBase() {
		LandBase landBase = new LandBase();
		return landBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonScheduleStepRole createErpPersonScheduleStepRole() {
		ErpPersonScheduleStepRole erpPersonScheduleStepRole = new ErpPersonScheduleStepRole();
		return erpPersonScheduleStepRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStep createSwitchingStep() {
		SwitchingStep switchingStep = new SwitchingStep();
		return switchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBack createCallBack() {
		CallBack callBack = new CallBack();
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroubleTicket createTroubleTicket() {
		TroubleTicket troubleTicket = new TroubleTicket();
		return troubleTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentRecord createIncidentRecord() {
		IncidentRecord incidentRecord = new IncidentRecord();
		return incidentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageNotification createOutageNotification() {
		OutageNotification outageNotification = new OutageNotification();
		return outageNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStepPsrRole createOutageStepPsrRole() {
		OutageStepPsrRole outageStepPsrRole = new OutageStepPsrRole();
		return outageStepPsrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStepStatusKind createSwitchingStepStatusKindFromString(EDataType eDataType, String initialValue) {
		SwitchingStepStatusKind result = SwitchingStepStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwitchingStepStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitConnectionKind createCircuitConnectionKindFromString(EDataType eDataType, String initialValue) {
		CircuitConnectionKind result = CircuitConnectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCircuitConnectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSREventKind createPSREventKindFromString(EDataType eDataType, String initialValue) {
		PSREventKind result = PSREventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPSREventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroubleReportingKind createTroubleReportingKindFromString(EDataType eDataType, String initialValue) {
		TroubleReportingKind result = TroubleReportingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTroubleReportingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeItemKind createChangeItemKindFromString(EDataType eDataType, String initialValue) {
		ChangeItemKind result = ChangeItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageKind createOutageKindFromString(EDataType eDataType, String initialValue) {
		OutageKind result = OutageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfOperationsPackage getInfOperationsPackage() {
		return (InfOperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfOperationsPackage getPackage() {
		return InfOperationsPackage.eINSTANCE;
	}

} //InfOperationsFactory
