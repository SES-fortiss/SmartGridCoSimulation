/**
 */
package CIM15.IEC61968.Customers;

import CIM15.IEC61968.Common.Location;

import CIM15.IEC61968.Metering.EndDevice;
import CIM15.IEC61968.Metering.ServiceDeliveryPoint;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceLocation extends Location {
	/**
	 * The default value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_ACCESS_PROBLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected String siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;

	/**
	 * This is true if the Site Access Problem attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean siteAccessProblemESet;

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
	 * The default value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected String accessMethod = ACCESS_METHOD_EDEFAULT;

	/**
	 * This is true if the Access Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessMethodESet;

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
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

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
	 * The default value of the '{@link #isNeedsInspection() <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsInspection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_INSPECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsInspection() <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsInspection()
	 * @generated
	 * @ordered
	 */
	protected boolean needsInspection = NEEDS_INSPECTION_EDEFAULT;

	/**
	 * This is true if the Needs Inspection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needsInspectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLocation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.SERVICE_LOCATION;
	}

	/**
	 * Returns the value of the '<em><b>Site Access Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Access Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Access Problem</em>' attribute.
	 * @see #isSetSiteAccessProblem()
	 * @see #unsetSiteAccessProblem()
	 * @see #setSiteAccessProblem(String)
	 * @generated
	 */
	public String getSiteAccessProblem() {
		return siteAccessProblem;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Access Problem</em>' attribute.
	 * @see #isSetSiteAccessProblem()
	 * @see #unsetSiteAccessProblem()
	 * @see #getSiteAccessProblem()
	 * @generated
	 */
	public void setSiteAccessProblem(String newSiteAccessProblem) {
		siteAccessProblem = newSiteAccessProblem;
		siteAccessProblemESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSiteAccessProblem()
	 * @see #getSiteAccessProblem()
	 * @see #setSiteAccessProblem(String)
	 * @generated
	 */
	public void unsetSiteAccessProblem() {
		siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;
		siteAccessProblemESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Site Access Problem</em>' attribute is set.
	 * @see #unsetSiteAccessProblem()
	 * @see #getSiteAccessProblem()
	 * @see #setSiteAccessProblem(String)
	 * @generated
	 */
	public boolean isSetSiteAccessProblem() {
		return siteAccessProblemESet;
	}

	/**
	 * Returns the value of the '<em><b>End Devices</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDevice}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Devices</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDevice#getServiceLocation
	 * @generated
	 */
	public EList<EndDevice> getEndDevices() {
		if (endDevices == null) {
			endDevices = new BasicInternalEList<EndDevice>(EndDevice.class);
		}
		return endDevices;
	}

	/**
	 * Returns the value of the '<em><b>Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Method</em>' attribute.
	 * @see #isSetAccessMethod()
	 * @see #unsetAccessMethod()
	 * @see #setAccessMethod(String)
	 * @generated
	 */
	public String getAccessMethod() {
		return accessMethod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Method</em>' attribute.
	 * @see #isSetAccessMethod()
	 * @see #unsetAccessMethod()
	 * @see #getAccessMethod()
	 * @generated
	 */
	public void setAccessMethod(String newAccessMethod) {
		accessMethod = newAccessMethod;
		accessMethodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessMethod()
	 * @see #getAccessMethod()
	 * @see #setAccessMethod(String)
	 * @generated
	 */
	public void unsetAccessMethod() {
		accessMethod = ACCESS_METHOD_EDEFAULT;
		accessMethodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#getAccessMethod <em>Access Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Method</em>' attribute is set.
	 * @see #unsetAccessMethod()
	 * @see #getAccessMethod()
	 * @see #setAccessMethod(String)
	 * @generated
	 */
	public boolean isSetAccessMethod() {
		return accessMethodESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new BasicInternalEList<ErpPerson>(ErpPerson.class);
		}
		return erpPersons;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceLocations <em>Service Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getServiceLocations
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
	}

	/**
	 * Returns the value of the '<em><b>Needs Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Inspection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inspection</em>' attribute.
	 * @see #isSetNeedsInspection()
	 * @see #unsetNeedsInspection()
	 * @see #setNeedsInspection(boolean)
	 * @generated
	 */
	public boolean isNeedsInspection() {
		return needsInspection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inspection</em>' attribute.
	 * @see #isSetNeedsInspection()
	 * @see #unsetNeedsInspection()
	 * @see #isNeedsInspection()
	 * @generated
	 */
	public void setNeedsInspection(boolean newNeedsInspection) {
		needsInspection = newNeedsInspection;
		needsInspectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedsInspection()
	 * @see #isNeedsInspection()
	 * @see #setNeedsInspection(boolean)
	 * @generated
	 */
	public void unsetNeedsInspection() {
		needsInspection = NEEDS_INSPECTION_EDEFAULT;
		needsInspectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.ServiceLocation#isNeedsInspection <em>Needs Inspection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Needs Inspection</em>' attribute is set.
	 * @see #unsetNeedsInspection()
	 * @see #isNeedsInspection()
	 * @see #setNeedsInspection(boolean)
	 * @generated
	 */
	public boolean isSetNeedsInspection() {
		return needsInspectionESet;
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
			case CustomersPackage.SERVICE_LOCATION__END_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDevices()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
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
			case CustomersPackage.SERVICE_LOCATION__END_DEVICES:
				return ((InternalEList<?>)getEndDevices()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
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
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				return getSiteAccessProblem();
			case CustomersPackage.SERVICE_LOCATION__END_DEVICES:
				return getEndDevices();
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				return getAccessMethod();
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return getErpPersons();
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				return isNeedsInspection();
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
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				setSiteAccessProblem((String)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__END_DEVICES:
				getEndDevices().clear();
				getEndDevices().addAll((Collection<? extends EndDevice>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				setAccessMethod((String)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				setNeedsInspection((Boolean)newValue);
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
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				unsetSiteAccessProblem();
				return;
			case CustomersPackage.SERVICE_LOCATION__END_DEVICES:
				getEndDevices().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				unsetAccessMethod();
				return;
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				unsetNeedsInspection();
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
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				return isSetSiteAccessProblem();
			case CustomersPackage.SERVICE_LOCATION__END_DEVICES:
				return endDevices != null && !endDevices.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				return isSetAccessMethod();
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				return isSetNeedsInspection();
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
		result.append(" (siteAccessProblem: ");
		if (siteAccessProblemESet) result.append(siteAccessProblem); else result.append("<unset>");
		result.append(", accessMethod: ");
		if (accessMethodESet) result.append(accessMethod); else result.append("<unset>");
		result.append(", needsInspection: ");
		if (needsInspectionESet) result.append(needsInspection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ServiceLocation
