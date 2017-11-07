/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;
import CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM15.IEC61970.Informative.InfWork.Design;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.Request;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Quote Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpQuoteLineItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getErpQuote() <em>Erp Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuote()
	 * @generated
	 * @ordered
	 */
	protected ErpQuote erpQuote;

	/**
	 * The cached value of the '{@link #getAssetModelCatalogueItem() <em>Asset Model Catalogue Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 * @ordered
	 */
	protected AssetModelCatalogueItem assetModelCatalogueItem;

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
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

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
	 * The cached value of the '{@link #getErpReqLineItem() <em>Erp Req Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpReqLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpReqLineItem erpReqLineItem;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpQuoteLineItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_QUOTE_LINE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Erp Quote</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote</em>' reference.
	 * @see #setErpQuote(ErpQuote)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuote#getErpQuoteLineItems
	 * @generated
	 */
	public ErpQuote getErpQuote() {
		if (erpQuote != null && erpQuote.eIsProxy()) {
			InternalEObject oldErpQuote = (InternalEObject)erpQuote;
			erpQuote = (ErpQuote)eResolveProxy(oldErpQuote);
			if (erpQuote != oldErpQuote) {
			}
		}
		return erpQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuote basicGetErpQuote() {
		return erpQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuote(ErpQuote newErpQuote, NotificationChain msgs) {
		ErpQuote oldErpQuote = erpQuote;
		erpQuote = newErpQuote;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpQuote <em>Erp Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote</em>' reference.
	 * @see #getErpQuote()
	 * @generated
	 */
	public void setErpQuote(ErpQuote newErpQuote) {
		if (newErpQuote != erpQuote) {
			NotificationChain msgs = null;
			if (erpQuote != null)
				msgs = ((InternalEObject)erpQuote).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, ErpQuote.class, msgs);
			if (newErpQuote != null)
				msgs = ((InternalEObject)newErpQuote).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, ErpQuote.class, msgs);
			msgs = basicSetErpQuote(newErpQuote, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Item</em>' reference.
	 * @see #setAssetModelCatalogueItem(AssetModelCatalogueItem)
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems
	 * @generated
	 */
	public AssetModelCatalogueItem getAssetModelCatalogueItem() {
		if (assetModelCatalogueItem != null && assetModelCatalogueItem.eIsProxy()) {
			InternalEObject oldAssetModelCatalogueItem = (InternalEObject)assetModelCatalogueItem;
			assetModelCatalogueItem = (AssetModelCatalogueItem)eResolveProxy(oldAssetModelCatalogueItem);
			if (assetModelCatalogueItem != oldAssetModelCatalogueItem) {
			}
		}
		return assetModelCatalogueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogueItem basicGetAssetModelCatalogueItem() {
		return assetModelCatalogueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetModelCatalogueItem(AssetModelCatalogueItem newAssetModelCatalogueItem, NotificationChain msgs) {
		AssetModelCatalogueItem oldAssetModelCatalogueItem = assetModelCatalogueItem;
		assetModelCatalogueItem = newAssetModelCatalogueItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getAssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Model Catalogue Item</em>' reference.
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	public void setAssetModelCatalogueItem(AssetModelCatalogueItem newAssetModelCatalogueItem) {
		if (newAssetModelCatalogueItem != assetModelCatalogueItem) {
			NotificationChain msgs = null;
			if (assetModelCatalogueItem != null)
				msgs = ((InternalEObject)assetModelCatalogueItem).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
			if (newAssetModelCatalogueItem != null)
				msgs = ((InternalEObject)newAssetModelCatalogueItem).eInverseAdd(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
			msgs = basicSetAssetModelCatalogueItem(newAssetModelCatalogueItem, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem
	 * @generated
	 */
	public Design getDesign() {
		if (design != null && design.eIsProxy()) {
			InternalEObject oldDesign = (InternalEObject)design;
			design = (Design)eResolveProxy(oldDesign);
			if (design != oldDesign) {
			}
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design basicGetDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' reference.
	 * @see #getDesign()
	 * @generated
	 */
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
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
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Req Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Req Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Req Line Item</em>' reference.
	 * @see #setErpReqLineItem(ErpReqLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem#getErpQuoteLineItem
	 * @generated
	 */
	public ErpReqLineItem getErpReqLineItem() {
		if (erpReqLineItem != null && erpReqLineItem.eIsProxy()) {
			InternalEObject oldErpReqLineItem = (InternalEObject)erpReqLineItem;
			erpReqLineItem = (ErpReqLineItem)eResolveProxy(oldErpReqLineItem);
			if (erpReqLineItem != oldErpReqLineItem) {
			}
		}
		return erpReqLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReqLineItem basicGetErpReqLineItem() {
		return erpReqLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpReqLineItem(ErpReqLineItem newErpReqLineItem, NotificationChain msgs) {
		ErpReqLineItem oldErpReqLineItem = erpReqLineItem;
		erpReqLineItem = newErpReqLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpReqLineItem <em>Erp Req Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Req Line Item</em>' reference.
	 * @see #getErpReqLineItem()
	 * @generated
	 */
	public void setErpReqLineItem(ErpReqLineItem newErpReqLineItem) {
		if (newErpReqLineItem != erpReqLineItem) {
			NotificationChain msgs = null;
			if (erpReqLineItem != null)
				msgs = ((InternalEObject)erpReqLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpReqLineItem.class, msgs);
			if (newErpReqLineItem != null)
				msgs = ((InternalEObject)newErpReqLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpReqLineItem.class, msgs);
			msgs = basicSetErpReqLineItem(newErpReqLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Request)
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getErpQuoteLineItem
	 * @generated
	 */
	public Request getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Request)eResolveProxy(oldRequest);
			if (request != oldRequest) {
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, Request.class, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, Request.class, msgs);
			msgs = basicSetRequest(newRequest, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				if (erpQuote != null)
					msgs = ((InternalEObject)erpQuote).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE__ERP_QUOTE_LINE_ITEMS, ErpQuote.class, msgs);
				return basicSetErpQuote((ErpQuote)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				if (assetModelCatalogueItem != null)
					msgs = ((InternalEObject)assetModelCatalogueItem).eInverseRemove(this, InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS, AssetModelCatalogueItem.class, msgs);
				return basicSetAssetModelCatalogueItem((AssetModelCatalogueItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				if (erpReqLineItem != null)
					msgs = ((InternalEObject)erpReqLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REQ_LINE_ITEM__ERP_QUOTE_LINE_ITEM, ErpReqLineItem.class, msgs);
				return basicSetErpReqLineItem((ErpReqLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				if (request != null)
					msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__ERP_QUOTE_LINE_ITEM, Request.class, msgs);
				return basicSetRequest((Request)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				return basicSetErpQuote(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				return basicSetAssetModelCatalogueItem(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				return basicSetDesign(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				return basicSetErpReqLineItem(null, msgs);
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				return basicSetRequest(null, msgs);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				if (resolve) return getErpQuote();
				return basicGetErpQuote();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				if (resolve) return getAssetModelCatalogueItem();
				return basicGetAssetModelCatalogueItem();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				if (resolve) return getErpReqLineItem();
				return basicGetErpReqLineItem();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				setErpQuote((ErpQuote)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				setAssetModelCatalogueItem((AssetModelCatalogueItem)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				setDesign((Design)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				setErpReqLineItem((ErpReqLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				setRequest((Request)newValue);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				setErpQuote((ErpQuote)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				setAssetModelCatalogueItem((AssetModelCatalogueItem)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				setDesign((Design)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				setErpReqLineItem((ErpReqLineItem)null);
				return;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				setRequest((Request)null);
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
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_QUOTE:
				return erpQuote != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ASSET_MODEL_CATALOGUE_ITEM:
				return assetModelCatalogueItem != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN:
				return design != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_REQ_LINE_ITEM:
				return erpReqLineItem != null;
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__REQUEST:
				return request != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpQuoteLineItem
