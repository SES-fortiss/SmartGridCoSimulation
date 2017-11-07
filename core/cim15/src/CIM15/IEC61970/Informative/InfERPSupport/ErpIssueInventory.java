/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.TypeMaterial;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Issue Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpIssueInventory extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected GenericAssetModelOrMaterial typeAsset;

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
	 * The cached value of the '{@link #getTypeMaterial() <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMaterial()
	 * @generated
	 * @ordered
	 */
	protected TypeMaterial typeMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpIssueInventory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_ISSUE_INVENTORY;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpInventoryIssues <em>Erp Inventory Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(GenericAssetModelOrMaterial)
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpInventoryIssues
	 * @generated
	 */
	public GenericAssetModelOrMaterial getTypeAsset() {
		if (typeAsset != null && typeAsset.eIsProxy()) {
			InternalEObject oldTypeAsset = (InternalEObject)typeAsset;
			typeAsset = (GenericAssetModelOrMaterial)eResolveProxy(oldTypeAsset);
			if (typeAsset != oldTypeAsset) {
			}
		}
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAssetModelOrMaterial basicGetTypeAsset() {
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAsset(GenericAssetModelOrMaterial newTypeAsset, NotificationChain msgs) {
		GenericAssetModelOrMaterial oldTypeAsset = typeAsset;
		typeAsset = newTypeAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	public void setTypeAsset(GenericAssetModelOrMaterial newTypeAsset) {
		if (newTypeAsset != typeAsset) {
			NotificationChain msgs = null;
			if (typeAsset != null)
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES, GenericAssetModelOrMaterial.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES, GenericAssetModelOrMaterial.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories <em>Erp Issue Inventories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories
	 * @generated
	 */
	public TypeMaterial getTypeMaterial() {
		if (typeMaterial != null && typeMaterial.eIsProxy()) {
			InternalEObject oldTypeMaterial = (InternalEObject)typeMaterial;
			typeMaterial = (TypeMaterial)eResolveProxy(oldTypeMaterial);
			if (typeMaterial != oldTypeMaterial) {
			}
		}
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial basicGetTypeMaterial() {
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMaterial(TypeMaterial newTypeMaterial, NotificationChain msgs) {
		TypeMaterial oldTypeMaterial = typeMaterial;
		typeMaterial = newTypeMaterial;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Material</em>' reference.
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public void setTypeMaterial(TypeMaterial newTypeMaterial) {
		if (newTypeMaterial != typeMaterial) {
			NotificationChain msgs = null;
			if (typeMaterial != null)
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
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
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES, GenericAssetModelOrMaterial.class, msgs);
				return basicSetTypeAsset((GenericAssetModelOrMaterial)otherEnd, msgs);
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
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
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
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
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)newValue);
				return;
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
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
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)null);
				return;
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
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
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_ASSET:
				return typeAsset != null;
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY__TYPE_MATERIAL:
				return typeMaterial != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpIssueInventory
