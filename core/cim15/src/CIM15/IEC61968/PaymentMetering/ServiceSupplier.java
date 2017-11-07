/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.Organisation;

import CIM15.IEC61968.Customers.CustomerAgreement;

import CIM15.IEC61968.Metering.ServiceDeliveryPoint;

import CIM15.IEC61970.Informative.InfCommon.BankAccount;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts <em>Bank Accounts</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceSupplier extends Organisation {
	/**
	 * The cached value of the '{@link #getBankAccounts() <em>Bank Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<BankAccount> bankAccounts;

	/**
	 * The default value of the '{@link #getIssuerIdentificationNumber() <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerIdentificationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_IDENTIFICATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerIdentificationNumber() <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerIdentificationNumber()
	 * @generated
	 * @ordered
	 */
	protected String issuerIdentificationNumber = ISSUER_IDENTIFICATION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Issuer Identification Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issuerIdentificationNumberESet;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SupplierKind KIND_EDEFAULT = SupplierKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SupplierKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSupplier() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.SERVICE_SUPPLIER;
	}

	/**
	 * Returns the value of the '<em><b>Bank Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.BankAccount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Accounts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier
	 * @generated
	 */
	public EList<BankAccount> getBankAccounts() {
		if (bankAccounts == null) {
			bankAccounts = new BasicInternalEList<BankAccount>(BankAccount.class);
		}
		return bankAccounts;
	}

	/**
	 * Returns the value of the '<em><b>Issuer Identification Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer Identification Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Identification Number</em>' attribute.
	 * @see #isSetIssuerIdentificationNumber()
	 * @see #unsetIssuerIdentificationNumber()
	 * @see #setIssuerIdentificationNumber(String)
	 * @generated
	 */
	public String getIssuerIdentificationNumber() {
		return issuerIdentificationNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Identification Number</em>' attribute.
	 * @see #isSetIssuerIdentificationNumber()
	 * @see #unsetIssuerIdentificationNumber()
	 * @see #getIssuerIdentificationNumber()
	 * @generated
	 */
	public void setIssuerIdentificationNumber(String newIssuerIdentificationNumber) {
		issuerIdentificationNumber = newIssuerIdentificationNumber;
		issuerIdentificationNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuerIdentificationNumber()
	 * @see #getIssuerIdentificationNumber()
	 * @see #setIssuerIdentificationNumber(String)
	 * @generated
	 */
	public void unsetIssuerIdentificationNumber() {
		issuerIdentificationNumber = ISSUER_IDENTIFICATION_NUMBER_EDEFAULT;
		issuerIdentificationNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issuer Identification Number</em>' attribute is set.
	 * @see #unsetIssuerIdentificationNumber()
	 * @see #getIssuerIdentificationNumber()
	 * @see #setIssuerIdentificationNumber(String)
	 * @generated
	 */
	public boolean isSetIssuerIdentificationNumber() {
		return issuerIdentificationNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.PaymentMetering.SupplierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.SupplierKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(SupplierKind)
	 * @generated
	 */
	public SupplierKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.SupplierKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(SupplierKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(SupplierKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(SupplierKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getServiceSupplier
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankAccounts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return ((InternalEList<?>)getBankAccounts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return getBankAccounts();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				return getIssuerIdentificationNumber();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				return getKind();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				getBankAccounts().clear();
				getBankAccounts().addAll((Collection<? extends BankAccount>)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				setIssuerIdentificationNumber((String)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				setKind((SupplierKind)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				getBankAccounts().clear();
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				unsetIssuerIdentificationNumber();
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				unsetKind();
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return bankAccounts != null && !bankAccounts.isEmpty();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				return isSetIssuerIdentificationNumber();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				return isSetKind();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
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
		result.append(" (issuerIdentificationNumber: ");
		if (issuerIdentificationNumberESet) result.append(issuerIdentificationNumber); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ServiceSupplier
