/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Permit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessPermit extends Document {
	/**
	 * The default value of the '{@link #getApplicationNumber() <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationNumber() <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationNumber()
	 * @generated
	 * @ordered
	 */
	protected String applicationNumber = APPLICATION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Application Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicationNumberESet;

	/**
	 * The default value of the '{@link #getPayment() <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected static final float PAYMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected float payment = PAYMENT_EDEFAULT;

	/**
	 * This is true if the Payment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paymentESet;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected String effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * This is true if the Effective Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectiveDateESet;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * This is true if the Expiration Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expirationDateESet;

	/**
	 * The default value of the '{@link #getPermitID() <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitID()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermitID() <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitID()
	 * @generated
	 * @ordered
	 */
	protected String permitID = PERMIT_ID_EDEFAULT;

	/**
	 * This is true if the Permit ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permitIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessPermit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.ACCESS_PERMIT;
	}

	/**
	 * Returns the value of the '<em><b>Application Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Number</em>' attribute.
	 * @see #isSetApplicationNumber()
	 * @see #unsetApplicationNumber()
	 * @see #setApplicationNumber(String)
	 * @generated
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Number</em>' attribute.
	 * @see #isSetApplicationNumber()
	 * @see #unsetApplicationNumber()
	 * @see #getApplicationNumber()
	 * @generated
	 */
	public void setApplicationNumber(String newApplicationNumber) {
		applicationNumber = newApplicationNumber;
		applicationNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicationNumber()
	 * @see #getApplicationNumber()
	 * @see #setApplicationNumber(String)
	 * @generated
	 */
	public void unsetApplicationNumber() {
		applicationNumber = APPLICATION_NUMBER_EDEFAULT;
		applicationNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getApplicationNumber <em>Application Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application Number</em>' attribute is set.
	 * @see #unsetApplicationNumber()
	 * @see #getApplicationNumber()
	 * @see #setApplicationNumber(String)
	 * @generated
	 */
	public boolean isSetApplicationNumber() {
		return applicationNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' attribute.
	 * @see #isSetPayment()
	 * @see #unsetPayment()
	 * @see #setPayment(float)
	 * @generated
	 */
	public float getPayment() {
		return payment;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' attribute.
	 * @see #isSetPayment()
	 * @see #unsetPayment()
	 * @see #getPayment()
	 * @generated
	 */
	public void setPayment(float newPayment) {
		payment = newPayment;
		paymentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPayment()
	 * @see #getPayment()
	 * @see #setPayment(float)
	 * @generated
	 */
	public void unsetPayment() {
		payment = PAYMENT_EDEFAULT;
		paymentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPayment <em>Payment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Payment</em>' attribute is set.
	 * @see #unsetPayment()
	 * @see #getPayment()
	 * @see #setPayment(float)
	 * @generated
	 */
	public boolean isSetPayment() {
		return paymentESet;
	}

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #isSetEffectiveDate()
	 * @see #unsetEffectiveDate()
	 * @see #setEffectiveDate(String)
	 * @generated
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #isSetEffectiveDate()
	 * @see #unsetEffectiveDate()
	 * @see #getEffectiveDate()
	 * @generated
	 */
	public void setEffectiveDate(String newEffectiveDate) {
		effectiveDate = newEffectiveDate;
		effectiveDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffectiveDate()
	 * @see #getEffectiveDate()
	 * @see #setEffectiveDate(String)
	 * @generated
	 */
	public void unsetEffectiveDate() {
		effectiveDate = EFFECTIVE_DATE_EDEFAULT;
		effectiveDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getEffectiveDate <em>Effective Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effective Date</em>' attribute is set.
	 * @see #unsetEffectiveDate()
	 * @see #getEffectiveDate()
	 * @see #setEffectiveDate(String)
	 * @generated
	 */
	public boolean isSetEffectiveDate() {
		return effectiveDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #isSetExpirationDate()
	 * @see #unsetExpirationDate()
	 * @see #setExpirationDate(String)
	 * @generated
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #isSetExpirationDate()
	 * @see #unsetExpirationDate()
	 * @see #getExpirationDate()
	 * @generated
	 */
	public void setExpirationDate(String newExpirationDate) {
		expirationDate = newExpirationDate;
		expirationDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpirationDate()
	 * @see #getExpirationDate()
	 * @see #setExpirationDate(String)
	 * @generated
	 */
	public void unsetExpirationDate() {
		expirationDate = EXPIRATION_DATE_EDEFAULT;
		expirationDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getExpirationDate <em>Expiration Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expiration Date</em>' attribute is set.
	 * @see #unsetExpirationDate()
	 * @see #getExpirationDate()
	 * @see #setExpirationDate(String)
	 * @generated
	 */
	public boolean isSetExpirationDate() {
		return expirationDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Permit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permit ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permit ID</em>' attribute.
	 * @see #isSetPermitID()
	 * @see #unsetPermitID()
	 * @see #setPermitID(String)
	 * @generated
	 */
	public String getPermitID() {
		return permitID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit ID</em>' attribute.
	 * @see #isSetPermitID()
	 * @see #unsetPermitID()
	 * @see #getPermitID()
	 * @generated
	 */
	public void setPermitID(String newPermitID) {
		permitID = newPermitID;
		permitIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermitID()
	 * @see #getPermitID()
	 * @see #setPermitID(String)
	 * @generated
	 */
	public void unsetPermitID() {
		permitID = PERMIT_ID_EDEFAULT;
		permitIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.AccessPermit#getPermitID <em>Permit ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permit ID</em>' attribute is set.
	 * @see #unsetPermitID()
	 * @see #getPermitID()
	 * @see #setPermitID(String)
	 * @generated
	 */
	public boolean isSetPermitID() {
		return permitIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				return getApplicationNumber();
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				return getPayment();
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				return getEffectiveDate();
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				return getExpirationDate();
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				return getPermitID();
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
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				setApplicationNumber((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				setPayment((Float)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				setEffectiveDate((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				setPermitID((String)newValue);
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
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				unsetApplicationNumber();
				return;
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				unsetPayment();
				return;
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				unsetEffectiveDate();
				return;
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				unsetExpirationDate();
				return;
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				unsetPermitID();
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
			case InfWorkPackage.ACCESS_PERMIT__APPLICATION_NUMBER:
				return isSetApplicationNumber();
			case InfWorkPackage.ACCESS_PERMIT__PAYMENT:
				return isSetPayment();
			case InfWorkPackage.ACCESS_PERMIT__EFFECTIVE_DATE:
				return isSetEffectiveDate();
			case InfWorkPackage.ACCESS_PERMIT__EXPIRATION_DATE:
				return isSetExpirationDate();
			case InfWorkPackage.ACCESS_PERMIT__PERMIT_ID:
				return isSetPermitID();
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
		result.append(" (applicationNumber: ");
		if (applicationNumberESet) result.append(applicationNumber); else result.append("<unset>");
		result.append(", payment: ");
		if (paymentESet) result.append(payment); else result.append("<unset>");
		result.append(", effectiveDate: ");
		if (effectiveDateESet) result.append(effectiveDate); else result.append("<unset>");
		result.append(", expirationDate: ");
		if (expirationDateESet) result.append(expirationDate); else result.append("<unset>");
		result.append(", permitID: ");
		if (permitIDESet) result.append(permitID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AccessPermit
