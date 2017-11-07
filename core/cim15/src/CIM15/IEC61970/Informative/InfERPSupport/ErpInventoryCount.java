/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Assets.AssetModel;
import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.MaterialItem;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Inventory Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpInventoryCount extends IdentifiedObject {
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
	 * The cached value of the '{@link #getAssetModel() <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModel()
	 * @generated
	 * @ordered
	 */
	protected AssetModel assetModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpInventoryCount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_INVENTORY_COUNT;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Material Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Item</em>' reference.
	 * @see #setMaterialItem(MaterialItem)
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}' reference.
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
				msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, MaterialItem.class, msgs);
			if (newMaterialItem != null)
				msgs = ((InternalEObject)newMaterialItem).eInverseAdd(this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, MaterialItem.class, msgs);
			msgs = basicSetMaterialItem(newMaterialItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetModel#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model</em>' reference.
	 * @see #setAssetModel(AssetModel)
	 * @see CIM15.IEC61968.Assets.AssetModel#getErpInventoryCounts
	 * @generated
	 */
	public AssetModel getAssetModel() {
		if (assetModel != null && assetModel.eIsProxy()) {
			InternalEObject oldAssetModel = (InternalEObject)assetModel;
			assetModel = (AssetModel)eResolveProxy(oldAssetModel);
			if (assetModel != oldAssetModel) {
			}
		}
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModel basicGetAssetModel() {
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModel(AssetModel newAssetModel, NotificationChain msgs) {
		AssetModel oldAssetModel = assetModel;
		assetModel = newAssetModel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model</em>' reference.
	 * @see #getAssetModel()
	 * @generated
	 */
	public void setAssetModel(AssetModel newAssetModel) {
		if (newAssetModel != assetModel) {
			NotificationChain msgs = null;
			if (assetModel != null)
				msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, AssetModel.class, msgs);
			if (newAssetModel != null)
				msgs = ((InternalEObject)newAssetModel).eInverseAdd(this, AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, AssetModel.class, msgs);
			msgs = basicSetAssetModel(newAssetModel, msgs);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				if (materialItem != null)
					msgs = ((InternalEObject)materialItem).eInverseRemove(this, InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS, MaterialItem.class, msgs);
				return basicSetMaterialItem((MaterialItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				if (assetModel != null)
					msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS, AssetModel.class, msgs);
				return basicSetAssetModel((AssetModel)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				return basicSetMaterialItem(null, msgs);
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				return basicSetAssetModel(null, msgs);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				if (resolve) return getMaterialItem();
				return basicGetMaterialItem();
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				if (resolve) return getAssetModel();
				return basicGetAssetModel();
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				setAssetModel((AssetModel)newValue);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				setMaterialItem((MaterialItem)null);
				return;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				setAssetModel((AssetModel)null);
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
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__MATERIAL_ITEM:
				return materialItem != null;
			case InfERPSupportPackage.ERP_INVENTORY_COUNT__ASSET_MODEL:
				return assetModel != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpInventoryCount
