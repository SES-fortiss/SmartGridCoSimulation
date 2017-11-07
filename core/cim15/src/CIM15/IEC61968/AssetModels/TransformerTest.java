/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTest#getBasePower <em>Base Power</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerTest#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerTest extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getBasePower() <em>Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePower()
	 * @generated
	 * @ordered
	 */
	protected static final float BASE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBasePower() <em>Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePower()
	 * @generated
	 * @ordered
	 */
	protected float basePower = BASE_POWER_EDEFAULT;

	/**
	 * This is true if the Base Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean basePowerESet;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected float temperature = TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerTest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TRANSFORMER_TEST;
	}

	/**
	 * Returns the value of the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Power</em>' attribute.
	 * @see #isSetBasePower()
	 * @see #unsetBasePower()
	 * @see #setBasePower(float)
	 * @generated
	 */
	public float getBasePower() {
		return basePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTest#getBasePower <em>Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Power</em>' attribute.
	 * @see #isSetBasePower()
	 * @see #unsetBasePower()
	 * @see #getBasePower()
	 * @generated
	 */
	public void setBasePower(float newBasePower) {
		basePower = newBasePower;
		basePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTest#getBasePower <em>Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBasePower()
	 * @see #getBasePower()
	 * @see #setBasePower(float)
	 * @generated
	 */
	public void unsetBasePower() {
		basePower = BASE_POWER_EDEFAULT;
		basePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTest#getBasePower <em>Base Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Power</em>' attribute is set.
	 * @see #unsetBasePower()
	 * @see #getBasePower()
	 * @see #setBasePower(float)
	 * @generated
	 */
	public boolean isSetBasePower() {
		return basePowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #isSetTemperature()
	 * @see #unsetTemperature()
	 * @see #setTemperature(float)
	 * @generated
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTest#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #isSetTemperature()
	 * @see #unsetTemperature()
	 * @see #getTemperature()
	 * @generated
	 */
	public void setTemperature(float newTemperature) {
		temperature = newTemperature;
		temperatureESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTest#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperature()
	 * @see #getTemperature()
	 * @see #setTemperature(float)
	 * @generated
	 */
	public void unsetTemperature() {
		temperature = TEMPERATURE_EDEFAULT;
		temperatureESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerTest#getTemperature <em>Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature</em>' attribute is set.
	 * @see #unsetTemperature()
	 * @see #getTemperature()
	 * @see #setTemperature(float)
	 * @generated
	 */
	public boolean isSetTemperature() {
		return temperatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssetModelsPackage.TRANSFORMER_TEST__BASE_POWER:
				return getBasePower();
			case AssetModelsPackage.TRANSFORMER_TEST__TEMPERATURE:
				return getTemperature();
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
			case AssetModelsPackage.TRANSFORMER_TEST__BASE_POWER:
				setBasePower((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_TEST__TEMPERATURE:
				setTemperature((Float)newValue);
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
			case AssetModelsPackage.TRANSFORMER_TEST__BASE_POWER:
				unsetBasePower();
				return;
			case AssetModelsPackage.TRANSFORMER_TEST__TEMPERATURE:
				unsetTemperature();
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
			case AssetModelsPackage.TRANSFORMER_TEST__BASE_POWER:
				return isSetBasePower();
			case AssetModelsPackage.TRANSFORMER_TEST__TEMPERATURE:
				return isSetTemperature();
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
		result.append(" (basePower: ");
		if (basePowerESet) result.append(basePower); else result.append("<unset>");
		result.append(", temperature: ");
		if (temperatureESet) result.append(temperature); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerTest
