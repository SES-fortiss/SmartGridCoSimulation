/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61970.Domain.DateTimeInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimeSchedule#getTimePoints <em>Time Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeSchedule extends Document {
	/**
	 * The default value of the '{@link #getRecurrencePeriod() <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float RECURRENCE_PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRecurrencePeriod() <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected float recurrencePeriod = RECURRENCE_PERIOD_EDEFAULT;

	/**
	 * This is true if the Recurrence Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recurrencePeriodESet;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * This is true if the Disabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disabledESet;

	/**
	 * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<TimePoint> timePoints;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected float offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * The cached value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval scheduleInterval;

	/**
	 * The default value of the '{@link #getRecurrencePattern() <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurrencePattern() <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrencePattern()
	 * @generated
	 * @ordered
	 */
	protected String recurrencePattern = RECURRENCE_PATTERN_EDEFAULT;

	/**
	 * This is true if the Recurrence Pattern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recurrencePatternESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TIME_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Recurrence Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Period</em>' attribute.
	 * @see #isSetRecurrencePeriod()
	 * @see #unsetRecurrencePeriod()
	 * @see #setRecurrencePeriod(float)
	 * @generated
	 */
	public float getRecurrencePeriod() {
		return recurrencePeriod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Period</em>' attribute.
	 * @see #isSetRecurrencePeriod()
	 * @see #unsetRecurrencePeriod()
	 * @see #getRecurrencePeriod()
	 * @generated
	 */
	public void setRecurrencePeriod(float newRecurrencePeriod) {
		recurrencePeriod = newRecurrencePeriod;
		recurrencePeriodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecurrencePeriod()
	 * @see #getRecurrencePeriod()
	 * @see #setRecurrencePeriod(float)
	 * @generated
	 */
	public void unsetRecurrencePeriod() {
		recurrencePeriod = RECURRENCE_PERIOD_EDEFAULT;
		recurrencePeriodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePeriod <em>Recurrence Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recurrence Period</em>' attribute is set.
	 * @see #unsetRecurrencePeriod()
	 * @see #getRecurrencePeriod()
	 * @see #setRecurrencePeriod(float)
	 * @generated
	 */
	public boolean isSetRecurrencePeriod() {
		return recurrencePeriodESet;
	}

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #setDisabled(boolean)
	 * @generated
	 */
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #isDisabled()
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		disabled = newDisabled;
		disabledESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #isDisabled()
	 * @see #setDisabled(boolean)
	 * @generated
	 */
	public void unsetDisabled() {
		disabled = DISABLED_EDEFAULT;
		disabledESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#isDisabled <em>Disabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled</em>' attribute is set.
	 * @see #unsetDisabled()
	 * @see #isDisabled()
	 * @see #setDisabled(boolean)
	 * @generated
	 */
	public boolean isSetDisabled() {
		return disabledESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.TimePoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.TimePoint#getTimeSchedule <em>Time Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Points</em>' reference list.
	 * @see CIM15.IEC61968.Common.TimePoint#getTimeSchedule
	 * @generated
	 */
	public EList<TimePoint> getTimePoints() {
		if (timePoints == null) {
			timePoints = new BasicInternalEList<TimePoint>(TimePoint.class);
		}
		return timePoints;
	}

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	public void setOffset(float newOffset) {
		offset = newOffset;
		offsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	public void unsetOffset() {
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * Returns the value of the '<em><b>Schedule Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Interval</em>' containment reference.
	 * @see #setScheduleInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getScheduleInterval() {
		return scheduleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleInterval(DateTimeInterval newScheduleInterval, NotificationChain msgs) {
		DateTimeInterval oldScheduleInterval = scheduleInterval;
		scheduleInterval = newScheduleInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getScheduleInterval <em>Schedule Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Interval</em>' containment reference.
	 * @see #getScheduleInterval()
	 * @generated
	 */
	public void setScheduleInterval(DateTimeInterval newScheduleInterval) {
		if (newScheduleInterval != scheduleInterval) {
			NotificationChain msgs = null;
			if (scheduleInterval != null)
				msgs = ((InternalEObject)scheduleInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, null, msgs);
			if (newScheduleInterval != null)
				msgs = ((InternalEObject)newScheduleInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL, null, msgs);
			msgs = basicSetScheduleInterval(newScheduleInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Recurrence Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Pattern</em>' attribute.
	 * @see #isSetRecurrencePattern()
	 * @see #unsetRecurrencePattern()
	 * @see #setRecurrencePattern(String)
	 * @generated
	 */
	public String getRecurrencePattern() {
		return recurrencePattern;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Pattern</em>' attribute.
	 * @see #isSetRecurrencePattern()
	 * @see #unsetRecurrencePattern()
	 * @see #getRecurrencePattern()
	 * @generated
	 */
	public void setRecurrencePattern(String newRecurrencePattern) {
		recurrencePattern = newRecurrencePattern;
		recurrencePatternESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecurrencePattern()
	 * @see #getRecurrencePattern()
	 * @see #setRecurrencePattern(String)
	 * @generated
	 */
	public void unsetRecurrencePattern() {
		recurrencePattern = RECURRENCE_PATTERN_EDEFAULT;
		recurrencePatternESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TimeSchedule#getRecurrencePattern <em>Recurrence Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recurrence Pattern</em>' attribute is set.
	 * @see #unsetRecurrencePattern()
	 * @see #getRecurrencePattern()
	 * @see #setRecurrencePattern(String)
	 * @generated
	 */
	public boolean isSetRecurrencePattern() {
		return recurrencePatternESet;
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
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimePoints()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return ((InternalEList<?>)getTimePoints()).basicRemove(otherEnd, msgs);
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				return basicSetScheduleInterval(null, msgs);
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				return getRecurrencePeriod();
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				return isDisabled();
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return getTimePoints();
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				return getOffset();
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				return getScheduleInterval();
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				return getRecurrencePattern();
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				setRecurrencePeriod((Float)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				getTimePoints().addAll((Collection<? extends TimePoint>)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				setOffset((Float)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				setScheduleInterval((DateTimeInterval)newValue);
				return;
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				setRecurrencePattern((String)newValue);
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				unsetRecurrencePeriod();
				return;
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				unsetDisabled();
				return;
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				return;
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				unsetOffset();
				return;
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				setScheduleInterval((DateTimeInterval)null);
				return;
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				unsetRecurrencePattern();
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
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PERIOD:
				return isSetRecurrencePeriod();
			case CommonPackage.TIME_SCHEDULE__DISABLED:
				return isSetDisabled();
			case CommonPackage.TIME_SCHEDULE__TIME_POINTS:
				return timePoints != null && !timePoints.isEmpty();
			case CommonPackage.TIME_SCHEDULE__OFFSET:
				return isSetOffset();
			case CommonPackage.TIME_SCHEDULE__SCHEDULE_INTERVAL:
				return scheduleInterval != null;
			case CommonPackage.TIME_SCHEDULE__RECURRENCE_PATTERN:
				return isSetRecurrencePattern();
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
		result.append(" (recurrencePeriod: ");
		if (recurrencePeriodESet) result.append(recurrencePeriod); else result.append("<unset>");
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(", recurrencePattern: ");
		if (recurrencePatternESet) result.append(recurrencePattern); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TimeSchedule
