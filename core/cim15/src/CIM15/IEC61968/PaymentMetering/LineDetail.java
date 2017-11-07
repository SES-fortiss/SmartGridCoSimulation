/**
 */
package CIM15.IEC61968.PaymentMetering;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineDetail extends MinimalEObjectImpl.Container implements EObject {
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
	 * The default value of the '{@link #getRounding() <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounding()
	 * @generated
	 * @ordered
	 */
	protected static final float ROUNDING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRounding() <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounding()
	 * @generated
	 * @ordered
	 */
	protected float rounding = ROUNDING_EDEFAULT;

	/**
	 * This is true if the Rounding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roundingESet;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateTimeESet;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * This is true if the Note attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineDetail() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.LINE_DETAIL;
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
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rounding</em>' attribute.
	 * @see #isSetRounding()
	 * @see #unsetRounding()
	 * @see #setRounding(float)
	 * @generated
	 */
	public float getRounding() {
		return rounding;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rounding</em>' attribute.
	 * @see #isSetRounding()
	 * @see #unsetRounding()
	 * @see #getRounding()
	 * @generated
	 */
	public void setRounding(float newRounding) {
		rounding = newRounding;
		roundingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRounding()
	 * @see #getRounding()
	 * @see #setRounding(float)
	 * @generated
	 */
	public void unsetRounding() {
		rounding = ROUNDING_EDEFAULT;
		roundingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rounding</em>' attribute is set.
	 * @see #unsetRounding()
	 * @see #getRounding()
	 * @see #setRounding(float)
	 * @generated
	 */
	public boolean isSetRounding() {
		return roundingESet;
	}

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		dateTime = newDateTime;
		dateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public void unsetDateTime() {
		dateTime = DATE_TIME_EDEFAULT;
		dateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Time</em>' attribute is set.
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public boolean isSetDateTime() {
		return dateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #isSetNote()
	 * @see #unsetNote()
	 * @see #setNote(String)
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #isSetNote()
	 * @see #unsetNote()
	 * @see #getNote()
	 * @generated
	 */
	public void setNote(String newNote) {
		note = newNote;
		noteESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNote()
	 * @see #getNote()
	 * @see #setNote(String)
	 * @generated
	 */
	public void unsetNote() {
		note = NOTE_EDEFAULT;
		noteESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Note</em>' attribute is set.
	 * @see #unsetNote()
	 * @see #getNote()
	 * @see #setNote(String)
	 * @generated
	 */
	public boolean isSetNote() {
		return noteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				return getAmount();
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				return getRounding();
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				return getDateTime();
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				return getNote();
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
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				setAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				setRounding((Float)newValue);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				setNote((String)newValue);
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
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				unsetAmount();
				return;
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				unsetRounding();
				return;
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				unsetDateTime();
				return;
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				unsetNote();
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
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				return isSetAmount();
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				return isSetRounding();
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				return isSetDateTime();
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				return isSetNote();
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
		result.append(" (amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(", rounding: ");
		if (roundingESet) result.append(rounding); else result.append("<unset>");
		result.append(", dateTime: ");
		if (dateTimeESet) result.append(dateTime); else result.append("<unset>");
		result.append(", note: ");
		if (noteESet) result.append(note); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LineDetail
