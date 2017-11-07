/**
 */
package CIM15.IEC61970.Core;

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
 * A representation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularIntervalSchedule extends BasicIntervalSchedule {
	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * This is true if the End Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endTimeESet;

	/**
	 * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_STEP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected float timeStep = TIME_STEP_EDEFAULT;

	/**
	 * This is true if the Time Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeStepESet;

	/**
	 * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RegularTimePoint> timePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularIntervalSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REGULAR_INTERVAL_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #isSetEndTime()
	 * @see #unsetEndTime()
	 * @see #setEndTime(Date)
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #isSetEndTime()
	 * @see #unsetEndTime()
	 * @see #getEndTime()
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		endTime = newEndTime;
		endTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndTime()
	 * @see #getEndTime()
	 * @see #setEndTime(Date)
	 * @generated
	 */
	public void unsetEndTime() {
		endTime = END_TIME_EDEFAULT;
		endTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Time</em>' attribute is set.
	 * @see #unsetEndTime()
	 * @see #getEndTime()
	 * @see #setEndTime(Date)
	 * @generated
	 */
	public boolean isSetEndTime() {
		return endTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' attribute.
	 * @see #isSetTimeStep()
	 * @see #unsetTimeStep()
	 * @see #setTimeStep(float)
	 * @generated
	 */
	public float getTimeStep() {
		return timeStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' attribute.
	 * @see #isSetTimeStep()
	 * @see #unsetTimeStep()
	 * @see #getTimeStep()
	 * @generated
	 */
	public void setTimeStep(float newTimeStep) {
		timeStep = newTimeStep;
		timeStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeStep()
	 * @see #getTimeStep()
	 * @see #setTimeStep(float)
	 * @generated
	 */
	public void unsetTimeStep() {
		timeStep = TIME_STEP_EDEFAULT;
		timeStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Step</em>' attribute is set.
	 * @see #unsetTimeStep()
	 * @see #getTimeStep()
	 * @see #setTimeStep(float)
	 * @generated
	 */
	public boolean isSetTimeStep() {
		return timeStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.RegularTimePoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Points</em>' reference list.
	 * @see CIM15.IEC61970.Core.RegularTimePoint#getIntervalSchedule
	 * @generated
	 */
	public EList<RegularTimePoint> getTimePoints() {
		if (timePoints == null) {
			timePoints = new BasicInternalEList<RegularTimePoint>(RegularTimePoint.class);
		}
		return timePoints;
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return ((InternalEList<?>)getTimePoints()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				return getEndTime();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				return getTimeStep();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return getTimePoints();
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				setEndTime((Date)newValue);
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				setTimeStep((Float)newValue);
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
				getTimePoints().addAll((Collection<? extends RegularTimePoint>)newValue);
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				unsetEndTime();
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				unsetTimeStep();
				return;
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				getTimePoints().clear();
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
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
				return isSetEndTime();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
				return isSetTimeStep();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
				return timePoints != null && !timePoints.isEmpty();
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
		result.append(" (endTime: ");
		if (endTimeESet) result.append(endTime); else result.append("<unset>");
		result.append(", timeStep: ");
		if (timeStepESet) result.append(timeStep); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RegularIntervalSchedule
