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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Generation.Production.ProductionPackage
 * @generated
 */
public class ProductionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProductionPackage.RESERVOIR: {
				Reservoir reservoir = (Reservoir)theEObject;
				T result = caseReservoir(reservoir);
				if (result == null) result = casePowerSystemResource(reservoir);
				if (result == null) result = caseIdentifiedObject(reservoir);
				if (result == null) result = caseElement(reservoir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.COGENERATION_PLANT: {
				CogenerationPlant cogenerationPlant = (CogenerationPlant)theEObject;
				T result = caseCogenerationPlant(cogenerationPlant);
				if (result == null) result = casePowerSystemResource(cogenerationPlant);
				if (result == null) result = caseIdentifiedObject(cogenerationPlant);
				if (result == null) result = caseElement(cogenerationPlant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.GEN_UNIT_OP_SCHEDULE: {
				GenUnitOpSchedule genUnitOpSchedule = (GenUnitOpSchedule)theEObject;
				T result = caseGenUnitOpSchedule(genUnitOpSchedule);
				if (result == null) result = caseRegularIntervalSchedule(genUnitOpSchedule);
				if (result == null) result = caseBasicIntervalSchedule(genUnitOpSchedule);
				if (result == null) result = caseIdentifiedObject(genUnitOpSchedule);
				if (result == null) result = caseElement(genUnitOpSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE: {
				FuelAllocationSchedule fuelAllocationSchedule = (FuelAllocationSchedule)theEObject;
				T result = caseFuelAllocationSchedule(fuelAllocationSchedule);
				if (result == null) result = caseCurve(fuelAllocationSchedule);
				if (result == null) result = caseIdentifiedObject(fuelAllocationSchedule);
				if (result == null) result = caseElement(fuelAllocationSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE: {
				GrossToNetActivePowerCurve grossToNetActivePowerCurve = (GrossToNetActivePowerCurve)theEObject;
				T result = caseGrossToNetActivePowerCurve(grossToNetActivePowerCurve);
				if (result == null) result = caseCurve(grossToNetActivePowerCurve);
				if (result == null) result = caseIdentifiedObject(grossToNetActivePowerCurve);
				if (result == null) result = caseElement(grossToNetActivePowerCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.LEVEL_VS_VOLUME_CURVE: {
				LevelVsVolumeCurve levelVsVolumeCurve = (LevelVsVolumeCurve)theEObject;
				T result = caseLevelVsVolumeCurve(levelVsVolumeCurve);
				if (result == null) result = caseCurve(levelVsVolumeCurve);
				if (result == null) result = caseIdentifiedObject(levelVsVolumeCurve);
				if (result == null) result = caseElement(levelVsVolumeCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.START_RAMP_CURVE: {
				StartRampCurve startRampCurve = (StartRampCurve)theEObject;
				T result = caseStartRampCurve(startRampCurve);
				if (result == null) result = caseCurve(startRampCurve);
				if (result == null) result = caseIdentifiedObject(startRampCurve);
				if (result == null) result = caseElement(startRampCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.NUCLEAR_GENERATING_UNIT: {
				NuclearGeneratingUnit nuclearGeneratingUnit = (NuclearGeneratingUnit)theEObject;
				T result = caseNuclearGeneratingUnit(nuclearGeneratingUnit);
				if (result == null) result = caseGeneratingUnit(nuclearGeneratingUnit);
				if (result == null) result = caseEquipment(nuclearGeneratingUnit);
				if (result == null) result = casePowerSystemResource(nuclearGeneratingUnit);
				if (result == null) result = caseIdentifiedObject(nuclearGeneratingUnit);
				if (result == null) result = caseElement(nuclearGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.EMISSION_CURVE: {
				EmissionCurve emissionCurve = (EmissionCurve)theEObject;
				T result = caseEmissionCurve(emissionCurve);
				if (result == null) result = caseCurve(emissionCurve);
				if (result == null) result = caseIdentifiedObject(emissionCurve);
				if (result == null) result = caseElement(emissionCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE: {
				HydroPumpOpSchedule hydroPumpOpSchedule = (HydroPumpOpSchedule)theEObject;
				T result = caseHydroPumpOpSchedule(hydroPumpOpSchedule);
				if (result == null) result = caseRegularIntervalSchedule(hydroPumpOpSchedule);
				if (result == null) result = caseBasicIntervalSchedule(hydroPumpOpSchedule);
				if (result == null) result = caseIdentifiedObject(hydroPumpOpSchedule);
				if (result == null) result = caseElement(hydroPumpOpSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE: {
				SteamSendoutSchedule steamSendoutSchedule = (SteamSendoutSchedule)theEObject;
				T result = caseSteamSendoutSchedule(steamSendoutSchedule);
				if (result == null) result = caseRegularIntervalSchedule(steamSendoutSchedule);
				if (result == null) result = caseBasicIntervalSchedule(steamSendoutSchedule);
				if (result == null) result = caseIdentifiedObject(steamSendoutSchedule);
				if (result == null) result = caseElement(steamSendoutSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.TARGET_LEVEL_SCHEDULE: {
				TargetLevelSchedule targetLevelSchedule = (TargetLevelSchedule)theEObject;
				T result = caseTargetLevelSchedule(targetLevelSchedule);
				if (result == null) result = caseCurve(targetLevelSchedule);
				if (result == null) result = caseIdentifiedObject(targetLevelSchedule);
				if (result == null) result = caseElement(targetLevelSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.COMBINED_CYCLE_PLANT: {
				CombinedCyclePlant combinedCyclePlant = (CombinedCyclePlant)theEObject;
				T result = caseCombinedCyclePlant(combinedCyclePlant);
				if (result == null) result = casePowerSystemResource(combinedCyclePlant);
				if (result == null) result = caseIdentifiedObject(combinedCyclePlant);
				if (result == null) result = caseElement(combinedCyclePlant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HEAT_RATE_CURVE: {
				HeatRateCurve heatRateCurve = (HeatRateCurve)theEObject;
				T result = caseHeatRateCurve(heatRateCurve);
				if (result == null) result = caseCurve(heatRateCurve);
				if (result == null) result = caseIdentifiedObject(heatRateCurve);
				if (result == null) result = caseElement(heatRateCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.THERMAL_GENERATING_UNIT: {
				ThermalGeneratingUnit thermalGeneratingUnit = (ThermalGeneratingUnit)theEObject;
				T result = caseThermalGeneratingUnit(thermalGeneratingUnit);
				if (result == null) result = caseGeneratingUnit(thermalGeneratingUnit);
				if (result == null) result = caseEquipment(thermalGeneratingUnit);
				if (result == null) result = casePowerSystemResource(thermalGeneratingUnit);
				if (result == null) result = caseIdentifiedObject(thermalGeneratingUnit);
				if (result == null) result = caseElement(thermalGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.EMISSION_ACCOUNT: {
				EmissionAccount emissionAccount = (EmissionAccount)theEObject;
				T result = caseEmissionAccount(emissionAccount);
				if (result == null) result = caseCurve(emissionAccount);
				if (result == null) result = caseIdentifiedObject(emissionAccount);
				if (result == null) result = caseElement(emissionAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.PENSTOCK_LOSS_CURVE: {
				PenstockLossCurve penstockLossCurve = (PenstockLossCurve)theEObject;
				T result = casePenstockLossCurve(penstockLossCurve);
				if (result == null) result = caseCurve(penstockLossCurve);
				if (result == null) result = caseIdentifiedObject(penstockLossCurve);
				if (result == null) result = caseElement(penstockLossCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.STARTUP_MODEL: {
				StartupModel startupModel = (StartupModel)theEObject;
				T result = caseStartupModel(startupModel);
				if (result == null) result = caseIdentifiedObject(startupModel);
				if (result == null) result = caseElement(startupModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HYDRO_GENERATING_UNIT: {
				HydroGeneratingUnit hydroGeneratingUnit = (HydroGeneratingUnit)theEObject;
				T result = caseHydroGeneratingUnit(hydroGeneratingUnit);
				if (result == null) result = caseGeneratingUnit(hydroGeneratingUnit);
				if (result == null) result = caseEquipment(hydroGeneratingUnit);
				if (result == null) result = casePowerSystemResource(hydroGeneratingUnit);
				if (result == null) result = caseIdentifiedObject(hydroGeneratingUnit);
				if (result == null) result = caseElement(hydroGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.GEN_UNIT_OP_COST_CURVE: {
				GenUnitOpCostCurve genUnitOpCostCurve = (GenUnitOpCostCurve)theEObject;
				T result = caseGenUnitOpCostCurve(genUnitOpCostCurve);
				if (result == null) result = caseCurve(genUnitOpCostCurve);
				if (result == null) result = caseIdentifiedObject(genUnitOpCostCurve);
				if (result == null) result = caseElement(genUnitOpCostCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE: {
				IncrementalHeatRateCurve incrementalHeatRateCurve = (IncrementalHeatRateCurve)theEObject;
				T result = caseIncrementalHeatRateCurve(incrementalHeatRateCurve);
				if (result == null) result = caseCurve(incrementalHeatRateCurve);
				if (result == null) result = caseIdentifiedObject(incrementalHeatRateCurve);
				if (result == null) result = caseElement(incrementalHeatRateCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.FOSSIL_FUEL: {
				FossilFuel fossilFuel = (FossilFuel)theEObject;
				T result = caseFossilFuel(fossilFuel);
				if (result == null) result = caseIdentifiedObject(fossilFuel);
				if (result == null) result = caseElement(fossilFuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.GENERATING_UNIT: {
				GeneratingUnit generatingUnit = (GeneratingUnit)theEObject;
				T result = caseGeneratingUnit(generatingUnit);
				if (result == null) result = caseEquipment(generatingUnit);
				if (result == null) result = casePowerSystemResource(generatingUnit);
				if (result == null) result = caseIdentifiedObject(generatingUnit);
				if (result == null) result = caseElement(generatingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.START_IGN_FUEL_CURVE: {
				StartIgnFuelCurve startIgnFuelCurve = (StartIgnFuelCurve)theEObject;
				T result = caseStartIgnFuelCurve(startIgnFuelCurve);
				if (result == null) result = caseCurve(startIgnFuelCurve);
				if (result == null) result = caseIdentifiedObject(startIgnFuelCurve);
				if (result == null) result = caseElement(startIgnFuelCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.START_MAIN_FUEL_CURVE: {
				StartMainFuelCurve startMainFuelCurve = (StartMainFuelCurve)theEObject;
				T result = caseStartMainFuelCurve(startMainFuelCurve);
				if (result == null) result = caseCurve(startMainFuelCurve);
				if (result == null) result = caseIdentifiedObject(startMainFuelCurve);
				if (result == null) result = caseElement(startMainFuelCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.TAILBAY_LOSS_CURVE: {
				TailbayLossCurve tailbayLossCurve = (TailbayLossCurve)theEObject;
				T result = caseTailbayLossCurve(tailbayLossCurve);
				if (result == null) result = caseCurve(tailbayLossCurve);
				if (result == null) result = caseIdentifiedObject(tailbayLossCurve);
				if (result == null) result = caseElement(tailbayLossCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HYDRO_PUMP: {
				HydroPump hydroPump = (HydroPump)theEObject;
				T result = caseHydroPump(hydroPump);
				if (result == null) result = casePowerSystemResource(hydroPump);
				if (result == null) result = caseIdentifiedObject(hydroPump);
				if (result == null) result = caseElement(hydroPump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.INFLOW_FORECAST: {
				InflowForecast inflowForecast = (InflowForecast)theEObject;
				T result = caseInflowForecast(inflowForecast);
				if (result == null) result = caseRegularIntervalSchedule(inflowForecast);
				if (result == null) result = caseBasicIntervalSchedule(inflowForecast);
				if (result == null) result = caseIdentifiedObject(inflowForecast);
				if (result == null) result = caseElement(inflowForecast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HYDRO_GENERATING_EFFICIENCY_CURVE: {
				HydroGeneratingEfficiencyCurve hydroGeneratingEfficiencyCurve = (HydroGeneratingEfficiencyCurve)theEObject;
				T result = caseHydroGeneratingEfficiencyCurve(hydroGeneratingEfficiencyCurve);
				if (result == null) result = caseCurve(hydroGeneratingEfficiencyCurve);
				if (result == null) result = caseIdentifiedObject(hydroGeneratingEfficiencyCurve);
				if (result == null) result = caseElement(hydroGeneratingEfficiencyCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.SHUTDOWN_CURVE: {
				ShutdownCurve shutdownCurve = (ShutdownCurve)theEObject;
				T result = caseShutdownCurve(shutdownCurve);
				if (result == null) result = caseCurve(shutdownCurve);
				if (result == null) result = caseIdentifiedObject(shutdownCurve);
				if (result == null) result = caseElement(shutdownCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HYDRO_POWER_PLANT: {
				HydroPowerPlant hydroPowerPlant = (HydroPowerPlant)theEObject;
				T result = caseHydroPowerPlant(hydroPowerPlant);
				if (result == null) result = casePowerSystemResource(hydroPowerPlant);
				if (result == null) result = caseIdentifiedObject(hydroPowerPlant);
				if (result == null) result = caseElement(hydroPowerPlant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.CAES_PLANT: {
				CAESPlant caesPlant = (CAESPlant)theEObject;
				T result = caseCAESPlant(caesPlant);
				if (result == null) result = casePowerSystemResource(caesPlant);
				if (result == null) result = caseIdentifiedObject(caesPlant);
				if (result == null) result = caseElement(caesPlant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.AIR_COMPRESSOR: {
				AirCompressor airCompressor = (AirCompressor)theEObject;
				T result = caseAirCompressor(airCompressor);
				if (result == null) result = casePowerSystemResource(airCompressor);
				if (result == null) result = caseIdentifiedObject(airCompressor);
				if (result == null) result = caseElement(airCompressor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.HEAT_INPUT_CURVE: {
				HeatInputCurve heatInputCurve = (HeatInputCurve)theEObject;
				T result = caseHeatInputCurve(heatInputCurve);
				if (result == null) result = caseCurve(heatInputCurve);
				if (result == null) result = caseIdentifiedObject(heatInputCurve);
				if (result == null) result = caseElement(heatInputCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductionPackage.WIND_GENERATING_UNIT: {
				WindGeneratingUnit windGeneratingUnit = (WindGeneratingUnit)theEObject;
				T result = caseWindGeneratingUnit(windGeneratingUnit);
				if (result == null) result = caseGeneratingUnit(windGeneratingUnit);
				if (result == null) result = caseEquipment(windGeneratingUnit);
				if (result == null) result = casePowerSystemResource(windGeneratingUnit);
				if (result == null) result = caseIdentifiedObject(windGeneratingUnit);
				if (result == null) result = caseElement(windGeneratingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservoir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservoir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservoir(Reservoir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cogeneration Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cogeneration Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCogenerationPlant(CogenerationPlant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Op Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Op Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitOpSchedule(GenUnitOpSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuel Allocation Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuel Allocation Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuelAllocationSchedule(FuelAllocationSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrossToNetActivePowerCurve(GrossToNetActivePowerCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Vs Volume Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Vs Volume Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelVsVolumeCurve(LevelVsVolumeCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Ramp Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Ramp Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartRampCurve(StartRampCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nuclear Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nuclear Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNuclearGeneratingUnit(NuclearGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emission Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emission Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmissionCurve(EmissionCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Pump Op Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Pump Op Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroPumpOpSchedule(HydroPumpOpSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steam Sendout Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steam Sendout Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteamSendoutSchedule(SteamSendoutSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Level Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Level Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetLevelSchedule(TargetLevelSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Cycle Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Cycle Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedCyclePlant(CombinedCyclePlant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heat Rate Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heat Rate Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeatRateCurve(HeatRateCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThermalGeneratingUnit(ThermalGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emission Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emission Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmissionAccount(EmissionAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Penstock Loss Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Penstock Loss Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePenstockLossCurve(PenstockLossCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Startup Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Startup Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartupModel(StartupModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroGeneratingUnit(HydroGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Unit Op Cost Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Unit Op Cost Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenUnitOpCostCurve(GenUnitOpCostCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incremental Heat Rate Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incremental Heat Rate Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrementalHeatRateCurve(IncrementalHeatRateCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fossil Fuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fossil Fuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFossilFuel(FossilFuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratingUnit(GeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Ign Fuel Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Ign Fuel Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartIgnFuelCurve(StartIgnFuelCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Main Fuel Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Main Fuel Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartMainFuelCurve(StartMainFuelCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tailbay Loss Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tailbay Loss Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTailbayLossCurve(TailbayLossCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Pump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Pump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroPump(HydroPump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inflow Forecast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inflow Forecast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInflowForecast(InflowForecast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Generating Efficiency Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Generating Efficiency Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroGeneratingEfficiencyCurve(HydroGeneratingEfficiencyCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shutdown Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shutdown Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShutdownCurve(ShutdownCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Power Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Power Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroPowerPlant(HydroPowerPlant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAES Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAES Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAESPlant(CAESPlant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Air Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Air Compressor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirCompressor(AirCompressor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heat Input Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heat Input Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeatInputCurve(HeatInputCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wind Generating Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wind Generating Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindGeneratingUnit(WindGeneratingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIntervalSchedule(BasicIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularIntervalSchedule(RegularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProductionSwitch
