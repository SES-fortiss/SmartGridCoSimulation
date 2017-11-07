/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiresFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WiresFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WiresFactory INSTANCE = CIM15.IEC61970.Wires.WiresFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiresFactory init() {
		try {
			WiresFactory theWiresFactory = (WiresFactory)EPackage.Registry.INSTANCE.getEFactory(WiresPackage.eNS_URI);
			if (theWiresFactory != null) {
				return theWiresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiresFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresFactory() {
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
			case WiresPackage.PHASE_IMPEDANCE_DATA: return createPhaseImpedanceData();
			case WiresPackage.TAP_SCHEDULE: return createTapSchedule();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE: return createTransformerStarImpedance();
			case WiresPackage.RECLOSER: return createRecloser();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT: return createRatioTapChangerTabularPoint();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR: return createPhaseTapChangerTabular();
			case WiresPackage.RATIO_TAP_CHANGER: return createRatioTapChanger();
			case WiresPackage.PHASE_TAP_CHANGER_LINEAR: return createPhaseTapChangerLinear();
			case WiresPackage.AC_LINE_SEGMENT: return createACLineSegment();
			case WiresPackage.POWER_TRANSFORMER_END: return createPowerTransformerEnd();
			case WiresPackage.JUNCTION: return createJunction();
			case WiresPackage.REGULATING_COND_EQ: return createRegulatingCondEq();
			case WiresPackage.SECTIONALISER: return createSectionaliser();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR: return createRatioTapChangerTabular();
			case WiresPackage.POWER_TRANSFORMER: return createPowerTransformer();
			case WiresPackage.FUSE: return createFuse();
			case WiresPackage.ENERGY_CONSUMER: return createEnergyConsumer();
			case WiresPackage.DISCONNECTOR: return createDisconnector();
			case WiresPackage.CONNECTOR: return createConnector();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE: return createReactiveCapabilityCurve();
			case WiresPackage.PLANT: return createPlant();
			case WiresPackage.GROUND_DISCONNECTOR: return createGroundDisconnector();
			case WiresPackage.RESISTOR: return createResistor();
			case WiresPackage.SYNCHRONOUS_MACHINE: return createSynchronousMachine();
			case WiresPackage.PHASE_TAP_CHANGER_ASYMETRICAL: return createPhaseTapChangerAsymetrical();
			case WiresPackage.RECTIFIER_INVERTER: return createRectifierInverter();
			case WiresPackage.SERIES_COMPENSATOR: return createSeriesCompensator();
			case WiresPackage.TAP_CHANGER_CONTROL: return createTapChangerControl();
			case WiresPackage.REGULATING_CONTROL: return createRegulatingControl();
			case WiresPackage.PROTECTED_SWITCH: return createProtectedSwitch();
			case WiresPackage.PHASE_TAP_CHANGER: return createPhaseTapChanger();
			case WiresPackage.GROUND: return createGround();
			case WiresPackage.COMPOSITE_SWITCH: return createCompositeSwitch();
			case WiresPackage.REGULATION_SCHEDULE: return createRegulationSchedule();
			case WiresPackage.TRANSFORMER_TANK_END: return createTransformerTankEnd();
			case WiresPackage.BREAKER: return createBreaker();
			case WiresPackage.MUTUAL_COUPLING: return createMutualCoupling();
			case WiresPackage.LINE: return createLine();
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE: return createPerLengthPhaseImpedance();
			case WiresPackage.FREQUENCY_CONVERTER: return createFrequencyConverter();
			case WiresPackage.SHUNT_COMPENSATOR: return createShuntCompensator();
			case WiresPackage.VOLTAGE_CONTROL_ZONE: return createVoltageControlZone();
			case WiresPackage.LOAD_BREAK_SWITCH: return createLoadBreakSwitch();
			case WiresPackage.BUSBAR_SECTION: return createBusbarSection();
			case WiresPackage.TRANSFORMER_END: return createTransformerEnd();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE: return createTransformerCoreAdmittance();
			case WiresPackage.STATIC_VAR_COMPENSATOR: return createStaticVarCompensator();
			case WiresPackage.SWITCH: return createSwitch();
			case WiresPackage.PER_LENGTH_SEQUENCE_IMPEDANCE: return createPerLengthSequenceImpedance();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE: return createTransformerMeshImpedance();
			case WiresPackage.SWITCH_SCHEDULE: return createSwitchSchedule();
			case WiresPackage.ENERGY_SOURCE: return createEnergySource();
			case WiresPackage.TRANSFORMER_TANK: return createTransformerTank();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT: return createPhaseTapChangerTabularPoint();
			case WiresPackage.DC_LINE_SEGMENT: return createDCLineSegment();
			case WiresPackage.TAP_CHANGER: return createTapChanger();
			case WiresPackage.CONDUCTOR: return createConductor();
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR: return createPhaseTapChangerNonLinear();
			case WiresPackage.PHASE_TAP_CHANGER_SYMETRICAL: return createPhaseTapChangerSymetrical();
			case WiresPackage.JUMPER: return createJumper();
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
			case WiresPackage.TAP_CHANGER_KIND:
				return createTapChangerKindFromString(eDataType, initialValue);
			case WiresPackage.WINDING_TYPE:
				return createWindingTypeFromString(eDataType, initialValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return createSynchronousMachineOperatingModeFromString(eDataType, initialValue);
			case WiresPackage.TRANSFORMER_CONTROL_MODE:
				return createTransformerControlModeFromString(eDataType, initialValue);
			case WiresPackage.COOLANT_TYPE:
				return createCoolantTypeFromString(eDataType, initialValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_TYPE:
				return createSynchronousMachineTypeFromString(eDataType, initialValue);
			case WiresPackage.PHASE_TAP_CHANGER_KIND:
				return createPhaseTapChangerKindFromString(eDataType, initialValue);
			case WiresPackage.SVC_CONTROL_MODE:
				return createSVCControlModeFromString(eDataType, initialValue);
			case WiresPackage.REGULATING_CONTROL_MODE_KIND:
				return createRegulatingControlModeKindFromString(eDataType, initialValue);
			case WiresPackage.WINDING_CONNECTION:
				return createWindingConnectionFromString(eDataType, initialValue);
			case WiresPackage.COMPOSITE_SWITCH_TYPE:
				return createCompositeSwitchTypeFromString(eDataType, initialValue);
			case WiresPackage.OPERATING_MODE:
				return createOperatingModeFromString(eDataType, initialValue);
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
			case WiresPackage.TAP_CHANGER_KIND:
				return convertTapChangerKindToString(eDataType, instanceValue);
			case WiresPackage.WINDING_TYPE:
				return convertWindingTypeToString(eDataType, instanceValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_OPERATING_MODE:
				return convertSynchronousMachineOperatingModeToString(eDataType, instanceValue);
			case WiresPackage.TRANSFORMER_CONTROL_MODE:
				return convertTransformerControlModeToString(eDataType, instanceValue);
			case WiresPackage.COOLANT_TYPE:
				return convertCoolantTypeToString(eDataType, instanceValue);
			case WiresPackage.SYNCHRONOUS_MACHINE_TYPE:
				return convertSynchronousMachineTypeToString(eDataType, instanceValue);
			case WiresPackage.PHASE_TAP_CHANGER_KIND:
				return convertPhaseTapChangerKindToString(eDataType, instanceValue);
			case WiresPackage.SVC_CONTROL_MODE:
				return convertSVCControlModeToString(eDataType, instanceValue);
			case WiresPackage.REGULATING_CONTROL_MODE_KIND:
				return convertRegulatingControlModeKindToString(eDataType, instanceValue);
			case WiresPackage.WINDING_CONNECTION:
				return convertWindingConnectionToString(eDataType, instanceValue);
			case WiresPackage.COMPOSITE_SWITCH_TYPE:
				return convertCompositeSwitchTypeToString(eDataType, instanceValue);
			case WiresPackage.OPERATING_MODE:
				return convertOperatingModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseImpedanceData createPhaseImpedanceData() {
		PhaseImpedanceData phaseImpedanceData = new PhaseImpedanceData();
		return phaseImpedanceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapSchedule createTapSchedule() {
		TapSchedule tapSchedule = new TapSchedule();
		return tapSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerStarImpedance createTransformerStarImpedance() {
		TransformerStarImpedance transformerStarImpedance = new TransformerStarImpedance();
		return transformerStarImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recloser createRecloser() {
		Recloser recloser = new Recloser();
		return recloser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChangerTabularPoint createRatioTapChangerTabularPoint() {
		RatioTapChangerTabularPoint ratioTapChangerTabularPoint = new RatioTapChangerTabularPoint();
		return ratioTapChangerTabularPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerTabular createPhaseTapChangerTabular() {
		PhaseTapChangerTabular phaseTapChangerTabular = new PhaseTapChangerTabular();
		return phaseTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger createRatioTapChanger() {
		RatioTapChanger ratioTapChanger = new RatioTapChanger();
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerLinear createPhaseTapChangerLinear() {
		PhaseTapChangerLinear phaseTapChangerLinear = new PhaseTapChangerLinear();
		return phaseTapChangerLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACLineSegment createACLineSegment() {
		ACLineSegment acLineSegment = new ACLineSegment();
		return acLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformerEnd createPowerTransformerEnd() {
		PowerTransformerEnd powerTransformerEnd = new PowerTransformerEnd();
		return powerTransformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Junction createJunction() {
		Junction junction = new Junction();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingCondEq createRegulatingCondEq() {
		RegulatingCondEq regulatingCondEq = new RegulatingCondEq();
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sectionaliser createSectionaliser() {
		Sectionaliser sectionaliser = new Sectionaliser();
		return sectionaliser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChangerTabular createRatioTapChangerTabular() {
		RatioTapChangerTabular ratioTapChangerTabular = new RatioTapChangerTabular();
		return ratioTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer createPowerTransformer() {
		PowerTransformer powerTransformer = new PowerTransformer();
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuse createFuse() {
		Fuse fuse = new Fuse();
		return fuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer createEnergyConsumer() {
		EnergyConsumer energyConsumer = new EnergyConsumer();
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disconnector createDisconnector() {
		Disconnector disconnector = new Disconnector();
		return disconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		Connector connector = new Connector();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve createReactiveCapabilityCurve() {
		ReactiveCapabilityCurve reactiveCapabilityCurve = new ReactiveCapabilityCurve();
		return reactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant createPlant() {
		Plant plant = new Plant();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundDisconnector createGroundDisconnector() {
		GroundDisconnector groundDisconnector = new GroundDisconnector();
		return groundDisconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resistor createResistor() {
		Resistor resistor = new Resistor();
		return resistor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachine createSynchronousMachine() {
		SynchronousMachine synchronousMachine = new SynchronousMachine();
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerAsymetrical createPhaseTapChangerAsymetrical() {
		PhaseTapChangerAsymetrical phaseTapChangerAsymetrical = new PhaseTapChangerAsymetrical();
		return phaseTapChangerAsymetrical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifierInverter createRectifierInverter() {
		RectifierInverter rectifierInverter = new RectifierInverter();
		return rectifierInverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesCompensator createSeriesCompensator() {
		SeriesCompensator seriesCompensator = new SeriesCompensator();
		return seriesCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerControl createTapChangerControl() {
		TapChangerControl tapChangerControl = new TapChangerControl();
		return tapChangerControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl createRegulatingControl() {
		RegulatingControl regulatingControl = new RegulatingControl();
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectedSwitch createProtectedSwitch() {
		ProtectedSwitch protectedSwitch = new ProtectedSwitch();
		return protectedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger createPhaseTapChanger() {
		PhaseTapChanger phaseTapChanger = new PhaseTapChanger();
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ground createGround() {
		Ground ground = new Ground();
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitch createCompositeSwitch() {
		CompositeSwitch compositeSwitch = new CompositeSwitch();
		return compositeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationSchedule createRegulationSchedule() {
		RegulationSchedule regulationSchedule = new RegulationSchedule();
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTankEnd createTransformerTankEnd() {
		TransformerTankEnd transformerTankEnd = new TransformerTankEnd();
		return transformerTankEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breaker createBreaker() {
		Breaker breaker = new Breaker();
		return breaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutualCoupling createMutualCoupling() {
		MutualCoupling mutualCoupling = new MutualCoupling();
		return mutualCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		Line line = new Line();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance createPerLengthPhaseImpedance() {
		PerLengthPhaseImpedance perLengthPhaseImpedance = new PerLengthPhaseImpedance();
		return perLengthPhaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConverter createFrequencyConverter() {
		FrequencyConverter frequencyConverter = new FrequencyConverter();
		return frequencyConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator createShuntCompensator() {
		ShuntCompensator shuntCompensator = new ShuntCompensator();
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageControlZone createVoltageControlZone() {
		VoltageControlZone voltageControlZone = new VoltageControlZone();
		return voltageControlZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBreakSwitch createLoadBreakSwitch() {
		LoadBreakSwitch loadBreakSwitch = new LoadBreakSwitch();
		return loadBreakSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarSection createBusbarSection() {
		BusbarSection busbarSection = new BusbarSection();
		return busbarSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEnd createTransformerEnd() {
		TransformerEnd transformerEnd = new TransformerEnd();
		return transformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerCoreAdmittance createTransformerCoreAdmittance() {
		TransformerCoreAdmittance transformerCoreAdmittance = new TransformerCoreAdmittance();
		return transformerCoreAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticVarCompensator createStaticVarCompensator() {
		StaticVarCompensator staticVarCompensator = new StaticVarCompensator();
		return staticVarCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		Switch switch_ = new Switch();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthSequenceImpedance createPerLengthSequenceImpedance() {
		PerLengthSequenceImpedance perLengthSequenceImpedance = new PerLengthSequenceImpedance();
		return perLengthSequenceImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerMeshImpedance createTransformerMeshImpedance() {
		TransformerMeshImpedance transformerMeshImpedance = new TransformerMeshImpedance();
		return transformerMeshImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchSchedule createSwitchSchedule() {
		SwitchSchedule switchSchedule = new SwitchSchedule();
		return switchSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySource createEnergySource() {
		EnergySource energySource = new EnergySource();
		return energySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTank createTransformerTank() {
		TransformerTank transformerTank = new TransformerTank();
		return transformerTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerTabularPoint createPhaseTapChangerTabularPoint() {
		PhaseTapChangerTabularPoint phaseTapChangerTabularPoint = new PhaseTapChangerTabularPoint();
		return phaseTapChangerTabularPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCLineSegment createDCLineSegment() {
		DCLineSegment dcLineSegment = new DCLineSegment();
		return dcLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger createTapChanger() {
		TapChanger tapChanger = new TapChanger();
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor createConductor() {
		Conductor conductor = new Conductor();
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerNonLinear createPhaseTapChangerNonLinear() {
		PhaseTapChangerNonLinear phaseTapChangerNonLinear = new PhaseTapChangerNonLinear();
		return phaseTapChangerNonLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerSymetrical createPhaseTapChangerSymetrical() {
		PhaseTapChangerSymetrical phaseTapChangerSymetrical = new PhaseTapChangerSymetrical();
		return phaseTapChangerSymetrical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jumper createJumper() {
		Jumper jumper = new Jumper();
		return jumper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerKind createTapChangerKindFromString(EDataType eDataType, String initialValue) {
		TapChangerKind result = TapChangerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTapChangerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingType createWindingTypeFromString(EDataType eDataType, String initialValue) {
		WindingType result = WindingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineOperatingMode createSynchronousMachineOperatingModeFromString(EDataType eDataType, String initialValue) {
		SynchronousMachineOperatingMode result = SynchronousMachineOperatingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronousMachineOperatingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerControlMode createTransformerControlModeFromString(EDataType eDataType, String initialValue) {
		TransformerControlMode result = TransformerControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoolantType createCoolantTypeFromString(EDataType eDataType, String initialValue) {
		CoolantType result = CoolantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoolantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachineType createSynchronousMachineTypeFromString(EDataType eDataType, String initialValue) {
		SynchronousMachineType result = SynchronousMachineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronousMachineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerKind createPhaseTapChangerKindFromString(EDataType eDataType, String initialValue) {
		PhaseTapChangerKind result = PhaseTapChangerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhaseTapChangerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVCControlMode createSVCControlModeFromString(EDataType eDataType, String initialValue) {
		SVCControlMode result = SVCControlMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSVCControlModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControlModeKind createRegulatingControlModeKindFromString(EDataType eDataType, String initialValue) {
		RegulatingControlModeKind result = RegulatingControlModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegulatingControlModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingConnection createWindingConnectionFromString(EDataType eDataType, String initialValue) {
		WindingConnection result = WindingConnection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingConnectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCompositeSwitchTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeSwitchTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOperatingModeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatingModeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresPackage getWiresPackage() {
		return (WiresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiresPackage getPackage() {
		return WiresPackage.eINSTANCE;
	}

} //WiresFactory
