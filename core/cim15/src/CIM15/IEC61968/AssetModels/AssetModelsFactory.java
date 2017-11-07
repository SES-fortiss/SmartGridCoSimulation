/**
 */
package CIM15.IEC61968.AssetModels;

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
public class AssetModelsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssetModelsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssetModelsFactory INSTANCE = CIM15.IEC61968.AssetModels.AssetModelsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssetModelsFactory init() {
		try {
			AssetModelsFactory theAssetModelsFactory = (AssetModelsFactory)EPackage.Registry.INSTANCE.getEFactory(AssetModelsPackage.eNS_URI);
			if (theAssetModelsFactory != null) {
				return theAssetModelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssetModelsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsFactory() {
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST: return createShortCircuitTest();
			case AssetModelsPackage.END_DEVICE_INFO: return createEndDeviceInfo();
			case AssetModelsPackage.WIRE_TYPE: return createWireType();
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO: return createTapeShieldCableInfo();
			case AssetModelsPackage.CONDUCTOR_INFO: return createConductorInfo();
			case AssetModelsPackage.TAP_CHANGER_INFO: return createTapChangerInfo();
			case AssetModelsPackage.TRANSFORMER_TANK_INFO: return createTransformerTankInfo();
			case AssetModelsPackage.POWER_TRANSFORMER_INFO: return createPowerTransformerInfo();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST: return createOpenCircuitTest();
			case AssetModelsPackage.CABLE_INFO: return createCableInfo();
			case AssetModelsPackage.TRANSFORMER_END_INFO: return createTransformerEndInfo();
			case AssetModelsPackage.NO_LOAD_TEST: return createNoLoadTest();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO: return createOverheadConductorInfo();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO: return createConcentricNeutralCableInfo();
			case AssetModelsPackage.WIRE_ARRANGEMENT: return createWireArrangement();
			case AssetModelsPackage.TRANSFORMER_TEST: return createTransformerTest();
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
			case AssetModelsPackage.CABLE_OUTER_JACKET_KIND:
				return createCableOuterJacketKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CONDUCTOR_MATERIAL_KIND:
				return createConductorMaterialKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CONDUCTOR_USAGE_KIND:
				return createConductorUsageKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CABLE_CONSTRUCTION_KIND:
				return createCableConstructionKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CABLE_SHIELD_MATERIAL_KIND:
				return createCableShieldMaterialKindFromString(eDataType, initialValue);
			case AssetModelsPackage.CONDUCTOR_INSULATION_KIND:
				return createConductorInsulationKindFromString(eDataType, initialValue);
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
			case AssetModelsPackage.CABLE_OUTER_JACKET_KIND:
				return convertCableOuterJacketKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CONDUCTOR_MATERIAL_KIND:
				return convertConductorMaterialKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CONDUCTOR_USAGE_KIND:
				return convertConductorUsageKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CABLE_CONSTRUCTION_KIND:
				return convertCableConstructionKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CABLE_SHIELD_MATERIAL_KIND:
				return convertCableShieldMaterialKindToString(eDataType, instanceValue);
			case AssetModelsPackage.CONDUCTOR_INSULATION_KIND:
				return convertConductorInsulationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortCircuitTest createShortCircuitTest() {
		ShortCircuitTest shortCircuitTest = new ShortCircuitTest();
		return shortCircuitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceInfo createEndDeviceInfo() {
		EndDeviceInfo endDeviceInfo = new EndDeviceInfo();
		return endDeviceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType createWireType() {
		WireType wireType = new WireType();
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapeShieldCableInfo createTapeShieldCableInfo() {
		TapeShieldCableInfo tapeShieldCableInfo = new TapeShieldCableInfo();
		return tapeShieldCableInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo createConductorInfo() {
		ConductorInfo conductorInfo = new ConductorInfo();
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerInfo createTapChangerInfo() {
		TapChangerInfo tapChangerInfo = new TapChangerInfo();
		return tapChangerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTankInfo createTransformerTankInfo() {
		TransformerTankInfo transformerTankInfo = new TransformerTankInfo();
		return transformerTankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformerInfo createPowerTransformerInfo() {
		PowerTransformerInfo powerTransformerInfo = new PowerTransformerInfo();
		return powerTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenCircuitTest createOpenCircuitTest() {
		OpenCircuitTest openCircuitTest = new OpenCircuitTest();
		return openCircuitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableInfo createCableInfo() {
		CableInfo cableInfo = new CableInfo();
		return cableInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEndInfo createTransformerEndInfo() {
		TransformerEndInfo transformerEndInfo = new TransformerEndInfo();
		return transformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoLoadTest createNoLoadTest() {
		NoLoadTest noLoadTest = new NoLoadTest();
		return noLoadTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadConductorInfo createOverheadConductorInfo() {
		OverheadConductorInfo overheadConductorInfo = new OverheadConductorInfo();
		return overheadConductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcentricNeutralCableInfo createConcentricNeutralCableInfo() {
		ConcentricNeutralCableInfo concentricNeutralCableInfo = new ConcentricNeutralCableInfo();
		return concentricNeutralCableInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireArrangement createWireArrangement() {
		WireArrangement wireArrangement = new WireArrangement();
		return wireArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTest createTransformerTest() {
		TransformerTest transformerTest = new TransformerTest();
		return transformerTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableOuterJacketKind createCableOuterJacketKindFromString(EDataType eDataType, String initialValue) {
		CableOuterJacketKind result = CableOuterJacketKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableOuterJacketKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorMaterialKind createConductorMaterialKindFromString(EDataType eDataType, String initialValue) {
		ConductorMaterialKind result = ConductorMaterialKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductorMaterialKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorUsageKind createConductorUsageKindFromString(EDataType eDataType, String initialValue) {
		ConductorUsageKind result = ConductorUsageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductorUsageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableConstructionKind createCableConstructionKindFromString(EDataType eDataType, String initialValue) {
		CableConstructionKind result = CableConstructionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableConstructionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableShieldMaterialKind createCableShieldMaterialKindFromString(EDataType eDataType, String initialValue) {
		CableShieldMaterialKind result = CableShieldMaterialKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCableShieldMaterialKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInsulationKind createConductorInsulationKindFromString(EDataType eDataType, String initialValue) {
		ConductorInsulationKind result = ConductorInsulationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConductorInsulationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsPackage getAssetModelsPackage() {
		return (AssetModelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssetModelsPackage getPackage() {
		return AssetModelsPackage.eINSTANCE;
	}

} //AssetModelsFactory
