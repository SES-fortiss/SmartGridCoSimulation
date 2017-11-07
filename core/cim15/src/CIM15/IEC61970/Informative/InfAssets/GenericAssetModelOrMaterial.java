/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetModel;
import CIM15.IEC61968.Assets.ProductAssetModel;

import CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData;
import CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory;
import CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem;

import CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;
import CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue;

import CIM15.IEC61970.Informative.InfWork.CUAsset;
import CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Asset Model Or Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getProductAssetModels <em>Product Asset Models</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpInventoryIssues <em>Erp Inventory Issues</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getEstimatedUnitCost <em>Estimated Unit Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#isStockItem <em>Stock Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUAsset <em>CU Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericAssetModelOrMaterial extends AssetModel {
	/**
	 * The cached value of the '{@link #getErpReqLineItems() <em>Erp Req Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpReqLineItem> erpReqLineItems;

	/**
	 * The cached value of the '{@link #getProductAssetModels() <em>Product Asset Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductAssetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductAssetModel> productAssetModels;

	/**
	 * The cached value of the '{@link #getErpInventoryIssues() <em>Erp Inventory Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventoryIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpIssueInventory> erpInventoryIssues;

	/**
	 * The cached value of the '{@link #getCUWorkEquipmentAsset() <em>CU Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUWorkEquipmentAsset()
	 * @generated
	 * @ordered
	 */
	protected CUWorkEquipmentItem cuWorkEquipmentAsset;

	/**
	 * The default value of the '{@link #getEstimatedUnitCost() <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_UNIT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedUnitCost() <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedUnitCost()
	 * @generated
	 * @ordered
	 */
	protected float estimatedUnitCost = ESTIMATED_UNIT_COST_EDEFAULT;

	/**
	 * This is true if the Estimated Unit Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedUnitCostESet;

	/**
	 * The default value of the '{@link #isStockItem() <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOCK_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStockItem() <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStockItem()
	 * @generated
	 * @ordered
	 */
	protected boolean stockItem = STOCK_ITEM_EDEFAULT;

	/**
	 * This is true if the Stock Item attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stockItemESet;

	/**
	 * The cached value of the '{@link #getTypeAssetCatalogue() <em>Type Asset Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 * @ordered
	 */
	protected TypeAssetCatalogue typeAssetCatalogue;

	/**
	 * The cached value of the '{@link #getCUAsset() <em>CU Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUAsset()
	 * @generated
	 * @ordered
	 */
	protected CUAsset cuAsset;

	/**
	 * The cached value of the '{@link #getErpBomItemDatas() <em>Erp Bom Item Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBomItemDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBomItemData> erpBomItemDatas;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected String quantity = QUANTITY_EDEFAULT;

	/**
	 * This is true if the Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericAssetModelOrMaterial() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getGenericAssetModelOrMaterial();
	}

	/**
	 * Returns the value of the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset
	 * @generated
	 */
	public EList<ErpReqLineItem> getErpReqLineItems() {
		if (erpReqLineItems == null) {
			erpReqLineItems = new BasicInternalEList<ErpReqLineItem>(ErpReqLineItem.class);
		}
		return erpReqLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Product Asset Models</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.ProductAssetModel}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.ProductAssetModel#getGenericAssetModelOrMaterial <em>Generic Asset Model Or Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Asset Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Asset Models</em>' reference list.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getGenericAssetModelOrMaterial
	 * @generated
	 */
	public EList<ProductAssetModel> getProductAssetModels() {
		if (productAssetModels == null) {
			productAssetModels = new BasicInternalEList<ProductAssetModel>(ProductAssetModel.class);
		}
		return productAssetModels;
	}

	/**
	 * Returns the value of the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory Issues</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeAsset
	 * @generated
	 */
	public EList<ErpIssueInventory> getErpInventoryIssues() {
		if (erpInventoryIssues == null) {
			erpInventoryIssues = new BasicInternalEList<ErpIssueInventory>(ErpIssueInventory.class);
		}
		return erpInventoryIssues;
	}

	/**
	 * Returns the value of the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Work Equipment Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Work Equipment Asset</em>' reference.
	 * @see #setCUWorkEquipmentAsset(CUWorkEquipmentItem)
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset
	 * @generated
	 */
	public CUWorkEquipmentItem getCUWorkEquipmentAsset() {
		if (cuWorkEquipmentAsset != null && cuWorkEquipmentAsset.eIsProxy()) {
			InternalEObject oldCUWorkEquipmentAsset = (InternalEObject)cuWorkEquipmentAsset;
			cuWorkEquipmentAsset = (CUWorkEquipmentItem)eResolveProxy(oldCUWorkEquipmentAsset);
			if (cuWorkEquipmentAsset != oldCUWorkEquipmentAsset) {
			}
		}
		return cuWorkEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUWorkEquipmentItem basicGetCUWorkEquipmentAsset() {
		return cuWorkEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUWorkEquipmentAsset(CUWorkEquipmentItem newCUWorkEquipmentAsset, NotificationChain msgs) {
		CUWorkEquipmentItem oldCUWorkEquipmentAsset = cuWorkEquipmentAsset;
		cuWorkEquipmentAsset = newCUWorkEquipmentAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Work Equipment Asset</em>' reference.
	 * @see #getCUWorkEquipmentAsset()
	 * @generated
	 */
	public void setCUWorkEquipmentAsset(CUWorkEquipmentItem newCUWorkEquipmentAsset) {
		if (newCUWorkEquipmentAsset != cuWorkEquipmentAsset) {
			NotificationChain msgs = null;
			if (cuWorkEquipmentAsset != null)
				msgs = ((InternalEObject)cuWorkEquipmentAsset).eInverseRemove(this, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET, CUWorkEquipmentItem.class, msgs);
			if (newCUWorkEquipmentAsset != null)
				msgs = ((InternalEObject)newCUWorkEquipmentAsset).eInverseAdd(this, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET, CUWorkEquipmentItem.class, msgs);
			msgs = basicSetCUWorkEquipmentAsset(newCUWorkEquipmentAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Unit Cost</em>' attribute.
	 * @see #isSetEstimatedUnitCost()
	 * @see #unsetEstimatedUnitCost()
	 * @see #setEstimatedUnitCost(float)
	 * @generated
	 */
	public float getEstimatedUnitCost() {
		return estimatedUnitCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Unit Cost</em>' attribute.
	 * @see #isSetEstimatedUnitCost()
	 * @see #unsetEstimatedUnitCost()
	 * @see #getEstimatedUnitCost()
	 * @generated
	 */
	public void setEstimatedUnitCost(float newEstimatedUnitCost) {
		estimatedUnitCost = newEstimatedUnitCost;
		estimatedUnitCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedUnitCost()
	 * @see #getEstimatedUnitCost()
	 * @see #setEstimatedUnitCost(float)
	 * @generated
	 */
	public void unsetEstimatedUnitCost() {
		estimatedUnitCost = ESTIMATED_UNIT_COST_EDEFAULT;
		estimatedUnitCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getEstimatedUnitCost <em>Estimated Unit Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Unit Cost</em>' attribute is set.
	 * @see #unsetEstimatedUnitCost()
	 * @see #getEstimatedUnitCost()
	 * @see #setEstimatedUnitCost(float)
	 * @generated
	 */
	public boolean isSetEstimatedUnitCost() {
		return estimatedUnitCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Item</em>' attribute.
	 * @see #isSetStockItem()
	 * @see #unsetStockItem()
	 * @see #setStockItem(boolean)
	 * @generated
	 */
	public boolean isStockItem() {
		return stockItem;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#isStockItem <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Item</em>' attribute.
	 * @see #isSetStockItem()
	 * @see #unsetStockItem()
	 * @see #isStockItem()
	 * @generated
	 */
	public void setStockItem(boolean newStockItem) {
		stockItem = newStockItem;
		stockItemESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#isStockItem <em>Stock Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStockItem()
	 * @see #isStockItem()
	 * @see #setStockItem(boolean)
	 * @generated
	 */
	public void unsetStockItem() {
		stockItem = STOCK_ITEM_EDEFAULT;
		stockItemESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#isStockItem <em>Stock Item</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stock Item</em>' attribute is set.
	 * @see #unsetStockItem()
	 * @see #isStockItem()
	 * @see #setStockItem(boolean)
	 * @generated
	 */
	public boolean isSetStockItem() {
		return stockItemESet;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets <em>Type Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset Catalogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset Catalogue</em>' reference.
	 * @see #setTypeAssetCatalogue(TypeAssetCatalogue)
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets
	 * @generated
	 */
	public TypeAssetCatalogue getTypeAssetCatalogue() {
		if (typeAssetCatalogue != null && typeAssetCatalogue.eIsProxy()) {
			InternalEObject oldTypeAssetCatalogue = (InternalEObject)typeAssetCatalogue;
			typeAssetCatalogue = (TypeAssetCatalogue)eResolveProxy(oldTypeAssetCatalogue);
			if (typeAssetCatalogue != oldTypeAssetCatalogue) {
			}
		}
		return typeAssetCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssetCatalogue basicGetTypeAssetCatalogue() {
		return typeAssetCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAssetCatalogue(TypeAssetCatalogue newTypeAssetCatalogue, NotificationChain msgs) {
		TypeAssetCatalogue oldTypeAssetCatalogue = typeAssetCatalogue;
		typeAssetCatalogue = newTypeAssetCatalogue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset Catalogue</em>' reference.
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 */
	public void setTypeAssetCatalogue(TypeAssetCatalogue newTypeAssetCatalogue) {
		if (newTypeAssetCatalogue != typeAssetCatalogue) {
			NotificationChain msgs = null;
			if (typeAssetCatalogue != null)
				msgs = ((InternalEObject)typeAssetCatalogue).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, TypeAssetCatalogue.class, msgs);
			if (newTypeAssetCatalogue != null)
				msgs = ((InternalEObject)newTypeAssetCatalogue).eInverseAdd(this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, TypeAssetCatalogue.class, msgs);
			msgs = basicSetTypeAssetCatalogue(newTypeAssetCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>CU Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Asset</em>' reference.
	 * @see #setCUAsset(CUAsset)
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAsset
	 * @generated
	 */
	public CUAsset getCUAsset() {
		if (cuAsset != null && cuAsset.eIsProxy()) {
			InternalEObject oldCUAsset = (InternalEObject)cuAsset;
			cuAsset = (CUAsset)eResolveProxy(oldCUAsset);
			if (cuAsset != oldCUAsset) {
			}
		}
		return cuAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAsset basicGetCUAsset() {
		return cuAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUAsset(CUAsset newCUAsset, NotificationChain msgs) {
		CUAsset oldCUAsset = cuAsset;
		cuAsset = newCUAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUAsset <em>CU Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Asset</em>' reference.
	 * @see #getCUAsset()
	 * @generated
	 */
	public void setCUAsset(CUAsset newCUAsset) {
		if (newCUAsset != cuAsset) {
			NotificationChain msgs = null;
			if (cuAsset != null)
				msgs = ((InternalEObject)cuAsset).eInverseRemove(this, InfWorkPackage.CU_ASSET__TYPE_ASSET, CUAsset.class, msgs);
			if (newCUAsset != null)
				msgs = ((InternalEObject)newCUAsset).eInverseAdd(this, InfWorkPackage.CU_ASSET__TYPE_ASSET, CUAsset.class, msgs);
			msgs = basicSetCUAsset(newCUAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Bom Item Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Bom Item Datas</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getTypeAsset
	 * @generated
	 */
	public EList<ErpBomItemData> getErpBomItemDatas() {
		if (erpBomItemDatas == null) {
			erpBomItemDatas = new BasicInternalEList<ErpBomItemData>(ErpBomItemData.class);
		}
		return erpBomItemDatas;
	}

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #setQuantity(String)
	 * @generated
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(String newQuantity) {
		quantity = newQuantity;
		quantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(String)
	 * @generated
	 */
	public void unsetQuantity() {
		quantity = QUANTITY_EDEFAULT;
		quantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(String)
	 * @generated
	 */
	public boolean isSetQuantity() {
		return quantityESet;
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
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpReqLineItems()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductAssetModels()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInventoryIssues()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET:
				if (cuWorkEquipmentAsset != null)
					msgs = ((InternalEObject)cuWorkEquipmentAsset).eInverseRemove(this, InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET, CUWorkEquipmentItem.class, msgs);
				return basicSetCUWorkEquipmentAsset((CUWorkEquipmentItem)otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE:
				if (typeAssetCatalogue != null)
					msgs = ((InternalEObject)typeAssetCatalogue).eInverseRemove(this, InfTypeAssetPackage.TYPE_ASSET_CATALOGUE__TYPE_ASSETS, TypeAssetCatalogue.class, msgs);
				return basicSetTypeAssetCatalogue((TypeAssetCatalogue)otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET:
				if (cuAsset != null)
					msgs = ((InternalEObject)cuAsset).eInverseRemove(this, InfWorkPackage.CU_ASSET__TYPE_ASSET, CUAsset.class, msgs);
				return basicSetCUAsset((CUAsset)otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBomItemDatas()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<?>)getErpReqLineItems()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS:
				return ((InternalEList<?>)getProductAssetModels()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES:
				return ((InternalEList<?>)getErpInventoryIssues()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET:
				return basicSetCUWorkEquipmentAsset(null, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE:
				return basicSetTypeAssetCatalogue(null, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET:
				return basicSetCUAsset(null, msgs);
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<?>)getErpBomItemDatas()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS:
				return getErpReqLineItems();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS:
				return getProductAssetModels();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES:
				return getErpInventoryIssues();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET:
				if (resolve) return getCUWorkEquipmentAsset();
				return basicGetCUWorkEquipmentAsset();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ESTIMATED_UNIT_COST:
				return getEstimatedUnitCost();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__STOCK_ITEM:
				return isStockItem();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE:
				if (resolve) return getTypeAssetCatalogue();
				return basicGetTypeAssetCatalogue();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET:
				if (resolve) return getCUAsset();
				return basicGetCUAsset();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS:
				return getErpBomItemDatas();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__QUANTITY:
				return getQuantity();
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
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				getErpReqLineItems().addAll((Collection<? extends ErpReqLineItem>)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS:
				getProductAssetModels().clear();
				getProductAssetModels().addAll((Collection<? extends ProductAssetModel>)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES:
				getErpInventoryIssues().clear();
				getErpInventoryIssues().addAll((Collection<? extends ErpIssueInventory>)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET:
				setCUWorkEquipmentAsset((CUWorkEquipmentItem)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ESTIMATED_UNIT_COST:
				setEstimatedUnitCost((Float)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__STOCK_ITEM:
				setStockItem((Boolean)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE:
				setTypeAssetCatalogue((TypeAssetCatalogue)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET:
				setCUAsset((CUAsset)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				getErpBomItemDatas().addAll((Collection<? extends ErpBomItemData>)newValue);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__QUANTITY:
				setQuantity((String)newValue);
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
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS:
				getProductAssetModels().clear();
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES:
				getErpInventoryIssues().clear();
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET:
				setCUWorkEquipmentAsset((CUWorkEquipmentItem)null);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ESTIMATED_UNIT_COST:
				unsetEstimatedUnitCost();
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__STOCK_ITEM:
				unsetStockItem();
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE:
				setTypeAssetCatalogue((TypeAssetCatalogue)null);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET:
				setCUAsset((CUAsset)null);
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				return;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__QUANTITY:
				unsetQuantity();
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
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS:
				return erpReqLineItems != null && !erpReqLineItems.isEmpty();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS:
				return productAssetModels != null && !productAssetModels.isEmpty();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES:
				return erpInventoryIssues != null && !erpInventoryIssues.isEmpty();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET:
				return cuWorkEquipmentAsset != null;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ESTIMATED_UNIT_COST:
				return isSetEstimatedUnitCost();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__STOCK_ITEM:
				return isSetStockItem();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE:
				return typeAssetCatalogue != null;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET:
				return cuAsset != null;
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS:
				return erpBomItemDatas != null && !erpBomItemDatas.isEmpty();
			case InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__QUANTITY:
				return isSetQuantity();
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
		result.append(" (estimatedUnitCost: ");
		if (estimatedUnitCostESet) result.append(estimatedUnitCost); else result.append("<unset>");
		result.append(", stockItem: ");
		if (stockItemESet) result.append(stockItem); else result.append("<unset>");
		result.append(", quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GenericAssetModelOrMaterial
