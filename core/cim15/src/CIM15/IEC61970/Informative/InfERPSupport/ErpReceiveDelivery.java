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
 * A representation of the model object '<em><b>Erp Receive Delivery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery#getErpRecDelvLineItems <em>Erp Rec Delv Line Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpReceiveDelivery extends Document {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpReceiveDelivery() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_RECEIVE_DELIVERY;
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Delv Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delv Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delv Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpReceiveDelivery
	 * @generated
	 */
	public EList<ErpRecDelvLineItem> getErpRecDelvLineItems() {
		if (erpRecDelvLineItems == null) {
			erpRecDelvLineItems = new BasicInternalEList<ErpRecDelvLineItem>(ErpRecDelvLineItem.class);
		}
		return erpRecDelvLineItems;
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecDelvLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecDelvLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return getErpRecDelvLineItems();
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
				getErpRecDelvLineItems().addAll((Collection<? extends ErpRecDelvLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				getErpRecDelvLineItems().clear();
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
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY__ERP_REC_DELV_LINE_ITEMS:
				return erpRecDelvLineItems != null && !erpRecDelvLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ErpReceiveDelivery
