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
 * A representation of the model object '<em><b>Analog Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogLimitSet#getLimits <em>Limits</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogLimitSet#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogLimitSet extends LimitSet {
	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogLimit> limits;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Analog> measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogLimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG_LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.AnalogLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' reference list.
	 * @see CIM15.IEC61970.Meas.AnalogLimit#getLimitSet
	 * @generated
	 */
	public EList<AnalogLimit> getLimits() {
		if (limits == null) {
			limits = new BasicInternalEList<AnalogLimit>(AnalogLimit.class);
		}
		return limits;
	}

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Analog}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Analog#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Analog#getLimitSets
	 * @generated
	 */
	public EList<Analog> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Analog>(Analog.class);
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
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLimits()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
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
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				return ((InternalEList<?>)getLimits()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
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
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				return getLimits();
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
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
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends AnalogLimit>)newValue);
				return;
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Analog>)newValue);
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
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				getLimits().clear();
				return;
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
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
			case MeasPackage.ANALOG_LIMIT_SET__LIMITS:
				return limits != null && !limits.isEmpty();
			case MeasPackage.ANALOG_LIMIT_SET__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AnalogLimitSet
