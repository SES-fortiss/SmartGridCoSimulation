/**
 */
package CIM15.IEC61968.AssetModels;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLossZero <em>Loss Zero</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLoss <em>Loss</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShortCircuitTest extends TransformerTest {
	/**
	 * The cached value of the '{@link #getGroundedEnds() <em>Grounded Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEndInfo> groundedEnds;

	/**
	 * The default value of the '{@link #getLossZero() <em>Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossZero()
	 * @generated
	 * @ordered
	 */
	protected static final float LOSS_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLossZero() <em>Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossZero()
	 * @generated
	 * @ordered
	 */
	protected float lossZero = LOSS_ZERO_EDEFAULT;

	/**
	 * This is true if the Loss Zero attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lossZeroESet;

	/**
	 * The default value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedance()
	 * @generated
	 * @ordered
	 */
	protected float leakageImpedance = LEAKAGE_IMPEDANCE_EDEFAULT;

	/**
	 * This is true if the Leakage Impedance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leakageImpedanceESet;

	/**
	 * The default value of the '{@link #getLoss() <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoss() <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss()
	 * @generated
	 * @ordered
	 */
	protected float loss = LOSS_EDEFAULT;

	/**
	 * This is true if the Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lossESet;

	/**
	 * The default value of the '{@link #getGroundedEndStep() <em>Grounded End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedEndStep()
	 * @generated
	 * @ordered
	 */
	protected static final int GROUNDED_END_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGroundedEndStep() <em>Grounded End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedEndStep()
	 * @generated
	 * @ordered
	 */
	protected int groundedEndStep = GROUNDED_END_STEP_EDEFAULT;

	/**
	 * This is true if the Grounded End Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundedEndStepESet;

	/**
	 * The default value of the '{@link #getLeakageImpedanceZero() <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedanceZero()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_IMPEDANCE_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageImpedanceZero() <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageImpedanceZero()
	 * @generated
	 * @ordered
	 */
	protected float leakageImpedanceZero = LEAKAGE_IMPEDANCE_ZERO_EDEFAULT;

	/**
	 * This is true if the Leakage Impedance Zero attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leakageImpedanceZeroESet;

	/**
	 * The default value of the '{@link #getEnergisedEndStep() <em>Energised End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndStep()
	 * @generated
	 * @ordered
	 */
	protected static final int ENERGISED_END_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnergisedEndStep() <em>Energised End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndStep()
	 * @generated
	 * @ordered
	 */
	protected int energisedEndStep = ENERGISED_END_STEP_EDEFAULT;

	/**
	 * This is true if the Energised End Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energisedEndStepESet;

	/**
	 * The cached value of the '{@link #getEnergisedEnd() <em>Energised End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEnd()
	 * @generated
	 * @ordered
	 */
	protected TransformerEndInfo energisedEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortCircuitTest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.SHORT_CIRCUIT_TEST;
	}

	/**
	 * Returns the value of the '<em><b>Grounded Ends</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.TransformerEndInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded Ends</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getGroundedEndShortCircuitTests
	 * @generated
	 */
	public EList<TransformerEndInfo> getGroundedEnds() {
		if (groundedEnds == null) {
			groundedEnds = new BasicInternalEList<TransformerEndInfo>(TransformerEndInfo.class);
		}
		return groundedEnds;
	}

	/**
	 * Returns the value of the '<em><b>Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Zero</em>' attribute.
	 * @see #isSetLossZero()
	 * @see #unsetLossZero()
	 * @see #setLossZero(float)
	 * @generated
	 */
	public float getLossZero() {
		return lossZero;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLossZero <em>Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Zero</em>' attribute.
	 * @see #isSetLossZero()
	 * @see #unsetLossZero()
	 * @see #getLossZero()
	 * @generated
	 */
	public void setLossZero(float newLossZero) {
		lossZero = newLossZero;
		lossZeroESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLossZero <em>Loss Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLossZero()
	 * @see #getLossZero()
	 * @see #setLossZero(float)
	 * @generated
	 */
	public void unsetLossZero() {
		lossZero = LOSS_ZERO_EDEFAULT;
		lossZeroESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLossZero <em>Loss Zero</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Loss Zero</em>' attribute is set.
	 * @see #unsetLossZero()
	 * @see #getLossZero()
	 * @see #setLossZero(float)
	 * @generated
	 */
	public boolean isSetLossZero() {
		return lossZeroESet;
	}

	/**
	 * Returns the value of the '<em><b>Leakage Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Impedance</em>' attribute.
	 * @see #isSetLeakageImpedance()
	 * @see #unsetLeakageImpedance()
	 * @see #setLeakageImpedance(float)
	 * @generated
	 */
	public float getLeakageImpedance() {
		return leakageImpedance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Impedance</em>' attribute.
	 * @see #isSetLeakageImpedance()
	 * @see #unsetLeakageImpedance()
	 * @see #getLeakageImpedance()
	 * @generated
	 */
	public void setLeakageImpedance(float newLeakageImpedance) {
		leakageImpedance = newLeakageImpedance;
		leakageImpedanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeakageImpedance()
	 * @see #getLeakageImpedance()
	 * @see #setLeakageImpedance(float)
	 * @generated
	 */
	public void unsetLeakageImpedance() {
		leakageImpedance = LEAKAGE_IMPEDANCE_EDEFAULT;
		leakageImpedanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leakage Impedance</em>' attribute is set.
	 * @see #unsetLeakageImpedance()
	 * @see #getLeakageImpedance()
	 * @see #setLeakageImpedance(float)
	 * @generated
	 */
	public boolean isSetLeakageImpedance() {
		return leakageImpedanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss</em>' attribute.
	 * @see #isSetLoss()
	 * @see #unsetLoss()
	 * @see #setLoss(float)
	 * @generated
	 */
	public float getLoss() {
		return loss;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLoss <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss</em>' attribute.
	 * @see #isSetLoss()
	 * @see #unsetLoss()
	 * @see #getLoss()
	 * @generated
	 */
	public void setLoss(float newLoss) {
		loss = newLoss;
		lossESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLoss <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoss()
	 * @see #getLoss()
	 * @see #setLoss(float)
	 * @generated
	 */
	public void unsetLoss() {
		loss = LOSS_EDEFAULT;
		lossESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLoss <em>Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Loss</em>' attribute is set.
	 * @see #unsetLoss()
	 * @see #getLoss()
	 * @see #setLoss(float)
	 * @generated
	 */
	public boolean isSetLoss() {
		return lossESet;
	}

	/**
	 * Returns the value of the '<em><b>Grounded End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded End Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded End Step</em>' attribute.
	 * @see #isSetGroundedEndStep()
	 * @see #unsetGroundedEndStep()
	 * @see #setGroundedEndStep(int)
	 * @generated
	 */
	public int getGroundedEndStep() {
		return groundedEndStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded End Step</em>' attribute.
	 * @see #isSetGroundedEndStep()
	 * @see #unsetGroundedEndStep()
	 * @see #getGroundedEndStep()
	 * @generated
	 */
	public void setGroundedEndStep(int newGroundedEndStep) {
		groundedEndStep = newGroundedEndStep;
		groundedEndStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundedEndStep()
	 * @see #getGroundedEndStep()
	 * @see #setGroundedEndStep(int)
	 * @generated
	 */
	public void unsetGroundedEndStep() {
		groundedEndStep = GROUNDED_END_STEP_EDEFAULT;
		groundedEndStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grounded End Step</em>' attribute is set.
	 * @see #unsetGroundedEndStep()
	 * @see #getGroundedEndStep()
	 * @see #setGroundedEndStep(int)
	 * @generated
	 */
	public boolean isSetGroundedEndStep() {
		return groundedEndStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Leakage Impedance Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Impedance Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Impedance Zero</em>' attribute.
	 * @see #isSetLeakageImpedanceZero()
	 * @see #unsetLeakageImpedanceZero()
	 * @see #setLeakageImpedanceZero(float)
	 * @generated
	 */
	public float getLeakageImpedanceZero() {
		return leakageImpedanceZero;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Impedance Zero</em>' attribute.
	 * @see #isSetLeakageImpedanceZero()
	 * @see #unsetLeakageImpedanceZero()
	 * @see #getLeakageImpedanceZero()
	 * @generated
	 */
	public void setLeakageImpedanceZero(float newLeakageImpedanceZero) {
		leakageImpedanceZero = newLeakageImpedanceZero;
		leakageImpedanceZeroESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeakageImpedanceZero()
	 * @see #getLeakageImpedanceZero()
	 * @see #setLeakageImpedanceZero(float)
	 * @generated
	 */
	public void unsetLeakageImpedanceZero() {
		leakageImpedanceZero = LEAKAGE_IMPEDANCE_ZERO_EDEFAULT;
		leakageImpedanceZeroESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leakage Impedance Zero</em>' attribute is set.
	 * @see #unsetLeakageImpedanceZero()
	 * @see #getLeakageImpedanceZero()
	 * @see #setLeakageImpedanceZero(float)
	 * @generated
	 */
	public boolean isSetLeakageImpedanceZero() {
		return leakageImpedanceZeroESet;
	}

	/**
	 * Returns the value of the '<em><b>Energised End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End Step</em>' attribute.
	 * @see #isSetEnergisedEndStep()
	 * @see #unsetEnergisedEndStep()
	 * @see #setEnergisedEndStep(int)
	 * @generated
	 */
	public int getEnergisedEndStep() {
		return energisedEndStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energised End Step</em>' attribute.
	 * @see #isSetEnergisedEndStep()
	 * @see #unsetEnergisedEndStep()
	 * @see #getEnergisedEndStep()
	 * @generated
	 */
	public void setEnergisedEndStep(int newEnergisedEndStep) {
		energisedEndStep = newEnergisedEndStep;
		energisedEndStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergisedEndStep()
	 * @see #getEnergisedEndStep()
	 * @see #setEnergisedEndStep(int)
	 * @generated
	 */
	public void unsetEnergisedEndStep() {
		energisedEndStep = ENERGISED_END_STEP_EDEFAULT;
		energisedEndStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energised End Step</em>' attribute is set.
	 * @see #unsetEnergisedEndStep()
	 * @see #getEnergisedEndStep()
	 * @see #setEnergisedEndStep(int)
	 * @generated
	 */
	public boolean isSetEnergisedEndStep() {
		return energisedEndStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Energised End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End</em>' reference.
	 * @see #setEnergisedEnd(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndShortCircuitTests
	 * @generated
	 */
	public TransformerEndInfo getEnergisedEnd() {
		if (energisedEnd != null && energisedEnd.eIsProxy()) {
			InternalEObject oldEnergisedEnd = (InternalEObject)energisedEnd;
			energisedEnd = (TransformerEndInfo)eResolveProxy(oldEnergisedEnd);
			if (energisedEnd != oldEnergisedEnd) {
			}
		}
		return energisedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEndInfo basicGetEnergisedEnd() {
		return energisedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergisedEnd(TransformerEndInfo newEnergisedEnd, NotificationChain msgs) {
		TransformerEndInfo oldEnergisedEnd = energisedEnd;
		energisedEnd = newEnergisedEnd;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energised End</em>' reference.
	 * @see #getEnergisedEnd()
	 * @generated
	 */
	public void setEnergisedEnd(TransformerEndInfo newEnergisedEnd) {
		if (newEnergisedEnd != energisedEnd) {
			NotificationChain msgs = null;
			if (energisedEnd != null)
				msgs = ((InternalEObject)energisedEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
			if (newEnergisedEnd != null)
				msgs = ((InternalEObject)newEnergisedEnd).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
			msgs = basicSetEnergisedEnd(newEnergisedEnd, msgs);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroundedEnds()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
				if (energisedEnd != null)
					msgs = ((InternalEObject)energisedEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
				return basicSetEnergisedEnd((TransformerEndInfo)otherEnd, msgs);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
				return ((InternalEList<?>)getGroundedEnds()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
				return basicSetEnergisedEnd(null, msgs);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
				return getGroundedEnds();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
				return getLossZero();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				return getLeakageImpedance();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS:
				return getLoss();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
				return getGroundedEndStep();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				return getLeakageImpedanceZero();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
				return getEnergisedEndStep();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
				if (resolve) return getEnergisedEnd();
				return basicGetEnergisedEnd();
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
				getGroundedEnds().clear();
				getGroundedEnds().addAll((Collection<? extends TransformerEndInfo>)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
				setLossZero((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				setLeakageImpedance((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS:
				setLoss((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
				setGroundedEndStep((Integer)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				setLeakageImpedanceZero((Float)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
				setEnergisedEndStep((Integer)newValue);
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
				setEnergisedEnd((TransformerEndInfo)newValue);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
				getGroundedEnds().clear();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
				unsetLossZero();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				unsetLeakageImpedance();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS:
				unsetLoss();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
				unsetGroundedEndStep();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				unsetLeakageImpedanceZero();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
				unsetEnergisedEndStep();
				return;
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
				setEnergisedEnd((TransformerEndInfo)null);
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
				return groundedEnds != null && !groundedEnds.isEmpty();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
				return isSetLossZero();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
				return isSetLeakageImpedance();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LOSS:
				return isSetLoss();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
				return isSetGroundedEndStep();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
				return isSetLeakageImpedanceZero();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
				return isSetEnergisedEndStep();
			case AssetModelsPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
				return energisedEnd != null;
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
		result.append(" (lossZero: ");
		if (lossZeroESet) result.append(lossZero); else result.append("<unset>");
		result.append(", leakageImpedance: ");
		if (leakageImpedanceESet) result.append(leakageImpedance); else result.append("<unset>");
		result.append(", loss: ");
		if (lossESet) result.append(loss); else result.append("<unset>");
		result.append(", groundedEndStep: ");
		if (groundedEndStepESet) result.append(groundedEndStep); else result.append("<unset>");
		result.append(", leakageImpedanceZero: ");
		if (leakageImpedanceZeroESet) result.append(leakageImpedanceZero); else result.append("<unset>");
		result.append(", energisedEndStep: ");
		if (energisedEndStepESet) result.append(energisedEndStep); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ShortCircuitTest
