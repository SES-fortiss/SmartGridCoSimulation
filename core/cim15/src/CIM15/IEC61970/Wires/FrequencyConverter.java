/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrequencyConverter extends RegulatingCondEq {
	/**
	 * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected float maxU = MAX_U_EDEFAULT;

	/**
	 * This is true if the Max U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxUESet;

	/**
	 * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxP = MAX_P_EDEFAULT;

	/**
	 * This is true if the Max P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxPESet;

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
	 * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected float minP = MIN_P_EDEFAULT;

	/**
	 * This is true if the Min P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minPESet;

	/**
	 * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected float minU = MIN_U_EDEFAULT;

	/**
	 * This is true if the Min U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minUESet;

	/**
	 * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected String operatingMode = OPERATING_MODE_EDEFAULT;

	/**
	 * This is true if the Operating Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operatingModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyConverter() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.FREQUENCY_CONVERTER;
	}

	/**
	 * Returns the value of the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max U</em>' attribute.
	 * @see #isSetMaxU()
	 * @see #unsetMaxU()
	 * @see #setMaxU(float)
	 * @generated
	 */
	public float getMaxU() {
		return maxU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max U</em>' attribute.
	 * @see #isSetMaxU()
	 * @see #unsetMaxU()
	 * @see #getMaxU()
	 * @generated
	 */
	public void setMaxU(float newMaxU) {
		maxU = newMaxU;
		maxUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxU()
	 * @see #getMaxU()
	 * @see #setMaxU(float)
	 * @generated
	 */
	public void unsetMaxU() {
		maxU = MAX_U_EDEFAULT;
		maxUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max U</em>' attribute is set.
	 * @see #unsetMaxU()
	 * @see #getMaxU()
	 * @see #setMaxU(float)
	 * @generated
	 */
	public boolean isSetMaxU() {
		return maxUESet;
	}

	/**
	 * Returns the value of the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max P</em>' attribute.
	 * @see #isSetMaxP()
	 * @see #unsetMaxP()
	 * @see #setMaxP(float)
	 * @generated
	 */
	public float getMaxP() {
		return maxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #isSetMaxP()
	 * @see #unsetMaxP()
	 * @see #getMaxP()
	 * @generated
	 */
	public void setMaxP(float newMaxP) {
		maxP = newMaxP;
		maxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxP()
	 * @see #getMaxP()
	 * @see #setMaxP(float)
	 * @generated
	 */
	public void unsetMaxP() {
		maxP = MAX_P_EDEFAULT;
		maxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max P</em>' attribute is set.
	 * @see #unsetMaxP()
	 * @see #getMaxP()
	 * @see #setMaxP(float)
	 * @generated
	 */
	public boolean isSetMaxP() {
		return maxPESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min P</em>' attribute.
	 * @see #isSetMinP()
	 * @see #unsetMinP()
	 * @see #setMinP(float)
	 * @generated
	 */
	public float getMinP() {
		return minP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #isSetMinP()
	 * @see #unsetMinP()
	 * @see #getMinP()
	 * @generated
	 */
	public void setMinP(float newMinP) {
		minP = newMinP;
		minPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinP()
	 * @see #getMinP()
	 * @see #setMinP(float)
	 * @generated
	 */
	public void unsetMinP() {
		minP = MIN_P_EDEFAULT;
		minPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min P</em>' attribute is set.
	 * @see #unsetMinP()
	 * @see #getMinP()
	 * @see #setMinP(float)
	 * @generated
	 */
	public boolean isSetMinP() {
		return minPESet;
	}

	/**
	 * Returns the value of the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min U</em>' attribute.
	 * @see #isSetMinU()
	 * @see #unsetMinU()
	 * @see #setMinU(float)
	 * @generated
	 */
	public float getMinU() {
		return minU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min U</em>' attribute.
	 * @see #isSetMinU()
	 * @see #unsetMinU()
	 * @see #getMinU()
	 * @generated
	 */
	public void setMinU(float newMinU) {
		minU = newMinU;
		minUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinU()
	 * @see #getMinU()
	 * @see #setMinU(float)
	 * @generated
	 */
	public void unsetMinU() {
		minU = MIN_U_EDEFAULT;
		minUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min U</em>' attribute is set.
	 * @see #unsetMinU()
	 * @see #getMinU()
	 * @see #setMinU(float)
	 * @generated
	 */
	public boolean isSetMinU() {
		return minUESet;
	}

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see #isSetOperatingMode()
	 * @see #unsetOperatingMode()
	 * @see #setOperatingMode(String)
	 * @generated
	 */
	public String getOperatingMode() {
		return operatingMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see #isSetOperatingMode()
	 * @see #unsetOperatingMode()
	 * @see #getOperatingMode()
	 * @generated
	 */
	public void setOperatingMode(String newOperatingMode) {
		operatingMode = newOperatingMode;
		operatingModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperatingMode()
	 * @see #getOperatingMode()
	 * @see #setOperatingMode(String)
	 * @generated
	 */
	public void unsetOperatingMode() {
		operatingMode = OPERATING_MODE_EDEFAULT;
		operatingModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operating Mode</em>' attribute is set.
	 * @see #unsetOperatingMode()
	 * @see #getOperatingMode()
	 * @see #setOperatingMode(String)
	 * @generated
	 */
	public boolean isSetOperatingMode() {
		return operatingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				return getMaxU();
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				return getMaxP();
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				return getFrequency();
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				return getMinP();
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				return getMinU();
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				return getOperatingMode();
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
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				setMaxP((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				setMinP((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				setOperatingMode((String)newValue);
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
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				unsetMaxU();
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				unsetMaxP();
				return;
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				unsetFrequency();
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				unsetMinP();
				return;
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				unsetMinU();
				return;
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				unsetOperatingMode();
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
			case WiresPackage.FREQUENCY_CONVERTER__MAX_U:
				return isSetMaxU();
			case WiresPackage.FREQUENCY_CONVERTER__MAX_P:
				return isSetMaxP();
			case WiresPackage.FREQUENCY_CONVERTER__FREQUENCY:
				return isSetFrequency();
			case WiresPackage.FREQUENCY_CONVERTER__MIN_P:
				return isSetMinP();
			case WiresPackage.FREQUENCY_CONVERTER__MIN_U:
				return isSetMinU();
			case WiresPackage.FREQUENCY_CONVERTER__OPERATING_MODE:
				return isSetOperatingMode();
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
		result.append(" (maxU: ");
		if (maxUESet) result.append(maxU); else result.append("<unset>");
		result.append(", maxP: ");
		if (maxPESet) result.append(maxP); else result.append("<unset>");
		result.append(", frequency: ");
		if (frequencyESet) result.append(frequency); else result.append("<unset>");
		result.append(", minP: ");
		if (minPESet) result.append(minP); else result.append("<unset>");
		result.append(", minU: ");
		if (minUESet) result.append(minU); else result.append("<unset>");
		result.append(", operatingMode: ");
		if (operatingModeESet) result.append(operatingMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FrequencyConverter
