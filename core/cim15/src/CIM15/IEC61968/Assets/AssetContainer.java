/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61970.Informative.InfLocations.LandProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.AssetContainer#getSeals <em>Seals</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetContainer#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetContainer#getLandProperties <em>Land Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetContainer extends Asset {
	/**
	 * The cached value of the '{@link #getSeals() <em>Seals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeals()
	 * @generated
	 * @ordered
	 */
	protected EList<Seal> seals;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getLandProperties() <em>Land Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetContainer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET_CONTAINER;
	}

	/**
	 * Returns the value of the '<em><b>Seals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Seal}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seals</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Seal#getAssetContainer
	 * @generated
	 */
	public EList<Seal> getSeals() {
		if (seals == null) {
			seals = new BasicInternalEList<Seal>(Seal.class);
		}
		return seals;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getAssetContainer
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
	}

	/**
	 * Returns the value of the '<em><b>Land Properties</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers <em>Asset Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Properties</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers
	 * @generated
	 */
	public EList<LandProperty> getLandProperties() {
		if (landProperties == null) {
			landProperties = new BasicInternalEList<LandProperty>(LandProperty.class);
		}
		return landProperties;
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
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeals()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperties()).basicAdd(otherEnd, msgs);
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
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return ((InternalEList<?>)getSeals()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return ((InternalEList<?>)getLandProperties()).basicRemove(otherEnd, msgs);
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
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return getSeals();
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return getAssets();
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return getLandProperties();
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
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				getSeals().clear();
				getSeals().addAll((Collection<? extends Seal>)newValue);
				return;
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				getLandProperties().clear();
				getLandProperties().addAll((Collection<? extends LandProperty>)newValue);
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
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				getSeals().clear();
				return;
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				getAssets().clear();
				return;
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				getLandProperties().clear();
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
			case AssetsPackage.ASSET_CONTAINER__SEALS:
				return seals != null && !seals.isEmpty();
			case AssetsPackage.ASSET_CONTAINER__ASSETS:
				return assets != null && !assets.isEmpty();
			case AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES:
				return landProperties != null && !landProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AssetContainer
