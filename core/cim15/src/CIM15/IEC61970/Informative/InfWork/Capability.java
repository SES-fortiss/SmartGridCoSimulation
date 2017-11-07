/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfCommon.Craft;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Capability#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Capability extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The default value of the '{@link #getPerformanceFactor() <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceFactor() <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceFactor()
	 * @generated
	 * @ordered
	 */
	protected String performanceFactor = PERFORMANCE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Performance Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean performanceFactorESet;

	/**
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getCrafts() <em>Crafts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Craft> crafts;

	/**
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Capability() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CAPABILITY;
	}

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getCapabilities
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__CAPABILITIES, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__CAPABILITIES, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	public void setCategory(String newCategory) {
		category = newCategory;
		categoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public void unsetCategory() {
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Performance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Factor</em>' attribute.
	 * @see #isSetPerformanceFactor()
	 * @see #unsetPerformanceFactor()
	 * @see #setPerformanceFactor(String)
	 * @generated
	 */
	public String getPerformanceFactor() {
		return performanceFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Factor</em>' attribute.
	 * @see #isSetPerformanceFactor()
	 * @see #unsetPerformanceFactor()
	 * @see #getPerformanceFactor()
	 * @generated
	 */
	public void setPerformanceFactor(String newPerformanceFactor) {
		performanceFactor = newPerformanceFactor;
		performanceFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerformanceFactor()
	 * @see #getPerformanceFactor()
	 * @see #setPerformanceFactor(String)
	 * @generated
	 */
	public void unsetPerformanceFactor() {
		performanceFactor = PERFORMANCE_FACTOR_EDEFAULT;
		performanceFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getPerformanceFactor <em>Performance Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Performance Factor</em>' attribute is set.
	 * @see #unsetPerformanceFactor()
	 * @see #getPerformanceFactor()
	 * @see #setPerformanceFactor(String)
	 * @generated
	 */
	public boolean isSetPerformanceFactor() {
		return performanceFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getCapabilities
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CAPABILITY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CAPABILITY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Crafts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.Craft}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.Craft#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crafts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crafts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.Craft#getCapabilities
	 * @generated
	 */
	public EList<Craft> getCrafts() {
		if (crafts == null) {
			crafts = new BasicInternalEList<Craft>(Craft.class);
		}
		return crafts;
	}

	/**
	 * Returns the value of the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Interval</em>' containment reference.
	 * @see #setValidityInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getValidityInterval() {
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityInterval(DateTimeInterval newValidityInterval, NotificationChain msgs) {
		DateTimeInterval oldValidityInterval = validityInterval;
		validityInterval = newValidityInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Capability#getValidityInterval <em>Validity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' containment reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	public void setValidityInterval(DateTimeInterval newValidityInterval) {
		if (newValidityInterval != validityInterval) {
			NotificationChain msgs = null;
			if (validityInterval != null)
				msgs = ((InternalEObject)validityInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL, null, msgs);
			if (newValidityInterval != null)
				msgs = ((InternalEObject)newValidityInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL, null, msgs);
			msgs = basicSetValidityInterval(newValidityInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case InfWorkPackage.CAPABILITY__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__CAPABILITIES, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrafts()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CAPABILITY__CREW:
				return basicSetCrew(null, msgs);
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return ((InternalEList<?>)getCrafts()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				return basicSetValidityInterval(null, msgs);
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
			case InfWorkPackage.CAPABILITY__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfWorkPackage.CAPABILITY__CATEGORY:
				return getCategory();
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				return getPerformanceFactor();
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.CAPABILITY__STATUS:
				return getStatus();
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return getCrafts();
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				return getValidityInterval();
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
			case InfWorkPackage.CAPABILITY__CREW:
				setCrew((Crew)newValue);
				return;
			case InfWorkPackage.CAPABILITY__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				setPerformanceFactor((String)newValue);
				return;
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.CAPABILITY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CAPABILITY__CRAFTS:
				getCrafts().clear();
				getCrafts().addAll((Collection<? extends Craft>)newValue);
				return;
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
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
			case InfWorkPackage.CAPABILITY__CREW:
				setCrew((Crew)null);
				return;
			case InfWorkPackage.CAPABILITY__CATEGORY:
				unsetCategory();
				return;
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				unsetPerformanceFactor();
				return;
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.CAPABILITY__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CAPABILITY__CRAFTS:
				getCrafts().clear();
				return;
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
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
			case InfWorkPackage.CAPABILITY__CREW:
				return crew != null;
			case InfWorkPackage.CAPABILITY__CATEGORY:
				return isSetCategory();
			case InfWorkPackage.CAPABILITY__PERFORMANCE_FACTOR:
				return isSetPerformanceFactor();
			case InfWorkPackage.CAPABILITY__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.CAPABILITY__STATUS:
				return status != null;
			case InfWorkPackage.CAPABILITY__CRAFTS:
				return crafts != null && !crafts.isEmpty();
			case InfWorkPackage.CAPABILITY__VALIDITY_INTERVAL:
				return validityInterval != null;
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
		result.append(" (category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", performanceFactor: ");
		if (performanceFactorESet) result.append(performanceFactor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Capability
