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
 * A representation of the model object '<em><b>Accumulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Accumulator#getLimitSets <em>Limit Sets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Accumulator extends Measurement {
	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * This is true if the Max Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValueESet;

	/**
	 * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitSets()
	 * @generated
	 * @ordered
	 */
	protected EList<AccumulatorLimitSet> limitSets;

	/**
	 * The cached value of the '{@link #getAccumulatorValues() <em>Accumulator Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulatorValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AccumulatorValue> accumulatorValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Accumulator() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ACCUMULATOR;
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
	 * @see #setMaxValue(int)
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		maxValue = newMaxValue;
		maxValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	public void unsetMaxValue() {
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return maxValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Limit Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.AccumulatorLimitSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Sets</em>' reference list.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimitSet#getMeasurements
	 * @generated
	 */
	public EList<AccumulatorLimitSet> getLimitSets() {
		if (limitSets == null) {
			limitSets = new BasicInternalEList<AccumulatorLimitSet>(AccumulatorLimitSet.class);
		}
		return limitSets;
	}

	/**
	 * Returns the value of the '<em><b>Accumulator Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.AccumulatorValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AccumulatorValue#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.AccumulatorValue#getAccumulator
	 * @generated
	 */
	public EList<AccumulatorValue> getAccumulatorValues() {
		if (accumulatorValues == null) {
			accumulatorValues = new BasicInternalEList<AccumulatorValue>(AccumulatorValue.class);
		}
		return accumulatorValues;
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
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimitSets()).basicAdd(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccumulatorValues()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return ((InternalEList<?>)getLimitSets()).basicRemove(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return ((InternalEList<?>)getAccumulatorValues()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return getLimitSets();
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return getAccumulatorValues();
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
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				setMaxValue((Integer)newValue);
				return;
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				getLimitSets().clear();
				getLimitSets().addAll((Collection<? extends AccumulatorLimitSet>)newValue);
				return;
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				getAccumulatorValues().clear();
				getAccumulatorValues().addAll((Collection<? extends AccumulatorValue>)newValue);
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
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				unsetMaxValue();
				return;
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				getLimitSets().clear();
				return;
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				getAccumulatorValues().clear();
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
			case MeasPackage.ACCUMULATOR__MAX_VALUE:
				return isSetMaxValue();
			case MeasPackage.ACCUMULATOR__LIMIT_SETS:
				return limitSets != null && !limitSets.isEmpty();
			case MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
				return accumulatorValues != null && !accumulatorValues.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} // Accumulator
