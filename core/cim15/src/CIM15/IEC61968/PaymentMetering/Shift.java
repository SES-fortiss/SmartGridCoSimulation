/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Shift#getActivityInterval <em>Activity Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Shift extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getTransactionsGrandTotal() <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSACTIONS_GRAND_TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransactionsGrandTotal() <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected float transactionsGrandTotal = TRANSACTIONS_GRAND_TOTAL_EDEFAULT;

	/**
	 * This is true if the Transactions Grand Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionsGrandTotalESet;

	/**
	 * The default value of the '{@link #getReceiptsGrandTotalBankable() <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalBankable()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptsGrandTotalBankable() <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalBankable()
	 * @generated
	 * @ordered
	 */
	protected float receiptsGrandTotalBankable = RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT;

	/**
	 * This is true if the Receipts Grand Total Bankable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiptsGrandTotalBankableESet;

	/**
	 * The default value of the '{@link #getReceiptsGrandTotalRounding() <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptsGrandTotalRounding() <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected float receiptsGrandTotalRounding = RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT;

	/**
	 * This is true if the Receipts Grand Total Rounding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiptsGrandTotalRoundingESet;

	/**
	 * The default value of the '{@link #getTransactionsGrandTotalRounding() <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransactionsGrandTotalRounding() <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsGrandTotalRounding()
	 * @generated
	 * @ordered
	 */
	protected float transactionsGrandTotalRounding = TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT;

	/**
	 * This is true if the Transactions Grand Total Rounding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionsGrandTotalRoundingESet;

	/**
	 * The cached value of the '{@link #getActivityInterval() <em>Activity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval activityInterval;

	/**
	 * The default value of the '{@link #getReceiptsGrandTotalNonBankable() <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @generated
	 * @ordered
	 */
	protected static final float RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReceiptsGrandTotalNonBankable() <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @generated
	 * @ordered
	 */
	protected float receiptsGrandTotalNonBankable = RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT;

	/**
	 * This is true if the Receipts Grand Total Non Bankable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiptsGrandTotalNonBankableESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shift() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.SHIFT;
	}

	/**
	 * Returns the value of the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions Grand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions Grand Total</em>' attribute.
	 * @see #isSetTransactionsGrandTotal()
	 * @see #unsetTransactionsGrandTotal()
	 * @see #setTransactionsGrandTotal(float)
	 * @generated
	 */
	public float getTransactionsGrandTotal() {
		return transactionsGrandTotal;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactions Grand Total</em>' attribute.
	 * @see #isSetTransactionsGrandTotal()
	 * @see #unsetTransactionsGrandTotal()
	 * @see #getTransactionsGrandTotal()
	 * @generated
	 */
	public void setTransactionsGrandTotal(float newTransactionsGrandTotal) {
		transactionsGrandTotal = newTransactionsGrandTotal;
		transactionsGrandTotalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionsGrandTotal()
	 * @see #getTransactionsGrandTotal()
	 * @see #setTransactionsGrandTotal(float)
	 * @generated
	 */
	public void unsetTransactionsGrandTotal() {
		transactionsGrandTotal = TRANSACTIONS_GRAND_TOTAL_EDEFAULT;
		transactionsGrandTotalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transactions Grand Total</em>' attribute is set.
	 * @see #unsetTransactionsGrandTotal()
	 * @see #getTransactionsGrandTotal()
	 * @see #setTransactionsGrandTotal(float)
	 * @generated
	 */
	public boolean isSetTransactionsGrandTotal() {
		return transactionsGrandTotalESet;
	}

	/**
	 * Returns the value of the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts Grand Total Bankable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts Grand Total Bankable</em>' attribute.
	 * @see #isSetReceiptsGrandTotalBankable()
	 * @see #unsetReceiptsGrandTotalBankable()
	 * @see #setReceiptsGrandTotalBankable(float)
	 * @generated
	 */
	public float getReceiptsGrandTotalBankable() {
		return receiptsGrandTotalBankable;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipts Grand Total Bankable</em>' attribute.
	 * @see #isSetReceiptsGrandTotalBankable()
	 * @see #unsetReceiptsGrandTotalBankable()
	 * @see #getReceiptsGrandTotalBankable()
	 * @generated
	 */
	public void setReceiptsGrandTotalBankable(float newReceiptsGrandTotalBankable) {
		receiptsGrandTotalBankable = newReceiptsGrandTotalBankable;
		receiptsGrandTotalBankableESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiptsGrandTotalBankable()
	 * @see #getReceiptsGrandTotalBankable()
	 * @see #setReceiptsGrandTotalBankable(float)
	 * @generated
	 */
	public void unsetReceiptsGrandTotalBankable() {
		receiptsGrandTotalBankable = RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT;
		receiptsGrandTotalBankableESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receipts Grand Total Bankable</em>' attribute is set.
	 * @see #unsetReceiptsGrandTotalBankable()
	 * @see #getReceiptsGrandTotalBankable()
	 * @see #setReceiptsGrandTotalBankable(float)
	 * @generated
	 */
	public boolean isSetReceiptsGrandTotalBankable() {
		return receiptsGrandTotalBankableESet;
	}

	/**
	 * Returns the value of the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts Grand Total Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts Grand Total Rounding</em>' attribute.
	 * @see #isSetReceiptsGrandTotalRounding()
	 * @see #unsetReceiptsGrandTotalRounding()
	 * @see #setReceiptsGrandTotalRounding(float)
	 * @generated
	 */
	public float getReceiptsGrandTotalRounding() {
		return receiptsGrandTotalRounding;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipts Grand Total Rounding</em>' attribute.
	 * @see #isSetReceiptsGrandTotalRounding()
	 * @see #unsetReceiptsGrandTotalRounding()
	 * @see #getReceiptsGrandTotalRounding()
	 * @generated
	 */
	public void setReceiptsGrandTotalRounding(float newReceiptsGrandTotalRounding) {
		receiptsGrandTotalRounding = newReceiptsGrandTotalRounding;
		receiptsGrandTotalRoundingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiptsGrandTotalRounding()
	 * @see #getReceiptsGrandTotalRounding()
	 * @see #setReceiptsGrandTotalRounding(float)
	 * @generated
	 */
	public void unsetReceiptsGrandTotalRounding() {
		receiptsGrandTotalRounding = RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT;
		receiptsGrandTotalRoundingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receipts Grand Total Rounding</em>' attribute is set.
	 * @see #unsetReceiptsGrandTotalRounding()
	 * @see #getReceiptsGrandTotalRounding()
	 * @see #setReceiptsGrandTotalRounding(float)
	 * @generated
	 */
	public boolean isSetReceiptsGrandTotalRounding() {
		return receiptsGrandTotalRoundingESet;
	}

	/**
	 * Returns the value of the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions Grand Total Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions Grand Total Rounding</em>' attribute.
	 * @see #isSetTransactionsGrandTotalRounding()
	 * @see #unsetTransactionsGrandTotalRounding()
	 * @see #setTransactionsGrandTotalRounding(float)
	 * @generated
	 */
	public float getTransactionsGrandTotalRounding() {
		return transactionsGrandTotalRounding;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactions Grand Total Rounding</em>' attribute.
	 * @see #isSetTransactionsGrandTotalRounding()
	 * @see #unsetTransactionsGrandTotalRounding()
	 * @see #getTransactionsGrandTotalRounding()
	 * @generated
	 */
	public void setTransactionsGrandTotalRounding(float newTransactionsGrandTotalRounding) {
		transactionsGrandTotalRounding = newTransactionsGrandTotalRounding;
		transactionsGrandTotalRoundingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionsGrandTotalRounding()
	 * @see #getTransactionsGrandTotalRounding()
	 * @see #setTransactionsGrandTotalRounding(float)
	 * @generated
	 */
	public void unsetTransactionsGrandTotalRounding() {
		transactionsGrandTotalRounding = TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT;
		transactionsGrandTotalRoundingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transactions Grand Total Rounding</em>' attribute is set.
	 * @see #unsetTransactionsGrandTotalRounding()
	 * @see #getTransactionsGrandTotalRounding()
	 * @see #setTransactionsGrandTotalRounding(float)
	 * @generated
	 */
	public boolean isSetTransactionsGrandTotalRounding() {
		return transactionsGrandTotalRoundingESet;
	}

	/**
	 * Returns the value of the '<em><b>Activity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Interval</em>' containment reference.
	 * @see #setActivityInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getActivityInterval() {
		return activityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityInterval(DateTimeInterval newActivityInterval, NotificationChain msgs) {
		DateTimeInterval oldActivityInterval = activityInterval;
		activityInterval = newActivityInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getActivityInterval <em>Activity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Interval</em>' containment reference.
	 * @see #getActivityInterval()
	 * @generated
	 */
	public void setActivityInterval(DateTimeInterval newActivityInterval) {
		if (newActivityInterval != activityInterval) {
			NotificationChain msgs = null;
			if (activityInterval != null)
				msgs = ((InternalEObject)activityInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL, null, msgs);
			if (newActivityInterval != null)
				msgs = ((InternalEObject)newActivityInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL, null, msgs);
			msgs = basicSetActivityInterval(newActivityInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipts Grand Total Non Bankable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipts Grand Total Non Bankable</em>' attribute.
	 * @see #isSetReceiptsGrandTotalNonBankable()
	 * @see #unsetReceiptsGrandTotalNonBankable()
	 * @see #setReceiptsGrandTotalNonBankable(float)
	 * @generated
	 */
	public float getReceiptsGrandTotalNonBankable() {
		return receiptsGrandTotalNonBankable;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipts Grand Total Non Bankable</em>' attribute.
	 * @see #isSetReceiptsGrandTotalNonBankable()
	 * @see #unsetReceiptsGrandTotalNonBankable()
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @generated
	 */
	public void setReceiptsGrandTotalNonBankable(float newReceiptsGrandTotalNonBankable) {
		receiptsGrandTotalNonBankable = newReceiptsGrandTotalNonBankable;
		receiptsGrandTotalNonBankableESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiptsGrandTotalNonBankable()
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @see #setReceiptsGrandTotalNonBankable(float)
	 * @generated
	 */
	public void unsetReceiptsGrandTotalNonBankable() {
		receiptsGrandTotalNonBankable = RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT;
		receiptsGrandTotalNonBankableESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receipts Grand Total Non Bankable</em>' attribute is set.
	 * @see #unsetReceiptsGrandTotalNonBankable()
	 * @see #getReceiptsGrandTotalNonBankable()
	 * @see #setReceiptsGrandTotalNonBankable(float)
	 * @generated
	 */
	public boolean isSetReceiptsGrandTotalNonBankable() {
		return receiptsGrandTotalNonBankableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				return basicSetActivityInterval(null, msgs);
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
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				return getTransactionsGrandTotal();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				return getReceiptsGrandTotalBankable();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				return getReceiptsGrandTotalRounding();
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				return getTransactionsGrandTotalRounding();
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				return getActivityInterval();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				return getReceiptsGrandTotalNonBankable();
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
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				setTransactionsGrandTotal((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				setReceiptsGrandTotalBankable((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				setReceiptsGrandTotalRounding((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				setTransactionsGrandTotalRounding((Float)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				setActivityInterval((DateTimeInterval)newValue);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				setReceiptsGrandTotalNonBankable((Float)newValue);
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
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				unsetTransactionsGrandTotal();
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				unsetReceiptsGrandTotalBankable();
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				unsetReceiptsGrandTotalRounding();
				return;
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				unsetTransactionsGrandTotalRounding();
				return;
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				setActivityInterval((DateTimeInterval)null);
				return;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				unsetReceiptsGrandTotalNonBankable();
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
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
				return isSetTransactionsGrandTotal();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
				return isSetReceiptsGrandTotalBankable();
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
				return isSetReceiptsGrandTotalRounding();
			case PaymentMeteringPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
				return isSetTransactionsGrandTotalRounding();
			case PaymentMeteringPackage.SHIFT__ACTIVITY_INTERVAL:
				return activityInterval != null;
			case PaymentMeteringPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
				return isSetReceiptsGrandTotalNonBankable();
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
		result.append(" (transactionsGrandTotal: ");
		if (transactionsGrandTotalESet) result.append(transactionsGrandTotal); else result.append("<unset>");
		result.append(", receiptsGrandTotalBankable: ");
		if (receiptsGrandTotalBankableESet) result.append(receiptsGrandTotalBankable); else result.append("<unset>");
		result.append(", receiptsGrandTotalRounding: ");
		if (receiptsGrandTotalRoundingESet) result.append(receiptsGrandTotalRounding); else result.append("<unset>");
		result.append(", transactionsGrandTotalRounding: ");
		if (transactionsGrandTotalRoundingESet) result.append(transactionsGrandTotalRounding); else result.append("<unset>");
		result.append(", receiptsGrandTotalNonBankable: ");
		if (receiptsGrandTotalNonBankableESet) result.append(receiptsGrandTotalNonBankable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Shift
