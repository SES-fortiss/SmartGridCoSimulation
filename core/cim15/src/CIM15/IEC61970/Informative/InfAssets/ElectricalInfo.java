/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Core.PhaseCode;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectricalInfo extends AssetInfo {
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
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

	/**
	 * This is true if the R0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean r0ESet;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

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
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * This is true if the X0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x0ESet;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

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
	 * The default value of the '{@link #getWireCount() <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireCount()
	 * @generated
	 * @ordered
	 */
	protected static final int WIRE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWireCount() <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireCount()
	 * @generated
	 * @ordered
	 */
	protected int wireCount = WIRE_COUNT_EDEFAULT;

	/**
	 * This is true if the Wire Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wireCountESet;

	/**
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected float b0 = B0_EDEFAULT;

	/**
	 * This is true if the B0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean b0ESet;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

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
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final float G_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected float g = G_EDEFAULT;

	/**
	 * This is true if the G attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gESet;

	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected float g0 = G0_EDEFAULT;

	/**
	 * This is true if the G0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean g0ESet;

	/**
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnected = IS_CONNECTED_EDEFAULT;

	/**
	 * This is true if the Is Connected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConnectedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getElectricalInfo();
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #isSetR0()
	 * @see #unsetR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #isSetR0()
	 * @see #unsetR0()
	 * @see #getR0()
	 * @generated
	 */
	public void setR0(float newR0) {
		r0 = newR0;
		r0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR0()
	 * @see #getR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public void unsetR0() {
		r0 = R0_EDEFAULT;
		r0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R0</em>' attribute is set.
	 * @see #unsetR0()
	 * @see #getR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public boolean isSetR0() {
		return r0ESet;
	}

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(float)
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	public void setR(float newR) {
		r = newR;
		rESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public void unsetR() {
		r = R_EDEFAULT;
		rESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #isSetX0()
	 * @see #unsetX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #isSetX0()
	 * @see #unsetX0()
	 * @see #getX0()
	 * @generated
	 */
	public void setX0(float newX0) {
		x0 = newX0;
		x0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX0()
	 * @see #getX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public void unsetX0() {
		x0 = X0_EDEFAULT;
		x0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X0</em>' attribute is set.
	 * @see #unsetX0()
	 * @see #getX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public boolean isSetX0() {
		return x0ESet;
	}

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	public void setX(float newX) {
		x = newX;
		xESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public void unsetX() {
		x = X_EDEFAULT;
		xESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Count</em>' attribute.
	 * @see #isSetWireCount()
	 * @see #unsetWireCount()
	 * @see #setWireCount(int)
	 * @generated
	 */
	public int getWireCount() {
		return wireCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Count</em>' attribute.
	 * @see #isSetWireCount()
	 * @see #unsetWireCount()
	 * @see #getWireCount()
	 * @generated
	 */
	public void setWireCount(int newWireCount) {
		wireCount = newWireCount;
		wireCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWireCount()
	 * @see #getWireCount()
	 * @see #setWireCount(int)
	 * @generated
	 */
	public void unsetWireCount() {
		wireCount = WIRE_COUNT_EDEFAULT;
		wireCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wire Count</em>' attribute is set.
	 * @see #unsetWireCount()
	 * @see #getWireCount()
	 * @see #setWireCount(int)
	 * @generated
	 */
	public boolean isSetWireCount() {
		return wireCountESet;
	}

	/**
	 * Returns the value of the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0</em>' attribute.
	 * @see #isSetB0()
	 * @see #unsetB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public float getB0() {
		return b0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #isSetB0()
	 * @see #unsetB0()
	 * @see #getB0()
	 * @generated
	 */
	public void setB0(float newB0) {
		b0 = newB0;
		b0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB0()
	 * @see #getB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public void unsetB0() {
		b0 = B0_EDEFAULT;
		b0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B0</em>' attribute is set.
	 * @see #unsetB0()
	 * @see #getB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public boolean isSetB0() {
		return b0ESet;
	}

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #setB(float)
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #getB()
	 * @generated
	 */
	public void setB(float newB) {
		b = newB;
		bESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public void unsetB() {
		b = B_EDEFAULT;
		bESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B</em>' attribute is set.
	 * @see #unsetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #isSetG()
	 * @see #unsetG()
	 * @see #setG(float)
	 * @generated
	 */
	public float getG() {
		return g;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #isSetG()
	 * @see #unsetG()
	 * @see #getG()
	 * @generated
	 */
	public void setG(float newG) {
		g = newG;
		gESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG()
	 * @see #getG()
	 * @see #setG(float)
	 * @generated
	 */
	public void unsetG() {
		g = G_EDEFAULT;
		gESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G</em>' attribute is set.
	 * @see #unsetG()
	 * @see #getG()
	 * @see #setG(float)
	 * @generated
	 */
	public boolean isSetG() {
		return gESet;
	}

	/**
	 * Returns the value of the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0</em>' attribute.
	 * @see #isSetG0()
	 * @see #unsetG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public float getG0() {
		return g0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #isSetG0()
	 * @see #unsetG0()
	 * @see #getG0()
	 * @generated
	 */
	public void setG0(float newG0) {
		g0 = newG0;
		g0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG0()
	 * @see #getG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public void unsetG0() {
		g0 = G0_EDEFAULT;
		g0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G0</em>' attribute is set.
	 * @see #unsetG0()
	 * @see #getG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public boolean isSetG0() {
		return g0ESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see #isSetIsConnected()
	 * @see #unsetIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	public boolean isIsConnected() {
		return isConnected;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' attribute.
	 * @see #isSetIsConnected()
	 * @see #unsetIsConnected()
	 * @see #isIsConnected()
	 * @generated
	 */
	public void setIsConnected(boolean newIsConnected) {
		isConnected = newIsConnected;
		isConnectedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConnected()
	 * @see #isIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	public void unsetIsConnected() {
		isConnected = IS_CONNECTED_EDEFAULT;
		isConnectedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Connected</em>' attribute is set.
	 * @see #unsetIsConnected()
	 * @see #isIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	public boolean isSetIsConnected() {
		return isConnectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				return getPhaseCount();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				return getRatedApparentPower();
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				return getPhaseCode();
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				return getFrequency();
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				return getR0();
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				return getR();
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				return getBil();
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				return getX0();
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				return getX();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				return getRatedCurrent();
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				return getWireCount();
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				return getB0();
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				return getB();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				return getRatedVoltage();
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				return getG();
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				return getG0();
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				return isIsConnected();
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
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				setRatedApparentPower((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				setR0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				setR((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				setBil((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				setX0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				setX((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				setWireCount((Integer)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				setB0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				setB((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				setG((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				setG0((Float)newValue);
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
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
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				unsetPhaseCount();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				unsetRatedApparentPower();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				unsetPhaseCode();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				unsetFrequency();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				unsetR0();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				unsetR();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				unsetBil();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				unsetX0();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				unsetX();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				unsetRatedCurrent();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				unsetWireCount();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				unsetB0();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				unsetB();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				unsetRatedVoltage();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				unsetG();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				unsetG0();
				return;
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				unsetIsConnected();
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
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_COUNT:
				return isSetPhaseCount();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_APPARENT_POWER:
				return isSetRatedApparentPower();
			case InfAssetsPackage.ELECTRICAL_INFO__PHASE_CODE:
				return isSetPhaseCode();
			case InfAssetsPackage.ELECTRICAL_INFO__FREQUENCY:
				return isSetFrequency();
			case InfAssetsPackage.ELECTRICAL_INFO__R0:
				return isSetR0();
			case InfAssetsPackage.ELECTRICAL_INFO__R:
				return isSetR();
			case InfAssetsPackage.ELECTRICAL_INFO__BIL:
				return isSetBil();
			case InfAssetsPackage.ELECTRICAL_INFO__X0:
				return isSetX0();
			case InfAssetsPackage.ELECTRICAL_INFO__X:
				return isSetX();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_CURRENT:
				return isSetRatedCurrent();
			case InfAssetsPackage.ELECTRICAL_INFO__WIRE_COUNT:
				return isSetWireCount();
			case InfAssetsPackage.ELECTRICAL_INFO__B0:
				return isSetB0();
			case InfAssetsPackage.ELECTRICAL_INFO__B:
				return isSetB();
			case InfAssetsPackage.ELECTRICAL_INFO__RATED_VOLTAGE:
				return isSetRatedVoltage();
			case InfAssetsPackage.ELECTRICAL_INFO__G:
				return isSetG();
			case InfAssetsPackage.ELECTRICAL_INFO__G0:
				return isSetG0();
			case InfAssetsPackage.ELECTRICAL_INFO__IS_CONNECTED:
				return isSetIsConnected();
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
		result.append(" (phaseCount: ");
		if (phaseCountESet) result.append(phaseCount); else result.append("<unset>");
		result.append(", ratedApparentPower: ");
		if (ratedApparentPowerESet) result.append(ratedApparentPower); else result.append("<unset>");
		result.append(", phaseCode: ");
		if (phaseCodeESet) result.append(phaseCode); else result.append("<unset>");
		result.append(", frequency: ");
		if (frequencyESet) result.append(frequency); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", bil: ");
		if (bilESet) result.append(bil); else result.append("<unset>");
		result.append(", x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", ratedCurrent: ");
		if (ratedCurrentESet) result.append(ratedCurrent); else result.append("<unset>");
		result.append(", wireCount: ");
		if (wireCountESet) result.append(wireCount); else result.append("<unset>");
		result.append(", b0: ");
		if (b0ESet) result.append(b0); else result.append("<unset>");
		result.append(", b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(", ratedVoltage: ");
		if (ratedVoltageESet) result.append(ratedVoltage); else result.append("<unset>");
		result.append(", g: ");
		if (gESet) result.append(g); else result.append("<unset>");
		result.append(", g0: ");
		if (g0ESet) result.append(g0); else result.append("<unset>");
		result.append(", isConnected: ");
		if (isConnectedESet) result.append(isConnected); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ElectricalInfo
