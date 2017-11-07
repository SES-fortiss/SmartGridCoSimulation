/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM15.IEC61970.Informative.InfWork.DesignLocation;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Bom Item Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpBomItemData extends IdentifiedObject {
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
	 * The cached value of the '{@link #getErpBOM() <em>Erp BOM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBOM()
	 * @generated
	 * @ordered
	 */
	protected ErpBOM erpBOM;

	/**
	 * The cached value of the '{@link #getDesignLocation() <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocation()
	 * @generated
	 * @ordered
	 */
	protected DesignLocation designLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpBomItemData() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_BOM_ITEM_DATA;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(GenericAssetModelOrMaterial)
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpBomItemDatas
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}' reference.
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
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS, GenericAssetModelOrMaterial.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS, GenericAssetModelOrMaterial.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp BOM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp BOM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp BOM</em>' reference.
	 * @see #setErpBOM(ErpBOM)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getErpBomItemDatas
	 * @generated
	 */
	public ErpBOM getErpBOM() {
		if (erpBOM != null && erpBOM.eIsProxy()) {
			InternalEObject oldErpBOM = (InternalEObject)erpBOM;
			erpBOM = (ErpBOM)eResolveProxy(oldErpBOM);
			if (erpBOM != oldErpBOM) {
			}
		}
		return erpBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBOM basicGetErpBOM() {
		return erpBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpBOM(ErpBOM newErpBOM, NotificationChain msgs) {
		ErpBOM oldErpBOM = erpBOM;
		erpBOM = newErpBOM;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getErpBOM <em>Erp BOM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp BOM</em>' reference.
	 * @see #getErpBOM()
	 * @generated
	 */
	public void setErpBOM(ErpBOM newErpBOM) {
		if (newErpBOM != erpBOM) {
			NotificationChain msgs = null;
			if (erpBOM != null)
				msgs = ((InternalEObject)erpBOM).eInverseRemove(this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, ErpBOM.class, msgs);
			if (newErpBOM != null)
				msgs = ((InternalEObject)newErpBOM).eInverseAdd(this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, ErpBOM.class, msgs);
			msgs = basicSetErpBOM(newErpBOM, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas
	 * @generated
	 */
	public DesignLocation getDesignLocation() {
		if (designLocation != null && designLocation.eIsProxy()) {
			InternalEObject oldDesignLocation = (InternalEObject)designLocation;
			designLocation = (DesignLocation)eResolveProxy(oldDesignLocation);
			if (designLocation != oldDesignLocation) {
			}
		}
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation basicGetDesignLocation() {
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLocation(DesignLocation newDesignLocation, NotificationChain msgs) {
		DesignLocation oldDesignLocation = designLocation;
		designLocation = newDesignLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	public void setDesignLocation(DesignLocation newDesignLocation) {
		if (newDesignLocation != designLocation) {
			NotificationChain msgs = null;
			if (designLocation != null)
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS, GenericAssetModelOrMaterial.class, msgs);
				return basicSetTypeAsset((GenericAssetModelOrMaterial)otherEnd, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				if (erpBOM != null)
					msgs = ((InternalEObject)erpBOM).eInverseRemove(this, InfERPSupportPackage.ERP_BOM__ERP_BOM_ITEM_DATAS, ErpBOM.class, msgs);
				return basicSetErpBOM((ErpBOM)otherEnd, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				return basicSetErpBOM(null, msgs);
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				if (resolve) return getErpBOM();
				return basicGetErpBOM();
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)newValue);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				setErpBOM((ErpBOM)newValue);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)null);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				setErpBOM((ErpBOM)null);
				return;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
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
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__TYPE_ASSET:
				return typeAsset != null;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__ERP_BOM:
				return erpBOM != null;
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA__DESIGN_LOCATION:
				return designLocation != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpBomItemData
