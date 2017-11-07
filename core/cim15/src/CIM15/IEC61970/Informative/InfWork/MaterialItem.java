/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount;
import CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem;
import CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpInventoryCounts <em>Erp Inventory Counts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getUsages <em>Usages</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaterialItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getErpInventoryCounts() <em>Erp Inventory Counts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventoryCounts()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInventoryCount> erpInventoryCounts;

	/**
	 * The default value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected String costDescription = COST_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Cost Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costDescriptionESet;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usages;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * This is true if the Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityESet;

	/**
	 * The cached value of the '{@link #getErpRecDelvLineItems() <em>Erp Rec Delv Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDelvLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecDelvLineItem> erpRecDelvLineItems;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getMaterialCode() <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterialCode() <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialCode()
	 * @generated
	 * @ordered
	 */
	protected String materialCode = MATERIAL_CODE_EDEFAULT;

	/**
	 * This is true if the Material Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materialCodeESet;

	/**
	 * The default value of the '{@link #getExternalRefID() <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalRefID() <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefID()
	 * @generated
	 * @ordered
	 */
	protected String externalRefID = EXTERNAL_REF_ID_EDEFAULT;

	/**
	 * This is true if the External Ref ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalRefIDESet;

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
	 * The cached value of the '{@link #getTypeMaterial() <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMaterial()
	 * @generated
	 * @ordered
	 */
	protected TypeMaterial typeMaterial;

	/**
	 * The cached value of the '{@link #getWorkCostDetail() <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetail()
	 * @generated
	 * @ordered
	 */
	protected WorkCostDetail workCostDetail;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected String account = ACCOUNT_EDEFAULT;

	/**
	 * This is true if the Account attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountESet;

	/**
	 * The default value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUAL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected float actualCost = ACTUAL_COST_EDEFAULT;

	/**
	 * This is true if the Actual Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualCostESet;

	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.MATERIAL_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory Counts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory Counts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount#getMaterialItem
	 * @generated
	 */
	public EList<ErpInventoryCount> getErpInventoryCounts() {
		if (erpInventoryCounts == null) {
			erpInventoryCounts = new BasicInternalEList<ErpInventoryCount>(ErpInventoryCount.class);
		}
		return erpInventoryCounts;
	}

	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' attribute.
	 * @see #isSetCostDescription()
	 * @see #unsetCostDescription()
	 * @see #setCostDescription(String)
	 * @generated
	 */
	public String getCostDescription() {
		return costDescription;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' attribute.
	 * @see #isSetCostDescription()
	 * @see #unsetCostDescription()
	 * @see #getCostDescription()
	 * @generated
	 */
	public void setCostDescription(String newCostDescription) {
		costDescription = newCostDescription;
		costDescriptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostDescription()
	 * @see #getCostDescription()
	 * @see #setCostDescription(String)
	 * @generated
	 */
	public void unsetCostDescription() {
		costDescription = COST_DESCRIPTION_EDEFAULT;
		costDescriptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostDescription <em>Cost Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Description</em>' attribute is set.
	 * @see #unsetCostDescription()
	 * @see #getCostDescription()
	 * @see #setCostDescription(String)
	 * @generated
	 */
	public boolean isSetCostDescription() {
		return costDescriptionESet;
	}

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Usage}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Usage#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getMaterialItem
	 * @generated
	 */
	public EList<Usage> getUsages() {
		if (usages == null) {
			usages = new BasicInternalEList<Usage>(Usage.class);
		}
		return usages;
	}

	/**
	 * Returns the value of the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem <em>Material Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getMaterialItem
	 * @generated
	 */
	public EList<ErpPOLineItem> getErpPOLineItems() {
		if (erpPOLineItems == null) {
			erpPOLineItems = new BasicInternalEList<ErpPOLineItem>(ErpPOLineItem.class);
		}
		return erpPOLineItems;
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
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		quantity = newQuantity;
		quantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public void unsetQuantity() {
		quantity = QUANTITY_EDEFAULT;
		quantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public boolean isSetQuantity() {
		return quantityESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delv Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delv Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems
	 * @generated
	 */
	public EList<ErpRecDelvLineItem> getErpRecDelvLineItems() {
		if (erpRecDelvLineItems == null) {
			erpRecDelvLineItems = new BasicInternalEList<ErpRecDelvLineItem>(ErpRecDelvLineItem.class);
		}
		return erpRecDelvLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}' reference.
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
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.MATERIAL_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.MATERIAL_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Material Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Code</em>' attribute.
	 * @see #isSetMaterialCode()
	 * @see #unsetMaterialCode()
	 * @see #setMaterialCode(String)
	 * @generated
	 */
	public String getMaterialCode() {
		return materialCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Code</em>' attribute.
	 * @see #isSetMaterialCode()
	 * @see #unsetMaterialCode()
	 * @see #getMaterialCode()
	 * @generated
	 */
	public void setMaterialCode(String newMaterialCode) {
		materialCode = newMaterialCode;
		materialCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterialCode()
	 * @see #getMaterialCode()
	 * @see #setMaterialCode(String)
	 * @generated
	 */
	public void unsetMaterialCode() {
		materialCode = MATERIAL_CODE_EDEFAULT;
		materialCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getMaterialCode <em>Material Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Material Code</em>' attribute is set.
	 * @see #unsetMaterialCode()
	 * @see #getMaterialCode()
	 * @see #setMaterialCode(String)
	 * @generated
	 */
	public boolean isSetMaterialCode() {
		return materialCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref ID</em>' attribute.
	 * @see #isSetExternalRefID()
	 * @see #unsetExternalRefID()
	 * @see #setExternalRefID(String)
	 * @generated
	 */
	public String getExternalRefID() {
		return externalRefID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ref ID</em>' attribute.
	 * @see #isSetExternalRefID()
	 * @see #unsetExternalRefID()
	 * @see #getExternalRefID()
	 * @generated
	 */
	public void setExternalRefID(String newExternalRefID) {
		externalRefID = newExternalRefID;
		externalRefIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalRefID()
	 * @see #getExternalRefID()
	 * @see #setExternalRefID(String)
	 * @generated
	 */
	public void unsetExternalRefID() {
		externalRefID = EXTERNAL_REF_ID_EDEFAULT;
		externalRefIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getExternalRefID <em>External Ref ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Ref ID</em>' attribute is set.
	 * @see #unsetExternalRefID()
	 * @see #getExternalRefID()
	 * @see #setExternalRefID(String)
	 * @generated
	 */
	public boolean isSetExternalRefID() {
		return externalRefIDESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getCostType <em>Cost Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getMaterialItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getTypeMaterial <em>Type Material</em>}' reference.
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
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems
	 * @generated
	 */
	public WorkCostDetail getWorkCostDetail() {
		if (workCostDetail != null && workCostDetail.eIsProxy()) {
			InternalEObject oldWorkCostDetail = (InternalEObject)workCostDetail;
			workCostDetail = (WorkCostDetail)eResolveProxy(oldWorkCostDetail);
			if (workCostDetail != oldWorkCostDetail) {
			}
		}
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail basicGetWorkCostDetail() {
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCostDetail(WorkCostDetail newWorkCostDetail, NotificationChain msgs) {
		WorkCostDetail oldWorkCostDetail = workCostDetail;
		workCostDetail = newWorkCostDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public void setWorkCostDetail(WorkCostDetail newWorkCostDetail) {
		if (newWorkCostDetail != workCostDetail) {
			NotificationChain msgs = null;
			if (workCostDetail != null)
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #isSetAccount()
	 * @see #unsetAccount()
	 * @see #setAccount(String)
	 * @generated
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #isSetAccount()
	 * @see #unsetAccount()
	 * @see #getAccount()
	 * @generated
	 */
	public void setAccount(String newAccount) {
		account = newAccount;
		accountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccount()
	 * @see #getAccount()
	 * @see #setAccount(String)
	 * @generated
	 */
	public void unsetAccount() {
		account = ACCOUNT_EDEFAULT;
		accountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getAccount <em>Account</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account</em>' attribute is set.
	 * @see #unsetAccount()
	 * @see #getAccount()
	 * @see #setAccount(String)
	 * @generated
	 */
	public boolean isSetAccount() {
		return accountESet;
	}

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #isSetActualCost()
	 * @see #unsetActualCost()
	 * @see #setActualCost(float)
	 * @generated
	 */
	public float getActualCost() {
		return actualCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #isSetActualCost()
	 * @see #unsetActualCost()
	 * @see #getActualCost()
	 * @generated
	 */
	public void setActualCost(float newActualCost) {
		actualCost = newActualCost;
		actualCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualCost()
	 * @see #getActualCost()
	 * @see #setActualCost(float)
	 * @generated
	 */
	public void unsetActualCost() {
		actualCost = ACTUAL_COST_EDEFAULT;
		actualCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getActualCost <em>Actual Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Cost</em>' attribute is set.
	 * @see #unsetActualCost()
	 * @see #getActualCost()
	 * @see #setActualCost(float)
	 * @generated
	 */
	public boolean isSetActualCost() {
		return actualCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getMaterialItems <em>Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getMaterialItems
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInventoryCounts()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPOLineItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecDelvLineItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__MATERIAL_ITEMS, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS, WorkCostDetail.class, msgs);
				return basicSetWorkCostDetail((WorkCostDetail)otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MATERIAL_ITEMS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return ((InternalEList<?>)getErpInventoryCounts()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return ((InternalEList<?>)getErpPOLineItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecDelvLineItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				return basicSetWorkCostDetail(null, msgs);
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				return basicSetWorkTask(null, msgs);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return getErpInventoryCounts();
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				return getCostDescription();
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return getUsages();
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return getErpPOLineItems();
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				return getQuantity();
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return getErpRecDelvLineItems();
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				return getStatus();
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				return getMaterialCode();
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				return getExternalRefID();
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				return getCostType();
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				return getAccount();
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				return getActualCost();
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				getErpInventoryCounts().addAll((Collection<? extends ErpInventoryCount>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				setCostDescription((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Usage>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				getErpPOLineItems().addAll((Collection<? extends ErpPOLineItem>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
				getErpRecDelvLineItems().addAll((Collection<? extends ErpRecDelvLineItem>)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				setMaterialCode((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				setExternalRefID((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				setAccount((String)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				setActualCost((Float)newValue);
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				setWorkTask((WorkTask)newValue);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				getErpInventoryCounts().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				unsetCostDescription();
				return;
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				getUsages().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				unsetQuantity();
				return;
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
				return;
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				unsetMaterialCode();
				return;
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				unsetExternalRefID();
				return;
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				unsetCostType();
				return;
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				unsetAccount();
				return;
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				unsetActualCost();
				return;
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				setWorkTask((WorkTask)null);
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
			case InfWorkPackage.MATERIAL_ITEM__ERP_INVENTORY_COUNTS:
				return erpInventoryCounts != null && !erpInventoryCounts.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__COST_DESCRIPTION:
				return isSetCostDescription();
			case InfWorkPackage.MATERIAL_ITEM__USAGES:
				return usages != null && !usages.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__ERP_PO_LINE_ITEMS:
				return erpPOLineItems != null && !erpPOLineItems.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__QUANTITY:
				return isSetQuantity();
			case InfWorkPackage.MATERIAL_ITEM__ERP_REC_DELV_LINE_ITEMS:
				return erpRecDelvLineItems != null && !erpRecDelvLineItems.isEmpty();
			case InfWorkPackage.MATERIAL_ITEM__DESIGN_LOCATION:
				return designLocation != null;
			case InfWorkPackage.MATERIAL_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.MATERIAL_ITEM__MATERIAL_CODE:
				return isSetMaterialCode();
			case InfWorkPackage.MATERIAL_ITEM__EXTERNAL_REF_ID:
				return isSetExternalRefID();
			case InfWorkPackage.MATERIAL_ITEM__COST_TYPE:
				return isSetCostType();
			case InfWorkPackage.MATERIAL_ITEM__TYPE_MATERIAL:
				return typeMaterial != null;
			case InfWorkPackage.MATERIAL_ITEM__WORK_COST_DETAIL:
				return workCostDetail != null;
			case InfWorkPackage.MATERIAL_ITEM__ACCOUNT:
				return isSetAccount();
			case InfWorkPackage.MATERIAL_ITEM__ACTUAL_COST:
				return isSetActualCost();
			case InfWorkPackage.MATERIAL_ITEM__WORK_TASK:
				return workTask != null;
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
		result.append(" (costDescription: ");
		if (costDescriptionESet) result.append(costDescription); else result.append("<unset>");
		result.append(", quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(", materialCode: ");
		if (materialCodeESet) result.append(materialCode); else result.append("<unset>");
		result.append(", externalRefID: ");
		if (externalRefIDESet) result.append(externalRefID); else result.append("<unset>");
		result.append(", costType: ");
		if (costTypeESet) result.append(costType); else result.append("<unset>");
		result.append(", account: ");
		if (accountESet) result.append(account); else result.append("<unset>");
		result.append(", actualCost: ");
		if (actualCostESet) result.append(actualCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MaterialItem
