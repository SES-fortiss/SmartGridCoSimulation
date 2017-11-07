/**
 */
package CIM15.IEC61968.Customers;

import CIM15.IEC61968.Common.Agreement;

import CIM15.IEC61968.Metering.DemandResponseProgram;
import CIM15.IEC61968.Metering.EndDeviceControl;
import CIM15.IEC61968.Metering.MeterReading;
import CIM15.IEC61968.Metering.MeteringPackage;
import CIM15.IEC61968.Metering.ServiceDeliveryPoint;

import CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement;
import CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM15.IEC61968.PaymentMetering.ServiceSupplier;

import CIM15.IEC61970.Core.Equipment;

import CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM15.IEC61970.Informative.InfCustomers.StandardIndustryCode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode <em>Standard Industry Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAgreement#getEndDeviceControls <em>End Device Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerAgreement extends Agreement {
	/**
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

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
	 * The default value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingCycle() <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingCycle()
	 * @generated
	 * @ordered
	 */
	protected String billingCycle = BILLING_CYCLE_EDEFAULT;

	/**
	 * This is true if the Billing Cycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean billingCycleESet;

	/**
	 * The default value of the '{@link #getLoadMgmt() <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmt()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_MGMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadMgmt() <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmt()
	 * @generated
	 * @ordered
	 */
	protected String loadMgmt = LOAD_MGMT_EDEFAULT;

	/**
	 * This is true if the Load Mgmt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loadMgmtESet;

	/**
	 * The default value of the '{@link #getBudgetBill() <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetBill()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_BILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetBill() <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetBill()
	 * @generated
	 * @ordered
	 */
	protected String budgetBill = BUDGET_BILL_EDEFAULT;

	/**
	 * This is true if the Budget Bill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean budgetBillESet;

	/**
	 * The cached value of the '{@link #getStandardIndustryCode() <em>Standard Industry Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardIndustryCode()
	 * @generated
	 * @ordered
	 */
	protected StandardIndustryCode standardIndustryCode;

	/**
	 * The cached value of the '{@link #getAuxiliaryAgreements() <em>Auxiliary Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryAgreement> auxiliaryAgreements;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipment> equipments;

	/**
	 * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSupplier()
	 * @generated
	 * @ordered
	 */
	protected ServiceSupplier serviceSupplier;

	/**
	 * The cached value of the '{@link #getServiceLocations() <em>Service Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLocation> serviceLocations;

	/**
	 * The cached value of the '{@link #getDemandResponseProgram() <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandResponseProgram()
	 * @generated
	 * @ordered
	 */
	protected DemandResponseProgram demandResponseProgram;

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
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAgreement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMER_AGREEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see CIM15.IEC61968.Customers.PricingStructure#getCustomerAgreements
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new BasicInternalEList<PricingStructure>(PricingStructure.class);
		}
		return pricingStructures;
	}

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM15.IEC61968.Customers.CustomerAccount#getCustomerAgreements
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
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}' reference.
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
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Billing Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Cycle</em>' attribute.
	 * @see #isSetBillingCycle()
	 * @see #unsetBillingCycle()
	 * @see #setBillingCycle(String)
	 * @generated
	 */
	public String getBillingCycle() {
		return billingCycle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Cycle</em>' attribute.
	 * @see #isSetBillingCycle()
	 * @see #unsetBillingCycle()
	 * @see #getBillingCycle()
	 * @generated
	 */
	public void setBillingCycle(String newBillingCycle) {
		billingCycle = newBillingCycle;
		billingCycleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBillingCycle()
	 * @see #getBillingCycle()
	 * @see #setBillingCycle(String)
	 * @generated
	 */
	public void unsetBillingCycle() {
		billingCycle = BILLING_CYCLE_EDEFAULT;
		billingCycleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getBillingCycle <em>Billing Cycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Billing Cycle</em>' attribute is set.
	 * @see #unsetBillingCycle()
	 * @see #getBillingCycle()
	 * @see #setBillingCycle(String)
	 * @generated
	 */
	public boolean isSetBillingCycle() {
		return billingCycleESet;
	}

	/**
	 * Returns the value of the '<em><b>Load Mgmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt</em>' attribute.
	 * @see #isSetLoadMgmt()
	 * @see #unsetLoadMgmt()
	 * @see #setLoadMgmt(String)
	 * @generated
	 */
	public String getLoadMgmt() {
		return loadMgmt;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Mgmt</em>' attribute.
	 * @see #isSetLoadMgmt()
	 * @see #unsetLoadMgmt()
	 * @see #getLoadMgmt()
	 * @generated
	 */
	public void setLoadMgmt(String newLoadMgmt) {
		loadMgmt = newLoadMgmt;
		loadMgmtESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadMgmt()
	 * @see #getLoadMgmt()
	 * @see #setLoadMgmt(String)
	 * @generated
	 */
	public void unsetLoadMgmt() {
		loadMgmt = LOAD_MGMT_EDEFAULT;
		loadMgmtESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getLoadMgmt <em>Load Mgmt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Mgmt</em>' attribute is set.
	 * @see #unsetLoadMgmt()
	 * @see #getLoadMgmt()
	 * @see #setLoadMgmt(String)
	 * @generated
	 */
	public boolean isSetLoadMgmt() {
		return loadMgmtESet;
	}

	/**
	 * Returns the value of the '<em><b>Budget Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Bill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Bill</em>' attribute.
	 * @see #isSetBudgetBill()
	 * @see #unsetBudgetBill()
	 * @see #setBudgetBill(String)
	 * @generated
	 */
	public String getBudgetBill() {
		return budgetBill;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Bill</em>' attribute.
	 * @see #isSetBudgetBill()
	 * @see #unsetBudgetBill()
	 * @see #getBudgetBill()
	 * @generated
	 */
	public void setBudgetBill(String newBudgetBill) {
		budgetBill = newBudgetBill;
		budgetBillESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBudgetBill()
	 * @see #getBudgetBill()
	 * @see #setBudgetBill(String)
	 * @generated
	 */
	public void unsetBudgetBill() {
		budgetBill = BUDGET_BILL_EDEFAULT;
		budgetBillESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getBudgetBill <em>Budget Bill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Budget Bill</em>' attribute is set.
	 * @see #unsetBudgetBill()
	 * @see #getBudgetBill()
	 * @see #setBudgetBill(String)
	 * @generated
	 */
	public boolean isSetBudgetBill() {
		return budgetBillESet;
	}

	/**
	 * Returns the value of the '<em><b>Standard Industry Code</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Industry Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Industry Code</em>' reference.
	 * @see #setStandardIndustryCode(StandardIndustryCode)
	 * @see CIM15.IEC61970.Informative.InfCustomers.StandardIndustryCode#getCustomerAgreements
	 * @generated
	 */
	public StandardIndustryCode getStandardIndustryCode() {
		if (standardIndustryCode != null && standardIndustryCode.eIsProxy()) {
			InternalEObject oldStandardIndustryCode = (InternalEObject)standardIndustryCode;
			standardIndustryCode = (StandardIndustryCode)eResolveProxy(oldStandardIndustryCode);
			if (standardIndustryCode != oldStandardIndustryCode) {
			}
		}
		return standardIndustryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardIndustryCode basicGetStandardIndustryCode() {
		return standardIndustryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardIndustryCode(StandardIndustryCode newStandardIndustryCode, NotificationChain msgs) {
		StandardIndustryCode oldStandardIndustryCode = standardIndustryCode;
		standardIndustryCode = newStandardIndustryCode;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getStandardIndustryCode <em>Standard Industry Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Industry Code</em>' reference.
	 * @see #getStandardIndustryCode()
	 * @generated
	 */
	public void setStandardIndustryCode(StandardIndustryCode newStandardIndustryCode) {
		if (newStandardIndustryCode != standardIndustryCode) {
			NotificationChain msgs = null;
			if (standardIndustryCode != null)
				msgs = ((InternalEObject)standardIndustryCode).eInverseRemove(this, InfCustomersPackage.STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS, StandardIndustryCode.class, msgs);
			if (newStandardIndustryCode != null)
				msgs = ((InternalEObject)newStandardIndustryCode).eInverseAdd(this, InfCustomersPackage.STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS, StandardIndustryCode.class, msgs);
			msgs = basicSetStandardIndustryCode(newStandardIndustryCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Agreements</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement
	 * @generated
	 */
	public EList<AuxiliaryAgreement> getAuxiliaryAgreements() {
		if (auxiliaryAgreements == null) {
			auxiliaryAgreements = new BasicInternalEList<AuxiliaryAgreement>(AuxiliaryAgreement.class);
		}
		return auxiliaryAgreements;
	}

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.MeterReading#getCustomerAgreement
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new BasicInternalEList<MeterReading>(MeterReading.class);
		}
		return meterReadings;
	}

	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Equipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Equipment#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' reference list.
	 * @see CIM15.IEC61970.Core.Equipment#getCustomerAgreements
	 * @generated
	 */
	public EList<Equipment> getEquipments() {
		if (equipments == null) {
			equipments = new BasicInternalEList<Equipment>(Equipment.class);
		}
		return equipments;
	}

	/**
	 * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Supplier</em>' reference.
	 * @see #setServiceSupplier(ServiceSupplier)
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements
	 * @generated
	 */
	public ServiceSupplier getServiceSupplier() {
		if (serviceSupplier != null && serviceSupplier.eIsProxy()) {
			InternalEObject oldServiceSupplier = (InternalEObject)serviceSupplier;
			serviceSupplier = (ServiceSupplier)eResolveProxy(oldServiceSupplier);
			if (serviceSupplier != oldServiceSupplier) {
			}
		}
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier basicGetServiceSupplier() {
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSupplier(ServiceSupplier newServiceSupplier, NotificationChain msgs) {
		ServiceSupplier oldServiceSupplier = serviceSupplier;
		serviceSupplier = newServiceSupplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceSupplier <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Supplier</em>' reference.
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public void setServiceSupplier(ServiceSupplier newServiceSupplier) {
		if (newServiceSupplier != serviceSupplier) {
			NotificationChain msgs = null;
			if (serviceSupplier != null)
				msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs);
			if (newServiceSupplier != null)
				msgs = ((InternalEObject)newServiceSupplier).eInverseAdd(this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs);
			msgs = basicSetServiceSupplier(newServiceSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Service Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.ServiceLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.ServiceLocation#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Locations</em>' reference list.
	 * @see CIM15.IEC61968.Customers.ServiceLocation#getCustomerAgreements
	 * @generated
	 */
	public EList<ServiceLocation> getServiceLocations() {
		if (serviceLocations == null) {
			serviceLocations = new BasicInternalEList<ServiceLocation>(ServiceLocation.class);
		}
		return serviceLocations;
	}

	/**
	 * Returns the value of the '<em><b>Demand Response Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response Program</em>' reference.
	 * @see #setDemandResponseProgram(DemandResponseProgram)
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements
	 * @generated
	 */
	public DemandResponseProgram getDemandResponseProgram() {
		if (demandResponseProgram != null && demandResponseProgram.eIsProxy()) {
			InternalEObject oldDemandResponseProgram = (InternalEObject)demandResponseProgram;
			demandResponseProgram = (DemandResponseProgram)eResolveProxy(oldDemandResponseProgram);
			if (demandResponseProgram != oldDemandResponseProgram) {
			}
		}
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram basicGetDemandResponseProgram() {
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandResponseProgram(DemandResponseProgram newDemandResponseProgram, NotificationChain msgs) {
		DemandResponseProgram oldDemandResponseProgram = demandResponseProgram;
		demandResponseProgram = newDemandResponseProgram;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Response Program</em>' reference.
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public void setDemandResponseProgram(DemandResponseProgram newDemandResponseProgram) {
		if (newDemandResponseProgram != demandResponseProgram) {
			NotificationChain msgs = null;
			if (demandResponseProgram != null)
				msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, DemandResponseProgram.class, msgs);
			if (newDemandResponseProgram != null)
				msgs = ((InternalEObject)newDemandResponseProgram).eInverseAdd(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, DemandResponseProgram.class, msgs);
			msgs = basicSetDemandResponseProgram(newDemandResponseProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see CIM15.IEC61968.Customers.Customer#getCustomerAgreements
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getCustomerAgreement
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new BasicInternalEList<EndDeviceControl>(EndDeviceControl.class);
		}
		return endDeviceControls;
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
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				if (standardIndustryCode != null)
					msgs = ((InternalEObject)standardIndustryCode).eInverseRemove(this, InfCustomersPackage.STANDARD_INDUSTRY_CODE__CUSTOMER_AGREEMENTS, StandardIndustryCode.class, msgs);
				return basicSetStandardIndustryCode((StandardIndustryCode)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipments()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				if (serviceSupplier != null)
					msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, ServiceSupplier.class, msgs);
				return basicSetServiceSupplier((ServiceSupplier)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceLocations()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				if (demandResponseProgram != null)
					msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, DemandResponseProgram.class, msgs);
				return basicSetDemandResponseProgram((DemandResponseProgram)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				return basicSetStandardIndustryCode(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return ((InternalEList<?>)getAuxiliaryAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return ((InternalEList<?>)getEquipments()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				return basicSetServiceSupplier(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return ((InternalEList<?>)getServiceLocations()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				return basicSetDemandResponseProgram(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return getPricingStructures();
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				return getBillingCycle();
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				return getLoadMgmt();
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				return getBudgetBill();
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				if (resolve) return getStandardIndustryCode();
				return basicGetStandardIndustryCode();
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return getAuxiliaryAgreements();
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return getMeterReadings();
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return getEquipments();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				if (resolve) return getServiceSupplier();
				return basicGetServiceSupplier();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return getServiceLocations();
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				if (resolve) return getDemandResponseProgram();
				return basicGetDemandResponseProgram();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
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
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				setBillingCycle((String)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				setLoadMgmt((String)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				setBudgetBill((String)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				setStandardIndustryCode((StandardIndustryCode)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				getAuxiliaryAgreements().clear();
				getAuxiliaryAgreements().addAll((Collection<? extends AuxiliaryAgreement>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				getEquipments().clear();
				getEquipments().addAll((Collection<? extends Equipment>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				getServiceLocations().clear();
				getServiceLocations().addAll((Collection<? extends ServiceLocation>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
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
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				unsetBillingCycle();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				unsetLoadMgmt();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				unsetBudgetBill();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				setStandardIndustryCode((StandardIndustryCode)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				getAuxiliaryAgreements().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				getMeterReadings().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				getEquipments().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				getServiceLocations().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
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
			case CustomersPackage.CUSTOMER_AGREEMENT__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__BILLING_CYCLE:
				return isSetBillingCycle();
			case CustomersPackage.CUSTOMER_AGREEMENT__LOAD_MGMT:
				return isSetLoadMgmt();
			case CustomersPackage.CUSTOMER_AGREEMENT__BUDGET_BILL:
				return isSetBudgetBill();
			case CustomersPackage.CUSTOMER_AGREEMENT__STANDARD_INDUSTRY_CODE:
				return standardIndustryCode != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS:
				return auxiliaryAgreements != null && !auxiliaryAgreements.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__EQUIPMENTS:
				return equipments != null && !equipments.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER:
				return serviceSupplier != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS:
				return serviceLocations != null && !serviceLocations.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM:
				return demandResponseProgram != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER:
				return customer != null;
			case CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
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
		result.append(" (billingCycle: ");
		if (billingCycleESet) result.append(billingCycle); else result.append("<unset>");
		result.append(", loadMgmt: ");
		if (loadMgmtESet) result.append(loadMgmt); else result.append("<unset>");
		result.append(", budgetBill: ");
		if (budgetBillESet) result.append(budgetBill); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CustomerAgreement
