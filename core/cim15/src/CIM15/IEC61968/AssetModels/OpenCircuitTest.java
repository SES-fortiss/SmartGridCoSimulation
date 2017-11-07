/**
 */
package CIM15.IEC61968.AssetModels;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEnd <em>Open End</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenCircuitTest extends TransformerTest {
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
	 * The default value of the '{@link #getOpenEndVoltage() <em>Open End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenEndVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float OPEN_END_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOpenEndVoltage() <em>Open End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenEndVoltage()
	 * @generated
	 * @ordered
	 */
	protected float openEndVoltage = OPEN_END_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Open End Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean openEndVoltageESet;

	/**
	 * The default value of the '{@link #getOpenEndStep() <em>Open End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenEndStep()
	 * @generated
	 * @ordered
	 */
	protected static final int OPEN_END_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpenEndStep() <em>Open End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenEndStep()
	 * @generated
	 * @ordered
	 */
	protected int openEndStep = OPEN_END_STEP_EDEFAULT;

	/**
	 * This is true if the Open End Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean openEndStepESet;

	/**
	 * The default value of the '{@link #getEnergisedEndVoltage() <em>Energised End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGISED_END_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergisedEndVoltage() <em>Energised End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndVoltage()
	 * @generated
	 * @ordered
	 */
	protected float energisedEndVoltage = ENERGISED_END_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Energised End Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energisedEndVoltageESet;

	/**
	 * The default value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_SHIFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseShift() <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseShift()
	 * @generated
	 * @ordered
	 */
	protected float phaseShift = PHASE_SHIFT_EDEFAULT;

	/**
	 * This is true if the Phase Shift attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseShiftESet;

	/**
	 * The cached value of the '{@link #getOpenEnd() <em>Open End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenEnd()
	 * @generated
	 * @ordered
	 */
	protected TransformerEndInfo openEnd;

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
	protected OpenCircuitTest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.OPEN_CIRCUIT_TEST;
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Open End Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open End Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open End Voltage</em>' attribute.
	 * @see #isSetOpenEndVoltage()
	 * @see #unsetOpenEndVoltage()
	 * @see #setOpenEndVoltage(float)
	 * @generated
	 */
	public float getOpenEndVoltage() {
		return openEndVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open End Voltage</em>' attribute.
	 * @see #isSetOpenEndVoltage()
	 * @see #unsetOpenEndVoltage()
	 * @see #getOpenEndVoltage()
	 * @generated
	 */
	public void setOpenEndVoltage(float newOpenEndVoltage) {
		openEndVoltage = newOpenEndVoltage;
		openEndVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpenEndVoltage()
	 * @see #getOpenEndVoltage()
	 * @see #setOpenEndVoltage(float)
	 * @generated
	 */
	public void unsetOpenEndVoltage() {
		openEndVoltage = OPEN_END_VOLTAGE_EDEFAULT;
		openEndVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Open End Voltage</em>' attribute is set.
	 * @see #unsetOpenEndVoltage()
	 * @see #getOpenEndVoltage()
	 * @see #setOpenEndVoltage(float)
	 * @generated
	 */
	public boolean isSetOpenEndVoltage() {
		return openEndVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Open End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open End Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open End Step</em>' attribute.
	 * @see #isSetOpenEndStep()
	 * @see #unsetOpenEndStep()
	 * @see #setOpenEndStep(int)
	 * @generated
	 */
	public int getOpenEndStep() {
		return openEndStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open End Step</em>' attribute.
	 * @see #isSetOpenEndStep()
	 * @see #unsetOpenEndStep()
	 * @see #getOpenEndStep()
	 * @generated
	 */
	public void setOpenEndStep(int newOpenEndStep) {
		openEndStep = newOpenEndStep;
		openEndStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpenEndStep()
	 * @see #getOpenEndStep()
	 * @see #setOpenEndStep(int)
	 * @generated
	 */
	public void unsetOpenEndStep() {
		openEndStep = OPEN_END_STEP_EDEFAULT;
		openEndStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Open End Step</em>' attribute is set.
	 * @see #unsetOpenEndStep()
	 * @see #getOpenEndStep()
	 * @see #setOpenEndStep(int)
	 * @generated
	 */
	public boolean isSetOpenEndStep() {
		return openEndStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Energised End Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End Voltage</em>' attribute.
	 * @see #isSetEnergisedEndVoltage()
	 * @see #unsetEnergisedEndVoltage()
	 * @see #setEnergisedEndVoltage(float)
	 * @generated
	 */
	public float getEnergisedEndVoltage() {
		return energisedEndVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energised End Voltage</em>' attribute.
	 * @see #isSetEnergisedEndVoltage()
	 * @see #unsetEnergisedEndVoltage()
	 * @see #getEnergisedEndVoltage()
	 * @generated
	 */
	public void setEnergisedEndVoltage(float newEnergisedEndVoltage) {
		energisedEndVoltage = newEnergisedEndVoltage;
		energisedEndVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergisedEndVoltage()
	 * @see #getEnergisedEndVoltage()
	 * @see #setEnergisedEndVoltage(float)
	 * @generated
	 */
	public void unsetEnergisedEndVoltage() {
		energisedEndVoltage = ENERGISED_END_VOLTAGE_EDEFAULT;
		energisedEndVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energised End Voltage</em>' attribute is set.
	 * @see #unsetEnergisedEndVoltage()
	 * @see #getEnergisedEndVoltage()
	 * @see #setEnergisedEndVoltage(float)
	 * @generated
	 */
	public boolean isSetEnergisedEndVoltage() {
		return energisedEndVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Shift</em>' attribute.
	 * @see #isSetPhaseShift()
	 * @see #unsetPhaseShift()
	 * @see #setPhaseShift(float)
	 * @generated
	 */
	public float getPhaseShift() {
		return phaseShift;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Shift</em>' attribute.
	 * @see #isSetPhaseShift()
	 * @see #unsetPhaseShift()
	 * @see #getPhaseShift()
	 * @generated
	 */
	public void setPhaseShift(float newPhaseShift) {
		phaseShift = newPhaseShift;
		phaseShiftESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseShift()
	 * @see #getPhaseShift()
	 * @see #setPhaseShift(float)
	 * @generated
	 */
	public void unsetPhaseShift() {
		phaseShift = PHASE_SHIFT_EDEFAULT;
		phaseShiftESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Shift</em>' attribute is set.
	 * @see #unsetPhaseShift()
	 * @see #getPhaseShift()
	 * @see #setPhaseShift(float)
	 * @generated
	 */
	public boolean isSetPhaseShift() {
		return phaseShiftESet;
	}

	/**
	 * Returns the value of the '<em><b>Open End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open End</em>' reference.
	 * @see #setOpenEnd(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getOpenEndOpenCircuitTests
	 * @generated
	 */
	public TransformerEndInfo getOpenEnd() {
		if (openEnd != null && openEnd.eIsProxy()) {
			InternalEObject oldOpenEnd = (InternalEObject)openEnd;
			openEnd = (TransformerEndInfo)eResolveProxy(oldOpenEnd);
			if (openEnd != oldOpenEnd) {
			}
		}
		return openEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEndInfo basicGetOpenEnd() {
		return openEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenEnd(TransformerEndInfo newOpenEnd, NotificationChain msgs) {
		TransformerEndInfo oldOpenEnd = openEnd;
		openEnd = newOpenEnd;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEnd <em>Open End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open End</em>' reference.
	 * @see #getOpenEnd()
	 * @generated
	 */
	public void setOpenEnd(TransformerEndInfo newOpenEnd) {
		if (newOpenEnd != openEnd) {
			NotificationChain msgs = null;
			if (openEnd != null)
				msgs = ((InternalEObject)openEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
			if (newOpenEnd != null)
				msgs = ((InternalEObject)newOpenEnd).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
			msgs = basicSetOpenEnd(newOpenEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Energised End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End</em>' reference.
	 * @see #setEnergisedEnd(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndOpenCircuitTests
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}' reference.
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
				msgs = ((InternalEObject)energisedEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
			if (newEnergisedEnd != null)
				msgs = ((InternalEObject)newEnergisedEnd).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
			msgs = basicSetEnergisedEnd(newEnergisedEnd, msgs);
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END:
				if (openEnd != null)
					msgs = ((InternalEObject)openEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
				return basicSetOpenEnd((TransformerEndInfo)otherEnd, msgs);
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
				if (energisedEnd != null)
					msgs = ((InternalEObject)energisedEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS, TransformerEndInfo.class, msgs);
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END:
				return basicSetOpenEnd(null, msgs);
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
				return getEnergisedEndStep();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
				return getOpenEndVoltage();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
				return getOpenEndStep();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
				return getEnergisedEndVoltage();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
				return getPhaseShift();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END:
				if (resolve) return getOpenEnd();
				return basicGetOpenEnd();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
				setEnergisedEndStep((Integer)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
				setOpenEndVoltage((Float)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
				setOpenEndStep((Integer)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
				setEnergisedEndVoltage((Float)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
				setPhaseShift((Float)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END:
				setOpenEnd((TransformerEndInfo)newValue);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
				unsetEnergisedEndStep();
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
				unsetOpenEndVoltage();
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
				unsetOpenEndStep();
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
				unsetEnergisedEndVoltage();
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
				unsetPhaseShift();
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END:
				setOpenEnd((TransformerEndInfo)null);
				return;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
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
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
				return isSetEnergisedEndStep();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
				return isSetOpenEndVoltage();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
				return isSetOpenEndStep();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
				return isSetEnergisedEndVoltage();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
				return isSetPhaseShift();
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__OPEN_END:
				return openEnd != null;
			case AssetModelsPackage.OPEN_CIRCUIT_TEST__ENERGISED_END:
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
		result.append(" (energisedEndStep: ");
		if (energisedEndStepESet) result.append(energisedEndStep); else result.append("<unset>");
		result.append(", openEndVoltage: ");
		if (openEndVoltageESet) result.append(openEndVoltage); else result.append("<unset>");
		result.append(", openEndStep: ");
		if (openEndStepESet) result.append(openEndStep); else result.append("<unset>");
		result.append(", energisedEndVoltage: ");
		if (energisedEndVoltageESet) result.append(energisedEndVoltage); else result.append("<unset>");
		result.append(", phaseShift: ");
		if (phaseShiftESet) result.append(phaseShift); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OpenCircuitTest
