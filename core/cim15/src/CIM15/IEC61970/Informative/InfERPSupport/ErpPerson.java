/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.ElectronicAddress;
import CIM15.IEC61968.Common.Status;
import CIM15.IEC61968.Common.TelephoneNumber;

import CIM15.IEC61968.Customers.Customer;
import CIM15.IEC61968.Customers.CustomersPackage;
import CIM15.IEC61968.Customers.ServiceLocation;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfCommon.Craft;
import CIM15.IEC61970.Informative.InfCommon.Skill;

import CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole;

import CIM15.IEC61970.Informative.InfOperations.CallBack;
import CIM15.IEC61970.Informative.InfOperations.ChangeItem;
import CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole;

import CIM15.IEC61970.Informative.InfWork.Appointment;
import CIM15.IEC61970.Informative.InfWork.Crew;
import CIM15.IEC61970.Informative.InfWork.LaborItem;

import CIM15.IEC61970.Meas.MeasurementValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandPropertyRoles <em>Land Property Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues <em>Measurement Values</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills <em>Skills</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone <em>Landline Phone</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone <em>Mobile Phone</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks <em>Call Backs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles <em>Switching Step Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency <em>Erp Competency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpPerson extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceLocation serviceLocation;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgErpPersonRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The cached value of the '{@link #getLaborItems() <em>Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<LaborItem> laborItems;

	/**
	 * The cached value of the '{@link #getLandPropertyRoles() <em>Land Property Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandPropertyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonPropertyRole> landPropertyRoles;

	/**
	 * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityRecord> activityRecords;

	/**
	 * The cached value of the '{@link #getMeasurementValues() <em>Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementValue> measurementValues;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skills;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * This is true if the Last Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastNameESet;

	/**
	 * The cached value of the '{@link #getLandlinePhone() <em>Landline Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandlinePhone()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber landlinePhone;

	/**
	 * The cached value of the '{@link #getMobilePhone() <em>Mobile Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePhone()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber mobilePhone;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * This is true if the First Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstNameESet;

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
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocErpPersonRole> documentRoles;

	/**
	 * The default value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String GOVERNMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected String governmentID = GOVERNMENT_ID_EDEFAULT;

	/**
	 * This is true if the Government ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean governmentIDESet;

	/**
	 * The cached value of the '{@link #getErpPersonnel() <em>Erp Personnel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonnel()
	 * @generated
	 * @ordered
	 */
	protected ErpPersonnel erpPersonnel;

	/**
	 * The cached value of the '{@link #getCrafts() <em>Crafts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Craft> crafts;

	/**
	 * The cached value of the '{@link #getCustomerData() <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerData()
	 * @generated
	 * @ordered
	 */
	protected Customer customerData;

	/**
	 * The cached value of the '{@link #getCallBacks() <em>Call Backs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBacks()
	 * @generated
	 * @ordered
	 */
	protected EList<CallBack> callBacks;

	/**
	 * The default value of the '{@link #getMName() <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMName()
	 * @generated
	 * @ordered
	 */
	protected static final String MNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMName() <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMName()
	 * @generated
	 * @ordered
	 */
	protected String mName = MNAME_EDEFAULT;

	/**
	 * This is true if the MName attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mNameESet;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * This is true if the Suffix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suffixESet;

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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * This is true if the Prefix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prefixESet;

	/**
	 * The cached value of the '{@link #getSwitchingStepRoles() <em>Switching Step Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingStepRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPersonScheduleStepRole> switchingStepRoles;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The cached value of the '{@link #getErpCompetency() <em>Erp Competency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpCompetency()
	 * @generated
	 * @ordered
	 */
	protected ErpCompetency erpCompetency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPerson() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PERSON;
	}

	/**
	 * Returns the value of the '<em><b>Service Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.ServiceLocation#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Location</em>' reference.
	 * @see #setServiceLocation(ServiceLocation)
	 * @see CIM15.IEC61968.Customers.ServiceLocation#getErpPersons
	 * @generated
	 */
	public ServiceLocation getServiceLocation() {
		if (serviceLocation != null && serviceLocation.eIsProxy()) {
			InternalEObject oldServiceLocation = (InternalEObject)serviceLocation;
			serviceLocation = (ServiceLocation)eResolveProxy(oldServiceLocation);
			if (serviceLocation != oldServiceLocation) {
			}
		}
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation basicGetServiceLocation() {
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLocation(ServiceLocation newServiceLocation, NotificationChain msgs) {
		ServiceLocation oldServiceLocation = serviceLocation;
		serviceLocation = newServiceLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getServiceLocation <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Location</em>' reference.
	 * @see #getServiceLocation()
	 * @generated
	 */
	public void setServiceLocation(ServiceLocation newServiceLocation) {
		if (newServiceLocation != serviceLocation) {
			NotificationChain msgs = null;
			if (serviceLocation != null)
				msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, ServiceLocation.class, msgs);
			if (newServiceLocation != null)
				msgs = ((InternalEObject)newServiceLocation).eInverseAdd(this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, ServiceLocation.class, msgs);
			msgs = basicSetServiceLocation(newServiceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson
	 * @generated
	 */
	public EList<OrgErpPersonRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new BasicInternalEList<OrgErpPersonRole>(OrgErpPersonRole.class);
		}
		return erpOrganisationRoles;
	}

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Appointment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getErpPersons
	 * @generated
	 */
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new BasicInternalEList<Appointment>(Appointment.class);
		}
		return appointments;
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCrewMembers <em>Crew Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getCrewMembers
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
	}

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	public void setCategory(String newCategory) {
		category = newCategory;
		categoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public void unsetCategory() {
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.LaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getErpPersons
	 * @generated
	 */
	public EList<LaborItem> getLaborItems() {
		if (laborItems == null) {
			laborItems = new BasicInternalEList<LaborItem>(LaborItem.class);
		}
		return laborItems;
	}

	/**
	 * Returns the value of the '<em><b>Land Property Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole#getErpPerson
	 * @generated
	 */
	public EList<PersonPropertyRole> getLandPropertyRoles() {
		if (landPropertyRoles == null) {
			landPropertyRoles = new BasicInternalEList<PersonPropertyRole>(PersonPropertyRole.class);
		}
		return landPropertyRoles;
	}

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.ActivityRecord#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getErpPersons
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new BasicInternalEList<ActivityRecord>(ActivityRecord.class);
		}
		return activityRecords;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.MeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getErpPerson
	 * @generated
	 */
	public EList<MeasurementValue> getMeasurementValues() {
		if (measurementValues == null) {
			measurementValues = new BasicInternalEList<MeasurementValue>(MeasurementValue.class);
		}
		return measurementValues;
	}

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.Skill}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.Skill#getErpPerson
	 * @generated
	 */
	public EList<Skill> getSkills() {
		if (skills == null) {
			skills = new BasicInternalEList<Skill>(Skill.class);
		}
		return skills;
	}

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #isSetLastName()
	 * @see #unsetLastName()
	 * @see #setLastName(String)
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #isSetLastName()
	 * @see #unsetLastName()
	 * @see #getLastName()
	 * @generated
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
		lastNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastName()
	 * @see #getLastName()
	 * @see #setLastName(String)
	 * @generated
	 */
	public void unsetLastName() {
		lastName = LAST_NAME_EDEFAULT;
		lastNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLastName <em>Last Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Name</em>' attribute is set.
	 * @see #unsetLastName()
	 * @see #getLastName()
	 * @see #setLastName(String)
	 * @generated
	 */
	public boolean isSetLastName() {
		return lastNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Landline Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Landline Phone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landline Phone</em>' containment reference.
	 * @see #setLandlinePhone(TelephoneNumber)
	 * @generated
	 */
	public TelephoneNumber getLandlinePhone() {
		return landlinePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandlinePhone(TelephoneNumber newLandlinePhone, NotificationChain msgs) {
		TelephoneNumber oldLandlinePhone = landlinePhone;
		landlinePhone = newLandlinePhone;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getLandlinePhone <em>Landline Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landline Phone</em>' containment reference.
	 * @see #getLandlinePhone()
	 * @generated
	 */
	public void setLandlinePhone(TelephoneNumber newLandlinePhone) {
		if (newLandlinePhone != landlinePhone) {
			NotificationChain msgs = null;
			if (landlinePhone != null)
				msgs = ((InternalEObject)landlinePhone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE, null, msgs);
			if (newLandlinePhone != null)
				msgs = ((InternalEObject)newLandlinePhone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE, null, msgs);
			msgs = basicSetLandlinePhone(newLandlinePhone, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Mobile Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Phone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Phone</em>' containment reference.
	 * @see #setMobilePhone(TelephoneNumber)
	 * @generated
	 */
	public TelephoneNumber getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMobilePhone(TelephoneNumber newMobilePhone, NotificationChain msgs) {
		TelephoneNumber oldMobilePhone = mobilePhone;
		mobilePhone = newMobilePhone;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMobilePhone <em>Mobile Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Phone</em>' containment reference.
	 * @see #getMobilePhone()
	 * @generated
	 */
	public void setMobilePhone(TelephoneNumber newMobilePhone) {
		if (newMobilePhone != mobilePhone) {
			NotificationChain msgs = null;
			if (mobilePhone != null)
				msgs = ((InternalEObject)mobilePhone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE, null, msgs);
			if (newMobilePhone != null)
				msgs = ((InternalEObject)newMobilePhone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE, null, msgs);
			msgs = basicSetMobilePhone(newMobilePhone, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #isSetFirstName()
	 * @see #unsetFirstName()
	 * @see #setFirstName(String)
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #isSetFirstName()
	 * @see #unsetFirstName()
	 * @see #getFirstName()
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
		firstNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstName()
	 * @see #getFirstName()
	 * @see #setFirstName(String)
	 * @generated
	 */
	public void unsetFirstName() {
		firstName = FIRST_NAME_EDEFAULT;
		firstNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getFirstName <em>First Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Name</em>' attribute is set.
	 * @see #unsetFirstName()
	 * @see #getFirstName()
	 * @see #setFirstName(String)
	 * @generated
	 */
	public boolean isSetFirstName() {
		return firstNameESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getErpPerson
	 * @generated
	 */
	public EList<DocErpPersonRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new BasicInternalEList<DocErpPersonRole>(DocErpPersonRole.class);
		}
		return documentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Government ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Government ID</em>' attribute.
	 * @see #isSetGovernmentID()
	 * @see #unsetGovernmentID()
	 * @see #setGovernmentID(String)
	 * @generated
	 */
	public String getGovernmentID() {
		return governmentID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Government ID</em>' attribute.
	 * @see #isSetGovernmentID()
	 * @see #unsetGovernmentID()
	 * @see #getGovernmentID()
	 * @generated
	 */
	public void setGovernmentID(String newGovernmentID) {
		governmentID = newGovernmentID;
		governmentIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGovernmentID()
	 * @see #getGovernmentID()
	 * @see #setGovernmentID(String)
	 * @generated
	 */
	public void unsetGovernmentID() {
		governmentID = GOVERNMENT_ID_EDEFAULT;
		governmentIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getGovernmentID <em>Government ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Government ID</em>' attribute is set.
	 * @see #unsetGovernmentID()
	 * @see #getGovernmentID()
	 * @see #setGovernmentID(String)
	 * @generated
	 */
	public boolean isSetGovernmentID() {
		return governmentIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Personnel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Personnel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Personnel</em>' reference.
	 * @see #setErpPersonnel(ErpPersonnel)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel#getErpPersons
	 * @generated
	 */
	public ErpPersonnel getErpPersonnel() {
		if (erpPersonnel != null && erpPersonnel.eIsProxy()) {
			InternalEObject oldErpPersonnel = (InternalEObject)erpPersonnel;
			erpPersonnel = (ErpPersonnel)eResolveProxy(oldErpPersonnel);
			if (erpPersonnel != oldErpPersonnel) {
			}
		}
		return erpPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonnel basicGetErpPersonnel() {
		return erpPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPersonnel(ErpPersonnel newErpPersonnel, NotificationChain msgs) {
		ErpPersonnel oldErpPersonnel = erpPersonnel;
		erpPersonnel = newErpPersonnel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpPersonnel <em>Erp Personnel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Personnel</em>' reference.
	 * @see #getErpPersonnel()
	 * @generated
	 */
	public void setErpPersonnel(ErpPersonnel newErpPersonnel) {
		if (newErpPersonnel != erpPersonnel) {
			NotificationChain msgs = null;
			if (erpPersonnel != null)
				msgs = ((InternalEObject)erpPersonnel).eInverseRemove(this, InfERPSupportPackage.ERP_PERSONNEL__ERP_PERSONS, ErpPersonnel.class, msgs);
			if (newErpPersonnel != null)
				msgs = ((InternalEObject)newErpPersonnel).eInverseAdd(this, InfERPSupportPackage.ERP_PERSONNEL__ERP_PERSONS, ErpPersonnel.class, msgs);
			msgs = basicSetErpPersonnel(newErpPersonnel, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Crafts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.Craft}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.Craft#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crafts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crafts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.Craft#getErpPersons
	 * @generated
	 */
	public EList<Craft> getCrafts() {
		if (crafts == null) {
			crafts = new BasicInternalEList<Craft>(Craft.class);
		}
		return crafts;
	}

	/**
	 * Returns the value of the '<em><b>Customer Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Data</em>' reference.
	 * @see #setCustomerData(Customer)
	 * @see CIM15.IEC61968.Customers.Customer#getErpPersons
	 * @generated
	 */
	public Customer getCustomerData() {
		if (customerData != null && customerData.eIsProxy()) {
			InternalEObject oldCustomerData = (InternalEObject)customerData;
			customerData = (Customer)eResolveProxy(oldCustomerData);
			if (customerData != oldCustomerData) {
			}
		}
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomerData() {
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerData(Customer newCustomerData, NotificationChain msgs) {
		Customer oldCustomerData = customerData;
		customerData = newCustomerData;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCustomerData <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Data</em>' reference.
	 * @see #getCustomerData()
	 * @generated
	 */
	public void setCustomerData(Customer newCustomerData) {
		if (newCustomerData != customerData) {
			NotificationChain msgs = null;
			if (customerData != null)
				msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__ERP_PERSONS, Customer.class, msgs);
			if (newCustomerData != null)
				msgs = ((InternalEObject)newCustomerData).eInverseAdd(this, CustomersPackage.CUSTOMER__ERP_PERSONS, Customer.class, msgs);
			msgs = basicSetCustomerData(newCustomerData, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Call Backs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.CallBack}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Backs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Backs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getErpPersons
	 * @generated
	 */
	public EList<CallBack> getCallBacks() {
		if (callBacks == null) {
			callBacks = new BasicInternalEList<CallBack>(CallBack.class);
		}
		return callBacks;
	}

	/**
	 * Returns the value of the '<em><b>MName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MName</em>' attribute.
	 * @see #isSetMName()
	 * @see #unsetMName()
	 * @see #setMName(String)
	 * @generated
	 */
	public String getMName() {
		return mName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MName</em>' attribute.
	 * @see #isSetMName()
	 * @see #unsetMName()
	 * @see #getMName()
	 * @generated
	 */
	public void setMName(String newMName) {
		mName = newMName;
		mNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMName()
	 * @see #getMName()
	 * @see #setMName(String)
	 * @generated
	 */
	public void unsetMName() {
		mName = MNAME_EDEFAULT;
		mNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMName <em>MName</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MName</em>' attribute is set.
	 * @see #unsetMName()
	 * @see #getMName()
	 * @see #setMName(String)
	 * @generated
	 */
	public boolean isSetMName() {
		return mNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #isSetSuffix()
	 * @see #unsetSuffix()
	 * @see #setSuffix(String)
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #isSetSuffix()
	 * @see #unsetSuffix()
	 * @see #getSuffix()
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		suffix = newSuffix;
		suffixESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuffix()
	 * @see #getSuffix()
	 * @see #setSuffix(String)
	 * @generated
	 */
	public void unsetSuffix() {
		suffix = SUFFIX_EDEFAULT;
		suffixESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSuffix <em>Suffix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suffix</em>' attribute is set.
	 * @see #unsetSuffix()
	 * @see #getSuffix()
	 * @see #setSuffix(String)
	 * @generated
	 */
	public boolean isSetSuffix() {
		return suffixESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSpecialNeed <em>Special Need</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		prefix = newPrefix;
		prefixESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	public void unsetPrefix() {
		prefix = PREFIX_EDEFAULT;
		prefixESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	public boolean isSetPrefix() {
		return prefixESet;
	}

	/**
	 * Returns the value of the '<em><b>Switching Step Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Step Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Step Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson
	 * @generated
	 */
	public EList<ErpPersonScheduleStepRole> getSwitchingStepRoles() {
		if (switchingStepRoles == null) {
			switchingStepRoles = new BasicInternalEList<ErpPersonScheduleStepRole>(ErpPersonScheduleStepRole.class);
		}
		return switchingStepRoles;
	}

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' containment reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicAddress(ElectronicAddress newElectronicAddress, NotificationChain msgs) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getElectronicAddress <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' containment reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		if (newElectronicAddress != electronicAddress) {
			NotificationChain msgs = null;
			if (electronicAddress != null)
				msgs = ((InternalEObject)electronicAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS, null, msgs);
			if (newElectronicAddress != null)
				msgs = ((InternalEObject)newElectronicAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS, null, msgs);
			msgs = basicSetElectronicAddress(newElectronicAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Competency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons <em>Erp Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Competency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Competency</em>' reference.
	 * @see #setErpCompetency(ErpCompetency)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency#getErpPersons
	 * @generated
	 */
	public ErpCompetency getErpCompetency() {
		if (erpCompetency != null && erpCompetency.eIsProxy()) {
			InternalEObject oldErpCompetency = (InternalEObject)erpCompetency;
			erpCompetency = (ErpCompetency)eResolveProxy(oldErpCompetency);
			if (erpCompetency != oldErpCompetency) {
			}
		}
		return erpCompetency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpCompetency basicGetErpCompetency() {
		return erpCompetency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpCompetency(ErpCompetency newErpCompetency, NotificationChain msgs) {
		ErpCompetency oldErpCompetency = erpCompetency;
		erpCompetency = newErpCompetency;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpCompetency <em>Erp Competency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Competency</em>' reference.
	 * @see #getErpCompetency()
	 * @generated
	 */
	public void setErpCompetency(ErpCompetency newErpCompetency) {
		if (newErpCompetency != erpCompetency) {
			NotificationChain msgs = null;
			if (erpCompetency != null)
				msgs = ((InternalEObject)erpCompetency).eInverseRemove(this, InfERPSupportPackage.ERP_COMPETENCY__ERP_PERSONS, ErpCompetency.class, msgs);
			if (newErpCompetency != null)
				msgs = ((InternalEObject)newErpCompetency).eInverseAdd(this, InfERPSupportPackage.ERP_COMPETENCY__ERP_PERSONS, ErpCompetency.class, msgs);
			msgs = basicSetErpCompetency(newErpCompetency, msgs);
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
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				if (serviceLocation != null)
					msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, ServiceLocation.class, msgs);
				return basicSetServiceLocation((ServiceLocation)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppointments()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaborItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandPropertyRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurementValues()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSkills()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				if (erpPersonnel != null)
					msgs = ((InternalEObject)erpPersonnel).eInverseRemove(this, InfERPSupportPackage.ERP_PERSONNEL__ERP_PERSONS, ErpPersonnel.class, msgs);
				return basicSetErpPersonnel((ErpPersonnel)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrafts()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				if (customerData != null)
					msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__ERP_PERSONS, Customer.class, msgs);
				return basicSetCustomerData((Customer)otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallBacks()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingStepRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				if (erpCompetency != null)
					msgs = ((InternalEObject)erpCompetency).eInverseRemove(this, InfERPSupportPackage.ERP_COMPETENCY__ERP_PERSONS, ErpCompetency.class, msgs);
				return basicSetErpCompetency((ErpCompetency)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				return basicSetServiceLocation(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return ((InternalEList<?>)getAppointments()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return ((InternalEList<?>)getLaborItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return ((InternalEList<?>)getLandPropertyRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return ((InternalEList<?>)getMeasurementValues()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				return basicSetLandlinePhone(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				return basicSetMobilePhone(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				return basicSetErpPersonnel(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return ((InternalEList<?>)getCrafts()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				return basicSetCustomerData(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return ((InternalEList<?>)getCallBacks()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return ((InternalEList<?>)getSwitchingStepRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				return basicSetElectronicAddress(null, msgs);
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				return basicSetErpCompetency(null, msgs);
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
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				if (resolve) return getServiceLocation();
				return basicGetServiceLocation();
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return getAppointments();
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return getCrews();
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				return getCategory();
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return getLaborItems();
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return getLandPropertyRoles();
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return getActivityRecords();
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return getMeasurementValues();
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return getSkills();
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				return getLastName();
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				return getLandlinePhone();
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				return getMobilePhone();
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return getChangeItems();
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				return getFirstName();
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return getDocumentRoles();
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				return getGovernmentID();
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				if (resolve) return getErpPersonnel();
				return basicGetErpPersonnel();
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return getCrafts();
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				if (resolve) return getCustomerData();
				return basicGetCustomerData();
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return getCallBacks();
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				return getMName();
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				return getSuffix();
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				return getSpecialNeed();
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				return getPrefix();
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return getSwitchingStepRoles();
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				return getElectronicAddress();
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				if (resolve) return getErpCompetency();
				return basicGetErpCompetency();
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
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgErpPersonRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				getAppointments().clear();
				getAppointments().addAll((Collection<? extends Appointment>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				getLaborItems().clear();
				getLaborItems().addAll((Collection<? extends LaborItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				getLandPropertyRoles().addAll((Collection<? extends PersonPropertyRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				getMeasurementValues().addAll((Collection<? extends MeasurementValue>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				setLandlinePhone((TelephoneNumber)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				setMobilePhone((TelephoneNumber)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocErpPersonRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				setGovernmentID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				setErpPersonnel((ErpPersonnel)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				getCrafts().clear();
				getCrafts().addAll((Collection<? extends Craft>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				setCustomerData((Customer)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				getCallBacks().clear();
				getCallBacks().addAll((Collection<? extends CallBack>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				setMName((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				setSuffix((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				setSpecialNeed((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				setPrefix((String)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				getSwitchingStepRoles().clear();
				getSwitchingStepRoles().addAll((Collection<? extends ErpPersonScheduleStepRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				setErpCompetency((ErpCompetency)newValue);
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
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				getAppointments().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				getCrews().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				unsetCategory();
				return;
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				getLaborItems().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				getSkills().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				unsetLastName();
				return;
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				setLandlinePhone((TelephoneNumber)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				setMobilePhone((TelephoneNumber)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				unsetFirstName();
				return;
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				unsetGovernmentID();
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				setErpPersonnel((ErpPersonnel)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				getCrafts().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				setCustomerData((Customer)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				getCallBacks().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				unsetMName();
				return;
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				unsetSuffix();
				return;
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				unsetSpecialNeed();
				return;
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				unsetPrefix();
				return;
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				getSwitchingStepRoles().clear();
				return;
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				setErpCompetency((ErpCompetency)null);
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
			case InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION:
				return serviceLocation != null;
			case InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__APPOINTMENTS:
				return appointments != null && !appointments.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__CREWS:
				return crews != null && !crews.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__CATEGORY:
				return isSetCategory();
			case InfERPSupportPackage.ERP_PERSON__LABOR_ITEMS:
				return laborItems != null && !laborItems.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__LAND_PROPERTY_ROLES:
				return landPropertyRoles != null && !landPropertyRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES:
				return measurementValues != null && !measurementValues.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__SKILLS:
				return skills != null && !skills.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__LAST_NAME:
				return isSetLastName();
			case InfERPSupportPackage.ERP_PERSON__LANDLINE_PHONE:
				return landlinePhone != null;
			case InfERPSupportPackage.ERP_PERSON__MOBILE_PHONE:
				return mobilePhone != null;
			case InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__FIRST_NAME:
				return isSetFirstName();
			case InfERPSupportPackage.ERP_PERSON__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_PERSON__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__GOVERNMENT_ID:
				return isSetGovernmentID();
			case InfERPSupportPackage.ERP_PERSON__ERP_PERSONNEL:
				return erpPersonnel != null;
			case InfERPSupportPackage.ERP_PERSON__CRAFTS:
				return crafts != null && !crafts.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA:
				return customerData != null;
			case InfERPSupportPackage.ERP_PERSON__CALL_BACKS:
				return callBacks != null && !callBacks.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__MNAME:
				return isSetMName();
			case InfERPSupportPackage.ERP_PERSON__SUFFIX:
				return isSetSuffix();
			case InfERPSupportPackage.ERP_PERSON__SPECIAL_NEED:
				return isSetSpecialNeed();
			case InfERPSupportPackage.ERP_PERSON__PREFIX:
				return isSetPrefix();
			case InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES:
				return switchingStepRoles != null && !switchingStepRoles.isEmpty();
			case InfERPSupportPackage.ERP_PERSON__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case InfERPSupportPackage.ERP_PERSON__ERP_COMPETENCY:
				return erpCompetency != null;
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
		result.append(" (category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", lastName: ");
		if (lastNameESet) result.append(lastName); else result.append("<unset>");
		result.append(", firstName: ");
		if (firstNameESet) result.append(firstName); else result.append("<unset>");
		result.append(", governmentID: ");
		if (governmentIDESet) result.append(governmentID); else result.append("<unset>");
		result.append(", mName: ");
		if (mNameESet) result.append(mName); else result.append("<unset>");
		result.append(", suffix: ");
		if (suffixESet) result.append(suffix); else result.append("<unset>");
		result.append(", specialNeed: ");
		if (specialNeedESet) result.append(specialNeed); else result.append("<unset>");
		result.append(", prefix: ");
		if (prefixESet) result.append(prefix); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpPerson
