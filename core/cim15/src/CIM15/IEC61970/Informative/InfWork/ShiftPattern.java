/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftPattern extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

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
	 * The default value of the '{@link #getCycleCount() <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycleCount() <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleCount()
	 * @generated
	 * @ordered
	 */
	protected int cycleCount = CYCLE_COUNT_EDEFAULT;

	/**
	 * This is true if the Cycle Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cycleCountESet;

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
	 * The default value of the '{@link #getAssignmentType() <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignmentType() <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentType()
	 * @generated
	 * @ordered
	 */
	protected String assignmentType = ASSIGNMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Assignment Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean assignmentTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftPattern() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.SHIFT_PATTERN;
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getShiftPatterns <em>Shift Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getShiftPatterns
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.SHIFT_PATTERN__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.SHIFT_PATTERN__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cycle Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Count</em>' attribute.
	 * @see #isSetCycleCount()
	 * @see #unsetCycleCount()
	 * @see #setCycleCount(int)
	 * @generated
	 */
	public int getCycleCount() {
		return cycleCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Count</em>' attribute.
	 * @see #isSetCycleCount()
	 * @see #unsetCycleCount()
	 * @see #getCycleCount()
	 * @generated
	 */
	public void setCycleCount(int newCycleCount) {
		cycleCount = newCycleCount;
		cycleCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCycleCount()
	 * @see #getCycleCount()
	 * @see #setCycleCount(int)
	 * @generated
	 */
	public void unsetCycleCount() {
		cycleCount = CYCLE_COUNT_EDEFAULT;
		cycleCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCycleCount <em>Cycle Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cycle Count</em>' attribute is set.
	 * @see #unsetCycleCount()
	 * @see #getCycleCount()
	 * @see #setCycleCount(int)
	 * @generated
	 */
	public boolean isSetCycleCount() {
		return cycleCountESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getValidityInterval <em>Validity Interval</em>}' containment reference.
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
				msgs = ((InternalEObject)validityInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL, null, msgs);
			if (newValidityInterval != null)
				msgs = ((InternalEObject)newValidityInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL, null, msgs);
			msgs = basicSetValidityInterval(newValidityInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Assignment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Type</em>' attribute.
	 * @see #isSetAssignmentType()
	 * @see #unsetAssignmentType()
	 * @see #setAssignmentType(String)
	 * @generated
	 */
	public String getAssignmentType() {
		return assignmentType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Type</em>' attribute.
	 * @see #isSetAssignmentType()
	 * @see #unsetAssignmentType()
	 * @see #getAssignmentType()
	 * @generated
	 */
	public void setAssignmentType(String newAssignmentType) {
		assignmentType = newAssignmentType;
		assignmentTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssignmentType()
	 * @see #getAssignmentType()
	 * @see #setAssignmentType(String)
	 * @generated
	 */
	public void unsetAssignmentType() {
		assignmentType = ASSIGNMENT_TYPE_EDEFAULT;
		assignmentTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getAssignmentType <em>Assignment Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assignment Type</em>' attribute is set.
	 * @see #unsetAssignmentType()
	 * @see #getAssignmentType()
	 * @see #setAssignmentType(String)
	 * @generated
	 */
	public boolean isSetAssignmentType() {
		return assignmentTypeESet;
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return getCrews();
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				return getStatus();
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				return getCycleCount();
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				return getValidityInterval();
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				return getAssignmentType();
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				setCycleCount((Integer)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
				return;
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				setAssignmentType((String)newValue);
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				getCrews().clear();
				return;
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				unsetCycleCount();
				return;
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
				return;
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				unsetAssignmentType();
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
			case InfWorkPackage.SHIFT_PATTERN__CREWS:
				return crews != null && !crews.isEmpty();
			case InfWorkPackage.SHIFT_PATTERN__STATUS:
				return status != null;
			case InfWorkPackage.SHIFT_PATTERN__CYCLE_COUNT:
				return isSetCycleCount();
			case InfWorkPackage.SHIFT_PATTERN__VALIDITY_INTERVAL:
				return validityInterval != null;
			case InfWorkPackage.SHIFT_PATTERN__ASSIGNMENT_TYPE:
				return isSetAssignmentType();
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
		result.append(" (cycleCount: ");
		if (cycleCountESet) result.append(cycleCount); else result.append("<unset>");
		result.append(", assignmentType: ");
		if (assignmentTypeESet) result.append(assignmentType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ShiftPattern
