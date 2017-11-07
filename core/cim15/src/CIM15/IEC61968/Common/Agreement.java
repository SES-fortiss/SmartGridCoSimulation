/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61970.Domain.DateTimeInterval;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Agreement#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Agreement extends Document {
	/**
	 * The default value of the '{@link #getSignDate() <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignDate() <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignDate()
	 * @generated
	 * @ordered
	 */
	protected String signDate = SIGN_DATE_EDEFAULT;

	/**
	 * This is true if the Sign Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signDateESet;

	/**
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Agreement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.AGREEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Date</em>' attribute.
	 * @see #isSetSignDate()
	 * @see #unsetSignDate()
	 * @see #setSignDate(String)
	 * @generated
	 */
	public String getSignDate() {
		return signDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Date</em>' attribute.
	 * @see #isSetSignDate()
	 * @see #unsetSignDate()
	 * @see #getSignDate()
	 * @generated
	 */
	public void setSignDate(String newSignDate) {
		signDate = newSignDate;
		signDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignDate()
	 * @see #getSignDate()
	 * @see #setSignDate(String)
	 * @generated
	 */
	public void unsetSignDate() {
		signDate = SIGN_DATE_EDEFAULT;
		signDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Agreement#getSignDate <em>Sign Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sign Date</em>' attribute is set.
	 * @see #unsetSignDate()
	 * @see #getSignDate()
	 * @see #setSignDate(String)
	 * @generated
	 */
	public boolean isSetSignDate() {
		return signDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Interval</em>' containment reference.
	 * @see #setValidityInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getValidityInterval() {
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityInterval(DateTimeInterval newValidityInterval, NotificationChain msgs) {
		DateTimeInterval oldValidityInterval = validityInterval;
		validityInterval = newValidityInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Agreement#getValidityInterval <em>Validity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' containment reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	public void setValidityInterval(DateTimeInterval newValidityInterval) {
		if (newValidityInterval != validityInterval) {
			NotificationChain msgs = null;
			if (validityInterval != null)
				msgs = ((InternalEObject)validityInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.AGREEMENT__VALIDITY_INTERVAL, null, msgs);
			if (newValidityInterval != null)
				msgs = ((InternalEObject)newValidityInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.AGREEMENT__VALIDITY_INTERVAL, null, msgs);
			msgs = basicSetValidityInterval(newValidityInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				return basicSetValidityInterval(null, msgs);
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				return getSignDate();
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				return getValidityInterval();
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				setSignDate((String)newValue);
				return;
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				unsetSignDate();
				return;
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				return isSetSignDate();
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				return validityInterval != null;
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
		result.append(" (signDate: ");
		if (signDateESet) result.append(signDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Agreement
