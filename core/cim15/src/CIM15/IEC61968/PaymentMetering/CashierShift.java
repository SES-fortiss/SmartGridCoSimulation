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
 * A representation of the model object '<em><b>Cashier Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.CashierShift#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.CashierShift#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CashierShift extends Shift {
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
	 * The cached value of the '{@link #getPointOfSale() <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfSale()
	 * @generated
	 * @ordered
	 */
	protected PointOfSale pointOfSale;

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
	 * The cached value of the '{@link #getCashier() <em>Cashier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashier()
	 * @generated
	 * @ordered
	 */
	protected Cashier cashier;

	/**
	 * The default value of the '{@link #getCashFloat() <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float CASH_FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCashFloat() <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashFloat()
	 * @generated
	 * @ordered
	 */
	protected float cashFloat = CASH_FLOAT_EDEFAULT;

	/**
	 * This is true if the Cash Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cashFloatESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashierShift() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CASHIER_SHIFT;
	}

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getCashierShift
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new BasicInternalEList<Transaction>(Transaction.class);
		}
		return transactions;
	}

	/**
	 * Returns the value of the '<em><b>Point Of Sale</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Sale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Sale</em>' reference.
	 * @see #setPointOfSale(PointOfSale)
	 * @see CIM15.IEC61968.PaymentMetering.PointOfSale#getCashierShifts
	 * @generated
	 */
	public PointOfSale getPointOfSale() {
		if (pointOfSale != null && pointOfSale.eIsProxy()) {
			InternalEObject oldPointOfSale = (InternalEObject)pointOfSale;
			pointOfSale = (PointOfSale)eResolveProxy(oldPointOfSale);
			if (pointOfSale != oldPointOfSale) {
			}
		}
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale basicGetPointOfSale() {
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfSale(PointOfSale newPointOfSale, NotificationChain msgs) {
		PointOfSale oldPointOfSale = pointOfSale;
		pointOfSale = newPointOfSale;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Sale</em>' reference.
	 * @see #getPointOfSale()
	 * @generated
	 */
	public void setPointOfSale(PointOfSale newPointOfSale) {
		if (newPointOfSale != pointOfSale) {
			NotificationChain msgs = null;
			if (pointOfSale != null)
				msgs = ((InternalEObject)pointOfSale).eInverseRemove(this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs);
			if (newPointOfSale != null)
				msgs = ((InternalEObject)newPointOfSale).eInverseAdd(this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs);
			msgs = basicSetPointOfSale(newPointOfSale, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Receipts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Receipt}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getCashierShift
	 * @generated
	 */
	public EList<Receipt> getReceipts() {
		if (receipts == null) {
			receipts = new BasicInternalEList<Receipt>(Receipt.class);
		}
		return receipts;
	}

	/**
	 * Returns the value of the '<em><b>Cashier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Cashier#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier</em>' reference.
	 * @see #setCashier(Cashier)
	 * @see CIM15.IEC61968.PaymentMetering.Cashier#getCashierShifts
	 * @generated
	 */
	public Cashier getCashier() {
		if (cashier != null && cashier.eIsProxy()) {
			InternalEObject oldCashier = (InternalEObject)cashier;
			cashier = (Cashier)eResolveProxy(oldCashier);
			if (cashier != oldCashier) {
			}
		}
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cashier basicGetCashier() {
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashier(Cashier newCashier, NotificationChain msgs) {
		Cashier oldCashier = cashier;
		cashier = newCashier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier</em>' reference.
	 * @see #getCashier()
	 * @generated
	 */
	public void setCashier(Cashier newCashier) {
		if (newCashier != cashier) {
			NotificationChain msgs = null;
			if (cashier != null)
				msgs = ((InternalEObject)cashier).eInverseRemove(this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs);
			if (newCashier != null)
				msgs = ((InternalEObject)newCashier).eInverseAdd(this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs);
			msgs = basicSetCashier(newCashier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cash Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cash Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cash Float</em>' attribute.
	 * @see #isSetCashFloat()
	 * @see #unsetCashFloat()
	 * @see #setCashFloat(float)
	 * @generated
	 */
	public float getCashFloat() {
		return cashFloat;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash Float</em>' attribute.
	 * @see #isSetCashFloat()
	 * @see #unsetCashFloat()
	 * @see #getCashFloat()
	 * @generated
	 */
	public void setCashFloat(float newCashFloat) {
		cashFloat = newCashFloat;
		cashFloatESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCashFloat()
	 * @see #getCashFloat()
	 * @see #setCashFloat(float)
	 * @generated
	 */
	public void unsetCashFloat() {
		cashFloat = CASH_FLOAT_EDEFAULT;
		cashFloatESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cash Float</em>' attribute is set.
	 * @see #unsetCashFloat()
	 * @see #getCashFloat()
	 * @see #setCashFloat(float)
	 * @generated
	 */
	public boolean isSetCashFloat() {
		return cashFloatESet;
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
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				if (pointOfSale != null)
					msgs = ((InternalEObject)pointOfSale).eInverseRemove(this, PaymentMeteringPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs);
				return basicSetPointOfSale((PointOfSale)otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceipts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				if (cashier != null)
					msgs = ((InternalEObject)cashier).eInverseRemove(this, PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs);
				return basicSetCashier((Cashier)otherEnd, msgs);
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
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				return basicSetPointOfSale(null, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return ((InternalEList<?>)getReceipts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				return basicSetCashier(null, msgs);
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
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return getTransactions();
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				if (resolve) return getPointOfSale();
				return basicGetPointOfSale();
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return getReceipts();
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				if (resolve) return getCashier();
				return basicGetCashier();
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				return getCashFloat();
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
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				setPointOfSale((PointOfSale)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				getReceipts().clear();
				getReceipts().addAll((Collection<? extends Receipt>)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				setCashier((Cashier)newValue);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				setCashFloat((Float)newValue);
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
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				getTransactions().clear();
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				setPointOfSale((PointOfSale)null);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				getReceipts().clear();
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				setCashier((Cashier)null);
				return;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				unsetCashFloat();
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
			case PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case PaymentMeteringPackage.CASHIER_SHIFT__POINT_OF_SALE:
				return pointOfSale != null;
			case PaymentMeteringPackage.CASHIER_SHIFT__RECEIPTS:
				return receipts != null && !receipts.isEmpty();
			case PaymentMeteringPackage.CASHIER_SHIFT__CASHIER:
				return cashier != null;
			case PaymentMeteringPackage.CASHIER_SHIFT__CASH_FLOAT:
				return isSetCashFloat();
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
		result.append(" (cashFloat: ");
		if (cashFloatESet) result.append(cashFloat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CashierShift
