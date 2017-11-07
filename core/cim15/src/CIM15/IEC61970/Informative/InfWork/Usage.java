/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM15.IEC61970.Informative.InfAssets.WorkEquipment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Usage#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Usage extends IdentifiedObject {
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
	 * The cached value of the '{@link #getWorkEquipmentAsset() <em>Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEquipmentAsset()
	 * @generated
	 * @ordered
	 */
	protected WorkEquipment workEquipmentAsset;

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
	 * The cached value of the '{@link #getMaterialItem() <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItem()
	 * @generated
	 * @ordered
	 */
	protected MaterialItem materialItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Usage() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.USAGE;
	}

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getUsages
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}' reference.
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
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__USAGES, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__USAGES, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work Equipment Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Equipment Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Equipment Asset</em>' reference.
	 * @see #setWorkEquipmentAsset(WorkEquipment)
	 * @see CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getUsages
	 * @generated
	 */
	public WorkEquipment getWorkEquipmentAsset() {
		if (workEquipmentAsset != null && workEquipmentAsset.eIsProxy()) {
			InternalEObject oldWorkEquipmentAsset = (InternalEObject)workEquipmentAsset;
			workEquipmentAsset = (WorkEquipment)eResolveProxy(oldWorkEquipmentAsset);
			if (workEquipmentAsset != oldWorkEquipmentAsset) {
			}
		}
		return workEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEquipment basicGetWorkEquipmentAsset() {
		return workEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkEquipmentAsset(WorkEquipment newWorkEquipmentAsset, NotificationChain msgs) {
		WorkEquipment oldWorkEquipmentAsset = workEquipmentAsset;
		workEquipmentAsset = newWorkEquipmentAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Equipment Asset</em>' reference.
	 * @see #getWorkEquipmentAsset()
	 * @generated
	 */
	public void setWorkEquipmentAsset(WorkEquipment newWorkEquipmentAsset) {
		if (newWorkEquipmentAsset != workEquipmentAsset) {
			NotificationChain msgs = null;
			if (workEquipmentAsset != null)
				msgs = ((InternalEObject)workEquipmentAsset).eInverseRemove(this, InfAssetsPackage.WORK_EQUIPMENT__USAGES, WorkEquipment.class, msgs);
			if (newWorkEquipmentAsset != null)
				msgs = ((InternalEObject)newWorkEquipmentAsset).eInverseAdd(this, InfAssetsPackage.WORK_EQUIPMENT__USAGES, WorkEquipment.class, msgs);
			msgs = basicSetWorkEquipmentAsset(newWorkEquipmentAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Usage#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.USAGE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.USAGE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Material Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Item</em>' reference.
	 * @see #setMaterialItem(MaterialItem)
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getUsages
	 * @generated
	 */
	public MaterialItem getMaterialItem() {
		if (materialItem != null && materialItem.eIsProxy()) {
			InternalEObject oldMaterialItem = (InternalEObject)materialItem;
			materialItem = (MaterialItem)eResolveProxy(oldMaterialItem);
			if (materialItem != oldMaterialItem) {
			}
		}
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialItem basicGetMaterialItem() {
		return materialItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialItem(MaterialItem newMaterialItem, NotificationChain msgs) {
		MaterialItem oldMaterialItem = materialItem;
		materialItem = newMaterialItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Item</em>' reference.
	 * @see #getMaterialItem()
	 * @generated
	 */
	public void setMaterialItem(MaterialItem newMaterialItem) {
		if (newMaterialItem != materialItem) {
			NotificationChain msgs = null;
			if (materialItem != null)
				msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__USAGES, MaterialItem.class, msgs);
			if (newMaterialItem != null)
				msgs = ((InternalEObject)newMaterialItem).eInverseAdd(this, InfWorkPackage.MATERIAL_ITEM__USAGES, MaterialItem.class, msgs);
			msgs = basicSetMaterialItem(newMaterialItem, msgs);
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
			case InfWorkPackage.USAGE__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__USAGES, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				if (workEquipmentAsset != null)
					msgs = ((InternalEObject)workEquipmentAsset).eInverseRemove(this, InfAssetsPackage.WORK_EQUIPMENT__USAGES, WorkEquipment.class, msgs);
				return basicSetWorkEquipmentAsset((WorkEquipment)otherEnd, msgs);
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				if (materialItem != null)
					msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__USAGES, MaterialItem.class, msgs);
				return basicSetMaterialItem((MaterialItem)otherEnd, msgs);
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
			case InfWorkPackage.USAGE__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				return basicSetWorkEquipmentAsset(null, msgs);
			case InfWorkPackage.USAGE__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				return basicSetMaterialItem(null, msgs);
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
			case InfWorkPackage.USAGE__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				if (resolve) return getWorkEquipmentAsset();
				return basicGetWorkEquipmentAsset();
			case InfWorkPackage.USAGE__STATUS:
				return getStatus();
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				if (resolve) return getMaterialItem();
				return basicGetMaterialItem();
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
			case InfWorkPackage.USAGE__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				setWorkEquipmentAsset((WorkEquipment)newValue);
				return;
			case InfWorkPackage.USAGE__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)newValue);
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
			case InfWorkPackage.USAGE__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				setWorkEquipmentAsset((WorkEquipment)null);
				return;
			case InfWorkPackage.USAGE__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)null);
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
			case InfWorkPackage.USAGE__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.USAGE__WORK_EQUIPMENT_ASSET:
				return workEquipmentAsset != null;
			case InfWorkPackage.USAGE__STATUS:
				return status != null;
			case InfWorkPackage.USAGE__MATERIAL_ITEM:
				return materialItem != null;
		}
		return super.eIsSet(featureID);
	}

} // Usage
