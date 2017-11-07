/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfCommon.ScheduledEvent;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getWindow <em>Window</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimePoint extends IdentifiedObject {
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
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateTimeESet;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval window;

	/**
	 * The cached value of the '{@link #getTimeSchedule() <em>Time Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSchedule()
	 * @generated
	 * @ordered
	 */
	protected TimeSchedule timeSchedule;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

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
	 * The default value of the '{@link #getRelativeTimeInterval() <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float RELATIVE_TIME_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRelativeTimeInterval() <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected float relativeTimeInterval = RELATIVE_TIME_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Relative Time Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativeTimeIntervalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TIME_POINT;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.TIME_POINT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.TIME_POINT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		dateTime = newDateTime;
		dateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public void unsetDateTime() {
		dateTime = DATE_TIME_EDEFAULT;
		dateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimePoint#getDateTime <em>Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Time</em>' attribute is set.
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public boolean isSetDateTime() {
		return dateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference.
	 * @see #setWindow(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindow(DateTimeInterval newWindow, NotificationChain msgs) {
		DateTimeInterval oldWindow = window;
		window = newWindow;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getWindow <em>Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' containment reference.
	 * @see #getWindow()
	 * @generated
	 */
	public void setWindow(DateTimeInterval newWindow) {
		if (newWindow != window) {
			NotificationChain msgs = null;
			if (window != null)
				msgs = ((InternalEObject)window).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.TIME_POINT__WINDOW, null, msgs);
			if (newWindow != null)
				msgs = ((InternalEObject)newWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.TIME_POINT__WINDOW, null, msgs);
			msgs = basicSetWindow(newWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Time Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.TimeSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Schedule</em>' reference.
	 * @see #setTimeSchedule(TimeSchedule)
	 * @see CIM15.IEC61968.Common.TimeSchedule#getTimePoints
	 * @generated
	 */
	public TimeSchedule getTimeSchedule() {
		if (timeSchedule != null && timeSchedule.eIsProxy()) {
			InternalEObject oldTimeSchedule = (InternalEObject)timeSchedule;
			timeSchedule = (TimeSchedule)eResolveProxy(oldTimeSchedule);
			if (timeSchedule != oldTimeSchedule) {
			}
		}
		return timeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSchedule basicGetTimeSchedule() {
		return timeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSchedule(TimeSchedule newTimeSchedule, NotificationChain msgs) {
		TimeSchedule oldTimeSchedule = timeSchedule;
		timeSchedule = newTimeSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Schedule</em>' reference.
	 * @see #getTimeSchedule()
	 * @generated
	 */
	public void setTimeSchedule(TimeSchedule newTimeSchedule) {
		if (newTimeSchedule != timeSchedule) {
			NotificationChain msgs = null;
			if (timeSchedule != null)
				msgs = ((InternalEObject)timeSchedule).eInverseRemove(this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs);
			if (newTimeSchedule != null)
				msgs = ((InternalEObject)newTimeSchedule).eInverseAdd(this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs);
			msgs = basicSetTimeSchedule(newTimeSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimePoint#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint <em>Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new BasicInternalEList<ScheduledEvent>(ScheduledEvent.class);
		}
		return scheduledEvents;
	}

	/**
	 * Returns the value of the '<em><b>Relative Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Time Interval</em>' attribute.
	 * @see #isSetRelativeTimeInterval()
	 * @see #unsetRelativeTimeInterval()
	 * @see #setRelativeTimeInterval(float)
	 * @generated
	 */
	public float getRelativeTimeInterval() {
		return relativeTimeInterval;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Time Interval</em>' attribute.
	 * @see #isSetRelativeTimeInterval()
	 * @see #unsetRelativeTimeInterval()
	 * @see #getRelativeTimeInterval()
	 * @generated
	 */
	public void setRelativeTimeInterval(float newRelativeTimeInterval) {
		relativeTimeInterval = newRelativeTimeInterval;
		relativeTimeIntervalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeTimeInterval()
	 * @see #getRelativeTimeInterval()
	 * @see #setRelativeTimeInterval(float)
	 * @generated
	 */
	public void unsetRelativeTimeInterval() {
		relativeTimeInterval = RELATIVE_TIME_INTERVAL_EDEFAULT;
		relativeTimeIntervalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimePoint#getRelativeTimeInterval <em>Relative Time Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Time Interval</em>' attribute is set.
	 * @see #unsetRelativeTimeInterval()
	 * @see #getRelativeTimeInterval()
	 * @see #setRelativeTimeInterval(float)
	 * @generated
	 */
	public boolean isSetRelativeTimeInterval() {
		return relativeTimeIntervalESet;
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
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				if (timeSchedule != null)
					msgs = ((InternalEObject)timeSchedule).eInverseRemove(this, CommonPackage.TIME_SCHEDULE__TIME_POINTS, TimeSchedule.class, msgs);
				return basicSetTimeSchedule((TimeSchedule)otherEnd, msgs);
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
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
			case CommonPackage.TIME_POINT__STATUS:
				return basicSetStatus(null, msgs);
			case CommonPackage.TIME_POINT__WINDOW:
				return basicSetWindow(null, msgs);
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				return basicSetTimeSchedule(null, msgs);
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.TIME_POINT__STATUS:
				return getStatus();
			case CommonPackage.TIME_POINT__DATE_TIME:
				return getDateTime();
			case CommonPackage.TIME_POINT__WINDOW:
				return getWindow();
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				if (resolve) return getTimeSchedule();
				return basicGetTimeSchedule();
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				return getRelativeTimeInterval();
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
			case CommonPackage.TIME_POINT__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.TIME_POINT__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case CommonPackage.TIME_POINT__WINDOW:
				setWindow((DateTimeInterval)newValue);
				return;
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				setTimeSchedule((TimeSchedule)newValue);
				return;
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				setRelativeTimeInterval((Float)newValue);
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
			case CommonPackage.TIME_POINT__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.TIME_POINT__DATE_TIME:
				unsetDateTime();
				return;
			case CommonPackage.TIME_POINT__WINDOW:
				setWindow((DateTimeInterval)null);
				return;
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				setTimeSchedule((TimeSchedule)null);
				return;
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				unsetRelativeTimeInterval();
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
			case CommonPackage.TIME_POINT__STATUS:
				return status != null;
			case CommonPackage.TIME_POINT__DATE_TIME:
				return isSetDateTime();
			case CommonPackage.TIME_POINT__WINDOW:
				return window != null;
			case CommonPackage.TIME_POINT__TIME_SCHEDULE:
				return timeSchedule != null;
			case CommonPackage.TIME_POINT__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case CommonPackage.TIME_POINT__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case CommonPackage.TIME_POINT__RELATIVE_TIME_INTERVAL:
				return isSetRelativeTimeInterval();
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
		result.append(" (dateTime: ");
		if (dateTimeESet) result.append(dateTime); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(", relativeTimeInterval: ");
		if (relativeTimeIntervalESet) result.append(relativeTimeInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TimePoint
