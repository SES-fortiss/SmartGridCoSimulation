/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Card extends Element {
	/**
	 * The default value of the '{@link #getCvNumber() <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CV_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCvNumber() <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvNumber()
	 * @generated
	 * @ordered
	 */
	protected String cvNumber = CV_NUMBER_EDEFAULT;

	/**
	 * This is true if the Cv Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cvNumberESet;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected String expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * This is true if the Expiry Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expiryDateESet;

	/**
	 * The default value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected static final String PAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected String pan = PAN_EDEFAULT;

	/**
	 * This is true if the Pan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean panESet;

	/**
	 * The default value of the '{@link #getAccountHolderName() <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountHolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_HOLDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountHolderName() <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountHolderName()
	 * @generated
	 * @ordered
	 */
	protected String accountHolderName = ACCOUNT_HOLDER_NAME_EDEFAULT;

	/**
	 * This is true if the Account Holder Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountHolderNameESet;

	/**
	 * The cached value of the '{@link #getTender() <em>Tender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTender()
	 * @generated
	 * @ordered
	 */
	protected Tender tender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Card() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CARD;
	}

	/**
	 * Returns the value of the '<em><b>Cv Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cv Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cv Number</em>' attribute.
	 * @see #isSetCvNumber()
	 * @see #unsetCvNumber()
	 * @see #setCvNumber(String)
	 * @generated
	 */
	public String getCvNumber() {
		return cvNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cv Number</em>' attribute.
	 * @see #isSetCvNumber()
	 * @see #unsetCvNumber()
	 * @see #getCvNumber()
	 * @generated
	 */
	public void setCvNumber(String newCvNumber) {
		cvNumber = newCvNumber;
		cvNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCvNumber()
	 * @see #getCvNumber()
	 * @see #setCvNumber(String)
	 * @generated
	 */
	public void unsetCvNumber() {
		cvNumber = CV_NUMBER_EDEFAULT;
		cvNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cv Number</em>' attribute is set.
	 * @see #unsetCvNumber()
	 * @see #getCvNumber()
	 * @see #setCvNumber(String)
	 * @generated
	 */
	public boolean isSetCvNumber() {
		return cvNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #isSetExpiryDate()
	 * @see #unsetExpiryDate()
	 * @see #setExpiryDate(String)
	 * @generated
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #isSetExpiryDate()
	 * @see #unsetExpiryDate()
	 * @see #getExpiryDate()
	 * @generated
	 */
	public void setExpiryDate(String newExpiryDate) {
		expiryDate = newExpiryDate;
		expiryDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpiryDate()
	 * @see #getExpiryDate()
	 * @see #setExpiryDate(String)
	 * @generated
	 */
	public void unsetExpiryDate() {
		expiryDate = EXPIRY_DATE_EDEFAULT;
		expiryDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expiry Date</em>' attribute is set.
	 * @see #unsetExpiryDate()
	 * @see #getExpiryDate()
	 * @see #setExpiryDate(String)
	 * @generated
	 */
	public boolean isSetExpiryDate() {
		return expiryDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan</em>' attribute.
	 * @see #isSetPan()
	 * @see #unsetPan()
	 * @see #setPan(String)
	 * @generated
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan</em>' attribute.
	 * @see #isSetPan()
	 * @see #unsetPan()
	 * @see #getPan()
	 * @generated
	 */
	public void setPan(String newPan) {
		pan = newPan;
		panESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPan()
	 * @see #getPan()
	 * @see #setPan(String)
	 * @generated
	 */
	public void unsetPan() {
		pan = PAN_EDEFAULT;
		panESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pan</em>' attribute is set.
	 * @see #unsetPan()
	 * @see #getPan()
	 * @see #setPan(String)
	 * @generated
	 */
	public boolean isSetPan() {
		return panESet;
	}

	/**
	 * Returns the value of the '<em><b>Account Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Holder Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Holder Name</em>' attribute.
	 * @see #isSetAccountHolderName()
	 * @see #unsetAccountHolderName()
	 * @see #setAccountHolderName(String)
	 * @generated
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Holder Name</em>' attribute.
	 * @see #isSetAccountHolderName()
	 * @see #unsetAccountHolderName()
	 * @see #getAccountHolderName()
	 * @generated
	 */
	public void setAccountHolderName(String newAccountHolderName) {
		accountHolderName = newAccountHolderName;
		accountHolderNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccountHolderName()
	 * @see #getAccountHolderName()
	 * @see #setAccountHolderName(String)
	 * @generated
	 */
	public void unsetAccountHolderName() {
		accountHolderName = ACCOUNT_HOLDER_NAME_EDEFAULT;
		accountHolderNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account Holder Name</em>' attribute is set.
	 * @see #unsetAccountHolderName()
	 * @see #getAccountHolderName()
	 * @see #setAccountHolderName(String)
	 * @generated
	 */
	public boolean isSetAccountHolderName() {
		return accountHolderNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Tender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tender</em>' reference.
	 * @see #setTender(Tender)
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getCard
	 * @generated
	 */
	public Tender getTender() {
		if (tender != null && tender.eIsProxy()) {
			InternalEObject oldTender = (InternalEObject)tender;
			tender = (Tender)eResolveProxy(oldTender);
			if (tender != oldTender) {
			}
		}
		return tender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tender basicGetTender() {
		return tender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTender(Tender newTender, NotificationChain msgs) {
		Tender oldTender = tender;
		tender = newTender;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tender</em>' reference.
	 * @see #getTender()
	 * @generated
	 */
	public void setTender(Tender newTender) {
		if (newTender != tender) {
			NotificationChain msgs = null;
			if (tender != null)
				msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CARD, Tender.class, msgs);
			if (newTender != null)
				msgs = ((InternalEObject)newTender).eInverseAdd(this, PaymentMeteringPackage.TENDER__CARD, Tender.class, msgs);
			msgs = basicSetTender(newTender, msgs);
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
			case PaymentMeteringPackage.CARD__TENDER:
				if (tender != null)
					msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CARD, Tender.class, msgs);
				return basicSetTender((Tender)otherEnd, msgs);
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
			case PaymentMeteringPackage.CARD__TENDER:
				return basicSetTender(null, msgs);
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				return getCvNumber();
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				return getExpiryDate();
			case PaymentMeteringPackage.CARD__PAN:
				return getPan();
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				return getAccountHolderName();
			case PaymentMeteringPackage.CARD__TENDER:
				if (resolve) return getTender();
				return basicGetTender();
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				setCvNumber((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				setExpiryDate((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__PAN:
				setPan((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				setAccountHolderName((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__TENDER:
				setTender((Tender)newValue);
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				unsetCvNumber();
				return;
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				unsetExpiryDate();
				return;
			case PaymentMeteringPackage.CARD__PAN:
				unsetPan();
				return;
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				unsetAccountHolderName();
				return;
			case PaymentMeteringPackage.CARD__TENDER:
				setTender((Tender)null);
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				return isSetCvNumber();
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				return isSetExpiryDate();
			case PaymentMeteringPackage.CARD__PAN:
				return isSetPan();
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				return isSetAccountHolderName();
			case PaymentMeteringPackage.CARD__TENDER:
				return tender != null;
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
		result.append(" (cvNumber: ");
		if (cvNumberESet) result.append(cvNumber); else result.append("<unset>");
		result.append(", expiryDate: ");
		if (expiryDateESet) result.append(expiryDate); else result.append("<unset>");
		result.append(", pan: ");
		if (panESet) result.append(pan); else result.append("<unset>");
		result.append(", accountHolderName: ");
		if (accountHolderNameESet) result.append(accountHolderName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Card
