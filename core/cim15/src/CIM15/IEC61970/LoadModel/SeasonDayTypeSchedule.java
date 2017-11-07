/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.IEC61970.Core.RegularIntervalSchedule;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season Day Type Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeasonDayTypeSchedule extends RegularIntervalSchedule {
	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected Season season;

	/**
	 * The cached value of the '{@link #getDayType() <em>Day Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayType()
	 * @generated
	 * @ordered
	 */
	protected DayType dayType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonDayTypeSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.SEASON_DAY_TYPE_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Season</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' reference.
	 * @see #setSeason(Season)
	 * @see CIM15.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules
	 * @generated
	 */
	public Season getSeason() {
		if (season != null && season.eIsProxy()) {
			InternalEObject oldSeason = (InternalEObject)season;
			season = (Season)eResolveProxy(oldSeason);
			if (season != oldSeason) {
			}
		}
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season basicGetSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		Season oldSeason = season;
		season = newSeason;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' reference.
	 * @see #getSeason()
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != season) {
			NotificationChain msgs = null;
			if (season != null)
				msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Day Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Type</em>' reference.
	 * @see #setDayType(DayType)
	 * @see CIM15.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules
	 * @generated
	 */
	public DayType getDayType() {
		if (dayType != null && dayType.eIsProxy()) {
			InternalEObject oldDayType = (InternalEObject)dayType;
			dayType = (DayType)eResolveProxy(oldDayType);
			if (dayType != oldDayType) {
			}
		}
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType basicGetDayType() {
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDayType(DayType newDayType, NotificationChain msgs) {
		DayType oldDayType = dayType;
		dayType = newDayType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Type</em>' reference.
	 * @see #getDayType()
	 * @generated
	 */
	public void setDayType(DayType newDayType) {
		if (newDayType != dayType) {
			NotificationChain msgs = null;
			if (dayType != null)
				msgs = ((InternalEObject)dayType).eInverseRemove(this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs);
			if (newDayType != null)
				msgs = ((InternalEObject)newDayType).eInverseAdd(this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs);
			msgs = basicSetDayType(newDayType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				if (season != null)
					msgs = ((InternalEObject)season).eInverseRemove(this, LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs);
				return basicSetSeason((Season)otherEnd, msgs);
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				if (dayType != null)
					msgs = ((InternalEObject)dayType).eInverseRemove(this, LoadModelPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs);
				return basicSetDayType((DayType)otherEnd, msgs);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				return basicSetSeason(null, msgs);
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				return basicSetDayType(null, msgs);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				if (resolve) return getSeason();
				return basicGetSeason();
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				if (resolve) return getDayType();
				return basicGetDayType();
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				setSeason((Season)newValue);
				return;
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				setDayType((DayType)newValue);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				setSeason((Season)null);
				return;
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				setDayType((DayType)null);
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
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
				return season != null;
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
				return dayType != null;
		}
		return super.eIsSet(featureID);
	}

} // SeasonDayTypeSchedule
