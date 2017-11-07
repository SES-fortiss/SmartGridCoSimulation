/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.UserAttribute;

import CIM15.IEC61968.Customers.CustomerAccount;
import CIM15.IEC61968.Customers.CustomersPackage;
import CIM15.IEC61968.Customers.PricingStructure;

import CIM15.IEC61968.Metering.Meter;
import CIM15.IEC61968.Metering.MeteringPackage;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getLine <em>Line</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getMeter <em>Meter</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Transaction extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getPricingStructure() <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructure()
	 * @generated
	 * @ordered
	 */
	protected PricingStructure pricingStructure;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected LineDetail line;

	/**
	 * The default value of the '{@link #getDonorReference() <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonorReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DONOR_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDonorReference() <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonorReference()
	 * @generated
	 * @ordered
	 */
	protected String donorReference = DONOR_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Donor Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean donorReferenceESet;

	/**
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionKind KIND_EDEFAULT = TransactionKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransactionKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getReceiverReference() <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverReference()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVER_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiverReference() <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverReference()
	 * @generated
	 * @ordered
	 */
	protected String receiverReference = RECEIVER_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Receiver Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receiverReferenceESet;

	/**
	 * The cached value of the '{@link #getAuxiliaryAccount() <em>Auxiliary Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAccount()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryAccount auxiliaryAccount;

	/**
	 * The default value of the '{@link #getServiceUnitsError() <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsError()
	 * @generated
	 * @ordered
	 */
	protected static final float SERVICE_UNITS_ERROR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getServiceUnitsError() <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsError()
	 * @generated
	 * @ordered
	 */
	protected float serviceUnitsError = SERVICE_UNITS_ERROR_EDEFAULT;

	/**
	 * This is true if the Service Units Error attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceUnitsErrorESet;

	/**
	 * The cached value of the '{@link #getVendorShift() <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorShift()
	 * @generated
	 * @ordered
	 */
	protected VendorShift vendorShift;

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
	 * The default value of the '{@link #getDiverseReference() <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiverseReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DIVERSE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiverseReference() <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiverseReference()
	 * @generated
	 * @ordered
	 */
	protected String diverseReference = DIVERSE_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Diverse Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diverseReferenceESet;

	/**
	 * The default value of the '{@link #getServiceUnitsEnergy() <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final float SERVICE_UNITS_ENERGY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getServiceUnitsEnergy() <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUnitsEnergy()
	 * @generated
	 * @ordered
	 */
	protected float serviceUnitsEnergy = SERVICE_UNITS_ENERGY_EDEFAULT;

	/**
	 * This is true if the Service Units Energy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceUnitsEnergyESet;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected Meter meter;

	/**
	 * The default value of the '{@link #getReversedId() <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversedId()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSED_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReversedId() <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversedId()
	 * @generated
	 * @ordered
	 */
	protected String reversedId = REVERSED_ID_EDEFAULT;

	/**
	 * This is true if the Reversed Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reversedIdESet;

	/**
	 * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAccount()
	 * @generated
	 * @ordered
	 */
	protected CustomerAccount customerAccount;

	/**
	 * The cached value of the '{@link #getCashierShift() <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashierShift()
	 * @generated
	 * @ordered
	 */
	protected CashierShift cashierShift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transaction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TRANSACTION;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.PricingStructure#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structure</em>' reference.
	 * @see #setPricingStructure(PricingStructure)
	 * @see CIM15.IEC61968.Customers.PricingStructure#getTransactions
	 * @generated
	 */
	public PricingStructure getPricingStructure() {
		if (pricingStructure != null && pricingStructure.eIsProxy()) {
			InternalEObject oldPricingStructure = (InternalEObject)pricingStructure;
			pricingStructure = (PricingStructure)eResolveProxy(oldPricingStructure);
			if (pricingStructure != oldPricingStructure) {
			}
		}
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingStructure basicGetPricingStructure() {
		return pricingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPricingStructure(PricingStructure newPricingStructure, NotificationChain msgs) {
		PricingStructure oldPricingStructure = pricingStructure;
		pricingStructure = newPricingStructure;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Structure</em>' reference.
	 * @see #getPricingStructure()
	 * @generated
	 */
	public void setPricingStructure(PricingStructure newPricingStructure) {
		if (newPricingStructure != pricingStructure) {
			NotificationChain msgs = null;
			if (pricingStructure != null)
				msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs);
			if (newPricingStructure != null)
				msgs = ((InternalEObject)newPricingStructure).eInverseAdd(this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs);
			msgs = basicSetPricingStructure(newPricingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(LineDetail)
	 * @generated
	 */
	public LineDetail getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(LineDetail newLine, NotificationChain msgs) {
		LineDetail oldLine = line;
		line = newLine;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	public void setLine(LineDetail newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.TRANSACTION__LINE, null, msgs);
			if (newLine != null)
				msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.TRANSACTION__LINE, null, msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Donor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donor Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donor Reference</em>' attribute.
	 * @see #isSetDonorReference()
	 * @see #unsetDonorReference()
	 * @see #setDonorReference(String)
	 * @generated
	 */
	public String getDonorReference() {
		return donorReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donor Reference</em>' attribute.
	 * @see #isSetDonorReference()
	 * @see #unsetDonorReference()
	 * @see #getDonorReference()
	 * @generated
	 */
	public void setDonorReference(String newDonorReference) {
		donorReference = newDonorReference;
		donorReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDonorReference()
	 * @see #getDonorReference()
	 * @see #setDonorReference(String)
	 * @generated
	 */
	public void unsetDonorReference() {
		donorReference = DONOR_REFERENCE_EDEFAULT;
		donorReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Donor Reference</em>' attribute is set.
	 * @see #unsetDonorReference()
	 * @see #getDonorReference()
	 * @see #setDonorReference(String)
	 * @generated
	 */
	public boolean isSetDonorReference() {
		return donorReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getTransaction
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return userAttributes;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.PaymentMetering.TransactionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.TransactionKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(TransactionKind)
	 * @generated
	 */
	public TransactionKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.TransactionKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(TransactionKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(TransactionKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(TransactionKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Receiver Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Reference</em>' attribute.
	 * @see #isSetReceiverReference()
	 * @see #unsetReceiverReference()
	 * @see #setReceiverReference(String)
	 * @generated
	 */
	public String getReceiverReference() {
		return receiverReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Reference</em>' attribute.
	 * @see #isSetReceiverReference()
	 * @see #unsetReceiverReference()
	 * @see #getReceiverReference()
	 * @generated
	 */
	public void setReceiverReference(String newReceiverReference) {
		receiverReference = newReceiverReference;
		receiverReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiverReference()
	 * @see #getReceiverReference()
	 * @see #setReceiverReference(String)
	 * @generated
	 */
	public void unsetReceiverReference() {
		receiverReference = RECEIVER_REFERENCE_EDEFAULT;
		receiverReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receiver Reference</em>' attribute is set.
	 * @see #unsetReceiverReference()
	 * @see #getReceiverReference()
	 * @see #setReceiverReference(String)
	 * @generated
	 */
	public boolean isSetReceiverReference() {
		return receiverReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Account</em>' reference.
	 * @see #setAuxiliaryAccount(AuxiliaryAccount)
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions
	 * @generated
	 */
	public AuxiliaryAccount getAuxiliaryAccount() {
		if (auxiliaryAccount != null && auxiliaryAccount.eIsProxy()) {
			InternalEObject oldAuxiliaryAccount = (InternalEObject)auxiliaryAccount;
			auxiliaryAccount = (AuxiliaryAccount)eResolveProxy(oldAuxiliaryAccount);
			if (auxiliaryAccount != oldAuxiliaryAccount) {
			}
		}
		return auxiliaryAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAccount basicGetAuxiliaryAccount() {
		return auxiliaryAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxiliaryAccount(AuxiliaryAccount newAuxiliaryAccount, NotificationChain msgs) {
		AuxiliaryAccount oldAuxiliaryAccount = auxiliaryAccount;
		auxiliaryAccount = newAuxiliaryAccount;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Account</em>' reference.
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public void setAuxiliaryAccount(AuxiliaryAccount newAuxiliaryAccount) {
		if (newAuxiliaryAccount != auxiliaryAccount) {
			NotificationChain msgs = null;
			if (auxiliaryAccount != null)
				msgs = ((InternalEObject)auxiliaryAccount).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs);
			if (newAuxiliaryAccount != null)
				msgs = ((InternalEObject)newAuxiliaryAccount).eInverseAdd(this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs);
			msgs = basicSetAuxiliaryAccount(newAuxiliaryAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Service Units Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Units Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Units Error</em>' attribute.
	 * @see #isSetServiceUnitsError()
	 * @see #unsetServiceUnitsError()
	 * @see #setServiceUnitsError(float)
	 * @generated
	 */
	public float getServiceUnitsError() {
		return serviceUnitsError;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Units Error</em>' attribute.
	 * @see #isSetServiceUnitsError()
	 * @see #unsetServiceUnitsError()
	 * @see #getServiceUnitsError()
	 * @generated
	 */
	public void setServiceUnitsError(float newServiceUnitsError) {
		serviceUnitsError = newServiceUnitsError;
		serviceUnitsErrorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceUnitsError()
	 * @see #getServiceUnitsError()
	 * @see #setServiceUnitsError(float)
	 * @generated
	 */
	public void unsetServiceUnitsError() {
		serviceUnitsError = SERVICE_UNITS_ERROR_EDEFAULT;
		serviceUnitsErrorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Units Error</em>' attribute is set.
	 * @see #unsetServiceUnitsError()
	 * @see #getServiceUnitsError()
	 * @see #setServiceUnitsError(float)
	 * @generated
	 */
	public boolean isSetServiceUnitsError() {
		return serviceUnitsErrorESet;
	}

	/**
	 * Returns the value of the '<em><b>Vendor Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shift</em>' reference.
	 * @see #setVendorShift(VendorShift)
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getTransactions
	 * @generated
	 */
	public VendorShift getVendorShift() {
		if (vendorShift != null && vendorShift.eIsProxy()) {
			InternalEObject oldVendorShift = (InternalEObject)vendorShift;
			vendorShift = (VendorShift)eResolveProxy(oldVendorShift);
			if (vendorShift != oldVendorShift) {
			}
		}
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift basicGetVendorShift() {
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorShift(VendorShift newVendorShift, NotificationChain msgs) {
		VendorShift oldVendorShift = vendorShift;
		vendorShift = newVendorShift;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Shift</em>' reference.
	 * @see #getVendorShift()
	 * @generated
	 */
	public void setVendorShift(VendorShift newVendorShift) {
		if (newVendorShift != vendorShift) {
			NotificationChain msgs = null;
			if (vendorShift != null)
				msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs);
			if (newVendorShift != null)
				msgs = ((InternalEObject)newVendorShift).eInverseAdd(this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs);
			msgs = basicSetVendorShift(newVendorShift, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Receipt#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(Receipt)
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getTransactions
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
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}' reference.
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
				msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs);
			if (newReceipt != null)
				msgs = ((InternalEObject)newReceipt).eInverseAdd(this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs);
			msgs = basicSetReceipt(newReceipt, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Diverse Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diverse Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diverse Reference</em>' attribute.
	 * @see #isSetDiverseReference()
	 * @see #unsetDiverseReference()
	 * @see #setDiverseReference(String)
	 * @generated
	 */
	public String getDiverseReference() {
		return diverseReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diverse Reference</em>' attribute.
	 * @see #isSetDiverseReference()
	 * @see #unsetDiverseReference()
	 * @see #getDiverseReference()
	 * @generated
	 */
	public void setDiverseReference(String newDiverseReference) {
		diverseReference = newDiverseReference;
		diverseReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiverseReference()
	 * @see #getDiverseReference()
	 * @see #setDiverseReference(String)
	 * @generated
	 */
	public void unsetDiverseReference() {
		diverseReference = DIVERSE_REFERENCE_EDEFAULT;
		diverseReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diverse Reference</em>' attribute is set.
	 * @see #unsetDiverseReference()
	 * @see #getDiverseReference()
	 * @see #setDiverseReference(String)
	 * @generated
	 */
	public boolean isSetDiverseReference() {
		return diverseReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Units Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Units Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Units Energy</em>' attribute.
	 * @see #isSetServiceUnitsEnergy()
	 * @see #unsetServiceUnitsEnergy()
	 * @see #setServiceUnitsEnergy(float)
	 * @generated
	 */
	public float getServiceUnitsEnergy() {
		return serviceUnitsEnergy;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Units Energy</em>' attribute.
	 * @see #isSetServiceUnitsEnergy()
	 * @see #unsetServiceUnitsEnergy()
	 * @see #getServiceUnitsEnergy()
	 * @generated
	 */
	public void setServiceUnitsEnergy(float newServiceUnitsEnergy) {
		serviceUnitsEnergy = newServiceUnitsEnergy;
		serviceUnitsEnergyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceUnitsEnergy()
	 * @see #getServiceUnitsEnergy()
	 * @see #setServiceUnitsEnergy(float)
	 * @generated
	 */
	public void unsetServiceUnitsEnergy() {
		serviceUnitsEnergy = SERVICE_UNITS_ENERGY_EDEFAULT;
		serviceUnitsEnergyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Units Energy</em>' attribute is set.
	 * @see #unsetServiceUnitsEnergy()
	 * @see #getServiceUnitsEnergy()
	 * @see #setServiceUnitsEnergy(float)
	 * @generated
	 */
	public boolean isSetServiceUnitsEnergy() {
		return serviceUnitsEnergyESet;
	}

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Meter#getVendingTransactions <em>Vending Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(Meter)
	 * @see CIM15.IEC61968.Metering.Meter#getVendingTransactions
	 * @generated
	 */
	public Meter getMeter() {
		if (meter != null && meter.eIsProxy()) {
			InternalEObject oldMeter = (InternalEObject)meter;
			meter = (Meter)eResolveProxy(oldMeter);
			if (meter != oldMeter) {
			}
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter basicGetMeter() {
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeter(Meter newMeter, NotificationChain msgs) {
		Meter oldMeter = meter;
		meter = newMeter;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	public void setMeter(Meter newMeter) {
		if (newMeter != meter) {
			NotificationChain msgs = null;
			if (meter != null)
				msgs = ((InternalEObject)meter).eInverseRemove(this, MeteringPackage.METER__VENDING_TRANSACTIONS, Meter.class, msgs);
			if (newMeter != null)
				msgs = ((InternalEObject)newMeter).eInverseAdd(this, MeteringPackage.METER__VENDING_TRANSACTIONS, Meter.class, msgs);
			msgs = basicSetMeter(newMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Reversed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reversed Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversed Id</em>' attribute.
	 * @see #isSetReversedId()
	 * @see #unsetReversedId()
	 * @see #setReversedId(String)
	 * @generated
	 */
	public String getReversedId() {
		return reversedId;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversed Id</em>' attribute.
	 * @see #isSetReversedId()
	 * @see #unsetReversedId()
	 * @see #getReversedId()
	 * @generated
	 */
	public void setReversedId(String newReversedId) {
		reversedId = newReversedId;
		reversedIdESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReversedId()
	 * @see #getReversedId()
	 * @see #setReversedId(String)
	 * @generated
	 */
	public void unsetReversedId() {
		reversedId = REVERSED_ID_EDEFAULT;
		reversedIdESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reversed Id</em>' attribute is set.
	 * @see #unsetReversedId()
	 * @see #getReversedId()
	 * @see #setReversedId(String)
	 * @generated
	 */
	public boolean isSetReversedId() {
		return reversedIdESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM15.IEC61968.Customers.CustomerAccount#getPaymentTransactions
	 * @generated
	 */
	public CustomerAccount getCustomerAccount() {
		if (customerAccount != null && customerAccount.eIsProxy()) {
			InternalEObject oldCustomerAccount = (InternalEObject)customerAccount;
			customerAccount = (CustomerAccount)eResolveProxy(oldCustomerAccount);
			if (customerAccount != oldCustomerAccount) {
			}
		}
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount basicGetCustomerAccount() {
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAccount(CustomerAccount newCustomerAccount, NotificationChain msgs) {
		CustomerAccount oldCustomerAccount = customerAccount;
		customerAccount = newCustomerAccount;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	public void setCustomerAccount(CustomerAccount newCustomerAccount) {
		if (newCustomerAccount != customerAccount) {
			NotificationChain msgs = null;
			if (customerAccount != null)
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cashier Shift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shift</em>' reference.
	 * @see #setCashierShift(CashierShift)
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getTransactions
	 * @generated
	 */
	public CashierShift getCashierShift() {
		if (cashierShift != null && cashierShift.eIsProxy()) {
			InternalEObject oldCashierShift = (InternalEObject)cashierShift;
			cashierShift = (CashierShift)eResolveProxy(oldCashierShift);
			if (cashierShift != oldCashierShift) {
			}
		}
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift basicGetCashierShift() {
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashierShift(CashierShift newCashierShift, NotificationChain msgs) {
		CashierShift oldCashierShift = cashierShift;
		cashierShift = newCashierShift;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier Shift</em>' reference.
	 * @see #getCashierShift()
	 * @generated
	 */
	public void setCashierShift(CashierShift newCashierShift) {
		if (newCashierShift != cashierShift) {
			NotificationChain msgs = null;
			if (cashierShift != null)
				msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs);
			if (newCashierShift != null)
				msgs = ((InternalEObject)newCashierShift).eInverseAdd(this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs);
			msgs = basicSetCashierShift(newCashierShift, msgs);
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
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				if (pricingStructure != null)
					msgs = ((InternalEObject)pricingStructure).eInverseRemove(this, CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS, PricingStructure.class, msgs);
				return basicSetPricingStructure((PricingStructure)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				if (auxiliaryAccount != null)
					msgs = ((InternalEObject)auxiliaryAccount).eInverseRemove(this, PaymentMeteringPackage.AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS, AuxiliaryAccount.class, msgs);
				return basicSetAuxiliaryAccount((AuxiliaryAccount)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				if (vendorShift != null)
					msgs = ((InternalEObject)vendorShift).eInverseRemove(this, PaymentMeteringPackage.VENDOR_SHIFT__TRANSACTIONS, VendorShift.class, msgs);
				return basicSetVendorShift((VendorShift)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				if (receipt != null)
					msgs = ((InternalEObject)receipt).eInverseRemove(this, PaymentMeteringPackage.RECEIPT__TRANSACTIONS, Receipt.class, msgs);
				return basicSetReceipt((Receipt)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__METER:
				if (meter != null)
					msgs = ((InternalEObject)meter).eInverseRemove(this, MeteringPackage.METER__VENDING_TRANSACTIONS, Meter.class, msgs);
				return basicSetMeter((Meter)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				if (cashierShift != null)
					msgs = ((InternalEObject)cashierShift).eInverseRemove(this, PaymentMeteringPackage.CASHIER_SHIFT__TRANSACTIONS, CashierShift.class, msgs);
				return basicSetCashierShift((CashierShift)otherEnd, msgs);
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
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				return basicSetPricingStructure(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__LINE:
				return basicSetLine(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				return basicSetAuxiliaryAccount(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				return basicSetVendorShift(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				return basicSetReceipt(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__METER:
				return basicSetMeter(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				return basicSetCashierShift(null, msgs);
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
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				if (resolve) return getPricingStructure();
				return basicGetPricingStructure();
			case PaymentMeteringPackage.TRANSACTION__LINE:
				return getLine();
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				return getDonorReference();
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return getUserAttributes();
			case PaymentMeteringPackage.TRANSACTION__KIND:
				return getKind();
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				return getReceiverReference();
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				if (resolve) return getAuxiliaryAccount();
				return basicGetAuxiliaryAccount();
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				return getServiceUnitsError();
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				if (resolve) return getVendorShift();
				return basicGetVendorShift();
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				if (resolve) return getReceipt();
				return basicGetReceipt();
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				return getDiverseReference();
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				return getServiceUnitsEnergy();
			case PaymentMeteringPackage.TRANSACTION__METER:
				if (resolve) return getMeter();
				return basicGetMeter();
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				return getReversedId();
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				if (resolve) return getCashierShift();
				return basicGetCashierShift();
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
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__LINE:
				setLine((LineDetail)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				setDonorReference((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__KIND:
				setKind((TransactionKind)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				setReceiverReference((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				setAuxiliaryAccount((AuxiliaryAccount)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				setServiceUnitsError((Float)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				setVendorShift((VendorShift)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				setReceipt((Receipt)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				setDiverseReference((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				setServiceUnitsEnergy((Float)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__METER:
				setMeter((Meter)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				setReversedId((String)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				setCashierShift((CashierShift)newValue);
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
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				setPricingStructure((PricingStructure)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__LINE:
				setLine((LineDetail)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				unsetDonorReference();
				return;
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case PaymentMeteringPackage.TRANSACTION__KIND:
				unsetKind();
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				unsetReceiverReference();
				return;
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				setAuxiliaryAccount((AuxiliaryAccount)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				unsetServiceUnitsError();
				return;
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				setVendorShift((VendorShift)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				setReceipt((Receipt)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				unsetDiverseReference();
				return;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				unsetServiceUnitsEnergy();
				return;
			case PaymentMeteringPackage.TRANSACTION__METER:
				setMeter((Meter)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				unsetReversedId();
				return;
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				setCashierShift((CashierShift)null);
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
			case PaymentMeteringPackage.TRANSACTION__PRICING_STRUCTURE:
				return pricingStructure != null;
			case PaymentMeteringPackage.TRANSACTION__LINE:
				return line != null;
			case PaymentMeteringPackage.TRANSACTION__DONOR_REFERENCE:
				return isSetDonorReference();
			case PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case PaymentMeteringPackage.TRANSACTION__KIND:
				return isSetKind();
			case PaymentMeteringPackage.TRANSACTION__RECEIVER_REFERENCE:
				return isSetReceiverReference();
			case PaymentMeteringPackage.TRANSACTION__AUXILIARY_ACCOUNT:
				return auxiliaryAccount != null;
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ERROR:
				return isSetServiceUnitsError();
			case PaymentMeteringPackage.TRANSACTION__VENDOR_SHIFT:
				return vendorShift != null;
			case PaymentMeteringPackage.TRANSACTION__RECEIPT:
				return receipt != null;
			case PaymentMeteringPackage.TRANSACTION__DIVERSE_REFERENCE:
				return isSetDiverseReference();
			case PaymentMeteringPackage.TRANSACTION__SERVICE_UNITS_ENERGY:
				return isSetServiceUnitsEnergy();
			case PaymentMeteringPackage.TRANSACTION__METER:
				return meter != null;
			case PaymentMeteringPackage.TRANSACTION__REVERSED_ID:
				return isSetReversedId();
			case PaymentMeteringPackage.TRANSACTION__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case PaymentMeteringPackage.TRANSACTION__CASHIER_SHIFT:
				return cashierShift != null;
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
		result.append(" (donorReference: ");
		if (donorReferenceESet) result.append(donorReference); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", receiverReference: ");
		if (receiverReferenceESet) result.append(receiverReference); else result.append("<unset>");
		result.append(", serviceUnitsError: ");
		if (serviceUnitsErrorESet) result.append(serviceUnitsError); else result.append("<unset>");
		result.append(", diverseReference: ");
		if (diverseReferenceESet) result.append(diverseReference); else result.append("<unset>");
		result.append(", serviceUnitsEnergy: ");
		if (serviceUnitsEnergyESet) result.append(serviceUnitsEnergy); else result.append("<unset>");
		result.append(", reversedId: ");
		if (reversedIdESet) result.append(reversedId); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Transaction
