/**
 */
package CIM15.IEC61970.Informative.InfAssetModels;

import CIM15.IEC61968.Assets.AssetsPackage;
import CIM15.IEC61968.Assets.ProductAssetModel;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Model Catalogue Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems <em>Erp Quote Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetModelCatalogueItem extends Document {
	/**
	 * The cached value of the '{@link #getErpPOLineItems() <em>Erp PO Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPOLineItem> erpPOLineItems;

	/**
	 * The cached value of the '{@link #getAssetModelCatalogue() <em>Asset Model Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogue()
	 * @generated
	 * @ordered
	 */
	protected AssetModelCatalogue assetModelCatalogue;

	/**
	 * The cached value of the '{@link #getAssetModel() <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModel()
	 * @generated
	 * @ordered
	 */
	protected ProductAssetModel assetModel;

	/**
	 * The cached value of the '{@link #getErpQuoteLineItems() <em>Erp Quote Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpQuoteLineItem> erpQuoteLineItems;

	/**
	 * The default value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final float UNIT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected float unitCost = UNIT_COST_EDEFAULT;

	/**
	 * This is true if the Unit Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitCostESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetModelCatalogueItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.ASSET_MODEL_CATALOGUE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getAssetModelCatalogueItem
	 * @generated
	 */
	public EList<ErpPOLineItem> getErpPOLineItems() {
		if (erpPOLineItems == null) {
			erpPOLineItems = new BasicInternalEList<ErpPOLineItem>(ErpPOLineItem.class);
		}
		return erpPOLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue</em>' reference.
	 * @see #setAssetModelCatalogue(AssetModelCatalogue)
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems
	 * @generated
	 */
	public AssetModelCatalogue getAssetModelCatalogue() {
		if (assetModelCatalogue != null && assetModelCatalogue.eIsProxy()) {
			InternalEObject oldAssetModelCatalogue = (InternalEObject)assetModelCatalogue;
			assetModelCatalogue = (AssetModelCatalogue)eResolveProxy(oldAssetModelCatalogue);
			if (assetModelCatalogue != oldAssetModelCatalogue) {
			}
		}
		return assetModelCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogue basicGetAssetModelCatalogue() {
		return assetModelCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModelCatalogue(AssetModelCatalogue newAssetModelCatalogue, NotificationChain msgs) {
		AssetModelCatalogue oldAssetModelCatalogue = assetModelCatalogue;
		assetModelCatalogue = newAssetModelCatalogue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model Catalogue</em>' reference.
	 * @see #getAssetModelCatalogue()
	 * @generated
	 */
	public void setAssetModelCatalogue(AssetModelCatalogue newAssetModelCatalogue) {
		if (newAssetModelCatalogue != assetModelCatalogue) {
			NotificationChain msgs = null;
			if (assetModelCatalogue != null)
				msgs = ((InternalEObject)assetModelCatalogue).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, AssetModelCatalogue.class, msgs);
			if (newAssetModelCatalogue != null)
				msgs = ((InternalEObject)newAssetModelCatalogue).eInverseAdd(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, AssetModelCatalogue.class, msgs);
			msgs = basicSetAssetModelCatalogue(newAssetModelCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.ProductAssetModel#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model</em>' reference.
	 * @see #setAssetModel(ProductAssetModel)
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getAssetModelCatalogueItems
	 * @generated
	 */
	public ProductAssetModel getAssetModel() {
		if (assetModel != null && assetModel.eIsProxy()) {
			InternalEObject oldAssetModel = (InternalEObject)assetModel;
			assetModel = (ProductAssetModel)eResolveProxy(oldAssetModel);
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
	public ProductAssetModel basicGetAssetModel() {
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModel(ProductAssetModel newAssetModel, NotificationChain msgs) {
		ProductAssetModel oldAssetModel = assetModel;
		assetModel = newAssetModel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model</em>' reference.
	 * @see #getAssetModel()
	 * @generated
	 */
	public void setAssetModel(ProductAssetModel newAssetModel) {
		if (newAssetModel != assetModel) {
			NotificationChain msgs = null;
			if (assetModel != null)
				msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, ProductAssetModel.class, msgs);
			if (newAssetModel != null)
				msgs = ((InternalEObject)newAssetModel).eInverseAdd(this, AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, ProductAssetModel.class, msgs);
			msgs = basicSetAssetModel(newAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem
	 * @generated
	 */
	public EList<ErpQuoteLineItem> getErpQuoteLineItems() {
		if (erpQuoteLineItems == null) {
			erpQuoteLineItems = new BasicInternalEList<ErpQuoteLineItem>(ErpQuoteLineItem.class);
		}
		return erpQuoteLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Cost</em>' attribute.
	 * @see #isSetUnitCost()
	 * @see #unsetUnitCost()
	 * @see #setUnitCost(float)
	 * @generated
	 */
	public float getUnitCost() {
		return unitCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Cost</em>' attribute.
	 * @see #isSetUnitCost()
	 * @see #unsetUnitCost()
	 * @see #getUnitCost()
	 * @generated
	 */
	public void setUnitCost(float newUnitCost) {
		unitCost = newUnitCost;
		unitCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitCost()
	 * @see #getUnitCost()
	 * @see #setUnitCost(float)
	 * @generated
	 */
	public void unsetUnitCost() {
		unitCost = UNIT_COST_EDEFAULT;
		unitCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Cost</em>' attribute is set.
	 * @see #unsetUnitCost()
	 * @see #getUnitCost()
	 * @see #setUnitCost(float)
	 * @generated
	 */
	public boolean isSetUnitCost() {
		return unitCostESet;
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPOLineItems()).basicAdd(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				if (assetModelCatalogue != null)
					msgs = ((InternalEObject)assetModelCatalogue).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS, AssetModelCatalogue.class, msgs);
				return basicSetAssetModelCatalogue((AssetModelCatalogue)otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				if (assetModel != null)
					msgs = ((InternalEObject)assetModel).eInverseRemove(this, AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS, ProductAssetModel.class, msgs);
				return basicSetAssetModel((ProductAssetModel)otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpQuoteLineItems()).basicAdd(otherEnd, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<?>)getErpPOLineItems()).basicRemove(otherEnd, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				return basicSetAssetModelCatalogue(null, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				return basicSetAssetModel(null, msgs);
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return ((InternalEList<?>)getErpQuoteLineItems()).basicRemove(otherEnd, msgs);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return getErpPOLineItems();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				if (resolve) return getAssetModelCatalogue();
				return basicGetAssetModelCatalogue();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				if (resolve) return getAssetModel();
				return basicGetAssetModel();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return getErpQuoteLineItems();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				return getUnitCost();
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				getErpPOLineItems().addAll((Collection<? extends ErpPOLineItem>)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				setAssetModelCatalogue((AssetModelCatalogue)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				setAssetModel((ProductAssetModel)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				getErpQuoteLineItems().clear();
				getErpQuoteLineItems().addAll((Collection<? extends ErpQuoteLineItem>)newValue);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				setUnitCost((Float)newValue);
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				setAssetModelCatalogue((AssetModelCatalogue)null);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				setAssetModel((ProductAssetModel)null);
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				getErpQuoteLineItems().clear();
				return;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				unsetUnitCost();
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS:
				return erpPOLineItems != null && !erpPOLineItems.isEmpty();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE:
				return assetModelCatalogue != null;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL:
				return assetModel != null;
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS:
				return erpQuoteLineItems != null && !erpQuoteLineItems.isEmpty();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST:
				return isSetUnitCost();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unitCost: ");
		if (unitCostESet) result.append(unitCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AssetModelCatalogueItem
