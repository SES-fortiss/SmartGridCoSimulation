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
 * A representation of the model object '<em><b>Accumulator Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.AccumulatorLimitSet#getLimits <em>Limits</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccumulatorLimitSet extends LimitSet {
	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<AccumulatorLimit> limits;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Accumulator> measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccumulatorLimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ACCUMULATOR_LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.AccumulatorLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AccumulatorLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' reference list.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimit#getLimitSet
	 * @generated
	 */
	public EList<AccumulatorLimit> getLimits() {
		if (limits == null) {
			limits = new BasicInternalEList<AccumulatorLimit>(AccumulatorLimit.class);
		}
		return limits;
	}

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Accumulator}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Accumulator#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Accumulator#getLimitSets
	 * @generated
	 */
	public EList<Accumulator> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Accumulator>(Accumulator.class);
		}
		return measurements;
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimits()).basicAdd(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return ((InternalEList<?>)getLimits()).basicRemove(otherEnd, msgs);
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return getLimits();
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return getMeasurements();
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends AccumulatorLimit>)newValue);
				return;
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Accumulator>)newValue);
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				getLimits().clear();
				return;
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
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
			case MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
				return limits != null && !limits.isEmpty();
			case MeasPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AccumulatorLimitSet
