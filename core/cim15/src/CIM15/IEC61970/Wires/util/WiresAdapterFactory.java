/**
 */
package CIM15.IEC61970.Wires.util;

import CIM15.Element;

import CIM15.IEC61970.Core.BasicIntervalSchedule;
import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.ConnectivityNodeContainer;
import CIM15.IEC61970.Core.Curve;
import CIM15.IEC61970.Core.Equipment;
import CIM15.IEC61970.Core.EquipmentContainer;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;
import CIM15.IEC61970.Core.RegularIntervalSchedule;

import CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule;

import CIM15.IEC61970.Wires.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Wires.WiresPackage
 * @generated
 */
public class WiresAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiresPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WiresPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiresSwitch<Adapter> modelSwitch =
		new WiresSwitch<Adapter>() {
			@Override
			public Adapter casePhaseImpedanceData(PhaseImpedanceData object) {
				return createPhaseImpedanceDataAdapter();
			}
			@Override
			public Adapter caseTapSchedule(TapSchedule object) {
				return createTapScheduleAdapter();
			}
			@Override
			public Adapter caseTransformerStarImpedance(TransformerStarImpedance object) {
				return createTransformerStarImpedanceAdapter();
			}
			@Override
			public Adapter caseRecloser(Recloser object) {
				return createRecloserAdapter();
			}
			@Override
			public Adapter caseRatioTapChangerTabularPoint(RatioTapChangerTabularPoint object) {
				return createRatioTapChangerTabularPointAdapter();
			}
			@Override
			public Adapter casePhaseTapChangerTabular(PhaseTapChangerTabular object) {
				return createPhaseTapChangerTabularAdapter();
			}
			@Override
			public Adapter caseRatioTapChanger(RatioTapChanger object) {
				return createRatioTapChangerAdapter();
			}
			@Override
			public Adapter casePhaseTapChangerLinear(PhaseTapChangerLinear object) {
				return createPhaseTapChangerLinearAdapter();
			}
			@Override
			public Adapter caseACLineSegment(ACLineSegment object) {
				return createACLineSegmentAdapter();
			}
			@Override
			public Adapter casePowerTransformerEnd(PowerTransformerEnd object) {
				return createPowerTransformerEndAdapter();
			}
			@Override
			public Adapter caseJunction(Junction object) {
				return createJunctionAdapter();
			}
			@Override
			public Adapter caseRegulatingCondEq(RegulatingCondEq object) {
				return createRegulatingCondEqAdapter();
			}
			@Override
			public Adapter caseSectionaliser(Sectionaliser object) {
				return createSectionaliserAdapter();
			}
			@Override
			public Adapter caseRatioTapChangerTabular(RatioTapChangerTabular object) {
				return createRatioTapChangerTabularAdapter();
			}
			@Override
			public Adapter casePowerTransformer(PowerTransformer object) {
				return createPowerTransformerAdapter();
			}
			@Override
			public Adapter caseFuse(Fuse object) {
				return createFuseAdapter();
			}
			@Override
			public Adapter caseEnergyConsumer(EnergyConsumer object) {
				return createEnergyConsumerAdapter();
			}
			@Override
			public Adapter caseDisconnector(Disconnector object) {
				return createDisconnectorAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseReactiveCapabilityCurve(ReactiveCapabilityCurve object) {
				return createReactiveCapabilityCurveAdapter();
			}
			@Override
			public Adapter casePlant(Plant object) {
				return createPlantAdapter();
			}
			@Override
			public Adapter caseGroundDisconnector(GroundDisconnector object) {
				return createGroundDisconnectorAdapter();
			}
			@Override
			public Adapter caseResistor(Resistor object) {
				return createResistorAdapter();
			}
			@Override
			public Adapter caseSynchronousMachine(SynchronousMachine object) {
				return createSynchronousMachineAdapter();
			}
			@Override
			public Adapter casePhaseTapChangerAsymetrical(PhaseTapChangerAsymetrical object) {
				return createPhaseTapChangerAsymetricalAdapter();
			}
			@Override
			public Adapter caseRectifierInverter(RectifierInverter object) {
				return createRectifierInverterAdapter();
			}
			@Override
			public Adapter caseSeriesCompensator(SeriesCompensator object) {
				return createSeriesCompensatorAdapter();
			}
			@Override
			public Adapter caseTapChangerControl(TapChangerControl object) {
				return createTapChangerControlAdapter();
			}
			@Override
			public Adapter caseRegulatingControl(RegulatingControl object) {
				return createRegulatingControlAdapter();
			}
			@Override
			public Adapter caseProtectedSwitch(ProtectedSwitch object) {
				return createProtectedSwitchAdapter();
			}
			@Override
			public Adapter casePhaseTapChanger(PhaseTapChanger object) {
				return createPhaseTapChangerAdapter();
			}
			@Override
			public Adapter caseGround(Ground object) {
				return createGroundAdapter();
			}
			@Override
			public Adapter caseCompositeSwitch(CompositeSwitch object) {
				return createCompositeSwitchAdapter();
			}
			@Override
			public Adapter caseRegulationSchedule(RegulationSchedule object) {
				return createRegulationScheduleAdapter();
			}
			@Override
			public Adapter caseTransformerTankEnd(TransformerTankEnd object) {
				return createTransformerTankEndAdapter();
			}
			@Override
			public Adapter caseBreaker(Breaker object) {
				return createBreakerAdapter();
			}
			@Override
			public Adapter caseMutualCoupling(MutualCoupling object) {
				return createMutualCouplingAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter casePerLengthPhaseImpedance(PerLengthPhaseImpedance object) {
				return createPerLengthPhaseImpedanceAdapter();
			}
			@Override
			public Adapter caseFrequencyConverter(FrequencyConverter object) {
				return createFrequencyConverterAdapter();
			}
			@Override
			public Adapter caseShuntCompensator(ShuntCompensator object) {
				return createShuntCompensatorAdapter();
			}
			@Override
			public Adapter caseVoltageControlZone(VoltageControlZone object) {
				return createVoltageControlZoneAdapter();
			}
			@Override
			public Adapter caseLoadBreakSwitch(LoadBreakSwitch object) {
				return createLoadBreakSwitchAdapter();
			}
			@Override
			public Adapter caseBusbarSection(BusbarSection object) {
				return createBusbarSectionAdapter();
			}
			@Override
			public Adapter caseTransformerEnd(TransformerEnd object) {
				return createTransformerEndAdapter();
			}
			@Override
			public Adapter caseTransformerCoreAdmittance(TransformerCoreAdmittance object) {
				return createTransformerCoreAdmittanceAdapter();
			}
			@Override
			public Adapter caseStaticVarCompensator(StaticVarCompensator object) {
				return createStaticVarCompensatorAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter casePerLengthSequenceImpedance(PerLengthSequenceImpedance object) {
				return createPerLengthSequenceImpedanceAdapter();
			}
			@Override
			public Adapter caseTransformerMeshImpedance(TransformerMeshImpedance object) {
				return createTransformerMeshImpedanceAdapter();
			}
			@Override
			public Adapter caseSwitchSchedule(SwitchSchedule object) {
				return createSwitchScheduleAdapter();
			}
			@Override
			public Adapter caseEnergySource(EnergySource object) {
				return createEnergySourceAdapter();
			}
			@Override
			public Adapter caseTransformerTank(TransformerTank object) {
				return createTransformerTankAdapter();
			}
			@Override
			public Adapter casePhaseTapChangerTabularPoint(PhaseTapChangerTabularPoint object) {
				return createPhaseTapChangerTabularPointAdapter();
			}
			@Override
			public Adapter caseDCLineSegment(DCLineSegment object) {
				return createDCLineSegmentAdapter();
			}
			@Override
			public Adapter caseTapChanger(TapChanger object) {
				return createTapChangerAdapter();
			}
			@Override
			public Adapter caseConductor(Conductor object) {
				return createConductorAdapter();
			}
			@Override
			public Adapter casePhaseTapChangerNonLinear(PhaseTapChangerNonLinear object) {
				return createPhaseTapChangerNonLinearAdapter();
			}
			@Override
			public Adapter casePhaseTapChangerSymetrical(PhaseTapChangerSymetrical object) {
				return createPhaseTapChangerSymetricalAdapter();
			}
			@Override
			public Adapter caseJumper(Jumper object) {
				return createJumperAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseBasicIntervalSchedule(BasicIntervalSchedule object) {
				return createBasicIntervalScheduleAdapter();
			}
			@Override
			public Adapter caseRegularIntervalSchedule(RegularIntervalSchedule object) {
				return createRegularIntervalScheduleAdapter();
			}
			@Override
			public Adapter caseSeasonDayTypeSchedule(SeasonDayTypeSchedule object) {
				return createSeasonDayTypeScheduleAdapter();
			}
			@Override
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
			}
			@Override
			public Adapter caseEquipment(Equipment object) {
				return createEquipmentAdapter();
			}
			@Override
			public Adapter caseConductingEquipment(ConductingEquipment object) {
				return createConductingEquipmentAdapter();
			}
			@Override
			public Adapter caseCurve(Curve object) {
				return createCurveAdapter();
			}
			@Override
			public Adapter caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
				return createConnectivityNodeContainerAdapter();
			}
			@Override
			public Adapter caseEquipmentContainer(EquipmentContainer object) {
				return createEquipmentContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData
	 * @generated
	 */
	public Adapter createPhaseImpedanceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TapSchedule <em>Tap Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TapSchedule
	 * @generated
	 */
	public Adapter createTapScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TransformerStarImpedance <em>Transformer Star Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance
	 * @generated
	 */
	public Adapter createTransformerStarImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Recloser <em>Recloser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Recloser
	 * @generated
	 */
	public Adapter createRecloserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint
	 * @generated
	 */
	public Adapter createRatioTapChangerTabularPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular
	 * @generated
	 */
	public Adapter createPhaseTapChangerTabularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger
	 * @generated
	 */
	public Adapter createRatioTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear <em>Phase Tap Changer Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerLinear
	 * @generated
	 */
	public Adapter createPhaseTapChangerLinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.ACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.ACLineSegment
	 * @generated
	 */
	public Adapter createACLineSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PowerTransformerEnd <em>Power Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd
	 * @generated
	 */
	public Adapter createPowerTransformerEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq
	 * @generated
	 */
	public Adapter createRegulatingCondEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Sectionaliser <em>Sectionaliser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Sectionaliser
	 * @generated
	 */
	public Adapter createSectionaliserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular
	 * @generated
	 */
	public Adapter createRatioTapChangerTabularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PowerTransformer
	 * @generated
	 */
	public Adapter createPowerTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Fuse <em>Fuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Fuse
	 * @generated
	 */
	public Adapter createFuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.EnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer
	 * @generated
	 */
	public Adapter createEnergyConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Disconnector <em>Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Disconnector
	 * @generated
	 */
	public Adapter createDisconnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve
	 * @generated
	 */
	public Adapter createReactiveCapabilityCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Plant
	 * @generated
	 */
	public Adapter createPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.GroundDisconnector <em>Ground Disconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.GroundDisconnector
	 * @generated
	 */
	public Adapter createGroundDisconnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Resistor <em>Resistor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Resistor
	 * @generated
	 */
	public Adapter createResistorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.SynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine
	 * @generated
	 */
	public Adapter createSynchronousMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical <em>Phase Tap Changer Asymetrical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical
	 * @generated
	 */
	public Adapter createPhaseTapChangerAsymetricalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RectifierInverter <em>Rectifier Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RectifierInverter
	 * @generated
	 */
	public Adapter createRectifierInverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.SeriesCompensator <em>Series Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.SeriesCompensator
	 * @generated
	 */
	public Adapter createSeriesCompensatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TapChangerControl <em>Tap Changer Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TapChangerControl
	 * @generated
	 */
	public Adapter createTapChangerControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RegulatingControl
	 * @generated
	 */
	public Adapter createRegulatingControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.ProtectedSwitch <em>Protected Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch
	 * @generated
	 */
	public Adapter createProtectedSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger
	 * @generated
	 */
	public Adapter createPhaseTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Ground <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Ground
	 * @generated
	 */
	public Adapter createGroundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.CompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.CompositeSwitch
	 * @generated
	 */
	public Adapter createCompositeSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.RegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.RegulationSchedule
	 * @generated
	 */
	public Adapter createRegulationScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TransformerTankEnd <em>Transformer Tank End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TransformerTankEnd
	 * @generated
	 */
	public Adapter createTransformerTankEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Breaker <em>Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Breaker
	 * @generated
	 */
	public Adapter createBreakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.MutualCoupling <em>Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.MutualCoupling
	 * @generated
	 */
	public Adapter createMutualCouplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance <em>Per Length Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance
	 * @generated
	 */
	public Adapter createPerLengthPhaseImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.FrequencyConverter <em>Frequency Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.FrequencyConverter
	 * @generated
	 */
	public Adapter createFrequencyConverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.ShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.ShuntCompensator
	 * @generated
	 */
	public Adapter createShuntCompensatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.VoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.VoltageControlZone
	 * @generated
	 */
	public Adapter createVoltageControlZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.LoadBreakSwitch <em>Load Break Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.LoadBreakSwitch
	 * @generated
	 */
	public Adapter createLoadBreakSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.BusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.BusbarSection
	 * @generated
	 */
	public Adapter createBusbarSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TransformerEnd
	 * @generated
	 */
	public Adapter createTransformerEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance <em>Transformer Core Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance
	 * @generated
	 */
	public Adapter createTransformerCoreAdmittanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.StaticVarCompensator <em>Static Var Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.StaticVarCompensator
	 * @generated
	 */
	public Adapter createStaticVarCompensatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance <em>Per Length Sequence Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance
	 * @generated
	 */
	public Adapter createPerLengthSequenceImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance <em>Transformer Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance
	 * @generated
	 */
	public Adapter createTransformerMeshImpedanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.SwitchSchedule <em>Switch Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.SwitchSchedule
	 * @generated
	 */
	public Adapter createSwitchScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.EnergySource <em>Energy Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.EnergySource
	 * @generated
	 */
	public Adapter createEnergySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TransformerTank <em>Transformer Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TransformerTank
	 * @generated
	 */
	public Adapter createTransformerTankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint
	 * @generated
	 */
	public Adapter createPhaseTapChangerTabularPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.DCLineSegment <em>DC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.DCLineSegment
	 * @generated
	 */
	public Adapter createDCLineSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.TapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.TapChanger
	 * @generated
	 */
	public Adapter createTapChangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Conductor
	 * @generated
	 */
	public Adapter createConductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear <em>Phase Tap Changer Non Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerNonLinear
	 * @generated
	 */
	public Adapter createPhaseTapChangerNonLinearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.PhaseTapChangerSymetrical <em>Phase Tap Changer Symetrical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerSymetrical
	 * @generated
	 */
	public Adapter createPhaseTapChangerSymetricalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Wires.Jumper <em>Jumper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Wires.Jumper
	 * @generated
	 */
	public Adapter createJumperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.BasicIntervalSchedule <em>Basic Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.BasicIntervalSchedule
	 * @generated
	 */
	public Adapter createBasicIntervalScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.RegularIntervalSchedule <em>Regular Interval Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.RegularIntervalSchedule
	 * @generated
	 */
	public Adapter createRegularIntervalScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule
	 * @generated
	 */
	public Adapter createSeasonDayTypeScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.PowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.PowerSystemResource
	 * @generated
	 */
	public Adapter createPowerSystemResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.Equipment
	 * @generated
	 */
	public Adapter createEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.ConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.ConductingEquipment
	 * @generated
	 */
	public Adapter createConductingEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.Curve
	 * @generated
	 */
	public Adapter createCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer
	 * @generated
	 */
	public Adapter createConnectivityNodeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.EquipmentContainer <em>Equipment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.EquipmentContainer
	 * @generated
	 */
	public Adapter createEquipmentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WiresAdapterFactory
