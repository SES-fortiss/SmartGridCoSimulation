/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel;

import CIM15.IEC61970.Informative.InfAssets.TransformerAsset;

import CIM15.IEC61970.Wires.TransformerTank;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Tank Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssetModels <em>Transformer Asset Models</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerTanks <em>Transformer Tanks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerTankInfo extends AssetInfo {
	/**
	 * The cached value of the '{@link #getTransformerAssets() <em>Transformer Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAsset> transformerAssets;

	/**
	 * The cached value of the '{@link #getTransformerEndInfos() <em>Transformer End Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEndInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEndInfo> transformerEndInfos;

	/**
	 * The cached value of the '{@link #getPowerTransformerInfo() <em>Power Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformerInfo powerTransformerInfo;

	/**
	 * The cached value of the '{@link #getTransformerAssetModels() <em>Transformer Asset Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAssetModel> transformerAssetModels;

	/**
	 * The cached value of the '{@link #getTransformerTanks() <em>Transformer Tanks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTanks()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerTank> transformerTanks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerTankInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TRANSFORMER_TANK_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo
	 * @generated
	 */
	public EList<TransformerAsset> getTransformerAssets() {
		if (transformerAssets == null) {
			transformerAssets = new BasicInternalEList<TransformerAsset>(TransformerAsset.class);
		}
		return transformerAssets;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.TransformerEndInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End Infos</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerTankInfo
	 * @generated
	 */
	public EList<TransformerEndInfo> getTransformerEndInfos() {
		if (transformerEndInfos == null) {
			transformerEndInfos = new BasicInternalEList<TransformerEndInfo>(TransformerEndInfo.class);
		}
		return transformerEndInfos;
	}

	/**
	 * Returns the value of the '<em><b>Power Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer Info</em>' reference.
	 * @see #setPowerTransformerInfo(PowerTransformerInfo)
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo#getTransformerTankInfo
	 * @generated
	 */
	public PowerTransformerInfo getPowerTransformerInfo() {
		if (powerTransformerInfo != null && powerTransformerInfo.eIsProxy()) {
			InternalEObject oldPowerTransformerInfo = (InternalEObject)powerTransformerInfo;
			powerTransformerInfo = (PowerTransformerInfo)eResolveProxy(oldPowerTransformerInfo);
			if (powerTransformerInfo != oldPowerTransformerInfo) {
			}
		}
		return powerTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformerInfo basicGetPowerTransformerInfo() {
		return powerTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerTransformerInfo(PowerTransformerInfo newPowerTransformerInfo, NotificationChain msgs) {
		PowerTransformerInfo oldPowerTransformerInfo = powerTransformerInfo;
		powerTransformerInfo = newPowerTransformerInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Transformer Info</em>' reference.
	 * @see #getPowerTransformerInfo()
	 * @generated
	 */
	public void setPowerTransformerInfo(PowerTransformerInfo newPowerTransformerInfo) {
		if (newPowerTransformerInfo != powerTransformerInfo) {
			NotificationChain msgs = null;
			if (powerTransformerInfo != null)
				msgs = ((InternalEObject)powerTransformerInfo).eInverseRemove(this, AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO, PowerTransformerInfo.class, msgs);
			if (newPowerTransformerInfo != null)
				msgs = ((InternalEObject)newPowerTransformerInfo).eInverseAdd(this, AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO, PowerTransformerInfo.class, msgs);
			msgs = basicSetPowerTransformerInfo(newPowerTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer Asset Models</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Asset Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Asset Models</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo
	 * @generated
	 */
	public EList<TransformerAssetModel> getTransformerAssetModels() {
		if (transformerAssetModels == null) {
			transformerAssetModels = new BasicInternalEList<TransformerAssetModel>(TransformerAssetModel.class);
		}
		return transformerAssetModels;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tanks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerTank}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tanks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tanks</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getTransformerTankInfo
	 * @generated
	 */
	public EList<TransformerTank> getTransformerTanks() {
		if (transformerTanks == null) {
			transformerTanks = new BasicInternalEList<TransformerTank>(TransformerTank.class);
		}
		return transformerTanks;
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
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssets()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerEndInfos()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
				if (powerTransformerInfo != null)
					msgs = ((InternalEObject)powerTransformerInfo).eInverseRemove(this, AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO, PowerTransformerInfo.class, msgs);
				return basicSetPowerTransformerInfo((PowerTransformerInfo)otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssetModels()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerTanks()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS:
				return ((InternalEList<?>)getTransformerAssets()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
				return ((InternalEList<?>)getTransformerEndInfos()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
				return basicSetPowerTransformerInfo(null, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS:
				return ((InternalEList<?>)getTransformerAssetModels()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS:
				return ((InternalEList<?>)getTransformerTanks()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS:
				return getTransformerAssets();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
				return getTransformerEndInfos();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
				if (resolve) return getPowerTransformerInfo();
				return basicGetPowerTransformerInfo();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS:
				return getTransformerAssetModels();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS:
				return getTransformerTanks();
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
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				getTransformerAssets().addAll((Collection<? extends TransformerAsset>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
				getTransformerEndInfos().clear();
				getTransformerEndInfos().addAll((Collection<? extends TransformerEndInfo>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
				setPowerTransformerInfo((PowerTransformerInfo)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS:
				getTransformerAssetModels().clear();
				getTransformerAssetModels().addAll((Collection<? extends TransformerAssetModel>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS:
				getTransformerTanks().clear();
				getTransformerTanks().addAll((Collection<? extends TransformerTank>)newValue);
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
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
				getTransformerEndInfos().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
				setPowerTransformerInfo((PowerTransformerInfo)null);
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS:
				getTransformerAssetModels().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS:
				getTransformerTanks().clear();
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
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS:
				return transformerAssets != null && !transformerAssets.isEmpty();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
				return transformerEndInfos != null && !transformerEndInfos.isEmpty();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
				return powerTransformerInfo != null;
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS:
				return transformerAssetModels != null && !transformerAssetModels.isEmpty();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS:
				return transformerTanks != null && !transformerTanks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TransformerTankInfo
