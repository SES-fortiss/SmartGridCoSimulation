/**
 */
package CIM15.IEC61968.Customers;

import CIM15.IEC61968.Common.Organisation;
import CIM15.IEC61968.Common.Status;

import CIM15.IEC61968.Metering.EndDevice;

import CIM15.IEC61968.Work.Work;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM15.IEC61970.Informative.InfOperations.OutageNotification;
import CIM15.IEC61970.Informative.InfOperations.PlannedOutage;
import CIM15.IEC61970.Informative.InfOperations.TroubleTicket;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#isVip <em>Vip</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getOutageNotifications <em>Outage Notifications</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Customer#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Customer extends Organisation {
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
	 * The default value of the '{@link #isVip() <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVip() <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVip()
	 * @generated
	 * @ordered
	 */
	protected boolean vip = VIP_EDEFAULT;

	/**
	 * This is true if the Vip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vipESet;

	/**
	 * The cached value of the '{@link #getErpPersons() <em>Erp Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> erpPersons;

	/**
	 * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDevice> endDevices;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getPlannedOutage() <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedOutage()
	 * @generated
	 * @ordered
	 */
	protected PlannedOutage plannedOutage;

	/**
	 * The default value of the '{@link #getPucNumber() <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPucNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PUC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPucNumber() <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPucNumber()
	 * @generated
	 * @ordered
	 */
	protected String pucNumber = PUC_NUMBER_EDEFAULT;

	/**
	 * This is true if the Puc Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pucNumberESet;

	/**
	 * The cached value of the '{@link #getOutageNotifications() <em>Outage Notifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageNotification> outageNotifications;

	/**
	 * The default value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNeed()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_NEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNeed()
	 * @generated
	 * @ordered
	 */
	protected String specialNeed = SPECIAL_NEED_EDEFAULT;

	/**
	 * This is true if the Special Need attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialNeedESet;

	/**
	 * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroubleTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<TroubleTicket> troubleTickets;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CustomerKind KIND_EDEFAULT = CustomerKind.WIND_MACHINE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CustomerKind kind = KIND_EDEFAULT;

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
	protected Customer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMER;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getCustomer
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
	}

	/**
	 * Returns the value of the '<em><b>Vip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vip</em>' attribute.
	 * @see #isSetVip()
	 * @see #unsetVip()
	 * @see #setVip(boolean)
	 * @generated
	 */
	public boolean isVip() {
		return vip;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Customer#isVip <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vip</em>' attribute.
	 * @see #isSetVip()
	 * @see #unsetVip()
	 * @see #isVip()
	 * @generated
	 */
	public void setVip(boolean newVip) {
		vip = newVip;
		vipESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.Customer#isVip <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVip()
	 * @see #isVip()
	 * @see #setVip(boolean)
	 * @generated
	 */
	public void unsetVip() {
		vip = VIP_EDEFAULT;
		vipESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.Customer#isVip <em>Vip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vip</em>' attribute is set.
	 * @see #unsetVip()
	 * @see #isVip()
	 * @see #setVip(boolean)
	 * @generated
	 */
	public boolean isSetVip() {
		return vipESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new BasicInternalEList<ErpPerson>(ErpPerson.class);
		}
		return erpPersons;
	}

	/**
	 * Returns the value of the '<em><b>End Devices</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDevice}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Devices</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDevice#getCustomer
	 * @generated
	 */
	public EList<EndDevice> getEndDevices() {
		if (endDevices == null) {
			endDevices = new BasicInternalEList<EndDevice>(EndDevice.class);
		}
		return endDevices;
	}

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM15.IEC61968.Work.Work#getCustomers
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new BasicInternalEList<Work>(Work.class);
		}
		return works;
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Customer#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CustomersPackage.CUSTOMER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CustomersPackage.CUSTOMER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Planned Outage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Outage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Outage</em>' reference.
	 * @see #setPlannedOutage(PlannedOutage)
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas
	 * @generated
	 */
	public PlannedOutage getPlannedOutage() {
		if (plannedOutage != null && plannedOutage.eIsProxy()) {
			InternalEObject oldPlannedOutage = (InternalEObject)plannedOutage;
			plannedOutage = (PlannedOutage)eResolveProxy(oldPlannedOutage);
			if (plannedOutage != oldPlannedOutage) {
			}
		}
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedOutage basicGetPlannedOutage() {
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedOutage(PlannedOutage newPlannedOutage, NotificationChain msgs) {
		PlannedOutage oldPlannedOutage = plannedOutage;
		plannedOutage = newPlannedOutage;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Outage</em>' reference.
	 * @see #getPlannedOutage()
	 * @generated
	 */
	public void setPlannedOutage(PlannedOutage newPlannedOutage) {
		if (newPlannedOutage != plannedOutage) {
			NotificationChain msgs = null;
			if (plannedOutage != null)
				msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, PlannedOutage.class, msgs);
			if (newPlannedOutage != null)
				msgs = ((InternalEObject)newPlannedOutage).eInverseAdd(this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, PlannedOutage.class, msgs);
			msgs = basicSetPlannedOutage(newPlannedOutage, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Puc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puc Number</em>' attribute.
	 * @see #isSetPucNumber()
	 * @see #unsetPucNumber()
	 * @see #setPucNumber(String)
	 * @generated
	 */
	public String getPucNumber() {
		return pucNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puc Number</em>' attribute.
	 * @see #isSetPucNumber()
	 * @see #unsetPucNumber()
	 * @see #getPucNumber()
	 * @generated
	 */
	public void setPucNumber(String newPucNumber) {
		pucNumber = newPucNumber;
		pucNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPucNumber()
	 * @see #getPucNumber()
	 * @see #setPucNumber(String)
	 * @generated
	 */
	public void unsetPucNumber() {
		pucNumber = PUC_NUMBER_EDEFAULT;
		pucNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.Customer#getPucNumber <em>Puc Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Puc Number</em>' attribute is set.
	 * @see #unsetPucNumber()
	 * @see #getPucNumber()
	 * @see #setPucNumber(String)
	 * @generated
	 */
	public boolean isSetPucNumber() {
		return pucNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Notifications</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageNotification}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas <em>Customer Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Notifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Notifications</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas
	 * @generated
	 */
	public EList<OutageNotification> getOutageNotifications() {
		if (outageNotifications == null) {
			outageNotifications = new BasicInternalEList<OutageNotification>(OutageNotification.class);
		}
		return outageNotifications;
	}

	/**
	 * Returns the value of the '<em><b>Special Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Need</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Need</em>' attribute.
	 * @see #isSetSpecialNeed()
	 * @see #unsetSpecialNeed()
	 * @see #setSpecialNeed(String)
	 * @generated
	 */
	public String getSpecialNeed() {
		return specialNeed;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Need</em>' attribute.
	 * @see #isSetSpecialNeed()
	 * @see #unsetSpecialNeed()
	 * @see #getSpecialNeed()
	 * @generated
	 */
	public void setSpecialNeed(String newSpecialNeed) {
		specialNeed = newSpecialNeed;
		specialNeedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialNeed()
	 * @see #getSpecialNeed()
	 * @see #setSpecialNeed(String)
	 * @generated
	 */
	public void unsetSpecialNeed() {
		specialNeed = SPECIAL_NEED_EDEFAULT;
		specialNeedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.Customer#getSpecialNeed <em>Special Need</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Special Need</em>' attribute is set.
	 * @see #unsetSpecialNeed()
	 * @see #getSpecialNeed()
	 * @see #setSpecialNeed(String)
	 * @generated
	 */
	public boolean isSetSpecialNeed() {
		return specialNeedESet;
	}

	/**
	 * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Tickets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData
	 * @generated
	 */
	public EList<TroubleTicket> getTroubleTickets() {
		if (troubleTickets == null) {
			troubleTickets = new BasicInternalEList<TroubleTicket>(TroubleTicket.class);
		}
		return troubleTickets;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Customers.CustomerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Customers.CustomerKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(CustomerKind)
	 * @generated
	 */
	public CustomerKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Customer#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Customers.CustomerKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(CustomerKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.Customer#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(CustomerKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.Customer#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(CustomerKind)
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__END_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDevices()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				if (plannedOutage != null)
					msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, PlannedOutage.class, msgs);
				return basicSetPlannedOutage((PlannedOutage)otherEnd, msgs);
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageNotifications()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTroubleTickets()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__END_DEVICES:
				return ((InternalEList<?>)getEndDevices()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__STATUS:
				return basicSetStatus(null, msgs);
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				return basicSetPlannedOutage(null, msgs);
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return ((InternalEList<?>)getOutageNotifications()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return ((InternalEList<?>)getTroubleTickets()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.CUSTOMER__VIP:
				return isVip();
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return getErpPersons();
			case CustomersPackage.CUSTOMER__END_DEVICES:
				return getEndDevices();
			case CustomersPackage.CUSTOMER__WORKS:
				return getWorks();
			case CustomersPackage.CUSTOMER__STATUS:
				return getStatus();
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				if (resolve) return getPlannedOutage();
				return basicGetPlannedOutage();
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				return getPucNumber();
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return getOutageNotifications();
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				return getSpecialNeed();
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return getTroubleTickets();
			case CustomersPackage.CUSTOMER__KIND:
				return getKind();
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
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.CUSTOMER__VIP:
				setVip((Boolean)newValue);
				return;
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case CustomersPackage.CUSTOMER__END_DEVICES:
				getEndDevices().clear();
				getEndDevices().addAll((Collection<? extends EndDevice>)newValue);
				return;
			case CustomersPackage.CUSTOMER__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case CustomersPackage.CUSTOMER__STATUS:
				setStatus((Status)newValue);
				return;
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)newValue);
				return;
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				setPucNumber((String)newValue);
				return;
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				getOutageNotifications().clear();
				getOutageNotifications().addAll((Collection<? extends OutageNotification>)newValue);
				return;
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				setSpecialNeed((String)newValue);
				return;
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				getTroubleTickets().addAll((Collection<? extends TroubleTicket>)newValue);
				return;
			case CustomersPackage.CUSTOMER__KIND:
				setKind((CustomerKind)newValue);
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
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.CUSTOMER__VIP:
				unsetVip();
				return;
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case CustomersPackage.CUSTOMER__END_DEVICES:
				getEndDevices().clear();
				return;
			case CustomersPackage.CUSTOMER__WORKS:
				getWorks().clear();
				return;
			case CustomersPackage.CUSTOMER__STATUS:
				setStatus((Status)null);
				return;
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)null);
				return;
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				unsetPucNumber();
				return;
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				getOutageNotifications().clear();
				return;
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				unsetSpecialNeed();
				return;
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				return;
			case CustomersPackage.CUSTOMER__KIND:
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
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.CUSTOMER__VIP:
				return isSetVip();
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case CustomersPackage.CUSTOMER__END_DEVICES:
				return endDevices != null && !endDevices.isEmpty();
			case CustomersPackage.CUSTOMER__WORKS:
				return works != null && !works.isEmpty();
			case CustomersPackage.CUSTOMER__STATUS:
				return status != null;
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				return plannedOutage != null;
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				return isSetPucNumber();
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return outageNotifications != null && !outageNotifications.isEmpty();
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				return isSetSpecialNeed();
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return troubleTickets != null && !troubleTickets.isEmpty();
			case CustomersPackage.CUSTOMER__KIND:
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
		result.append(" (vip: ");
		if (vipESet) result.append(vip); else result.append("<unset>");
		result.append(", pucNumber: ");
		if (pucNumberESet) result.append(pucNumber); else result.append("<unset>");
		result.append(", specialNeed: ");
		if (specialNeedESet) result.append(specialNeed); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Customer
