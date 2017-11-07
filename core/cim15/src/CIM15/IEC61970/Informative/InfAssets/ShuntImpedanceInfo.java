/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Core.PhaseCode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Impedance Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuntImpedanceInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getMaxSwitchOperationCount() <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSwitchOperationCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SWITCH_OPERATION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSwitchOperationCount() <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSwitchOperationCount()
	 * @generated
	 * @ordered
	 */
	protected int maxSwitchOperationCount = MAX_SWITCH_OPERATION_COUNT_EDEFAULT;

	/**
	 * This is true if the Max Switch Operation Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxSwitchOperationCountESet;

	/**
	 * The default value of the '{@link #getLocalControlKind() <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalControlKind()
	 * @generated
	 * @ordered
	 */
	protected static final ShuntImpedanceLocalControlKind LOCAL_CONTROL_KIND_EDEFAULT = ShuntImpedanceLocalControlKind.NONE;

	/**
	 * The cached value of the '{@link #getLocalControlKind() <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalControlKind()
	 * @generated
	 * @ordered
	 */
	protected ShuntImpedanceLocalControlKind localControlKind = LOCAL_CONTROL_KIND_EDEFAULT;

	/**
	 * This is true if the Local Control Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localControlKindESet;

	/**
	 * The default value of the '{@link #getSwitchOperationCycle() <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOperationCycle()
	 * @generated
	 * @ordered
	 */
	protected static final float SWITCH_OPERATION_CYCLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSwitchOperationCycle() <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOperationCycle()
	 * @generated
	 * @ordered
	 */
	protected float switchOperationCycle = SWITCH_OPERATION_CYCLE_EDEFAULT;

	/**
	 * This is true if the Switch Operation Cycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchOperationCycleESet;

	/**
	 * The default value of the '{@link #isVRegLineLine() <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVRegLineLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VREG_LINE_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVRegLineLine() <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVRegLineLine()
	 * @generated
	 * @ordered
	 */
	protected boolean vRegLineLine = VREG_LINE_LINE_EDEFAULT;

	/**
	 * This is true if the VReg Line Line attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vRegLineLineESet;

	/**
	 * The default value of the '{@link #getHighVoltageOverride() <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_VOLTAGE_OVERRIDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighVoltageOverride() <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected float highVoltageOverride = HIGH_VOLTAGE_OVERRIDE_EDEFAULT;

	/**
	 * This is true if the High Voltage Override attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highVoltageOverrideESet;

	/**
	 * The default value of the '{@link #getLowVoltageOverride() <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_VOLTAGE_OVERRIDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowVoltageOverride() <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageOverride()
	 * @generated
	 * @ordered
	 */
	protected float lowVoltageOverride = LOW_VOLTAGE_OVERRIDE_EDEFAULT;

	/**
	 * This is true if the Low Voltage Override attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowVoltageOverrideESet;

	/**
	 * The default value of the '{@link #getRegBranch() <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegBranch() <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranch()
	 * @generated
	 * @ordered
	 */
	protected String regBranch = REG_BRANCH_EDEFAULT;

	/**
	 * This is true if the Reg Branch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regBranchESet;

	/**
	 * The default value of the '{@link #getCellSize() <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSize()
	 * @generated
	 * @ordered
	 */
	protected static final float CELL_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCellSize() <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSize()
	 * @generated
	 * @ordered
	 */
	protected float cellSize = CELL_SIZE_EDEFAULT;

	/**
	 * This is true if the Cell Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cellSizeESet;

	/**
	 * The default value of the '{@link #getLocalOnLevel() <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOnLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ON_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOnLevel() <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOnLevel()
	 * @generated
	 * @ordered
	 */
	protected String localOnLevel = LOCAL_ON_LEVEL_EDEFAULT;

	/**
	 * This is true if the Local On Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localOnLevelESet;

	/**
	 * The default value of the '{@link #getRegBranchKind() <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchKind()
	 * @generated
	 * @ordered
	 */
	protected static final RegulationBranchKind REG_BRANCH_KIND_EDEFAULT = RegulationBranchKind.RECLOSER;

	/**
	 * The cached value of the '{@link #getRegBranchKind() <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchKind()
	 * @generated
	 * @ordered
	 */
	protected RegulationBranchKind regBranchKind = REG_BRANCH_KIND_EDEFAULT;

	/**
	 * This is true if the Reg Branch Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regBranchKindESet;

	/**
	 * The default value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMAL_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpen = NORMAL_OPEN_EDEFAULT;

	/**
	 * This is true if the Normal Open attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpenESet;

	/**
	 * The default value of the '{@link #getControlKind() <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlKind()
	 * @generated
	 * @ordered
	 */
	protected static final ShuntImpedanceControlKind CONTROL_KIND_EDEFAULT = ShuntImpedanceControlKind.REMOTE_ONLY;

	/**
	 * The cached value of the '{@link #getControlKind() <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlKind()
	 * @generated
	 * @ordered
	 */
	protected ShuntImpedanceControlKind controlKind = CONTROL_KIND_EDEFAULT;

	/**
	 * This is true if the Control Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controlKindESet;

	/**
	 * The cached value of the '{@link #getShuntCompensatorInfos() <em>Shunt Compensator Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntCompensatorInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ShuntCompensatorInfo> shuntCompensatorInfos;

	/**
	 * The default value of the '{@link #getRegBranchEnd() <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int REG_BRANCH_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegBranchEnd() <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegBranchEnd()
	 * @generated
	 * @ordered
	 */
	protected int regBranchEnd = REG_BRANCH_END_EDEFAULT;

	/**
	 * This is true if the Reg Branch End attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regBranchEndESet;

	/**
	 * The default value of the '{@link #getBranchDirect() <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchDirect()
	 * @generated
	 * @ordered
	 */
	protected static final int BRANCH_DIRECT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBranchDirect() <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchDirect()
	 * @generated
	 * @ordered
	 */
	protected int branchDirect = BRANCH_DIRECT_EDEFAULT;

	/**
	 * This is true if the Branch Direct attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean branchDirectESet;

	/**
	 * The default value of the '{@link #getLocalOffLevel() <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_OFF_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOffLevel() <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffLevel()
	 * @generated
	 * @ordered
	 */
	protected String localOffLevel = LOCAL_OFF_LEVEL_EDEFAULT;

	/**
	 * This is true if the Local Off Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localOffLevelESet;

	/**
	 * The default value of the '{@link #getSensingPhaseCode() <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode SENSING_PHASE_CODE_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getSensingPhaseCode() <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode sensingPhaseCode = SENSING_PHASE_CODE_EDEFAULT;

	/**
	 * This is true if the Sensing Phase Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensingPhaseCodeESet;

	/**
	 * The default value of the '{@link #isLocalOverride() <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalOverride()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_OVERRIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalOverride() <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalOverride()
	 * @generated
	 * @ordered
	 */
	protected boolean localOverride = LOCAL_OVERRIDE_EDEFAULT;

	/**
	 * This is true if the Local Override attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localOverrideESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntImpedanceInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getShuntImpedanceInfo();
	}

	/**
	 * Returns the value of the '<em><b>Max Switch Operation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Switch Operation Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Switch Operation Count</em>' attribute.
	 * @see #isSetMaxSwitchOperationCount()
	 * @see #unsetMaxSwitchOperationCount()
	 * @see #setMaxSwitchOperationCount(int)
	 * @generated
	 */
	public int getMaxSwitchOperationCount() {
		return maxSwitchOperationCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Switch Operation Count</em>' attribute.
	 * @see #isSetMaxSwitchOperationCount()
	 * @see #unsetMaxSwitchOperationCount()
	 * @see #getMaxSwitchOperationCount()
	 * @generated
	 */
	public void setMaxSwitchOperationCount(int newMaxSwitchOperationCount) {
		maxSwitchOperationCount = newMaxSwitchOperationCount;
		maxSwitchOperationCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxSwitchOperationCount()
	 * @see #getMaxSwitchOperationCount()
	 * @see #setMaxSwitchOperationCount(int)
	 * @generated
	 */
	public void unsetMaxSwitchOperationCount() {
		maxSwitchOperationCount = MAX_SWITCH_OPERATION_COUNT_EDEFAULT;
		maxSwitchOperationCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Switch Operation Count</em>' attribute is set.
	 * @see #unsetMaxSwitchOperationCount()
	 * @see #getMaxSwitchOperationCount()
	 * @see #setMaxSwitchOperationCount(int)
	 * @generated
	 */
	public boolean isSetMaxSwitchOperationCount() {
		return maxSwitchOperationCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Local Control Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Control Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Control Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @see #isSetLocalControlKind()
	 * @see #unsetLocalControlKind()
	 * @see #setLocalControlKind(ShuntImpedanceLocalControlKind)
	 * @generated
	 */
	public ShuntImpedanceLocalControlKind getLocalControlKind() {
		return localControlKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Control Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @see #isSetLocalControlKind()
	 * @see #unsetLocalControlKind()
	 * @see #getLocalControlKind()
	 * @generated
	 */
	public void setLocalControlKind(ShuntImpedanceLocalControlKind newLocalControlKind) {
		localControlKind = newLocalControlKind == null ? LOCAL_CONTROL_KIND_EDEFAULT : newLocalControlKind;
		localControlKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalControlKind()
	 * @see #getLocalControlKind()
	 * @see #setLocalControlKind(ShuntImpedanceLocalControlKind)
	 * @generated
	 */
	public void unsetLocalControlKind() {
		localControlKind = LOCAL_CONTROL_KIND_EDEFAULT;
		localControlKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Control Kind</em>' attribute is set.
	 * @see #unsetLocalControlKind()
	 * @see #getLocalControlKind()
	 * @see #setLocalControlKind(ShuntImpedanceLocalControlKind)
	 * @generated
	 */
	public boolean isSetLocalControlKind() {
		return localControlKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Switch Operation Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Operation Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Operation Cycle</em>' attribute.
	 * @see #isSetSwitchOperationCycle()
	 * @see #unsetSwitchOperationCycle()
	 * @see #setSwitchOperationCycle(float)
	 * @generated
	 */
	public float getSwitchOperationCycle() {
		return switchOperationCycle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Operation Cycle</em>' attribute.
	 * @see #isSetSwitchOperationCycle()
	 * @see #unsetSwitchOperationCycle()
	 * @see #getSwitchOperationCycle()
	 * @generated
	 */
	public void setSwitchOperationCycle(float newSwitchOperationCycle) {
		switchOperationCycle = newSwitchOperationCycle;
		switchOperationCycleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchOperationCycle()
	 * @see #getSwitchOperationCycle()
	 * @see #setSwitchOperationCycle(float)
	 * @generated
	 */
	public void unsetSwitchOperationCycle() {
		switchOperationCycle = SWITCH_OPERATION_CYCLE_EDEFAULT;
		switchOperationCycleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch Operation Cycle</em>' attribute is set.
	 * @see #unsetSwitchOperationCycle()
	 * @see #getSwitchOperationCycle()
	 * @see #setSwitchOperationCycle(float)
	 * @generated
	 */
	public boolean isSetSwitchOperationCycle() {
		return switchOperationCycleESet;
	}

	/**
	 * Returns the value of the '<em><b>VReg Line Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VReg Line Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VReg Line Line</em>' attribute.
	 * @see #isSetVRegLineLine()
	 * @see #unsetVRegLineLine()
	 * @see #setVRegLineLine(boolean)
	 * @generated
	 */
	public boolean isVRegLineLine() {
		return vRegLineLine;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VReg Line Line</em>' attribute.
	 * @see #isSetVRegLineLine()
	 * @see #unsetVRegLineLine()
	 * @see #isVRegLineLine()
	 * @generated
	 */
	public void setVRegLineLine(boolean newVRegLineLine) {
		vRegLineLine = newVRegLineLine;
		vRegLineLineESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVRegLineLine()
	 * @see #isVRegLineLine()
	 * @see #setVRegLineLine(boolean)
	 * @generated
	 */
	public void unsetVRegLineLine() {
		vRegLineLine = VREG_LINE_LINE_EDEFAULT;
		vRegLineLineESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>VReg Line Line</em>' attribute is set.
	 * @see #unsetVRegLineLine()
	 * @see #isVRegLineLine()
	 * @see #setVRegLineLine(boolean)
	 * @generated
	 */
	public boolean isSetVRegLineLine() {
		return vRegLineLineESet;
	}

	/**
	 * Returns the value of the '<em><b>High Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Voltage Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Voltage Override</em>' attribute.
	 * @see #isSetHighVoltageOverride()
	 * @see #unsetHighVoltageOverride()
	 * @see #setHighVoltageOverride(float)
	 * @generated
	 */
	public float getHighVoltageOverride() {
		return highVoltageOverride;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Voltage Override</em>' attribute.
	 * @see #isSetHighVoltageOverride()
	 * @see #unsetHighVoltageOverride()
	 * @see #getHighVoltageOverride()
	 * @generated
	 */
	public void setHighVoltageOverride(float newHighVoltageOverride) {
		highVoltageOverride = newHighVoltageOverride;
		highVoltageOverrideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighVoltageOverride()
	 * @see #getHighVoltageOverride()
	 * @see #setHighVoltageOverride(float)
	 * @generated
	 */
	public void unsetHighVoltageOverride() {
		highVoltageOverride = HIGH_VOLTAGE_OVERRIDE_EDEFAULT;
		highVoltageOverrideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Voltage Override</em>' attribute is set.
	 * @see #unsetHighVoltageOverride()
	 * @see #getHighVoltageOverride()
	 * @see #setHighVoltageOverride(float)
	 * @generated
	 */
	public boolean isSetHighVoltageOverride() {
		return highVoltageOverrideESet;
	}

	/**
	 * Returns the value of the '<em><b>Low Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Voltage Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Voltage Override</em>' attribute.
	 * @see #isSetLowVoltageOverride()
	 * @see #unsetLowVoltageOverride()
	 * @see #setLowVoltageOverride(float)
	 * @generated
	 */
	public float getLowVoltageOverride() {
		return lowVoltageOverride;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Voltage Override</em>' attribute.
	 * @see #isSetLowVoltageOverride()
	 * @see #unsetLowVoltageOverride()
	 * @see #getLowVoltageOverride()
	 * @generated
	 */
	public void setLowVoltageOverride(float newLowVoltageOverride) {
		lowVoltageOverride = newLowVoltageOverride;
		lowVoltageOverrideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowVoltageOverride()
	 * @see #getLowVoltageOverride()
	 * @see #setLowVoltageOverride(float)
	 * @generated
	 */
	public void unsetLowVoltageOverride() {
		lowVoltageOverride = LOW_VOLTAGE_OVERRIDE_EDEFAULT;
		lowVoltageOverrideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Voltage Override</em>' attribute is set.
	 * @see #unsetLowVoltageOverride()
	 * @see #getLowVoltageOverride()
	 * @see #setLowVoltageOverride(float)
	 * @generated
	 */
	public boolean isSetLowVoltageOverride() {
		return lowVoltageOverrideESet;
	}

	/**
	 * Returns the value of the '<em><b>Reg Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Branch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Branch</em>' attribute.
	 * @see #isSetRegBranch()
	 * @see #unsetRegBranch()
	 * @see #setRegBranch(String)
	 * @generated
	 */
	public String getRegBranch() {
		return regBranch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Branch</em>' attribute.
	 * @see #isSetRegBranch()
	 * @see #unsetRegBranch()
	 * @see #getRegBranch()
	 * @generated
	 */
	public void setRegBranch(String newRegBranch) {
		regBranch = newRegBranch;
		regBranchESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegBranch()
	 * @see #getRegBranch()
	 * @see #setRegBranch(String)
	 * @generated
	 */
	public void unsetRegBranch() {
		regBranch = REG_BRANCH_EDEFAULT;
		regBranchESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reg Branch</em>' attribute is set.
	 * @see #unsetRegBranch()
	 * @see #getRegBranch()
	 * @see #setRegBranch(String)
	 * @generated
	 */
	public boolean isSetRegBranch() {
		return regBranchESet;
	}

	/**
	 * Returns the value of the '<em><b>Cell Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Size</em>' attribute.
	 * @see #isSetCellSize()
	 * @see #unsetCellSize()
	 * @see #setCellSize(float)
	 * @generated
	 */
	public float getCellSize() {
		return cellSize;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Size</em>' attribute.
	 * @see #isSetCellSize()
	 * @see #unsetCellSize()
	 * @see #getCellSize()
	 * @generated
	 */
	public void setCellSize(float newCellSize) {
		cellSize = newCellSize;
		cellSizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCellSize()
	 * @see #getCellSize()
	 * @see #setCellSize(float)
	 * @generated
	 */
	public void unsetCellSize() {
		cellSize = CELL_SIZE_EDEFAULT;
		cellSizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cell Size</em>' attribute is set.
	 * @see #unsetCellSize()
	 * @see #getCellSize()
	 * @see #setCellSize(float)
	 * @generated
	 */
	public boolean isSetCellSize() {
		return cellSizeESet;
	}

	/**
	 * Returns the value of the '<em><b>Local On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local On Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local On Level</em>' attribute.
	 * @see #isSetLocalOnLevel()
	 * @see #unsetLocalOnLevel()
	 * @see #setLocalOnLevel(String)
	 * @generated
	 */
	public String getLocalOnLevel() {
		return localOnLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local On Level</em>' attribute.
	 * @see #isSetLocalOnLevel()
	 * @see #unsetLocalOnLevel()
	 * @see #getLocalOnLevel()
	 * @generated
	 */
	public void setLocalOnLevel(String newLocalOnLevel) {
		localOnLevel = newLocalOnLevel;
		localOnLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalOnLevel()
	 * @see #getLocalOnLevel()
	 * @see #setLocalOnLevel(String)
	 * @generated
	 */
	public void unsetLocalOnLevel() {
		localOnLevel = LOCAL_ON_LEVEL_EDEFAULT;
		localOnLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local On Level</em>' attribute is set.
	 * @see #unsetLocalOnLevel()
	 * @see #getLocalOnLevel()
	 * @see #setLocalOnLevel(String)
	 * @generated
	 */
	public boolean isSetLocalOnLevel() {
		return localOnLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Reg Branch Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Branch Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Branch Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @see #isSetRegBranchKind()
	 * @see #unsetRegBranchKind()
	 * @see #setRegBranchKind(RegulationBranchKind)
	 * @generated
	 */
	public RegulationBranchKind getRegBranchKind() {
		return regBranchKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Branch Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @see #isSetRegBranchKind()
	 * @see #unsetRegBranchKind()
	 * @see #getRegBranchKind()
	 * @generated
	 */
	public void setRegBranchKind(RegulationBranchKind newRegBranchKind) {
		regBranchKind = newRegBranchKind == null ? REG_BRANCH_KIND_EDEFAULT : newRegBranchKind;
		regBranchKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegBranchKind()
	 * @see #getRegBranchKind()
	 * @see #setRegBranchKind(RegulationBranchKind)
	 * @generated
	 */
	public void unsetRegBranchKind() {
		regBranchKind = REG_BRANCH_KIND_EDEFAULT;
		regBranchKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reg Branch Kind</em>' attribute is set.
	 * @see #unsetRegBranchKind()
	 * @see #getRegBranchKind()
	 * @see #setRegBranchKind(RegulationBranchKind)
	 * @generated
	 */
	public boolean isSetRegBranchKind() {
		return regBranchKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Open</em>' attribute.
	 * @see #isSetNormalOpen()
	 * @see #unsetNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public boolean isNormalOpen() {
		return normalOpen;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Open</em>' attribute.
	 * @see #isSetNormalOpen()
	 * @see #unsetNormalOpen()
	 * @see #isNormalOpen()
	 * @generated
	 */
	public void setNormalOpen(boolean newNormalOpen) {
		normalOpen = newNormalOpen;
		normalOpenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalOpen()
	 * @see #isNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public void unsetNormalOpen() {
		normalOpen = NORMAL_OPEN_EDEFAULT;
		normalOpenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Open</em>' attribute is set.
	 * @see #unsetNormalOpen()
	 * @see #isNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public boolean isSetNormalOpen() {
		return normalOpenESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @see #isSetControlKind()
	 * @see #unsetControlKind()
	 * @see #setControlKind(ShuntImpedanceControlKind)
	 * @generated
	 */
	public ShuntImpedanceControlKind getControlKind() {
		return controlKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @see #isSetControlKind()
	 * @see #unsetControlKind()
	 * @see #getControlKind()
	 * @generated
	 */
	public void setControlKind(ShuntImpedanceControlKind newControlKind) {
		controlKind = newControlKind == null ? CONTROL_KIND_EDEFAULT : newControlKind;
		controlKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlKind()
	 * @see #getControlKind()
	 * @see #setControlKind(ShuntImpedanceControlKind)
	 * @generated
	 */
	public void unsetControlKind() {
		controlKind = CONTROL_KIND_EDEFAULT;
		controlKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Kind</em>' attribute is set.
	 * @see #unsetControlKind()
	 * @see #getControlKind()
	 * @see #setControlKind(ShuntImpedanceControlKind)
	 * @generated
	 */
	public boolean isSetControlKind() {
		return controlKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Shunt Compensator Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Compensator Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Compensator Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo
	 * @generated
	 */
	public EList<ShuntCompensatorInfo> getShuntCompensatorInfos() {
		if (shuntCompensatorInfos == null) {
			shuntCompensatorInfos = new BasicInternalEList<ShuntCompensatorInfo>(ShuntCompensatorInfo.class);
		}
		return shuntCompensatorInfos;
	}

	/**
	 * Returns the value of the '<em><b>Reg Branch End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Branch End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Branch End</em>' attribute.
	 * @see #isSetRegBranchEnd()
	 * @see #unsetRegBranchEnd()
	 * @see #setRegBranchEnd(int)
	 * @generated
	 */
	public int getRegBranchEnd() {
		return regBranchEnd;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Branch End</em>' attribute.
	 * @see #isSetRegBranchEnd()
	 * @see #unsetRegBranchEnd()
	 * @see #getRegBranchEnd()
	 * @generated
	 */
	public void setRegBranchEnd(int newRegBranchEnd) {
		regBranchEnd = newRegBranchEnd;
		regBranchEndESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegBranchEnd()
	 * @see #getRegBranchEnd()
	 * @see #setRegBranchEnd(int)
	 * @generated
	 */
	public void unsetRegBranchEnd() {
		regBranchEnd = REG_BRANCH_END_EDEFAULT;
		regBranchEndESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reg Branch End</em>' attribute is set.
	 * @see #unsetRegBranchEnd()
	 * @see #getRegBranchEnd()
	 * @see #setRegBranchEnd(int)
	 * @generated
	 */
	public boolean isSetRegBranchEnd() {
		return regBranchEndESet;
	}

	/**
	 * Returns the value of the '<em><b>Branch Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Direct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Direct</em>' attribute.
	 * @see #isSetBranchDirect()
	 * @see #unsetBranchDirect()
	 * @see #setBranchDirect(int)
	 * @generated
	 */
	public int getBranchDirect() {
		return branchDirect;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Direct</em>' attribute.
	 * @see #isSetBranchDirect()
	 * @see #unsetBranchDirect()
	 * @see #getBranchDirect()
	 * @generated
	 */
	public void setBranchDirect(int newBranchDirect) {
		branchDirect = newBranchDirect;
		branchDirectESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBranchDirect()
	 * @see #getBranchDirect()
	 * @see #setBranchDirect(int)
	 * @generated
	 */
	public void unsetBranchDirect() {
		branchDirect = BRANCH_DIRECT_EDEFAULT;
		branchDirectESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Branch Direct</em>' attribute is set.
	 * @see #unsetBranchDirect()
	 * @see #getBranchDirect()
	 * @see #setBranchDirect(int)
	 * @generated
	 */
	public boolean isSetBranchDirect() {
		return branchDirectESet;
	}

	/**
	 * Returns the value of the '<em><b>Local Off Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Off Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Off Level</em>' attribute.
	 * @see #isSetLocalOffLevel()
	 * @see #unsetLocalOffLevel()
	 * @see #setLocalOffLevel(String)
	 * @generated
	 */
	public String getLocalOffLevel() {
		return localOffLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Off Level</em>' attribute.
	 * @see #isSetLocalOffLevel()
	 * @see #unsetLocalOffLevel()
	 * @see #getLocalOffLevel()
	 * @generated
	 */
	public void setLocalOffLevel(String newLocalOffLevel) {
		localOffLevel = newLocalOffLevel;
		localOffLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalOffLevel()
	 * @see #getLocalOffLevel()
	 * @see #setLocalOffLevel(String)
	 * @generated
	 */
	public void unsetLocalOffLevel() {
		localOffLevel = LOCAL_OFF_LEVEL_EDEFAULT;
		localOffLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Off Level</em>' attribute is set.
	 * @see #unsetLocalOffLevel()
	 * @see #getLocalOffLevel()
	 * @see #setLocalOffLevel(String)
	 * @generated
	 */
	public boolean isSetLocalOffLevel() {
		return localOffLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Sensing Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensing Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensing Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetSensingPhaseCode()
	 * @see #unsetSensingPhaseCode()
	 * @see #setSensingPhaseCode(PhaseCode)
	 * @generated
	 */
	public PhaseCode getSensingPhaseCode() {
		return sensingPhaseCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetSensingPhaseCode()
	 * @see #unsetSensingPhaseCode()
	 * @see #getSensingPhaseCode()
	 * @generated
	 */
	public void setSensingPhaseCode(PhaseCode newSensingPhaseCode) {
		sensingPhaseCode = newSensingPhaseCode == null ? SENSING_PHASE_CODE_EDEFAULT : newSensingPhaseCode;
		sensingPhaseCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensingPhaseCode()
	 * @see #getSensingPhaseCode()
	 * @see #setSensingPhaseCode(PhaseCode)
	 * @generated
	 */
	public void unsetSensingPhaseCode() {
		sensingPhaseCode = SENSING_PHASE_CODE_EDEFAULT;
		sensingPhaseCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sensing Phase Code</em>' attribute is set.
	 * @see #unsetSensingPhaseCode()
	 * @see #getSensingPhaseCode()
	 * @see #setSensingPhaseCode(PhaseCode)
	 * @generated
	 */
	public boolean isSetSensingPhaseCode() {
		return sensingPhaseCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Local Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Override</em>' attribute.
	 * @see #isSetLocalOverride()
	 * @see #unsetLocalOverride()
	 * @see #setLocalOverride(boolean)
	 * @generated
	 */
	public boolean isLocalOverride() {
		return localOverride;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Override</em>' attribute.
	 * @see #isSetLocalOverride()
	 * @see #unsetLocalOverride()
	 * @see #isLocalOverride()
	 * @generated
	 */
	public void setLocalOverride(boolean newLocalOverride) {
		localOverride = newLocalOverride;
		localOverrideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalOverride()
	 * @see #isLocalOverride()
	 * @see #setLocalOverride(boolean)
	 * @generated
	 */
	public void unsetLocalOverride() {
		localOverride = LOCAL_OVERRIDE_EDEFAULT;
		localOverrideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Override</em>' attribute is set.
	 * @see #unsetLocalOverride()
	 * @see #isLocalOverride()
	 * @see #setLocalOverride(boolean)
	 * @generated
	 */
	public boolean isSetLocalOverride() {
		return localOverrideESet;
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
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShuntCompensatorInfos()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return ((InternalEList<?>)getShuntCompensatorInfos()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				return getMaxSwitchOperationCount();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				return getLocalControlKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				return getSwitchOperationCycle();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				return isVRegLineLine();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				return getHighVoltageOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				return getLowVoltageOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				return getRegBranch();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				return getCellSize();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				return getLocalOnLevel();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				return getRegBranchKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				return isNormalOpen();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				return getControlKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return getShuntCompensatorInfos();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				return getRegBranchEnd();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				return getBranchDirect();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				return getLocalOffLevel();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				return getSensingPhaseCode();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				return isLocalOverride();
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
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				setMaxSwitchOperationCount((Integer)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				setLocalControlKind((ShuntImpedanceLocalControlKind)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				setSwitchOperationCycle((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				setVRegLineLine((Boolean)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				setHighVoltageOverride((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				setLowVoltageOverride((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				setRegBranch((String)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				setCellSize((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				setLocalOnLevel((String)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				setRegBranchKind((RegulationBranchKind)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				setNormalOpen((Boolean)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				setControlKind((ShuntImpedanceControlKind)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				getShuntCompensatorInfos().clear();
				getShuntCompensatorInfos().addAll((Collection<? extends ShuntCompensatorInfo>)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				setRegBranchEnd((Integer)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				setBranchDirect((Integer)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				setLocalOffLevel((String)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				setSensingPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				setLocalOverride((Boolean)newValue);
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
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				unsetMaxSwitchOperationCount();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				unsetLocalControlKind();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				unsetSwitchOperationCycle();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				unsetVRegLineLine();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				unsetHighVoltageOverride();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				unsetLowVoltageOverride();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				unsetRegBranch();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				unsetCellSize();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				unsetLocalOnLevel();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				unsetRegBranchKind();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				unsetNormalOpen();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				unsetControlKind();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				getShuntCompensatorInfos().clear();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				unsetRegBranchEnd();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				unsetBranchDirect();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				unsetLocalOffLevel();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				unsetSensingPhaseCode();
				return;
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				unsetLocalOverride();
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
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT:
				return isSetMaxSwitchOperationCount();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND:
				return isSetLocalControlKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE:
				return isSetSwitchOperationCycle();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE:
				return isSetVRegLineLine();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE:
				return isSetHighVoltageOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE:
				return isSetLowVoltageOverride();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH:
				return isSetRegBranch();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CELL_SIZE:
				return isSetCellSize();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL:
				return isSetLocalOnLevel();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND:
				return isSetRegBranchKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__NORMAL_OPEN:
				return isSetNormalOpen();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__CONTROL_KIND:
				return isSetControlKind();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS:
				return shuntCompensatorInfos != null && !shuntCompensatorInfos.isEmpty();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__REG_BRANCH_END:
				return isSetRegBranchEnd();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT:
				return isSetBranchDirect();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL:
				return isSetLocalOffLevel();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE:
				return isSetSensingPhaseCode();
			case InfAssetsPackage.SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE:
				return isSetLocalOverride();
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
		result.append(" (maxSwitchOperationCount: ");
		if (maxSwitchOperationCountESet) result.append(maxSwitchOperationCount); else result.append("<unset>");
		result.append(", localControlKind: ");
		if (localControlKindESet) result.append(localControlKind); else result.append("<unset>");
		result.append(", switchOperationCycle: ");
		if (switchOperationCycleESet) result.append(switchOperationCycle); else result.append("<unset>");
		result.append(", vRegLineLine: ");
		if (vRegLineLineESet) result.append(vRegLineLine); else result.append("<unset>");
		result.append(", highVoltageOverride: ");
		if (highVoltageOverrideESet) result.append(highVoltageOverride); else result.append("<unset>");
		result.append(", lowVoltageOverride: ");
		if (lowVoltageOverrideESet) result.append(lowVoltageOverride); else result.append("<unset>");
		result.append(", regBranch: ");
		if (regBranchESet) result.append(regBranch); else result.append("<unset>");
		result.append(", cellSize: ");
		if (cellSizeESet) result.append(cellSize); else result.append("<unset>");
		result.append(", localOnLevel: ");
		if (localOnLevelESet) result.append(localOnLevel); else result.append("<unset>");
		result.append(", regBranchKind: ");
		if (regBranchKindESet) result.append(regBranchKind); else result.append("<unset>");
		result.append(", normalOpen: ");
		if (normalOpenESet) result.append(normalOpen); else result.append("<unset>");
		result.append(", controlKind: ");
		if (controlKindESet) result.append(controlKind); else result.append("<unset>");
		result.append(", regBranchEnd: ");
		if (regBranchEndESet) result.append(regBranchEnd); else result.append("<unset>");
		result.append(", branchDirect: ");
		if (branchDirectESet) result.append(branchDirect); else result.append("<unset>");
		result.append(", localOffLevel: ");
		if (localOffLevelESet) result.append(localOffLevel); else result.append("<unset>");
		result.append(", sensingPhaseCode: ");
		if (sensingPhaseCodeESet) result.append(sensingPhaseCode); else result.append("<unset>");
		result.append(", localOverride: ");
		if (localOverrideESet) result.append(localOverride); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ShuntImpedanceInfo
