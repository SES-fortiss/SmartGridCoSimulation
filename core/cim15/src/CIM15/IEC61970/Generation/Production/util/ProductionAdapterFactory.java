/**
 */
package CIM15.IEC61970.Generation.Production.util;

import CIM15.Element;

import CIM15.IEC61970.Core.BasicIntervalSchedule;
import CIM15.IEC61970.Core.Curve;
import CIM15.IEC61970.Core.Equipment;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;
import CIM15.IEC61970.Core.RegularIntervalSchedule;

import CIM15.IEC61970.Generation.Production.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Generation.Production.ProductionPackage
 * @generated
 */
public class ProductionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProductionPackage.eINSTANCE;
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
	protected ProductionSwitch<Adapter> modelSwitch =
		new ProductionSwitch<Adapter>() {
			@Override
			public Adapter caseReservoir(Reservoir object) {
				return createReservoirAdapter();
			}
			@Override
			public Adapter caseCogenerationPlant(CogenerationPlant object) {
				return createCogenerationPlantAdapter();
			}
			@Override
			public Adapter caseGenUnitOpSchedule(GenUnitOpSchedule object) {
				return createGenUnitOpScheduleAdapter();
			}
			@Override
			public Adapter caseFuelAllocationSchedule(FuelAllocationSchedule object) {
				return createFuelAllocationScheduleAdapter();
			}
			@Override
			public Adapter caseGrossToNetActivePowerCurve(GrossToNetActivePowerCurve object) {
				return createGrossToNetActivePowerCurveAdapter();
			}
			@Override
			public Adapter caseLevelVsVolumeCurve(LevelVsVolumeCurve object) {
				return createLevelVsVolumeCurveAdapter();
			}
			@Override
			public Adapter caseStartRampCurve(StartRampCurve object) {
				return createStartRampCurveAdapter();
			}
			@Override
			public Adapter caseNuclearGeneratingUnit(NuclearGeneratingUnit object) {
				return createNuclearGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseEmissionCurve(EmissionCurve object) {
				return createEmissionCurveAdapter();
			}
			@Override
			public Adapter caseHydroPumpOpSchedule(HydroPumpOpSchedule object) {
				return createHydroPumpOpScheduleAdapter();
			}
			@Override
			public Adapter caseSteamSendoutSchedule(SteamSendoutSchedule object) {
				return createSteamSendoutScheduleAdapter();
			}
			@Override
			public Adapter caseTargetLevelSchedule(TargetLevelSchedule object) {
				return createTargetLevelScheduleAdapter();
			}
			@Override
			public Adapter caseCombinedCyclePlant(CombinedCyclePlant object) {
				return createCombinedCyclePlantAdapter();
			}
			@Override
			public Adapter caseHeatRateCurve(HeatRateCurve object) {
				return createHeatRateCurveAdapter();
			}
			@Override
			public Adapter caseThermalGeneratingUnit(ThermalGeneratingUnit object) {
				return createThermalGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseEmissionAccount(EmissionAccount object) {
				return createEmissionAccountAdapter();
			}
			@Override
			public Adapter casePenstockLossCurve(PenstockLossCurve object) {
				return createPenstockLossCurveAdapter();
			}
			@Override
			public Adapter caseStartupModel(StartupModel object) {
				return createStartupModelAdapter();
			}
			@Override
			public Adapter caseHydroGeneratingUnit(HydroGeneratingUnit object) {
				return createHydroGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseGenUnitOpCostCurve(GenUnitOpCostCurve object) {
				return createGenUnitOpCostCurveAdapter();
			}
			@Override
			public Adapter caseIncrementalHeatRateCurve(IncrementalHeatRateCurve object) {
				return createIncrementalHeatRateCurveAdapter();
			}
			@Override
			public Adapter caseFossilFuel(FossilFuel object) {
				return createFossilFuelAdapter();
			}
			@Override
			public Adapter caseGeneratingUnit(GeneratingUnit object) {
				return createGeneratingUnitAdapter();
			}
			@Override
			public Adapter caseStartIgnFuelCurve(StartIgnFuelCurve object) {
				return createStartIgnFuelCurveAdapter();
			}
			@Override
			public Adapter caseStartMainFuelCurve(StartMainFuelCurve object) {
				return createStartMainFuelCurveAdapter();
			}
			@Override
			public Adapter caseTailbayLossCurve(TailbayLossCurve object) {
				return createTailbayLossCurveAdapter();
			}
			@Override
			public Adapter caseHydroPump(HydroPump object) {
				return createHydroPumpAdapter();
			}
			@Override
			public Adapter caseInflowForecast(InflowForecast object) {
				return createInflowForecastAdapter();
			}
			@Override
			public Adapter caseHydroGeneratingEfficiencyCurve(HydroGeneratingEfficiencyCurve object) {
				return createHydroGeneratingEfficiencyCurveAdapter();
			}
			@Override
			public Adapter caseShutdownCurve(ShutdownCurve object) {
				return createShutdownCurveAdapter();
			}
			@Override
			public Adapter caseHydroPowerPlant(HydroPowerPlant object) {
				return createHydroPowerPlantAdapter();
			}
			@Override
			public Adapter caseCAESPlant(CAESPlant object) {
				return createCAESPlantAdapter();
			}
			@Override
			public Adapter caseAirCompressor(AirCompressor object) {
				return createAirCompressorAdapter();
			}
			@Override
			public Adapter caseHeatInputCurve(HeatInputCurve object) {
				return createHeatInputCurveAdapter();
			}
			@Override
			public Adapter caseWindGeneratingUnit(WindGeneratingUnit object) {
				return createWindGeneratingUnitAdapter();
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
			public Adapter casePowerSystemResource(PowerSystemResource object) {
				return createPowerSystemResourceAdapter();
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
			public Adapter caseCurve(Curve object) {
				return createCurveAdapter();
			}
			@Override
			public Adapter caseEquipment(Equipment object) {
				return createEquipmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.Reservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir
	 * @generated
	 */
	public Adapter createReservoirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant
	 * @generated
	 */
	public Adapter createCogenerationPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.GenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpSchedule
	 * @generated
	 */
	public Adapter createGenUnitOpScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule <em>Fuel Allocation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule
	 * @generated
	 */
	public Adapter createFuelAllocationScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve
	 * @generated
	 */
	public Adapter createGrossToNetActivePowerCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve <em>Level Vs Volume Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve
	 * @generated
	 */
	public Adapter createLevelVsVolumeCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.StartRampCurve <em>Start Ramp Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.StartRampCurve
	 * @generated
	 */
	public Adapter createStartRampCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit <em>Nuclear Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit
	 * @generated
	 */
	public Adapter createNuclearGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.EmissionCurve <em>Emission Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve
	 * @generated
	 */
	public Adapter createEmissionCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule
	 * @generated
	 */
	public Adapter createHydroPumpOpScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.SteamSendoutSchedule
	 * @generated
	 */
	public Adapter createSteamSendoutScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule
	 * @generated
	 */
	public Adapter createTargetLevelScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant
	 * @generated
	 */
	public Adapter createCombinedCyclePlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve <em>Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve
	 * @generated
	 */
	public Adapter createHeatRateCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit
	 * @generated
	 */
	public Adapter createThermalGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.EmissionAccount <em>Emission Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount
	 * @generated
	 */
	public Adapter createEmissionAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.PenstockLossCurve <em>Penstock Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.PenstockLossCurve
	 * @generated
	 */
	public Adapter createPenstockLossCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.StartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel
	 * @generated
	 */
	public Adapter createStartupModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit
	 * @generated
	 */
	public Adapter createHydroGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve <em>Gen Unit Op Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve
	 * @generated
	 */
	public Adapter createGenUnitOpCostCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve
	 * @generated
	 */
	public Adapter createIncrementalHeatRateCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.FossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel
	 * @generated
	 */
	public Adapter createFossilFuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit
	 * @generated
	 */
	public Adapter createGeneratingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve
	 * @generated
	 */
	public Adapter createStartIgnFuelCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve
	 * @generated
	 */
	public Adapter createStartMainFuelCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.TailbayLossCurve
	 * @generated
	 */
	public Adapter createTailbayLossCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump
	 * @generated
	 */
	public Adapter createHydroPumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.InflowForecast <em>Inflow Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.InflowForecast
	 * @generated
	 */
	public Adapter createInflowForecastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve <em>Hydro Generating Efficiency Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve
	 * @generated
	 */
	public Adapter createHydroGeneratingEfficiencyCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve
	 * @generated
	 */
	public Adapter createShutdownCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant
	 * @generated
	 */
	public Adapter createHydroPowerPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.CAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant
	 * @generated
	 */
	public Adapter createCAESPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.AirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor
	 * @generated
	 */
	public Adapter createAirCompressorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve
	 * @generated
	 */
	public Adapter createHeatInputCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Generation.Production.WindGeneratingUnit <em>Wind Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Generation.Production.WindGeneratingUnit
	 * @generated
	 */
	public Adapter createWindGeneratingUnitAdapter() {
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

} //ProductionAdapterFactory
