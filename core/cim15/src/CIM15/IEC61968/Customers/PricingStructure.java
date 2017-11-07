/**
 */
package CIM15.IEC61968.Customers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Metering.ServiceDeliveryPoint;

import CIM15.IEC61968.PaymentMetering.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PricingStructure extends Document {
	/**
	 * The default value of the '{@link #getDailyFloorUsage() <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyFloorUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_FLOOR_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyFloorUsage() <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyFloorUsage()
	 * @generated
	 * @ordered
	 */
	protected int dailyFloorUsage = DAILY_FLOOR_USAGE_EDEFAULT;

	/**
	 * This is true if the Daily Floor Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dailyFloorUsageESet;

	/**
	 * The default value of the '{@link #getDailyCeilingUsage() <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyCeilingUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_CEILING_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyCeilingUsage() <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyCeilingUsage()
	 * @generated
	 * @ordered
	 */
	protected int dailyCeilingUsage = DAILY_CEILING_USAGE_EDEFAULT;

	/**
	 * This is true if the Daily Ceiling Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dailyCeilingUsageESet;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected ServiceCategory serviceCategory;

	/**
	 * The default value of the '{@link #isTaxExemption() <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxExemption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAX_EXEMPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaxExemption() <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxExemption()
	 * @generated
	 * @ordered
	 */
	protected boolean taxExemption = TAX_EXEMPTION_EDEFAULT;

	/**
	 * This is true if the Tax Exemption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taxExemptionESet;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

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
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tariff> tariffs;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transactions;

	/**
	 * The default value of the '{@link #getDailyEstimatedUsage() <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyEstimatedUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int DAILY_ESTIMATED_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDailyEstimatedUsage() <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyEstimatedUsage()
	 * @generated
	 * @ordered
	 */
	protected int dailyEstimatedUsage = DAILY_ESTIMATED_USAGE_EDEFAULT;

	/**
	 * This is true if the Daily Estimated Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dailyEstimatedUsageESet;

	/**
	 * The default value of the '{@link #getRevenueKind() <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenueKind()
	 * @generated
	 * @ordered
	 */
	protected static final RevenueKind REVENUE_KIND_EDEFAULT = RevenueKind.IRRIGATION;

	/**
	 * The cached value of the '{@link #getRevenueKind() <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenueKind()
	 * @generated
	 * @ordered
	 */
	protected RevenueKind revenueKind = REVENUE_KIND_EDEFAULT;

	/**
	 * This is true if the Revenue Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revenueKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingStructure() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.PRICING_STRUCTURE;
	}

	/**
	 * Returns the value of the '<em><b>Daily Floor Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Floor Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Floor Usage</em>' attribute.
	 * @see #isSetDailyFloorUsage()
	 * @see #unsetDailyFloorUsage()
	 * @see #setDailyFloorUsage(int)
	 * @generated
	 */
	public int getDailyFloorUsage() {
		return dailyFloorUsage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Floor Usage</em>' attribute.
	 * @see #isSetDailyFloorUsage()
	 * @see #unsetDailyFloorUsage()
	 * @see #getDailyFloorUsage()
	 * @generated
	 */
	public void setDailyFloorUsage(int newDailyFloorUsage) {
		dailyFloorUsage = newDailyFloorUsage;
		dailyFloorUsageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDailyFloorUsage()
	 * @see #getDailyFloorUsage()
	 * @see #setDailyFloorUsage(int)
	 * @generated
	 */
	public void unsetDailyFloorUsage() {
		dailyFloorUsage = DAILY_FLOOR_USAGE_EDEFAULT;
		dailyFloorUsageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyFloorUsage <em>Daily Floor Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daily Floor Usage</em>' attribute is set.
	 * @see #unsetDailyFloorUsage()
	 * @see #getDailyFloorUsage()
	 * @see #setDailyFloorUsage(int)
	 * @generated
	 */
	public boolean isSetDailyFloorUsage() {
		return dailyFloorUsageESet;
	}

	/**
	 * Returns the value of the '<em><b>Daily Ceiling Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Ceiling Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Ceiling Usage</em>' attribute.
	 * @see #isSetDailyCeilingUsage()
	 * @see #unsetDailyCeilingUsage()
	 * @see #setDailyCeilingUsage(int)
	 * @generated
	 */
	public int getDailyCeilingUsage() {
		return dailyCeilingUsage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Ceiling Usage</em>' attribute.
	 * @see #isSetDailyCeilingUsage()
	 * @see #unsetDailyCeilingUsage()
	 * @see #getDailyCeilingUsage()
	 * @generated
	 */
	public void setDailyCeilingUsage(int newDailyCeilingUsage) {
		dailyCeilingUsage = newDailyCeilingUsage;
		dailyCeilingUsageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDailyCeilingUsage()
	 * @see #getDailyCeilingUsage()
	 * @see #setDailyCeilingUsage(int)
	 * @generated
	 */
	public void unsetDailyCeilingUsage() {
		dailyCeilingUsage = DAILY_CEILING_USAGE_EDEFAULT;
		dailyCeilingUsageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyCeilingUsage <em>Daily Ceiling Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daily Ceiling Usage</em>' attribute is set.
	 * @see #unsetDailyCeilingUsage()
	 * @see #getDailyCeilingUsage()
	 * @see #setDailyCeilingUsage(int)
	 * @generated
	 */
	public boolean isSetDailyCeilingUsage() {
		return dailyCeilingUsageESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.ServiceCategory#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see CIM15.IEC61968.Customers.ServiceCategory#getPricingStructures
	 * @generated
	 */
	public ServiceCategory getServiceCategory() {
		if (serviceCategory != null && serviceCategory.eIsProxy()) {
			InternalEObject oldServiceCategory = (InternalEObject)serviceCategory;
			serviceCategory = (ServiceCategory)eResolveProxy(oldServiceCategory);
			if (serviceCategory != oldServiceCategory) {
			}
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory basicGetServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(ServiceCategory newServiceCategory, NotificationChain msgs) {
		ServiceCategory oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getServiceCategory <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	public void setServiceCategory(ServiceCategory newServiceCategory) {
		if (newServiceCategory != serviceCategory) {
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Tax Exemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exemption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exemption</em>' attribute.
	 * @see #isSetTaxExemption()
	 * @see #unsetTaxExemption()
	 * @see #setTaxExemption(boolean)
	 * @generated
	 */
	public boolean isTaxExemption() {
		return taxExemption;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exemption</em>' attribute.
	 * @see #isSetTaxExemption()
	 * @see #unsetTaxExemption()
	 * @see #isTaxExemption()
	 * @generated
	 */
	public void setTaxExemption(boolean newTaxExemption) {
		taxExemption = newTaxExemption;
		taxExemptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaxExemption()
	 * @see #isTaxExemption()
	 * @see #setTaxExemption(boolean)
	 * @generated
	 */
	public void unsetTaxExemption() {
		taxExemption = TAX_EXEMPTION_EDEFAULT;
		taxExemptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#isTaxExemption <em>Tax Exemption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tax Exemption</em>' attribute is set.
	 * @see #unsetTaxExemption()
	 * @see #isTaxExemption()
	 * @see #setTaxExemption(boolean)
	 * @generated
	 */
	public boolean isSetTaxExemption() {
		return taxExemptionESet;
	}

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
		codeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public void unsetCode() {
		code = CODE_EDEFAULT;
		codeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getPricingStructures
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Tariffs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.Tariff}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Tariff#getPricingStructures <em>Pricing Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariffs</em>' reference list.
	 * @see CIM15.IEC61968.Customers.Tariff#getPricingStructures
	 * @generated
	 */
	public EList<Tariff> getTariffs() {
		if (tariffs == null) {
			tariffs = new BasicInternalEList<Tariff>(Tariff.class);
		}
		return tariffs;
	}

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getPricingStructure
	 * @generated
	 */
	public EList<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new BasicInternalEList<Transaction>(Transaction.class);
		}
		return transactions;
	}

	/**
	 * Returns the value of the '<em><b>Daily Estimated Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Estimated Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Estimated Usage</em>' attribute.
	 * @see #isSetDailyEstimatedUsage()
	 * @see #unsetDailyEstimatedUsage()
	 * @see #setDailyEstimatedUsage(int)
	 * @generated
	 */
	public int getDailyEstimatedUsage() {
		return dailyEstimatedUsage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Estimated Usage</em>' attribute.
	 * @see #isSetDailyEstimatedUsage()
	 * @see #unsetDailyEstimatedUsage()
	 * @see #getDailyEstimatedUsage()
	 * @generated
	 */
	public void setDailyEstimatedUsage(int newDailyEstimatedUsage) {
		dailyEstimatedUsage = newDailyEstimatedUsage;
		dailyEstimatedUsageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDailyEstimatedUsage()
	 * @see #getDailyEstimatedUsage()
	 * @see #setDailyEstimatedUsage(int)
	 * @generated
	 */
	public void unsetDailyEstimatedUsage() {
		dailyEstimatedUsage = DAILY_ESTIMATED_USAGE_EDEFAULT;
		dailyEstimatedUsageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getDailyEstimatedUsage <em>Daily Estimated Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daily Estimated Usage</em>' attribute is set.
	 * @see #unsetDailyEstimatedUsage()
	 * @see #getDailyEstimatedUsage()
	 * @see #setDailyEstimatedUsage(int)
	 * @generated
	 */
	public boolean isSetDailyEstimatedUsage() {
		return dailyEstimatedUsageESet;
	}

	/**
	 * Returns the value of the '<em><b>Revenue Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Customers.RevenueKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revenue Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue Kind</em>' attribute.
	 * @see CIM15.IEC61968.Customers.RevenueKind
	 * @see #isSetRevenueKind()
	 * @see #unsetRevenueKind()
	 * @see #setRevenueKind(RevenueKind)
	 * @generated
	 */
	public RevenueKind getRevenueKind() {
		return revenueKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue Kind</em>' attribute.
	 * @see CIM15.IEC61968.Customers.RevenueKind
	 * @see #isSetRevenueKind()
	 * @see #unsetRevenueKind()
	 * @see #getRevenueKind()
	 * @generated
	 */
	public void setRevenueKind(RevenueKind newRevenueKind) {
		revenueKind = newRevenueKind == null ? REVENUE_KIND_EDEFAULT : newRevenueKind;
		revenueKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevenueKind()
	 * @see #getRevenueKind()
	 * @see #setRevenueKind(RevenueKind)
	 * @generated
	 */
	public void unsetRevenueKind() {
		revenueKind = REVENUE_KIND_EDEFAULT;
		revenueKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.PricingStructure#getRevenueKind <em>Revenue Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revenue Kind</em>' attribute is set.
	 * @see #unsetRevenueKind()
	 * @see #getRevenueKind()
	 * @see #setRevenueKind(RevenueKind)
	 * @generated
	 */
	public boolean isSetRevenueKind() {
		return revenueKindESet;
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
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				if (serviceCategory != null)
					msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, ServiceCategory.class, msgs);
				return basicSetServiceCategory((ServiceCategory)otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffs()).basicAdd(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactions()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return ((InternalEList<?>)getTariffs()).basicRemove(otherEnd, msgs);
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				return getDailyFloorUsage();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				return getDailyCeilingUsage();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				return isTaxExemption();
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				return getCode();
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return getTariffs();
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return getTransactions();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				return getDailyEstimatedUsage();
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				return getRevenueKind();
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
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				setDailyFloorUsage((Integer)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				setDailyCeilingUsage((Integer)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				setTaxExemption((Boolean)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				setCode((String)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				getTariffs().clear();
				getTariffs().addAll((Collection<? extends Tariff>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				setDailyEstimatedUsage((Integer)newValue);
				return;
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				setRevenueKind((RevenueKind)newValue);
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
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				unsetDailyFloorUsage();
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				unsetDailyCeilingUsage();
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				unsetTaxExemption();
				return;
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				unsetCode();
				return;
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				getTariffs().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				getTransactions().clear();
				return;
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				unsetDailyEstimatedUsage();
				return;
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				unsetRevenueKind();
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
			case CustomersPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
				return isSetDailyFloorUsage();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
				return isSetDailyCeilingUsage();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY:
				return serviceCategory != null;
			case CustomersPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
				return isSetTaxExemption();
			case CustomersPackage.PRICING_STRUCTURE__CODE:
				return isSetCode();
			case CustomersPackage.PRICING_STRUCTURE__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__TARIFFS:
				return tariffs != null && !tariffs.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case CustomersPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
				return isSetDailyEstimatedUsage();
			case CustomersPackage.PRICING_STRUCTURE__REVENUE_KIND:
				return isSetRevenueKind();
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
		result.append(" (dailyFloorUsage: ");
		if (dailyFloorUsageESet) result.append(dailyFloorUsage); else result.append("<unset>");
		result.append(", dailyCeilingUsage: ");
		if (dailyCeilingUsageESet) result.append(dailyCeilingUsage); else result.append("<unset>");
		result.append(", taxExemption: ");
		if (taxExemptionESet) result.append(taxExemption); else result.append("<unset>");
		result.append(", code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", dailyEstimatedUsage: ");
		if (dailyEstimatedUsageESet) result.append(dailyEstimatedUsage); else result.append("<unset>");
		result.append(", revenueKind: ");
		if (revenueKindESet) result.append(revenueKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PricingStructure
