/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Receipt#getLine <em>Line</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Receipt#getTenders <em>Tenders</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Receipt#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Receipt extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getVendorShift() <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorShift()
	 * @generated
	 * @ordered
	 */
	protected VendorShift vendorShift;

	/**
	 * The default value of the '{@link #isIsBankable() <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBankable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BANKABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBankable() <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBankable()
	 * @generated
	 * @ordered
	 */
	protected boolean isBankable = IS_BANKABLE_EDEFAULT;

	/**
	 * This is true if the Is Bankable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBankableESet;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected LineDetail line;

	/**
	 * The cached value of the '{@link #getCashierShift() <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashierShift()
	 * @generated
	 * @ordered
	 */
	protected CashierShift cashierShift;

	/**
	 * The cached value of the '{@link #getTenders() <em>Tenders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Tender> tenders;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Receipt() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.RECEIPT;
	}

	/**
	 * Returns the value of the '<em><b>Vendor Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shift</em>' reference.
	 * @see #setVendorShift(VendorShift)
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getReceipts
	 * @generated
	 */
	public VendorShift getVendorShift() {
		if (vendorShift != null && vendorShift.eIsProxy()) {
			InternalEObject oldVendorShift = (InternalEObject)vendorShift;
			vendorShift = (VendorShift)eResolveProxy(oldVendorShift);
			if (vendorShift != oldVendorShift) {
			}
		}
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift basicGetVendorShift() {
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorShift(VendorShift newVendorShift, NotificationChain msgs) {
		VendorShift oldVendorShift = vendorShift;
		vendorShift = newVendorShift;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Shift</em>' reference.
	 * @see #getVendorShift()
	 * @generated
	 */
	public void setVendorShift(VendorShift newVendorShift) {
		if (newVendorShift != vendorShift) {
			NotificationChain msgs = null;
			if (vendorShift != null)
				msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs);
			if (newVendorShift != null)
				msgs = ((InternalEObject)newVendorShift).eInverseAdd(this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs);
			msgs = basicSetVendorShift(newVendorShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Is Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bankable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bankable</em>' attribute.
	 * @see #isSetIsBankable()
	 * @see #unsetIsBankable()
	 * @see #setIsBankable(boolean)
	 * @generated
	 */
	public boolean isIsBankable() {
		return isBankable;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bankable</em>' attribute.
	 * @see #isSetIsBankable()
	 * @see #unsetIsBankable()
	 * @see #isIsBankable()
	 * @generated
	 */
	public void setIsBankable(boolean newIsBankable) {
		isBankable = newIsBankable;
		isBankableESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBankable()
	 * @see #isIsBankable()
	 * @see #setIsBankable(boolean)
	 * @generated
	 */
	public void unsetIsBankable() {
		isBankable = IS_BANKABLE_EDEFAULT;
		isBankableESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Bankable</em>' attribute is set.
	 * @see #unsetIsBankable()
	 * @see #isIsBankable()
	 * @see #setIsBankable(boolean)
	 * @generated
	 */
	public boolean isSetIsBankable() {
		return isBankableESet;
	}

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(LineDetail)
	 * @generated
	 */
	public LineDetail getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(LineDetail newLine, NotificationChain msgs) {
		LineDetail oldLine = line;
		line = newLine;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Receipt#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	public void setLine(LineDetail newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.RECEIPT__LINE, null, msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.RECEIPT__LINE, null, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cashier Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shift</em>' reference.
	 * @see #setCashierShift(CashierShift)
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getReceipts
	 * @generated
	 */
	public CashierShift getCashierShift() {
		if (cashierShift != null && cashierShift.eIsProxy()) {
			InternalEObject oldCashierShift = (InternalEObject)cashierShift;
			cashierShift = (CashierShift)eResolveProxy(oldCashierShift);
			if (cashierShift != oldCashierShift) {
			}
		}
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift basicGetCashierShift() {
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashierShift(CashierShift newCashierShift, NotificationChain msgs) {
		CashierShift oldCashierShift = cashierShift;
		cashierShift = newCashierShift;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier Shift</em>' reference.
	 * @see #getCashierShift()
	 * @generated
	 */
	public void setCashierShift(CashierShift newCashierShift) {
		if (newCashierShift != cashierShift) {
			NotificationChain msgs = null;
			if (cashierShift != null)
				msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs);
			if (newCashierShift != null)
				msgs = ((InternalEObject)newCashierShift).eInverseAdd(this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs);
			msgs = basicSetCashierShift(newCashierShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Tenders</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Tender}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenders</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getReceipt
	 * @generated
	 */
	public EList<Tender> getTenders() {
		if (tenders == null) {
			tenders = new BasicInternalEList<Tender>(Tender.class);
		}
		return tenders;
	}

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getReceipt
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new BasicInternalEList<Transaction>(Transaction.class);
		}
		return transactions;
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
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				if (vendorShift != null)
					msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs);
				return basicSetVendorShift((VendorShift)otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				if (cashierShift != null)
					msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs);
				return basicSetCashierShift((CashierShift)otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTenders()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				return basicSetVendorShift(null, msgs);
			case PaymentMeteringPackage.RECEIPT__LINE:
				return basicSetLine(null, msgs);
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				return basicSetCashierShift(null, msgs);
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return ((InternalEList<?>)getTenders()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				if (resolve) return getVendorShift();
				return basicGetVendorShift();
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				return isIsBankable();
			case PaymentMeteringPackage.RECEIPT__LINE:
				return getLine();
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				if (resolve) return getCashierShift();
				return basicGetCashierShift();
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return getTenders();
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return getTransactions();
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
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				setVendorShift((VendorShift)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				setIsBankable((Boolean)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__LINE:
				setLine((LineDetail)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				setCashierShift((CashierShift)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				getTenders().clear();
				getTenders().addAll((Collection<? extends Tender>)newValue);
				return;
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				setVendorShift((VendorShift)null);
				return;
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				unsetIsBankable();
				return;
			case PaymentMeteringPackage.RECEIPT__LINE:
				setLine((LineDetail)null);
				return;
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				setCashierShift((CashierShift)null);
				return;
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				getTenders().clear();
				return;
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				getTransactions().clear();
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
			case PaymentMeteringPackage.RECEIPT__VENDOR_SHIFT:
				return vendorShift != null;
			case PaymentMeteringPackage.RECEIPT__IS_BANKABLE:
				return isSetIsBankable();
			case PaymentMeteringPackage.RECEIPT__LINE:
				return line != null;
			case PaymentMeteringPackage.RECEIPT__CASHIER_SHIFT:
				return cashierShift != null;
			case PaymentMeteringPackage.RECEIPT__TENDERS:
				return tenders != null && !tenders.isEmpty();
			case PaymentMeteringPackage.RECEIPT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
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
		result.append(" (isBankable: ");
		if (isBankableESet) result.append(isBankable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Receipt
