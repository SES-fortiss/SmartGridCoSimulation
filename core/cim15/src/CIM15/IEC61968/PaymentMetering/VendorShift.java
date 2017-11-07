/**
 */
package CIM15.IEC61968.PaymentMetering;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.VendorShift#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.VendorShift#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VendorShift extends Shift {
	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected Vendor vendor;

	/**
	 * The default value of the '{@link #getMerchantDebitAmount() <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MERCHANT_DEBIT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMerchantDebitAmount() <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected float merchantDebitAmount = MERCHANT_DEBIT_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Merchant Debit Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean merchantDebitAmountESet;

	/**
	 * The default value of the '{@link #isPosted() <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPosted() <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPosted()
	 * @generated
	 * @ordered
	 */
	protected boolean posted = POSTED_EDEFAULT;

	/**
	 * This is true if the Posted attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postedESet;

	/**
	 * The cached value of the '{@link #getReceipts() <em>Receipts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipts()
	 * @generated
	 * @ordered
	 */
	protected EList<Receipt> receipts;

	/**
	 * The cached value of the '{@link #getMerchantAccount() <em>Merchant Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantAccount()
	 * @generated
	 * @ordered
	 */
	protected MerchantAccount merchantAccount;

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
	protected VendorShift() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.VENDOR_SHIFT;
	}

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Vendor#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' reference.
	 * @see #setVendor(Vendor)
	 * @see CIM15.IEC61968.PaymentMetering.Vendor#getVendorShifts
	 * @generated
	 */
	public Vendor getVendor() {
		if (vendor != null && vendor.eIsProxy()) {
			InternalEObject oldVendor = (InternalEObject)vendor;
			vendor = (Vendor)eResolveProxy(oldVendor);
			if (vendor != oldVendor) {
			}
		}
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor basicGetVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendor(Vendor newVendor, NotificationChain msgs) {
		Vendor oldVendor = vendor;
		vendor = newVendor;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' reference.
	 * @see #getVendor()
	 * @generated
	 */
	public void setVendor(Vendor newVendor) {
		if (newVendor != vendor) {
			NotificationChain msgs = null;
			if (vendor != null)
				msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs);
			if (newVendor != null)
				msgs = ((InternalEObject)newVendor).eInverseAdd(this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs);
			msgs = basicSetVendor(newVendor, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Merchant Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Debit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Debit Amount</em>' attribute.
	 * @see #isSetMerchantDebitAmount()
	 * @see #unsetMerchantDebitAmount()
	 * @see #setMerchantDebitAmount(float)
	 * @generated
	 */
	public float getMerchantDebitAmount() {
		return merchantDebitAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Debit Amount</em>' attribute.
	 * @see #isSetMerchantDebitAmount()
	 * @see #unsetMerchantDebitAmount()
	 * @see #getMerchantDebitAmount()
	 * @generated
	 */
	public void setMerchantDebitAmount(float newMerchantDebitAmount) {
		merchantDebitAmount = newMerchantDebitAmount;
		merchantDebitAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerchantDebitAmount()
	 * @see #getMerchantDebitAmount()
	 * @see #setMerchantDebitAmount(float)
	 * @generated
	 */
	public void unsetMerchantDebitAmount() {
		merchantDebitAmount = MERCHANT_DEBIT_AMOUNT_EDEFAULT;
		merchantDebitAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merchant Debit Amount</em>' attribute is set.
	 * @see #unsetMerchantDebitAmount()
	 * @see #getMerchantDebitAmount()
	 * @see #setMerchantDebitAmount(float)
	 * @generated
	 */
	public boolean isSetMerchantDebitAmount() {
		return merchantDebitAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted</em>' attribute.
	 * @see #isSetPosted()
	 * @see #unsetPosted()
	 * @see #setPosted(boolean)
	 * @generated
	 */
	public boolean isPosted() {
		return posted;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted</em>' attribute.
	 * @see #isSetPosted()
	 * @see #unsetPosted()
	 * @see #isPosted()
	 * @generated
	 */
	public void setPosted(boolean newPosted) {
		posted = newPosted;
		postedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosted()
	 * @see #isPosted()
	 * @see #setPosted(boolean)
	 * @generated
	 */
	public void unsetPosted() {
		posted = POSTED_EDEFAULT;
		postedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Posted</em>' attribute is set.
	 * @see #unsetPosted()
	 * @see #isPosted()
	 * @see #setPosted(boolean)
	 * @generated
	 */
	public boolean isSetPosted() {
		return postedESet;
	}

	/**
	 * Returns the value of the '<em><b>Receipts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Receipt}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getVendorShift
	 * @generated
	 */
	public EList<Receipt> getReceipts() {
		if (receipts == null) {
			receipts = new BasicInternalEList<Receipt>(Receipt.class);
		}
		return receipts;
	}

	/**
	 * Returns the value of the '<em><b>Merchant Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Account</em>' reference.
	 * @see #setMerchantAccount(MerchantAccount)
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts
	 * @generated
	 */
	public MerchantAccount getMerchantAccount() {
		if (merchantAccount != null && merchantAccount.eIsProxy()) {
			InternalEObject oldMerchantAccount = (InternalEObject)merchantAccount;
			merchantAccount = (MerchantAccount)eResolveProxy(oldMerchantAccount);
			if (merchantAccount != oldMerchantAccount) {
			}
		}
		return merchantAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAccount basicGetMerchantAccount() {
		return merchantAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerchantAccount(MerchantAccount newMerchantAccount, NotificationChain msgs) {
		MerchantAccount oldMerchantAccount = merchantAccount;
		merchantAccount = newMerchantAccount;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Account</em>' reference.
	 * @see #getMerchantAccount()
	 * @generated
	 */
	public void setMerchantAccount(MerchantAccount newMerchantAccount) {
		if (newMerchantAccount != merchantAccount) {
			NotificationChain msgs = null;
			if (merchantAccount != null)
				msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs);
			if (newMerchantAccount != null)
				msgs = ((InternalEObject)newMerchantAccount).eInverseAdd(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs);
			msgs = basicSetMerchantAccount(newMerchantAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getVendorShift
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
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				if (vendor != null)
					msgs = ((InternalEObject)vendor).eInverseRemove(this, PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs);
				return basicSetVendor((Vendor)otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceipts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				if (merchantAccount != null)
					msgs = ((InternalEObject)merchantAccount).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs);
				return basicSetMerchantAccount((MerchantAccount)otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
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
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				return basicSetVendor(null, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return ((InternalEList<?>)getReceipts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				return basicSetMerchantAccount(null, msgs);
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
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
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				if (resolve) return getVendor();
				return basicGetVendor();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				return getMerchantDebitAmount();
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				return isPosted();
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return getReceipts();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				if (resolve) return getMerchantAccount();
				return basicGetMerchantAccount();
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
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
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				setVendor((Vendor)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				setMerchantDebitAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				setPosted((Boolean)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				getReceipts().clear();
				getReceipts().addAll((Collection<? extends Receipt>)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)newValue);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
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
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				setVendor((Vendor)null);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				unsetMerchantDebitAmount();
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				unsetPosted();
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				getReceipts().clear();
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				setMerchantAccount((MerchantAccount)null);
				return;
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
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
			case PaymentMeteringPackage.VENDOR_SHIFT__VENDOR:
				return vendor != null;
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
				return isSetMerchantDebitAmount();
			case PaymentMeteringPackage.VENDOR_SHIFT__POSTED:
				return isSetPosted();
			case PaymentMeteringPackage.VENDOR_SHIFT__RECEIPTS:
				return receipts != null && !receipts.isEmpty();
			case PaymentMeteringPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
				return merchantAccount != null;
			case PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS:
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
		result.append(" (merchantDebitAmount: ");
		if (merchantDebitAmountESet) result.append(merchantDebitAmount); else result.append("<unset>");
		result.append(", posted: ");
		if (postedESet) result.append(posted); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // VendorShift
