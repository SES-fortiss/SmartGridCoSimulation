/**
 */
package CIM15.IEC61970.Generation.Production;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThermalGeneratingUnit extends GeneratingUnit {
	/**
	 * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAESPlant()
	 * @generated
	 * @ordered
	 */
	protected CAESPlant caesPlant;

	/**
	 * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenerationPlant()
	 * @generated
	 * @ordered
	 */
	protected CogenerationPlant cogenerationPlant;

	/**
	 * The cached value of the '{@link #getShutdownCurve() <em>Shutdown Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownCurve()
	 * @generated
	 * @ordered
	 */
	protected ShutdownCurve shutdownCurve;

	/**
	 * The cached value of the '{@link #getFossilFuels() <em>Fossil Fuels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuels()
	 * @generated
	 * @ordered
	 */
	protected EList<FossilFuel> fossilFuels;

	/**
	 * The cached value of the '{@link #getHeatRateCurve() <em>Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatRateCurve()
	 * @generated
	 * @ordered
	 */
	protected HeatRateCurve heatRateCurve;

	/**
	 * The cached value of the '{@link #getFuelAllocationSchedules() <em>Fuel Allocation Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<FuelAllocationSchedule> fuelAllocationSchedules;

	/**
	 * The cached value of the '{@link #getEmissionCurves() <em>Emission Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<EmissionCurve> emissionCurves;

	/**
	 * The cached value of the '{@link #getHeatInputCurve() <em>Heat Input Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputCurve()
	 * @generated
	 * @ordered
	 */
	protected HeatInputCurve heatInputCurve;

	/**
	 * The cached value of the '{@link #getCombinedCyclePlant() <em>Combined Cycle Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedCyclePlant()
	 * @generated
	 * @ordered
	 */
	protected CombinedCyclePlant combinedCyclePlant;

	/**
	 * The cached value of the '{@link #getIncrementalHeatRateCurve() <em>Incremental Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 * @ordered
	 */
	protected IncrementalHeatRateCurve incrementalHeatRateCurve;

	/**
	 * The cached value of the '{@link #getStartupModel() <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupModel()
	 * @generated
	 * @ordered
	 */
	protected StartupModel startupModel;

	/**
	 * The cached value of the '{@link #getEmmissionAccounts() <em>Emmission Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmmissionAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<EmissionAccount> emmissionAccounts;

	/**
	 * The default value of the '{@link #getOMCost() <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOMCost()
	 * @generated
	 * @ordered
	 */
	protected static final float OM_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOMCost() <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOMCost()
	 * @generated
	 * @ordered
	 */
	protected float oMCost = OM_COST_EDEFAULT;

	/**
	 * This is true if the OM Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oMCostESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThermalGeneratingUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.THERMAL_GENERATING_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CAES Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAES Plant</em>' reference.
	 * @see #setCAESPlant(CAESPlant)
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit
	 * @generated
	 */
	public CAESPlant getCAESPlant() {
		if (caesPlant != null && caesPlant.eIsProxy()) {
			InternalEObject oldCAESPlant = (InternalEObject)caesPlant;
			caesPlant = (CAESPlant)eResolveProxy(oldCAESPlant);
			if (caesPlant != oldCAESPlant) {
			}
		}
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant basicGetCAESPlant() {
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAESPlant(CAESPlant newCAESPlant, NotificationChain msgs) {
		CAESPlant oldCAESPlant = caesPlant;
		caesPlant = newCAESPlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAES Plant</em>' reference.
	 * @see #getCAESPlant()
	 * @generated
	 */
	public void setCAESPlant(CAESPlant newCAESPlant) {
		if (newCAESPlant != caesPlant) {
			NotificationChain msgs = null;
			if (caesPlant != null)
				msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs);
			if (newCAESPlant != null)
				msgs = ((InternalEObject)newCAESPlant).eInverseAdd(this, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs);
			msgs = basicSetCAESPlant(newCAESPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogeneration Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #setCogenerationPlant(CogenerationPlant)
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits
	 * @generated
	 */
	public CogenerationPlant getCogenerationPlant() {
		if (cogenerationPlant != null && cogenerationPlant.eIsProxy()) {
			InternalEObject oldCogenerationPlant = (InternalEObject)cogenerationPlant;
			cogenerationPlant = (CogenerationPlant)eResolveProxy(oldCogenerationPlant);
			if (cogenerationPlant != oldCogenerationPlant) {
			}
		}
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant basicGetCogenerationPlant() {
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCogenerationPlant(CogenerationPlant newCogenerationPlant, NotificationChain msgs) {
		CogenerationPlant oldCogenerationPlant = cogenerationPlant;
		cogenerationPlant = newCogenerationPlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public void setCogenerationPlant(CogenerationPlant newCogenerationPlant) {
		if (newCogenerationPlant != cogenerationPlant) {
			NotificationChain msgs = null;
			if (cogenerationPlant != null)
				msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs);
			if (newCogenerationPlant != null)
				msgs = ((InternalEObject)newCogenerationPlant).eInverseAdd(this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs);
			msgs = basicSetCogenerationPlant(newCogenerationPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Shutdown Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Curve</em>' reference.
	 * @see #setShutdownCurve(ShutdownCurve)
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit
	 * @generated
	 */
	public ShutdownCurve getShutdownCurve() {
		if (shutdownCurve != null && shutdownCurve.eIsProxy()) {
			InternalEObject oldShutdownCurve = (InternalEObject)shutdownCurve;
			shutdownCurve = (ShutdownCurve)eResolveProxy(oldShutdownCurve);
			if (shutdownCurve != oldShutdownCurve) {
			}
		}
		return shutdownCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShutdownCurve basicGetShutdownCurve() {
		return shutdownCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShutdownCurve(ShutdownCurve newShutdownCurve, NotificationChain msgs) {
		ShutdownCurve oldShutdownCurve = shutdownCurve;
		shutdownCurve = newShutdownCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Curve</em>' reference.
	 * @see #getShutdownCurve()
	 * @generated
	 */
	public void setShutdownCurve(ShutdownCurve newShutdownCurve) {
		if (newShutdownCurve != shutdownCurve) {
			NotificationChain msgs = null;
			if (shutdownCurve != null)
				msgs = ((InternalEObject)shutdownCurve).eInverseRemove(this, ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs);
			if (newShutdownCurve != null)
				msgs = ((InternalEObject)newShutdownCurve).eInverseAdd(this, ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs);
			msgs = basicSetShutdownCurve(newShutdownCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Fossil Fuels</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.FossilFuel}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fossil Fuels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fossil Fuels</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit
	 * @generated
	 */
	public EList<FossilFuel> getFossilFuels() {
		if (fossilFuels == null) {
			fossilFuels = new BasicInternalEList<FossilFuel>(FossilFuel.class);
		}
		return fossilFuels;
	}

	/**
	 * Returns the value of the '<em><b>Heat Rate Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Rate Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Rate Curve</em>' reference.
	 * @see #setHeatRateCurve(HeatRateCurve)
	 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit
	 * @generated
	 */
	public HeatRateCurve getHeatRateCurve() {
		if (heatRateCurve != null && heatRateCurve.eIsProxy()) {
			InternalEObject oldHeatRateCurve = (InternalEObject)heatRateCurve;
			heatRateCurve = (HeatRateCurve)eResolveProxy(oldHeatRateCurve);
			if (heatRateCurve != oldHeatRateCurve) {
			}
		}
		return heatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatRateCurve basicGetHeatRateCurve() {
		return heatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatRateCurve(HeatRateCurve newHeatRateCurve, NotificationChain msgs) {
		HeatRateCurve oldHeatRateCurve = heatRateCurve;
		heatRateCurve = newHeatRateCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Rate Curve</em>' reference.
	 * @see #getHeatRateCurve()
	 * @generated
	 */
	public void setHeatRateCurve(HeatRateCurve newHeatRateCurve) {
		if (newHeatRateCurve != heatRateCurve) {
			NotificationChain msgs = null;
			if (heatRateCurve != null)
				msgs = ((InternalEObject)heatRateCurve).eInverseRemove(this, ProductionPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs);
			if (newHeatRateCurve != null)
				msgs = ((InternalEObject)newHeatRateCurve).eInverseAdd(this, ProductionPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs);
			msgs = basicSetHeatRateCurve(newHeatRateCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit
	 * @generated
	 */
	public EList<FuelAllocationSchedule> getFuelAllocationSchedules() {
		if (fuelAllocationSchedules == null) {
			fuelAllocationSchedules = new BasicInternalEList<FuelAllocationSchedule>(FuelAllocationSchedule.class);
		}
		return fuelAllocationSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Emission Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.EmissionCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Curves</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit
	 * @generated
	 */
	public EList<EmissionCurve> getEmissionCurves() {
		if (emissionCurves == null) {
			emissionCurves = new BasicInternalEList<EmissionCurve>(EmissionCurve.class);
		}
		return emissionCurves;
	}

	/**
	 * Returns the value of the '<em><b>Heat Input Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Input Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Input Curve</em>' reference.
	 * @see #setHeatInputCurve(HeatInputCurve)
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit
	 * @generated
	 */
	public HeatInputCurve getHeatInputCurve() {
		if (heatInputCurve != null && heatInputCurve.eIsProxy()) {
			InternalEObject oldHeatInputCurve = (InternalEObject)heatInputCurve;
			heatInputCurve = (HeatInputCurve)eResolveProxy(oldHeatInputCurve);
			if (heatInputCurve != oldHeatInputCurve) {
			}
		}
		return heatInputCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeatInputCurve basicGetHeatInputCurve() {
		return heatInputCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeatInputCurve(HeatInputCurve newHeatInputCurve, NotificationChain msgs) {
		HeatInputCurve oldHeatInputCurve = heatInputCurve;
		heatInputCurve = newHeatInputCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Input Curve</em>' reference.
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public void setHeatInputCurve(HeatInputCurve newHeatInputCurve) {
		if (newHeatInputCurve != heatInputCurve) {
			NotificationChain msgs = null;
			if (heatInputCurve != null)
				msgs = ((InternalEObject)heatInputCurve).eInverseRemove(this, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs);
			if (newHeatInputCurve != null)
				msgs = ((InternalEObject)newHeatInputCurve).eInverseAdd(this, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs);
			msgs = basicSetHeatInputCurve(newHeatInputCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Combined Cycle Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Cycle Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Cycle Plant</em>' reference.
	 * @see #setCombinedCyclePlant(CombinedCyclePlant)
	 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits
	 * @generated
	 */
	public CombinedCyclePlant getCombinedCyclePlant() {
		if (combinedCyclePlant != null && combinedCyclePlant.eIsProxy()) {
			InternalEObject oldCombinedCyclePlant = (InternalEObject)combinedCyclePlant;
			combinedCyclePlant = (CombinedCyclePlant)eResolveProxy(oldCombinedCyclePlant);
			if (combinedCyclePlant != oldCombinedCyclePlant) {
			}
		}
		return combinedCyclePlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedCyclePlant basicGetCombinedCyclePlant() {
		return combinedCyclePlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedCyclePlant(CombinedCyclePlant newCombinedCyclePlant, NotificationChain msgs) {
		CombinedCyclePlant oldCombinedCyclePlant = combinedCyclePlant;
		combinedCyclePlant = newCombinedCyclePlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Cycle Plant</em>' reference.
	 * @see #getCombinedCyclePlant()
	 * @generated
	 */
	public void setCombinedCyclePlant(CombinedCyclePlant newCombinedCyclePlant) {
		if (newCombinedCyclePlant != combinedCyclePlant) {
			NotificationChain msgs = null;
			if (combinedCyclePlant != null)
				msgs = ((InternalEObject)combinedCyclePlant).eInverseRemove(this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs);
			if (newCombinedCyclePlant != null)
				msgs = ((InternalEObject)newCombinedCyclePlant).eInverseAdd(this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs);
			msgs = basicSetCombinedCyclePlant(newCombinedCyclePlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Incremental Heat Rate Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Heat Rate Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Heat Rate Curve</em>' reference.
	 * @see #setIncrementalHeatRateCurve(IncrementalHeatRateCurve)
	 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit
	 * @generated
	 */
	public IncrementalHeatRateCurve getIncrementalHeatRateCurve() {
		if (incrementalHeatRateCurve != null && incrementalHeatRateCurve.eIsProxy()) {
			InternalEObject oldIncrementalHeatRateCurve = (InternalEObject)incrementalHeatRateCurve;
			incrementalHeatRateCurve = (IncrementalHeatRateCurve)eResolveProxy(oldIncrementalHeatRateCurve);
			if (incrementalHeatRateCurve != oldIncrementalHeatRateCurve) {
			}
		}
		return incrementalHeatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalHeatRateCurve basicGetIncrementalHeatRateCurve() {
		return incrementalHeatRateCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementalHeatRateCurve(IncrementalHeatRateCurve newIncrementalHeatRateCurve, NotificationChain msgs) {
		IncrementalHeatRateCurve oldIncrementalHeatRateCurve = incrementalHeatRateCurve;
		incrementalHeatRateCurve = newIncrementalHeatRateCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Heat Rate Curve</em>' reference.
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 */
	public void setIncrementalHeatRateCurve(IncrementalHeatRateCurve newIncrementalHeatRateCurve) {
		if (newIncrementalHeatRateCurve != incrementalHeatRateCurve) {
			NotificationChain msgs = null;
			if (incrementalHeatRateCurve != null)
				msgs = ((InternalEObject)incrementalHeatRateCurve).eInverseRemove(this, ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class, msgs);
			if (newIncrementalHeatRateCurve != null)
				msgs = ((InternalEObject)newIncrementalHeatRateCurve).eInverseAdd(this, ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class, msgs);
			msgs = basicSetIncrementalHeatRateCurve(newIncrementalHeatRateCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit
	 * @generated
	 */
	public StartupModel getStartupModel() {
		if (startupModel != null && startupModel.eIsProxy()) {
			InternalEObject oldStartupModel = (InternalEObject)startupModel;
			startupModel = (StartupModel)eResolveProxy(oldStartupModel);
			if (startupModel != oldStartupModel) {
			}
		}
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel basicGetStartupModel() {
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartupModel(StartupModel newStartupModel, NotificationChain msgs) {
		StartupModel oldStartupModel = startupModel;
		startupModel = newStartupModel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Model</em>' reference.
	 * @see #getStartupModel()
	 * @generated
	 */
	public void setStartupModel(StartupModel newStartupModel) {
		if (newStartupModel != startupModel) {
			NotificationChain msgs = null;
			if (startupModel != null)
				msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs);
			if (newStartupModel != null)
				msgs = ((InternalEObject)newStartupModel).eInverseAdd(this, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs);
			msgs = basicSetStartupModel(newStartupModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Emmission Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.EmissionAccount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emmission Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emmission Accounts</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit
	 * @generated
	 */
	public EList<EmissionAccount> getEmmissionAccounts() {
		if (emmissionAccounts == null) {
			emmissionAccounts = new BasicInternalEList<EmissionAccount>(EmissionAccount.class);
		}
		return emmissionAccounts;
	}

	/**
	 * Returns the value of the '<em><b>OM Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM Cost</em>' attribute.
	 * @see #isSetOMCost()
	 * @see #unsetOMCost()
	 * @see #setOMCost(float)
	 * @generated
	 */
	public float getOMCost() {
		return oMCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM Cost</em>' attribute.
	 * @see #isSetOMCost()
	 * @see #unsetOMCost()
	 * @see #getOMCost()
	 * @generated
	 */
	public void setOMCost(float newOMCost) {
		oMCost = newOMCost;
		oMCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOMCost()
	 * @see #getOMCost()
	 * @see #setOMCost(float)
	 * @generated
	 */
	public void unsetOMCost() {
		oMCost = OM_COST_EDEFAULT;
		oMCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>OM Cost</em>' attribute is set.
	 * @see #unsetOMCost()
	 * @see #getOMCost()
	 * @see #setOMCost(float)
	 * @generated
	 */
	public boolean isSetOMCost() {
		return oMCostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				if (caesPlant != null)
					msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs);
				return basicSetCAESPlant((CAESPlant)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				if (cogenerationPlant != null)
					msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs);
				return basicSetCogenerationPlant((CogenerationPlant)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				if (shutdownCurve != null)
					msgs = ((InternalEObject)shutdownCurve).eInverseRemove(this, ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs);
				return basicSetShutdownCurve((ShutdownCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFossilFuels()).basicAdd(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				if (heatRateCurve != null)
					msgs = ((InternalEObject)heatRateCurve).eInverseRemove(this, ProductionPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs);
				return basicSetHeatRateCurve((HeatRateCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFuelAllocationSchedules()).basicAdd(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmissionCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				if (heatInputCurve != null)
					msgs = ((InternalEObject)heatInputCurve).eInverseRemove(this, ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs);
				return basicSetHeatInputCurve((HeatInputCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				if (combinedCyclePlant != null)
					msgs = ((InternalEObject)combinedCyclePlant).eInverseRemove(this, ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs);
				return basicSetCombinedCyclePlant((CombinedCyclePlant)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				if (incrementalHeatRateCurve != null)
					msgs = ((InternalEObject)incrementalHeatRateCurve).eInverseRemove(this, ProductionPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class, msgs);
				return basicSetIncrementalHeatRateCurve((IncrementalHeatRateCurve)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				if (startupModel != null)
					msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs);
				return basicSetStartupModel((StartupModel)otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmmissionAccounts()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				return basicSetCAESPlant(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				return basicSetCogenerationPlant(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				return basicSetShutdownCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return ((InternalEList<?>)getFossilFuels()).basicRemove(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				return basicSetHeatRateCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<?>)getFuelAllocationSchedules()).basicRemove(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return ((InternalEList<?>)getEmissionCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				return basicSetHeatInputCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				return basicSetCombinedCyclePlant(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				return basicSetIncrementalHeatRateCurve(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				return basicSetStartupModel(null, msgs);
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return ((InternalEList<?>)getEmmissionAccounts()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				if (resolve) return getCAESPlant();
				return basicGetCAESPlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				if (resolve) return getCogenerationPlant();
				return basicGetCogenerationPlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				if (resolve) return getShutdownCurve();
				return basicGetShutdownCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return getFossilFuels();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				if (resolve) return getHeatRateCurve();
				return basicGetHeatRateCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return getFuelAllocationSchedules();
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return getEmissionCurves();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				if (resolve) return getHeatInputCurve();
				return basicGetHeatInputCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				if (resolve) return getCombinedCyclePlant();
				return basicGetCombinedCyclePlant();
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				if (resolve) return getIncrementalHeatRateCurve();
				return basicGetIncrementalHeatRateCurve();
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				if (resolve) return getStartupModel();
				return basicGetStartupModel();
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return getEmmissionAccounts();
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				return getOMCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				setCAESPlant((CAESPlant)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				setShutdownCurve((ShutdownCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				getFossilFuels().clear();
				getFossilFuels().addAll((Collection<? extends FossilFuel>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				setHeatRateCurve((HeatRateCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				getFuelAllocationSchedules().addAll((Collection<? extends FuelAllocationSchedule>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				getEmissionCurves().clear();
				getEmissionCurves().addAll((Collection<? extends EmissionCurve>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				setHeatInputCurve((HeatInputCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				setCombinedCyclePlant((CombinedCyclePlant)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				setIncrementalHeatRateCurve((IncrementalHeatRateCurve)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				setStartupModel((StartupModel)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				getEmmissionAccounts().clear();
				getEmmissionAccounts().addAll((Collection<? extends EmissionAccount>)newValue);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				setOMCost((Float)newValue);
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				setCAESPlant((CAESPlant)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				setShutdownCurve((ShutdownCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				getFossilFuels().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				setHeatRateCurve((HeatRateCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				getEmissionCurves().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				setHeatInputCurve((HeatInputCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				setCombinedCyclePlant((CombinedCyclePlant)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				setIncrementalHeatRateCurve((IncrementalHeatRateCurve)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				setStartupModel((StartupModel)null);
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				getEmmissionAccounts().clear();
				return;
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				unsetOMCost();
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
			case ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
				return caesPlant != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
				return cogenerationPlant != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
				return shutdownCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
				return fossilFuels != null && !fossilFuels.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
				return heatRateCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
				return fuelAllocationSchedules != null && !fuelAllocationSchedules.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
				return emissionCurves != null && !emissionCurves.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
				return heatInputCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
				return combinedCyclePlant != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
				return incrementalHeatRateCurve != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
				return startupModel != null;
			case ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
				return emmissionAccounts != null && !emmissionAccounts.isEmpty();
			case ProductionPackage.THERMAL_GENERATING_UNIT__OM_COST:
				return isSetOMCost();
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
		result.append(" (oMCost: ");
		if (oMCostESet) result.append(oMCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ThermalGeneratingUnit
