/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Wires.TapChanger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRating <em>Ct Rating</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#isIsTcul <em>Is Tcul</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getTapChangers <em>Tap Changers</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getHighStep <em>High Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getBil <em>Bil</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TapChangerInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getCtRating() <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCtRating() <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRating()
	 * @generated
	 * @ordered
	 */
	protected float ctRating = CT_RATING_EDEFAULT;

	/**
	 * This is true if the Ct Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctRatingESet;

	/**
	 * The default value of the '{@link #getStepPhaseIncrement() <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_PHASE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepPhaseIncrement() <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepPhaseIncrement = STEP_PHASE_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Step Phase Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepPhaseIncrementESet;

	/**
	 * The default value of the '{@link #getRatedApparentPower() <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedApparentPower()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_APPARENT_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedApparentPower() <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedApparentPower()
	 * @generated
	 * @ordered
	 */
	protected float ratedApparentPower = RATED_APPARENT_POWER_EDEFAULT;

	/**
	 * This is true if the Rated Apparent Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedApparentPowerESet;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected float frequency = FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyESet;

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
	 * The default value of the '{@link #getCtRatio() <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float CT_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCtRatio() <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRatio()
	 * @generated
	 * @ordered
	 */
	protected float ctRatio = CT_RATIO_EDEFAULT;

	/**
	 * This is true if the Ct Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctRatioESet;

	/**
	 * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_VOLTAGE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Step Voltage Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepVoltageIncrementESet;

	/**
	 * The default value of the '{@link #isIsTcul() <em>Is Tcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTcul()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TCUL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTcul() <em>Is Tcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTcul()
	 * @generated
	 * @ordered
	 */
	protected boolean isTcul = IS_TCUL_EDEFAULT;

	/**
	 * This is true if the Is Tcul attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTculESet;

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
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * This is true if the Rated Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedCurrentESet;

	/**
	 * The cached value of the '{@link #getTapChangers() <em>Tap Changers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChangers()
	 * @generated
	 * @ordered
	 */
	protected EList<TapChanger> tapChangers;

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
	 * The default value of the '{@link #getPtRatio() <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float PT_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPtRatio() <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtRatio()
	 * @generated
	 * @ordered
	 */
	protected float ptRatio = PT_RATIO_EDEFAULT;

	/**
	 * This is true if the Pt Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ptRatioESet;

	/**
	 * The default value of the '{@link #getBil() <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBil()
	 * @generated
	 * @ordered
	 */
	protected static final float BIL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBil() <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBil()
	 * @generated
	 * @ordered
	 */
	protected float bil = BIL_EDEFAULT;

	/**
	 * This is true if the Bil attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bilESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChangerInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TAP_CHANGER_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Ct Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Rating</em>' attribute.
	 * @see #isSetCtRating()
	 * @see #unsetCtRating()
	 * @see #setCtRating(float)
	 * @generated
	 */
	public float getCtRating() {
		return ctRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRating <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Rating</em>' attribute.
	 * @see #isSetCtRating()
	 * @see #unsetCtRating()
	 * @see #getCtRating()
	 * @generated
	 */
	public void setCtRating(float newCtRating) {
		ctRating = newCtRating;
		ctRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRating <em>Ct Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtRating()
	 * @see #getCtRating()
	 * @see #setCtRating(float)
	 * @generated
	 */
	public void unsetCtRating() {
		ctRating = CT_RATING_EDEFAULT;
		ctRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRating <em>Ct Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ct Rating</em>' attribute is set.
	 * @see #unsetCtRating()
	 * @see #getCtRating()
	 * @see #setCtRating(float)
	 * @generated
	 */
	public boolean isSetCtRating() {
		return ctRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Step Phase Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Phase Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Phase Increment</em>' attribute.
	 * @see #isSetStepPhaseIncrement()
	 * @see #unsetStepPhaseIncrement()
	 * @see #setStepPhaseIncrement(float)
	 * @generated
	 */
	public float getStepPhaseIncrement() {
		return stepPhaseIncrement;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Phase Increment</em>' attribute.
	 * @see #isSetStepPhaseIncrement()
	 * @see #unsetStepPhaseIncrement()
	 * @see #getStepPhaseIncrement()
	 * @generated
	 */
	public void setStepPhaseIncrement(float newStepPhaseIncrement) {
		stepPhaseIncrement = newStepPhaseIncrement;
		stepPhaseIncrementESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepPhaseIncrement()
	 * @see #getStepPhaseIncrement()
	 * @see #setStepPhaseIncrement(float)
	 * @generated
	 */
	public void unsetStepPhaseIncrement() {
		stepPhaseIncrement = STEP_PHASE_INCREMENT_EDEFAULT;
		stepPhaseIncrementESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Phase Increment</em>' attribute is set.
	 * @see #unsetStepPhaseIncrement()
	 * @see #getStepPhaseIncrement()
	 * @see #setStepPhaseIncrement(float)
	 * @generated
	 */
	public boolean isSetStepPhaseIncrement() {
		return stepPhaseIncrementESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Apparent Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Apparent Power</em>' attribute.
	 * @see #isSetRatedApparentPower()
	 * @see #unsetRatedApparentPower()
	 * @see #setRatedApparentPower(float)
	 * @generated
	 */
	public float getRatedApparentPower() {
		return ratedApparentPower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Apparent Power</em>' attribute.
	 * @see #isSetRatedApparentPower()
	 * @see #unsetRatedApparentPower()
	 * @see #getRatedApparentPower()
	 * @generated
	 */
	public void setRatedApparentPower(float newRatedApparentPower) {
		ratedApparentPower = newRatedApparentPower;
		ratedApparentPowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedApparentPower()
	 * @see #getRatedApparentPower()
	 * @see #setRatedApparentPower(float)
	 * @generated
	 */
	public void unsetRatedApparentPower() {
		ratedApparentPower = RATED_APPARENT_POWER_EDEFAULT;
		ratedApparentPowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Apparent Power</em>' attribute is set.
	 * @see #unsetRatedApparentPower()
	 * @see #getRatedApparentPower()
	 * @see #setRatedApparentPower(float)
	 * @generated
	 */
	public boolean isSetRatedApparentPower() {
		return ratedApparentPowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #setFrequency(float)
	 * @generated
	 */
	public float getFrequency() {
		return frequency;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		frequency = newFrequency;
		frequencyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(float)
	 * @generated
	 */
	public void unsetFrequency() {
		frequency = FREQUENCY_EDEFAULT;
		frequencyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getFrequency <em>Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency</em>' attribute is set.
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(float)
	 * @generated
	 */
	public boolean isSetFrequency() {
		return frequencyESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralU <em>Neutral U</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralU <em>Neutral U</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralU <em>Neutral U</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ct Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Ratio</em>' attribute.
	 * @see #isSetCtRatio()
	 * @see #unsetCtRatio()
	 * @see #setCtRatio(float)
	 * @generated
	 */
	public float getCtRatio() {
		return ctRatio;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Ratio</em>' attribute.
	 * @see #isSetCtRatio()
	 * @see #unsetCtRatio()
	 * @see #getCtRatio()
	 * @generated
	 */
	public void setCtRatio(float newCtRatio) {
		ctRatio = newCtRatio;
		ctRatioESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtRatio()
	 * @see #getCtRatio()
	 * @see #setCtRatio(float)
	 * @generated
	 */
	public void unsetCtRatio() {
		ctRatio = CT_RATIO_EDEFAULT;
		ctRatioESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ct Ratio</em>' attribute is set.
	 * @see #unsetCtRatio()
	 * @see #getCtRatio()
	 * @see #setCtRatio(float)
	 * @generated
	 */
	public boolean isSetCtRatio() {
		return ctRatioESet;
	}

	/**
	 * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #isSetStepVoltageIncrement()
	 * @see #unsetStepVoltageIncrement()
	 * @see #setStepVoltageIncrement(float)
	 * @generated
	 */
	public float getStepVoltageIncrement() {
		return stepVoltageIncrement;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #isSetStepVoltageIncrement()
	 * @see #unsetStepVoltageIncrement()
	 * @see #getStepVoltageIncrement()
	 * @generated
	 */
	public void setStepVoltageIncrement(float newStepVoltageIncrement) {
		stepVoltageIncrement = newStepVoltageIncrement;
		stepVoltageIncrementESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepVoltageIncrement()
	 * @see #getStepVoltageIncrement()
	 * @see #setStepVoltageIncrement(float)
	 * @generated
	 */
	public void unsetStepVoltageIncrement() {
		stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;
		stepVoltageIncrementESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Voltage Increment</em>' attribute is set.
	 * @see #unsetStepVoltageIncrement()
	 * @see #getStepVoltageIncrement()
	 * @see #setStepVoltageIncrement(float)
	 * @generated
	 */
	public boolean isSetStepVoltageIncrement() {
		return stepVoltageIncrementESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Tcul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tcul</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tcul</em>' attribute.
	 * @see #isSetIsTcul()
	 * @see #unsetIsTcul()
	 * @see #setIsTcul(boolean)
	 * @generated
	 */
	public boolean isIsTcul() {
		return isTcul;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#isIsTcul <em>Is Tcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tcul</em>' attribute.
	 * @see #isSetIsTcul()
	 * @see #unsetIsTcul()
	 * @see #isIsTcul()
	 * @generated
	 */
	public void setIsTcul(boolean newIsTcul) {
		isTcul = newIsTcul;
		isTculESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#isIsTcul <em>Is Tcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTcul()
	 * @see #isIsTcul()
	 * @see #setIsTcul(boolean)
	 * @generated
	 */
	public void unsetIsTcul() {
		isTcul = IS_TCUL_EDEFAULT;
		isTculESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#isIsTcul <em>Is Tcul</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Tcul</em>' attribute is set.
	 * @see #unsetIsTcul()
	 * @see #isIsTcul()
	 * @see #setIsTcul(boolean)
	 * @generated
	 */
	public boolean isSetIsTcul() {
		return isTculESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		ratedCurrent = newRatedCurrent;
		ratedCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public void unsetRatedCurrent() {
		ratedCurrent = RATED_CURRENT_EDEFAULT;
		ratedCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Current</em>' attribute is set.
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public boolean isSetRatedCurrent() {
		return ratedCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Tap Changers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TapChanger}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerInfo <em>Tap Changer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changers</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TapChanger#getTapChangerInfo
	 * @generated
	 */
	public EList<TapChanger> getTapChangers() {
		if (tapChangers == null) {
			tapChangers = new BasicInternalEList<TapChanger>(TapChanger.class);
		}
		return tapChangers;
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getLowStep <em>Low Step</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getLowStep <em>Low Step</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getLowStep <em>Low Step</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getHighStep <em>High Step</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getHighStep <em>High Step</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getHighStep <em>High Step</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Pt Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Ratio</em>' attribute.
	 * @see #isSetPtRatio()
	 * @see #unsetPtRatio()
	 * @see #setPtRatio(float)
	 * @generated
	 */
	public float getPtRatio() {
		return ptRatio;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Ratio</em>' attribute.
	 * @see #isSetPtRatio()
	 * @see #unsetPtRatio()
	 * @see #getPtRatio()
	 * @generated
	 */
	public void setPtRatio(float newPtRatio) {
		ptRatio = newPtRatio;
		ptRatioESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPtRatio()
	 * @see #getPtRatio()
	 * @see #setPtRatio(float)
	 * @generated
	 */
	public void unsetPtRatio() {
		ptRatio = PT_RATIO_EDEFAULT;
		ptRatioESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pt Ratio</em>' attribute is set.
	 * @see #unsetPtRatio()
	 * @see #getPtRatio()
	 * @see #setPtRatio(float)
	 * @generated
	 */
	public boolean isSetPtRatio() {
		return ptRatioESet;
	}

	/**
	 * Returns the value of the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bil</em>' attribute.
	 * @see #isSetBil()
	 * @see #unsetBil()
	 * @see #setBil(float)
	 * @generated
	 */
	public float getBil() {
		return bil;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getBil <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bil</em>' attribute.
	 * @see #isSetBil()
	 * @see #unsetBil()
	 * @see #getBil()
	 * @generated
	 */
	public void setBil(float newBil) {
		bil = newBil;
		bilESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getBil <em>Bil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBil()
	 * @see #getBil()
	 * @see #setBil(float)
	 * @generated
	 */
	public void unsetBil() {
		bil = BIL_EDEFAULT;
		bilESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getBil <em>Bil</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bil</em>' attribute is set.
	 * @see #unsetBil()
	 * @see #getBil()
	 * @see #setBil(float)
	 * @generated
	 */
	public boolean isSetBil() {
		return bilESet;
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
			case AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChangers()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS:
				return ((InternalEList<?>)getTapChangers()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATING:
				return getCtRating();
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
				return getStepPhaseIncrement();
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
				return getRatedApparentPower();
			case AssetModelsPackage.TAP_CHANGER_INFO__FREQUENCY:
				return getFrequency();
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_U:
				return getNeutralU();
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATIO:
				return getCtRatio();
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
				return getStepVoltageIncrement();
			case AssetModelsPackage.TAP_CHANGER_INFO__IS_TCUL:
				return isIsTcul();
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
				return getNeutralStep();
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_CURRENT:
				return getRatedCurrent();
			case AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS:
				return getTapChangers();
			case AssetModelsPackage.TAP_CHANGER_INFO__LOW_STEP:
				return getLowStep();
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
				return getRatedVoltage();
			case AssetModelsPackage.TAP_CHANGER_INFO__HIGH_STEP:
				return getHighStep();
			case AssetModelsPackage.TAP_CHANGER_INFO__PT_RATIO:
				return getPtRatio();
			case AssetModelsPackage.TAP_CHANGER_INFO__BIL:
				return getBil();
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
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATING:
				setCtRating((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
				setStepPhaseIncrement((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
				setRatedApparentPower((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_U:
				setNeutralU((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATIO:
				setCtRatio((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__IS_TCUL:
				setIsTcul((Boolean)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
				setNeutralStep((Integer)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS:
				getTapChangers().clear();
				getTapChangers().addAll((Collection<? extends TapChanger>)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__LOW_STEP:
				setLowStep((Integer)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__HIGH_STEP:
				setHighStep((Integer)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__PT_RATIO:
				setPtRatio((Float)newValue);
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__BIL:
				setBil((Float)newValue);
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
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATING:
				unsetCtRating();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
				unsetStepPhaseIncrement();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
				unsetRatedApparentPower();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__FREQUENCY:
				unsetFrequency();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_U:
				unsetNeutralU();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATIO:
				unsetCtRatio();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
				unsetStepVoltageIncrement();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__IS_TCUL:
				unsetIsTcul();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
				unsetNeutralStep();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_CURRENT:
				unsetRatedCurrent();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS:
				getTapChangers().clear();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__LOW_STEP:
				unsetLowStep();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
				unsetRatedVoltage();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__HIGH_STEP:
				unsetHighStep();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__PT_RATIO:
				unsetPtRatio();
				return;
			case AssetModelsPackage.TAP_CHANGER_INFO__BIL:
				unsetBil();
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
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATING:
				return isSetCtRating();
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
				return isSetStepPhaseIncrement();
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
				return isSetRatedApparentPower();
			case AssetModelsPackage.TAP_CHANGER_INFO__FREQUENCY:
				return isSetFrequency();
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_U:
				return isSetNeutralU();
			case AssetModelsPackage.TAP_CHANGER_INFO__CT_RATIO:
				return isSetCtRatio();
			case AssetModelsPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
				return isSetStepVoltageIncrement();
			case AssetModelsPackage.TAP_CHANGER_INFO__IS_TCUL:
				return isSetIsTcul();
			case AssetModelsPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
				return isSetNeutralStep();
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_CURRENT:
				return isSetRatedCurrent();
			case AssetModelsPackage.TAP_CHANGER_INFO__TAP_CHANGERS:
				return tapChangers != null && !tapChangers.isEmpty();
			case AssetModelsPackage.TAP_CHANGER_INFO__LOW_STEP:
				return isSetLowStep();
			case AssetModelsPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
				return isSetRatedVoltage();
			case AssetModelsPackage.TAP_CHANGER_INFO__HIGH_STEP:
				return isSetHighStep();
			case AssetModelsPackage.TAP_CHANGER_INFO__PT_RATIO:
				return isSetPtRatio();
			case AssetModelsPackage.TAP_CHANGER_INFO__BIL:
				return isSetBil();
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
		result.append(" (ctRating: ");
		if (ctRatingESet) result.append(ctRating); else result.append("<unset>");
		result.append(", stepPhaseIncrement: ");
		if (stepPhaseIncrementESet) result.append(stepPhaseIncrement); else result.append("<unset>");
		result.append(", ratedApparentPower: ");
		if (ratedApparentPowerESet) result.append(ratedApparentPower); else result.append("<unset>");
		result.append(", frequency: ");
		if (frequencyESet) result.append(frequency); else result.append("<unset>");
		result.append(", neutralU: ");
		if (neutralUESet) result.append(neutralU); else result.append("<unset>");
		result.append(", ctRatio: ");
		if (ctRatioESet) result.append(ctRatio); else result.append("<unset>");
		result.append(", stepVoltageIncrement: ");
		if (stepVoltageIncrementESet) result.append(stepVoltageIncrement); else result.append("<unset>");
		result.append(", isTcul: ");
		if (isTculESet) result.append(isTcul); else result.append("<unset>");
		result.append(", neutralStep: ");
		if (neutralStepESet) result.append(neutralStep); else result.append("<unset>");
		result.append(", ratedCurrent: ");
		if (ratedCurrentESet) result.append(ratedCurrent); else result.append("<unset>");
		result.append(", lowStep: ");
		if (lowStepESet) result.append(lowStep); else result.append("<unset>");
		result.append(", ratedVoltage: ");
		if (ratedVoltageESet) result.append(ratedVoltage); else result.append("<unset>");
		result.append(", highStep: ");
		if (highStepESet) result.append(highStep); else result.append("<unset>");
		result.append(", ptRatio: ");
		if (ptRatioESet) result.append(ptRatio); else result.append("<unset>");
		result.append(", bil: ");
		if (bilESet) result.append(bil); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TapChangerInfo
