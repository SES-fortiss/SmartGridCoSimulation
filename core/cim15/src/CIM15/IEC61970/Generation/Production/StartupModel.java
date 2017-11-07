/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startup Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartupModel extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected static final float STARTUP_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupCost()
	 * @generated
	 * @ordered
	 */
	protected float startupCost = STARTUP_COST_EDEFAULT;

	/**
	 * This is true if the Startup Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupCostESet;

	/**
	 * The default value of the '{@link #getStbyAuxP() <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStbyAuxP()
	 * @generated
	 * @ordered
	 */
	protected static final float STBY_AUX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStbyAuxP() <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStbyAuxP()
	 * @generated
	 * @ordered
	 */
	protected float stbyAuxP = STBY_AUX_P_EDEFAULT;

	/**
	 * This is true if the Stby Aux P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stbyAuxPESet;

	/**
	 * The cached value of the '{@link #getStartRampCurve() <em>Start Ramp Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRampCurve()
	 * @generated
	 * @ordered
	 */
	protected StartRampCurve startRampCurve;

	/**
	 * The default value of the '{@link #getMinimumRunTime() <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_RUN_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumRunTime() <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRunTime()
	 * @generated
	 * @ordered
	 */
	protected float minimumRunTime = MINIMUM_RUN_TIME_EDEFAULT;

	/**
	 * This is true if the Minimum Run Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumRunTimeESet;

	/**
	 * The cached value of the '{@link #getStartMainFuelCurve() <em>Start Main Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMainFuelCurve()
	 * @generated
	 * @ordered
	 */
	protected StartMainFuelCurve startMainFuelCurve;

	/**
	 * The default value of the '{@link #getRiskFactorCost() <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactorCost()
	 * @generated
	 * @ordered
	 */
	protected static final float RISK_FACTOR_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRiskFactorCost() <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactorCost()
	 * @generated
	 * @ordered
	 */
	protected float riskFactorCost = RISK_FACTOR_COST_EDEFAULT;

	/**
	 * This is true if the Risk Factor Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean riskFactorCostESet;

	/**
	 * The default value of the '{@link #getMinimumDownTime() <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDownTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_DOWN_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumDownTime() <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDownTime()
	 * @generated
	 * @ordered
	 */
	protected float minimumDownTime = MINIMUM_DOWN_TIME_EDEFAULT;

	/**
	 * This is true if the Minimum Down Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumDownTimeESet;

	/**
	 * The default value of the '{@link #getFixedMaintCost() <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMaintCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_MAINT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedMaintCost() <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedMaintCost()
	 * @generated
	 * @ordered
	 */
	protected float fixedMaintCost = FIXED_MAINT_COST_EDEFAULT;

	/**
	 * This is true if the Fixed Maint Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedMaintCostESet;

	/**
	 * The default value of the '{@link #getStartupDate() <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTUP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupDate() <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupDate()
	 * @generated
	 * @ordered
	 */
	protected Date startupDate = STARTUP_DATE_EDEFAULT;

	/**
	 * This is true if the Startup Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupDateESet;

	/**
	 * The cached value of the '{@link #getStartIgnFuelCurve() <em>Start Ign Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 * @ordered
	 */
	protected StartIgnFuelCurve startIgnFuelCurve;

	/**
	 * The default value of the '{@link #getHotStandbyHeat() <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandbyHeat()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_STANDBY_HEAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotStandbyHeat() <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotStandbyHeat()
	 * @generated
	 * @ordered
	 */
	protected float hotStandbyHeat = HOT_STANDBY_HEAT_EDEFAULT;

	/**
	 * This is true if the Hot Standby Heat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hotStandbyHeatESet;

	/**
	 * The default value of the '{@link #getStartupPriority() <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTUP_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartupPriority() <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupPriority()
	 * @generated
	 * @ordered
	 */
	protected int startupPriority = STARTUP_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Startup Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupPriorityESet;

	/**
	 * The default value of the '{@link #getIncrementalMaintCost() <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalMaintCost()
	 * @generated
	 * @ordered
	 */
	protected static final float INCREMENTAL_MAINT_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIncrementalMaintCost() <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalMaintCost()
	 * @generated
	 * @ordered
	 */
	protected float incrementalMaintCost = INCREMENTAL_MAINT_COST_EDEFAULT;

	/**
	 * This is true if the Incremental Maint Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean incrementalMaintCostESet;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartupModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.STARTUP_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Cost</em>' attribute.
	 * @see #isSetStartupCost()
	 * @see #unsetStartupCost()
	 * @see #setStartupCost(float)
	 * @generated
	 */
	public float getStartupCost() {
		return startupCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Cost</em>' attribute.
	 * @see #isSetStartupCost()
	 * @see #unsetStartupCost()
	 * @see #getStartupCost()
	 * @generated
	 */
	public void setStartupCost(float newStartupCost) {
		startupCost = newStartupCost;
		startupCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupCost()
	 * @see #getStartupCost()
	 * @see #setStartupCost(float)
	 * @generated
	 */
	public void unsetStartupCost() {
		startupCost = STARTUP_COST_EDEFAULT;
		startupCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Cost</em>' attribute is set.
	 * @see #unsetStartupCost()
	 * @see #getStartupCost()
	 * @see #setStartupCost(float)
	 * @generated
	 */
	public boolean isSetStartupCost() {
		return startupCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Stby Aux P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stby Aux P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stby Aux P</em>' attribute.
	 * @see #isSetStbyAuxP()
	 * @see #unsetStbyAuxP()
	 * @see #setStbyAuxP(float)
	 * @generated
	 */
	public float getStbyAuxP() {
		return stbyAuxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stby Aux P</em>' attribute.
	 * @see #isSetStbyAuxP()
	 * @see #unsetStbyAuxP()
	 * @see #getStbyAuxP()
	 * @generated
	 */
	public void setStbyAuxP(float newStbyAuxP) {
		stbyAuxP = newStbyAuxP;
		stbyAuxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStbyAuxP()
	 * @see #getStbyAuxP()
	 * @see #setStbyAuxP(float)
	 * @generated
	 */
	public void unsetStbyAuxP() {
		stbyAuxP = STBY_AUX_P_EDEFAULT;
		stbyAuxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stby Aux P</em>' attribute is set.
	 * @see #unsetStbyAuxP()
	 * @see #getStbyAuxP()
	 * @see #setStbyAuxP(float)
	 * @generated
	 */
	public boolean isSetStbyAuxP() {
		return stbyAuxPESet;
	}

	/**
	 * Returns the value of the '<em><b>Start Ramp Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.StartRampCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ramp Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ramp Curve</em>' reference.
	 * @see #setStartRampCurve(StartRampCurve)
	 * @see CIM15.IEC61970.Generation.Production.StartRampCurve#getStartupModel
	 * @generated
	 */
	public StartRampCurve getStartRampCurve() {
		if (startRampCurve != null && startRampCurve.eIsProxy()) {
			InternalEObject oldStartRampCurve = (InternalEObject)startRampCurve;
			startRampCurve = (StartRampCurve)eResolveProxy(oldStartRampCurve);
			if (startRampCurve != oldStartRampCurve) {
			}
		}
		return startRampCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRampCurve basicGetStartRampCurve() {
		return startRampCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartRampCurve(StartRampCurve newStartRampCurve, NotificationChain msgs) {
		StartRampCurve oldStartRampCurve = startRampCurve;
		startRampCurve = newStartRampCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ramp Curve</em>' reference.
	 * @see #getStartRampCurve()
	 * @generated
	 */
	public void setStartRampCurve(StartRampCurve newStartRampCurve) {
		if (newStartRampCurve != startRampCurve) {
			NotificationChain msgs = null;
			if (startRampCurve != null)
				msgs = ((InternalEObject)startRampCurve).eInverseRemove(this, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs);
			if (newStartRampCurve != null)
				msgs = ((InternalEObject)newStartRampCurve).eInverseAdd(this, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs);
			msgs = basicSetStartRampCurve(newStartRampCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Minimum Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Run Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Run Time</em>' attribute.
	 * @see #isSetMinimumRunTime()
	 * @see #unsetMinimumRunTime()
	 * @see #setMinimumRunTime(float)
	 * @generated
	 */
	public float getMinimumRunTime() {
		return minimumRunTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Run Time</em>' attribute.
	 * @see #isSetMinimumRunTime()
	 * @see #unsetMinimumRunTime()
	 * @see #getMinimumRunTime()
	 * @generated
	 */
	public void setMinimumRunTime(float newMinimumRunTime) {
		minimumRunTime = newMinimumRunTime;
		minimumRunTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumRunTime()
	 * @see #getMinimumRunTime()
	 * @see #setMinimumRunTime(float)
	 * @generated
	 */
	public void unsetMinimumRunTime() {
		minimumRunTime = MINIMUM_RUN_TIME_EDEFAULT;
		minimumRunTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Run Time</em>' attribute is set.
	 * @see #unsetMinimumRunTime()
	 * @see #getMinimumRunTime()
	 * @see #setMinimumRunTime(float)
	 * @generated
	 */
	public boolean isSetMinimumRunTime() {
		return minimumRunTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Start Main Fuel Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Main Fuel Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Main Fuel Curve</em>' reference.
	 * @see #setStartMainFuelCurve(StartMainFuelCurve)
	 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel
	 * @generated
	 */
	public StartMainFuelCurve getStartMainFuelCurve() {
		if (startMainFuelCurve != null && startMainFuelCurve.eIsProxy()) {
			InternalEObject oldStartMainFuelCurve = (InternalEObject)startMainFuelCurve;
			startMainFuelCurve = (StartMainFuelCurve)eResolveProxy(oldStartMainFuelCurve);
			if (startMainFuelCurve != oldStartMainFuelCurve) {
			}
		}
		return startMainFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartMainFuelCurve basicGetStartMainFuelCurve() {
		return startMainFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartMainFuelCurve(StartMainFuelCurve newStartMainFuelCurve, NotificationChain msgs) {
		StartMainFuelCurve oldStartMainFuelCurve = startMainFuelCurve;
		startMainFuelCurve = newStartMainFuelCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Main Fuel Curve</em>' reference.
	 * @see #getStartMainFuelCurve()
	 * @generated
	 */
	public void setStartMainFuelCurve(StartMainFuelCurve newStartMainFuelCurve) {
		if (newStartMainFuelCurve != startMainFuelCurve) {
			NotificationChain msgs = null;
			if (startMainFuelCurve != null)
				msgs = ((InternalEObject)startMainFuelCurve).eInverseRemove(this, ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs);
			if (newStartMainFuelCurve != null)
				msgs = ((InternalEObject)newStartMainFuelCurve).eInverseAdd(this, ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs);
			msgs = basicSetStartMainFuelCurve(newStartMainFuelCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Risk Factor Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Factor Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Factor Cost</em>' attribute.
	 * @see #isSetRiskFactorCost()
	 * @see #unsetRiskFactorCost()
	 * @see #setRiskFactorCost(float)
	 * @generated
	 */
	public float getRiskFactorCost() {
		return riskFactorCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Factor Cost</em>' attribute.
	 * @see #isSetRiskFactorCost()
	 * @see #unsetRiskFactorCost()
	 * @see #getRiskFactorCost()
	 * @generated
	 */
	public void setRiskFactorCost(float newRiskFactorCost) {
		riskFactorCost = newRiskFactorCost;
		riskFactorCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRiskFactorCost()
	 * @see #getRiskFactorCost()
	 * @see #setRiskFactorCost(float)
	 * @generated
	 */
	public void unsetRiskFactorCost() {
		riskFactorCost = RISK_FACTOR_COST_EDEFAULT;
		riskFactorCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Risk Factor Cost</em>' attribute is set.
	 * @see #unsetRiskFactorCost()
	 * @see #getRiskFactorCost()
	 * @see #setRiskFactorCost(float)
	 * @generated
	 */
	public boolean isSetRiskFactorCost() {
		return riskFactorCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Down Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Down Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Down Time</em>' attribute.
	 * @see #isSetMinimumDownTime()
	 * @see #unsetMinimumDownTime()
	 * @see #setMinimumDownTime(float)
	 * @generated
	 */
	public float getMinimumDownTime() {
		return minimumDownTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Down Time</em>' attribute.
	 * @see #isSetMinimumDownTime()
	 * @see #unsetMinimumDownTime()
	 * @see #getMinimumDownTime()
	 * @generated
	 */
	public void setMinimumDownTime(float newMinimumDownTime) {
		minimumDownTime = newMinimumDownTime;
		minimumDownTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumDownTime()
	 * @see #getMinimumDownTime()
	 * @see #setMinimumDownTime(float)
	 * @generated
	 */
	public void unsetMinimumDownTime() {
		minimumDownTime = MINIMUM_DOWN_TIME_EDEFAULT;
		minimumDownTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Down Time</em>' attribute is set.
	 * @see #unsetMinimumDownTime()
	 * @see #getMinimumDownTime()
	 * @see #setMinimumDownTime(float)
	 * @generated
	 */
	public boolean isSetMinimumDownTime() {
		return minimumDownTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Fixed Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Maint Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Maint Cost</em>' attribute.
	 * @see #isSetFixedMaintCost()
	 * @see #unsetFixedMaintCost()
	 * @see #setFixedMaintCost(float)
	 * @generated
	 */
	public float getFixedMaintCost() {
		return fixedMaintCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Maint Cost</em>' attribute.
	 * @see #isSetFixedMaintCost()
	 * @see #unsetFixedMaintCost()
	 * @see #getFixedMaintCost()
	 * @generated
	 */
	public void setFixedMaintCost(float newFixedMaintCost) {
		fixedMaintCost = newFixedMaintCost;
		fixedMaintCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixedMaintCost()
	 * @see #getFixedMaintCost()
	 * @see #setFixedMaintCost(float)
	 * @generated
	 */
	public void unsetFixedMaintCost() {
		fixedMaintCost = FIXED_MAINT_COST_EDEFAULT;
		fixedMaintCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Maint Cost</em>' attribute is set.
	 * @see #unsetFixedMaintCost()
	 * @see #getFixedMaintCost()
	 * @see #setFixedMaintCost(float)
	 * @generated
	 */
	public boolean isSetFixedMaintCost() {
		return fixedMaintCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Startup Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Date</em>' attribute.
	 * @see #isSetStartupDate()
	 * @see #unsetStartupDate()
	 * @see #setStartupDate(Date)
	 * @generated
	 */
	public Date getStartupDate() {
		return startupDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Date</em>' attribute.
	 * @see #isSetStartupDate()
	 * @see #unsetStartupDate()
	 * @see #getStartupDate()
	 * @generated
	 */
	public void setStartupDate(Date newStartupDate) {
		startupDate = newStartupDate;
		startupDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupDate()
	 * @see #getStartupDate()
	 * @see #setStartupDate(Date)
	 * @generated
	 */
	public void unsetStartupDate() {
		startupDate = STARTUP_DATE_EDEFAULT;
		startupDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Date</em>' attribute is set.
	 * @see #unsetStartupDate()
	 * @see #getStartupDate()
	 * @see #setStartupDate(Date)
	 * @generated
	 */
	public boolean isSetStartupDate() {
		return startupDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Start Ign Fuel Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ign Fuel Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ign Fuel Curve</em>' reference.
	 * @see #setStartIgnFuelCurve(StartIgnFuelCurve)
	 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel
	 * @generated
	 */
	public StartIgnFuelCurve getStartIgnFuelCurve() {
		if (startIgnFuelCurve != null && startIgnFuelCurve.eIsProxy()) {
			InternalEObject oldStartIgnFuelCurve = (InternalEObject)startIgnFuelCurve;
			startIgnFuelCurve = (StartIgnFuelCurve)eResolveProxy(oldStartIgnFuelCurve);
			if (startIgnFuelCurve != oldStartIgnFuelCurve) {
			}
		}
		return startIgnFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartIgnFuelCurve basicGetStartIgnFuelCurve() {
		return startIgnFuelCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartIgnFuelCurve(StartIgnFuelCurve newStartIgnFuelCurve, NotificationChain msgs) {
		StartIgnFuelCurve oldStartIgnFuelCurve = startIgnFuelCurve;
		startIgnFuelCurve = newStartIgnFuelCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ign Fuel Curve</em>' reference.
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 */
	public void setStartIgnFuelCurve(StartIgnFuelCurve newStartIgnFuelCurve) {
		if (newStartIgnFuelCurve != startIgnFuelCurve) {
			NotificationChain msgs = null;
			if (startIgnFuelCurve != null)
				msgs = ((InternalEObject)startIgnFuelCurve).eInverseRemove(this, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs);
			if (newStartIgnFuelCurve != null)
				msgs = ((InternalEObject)newStartIgnFuelCurve).eInverseAdd(this, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs);
			msgs = basicSetStartIgnFuelCurve(newStartIgnFuelCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Hot Standby Heat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Standby Heat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Standby Heat</em>' attribute.
	 * @see #isSetHotStandbyHeat()
	 * @see #unsetHotStandbyHeat()
	 * @see #setHotStandbyHeat(float)
	 * @generated
	 */
	public float getHotStandbyHeat() {
		return hotStandbyHeat;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Standby Heat</em>' attribute.
	 * @see #isSetHotStandbyHeat()
	 * @see #unsetHotStandbyHeat()
	 * @see #getHotStandbyHeat()
	 * @generated
	 */
	public void setHotStandbyHeat(float newHotStandbyHeat) {
		hotStandbyHeat = newHotStandbyHeat;
		hotStandbyHeatESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHotStandbyHeat()
	 * @see #getHotStandbyHeat()
	 * @see #setHotStandbyHeat(float)
	 * @generated
	 */
	public void unsetHotStandbyHeat() {
		hotStandbyHeat = HOT_STANDBY_HEAT_EDEFAULT;
		hotStandbyHeatESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hot Standby Heat</em>' attribute is set.
	 * @see #unsetHotStandbyHeat()
	 * @see #getHotStandbyHeat()
	 * @see #setHotStandbyHeat(float)
	 * @generated
	 */
	public boolean isSetHotStandbyHeat() {
		return hotStandbyHeatESet;
	}

	/**
	 * Returns the value of the '<em><b>Startup Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Priority</em>' attribute.
	 * @see #isSetStartupPriority()
	 * @see #unsetStartupPriority()
	 * @see #setStartupPriority(int)
	 * @generated
	 */
	public int getStartupPriority() {
		return startupPriority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Priority</em>' attribute.
	 * @see #isSetStartupPriority()
	 * @see #unsetStartupPriority()
	 * @see #getStartupPriority()
	 * @generated
	 */
	public void setStartupPriority(int newStartupPriority) {
		startupPriority = newStartupPriority;
		startupPriorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupPriority()
	 * @see #getStartupPriority()
	 * @see #setStartupPriority(int)
	 * @generated
	 */
	public void unsetStartupPriority() {
		startupPriority = STARTUP_PRIORITY_EDEFAULT;
		startupPriorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Priority</em>' attribute is set.
	 * @see #unsetStartupPriority()
	 * @see #getStartupPriority()
	 * @see #setStartupPriority(int)
	 * @generated
	 */
	public boolean isSetStartupPriority() {
		return startupPriorityESet;
	}

	/**
	 * Returns the value of the '<em><b>Incremental Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Maint Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Maint Cost</em>' attribute.
	 * @see #isSetIncrementalMaintCost()
	 * @see #unsetIncrementalMaintCost()
	 * @see #setIncrementalMaintCost(float)
	 * @generated
	 */
	public float getIncrementalMaintCost() {
		return incrementalMaintCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Maint Cost</em>' attribute.
	 * @see #isSetIncrementalMaintCost()
	 * @see #unsetIncrementalMaintCost()
	 * @see #getIncrementalMaintCost()
	 * @generated
	 */
	public void setIncrementalMaintCost(float newIncrementalMaintCost) {
		incrementalMaintCost = newIncrementalMaintCost;
		incrementalMaintCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncrementalMaintCost()
	 * @see #getIncrementalMaintCost()
	 * @see #setIncrementalMaintCost(float)
	 * @generated
	 */
	public void unsetIncrementalMaintCost() {
		incrementalMaintCost = INCREMENTAL_MAINT_COST_EDEFAULT;
		incrementalMaintCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Incremental Maint Cost</em>' attribute is set.
	 * @see #unsetIncrementalMaintCost()
	 * @see #getIncrementalMaintCost()
	 * @see #setIncrementalMaintCost(float)
	 * @generated
	 */
	public boolean isSetIncrementalMaintCost() {
		return incrementalMaintCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				if (startRampCurve != null)
					msgs = ((InternalEObject)startRampCurve).eInverseRemove(this, ProductionPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs);
				return basicSetStartRampCurve((StartRampCurve)otherEnd, msgs);
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				if (startMainFuelCurve != null)
					msgs = ((InternalEObject)startMainFuelCurve).eInverseRemove(this, ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs);
				return basicSetStartMainFuelCurve((StartMainFuelCurve)otherEnd, msgs);
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				if (startIgnFuelCurve != null)
					msgs = ((InternalEObject)startIgnFuelCurve).eInverseRemove(this, ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs);
				return basicSetStartIgnFuelCurve((StartIgnFuelCurve)otherEnd, msgs);
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				return basicSetStartRampCurve(null, msgs);
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				return basicSetStartMainFuelCurve(null, msgs);
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				return basicSetStartIgnFuelCurve(null, msgs);
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				return getStartupCost();
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				return getStbyAuxP();
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				if (resolve) return getStartRampCurve();
				return basicGetStartRampCurve();
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				return getMinimumRunTime();
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				if (resolve) return getStartMainFuelCurve();
				return basicGetStartMainFuelCurve();
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				return getRiskFactorCost();
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				return getMinimumDownTime();
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				return getFixedMaintCost();
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				return getStartupDate();
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				if (resolve) return getStartIgnFuelCurve();
				return basicGetStartIgnFuelCurve();
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				return getHotStandbyHeat();
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				return getStartupPriority();
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				return getIncrementalMaintCost();
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
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
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				setStartupCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				setStbyAuxP((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				setStartRampCurve((StartRampCurve)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				setMinimumRunTime((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				setStartMainFuelCurve((StartMainFuelCurve)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				setRiskFactorCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				setMinimumDownTime((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				setFixedMaintCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				setStartupDate((Date)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				setStartIgnFuelCurve((StartIgnFuelCurve)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				setHotStandbyHeat((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				setStartupPriority((Integer)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				setIncrementalMaintCost((Float)newValue);
				return;
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
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
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				unsetStartupCost();
				return;
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				unsetStbyAuxP();
				return;
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				setStartRampCurve((StartRampCurve)null);
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				unsetMinimumRunTime();
				return;
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				setStartMainFuelCurve((StartMainFuelCurve)null);
				return;
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				unsetRiskFactorCost();
				return;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				unsetMinimumDownTime();
				return;
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				unsetFixedMaintCost();
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				unsetStartupDate();
				return;
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				setStartIgnFuelCurve((StartIgnFuelCurve)null);
				return;
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				unsetHotStandbyHeat();
				return;
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				unsetStartupPriority();
				return;
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				unsetIncrementalMaintCost();
				return;
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
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
			case ProductionPackage.STARTUP_MODEL__STARTUP_COST:
				return isSetStartupCost();
			case ProductionPackage.STARTUP_MODEL__STBY_AUX_P:
				return isSetStbyAuxP();
			case ProductionPackage.STARTUP_MODEL__START_RAMP_CURVE:
				return startRampCurve != null;
			case ProductionPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
				return isSetMinimumRunTime();
			case ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
				return startMainFuelCurve != null;
			case ProductionPackage.STARTUP_MODEL__RISK_FACTOR_COST:
				return isSetRiskFactorCost();
			case ProductionPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
				return isSetMinimumDownTime();
			case ProductionPackage.STARTUP_MODEL__FIXED_MAINT_COST:
				return isSetFixedMaintCost();
			case ProductionPackage.STARTUP_MODEL__STARTUP_DATE:
				return isSetStartupDate();
			case ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
				return startIgnFuelCurve != null;
			case ProductionPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
				return isSetHotStandbyHeat();
			case ProductionPackage.STARTUP_MODEL__STARTUP_PRIORITY:
				return isSetStartupPriority();
			case ProductionPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
				return isSetIncrementalMaintCost();
			case ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
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
		result.append(" (startupCost: ");
		if (startupCostESet) result.append(startupCost); else result.append("<unset>");
		result.append(", stbyAuxP: ");
		if (stbyAuxPESet) result.append(stbyAuxP); else result.append("<unset>");
		result.append(", minimumRunTime: ");
		if (minimumRunTimeESet) result.append(minimumRunTime); else result.append("<unset>");
		result.append(", riskFactorCost: ");
		if (riskFactorCostESet) result.append(riskFactorCost); else result.append("<unset>");
		result.append(", minimumDownTime: ");
		if (minimumDownTimeESet) result.append(minimumDownTime); else result.append("<unset>");
		result.append(", fixedMaintCost: ");
		if (fixedMaintCostESet) result.append(fixedMaintCost); else result.append("<unset>");
		result.append(", startupDate: ");
		if (startupDateESet) result.append(startupDate); else result.append("<unset>");
		result.append(", hotStandbyHeat: ");
		if (hotStandbyHeatESet) result.append(hotStandbyHeat); else result.append("<unset>");
		result.append(", startupPriority: ");
		if (startupPriorityESet) result.append(startupPriority); else result.append("<unset>");
		result.append(", incrementalMaintCost: ");
		if (incrementalMaintCostESet) result.append(incrementalMaintCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StartupModel
