/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

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
public class GenerationDynamicsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GenerationDynamicsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GenerationDynamicsFactory INSTANCE = CIM15.IEC61970.Generation.GenerationDynamics.GenerationDynamicsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerationDynamicsFactory init() {
		try {
			GenerationDynamicsFactory theGenerationDynamicsFactory = (GenerationDynamicsFactory)EPackage.Registry.INSTANCE.getEFactory(GenerationDynamicsPackage.eNS_URI);
			if (theGenerationDynamicsFactory != null) {
				return theGenerationDynamicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenerationDynamicsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationDynamicsFactory() {
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
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY: return createBWRSteamSupply();
			case GenerationDynamicsPackage.HYDRO_TURBINE: return createHydroTurbine();
			case GenerationDynamicsPackage.STEAM_TURBINE: return createSteamTurbine();
			case GenerationDynamicsPackage.STEAM_SUPPLY: return createSteamSupply();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY: return createFossilSteamSupply();
			case GenerationDynamicsPackage.SUBCRITICAL: return createSubcritical();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY: return createPWRSteamSupply();
			case GenerationDynamicsPackage.PRIME_MOVER: return createPrimeMover();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE: return createCombustionTurbine();
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER: return createHeatRecoveryBoiler();
			case GenerationDynamicsPackage.SUPERCRITICAL: return createSupercritical();
			case GenerationDynamicsPackage.DRUM_BOILER: return createDrumBoiler();
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE: return createCTTempActivePowerCurve();
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
			case GenerationDynamicsPackage.TURBINE_TYPE:
				return createTurbineTypeFromString(eDataType, initialValue);
			case GenerationDynamicsPackage.BOILER_CONTROL_MODE:
				return createBoilerControlModeFromString(eDataType, initialValue);
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
			case GenerationDynamicsPackage.TURBINE_TYPE:
				return convertTurbineTypeToString(eDataType, instanceValue);
			case GenerationDynamicsPackage.BOILER_CONTROL_MODE:
				return convertBoilerControlModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWRSteamSupply createBWRSteamSupply() {
		BWRSteamSupply bwrSteamSupply = new BWRSteamSupply();
		return bwrSteamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroTurbine createHydroTurbine() {
		HydroTurbine hydroTurbine = new HydroTurbine();
		return hydroTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamTurbine createSteamTurbine() {
		SteamTurbine steamTurbine = new SteamTurbine();
		return steamTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamSupply createSteamSupply() {
		SteamSupply steamSupply = new SteamSupply();
		return steamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FossilSteamSupply createFossilSteamSupply() {
		FossilSteamSupply fossilSteamSupply = new FossilSteamSupply();
		return fossilSteamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcritical createSubcritical() {
		Subcritical subcritical = new Subcritical();
		return subcritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PWRSteamSupply createPWRSteamSupply() {
		PWRSteamSupply pwrSteamSupply = new PWRSteamSupply();
		return pwrSteamSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimeMover createPrimeMover() {
		PrimeMover primeMover = new PrimeMover();
		return primeMover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombustionTurbine createCombustionTurbine() {
		CombustionTurbine combustionTurbine = new CombustionTurbine();
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRecoveryBoiler createHeatRecoveryBoiler() {
		HeatRecoveryBoiler heatRecoveryBoiler = new HeatRecoveryBoiler();
		return heatRecoveryBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supercritical createSupercritical() {
		Supercritical supercritical = new Supercritical();
		return supercritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrumBoiler createDrumBoiler() {
		DrumBoiler drumBoiler = new DrumBoiler();
		return drumBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTempActivePowerCurve createCTTempActivePowerCurve() {
		CTTempActivePowerCurve ctTempActivePowerCurve = new CTTempActivePowerCurve();
		return ctTempActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineType createTurbineTypeFromString(EDataType eDataType, String initialValue) {
		TurbineType result = TurbineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTurbineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoilerControlMode createBoilerControlModeFromString(EDataType eDataType, String initialValue) {
		BoilerControlMode result = BoilerControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoilerControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationDynamicsPackage getGenerationDynamicsPackage() {
		return (GenerationDynamicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenerationDynamicsPackage getPackage() {
		return GenerationDynamicsPackage.eINSTANCE;
	}

} //GenerationDynamicsFactory
