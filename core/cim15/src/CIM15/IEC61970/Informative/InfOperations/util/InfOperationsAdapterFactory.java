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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage
 * @generated
 */
public class InfOperationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfOperationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfOperationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfOperationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfOperationsSwitch<Adapter> modelSwitch =
		new InfOperationsSwitch<Adapter>() {
			@Override
			public Adapter caseOutageRecord(OutageRecord object) {
				return createOutageRecordAdapter();
			}
			@Override
			public Adapter caseOutageReport(OutageReport object) {
				return createOutageReportAdapter();
			}
			@Override
			public Adapter caseChangeItem(ChangeItem object) {
				return createChangeItemAdapter();
			}
			@Override
			public Adapter casePSREvent(PSREvent object) {
				return createPSREventAdapter();
			}
			@Override
			public Adapter casePlannedOutage(PlannedOutage object) {
				return createPlannedOutageAdapter();
			}
			@Override
			public Adapter caseCircuitSection(CircuitSection object) {
				return createCircuitSectionAdapter();
			}
			@Override
			public Adapter caseSafetyDocument(SafetyDocument object) {
				return createSafetyDocumentAdapter();
			}
			@Override
			public Adapter caseOperationalRestriction(OperationalRestriction object) {
				return createOperationalRestrictionAdapter();
			}
			@Override
			public Adapter caseChangeSet(ChangeSet object) {
				return createChangeSetAdapter();
			}
			@Override
			public Adapter caseSwitchingSchedule(SwitchingSchedule object) {
				return createSwitchingScheduleAdapter();
			}
			@Override
			public Adapter caseCircuit(Circuit object) {
				return createCircuitAdapter();
			}
			@Override
			public Adapter caseNetworkDataSet(NetworkDataSet object) {
				return createNetworkDataSetAdapter();
			}
			@Override
			public Adapter caseOutageStep(OutageStep object) {
				return createOutageStepAdapter();
			}
			@Override
			public Adapter caseOrgPsrRole(OrgPsrRole object) {
				return createOrgPsrRoleAdapter();
			}
			@Override
			public Adapter caseOutageCode(OutageCode object) {
				return createOutageCodeAdapter();
			}
			@Override
			public Adapter caseIncidentCode(IncidentCode object) {
				return createIncidentCodeAdapter();
			}
			@Override
			public Adapter caseLandBase(LandBase object) {
				return createLandBaseAdapter();
			}
			@Override
			public Adapter caseErpPersonScheduleStepRole(ErpPersonScheduleStepRole object) {
				return createErpPersonScheduleStepRoleAdapter();
			}
			@Override
			public Adapter caseSwitchingStep(SwitchingStep object) {
				return createSwitchingStepAdapter();
			}
			@Override
			public Adapter caseCallBack(CallBack object) {
				return createCallBackAdapter();
			}
			@Override
			public Adapter caseTroubleTicket(TroubleTicket object) {
				return createTroubleTicketAdapter();
			}
			@Override
			public Adapter caseIncidentRecord(IncidentRecord object) {
				return createIncidentRecordAdapter();
			}
			@Override
			public Adapter caseOutageNotification(OutageNotification object) {
				return createOutageNotificationAdapter();
			}
			@Override
			public Adapter caseOutageStepPsrRole(OutageStepPsrRole object) {
				return createOutageStepPsrRoleAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseActivityRecord(ActivityRecord object) {
				return createActivityRecordAdapter();
			}
			@Override
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
				return createConnectivityNodeContainerAdapter();
			}
			@Override
			public Adapter caseEquipmentContainer(EquipmentContainer object) {
				return createEquipmentContainerAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord
	 * @generated
	 */
	public Adapter createOutageRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport
	 * @generated
	 */
	public Adapter createOutageReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem <em>Change Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem
	 * @generated
	 */
	public Adapter createChangeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent <em>PSR Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent
	 * @generated
	 */
	public Adapter createPSREventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage
	 * @generated
	 */
	public Adapter createPlannedOutageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection
	 * @generated
	 */
	public Adapter createCircuitSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument <em>Safety Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument
	 * @generated
	 */
	public Adapter createSafetyDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction <em>Operational Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OperationalRestriction
	 * @generated
	 */
	public Adapter createOperationalRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet
	 * @generated
	 */
	public Adapter createChangeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule
	 * @generated
	 */
	public Adapter createSwitchingScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.Circuit
	 * @generated
	 */
	public Adapter createCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet
	 * @generated
	 */
	public Adapter createNetworkDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep
	 * @generated
	 */
	public Adapter createOutageStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole <em>Org Psr Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole
	 * @generated
	 */
	public Adapter createOrgPsrRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode <em>Outage Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode
	 * @generated
	 */
	public Adapter createOutageCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode <em>Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode
	 * @generated
	 */
	public Adapter createIncidentCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.LandBase <em>Land Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.LandBase
	 * @generated
	 */
	public Adapter createLandBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole <em>Erp Person Schedule Step Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole
	 * @generated
	 */
	public Adapter createErpPersonScheduleStepRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep
	 * @generated
	 */
	public Adapter createSwitchingStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.CallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack
	 * @generated
	 */
	public Adapter createCallBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket <em>Trouble Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket
	 * @generated
	 */
	public Adapter createTroubleTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord
	 * @generated
	 */
	public Adapter createIncidentRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification <em>Outage Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification
	 * @generated
	 */
	public Adapter createOutageNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole <em>Outage Step Psr Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole
	 * @generated
	 */
	public Adapter createOutageStepPsrRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.ActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.ActivityRecord
	 * @generated
	 */
	public Adapter createActivityRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer
	 * @generated
	 */
	public Adapter createConnectivityNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.EquipmentContainer
	 * @generated
	 */
	public Adapter createEquipmentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCommon.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCommon.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InfOperationsAdapterFactory
