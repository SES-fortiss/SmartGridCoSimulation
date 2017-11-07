/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.PhaseCode;
import CIM15.IEC61970.Core.PowerSystemResource;
import CIM15.IEC61970.Core.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulatingControl extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final RegulatingControlModeKind MODE_EDEFAULT = RegulatingControlModeKind.FIXED;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected RegulatingControlModeKind mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getTargetRange() <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRange()
	 * @generated
	 * @ordered
	 */
	protected static final float TARGET_RANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTargetRange() <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRange()
	 * @generated
	 * @ordered
	 */
	protected float targetRange = TARGET_RANGE_EDEFAULT;

	/**
	 * This is true if the Target Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetRangeESet;

	/**
	 * The cached value of the '{@link #getRegulatingCondEq() <em>Regulating Cond Eq</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingCondEq()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingCondEq> regulatingCondEq;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The default value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCRETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected boolean discrete = DISCRETE_EDEFAULT;

	/**
	 * This is true if the Discrete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discreteESet;

	/**
	 * The default value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TARGET_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected float targetValue = TARGET_VALUE_EDEFAULT;

	/**
	 * This is true if the Target Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetValueESet;

	/**
	 * The cached value of the '{@link #getRegulationSchedule() <em>Regulation Schedule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulationSchedule> regulationSchedule;

	/**
	 * The default value of the '{@link #getMonitoredPhase() <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredPhase()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode MONITORED_PHASE_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getMonitoredPhase() <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredPhase()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode monitoredPhase = MONITORED_PHASE_EDEFAULT;

	/**
	 * This is true if the Monitored Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoredPhaseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatingControl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REGULATING_CONTROL;
	}

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.RegulatingControlModeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.RegulatingControlModeKind
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(RegulatingControlModeKind)
	 * @generated
	 */
	public RegulatingControlModeKind getMode() {
		return mode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.RegulatingControlModeKind
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	public void setMode(RegulatingControlModeKind newMode) {
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		modeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(RegulatingControlModeKind)
	 * @generated
	 */
	public void unsetMode() {
		mode = MODE_EDEFAULT;
		modeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(RegulatingControlModeKind)
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * Returns the value of the '<em><b>Target Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range</em>' attribute.
	 * @see #isSetTargetRange()
	 * @see #unsetTargetRange()
	 * @see #setTargetRange(float)
	 * @generated
	 */
	public float getTargetRange() {
		return targetRange;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range</em>' attribute.
	 * @see #isSetTargetRange()
	 * @see #unsetTargetRange()
	 * @see #getTargetRange()
	 * @generated
	 */
	public void setTargetRange(float newTargetRange) {
		targetRange = newTargetRange;
		targetRangeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetRange()
	 * @see #getTargetRange()
	 * @see #setTargetRange(float)
	 * @generated
	 */
	public void unsetTargetRange() {
		targetRange = TARGET_RANGE_EDEFAULT;
		targetRangeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetRange <em>Target Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Range</em>' attribute is set.
	 * @see #unsetTargetRange()
	 * @see #getTargetRange()
	 * @see #setTargetRange(float)
	 * @generated
	 */
	public boolean isSetTargetRange() {
		return targetRangeESet;
	}

	/**
	 * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.RegulatingCondEq}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Cond Eq</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Cond Eq</em>' reference list.
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq#getRegulatingControl
	 * @generated
	 */
	public EList<RegulatingCondEq> getRegulatingCondEq() {
		if (regulatingCondEq == null) {
			regulatingCondEq = new BasicInternalEList<RegulatingCondEq>(RegulatingCondEq.class);
		}
		return regulatingCondEq;
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getRegulatingControl
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' attribute.
	 * @see #isSetDiscrete()
	 * @see #unsetDiscrete()
	 * @see #setDiscrete(boolean)
	 * @generated
	 */
	public boolean isDiscrete() {
		return discrete;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' attribute.
	 * @see #isSetDiscrete()
	 * @see #unsetDiscrete()
	 * @see #isDiscrete()
	 * @generated
	 */
	public void setDiscrete(boolean newDiscrete) {
		discrete = newDiscrete;
		discreteESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscrete()
	 * @see #isDiscrete()
	 * @see #setDiscrete(boolean)
	 * @generated
	 */
	public void unsetDiscrete() {
		discrete = DISCRETE_EDEFAULT;
		discreteESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#isDiscrete <em>Discrete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discrete</em>' attribute is set.
	 * @see #unsetDiscrete()
	 * @see #isDiscrete()
	 * @see #setDiscrete(boolean)
	 * @generated
	 */
	public boolean isSetDiscrete() {
		return discreteESet;
	}

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' attribute.
	 * @see #isSetTargetValue()
	 * @see #unsetTargetValue()
	 * @see #setTargetValue(float)
	 * @generated
	 */
	public float getTargetValue() {
		return targetValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' attribute.
	 * @see #isSetTargetValue()
	 * @see #unsetTargetValue()
	 * @see #getTargetValue()
	 * @generated
	 */
	public void setTargetValue(float newTargetValue) {
		targetValue = newTargetValue;
		targetValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetValue()
	 * @see #getTargetValue()
	 * @see #setTargetValue(float)
	 * @generated
	 */
	public void unsetTargetValue() {
		targetValue = TARGET_VALUE_EDEFAULT;
		targetValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Value</em>' attribute is set.
	 * @see #unsetTargetValue()
	 * @see #getTargetValue()
	 * @see #setTargetValue(float)
	 * @generated
	 */
	public boolean isSetTargetValue() {
		return targetValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.RegulationSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Schedule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Schedule</em>' reference list.
	 * @see CIM15.IEC61970.Wires.RegulationSchedule#getRegulatingControl
	 * @generated
	 */
	public EList<RegulationSchedule> getRegulationSchedule() {
		if (regulationSchedule == null) {
			regulationSchedule = new BasicInternalEList<RegulationSchedule>(RegulationSchedule.class);
		}
		return regulationSchedule;
	}

	/**
	 * Returns the value of the '<em><b>Monitored Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Phase</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetMonitoredPhase()
	 * @see #unsetMonitoredPhase()
	 * @see #setMonitoredPhase(PhaseCode)
	 * @generated
	 */
	public PhaseCode getMonitoredPhase() {
		return monitoredPhase;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Phase</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetMonitoredPhase()
	 * @see #unsetMonitoredPhase()
	 * @see #getMonitoredPhase()
	 * @generated
	 */
	public void setMonitoredPhase(PhaseCode newMonitoredPhase) {
		monitoredPhase = newMonitoredPhase == null ? MONITORED_PHASE_EDEFAULT : newMonitoredPhase;
		monitoredPhaseESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoredPhase()
	 * @see #getMonitoredPhase()
	 * @see #setMonitoredPhase(PhaseCode)
	 * @generated
	 */
	public void unsetMonitoredPhase() {
		monitoredPhase = MONITORED_PHASE_EDEFAULT;
		monitoredPhaseESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitored Phase</em>' attribute is set.
	 * @see #unsetMonitoredPhase()
	 * @see #getMonitoredPhase()
	 * @see #setMonitoredPhase(PhaseCode)
	 * @generated
	 */
	public boolean isSetMonitoredPhase() {
		return monitoredPhaseESet;
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
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingCondEq()).basicAdd(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__REGULATING_CONTROL, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulationSchedule()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return ((InternalEList<?>)getRegulatingCondEq()).basicRemove(otherEnd, msgs);
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				return basicSetTerminal(null, msgs);
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return ((InternalEList<?>)getRegulationSchedule()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				return getMode();
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				return getTargetRange();
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return getRegulatingCondEq();
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				return isDiscrete();
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				return getTargetValue();
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return getRegulationSchedule();
			case WiresPackage.REGULATING_CONTROL__MONITORED_PHASE:
				return getMonitoredPhase();
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				setMode((RegulatingControlModeKind)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				setTargetRange((Float)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				getRegulatingCondEq().clear();
				getRegulatingCondEq().addAll((Collection<? extends RegulatingCondEq>)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				setDiscrete((Boolean)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				setTargetValue((Float)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				getRegulationSchedule().clear();
				getRegulationSchedule().addAll((Collection<? extends RegulationSchedule>)newValue);
				return;
			case WiresPackage.REGULATING_CONTROL__MONITORED_PHASE:
				setMonitoredPhase((PhaseCode)newValue);
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				unsetMode();
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				unsetTargetRange();
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				getRegulatingCondEq().clear();
				return;
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				unsetDiscrete();
				return;
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				unsetTargetValue();
				return;
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				getRegulationSchedule().clear();
				return;
			case WiresPackage.REGULATING_CONTROL__MONITORED_PHASE:
				unsetMonitoredPhase();
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
			case WiresPackage.REGULATING_CONTROL__MODE:
				return isSetMode();
			case WiresPackage.REGULATING_CONTROL__TARGET_RANGE:
				return isSetTargetRange();
			case WiresPackage.REGULATING_CONTROL__REGULATING_COND_EQ:
				return regulatingCondEq != null && !regulatingCondEq.isEmpty();
			case WiresPackage.REGULATING_CONTROL__TERMINAL:
				return terminal != null;
			case WiresPackage.REGULATING_CONTROL__DISCRETE:
				return isSetDiscrete();
			case WiresPackage.REGULATING_CONTROL__TARGET_VALUE:
				return isSetTargetValue();
			case WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE:
				return regulationSchedule != null && !regulationSchedule.isEmpty();
			case WiresPackage.REGULATING_CONTROL__MONITORED_PHASE:
				return isSetMonitoredPhase();
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
		result.append(" (mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", targetRange: ");
		if (targetRangeESet) result.append(targetRange); else result.append("<unset>");
		result.append(", discrete: ");
		if (discreteESet) result.append(discrete); else result.append("<unset>");
		result.append(", targetValue: ");
		if (targetValueESet) result.append(targetValue); else result.append("<unset>");
		result.append(", monitoredPhase: ");
		if (monitoredPhaseESet) result.append(monitoredPhase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RegulatingControl
