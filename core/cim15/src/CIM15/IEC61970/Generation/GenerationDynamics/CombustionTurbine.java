/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import CIM15.IEC61970.Generation.Production.AirCompressor;
import CIM15.IEC61970.Generation.Production.ProductionPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combustion Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombustionTurbine extends PrimeMover {
	/**
	 * The default value of the '{@link #getCapabilityVersusFrequency() <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPABILITY_VERSUS_FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapabilityVersusFrequency() <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityVersusFrequency()
	 * @generated
	 * @ordered
	 */
	protected float capabilityVersusFrequency = CAPABILITY_VERSUS_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Capability Versus Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capabilityVersusFrequencyESet;

	/**
	 * The default value of the '{@link #getReferenceTemp() <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float REFERENCE_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReferenceTemp() <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTemp()
	 * @generated
	 * @ordered
	 */
	protected float referenceTemp = REFERENCE_TEMP_EDEFAULT;

	/**
	 * This is true if the Reference Temp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceTempESet;

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
	 * The default value of the '{@link #getPowerVariationByTemp() <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerVariationByTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_VARIATION_BY_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerVariationByTemp() <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerVariationByTemp()
	 * @generated
	 * @ordered
	 */
	protected float powerVariationByTemp = POWER_VARIATION_BY_TEMP_EDEFAULT;

	/**
	 * This is true if the Power Variation By Temp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerVariationByTempESet;

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
	 * The default value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_CONSTANT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected float timeConstant = TIME_CONSTANT_EDEFAULT;

	/**
	 * This is true if the Time Constant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeConstantESet;

	/**
	 * The cached value of the '{@link #getHeatRecoveryBoiler() <em>Heat Recovery Boiler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatRecoveryBoiler()
	 * @generated
	 * @ordered
	 */
	protected HeatRecoveryBoiler heatRecoveryBoiler;

	/**
	 * The default value of the '{@link #isHeatRecoveryFlag() <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeatRecoveryFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEAT_RECOVERY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeatRecoveryFlag() <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeatRecoveryFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean heatRecoveryFlag = HEAT_RECOVERY_FLAG_EDEFAULT;

	/**
	 * This is true if the Heat Recovery Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heatRecoveryFlagESet;

	/**
	 * The cached value of the '{@link #getAirCompressor() <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressor()
	 * @generated
	 * @ordered
	 */
	protected AirCompressor airCompressor;

	/**
	 * The cached value of the '{@link #getCTTempActivePowerCurve() <em>CT Temp Active Power Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTTempActivePowerCurve()
	 * @generated
	 * @ordered
	 */
	protected CTTempActivePowerCurve ctTempActivePowerCurve;

	/**
	 * The default value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float AMBIENT_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmbientTemp() <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientTemp()
	 * @generated
	 * @ordered
	 */
	protected float ambientTemp = AMBIENT_TEMP_EDEFAULT;

	/**
	 * This is true if the Ambient Temp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ambientTempESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombustionTurbine() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.COMBUSTION_TURBINE;
	}

	/**
	 * Returns the value of the '<em><b>Capability Versus Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Versus Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Versus Frequency</em>' attribute.
	 * @see #isSetCapabilityVersusFrequency()
	 * @see #unsetCapabilityVersusFrequency()
	 * @see #setCapabilityVersusFrequency(float)
	 * @generated
	 */
	public float getCapabilityVersusFrequency() {
		return capabilityVersusFrequency;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Versus Frequency</em>' attribute.
	 * @see #isSetCapabilityVersusFrequency()
	 * @see #unsetCapabilityVersusFrequency()
	 * @see #getCapabilityVersusFrequency()
	 * @generated
	 */
	public void setCapabilityVersusFrequency(float newCapabilityVersusFrequency) {
		capabilityVersusFrequency = newCapabilityVersusFrequency;
		capabilityVersusFrequencyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapabilityVersusFrequency()
	 * @see #getCapabilityVersusFrequency()
	 * @see #setCapabilityVersusFrequency(float)
	 * @generated
	 */
	public void unsetCapabilityVersusFrequency() {
		capabilityVersusFrequency = CAPABILITY_VERSUS_FREQUENCY_EDEFAULT;
		capabilityVersusFrequencyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capability Versus Frequency</em>' attribute is set.
	 * @see #unsetCapabilityVersusFrequency()
	 * @see #getCapabilityVersusFrequency()
	 * @see #setCapabilityVersusFrequency(float)
	 * @generated
	 */
	public boolean isSetCapabilityVersusFrequency() {
		return capabilityVersusFrequencyESet;
	}

	/**
	 * Returns the value of the '<em><b>Reference Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Temp</em>' attribute.
	 * @see #isSetReferenceTemp()
	 * @see #unsetReferenceTemp()
	 * @see #setReferenceTemp(float)
	 * @generated
	 */
	public float getReferenceTemp() {
		return referenceTemp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Temp</em>' attribute.
	 * @see #isSetReferenceTemp()
	 * @see #unsetReferenceTemp()
	 * @see #getReferenceTemp()
	 * @generated
	 */
	public void setReferenceTemp(float newReferenceTemp) {
		referenceTemp = newReferenceTemp;
		referenceTempESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceTemp()
	 * @see #getReferenceTemp()
	 * @see #setReferenceTemp(float)
	 * @generated
	 */
	public void unsetReferenceTemp() {
		referenceTemp = REFERENCE_TEMP_EDEFAULT;
		referenceTempESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Temp</em>' attribute is set.
	 * @see #unsetReferenceTemp()
	 * @see #getReferenceTemp()
	 * @see #setReferenceTemp(float)
	 * @generated
	 */
	public boolean isSetReferenceTemp() {
		return referenceTempESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Power Variation By Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Variation By Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Variation By Temp</em>' attribute.
	 * @see #isSetPowerVariationByTemp()
	 * @see #unsetPowerVariationByTemp()
	 * @see #setPowerVariationByTemp(float)
	 * @generated
	 */
	public float getPowerVariationByTemp() {
		return powerVariationByTemp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Variation By Temp</em>' attribute.
	 * @see #isSetPowerVariationByTemp()
	 * @see #unsetPowerVariationByTemp()
	 * @see #getPowerVariationByTemp()
	 * @generated
	 */
	public void setPowerVariationByTemp(float newPowerVariationByTemp) {
		powerVariationByTemp = newPowerVariationByTemp;
		powerVariationByTempESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerVariationByTemp()
	 * @see #getPowerVariationByTemp()
	 * @see #setPowerVariationByTemp(float)
	 * @generated
	 */
	public void unsetPowerVariationByTemp() {
		powerVariationByTemp = POWER_VARIATION_BY_TEMP_EDEFAULT;
		powerVariationByTempESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Variation By Temp</em>' attribute is set.
	 * @see #unsetPowerVariationByTemp()
	 * @see #getPowerVariationByTemp()
	 * @see #setPowerVariationByTemp(float)
	 * @generated
	 */
	public boolean isSetPowerVariationByTemp() {
		return powerVariationByTempESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Time Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Constant</em>' attribute.
	 * @see #isSetTimeConstant()
	 * @see #unsetTimeConstant()
	 * @see #setTimeConstant(float)
	 * @generated
	 */
	public float getTimeConstant() {
		return timeConstant;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constant</em>' attribute.
	 * @see #isSetTimeConstant()
	 * @see #unsetTimeConstant()
	 * @see #getTimeConstant()
	 * @generated
	 */
	public void setTimeConstant(float newTimeConstant) {
		timeConstant = newTimeConstant;
		timeConstantESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeConstant()
	 * @see #getTimeConstant()
	 * @see #setTimeConstant(float)
	 * @generated
	 */
	public void unsetTimeConstant() {
		timeConstant = TIME_CONSTANT_EDEFAULT;
		timeConstantESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Constant</em>' attribute is set.
	 * @see #unsetTimeConstant()
	 * @see #getTimeConstant()
	 * @see #setTimeConstant(float)
	 * @generated
	 */
	public boolean isSetTimeConstant() {
		return timeConstantESet;
	}

	/**
	 * Returns the value of the '<em><b>Heat Recovery Boiler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Recovery Boiler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Recovery Boiler</em>' reference.
	 * @see #setHeatRecoveryBoiler(HeatRecoveryBoiler)
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines
	 * @generated
	 */
	public HeatRecoveryBoiler getHeatRecoveryBoiler() {
		if (heatRecoveryBoiler != null && heatRecoveryBoiler.eIsProxy()) {
			InternalEObject oldHeatRecoveryBoiler = (InternalEObject)heatRecoveryBoiler;
			heatRecoveryBoiler = (HeatRecoveryBoiler)eResolveProxy(oldHeatRecoveryBoiler);
			if (heatRecoveryBoiler != oldHeatRecoveryBoiler) {
			}
		}
		return heatRecoveryBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRecoveryBoiler basicGetHeatRecoveryBoiler() {
		return heatRecoveryBoiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatRecoveryBoiler(HeatRecoveryBoiler newHeatRecoveryBoiler, NotificationChain msgs) {
		HeatRecoveryBoiler oldHeatRecoveryBoiler = heatRecoveryBoiler;
		heatRecoveryBoiler = newHeatRecoveryBoiler;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Recovery Boiler</em>' reference.
	 * @see #getHeatRecoveryBoiler()
	 * @generated
	 */
	public void setHeatRecoveryBoiler(HeatRecoveryBoiler newHeatRecoveryBoiler) {
		if (newHeatRecoveryBoiler != heatRecoveryBoiler) {
			NotificationChain msgs = null;
			if (heatRecoveryBoiler != null)
				msgs = ((InternalEObject)heatRecoveryBoiler).eInverseRemove(this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs);
			if (newHeatRecoveryBoiler != null)
				msgs = ((InternalEObject)newHeatRecoveryBoiler).eInverseAdd(this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs);
			msgs = basicSetHeatRecoveryBoiler(newHeatRecoveryBoiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Heat Recovery Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Recovery Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Recovery Flag</em>' attribute.
	 * @see #isSetHeatRecoveryFlag()
	 * @see #unsetHeatRecoveryFlag()
	 * @see #setHeatRecoveryFlag(boolean)
	 * @generated
	 */
	public boolean isHeatRecoveryFlag() {
		return heatRecoveryFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Recovery Flag</em>' attribute.
	 * @see #isSetHeatRecoveryFlag()
	 * @see #unsetHeatRecoveryFlag()
	 * @see #isHeatRecoveryFlag()
	 * @generated
	 */
	public void setHeatRecoveryFlag(boolean newHeatRecoveryFlag) {
		heatRecoveryFlag = newHeatRecoveryFlag;
		heatRecoveryFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeatRecoveryFlag()
	 * @see #isHeatRecoveryFlag()
	 * @see #setHeatRecoveryFlag(boolean)
	 * @generated
	 */
	public void unsetHeatRecoveryFlag() {
		heatRecoveryFlag = HEAT_RECOVERY_FLAG_EDEFAULT;
		heatRecoveryFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#isHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heat Recovery Flag</em>' attribute is set.
	 * @see #unsetHeatRecoveryFlag()
	 * @see #isHeatRecoveryFlag()
	 * @see #setHeatRecoveryFlag(boolean)
	 * @generated
	 */
	public boolean isSetHeatRecoveryFlag() {
		return heatRecoveryFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Air Compressor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Compressor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Compressor</em>' reference.
	 * @see #setAirCompressor(AirCompressor)
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine
	 * @generated
	 */
	public AirCompressor getAirCompressor() {
		if (airCompressor != null && airCompressor.eIsProxy()) {
			InternalEObject oldAirCompressor = (InternalEObject)airCompressor;
			airCompressor = (AirCompressor)eResolveProxy(oldAirCompressor);
			if (airCompressor != oldAirCompressor) {
			}
		}
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor basicGetAirCompressor() {
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirCompressor(AirCompressor newAirCompressor, NotificationChain msgs) {
		AirCompressor oldAirCompressor = airCompressor;
		airCompressor = newAirCompressor;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Compressor</em>' reference.
	 * @see #getAirCompressor()
	 * @generated
	 */
	public void setAirCompressor(AirCompressor newAirCompressor) {
		if (newAirCompressor != airCompressor) {
			NotificationChain msgs = null;
			if (airCompressor != null)
				msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs);
			if (newAirCompressor != null)
				msgs = ((InternalEObject)newAirCompressor).eInverseAdd(this, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs);
			msgs = basicSetAirCompressor(newAirCompressor, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>CT Temp Active Power Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CT Temp Active Power Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CT Temp Active Power Curve</em>' reference.
	 * @see #setCTTempActivePowerCurve(CTTempActivePowerCurve)
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine
	 * @generated
	 */
	public CTTempActivePowerCurve getCTTempActivePowerCurve() {
		if (ctTempActivePowerCurve != null && ctTempActivePowerCurve.eIsProxy()) {
			InternalEObject oldCTTempActivePowerCurve = (InternalEObject)ctTempActivePowerCurve;
			ctTempActivePowerCurve = (CTTempActivePowerCurve)eResolveProxy(oldCTTempActivePowerCurve);
			if (ctTempActivePowerCurve != oldCTTempActivePowerCurve) {
			}
		}
		return ctTempActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTTempActivePowerCurve basicGetCTTempActivePowerCurve() {
		return ctTempActivePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTTempActivePowerCurve(CTTempActivePowerCurve newCTTempActivePowerCurve, NotificationChain msgs) {
		CTTempActivePowerCurve oldCTTempActivePowerCurve = ctTempActivePowerCurve;
		ctTempActivePowerCurve = newCTTempActivePowerCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CT Temp Active Power Curve</em>' reference.
	 * @see #getCTTempActivePowerCurve()
	 * @generated
	 */
	public void setCTTempActivePowerCurve(CTTempActivePowerCurve newCTTempActivePowerCurve) {
		if (newCTTempActivePowerCurve != ctTempActivePowerCurve) {
			NotificationChain msgs = null;
			if (ctTempActivePowerCurve != null)
				msgs = ((InternalEObject)ctTempActivePowerCurve).eInverseRemove(this, GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs);
			if (newCTTempActivePowerCurve != null)
				msgs = ((InternalEObject)newCTTempActivePowerCurve).eInverseAdd(this, GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs);
			msgs = basicSetCTTempActivePowerCurve(newCTTempActivePowerCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Ambient Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Temp</em>' attribute.
	 * @see #isSetAmbientTemp()
	 * @see #unsetAmbientTemp()
	 * @see #setAmbientTemp(float)
	 * @generated
	 */
	public float getAmbientTemp() {
		return ambientTemp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Temp</em>' attribute.
	 * @see #isSetAmbientTemp()
	 * @see #unsetAmbientTemp()
	 * @see #getAmbientTemp()
	 * @generated
	 */
	public void setAmbientTemp(float newAmbientTemp) {
		ambientTemp = newAmbientTemp;
		ambientTempESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmbientTemp()
	 * @see #getAmbientTemp()
	 * @see #setAmbientTemp(float)
	 * @generated
	 */
	public void unsetAmbientTemp() {
		ambientTemp = AMBIENT_TEMP_EDEFAULT;
		ambientTempESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ambient Temp</em>' attribute is set.
	 * @see #unsetAmbientTemp()
	 * @see #getAmbientTemp()
	 * @see #setAmbientTemp(float)
	 * @generated
	 */
	public boolean isSetAmbientTemp() {
		return ambientTempESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				if (heatRecoveryBoiler != null)
					msgs = ((InternalEObject)heatRecoveryBoiler).eInverseRemove(this, GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES, HeatRecoveryBoiler.class, msgs);
				return basicSetHeatRecoveryBoiler((HeatRecoveryBoiler)otherEnd, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				if (airCompressor != null)
					msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, AirCompressor.class, msgs);
				return basicSetAirCompressor((AirCompressor)otherEnd, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				if (ctTempActivePowerCurve != null)
					msgs = ((InternalEObject)ctTempActivePowerCurve).eInverseRemove(this, GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, CTTempActivePowerCurve.class, msgs);
				return basicSetCTTempActivePowerCurve((CTTempActivePowerCurve)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				return basicSetHeatRecoveryBoiler(null, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				return basicSetAirCompressor(null, msgs);
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				return basicSetCTTempActivePowerCurve(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				return getCapabilityVersusFrequency();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				return getReferenceTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				return getAuxPowerVersusFrequency();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				return getPowerVariationByTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				return getAuxPowerVersusVoltage();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				return getTimeConstant();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				if (resolve) return getHeatRecoveryBoiler();
				return basicGetHeatRecoveryBoiler();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				return isHeatRecoveryFlag();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				if (resolve) return getAirCompressor();
				return basicGetAirCompressor();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				if (resolve) return getCTTempActivePowerCurve();
				return basicGetCTTempActivePowerCurve();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				return getAmbientTemp();
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				setCapabilityVersusFrequency((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				setReferenceTemp((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				setAuxPowerVersusFrequency((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				setPowerVariationByTemp((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				setAuxPowerVersusVoltage((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				setTimeConstant((Float)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				setHeatRecoveryBoiler((HeatRecoveryBoiler)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				setHeatRecoveryFlag((Boolean)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				setCTTempActivePowerCurve((CTTempActivePowerCurve)newValue);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				setAmbientTemp((Float)newValue);
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				unsetCapabilityVersusFrequency();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				unsetReferenceTemp();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				unsetAuxPowerVersusFrequency();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				unsetPowerVariationByTemp();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				unsetAuxPowerVersusVoltage();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				unsetTimeConstant();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				setHeatRecoveryBoiler((HeatRecoveryBoiler)null);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				unsetHeatRecoveryFlag();
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)null);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				setCTTempActivePowerCurve((CTTempActivePowerCurve)null);
				return;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				unsetAmbientTemp();
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
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
				return isSetCapabilityVersusFrequency();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
				return isSetReferenceTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
				return isSetAuxPowerVersusFrequency();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
				return isSetPowerVariationByTemp();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
				return isSetAuxPowerVersusVoltage();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
				return isSetTimeConstant();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_BOILER:
				return heatRecoveryBoiler != null;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
				return isSetHeatRecoveryFlag();
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR:
				return airCompressor != null;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE:
				return ctTempActivePowerCurve != null;
			case GenerationDynamicsPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
				return isSetAmbientTemp();
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
		result.append(" (capabilityVersusFrequency: ");
		if (capabilityVersusFrequencyESet) result.append(capabilityVersusFrequency); else result.append("<unset>");
		result.append(", referenceTemp: ");
		if (referenceTempESet) result.append(referenceTemp); else result.append("<unset>");
		result.append(", auxPowerVersusFrequency: ");
		if (auxPowerVersusFrequencyESet) result.append(auxPowerVersusFrequency); else result.append("<unset>");
		result.append(", powerVariationByTemp: ");
		if (powerVariationByTempESet) result.append(powerVariationByTemp); else result.append("<unset>");
		result.append(", auxPowerVersusVoltage: ");
		if (auxPowerVersusVoltageESet) result.append(auxPowerVersusVoltage); else result.append("<unset>");
		result.append(", timeConstant: ");
		if (timeConstantESet) result.append(timeConstant); else result.append("<unset>");
		result.append(", heatRecoveryFlag: ");
		if (heatRecoveryFlagESet) result.append(heatRecoveryFlag); else result.append("<unset>");
		result.append(", ambientTemp: ");
		if (ambientTempESet) result.append(ambientTemp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CombustionTurbine
