/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tender extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TenderKind KIND_EDEFAULT = TenderKind.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TenderKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected static final float CHANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected float change = CHANGE_EDEFAULT;

	/**
	 * This is true if the Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean changeESet;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * This is true if the Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountESet;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected Card card;

	/**
	 * The cached value of the '{@link #getReceipt() <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceipt()
	 * @generated
	 * @ordered
	 */
	protected Receipt receipt;

	/**
	 * The cached value of the '{@link #getCheque() <em>Cheque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheque()
	 * @generated
	 * @ordered
	 */
	protected Cheque cheque;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tender() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TENDER;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.PaymentMetering.TenderKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.TenderKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(TenderKind)
	 * @generated
	 */
	public TenderKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.TenderKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(TenderKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(TenderKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(TenderKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' attribute.
	 * @see #isSetChange()
	 * @see #unsetChange()
	 * @see #setChange(float)
	 * @generated
	 */
	public float getChange() {
		return change;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' attribute.
	 * @see #isSetChange()
	 * @see #unsetChange()
	 * @see #getChange()
	 * @generated
	 */
	public void setChange(float newChange) {
		change = newChange;
		changeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChange()
	 * @see #getChange()
	 * @see #setChange(float)
	 * @generated
	 */
	public void unsetChange() {
		change = CHANGE_EDEFAULT;
		changeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Change</em>' attribute is set.
	 * @see #unsetChange()
	 * @see #getChange()
	 * @see #setChange(float)
	 * @generated
	 */
	public boolean isSetChange() {
		return changeESet;
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(float newAmount) {
		amount = newAmount;
		amountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public void unsetAmount() {
		amount = AMOUNT_EDEFAULT;
		amountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount</em>' attribute is set.
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public boolean isSetAmount() {
		return amountESet;
	}

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(Card)
	 * @see CIM15.IEC61968.PaymentMetering.Card#getTender
	 * @generated
	 */
	public Card getCard() {
		if (card != null && card.eIsProxy()) {
			InternalEObject oldCard = (InternalEObject)card;
			card = (Card)eResolveProxy(oldCard);
			if (card != oldCard) {
			}
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCard(Card newCard, NotificationChain msgs) {
		Card oldCard = card;
		card = newCard;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	public void setCard(Card newCard) {
		if (newCard != card) {
			NotificationChain msgs = null;
			if (card != null)
				msgs = ((InternalEObject)card).eInverseRemove(this, PaymentMeteringPackage.CARD__TENDER, Card.class, msgs);
			if (newCard != null)
				msgs = ((InternalEObject)newCard).eInverseAdd(this, PaymentMeteringPackage.CARD__TENDER, Card.class, msgs);
			msgs = basicSetCard(newCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Receipt#getTenders <em>Tenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(Receipt)
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getTenders
	 * @generated
	 */
	public Receipt getReceipt() {
		if (receipt != null && receipt.eIsProxy()) {
			InternalEObject oldReceipt = (InternalEObject)receipt;
			receipt = (Receipt)eResolveProxy(oldReceipt);
			if (receipt != oldReceipt) {
			}
		}
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt basicGetReceipt() {
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceipt(Receipt newReceipt, NotificationChain msgs) {
		Receipt oldReceipt = receipt;
		receipt = newReceipt;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	public void setReceipt(Receipt newReceipt) {
		if (newReceipt != receipt) {
			NotificationChain msgs = null;
			if (receipt != null)
				msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TENDERS, Receipt.class, msgs);
			if (newReceipt != null)
				msgs = ((InternalEObject)newReceipt).eInverseAdd(this, PaymentMeteringPackage.RECEIPT__TENDERS, Receipt.class, msgs);
			msgs = basicSetReceipt(newReceipt, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cheque</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheque</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheque</em>' reference.
	 * @see #setCheque(Cheque)
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getTender
	 * @generated
	 */
	public Cheque getCheque() {
		if (cheque != null && cheque.eIsProxy()) {
			InternalEObject oldCheque = (InternalEObject)cheque;
			cheque = (Cheque)eResolveProxy(oldCheque);
			if (cheque != oldCheque) {
			}
		}
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque basicGetCheque() {
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheque(Cheque newCheque, NotificationChain msgs) {
		Cheque oldCheque = cheque;
		cheque = newCheque;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cheque</em>' reference.
	 * @see #getCheque()
	 * @generated
	 */
	public void setCheque(Cheque newCheque) {
		if (newCheque != cheque) {
			NotificationChain msgs = null;
			if (cheque != null)
				msgs = ((InternalEObject)cheque).eInverseRemove(this, PaymentMeteringPackage.CHEQUE__TENDER, Cheque.class, msgs);
			if (newCheque != null)
				msgs = ((InternalEObject)newCheque).eInverseAdd(this, PaymentMeteringPackage.CHEQUE__TENDER, Cheque.class, msgs);
			msgs = basicSetCheque(newCheque, msgs);
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
			case PaymentMeteringPackage.TENDER__CARD:
				if (card != null)
					msgs = ((InternalEObject)card).eInverseRemove(this, PaymentMeteringPackage.CARD__TENDER, Card.class, msgs);
				return basicSetCard((Card)otherEnd, msgs);
			case PaymentMeteringPackage.TENDER__RECEIPT:
				if (receipt != null)
					msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TENDERS, Receipt.class, msgs);
				return basicSetReceipt((Receipt)otherEnd, msgs);
			case PaymentMeteringPackage.TENDER__CHEQUE:
				if (cheque != null)
					msgs = ((InternalEObject)cheque).eInverseRemove(this, PaymentMeteringPackage.CHEQUE__TENDER, Cheque.class, msgs);
				return basicSetCheque((Cheque)otherEnd, msgs);
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
			case PaymentMeteringPackage.TENDER__CARD:
				return basicSetCard(null, msgs);
			case PaymentMeteringPackage.TENDER__RECEIPT:
				return basicSetReceipt(null, msgs);
			case PaymentMeteringPackage.TENDER__CHEQUE:
				return basicSetCheque(null, msgs);
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
			case PaymentMeteringPackage.TENDER__KIND:
				return getKind();
			case PaymentMeteringPackage.TENDER__CHANGE:
				return getChange();
			case PaymentMeteringPackage.TENDER__AMOUNT:
				return getAmount();
			case PaymentMeteringPackage.TENDER__CARD:
				if (resolve) return getCard();
				return basicGetCard();
			case PaymentMeteringPackage.TENDER__RECEIPT:
				if (resolve) return getReceipt();
				return basicGetReceipt();
			case PaymentMeteringPackage.TENDER__CHEQUE:
				if (resolve) return getCheque();
				return basicGetCheque();
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
			case PaymentMeteringPackage.TENDER__KIND:
				setKind((TenderKind)newValue);
				return;
			case PaymentMeteringPackage.TENDER__CHANGE:
				setChange((Float)newValue);
				return;
			case PaymentMeteringPackage.TENDER__AMOUNT:
				setAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.TENDER__CARD:
				setCard((Card)newValue);
				return;
			case PaymentMeteringPackage.TENDER__RECEIPT:
				setReceipt((Receipt)newValue);
				return;
			case PaymentMeteringPackage.TENDER__CHEQUE:
				setCheque((Cheque)newValue);
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
			case PaymentMeteringPackage.TENDER__KIND:
				unsetKind();
				return;
			case PaymentMeteringPackage.TENDER__CHANGE:
				unsetChange();
				return;
			case PaymentMeteringPackage.TENDER__AMOUNT:
				unsetAmount();
				return;
			case PaymentMeteringPackage.TENDER__CARD:
				setCard((Card)null);
				return;
			case PaymentMeteringPackage.TENDER__RECEIPT:
				setReceipt((Receipt)null);
				return;
			case PaymentMeteringPackage.TENDER__CHEQUE:
				setCheque((Cheque)null);
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
			case PaymentMeteringPackage.TENDER__KIND:
				return isSetKind();
			case PaymentMeteringPackage.TENDER__CHANGE:
				return isSetChange();
			case PaymentMeteringPackage.TENDER__AMOUNT:
				return isSetAmount();
			case PaymentMeteringPackage.TENDER__CARD:
				return card != null;
			case PaymentMeteringPackage.TENDER__RECEIPT:
				return receipt != null;
			case PaymentMeteringPackage.TENDER__CHEQUE:
				return cheque != null;
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", change: ");
		if (changeESet) result.append(change); else result.append("<unset>");
		result.append(", amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Tender
