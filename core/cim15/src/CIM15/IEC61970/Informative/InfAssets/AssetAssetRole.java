/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;
import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61970.Informative.InfCommon.Role;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Asset Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetAssetRole extends Role {
	/**
	 * The cached value of the '{@link #getToAsset() <em>To Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset toAsset;

	/**
	 * The cached value of the '{@link #getFromAsset() <em>From Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset fromAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetAssetRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getAssetAssetRole();
	}

	/**
	 * Returns the value of the '<em><b>To Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getFromAssetRoles <em>From Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Asset</em>' reference.
	 * @see #setToAsset(Asset)
	 * @see CIM15.IEC61968.Assets.Asset#getFromAssetRoles
	 * @generated
	 */
	public Asset getToAsset() {
		if (toAsset != null && toAsset.eIsProxy()) {
			InternalEObject oldToAsset = (InternalEObject)toAsset;
			toAsset = (Asset)eResolveProxy(oldToAsset);
			if (toAsset != oldToAsset) {
			}
		}
		return toAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetToAsset() {
		return toAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToAsset(Asset newToAsset, NotificationChain msgs) {
		Asset oldToAsset = toAsset;
		toAsset = newToAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Asset</em>' reference.
	 * @see #getToAsset()
	 * @generated
	 */
	public void setToAsset(Asset newToAsset) {
		if (newToAsset != toAsset) {
			NotificationChain msgs = null;
			if (toAsset != null)
				msgs = ((InternalEObject)toAsset).eInverseRemove(this, AssetsPackage.ASSET__FROM_ASSET_ROLES, Asset.class, msgs);
			if (newToAsset != null)
				msgs = ((InternalEObject)newToAsset).eInverseAdd(this, AssetsPackage.ASSET__FROM_ASSET_ROLES, Asset.class, msgs);
			msgs = basicSetToAsset(newToAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>From Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getToAssetRoles <em>To Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Asset</em>' reference.
	 * @see #setFromAsset(Asset)
	 * @see CIM15.IEC61968.Assets.Asset#getToAssetRoles
	 * @generated
	 */
	public Asset getFromAsset() {
		if (fromAsset != null && fromAsset.eIsProxy()) {
			InternalEObject oldFromAsset = (InternalEObject)fromAsset;
			fromAsset = (Asset)eResolveProxy(oldFromAsset);
			if (fromAsset != oldFromAsset) {
			}
		}
		return fromAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetFromAsset() {
		return fromAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromAsset(Asset newFromAsset, NotificationChain msgs) {
		Asset oldFromAsset = fromAsset;
		fromAsset = newFromAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Asset</em>' reference.
	 * @see #getFromAsset()
	 * @generated
	 */
	public void setFromAsset(Asset newFromAsset) {
		if (newFromAsset != fromAsset) {
			NotificationChain msgs = null;
			if (fromAsset != null)
				msgs = ((InternalEObject)fromAsset).eInverseRemove(this, AssetsPackage.ASSET__TO_ASSET_ROLES, Asset.class, msgs);
			if (newFromAsset != null)
				msgs = ((InternalEObject)newFromAsset).eInverseAdd(this, AssetsPackage.ASSET__TO_ASSET_ROLES, Asset.class, msgs);
			msgs = basicSetFromAsset(newFromAsset, msgs);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				if (toAsset != null)
					msgs = ((InternalEObject)toAsset).eInverseRemove(this, AssetsPackage.ASSET__FROM_ASSET_ROLES, Asset.class, msgs);
				return basicSetToAsset((Asset)otherEnd, msgs);
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				if (fromAsset != null)
					msgs = ((InternalEObject)fromAsset).eInverseRemove(this, AssetsPackage.ASSET__TO_ASSET_ROLES, Asset.class, msgs);
				return basicSetFromAsset((Asset)otherEnd, msgs);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				return basicSetToAsset(null, msgs);
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				return basicSetFromAsset(null, msgs);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				if (resolve) return getToAsset();
				return basicGetToAsset();
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				if (resolve) return getFromAsset();
				return basicGetFromAsset();
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				setToAsset((Asset)newValue);
				return;
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				setFromAsset((Asset)newValue);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				setToAsset((Asset)null);
				return;
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				setFromAsset((Asset)null);
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
			case InfAssetsPackage.ASSET_ASSET_ROLE__TO_ASSET:
				return toAsset != null;
			case InfAssetsPackage.ASSET_ASSET_ROLE__FROM_ASSET:
				return fromAsset != null;
		}
		return super.eIsSet(featureID);
	}

} // AssetAssetRole
