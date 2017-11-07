/**
 */
package CIM15.IEC61970.Informative.InfTypeAsset;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Asset Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets <em>Type Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssetCatalogue extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTypeAssets() <em>Type Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericAssetModelOrMaterial> typeAssets;

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
	protected TypeAssetCatalogue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfTypeAssetPackage.Literals.TYPE_ASSET_CATALOGUE;
	}

	/**
	 * Returns the value of the '<em><b>Type Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getTypeAssetCatalogue
	 * @generated
	 */
	public EList<GenericAssetModelOrMaterial> getTypeAssets() {
		if (typeAssets == null) {
			typeAssets = new BasicInternalEList<GenericAssetModelOrMaterial>(GenericAssetModelOrMaterial.class);
		}
		return typeAssets;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS, null, msgs);
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypeAssets()).basicAdd(otherEnd, msgs);
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return ((InternalEList<?>)getTypeAssets()).basicRemove(otherEnd, msgs);
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return getTypeAssets();
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				getTypeAssets().clear();
				getTypeAssets().addAll((Collection<? extends GenericAssetModelOrMaterial>)newValue);
				return;
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				getTypeAssets().clear();
				return;
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS:
				return typeAssets != null && !typeAssets.isEmpty();
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} // TypeAssetCatalogue
