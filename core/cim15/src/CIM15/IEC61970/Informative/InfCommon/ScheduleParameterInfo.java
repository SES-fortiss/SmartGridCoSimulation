/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.InspectionDataSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Parameter Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet <em>For Inspection Data Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getRequestedWindow <em>Requested Window</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getDocuments <em>Documents</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getEstimatedWindow <em>Estimated Window</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleParameterInfo extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getForInspectionDataSet() <em>For Inspection Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForInspectionDataSet()
	 * @generated
	 * @ordered
	 */
	protected InspectionDataSet forInspectionDataSet;

	/**
	 * The cached value of the '{@link #getRequestedWindow() <em>Requested Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedWindow()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval requestedWindow;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * The cached value of the '{@link #getEstimatedWindow() <em>Estimated Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedWindow()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval estimatedWindow;

	/**
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledEvent> scheduledEvents;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleParameterInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.SCHEDULE_PARAMETER_INFO;
	}

	/**
	 * Returns the value of the '<em><b>For Inspection Data Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Inspection Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Inspection Data Set</em>' reference.
	 * @see #setForInspectionDataSet(InspectionDataSet)
	 * @see CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules
	 * @generated
	 */
	public InspectionDataSet getForInspectionDataSet() {
		if (forInspectionDataSet != null && forInspectionDataSet.eIsProxy()) {
			InternalEObject oldForInspectionDataSet = (InternalEObject)forInspectionDataSet;
			forInspectionDataSet = (InspectionDataSet)eResolveProxy(oldForInspectionDataSet);
			if (forInspectionDataSet != oldForInspectionDataSet) {
			}
		}
		return forInspectionDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InspectionDataSet basicGetForInspectionDataSet() {
		return forInspectionDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForInspectionDataSet(InspectionDataSet newForInspectionDataSet, NotificationChain msgs) {
		InspectionDataSet oldForInspectionDataSet = forInspectionDataSet;
		forInspectionDataSet = newForInspectionDataSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet <em>For Inspection Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Inspection Data Set</em>' reference.
	 * @see #getForInspectionDataSet()
	 * @generated
	 */
	public void setForInspectionDataSet(InspectionDataSet newForInspectionDataSet) {
		if (newForInspectionDataSet != forInspectionDataSet) {
			NotificationChain msgs = null;
			if (forInspectionDataSet != null)
				msgs = ((InternalEObject)forInspectionDataSet).eInverseRemove(this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs);
			if (newForInspectionDataSet != null)
				msgs = ((InternalEObject)newForInspectionDataSet).eInverseAdd(this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs);
			msgs = basicSetForInspectionDataSet(newForInspectionDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Requested Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Window</em>' containment reference.
	 * @see #setRequestedWindow(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getRequestedWindow() {
		return requestedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedWindow(DateTimeInterval newRequestedWindow, NotificationChain msgs) {
		DateTimeInterval oldRequestedWindow = requestedWindow;
		requestedWindow = newRequestedWindow;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getRequestedWindow <em>Requested Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Window</em>' containment reference.
	 * @see #getRequestedWindow()
	 * @generated
	 */
	public void setRequestedWindow(DateTimeInterval newRequestedWindow) {
		if (newRequestedWindow != requestedWindow) {
			NotificationChain msgs = null;
			if (requestedWindow != null)
				msgs = ((InternalEObject)requestedWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW, null, msgs);
			if (newRequestedWindow != null)
				msgs = ((InternalEObject)newRequestedWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW, null, msgs);
			msgs = basicSetRequestedWindow(newRequestedWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see CIM15.IEC61968.Common.Document#getScheduleParameterInfos
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new BasicInternalEList<Document>(Document.class);
		}
		return documents;
	}

	/**
	 * Returns the value of the '<em><b>Estimated Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Window</em>' containment reference.
	 * @see #setEstimatedWindow(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getEstimatedWindow() {
		return estimatedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstimatedWindow(DateTimeInterval newEstimatedWindow, NotificationChain msgs) {
		DateTimeInterval oldEstimatedWindow = estimatedWindow;
		estimatedWindow = newEstimatedWindow;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getEstimatedWindow <em>Estimated Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Window</em>' containment reference.
	 * @see #getEstimatedWindow()
	 * @generated
	 */
	public void setEstimatedWindow(DateTimeInterval newEstimatedWindow) {
		if (newEstimatedWindow != estimatedWindow) {
			NotificationChain msgs = null;
			if (estimatedWindow != null)
				msgs = ((InternalEObject)estimatedWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW, null, msgs);
			if (newEstimatedWindow != null)
				msgs = ((InternalEObject)newEstimatedWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW, null, msgs);
			msgs = basicSetEstimatedWindow(newEstimatedWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo <em>Schedule Parameter Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new BasicInternalEList<ScheduledEvent>(ScheduledEvent.class);
		}
		return scheduledEvents;
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				if (forInspectionDataSet != null)
					msgs = ((InternalEObject)forInspectionDataSet).eInverseRemove(this, InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs);
				return basicSetForInspectionDataSet((InspectionDataSet)otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				return basicSetForInspectionDataSet(null, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				return basicSetRequestedWindow(null, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				return basicSetEstimatedWindow(null, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				return basicSetStatus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				if (resolve) return getForInspectionDataSet();
				return basicGetForInspectionDataSet();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				return getRequestedWindow();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return getDocuments();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				return getEstimatedWindow();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				setForInspectionDataSet((InspectionDataSet)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				setRequestedWindow((DateTimeInterval)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				setEstimatedWindow((DateTimeInterval)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				setStatus((Status)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				setForInspectionDataSet((InspectionDataSet)null);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				setRequestedWindow((DateTimeInterval)null);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				getDocuments().clear();
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				setEstimatedWindow((DateTimeInterval)null);
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				setStatus((Status)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__FOR_INSPECTION_DATA_SET:
				return forInspectionDataSet != null;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__REQUESTED_WINDOW:
				return requestedWindow != null;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__ESTIMATED_WINDOW:
				return estimatedWindow != null;
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} // ScheduleParameterInfo
