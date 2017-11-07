/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fossil Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FossilSteamSupply extends SteamSupply {
	/**
	 * The default value of the '{@link #getFuelDemandLimit() <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDemandLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_DEMAND_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelDemandLimit() <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDemandLimit()
	 * @generated
	 * @ordered
	 */
	protected float fuelDemandLimit = FUEL_DEMAND_LIMIT_EDEFAULT;

	/**
	 * This is true if the Fuel Demand Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelDemandLimitESet;

	/**
	 * The default value of the '{@link #getAuxPowerVersusFrequency() <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_VERSUS_FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerVersusFrequency() <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerVersusFrequency = AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Aux Power Versus Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxPowerVersusFrequencyESet;

	/**
	 * The default value of the '{@link #getMechPowerSensorLag() <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechPowerSensorLag()
	 * @generated
	 * @ordered
	 */
	protected static final float MECH_POWER_SENSOR_LAG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMechPowerSensorLag() <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechPowerSensorLag()
	 * @generated
	 * @ordered
	 */
	protected float mechPowerSensorLag = MECH_POWER_SENSOR_LAG_EDEFAULT;

	/**
	 * This is true if the Mech Power Sensor Lag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mechPowerSensorLagESet;

	/**
	 * The default value of the '{@link #getPressureCtrlDG() <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlDG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CTRL_DG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCtrlDG() <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlDG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCtrlDG = PRESSURE_CTRL_DG_EDEFAULT;

	/**
	 * This is true if the Pressure Ctrl DG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureCtrlDGESet;

	/**
	 * The default value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureSP()
	 * @generated
	 * @ordered
	 */
	protected static final float THROTTLE_PRESSURE_SP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureSP()
	 * @generated
	 * @ordered
	 */
	protected float throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;

	/**
	 * This is true if the Throttle Pressure SP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean throttlePressureSPESet;

	/**
	 * The default value of the '{@link #getFeedWaterPG() <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterPG()
	 * @generated
	 * @ordered
	 */
	protected static final float FEED_WATER_PG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedWaterPG() <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterPG()
	 * @generated
	 * @ordered
	 */
	protected float feedWaterPG = FEED_WATER_PG_EDEFAULT;

	/**
	 * This is true if the Feed Water PG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedWaterPGESet;

	/**
	 * The default value of the '{@link #getFeedWaterTC() <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterTC()
	 * @generated
	 * @ordered
	 */
	protected static final float FEED_WATER_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedWaterTC() <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterTC()
	 * @generated
	 * @ordered
	 */
	protected float feedWaterTC = FEED_WATER_TC_EDEFAULT;

	/**
	 * This is true if the Feed Water TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedWaterTCESet;

	/**
	 * The default value of the '{@link #getControlPC() <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPC()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPC() <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPC()
	 * @generated
	 * @ordered
	 */
	protected float controlPC = CONTROL_PC_EDEFAULT;

	/**
	 * This is true if the Control PC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlPCESet;

	/**
	 * The default value of the '{@link #getFuelSupplyDelay() <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_SUPPLY_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelSupplyDelay() <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyDelay()
	 * @generated
	 * @ordered
	 */
	protected float fuelSupplyDelay = FUEL_SUPPLY_DELAY_EDEFAULT;

	/**
	 * This is true if the Fuel Supply Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelSupplyDelayESet;

	/**
	 * The default value of the '{@link #getControlPED() <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPED()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPED() <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPED()
	 * @generated
	 * @ordered
	 */
	protected float controlPED = CONTROL_PED_EDEFAULT;

	/**
	 * This is true if the Control PED attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlPEDESet;

	/**
	 * The default value of the '{@link #getControlPEB() <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPEB()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PEB_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPEB() <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPEB()
	 * @generated
	 * @ordered
	 */
	protected float controlPEB = CONTROL_PEB_EDEFAULT;

	/**
	 * This is true if the Control PEB attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlPEBESet;

	/**
	 * The default value of the '{@link #getBoilerControlMode() <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilerControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final BoilerControlMode BOILER_CONTROL_MODE_EDEFAULT = BoilerControlMode.FOLLOWING;

	/**
	 * The cached value of the '{@link #getBoilerControlMode() <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilerControlMode()
	 * @generated
	 * @ordered
	 */
	protected BoilerControlMode boilerControlMode = BOILER_CONTROL_MODE_EDEFAULT;

	/**
	 * This is true if the Boiler Control Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boilerControlModeESet;

	/**
	 * The default value of the '{@link #getControlTC() <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTC()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlTC() <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTC()
	 * @generated
	 * @ordered
	 */
	protected float controlTC = CONTROL_TC_EDEFAULT;

	/**
	 * This is true if the Control TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlTCESet;

	/**
	 * The default value of the '{@link #getMinErrorRateP() <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_ERROR_RATE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinErrorRateP() <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected float minErrorRateP = MIN_ERROR_RATE_P_EDEFAULT;

	/**
	 * This is true if the Min Error Rate P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minErrorRatePESet;

	/**
	 * The default value of the '{@link #getSuperHeater1Capacity() <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater1Capacity()
	 * @generated
	 * @ordered
	 */
	protected static final float SUPER_HEATER1_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuperHeater1Capacity() <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater1Capacity()
	 * @generated
	 * @ordered
	 */
	protected float superHeater1Capacity = SUPER_HEATER1_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Super Heater1 Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean superHeater1CapacityESet;

	/**
	 * The default value of the '{@link #getControlErrorBiasP() <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlErrorBiasP()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_ERROR_BIAS_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlErrorBiasP() <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlErrorBiasP()
	 * @generated
	 * @ordered
	 */
	protected float controlErrorBiasP = CONTROL_ERROR_BIAS_P_EDEFAULT;

	/**
	 * This is true if the Control Error Bias P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlErrorBiasPESet;

	/**
	 * The default value of the '{@link #getPressureCtrlIG() <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlIG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CTRL_IG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCtrlIG() <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlIG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCtrlIG = PRESSURE_CTRL_IG_EDEFAULT;

	/**
	 * This is true if the Pressure Ctrl IG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureCtrlIGESet;

	/**
	 * The default value of the '{@link #getFeedWaterIG() <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterIG()
	 * @generated
	 * @ordered
	 */
	protected static final float FEED_WATER_IG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedWaterIG() <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedWaterIG()
	 * @generated
	 * @ordered
	 */
	protected float feedWaterIG = FEED_WATER_IG_EDEFAULT;

	/**
	 * This is true if the Feed Water IG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedWaterIGESet;

	/**
	 * The default value of the '{@link #getPressureFeedback() <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESSURE_FEEDBACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPressureFeedback() <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureFeedback()
	 * @generated
	 * @ordered
	 */
	protected int pressureFeedback = PRESSURE_FEEDBACK_EDEFAULT;

	/**
	 * This is true if the Pressure Feedback attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureFeedbackESet;

	/**
	 * The default value of the '{@link #getAuxPowerVersusVoltage() <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_VERSUS_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerVersusVoltage() <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerVersusVoltage = AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Aux Power Versus Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxPowerVersusVoltageESet;

	/**
	 * The default value of the '{@link #getFuelSupplyTC() <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyTC()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_SUPPLY_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelSupplyTC() <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSupplyTC()
	 * @generated
	 * @ordered
	 */
	protected float fuelSupplyTC = FUEL_SUPPLY_TC_EDEFAULT;

	/**
	 * This is true if the Fuel Supply TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelSupplyTCESet;

	/**
	 * The default value of the '{@link #getMaxErrorRateP() <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ERROR_RATE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxErrorRateP() <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxErrorRateP()
	 * @generated
	 * @ordered
	 */
	protected float maxErrorRateP = MAX_ERROR_RATE_P_EDEFAULT;

	/**
	 * This is true if the Max Error Rate P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxErrorRatePESet;

	/**
	 * The default value of the '{@link #getSuperHeaterPipePD() <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeaterPipePD()
	 * @generated
	 * @ordered
	 */
	protected static final float SUPER_HEATER_PIPE_PD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuperHeaterPipePD() <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeaterPipePD()
	 * @generated
	 * @ordered
	 */
	protected float superHeaterPipePD = SUPER_HEATER_PIPE_PD_EDEFAULT;

	/**
	 * This is true if the Super Heater Pipe PD attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean superHeaterPipePDESet;

	/**
	 * The default value of the '{@link #getPressureCtrlPG() <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlPG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CTRL_PG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCtrlPG() <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCtrlPG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCtrlPG = PRESSURE_CTRL_PG_EDEFAULT;

	/**
	 * This is true if the Pressure Ctrl PG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureCtrlPGESet;

	/**
	 * The default value of the '{@link #getSuperHeater2Capacity() <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater2Capacity()
	 * @generated
	 * @ordered
	 */
	protected static final float SUPER_HEATER2_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuperHeater2Capacity() <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperHeater2Capacity()
	 * @generated
	 * @ordered
	 */
	protected float superHeater2Capacity = SUPER_HEATER2_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Super Heater2 Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean superHeater2CapacityESet;

	/**
	 * The default value of the '{@link #getControlIC() <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlIC()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_IC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlIC() <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlIC()
	 * @generated
	 * @ordered
	 */
	protected float controlIC = CONTROL_IC_EDEFAULT;

	/**
	 * This is true if the Control IC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlICESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FossilSteamSupply() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.FOSSIL_STEAM_SUPPLY;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Demand Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Demand Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Demand Limit</em>' attribute.
	 * @see #isSetFuelDemandLimit()
	 * @see #unsetFuelDemandLimit()
	 * @see #setFuelDemandLimit(float)
	 * @generated
	 */
	public float getFuelDemandLimit() {
		return fuelDemandLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Demand Limit</em>' attribute.
	 * @see #isSetFuelDemandLimit()
	 * @see #unsetFuelDemandLimit()
	 * @see #getFuelDemandLimit()
	 * @generated
	 */
	public void setFuelDemandLimit(float newFuelDemandLimit) {
		fuelDemandLimit = newFuelDemandLimit;
		fuelDemandLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelDemandLimit()
	 * @see #getFuelDemandLimit()
	 * @see #setFuelDemandLimit(float)
	 * @generated
	 */
	public void unsetFuelDemandLimit() {
		fuelDemandLimit = FUEL_DEMAND_LIMIT_EDEFAULT;
		fuelDemandLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelDemandLimit <em>Fuel Demand Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Demand Limit</em>' attribute is set.
	 * @see #unsetFuelDemandLimit()
	 * @see #getFuelDemandLimit()
	 * @see #setFuelDemandLimit(float)
	 * @generated
	 */
	public boolean isSetFuelDemandLimit() {
		return fuelDemandLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Versus Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Versus Frequency</em>' attribute.
	 * @see #isSetAuxPowerVersusFrequency()
	 * @see #unsetAuxPowerVersusFrequency()
	 * @see #setAuxPowerVersusFrequency(float)
	 * @generated
	 */
	public float getAuxPowerVersusFrequency() {
		return auxPowerVersusFrequency;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Versus Frequency</em>' attribute.
	 * @see #isSetAuxPowerVersusFrequency()
	 * @see #unsetAuxPowerVersusFrequency()
	 * @see #getAuxPowerVersusFrequency()
	 * @generated
	 */
	public void setAuxPowerVersusFrequency(float newAuxPowerVersusFrequency) {
		auxPowerVersusFrequency = newAuxPowerVersusFrequency;
		auxPowerVersusFrequencyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxPowerVersusFrequency()
	 * @see #getAuxPowerVersusFrequency()
	 * @see #setAuxPowerVersusFrequency(float)
	 * @generated
	 */
	public void unsetAuxPowerVersusFrequency() {
		auxPowerVersusFrequency = AUX_POWER_VERSUS_FREQUENCY_EDEFAULT;
		auxPowerVersusFrequencyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Power Versus Frequency</em>' attribute is set.
	 * @see #unsetAuxPowerVersusFrequency()
	 * @see #getAuxPowerVersusFrequency()
	 * @see #setAuxPowerVersusFrequency(float)
	 * @generated
	 */
	public boolean isSetAuxPowerVersusFrequency() {
		return auxPowerVersusFrequencyESet;
	}

	/**
	 * Returns the value of the '<em><b>Mech Power Sensor Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mech Power Sensor Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mech Power Sensor Lag</em>' attribute.
	 * @see #isSetMechPowerSensorLag()
	 * @see #unsetMechPowerSensorLag()
	 * @see #setMechPowerSensorLag(float)
	 * @generated
	 */
	public float getMechPowerSensorLag() {
		return mechPowerSensorLag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mech Power Sensor Lag</em>' attribute.
	 * @see #isSetMechPowerSensorLag()
	 * @see #unsetMechPowerSensorLag()
	 * @see #getMechPowerSensorLag()
	 * @generated
	 */
	public void setMechPowerSensorLag(float newMechPowerSensorLag) {
		mechPowerSensorLag = newMechPowerSensorLag;
		mechPowerSensorLagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMechPowerSensorLag()
	 * @see #getMechPowerSensorLag()
	 * @see #setMechPowerSensorLag(float)
	 * @generated
	 */
	public void unsetMechPowerSensorLag() {
		mechPowerSensorLag = MECH_POWER_SENSOR_LAG_EDEFAULT;
		mechPowerSensorLagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMechPowerSensorLag <em>Mech Power Sensor Lag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mech Power Sensor Lag</em>' attribute is set.
	 * @see #unsetMechPowerSensorLag()
	 * @see #getMechPowerSensorLag()
	 * @see #setMechPowerSensorLag(float)
	 * @generated
	 */
	public boolean isSetMechPowerSensorLag() {
		return mechPowerSensorLagESet;
	}

	/**
	 * Returns the value of the '<em><b>Pressure Ctrl DG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Ctrl DG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Ctrl DG</em>' attribute.
	 * @see #isSetPressureCtrlDG()
	 * @see #unsetPressureCtrlDG()
	 * @see #setPressureCtrlDG(float)
	 * @generated
	 */
	public float getPressureCtrlDG() {
		return pressureCtrlDG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Ctrl DG</em>' attribute.
	 * @see #isSetPressureCtrlDG()
	 * @see #unsetPressureCtrlDG()
	 * @see #getPressureCtrlDG()
	 * @generated
	 */
	public void setPressureCtrlDG(float newPressureCtrlDG) {
		pressureCtrlDG = newPressureCtrlDG;
		pressureCtrlDGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureCtrlDG()
	 * @see #getPressureCtrlDG()
	 * @see #setPressureCtrlDG(float)
	 * @generated
	 */
	public void unsetPressureCtrlDG() {
		pressureCtrlDG = PRESSURE_CTRL_DG_EDEFAULT;
		pressureCtrlDGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlDG <em>Pressure Ctrl DG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Ctrl DG</em>' attribute is set.
	 * @see #unsetPressureCtrlDG()
	 * @see #getPressureCtrlDG()
	 * @see #setPressureCtrlDG(float)
	 * @generated
	 */
	public boolean isSetPressureCtrlDG() {
		return pressureCtrlDGESet;
	}

	/**
	 * Returns the value of the '<em><b>Throttle Pressure SP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle Pressure SP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle Pressure SP</em>' attribute.
	 * @see #isSetThrottlePressureSP()
	 * @see #unsetThrottlePressureSP()
	 * @see #setThrottlePressureSP(float)
	 * @generated
	 */
	public float getThrottlePressureSP() {
		return throttlePressureSP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle Pressure SP</em>' attribute.
	 * @see #isSetThrottlePressureSP()
	 * @see #unsetThrottlePressureSP()
	 * @see #getThrottlePressureSP()
	 * @generated
	 */
	public void setThrottlePressureSP(float newThrottlePressureSP) {
		throttlePressureSP = newThrottlePressureSP;
		throttlePressureSPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThrottlePressureSP()
	 * @see #getThrottlePressureSP()
	 * @see #setThrottlePressureSP(float)
	 * @generated
	 */
	public void unsetThrottlePressureSP() {
		throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;
		throttlePressureSPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Throttle Pressure SP</em>' attribute is set.
	 * @see #unsetThrottlePressureSP()
	 * @see #getThrottlePressureSP()
	 * @see #setThrottlePressureSP(float)
	 * @generated
	 */
	public boolean isSetThrottlePressureSP() {
		return throttlePressureSPESet;
	}

	/**
	 * Returns the value of the '<em><b>Feed Water PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Water PG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Water PG</em>' attribute.
	 * @see #isSetFeedWaterPG()
	 * @see #unsetFeedWaterPG()
	 * @see #setFeedWaterPG(float)
	 * @generated
	 */
	public float getFeedWaterPG() {
		return feedWaterPG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Water PG</em>' attribute.
	 * @see #isSetFeedWaterPG()
	 * @see #unsetFeedWaterPG()
	 * @see #getFeedWaterPG()
	 * @generated
	 */
	public void setFeedWaterPG(float newFeedWaterPG) {
		feedWaterPG = newFeedWaterPG;
		feedWaterPGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedWaterPG()
	 * @see #getFeedWaterPG()
	 * @see #setFeedWaterPG(float)
	 * @generated
	 */
	public void unsetFeedWaterPG() {
		feedWaterPG = FEED_WATER_PG_EDEFAULT;
		feedWaterPGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterPG <em>Feed Water PG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feed Water PG</em>' attribute is set.
	 * @see #unsetFeedWaterPG()
	 * @see #getFeedWaterPG()
	 * @see #setFeedWaterPG(float)
	 * @generated
	 */
	public boolean isSetFeedWaterPG() {
		return feedWaterPGESet;
	}

	/**
	 * Returns the value of the '<em><b>Feed Water TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Water TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Water TC</em>' attribute.
	 * @see #isSetFeedWaterTC()
	 * @see #unsetFeedWaterTC()
	 * @see #setFeedWaterTC(float)
	 * @generated
	 */
	public float getFeedWaterTC() {
		return feedWaterTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Water TC</em>' attribute.
	 * @see #isSetFeedWaterTC()
	 * @see #unsetFeedWaterTC()
	 * @see #getFeedWaterTC()
	 * @generated
	 */
	public void setFeedWaterTC(float newFeedWaterTC) {
		feedWaterTC = newFeedWaterTC;
		feedWaterTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedWaterTC()
	 * @see #getFeedWaterTC()
	 * @see #setFeedWaterTC(float)
	 * @generated
	 */
	public void unsetFeedWaterTC() {
		feedWaterTC = FEED_WATER_TC_EDEFAULT;
		feedWaterTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterTC <em>Feed Water TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feed Water TC</em>' attribute is set.
	 * @see #unsetFeedWaterTC()
	 * @see #getFeedWaterTC()
	 * @see #setFeedWaterTC(float)
	 * @generated
	 */
	public boolean isSetFeedWaterTC() {
		return feedWaterTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Control PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control PC</em>' attribute.
	 * @see #isSetControlPC()
	 * @see #unsetControlPC()
	 * @see #setControlPC(float)
	 * @generated
	 */
	public float getControlPC() {
		return controlPC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control PC</em>' attribute.
	 * @see #isSetControlPC()
	 * @see #unsetControlPC()
	 * @see #getControlPC()
	 * @generated
	 */
	public void setControlPC(float newControlPC) {
		controlPC = newControlPC;
		controlPCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlPC()
	 * @see #getControlPC()
	 * @see #setControlPC(float)
	 * @generated
	 */
	public void unsetControlPC() {
		controlPC = CONTROL_PC_EDEFAULT;
		controlPCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPC <em>Control PC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control PC</em>' attribute is set.
	 * @see #unsetControlPC()
	 * @see #getControlPC()
	 * @see #setControlPC(float)
	 * @generated
	 */
	public boolean isSetControlPC() {
		return controlPCESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Supply Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Supply Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Supply Delay</em>' attribute.
	 * @see #isSetFuelSupplyDelay()
	 * @see #unsetFuelSupplyDelay()
	 * @see #setFuelSupplyDelay(float)
	 * @generated
	 */
	public float getFuelSupplyDelay() {
		return fuelSupplyDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Supply Delay</em>' attribute.
	 * @see #isSetFuelSupplyDelay()
	 * @see #unsetFuelSupplyDelay()
	 * @see #getFuelSupplyDelay()
	 * @generated
	 */
	public void setFuelSupplyDelay(float newFuelSupplyDelay) {
		fuelSupplyDelay = newFuelSupplyDelay;
		fuelSupplyDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelSupplyDelay()
	 * @see #getFuelSupplyDelay()
	 * @see #setFuelSupplyDelay(float)
	 * @generated
	 */
	public void unsetFuelSupplyDelay() {
		fuelSupplyDelay = FUEL_SUPPLY_DELAY_EDEFAULT;
		fuelSupplyDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyDelay <em>Fuel Supply Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Supply Delay</em>' attribute is set.
	 * @see #unsetFuelSupplyDelay()
	 * @see #getFuelSupplyDelay()
	 * @see #setFuelSupplyDelay(float)
	 * @generated
	 */
	public boolean isSetFuelSupplyDelay() {
		return fuelSupplyDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Control PED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control PED</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control PED</em>' attribute.
	 * @see #isSetControlPED()
	 * @see #unsetControlPED()
	 * @see #setControlPED(float)
	 * @generated
	 */
	public float getControlPED() {
		return controlPED;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control PED</em>' attribute.
	 * @see #isSetControlPED()
	 * @see #unsetControlPED()
	 * @see #getControlPED()
	 * @generated
	 */
	public void setControlPED(float newControlPED) {
		controlPED = newControlPED;
		controlPEDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlPED()
	 * @see #getControlPED()
	 * @see #setControlPED(float)
	 * @generated
	 */
	public void unsetControlPED() {
		controlPED = CONTROL_PED_EDEFAULT;
		controlPEDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPED <em>Control PED</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control PED</em>' attribute is set.
	 * @see #unsetControlPED()
	 * @see #getControlPED()
	 * @see #setControlPED(float)
	 * @generated
	 */
	public boolean isSetControlPED() {
		return controlPEDESet;
	}

	/**
	 * Returns the value of the '<em><b>Control PEB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control PEB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control PEB</em>' attribute.
	 * @see #isSetControlPEB()
	 * @see #unsetControlPEB()
	 * @see #setControlPEB(float)
	 * @generated
	 */
	public float getControlPEB() {
		return controlPEB;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control PEB</em>' attribute.
	 * @see #isSetControlPEB()
	 * @see #unsetControlPEB()
	 * @see #getControlPEB()
	 * @generated
	 */
	public void setControlPEB(float newControlPEB) {
		controlPEB = newControlPEB;
		controlPEBESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlPEB()
	 * @see #getControlPEB()
	 * @see #setControlPEB(float)
	 * @generated
	 */
	public void unsetControlPEB() {
		controlPEB = CONTROL_PEB_EDEFAULT;
		controlPEBESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlPEB <em>Control PEB</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control PEB</em>' attribute is set.
	 * @see #unsetControlPEB()
	 * @see #getControlPEB()
	 * @see #setControlPEB(float)
	 * @generated
	 */
	public boolean isSetControlPEB() {
		return controlPEBESet;
	}

	/**
	 * Returns the value of the '<em><b>Boiler Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.GenerationDynamics.BoilerControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boiler Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boiler Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.BoilerControlMode
	 * @see #isSetBoilerControlMode()
	 * @see #unsetBoilerControlMode()
	 * @see #setBoilerControlMode(BoilerControlMode)
	 * @generated
	 */
	public BoilerControlMode getBoilerControlMode() {
		return boilerControlMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boiler Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.BoilerControlMode
	 * @see #isSetBoilerControlMode()
	 * @see #unsetBoilerControlMode()
	 * @see #getBoilerControlMode()
	 * @generated
	 */
	public void setBoilerControlMode(BoilerControlMode newBoilerControlMode) {
		boilerControlMode = newBoilerControlMode == null ? BOILER_CONTROL_MODE_EDEFAULT : newBoilerControlMode;
		boilerControlModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoilerControlMode()
	 * @see #getBoilerControlMode()
	 * @see #setBoilerControlMode(BoilerControlMode)
	 * @generated
	 */
	public void unsetBoilerControlMode() {
		boilerControlMode = BOILER_CONTROL_MODE_EDEFAULT;
		boilerControlModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getBoilerControlMode <em>Boiler Control Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boiler Control Mode</em>' attribute is set.
	 * @see #unsetBoilerControlMode()
	 * @see #getBoilerControlMode()
	 * @see #setBoilerControlMode(BoilerControlMode)
	 * @generated
	 */
	public boolean isSetBoilerControlMode() {
		return boilerControlModeESet;
	}

	/**
	 * Returns the value of the '<em><b>Control TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control TC</em>' attribute.
	 * @see #isSetControlTC()
	 * @see #unsetControlTC()
	 * @see #setControlTC(float)
	 * @generated
	 */
	public float getControlTC() {
		return controlTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control TC</em>' attribute.
	 * @see #isSetControlTC()
	 * @see #unsetControlTC()
	 * @see #getControlTC()
	 * @generated
	 */
	public void setControlTC(float newControlTC) {
		controlTC = newControlTC;
		controlTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlTC()
	 * @see #getControlTC()
	 * @see #setControlTC(float)
	 * @generated
	 */
	public void unsetControlTC() {
		controlTC = CONTROL_TC_EDEFAULT;
		controlTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlTC <em>Control TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control TC</em>' attribute is set.
	 * @see #unsetControlTC()
	 * @see #getControlTC()
	 * @see #setControlTC(float)
	 * @generated
	 */
	public boolean isSetControlTC() {
		return controlTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Error Rate P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Error Rate P</em>' attribute.
	 * @see #isSetMinErrorRateP()
	 * @see #unsetMinErrorRateP()
	 * @see #setMinErrorRateP(float)
	 * @generated
	 */
	public float getMinErrorRateP() {
		return minErrorRateP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Error Rate P</em>' attribute.
	 * @see #isSetMinErrorRateP()
	 * @see #unsetMinErrorRateP()
	 * @see #getMinErrorRateP()
	 * @generated
	 */
	public void setMinErrorRateP(float newMinErrorRateP) {
		minErrorRateP = newMinErrorRateP;
		minErrorRatePESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinErrorRateP()
	 * @see #getMinErrorRateP()
	 * @see #setMinErrorRateP(float)
	 * @generated
	 */
	public void unsetMinErrorRateP() {
		minErrorRateP = MIN_ERROR_RATE_P_EDEFAULT;
		minErrorRatePESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMinErrorRateP <em>Min Error Rate P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Error Rate P</em>' attribute is set.
	 * @see #unsetMinErrorRateP()
	 * @see #getMinErrorRateP()
	 * @see #setMinErrorRateP(float)
	 * @generated
	 */
	public boolean isSetMinErrorRateP() {
		return minErrorRatePESet;
	}

	/**
	 * Returns the value of the '<em><b>Super Heater1 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Heater1 Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Heater1 Capacity</em>' attribute.
	 * @see #isSetSuperHeater1Capacity()
	 * @see #unsetSuperHeater1Capacity()
	 * @see #setSuperHeater1Capacity(float)
	 * @generated
	 */
	public float getSuperHeater1Capacity() {
		return superHeater1Capacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Heater1 Capacity</em>' attribute.
	 * @see #isSetSuperHeater1Capacity()
	 * @see #unsetSuperHeater1Capacity()
	 * @see #getSuperHeater1Capacity()
	 * @generated
	 */
	public void setSuperHeater1Capacity(float newSuperHeater1Capacity) {
		superHeater1Capacity = newSuperHeater1Capacity;
		superHeater1CapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuperHeater1Capacity()
	 * @see #getSuperHeater1Capacity()
	 * @see #setSuperHeater1Capacity(float)
	 * @generated
	 */
	public void unsetSuperHeater1Capacity() {
		superHeater1Capacity = SUPER_HEATER1_CAPACITY_EDEFAULT;
		superHeater1CapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater1Capacity <em>Super Heater1 Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Super Heater1 Capacity</em>' attribute is set.
	 * @see #unsetSuperHeater1Capacity()
	 * @see #getSuperHeater1Capacity()
	 * @see #setSuperHeater1Capacity(float)
	 * @generated
	 */
	public boolean isSetSuperHeater1Capacity() {
		return superHeater1CapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Error Bias P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Error Bias P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Error Bias P</em>' attribute.
	 * @see #isSetControlErrorBiasP()
	 * @see #unsetControlErrorBiasP()
	 * @see #setControlErrorBiasP(float)
	 * @generated
	 */
	public float getControlErrorBiasP() {
		return controlErrorBiasP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Error Bias P</em>' attribute.
	 * @see #isSetControlErrorBiasP()
	 * @see #unsetControlErrorBiasP()
	 * @see #getControlErrorBiasP()
	 * @generated
	 */
	public void setControlErrorBiasP(float newControlErrorBiasP) {
		controlErrorBiasP = newControlErrorBiasP;
		controlErrorBiasPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlErrorBiasP()
	 * @see #getControlErrorBiasP()
	 * @see #setControlErrorBiasP(float)
	 * @generated
	 */
	public void unsetControlErrorBiasP() {
		controlErrorBiasP = CONTROL_ERROR_BIAS_P_EDEFAULT;
		controlErrorBiasPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlErrorBiasP <em>Control Error Bias P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Error Bias P</em>' attribute is set.
	 * @see #unsetControlErrorBiasP()
	 * @see #getControlErrorBiasP()
	 * @see #setControlErrorBiasP(float)
	 * @generated
	 */
	public boolean isSetControlErrorBiasP() {
		return controlErrorBiasPESet;
	}

	/**
	 * Returns the value of the '<em><b>Pressure Ctrl IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Ctrl IG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Ctrl IG</em>' attribute.
	 * @see #isSetPressureCtrlIG()
	 * @see #unsetPressureCtrlIG()
	 * @see #setPressureCtrlIG(float)
	 * @generated
	 */
	public float getPressureCtrlIG() {
		return pressureCtrlIG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Ctrl IG</em>' attribute.
	 * @see #isSetPressureCtrlIG()
	 * @see #unsetPressureCtrlIG()
	 * @see #getPressureCtrlIG()
	 * @generated
	 */
	public void setPressureCtrlIG(float newPressureCtrlIG) {
		pressureCtrlIG = newPressureCtrlIG;
		pressureCtrlIGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureCtrlIG()
	 * @see #getPressureCtrlIG()
	 * @see #setPressureCtrlIG(float)
	 * @generated
	 */
	public void unsetPressureCtrlIG() {
		pressureCtrlIG = PRESSURE_CTRL_IG_EDEFAULT;
		pressureCtrlIGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlIG <em>Pressure Ctrl IG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Ctrl IG</em>' attribute is set.
	 * @see #unsetPressureCtrlIG()
	 * @see #getPressureCtrlIG()
	 * @see #setPressureCtrlIG(float)
	 * @generated
	 */
	public boolean isSetPressureCtrlIG() {
		return pressureCtrlIGESet;
	}

	/**
	 * Returns the value of the '<em><b>Feed Water IG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Water IG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Water IG</em>' attribute.
	 * @see #isSetFeedWaterIG()
	 * @see #unsetFeedWaterIG()
	 * @see #setFeedWaterIG(float)
	 * @generated
	 */
	public float getFeedWaterIG() {
		return feedWaterIG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Water IG</em>' attribute.
	 * @see #isSetFeedWaterIG()
	 * @see #unsetFeedWaterIG()
	 * @see #getFeedWaterIG()
	 * @generated
	 */
	public void setFeedWaterIG(float newFeedWaterIG) {
		feedWaterIG = newFeedWaterIG;
		feedWaterIGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedWaterIG()
	 * @see #getFeedWaterIG()
	 * @see #setFeedWaterIG(float)
	 * @generated
	 */
	public void unsetFeedWaterIG() {
		feedWaterIG = FEED_WATER_IG_EDEFAULT;
		feedWaterIGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFeedWaterIG <em>Feed Water IG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feed Water IG</em>' attribute is set.
	 * @see #unsetFeedWaterIG()
	 * @see #getFeedWaterIG()
	 * @see #setFeedWaterIG(float)
	 * @generated
	 */
	public boolean isSetFeedWaterIG() {
		return feedWaterIGESet;
	}

	/**
	 * Returns the value of the '<em><b>Pressure Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Feedback</em>' attribute.
	 * @see #isSetPressureFeedback()
	 * @see #unsetPressureFeedback()
	 * @see #setPressureFeedback(int)
	 * @generated
	 */
	public int getPressureFeedback() {
		return pressureFeedback;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Feedback</em>' attribute.
	 * @see #isSetPressureFeedback()
	 * @see #unsetPressureFeedback()
	 * @see #getPressureFeedback()
	 * @generated
	 */
	public void setPressureFeedback(int newPressureFeedback) {
		pressureFeedback = newPressureFeedback;
		pressureFeedbackESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureFeedback()
	 * @see #getPressureFeedback()
	 * @see #setPressureFeedback(int)
	 * @generated
	 */
	public void unsetPressureFeedback() {
		pressureFeedback = PRESSURE_FEEDBACK_EDEFAULT;
		pressureFeedbackESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureFeedback <em>Pressure Feedback</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Feedback</em>' attribute is set.
	 * @see #unsetPressureFeedback()
	 * @see #getPressureFeedback()
	 * @see #setPressureFeedback(int)
	 * @generated
	 */
	public boolean isSetPressureFeedback() {
		return pressureFeedbackESet;
	}

	/**
	 * Returns the value of the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Versus Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Versus Voltage</em>' attribute.
	 * @see #isSetAuxPowerVersusVoltage()
	 * @see #unsetAuxPowerVersusVoltage()
	 * @see #setAuxPowerVersusVoltage(float)
	 * @generated
	 */
	public float getAuxPowerVersusVoltage() {
		return auxPowerVersusVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Versus Voltage</em>' attribute.
	 * @see #isSetAuxPowerVersusVoltage()
	 * @see #unsetAuxPowerVersusVoltage()
	 * @see #getAuxPowerVersusVoltage()
	 * @generated
	 */
	public void setAuxPowerVersusVoltage(float newAuxPowerVersusVoltage) {
		auxPowerVersusVoltage = newAuxPowerVersusVoltage;
		auxPowerVersusVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxPowerVersusVoltage()
	 * @see #getAuxPowerVersusVoltage()
	 * @see #setAuxPowerVersusVoltage(float)
	 * @generated
	 */
	public void unsetAuxPowerVersusVoltage() {
		auxPowerVersusVoltage = AUX_POWER_VERSUS_VOLTAGE_EDEFAULT;
		auxPowerVersusVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Power Versus Voltage</em>' attribute is set.
	 * @see #unsetAuxPowerVersusVoltage()
	 * @see #getAuxPowerVersusVoltage()
	 * @see #setAuxPowerVersusVoltage(float)
	 * @generated
	 */
	public boolean isSetAuxPowerVersusVoltage() {
		return auxPowerVersusVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Supply TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Supply TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Supply TC</em>' attribute.
	 * @see #isSetFuelSupplyTC()
	 * @see #unsetFuelSupplyTC()
	 * @see #setFuelSupplyTC(float)
	 * @generated
	 */
	public float getFuelSupplyTC() {
		return fuelSupplyTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Supply TC</em>' attribute.
	 * @see #isSetFuelSupplyTC()
	 * @see #unsetFuelSupplyTC()
	 * @see #getFuelSupplyTC()
	 * @generated
	 */
	public void setFuelSupplyTC(float newFuelSupplyTC) {
		fuelSupplyTC = newFuelSupplyTC;
		fuelSupplyTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelSupplyTC()
	 * @see #getFuelSupplyTC()
	 * @see #setFuelSupplyTC(float)
	 * @generated
	 */
	public void unsetFuelSupplyTC() {
		fuelSupplyTC = FUEL_SUPPLY_TC_EDEFAULT;
		fuelSupplyTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getFuelSupplyTC <em>Fuel Supply TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Supply TC</em>' attribute is set.
	 * @see #unsetFuelSupplyTC()
	 * @see #getFuelSupplyTC()
	 * @see #setFuelSupplyTC(float)
	 * @generated
	 */
	public boolean isSetFuelSupplyTC() {
		return fuelSupplyTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Error Rate P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Error Rate P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Error Rate P</em>' attribute.
	 * @see #isSetMaxErrorRateP()
	 * @see #unsetMaxErrorRateP()
	 * @see #setMaxErrorRateP(float)
	 * @generated
	 */
	public float getMaxErrorRateP() {
		return maxErrorRateP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Error Rate P</em>' attribute.
	 * @see #isSetMaxErrorRateP()
	 * @see #unsetMaxErrorRateP()
	 * @see #getMaxErrorRateP()
	 * @generated
	 */
	public void setMaxErrorRateP(float newMaxErrorRateP) {
		maxErrorRateP = newMaxErrorRateP;
		maxErrorRatePESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxErrorRateP()
	 * @see #getMaxErrorRateP()
	 * @see #setMaxErrorRateP(float)
	 * @generated
	 */
	public void unsetMaxErrorRateP() {
		maxErrorRateP = MAX_ERROR_RATE_P_EDEFAULT;
		maxErrorRatePESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getMaxErrorRateP <em>Max Error Rate P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Error Rate P</em>' attribute is set.
	 * @see #unsetMaxErrorRateP()
	 * @see #getMaxErrorRateP()
	 * @see #setMaxErrorRateP(float)
	 * @generated
	 */
	public boolean isSetMaxErrorRateP() {
		return maxErrorRatePESet;
	}

	/**
	 * Returns the value of the '<em><b>Super Heater Pipe PD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Heater Pipe PD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Heater Pipe PD</em>' attribute.
	 * @see #isSetSuperHeaterPipePD()
	 * @see #unsetSuperHeaterPipePD()
	 * @see #setSuperHeaterPipePD(float)
	 * @generated
	 */
	public float getSuperHeaterPipePD() {
		return superHeaterPipePD;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Heater Pipe PD</em>' attribute.
	 * @see #isSetSuperHeaterPipePD()
	 * @see #unsetSuperHeaterPipePD()
	 * @see #getSuperHeaterPipePD()
	 * @generated
	 */
	public void setSuperHeaterPipePD(float newSuperHeaterPipePD) {
		superHeaterPipePD = newSuperHeaterPipePD;
		superHeaterPipePDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuperHeaterPipePD()
	 * @see #getSuperHeaterPipePD()
	 * @see #setSuperHeaterPipePD(float)
	 * @generated
	 */
	public void unsetSuperHeaterPipePD() {
		superHeaterPipePD = SUPER_HEATER_PIPE_PD_EDEFAULT;
		superHeaterPipePDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeaterPipePD <em>Super Heater Pipe PD</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Super Heater Pipe PD</em>' attribute is set.
	 * @see #unsetSuperHeaterPipePD()
	 * @see #getSuperHeaterPipePD()
	 * @see #setSuperHeaterPipePD(float)
	 * @generated
	 */
	public boolean isSetSuperHeaterPipePD() {
		return superHeaterPipePDESet;
	}

	/**
	 * Returns the value of the '<em><b>Pressure Ctrl PG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Ctrl PG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Ctrl PG</em>' attribute.
	 * @see #isSetPressureCtrlPG()
	 * @see #unsetPressureCtrlPG()
	 * @see #setPressureCtrlPG(float)
	 * @generated
	 */
	public float getPressureCtrlPG() {
		return pressureCtrlPG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Ctrl PG</em>' attribute.
	 * @see #isSetPressureCtrlPG()
	 * @see #unsetPressureCtrlPG()
	 * @see #getPressureCtrlPG()
	 * @generated
	 */
	public void setPressureCtrlPG(float newPressureCtrlPG) {
		pressureCtrlPG = newPressureCtrlPG;
		pressureCtrlPGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureCtrlPG()
	 * @see #getPressureCtrlPG()
	 * @see #setPressureCtrlPG(float)
	 * @generated
	 */
	public void unsetPressureCtrlPG() {
		pressureCtrlPG = PRESSURE_CTRL_PG_EDEFAULT;
		pressureCtrlPGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getPressureCtrlPG <em>Pressure Ctrl PG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Ctrl PG</em>' attribute is set.
	 * @see #unsetPressureCtrlPG()
	 * @see #getPressureCtrlPG()
	 * @see #setPressureCtrlPG(float)
	 * @generated
	 */
	public boolean isSetPressureCtrlPG() {
		return pressureCtrlPGESet;
	}

	/**
	 * Returns the value of the '<em><b>Super Heater2 Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Heater2 Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Heater2 Capacity</em>' attribute.
	 * @see #isSetSuperHeater2Capacity()
	 * @see #unsetSuperHeater2Capacity()
	 * @see #setSuperHeater2Capacity(float)
	 * @generated
	 */
	public float getSuperHeater2Capacity() {
		return superHeater2Capacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Heater2 Capacity</em>' attribute.
	 * @see #isSetSuperHeater2Capacity()
	 * @see #unsetSuperHeater2Capacity()
	 * @see #getSuperHeater2Capacity()
	 * @generated
	 */
	public void setSuperHeater2Capacity(float newSuperHeater2Capacity) {
		superHeater2Capacity = newSuperHeater2Capacity;
		superHeater2CapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuperHeater2Capacity()
	 * @see #getSuperHeater2Capacity()
	 * @see #setSuperHeater2Capacity(float)
	 * @generated
	 */
	public void unsetSuperHeater2Capacity() {
		superHeater2Capacity = SUPER_HEATER2_CAPACITY_EDEFAULT;
		superHeater2CapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getSuperHeater2Capacity <em>Super Heater2 Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Super Heater2 Capacity</em>' attribute is set.
	 * @see #unsetSuperHeater2Capacity()
	 * @see #getSuperHeater2Capacity()
	 * @see #setSuperHeater2Capacity(float)
	 * @generated
	 */
	public boolean isSetSuperHeater2Capacity() {
		return superHeater2CapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Control IC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control IC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control IC</em>' attribute.
	 * @see #isSetControlIC()
	 * @see #unsetControlIC()
	 * @see #setControlIC(float)
	 * @generated
	 */
	public float getControlIC() {
		return controlIC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control IC</em>' attribute.
	 * @see #isSetControlIC()
	 * @see #unsetControlIC()
	 * @see #getControlIC()
	 * @generated
	 */
	public void setControlIC(float newControlIC) {
		controlIC = newControlIC;
		controlICESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlIC()
	 * @see #getControlIC()
	 * @see #setControlIC(float)
	 * @generated
	 */
	public void unsetControlIC() {
		controlIC = CONTROL_IC_EDEFAULT;
		controlICESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.FossilSteamSupply#getControlIC <em>Control IC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control IC</em>' attribute is set.
	 * @see #unsetControlIC()
	 * @see #getControlIC()
	 * @see #setControlIC(float)
	 * @generated
	 */
	public boolean isSetControlIC() {
		return controlICESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				return getFuelDemandLimit();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				return getAuxPowerVersusFrequency();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				return getMechPowerSensorLag();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				return getPressureCtrlDG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return getThrottlePressureSP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				return getFeedWaterPG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				return getFeedWaterTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				return getControlPC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				return getFuelSupplyDelay();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				return getControlPED();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				return getControlPEB();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				return getBoilerControlMode();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				return getControlTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				return getMinErrorRateP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				return getSuperHeater1Capacity();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				return getControlErrorBiasP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				return getPressureCtrlIG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				return getFeedWaterIG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				return getPressureFeedback();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				return getAuxPowerVersusVoltage();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				return getFuelSupplyTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				return getMaxErrorRateP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				return getSuperHeaterPipePD();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				return getPressureCtrlPG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				return getSuperHeater2Capacity();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				return getControlIC();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				setFuelDemandLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				setAuxPowerVersusFrequency((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				setMechPowerSensorLag((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				setPressureCtrlDG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				setThrottlePressureSP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				setFeedWaterPG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				setFeedWaterTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				setControlPC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				setFuelSupplyDelay((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				setControlPED((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				setControlPEB((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				setBoilerControlMode((BoilerControlMode)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				setControlTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				setMinErrorRateP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				setSuperHeater1Capacity((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				setControlErrorBiasP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				setPressureCtrlIG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				setFeedWaterIG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				setPressureFeedback((Integer)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				setAuxPowerVersusVoltage((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				setFuelSupplyTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				setMaxErrorRateP((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				setSuperHeaterPipePD((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				setPressureCtrlPG((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				setSuperHeater2Capacity((Float)newValue);
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				setControlIC((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				unsetFuelDemandLimit();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				unsetAuxPowerVersusFrequency();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				unsetMechPowerSensorLag();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				unsetPressureCtrlDG();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				unsetThrottlePressureSP();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				unsetFeedWaterPG();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				unsetFeedWaterTC();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				unsetControlPC();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				unsetFuelSupplyDelay();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				unsetControlPED();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				unsetControlPEB();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				unsetBoilerControlMode();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				unsetControlTC();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				unsetMinErrorRateP();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				unsetSuperHeater1Capacity();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				unsetControlErrorBiasP();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				unsetPressureCtrlIG();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				unsetFeedWaterIG();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				unsetPressureFeedback();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				unsetAuxPowerVersusVoltage();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				unsetFuelSupplyTC();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				unsetMaxErrorRateP();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				unsetSuperHeaterPipePD();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				unsetPressureCtrlPG();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				unsetSuperHeater2Capacity();
				return;
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				unsetControlIC();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_DEMAND_LIMIT:
				return isSetFuelDemandLimit();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_FREQUENCY:
				return isSetAuxPowerVersusFrequency();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MECH_POWER_SENSOR_LAG:
				return isSetMechPowerSensorLag();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_DG:
				return isSetPressureCtrlDG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return isSetThrottlePressureSP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_PG:
				return isSetFeedWaterPG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_TC:
				return isSetFeedWaterTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PC:
				return isSetControlPC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_DELAY:
				return isSetFuelSupplyDelay();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PED:
				return isSetControlPED();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_PEB:
				return isSetControlPEB();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__BOILER_CONTROL_MODE:
				return isSetBoilerControlMode();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_TC:
				return isSetControlTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MIN_ERROR_RATE_P:
				return isSetMinErrorRateP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER1_CAPACITY:
				return isSetSuperHeater1Capacity();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_ERROR_BIAS_P:
				return isSetControlErrorBiasP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_IG:
				return isSetPressureCtrlIG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FEED_WATER_IG:
				return isSetFeedWaterIG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_FEEDBACK:
				return isSetPressureFeedback();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__AUX_POWER_VERSUS_VOLTAGE:
				return isSetAuxPowerVersusVoltage();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__FUEL_SUPPLY_TC:
				return isSetFuelSupplyTC();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__MAX_ERROR_RATE_P:
				return isSetMaxErrorRateP();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER_PIPE_PD:
				return isSetSuperHeaterPipePD();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__PRESSURE_CTRL_PG:
				return isSetPressureCtrlPG();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__SUPER_HEATER2_CAPACITY:
				return isSetSuperHeater2Capacity();
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY__CONTROL_IC:
				return isSetControlIC();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fuelDemandLimit: ");
		if (fuelDemandLimitESet) result.append(fuelDemandLimit); else result.append("<unset>");
		result.append(", auxPowerVersusFrequency: ");
		if (auxPowerVersusFrequencyESet) result.append(auxPowerVersusFrequency); else result.append("<unset>");
		result.append(", mechPowerSensorLag: ");
		if (mechPowerSensorLagESet) result.append(mechPowerSensorLag); else result.append("<unset>");
		result.append(", pressureCtrlDG: ");
		if (pressureCtrlDGESet) result.append(pressureCtrlDG); else result.append("<unset>");
		result.append(", throttlePressureSP: ");
		if (throttlePressureSPESet) result.append(throttlePressureSP); else result.append("<unset>");
		result.append(", feedWaterPG: ");
		if (feedWaterPGESet) result.append(feedWaterPG); else result.append("<unset>");
		result.append(", feedWaterTC: ");
		if (feedWaterTCESet) result.append(feedWaterTC); else result.append("<unset>");
		result.append(", controlPC: ");
		if (controlPCESet) result.append(controlPC); else result.append("<unset>");
		result.append(", fuelSupplyDelay: ");
		if (fuelSupplyDelayESet) result.append(fuelSupplyDelay); else result.append("<unset>");
		result.append(", controlPED: ");
		if (controlPEDESet) result.append(controlPED); else result.append("<unset>");
		result.append(", controlPEB: ");
		if (controlPEBESet) result.append(controlPEB); else result.append("<unset>");
		result.append(", boilerControlMode: ");
		if (boilerControlModeESet) result.append(boilerControlMode); else result.append("<unset>");
		result.append(", controlTC: ");
		if (controlTCESet) result.append(controlTC); else result.append("<unset>");
		result.append(", minErrorRateP: ");
		if (minErrorRatePESet) result.append(minErrorRateP); else result.append("<unset>");
		result.append(", superHeater1Capacity: ");
		if (superHeater1CapacityESet) result.append(superHeater1Capacity); else result.append("<unset>");
		result.append(", controlErrorBiasP: ");
		if (controlErrorBiasPESet) result.append(controlErrorBiasP); else result.append("<unset>");
		result.append(", pressureCtrlIG: ");
		if (pressureCtrlIGESet) result.append(pressureCtrlIG); else result.append("<unset>");
		result.append(", feedWaterIG: ");
		if (feedWaterIGESet) result.append(feedWaterIG); else result.append("<unset>");
		result.append(", pressureFeedback: ");
		if (pressureFeedbackESet) result.append(pressureFeedback); else result.append("<unset>");
		result.append(", auxPowerVersusVoltage: ");
		if (auxPowerVersusVoltageESet) result.append(auxPowerVersusVoltage); else result.append("<unset>");
		result.append(", fuelSupplyTC: ");
		if (fuelSupplyTCESet) result.append(fuelSupplyTC); else result.append("<unset>");
		result.append(", maxErrorRateP: ");
		if (maxErrorRatePESet) result.append(maxErrorRateP); else result.append("<unset>");
		result.append(", superHeaterPipePD: ");
		if (superHeaterPipePDESet) result.append(superHeaterPipePD); else result.append("<unset>");
		result.append(", pressureCtrlPG: ");
		if (pressureCtrlPGESet) result.append(pressureCtrlPG); else result.append("<unset>");
		result.append(", superHeater2Capacity: ");
		if (superHeater2CapacityESet) result.append(superHeater2Capacity); else result.append("<unset>");
		result.append(", controlIC: ");
		if (controlICESet) result.append(controlIC); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FossilSteamSupply
