/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfWork.Crew;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.WorkTask;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps <em>Schedule Steps</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchingSchedule extends Document {
	/**
	 * The cached value of the '{@link #getScheduleSteps() <em>Schedule Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingStep> scheduleSteps;

	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * This is true if the Reason attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonESet;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval interval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchingSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.SWITCHING_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Schedule Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Steps</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule
	 * @generated
	 */
	public EList<SwitchingStep> getScheduleSteps() {
		if (scheduleSteps == null) {
			scheduleSteps = new BasicInternalEList<SwitchingStep>(SwitchingStep.class);
		}
		return scheduleSteps;
	}

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	public void setReason(String newReason) {
		reason = newReason;
		reasonESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public void unsetReason() {
		reason = REASON_EDEFAULT;
		reasonESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public boolean isSetReason() {
		return reasonESet;
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules <em>Switching Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
	}

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(DateTimeInterval newInterval, NotificationChain msgs) {
		DateTimeInterval oldInterval = interval;
		interval = newInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	public void setInterval(DateTimeInterval newInterval) {
		if (newInterval != interval) {
			NotificationChain msgs = null;
			if (interval != null)
				msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL, null, msgs);
			if (newInterval != null)
				msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL, null, msgs);
			msgs = basicSetInterval(newInterval, msgs);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleSteps()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return ((InternalEList<?>)getScheduleSteps()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				return basicSetInterval(null, msgs);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return getScheduleSteps();
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				return getReason();
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return getCrews();
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				return getInterval();
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				getScheduleSteps().addAll((Collection<? extends SwitchingStep>)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				setReason((String)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				setInterval((DateTimeInterval)newValue);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				unsetReason();
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				getCrews().clear();
				return;
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				setInterval((DateTimeInterval)null);
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
			case InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS:
				return scheduleSteps != null && !scheduleSteps.isEmpty();
			case InfOperationsPackage.SWITCHING_SCHEDULE__WORK_TASK:
				return workTask != null;
			case InfOperationsPackage.SWITCHING_SCHEDULE__REASON:
				return isSetReason();
			case InfOperationsPackage.SWITCHING_SCHEDULE__CREWS:
				return crews != null && !crews.isEmpty();
			case InfOperationsPackage.SWITCHING_SCHEDULE__INTERVAL:
				return interval != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reason: ");
		if (reasonESet) result.append(reason); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SwitchingSchedule
