/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfWork.MaterialItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Rec Delv Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpRecDelvLineItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItem() <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItem erpInvoiceLineItem;

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
	 * The cached value of the '{@link #getErpReceiveDelivery() <em>Erp Receive Delivery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReceiveDelivery()
	 * @generated
	 * @ordered
	 */
	protected ErpReceiveDelivery erpReceiveDelivery;

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
	 * The cached value of the '{@link #getErpPOLineItem() <em>Erp PO Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPOLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpPOLineItem erpPOLineItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpRecDelvLineItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_REC_DELV_LINE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getErpRecDeliveryItems
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem
	 * @generated
	 */
	public ErpInvoiceLineItem getErpInvoiceLineItem() {
		if (erpInvoiceLineItem != null && erpInvoiceLineItem.eIsProxy()) {
			InternalEObject oldErpInvoiceLineItem = (InternalEObject)erpInvoiceLineItem;
			erpInvoiceLineItem = (ErpInvoiceLineItem)eResolveProxy(oldErpInvoiceLineItem);
			if (erpInvoiceLineItem != oldErpInvoiceLineItem) {
			}
		}
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem basicGetErpInvoiceLineItem() {
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem, NotificationChain msgs) {
		ErpInvoiceLineItem oldErpInvoiceLineItem = erpInvoiceLineItem;
		erpInvoiceLineItem = newErpInvoiceLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public void setErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem) {
		if (newErpInvoiceLineItem != erpInvoiceLineItem) {
			NotificationChain msgs = null;
			if (erpInvoiceLineItem != null)
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Receive Delivery</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Receive Delivery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Receive Delivery</em>' reference.
	 * @see #setErpReceiveDelivery(ErpReceiveDelivery)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems
	 * @generated
	 */
	public ErpReceiveDelivery getErpReceiveDelivery() {
		if (erpReceiveDelivery != null && erpReceiveDelivery.eIsProxy()) {
			InternalEObject oldErpReceiveDelivery = (InternalEObject)erpReceiveDelivery;
			erpReceiveDelivery = (ErpReceiveDelivery)eResolveProxy(oldErpReceiveDelivery);
			if (erpReceiveDelivery != oldErpReceiveDelivery) {
			}
		}
		return erpReceiveDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceiveDelivery basicGetErpReceiveDelivery() {
		return erpReceiveDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpReceiveDelivery(ErpReceiveDelivery newErpReceiveDelivery, NotificationChain msgs) {
		ErpReceiveDelivery oldErpReceiveDelivery = erpReceiveDelivery;
		erpReceiveDelivery = newErpReceiveDelivery;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Receive Delivery</em>' reference.
	 * @see #getErpReceiveDelivery()
	 * @generated
	 */
	public void setErpReceiveDelivery(ErpReceiveDelivery newErpReceiveDelivery) {
		if (newErpReceiveDelivery != erpReceiveDelivery) {
			NotificationChain msgs = null;
			if (erpReceiveDelivery != null)
				msgs = ((InternalEObject)erpReceiveDelivery).eInverseRemove(this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, ErpReceiveDelivery.class, msgs);
			if (newErpReceiveDelivery != null)
				msgs = ((InternalEObject)newErpReceiveDelivery).eInverseAdd(this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, ErpReceiveDelivery.class, msgs);
			msgs = basicSetErpReceiveDelivery(newErpReceiveDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getErpRecDelvLineItems
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new BasicInternalEList<MaterialItem>(MaterialItem.class);
		}
		return materialItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp PO Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem <em>Erp Rec Del Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Item</em>' reference.
	 * @see #setErpPOLineItem(ErpPOLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpRecDelLineItem
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpPOLineItem <em>Erp PO Line Item</em>}' reference.
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
				msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, ErpPOLineItem.class, msgs);
			if (newErpPOLineItem != null)
				msgs = ((InternalEObject)newErpPOLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, ErpPOLineItem.class, msgs);
			msgs = basicSetErpPOLineItem(newErpPOLineItem, msgs);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				if (erpReceiveDelivery != null)
					msgs = ((InternalEObject)erpReceiveDelivery).eInverseRemove(this, InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS, ErpReceiveDelivery.class, msgs);
				return basicSetErpReceiveDelivery((ErpReceiveDelivery)otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (erpPOLineItem != null)
					msgs = ((InternalEObject)erpPOLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PO_LINE_ITEM__ERP_REC_DEL_LINE_ITEM, ErpPOLineItem.class, msgs);
				return basicSetErpPOLineItem((ErpPOLineItem)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				return basicSetErpReceiveDelivery(null, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				return basicSetErpPOLineItem(null, msgs);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return getAssets();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				if (resolve) return getErpReceiveDelivery();
				return basicGetErpReceiveDelivery();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				if (resolve) return getErpPOLineItem();
				return basicGetErpPOLineItem();
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				setErpReceiveDelivery((ErpReceiveDelivery)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)newValue);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				getAssets().clear();
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				setErpReceiveDelivery((ErpReceiveDelivery)null);
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				setErpPOLineItem((ErpPOLineItem)null);
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
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ASSETS:
				return assets != null && !assets.isEmpty();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_RECEIVE_DELIVERY:
				return erpReceiveDelivery != null;
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_PO_LINE_ITEM:
				return erpPOLineItem != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpRecDelvLineItem
