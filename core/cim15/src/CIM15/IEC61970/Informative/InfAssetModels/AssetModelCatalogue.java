/**
 */
package CIM15.IEC61970.Informative.InfAssetModels;

import CIM15.IEC61968.Common.Status;

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
 * A representation of the model object '<em><b>Asset Model Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetModelCatalogue extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAssetModelCatalogueItems() <em>Asset Model Catalogue Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogueItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetModelCatalogueItem> assetModelCatalogueItems;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetModelCatalogue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.ASSET_MODEL_CATALOGUE;
	}

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue
	 * @generated
	 */
	public EList<AssetModelCatalogueItem> getAssetModelCatalogueItems() {
		if (assetModelCatalogueItems == null) {
			assetModelCatalogueItems = new BasicInternalEList<AssetModelCatalogueItem>(AssetModelCatalogueItem.class);
		}
		return assetModelCatalogueItems;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetModelCatalogueItems()).basicAdd(otherEnd, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<?>)getAssetModelCatalogueItems()).basicRemove(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				return basicSetStatus(null, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return getAssetModelCatalogueItems();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				return getStatus();
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				getAssetModelCatalogueItems().addAll((Collection<? extends AssetModelCatalogueItem>)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				setStatus((Status)newValue);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				setStatus((Status)null);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS:
				return assetModelCatalogueItems != null && !assetModelCatalogueItems.isEmpty();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} // AssetModelCatalogue
