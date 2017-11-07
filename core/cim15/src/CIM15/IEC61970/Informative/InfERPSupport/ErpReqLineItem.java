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
 * A representation of the model object '<em><b>Erp Req Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpReqLineItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getErpQuoteLineItem() <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpQuoteLineItem erpQuoteLineItem;

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
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * This is true if the Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costESet;

	/**
	 * The cached value of the '{@link #getErpRequisition() <em>Erp Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRequisition()
	 * @generated
	 * @ordered
	 */
	protected ErpRequisition erpRequisition;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * This is true if the Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityESet;

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
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected String deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * This is true if the Delivery Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deliveryDateESet;

	/**
	 * The cached value of the '{@link #getErpPOLineItem() <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpPOLineItem erpPOLineItem;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpReqLineItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_REQ_LINE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem
	 * @generated
	 */
	public ErpQuoteLineItem getErpQuoteLineItem() {
		if (erpQuoteLineItem != null && erpQuoteLineItem.eIsProxy()) {
			InternalEObject oldErpQuoteLineItem = (InternalEObject)erpQuoteLineItem;
			erpQuoteLineItem = (ErpQuoteLineItem)eResolveProxy(oldErpQuoteLineItem);
			if (erpQuoteLineItem != oldErpQuoteLineItem) {
			}
		}
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem basicGetErpQuoteLineItem() {
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem, NotificationChain msgs) {
		ErpQuoteLineItem oldErpQuoteLineItem = erpQuoteLineItem;
		erpQuoteLineItem = newErpQuoteLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public void setErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem) {
		if (newErpQuoteLineItem != erpQuoteLineItem) {
			NotificationChain msgs = null;
			if (erpQuoteLineItem != null)
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #setCost(float)
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #getCost()
	 * @generated
	 */
	public void setCost(float newCost) {
		cost = newCost;
		costESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCost()
	 * @see #getCost()
	 * @see #setCost(float)
	 * @generated
	 */
	public void unsetCost() {
		cost = COST_EDEFAULT;
		costESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCost <em>Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost</em>' attribute is set.
	 * @see #unsetCost()
	 * @see #getCost()
	 * @see #setCost(float)
	 * @generated
	 */
	public boolean isSetCost() {
		return costESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Requisition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Requisition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Requisition</em>' reference.
	 * @see #setErpRequisition(ErpRequisition)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition#getErpReqLineItems
	 * @generated
	 */
	public ErpRequisition getErpRequisition() {
		if (erpRequisition != null && erpRequisition.eIsProxy()) {
			InternalEObject oldErpRequisition = (InternalEObject)erpRequisition;
			erpRequisition = (ErpRequisition)eResolveProxy(oldErpRequisition);
			if (erpRequisition != oldErpRequisition) {
			}
		}
		return erpRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRequisition basicGetErpRequisition() {
		return erpRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRequisition(ErpRequisition newErpRequisition, NotificationChain msgs) {
		ErpRequisition oldErpRequisition = erpRequisition;
		erpRequisition = newErpRequisition;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpRequisition <em>Erp Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Requisition</em>' reference.
	 * @see #getErpRequisition()
	 * @generated
	 */
	public void setErpRequisition(ErpRequisition newErpRequisition) {
		if (newErpRequisition != erpRequisition) {
			NotificationChain msgs = null;
			if (erpRequisition != null)
				msgs = ((InternalEObject)erpRequisition).eInverseRemove(this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, ErpRequisition.class, msgs);
			if (newErpRequisition != null)
				msgs = ((InternalEObject)newErpRequisition).eInverseAdd(this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, ErpRequisition.class, msgs);
			msgs = basicSetErpRequisition(newErpRequisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * @see #setQuantity(int)
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
		quantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(int)
	 * @generated
	 */
	public void unsetQuantity() {
		quantity = QUANTITY_EDEFAULT;
		quantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(int)
	 * @generated
	 */
	public boolean isSetQuantity() {
		return quantityESet;
	}

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getErpReqLineItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeMaterial <em>Type Material</em>}' reference.
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
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #isSetDeliveryDate()
	 * @see #unsetDeliveryDate()
	 * @see #setDeliveryDate(String)
	 * @generated
	 */
	public String getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #isSetDeliveryDate()
	 * @see #unsetDeliveryDate()
	 * @see #getDeliveryDate()
	 * @generated
	 */
	public void setDeliveryDate(String newDeliveryDate) {
		deliveryDate = newDeliveryDate;
		deliveryDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeliveryDate()
	 * @see #getDeliveryDate()
	 * @see #setDeliveryDate(String)
	 * @generated
	 */
	public void unsetDeliveryDate() {
		deliveryDate = DELIVERY_DATE_EDEFAULT;
		deliveryDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getDeliveryDate <em>Delivery Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delivery Date</em>' attribute is set.
	 * @see #unsetDeliveryDate()
	 * @see #getDeliveryDate()
	 * @see #setDeliveryDate(String)
	 * @generated
	 */
	public boolean isSetDeliveryDate() {
		return deliveryDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp PO Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #setErpPOLineItem(ErpPOLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpReqLineItem
	 * @generated
	 */
	public ErpPOLineItem getErpPOLineItem() {
		if (erpPOLineItem != null && erpPOLineItem.eIsProxy()) {
			InternalEObject oldErpPOLineItem = (InternalEObject)erpPOLineItem;
			erpPOLineItem = (ErpPOLineItem)eResolveProxy(oldErpPOLineItem);
			if (erpPOLineItem != oldErpPOLineItem) {
			}
		}
		return erpPOLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPOLineItem basicGetErpPOLineItem() {
		return erpPOLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPOLineItem(ErpPOLineItem newErpPOLineItem, NotificationChain msgs) {
		ErpPOLineItem oldErpPOLineItem = erpPOLineItem;
		erpPOLineItem = newErpPOLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #getErpPOLineItem()
	 * @generated
	 */
	public void setErpPOLineItem(ErpPOLineItem newErpPOLineItem) {
		if (newErpPOLineItem != erpPOLineItem) {
			NotificationChain msgs = null;
			if (erpPOLineItem != null)
				msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpPOLineItem.class, msgs);
			if (newErpPOLineItem != null)
				msgs = ((InternalEObject)newErpPOLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpPOLineItem.class, msgs);
			msgs = basicSetErpPOLineItem(newErpPOLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
		codeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public void unsetCode() {
		code = CODE_EDEFAULT;
		codeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(GenericAssetModelOrMaterial)
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpReqLineItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getTypeAsset <em>Type Asset</em>}' reference.
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
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS, GenericAssetModelOrMaterial.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS, GenericAssetModelOrMaterial.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				if (erpRequisition != null)
					msgs = ((InternalEObject)erpRequisition).eInverseRemove(this, InfERPSupportPackage.ERP_REQUISITION__ERP_REQ_LINE_ITEMS, ErpRequisition.class, msgs);
				return basicSetErpRequisition((ErpRequisition)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__ERP_REQ_LINE_ITEMS, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (erpPOLineItem != null)
					msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REQ_LINE_ITEM, ErpPOLineItem.class, msgs);
				return basicSetErpPOLineItem((ErpPOLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS, GenericAssetModelOrMaterial.class, msgs);
				return basicSetTypeAsset((GenericAssetModelOrMaterial)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				return basicSetErpRequisition(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				return basicSetErpPOLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				return getCost();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				if (resolve) return getErpRequisition();
				return basicGetErpRequisition();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				return getQuantity();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				return getDeliveryDate();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (resolve) return getErpPOLineItem();
				return basicGetErpPOLineItem();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				return getCode();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				setCost((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				setErpRequisition((ErpRequisition)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				setDeliveryDate((String)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				setCode((String)newValue);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)newValue);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				unsetCost();
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				setErpRequisition((ErpRequisition)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				unsetQuantity();
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				unsetDeliveryDate();
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				unsetCode();
				return;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)null);
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
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__COST:
				return isSetCost();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_REQUISITION:
				return erpRequisition != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__QUANTITY:
				return isSetQuantity();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_MATERIAL:
				return typeMaterial != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__DELIVERY_DATE:
				return isSetDeliveryDate();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_PO_LINE_ITEM:
				return erpPOLineItem != null;
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__CODE:
				return isSetCode();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM__TYPE_ASSET:
				return typeAsset != null;
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
		result.append(" (cost: ");
		if (costESet) result.append(cost); else result.append("<unset>");
		result.append(", quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(", deliveryDate: ");
		if (deliveryDateESet) result.append(deliveryDate); else result.append("<unset>");
		result.append(", code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpReqLineItem
