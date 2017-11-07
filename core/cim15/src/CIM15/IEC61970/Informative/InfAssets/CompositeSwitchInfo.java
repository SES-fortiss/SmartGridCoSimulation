/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Core.PhaseCode;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Switch Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGanged <em>Ganged</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeSwitchInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CompositeSwitchKind KIND_EDEFAULT = CompositeSwitchKind.THROW_OVER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CompositeSwitchKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * This is true if the Phase Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCodeESet;

	/**
	 * The default value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean remote = REMOTE_EDEFAULT;

	/**
	 * This is true if the Remote attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteESet;

	/**
	 * The default value of the '{@link #getSwitchStateCount() <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchStateCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCH_STATE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchStateCount() <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchStateCount()
	 * @generated
	 * @ordered
	 */
	protected int switchStateCount = SWITCH_STATE_COUNT_EDEFAULT;

	/**
	 * This is true if the Switch State Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchStateCountESet;

	/**
	 * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Rated Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedVoltageESet;

	/**
	 * The default value of the '{@link #isGanged() <em>Ganged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGanged() <em>Ganged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGanged()
	 * @generated
	 * @ordered
	 */
	protected boolean ganged = GANGED_EDEFAULT;

	/**
	 * This is true if the Ganged attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gangedESet;

	/**
	 * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseCount = PHASE_COUNT_EDEFAULT;

	/**
	 * This is true if the Phase Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCountESet;

	/**
	 * The default value of the '{@link #getInitOpMode() <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_OP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitOpMode() <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOpMode()
	 * @generated
	 * @ordered
	 */
	protected String initOpMode = INIT_OP_MODE_EDEFAULT;

	/**
	 * This is true if the Init Op Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initOpModeESet;

	/**
	 * The default value of the '{@link #getInterruptingRating() <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERRUPTING_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterruptingRating() <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingRating()
	 * @generated
	 * @ordered
	 */
	protected float interruptingRating = INTERRUPTING_RATING_EDEFAULT;

	/**
	 * This is true if the Interrupting Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interruptingRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSwitchInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getCompositeSwitchInfo();
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(CompositeSwitchKind)
	 * @generated
	 */
	public CompositeSwitchKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(CompositeSwitchKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(CompositeSwitchKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(CompositeSwitchKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		phaseCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public void unsetPhaseCode() {
		phaseCode = PHASE_CODE_EDEFAULT;
		phaseCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCode <em>Phase Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Code</em>' attribute is set.
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public boolean isSetPhaseCode() {
		return phaseCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #isSetRemote()
	 * @see #unsetRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	public boolean isRemote() {
		return remote;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isSetRemote()
	 * @see #unsetRemote()
	 * @see #isRemote()
	 * @generated
	 */
	public void setRemote(boolean newRemote) {
		remote = newRemote;
		remoteESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemote()
	 * @see #isRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	public void unsetRemote() {
		remote = REMOTE_EDEFAULT;
		remoteESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote</em>' attribute is set.
	 * @see #unsetRemote()
	 * @see #isRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	public boolean isSetRemote() {
		return remoteESet;
	}

	/**
	 * Returns the value of the '<em><b>Switch State Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch State Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch State Count</em>' attribute.
	 * @see #isSetSwitchStateCount()
	 * @see #unsetSwitchStateCount()
	 * @see #setSwitchStateCount(int)
	 * @generated
	 */
	public int getSwitchStateCount() {
		return switchStateCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch State Count</em>' attribute.
	 * @see #isSetSwitchStateCount()
	 * @see #unsetSwitchStateCount()
	 * @see #getSwitchStateCount()
	 * @generated
	 */
	public void setSwitchStateCount(int newSwitchStateCount) {
		switchStateCount = newSwitchStateCount;
		switchStateCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchStateCount()
	 * @see #getSwitchStateCount()
	 * @see #setSwitchStateCount(int)
	 * @generated
	 */
	public void unsetSwitchStateCount() {
		switchStateCount = SWITCH_STATE_COUNT_EDEFAULT;
		switchStateCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch State Count</em>' attribute is set.
	 * @see #unsetSwitchStateCount()
	 * @see #getSwitchStateCount()
	 * @see #setSwitchStateCount(int)
	 * @generated
	 */
	public boolean isSetSwitchStateCount() {
		return switchStateCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Voltage</em>' attribute.
	 * @see #isSetRatedVoltage()
	 * @see #unsetRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public float getRatedVoltage() {
		return ratedVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #isSetRatedVoltage()
	 * @see #unsetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @generated
	 */
	public void setRatedVoltage(float newRatedVoltage) {
		ratedVoltage = newRatedVoltage;
		ratedVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public void unsetRatedVoltage() {
		ratedVoltage = RATED_VOLTAGE_EDEFAULT;
		ratedVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
	 * @see #unsetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public boolean isSetRatedVoltage() {
		return ratedVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Ganged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ganged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ganged</em>' attribute.
	 * @see #isSetGanged()
	 * @see #unsetGanged()
	 * @see #setGanged(boolean)
	 * @generated
	 */
	public boolean isGanged() {
		return ganged;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGanged <em>Ganged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ganged</em>' attribute.
	 * @see #isSetGanged()
	 * @see #unsetGanged()
	 * @see #isGanged()
	 * @generated
	 */
	public void setGanged(boolean newGanged) {
		ganged = newGanged;
		gangedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGanged <em>Ganged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGanged()
	 * @see #isGanged()
	 * @see #setGanged(boolean)
	 * @generated
	 */
	public void unsetGanged() {
		ganged = GANGED_EDEFAULT;
		gangedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGanged <em>Ganged</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ganged</em>' attribute is set.
	 * @see #unsetGanged()
	 * @see #isGanged()
	 * @see #setGanged(boolean)
	 * @generated
	 */
	public boolean isSetGanged() {
		return gangedESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Count</em>' attribute.
	 * @see #isSetPhaseCount()
	 * @see #unsetPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public int getPhaseCount() {
		return phaseCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #isSetPhaseCount()
	 * @see #unsetPhaseCount()
	 * @see #getPhaseCount()
	 * @generated
	 */
	public void setPhaseCount(int newPhaseCount) {
		phaseCount = newPhaseCount;
		phaseCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCount()
	 * @see #getPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public void unsetPhaseCount() {
		phaseCount = PHASE_COUNT_EDEFAULT;
		phaseCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCount <em>Phase Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Count</em>' attribute is set.
	 * @see #unsetPhaseCount()
	 * @see #getPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public boolean isSetPhaseCount() {
		return phaseCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Init Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Op Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Op Mode</em>' attribute.
	 * @see #isSetInitOpMode()
	 * @see #unsetInitOpMode()
	 * @see #setInitOpMode(String)
	 * @generated
	 */
	public String getInitOpMode() {
		return initOpMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Op Mode</em>' attribute.
	 * @see #isSetInitOpMode()
	 * @see #unsetInitOpMode()
	 * @see #getInitOpMode()
	 * @generated
	 */
	public void setInitOpMode(String newInitOpMode) {
		initOpMode = newInitOpMode;
		initOpModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitOpMode()
	 * @see #getInitOpMode()
	 * @see #setInitOpMode(String)
	 * @generated
	 */
	public void unsetInitOpMode() {
		initOpMode = INIT_OP_MODE_EDEFAULT;
		initOpModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Init Op Mode</em>' attribute is set.
	 * @see #unsetInitOpMode()
	 * @see #getInitOpMode()
	 * @see #setInitOpMode(String)
	 * @generated
	 */
	public boolean isSetInitOpMode() {
		return initOpModeESet;
	}

	/**
	 * Returns the value of the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupting Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #isSetInterruptingRating()
	 * @see #unsetInterruptingRating()
	 * @see #setInterruptingRating(float)
	 * @generated
	 */
	public float getInterruptingRating() {
		return interruptingRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #isSetInterruptingRating()
	 * @see #unsetInterruptingRating()
	 * @see #getInterruptingRating()
	 * @generated
	 */
	public void setInterruptingRating(float newInterruptingRating) {
		interruptingRating = newInterruptingRating;
		interruptingRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterruptingRating()
	 * @see #getInterruptingRating()
	 * @see #setInterruptingRating(float)
	 * @generated
	 */
	public void unsetInterruptingRating() {
		interruptingRating = INTERRUPTING_RATING_EDEFAULT;
		interruptingRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interrupting Rating</em>' attribute is set.
	 * @see #unsetInterruptingRating()
	 * @see #getInterruptingRating()
	 * @see #setInterruptingRating(float)
	 * @generated
	 */
	public boolean isSetInterruptingRating() {
		return interruptingRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				return getKind();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_CODE:
				return getPhaseCode();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				return isRemote();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				return getSwitchStateCount();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__RATED_VOLTAGE:
				return getRatedVoltage();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANGED:
				return isGanged();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_COUNT:
				return getPhaseCount();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				return getInitOpMode();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				return getInterruptingRating();
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
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				setKind((CompositeSwitchKind)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				setRemote((Boolean)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				setSwitchStateCount((Integer)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANGED:
				setGanged((Boolean)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				setInitOpMode((String)newValue);
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				setInterruptingRating((Float)newValue);
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
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				unsetKind();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_CODE:
				unsetPhaseCode();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				unsetRemote();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				unsetSwitchStateCount();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__RATED_VOLTAGE:
				unsetRatedVoltage();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANGED:
				unsetGanged();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_COUNT:
				unsetPhaseCount();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				unsetInitOpMode();
				return;
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				unsetInterruptingRating();
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
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__KIND:
				return isSetKind();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_CODE:
				return isSetPhaseCode();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__REMOTE:
				return isSetRemote();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT:
				return isSetSwitchStateCount();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__RATED_VOLTAGE:
				return isSetRatedVoltage();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__GANGED:
				return isSetGanged();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__PHASE_COUNT:
				return isSetPhaseCount();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INIT_OP_MODE:
				return isSetInitOpMode();
			case InfAssetsPackage.COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING:
				return isSetInterruptingRating();
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", phaseCode: ");
		if (phaseCodeESet) result.append(phaseCode); else result.append("<unset>");
		result.append(", remote: ");
		if (remoteESet) result.append(remote); else result.append("<unset>");
		result.append(", switchStateCount: ");
		if (switchStateCountESet) result.append(switchStateCount); else result.append("<unset>");
		result.append(", ratedVoltage: ");
		if (ratedVoltageESet) result.append(ratedVoltage); else result.append("<unset>");
		result.append(", ganged: ");
		if (gangedESet) result.append(ganged); else result.append("<unset>");
		result.append(", phaseCount: ");
		if (phaseCountESet) result.append(phaseCount); else result.append("<unset>");
		result.append(", initOpMode: ");
		if (initOpModeESet) result.append(initOpMode); else result.append("<unset>");
		result.append(", interruptingRating: ");
		if (interruptingRatingESet) result.append(interruptingRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CompositeSwitchInfo
