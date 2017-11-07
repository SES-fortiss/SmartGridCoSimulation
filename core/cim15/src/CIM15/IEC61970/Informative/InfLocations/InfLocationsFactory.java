/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class InfLocationsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfLocationsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfLocationsFactory INSTANCE = CIM15.IEC61970.Informative.InfLocations.InfLocationsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfLocationsFactory init() {
		try {
			InfLocationsFactory theInfLocationsFactory = (InfLocationsFactory)EPackage.Registry.INSTANCE.getEFactory(InfLocationsPackage.eNS_URI);
			if (theInfLocationsFactory != null) {
				return theInfLocationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfLocationsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLocationsFactory() {
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
			case InfLocationsPackage.LOCATION_GRANT: return createLocationGrant();
			case InfLocationsPackage.RIGHT_OF_WAY: return createRightOfWay();
			case InfLocationsPackage.PERSON_PROPERTY_ROLE: return createPersonPropertyRole();
			case InfLocationsPackage.ZONE: return createZone();
			case InfLocationsPackage.RED_LINE: return createRedLine();
			case InfLocationsPackage.ROUTE: return createRoute();
			case InfLocationsPackage.ORG_PROPERTY_ROLE: return createOrgPropertyRole();
			case InfLocationsPackage.DIRECTION: return createDirection();
			case InfLocationsPackage.LAND_PROPERTY: return createLandProperty();
			case InfLocationsPackage.HAZARD: return createHazard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfLocationsPackage.LAND_PROPERTY_KIND:
				return createLandPropertyKindFromString(eDataType, initialValue);
			case InfLocationsPackage.DEMOGRAPHIC_KIND:
				return createDemographicKindFromString(eDataType, initialValue);
			case InfLocationsPackage.ZONE_KIND:
				return createZoneKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfLocationsPackage.LAND_PROPERTY_KIND:
				return convertLandPropertyKindToString(eDataType, instanceValue);
			case InfLocationsPackage.DEMOGRAPHIC_KIND:
				return convertDemographicKindToString(eDataType, instanceValue);
			case InfLocationsPackage.ZONE_KIND:
				return convertZoneKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationGrant createLocationGrant() {
		LocationGrant locationGrant = new LocationGrant();
		return locationGrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightOfWay createRightOfWay() {
		RightOfWay rightOfWay = new RightOfWay();
		return rightOfWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonPropertyRole createPersonPropertyRole() {
		PersonPropertyRole personPropertyRole = new PersonPropertyRole();
		return personPropertyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		Zone zone = new Zone();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedLine createRedLine() {
		RedLine redLine = new RedLine();
		return redLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		Route route = new Route();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgPropertyRole createOrgPropertyRole() {
		OrgPropertyRole orgPropertyRole = new OrgPropertyRole();
		return orgPropertyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirection() {
		Direction direction = new Direction();
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty createLandProperty() {
		LandProperty landProperty = new LandProperty();
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		Hazard hazard = new Hazard();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandPropertyKind createLandPropertyKindFromString(EDataType eDataType, String initialValue) {
		LandPropertyKind result = LandPropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLandPropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemographicKind createDemographicKindFromString(EDataType eDataType, String initialValue) {
		DemographicKind result = DemographicKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDemographicKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneKind createZoneKindFromString(EDataType eDataType, String initialValue) {
		ZoneKind result = ZoneKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZoneKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLocationsPackage getInfLocationsPackage() {
		return (InfLocationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfLocationsPackage getPackage() {
		return InfLocationsPackage.eINSTANCE;
	}

} //InfLocationsFactory
