/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet;

import CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InspectionDataSet extends ProcedureDataSet {
	/**
	 * The cached value of the '{@link #getAccordingToSchedules() <em>According To Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccordingToSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleParameterInfo> accordingToSchedules;

	/**
	 * The default value of the '{@link #getLocationCondition() <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationCondition() <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCondition()
	 * @generated
	 * @ordered
	 */
	protected String locationCondition = LOCATION_CONDITION_EDEFAULT;

	/**
	 * This is true if the Location Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationConditionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionDataSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.INSPECTION_DATA_SET;
	}

	/**
	 * Returns the value of the '<em><b>According To Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet <em>For Inspection Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>According To Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>According To Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getForInspectionDataSet
	 * @generated
	 */
	public EList<ScheduleParameterInfo> getAccordingToSchedules() {
		if (accordingToSchedules == null) {
			accordingToSchedules = new BasicInternalEList<ScheduleParameterInfo>(ScheduleParameterInfo.class);
		}
		return accordingToSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Location Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Condition</em>' attribute.
	 * @see #isSetLocationCondition()
	 * @see #unsetLocationCondition()
	 * @see #setLocationCondition(String)
	 * @generated
	 */
	public String getLocationCondition() {
		return locationCondition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Condition</em>' attribute.
	 * @see #isSetLocationCondition()
	 * @see #unsetLocationCondition()
	 * @see #getLocationCondition()
	 * @generated
	 */
	public void setLocationCondition(String newLocationCondition) {
		locationCondition = newLocationCondition;
		locationConditionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocationCondition()
	 * @see #getLocationCondition()
	 * @see #setLocationCondition(String)
	 * @generated
	 */
	public void unsetLocationCondition() {
		locationCondition = LOCATION_CONDITION_EDEFAULT;
		locationConditionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.InspectionDataSet#getLocationCondition <em>Location Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location Condition</em>' attribute is set.
	 * @see #unsetLocationCondition()
	 * @see #getLocationCondition()
	 * @see #setLocationCondition(String)
	 * @generated
	 */
	public boolean isSetLocationCondition() {
		return locationConditionESet;
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccordingToSchedules()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return ((InternalEList<?>)getAccordingToSchedules()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return getAccordingToSchedules();
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				return getLocationCondition();
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				getAccordingToSchedules().clear();
				getAccordingToSchedules().addAll((Collection<? extends ScheduleParameterInfo>)newValue);
				return;
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				setLocationCondition((String)newValue);
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				getAccordingToSchedules().clear();
				return;
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				unsetLocationCondition();
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
			case InfWorkPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES:
				return accordingToSchedules != null && !accordingToSchedules.isEmpty();
			case InfWorkPackage.INSPECTION_DATA_SET__LOCATION_CONDITION:
				return isSetLocationCondition();
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
		result.append(" (locationCondition: ");
		if (locationConditionESet) result.append(locationCondition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // InspectionDataSet
