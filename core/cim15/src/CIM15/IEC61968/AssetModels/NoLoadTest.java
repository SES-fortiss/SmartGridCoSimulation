/**
 */
package CIM15.IEC61968.AssetModels;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Load Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLossZero <em>Loss Zero</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEnd <em>Energised End</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLoss <em>Loss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoLoadTest extends TransformerTest {
	/**
	 * The default value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float EXCITING_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExcitingCurrent() <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrent()
	 * @generated
	 * @ordered
	 */
	protected float excitingCurrent = EXCITING_CURRENT_EDEFAULT;

	/**
	 * This is true if the Exciting Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean excitingCurrentESet;

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
	 * The default value of the '{@link #getExcitingCurrentZero() <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrentZero()
	 * @generated
	 * @ordered
	 */
	protected static final float EXCITING_CURRENT_ZERO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExcitingCurrentZero() <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcitingCurrentZero()
	 * @generated
	 * @ordered
	 */
	protected float excitingCurrentZero = EXCITING_CURRENT_ZERO_EDEFAULT;

	/**
	 * This is true if the Exciting Current Zero attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean excitingCurrentZeroESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoLoadTest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.NO_LOAD_TEST;
	}

	/**
	 * Returns the value of the '<em><b>Exciting Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exciting Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exciting Current</em>' attribute.
	 * @see #isSetExcitingCurrent()
	 * @see #unsetExcitingCurrent()
	 * @see #setExcitingCurrent(float)
	 * @generated
	 */
	public float getExcitingCurrent() {
		return excitingCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exciting Current</em>' attribute.
	 * @see #isSetExcitingCurrent()
	 * @see #unsetExcitingCurrent()
	 * @see #getExcitingCurrent()
	 * @generated
	 */
	public void setExcitingCurrent(float newExcitingCurrent) {
		excitingCurrent = newExcitingCurrent;
		excitingCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExcitingCurrent()
	 * @see #getExcitingCurrent()
	 * @see #setExcitingCurrent(float)
	 * @generated
	 */
	public void unsetExcitingCurrent() {
		excitingCurrent = EXCITING_CURRENT_EDEFAULT;
		excitingCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exciting Current</em>' attribute is set.
	 * @see #unsetExcitingCurrent()
	 * @see #getExcitingCurrent()
	 * @see #setExcitingCurrent(float)
	 * @generated
	 */
	public boolean isSetExcitingCurrent() {
		return excitingCurrentESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLossZero <em>Loss Zero</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLossZero <em>Loss Zero</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLossZero <em>Loss Zero</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Exciting Current Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exciting Current Zero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exciting Current Zero</em>' attribute.
	 * @see #isSetExcitingCurrentZero()
	 * @see #unsetExcitingCurrentZero()
	 * @see #setExcitingCurrentZero(float)
	 * @generated
	 */
	public float getExcitingCurrentZero() {
		return excitingCurrentZero;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exciting Current Zero</em>' attribute.
	 * @see #isSetExcitingCurrentZero()
	 * @see #unsetExcitingCurrentZero()
	 * @see #getExcitingCurrentZero()
	 * @generated
	 */
	public void setExcitingCurrentZero(float newExcitingCurrentZero) {
		excitingCurrentZero = newExcitingCurrentZero;
		excitingCurrentZeroESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExcitingCurrentZero()
	 * @see #getExcitingCurrentZero()
	 * @see #setExcitingCurrentZero(float)
	 * @generated
	 */
	public void unsetExcitingCurrentZero() {
		excitingCurrentZero = EXCITING_CURRENT_ZERO_EDEFAULT;
		excitingCurrentZeroESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exciting Current Zero</em>' attribute is set.
	 * @see #unsetExcitingCurrentZero()
	 * @see #getExcitingCurrentZero()
	 * @see #setExcitingCurrentZero(float)
	 * @generated
	 */
	public boolean isSetExcitingCurrentZero() {
		return excitingCurrentZeroESet;
	}

	/**
	 * Returns the value of the '<em><b>Energised End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndNoLoadTest <em>Energised End No Load Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End</em>' reference.
	 * @see #setEnergisedEnd(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndNoLoadTest
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEnd <em>Energised End</em>}' reference.
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
				msgs = ((InternalEObject)energisedEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST, TransformerEndInfo.class, msgs);
			if (newEnergisedEnd != null)
				msgs = ((InternalEObject)newEnergisedEnd).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST, TransformerEndInfo.class, msgs);
			msgs = basicSetEnergisedEnd(newEnergisedEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLoss <em>Loss</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLoss <em>Loss</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLoss <em>Loss</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END:
				if (energisedEnd != null)
					msgs = ((InternalEObject)energisedEnd).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST, TransformerEndInfo.class, msgs);
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
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END:
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
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT:
				return getExcitingCurrent();
			case AssetModelsPackage.NO_LOAD_TEST__LOSS_ZERO:
				return getLossZero();
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
				return getExcitingCurrentZero();
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END:
				if (resolve) return getEnergisedEnd();
				return basicGetEnergisedEnd();
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
				return getEnergisedEndVoltage();
			case AssetModelsPackage.NO_LOAD_TEST__LOSS:
				return getLoss();
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
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT:
				setExcitingCurrent((Float)newValue);
				return;
			case AssetModelsPackage.NO_LOAD_TEST__LOSS_ZERO:
				setLossZero((Float)newValue);
				return;
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
				setExcitingCurrentZero((Float)newValue);
				return;
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END:
				setEnergisedEnd((TransformerEndInfo)newValue);
				return;
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
				setEnergisedEndVoltage((Float)newValue);
				return;
			case AssetModelsPackage.NO_LOAD_TEST__LOSS:
				setLoss((Float)newValue);
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
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT:
				unsetExcitingCurrent();
				return;
			case AssetModelsPackage.NO_LOAD_TEST__LOSS_ZERO:
				unsetLossZero();
				return;
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
				unsetExcitingCurrentZero();
				return;
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END:
				setEnergisedEnd((TransformerEndInfo)null);
				return;
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
				unsetEnergisedEndVoltage();
				return;
			case AssetModelsPackage.NO_LOAD_TEST__LOSS:
				unsetLoss();
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
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT:
				return isSetExcitingCurrent();
			case AssetModelsPackage.NO_LOAD_TEST__LOSS_ZERO:
				return isSetLossZero();
			case AssetModelsPackage.NO_LOAD_TEST__EXCITING_CURRENT_ZERO:
				return isSetExcitingCurrentZero();
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END:
				return energisedEnd != null;
			case AssetModelsPackage.NO_LOAD_TEST__ENERGISED_END_VOLTAGE:
				return isSetEnergisedEndVoltage();
			case AssetModelsPackage.NO_LOAD_TEST__LOSS:
				return isSetLoss();
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
		result.append(" (excitingCurrent: ");
		if (excitingCurrentESet) result.append(excitingCurrent); else result.append("<unset>");
		result.append(", lossZero: ");
		if (lossZeroESet) result.append(lossZero); else result.append("<unset>");
		result.append(", excitingCurrentZero: ");
		if (excitingCurrentZeroESet) result.append(excitingCurrentZero); else result.append("<unset>");
		result.append(", energisedEndVoltage: ");
		if (energisedEndVoltageESet) result.append(energisedEndVoltage); else result.append("<unset>");
		result.append(", loss: ");
		if (lossESet) result.append(loss); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // NoLoadTest
