/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit;

import CIM15.IEC61970.Core.Equipment;

import CIM15.IEC61970.Wires.SynchronousMachine;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratingUnit extends Equipment {
	/**
	 * The default value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_GROSS_MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMinP()
	 * @generated
	 * @ordered
	 */
	protected float ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;

	/**
	 * This is true if the Rated Gross Min P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedGrossMinPESet;

	/**
	 * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected static final float EFFICIENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected float efficiency = EFFICIENCY_EDEFAULT;

	/**
	 * This is true if the Efficiency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean efficiencyESet;

	/**
	 * The default value of the '{@link #getStepChange() <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepChange()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_CHANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepChange() <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepChange()
	 * @generated
	 * @ordered
	 */
	protected float stepChange = STEP_CHANGE_EDEFAULT;

	/**
	 * This is true if the Step Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepChangeESet;

	/**
	 * The default value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedNetMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_NET_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedNetMaxP()
	 * @generated
	 * @ordered
	 */
	protected float ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;

	/**
	 * This is true if the Rated Net Max P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedNetMaxPESet;

	/**
	 * The default value of the '{@link #getTieLinePF() <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLinePF()
	 * @generated
	 * @ordered
	 */
	protected static final float TIE_LINE_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTieLinePF() <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieLinePF()
	 * @generated
	 * @ordered
	 */
	protected float tieLinePF = TIE_LINE_PF_EDEFAULT;

	/**
	 * This is true if the Tie Line PF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tieLinePFESet;

	/**
	 * The default value of the '{@link #isDispReserveFlag() <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDispReserveFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISP_RESERVE_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDispReserveFlag() <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDispReserveFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean dispReserveFlag = DISP_RESERVE_FLAG_EDEFAULT;

	/**
	 * This is true if the Disp Reserve Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispReserveFlagESet;

	/**
	 * The default value of the '{@link #getControlPulseHigh() <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseHigh()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PULSE_HIGH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPulseHigh() <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseHigh()
	 * @generated
	 * @ordered
	 */
	protected float controlPulseHigh = CONTROL_PULSE_HIGH_EDEFAULT;

	/**
	 * This is true if the Control Pulse High attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlPulseHighESet;

	/**
	 * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected static final float STARTUP_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected float startupTime = STARTUP_TIME_EDEFAULT;

	/**
	 * This is true if the Startup Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startupTimeESet;

	/**
	 * The default value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_OPERATING_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOperatingP()
	 * @generated
	 * @ordered
	 */
	protected float maxOperatingP = MAX_OPERATING_P_EDEFAULT;

	/**
	 * This is true if the Max Operating P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxOperatingPESet;

	/**
	 * The default value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlSource()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorControlSource GEN_CONTROL_SOURCE_EDEFAULT = GeneratorControlSource.PLANT_CONTROL;

	/**
	 * The cached value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlSource()
	 * @generated
	 * @ordered
	 */
	protected GeneratorControlSource genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;

	/**
	 * This is true if the Gen Control Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genControlSourceESet;

	/**
	 * The default value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPF()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalPF()
	 * @generated
	 * @ordered
	 */
	protected float normalPF = NORMAL_PF_EDEFAULT;

	/**
	 * This is true if the Normal PF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalPFESet;

	/**
	 * The default value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialP()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialP()
	 * @generated
	 * @ordered
	 */
	protected float initialP = INITIAL_P_EDEFAULT;

	/**
	 * This is true if the Initial P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialPESet;

	/**
	 * The default value of the '{@link #getSpinReserveRamp() <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinReserveRamp()
	 * @generated
	 * @ordered
	 */
	protected static final float SPIN_RESERVE_RAMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpinReserveRamp() <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpinReserveRamp()
	 * @generated
	 * @ordered
	 */
	protected float spinReserveRamp = SPIN_RESERVE_RAMP_EDEFAULT;

	/**
	 * This is true if the Spin Reserve Ramp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spinReserveRampESet;

	/**
	 * The default value of the '{@link #getAllocSpinResP() <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocSpinResP()
	 * @generated
	 * @ordered
	 */
	protected static final float ALLOC_SPIN_RES_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAllocSpinResP() <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocSpinResP()
	 * @generated
	 * @ordered
	 */
	protected float allocSpinResP = ALLOC_SPIN_RES_P_EDEFAULT;

	/**
	 * This is true if the Alloc Spin Res P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allocSpinResPESet;

	/**
	 * The default value of the '{@link #getMinEconomicP() <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEconomicP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_ECONOMIC_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinEconomicP() <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEconomicP()
	 * @generated
	 * @ordered
	 */
	protected float minEconomicP = MIN_ECONOMIC_P_EDEFAULT;

	/**
	 * This is true if the Min Economic P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minEconomicPESet;

	/**
	 * The default value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongPF()
	 * @generated
	 * @ordered
	 */
	protected static final float LONG_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongPF()
	 * @generated
	 * @ordered
	 */
	protected float longPF = LONG_PF_EDEFAULT;

	/**
	 * This is true if the Long PF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longPFESet;

	/**
	 * The default value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalP()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalP()
	 * @generated
	 * @ordered
	 */
	protected float nominalP = NOMINAL_P_EDEFAULT;

	/**
	 * This is true if the Nominal P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalPESet;

	/**
	 * The default value of the '{@link #getControlResponseRate() <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlResponseRate()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_RESPONSE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlResponseRate() <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlResponseRate()
	 * @generated
	 * @ordered
	 */
	protected float controlResponseRate = CONTROL_RESPONSE_RATE_EDEFAULT;

	/**
	 * This is true if the Control Response Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlResponseRateESet;

	/**
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAreaGeneratingUnit> controlAreaGeneratingUnit;

	/**
	 * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> synchronousMachines;

	/**
	 * The default value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_GROSS_MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedGrossMaxP()
	 * @generated
	 * @ordered
	 */
	protected float ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;

	/**
	 * This is true if the Rated Gross Max P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedGrossMaxPESet;

	/**
	 * The default value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float PENALTY_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyFactor()
	 * @generated
	 * @ordered
	 */
	protected float penaltyFactor = PENALTY_FACTOR_EDEFAULT;

	/**
	 * This is true if the Penalty Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean penaltyFactorESet;

	/**
	 * The default value of the '{@link #isFastStartFlag() <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFastStartFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAST_START_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFastStartFlag() <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFastStartFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean fastStartFlag = FAST_START_FLAG_EDEFAULT;

	/**
	 * This is true if the Fast Start Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fastStartFlagESet;

	/**
	 * The default value of the '{@link #getMinimumOffTime() <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOffTime()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_OFF_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumOffTime() <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOffTime()
	 * @generated
	 * @ordered
	 */
	protected float minimumOffTime = MINIMUM_OFF_TIME_EDEFAULT;

	/**
	 * This is true if the Minimum Off Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumOffTimeESet;

	/**
	 * The default value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPF()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_PF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortPF()
	 * @generated
	 * @ordered
	 */
	protected float shortPF = SHORT_PF_EDEFAULT;

	/**
	 * This is true if the Short PF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shortPFESet;

	/**
	 * The default value of the '{@link #getGovernorMPL() <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorMPL()
	 * @generated
	 * @ordered
	 */
	protected static final float GOVERNOR_MPL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGovernorMPL() <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorMPL()
	 * @generated
	 * @ordered
	 */
	protected float governorMPL = GOVERNOR_MPL_EDEFAULT;

	/**
	 * This is true if the Governor MPL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean governorMPLESet;

	/**
	 * The default value of the '{@link #getEnergyMinP() <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyMinP() <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyMinP()
	 * @generated
	 * @ordered
	 */
	protected float energyMinP = ENERGY_MIN_P_EDEFAULT;

	/**
	 * This is true if the Energy Min P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyMinPESet;

	/**
	 * The default value of the '{@link #getFuelPriority() <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int FUEL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFuelPriority() <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelPriority()
	 * @generated
	 * @ordered
	 */
	protected int fuelPriority = FUEL_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Fuel Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelPriorityESet;

	/**
	 * The default value of the '{@link #getMaxEconomicP() <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEconomicP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ECONOMIC_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxEconomicP() <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEconomicP()
	 * @generated
	 * @ordered
	 */
	protected float maxEconomicP = MAX_ECONOMIC_P_EDEFAULT;

	/**
	 * This is true if the Max Economic P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxEconomicPESet;

	/**
	 * The default value of the '{@link #getAutoCntrlMarginP() <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCntrlMarginP()
	 * @generated
	 * @ordered
	 */
	protected static final float AUTO_CNTRL_MARGIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAutoCntrlMarginP() <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCntrlMarginP()
	 * @generated
	 * @ordered
	 */
	protected float autoCntrlMarginP = AUTO_CNTRL_MARGIN_P_EDEFAULT;

	/**
	 * This is true if the Auto Cntrl Margin P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoCntrlMarginPESet;

	/**
	 * The default value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighControlLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_CONTROL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighControlLimit()
	 * @generated
	 * @ordered
	 */
	protected float highControlLimit = HIGH_CONTROL_LIMIT_EDEFAULT;

	/**
	 * This is true if the High Control Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highControlLimitESet;

	/**
	 * The default value of the '{@link #getModelDetail() <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDetail()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MODEL_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelDetail() <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelDetail()
	 * @generated
	 * @ordered
	 */
	protected BigInteger modelDetail = MODEL_DETAIL_EDEFAULT;

	/**
	 * This is true if the Model Detail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modelDetailESet;

	/**
	 * The default value of the '{@link #getControlPulseLow() <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseLow()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_PULSE_LOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlPulseLow() <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPulseLow()
	 * @generated
	 * @ordered
	 */
	protected float controlPulseLow = CONTROL_PULSE_LOW_EDEFAULT;

	/**
	 * This is true if the Control Pulse Low attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlPulseLowESet;

	/**
	 * The default value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final float RAISE_RAMP_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseRampRate()
	 * @generated
	 * @ordered
	 */
	protected float raiseRampRate = RAISE_RAMP_RATE_EDEFAULT;

	/**
	 * This is true if the Raise Ramp Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean raiseRampRateESet;

	/**
	 * The cached value of the '{@link #getGenUnitOpSchedule() <em>Gen Unit Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUnitOpSchedule()
	 * @generated
	 * @ordered
	 */
	protected GenUnitOpSchedule genUnitOpSchedule;

	/**
	 * The default value of the '{@link #getControlDeadband() <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDeadband()
	 * @generated
	 * @ordered
	 */
	protected static final float CONTROL_DEADBAND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getControlDeadband() <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDeadband()
	 * @generated
	 * @ordered
	 */
	protected float controlDeadband = CONTROL_DEADBAND_EDEFAULT;

	/**
	 * This is true if the Control Deadband attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlDeadbandESet;

	/**
	 * The default value of the '{@link #getBaseP() <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseP()
	 * @generated
	 * @ordered
	 */
	protected static final float BASE_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBaseP() <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseP()
	 * @generated
	 * @ordered
	 */
	protected float baseP = BASE_P_EDEFAULT;

	/**
	 * This is true if the Base P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean basePESet;

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
	 * The default value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCost()
	 * @generated
	 * @ordered
	 */
	protected static final float VARIABLE_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCost()
	 * @generated
	 * @ordered
	 */
	protected float variableCost = VARIABLE_COST_EDEFAULT;

	/**
	 * This is true if the Variable Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean variableCostESet;

	/**
	 * The default value of the '{@link #getGenOperatingMode() <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorOperatingMode GEN_OPERATING_MODE_EDEFAULT = GeneratorOperatingMode.MRN;

	/**
	 * The cached value of the '{@link #getGenOperatingMode() <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected GeneratorOperatingMode genOperatingMode = GEN_OPERATING_MODE_EDEFAULT;

	/**
	 * This is true if the Gen Operating Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genOperatingModeESet;

	/**
	 * The default value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRampRate()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_RAMP_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerRampRate()
	 * @generated
	 * @ordered
	 */
	protected float lowerRampRate = LOWER_RAMP_RATE_EDEFAULT;

	/**
	 * This is true if the Lower Ramp Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerRampRateESet;

	/**
	 * The default value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_OPERATING_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOperatingP()
	 * @generated
	 * @ordered
	 */
	protected float minOperatingP = MIN_OPERATING_P_EDEFAULT;

	/**
	 * This is true if the Min Operating P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minOperatingPESet;

	/**
	 * The default value of the '{@link #getLowControlLimit() <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowControlLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_CONTROL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowControlLimit() <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowControlLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowControlLimit = LOW_CONTROL_LIMIT_EDEFAULT;

	/**
	 * This is true if the Low Control Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowControlLimitESet;

	/**
	 * The cached value of the '{@link #getGrossToNetActivePowerCurves() <em>Gross To Net Active Power Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossToNetActivePowerCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<GrossToNetActivePowerCurve> grossToNetActivePowerCurves;

	/**
	 * The default value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 * @ordered
	 */
	protected float maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;

	/**
	 * This is true if the Maximum Allowable Spinning Reserve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumAllowableSpinningReserveESet;

	/**
	 * The default value of the '{@link #getGenControlMode() <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratorControlMode GEN_CONTROL_MODE_EDEFAULT = GeneratorControlMode.SETPOINT;

	/**
	 * The cached value of the '{@link #getGenControlMode() <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenControlMode()
	 * @generated
	 * @ordered
	 */
	protected GeneratorControlMode genControlMode = GEN_CONTROL_MODE_EDEFAULT;

	/**
	 * This is true if the Gen Control Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genControlModeESet;

	/**
	 * The cached value of the '{@link #getGenUnitOpCostCurves() <em>Gen Unit Op Cost Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenUnitOpCostCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<GenUnitOpCostCurve> genUnitOpCostCurves;

	/**
	 * The default value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorSCD()
	 * @generated
	 * @ordered
	 */
	protected static final float GOVERNOR_SCD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernorSCD()
	 * @generated
	 * @ordered
	 */
	protected float governorSCD = GOVERNOR_SCD_EDEFAULT;

	/**
	 * This is true if the Governor SCD attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean governorSCDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratingUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.GENERATING_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Gross Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Gross Min P</em>' attribute.
	 * @see #isSetRatedGrossMinP()
	 * @see #unsetRatedGrossMinP()
	 * @see #setRatedGrossMinP(float)
	 * @generated
	 */
	public float getRatedGrossMinP() {
		return ratedGrossMinP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Gross Min P</em>' attribute.
	 * @see #isSetRatedGrossMinP()
	 * @see #unsetRatedGrossMinP()
	 * @see #getRatedGrossMinP()
	 * @generated
	 */
	public void setRatedGrossMinP(float newRatedGrossMinP) {
		ratedGrossMinP = newRatedGrossMinP;
		ratedGrossMinPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedGrossMinP()
	 * @see #getRatedGrossMinP()
	 * @see #setRatedGrossMinP(float)
	 * @generated
	 */
	public void unsetRatedGrossMinP() {
		ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;
		ratedGrossMinPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Gross Min P</em>' attribute is set.
	 * @see #unsetRatedGrossMinP()
	 * @see #getRatedGrossMinP()
	 * @see #setRatedGrossMinP(float)
	 * @generated
	 */
	public boolean isSetRatedGrossMinP() {
		return ratedGrossMinPESet;
	}

	/**
	 * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficiency</em>' attribute.
	 * @see #isSetEfficiency()
	 * @see #unsetEfficiency()
	 * @see #setEfficiency(float)
	 * @generated
	 */
	public float getEfficiency() {
		return efficiency;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #isSetEfficiency()
	 * @see #unsetEfficiency()
	 * @see #getEfficiency()
	 * @generated
	 */
	public void setEfficiency(float newEfficiency) {
		efficiency = newEfficiency;
		efficiencyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEfficiency()
	 * @see #getEfficiency()
	 * @see #setEfficiency(float)
	 * @generated
	 */
	public void unsetEfficiency() {
		efficiency = EFFICIENCY_EDEFAULT;
		efficiencyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Efficiency</em>' attribute is set.
	 * @see #unsetEfficiency()
	 * @see #getEfficiency()
	 * @see #setEfficiency(float)
	 * @generated
	 */
	public boolean isSetEfficiency() {
		return efficiencyESet;
	}

	/**
	 * Returns the value of the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Change</em>' attribute.
	 * @see #isSetStepChange()
	 * @see #unsetStepChange()
	 * @see #setStepChange(float)
	 * @generated
	 */
	public float getStepChange() {
		return stepChange;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Change</em>' attribute.
	 * @see #isSetStepChange()
	 * @see #unsetStepChange()
	 * @see #getStepChange()
	 * @generated
	 */
	public void setStepChange(float newStepChange) {
		stepChange = newStepChange;
		stepChangeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepChange()
	 * @see #getStepChange()
	 * @see #setStepChange(float)
	 * @generated
	 */
	public void unsetStepChange() {
		stepChange = STEP_CHANGE_EDEFAULT;
		stepChangeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Change</em>' attribute is set.
	 * @see #unsetStepChange()
	 * @see #getStepChange()
	 * @see #setStepChange(float)
	 * @generated
	 */
	public boolean isSetStepChange() {
		return stepChangeESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Net Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Net Max P</em>' attribute.
	 * @see #isSetRatedNetMaxP()
	 * @see #unsetRatedNetMaxP()
	 * @see #setRatedNetMaxP(float)
	 * @generated
	 */
	public float getRatedNetMaxP() {
		return ratedNetMaxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Net Max P</em>' attribute.
	 * @see #isSetRatedNetMaxP()
	 * @see #unsetRatedNetMaxP()
	 * @see #getRatedNetMaxP()
	 * @generated
	 */
	public void setRatedNetMaxP(float newRatedNetMaxP) {
		ratedNetMaxP = newRatedNetMaxP;
		ratedNetMaxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedNetMaxP()
	 * @see #getRatedNetMaxP()
	 * @see #setRatedNetMaxP(float)
	 * @generated
	 */
	public void unsetRatedNetMaxP() {
		ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;
		ratedNetMaxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Net Max P</em>' attribute is set.
	 * @see #unsetRatedNetMaxP()
	 * @see #getRatedNetMaxP()
	 * @see #setRatedNetMaxP(float)
	 * @generated
	 */
	public boolean isSetRatedNetMaxP() {
		return ratedNetMaxPESet;
	}

	/**
	 * Returns the value of the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Line PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Line PF</em>' attribute.
	 * @see #isSetTieLinePF()
	 * @see #unsetTieLinePF()
	 * @see #setTieLinePF(float)
	 * @generated
	 */
	public float getTieLinePF() {
		return tieLinePF;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Line PF</em>' attribute.
	 * @see #isSetTieLinePF()
	 * @see #unsetTieLinePF()
	 * @see #getTieLinePF()
	 * @generated
	 */
	public void setTieLinePF(float newTieLinePF) {
		tieLinePF = newTieLinePF;
		tieLinePFESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTieLinePF()
	 * @see #getTieLinePF()
	 * @see #setTieLinePF(float)
	 * @generated
	 */
	public void unsetTieLinePF() {
		tieLinePF = TIE_LINE_PF_EDEFAULT;
		tieLinePFESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tie Line PF</em>' attribute is set.
	 * @see #unsetTieLinePF()
	 * @see #getTieLinePF()
	 * @see #setTieLinePF(float)
	 * @generated
	 */
	public boolean isSetTieLinePF() {
		return tieLinePFESet;
	}

	/**
	 * Returns the value of the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disp Reserve Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disp Reserve Flag</em>' attribute.
	 * @see #isSetDispReserveFlag()
	 * @see #unsetDispReserveFlag()
	 * @see #setDispReserveFlag(boolean)
	 * @generated
	 */
	public boolean isDispReserveFlag() {
		return dispReserveFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Reserve Flag</em>' attribute.
	 * @see #isSetDispReserveFlag()
	 * @see #unsetDispReserveFlag()
	 * @see #isDispReserveFlag()
	 * @generated
	 */
	public void setDispReserveFlag(boolean newDispReserveFlag) {
		dispReserveFlag = newDispReserveFlag;
		dispReserveFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDispReserveFlag()
	 * @see #isDispReserveFlag()
	 * @see #setDispReserveFlag(boolean)
	 * @generated
	 */
	public void unsetDispReserveFlag() {
		dispReserveFlag = DISP_RESERVE_FLAG_EDEFAULT;
		dispReserveFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disp Reserve Flag</em>' attribute is set.
	 * @see #unsetDispReserveFlag()
	 * @see #isDispReserveFlag()
	 * @see #setDispReserveFlag(boolean)
	 * @generated
	 */
	public boolean isSetDispReserveFlag() {
		return dispReserveFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Pulse High</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Pulse High</em>' attribute.
	 * @see #isSetControlPulseHigh()
	 * @see #unsetControlPulseHigh()
	 * @see #setControlPulseHigh(float)
	 * @generated
	 */
	public float getControlPulseHigh() {
		return controlPulseHigh;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Pulse High</em>' attribute.
	 * @see #isSetControlPulseHigh()
	 * @see #unsetControlPulseHigh()
	 * @see #getControlPulseHigh()
	 * @generated
	 */
	public void setControlPulseHigh(float newControlPulseHigh) {
		controlPulseHigh = newControlPulseHigh;
		controlPulseHighESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlPulseHigh()
	 * @see #getControlPulseHigh()
	 * @see #setControlPulseHigh(float)
	 * @generated
	 */
	public void unsetControlPulseHigh() {
		controlPulseHigh = CONTROL_PULSE_HIGH_EDEFAULT;
		controlPulseHighESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Pulse High</em>' attribute is set.
	 * @see #unsetControlPulseHigh()
	 * @see #getControlPulseHigh()
	 * @see #setControlPulseHigh(float)
	 * @generated
	 */
	public boolean isSetControlPulseHigh() {
		return controlPulseHighESet;
	}

	/**
	 * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Time</em>' attribute.
	 * @see #isSetStartupTime()
	 * @see #unsetStartupTime()
	 * @see #setStartupTime(float)
	 * @generated
	 */
	public float getStartupTime() {
		return startupTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Time</em>' attribute.
	 * @see #isSetStartupTime()
	 * @see #unsetStartupTime()
	 * @see #getStartupTime()
	 * @generated
	 */
	public void setStartupTime(float newStartupTime) {
		startupTime = newStartupTime;
		startupTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartupTime()
	 * @see #getStartupTime()
	 * @see #setStartupTime(float)
	 * @generated
	 */
	public void unsetStartupTime() {
		startupTime = STARTUP_TIME_EDEFAULT;
		startupTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Startup Time</em>' attribute is set.
	 * @see #unsetStartupTime()
	 * @see #getStartupTime()
	 * @see #setStartupTime(float)
	 * @generated
	 */
	public boolean isSetStartupTime() {
		return startupTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Operating P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Operating P</em>' attribute.
	 * @see #isSetMaxOperatingP()
	 * @see #unsetMaxOperatingP()
	 * @see #setMaxOperatingP(float)
	 * @generated
	 */
	public float getMaxOperatingP() {
		return maxOperatingP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Operating P</em>' attribute.
	 * @see #isSetMaxOperatingP()
	 * @see #unsetMaxOperatingP()
	 * @see #getMaxOperatingP()
	 * @generated
	 */
	public void setMaxOperatingP(float newMaxOperatingP) {
		maxOperatingP = newMaxOperatingP;
		maxOperatingPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxOperatingP()
	 * @see #getMaxOperatingP()
	 * @see #setMaxOperatingP(float)
	 * @generated
	 */
	public void unsetMaxOperatingP() {
		maxOperatingP = MAX_OPERATING_P_EDEFAULT;
		maxOperatingPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Operating P</em>' attribute is set.
	 * @see #unsetMaxOperatingP()
	 * @see #getMaxOperatingP()
	 * @see #setMaxOperatingP(float)
	 * @generated
	 */
	public boolean isSetMaxOperatingP() {
		return maxOperatingPESet;
	}

	/**
	 * Returns the value of the '<em><b>Gen Control Source</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.GeneratorControlSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Control Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Control Source</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlSource
	 * @see #isSetGenControlSource()
	 * @see #unsetGenControlSource()
	 * @see #setGenControlSource(GeneratorControlSource)
	 * @generated
	 */
	public GeneratorControlSource getGenControlSource() {
		return genControlSource;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Control Source</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlSource
	 * @see #isSetGenControlSource()
	 * @see #unsetGenControlSource()
	 * @see #getGenControlSource()
	 * @generated
	 */
	public void setGenControlSource(GeneratorControlSource newGenControlSource) {
		genControlSource = newGenControlSource == null ? GEN_CONTROL_SOURCE_EDEFAULT : newGenControlSource;
		genControlSourceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenControlSource()
	 * @see #getGenControlSource()
	 * @see #setGenControlSource(GeneratorControlSource)
	 * @generated
	 */
	public void unsetGenControlSource() {
		genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;
		genControlSourceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gen Control Source</em>' attribute is set.
	 * @see #unsetGenControlSource()
	 * @see #getGenControlSource()
	 * @see #setGenControlSource(GeneratorControlSource)
	 * @generated
	 */
	public boolean isSetGenControlSource() {
		return genControlSourceESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal PF</em>' attribute.
	 * @see #isSetNormalPF()
	 * @see #unsetNormalPF()
	 * @see #setNormalPF(float)
	 * @generated
	 */
	public float getNormalPF() {
		return normalPF;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal PF</em>' attribute.
	 * @see #isSetNormalPF()
	 * @see #unsetNormalPF()
	 * @see #getNormalPF()
	 * @generated
	 */
	public void setNormalPF(float newNormalPF) {
		normalPF = newNormalPF;
		normalPFESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalPF()
	 * @see #getNormalPF()
	 * @see #setNormalPF(float)
	 * @generated
	 */
	public void unsetNormalPF() {
		normalPF = NORMAL_PF_EDEFAULT;
		normalPFESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal PF</em>' attribute is set.
	 * @see #unsetNormalPF()
	 * @see #getNormalPF()
	 * @see #setNormalPF(float)
	 * @generated
	 */
	public boolean isSetNormalPF() {
		return normalPFESet;
	}

	/**
	 * Returns the value of the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial P</em>' attribute.
	 * @see #isSetInitialP()
	 * @see #unsetInitialP()
	 * @see #setInitialP(float)
	 * @generated
	 */
	public float getInitialP() {
		return initialP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial P</em>' attribute.
	 * @see #isSetInitialP()
	 * @see #unsetInitialP()
	 * @see #getInitialP()
	 * @generated
	 */
	public void setInitialP(float newInitialP) {
		initialP = newInitialP;
		initialPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialP()
	 * @see #getInitialP()
	 * @see #setInitialP(float)
	 * @generated
	 */
	public void unsetInitialP() {
		initialP = INITIAL_P_EDEFAULT;
		initialPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial P</em>' attribute is set.
	 * @see #unsetInitialP()
	 * @see #getInitialP()
	 * @see #setInitialP(float)
	 * @generated
	 */
	public boolean isSetInitialP() {
		return initialPESet;
	}

	/**
	 * Returns the value of the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spin Reserve Ramp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spin Reserve Ramp</em>' attribute.
	 * @see #isSetSpinReserveRamp()
	 * @see #unsetSpinReserveRamp()
	 * @see #setSpinReserveRamp(float)
	 * @generated
	 */
	public float getSpinReserveRamp() {
		return spinReserveRamp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spin Reserve Ramp</em>' attribute.
	 * @see #isSetSpinReserveRamp()
	 * @see #unsetSpinReserveRamp()
	 * @see #getSpinReserveRamp()
	 * @generated
	 */
	public void setSpinReserveRamp(float newSpinReserveRamp) {
		spinReserveRamp = newSpinReserveRamp;
		spinReserveRampESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpinReserveRamp()
	 * @see #getSpinReserveRamp()
	 * @see #setSpinReserveRamp(float)
	 * @generated
	 */
	public void unsetSpinReserveRamp() {
		spinReserveRamp = SPIN_RESERVE_RAMP_EDEFAULT;
		spinReserveRampESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spin Reserve Ramp</em>' attribute is set.
	 * @see #unsetSpinReserveRamp()
	 * @see #getSpinReserveRamp()
	 * @see #setSpinReserveRamp(float)
	 * @generated
	 */
	public boolean isSetSpinReserveRamp() {
		return spinReserveRampESet;
	}

	/**
	 * Returns the value of the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alloc Spin Res P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alloc Spin Res P</em>' attribute.
	 * @see #isSetAllocSpinResP()
	 * @see #unsetAllocSpinResP()
	 * @see #setAllocSpinResP(float)
	 * @generated
	 */
	public float getAllocSpinResP() {
		return allocSpinResP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alloc Spin Res P</em>' attribute.
	 * @see #isSetAllocSpinResP()
	 * @see #unsetAllocSpinResP()
	 * @see #getAllocSpinResP()
	 * @generated
	 */
	public void setAllocSpinResP(float newAllocSpinResP) {
		allocSpinResP = newAllocSpinResP;
		allocSpinResPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllocSpinResP()
	 * @see #getAllocSpinResP()
	 * @see #setAllocSpinResP(float)
	 * @generated
	 */
	public void unsetAllocSpinResP() {
		allocSpinResP = ALLOC_SPIN_RES_P_EDEFAULT;
		allocSpinResPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alloc Spin Res P</em>' attribute is set.
	 * @see #unsetAllocSpinResP()
	 * @see #getAllocSpinResP()
	 * @see #setAllocSpinResP(float)
	 * @generated
	 */
	public boolean isSetAllocSpinResP() {
		return allocSpinResPESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Economic P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Economic P</em>' attribute.
	 * @see #isSetMinEconomicP()
	 * @see #unsetMinEconomicP()
	 * @see #setMinEconomicP(float)
	 * @generated
	 */
	public float getMinEconomicP() {
		return minEconomicP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Economic P</em>' attribute.
	 * @see #isSetMinEconomicP()
	 * @see #unsetMinEconomicP()
	 * @see #getMinEconomicP()
	 * @generated
	 */
	public void setMinEconomicP(float newMinEconomicP) {
		minEconomicP = newMinEconomicP;
		minEconomicPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinEconomicP()
	 * @see #getMinEconomicP()
	 * @see #setMinEconomicP(float)
	 * @generated
	 */
	public void unsetMinEconomicP() {
		minEconomicP = MIN_ECONOMIC_P_EDEFAULT;
		minEconomicPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Economic P</em>' attribute is set.
	 * @see #unsetMinEconomicP()
	 * @see #getMinEconomicP()
	 * @see #setMinEconomicP(float)
	 * @generated
	 */
	public boolean isSetMinEconomicP() {
		return minEconomicPESet;
	}

	/**
	 * Returns the value of the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long PF</em>' attribute.
	 * @see #isSetLongPF()
	 * @see #unsetLongPF()
	 * @see #setLongPF(float)
	 * @generated
	 */
	public float getLongPF() {
		return longPF;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long PF</em>' attribute.
	 * @see #isSetLongPF()
	 * @see #unsetLongPF()
	 * @see #getLongPF()
	 * @generated
	 */
	public void setLongPF(float newLongPF) {
		longPF = newLongPF;
		longPFESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongPF()
	 * @see #getLongPF()
	 * @see #setLongPF(float)
	 * @generated
	 */
	public void unsetLongPF() {
		longPF = LONG_PF_EDEFAULT;
		longPFESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Long PF</em>' attribute is set.
	 * @see #unsetLongPF()
	 * @see #getLongPF()
	 * @see #setLongPF(float)
	 * @generated
	 */
	public boolean isSetLongPF() {
		return longPFESet;
	}

	/**
	 * Returns the value of the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal P</em>' attribute.
	 * @see #isSetNominalP()
	 * @see #unsetNominalP()
	 * @see #setNominalP(float)
	 * @generated
	 */
	public float getNominalP() {
		return nominalP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal P</em>' attribute.
	 * @see #isSetNominalP()
	 * @see #unsetNominalP()
	 * @see #getNominalP()
	 * @generated
	 */
	public void setNominalP(float newNominalP) {
		nominalP = newNominalP;
		nominalPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalP()
	 * @see #getNominalP()
	 * @see #setNominalP(float)
	 * @generated
	 */
	public void unsetNominalP() {
		nominalP = NOMINAL_P_EDEFAULT;
		nominalPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal P</em>' attribute is set.
	 * @see #unsetNominalP()
	 * @see #getNominalP()
	 * @see #setNominalP(float)
	 * @generated
	 */
	public boolean isSetNominalP() {
		return nominalPESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Response Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Response Rate</em>' attribute.
	 * @see #isSetControlResponseRate()
	 * @see #unsetControlResponseRate()
	 * @see #setControlResponseRate(float)
	 * @generated
	 */
	public float getControlResponseRate() {
		return controlResponseRate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Response Rate</em>' attribute.
	 * @see #isSetControlResponseRate()
	 * @see #unsetControlResponseRate()
	 * @see #getControlResponseRate()
	 * @generated
	 */
	public void setControlResponseRate(float newControlResponseRate) {
		controlResponseRate = newControlResponseRate;
		controlResponseRateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlResponseRate()
	 * @see #getControlResponseRate()
	 * @see #setControlResponseRate(float)
	 * @generated
	 */
	public void unsetControlResponseRate() {
		controlResponseRate = CONTROL_RESPONSE_RATE_EDEFAULT;
		controlResponseRateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Response Rate</em>' attribute is set.
	 * @see #unsetControlResponseRate()
	 * @see #getControlResponseRate()
	 * @see #setControlResponseRate(float)
	 * @generated
	 */
	public boolean isSetControlResponseRate() {
		return controlResponseRateESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit
	 * @generated
	 */
	public EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit == null) {
			controlAreaGeneratingUnit = new BasicInternalEList<ControlAreaGeneratingUnit>(ControlAreaGeneratingUnit.class);
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machines</em>' reference list.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getGeneratingUnit
	 * @generated
	 */
	public EList<SynchronousMachine> getSynchronousMachines() {
		if (synchronousMachines == null) {
			synchronousMachines = new BasicInternalEList<SynchronousMachine>(SynchronousMachine.class);
		}
		return synchronousMachines;
	}

	/**
	 * Returns the value of the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Gross Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Gross Max P</em>' attribute.
	 * @see #isSetRatedGrossMaxP()
	 * @see #unsetRatedGrossMaxP()
	 * @see #setRatedGrossMaxP(float)
	 * @generated
	 */
	public float getRatedGrossMaxP() {
		return ratedGrossMaxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Gross Max P</em>' attribute.
	 * @see #isSetRatedGrossMaxP()
	 * @see #unsetRatedGrossMaxP()
	 * @see #getRatedGrossMaxP()
	 * @generated
	 */
	public void setRatedGrossMaxP(float newRatedGrossMaxP) {
		ratedGrossMaxP = newRatedGrossMaxP;
		ratedGrossMaxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedGrossMaxP()
	 * @see #getRatedGrossMaxP()
	 * @see #setRatedGrossMaxP(float)
	 * @generated
	 */
	public void unsetRatedGrossMaxP() {
		ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;
		ratedGrossMaxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Gross Max P</em>' attribute is set.
	 * @see #unsetRatedGrossMaxP()
	 * @see #getRatedGrossMaxP()
	 * @see #setRatedGrossMaxP(float)
	 * @generated
	 */
	public boolean isSetRatedGrossMaxP() {
		return ratedGrossMaxPESet;
	}

	/**
	 * Returns the value of the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty Factor</em>' attribute.
	 * @see #isSetPenaltyFactor()
	 * @see #unsetPenaltyFactor()
	 * @see #setPenaltyFactor(float)
	 * @generated
	 */
	public float getPenaltyFactor() {
		return penaltyFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Factor</em>' attribute.
	 * @see #isSetPenaltyFactor()
	 * @see #unsetPenaltyFactor()
	 * @see #getPenaltyFactor()
	 * @generated
	 */
	public void setPenaltyFactor(float newPenaltyFactor) {
		penaltyFactor = newPenaltyFactor;
		penaltyFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPenaltyFactor()
	 * @see #getPenaltyFactor()
	 * @see #setPenaltyFactor(float)
	 * @generated
	 */
	public void unsetPenaltyFactor() {
		penaltyFactor = PENALTY_FACTOR_EDEFAULT;
		penaltyFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Penalty Factor</em>' attribute is set.
	 * @see #unsetPenaltyFactor()
	 * @see #getPenaltyFactor()
	 * @see #setPenaltyFactor(float)
	 * @generated
	 */
	public boolean isSetPenaltyFactor() {
		return penaltyFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fast Start Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fast Start Flag</em>' attribute.
	 * @see #isSetFastStartFlag()
	 * @see #unsetFastStartFlag()
	 * @see #setFastStartFlag(boolean)
	 * @generated
	 */
	public boolean isFastStartFlag() {
		return fastStartFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fast Start Flag</em>' attribute.
	 * @see #isSetFastStartFlag()
	 * @see #unsetFastStartFlag()
	 * @see #isFastStartFlag()
	 * @generated
	 */
	public void setFastStartFlag(boolean newFastStartFlag) {
		fastStartFlag = newFastStartFlag;
		fastStartFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFastStartFlag()
	 * @see #isFastStartFlag()
	 * @see #setFastStartFlag(boolean)
	 * @generated
	 */
	public void unsetFastStartFlag() {
		fastStartFlag = FAST_START_FLAG_EDEFAULT;
		fastStartFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fast Start Flag</em>' attribute is set.
	 * @see #unsetFastStartFlag()
	 * @see #isFastStartFlag()
	 * @see #setFastStartFlag(boolean)
	 * @generated
	 */
	public boolean isSetFastStartFlag() {
		return fastStartFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Off Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Off Time</em>' attribute.
	 * @see #isSetMinimumOffTime()
	 * @see #unsetMinimumOffTime()
	 * @see #setMinimumOffTime(float)
	 * @generated
	 */
	public float getMinimumOffTime() {
		return minimumOffTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Off Time</em>' attribute.
	 * @see #isSetMinimumOffTime()
	 * @see #unsetMinimumOffTime()
	 * @see #getMinimumOffTime()
	 * @generated
	 */
	public void setMinimumOffTime(float newMinimumOffTime) {
		minimumOffTime = newMinimumOffTime;
		minimumOffTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumOffTime()
	 * @see #getMinimumOffTime()
	 * @see #setMinimumOffTime(float)
	 * @generated
	 */
	public void unsetMinimumOffTime() {
		minimumOffTime = MINIMUM_OFF_TIME_EDEFAULT;
		minimumOffTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Off Time</em>' attribute is set.
	 * @see #unsetMinimumOffTime()
	 * @see #getMinimumOffTime()
	 * @see #setMinimumOffTime(float)
	 * @generated
	 */
	public boolean isSetMinimumOffTime() {
		return minimumOffTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short PF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short PF</em>' attribute.
	 * @see #isSetShortPF()
	 * @see #unsetShortPF()
	 * @see #setShortPF(float)
	 * @generated
	 */
	public float getShortPF() {
		return shortPF;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short PF</em>' attribute.
	 * @see #isSetShortPF()
	 * @see #unsetShortPF()
	 * @see #getShortPF()
	 * @generated
	 */
	public void setShortPF(float newShortPF) {
		shortPF = newShortPF;
		shortPFESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShortPF()
	 * @see #getShortPF()
	 * @see #setShortPF(float)
	 * @generated
	 */
	public void unsetShortPF() {
		shortPF = SHORT_PF_EDEFAULT;
		shortPFESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Short PF</em>' attribute is set.
	 * @see #unsetShortPF()
	 * @see #getShortPF()
	 * @see #setShortPF(float)
	 * @generated
	 */
	public boolean isSetShortPF() {
		return shortPFESet;
	}

	/**
	 * Returns the value of the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governor MPL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governor MPL</em>' attribute.
	 * @see #isSetGovernorMPL()
	 * @see #unsetGovernorMPL()
	 * @see #setGovernorMPL(float)
	 * @generated
	 */
	public float getGovernorMPL() {
		return governorMPL;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governor MPL</em>' attribute.
	 * @see #isSetGovernorMPL()
	 * @see #unsetGovernorMPL()
	 * @see #getGovernorMPL()
	 * @generated
	 */
	public void setGovernorMPL(float newGovernorMPL) {
		governorMPL = newGovernorMPL;
		governorMPLESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGovernorMPL()
	 * @see #getGovernorMPL()
	 * @see #setGovernorMPL(float)
	 * @generated
	 */
	public void unsetGovernorMPL() {
		governorMPL = GOVERNOR_MPL_EDEFAULT;
		governorMPLESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Governor MPL</em>' attribute is set.
	 * @see #unsetGovernorMPL()
	 * @see #getGovernorMPL()
	 * @see #setGovernorMPL(float)
	 * @generated
	 */
	public boolean isSetGovernorMPL() {
		return governorMPLESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Min P</em>' attribute.
	 * @see #isSetEnergyMinP()
	 * @see #unsetEnergyMinP()
	 * @see #setEnergyMinP(float)
	 * @generated
	 */
	public float getEnergyMinP() {
		return energyMinP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Min P</em>' attribute.
	 * @see #isSetEnergyMinP()
	 * @see #unsetEnergyMinP()
	 * @see #getEnergyMinP()
	 * @generated
	 */
	public void setEnergyMinP(float newEnergyMinP) {
		energyMinP = newEnergyMinP;
		energyMinPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyMinP()
	 * @see #getEnergyMinP()
	 * @see #setEnergyMinP(float)
	 * @generated
	 */
	public void unsetEnergyMinP() {
		energyMinP = ENERGY_MIN_P_EDEFAULT;
		energyMinPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Min P</em>' attribute is set.
	 * @see #unsetEnergyMinP()
	 * @see #getEnergyMinP()
	 * @see #setEnergyMinP(float)
	 * @generated
	 */
	public boolean isSetEnergyMinP() {
		return energyMinPESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Priority</em>' attribute.
	 * @see #isSetFuelPriority()
	 * @see #unsetFuelPriority()
	 * @see #setFuelPriority(int)
	 * @generated
	 */
	public int getFuelPriority() {
		return fuelPriority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Priority</em>' attribute.
	 * @see #isSetFuelPriority()
	 * @see #unsetFuelPriority()
	 * @see #getFuelPriority()
	 * @generated
	 */
	public void setFuelPriority(int newFuelPriority) {
		fuelPriority = newFuelPriority;
		fuelPriorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelPriority()
	 * @see #getFuelPriority()
	 * @see #setFuelPriority(int)
	 * @generated
	 */
	public void unsetFuelPriority() {
		fuelPriority = FUEL_PRIORITY_EDEFAULT;
		fuelPriorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Priority</em>' attribute is set.
	 * @see #unsetFuelPriority()
	 * @see #getFuelPriority()
	 * @see #setFuelPriority(int)
	 * @generated
	 */
	public boolean isSetFuelPriority() {
		return fuelPriorityESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Economic P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Economic P</em>' attribute.
	 * @see #isSetMaxEconomicP()
	 * @see #unsetMaxEconomicP()
	 * @see #setMaxEconomicP(float)
	 * @generated
	 */
	public float getMaxEconomicP() {
		return maxEconomicP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Economic P</em>' attribute.
	 * @see #isSetMaxEconomicP()
	 * @see #unsetMaxEconomicP()
	 * @see #getMaxEconomicP()
	 * @generated
	 */
	public void setMaxEconomicP(float newMaxEconomicP) {
		maxEconomicP = newMaxEconomicP;
		maxEconomicPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxEconomicP()
	 * @see #getMaxEconomicP()
	 * @see #setMaxEconomicP(float)
	 * @generated
	 */
	public void unsetMaxEconomicP() {
		maxEconomicP = MAX_ECONOMIC_P_EDEFAULT;
		maxEconomicPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Economic P</em>' attribute is set.
	 * @see #unsetMaxEconomicP()
	 * @see #getMaxEconomicP()
	 * @see #setMaxEconomicP(float)
	 * @generated
	 */
	public boolean isSetMaxEconomicP() {
		return maxEconomicPESet;
	}

	/**
	 * Returns the value of the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Cntrl Margin P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Cntrl Margin P</em>' attribute.
	 * @see #isSetAutoCntrlMarginP()
	 * @see #unsetAutoCntrlMarginP()
	 * @see #setAutoCntrlMarginP(float)
	 * @generated
	 */
	public float getAutoCntrlMarginP() {
		return autoCntrlMarginP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Cntrl Margin P</em>' attribute.
	 * @see #isSetAutoCntrlMarginP()
	 * @see #unsetAutoCntrlMarginP()
	 * @see #getAutoCntrlMarginP()
	 * @generated
	 */
	public void setAutoCntrlMarginP(float newAutoCntrlMarginP) {
		autoCntrlMarginP = newAutoCntrlMarginP;
		autoCntrlMarginPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoCntrlMarginP()
	 * @see #getAutoCntrlMarginP()
	 * @see #setAutoCntrlMarginP(float)
	 * @generated
	 */
	public void unsetAutoCntrlMarginP() {
		autoCntrlMarginP = AUTO_CNTRL_MARGIN_P_EDEFAULT;
		autoCntrlMarginPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Cntrl Margin P</em>' attribute is set.
	 * @see #unsetAutoCntrlMarginP()
	 * @see #getAutoCntrlMarginP()
	 * @see #setAutoCntrlMarginP(float)
	 * @generated
	 */
	public boolean isSetAutoCntrlMarginP() {
		return autoCntrlMarginPESet;
	}

	/**
	 * Returns the value of the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Control Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Control Limit</em>' attribute.
	 * @see #isSetHighControlLimit()
	 * @see #unsetHighControlLimit()
	 * @see #setHighControlLimit(float)
	 * @generated
	 */
	public float getHighControlLimit() {
		return highControlLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Control Limit</em>' attribute.
	 * @see #isSetHighControlLimit()
	 * @see #unsetHighControlLimit()
	 * @see #getHighControlLimit()
	 * @generated
	 */
	public void setHighControlLimit(float newHighControlLimit) {
		highControlLimit = newHighControlLimit;
		highControlLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighControlLimit()
	 * @see #getHighControlLimit()
	 * @see #setHighControlLimit(float)
	 * @generated
	 */
	public void unsetHighControlLimit() {
		highControlLimit = HIGH_CONTROL_LIMIT_EDEFAULT;
		highControlLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Control Limit</em>' attribute is set.
	 * @see #unsetHighControlLimit()
	 * @see #getHighControlLimit()
	 * @see #setHighControlLimit(float)
	 * @generated
	 */
	public boolean isSetHighControlLimit() {
		return highControlLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Detail</em>' attribute.
	 * @see #isSetModelDetail()
	 * @see #unsetModelDetail()
	 * @see #setModelDetail(BigInteger)
	 * @generated
	 */
	public BigInteger getModelDetail() {
		return modelDetail;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Detail</em>' attribute.
	 * @see #isSetModelDetail()
	 * @see #unsetModelDetail()
	 * @see #getModelDetail()
	 * @generated
	 */
	public void setModelDetail(BigInteger newModelDetail) {
		modelDetail = newModelDetail;
		modelDetailESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModelDetail()
	 * @see #getModelDetail()
	 * @see #setModelDetail(BigInteger)
	 * @generated
	 */
	public void unsetModelDetail() {
		modelDetail = MODEL_DETAIL_EDEFAULT;
		modelDetailESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model Detail</em>' attribute is set.
	 * @see #unsetModelDetail()
	 * @see #getModelDetail()
	 * @see #setModelDetail(BigInteger)
	 * @generated
	 */
	public boolean isSetModelDetail() {
		return modelDetailESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Pulse Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Pulse Low</em>' attribute.
	 * @see #isSetControlPulseLow()
	 * @see #unsetControlPulseLow()
	 * @see #setControlPulseLow(float)
	 * @generated
	 */
	public float getControlPulseLow() {
		return controlPulseLow;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Pulse Low</em>' attribute.
	 * @see #isSetControlPulseLow()
	 * @see #unsetControlPulseLow()
	 * @see #getControlPulseLow()
	 * @generated
	 */
	public void setControlPulseLow(float newControlPulseLow) {
		controlPulseLow = newControlPulseLow;
		controlPulseLowESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlPulseLow()
	 * @see #getControlPulseLow()
	 * @see #setControlPulseLow(float)
	 * @generated
	 */
	public void unsetControlPulseLow() {
		controlPulseLow = CONTROL_PULSE_LOW_EDEFAULT;
		controlPulseLowESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Pulse Low</em>' attribute is set.
	 * @see #unsetControlPulseLow()
	 * @see #getControlPulseLow()
	 * @see #setControlPulseLow(float)
	 * @generated
	 */
	public boolean isSetControlPulseLow() {
		return controlPulseLowESet;
	}

	/**
	 * Returns the value of the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise Ramp Rate</em>' attribute.
	 * @see #isSetRaiseRampRate()
	 * @see #unsetRaiseRampRate()
	 * @see #setRaiseRampRate(float)
	 * @generated
	 */
	public float getRaiseRampRate() {
		return raiseRampRate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raise Ramp Rate</em>' attribute.
	 * @see #isSetRaiseRampRate()
	 * @see #unsetRaiseRampRate()
	 * @see #getRaiseRampRate()
	 * @generated
	 */
	public void setRaiseRampRate(float newRaiseRampRate) {
		raiseRampRate = newRaiseRampRate;
		raiseRampRateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRaiseRampRate()
	 * @see #getRaiseRampRate()
	 * @see #setRaiseRampRate(float)
	 * @generated
	 */
	public void unsetRaiseRampRate() {
		raiseRampRate = RAISE_RAMP_RATE_EDEFAULT;
		raiseRampRateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raise Ramp Rate</em>' attribute is set.
	 * @see #unsetRaiseRampRate()
	 * @see #getRaiseRampRate()
	 * @see #setRaiseRampRate(float)
	 * @generated
	 */
	public boolean isSetRaiseRampRate() {
		return raiseRampRateESet;
	}

	/**
	 * Returns the value of the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Unit Op Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Unit Op Schedule</em>' reference.
	 * @see #setGenUnitOpSchedule(GenUnitOpSchedule)
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit
	 * @generated
	 */
	public GenUnitOpSchedule getGenUnitOpSchedule() {
		if (genUnitOpSchedule != null && genUnitOpSchedule.eIsProxy()) {
			InternalEObject oldGenUnitOpSchedule = (InternalEObject)genUnitOpSchedule;
			genUnitOpSchedule = (GenUnitOpSchedule)eResolveProxy(oldGenUnitOpSchedule);
			if (genUnitOpSchedule != oldGenUnitOpSchedule) {
			}
		}
		return genUnitOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenUnitOpSchedule basicGetGenUnitOpSchedule() {
		return genUnitOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenUnitOpSchedule(GenUnitOpSchedule newGenUnitOpSchedule, NotificationChain msgs) {
		GenUnitOpSchedule oldGenUnitOpSchedule = genUnitOpSchedule;
		genUnitOpSchedule = newGenUnitOpSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Unit Op Schedule</em>' reference.
	 * @see #getGenUnitOpSchedule()
	 * @generated
	 */
	public void setGenUnitOpSchedule(GenUnitOpSchedule newGenUnitOpSchedule) {
		if (newGenUnitOpSchedule != genUnitOpSchedule) {
			NotificationChain msgs = null;
			if (genUnitOpSchedule != null)
				msgs = ((InternalEObject)genUnitOpSchedule).eInverseRemove(this, ProductionPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs);
			if (newGenUnitOpSchedule != null)
				msgs = ((InternalEObject)newGenUnitOpSchedule).eInverseAdd(this, ProductionPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs);
			msgs = basicSetGenUnitOpSchedule(newGenUnitOpSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Deadband</em>' attribute.
	 * @see #isSetControlDeadband()
	 * @see #unsetControlDeadband()
	 * @see #setControlDeadband(float)
	 * @generated
	 */
	public float getControlDeadband() {
		return controlDeadband;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Deadband</em>' attribute.
	 * @see #isSetControlDeadband()
	 * @see #unsetControlDeadband()
	 * @see #getControlDeadband()
	 * @generated
	 */
	public void setControlDeadband(float newControlDeadband) {
		controlDeadband = newControlDeadband;
		controlDeadbandESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlDeadband()
	 * @see #getControlDeadband()
	 * @see #setControlDeadband(float)
	 * @generated
	 */
	public void unsetControlDeadband() {
		controlDeadband = CONTROL_DEADBAND_EDEFAULT;
		controlDeadbandESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Deadband</em>' attribute is set.
	 * @see #unsetControlDeadband()
	 * @see #getControlDeadband()
	 * @see #setControlDeadband(float)
	 * @generated
	 */
	public boolean isSetControlDeadband() {
		return controlDeadbandESet;
	}

	/**
	 * Returns the value of the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base P</em>' attribute.
	 * @see #isSetBaseP()
	 * @see #unsetBaseP()
	 * @see #setBaseP(float)
	 * @generated
	 */
	public float getBaseP() {
		return baseP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base P</em>' attribute.
	 * @see #isSetBaseP()
	 * @see #unsetBaseP()
	 * @see #getBaseP()
	 * @generated
	 */
	public void setBaseP(float newBaseP) {
		baseP = newBaseP;
		basePESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseP()
	 * @see #getBaseP()
	 * @see #setBaseP(float)
	 * @generated
	 */
	public void unsetBaseP() {
		baseP = BASE_P_EDEFAULT;
		basePESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base P</em>' attribute is set.
	 * @see #unsetBaseP()
	 * @see #getBaseP()
	 * @see #setBaseP(float)
	 * @generated
	 */
	public boolean isSetBaseP() {
		return basePESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Cost</em>' attribute.
	 * @see #isSetVariableCost()
	 * @see #unsetVariableCost()
	 * @see #setVariableCost(float)
	 * @generated
	 */
	public float getVariableCost() {
		return variableCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Cost</em>' attribute.
	 * @see #isSetVariableCost()
	 * @see #unsetVariableCost()
	 * @see #getVariableCost()
	 * @generated
	 */
	public void setVariableCost(float newVariableCost) {
		variableCost = newVariableCost;
		variableCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariableCost()
	 * @see #getVariableCost()
	 * @see #setVariableCost(float)
	 * @generated
	 */
	public void unsetVariableCost() {
		variableCost = VARIABLE_COST_EDEFAULT;
		variableCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variable Cost</em>' attribute is set.
	 * @see #unsetVariableCost()
	 * @see #getVariableCost()
	 * @see #setVariableCost(float)
	 * @generated
	 */
	public boolean isSetVariableCost() {
		return variableCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.GeneratorOperatingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Operating Mode</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @see #isSetGenOperatingMode()
	 * @see #unsetGenOperatingMode()
	 * @see #setGenOperatingMode(GeneratorOperatingMode)
	 * @generated
	 */
	public GeneratorOperatingMode getGenOperatingMode() {
		return genOperatingMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Operating Mode</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @see #isSetGenOperatingMode()
	 * @see #unsetGenOperatingMode()
	 * @see #getGenOperatingMode()
	 * @generated
	 */
	public void setGenOperatingMode(GeneratorOperatingMode newGenOperatingMode) {
		genOperatingMode = newGenOperatingMode == null ? GEN_OPERATING_MODE_EDEFAULT : newGenOperatingMode;
		genOperatingModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenOperatingMode()
	 * @see #getGenOperatingMode()
	 * @see #setGenOperatingMode(GeneratorOperatingMode)
	 * @generated
	 */
	public void unsetGenOperatingMode() {
		genOperatingMode = GEN_OPERATING_MODE_EDEFAULT;
		genOperatingModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gen Operating Mode</em>' attribute is set.
	 * @see #unsetGenOperatingMode()
	 * @see #getGenOperatingMode()
	 * @see #setGenOperatingMode(GeneratorOperatingMode)
	 * @generated
	 */
	public boolean isSetGenOperatingMode() {
		return genOperatingModeESet;
	}

	/**
	 * Returns the value of the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Ramp Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Ramp Rate</em>' attribute.
	 * @see #isSetLowerRampRate()
	 * @see #unsetLowerRampRate()
	 * @see #setLowerRampRate(float)
	 * @generated
	 */
	public float getLowerRampRate() {
		return lowerRampRate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Ramp Rate</em>' attribute.
	 * @see #isSetLowerRampRate()
	 * @see #unsetLowerRampRate()
	 * @see #getLowerRampRate()
	 * @generated
	 */
	public void setLowerRampRate(float newLowerRampRate) {
		lowerRampRate = newLowerRampRate;
		lowerRampRateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerRampRate()
	 * @see #getLowerRampRate()
	 * @see #setLowerRampRate(float)
	 * @generated
	 */
	public void unsetLowerRampRate() {
		lowerRampRate = LOWER_RAMP_RATE_EDEFAULT;
		lowerRampRateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Ramp Rate</em>' attribute is set.
	 * @see #unsetLowerRampRate()
	 * @see #getLowerRampRate()
	 * @see #setLowerRampRate(float)
	 * @generated
	 */
	public boolean isSetLowerRampRate() {
		return lowerRampRateESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Operating P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Operating P</em>' attribute.
	 * @see #isSetMinOperatingP()
	 * @see #unsetMinOperatingP()
	 * @see #setMinOperatingP(float)
	 * @generated
	 */
	public float getMinOperatingP() {
		return minOperatingP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Operating P</em>' attribute.
	 * @see #isSetMinOperatingP()
	 * @see #unsetMinOperatingP()
	 * @see #getMinOperatingP()
	 * @generated
	 */
	public void setMinOperatingP(float newMinOperatingP) {
		minOperatingP = newMinOperatingP;
		minOperatingPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinOperatingP()
	 * @see #getMinOperatingP()
	 * @see #setMinOperatingP(float)
	 * @generated
	 */
	public void unsetMinOperatingP() {
		minOperatingP = MIN_OPERATING_P_EDEFAULT;
		minOperatingPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Operating P</em>' attribute is set.
	 * @see #unsetMinOperatingP()
	 * @see #getMinOperatingP()
	 * @see #setMinOperatingP(float)
	 * @generated
	 */
	public boolean isSetMinOperatingP() {
		return minOperatingPESet;
	}

	/**
	 * Returns the value of the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Control Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Control Limit</em>' attribute.
	 * @see #isSetLowControlLimit()
	 * @see #unsetLowControlLimit()
	 * @see #setLowControlLimit(float)
	 * @generated
	 */
	public float getLowControlLimit() {
		return lowControlLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Control Limit</em>' attribute.
	 * @see #isSetLowControlLimit()
	 * @see #unsetLowControlLimit()
	 * @see #getLowControlLimit()
	 * @generated
	 */
	public void setLowControlLimit(float newLowControlLimit) {
		lowControlLimit = newLowControlLimit;
		lowControlLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowControlLimit()
	 * @see #getLowControlLimit()
	 * @see #setLowControlLimit(float)
	 * @generated
	 */
	public void unsetLowControlLimit() {
		lowControlLimit = LOW_CONTROL_LIMIT_EDEFAULT;
		lowControlLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Control Limit</em>' attribute is set.
	 * @see #unsetLowControlLimit()
	 * @see #getLowControlLimit()
	 * @see #setLowControlLimit(float)
	 * @generated
	 */
	public boolean isSetLowControlLimit() {
		return lowControlLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross To Net Active Power Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross To Net Active Power Curves</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit
	 * @generated
	 */
	public EList<GrossToNetActivePowerCurve> getGrossToNetActivePowerCurves() {
		if (grossToNetActivePowerCurves == null) {
			grossToNetActivePowerCurves = new BasicInternalEList<GrossToNetActivePowerCurve>(GrossToNetActivePowerCurve.class);
		}
		return grossToNetActivePowerCurves;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Allowable Spinning Reserve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
	 * @see #isSetMaximumAllowableSpinningReserve()
	 * @see #unsetMaximumAllowableSpinningReserve()
	 * @see #setMaximumAllowableSpinningReserve(float)
	 * @generated
	 */
	public float getMaximumAllowableSpinningReserve() {
		return maximumAllowableSpinningReserve;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
	 * @see #isSetMaximumAllowableSpinningReserve()
	 * @see #unsetMaximumAllowableSpinningReserve()
	 * @see #getMaximumAllowableSpinningReserve()
	 * @generated
	 */
	public void setMaximumAllowableSpinningReserve(float newMaximumAllowableSpinningReserve) {
		maximumAllowableSpinningReserve = newMaximumAllowableSpinningReserve;
		maximumAllowableSpinningReserveESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumAllowableSpinningReserve()
	 * @see #getMaximumAllowableSpinningReserve()
	 * @see #setMaximumAllowableSpinningReserve(float)
	 * @generated
	 */
	public void unsetMaximumAllowableSpinningReserve() {
		maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;
		maximumAllowableSpinningReserveESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute is set.
	 * @see #unsetMaximumAllowableSpinningReserve()
	 * @see #getMaximumAllowableSpinningReserve()
	 * @see #setMaximumAllowableSpinningReserve(float)
	 * @generated
	 */
	public boolean isSetMaximumAllowableSpinningReserve() {
		return maximumAllowableSpinningReserveESet;
	}

	/**
	 * Returns the value of the '<em><b>Gen Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.GeneratorControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlMode
	 * @see #isSetGenControlMode()
	 * @see #unsetGenControlMode()
	 * @see #setGenControlMode(GeneratorControlMode)
	 * @generated
	 */
	public GeneratorControlMode getGenControlMode() {
		return genControlMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlMode
	 * @see #isSetGenControlMode()
	 * @see #unsetGenControlMode()
	 * @see #getGenControlMode()
	 * @generated
	 */
	public void setGenControlMode(GeneratorControlMode newGenControlMode) {
		genControlMode = newGenControlMode == null ? GEN_CONTROL_MODE_EDEFAULT : newGenControlMode;
		genControlModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenControlMode()
	 * @see #getGenControlMode()
	 * @see #setGenControlMode(GeneratorControlMode)
	 * @generated
	 */
	public void unsetGenControlMode() {
		genControlMode = GEN_CONTROL_MODE_EDEFAULT;
		genControlModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gen Control Mode</em>' attribute is set.
	 * @see #unsetGenControlMode()
	 * @see #getGenControlMode()
	 * @see #setGenControlMode(GeneratorControlMode)
	 * @generated
	 */
	public boolean isSetGenControlMode() {
		return genControlModeESet;
	}

	/**
	 * Returns the value of the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Unit Op Cost Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Unit Op Cost Curves</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit
	 * @generated
	 */
	public EList<GenUnitOpCostCurve> getGenUnitOpCostCurves() {
		if (genUnitOpCostCurves == null) {
			genUnitOpCostCurves = new BasicInternalEList<GenUnitOpCostCurve>(GenUnitOpCostCurve.class);
		}
		return genUnitOpCostCurves;
	}

	/**
	 * Returns the value of the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governor SCD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governor SCD</em>' attribute.
	 * @see #isSetGovernorSCD()
	 * @see #unsetGovernorSCD()
	 * @see #setGovernorSCD(float)
	 * @generated
	 */
	public float getGovernorSCD() {
		return governorSCD;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governor SCD</em>' attribute.
	 * @see #isSetGovernorSCD()
	 * @see #unsetGovernorSCD()
	 * @see #getGovernorSCD()
	 * @generated
	 */
	public void setGovernorSCD(float newGovernorSCD) {
		governorSCD = newGovernorSCD;
		governorSCDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGovernorSCD()
	 * @see #getGovernorSCD()
	 * @see #setGovernorSCD(float)
	 * @generated
	 */
	public void unsetGovernorSCD() {
		governorSCD = GOVERNOR_SCD_EDEFAULT;
		governorSCDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Governor SCD</em>' attribute is set.
	 * @see #unsetGovernorSCD()
	 * @see #getGovernorSCD()
	 * @see #setGovernorSCD(float)
	 * @generated
	 */
	public boolean isSetGovernorSCD() {
		return governorSCDESet;
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
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlAreaGeneratingUnit()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronousMachines()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				if (genUnitOpSchedule != null)
					msgs = ((InternalEObject)genUnitOpSchedule).eInverseRemove(this, ProductionPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs);
				return basicSetGenUnitOpSchedule((GenUnitOpSchedule)otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGrossToNetActivePowerCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenUnitOpCostCurves()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<?>)getControlAreaGeneratingUnit()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getSynchronousMachines()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				return basicSetGenUnitOpSchedule(null, msgs);
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return ((InternalEList<?>)getGrossToNetActivePowerCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return ((InternalEList<?>)getGenUnitOpCostCurves()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				return getRatedGrossMinP();
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				return getEfficiency();
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				return getStepChange();
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				return getRatedNetMaxP();
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				return getTieLinePF();
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				return isDispReserveFlag();
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				return getControlPulseHigh();
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				return getStartupTime();
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				return getMaxOperatingP();
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				return getGenControlSource();
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				return getNormalPF();
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				return getInitialP();
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				return getSpinReserveRamp();
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				return getAllocSpinResP();
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				return getMinEconomicP();
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				return getLongPF();
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				return getNominalP();
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				return getControlResponseRate();
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return getControlAreaGeneratingUnit();
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return getSynchronousMachines();
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				return getRatedGrossMaxP();
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				return getPenaltyFactor();
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				return isFastStartFlag();
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				return getMinimumOffTime();
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				return getShortPF();
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				return getGovernorMPL();
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				return getEnergyMinP();
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				return getFuelPriority();
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				return getMaxEconomicP();
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				return getAutoCntrlMarginP();
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				return getHighControlLimit();
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				return getModelDetail();
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				return getControlPulseLow();
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				return getRaiseRampRate();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				if (resolve) return getGenUnitOpSchedule();
				return basicGetGenUnitOpSchedule();
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				return getControlDeadband();
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				return getBaseP();
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				return getStartupCost();
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				return getVariableCost();
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				return getGenOperatingMode();
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				return getLowerRampRate();
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				return getMinOperatingP();
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				return getLowControlLimit();
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return getGrossToNetActivePowerCurves();
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				return getMaximumAllowableSpinningReserve();
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				return getGenControlMode();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return getGenUnitOpCostCurves();
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				return getGovernorSCD();
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
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				setRatedGrossMinP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				setEfficiency((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				setStepChange((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				setRatedNetMaxP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				setTieLinePF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				setDispReserveFlag((Boolean)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				setControlPulseHigh((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				setStartupTime((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				setMaxOperatingP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				setGenControlSource((GeneratorControlSource)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				setNormalPF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				setInitialP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				setSpinReserveRamp((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				setAllocSpinResP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				setMinEconomicP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				setLongPF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				setNominalP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				setControlResponseRate((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				getControlAreaGeneratingUnit().addAll((Collection<? extends ControlAreaGeneratingUnit>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				getSynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				setRatedGrossMaxP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				setPenaltyFactor((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				setFastStartFlag((Boolean)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				setMinimumOffTime((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				setShortPF((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				setGovernorMPL((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				setEnergyMinP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				setFuelPriority((Integer)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				setMaxEconomicP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				setAutoCntrlMarginP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				setHighControlLimit((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				setModelDetail((BigInteger)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				setControlPulseLow((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				setRaiseRampRate((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				setGenUnitOpSchedule((GenUnitOpSchedule)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				setControlDeadband((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				setBaseP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				setStartupCost((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				setVariableCost((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				setGenOperatingMode((GeneratorOperatingMode)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				setLowerRampRate((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				setMinOperatingP((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				setLowControlLimit((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				getGrossToNetActivePowerCurves().clear();
				getGrossToNetActivePowerCurves().addAll((Collection<? extends GrossToNetActivePowerCurve>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				setMaximumAllowableSpinningReserve((Float)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				setGenControlMode((GeneratorControlMode)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				getGenUnitOpCostCurves().clear();
				getGenUnitOpCostCurves().addAll((Collection<? extends GenUnitOpCostCurve>)newValue);
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				setGovernorSCD((Float)newValue);
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
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				unsetRatedGrossMinP();
				return;
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				unsetEfficiency();
				return;
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				unsetStepChange();
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				unsetRatedNetMaxP();
				return;
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				unsetTieLinePF();
				return;
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				unsetDispReserveFlag();
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				unsetControlPulseHigh();
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				unsetStartupTime();
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				unsetMaxOperatingP();
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				unsetGenControlSource();
				return;
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				unsetNormalPF();
				return;
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				unsetInitialP();
				return;
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				unsetSpinReserveRamp();
				return;
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				unsetAllocSpinResP();
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				unsetMinEconomicP();
				return;
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				unsetLongPF();
				return;
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				unsetNominalP();
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				unsetControlResponseRate();
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				unsetRatedGrossMaxP();
				return;
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				unsetPenaltyFactor();
				return;
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				unsetFastStartFlag();
				return;
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				unsetMinimumOffTime();
				return;
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				unsetShortPF();
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				unsetGovernorMPL();
				return;
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				unsetEnergyMinP();
				return;
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				unsetFuelPriority();
				return;
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				unsetMaxEconomicP();
				return;
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				unsetAutoCntrlMarginP();
				return;
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				unsetHighControlLimit();
				return;
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				unsetModelDetail();
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				unsetControlPulseLow();
				return;
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				unsetRaiseRampRate();
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				setGenUnitOpSchedule((GenUnitOpSchedule)null);
				return;
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				unsetControlDeadband();
				return;
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				unsetBaseP();
				return;
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				unsetStartupCost();
				return;
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				unsetVariableCost();
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				unsetGenOperatingMode();
				return;
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				unsetLowerRampRate();
				return;
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				unsetMinOperatingP();
				return;
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				unsetLowControlLimit();
				return;
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				getGrossToNetActivePowerCurves().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				unsetMaximumAllowableSpinningReserve();
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				unsetGenControlMode();
				return;
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				getGenUnitOpCostCurves().clear();
				return;
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				unsetGovernorSCD();
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
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
				return isSetRatedGrossMinP();
			case ProductionPackage.GENERATING_UNIT__EFFICIENCY:
				return isSetEfficiency();
			case ProductionPackage.GENERATING_UNIT__STEP_CHANGE:
				return isSetStepChange();
			case ProductionPackage.GENERATING_UNIT__RATED_NET_MAX_P:
				return isSetRatedNetMaxP();
			case ProductionPackage.GENERATING_UNIT__TIE_LINE_PF:
				return isSetTieLinePF();
			case ProductionPackage.GENERATING_UNIT__DISP_RESERVE_FLAG:
				return isSetDispReserveFlag();
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
				return isSetControlPulseHigh();
			case ProductionPackage.GENERATING_UNIT__STARTUP_TIME:
				return isSetStartupTime();
			case ProductionPackage.GENERATING_UNIT__MAX_OPERATING_P:
				return isSetMaxOperatingP();
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
				return isSetGenControlSource();
			case ProductionPackage.GENERATING_UNIT__NORMAL_PF:
				return isSetNormalPF();
			case ProductionPackage.GENERATING_UNIT__INITIAL_P:
				return isSetInitialP();
			case ProductionPackage.GENERATING_UNIT__SPIN_RESERVE_RAMP:
				return isSetSpinReserveRamp();
			case ProductionPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
				return isSetAllocSpinResP();
			case ProductionPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
				return isSetMinEconomicP();
			case ProductionPackage.GENERATING_UNIT__LONG_PF:
				return isSetLongPF();
			case ProductionPackage.GENERATING_UNIT__NOMINAL_P:
				return isSetNominalP();
			case ProductionPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
				return isSetControlResponseRate();
			case ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null && !controlAreaGeneratingUnit.isEmpty();
			case ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES:
				return synchronousMachines != null && !synchronousMachines.isEmpty();
			case ProductionPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
				return isSetRatedGrossMaxP();
			case ProductionPackage.GENERATING_UNIT__PENALTY_FACTOR:
				return isSetPenaltyFactor();
			case ProductionPackage.GENERATING_UNIT__FAST_START_FLAG:
				return isSetFastStartFlag();
			case ProductionPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
				return isSetMinimumOffTime();
			case ProductionPackage.GENERATING_UNIT__SHORT_PF:
				return isSetShortPF();
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_MPL:
				return isSetGovernorMPL();
			case ProductionPackage.GENERATING_UNIT__ENERGY_MIN_P:
				return isSetEnergyMinP();
			case ProductionPackage.GENERATING_UNIT__FUEL_PRIORITY:
				return isSetFuelPriority();
			case ProductionPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
				return isSetMaxEconomicP();
			case ProductionPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
				return isSetAutoCntrlMarginP();
			case ProductionPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
				return isSetHighControlLimit();
			case ProductionPackage.GENERATING_UNIT__MODEL_DETAIL:
				return isSetModelDetail();
			case ProductionPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
				return isSetControlPulseLow();
			case ProductionPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
				return isSetRaiseRampRate();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
				return genUnitOpSchedule != null;
			case ProductionPackage.GENERATING_UNIT__CONTROL_DEADBAND:
				return isSetControlDeadband();
			case ProductionPackage.GENERATING_UNIT__BASE_P:
				return isSetBaseP();
			case ProductionPackage.GENERATING_UNIT__STARTUP_COST:
				return isSetStartupCost();
			case ProductionPackage.GENERATING_UNIT__VARIABLE_COST:
				return isSetVariableCost();
			case ProductionPackage.GENERATING_UNIT__GEN_OPERATING_MODE:
				return isSetGenOperatingMode();
			case ProductionPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
				return isSetLowerRampRate();
			case ProductionPackage.GENERATING_UNIT__MIN_OPERATING_P:
				return isSetMinOperatingP();
			case ProductionPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
				return isSetLowControlLimit();
			case ProductionPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
				return grossToNetActivePowerCurves != null && !grossToNetActivePowerCurves.isEmpty();
			case ProductionPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
				return isSetMaximumAllowableSpinningReserve();
			case ProductionPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
				return isSetGenControlMode();
			case ProductionPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
				return genUnitOpCostCurves != null && !genUnitOpCostCurves.isEmpty();
			case ProductionPackage.GENERATING_UNIT__GOVERNOR_SCD:
				return isSetGovernorSCD();
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
		result.append(" (ratedGrossMinP: ");
		if (ratedGrossMinPESet) result.append(ratedGrossMinP); else result.append("<unset>");
		result.append(", efficiency: ");
		if (efficiencyESet) result.append(efficiency); else result.append("<unset>");
		result.append(", stepChange: ");
		if (stepChangeESet) result.append(stepChange); else result.append("<unset>");
		result.append(", ratedNetMaxP: ");
		if (ratedNetMaxPESet) result.append(ratedNetMaxP); else result.append("<unset>");
		result.append(", tieLinePF: ");
		if (tieLinePFESet) result.append(tieLinePF); else result.append("<unset>");
		result.append(", dispReserveFlag: ");
		if (dispReserveFlagESet) result.append(dispReserveFlag); else result.append("<unset>");
		result.append(", controlPulseHigh: ");
		if (controlPulseHighESet) result.append(controlPulseHigh); else result.append("<unset>");
		result.append(", startupTime: ");
		if (startupTimeESet) result.append(startupTime); else result.append("<unset>");
		result.append(", maxOperatingP: ");
		if (maxOperatingPESet) result.append(maxOperatingP); else result.append("<unset>");
		result.append(", genControlSource: ");
		if (genControlSourceESet) result.append(genControlSource); else result.append("<unset>");
		result.append(", normalPF: ");
		if (normalPFESet) result.append(normalPF); else result.append("<unset>");
		result.append(", initialP: ");
		if (initialPESet) result.append(initialP); else result.append("<unset>");
		result.append(", spinReserveRamp: ");
		if (spinReserveRampESet) result.append(spinReserveRamp); else result.append("<unset>");
		result.append(", allocSpinResP: ");
		if (allocSpinResPESet) result.append(allocSpinResP); else result.append("<unset>");
		result.append(", minEconomicP: ");
		if (minEconomicPESet) result.append(minEconomicP); else result.append("<unset>");
		result.append(", longPF: ");
		if (longPFESet) result.append(longPF); else result.append("<unset>");
		result.append(", nominalP: ");
		if (nominalPESet) result.append(nominalP); else result.append("<unset>");
		result.append(", controlResponseRate: ");
		if (controlResponseRateESet) result.append(controlResponseRate); else result.append("<unset>");
		result.append(", ratedGrossMaxP: ");
		if (ratedGrossMaxPESet) result.append(ratedGrossMaxP); else result.append("<unset>");
		result.append(", penaltyFactor: ");
		if (penaltyFactorESet) result.append(penaltyFactor); else result.append("<unset>");
		result.append(", fastStartFlag: ");
		if (fastStartFlagESet) result.append(fastStartFlag); else result.append("<unset>");
		result.append(", minimumOffTime: ");
		if (minimumOffTimeESet) result.append(minimumOffTime); else result.append("<unset>");
		result.append(", shortPF: ");
		if (shortPFESet) result.append(shortPF); else result.append("<unset>");
		result.append(", governorMPL: ");
		if (governorMPLESet) result.append(governorMPL); else result.append("<unset>");
		result.append(", energyMinP: ");
		if (energyMinPESet) result.append(energyMinP); else result.append("<unset>");
		result.append(", fuelPriority: ");
		if (fuelPriorityESet) result.append(fuelPriority); else result.append("<unset>");
		result.append(", maxEconomicP: ");
		if (maxEconomicPESet) result.append(maxEconomicP); else result.append("<unset>");
		result.append(", autoCntrlMarginP: ");
		if (autoCntrlMarginPESet) result.append(autoCntrlMarginP); else result.append("<unset>");
		result.append(", highControlLimit: ");
		if (highControlLimitESet) result.append(highControlLimit); else result.append("<unset>");
		result.append(", modelDetail: ");
		if (modelDetailESet) result.append(modelDetail); else result.append("<unset>");
		result.append(", controlPulseLow: ");
		if (controlPulseLowESet) result.append(controlPulseLow); else result.append("<unset>");
		result.append(", raiseRampRate: ");
		if (raiseRampRateESet) result.append(raiseRampRate); else result.append("<unset>");
		result.append(", controlDeadband: ");
		if (controlDeadbandESet) result.append(controlDeadband); else result.append("<unset>");
		result.append(", baseP: ");
		if (basePESet) result.append(baseP); else result.append("<unset>");
		result.append(", startupCost: ");
		if (startupCostESet) result.append(startupCost); else result.append("<unset>");
		result.append(", variableCost: ");
		if (variableCostESet) result.append(variableCost); else result.append("<unset>");
		result.append(", genOperatingMode: ");
		if (genOperatingModeESet) result.append(genOperatingMode); else result.append("<unset>");
		result.append(", lowerRampRate: ");
		if (lowerRampRateESet) result.append(lowerRampRate); else result.append("<unset>");
		result.append(", minOperatingP: ");
		if (minOperatingPESet) result.append(minOperatingP); else result.append("<unset>");
		result.append(", lowControlLimit: ");
		if (lowControlLimitESet) result.append(lowControlLimit); else result.append("<unset>");
		result.append(", maximumAllowableSpinningReserve: ");
		if (maximumAllowableSpinningReserveESet) result.append(maximumAllowableSpinningReserve); else result.append("<unset>");
		result.append(", genControlMode: ");
		if (genControlModeESet) result.append(genControlMode); else result.append("<unset>");
		result.append(", governorSCD: ");
		if (governorSCDESet) result.append(governorSCD); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GeneratingUnit
