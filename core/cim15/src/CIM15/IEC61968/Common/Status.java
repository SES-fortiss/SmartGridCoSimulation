/**
 */
package CIM15.IEC61968.Common;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.Status#getReason <em>Reason</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Status#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Status#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Status#getRemark <em>Remark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Status extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * This is true if the Reason attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonESet;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * This is true if the Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remarkESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Status() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.STATUS;
	}

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Status#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	public void setReason(String newReason) {
		reason = newReason;
		reasonESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Status#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public void unsetReason() {
		reason = REASON_EDEFAULT;
		reasonESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Status#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public boolean isSetReason() {
		return reasonESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Status#getDateTime <em>Date Time</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Status#getDateTime <em>Date Time</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Status#getDateTime <em>Date Time</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Status#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Status#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Status#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #isSetRemark()
	 * @see #unsetRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Status#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #isSetRemark()
	 * @see #unsetRemark()
	 * @see #getRemark()
	 * @generated
	 */
	public void setRemark(String newRemark) {
		remark = newRemark;
		remarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Status#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemark()
	 * @see #getRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public void unsetRemark() {
		remark = REMARK_EDEFAULT;
		remarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Status#getRemark <em>Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remark</em>' attribute is set.
	 * @see #unsetRemark()
	 * @see #getRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public boolean isSetRemark() {
		return remarkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.STATUS__REASON:
				return getReason();
			case CommonPackage.STATUS__DATE_TIME:
				return getDateTime();
			case CommonPackage.STATUS__VALUE:
				return getValue();
			case CommonPackage.STATUS__REMARK:
				return getRemark();
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
			case CommonPackage.STATUS__REASON:
				setReason((String)newValue);
				return;
			case CommonPackage.STATUS__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case CommonPackage.STATUS__VALUE:
				setValue((String)newValue);
				return;
			case CommonPackage.STATUS__REMARK:
				setRemark((String)newValue);
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
			case CommonPackage.STATUS__REASON:
				unsetReason();
				return;
			case CommonPackage.STATUS__DATE_TIME:
				unsetDateTime();
				return;
			case CommonPackage.STATUS__VALUE:
				unsetValue();
				return;
			case CommonPackage.STATUS__REMARK:
				unsetRemark();
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
			case CommonPackage.STATUS__REASON:
				return isSetReason();
			case CommonPackage.STATUS__DATE_TIME:
				return isSetDateTime();
			case CommonPackage.STATUS__VALUE:
				return isSetValue();
			case CommonPackage.STATUS__REMARK:
				return isSetRemark();
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
		result.append(" (reason: ");
		if (reasonESet) result.append(reason); else result.append("<unset>");
		result.append(", dateTime: ");
		if (dateTimeESet) result.append(dateTime); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", remark: ");
		if (remarkESet) result.append(remark); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Status
