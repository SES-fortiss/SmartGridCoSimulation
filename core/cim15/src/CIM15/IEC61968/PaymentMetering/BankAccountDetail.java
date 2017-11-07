/**
 */
package CIM15.IEC61968.PaymentMetering;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BankAccountDetail extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getHolderID() <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderID()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHolderID() <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderID()
	 * @generated
	 * @ordered
	 */
	protected String holderID = HOLDER_ID_EDEFAULT;

	/**
	 * This is true if the Holder ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean holderIDESet;

	/**
	 * The default value of the '{@link #getHolderName() <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHolderName() <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderName()
	 * @generated
	 * @ordered
	 */
	protected String holderName = HOLDER_NAME_EDEFAULT;

	/**
	 * This is true if the Holder Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean holderNameESet;

	/**
	 * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected String bankName = BANK_NAME_EDEFAULT;

	/**
	 * This is true if the Bank Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bankNameESet;

	/**
	 * The default value of the '{@link #getBranchCode() <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchCode()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranchCode() <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchCode()
	 * @generated
	 * @ordered
	 */
	protected String branchCode = BRANCH_CODE_EDEFAULT;

	/**
	 * This is true if the Branch Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean branchCodeESet;

	/**
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * This is true if the Account Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankAccountDetail() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.BANK_ACCOUNT_DETAIL;
	}

	/**
	 * Returns the value of the '<em><b>Holder ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder ID</em>' attribute.
	 * @see #isSetHolderID()
	 * @see #unsetHolderID()
	 * @see #setHolderID(String)
	 * @generated
	 */
	public String getHolderID() {
		return holderID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder ID</em>' attribute.
	 * @see #isSetHolderID()
	 * @see #unsetHolderID()
	 * @see #getHolderID()
	 * @generated
	 */
	public void setHolderID(String newHolderID) {
		holderID = newHolderID;
		holderIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHolderID()
	 * @see #getHolderID()
	 * @see #setHolderID(String)
	 * @generated
	 */
	public void unsetHolderID() {
		holderID = HOLDER_ID_EDEFAULT;
		holderIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Holder ID</em>' attribute is set.
	 * @see #unsetHolderID()
	 * @see #getHolderID()
	 * @see #setHolderID(String)
	 * @generated
	 */
	public boolean isSetHolderID() {
		return holderIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder Name</em>' attribute.
	 * @see #isSetHolderName()
	 * @see #unsetHolderName()
	 * @see #setHolderName(String)
	 * @generated
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder Name</em>' attribute.
	 * @see #isSetHolderName()
	 * @see #unsetHolderName()
	 * @see #getHolderName()
	 * @generated
	 */
	public void setHolderName(String newHolderName) {
		holderName = newHolderName;
		holderNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHolderName()
	 * @see #getHolderName()
	 * @see #setHolderName(String)
	 * @generated
	 */
	public void unsetHolderName() {
		holderName = HOLDER_NAME_EDEFAULT;
		holderNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Holder Name</em>' attribute is set.
	 * @see #unsetHolderName()
	 * @see #getHolderName()
	 * @see #setHolderName(String)
	 * @generated
	 */
	public boolean isSetHolderName() {
		return holderNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Name</em>' attribute.
	 * @see #isSetBankName()
	 * @see #unsetBankName()
	 * @see #setBankName(String)
	 * @generated
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Name</em>' attribute.
	 * @see #isSetBankName()
	 * @see #unsetBankName()
	 * @see #getBankName()
	 * @generated
	 */
	public void setBankName(String newBankName) {
		bankName = newBankName;
		bankNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBankName()
	 * @see #getBankName()
	 * @see #setBankName(String)
	 * @generated
	 */
	public void unsetBankName() {
		bankName = BANK_NAME_EDEFAULT;
		bankNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bank Name</em>' attribute is set.
	 * @see #unsetBankName()
	 * @see #getBankName()
	 * @see #setBankName(String)
	 * @generated
	 */
	public boolean isSetBankName() {
		return bankNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Code</em>' attribute.
	 * @see #isSetBranchCode()
	 * @see #unsetBranchCode()
	 * @see #setBranchCode(String)
	 * @generated
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Code</em>' attribute.
	 * @see #isSetBranchCode()
	 * @see #unsetBranchCode()
	 * @see #getBranchCode()
	 * @generated
	 */
	public void setBranchCode(String newBranchCode) {
		branchCode = newBranchCode;
		branchCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBranchCode()
	 * @see #getBranchCode()
	 * @see #setBranchCode(String)
	 * @generated
	 */
	public void unsetBranchCode() {
		branchCode = BRANCH_CODE_EDEFAULT;
		branchCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Branch Code</em>' attribute is set.
	 * @see #unsetBranchCode()
	 * @see #getBranchCode()
	 * @see #setBranchCode(String)
	 * @generated
	 */
	public boolean isSetBranchCode() {
		return branchCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #isSetAccountNumber()
	 * @see #unsetAccountNumber()
	 * @see #setAccountNumber(String)
	 * @generated
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #isSetAccountNumber()
	 * @see #unsetAccountNumber()
	 * @see #getAccountNumber()
	 * @generated
	 */
	public void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
		accountNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccountNumber()
	 * @see #getAccountNumber()
	 * @see #setAccountNumber(String)
	 * @generated
	 */
	public void unsetAccountNumber() {
		accountNumber = ACCOUNT_NUMBER_EDEFAULT;
		accountNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account Number</em>' attribute is set.
	 * @see #unsetAccountNumber()
	 * @see #getAccountNumber()
	 * @see #setAccountNumber(String)
	 * @generated
	 */
	public boolean isSetAccountNumber() {
		return accountNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				return getHolderID();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				return getHolderName();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				return getBankName();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				return getBranchCode();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				return getAccountNumber();
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
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				setHolderID((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				setHolderName((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				setBankName((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				setBranchCode((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
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
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				unsetHolderID();
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				unsetHolderName();
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				unsetBankName();
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				unsetBranchCode();
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				unsetAccountNumber();
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
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				return isSetHolderID();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				return isSetHolderName();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				return isSetBankName();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				return isSetBranchCode();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				return isSetAccountNumber();
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
		result.append(" (holderID: ");
		if (holderIDESet) result.append(holderID); else result.append("<unset>");
		result.append(", holderName: ");
		if (holderNameESet) result.append(holderName); else result.append("<unset>");
		result.append(", bankName: ");
		if (bankNameESet) result.append(bankName); else result.append("<unset>");
		result.append(", branchCode: ");
		if (branchCodeESet) result.append(branchCode); else result.append("<unset>");
		result.append(", accountNumber: ");
		if (accountNumberESet) result.append(accountNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BankAccountDetail
