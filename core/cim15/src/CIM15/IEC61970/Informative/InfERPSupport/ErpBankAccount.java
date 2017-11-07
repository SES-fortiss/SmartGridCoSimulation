/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61970.Informative.InfCommon.BankAccount;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Bank Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpBankAccount extends BankAccount {
	/**
	 * The default value of the '{@link #getBankABA() <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankABA()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_ABA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankABA() <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankABA()
	 * @generated
	 * @ordered
	 */
	protected String bankABA = BANK_ABA_EDEFAULT;

	/**
	 * This is true if the Bank ABA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bankABAESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpBankAccount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_BANK_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Bank ABA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank ABA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank ABA</em>' attribute.
	 * @see #isSetBankABA()
	 * @see #unsetBankABA()
	 * @see #setBankABA(String)
	 * @generated
	 */
	public String getBankABA() {
		return bankABA;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank ABA</em>' attribute.
	 * @see #isSetBankABA()
	 * @see #unsetBankABA()
	 * @see #getBankABA()
	 * @generated
	 */
	public void setBankABA(String newBankABA) {
		bankABA = newBankABA;
		bankABAESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBankABA()
	 * @see #getBankABA()
	 * @see #setBankABA(String)
	 * @generated
	 */
	public void unsetBankABA() {
		bankABA = BANK_ABA_EDEFAULT;
		bankABAESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount#getBankABA <em>Bank ABA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bank ABA</em>' attribute is set.
	 * @see #unsetBankABA()
	 * @see #getBankABA()
	 * @see #setBankABA(String)
	 * @generated
	 */
	public boolean isSetBankABA() {
		return bankABAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				return getBankABA();
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
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				setBankABA((String)newValue);
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
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				unsetBankABA();
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
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				return isSetBankABA();
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
		result.append(" (bankABA: ");
		if (bankABAESet) result.append(bankABA); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpBankAccount
