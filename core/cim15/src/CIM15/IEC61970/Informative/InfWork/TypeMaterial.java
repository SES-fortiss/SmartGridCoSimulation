/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory;
import CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpIssueInventories <em>Erp Issue Inventories</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMaterial extends Document {
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
	 * The cached value of the '{@link #getErpIssueInventories() <em>Erp Issue Inventories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpIssueInventories()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpIssueInventory> erpIssueInventories;

	/**
	 * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected String costType = COST_TYPE_EDEFAULT;

	/**
	 * This is true if the Cost Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costTypeESet;

	/**
	 * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialItem> materialItems;

	/**
	 * The cached value of the '{@link #getCUMaterialItems() <em>CU Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUMaterialItem> cuMaterialItems;

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
	 * The default value of the '{@link #getEstUnitCost() <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final float EST_UNIT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstUnitCost() <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUnitCost()
	 * @generated
	 * @ordered
	 */
	protected float estUnitCost = EST_UNIT_COST_EDEFAULT;

	/**
	 * This is true if the Est Unit Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estUnitCostESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMaterial() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.TYPE_MATERIAL;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#isStockItem <em>Stock Item</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Erp Issue Inventories</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Issue Inventories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Issue Inventories</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory#getTypeMaterial
	 * @generated
	 */
	public EList<ErpIssueInventory> getErpIssueInventories() {
		if (erpIssueInventories == null) {
			erpIssueInventories = new BasicInternalEList<ErpIssueInventory>(ErpIssueInventory.class);
		}
		return erpIssueInventories;
	}

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see #isSetCostType()
	 * @see #unsetCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #isSetCostType()
	 * @see #unsetCostType()
	 * @see #getCostType()
	 * @generated
	 */
	public void setCostType(String newCostType) {
		costType = newCostType;
		costTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostType()
	 * @see #getCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	public void unsetCostType() {
		costType = COST_TYPE_EDEFAULT;
		costTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCostType <em>Cost Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Type</em>' attribute is set.
	 * @see #unsetCostType()
	 * @see #getCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	public boolean isSetCostType() {
		return costTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new BasicInternalEList<MaterialItem>(MaterialItem.class);
		}
		return materialItems;
	}

	/**
	 * Returns the value of the '<em><b>CU Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial
	 * @generated
	 */
	public EList<CUMaterialItem> getCUMaterialItems() {
		if (cuMaterialItems == null) {
			cuMaterialItems = new BasicInternalEList<CUMaterialItem>(CUMaterialItem.class);
		}
		return cuMaterialItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial
	 * @generated
	 */
	public EList<ErpReqLineItem> getErpReqLineItems() {
		if (erpReqLineItems == null) {
			erpReqLineItems = new BasicInternalEList<ErpReqLineItem>(ErpReqLineItem.class);
		}
		return erpReqLineItems;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getQuantity <em>Quantity</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Est Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Unit Cost</em>' attribute.
	 * @see #isSetEstUnitCost()
	 * @see #unsetEstUnitCost()
	 * @see #setEstUnitCost(float)
	 * @generated
	 */
	public float getEstUnitCost() {
		return estUnitCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Unit Cost</em>' attribute.
	 * @see #isSetEstUnitCost()
	 * @see #unsetEstUnitCost()
	 * @see #getEstUnitCost()
	 * @generated
	 */
	public void setEstUnitCost(float newEstUnitCost) {
		estUnitCost = newEstUnitCost;
		estUnitCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstUnitCost()
	 * @see #getEstUnitCost()
	 * @see #setEstUnitCost(float)
	 * @generated
	 */
	public void unsetEstUnitCost() {
		estUnitCost = EST_UNIT_COST_EDEFAULT;
		estUnitCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getEstUnitCost <em>Est Unit Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Est Unit Cost</em>' attribute is set.
	 * @see #unsetEstUnitCost()
	 * @see #getEstUnitCost()
	 * @see #setEstUnitCost(float)
	 * @generated
	 */
	public boolean isSetEstUnitCost() {
		return estUnitCostESet;
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpIssueInventories()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpReqLineItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return ((InternalEList<?>)getErpIssueInventories()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return ((InternalEList<?>)getCUMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return ((InternalEList<?>)getErpReqLineItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				return isStockItem();
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return getErpIssueInventories();
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				return getCostType();
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return getCUMaterialItems();
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return getErpReqLineItems();
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				return getQuantity();
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				return getEstUnitCost();
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
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				setStockItem((Boolean)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				getErpIssueInventories().clear();
				getErpIssueInventories().addAll((Collection<? extends ErpIssueInventory>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				getCUMaterialItems().addAll((Collection<? extends CUMaterialItem>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				getErpReqLineItems().addAll((Collection<? extends ErpReqLineItem>)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				setQuantity((String)newValue);
				return;
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				setEstUnitCost((Float)newValue);
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
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				unsetStockItem();
				return;
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				getErpIssueInventories().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				unsetCostType();
				return;
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				getErpReqLineItems().clear();
				return;
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				unsetQuantity();
				return;
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				unsetEstUnitCost();
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
			case InfWorkPackage.TYPE_MATERIAL__STOCK_ITEM:
				return isSetStockItem();
			case InfWorkPackage.TYPE_MATERIAL__ERP_ISSUE_INVENTORIES:
				return erpIssueInventories != null && !erpIssueInventories.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__COST_TYPE:
				return isSetCostType();
			case InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS:
				return cuMaterialItems != null && !cuMaterialItems.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS:
				return erpReqLineItems != null && !erpReqLineItems.isEmpty();
			case InfWorkPackage.TYPE_MATERIAL__QUANTITY:
				return isSetQuantity();
			case InfWorkPackage.TYPE_MATERIAL__EST_UNIT_COST:
				return isSetEstUnitCost();
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
		result.append(" (stockItem: ");
		if (stockItemESet) result.append(stockItem); else result.append("<unset>");
		result.append(", costType: ");
		if (costTypeESet) result.append(costType); else result.append("<unset>");
		result.append(", quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(", estUnitCost: ");
		if (estUnitCostESet) result.append(estUnitCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TypeMaterial
