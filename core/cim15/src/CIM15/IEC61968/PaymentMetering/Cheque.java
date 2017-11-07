/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cheque#getBankAccountDetail <em>Bank Account Detail</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Cheque extends Element {
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
	 * The default value of the '{@link #getMicrNumber() <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MICR_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMicrNumber() <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrNumber()
	 * @generated
	 * @ordered
	 */
	protected String micrNumber = MICR_NUMBER_EDEFAULT;

	/**
	 * This is true if the Micr Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean micrNumberESet;

	/**
	 * The cached value of the '{@link #getBankAccountDetail() <em>Bank Account Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccountDetail()
	 * @generated
	 * @ordered
	 */
	protected BankAccountDetail bankAccountDetail;

	/**
	 * The default value of the '{@link #getChequeNumber() <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChequeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEQUE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChequeNumber() <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChequeNumber()
	 * @generated
	 * @ordered
	 */
	protected String chequeNumber = CHEQUE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Cheque Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chequeNumberESet;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * This is true if the Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChequeKind KIND_EDEFAULT = ChequeKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ChequeKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cheque() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CHEQUE;
	}

	/**
	 * Returns the value of the '<em><b>Tender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tender</em>' reference.
	 * @see #setTender(Tender)
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getCheque
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
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}' reference.
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
				msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CHEQUE, Tender.class, msgs);
			if (newTender != null)
				msgs = ((InternalEObject)newTender).eInverseAdd(this, PaymentMeteringPackage.TENDER__CHEQUE, Tender.class, msgs);
			msgs = basicSetTender(newTender, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Micr Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Micr Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Micr Number</em>' attribute.
	 * @see #isSetMicrNumber()
	 * @see #unsetMicrNumber()
	 * @see #setMicrNumber(String)
	 * @generated
	 */
	public String getMicrNumber() {
		return micrNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Micr Number</em>' attribute.
	 * @see #isSetMicrNumber()
	 * @see #unsetMicrNumber()
	 * @see #getMicrNumber()
	 * @generated
	 */
	public void setMicrNumber(String newMicrNumber) {
		micrNumber = newMicrNumber;
		micrNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMicrNumber()
	 * @see #getMicrNumber()
	 * @see #setMicrNumber(String)
	 * @generated
	 */
	public void unsetMicrNumber() {
		micrNumber = MICR_NUMBER_EDEFAULT;
		micrNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Micr Number</em>' attribute is set.
	 * @see #unsetMicrNumber()
	 * @see #getMicrNumber()
	 * @see #setMicrNumber(String)
	 * @generated
	 */
	public boolean isSetMicrNumber() {
		return micrNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Bank Account Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Account Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Account Detail</em>' containment reference.
	 * @see #setBankAccountDetail(BankAccountDetail)
	 * @generated
	 */
	public BankAccountDetail getBankAccountDetail() {
		return bankAccountDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankAccountDetail(BankAccountDetail newBankAccountDetail, NotificationChain msgs) {
		BankAccountDetail oldBankAccountDetail = bankAccountDetail;
		bankAccountDetail = newBankAccountDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getBankAccountDetail <em>Bank Account Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Account Detail</em>' containment reference.
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	public void setBankAccountDetail(BankAccountDetail newBankAccountDetail) {
		if (newBankAccountDetail != bankAccountDetail) {
			NotificationChain msgs = null;
			if (bankAccountDetail != null)
				msgs = ((InternalEObject)bankAccountDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL, null, msgs);
			if (newBankAccountDetail != null)
				msgs = ((InternalEObject)newBankAccountDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL, null, msgs);
			msgs = basicSetBankAccountDetail(newBankAccountDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cheque Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheque Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheque Number</em>' attribute.
	 * @see #isSetChequeNumber()
	 * @see #unsetChequeNumber()
	 * @see #setChequeNumber(String)
	 * @generated
	 */
	public String getChequeNumber() {
		return chequeNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cheque Number</em>' attribute.
	 * @see #isSetChequeNumber()
	 * @see #unsetChequeNumber()
	 * @see #getChequeNumber()
	 * @generated
	 */
	public void setChequeNumber(String newChequeNumber) {
		chequeNumber = newChequeNumber;
		chequeNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChequeNumber()
	 * @see #getChequeNumber()
	 * @see #setChequeNumber(String)
	 * @generated
	 */
	public void unsetChequeNumber() {
		chequeNumber = CHEQUE_NUMBER_EDEFAULT;
		chequeNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cheque Number</em>' attribute is set.
	 * @see #unsetChequeNumber()
	 * @see #getChequeNumber()
	 * @see #setChequeNumber(String)
	 * @generated
	 */
	public boolean isSetChequeNumber() {
		return chequeNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #isSetDate()
	 * @see #unsetDate()
	 * @see #setDate(String)
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #isSetDate()
	 * @see #unsetDate()
	 * @see #getDate()
	 * @generated
	 */
	public void setDate(String newDate) {
		date = newDate;
		dateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDate()
	 * @see #getDate()
	 * @see #setDate(String)
	 * @generated
	 */
	public void unsetDate() {
		date = DATE_EDEFAULT;
		dateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date</em>' attribute is set.
	 * @see #unsetDate()
	 * @see #getDate()
	 * @see #setDate(String)
	 * @generated
	 */
	public boolean isSetDate() {
		return dateESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.PaymentMetering.ChequeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.ChequeKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ChequeKind)
	 * @generated
	 */
	public ChequeKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.ChequeKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(ChequeKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ChequeKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ChequeKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.CHEQUE__TENDER:
				if (tender != null)
					msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CHEQUE, Tender.class, msgs);
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
			case PaymentMeteringPackage.CHEQUE__TENDER:
				return basicSetTender(null, msgs);
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				return basicSetBankAccountDetail(null, msgs);
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
			case PaymentMeteringPackage.CHEQUE__TENDER:
				if (resolve) return getTender();
				return basicGetTender();
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				return getMicrNumber();
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				return getBankAccountDetail();
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				return getChequeNumber();
			case PaymentMeteringPackage.CHEQUE__DATE:
				return getDate();
			case PaymentMeteringPackage.CHEQUE__KIND:
				return getKind();
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
			case PaymentMeteringPackage.CHEQUE__TENDER:
				setTender((Tender)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				setMicrNumber((String)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				setBankAccountDetail((BankAccountDetail)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				setChequeNumber((String)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__DATE:
				setDate((String)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__KIND:
				setKind((ChequeKind)newValue);
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
			case PaymentMeteringPackage.CHEQUE__TENDER:
				setTender((Tender)null);
				return;
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				unsetMicrNumber();
				return;
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				setBankAccountDetail((BankAccountDetail)null);
				return;
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				unsetChequeNumber();
				return;
			case PaymentMeteringPackage.CHEQUE__DATE:
				unsetDate();
				return;
			case PaymentMeteringPackage.CHEQUE__KIND:
				unsetKind();
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
			case PaymentMeteringPackage.CHEQUE__TENDER:
				return tender != null;
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				return isSetMicrNumber();
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				return bankAccountDetail != null;
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				return isSetChequeNumber();
			case PaymentMeteringPackage.CHEQUE__DATE:
				return isSetDate();
			case PaymentMeteringPackage.CHEQUE__KIND:
				return isSetKind();
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
		result.append(" (micrNumber: ");
		if (micrNumberESet) result.append(micrNumber); else result.append("<unset>");
		result.append(", chequeNumber: ");
		if (chequeNumberESet) result.append(chequeNumber); else result.append("<unset>");
		result.append(", date: ");
		if (dateESet) result.append(date); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Cheque
