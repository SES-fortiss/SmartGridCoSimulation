/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61968.Work.Work;
import CIM15.IEC61968.Work.WorkPackage;

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
 * A representation of the model object '<em><b>Work Flow Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkFlowStep extends IdentifiedObject {
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
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

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
	 * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Work work;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkFlowStep() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_FLOW_STEP;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.WORK_FLOW_STEP__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.WORK_FLOW_STEP__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getWorkFlowSteps <em>Work Flow Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Work)
	 * @see CIM15.IEC61968.Work.Work#getWorkFlowSteps
	 * @generated
	 */
	public Work getWork() {
		if (work != null && work.eIsProxy()) {
			InternalEObject oldWork = (InternalEObject)work;
			work = (Work)eResolveProxy(oldWork);
			if (work != oldWork) {
			}
		}
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work basicGetWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(Work newWork, NotificationChain msgs) {
		Work oldWork = work;
		work = newWork;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__WORK_FLOW_STEPS, Work.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, WorkPackage.WORK__WORK_FLOW_STEPS, Work.class, msgs);
			msgs = basicSetWork(newWork, msgs);
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
			case InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_FLOW_STEP__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__WORK_FLOW_STEPS, Work.class, msgs);
				return basicSetWork((Work)otherEnd, msgs);
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
			case InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_FLOW_STEP__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.WORK_FLOW_STEP__WORK:
				return basicSetWork(null, msgs);
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
			case InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.WORK_FLOW_STEP__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case InfWorkPackage.WORK_FLOW_STEP__STATUS:
				return getStatus();
			case InfWorkPackage.WORK_FLOW_STEP__WORK:
				if (resolve) return getWork();
				return basicGetWork();
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
			case InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.WORK_FLOW_STEP__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case InfWorkPackage.WORK_FLOW_STEP__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.WORK_FLOW_STEP__WORK:
				setWork((Work)newValue);
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
			case InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.WORK_FLOW_STEP__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case InfWorkPackage.WORK_FLOW_STEP__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.WORK_FLOW_STEP__WORK:
				setWork((Work)null);
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
			case InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.WORK_FLOW_STEP__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case InfWorkPackage.WORK_FLOW_STEP__STATUS:
				return status != null;
			case InfWorkPackage.WORK_FLOW_STEP__WORK:
				return work != null;
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
		result.append(" (sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WorkFlowStep
