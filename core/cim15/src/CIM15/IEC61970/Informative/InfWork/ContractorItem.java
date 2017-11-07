/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPayable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contractor Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getErpPayables <em>Erp Payables</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractorItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The default value of the '{@link #getBidAmount() <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float BID_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBidAmount() <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidAmount()
	 * @generated
	 * @ordered
	 */
	protected float bidAmount = BID_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Bid Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bidAmountESet;

	/**
	 * The cached value of the '{@link #getErpPayables() <em>Erp Payables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayables()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayable> erpPayables;

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
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected String activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * This is true if the Activity Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityCodeESet;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * This is true if the Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costESet;

	/**
	 * The cached value of the '{@link #getWorkCostDetail() <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetail()
	 * @generated
	 * @ordered
	 */
	protected WorkCostDetail workCostDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractorItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CONTRACTOR_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getContractorItems
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Bid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid Amount</em>' attribute.
	 * @see #isSetBidAmount()
	 * @see #unsetBidAmount()
	 * @see #setBidAmount(float)
	 * @generated
	 */
	public float getBidAmount() {
		return bidAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Amount</em>' attribute.
	 * @see #isSetBidAmount()
	 * @see #unsetBidAmount()
	 * @see #getBidAmount()
	 * @generated
	 */
	public void setBidAmount(float newBidAmount) {
		bidAmount = newBidAmount;
		bidAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBidAmount()
	 * @see #getBidAmount()
	 * @see #setBidAmount(float)
	 * @generated
	 */
	public void unsetBidAmount() {
		bidAmount = BID_AMOUNT_EDEFAULT;
		bidAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getBidAmount <em>Bid Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bid Amount</em>' attribute is set.
	 * @see #unsetBidAmount()
	 * @see #getBidAmount()
	 * @see #setBidAmount(float)
	 * @generated
	 */
	public boolean isSetBidAmount() {
		return bidAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Payables</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payables</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable#getContractorItems
	 * @generated
	 */
	public EList<ErpPayable> getErpPayables() {
		if (erpPayables == null) {
			erpPayables = new BasicInternalEList<ErpPayable>(ErpPayable.class);
		}
		return erpPayables;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CONTRACTOR_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CONTRACTOR_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Code</em>' attribute.
	 * @see #isSetActivityCode()
	 * @see #unsetActivityCode()
	 * @see #setActivityCode(String)
	 * @generated
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see #isSetActivityCode()
	 * @see #unsetActivityCode()
	 * @see #getActivityCode()
	 * @generated
	 */
	public void setActivityCode(String newActivityCode) {
		activityCode = newActivityCode;
		activityCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivityCode()
	 * @see #getActivityCode()
	 * @see #setActivityCode(String)
	 * @generated
	 */
	public void unsetActivityCode() {
		activityCode = ACTIVITY_CODE_EDEFAULT;
		activityCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getActivityCode <em>Activity Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activity Code</em>' attribute is set.
	 * @see #unsetActivityCode()
	 * @see #getActivityCode()
	 * @see #setActivityCode(String)
	 * @generated
	 */
	public boolean isSetActivityCode() {
		return activityCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #setCost(float)
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(float newCost) {
		cost = newCost;
		costESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCost()
	 * @see #getCost()
	 * @see #setCost(float)
	 * @generated
	 */
	public void unsetCost() {
		cost = COST_EDEFAULT;
		costESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getCost <em>Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost</em>' attribute is set.
	 * @see #unsetCost()
	 * @see #getCost()
	 * @see #setCost(float)
	 * @generated
	 */
	public boolean isSetCost() {
		return costESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems <em>Contractor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems
	 * @generated
	 */
	public WorkCostDetail getWorkCostDetail() {
		if (workCostDetail != null && workCostDetail.eIsProxy()) {
			InternalEObject oldWorkCostDetail = (InternalEObject)workCostDetail;
			workCostDetail = (WorkCostDetail)eResolveProxy(oldWorkCostDetail);
			if (workCostDetail != oldWorkCostDetail) {
			}
		}
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail basicGetWorkCostDetail() {
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCostDetail(WorkCostDetail newWorkCostDetail, NotificationChain msgs) {
		WorkCostDetail oldWorkCostDetail = workCostDetail;
		workCostDetail = newWorkCostDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public void setWorkCostDetail(WorkCostDetail newWorkCostDetail) {
		if (newWorkCostDetail != workCostDetail) {
			NotificationChain msgs = null;
			if (workCostDetail != null)
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
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
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayables()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS, WorkCostDetail.class, msgs);
				return basicSetWorkCostDetail((WorkCostDetail)otherEnd, msgs);
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
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return ((InternalEList<?>)getErpPayables()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				return basicSetWorkCostDetail(null, msgs);
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
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				return getBidAmount();
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return getErpPayables();
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				return getStatus();
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				return getActivityCode();
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				return getCost();
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
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
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				setBidAmount((Float)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				getErpPayables().clear();
				getErpPayables().addAll((Collection<? extends ErpPayable>)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				setActivityCode((String)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				setCost((Float)newValue);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
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
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				unsetBidAmount();
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				getErpPayables().clear();
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				unsetActivityCode();
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				unsetCost();
				return;
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
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
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.CONTRACTOR_ITEM__BID_AMOUNT:
				return isSetBidAmount();
			case InfWorkPackage.CONTRACTOR_ITEM__ERP_PAYABLES:
				return erpPayables != null && !erpPayables.isEmpty();
			case InfWorkPackage.CONTRACTOR_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CONTRACTOR_ITEM__ACTIVITY_CODE:
				return isSetActivityCode();
			case InfWorkPackage.CONTRACTOR_ITEM__COST:
				return isSetCost();
			case InfWorkPackage.CONTRACTOR_ITEM__WORK_COST_DETAIL:
				return workCostDetail != null;
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
		result.append(" (bidAmount: ");
		if (bidAmountESet) result.append(bidAmount); else result.append("<unset>");
		result.append(", activityCode: ");
		if (activityCodeESet) result.append(activityCode); else result.append("<unset>");
		result.append(", cost: ");
		if (costESet) result.append(cost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ContractorItem
