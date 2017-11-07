/**
 */
package CIM15.IEC61968.PaymentMetering;

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
 * A representation of the model object '<em><b>Auxiliary Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges <em>Charges</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getDue <em>Due</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuxiliaryAccount extends Document {
	/**
	 * The cached value of the '{@link #getLastDebit() <em>Last Debit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDebit()
	 * @generated
	 * @ordered
	 */
	protected AccountMovement lastDebit;

	/**
	 * The cached value of the '{@link #getPaymentTransactions() <em>Payment Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> paymentTransactions;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> charges;

	/**
	 * The default value of the '{@link #getPrincipleAmount() <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PRINCIPLE_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrincipleAmount() <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleAmount()
	 * @generated
	 * @ordered
	 */
	protected float principleAmount = PRINCIPLE_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Principle Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean principleAmountESet;

	/**
	 * The cached value of the '{@link #getLastCredit() <em>Last Credit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCredit()
	 * @generated
	 * @ordered
	 */
	protected AccountMovement lastCredit;

	/**
	 * The cached value of the '{@link #getAuxiliaryAgreement() <em>Auxiliary Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryAgreement auxiliaryAgreement;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected float balance = BALANCE_EDEFAULT;

	/**
	 * This is true if the Balance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean balanceESet;

	/**
	 * The cached value of the '{@link #getDue() <em>Due</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue()
	 * @generated
	 * @ordered
	 */
	protected Due due;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuxiliaryAccount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.AUXILIARY_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Last Debit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Debit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Debit</em>' containment reference.
	 * @see #setLastDebit(AccountMovement)
	 * @generated
	 */
	public AccountMovement getLastDebit() {
		return lastDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastDebit(AccountMovement newLastDebit, NotificationChain msgs) {
		AccountMovement oldLastDebit = lastDebit;
		lastDebit = newLastDebit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Debit</em>' containment reference.
	 * @see #getLastDebit()
	 * @generated
	 */
	public void setLastDebit(AccountMovement newLastDebit) {
		if (newLastDebit != lastDebit) {
			NotificationChain msgs = null;
			if (lastDebit != null)
				msgs = ((InternalEObject)lastDebit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, null, msgs);
			if (newLastDebit != null)
				msgs = ((InternalEObject)newLastDebit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT, null, msgs);
			msgs = basicSetLastDebit(newLastDebit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Payment Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount
	 * @generated
	 */
	public EList<Transaction> getPaymentTransactions() {
		if (paymentTransactions == null) {
			paymentTransactions = new BasicInternalEList<Transaction>(Transaction.class);
		}
		return paymentTransactions;
	}

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts
	 * @generated
	 */
	public EList<Charge> getCharges() {
		if (charges == null) {
			charges = new BasicInternalEList<Charge>(Charge.class);
		}
		return charges;
	}

	/**
	 * Returns the value of the '<em><b>Principle Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principle Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principle Amount</em>' attribute.
	 * @see #isSetPrincipleAmount()
	 * @see #unsetPrincipleAmount()
	 * @see #setPrincipleAmount(float)
	 * @generated
	 */
	public float getPrincipleAmount() {
		return principleAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principle Amount</em>' attribute.
	 * @see #isSetPrincipleAmount()
	 * @see #unsetPrincipleAmount()
	 * @see #getPrincipleAmount()
	 * @generated
	 */
	public void setPrincipleAmount(float newPrincipleAmount) {
		principleAmount = newPrincipleAmount;
		principleAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrincipleAmount()
	 * @see #getPrincipleAmount()
	 * @see #setPrincipleAmount(float)
	 * @generated
	 */
	public void unsetPrincipleAmount() {
		principleAmount = PRINCIPLE_AMOUNT_EDEFAULT;
		principleAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Principle Amount</em>' attribute is set.
	 * @see #unsetPrincipleAmount()
	 * @see #getPrincipleAmount()
	 * @see #setPrincipleAmount(float)
	 * @generated
	 */
	public boolean isSetPrincipleAmount() {
		return principleAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Last Credit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Credit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Credit</em>' containment reference.
	 * @see #setLastCredit(AccountMovement)
	 * @generated
	 */
	public AccountMovement getLastCredit() {
		return lastCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastCredit(AccountMovement newLastCredit, NotificationChain msgs) {
		AccountMovement oldLastCredit = lastCredit;
		lastCredit = newLastCredit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Credit</em>' containment reference.
	 * @see #getLastCredit()
	 * @generated
	 */
	public void setLastCredit(AccountMovement newLastCredit) {
		if (newLastCredit != lastCredit) {
			NotificationChain msgs = null;
			if (lastCredit != null)
				msgs = ((InternalEObject)lastCredit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, null, msgs);
			if (newLastCredit != null)
				msgs = ((InternalEObject)newLastCredit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT, null, msgs);
			msgs = basicSetLastCredit(newLastCredit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Agreement</em>' reference.
	 * @see #setAuxiliaryAgreement(AuxiliaryAgreement)
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts
	 * @generated
	 */
	public AuxiliaryAgreement getAuxiliaryAgreement() {
		if (auxiliaryAgreement != null && auxiliaryAgreement.eIsProxy()) {
			InternalEObject oldAuxiliaryAgreement = (InternalEObject)auxiliaryAgreement;
			auxiliaryAgreement = (AuxiliaryAgreement)eResolveProxy(oldAuxiliaryAgreement);
			if (auxiliaryAgreement != oldAuxiliaryAgreement) {
			}
		}
		return auxiliaryAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAgreement basicGetAuxiliaryAgreement() {
		return auxiliaryAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxiliaryAgreement(AuxiliaryAgreement newAuxiliaryAgreement, NotificationChain msgs) {
		AuxiliaryAgreement oldAuxiliaryAgreement = auxiliaryAgreement;
		auxiliaryAgreement = newAuxiliaryAgreement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Agreement</em>' reference.
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public void setAuxiliaryAgreement(AuxiliaryAgreement newAuxiliaryAgreement) {
		if (newAuxiliaryAgreement != auxiliaryAgreement) {
			NotificationChain msgs = null;
			if (auxiliaryAgreement != null)
				msgs = ((InternalEObject)auxiliaryAgreement).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs);
			if (newAuxiliaryAgreement != null)
				msgs = ((InternalEObject)newAuxiliaryAgreement).eInverseAdd(this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs);
			msgs = basicSetAuxiliaryAgreement(newAuxiliaryAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #isSetBalance()
	 * @see #unsetBalance()
	 * @see #setBalance(float)
	 * @generated
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #isSetBalance()
	 * @see #unsetBalance()
	 * @see #getBalance()
	 * @generated
	 */
	public void setBalance(float newBalance) {
		balance = newBalance;
		balanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBalance()
	 * @see #getBalance()
	 * @see #setBalance(float)
	 * @generated
	 */
	public void unsetBalance() {
		balance = BALANCE_EDEFAULT;
		balanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Balance</em>' attribute is set.
	 * @see #unsetBalance()
	 * @see #getBalance()
	 * @see #setBalance(float)
	 * @generated
	 */
	public boolean isSetBalance() {
		return balanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Due</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due</em>' containment reference.
	 * @see #setDue(Due)
	 * @generated
	 */
	public Due getDue() {
		return due;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDue(Due newDue, NotificationChain msgs) {
		Due oldDue = due;
		due = newDue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getDue <em>Due</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' containment reference.
	 * @see #getDue()
	 * @generated
	 */
	public void setDue(Due newDue) {
		if (newDue != due) {
			NotificationChain msgs = null;
			if (due != null)
				msgs = ((InternalEObject)due).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE, null, msgs);
			if (newDue != null)
				msgs = ((InternalEObject)newDue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE, null, msgs);
			msgs = basicSetDue(newDue, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaymentTransactions()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharges()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				if (auxiliaryAgreement != null)
					msgs = ((InternalEObject)auxiliaryAgreement).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS, AuxiliaryAgreement.class, msgs);
				return basicSetAuxiliaryAgreement((AuxiliaryAgreement)otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				return basicSetLastDebit(null, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<?>)getPaymentTransactions()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return ((InternalEList<?>)getCharges()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				return basicSetLastCredit(null, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				return basicSetAuxiliaryAgreement(null, msgs);
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				return basicSetDue(null, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				return getLastDebit();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return getPaymentTransactions();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return getCharges();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				return getPrincipleAmount();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				return getLastCredit();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				if (resolve) return getAuxiliaryAgreement();
				return basicGetAuxiliaryAgreement();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				return getBalance();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				return getDue();
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				setLastDebit((AccountMovement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				getPaymentTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				getCharges().clear();
				getCharges().addAll((Collection<? extends Charge>)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				setPrincipleAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				setLastCredit((AccountMovement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				setAuxiliaryAgreement((AuxiliaryAgreement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				setBalance((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				setDue((Due)newValue);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				setLastDebit((AccountMovement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				getCharges().clear();
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				unsetPrincipleAmount();
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				setLastCredit((AccountMovement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				setAuxiliaryAgreement((AuxiliaryAgreement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				unsetBalance();
				return;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				setDue((Due)null);
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
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_DEBIT:
				return lastDebit != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS:
				return paymentTransactions != null && !paymentTransactions.isEmpty();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__CHARGES:
				return charges != null && !charges.isEmpty();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT:
				return isSetPrincipleAmount();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__LAST_CREDIT:
				return lastCredit != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT:
				return auxiliaryAgreement != null;
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__BALANCE:
				return isSetBalance();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT__DUE:
				return due != null;
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
		result.append(" (principleAmount: ");
		if (principleAmountESet) result.append(principleAmount); else result.append("<unset>");
		result.append(", balance: ");
		if (balanceESet) result.append(balance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AuxiliaryAccount
