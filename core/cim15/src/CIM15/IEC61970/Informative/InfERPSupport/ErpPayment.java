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
 * A representation of the model object '<em><b>Erp Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpPayment extends Document {
	/**
	 * The cached value of the '{@link #getErpRecLineItems() <em>Erp Rec Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecLineItem> erpRecLineItems;

	/**
	 * The cached value of the '{@link #getErpPayableLineItems() <em>Erp Payable Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayableLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayableLineItem> erpPayableLineItems;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItems() <em>Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoiceLineItems;

	/**
	 * The default value of the '{@link #getTermsPayment() <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsPayment()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMS_PAYMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermsPayment() <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsPayment()
	 * @generated
	 * @ordered
	 */
	protected String termsPayment = TERMS_PAYMENT_EDEFAULT;

	/**
	 * This is true if the Terms Payment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean termsPaymentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPayment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PAYMENT;
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpPayments
	 * @generated
	 */
	public EList<ErpRecLineItem> getErpRecLineItems() {
		if (erpRecLineItems == null) {
			erpRecLineItems = new BasicInternalEList<ErpRecLineItem>(ErpRecLineItem.class);
		}
		return erpRecLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpPayments
	 * @generated
	 */
	public EList<ErpPayableLineItem> getErpPayableLineItems() {
		if (erpPayableLineItems == null) {
			erpPayableLineItems = new BasicInternalEList<ErpPayableLineItem>(ErpPayableLineItem.class);
		}
		return erpPayableLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments <em>Erp Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new BasicInternalEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Terms Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Payment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Payment</em>' attribute.
	 * @see #isSetTermsPayment()
	 * @see #unsetTermsPayment()
	 * @see #setTermsPayment(String)
	 * @generated
	 */
	public String getTermsPayment() {
		return termsPayment;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Payment</em>' attribute.
	 * @see #isSetTermsPayment()
	 * @see #unsetTermsPayment()
	 * @see #getTermsPayment()
	 * @generated
	 */
	public void setTermsPayment(String newTermsPayment) {
		termsPayment = newTermsPayment;
		termsPaymentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTermsPayment()
	 * @see #getTermsPayment()
	 * @see #setTermsPayment(String)
	 * @generated
	 */
	public void unsetTermsPayment() {
		termsPayment = TERMS_PAYMENT_EDEFAULT;
		termsPaymentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getTermsPayment <em>Terms Payment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Terms Payment</em>' attribute is set.
	 * @see #unsetTermsPayment()
	 * @see #getTermsPayment()
	 * @see #setTermsPayment(String)
	 * @generated
	 */
	public boolean isSetTermsPayment() {
		return termsPaymentESet;
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayableLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<?>)getErpPayableLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return getErpRecLineItems();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return getErpPayableLineItems();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				return getTermsPayment();
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				getErpRecLineItems().addAll((Collection<? extends ErpRecLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				getErpPayableLineItems().addAll((Collection<? extends ErpPayableLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				setTermsPayment((String)newValue);
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				unsetTermsPayment();
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
			case InfERPSupportPackage.ERP_PAYMENT__ERP_REC_LINE_ITEMS:
				return erpRecLineItems != null && !erpRecLineItems.isEmpty();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_PAYABLE_LINE_ITEMS:
				return erpPayableLineItems != null && !erpPayableLineItems.isEmpty();
			case InfERPSupportPackage.ERP_PAYMENT__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case InfERPSupportPackage.ERP_PAYMENT__TERMS_PAYMENT:
				return isSetTermsPayment();
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
		result.append(" (termsPayment: ");
		if (termsPaymentESet) result.append(termsPayment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpPayment
