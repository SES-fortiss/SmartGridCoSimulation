/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder#getErpPOLineItems <em>Erp PO Line Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpPurchaseOrder extends Document {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPurchaseOrder() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PURCHASE_ORDER;
	}

	/**
	 * Returns the value of the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp PO Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp PO Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem#getErpPurchaseOrder
	 * @generated
	 */
	public EList<ErpPOLineItem> getErpPOLineItems() {
		if (erpPOLineItems == null) {
			erpPOLineItems = new BasicInternalEList<ErpPOLineItem>(ErpPOLineItem.class);
		}
		return erpPOLineItems;
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPOLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return ((InternalEList<?>)getErpPOLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return getErpPOLineItems();
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
				getErpPOLineItems().addAll((Collection<? extends ErpPOLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				getErpPOLineItems().clear();
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
			case InfERPSupportPackage.ERP_PURCHASE_ORDER__ERP_PO_LINE_ITEMS:
				return erpPOLineItems != null && !erpPOLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ErpPurchaseOrder
