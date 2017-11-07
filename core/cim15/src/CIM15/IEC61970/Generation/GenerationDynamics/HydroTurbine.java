/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HydroTurbine extends PrimeMover {
	/**
	 * The default value of the '{@link #getMaxHeadMaxP() <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_HEAD_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxHeadMaxP() <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxHeadMaxP = MAX_HEAD_MAX_P_EDEFAULT;

	/**
	 * This is true if the Max Head Max P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxHeadMaxPESet;

	/**
	 * The default value of the '{@link #getMinHeadMaxP() <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_HEAD_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinHeadMaxP() <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeadMaxP()
	 * @generated
	 * @ordered
	 */
	protected float minHeadMaxP = MIN_HEAD_MAX_P_EDEFAULT;

	/**
	 * This is true if the Min Head Max P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minHeadMaxPESet;

	/**
	 * The default value of the '{@link #getTurbineRating() <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineRating()
	 * @generated
	 * @ordered
	 */
	protected static final float TURBINE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTurbineRating() <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineRating()
	 * @generated
	 * @ordered
	 */
	protected float turbineRating = TURBINE_RATING_EDEFAULT;

	/**
	 * This is true if the Turbine Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean turbineRatingESet;

	/**
	 * The default value of the '{@link #getGateRateLimit() <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateRateLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float GATE_RATE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGateRateLimit() <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateRateLimit()
	 * @generated
	 * @ordered
	 */
	protected float gateRateLimit = GATE_RATE_LIMIT_EDEFAULT;

	/**
	 * This is true if the Gate Rate Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gateRateLimitESet;

	/**
	 * The default value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineType()
	 * @generated
	 * @ordered
	 */
	protected static final TurbineType TURBINE_TYPE_EDEFAULT = TurbineType.PELTON;

	/**
	 * The cached value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineType()
	 * @generated
	 * @ordered
	 */
	protected TurbineType turbineType = TURBINE_TYPE_EDEFAULT;

	/**
	 * This is true if the Turbine Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean turbineTypeESet;

	/**
	 * The default value of the '{@link #getGateUpperLimit() <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float GATE_UPPER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGateUpperLimit() <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected float gateUpperLimit = GATE_UPPER_LIMIT_EDEFAULT;

	/**
	 * This is true if the Gate Upper Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gateUpperLimitESet;

	/**
	 * The default value of the '{@link #getSpeedRating() <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRating()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedRating() <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRating()
	 * @generated
	 * @ordered
	 */
	protected float speedRating = SPEED_RATING_EDEFAULT;

	/**
	 * This is true if the Speed Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedRatingESet;

	/**
	 * The default value of the '{@link #getSpeedRegulation() <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRegulation()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_REGULATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedRegulation() <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedRegulation()
	 * @generated
	 * @ordered
	 */
	protected float speedRegulation = SPEED_REGULATION_EDEFAULT;

	/**
	 * This is true if the Speed Regulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedRegulationESet;

	/**
	 * The default value of the '{@link #getTransientDroopTime() <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientDroopTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSIENT_DROOP_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransientDroopTime() <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientDroopTime()
	 * @generated
	 * @ordered
	 */
	protected float transientDroopTime = TRANSIENT_DROOP_TIME_EDEFAULT;

	/**
	 * This is true if the Transient Droop Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transientDroopTimeESet;

	/**
	 * The default value of the '{@link #getTransientRegulation() <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientRegulation()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSIENT_REGULATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransientRegulation() <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientRegulation()
	 * @generated
	 * @ordered
	 */
	protected float transientRegulation = TRANSIENT_REGULATION_EDEFAULT;

	/**
	 * This is true if the Transient Regulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transientRegulationESet;

	/**
	 * The default value of the '{@link #getWaterStartingTime() <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterStartingTime()
	 * @generated
	 * @ordered
	 */
	protected static final float WATER_STARTING_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWaterStartingTime() <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterStartingTime()
	 * @generated
	 * @ordered
	 */
	protected float waterStartingTime = WATER_STARTING_TIME_EDEFAULT;

	/**
	 * This is true if the Water Starting Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waterStartingTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroTurbine() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.HYDRO_TURBINE;
	}

	/**
	 * Returns the value of the '<em><b>Max Head Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Head Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Head Max P</em>' attribute.
	 * @see #isSetMaxHeadMaxP()
	 * @see #unsetMaxHeadMaxP()
	 * @see #setMaxHeadMaxP(float)
	 * @generated
	 */
	public float getMaxHeadMaxP() {
		return maxHeadMaxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Head Max P</em>' attribute.
	 * @see #isSetMaxHeadMaxP()
	 * @see #unsetMaxHeadMaxP()
	 * @see #getMaxHeadMaxP()
	 * @generated
	 */
	public void setMaxHeadMaxP(float newMaxHeadMaxP) {
		maxHeadMaxP = newMaxHeadMaxP;
		maxHeadMaxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxHeadMaxP()
	 * @see #getMaxHeadMaxP()
	 * @see #setMaxHeadMaxP(float)
	 * @generated
	 */
	public void unsetMaxHeadMaxP() {
		maxHeadMaxP = MAX_HEAD_MAX_P_EDEFAULT;
		maxHeadMaxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Head Max P</em>' attribute is set.
	 * @see #unsetMaxHeadMaxP()
	 * @see #getMaxHeadMaxP()
	 * @see #setMaxHeadMaxP(float)
	 * @generated
	 */
	public boolean isSetMaxHeadMaxP() {
		return maxHeadMaxPESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Head Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Head Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Head Max P</em>' attribute.
	 * @see #isSetMinHeadMaxP()
	 * @see #unsetMinHeadMaxP()
	 * @see #setMinHeadMaxP(float)
	 * @generated
	 */
	public float getMinHeadMaxP() {
		return minHeadMaxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Head Max P</em>' attribute.
	 * @see #isSetMinHeadMaxP()
	 * @see #unsetMinHeadMaxP()
	 * @see #getMinHeadMaxP()
	 * @generated
	 */
	public void setMinHeadMaxP(float newMinHeadMaxP) {
		minHeadMaxP = newMinHeadMaxP;
		minHeadMaxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinHeadMaxP()
	 * @see #getMinHeadMaxP()
	 * @see #setMinHeadMaxP(float)
	 * @generated
	 */
	public void unsetMinHeadMaxP() {
		minHeadMaxP = MIN_HEAD_MAX_P_EDEFAULT;
		minHeadMaxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Head Max P</em>' attribute is set.
	 * @see #unsetMinHeadMaxP()
	 * @see #getMinHeadMaxP()
	 * @see #setMinHeadMaxP(float)
	 * @generated
	 */
	public boolean isSetMinHeadMaxP() {
		return minHeadMaxPESet;
	}

	/**
	 * Returns the value of the '<em><b>Turbine Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turbine Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbine Rating</em>' attribute.
	 * @see #isSetTurbineRating()
	 * @see #unsetTurbineRating()
	 * @see #setTurbineRating(float)
	 * @generated
	 */
	public float getTurbineRating() {
		return turbineRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbine Rating</em>' attribute.
	 * @see #isSetTurbineRating()
	 * @see #unsetTurbineRating()
	 * @see #getTurbineRating()
	 * @generated
	 */
	public void setTurbineRating(float newTurbineRating) {
		turbineRating = newTurbineRating;
		turbineRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTurbineRating()
	 * @see #getTurbineRating()
	 * @see #setTurbineRating(float)
	 * @generated
	 */
	public void unsetTurbineRating() {
		turbineRating = TURBINE_RATING_EDEFAULT;
		turbineRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Turbine Rating</em>' attribute is set.
	 * @see #unsetTurbineRating()
	 * @see #getTurbineRating()
	 * @see #setTurbineRating(float)
	 * @generated
	 */
	public boolean isSetTurbineRating() {
		return turbineRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Gate Rate Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Rate Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Rate Limit</em>' attribute.
	 * @see #isSetGateRateLimit()
	 * @see #unsetGateRateLimit()
	 * @see #setGateRateLimit(float)
	 * @generated
	 */
	public float getGateRateLimit() {
		return gateRateLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate Rate Limit</em>' attribute.
	 * @see #isSetGateRateLimit()
	 * @see #unsetGateRateLimit()
	 * @see #getGateRateLimit()
	 * @generated
	 */
	public void setGateRateLimit(float newGateRateLimit) {
		gateRateLimit = newGateRateLimit;
		gateRateLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGateRateLimit()
	 * @see #getGateRateLimit()
	 * @see #setGateRateLimit(float)
	 * @generated
	 */
	public void unsetGateRateLimit() {
		gateRateLimit = GATE_RATE_LIMIT_EDEFAULT;
		gateRateLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gate Rate Limit</em>' attribute is set.
	 * @see #unsetGateRateLimit()
	 * @see #getGateRateLimit()
	 * @see #setGateRateLimit(float)
	 * @generated
	 */
	public boolean isSetGateRateLimit() {
		return gateRateLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Turbine Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.GenerationDynamics.TurbineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turbine Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbine Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.TurbineType
	 * @see #isSetTurbineType()
	 * @see #unsetTurbineType()
	 * @see #setTurbineType(TurbineType)
	 * @generated
	 */
	public TurbineType getTurbineType() {
		return turbineType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbine Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.TurbineType
	 * @see #isSetTurbineType()
	 * @see #unsetTurbineType()
	 * @see #getTurbineType()
	 * @generated
	 */
	public void setTurbineType(TurbineType newTurbineType) {
		turbineType = newTurbineType == null ? TURBINE_TYPE_EDEFAULT : newTurbineType;
		turbineTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTurbineType()
	 * @see #getTurbineType()
	 * @see #setTurbineType(TurbineType)
	 * @generated
	 */
	public void unsetTurbineType() {
		turbineType = TURBINE_TYPE_EDEFAULT;
		turbineTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Turbine Type</em>' attribute is set.
	 * @see #unsetTurbineType()
	 * @see #getTurbineType()
	 * @see #setTurbineType(TurbineType)
	 * @generated
	 */
	public boolean isSetTurbineType() {
		return turbineTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Gate Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Upper Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Upper Limit</em>' attribute.
	 * @see #isSetGateUpperLimit()
	 * @see #unsetGateUpperLimit()
	 * @see #setGateUpperLimit(float)
	 * @generated
	 */
	public float getGateUpperLimit() {
		return gateUpperLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate Upper Limit</em>' attribute.
	 * @see #isSetGateUpperLimit()
	 * @see #unsetGateUpperLimit()
	 * @see #getGateUpperLimit()
	 * @generated
	 */
	public void setGateUpperLimit(float newGateUpperLimit) {
		gateUpperLimit = newGateUpperLimit;
		gateUpperLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGateUpperLimit()
	 * @see #getGateUpperLimit()
	 * @see #setGateUpperLimit(float)
	 * @generated
	 */
	public void unsetGateUpperLimit() {
		gateUpperLimit = GATE_UPPER_LIMIT_EDEFAULT;
		gateUpperLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gate Upper Limit</em>' attribute is set.
	 * @see #unsetGateUpperLimit()
	 * @see #getGateUpperLimit()
	 * @see #setGateUpperLimit(float)
	 * @generated
	 */
	public boolean isSetGateUpperLimit() {
		return gateUpperLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Speed Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Rating</em>' attribute.
	 * @see #isSetSpeedRating()
	 * @see #unsetSpeedRating()
	 * @see #setSpeedRating(float)
	 * @generated
	 */
	public float getSpeedRating() {
		return speedRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Rating</em>' attribute.
	 * @see #isSetSpeedRating()
	 * @see #unsetSpeedRating()
	 * @see #getSpeedRating()
	 * @generated
	 */
	public void setSpeedRating(float newSpeedRating) {
		speedRating = newSpeedRating;
		speedRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeedRating()
	 * @see #getSpeedRating()
	 * @see #setSpeedRating(float)
	 * @generated
	 */
	public void unsetSpeedRating() {
		speedRating = SPEED_RATING_EDEFAULT;
		speedRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed Rating</em>' attribute is set.
	 * @see #unsetSpeedRating()
	 * @see #getSpeedRating()
	 * @see #setSpeedRating(float)
	 * @generated
	 */
	public boolean isSetSpeedRating() {
		return speedRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Speed Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Regulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Regulation</em>' attribute.
	 * @see #isSetSpeedRegulation()
	 * @see #unsetSpeedRegulation()
	 * @see #setSpeedRegulation(float)
	 * @generated
	 */
	public float getSpeedRegulation() {
		return speedRegulation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Regulation</em>' attribute.
	 * @see #isSetSpeedRegulation()
	 * @see #unsetSpeedRegulation()
	 * @see #getSpeedRegulation()
	 * @generated
	 */
	public void setSpeedRegulation(float newSpeedRegulation) {
		speedRegulation = newSpeedRegulation;
		speedRegulationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeedRegulation()
	 * @see #getSpeedRegulation()
	 * @see #setSpeedRegulation(float)
	 * @generated
	 */
	public void unsetSpeedRegulation() {
		speedRegulation = SPEED_REGULATION_EDEFAULT;
		speedRegulationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed Regulation</em>' attribute is set.
	 * @see #unsetSpeedRegulation()
	 * @see #getSpeedRegulation()
	 * @see #setSpeedRegulation(float)
	 * @generated
	 */
	public boolean isSetSpeedRegulation() {
		return speedRegulationESet;
	}

	/**
	 * Returns the value of the '<em><b>Transient Droop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Droop Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Droop Time</em>' attribute.
	 * @see #isSetTransientDroopTime()
	 * @see #unsetTransientDroopTime()
	 * @see #setTransientDroopTime(float)
	 * @generated
	 */
	public float getTransientDroopTime() {
		return transientDroopTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Droop Time</em>' attribute.
	 * @see #isSetTransientDroopTime()
	 * @see #unsetTransientDroopTime()
	 * @see #getTransientDroopTime()
	 * @generated
	 */
	public void setTransientDroopTime(float newTransientDroopTime) {
		transientDroopTime = newTransientDroopTime;
		transientDroopTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransientDroopTime()
	 * @see #getTransientDroopTime()
	 * @see #setTransientDroopTime(float)
	 * @generated
	 */
	public void unsetTransientDroopTime() {
		transientDroopTime = TRANSIENT_DROOP_TIME_EDEFAULT;
		transientDroopTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient Droop Time</em>' attribute is set.
	 * @see #unsetTransientDroopTime()
	 * @see #getTransientDroopTime()
	 * @see #setTransientDroopTime(float)
	 * @generated
	 */
	public boolean isSetTransientDroopTime() {
		return transientDroopTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Transient Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Regulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Regulation</em>' attribute.
	 * @see #isSetTransientRegulation()
	 * @see #unsetTransientRegulation()
	 * @see #setTransientRegulation(float)
	 * @generated
	 */
	public float getTransientRegulation() {
		return transientRegulation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Regulation</em>' attribute.
	 * @see #isSetTransientRegulation()
	 * @see #unsetTransientRegulation()
	 * @see #getTransientRegulation()
	 * @generated
	 */
	public void setTransientRegulation(float newTransientRegulation) {
		transientRegulation = newTransientRegulation;
		transientRegulationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransientRegulation()
	 * @see #getTransientRegulation()
	 * @see #setTransientRegulation(float)
	 * @generated
	 */
	public void unsetTransientRegulation() {
		transientRegulation = TRANSIENT_REGULATION_EDEFAULT;
		transientRegulationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transient Regulation</em>' attribute is set.
	 * @see #unsetTransientRegulation()
	 * @see #getTransientRegulation()
	 * @see #setTransientRegulation(float)
	 * @generated
	 */
	public boolean isSetTransientRegulation() {
		return transientRegulationESet;
	}

	/**
	 * Returns the value of the '<em><b>Water Starting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Starting Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Starting Time</em>' attribute.
	 * @see #isSetWaterStartingTime()
	 * @see #unsetWaterStartingTime()
	 * @see #setWaterStartingTime(float)
	 * @generated
	 */
	public float getWaterStartingTime() {
		return waterStartingTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Starting Time</em>' attribute.
	 * @see #isSetWaterStartingTime()
	 * @see #unsetWaterStartingTime()
	 * @see #getWaterStartingTime()
	 * @generated
	 */
	public void setWaterStartingTime(float newWaterStartingTime) {
		waterStartingTime = newWaterStartingTime;
		waterStartingTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaterStartingTime()
	 * @see #getWaterStartingTime()
	 * @see #setWaterStartingTime(float)
	 * @generated
	 */
	public void unsetWaterStartingTime() {
		waterStartingTime = WATER_STARTING_TIME_EDEFAULT;
		waterStartingTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Water Starting Time</em>' attribute is set.
	 * @see #unsetWaterStartingTime()
	 * @see #getWaterStartingTime()
	 * @see #setWaterStartingTime(float)
	 * @generated
	 */
	public boolean isSetWaterStartingTime() {
		return waterStartingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				return getMaxHeadMaxP();
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				return getMinHeadMaxP();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				return getTurbineRating();
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				return getGateRateLimit();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				return getTurbineType();
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				return getGateUpperLimit();
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				return getSpeedRating();
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				return getSpeedRegulation();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				return getTransientDroopTime();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				return getTransientRegulation();
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				return getWaterStartingTime();
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
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				setMaxHeadMaxP((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				setMinHeadMaxP((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				setTurbineRating((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				setGateRateLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				setTurbineType((TurbineType)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				setGateUpperLimit((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				setSpeedRating((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				setSpeedRegulation((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				setTransientDroopTime((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				setTransientRegulation((Float)newValue);
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				setWaterStartingTime((Float)newValue);
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
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				unsetMaxHeadMaxP();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				unsetMinHeadMaxP();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				unsetTurbineRating();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				unsetGateRateLimit();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				unsetTurbineType();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				unsetGateUpperLimit();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				unsetSpeedRating();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				unsetSpeedRegulation();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				unsetTransientDroopTime();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				unsetTransientRegulation();
				return;
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				unsetWaterStartingTime();
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
			case GenerationDynamicsPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
				return isSetMaxHeadMaxP();
			case GenerationDynamicsPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
				return isSetMinHeadMaxP();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_RATING:
				return isSetTurbineRating();
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
				return isSetGateRateLimit();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TURBINE_TYPE:
				return isSetTurbineType();
			case GenerationDynamicsPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
				return isSetGateUpperLimit();
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_RATING:
				return isSetSpeedRating();
			case GenerationDynamicsPackage.HYDRO_TURBINE__SPEED_REGULATION:
				return isSetSpeedRegulation();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
				return isSetTransientDroopTime();
			case GenerationDynamicsPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
				return isSetTransientRegulation();
			case GenerationDynamicsPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
				return isSetWaterStartingTime();
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
		result.append(" (maxHeadMaxP: ");
		if (maxHeadMaxPESet) result.append(maxHeadMaxP); else result.append("<unset>");
		result.append(", minHeadMaxP: ");
		if (minHeadMaxPESet) result.append(minHeadMaxP); else result.append("<unset>");
		result.append(", turbineRating: ");
		if (turbineRatingESet) result.append(turbineRating); else result.append("<unset>");
		result.append(", gateRateLimit: ");
		if (gateRateLimitESet) result.append(gateRateLimit); else result.append("<unset>");
		result.append(", turbineType: ");
		if (turbineTypeESet) result.append(turbineType); else result.append("<unset>");
		result.append(", gateUpperLimit: ");
		if (gateUpperLimitESet) result.append(gateUpperLimit); else result.append("<unset>");
		result.append(", speedRating: ");
		if (speedRatingESet) result.append(speedRating); else result.append("<unset>");
		result.append(", speedRegulation: ");
		if (speedRegulationESet) result.append(speedRegulation); else result.append("<unset>");
		result.append(", transientDroopTime: ");
		if (transientDroopTimeESet) result.append(transientDroopTime); else result.append("<unset>");
		result.append(", transientRegulation: ");
		if (transientRegulationESet) result.append(transientRegulation); else result.append("<unset>");
		result.append(", waterStartingTime: ");
		if (waterStartingTimeESet) result.append(waterStartingTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HydroTurbine
