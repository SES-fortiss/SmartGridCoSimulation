/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.ConductingEquipment;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectifier Inverter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectifierInverter extends ConductingEquipment {
	/**
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected float ratedU = RATED_U_EDEFAULT;

	/**
	 * This is true if the Rated U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedUESet;

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
	 * The default value of the '{@link #getBridges() <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridges()
	 * @generated
	 * @ordered
	 */
	protected static final int BRIDGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBridges() <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridges()
	 * @generated
	 * @ordered
	 */
	protected int bridges = BRIDGES_EDEFAULT;

	/**
	 * This is true if the Bridges attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bridgesESet;

	/**
	 * The default value of the '{@link #getCompoundResistance() <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMPOUND_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCompoundResistance() <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundResistance()
	 * @generated
	 * @ordered
	 */
	protected float compoundResistance = COMPOUND_RESISTANCE_EDEFAULT;

	/**
	 * This is true if the Compound Resistance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compoundResistanceESet;

	/**
	 * The default value of the '{@link #getCommutatingResistance() <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMMUTATING_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCommutatingResistance() <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingResistance()
	 * @generated
	 * @ordered
	 */
	protected float commutatingResistance = COMMUTATING_RESISTANCE_EDEFAULT;

	/**
	 * This is true if the Commutating Resistance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commutatingResistanceESet;

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
	 * The default value of the '{@link #getCommutatingReactance() <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingReactance()
	 * @generated
	 * @ordered
	 */
	protected static final float COMMUTATING_REACTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCommutatingReactance() <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommutatingReactance()
	 * @generated
	 * @ordered
	 */
	protected float commutatingReactance = COMMUTATING_REACTANCE_EDEFAULT;

	/**
	 * This is true if the Commutating Reactance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commutatingReactanceESet;

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
	 * The default value of the '{@link #getMinCompoundVoltage() <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCompoundVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_COMPOUND_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinCompoundVoltage() <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCompoundVoltage()
	 * @generated
	 * @ordered
	 */
	protected float minCompoundVoltage = MIN_COMPOUND_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Min Compound Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minCompoundVoltageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectifierInverter() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RECTIFIER_INVERTER;
	}

	/**
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #isSetRatedU()
	 * @see #unsetRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public float getRatedU() {
		return ratedU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #isSetRatedU()
	 * @see #unsetRatedU()
	 * @see #getRatedU()
	 * @generated
	 */
	public void setRatedU(float newRatedU) {
		ratedU = newRatedU;
		ratedUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedU()
	 * @see #getRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public void unsetRatedU() {
		ratedU = RATED_U_EDEFAULT;
		ratedUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated U</em>' attribute is set.
	 * @see #unsetRatedU()
	 * @see #getRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public boolean isSetRatedU() {
		return ratedUESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Bridges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridges</em>' attribute.
	 * @see #isSetBridges()
	 * @see #unsetBridges()
	 * @see #setBridges(int)
	 * @generated
	 */
	public int getBridges() {
		return bridges;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridges</em>' attribute.
	 * @see #isSetBridges()
	 * @see #unsetBridges()
	 * @see #getBridges()
	 * @generated
	 */
	public void setBridges(int newBridges) {
		bridges = newBridges;
		bridgesESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBridges()
	 * @see #getBridges()
	 * @see #setBridges(int)
	 * @generated
	 */
	public void unsetBridges() {
		bridges = BRIDGES_EDEFAULT;
		bridgesESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bridges</em>' attribute is set.
	 * @see #unsetBridges()
	 * @see #getBridges()
	 * @see #setBridges(int)
	 * @generated
	 */
	public boolean isSetBridges() {
		return bridgesESet;
	}

	/**
	 * Returns the value of the '<em><b>Compound Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Resistance</em>' attribute.
	 * @see #isSetCompoundResistance()
	 * @see #unsetCompoundResistance()
	 * @see #setCompoundResistance(float)
	 * @generated
	 */
	public float getCompoundResistance() {
		return compoundResistance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Resistance</em>' attribute.
	 * @see #isSetCompoundResistance()
	 * @see #unsetCompoundResistance()
	 * @see #getCompoundResistance()
	 * @generated
	 */
	public void setCompoundResistance(float newCompoundResistance) {
		compoundResistance = newCompoundResistance;
		compoundResistanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompoundResistance()
	 * @see #getCompoundResistance()
	 * @see #setCompoundResistance(float)
	 * @generated
	 */
	public void unsetCompoundResistance() {
		compoundResistance = COMPOUND_RESISTANCE_EDEFAULT;
		compoundResistanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compound Resistance</em>' attribute is set.
	 * @see #unsetCompoundResistance()
	 * @see #getCompoundResistance()
	 * @see #setCompoundResistance(float)
	 * @generated
	 */
	public boolean isSetCompoundResistance() {
		return compoundResistanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Commutating Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commutating Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commutating Resistance</em>' attribute.
	 * @see #isSetCommutatingResistance()
	 * @see #unsetCommutatingResistance()
	 * @see #setCommutatingResistance(float)
	 * @generated
	 */
	public float getCommutatingResistance() {
		return commutatingResistance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commutating Resistance</em>' attribute.
	 * @see #isSetCommutatingResistance()
	 * @see #unsetCommutatingResistance()
	 * @see #getCommutatingResistance()
	 * @generated
	 */
	public void setCommutatingResistance(float newCommutatingResistance) {
		commutatingResistance = newCommutatingResistance;
		commutatingResistanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommutatingResistance()
	 * @see #getCommutatingResistance()
	 * @see #setCommutatingResistance(float)
	 * @generated
	 */
	public void unsetCommutatingResistance() {
		commutatingResistance = COMMUTATING_RESISTANCE_EDEFAULT;
		commutatingResistanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Commutating Resistance</em>' attribute is set.
	 * @see #unsetCommutatingResistance()
	 * @see #getCommutatingResistance()
	 * @see #setCommutatingResistance(float)
	 * @generated
	 */
	public boolean isSetCommutatingResistance() {
		return commutatingResistanceESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Commutating Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commutating Reactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commutating Reactance</em>' attribute.
	 * @see #isSetCommutatingReactance()
	 * @see #unsetCommutatingReactance()
	 * @see #setCommutatingReactance(float)
	 * @generated
	 */
	public float getCommutatingReactance() {
		return commutatingReactance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commutating Reactance</em>' attribute.
	 * @see #isSetCommutatingReactance()
	 * @see #unsetCommutatingReactance()
	 * @see #getCommutatingReactance()
	 * @generated
	 */
	public void setCommutatingReactance(float newCommutatingReactance) {
		commutatingReactance = newCommutatingReactance;
		commutatingReactanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommutatingReactance()
	 * @see #getCommutatingReactance()
	 * @see #setCommutatingReactance(float)
	 * @generated
	 */
	public void unsetCommutatingReactance() {
		commutatingReactance = COMMUTATING_REACTANCE_EDEFAULT;
		commutatingReactanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Commutating Reactance</em>' attribute is set.
	 * @see #unsetCommutatingReactance()
	 * @see #getCommutatingReactance()
	 * @see #setCommutatingReactance(float)
	 * @generated
	 */
	public boolean isSetCommutatingReactance() {
		return commutatingReactanceESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Min Compound Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Compound Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Compound Voltage</em>' attribute.
	 * @see #isSetMinCompoundVoltage()
	 * @see #unsetMinCompoundVoltage()
	 * @see #setMinCompoundVoltage(float)
	 * @generated
	 */
	public float getMinCompoundVoltage() {
		return minCompoundVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Compound Voltage</em>' attribute.
	 * @see #isSetMinCompoundVoltage()
	 * @see #unsetMinCompoundVoltage()
	 * @see #getMinCompoundVoltage()
	 * @generated
	 */
	public void setMinCompoundVoltage(float newMinCompoundVoltage) {
		minCompoundVoltage = newMinCompoundVoltage;
		minCompoundVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinCompoundVoltage()
	 * @see #getMinCompoundVoltage()
	 * @see #setMinCompoundVoltage(float)
	 * @generated
	 */
	public void unsetMinCompoundVoltage() {
		minCompoundVoltage = MIN_COMPOUND_VOLTAGE_EDEFAULT;
		minCompoundVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Compound Voltage</em>' attribute is set.
	 * @see #unsetMinCompoundVoltage()
	 * @see #getMinCompoundVoltage()
	 * @see #setMinCompoundVoltage(float)
	 * @generated
	 */
	public boolean isSetMinCompoundVoltage() {
		return minCompoundVoltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				return getRatedU();
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				return getMaxU();
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				return getBridges();
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				return getCompoundResistance();
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				return getCommutatingResistance();
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				return getMinP();
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				return getOperatingMode();
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				return getMinU();
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				return getCommutatingReactance();
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				return getMaxP();
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				return getFrequency();
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				return getMinCompoundVoltage();
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
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				setRatedU((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				setBridges((Integer)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				setCompoundResistance((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				setCommutatingResistance((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				setMinP((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				setOperatingMode((String)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				setCommutatingReactance((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				setMaxP((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				setMinCompoundVoltage((Float)newValue);
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
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				unsetRatedU();
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				unsetMaxU();
				return;
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				unsetBridges();
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				unsetCompoundResistance();
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				unsetCommutatingResistance();
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				unsetMinP();
				return;
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				unsetOperatingMode();
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				unsetMinU();
				return;
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				unsetCommutatingReactance();
				return;
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				unsetMaxP();
				return;
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				unsetFrequency();
				return;
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				unsetMinCompoundVoltage();
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
			case WiresPackage.RECTIFIER_INVERTER__RATED_U:
				return isSetRatedU();
			case WiresPackage.RECTIFIER_INVERTER__MAX_U:
				return isSetMaxU();
			case WiresPackage.RECTIFIER_INVERTER__BRIDGES:
				return isSetBridges();
			case WiresPackage.RECTIFIER_INVERTER__COMPOUND_RESISTANCE:
				return isSetCompoundResistance();
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_RESISTANCE:
				return isSetCommutatingResistance();
			case WiresPackage.RECTIFIER_INVERTER__MIN_P:
				return isSetMinP();
			case WiresPackage.RECTIFIER_INVERTER__OPERATING_MODE:
				return isSetOperatingMode();
			case WiresPackage.RECTIFIER_INVERTER__MIN_U:
				return isSetMinU();
			case WiresPackage.RECTIFIER_INVERTER__COMMUTATING_REACTANCE:
				return isSetCommutatingReactance();
			case WiresPackage.RECTIFIER_INVERTER__MAX_P:
				return isSetMaxP();
			case WiresPackage.RECTIFIER_INVERTER__FREQUENCY:
				return isSetFrequency();
			case WiresPackage.RECTIFIER_INVERTER__MIN_COMPOUND_VOLTAGE:
				return isSetMinCompoundVoltage();
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
		result.append(" (ratedU: ");
		if (ratedUESet) result.append(ratedU); else result.append("<unset>");
		result.append(", maxU: ");
		if (maxUESet) result.append(maxU); else result.append("<unset>");
		result.append(", bridges: ");
		if (bridgesESet) result.append(bridges); else result.append("<unset>");
		result.append(", compoundResistance: ");
		if (compoundResistanceESet) result.append(compoundResistance); else result.append("<unset>");
		result.append(", commutatingResistance: ");
		if (commutatingResistanceESet) result.append(commutatingResistance); else result.append("<unset>");
		result.append(", minP: ");
		if (minPESet) result.append(minP); else result.append("<unset>");
		result.append(", operatingMode: ");
		if (operatingModeESet) result.append(operatingMode); else result.append("<unset>");
		result.append(", minU: ");
		if (minUESet) result.append(minU); else result.append("<unset>");
		result.append(", commutatingReactance: ");
		if (commutatingReactanceESet) result.append(commutatingReactance); else result.append("<unset>");
		result.append(", maxP: ");
		if (maxPESet) result.append(maxP); else result.append("<unset>");
		result.append(", frequency: ");
		if (frequencyESet) result.append(frequency); else result.append("<unset>");
		result.append(", minCompoundVoltage: ");
		if (minCompoundVoltageESet) result.append(minCompoundVoltage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RectifierInverter
