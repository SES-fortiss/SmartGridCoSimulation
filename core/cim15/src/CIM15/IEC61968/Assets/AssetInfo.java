/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.DimensionsInfo;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.AssetInfo#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetInfo#getAssetModel <em>Asset Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetInfo extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected Asset assets;

	/**
	 * The cached value of the '{@link #getDimensionsInfo() <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsInfo()
	 * @generated
	 * @ordered
	 */
	protected DimensionsInfo dimensionsInfo;

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
	protected AssetInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference.
	 * @see #setAssets(Asset)
	 * @see CIM15.IEC61968.Assets.Asset#getAssetInfo
	 * @generated
	 */
	public Asset getAssets() {
		if (assets != null && assets.eIsProxy()) {
			InternalEObject oldAssets = (InternalEObject)assets;
			assets = (Asset)eResolveProxy(oldAssets);
			if (assets != oldAssets) {
			}
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAssets() {
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssets(Asset newAssets, NotificationChain msgs) {
		Asset oldAssets = assets;
		assets = newAssets;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetInfo#getAssets <em>Assets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assets</em>' reference.
	 * @see #getAssets()
	 * @generated
	 */
	public void setAssets(Asset newAssets) {
		if (newAssets != assets) {
			NotificationChain msgs = null;
			if (assets != null)
				msgs = ((InternalEObject)assets).eInverseRemove(this, AssetsPackage.ASSET__ASSET_INFO, Asset.class, msgs);
			if (newAssets != null)
				msgs = ((InternalEObject)newAssets).eInverseAdd(this, AssetsPackage.ASSET__ASSET_INFO, Asset.class, msgs);
			msgs = basicSetAssets(newAssets, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Dimensions Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos <em>Asset Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Info</em>' reference.
	 * @see #setDimensionsInfo(DimensionsInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos
	 * @generated
	 */
	public DimensionsInfo getDimensionsInfo() {
		if (dimensionsInfo != null && dimensionsInfo.eIsProxy()) {
			InternalEObject oldDimensionsInfo = (InternalEObject)dimensionsInfo;
			dimensionsInfo = (DimensionsInfo)eResolveProxy(oldDimensionsInfo);
			if (dimensionsInfo != oldDimensionsInfo) {
			}
		}
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo basicGetDimensionsInfo() {
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionsInfo(DimensionsInfo newDimensionsInfo, NotificationChain msgs) {
		DimensionsInfo oldDimensionsInfo = dimensionsInfo;
		dimensionsInfo = newDimensionsInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions Info</em>' reference.
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public void setDimensionsInfo(DimensionsInfo newDimensionsInfo) {
		if (newDimensionsInfo != dimensionsInfo) {
			NotificationChain msgs = null;
			if (dimensionsInfo != null)
				msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, DimensionsInfo.class, msgs);
			if (newDimensionsInfo != null)
				msgs = ((InternalEObject)newDimensionsInfo).eInverseAdd(this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, DimensionsInfo.class, msgs);
			msgs = basicSetDimensionsInfo(newDimensionsInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetModel#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model</em>' reference.
	 * @see #setAssetModel(AssetModel)
	 * @see CIM15.IEC61968.Assets.AssetModel#getAssetInfo
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
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetInfo#getAssetModel <em>Asset Model</em>}' reference.
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
				msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetsPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs);
			if (newAssetModel != null)
				msgs = ((InternalEObject)newAssetModel).eInverseAdd(this, AssetsPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs);
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
			case AssetsPackage.ASSET_INFO__ASSETS:
				if (assets != null)
					msgs = ((InternalEObject)assets).eInverseRemove(this, AssetsPackage.ASSET__ASSET_INFO, Asset.class, msgs);
				return basicSetAssets((Asset)otherEnd, msgs);
			case AssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				if (dimensionsInfo != null)
					msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS, DimensionsInfo.class, msgs);
				return basicSetDimensionsInfo((DimensionsInfo)otherEnd, msgs);
			case AssetsPackage.ASSET_INFO__ASSET_MODEL:
				if (assetModel != null)
					msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetsPackage.ASSET_MODEL__ASSET_INFO, AssetModel.class, msgs);
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
			case AssetsPackage.ASSET_INFO__ASSETS:
				return basicSetAssets(null, msgs);
			case AssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				return basicSetDimensionsInfo(null, msgs);
			case AssetsPackage.ASSET_INFO__ASSET_MODEL:
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
			case AssetsPackage.ASSET_INFO__ASSETS:
				if (resolve) return getAssets();
				return basicGetAssets();
			case AssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				if (resolve) return getDimensionsInfo();
				return basicGetDimensionsInfo();
			case AssetsPackage.ASSET_INFO__ASSET_MODEL:
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
			case AssetsPackage.ASSET_INFO__ASSETS:
				setAssets((Asset)newValue);
				return;
			case AssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)newValue);
				return;
			case AssetsPackage.ASSET_INFO__ASSET_MODEL:
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
			case AssetsPackage.ASSET_INFO__ASSETS:
				setAssets((Asset)null);
				return;
			case AssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)null);
				return;
			case AssetsPackage.ASSET_INFO__ASSET_MODEL:
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
			case AssetsPackage.ASSET_INFO__ASSETS:
				return assets != null;
			case AssetsPackage.ASSET_INFO__DIMENSIONS_INFO:
				return dimensionsInfo != null;
			case AssetsPackage.ASSET_INFO__ASSET_MODEL:
				return assetModel != null;
		}
		return super.eIsSet(featureID);
	}

} // AssetInfo
