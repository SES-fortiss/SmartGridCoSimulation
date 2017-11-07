/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.TapChangerInfo;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.StateVariables.StateVariablesPackage;
import CIM15.IEC61970.StateVariables.SvTapStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerInfo <em>Tap Changer Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TapChanger extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getTapChangerInfo() <em>Tap Changer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChangerInfo()
	 * @generated
	 * @ordered
	 */
	protected TapChangerInfo tapChangerInfo;

	/**
	 * The default value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralU()
	 * @generated
	 * @ordered
	 */
	protected static final float NEUTRAL_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralU()
	 * @generated
	 * @ordered
	 */
	protected float neutralU = NEUTRAL_U_EDEFAULT;

	/**
	 * This is true if the Neutral U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean neutralUESet;

	/**
	 * The default value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATION_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean regulationStatus = REGULATION_STATUS_EDEFAULT;

	/**
	 * This is true if the Regulation Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regulationStatusESet;

	/**
	 * The default value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float SUBSEQUENT_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsequentDelay()
	 * @generated
	 * @ordered
	 */
	protected float subsequentDelay = SUBSEQUENT_DELAY_EDEFAULT;

	/**
	 * This is true if the Subsequent Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subsequentDelayESet;

	/**
	 * The default value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalStep()
	 * @generated
	 * @ordered
	 */
	protected int normalStep = NORMAL_STEP_EDEFAULT;

	/**
	 * This is true if the Normal Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalStepESet;

	/**
	 * The default value of the '{@link #isLtcFlag() <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLtcFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LTC_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLtcFlag() <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLtcFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean ltcFlag = LTC_FLAG_EDEFAULT;

	/**
	 * This is true if the Ltc Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ltcFlagESet;

	/**
	 * The cached value of the '{@link #getTapSchedules() <em>Tap Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<TapSchedule> tapSchedules;

	/**
	 * The default value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected static final int LOW_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowStep()
	 * @generated
	 * @ordered
	 */
	protected int lowStep = LOW_STEP_EDEFAULT;

	/**
	 * This is true if the Low Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowStepESet;

	/**
	 * The default value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected static final int NEUTRAL_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStep()
	 * @generated
	 * @ordered
	 */
	protected int neutralStep = NEUTRAL_STEP_EDEFAULT;

	/**
	 * This is true if the Neutral Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean neutralStepESet;

	/**
	 * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected float initialDelay = INITIAL_DELAY_EDEFAULT;

	/**
	 * This is true if the Initial Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialDelayESet;

	/**
	 * The cached value of the '{@link #getTapChangerControl() <em>Tap Changer Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChangerControl()
	 * @generated
	 * @ordered
	 */
	protected TapChangerControl tapChangerControl;

	/**
	 * The default value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGH_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighStep()
	 * @generated
	 * @ordered
	 */
	protected int highStep = HIGH_STEP_EDEFAULT;

	/**
	 * This is true if the High Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highStepESet;

	/**
	 * The cached value of the '{@link #getSvTapStep() <em>Sv Tap Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvTapStep()
	 * @generated
	 * @ordered
	 */
	protected SvTapStep svTapStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChanger() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TAP_CHANGER;
	}

	/**
	 * Returns the value of the '<em><b>Tap Changer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getTapChangers <em>Tap Changers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer Info</em>' reference.
	 * @see #setTapChangerInfo(TapChangerInfo)
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getTapChangers
	 * @generated
	 */
	public TapChangerInfo getTapChangerInfo() {
		if (tapChangerInfo != null && tapChangerInfo.eIsProxy()) {
			InternalEObject oldTapChangerInfo = (InternalEObject)tapChangerInfo;
			tapChangerInfo = (TapChangerInfo)eResolveProxy(oldTapChangerInfo);
			if (tapChangerInfo != oldTapChangerInfo) {
			}
		}
		return tapChangerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerInfo basicGetTapChangerInfo() {
		return tapChangerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChangerInfo(TapChangerInfo newTapChangerInfo, NotificationChain msgs) {
		TapChangerInfo oldTapChangerInfo = tapChangerInfo;
		tapChangerInfo = newTapChangerInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerInfo <em>Tap Changer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer Info</em>' reference.
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public void setTapChangerInfo(TapChangerInfo newTapChangerInfo) {
		if (newTapChangerInfo != tapChangerInfo) {
			NotificationChain msgs = null;
			if (tapChangerInfo != null)
				msgs = ((InternalEObject)tapChangerInfo).eInverseRemove(this, AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS, TapChangerInfo.class, msgs);
			if (newTapChangerInfo != null)
				msgs = ((InternalEObject)newTapChangerInfo).eInverseAdd(this, AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS, TapChangerInfo.class, msgs);
			msgs = basicSetTapChangerInfo(newTapChangerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral U</em>' attribute.
	 * @see #isSetNeutralU()
	 * @see #unsetNeutralU()
	 * @see #setNeutralU(float)
	 * @generated
	 */
	public float getNeutralU() {
		return neutralU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral U</em>' attribute.
	 * @see #isSetNeutralU()
	 * @see #unsetNeutralU()
	 * @see #getNeutralU()
	 * @generated
	 */
	public void setNeutralU(float newNeutralU) {
		neutralU = newNeutralU;
		neutralUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeutralU()
	 * @see #getNeutralU()
	 * @see #setNeutralU(float)
	 * @generated
	 */
	public void unsetNeutralU() {
		neutralU = NEUTRAL_U_EDEFAULT;
		neutralUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralU <em>Neutral U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Neutral U</em>' attribute is set.
	 * @see #unsetNeutralU()
	 * @see #getNeutralU()
	 * @see #setNeutralU(float)
	 * @generated
	 */
	public boolean isSetNeutralU() {
		return neutralUESet;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Status</em>' attribute.
	 * @see #isSetRegulationStatus()
	 * @see #unsetRegulationStatus()
	 * @see #setRegulationStatus(boolean)
	 * @generated
	 */
	public boolean isRegulationStatus() {
		return regulationStatus;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Status</em>' attribute.
	 * @see #isSetRegulationStatus()
	 * @see #unsetRegulationStatus()
	 * @see #isRegulationStatus()
	 * @generated
	 */
	public void setRegulationStatus(boolean newRegulationStatus) {
		regulationStatus = newRegulationStatus;
		regulationStatusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegulationStatus()
	 * @see #isRegulationStatus()
	 * @see #setRegulationStatus(boolean)
	 * @generated
	 */
	public void unsetRegulationStatus() {
		regulationStatus = REGULATION_STATUS_EDEFAULT;
		regulationStatusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#isRegulationStatus <em>Regulation Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regulation Status</em>' attribute is set.
	 * @see #unsetRegulationStatus()
	 * @see #isRegulationStatus()
	 * @see #setRegulationStatus(boolean)
	 * @generated
	 */
	public boolean isSetRegulationStatus() {
		return regulationStatusESet;
	}

	/**
	 * Returns the value of the '<em><b>Subsequent Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Delay</em>' attribute.
	 * @see #isSetSubsequentDelay()
	 * @see #unsetSubsequentDelay()
	 * @see #setSubsequentDelay(float)
	 * @generated
	 */
	public float getSubsequentDelay() {
		return subsequentDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsequent Delay</em>' attribute.
	 * @see #isSetSubsequentDelay()
	 * @see #unsetSubsequentDelay()
	 * @see #getSubsequentDelay()
	 * @generated
	 */
	public void setSubsequentDelay(float newSubsequentDelay) {
		subsequentDelay = newSubsequentDelay;
		subsequentDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubsequentDelay()
	 * @see #getSubsequentDelay()
	 * @see #setSubsequentDelay(float)
	 * @generated
	 */
	public void unsetSubsequentDelay() {
		subsequentDelay = SUBSEQUENT_DELAY_EDEFAULT;
		subsequentDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getSubsequentDelay <em>Subsequent Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subsequent Delay</em>' attribute is set.
	 * @see #unsetSubsequentDelay()
	 * @see #getSubsequentDelay()
	 * @see #setSubsequentDelay(float)
	 * @generated
	 */
	public boolean isSetSubsequentDelay() {
		return subsequentDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Step</em>' attribute.
	 * @see #isSetNormalStep()
	 * @see #unsetNormalStep()
	 * @see #setNormalStep(int)
	 * @generated
	 */
	public int getNormalStep() {
		return normalStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Step</em>' attribute.
	 * @see #isSetNormalStep()
	 * @see #unsetNormalStep()
	 * @see #getNormalStep()
	 * @generated
	 */
	public void setNormalStep(int newNormalStep) {
		normalStep = newNormalStep;
		normalStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalStep()
	 * @see #getNormalStep()
	 * @see #setNormalStep(int)
	 * @generated
	 */
	public void unsetNormalStep() {
		normalStep = NORMAL_STEP_EDEFAULT;
		normalStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNormalStep <em>Normal Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Step</em>' attribute is set.
	 * @see #unsetNormalStep()
	 * @see #getNormalStep()
	 * @see #setNormalStep(int)
	 * @generated
	 */
	public boolean isSetNormalStep() {
		return normalStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Ltc Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ltc Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltc Flag</em>' attribute.
	 * @see #isSetLtcFlag()
	 * @see #unsetLtcFlag()
	 * @see #setLtcFlag(boolean)
	 * @generated
	 */
	public boolean isLtcFlag() {
		return ltcFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltc Flag</em>' attribute.
	 * @see #isSetLtcFlag()
	 * @see #unsetLtcFlag()
	 * @see #isLtcFlag()
	 * @generated
	 */
	public void setLtcFlag(boolean newLtcFlag) {
		ltcFlag = newLtcFlag;
		ltcFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLtcFlag()
	 * @see #isLtcFlag()
	 * @see #setLtcFlag(boolean)
	 * @generated
	 */
	public void unsetLtcFlag() {
		ltcFlag = LTC_FLAG_EDEFAULT;
		ltcFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#isLtcFlag <em>Ltc Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ltc Flag</em>' attribute is set.
	 * @see #unsetLtcFlag()
	 * @see #isLtcFlag()
	 * @see #setLtcFlag(boolean)
	 * @generated
	 */
	public boolean isSetLtcFlag() {
		return ltcFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Tap Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TapSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TapSchedule#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TapSchedule#getTapChanger
	 * @generated
	 */
	public EList<TapSchedule> getTapSchedules() {
		if (tapSchedules == null) {
			tapSchedules = new BasicInternalEList<TapSchedule>(TapSchedule.class);
		}
		return tapSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Step</em>' attribute.
	 * @see #isSetLowStep()
	 * @see #unsetLowStep()
	 * @see #setLowStep(int)
	 * @generated
	 */
	public int getLowStep() {
		return lowStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Step</em>' attribute.
	 * @see #isSetLowStep()
	 * @see #unsetLowStep()
	 * @see #getLowStep()
	 * @generated
	 */
	public void setLowStep(int newLowStep) {
		lowStep = newLowStep;
		lowStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowStep()
	 * @see #getLowStep()
	 * @see #setLowStep(int)
	 * @generated
	 */
	public void unsetLowStep() {
		lowStep = LOW_STEP_EDEFAULT;
		lowStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getLowStep <em>Low Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Step</em>' attribute is set.
	 * @see #unsetLowStep()
	 * @see #getLowStep()
	 * @see #setLowStep(int)
	 * @generated
	 */
	public boolean isSetLowStep() {
		return lowStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Step</em>' attribute.
	 * @see #isSetNeutralStep()
	 * @see #unsetNeutralStep()
	 * @see #setNeutralStep(int)
	 * @generated
	 */
	public int getNeutralStep() {
		return neutralStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Step</em>' attribute.
	 * @see #isSetNeutralStep()
	 * @see #unsetNeutralStep()
	 * @see #getNeutralStep()
	 * @generated
	 */
	public void setNeutralStep(int newNeutralStep) {
		neutralStep = newNeutralStep;
		neutralStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeutralStep()
	 * @see #getNeutralStep()
	 * @see #setNeutralStep(int)
	 * @generated
	 */
	public void unsetNeutralStep() {
		neutralStep = NEUTRAL_STEP_EDEFAULT;
		neutralStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getNeutralStep <em>Neutral Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Neutral Step</em>' attribute is set.
	 * @see #unsetNeutralStep()
	 * @see #getNeutralStep()
	 * @see #setNeutralStep(int)
	 * @generated
	 */
	public boolean isSetNeutralStep() {
		return neutralStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Delay</em>' attribute.
	 * @see #isSetInitialDelay()
	 * @see #unsetInitialDelay()
	 * @see #setInitialDelay(float)
	 * @generated
	 */
	public float getInitialDelay() {
		return initialDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Delay</em>' attribute.
	 * @see #isSetInitialDelay()
	 * @see #unsetInitialDelay()
	 * @see #getInitialDelay()
	 * @generated
	 */
	public void setInitialDelay(float newInitialDelay) {
		initialDelay = newInitialDelay;
		initialDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialDelay()
	 * @see #getInitialDelay()
	 * @see #setInitialDelay(float)
	 * @generated
	 */
	public void unsetInitialDelay() {
		initialDelay = INITIAL_DELAY_EDEFAULT;
		initialDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getInitialDelay <em>Initial Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Delay</em>' attribute is set.
	 * @see #unsetInitialDelay()
	 * @see #getInitialDelay()
	 * @see #setInitialDelay(float)
	 * @generated
	 */
	public boolean isSetInitialDelay() {
		return initialDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Tap Changer Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TapChangerControl#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer Control</em>' reference.
	 * @see #setTapChangerControl(TapChangerControl)
	 * @see CIM15.IEC61970.Wires.TapChangerControl#getTapChanger
	 * @generated
	 */
	public TapChangerControl getTapChangerControl() {
		if (tapChangerControl != null && tapChangerControl.eIsProxy()) {
			InternalEObject oldTapChangerControl = (InternalEObject)tapChangerControl;
			tapChangerControl = (TapChangerControl)eResolveProxy(oldTapChangerControl);
			if (tapChangerControl != oldTapChangerControl) {
			}
		}
		return tapChangerControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerControl basicGetTapChangerControl() {
		return tapChangerControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChangerControl(TapChangerControl newTapChangerControl, NotificationChain msgs) {
		TapChangerControl oldTapChangerControl = tapChangerControl;
		tapChangerControl = newTapChangerControl;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer Control</em>' reference.
	 * @see #getTapChangerControl()
	 * @generated
	 */
	public void setTapChangerControl(TapChangerControl newTapChangerControl) {
		if (newTapChangerControl != tapChangerControl) {
			NotificationChain msgs = null;
			if (tapChangerControl != null)
				msgs = ((InternalEObject)tapChangerControl).eInverseRemove(this, WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs);
			if (newTapChangerControl != null)
				msgs = ((InternalEObject)newTapChangerControl).eInverseAdd(this, WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs);
			msgs = basicSetTapChangerControl(newTapChangerControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Step</em>' attribute.
	 * @see #isSetHighStep()
	 * @see #unsetHighStep()
	 * @see #setHighStep(int)
	 * @generated
	 */
	public int getHighStep() {
		return highStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Step</em>' attribute.
	 * @see #isSetHighStep()
	 * @see #unsetHighStep()
	 * @see #getHighStep()
	 * @generated
	 */
	public void setHighStep(int newHighStep) {
		highStep = newHighStep;
		highStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighStep()
	 * @see #getHighStep()
	 * @see #setHighStep(int)
	 * @generated
	 */
	public void unsetHighStep() {
		highStep = HIGH_STEP_EDEFAULT;
		highStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getHighStep <em>High Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Step</em>' attribute is set.
	 * @see #unsetHighStep()
	 * @see #getHighStep()
	 * @see #setHighStep(int)
	 * @generated
	 */
	public boolean isSetHighStep() {
		return highStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Sv Tap Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Tap Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Tap Step</em>' reference.
	 * @see #setSvTapStep(SvTapStep)
	 * @see CIM15.IEC61970.StateVariables.SvTapStep#getTapChanger
	 * @generated
	 */
	public SvTapStep getSvTapStep() {
		if (svTapStep != null && svTapStep.eIsProxy()) {
			InternalEObject oldSvTapStep = (InternalEObject)svTapStep;
			svTapStep = (SvTapStep)eResolveProxy(oldSvTapStep);
			if (svTapStep != oldSvTapStep) {
			}
		}
		return svTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvTapStep basicGetSvTapStep() {
		return svTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvTapStep(SvTapStep newSvTapStep, NotificationChain msgs) {
		SvTapStep oldSvTapStep = svTapStep;
		svTapStep = newSvTapStep;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Tap Step</em>' reference.
	 * @see #getSvTapStep()
	 * @generated
	 */
	public void setSvTapStep(SvTapStep newSvTapStep) {
		if (newSvTapStep != svTapStep) {
			NotificationChain msgs = null;
			if (svTapStep != null)
				msgs = ((InternalEObject)svTapStep).eInverseRemove(this, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs);
			if (newSvTapStep != null)
				msgs = ((InternalEObject)newSvTapStep).eInverseAdd(this, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs);
			msgs = basicSetSvTapStep(newSvTapStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_INFO:
				if (tapChangerInfo != null)
					msgs = ((InternalEObject)tapChangerInfo).eInverseRemove(this, AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS, TapChangerInfo.class, msgs);
				return basicSetTapChangerInfo((TapChangerInfo)otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapSchedules()).basicAdd(otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
				if (tapChangerControl != null)
					msgs = ((InternalEObject)tapChangerControl).eInverseRemove(this, WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs);
				return basicSetTapChangerControl((TapChangerControl)otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				if (svTapStep != null)
					msgs = ((InternalEObject)svTapStep).eInverseRemove(this, StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs);
				return basicSetSvTapStep((SvTapStep)otherEnd, msgs);
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
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_INFO:
				return basicSetTapChangerInfo(null, msgs);
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return ((InternalEList<?>)getTapSchedules()).basicRemove(otherEnd, msgs);
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
				return basicSetTapChangerControl(null, msgs);
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				return basicSetSvTapStep(null, msgs);
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
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_INFO:
				if (resolve) return getTapChangerInfo();
				return basicGetTapChangerInfo();
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				return getNeutralU();
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				return isRegulationStatus();
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				return getSubsequentDelay();
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				return getNormalStep();
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				return isLtcFlag();
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return getTapSchedules();
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				return getLowStep();
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				return getNeutralStep();
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				return getInitialDelay();
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
				if (resolve) return getTapChangerControl();
				return basicGetTapChangerControl();
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				return getHighStep();
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				if (resolve) return getSvTapStep();
				return basicGetSvTapStep();
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
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_INFO:
				setTapChangerInfo((TapChangerInfo)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				setNeutralU((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				setRegulationStatus((Boolean)newValue);
				return;
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				setSubsequentDelay((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				setNormalStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				setLtcFlag((Boolean)newValue);
				return;
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				getTapSchedules().clear();
				getTapSchedules().addAll((Collection<? extends TapSchedule>)newValue);
				return;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				setLowStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				setNeutralStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				setInitialDelay((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
				setTapChangerControl((TapChangerControl)newValue);
				return;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				setHighStep((Integer)newValue);
				return;
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				setSvTapStep((SvTapStep)newValue);
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
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_INFO:
				setTapChangerInfo((TapChangerInfo)null);
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				unsetNeutralU();
				return;
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				unsetRegulationStatus();
				return;
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				unsetSubsequentDelay();
				return;
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				unsetNormalStep();
				return;
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				unsetLtcFlag();
				return;
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				getTapSchedules().clear();
				return;
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				unsetLowStep();
				return;
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				unsetNeutralStep();
				return;
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				unsetInitialDelay();
				return;
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
				setTapChangerControl((TapChangerControl)null);
				return;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				unsetHighStep();
				return;
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				setSvTapStep((SvTapStep)null);
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
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_INFO:
				return tapChangerInfo != null;
			case WiresPackage.TAP_CHANGER__NEUTRAL_U:
				return isSetNeutralU();
			case WiresPackage.TAP_CHANGER__REGULATION_STATUS:
				return isSetRegulationStatus();
			case WiresPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
				return isSetSubsequentDelay();
			case WiresPackage.TAP_CHANGER__NORMAL_STEP:
				return isSetNormalStep();
			case WiresPackage.TAP_CHANGER__LTC_FLAG:
				return isSetLtcFlag();
			case WiresPackage.TAP_CHANGER__TAP_SCHEDULES:
				return tapSchedules != null && !tapSchedules.isEmpty();
			case WiresPackage.TAP_CHANGER__LOW_STEP:
				return isSetLowStep();
			case WiresPackage.TAP_CHANGER__NEUTRAL_STEP:
				return isSetNeutralStep();
			case WiresPackage.TAP_CHANGER__INITIAL_DELAY:
				return isSetInitialDelay();
			case WiresPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
				return tapChangerControl != null;
			case WiresPackage.TAP_CHANGER__HIGH_STEP:
				return isSetHighStep();
			case WiresPackage.TAP_CHANGER__SV_TAP_STEP:
				return svTapStep != null;
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
		result.append(" (neutralU: ");
		if (neutralUESet) result.append(neutralU); else result.append("<unset>");
		result.append(", regulationStatus: ");
		if (regulationStatusESet) result.append(regulationStatus); else result.append("<unset>");
		result.append(", subsequentDelay: ");
		if (subsequentDelayESet) result.append(subsequentDelay); else result.append("<unset>");
		result.append(", normalStep: ");
		if (normalStepESet) result.append(normalStep); else result.append("<unset>");
		result.append(", ltcFlag: ");
		if (ltcFlagESet) result.append(ltcFlag); else result.append("<unset>");
		result.append(", lowStep: ");
		if (lowStepESet) result.append(lowStep); else result.append("<unset>");
		result.append(", neutralStep: ");
		if (neutralStepESet) result.append(neutralStep); else result.append("<unset>");
		result.append(", initialDelay: ");
		if (initialDelayESet) result.append(initialDelay); else result.append("<unset>");
		result.append(", highStep: ");
		if (highStepESet) result.append(highStep); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TapChanger
