/**
 */
package CIM15.IEC61970.Core;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irregular Time Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IrregularTimePoint extends Element {
	/**
	 * The cached value of the '{@link #getIntervalSchedule() <em>Interval Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalSchedule()
	 * @generated
	 * @ordered
	 */
	protected IrregularIntervalSchedule intervalSchedule;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected float time = TIME_EDEFAULT;

	/**
	 * This is true if the Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeESet;

	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected float value1 = VALUE1_EDEFAULT;

	/**
	 * This is true if the Value1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value1ESet;

	/**
	 * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected float value2 = VALUE2_EDEFAULT;

	/**
	 * This is true if the Value2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value2ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrregularTimePoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IRREGULAR_TIME_POINT;
	}

	/**
	 * Returns the value of the '<em><b>Interval Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.IrregularIntervalSchedule#getTimePoints <em>Time Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Schedule</em>' reference.
	 * @see #setIntervalSchedule(IrregularIntervalSchedule)
	 * @see CIM15.IEC61970.Core.IrregularIntervalSchedule#getTimePoints
	 * @generated
	 */
	public IrregularIntervalSchedule getIntervalSchedule() {
		if (intervalSchedule != null && intervalSchedule.eIsProxy()) {
			InternalEObject oldIntervalSchedule = (InternalEObject)intervalSchedule;
			intervalSchedule = (IrregularIntervalSchedule)eResolveProxy(oldIntervalSchedule);
			if (intervalSchedule != oldIntervalSchedule) {
			}
		}
		return intervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularIntervalSchedule basicGetIntervalSchedule() {
		return intervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalSchedule(IrregularIntervalSchedule newIntervalSchedule, NotificationChain msgs) {
		IrregularIntervalSchedule oldIntervalSchedule = intervalSchedule;
		intervalSchedule = newIntervalSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Schedule</em>' reference.
	 * @see #getIntervalSchedule()
	 * @generated
	 */
	public void setIntervalSchedule(IrregularIntervalSchedule newIntervalSchedule) {
		if (newIntervalSchedule != intervalSchedule) {
			NotificationChain msgs = null;
			if (intervalSchedule != null)
				msgs = ((InternalEObject)intervalSchedule).eInverseRemove(this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs);
			if (newIntervalSchedule != null)
				msgs = ((InternalEObject)newIntervalSchedule).eInverseAdd(this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs);
			msgs = basicSetIntervalSchedule(newIntervalSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #isSetTime()
	 * @see #unsetTime()
	 * @see #setTime(float)
	 * @generated
	 */
	public float getTime() {
		return time;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #isSetTime()
	 * @see #unsetTime()
	 * @see #getTime()
	 * @generated
	 */
	public void setTime(float newTime) {
		time = newTime;
		timeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTime()
	 * @see #getTime()
	 * @see #setTime(float)
	 * @generated
	 */
	public void unsetTime() {
		time = TIME_EDEFAULT;
		timeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getTime <em>Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time</em>' attribute is set.
	 * @see #unsetTime()
	 * @see #getTime()
	 * @see #setTime(float)
	 * @generated
	 */
	public boolean isSetTime() {
		return timeESet;
	}

	/**
	 * Returns the value of the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' attribute.
	 * @see #isSetValue1()
	 * @see #unsetValue1()
	 * @see #setValue1(float)
	 * @generated
	 */
	public float getValue1() {
		return value1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' attribute.
	 * @see #isSetValue1()
	 * @see #unsetValue1()
	 * @see #getValue1()
	 * @generated
	 */
	public void setValue1(float newValue1) {
		value1 = newValue1;
		value1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue1()
	 * @see #getValue1()
	 * @see #setValue1(float)
	 * @generated
	 */
	public void unsetValue1() {
		value1 = VALUE1_EDEFAULT;
		value1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue1 <em>Value1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value1</em>' attribute is set.
	 * @see #unsetValue1()
	 * @see #getValue1()
	 * @see #setValue1(float)
	 * @generated
	 */
	public boolean isSetValue1() {
		return value1ESet;
	}

	/**
	 * Returns the value of the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' attribute.
	 * @see #isSetValue2()
	 * @see #unsetValue2()
	 * @see #setValue2(float)
	 * @generated
	 */
	public float getValue2() {
		return value2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' attribute.
	 * @see #isSetValue2()
	 * @see #unsetValue2()
	 * @see #getValue2()
	 * @generated
	 */
	public void setValue2(float newValue2) {
		value2 = newValue2;
		value2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue2()
	 * @see #getValue2()
	 * @see #setValue2(float)
	 * @generated
	 */
	public void unsetValue2() {
		value2 = VALUE2_EDEFAULT;
		value2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.IrregularTimePoint#getValue2 <em>Value2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value2</em>' attribute is set.
	 * @see #unsetValue2()
	 * @see #getValue2()
	 * @see #setValue2(float)
	 * @generated
	 */
	public boolean isSetValue2() {
		return value2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				if (intervalSchedule != null)
					msgs = ((InternalEObject)intervalSchedule).eInverseRemove(this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs);
				return basicSetIntervalSchedule((IrregularIntervalSchedule)otherEnd, msgs);
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
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				return basicSetIntervalSchedule(null, msgs);
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
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				if (resolve) return getIntervalSchedule();
				return basicGetIntervalSchedule();
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				return getTime();
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				return getValue1();
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				return getValue2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				setIntervalSchedule((IrregularIntervalSchedule)newValue);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				setTime((Float)newValue);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				setValue1((Float)newValue);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				setValue2((Float)newValue);
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
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				setIntervalSchedule((IrregularIntervalSchedule)null);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				unsetTime();
				return;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				unsetValue1();
				return;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				unsetValue2();
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
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				return intervalSchedule != null;
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				return isSetTime();
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				return isSetValue1();
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				return isSetValue2();
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
		result.append(" (time: ");
		if (timeESet) result.append(time); else result.append("<unset>");
		result.append(", value1: ");
		if (value1ESet) result.append(value1); else result.append("<unset>");
		result.append(", value2: ");
		if (value2ESet) result.append(value2); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // IrregularTimePoint
