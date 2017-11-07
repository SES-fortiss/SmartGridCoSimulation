/**
 */
package CIM15.IEC61970.Meas;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#getLimitSets <em>Limit Sets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#getAnalogValues <em>Analog Values</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Analog extends Measurement {
	/**
	 * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitSets()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogLimitSet> limitSets;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * This is true if the Max Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValueESet;

	/**
	 * The cached value of the '{@link #getAnalogValues() <em>Analog Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogValue> analogValues;

	/**
	 * The cached value of the '{@link #getSetPoint() <em>Set Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPoint()
	 * @generated
	 * @ordered
	 */
	protected SetPoint setPoint;

	/**
	 * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected float normalValue = NORMAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Normal Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalValueESet;

	/**
	 * The default value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_FLOW_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

	/**
	 * This is true if the Positive Flow In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowInESet;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
	 * This is true if the Min Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Analog() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG;
	}

	/**
	 * Returns the value of the '<em><b>Limit Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.AnalogLimitSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AnalogLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Sets</em>' reference list.
	 * @see CIM15.IEC61970.Meas.AnalogLimitSet#getMeasurements
	 * @generated
	 */
	public EList<AnalogLimitSet> getLimitSets() {
		if (limitSets == null) {
			limitSets = new BasicInternalEList<AnalogLimitSet>(AnalogLimitSet.class);
		}
		return limitSets;
	}

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(float)
	 * @generated
	 */
	public float getMaxValue() {
		return maxValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	public void setMaxValue(float newMaxValue) {
		maxValue = newMaxValue;
		maxValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(float)
	 * @generated
	 */
	public void unsetMaxValue() {
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(float)
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return maxValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Analog Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.AnalogValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.AnalogValue#getAnalog
	 * @generated
	 */
	public EList<AnalogValue> getAnalogValues() {
		if (analogValues == null) {
			analogValues = new BasicInternalEList<AnalogValue>(AnalogValue.class);
		}
		return analogValues;
	}

	/**
	 * Returns the value of the '<em><b>Set Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Point</em>' reference.
	 * @see #setSetPoint(SetPoint)
	 * @see CIM15.IEC61970.Meas.SetPoint#getAnalog
	 * @generated
	 */
	public SetPoint getSetPoint() {
		if (setPoint != null && setPoint.eIsProxy()) {
			InternalEObject oldSetPoint = (InternalEObject)setPoint;
			setPoint = (SetPoint)eResolveProxy(oldSetPoint);
			if (setPoint != oldSetPoint) {
			}
		}
		return setPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPoint basicGetSetPoint() {
		return setPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPoint(SetPoint newSetPoint, NotificationChain msgs) {
		SetPoint oldSetPoint = setPoint;
		setPoint = newSetPoint;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Point</em>' reference.
	 * @see #getSetPoint()
	 * @generated
	 */
	public void setSetPoint(SetPoint newSetPoint) {
		if (newSetPoint != setPoint) {
			NotificationChain msgs = null;
			if (setPoint != null)
				msgs = ((InternalEObject)setPoint).eInverseRemove(this, MeasPackage.SET_POINT__ANALOG, SetPoint.class, msgs);
			if (newSetPoint != null)
				msgs = ((InternalEObject)newSetPoint).eInverseAdd(this, MeasPackage.SET_POINT__ANALOG, SetPoint.class, msgs);
			msgs = basicSetSetPoint(newSetPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #isSetNormalValue()
	 * @see #unsetNormalValue()
	 * @see #setNormalValue(float)
	 * @generated
	 */
	public float getNormalValue() {
		return normalValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #isSetNormalValue()
	 * @see #unsetNormalValue()
	 * @see #getNormalValue()
	 * @generated
	 */
	public void setNormalValue(float newNormalValue) {
		normalValue = newNormalValue;
		normalValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalValue()
	 * @see #getNormalValue()
	 * @see #setNormalValue(float)
	 * @generated
	 */
	public void unsetNormalValue() {
		normalValue = NORMAL_VALUE_EDEFAULT;
		normalValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Value</em>' attribute is set.
	 * @see #unsetNormalValue()
	 * @see #getNormalValue()
	 * @see #setNormalValue(float)
	 * @generated
	 */
	public boolean isSetNormalValue() {
		return normalValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isSetPositiveFlowIn()
	 * @see #unsetPositiveFlowIn()
	 * @see #setPositiveFlowIn(boolean)
	 * @generated
	 */
	public boolean isPositiveFlowIn() {
		return positiveFlowIn;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isSetPositiveFlowIn()
	 * @see #unsetPositiveFlowIn()
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	public void setPositiveFlowIn(boolean newPositiveFlowIn) {
		positiveFlowIn = newPositiveFlowIn;
		positiveFlowInESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositiveFlowIn()
	 * @see #isPositiveFlowIn()
	 * @see #setPositiveFlowIn(boolean)
	 * @generated
	 */
	public void unsetPositiveFlowIn() {
		positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;
		positiveFlowInESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Positive Flow In</em>' attribute is set.
	 * @see #unsetPositiveFlowIn()
	 * @see #isPositiveFlowIn()
	 * @see #setPositiveFlowIn(boolean)
	 * @generated
	 */
	public boolean isSetPositiveFlowIn() {
		return positiveFlowInESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(float)
	 * @generated
	 */
	public float getMinValue() {
		return minValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	public void setMinValue(float newMinValue) {
		minValue = newMinValue;
		minValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(float)
	 * @generated
	 */
	public void unsetMinValue() {
		minValue = MIN_VALUE_EDEFAULT;
		minValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(float)
	 * @generated
	 */
	public boolean isSetMinValue() {
		return minValueESet;
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
			case MeasPackage.ANALOG__LIMIT_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimitSets()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnalogValues()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG__SET_POINT:
				if (setPoint != null)
					msgs = ((InternalEObject)setPoint).eInverseRemove(this, MeasPackage.SET_POINT__ANALOG, SetPoint.class, msgs);
				return basicSetSetPoint((SetPoint)otherEnd, msgs);
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
			case MeasPackage.ANALOG__LIMIT_SETS:
				return ((InternalEList<?>)getLimitSets()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return ((InternalEList<?>)getAnalogValues()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG__SET_POINT:
				return basicSetSetPoint(null, msgs);
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
			case MeasPackage.ANALOG__LIMIT_SETS:
				return getLimitSets();
			case MeasPackage.ANALOG__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return getAnalogValues();
			case MeasPackage.ANALOG__SET_POINT:
				if (resolve) return getSetPoint();
				return basicGetSetPoint();
			case MeasPackage.ANALOG__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
			case MeasPackage.ANALOG__MIN_VALUE:
				return getMinValue();
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
			case MeasPackage.ANALOG__LIMIT_SETS:
				getLimitSets().clear();
				getLimitSets().addAll((Collection<? extends AnalogLimitSet>)newValue);
				return;
			case MeasPackage.ANALOG__MAX_VALUE:
				setMaxValue((Float)newValue);
				return;
			case MeasPackage.ANALOG__ANALOG_VALUES:
				getAnalogValues().clear();
				getAnalogValues().addAll((Collection<? extends AnalogValue>)newValue);
				return;
			case MeasPackage.ANALOG__SET_POINT:
				setSetPoint((SetPoint)newValue);
				return;
			case MeasPackage.ANALOG__NORMAL_VALUE:
				setNormalValue((Float)newValue);
				return;
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
				return;
			case MeasPackage.ANALOG__MIN_VALUE:
				setMinValue((Float)newValue);
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
			case MeasPackage.ANALOG__LIMIT_SETS:
				getLimitSets().clear();
				return;
			case MeasPackage.ANALOG__MAX_VALUE:
				unsetMaxValue();
				return;
			case MeasPackage.ANALOG__ANALOG_VALUES:
				getAnalogValues().clear();
				return;
			case MeasPackage.ANALOG__SET_POINT:
				setSetPoint((SetPoint)null);
				return;
			case MeasPackage.ANALOG__NORMAL_VALUE:
				unsetNormalValue();
				return;
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				unsetPositiveFlowIn();
				return;
			case MeasPackage.ANALOG__MIN_VALUE:
				unsetMinValue();
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
			case MeasPackage.ANALOG__LIMIT_SETS:
				return limitSets != null && !limitSets.isEmpty();
			case MeasPackage.ANALOG__MAX_VALUE:
				return isSetMaxValue();
			case MeasPackage.ANALOG__ANALOG_VALUES:
				return analogValues != null && !analogValues.isEmpty();
			case MeasPackage.ANALOG__SET_POINT:
				return setPoint != null;
			case MeasPackage.ANALOG__NORMAL_VALUE:
				return isSetNormalValue();
			case MeasPackage.ANALOG__POSITIVE_FLOW_IN:
				return isSetPositiveFlowIn();
			case MeasPackage.ANALOG__MIN_VALUE:
				return isSetMinValue();
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
		result.append(" (maxValue: ");
		if (maxValueESet) result.append(maxValue); else result.append("<unset>");
		result.append(", normalValue: ");
		if (normalValueESet) result.append(normalValue); else result.append("<unset>");
		result.append(", positiveFlowIn: ");
		if (positiveFlowInESet) result.append(positiveFlowIn); else result.append("<unset>");
		result.append(", minValue: ");
		if (minValueESet) result.append(minValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Analog
