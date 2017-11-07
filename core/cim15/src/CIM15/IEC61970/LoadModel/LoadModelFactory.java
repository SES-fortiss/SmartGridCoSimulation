/**
 */
package CIM15.IEC61970.LoadModel;

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
public class LoadModelFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadModelFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadModelFactory INSTANCE = CIM15.IEC61970.LoadModel.LoadModelFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadModelFactory init() {
		try {
			LoadModelFactory theLoadModelFactory = (LoadModelFactory)EPackage.Registry.INSTANCE.getEFactory(LoadModelPackage.eNS_URI);
			if (theLoadModelFactory != null) {
				return theLoadModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoadModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelFactory() {
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
			case LoadModelPackage.CONFORM_LOAD: return createConformLoad();
			case LoadModelPackage.CONFORM_LOAD_GROUP: return createConformLoadGroup();
			case LoadModelPackage.SEASON_DAY_TYPE_SCHEDULE: return createSeasonDayTypeSchedule();
			case LoadModelPackage.LOAD_GROUP: return createLoadGroup();
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE: return createConformLoadSchedule();
			case LoadModelPackage.LOAD_AREA: return createLoadArea();
			case LoadModelPackage.POWER_CUT_ZONE: return createPowerCutZone();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC: return createLoadResponseCharacteristic();
			case LoadModelPackage.NON_CONFORM_LOAD: return createNonConformLoad();
			case LoadModelPackage.STATION_SUPPLY: return createStationSupply();
			case LoadModelPackage.ENERGY_AREA: return createEnergyArea();
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE: return createNonConformLoadSchedule();
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP: return createNonConformLoadGroup();
			case LoadModelPackage.DAY_TYPE: return createDayType();
			case LoadModelPackage.SUB_LOAD_AREA: return createSubLoadArea();
			case LoadModelPackage.SEASON: return createSeason();
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
			case LoadModelPackage.SEASON_NAME:
				return createSeasonNameFromString(eDataType, initialValue);
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
			case LoadModelPackage.SEASON_NAME:
				return convertSeasonNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoad createConformLoad() {
		ConformLoad conformLoad = new ConformLoad();
		return conformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup createConformLoadGroup() {
		ConformLoadGroup conformLoadGroup = new ConformLoadGroup();
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonDayTypeSchedule createSeasonDayTypeSchedule() {
		SeasonDayTypeSchedule seasonDayTypeSchedule = new SeasonDayTypeSchedule();
		return seasonDayTypeSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadGroup createLoadGroup() {
		LoadGroup loadGroup = new LoadGroup();
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadSchedule createConformLoadSchedule() {
		ConformLoadSchedule conformLoadSchedule = new ConformLoadSchedule();
		return conformLoadSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea createLoadArea() {
		LoadArea loadArea = new LoadArea();
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCutZone createPowerCutZone() {
		PowerCutZone powerCutZone = new PowerCutZone();
		return powerCutZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic createLoadResponseCharacteristic() {
		LoadResponseCharacteristic loadResponseCharacteristic = new LoadResponseCharacteristic();
		return loadResponseCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoad createNonConformLoad() {
		NonConformLoad nonConformLoad = new NonConformLoad();
		return nonConformLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationSupply createStationSupply() {
		StationSupply stationSupply = new StationSupply();
		return stationSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyArea createEnergyArea() {
		EnergyArea energyArea = new EnergyArea();
		return energyArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadSchedule createNonConformLoadSchedule() {
		NonConformLoadSchedule nonConformLoadSchedule = new NonConformLoadSchedule();
		return nonConformLoadSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup createNonConformLoadGroup() {
		NonConformLoadGroup nonConformLoadGroup = new NonConformLoadGroup();
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType createDayType() {
		DayType dayType = new DayType();
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea createSubLoadArea() {
		SubLoadArea subLoadArea = new SubLoadArea();
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeason() {
		Season season = new Season();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonName createSeasonNameFromString(EDataType eDataType, String initialValue) {
		SeasonName result = SeasonName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeasonNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelPackage getLoadModelPackage() {
		return (LoadModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoadModelPackage getPackage() {
		return LoadModelPackage.eINSTANCE;
	}

} //LoadModelFactory
