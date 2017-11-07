/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import CIM15.IEC61968.Common.Organisation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBankAccounts <em>Bank Accounts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBic <em>Bic</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Bank#getIban <em>Iban</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBranchCode <em>Branch Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Bank extends Organisation {
	/**
	 * The cached value of the '{@link #getBankAccounts() <em>Bank Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<BankAccount> bankAccounts;

	/**
	 * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected static final String BIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected String bic = BIC_EDEFAULT;

	/**
	 * This is true if the Bic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bicESet;

	/**
	 * The default value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected static final String IBAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected String iban = IBAN_EDEFAULT;

	/**
	 * This is true if the Iban attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ibanESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bank() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.BANK;
	}

	/**
	 * Returns the value of the '<em><b>Bank Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.BankAccount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Accounts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.BankAccount#getBank
	 * @generated
	 */
	public EList<BankAccount> getBankAccounts() {
		if (bankAccounts == null) {
			bankAccounts = new BasicInternalEList<BankAccount>(BankAccount.class);
		}
		return bankAccounts;
	}

	/**
	 * Returns the value of the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bic</em>' attribute.
	 * @see #isSetBic()
	 * @see #unsetBic()
	 * @see #setBic(String)
	 * @generated
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bic</em>' attribute.
	 * @see #isSetBic()
	 * @see #unsetBic()
	 * @see #getBic()
	 * @generated
	 */
	public void setBic(String newBic) {
		bic = newBic;
		bicESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBic <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBic()
	 * @see #getBic()
	 * @see #setBic(String)
	 * @generated
	 */
	public void unsetBic() {
		bic = BIC_EDEFAULT;
		bicESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBic <em>Bic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bic</em>' attribute is set.
	 * @see #unsetBic()
	 * @see #getBic()
	 * @see #setBic(String)
	 * @generated
	 */
	public boolean isSetBic() {
		return bicESet;
	}

	/**
	 * Returns the value of the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iban</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iban</em>' attribute.
	 * @see #isSetIban()
	 * @see #unsetIban()
	 * @see #setIban(String)
	 * @generated
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getIban <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iban</em>' attribute.
	 * @see #isSetIban()
	 * @see #unsetIban()
	 * @see #getIban()
	 * @generated
	 */
	public void setIban(String newIban) {
		iban = newIban;
		ibanESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getIban <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIban()
	 * @see #getIban()
	 * @see #setIban(String)
	 * @generated
	 */
	public void unsetIban() {
		iban = IBAN_EDEFAULT;
		ibanESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getIban <em>Iban</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Iban</em>' attribute is set.
	 * @see #unsetIban()
	 * @see #getIban()
	 * @see #setIban(String)
	 * @generated
	 */
	public boolean isSetIban() {
		return ibanESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBranchCode <em>Branch Code</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBranchCode <em>Branch Code</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBranchCode <em>Branch Code</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCommonPackage.BANK__BANK_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankAccounts()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.BANK__BANK_ACCOUNTS:
				return ((InternalEList<?>)getBankAccounts()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.BANK__BANK_ACCOUNTS:
				return getBankAccounts();
			case InfCommonPackage.BANK__BIC:
				return getBic();
			case InfCommonPackage.BANK__IBAN:
				return getIban();
			case InfCommonPackage.BANK__BRANCH_CODE:
				return getBranchCode();
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
			case InfCommonPackage.BANK__BANK_ACCOUNTS:
				getBankAccounts().clear();
				getBankAccounts().addAll((Collection<? extends BankAccount>)newValue);
				return;
			case InfCommonPackage.BANK__BIC:
				setBic((String)newValue);
				return;
			case InfCommonPackage.BANK__IBAN:
				setIban((String)newValue);
				return;
			case InfCommonPackage.BANK__BRANCH_CODE:
				setBranchCode((String)newValue);
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
			case InfCommonPackage.BANK__BANK_ACCOUNTS:
				getBankAccounts().clear();
				return;
			case InfCommonPackage.BANK__BIC:
				unsetBic();
				return;
			case InfCommonPackage.BANK__IBAN:
				unsetIban();
				return;
			case InfCommonPackage.BANK__BRANCH_CODE:
				unsetBranchCode();
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
			case InfCommonPackage.BANK__BANK_ACCOUNTS:
				return bankAccounts != null && !bankAccounts.isEmpty();
			case InfCommonPackage.BANK__BIC:
				return isSetBic();
			case InfCommonPackage.BANK__IBAN:
				return isSetIban();
			case InfCommonPackage.BANK__BRANCH_CODE:
				return isSetBranchCode();
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
		result.append(" (bic: ");
		if (bicESet) result.append(bic); else result.append("<unset>");
		result.append(", iban: ");
		if (ibanESet) result.append(iban); else result.append("<unset>");
		result.append(", branchCode: ");
		if (branchCodeESet) result.append(branchCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Bank
