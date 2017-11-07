/**
 */
package CIM15.IEC61968.Common;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonFactory INSTANCE = CIM15.IEC61968.Common.CommonFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory(CommonPackage.eNS_URI);
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommonPackage.POSTAL_ADDRESS: return createPostalAddress();
			case CommonPackage.STATUS: return createStatus();
			case CommonPackage.ELECTRONIC_ADDRESS: return createElectronicAddress();
			case CommonPackage.LOCATION: return createLocation();
			case CommonPackage.TOWN_DETAIL: return createTownDetail();
			case CommonPackage.COORDINATE_SYSTEM: return createCoordinateSystem();
			case CommonPackage.DOCUMENT: return createDocument();
			case CommonPackage.POSITION_POINT: return createPositionPoint();
			case CommonPackage.USER_ATTRIBUTE: return createUserAttribute();
			case CommonPackage.STREET_ADDRESS: return createStreetAddress();
			case CommonPackage.STREET_DETAIL: return createStreetDetail();
			case CommonPackage.TIME_SCHEDULE: return createTimeSchedule();
			case CommonPackage.ACTIVITY_RECORD: return createActivityRecord();
			case CommonPackage.TIME_POINT: return createTimePoint();
			case CommonPackage.ORGANISATION: return createOrganisation();
			case CommonPackage.TELEPHONE_NUMBER: return createTelephoneNumber();
			case CommonPackage.AGREEMENT: return createAgreement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress createPostalAddress() {
		PostalAddress postalAddress = new PostalAddress();
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		Status status = new Status();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicAddress createElectronicAddress() {
		ElectronicAddress electronicAddress = new ElectronicAddress();
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		Location location = new Location();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownDetail createTownDetail() {
		TownDetail townDetail = new TownDetail();
		return townDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem createCoordinateSystem() {
		CoordinateSystem coordinateSystem = new CoordinateSystem();
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		Document document = new Document();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint createPositionPoint() {
		PositionPoint positionPoint = new PositionPoint();
		return positionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttribute createUserAttribute() {
		UserAttribute userAttribute = new UserAttribute();
		return userAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetAddress createStreetAddress() {
		StreetAddress streetAddress = new StreetAddress();
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreetDetail createStreetDetail() {
		StreetDetail streetDetail = new StreetDetail();
		return streetDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSchedule createTimeSchedule() {
		TimeSchedule timeSchedule = new TimeSchedule();
		return timeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityRecord createActivityRecord() {
		ActivityRecord activityRecord = new ActivityRecord();
		return activityRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint createTimePoint() {
		TimePoint timePoint = new TimePoint();
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		Organisation organisation = new Organisation();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber createTelephoneNumber() {
		TelephoneNumber telephoneNumber = new TelephoneNumber();
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agreement createAgreement() {
		Agreement agreement = new Agreement();
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactory
