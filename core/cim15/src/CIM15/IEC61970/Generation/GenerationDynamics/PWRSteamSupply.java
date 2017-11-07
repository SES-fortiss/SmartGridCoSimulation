/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PWRSteamSupply extends SteamSupply {
	/**
	 * The default value of the '{@link #getCoreNeutronicsHT() <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsHT()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_NEUTRONICS_HT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreNeutronicsHT() <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsHT()
	 * @generated
	 * @ordered
	 */
	protected float coreNeutronicsHT = CORE_NEUTRONICS_HT_EDEFAULT;

	/**
	 * This is true if the Core Neutronics HT attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreNeutronicsHTESet;

	/**
	 * The default value of the '{@link #getSteamFlowFG() <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamFlowFG()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_FLOW_FG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamFlowFG() <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamFlowFG()
	 * @generated
	 * @ordered
	 */
	protected float steamFlowFG = STEAM_FLOW_FG_EDEFAULT;

	/**
	 * This is true if the Steam Flow FG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steamFlowFGESet;

	/**
	 * The default value of the '{@link #getHotLegToColdLegGain() <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegToColdLegGain()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotLegToColdLegGain() <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegToColdLegGain()
	 * @generated
	 * @ordered
	 */
	protected float hotLegToColdLegGain = HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT;

	/**
	 * This is true if the Hot Leg To Cold Leg Gain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hotLegToColdLegGainESet;

	/**
	 * The default value of the '{@link #getSteamPressureDropLagTC() <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureDropLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamPressureDropLagTC() <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureDropLagTC()
	 * @generated
	 * @ordered
	 */
	protected float steamPressureDropLagTC = STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT;

	/**
	 * This is true if the Steam Pressure Drop Lag TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steamPressureDropLagTCESet;

	/**
	 * The default value of the '{@link #getCoreHTLagTC1() <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC1()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_HT_LAG_TC1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreHTLagTC1() <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC1()
	 * @generated
	 * @ordered
	 */
	protected float coreHTLagTC1 = CORE_HT_LAG_TC1_EDEFAULT;

	/**
	 * This is true if the Core HT Lag TC1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreHTLagTC1ESet;

	/**
	 * The default value of the '{@link #getCoreHTLagTC2() <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC2()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_HT_LAG_TC2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreHTLagTC2() <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreHTLagTC2()
	 * @generated
	 * @ordered
	 */
	protected float coreHTLagTC2 = CORE_HT_LAG_TC2_EDEFAULT;

	/**
	 * This is true if the Core HT Lag TC2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreHTLagTC2ESet;

	/**
	 * The default value of the '{@link #getHotLegLagTC() <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_LEG_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotLegLagTC() <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected float hotLegLagTC = HOT_LEG_LAG_TC_EDEFAULT;

	/**
	 * This is true if the Hot Leg Lag TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hotLegLagTCESet;

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
	 * The default value of the '{@link #getHotLegSteamGain() <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegSteamGain()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_LEG_STEAM_GAIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotLegSteamGain() <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotLegSteamGain()
	 * @generated
	 * @ordered
	 */
	protected float hotLegSteamGain = HOT_LEG_STEAM_GAIN_EDEFAULT;

	/**
	 * This is true if the Hot Leg Steam Gain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hotLegSteamGainESet;

	/**
	 * The default value of the '{@link #getThrottlePressureFactor() <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float THROTTLE_PRESSURE_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThrottlePressureFactor() <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlePressureFactor()
	 * @generated
	 * @ordered
	 */
	protected float throttlePressureFactor = THROTTLE_PRESSURE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Throttle Pressure Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean throttlePressureFactorESet;

	/**
	 * The default value of the '{@link #getColdLegFBLagTC() <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FB_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFBLagTC() <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLagTC()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFBLagTC = COLD_LEG_FB_LAG_TC_EDEFAULT;

	/**
	 * This is true if the Cold Leg FB Lag TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coldLegFBLagTCESet;

	/**
	 * The default value of the '{@link #getPressureCG() <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCG()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_CG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressureCG() <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureCG()
	 * @generated
	 * @ordered
	 */
	protected float pressureCG = PRESSURE_CG_EDEFAULT;

	/**
	 * This is true if the Pressure CG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureCGESet;

	/**
	 * The default value of the '{@link #getSteamPressureFG() <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureFG()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_PRESSURE_FG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamPressureFG() <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamPressureFG()
	 * @generated
	 * @ordered
	 */
	protected float steamPressureFG = STEAM_PRESSURE_FG_EDEFAULT;

	/**
	 * This is true if the Steam Pressure FG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steamPressureFGESet;

	/**
	 * The default value of the '{@link #getFeedbackFactor() <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float FEEDBACK_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFeedbackFactor() <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackFactor()
	 * @generated
	 * @ordered
	 */
	protected float feedbackFactor = FEEDBACK_FACTOR_EDEFAULT;

	/**
	 * This is true if the Feedback Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedbackFactorESet;

	/**
	 * The default value of the '{@link #getCoreNeutronicsEffTC() <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsEffTC()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_NEUTRONICS_EFF_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreNeutronicsEffTC() <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreNeutronicsEffTC()
	 * @generated
	 * @ordered
	 */
	protected float coreNeutronicsEffTC = CORE_NEUTRONICS_EFF_TC_EDEFAULT;

	/**
	 * This is true if the Core Neutronics Eff TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreNeutronicsEffTCESet;

	/**
	 * The default value of the '{@link #getColdLegFG2() <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG2()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FG2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFG2() <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG2()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFG2 = COLD_LEG_FG2_EDEFAULT;

	/**
	 * This is true if the Cold Leg FG2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coldLegFG2ESet;

	/**
	 * The default value of the '{@link #getColdLegFG1() <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG1()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FG1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFG1() <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFG1()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFG1 = COLD_LEG_FG1_EDEFAULT;

	/**
	 * This is true if the Cold Leg FG1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coldLegFG1ESet;

	/**
	 * The default value of the '{@link #getColdLegLagTC() <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_LAG_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegLagTC() <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegLagTC()
	 * @generated
	 * @ordered
	 */
	protected float coldLegLagTC = COLD_LEG_LAG_TC_EDEFAULT;

	/**
	 * This is true if the Cold Leg Lag TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coldLegLagTCESet;

	/**
	 * The default value of the '{@link #getColdLegFBLeadTC2() <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC2()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FB_LEAD_TC2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFBLeadTC2() <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC2()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFBLeadTC2 = COLD_LEG_FB_LEAD_TC2_EDEFAULT;

	/**
	 * This is true if the Cold Leg FB Lead TC2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coldLegFBLeadTC2ESet;

	/**
	 * The default value of the '{@link #getColdLegFBLeadTC1() <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC1()
	 * @generated
	 * @ordered
	 */
	protected static final float COLD_LEG_FB_LEAD_TC1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getColdLegFBLeadTC1() <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColdLegFBLeadTC1()
	 * @generated
	 * @ordered
	 */
	protected float coldLegFBLeadTC1 = COLD_LEG_FB_LEAD_TC1_EDEFAULT;

	/**
	 * This is true if the Cold Leg FB Lead TC1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coldLegFBLeadTC1ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PWRSteamSupply() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.PWR_STEAM_SUPPLY;
	}

	/**
	 * Returns the value of the '<em><b>Core Neutronics HT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Neutronics HT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Neutronics HT</em>' attribute.
	 * @see #isSetCoreNeutronicsHT()
	 * @see #unsetCoreNeutronicsHT()
	 * @see #setCoreNeutronicsHT(float)
	 * @generated
	 */
	public float getCoreNeutronicsHT() {
		return coreNeutronicsHT;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Neutronics HT</em>' attribute.
	 * @see #isSetCoreNeutronicsHT()
	 * @see #unsetCoreNeutronicsHT()
	 * @see #getCoreNeutronicsHT()
	 * @generated
	 */
	public void setCoreNeutronicsHT(float newCoreNeutronicsHT) {
		coreNeutronicsHT = newCoreNeutronicsHT;
		coreNeutronicsHTESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreNeutronicsHT()
	 * @see #getCoreNeutronicsHT()
	 * @see #setCoreNeutronicsHT(float)
	 * @generated
	 */
	public void unsetCoreNeutronicsHT() {
		coreNeutronicsHT = CORE_NEUTRONICS_HT_EDEFAULT;
		coreNeutronicsHTESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsHT <em>Core Neutronics HT</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Neutronics HT</em>' attribute is set.
	 * @see #unsetCoreNeutronicsHT()
	 * @see #getCoreNeutronicsHT()
	 * @see #setCoreNeutronicsHT(float)
	 * @generated
	 */
	public boolean isSetCoreNeutronicsHT() {
		return coreNeutronicsHTESet;
	}

	/**
	 * Returns the value of the '<em><b>Steam Flow FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Flow FG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Flow FG</em>' attribute.
	 * @see #isSetSteamFlowFG()
	 * @see #unsetSteamFlowFG()
	 * @see #setSteamFlowFG(float)
	 * @generated
	 */
	public float getSteamFlowFG() {
		return steamFlowFG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Flow FG</em>' attribute.
	 * @see #isSetSteamFlowFG()
	 * @see #unsetSteamFlowFG()
	 * @see #getSteamFlowFG()
	 * @generated
	 */
	public void setSteamFlowFG(float newSteamFlowFG) {
		steamFlowFG = newSteamFlowFG;
		steamFlowFGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteamFlowFG()
	 * @see #getSteamFlowFG()
	 * @see #setSteamFlowFG(float)
	 * @generated
	 */
	public void unsetSteamFlowFG() {
		steamFlowFG = STEAM_FLOW_FG_EDEFAULT;
		steamFlowFGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamFlowFG <em>Steam Flow FG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steam Flow FG</em>' attribute is set.
	 * @see #unsetSteamFlowFG()
	 * @see #getSteamFlowFG()
	 * @see #setSteamFlowFG(float)
	 * @generated
	 */
	public boolean isSetSteamFlowFG() {
		return steamFlowFGESet;
	}

	/**
	 * Returns the value of the '<em><b>Hot Leg To Cold Leg Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Leg To Cold Leg Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Leg To Cold Leg Gain</em>' attribute.
	 * @see #isSetHotLegToColdLegGain()
	 * @see #unsetHotLegToColdLegGain()
	 * @see #setHotLegToColdLegGain(float)
	 * @generated
	 */
	public float getHotLegToColdLegGain() {
		return hotLegToColdLegGain;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Leg To Cold Leg Gain</em>' attribute.
	 * @see #isSetHotLegToColdLegGain()
	 * @see #unsetHotLegToColdLegGain()
	 * @see #getHotLegToColdLegGain()
	 * @generated
	 */
	public void setHotLegToColdLegGain(float newHotLegToColdLegGain) {
		hotLegToColdLegGain = newHotLegToColdLegGain;
		hotLegToColdLegGainESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHotLegToColdLegGain()
	 * @see #getHotLegToColdLegGain()
	 * @see #setHotLegToColdLegGain(float)
	 * @generated
	 */
	public void unsetHotLegToColdLegGain() {
		hotLegToColdLegGain = HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT;
		hotLegToColdLegGainESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hot Leg To Cold Leg Gain</em>' attribute is set.
	 * @see #unsetHotLegToColdLegGain()
	 * @see #getHotLegToColdLegGain()
	 * @see #setHotLegToColdLegGain(float)
	 * @generated
	 */
	public boolean isSetHotLegToColdLegGain() {
		return hotLegToColdLegGainESet;
	}

	/**
	 * Returns the value of the '<em><b>Steam Pressure Drop Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Pressure Drop Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Pressure Drop Lag TC</em>' attribute.
	 * @see #isSetSteamPressureDropLagTC()
	 * @see #unsetSteamPressureDropLagTC()
	 * @see #setSteamPressureDropLagTC(float)
	 * @generated
	 */
	public float getSteamPressureDropLagTC() {
		return steamPressureDropLagTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Pressure Drop Lag TC</em>' attribute.
	 * @see #isSetSteamPressureDropLagTC()
	 * @see #unsetSteamPressureDropLagTC()
	 * @see #getSteamPressureDropLagTC()
	 * @generated
	 */
	public void setSteamPressureDropLagTC(float newSteamPressureDropLagTC) {
		steamPressureDropLagTC = newSteamPressureDropLagTC;
		steamPressureDropLagTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteamPressureDropLagTC()
	 * @see #getSteamPressureDropLagTC()
	 * @see #setSteamPressureDropLagTC(float)
	 * @generated
	 */
	public void unsetSteamPressureDropLagTC() {
		steamPressureDropLagTC = STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT;
		steamPressureDropLagTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steam Pressure Drop Lag TC</em>' attribute is set.
	 * @see #unsetSteamPressureDropLagTC()
	 * @see #getSteamPressureDropLagTC()
	 * @see #setSteamPressureDropLagTC(float)
	 * @generated
	 */
	public boolean isSetSteamPressureDropLagTC() {
		return steamPressureDropLagTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Core HT Lag TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core HT Lag TC1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core HT Lag TC1</em>' attribute.
	 * @see #isSetCoreHTLagTC1()
	 * @see #unsetCoreHTLagTC1()
	 * @see #setCoreHTLagTC1(float)
	 * @generated
	 */
	public float getCoreHTLagTC1() {
		return coreHTLagTC1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core HT Lag TC1</em>' attribute.
	 * @see #isSetCoreHTLagTC1()
	 * @see #unsetCoreHTLagTC1()
	 * @see #getCoreHTLagTC1()
	 * @generated
	 */
	public void setCoreHTLagTC1(float newCoreHTLagTC1) {
		coreHTLagTC1 = newCoreHTLagTC1;
		coreHTLagTC1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreHTLagTC1()
	 * @see #getCoreHTLagTC1()
	 * @see #setCoreHTLagTC1(float)
	 * @generated
	 */
	public void unsetCoreHTLagTC1() {
		coreHTLagTC1 = CORE_HT_LAG_TC1_EDEFAULT;
		coreHTLagTC1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core HT Lag TC1</em>' attribute is set.
	 * @see #unsetCoreHTLagTC1()
	 * @see #getCoreHTLagTC1()
	 * @see #setCoreHTLagTC1(float)
	 * @generated
	 */
	public boolean isSetCoreHTLagTC1() {
		return coreHTLagTC1ESet;
	}

	/**
	 * Returns the value of the '<em><b>Core HT Lag TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core HT Lag TC2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core HT Lag TC2</em>' attribute.
	 * @see #isSetCoreHTLagTC2()
	 * @see #unsetCoreHTLagTC2()
	 * @see #setCoreHTLagTC2(float)
	 * @generated
	 */
	public float getCoreHTLagTC2() {
		return coreHTLagTC2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core HT Lag TC2</em>' attribute.
	 * @see #isSetCoreHTLagTC2()
	 * @see #unsetCoreHTLagTC2()
	 * @see #getCoreHTLagTC2()
	 * @generated
	 */
	public void setCoreHTLagTC2(float newCoreHTLagTC2) {
		coreHTLagTC2 = newCoreHTLagTC2;
		coreHTLagTC2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreHTLagTC2()
	 * @see #getCoreHTLagTC2()
	 * @see #setCoreHTLagTC2(float)
	 * @generated
	 */
	public void unsetCoreHTLagTC2() {
		coreHTLagTC2 = CORE_HT_LAG_TC2_EDEFAULT;
		coreHTLagTC2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core HT Lag TC2</em>' attribute is set.
	 * @see #unsetCoreHTLagTC2()
	 * @see #getCoreHTLagTC2()
	 * @see #setCoreHTLagTC2(float)
	 * @generated
	 */
	public boolean isSetCoreHTLagTC2() {
		return coreHTLagTC2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Hot Leg Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Leg Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Leg Lag TC</em>' attribute.
	 * @see #isSetHotLegLagTC()
	 * @see #unsetHotLegLagTC()
	 * @see #setHotLegLagTC(float)
	 * @generated
	 */
	public float getHotLegLagTC() {
		return hotLegLagTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Leg Lag TC</em>' attribute.
	 * @see #isSetHotLegLagTC()
	 * @see #unsetHotLegLagTC()
	 * @see #getHotLegLagTC()
	 * @generated
	 */
	public void setHotLegLagTC(float newHotLegLagTC) {
		hotLegLagTC = newHotLegLagTC;
		hotLegLagTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHotLegLagTC()
	 * @see #getHotLegLagTC()
	 * @see #setHotLegLagTC(float)
	 * @generated
	 */
	public void unsetHotLegLagTC() {
		hotLegLagTC = HOT_LEG_LAG_TC_EDEFAULT;
		hotLegLagTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegLagTC <em>Hot Leg Lag TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hot Leg Lag TC</em>' attribute is set.
	 * @see #unsetHotLegLagTC()
	 * @see #getHotLegLagTC()
	 * @see #setHotLegLagTC(float)
	 * @generated
	 */
	public boolean isSetHotLegLagTC() {
		return hotLegLagTCESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureSP <em>Throttle Pressure SP</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Hot Leg Steam Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Leg Steam Gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Leg Steam Gain</em>' attribute.
	 * @see #isSetHotLegSteamGain()
	 * @see #unsetHotLegSteamGain()
	 * @see #setHotLegSteamGain(float)
	 * @generated
	 */
	public float getHotLegSteamGain() {
		return hotLegSteamGain;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Leg Steam Gain</em>' attribute.
	 * @see #isSetHotLegSteamGain()
	 * @see #unsetHotLegSteamGain()
	 * @see #getHotLegSteamGain()
	 * @generated
	 */
	public void setHotLegSteamGain(float newHotLegSteamGain) {
		hotLegSteamGain = newHotLegSteamGain;
		hotLegSteamGainESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHotLegSteamGain()
	 * @see #getHotLegSteamGain()
	 * @see #setHotLegSteamGain(float)
	 * @generated
	 */
	public void unsetHotLegSteamGain() {
		hotLegSteamGain = HOT_LEG_STEAM_GAIN_EDEFAULT;
		hotLegSteamGainESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hot Leg Steam Gain</em>' attribute is set.
	 * @see #unsetHotLegSteamGain()
	 * @see #getHotLegSteamGain()
	 * @see #setHotLegSteamGain(float)
	 * @generated
	 */
	public boolean isSetHotLegSteamGain() {
		return hotLegSteamGainESet;
	}

	/**
	 * Returns the value of the '<em><b>Throttle Pressure Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle Pressure Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle Pressure Factor</em>' attribute.
	 * @see #isSetThrottlePressureFactor()
	 * @see #unsetThrottlePressureFactor()
	 * @see #setThrottlePressureFactor(float)
	 * @generated
	 */
	public float getThrottlePressureFactor() {
		return throttlePressureFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle Pressure Factor</em>' attribute.
	 * @see #isSetThrottlePressureFactor()
	 * @see #unsetThrottlePressureFactor()
	 * @see #getThrottlePressureFactor()
	 * @generated
	 */
	public void setThrottlePressureFactor(float newThrottlePressureFactor) {
		throttlePressureFactor = newThrottlePressureFactor;
		throttlePressureFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThrottlePressureFactor()
	 * @see #getThrottlePressureFactor()
	 * @see #setThrottlePressureFactor(float)
	 * @generated
	 */
	public void unsetThrottlePressureFactor() {
		throttlePressureFactor = THROTTLE_PRESSURE_FACTOR_EDEFAULT;
		throttlePressureFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Throttle Pressure Factor</em>' attribute is set.
	 * @see #unsetThrottlePressureFactor()
	 * @see #getThrottlePressureFactor()
	 * @see #setThrottlePressureFactor(float)
	 * @generated
	 */
	public boolean isSetThrottlePressureFactor() {
		return throttlePressureFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Cold Leg FB Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FB Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FB Lag TC</em>' attribute.
	 * @see #isSetColdLegFBLagTC()
	 * @see #unsetColdLegFBLagTC()
	 * @see #setColdLegFBLagTC(float)
	 * @generated
	 */
	public float getColdLegFBLagTC() {
		return coldLegFBLagTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FB Lag TC</em>' attribute.
	 * @see #isSetColdLegFBLagTC()
	 * @see #unsetColdLegFBLagTC()
	 * @see #getColdLegFBLagTC()
	 * @generated
	 */
	public void setColdLegFBLagTC(float newColdLegFBLagTC) {
		coldLegFBLagTC = newColdLegFBLagTC;
		coldLegFBLagTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColdLegFBLagTC()
	 * @see #getColdLegFBLagTC()
	 * @see #setColdLegFBLagTC(float)
	 * @generated
	 */
	public void unsetColdLegFBLagTC() {
		coldLegFBLagTC = COLD_LEG_FB_LAG_TC_EDEFAULT;
		coldLegFBLagTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cold Leg FB Lag TC</em>' attribute is set.
	 * @see #unsetColdLegFBLagTC()
	 * @see #getColdLegFBLagTC()
	 * @see #setColdLegFBLagTC(float)
	 * @generated
	 */
	public boolean isSetColdLegFBLagTC() {
		return coldLegFBLagTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Pressure CG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure CG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure CG</em>' attribute.
	 * @see #isSetPressureCG()
	 * @see #unsetPressureCG()
	 * @see #setPressureCG(float)
	 * @generated
	 */
	public float getPressureCG() {
		return pressureCG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure CG</em>' attribute.
	 * @see #isSetPressureCG()
	 * @see #unsetPressureCG()
	 * @see #getPressureCG()
	 * @generated
	 */
	public void setPressureCG(float newPressureCG) {
		pressureCG = newPressureCG;
		pressureCGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureCG()
	 * @see #getPressureCG()
	 * @see #setPressureCG(float)
	 * @generated
	 */
	public void unsetPressureCG() {
		pressureCG = PRESSURE_CG_EDEFAULT;
		pressureCGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getPressureCG <em>Pressure CG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure CG</em>' attribute is set.
	 * @see #unsetPressureCG()
	 * @see #getPressureCG()
	 * @see #setPressureCG(float)
	 * @generated
	 */
	public boolean isSetPressureCG() {
		return pressureCGESet;
	}

	/**
	 * Returns the value of the '<em><b>Steam Pressure FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Pressure FG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Pressure FG</em>' attribute.
	 * @see #isSetSteamPressureFG()
	 * @see #unsetSteamPressureFG()
	 * @see #setSteamPressureFG(float)
	 * @generated
	 */
	public float getSteamPressureFG() {
		return steamPressureFG;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Pressure FG</em>' attribute.
	 * @see #isSetSteamPressureFG()
	 * @see #unsetSteamPressureFG()
	 * @see #getSteamPressureFG()
	 * @generated
	 */
	public void setSteamPressureFG(float newSteamPressureFG) {
		steamPressureFG = newSteamPressureFG;
		steamPressureFGESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteamPressureFG()
	 * @see #getSteamPressureFG()
	 * @see #setSteamPressureFG(float)
	 * @generated
	 */
	public void unsetSteamPressureFG() {
		steamPressureFG = STEAM_PRESSURE_FG_EDEFAULT;
		steamPressureFGESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getSteamPressureFG <em>Steam Pressure FG</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steam Pressure FG</em>' attribute is set.
	 * @see #unsetSteamPressureFG()
	 * @see #getSteamPressureFG()
	 * @see #setSteamPressureFG(float)
	 * @generated
	 */
	public boolean isSetSteamPressureFG() {
		return steamPressureFGESet;
	}

	/**
	 * Returns the value of the '<em><b>Feedback Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Factor</em>' attribute.
	 * @see #isSetFeedbackFactor()
	 * @see #unsetFeedbackFactor()
	 * @see #setFeedbackFactor(float)
	 * @generated
	 */
	public float getFeedbackFactor() {
		return feedbackFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Factor</em>' attribute.
	 * @see #isSetFeedbackFactor()
	 * @see #unsetFeedbackFactor()
	 * @see #getFeedbackFactor()
	 * @generated
	 */
	public void setFeedbackFactor(float newFeedbackFactor) {
		feedbackFactor = newFeedbackFactor;
		feedbackFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedbackFactor()
	 * @see #getFeedbackFactor()
	 * @see #setFeedbackFactor(float)
	 * @generated
	 */
	public void unsetFeedbackFactor() {
		feedbackFactor = FEEDBACK_FACTOR_EDEFAULT;
		feedbackFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getFeedbackFactor <em>Feedback Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feedback Factor</em>' attribute is set.
	 * @see #unsetFeedbackFactor()
	 * @see #getFeedbackFactor()
	 * @see #setFeedbackFactor(float)
	 * @generated
	 */
	public boolean isSetFeedbackFactor() {
		return feedbackFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Core Neutronics Eff TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Neutronics Eff TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Neutronics Eff TC</em>' attribute.
	 * @see #isSetCoreNeutronicsEffTC()
	 * @see #unsetCoreNeutronicsEffTC()
	 * @see #setCoreNeutronicsEffTC(float)
	 * @generated
	 */
	public float getCoreNeutronicsEffTC() {
		return coreNeutronicsEffTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Neutronics Eff TC</em>' attribute.
	 * @see #isSetCoreNeutronicsEffTC()
	 * @see #unsetCoreNeutronicsEffTC()
	 * @see #getCoreNeutronicsEffTC()
	 * @generated
	 */
	public void setCoreNeutronicsEffTC(float newCoreNeutronicsEffTC) {
		coreNeutronicsEffTC = newCoreNeutronicsEffTC;
		coreNeutronicsEffTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreNeutronicsEffTC()
	 * @see #getCoreNeutronicsEffTC()
	 * @see #setCoreNeutronicsEffTC(float)
	 * @generated
	 */
	public void unsetCoreNeutronicsEffTC() {
		coreNeutronicsEffTC = CORE_NEUTRONICS_EFF_TC_EDEFAULT;
		coreNeutronicsEffTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Neutronics Eff TC</em>' attribute is set.
	 * @see #unsetCoreNeutronicsEffTC()
	 * @see #getCoreNeutronicsEffTC()
	 * @see #setCoreNeutronicsEffTC(float)
	 * @generated
	 */
	public boolean isSetCoreNeutronicsEffTC() {
		return coreNeutronicsEffTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Cold Leg FG2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FG2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FG2</em>' attribute.
	 * @see #isSetColdLegFG2()
	 * @see #unsetColdLegFG2()
	 * @see #setColdLegFG2(float)
	 * @generated
	 */
	public float getColdLegFG2() {
		return coldLegFG2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FG2</em>' attribute.
	 * @see #isSetColdLegFG2()
	 * @see #unsetColdLegFG2()
	 * @see #getColdLegFG2()
	 * @generated
	 */
	public void setColdLegFG2(float newColdLegFG2) {
		coldLegFG2 = newColdLegFG2;
		coldLegFG2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColdLegFG2()
	 * @see #getColdLegFG2()
	 * @see #setColdLegFG2(float)
	 * @generated
	 */
	public void unsetColdLegFG2() {
		coldLegFG2 = COLD_LEG_FG2_EDEFAULT;
		coldLegFG2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG2 <em>Cold Leg FG2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cold Leg FG2</em>' attribute is set.
	 * @see #unsetColdLegFG2()
	 * @see #getColdLegFG2()
	 * @see #setColdLegFG2(float)
	 * @generated
	 */
	public boolean isSetColdLegFG2() {
		return coldLegFG2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Cold Leg FG1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FG1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FG1</em>' attribute.
	 * @see #isSetColdLegFG1()
	 * @see #unsetColdLegFG1()
	 * @see #setColdLegFG1(float)
	 * @generated
	 */
	public float getColdLegFG1() {
		return coldLegFG1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FG1</em>' attribute.
	 * @see #isSetColdLegFG1()
	 * @see #unsetColdLegFG1()
	 * @see #getColdLegFG1()
	 * @generated
	 */
	public void setColdLegFG1(float newColdLegFG1) {
		coldLegFG1 = newColdLegFG1;
		coldLegFG1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColdLegFG1()
	 * @see #getColdLegFG1()
	 * @see #setColdLegFG1(float)
	 * @generated
	 */
	public void unsetColdLegFG1() {
		coldLegFG1 = COLD_LEG_FG1_EDEFAULT;
		coldLegFG1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFG1 <em>Cold Leg FG1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cold Leg FG1</em>' attribute is set.
	 * @see #unsetColdLegFG1()
	 * @see #getColdLegFG1()
	 * @see #setColdLegFG1(float)
	 * @generated
	 */
	public boolean isSetColdLegFG1() {
		return coldLegFG1ESet;
	}

	/**
	 * Returns the value of the '<em><b>Cold Leg Lag TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg Lag TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg Lag TC</em>' attribute.
	 * @see #isSetColdLegLagTC()
	 * @see #unsetColdLegLagTC()
	 * @see #setColdLegLagTC(float)
	 * @generated
	 */
	public float getColdLegLagTC() {
		return coldLegLagTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg Lag TC</em>' attribute.
	 * @see #isSetColdLegLagTC()
	 * @see #unsetColdLegLagTC()
	 * @see #getColdLegLagTC()
	 * @generated
	 */
	public void setColdLegLagTC(float newColdLegLagTC) {
		coldLegLagTC = newColdLegLagTC;
		coldLegLagTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColdLegLagTC()
	 * @see #getColdLegLagTC()
	 * @see #setColdLegLagTC(float)
	 * @generated
	 */
	public void unsetColdLegLagTC() {
		coldLegLagTC = COLD_LEG_LAG_TC_EDEFAULT;
		coldLegLagTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegLagTC <em>Cold Leg Lag TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cold Leg Lag TC</em>' attribute is set.
	 * @see #unsetColdLegLagTC()
	 * @see #getColdLegLagTC()
	 * @see #setColdLegLagTC(float)
	 * @generated
	 */
	public boolean isSetColdLegLagTC() {
		return coldLegLagTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Cold Leg FB Lead TC2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FB Lead TC2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FB Lead TC2</em>' attribute.
	 * @see #isSetColdLegFBLeadTC2()
	 * @see #unsetColdLegFBLeadTC2()
	 * @see #setColdLegFBLeadTC2(float)
	 * @generated
	 */
	public float getColdLegFBLeadTC2() {
		return coldLegFBLeadTC2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FB Lead TC2</em>' attribute.
	 * @see #isSetColdLegFBLeadTC2()
	 * @see #unsetColdLegFBLeadTC2()
	 * @see #getColdLegFBLeadTC2()
	 * @generated
	 */
	public void setColdLegFBLeadTC2(float newColdLegFBLeadTC2) {
		coldLegFBLeadTC2 = newColdLegFBLeadTC2;
		coldLegFBLeadTC2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColdLegFBLeadTC2()
	 * @see #getColdLegFBLeadTC2()
	 * @see #setColdLegFBLeadTC2(float)
	 * @generated
	 */
	public void unsetColdLegFBLeadTC2() {
		coldLegFBLeadTC2 = COLD_LEG_FB_LEAD_TC2_EDEFAULT;
		coldLegFBLeadTC2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cold Leg FB Lead TC2</em>' attribute is set.
	 * @see #unsetColdLegFBLeadTC2()
	 * @see #getColdLegFBLeadTC2()
	 * @see #setColdLegFBLeadTC2(float)
	 * @generated
	 */
	public boolean isSetColdLegFBLeadTC2() {
		return coldLegFBLeadTC2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Cold Leg FB Lead TC1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cold Leg FB Lead TC1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cold Leg FB Lead TC1</em>' attribute.
	 * @see #isSetColdLegFBLeadTC1()
	 * @see #unsetColdLegFBLeadTC1()
	 * @see #setColdLegFBLeadTC1(float)
	 * @generated
	 */
	public float getColdLegFBLeadTC1() {
		return coldLegFBLeadTC1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cold Leg FB Lead TC1</em>' attribute.
	 * @see #isSetColdLegFBLeadTC1()
	 * @see #unsetColdLegFBLeadTC1()
	 * @see #getColdLegFBLeadTC1()
	 * @generated
	 */
	public void setColdLegFBLeadTC1(float newColdLegFBLeadTC1) {
		coldLegFBLeadTC1 = newColdLegFBLeadTC1;
		coldLegFBLeadTC1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColdLegFBLeadTC1()
	 * @see #getColdLegFBLeadTC1()
	 * @see #setColdLegFBLeadTC1(float)
	 * @generated
	 */
	public void unsetColdLegFBLeadTC1() {
		coldLegFBLeadTC1 = COLD_LEG_FB_LEAD_TC1_EDEFAULT;
		coldLegFBLeadTC1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PWRSteamSupply#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cold Leg FB Lead TC1</em>' attribute is set.
	 * @see #unsetColdLegFBLeadTC1()
	 * @see #getColdLegFBLeadTC1()
	 * @see #setColdLegFBLeadTC1(float)
	 * @generated
	 */
	public boolean isSetColdLegFBLeadTC1() {
		return coldLegFBLeadTC1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				return getCoreNeutronicsHT();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				return getSteamFlowFG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				return getHotLegToColdLegGain();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				return getSteamPressureDropLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				return getCoreHTLagTC1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				return getCoreHTLagTC2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				return getHotLegLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return getThrottlePressureSP();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				return getHotLegSteamGain();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				return getThrottlePressureFactor();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				return getColdLegFBLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				return getPressureCG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				return getSteamPressureFG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				return getFeedbackFactor();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				return getCoreNeutronicsEffTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				return getColdLegFG2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				return getColdLegFG1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				return getColdLegLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				return getColdLegFBLeadTC2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				return getColdLegFBLeadTC1();
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
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				setCoreNeutronicsHT((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				setSteamFlowFG((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				setHotLegToColdLegGain((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				setSteamPressureDropLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				setCoreHTLagTC1((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				setCoreHTLagTC2((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				setHotLegLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				setThrottlePressureSP((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				setHotLegSteamGain((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				setThrottlePressureFactor((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				setColdLegFBLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				setPressureCG((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				setSteamPressureFG((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				setFeedbackFactor((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				setCoreNeutronicsEffTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				setColdLegFG2((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				setColdLegFG1((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				setColdLegLagTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				setColdLegFBLeadTC2((Float)newValue);
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				setColdLegFBLeadTC1((Float)newValue);
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
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				unsetCoreNeutronicsHT();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				unsetSteamFlowFG();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				unsetHotLegToColdLegGain();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				unsetSteamPressureDropLagTC();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				unsetCoreHTLagTC1();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				unsetCoreHTLagTC2();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				unsetHotLegLagTC();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				unsetThrottlePressureSP();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				unsetHotLegSteamGain();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				unsetThrottlePressureFactor();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				unsetColdLegFBLagTC();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				unsetPressureCG();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				unsetSteamPressureFG();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				unsetFeedbackFactor();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				unsetCoreNeutronicsEffTC();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				unsetColdLegFG2();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				unsetColdLegFG1();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				unsetColdLegLagTC();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				unsetColdLegFBLeadTC2();
				return;
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				unsetColdLegFBLeadTC1();
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
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
				return isSetCoreNeutronicsHT();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
				return isSetSteamFlowFG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
				return isSetHotLegToColdLegGain();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
				return isSetSteamPressureDropLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
				return isSetCoreHTLagTC1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
				return isSetCoreHTLagTC2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
				return isSetHotLegLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
				return isSetThrottlePressureSP();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
				return isSetHotLegSteamGain();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
				return isSetThrottlePressureFactor();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
				return isSetColdLegFBLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
				return isSetPressureCG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
				return isSetSteamPressureFG();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
				return isSetFeedbackFactor();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
				return isSetCoreNeutronicsEffTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
				return isSetColdLegFG2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
				return isSetColdLegFG1();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
				return isSetColdLegLagTC();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
				return isSetColdLegFBLeadTC2();
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
				return isSetColdLegFBLeadTC1();
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
		result.append(" (coreNeutronicsHT: ");
		if (coreNeutronicsHTESet) result.append(coreNeutronicsHT); else result.append("<unset>");
		result.append(", steamFlowFG: ");
		if (steamFlowFGESet) result.append(steamFlowFG); else result.append("<unset>");
		result.append(", hotLegToColdLegGain: ");
		if (hotLegToColdLegGainESet) result.append(hotLegToColdLegGain); else result.append("<unset>");
		result.append(", steamPressureDropLagTC: ");
		if (steamPressureDropLagTCESet) result.append(steamPressureDropLagTC); else result.append("<unset>");
		result.append(", coreHTLagTC1: ");
		if (coreHTLagTC1ESet) result.append(coreHTLagTC1); else result.append("<unset>");
		result.append(", coreHTLagTC2: ");
		if (coreHTLagTC2ESet) result.append(coreHTLagTC2); else result.append("<unset>");
		result.append(", hotLegLagTC: ");
		if (hotLegLagTCESet) result.append(hotLegLagTC); else result.append("<unset>");
		result.append(", throttlePressureSP: ");
		if (throttlePressureSPESet) result.append(throttlePressureSP); else result.append("<unset>");
		result.append(", hotLegSteamGain: ");
		if (hotLegSteamGainESet) result.append(hotLegSteamGain); else result.append("<unset>");
		result.append(", throttlePressureFactor: ");
		if (throttlePressureFactorESet) result.append(throttlePressureFactor); else result.append("<unset>");
		result.append(", coldLegFBLagTC: ");
		if (coldLegFBLagTCESet) result.append(coldLegFBLagTC); else result.append("<unset>");
		result.append(", pressureCG: ");
		if (pressureCGESet) result.append(pressureCG); else result.append("<unset>");
		result.append(", steamPressureFG: ");
		if (steamPressureFGESet) result.append(steamPressureFG); else result.append("<unset>");
		result.append(", feedbackFactor: ");
		if (feedbackFactorESet) result.append(feedbackFactor); else result.append("<unset>");
		result.append(", coreNeutronicsEffTC: ");
		if (coreNeutronicsEffTCESet) result.append(coreNeutronicsEffTC); else result.append("<unset>");
		result.append(", coldLegFG2: ");
		if (coldLegFG2ESet) result.append(coldLegFG2); else result.append("<unset>");
		result.append(", coldLegFG1: ");
		if (coldLegFG1ESet) result.append(coldLegFG1); else result.append("<unset>");
		result.append(", coldLegLagTC: ");
		if (coldLegLagTCESet) result.append(coldLegLagTC); else result.append("<unset>");
		result.append(", coldLegFBLeadTC2: ");
		if (coldLegFBLeadTC2ESet) result.append(coldLegFBLeadTC2); else result.append("<unset>");
		result.append(", coldLegFBLeadTC1: ");
		if (coldLegFBLeadTC1ESet) result.append(coldLegFBLeadTC1); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PWRSteamSupply
