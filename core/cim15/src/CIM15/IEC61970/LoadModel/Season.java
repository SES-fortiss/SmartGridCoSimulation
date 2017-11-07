/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.Element;

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
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.Season#getName <em>Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Season extends Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final SeasonName NAME_EDEFAULT = SeasonName.WINTER;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected SeasonName name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * This is true if the Start Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startDateESet;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * This is true if the End Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endDateESet;

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
	protected Season() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.SEASON;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.LoadModel.SeasonName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see CIM15.IEC61970.LoadModel.SeasonName
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(SeasonName)
	 * @generated
	 */
	public SeasonName getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see CIM15.IEC61970.LoadModel.SeasonName
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	public void setName(SeasonName newName) {
		name = newName == null ? NAME_EDEFAULT : newName;
		nameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(SeasonName)
	 * @generated
	 */
	public void unsetName() {
		name = NAME_EDEFAULT;
		nameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.Season#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(SeasonName)
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #isSetStartDate()
	 * @see #unsetStartDate()
	 * @see #setStartDate(Date)
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #isSetStartDate()
	 * @see #unsetStartDate()
	 * @see #getStartDate()
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		startDate = newStartDate;
		startDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartDate()
	 * @see #getStartDate()
	 * @see #setStartDate(Date)
	 * @generated
	 */
	public void unsetStartDate() {
		startDate = START_DATE_EDEFAULT;
		startDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Date</em>' attribute is set.
	 * @see #unsetStartDate()
	 * @see #getStartDate()
	 * @see #setStartDate(Date)
	 * @generated
	 */
	public boolean isSetStartDate() {
		return startDateESet;
	}

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #isSetEndDate()
	 * @see #unsetEndDate()
	 * @see #setEndDate(Date)
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #isSetEndDate()
	 * @see #unsetEndDate()
	 * @see #getEndDate()
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		endDate = newEndDate;
		endDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndDate()
	 * @see #getEndDate()
	 * @see #setEndDate(Date)
	 * @generated
	 */
	public void unsetEndDate() {
		endDate = END_DATE_EDEFAULT;
		endDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Date</em>' attribute is set.
	 * @see #unsetEndDate()
	 * @see #getEndDate()
	 * @see #setEndDate(Date)
	 * @generated
	 */
	public boolean isSetEndDate() {
		return endDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season Day Type Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Day Type Schedules</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason
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
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
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
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
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
			case LoadModelPackage.SEASON__NAME:
				return getName();
			case LoadModelPackage.SEASON__START_DATE:
				return getStartDate();
			case LoadModelPackage.SEASON__END_DATE:
				return getEndDate();
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
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
			case LoadModelPackage.SEASON__NAME:
				setName((SeasonName)newValue);
				return;
			case LoadModelPackage.SEASON__START_DATE:
				setStartDate((Date)newValue);
				return;
			case LoadModelPackage.SEASON__END_DATE:
				setEndDate((Date)newValue);
				return;
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
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
			case LoadModelPackage.SEASON__NAME:
				unsetName();
				return;
			case LoadModelPackage.SEASON__START_DATE:
				unsetStartDate();
				return;
			case LoadModelPackage.SEASON__END_DATE:
				unsetEndDate();
				return;
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
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
			case LoadModelPackage.SEASON__NAME:
				return isSetName();
			case LoadModelPackage.SEASON__START_DATE:
				return isSetStartDate();
			case LoadModelPackage.SEASON__END_DATE:
				return isSetEndDate();
			case LoadModelPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
				return seasonDayTypeSchedules != null && !seasonDayTypeSchedules.isEmpty();
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", startDate: ");
		if (startDateESet) result.append(startDate); else result.append("<unset>");
		result.append(", endDate: ");
		if (endDateESet) result.append(endDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Season
