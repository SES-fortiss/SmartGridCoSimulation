/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.AssetModel#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetModel#getErpInventoryCounts <em>Erp Inventory Counts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetModel extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInfo()
	 * @generated
	 * @ordered
	 */
	protected AssetInfo assetInfo;

	/**
	 * The cached value of the '{@link #getErpInventoryCounts() <em>Erp Inventory Counts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventoryCounts()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInventoryCount> erpInventoryCounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Asset Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetInfo#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Info</em>' reference.
	 * @see #setAssetInfo(AssetInfo)
	 * @see CIM15.IEC61968.Assets.AssetInfo#getAssetModel
	 * @generated
	 */
	public AssetInfo getAssetInfo() {
		if (assetInfo != null && assetInfo.eIsProxy()) {
			InternalEObject oldAssetInfo = (InternalEObject)assetInfo;
			assetInfo = (AssetInfo)eResolveProxy(oldAssetInfo);
			if (assetInfo != oldAssetInfo) {
			}
		}
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo basicGetAssetInfo() {
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetInfo(AssetInfo newAssetInfo, NotificationChain msgs) {
		AssetInfo oldAssetInfo = assetInfo;
		assetInfo = newAssetInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetModel#getAssetInfo <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Info</em>' reference.
	 * @see #getAssetInfo()
	 * @generated
	 */
	public void setAssetInfo(AssetInfo newAssetInfo) {
		if (newAssetInfo != assetInfo) {
			NotificationChain msgs = null;
			if (assetInfo != null)
				msgs = ((InternalEObject)assetInfo).eInverseRemove(this, AssetsPackage.ASSET_INFO__ASSET_MODEL, AssetInfo.class, msgs);
			if (newAssetInfo != null)
				msgs = ((InternalEObject)newAssetInfo).eInverseAdd(this, AssetsPackage.ASSET_INFO__ASSET_MODEL, AssetInfo.class, msgs);
			msgs = basicSetAssetInfo(newAssetInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory Counts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory Counts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getAssetModel
	 * @generated
	 */
	public EList<ErpInventoryCount> getErpInventoryCounts() {
		if (erpInventoryCounts == null) {
			erpInventoryCounts = new BasicInternalEList<ErpInventoryCount>(ErpInventoryCount.class);
		}
		return erpInventoryCounts;
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
			case AssetsPackage.ASSET_MODEL__ASSET_INFO:
				if (assetInfo != null)
					msgs = ((InternalEObject)assetInfo).eInverseRemove(this, AssetsPackage.ASSET_INFO__ASSET_MODEL, AssetInfo.class, msgs);
				return basicSetAssetInfo((AssetInfo)otherEnd, msgs);
			case AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInventoryCounts()).basicAdd(otherEnd, msgs);
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
			case AssetsPackage.ASSET_MODEL__ASSET_INFO:
				return basicSetAssetInfo(null, msgs);
			case AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return ((InternalEList<?>)getErpInventoryCounts()).basicRemove(otherEnd, msgs);
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
			case AssetsPackage.ASSET_MODEL__ASSET_INFO:
				if (resolve) return getAssetInfo();
				return basicGetAssetInfo();
			case AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return getErpInventoryCounts();
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
			case AssetsPackage.ASSET_MODEL__ASSET_INFO:
				setAssetInfo((AssetInfo)newValue);
				return;
			case AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				getErpInventoryCounts().addAll((Collection<? extends ErpInventoryCount>)newValue);
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
			case AssetsPackage.ASSET_MODEL__ASSET_INFO:
				setAssetInfo((AssetInfo)null);
				return;
			case AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
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
			case AssetsPackage.ASSET_MODEL__ASSET_INFO:
				return assetInfo != null;
			case AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS:
				return erpInventoryCounts != null && !erpInventoryCounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AssetModel
