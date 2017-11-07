/**
 */
package CIM15.IEC61970.Core;

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
public class CoreFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreFactory INSTANCE = CIM15.IEC61970.Core.CoreFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory() {
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
			case CorePackage.POWER_SYSTEM_RESOURCE: return createPowerSystemResource();
			case CorePackage.NAME_TYPE_AUTHORITY: return createNameTypeAuthority();
			case CorePackage.EQUIPMENT: return createEquipment();
			case CorePackage.CONDUCTING_EQUIPMENT: return createConductingEquipment();
			case CorePackage.REGULAR_TIME_POINT: return createRegularTimePoint();
			case CorePackage.CONNECTIVITY_NODE: return createConnectivityNode();
			case CorePackage.PSR_TYPE: return createPSRType();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER: return createConnectivityNodeContainer();
			case CorePackage.BAY: return createBay();
			case CorePackage.EQUIPMENT_CONTAINER: return createEquipmentContainer();
			case CorePackage.REPORTING_GROUP: return createReportingGroup();
			case CorePackage.BASE_POWER: return createBasePower();
			case CorePackage.PSR_LIST: return createPsrList();
			case CorePackage.IDENTIFIED_OBJECT: return createIdentifiedObject();
			case CorePackage.BASIC_INTERVAL_SCHEDULE: return createBasicIntervalSchedule();
			case CorePackage.CURVE: return createCurve();
			case CorePackage.GEOGRAPHICAL_REGION: return createGeographicalRegion();
			case CorePackage.CURVE_DATA: return createCurveData();
			case CorePackage.SUB_GEOGRAPHICAL_REGION: return createSubGeographicalRegion();
			case CorePackage.NAME_TYPE: return createNameType();
			case CorePackage.SUBSTATION: return createSubstation();
			case CorePackage.NAME: return createName();
			case CorePackage.BASE_VOLTAGE: return createBaseVoltage();
			case CorePackage.TERMINAL: return createTerminal();
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE: return createIrregularIntervalSchedule();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE: return createRegularIntervalSchedule();
			case CorePackage.OPERATING_PARTICIPANT: return createOperatingParticipant();
			case CorePackage.OPERATING_SHARE: return createOperatingShare();
			case CorePackage.VOLTAGE_LEVEL: return createVoltageLevel();
			case CorePackage.REPORTING_SUPER_GROUP: return createReportingSuperGroup();
			case CorePackage.IRREGULAR_TIME_POINT: return createIrregularTimePoint();
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
			case CorePackage.BREAKER_CONFIGURATION:
				return createBreakerConfigurationFromString(eDataType, initialValue);
			case CorePackage.COMPANY_TYPE:
				return createCompanyTypeFromString(eDataType, initialValue);
			case CorePackage.PHASE_CODE:
				return createPhaseCodeFromString(eDataType, initialValue);
			case CorePackage.CURVE_STYLE:
				return createCurveStyleFromString(eDataType, initialValue);
			case CorePackage.BUSBAR_CONFIGURATION:
				return createBusbarConfigurationFromString(eDataType, initialValue);
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
			case CorePackage.BREAKER_CONFIGURATION:
				return convertBreakerConfigurationToString(eDataType, instanceValue);
			case CorePackage.COMPANY_TYPE:
				return convertCompanyTypeToString(eDataType, instanceValue);
			case CorePackage.PHASE_CODE:
				return convertPhaseCodeToString(eDataType, instanceValue);
			case CorePackage.CURVE_STYLE:
				return convertCurveStyleToString(eDataType, instanceValue);
			case CorePackage.BUSBAR_CONFIGURATION:
				return convertBusbarConfigurationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource createPowerSystemResource() {
		PowerSystemResource powerSystemResource = new PowerSystemResource();
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameTypeAuthority createNameTypeAuthority() {
		NameTypeAuthority nameTypeAuthority = new NameTypeAuthority();
		return nameTypeAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment createEquipment() {
		Equipment equipment = new Equipment();
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment createConductingEquipment() {
		ConductingEquipment conductingEquipment = new ConductingEquipment();
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularTimePoint createRegularTimePoint() {
		RegularTimePoint regularTimePoint = new RegularTimePoint();
		return regularTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode createConnectivityNode() {
		ConnectivityNode connectivityNode = new ConnectivityNode();
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSRType createPSRType() {
		PSRType psrType = new PSRType();
		return psrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer createConnectivityNodeContainer() {
		ConnectivityNodeContainer connectivityNodeContainer = new ConnectivityNodeContainer();
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bay createBay() {
		Bay bay = new Bay();
		return bay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer createEquipmentContainer() {
		EquipmentContainer equipmentContainer = new EquipmentContainer();
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup createReportingGroup() {
		ReportingGroup reportingGroup = new ReportingGroup();
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePower createBasePower() {
		BasePower basePower = new BasePower();
		return basePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsrList createPsrList() {
		PsrList psrList = new PsrList();
		return psrList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedObject createIdentifiedObject() {
		IdentifiedObject identifiedObject = new IdentifiedObject();
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIntervalSchedule createBasicIntervalSchedule() {
		BasicIntervalSchedule basicIntervalSchedule = new BasicIntervalSchedule();
		return basicIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve createCurve() {
		Curve curve = new Curve();
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion createGeographicalRegion() {
		GeographicalRegion geographicalRegion = new GeographicalRegion();
		return geographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveData createCurveData() {
		CurveData curveData = new CurveData();
		return curveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion createSubGeographicalRegion() {
		SubGeographicalRegion subGeographicalRegion = new SubGeographicalRegion();
		return subGeographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameType() {
		NameType nameType = new NameType();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		Substation substation = new Substation();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		Name name = new Name();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage createBaseVoltage() {
		BaseVoltage baseVoltage = new BaseVoltage();
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		Terminal terminal = new Terminal();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularIntervalSchedule createIrregularIntervalSchedule() {
		IrregularIntervalSchedule irregularIntervalSchedule = new IrregularIntervalSchedule();
		return irregularIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularIntervalSchedule createRegularIntervalSchedule() {
		RegularIntervalSchedule regularIntervalSchedule = new RegularIntervalSchedule();
		return regularIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingParticipant createOperatingParticipant() {
		OperatingParticipant operatingParticipant = new OperatingParticipant();
		return operatingParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingShare createOperatingShare() {
		OperatingShare operatingShare = new OperatingShare();
		return operatingShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel createVoltageLevel() {
		VoltageLevel voltageLevel = new VoltageLevel();
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingSuperGroup createReportingSuperGroup() {
		ReportingSuperGroup reportingSuperGroup = new ReportingSuperGroup();
		return reportingSuperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularTimePoint createIrregularTimePoint() {
		IrregularTimePoint irregularTimePoint = new IrregularTimePoint();
		return irregularTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakerConfiguration createBreakerConfigurationFromString(EDataType eDataType, String initialValue) {
		BreakerConfiguration result = BreakerConfiguration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakerConfigurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyType createCompanyTypeFromString(EDataType eDataType, String initialValue) {
		CompanyType result = CompanyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompanyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode createPhaseCodeFromString(EDataType eDataType, String initialValue) {
		PhaseCode result = PhaseCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveStyle createCurveStyleFromString(EDataType eDataType, String initialValue) {
		CurveStyle result = CurveStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarConfiguration createBusbarConfigurationFromString(EDataType eDataType, String initialValue) {
		BusbarConfiguration result = BusbarConfiguration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusbarConfigurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactory
