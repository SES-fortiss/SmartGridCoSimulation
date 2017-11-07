/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayType extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getSeasonDayTypeSchedules() <em>Season Day Type Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonDayTypeSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SeasonDayTypeSchedule> seasonDayTypeSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DayType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.DAY_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season Day Type Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType
	 * @generated
	 */
	public EList<SeasonDayTypeSchedule> getSeasonDayTypeSchedules() {
		if (seasonDayTypeSchedules == null) {
			seasonDayTypeSchedules = new BasicInternalEList<SeasonDayTypeSchedule>(SeasonDayTypeSchedule.class);
		}
		return seasonDayTypeSchedules;
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeasonDayTypeSchedules()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return ((InternalEList<?>)getSeasonDayTypeSchedules()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return getSeasonDayTypeSchedules();
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				getSeasonDayTypeSchedules().clear();
				getSeasonDayTypeSchedules().addAll((Collection<? extends SeasonDayTypeSchedule>)newValue);
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				getSeasonDayTypeSchedules().clear();
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
			case LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
				return seasonDayTypeSchedules != null && !seasonDayTypeSchedules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DayType
