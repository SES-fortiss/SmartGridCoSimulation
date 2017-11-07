/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Wires.EnergyConsumer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadResponseCharacteristic extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float PFREQUENCY_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPFrequencyExponent() <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected float pFrequencyExponent = PFREQUENCY_EXPONENT_EDEFAULT;

	/**
	 * This is true if the PFrequency Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pFrequencyExponentESet;

	/**
	 * The default value of the '{@link #getPConstantPower() <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantPower()
	 * @generated
	 * @ordered
	 */
	protected static final float PCONSTANT_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPConstantPower() <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantPower()
	 * @generated
	 * @ordered
	 */
	protected float pConstantPower = PCONSTANT_POWER_EDEFAULT;

	/**
	 * This is true if the PConstant Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pConstantPowerESet;

	/**
	 * The default value of the '{@link #isExponentModel() <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExponentModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPONENT_MODEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExponentModel() <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExponentModel()
	 * @generated
	 * @ordered
	 */
	protected boolean exponentModel = EXPONENT_MODEL_EDEFAULT;

	/**
	 * This is true if the Exponent Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exponentModelESet;

	/**
	 * The default value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float QFREQUENCY_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQFrequencyExponent() <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQFrequencyExponent()
	 * @generated
	 * @ordered
	 */
	protected float qFrequencyExponent = QFREQUENCY_EXPONENT_EDEFAULT;

	/**
	 * This is true if the QFrequency Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qFrequencyExponentESet;

	/**
	 * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumer()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyConsumer> energyConsumer;

	/**
	 * The default value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float PVOLTAGE_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPVoltageExponent() <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected float pVoltageExponent = PVOLTAGE_EXPONENT_EDEFAULT;

	/**
	 * This is true if the PVoltage Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pVoltageExponentESet;

	/**
	 * The default value of the '{@link #getQConstantImpedance() <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float QCONSTANT_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQConstantImpedance() <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected float qConstantImpedance = QCONSTANT_IMPEDANCE_EDEFAULT;

	/**
	 * This is true if the QConstant Impedance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qConstantImpedanceESet;

	/**
	 * The default value of the '{@link #getQConstantPower() <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantPower()
	 * @generated
	 * @ordered
	 */
	protected static final float QCONSTANT_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQConstantPower() <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantPower()
	 * @generated
	 * @ordered
	 */
	protected float qConstantPower = QCONSTANT_POWER_EDEFAULT;

	/**
	 * This is true if the QConstant Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qConstantPowerESet;

	/**
	 * The default value of the '{@link #getPConstantImpedance() <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final float PCONSTANT_IMPEDANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPConstantImpedance() <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantImpedance()
	 * @generated
	 * @ordered
	 */
	protected float pConstantImpedance = PCONSTANT_IMPEDANCE_EDEFAULT;

	/**
	 * This is true if the PConstant Impedance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pConstantImpedanceESet;

	/**
	 * The default value of the '{@link #getPConstantCurrent() <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float PCONSTANT_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPConstantCurrent() <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected float pConstantCurrent = PCONSTANT_CURRENT_EDEFAULT;

	/**
	 * This is true if the PConstant Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pConstantCurrentESet;

	/**
	 * The default value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected static final float QVOLTAGE_EXPONENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQVoltageExponent() <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQVoltageExponent()
	 * @generated
	 * @ordered
	 */
	protected float qVoltageExponent = QVOLTAGE_EXPONENT_EDEFAULT;

	/**
	 * This is true if the QVoltage Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qVoltageExponentESet;

	/**
	 * The default value of the '{@link #getQConstantCurrent() <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float QCONSTANT_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQConstantCurrent() <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQConstantCurrent()
	 * @generated
	 * @ordered
	 */
	protected float qConstantCurrent = QCONSTANT_CURRENT_EDEFAULT;

	/**
	 * This is true if the QConstant Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qConstantCurrentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadResponseCharacteristic() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_RESPONSE_CHARACTERISTIC;
	}

	/**
	 * Returns the value of the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PFrequency Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PFrequency Exponent</em>' attribute.
	 * @see #isSetPFrequencyExponent()
	 * @see #unsetPFrequencyExponent()
	 * @see #setPFrequencyExponent(float)
	 * @generated
	 */
	public float getPFrequencyExponent() {
		return pFrequencyExponent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PFrequency Exponent</em>' attribute.
	 * @see #isSetPFrequencyExponent()
	 * @see #unsetPFrequencyExponent()
	 * @see #getPFrequencyExponent()
	 * @generated
	 */
	public void setPFrequencyExponent(float newPFrequencyExponent) {
		pFrequencyExponent = newPFrequencyExponent;
		pFrequencyExponentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPFrequencyExponent()
	 * @see #getPFrequencyExponent()
	 * @see #setPFrequencyExponent(float)
	 * @generated
	 */
	public void unsetPFrequencyExponent() {
		pFrequencyExponent = PFREQUENCY_EXPONENT_EDEFAULT;
		pFrequencyExponentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PFrequency Exponent</em>' attribute is set.
	 * @see #unsetPFrequencyExponent()
	 * @see #getPFrequencyExponent()
	 * @see #setPFrequencyExponent(float)
	 * @generated
	 */
	public boolean isSetPFrequencyExponent() {
		return pFrequencyExponentESet;
	}

	/**
	 * Returns the value of the '<em><b>PConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PConstant Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PConstant Power</em>' attribute.
	 * @see #isSetPConstantPower()
	 * @see #unsetPConstantPower()
	 * @see #setPConstantPower(float)
	 * @generated
	 */
	public float getPConstantPower() {
		return pConstantPower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PConstant Power</em>' attribute.
	 * @see #isSetPConstantPower()
	 * @see #unsetPConstantPower()
	 * @see #getPConstantPower()
	 * @generated
	 */
	public void setPConstantPower(float newPConstantPower) {
		pConstantPower = newPConstantPower;
		pConstantPowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPConstantPower()
	 * @see #getPConstantPower()
	 * @see #setPConstantPower(float)
	 * @generated
	 */
	public void unsetPConstantPower() {
		pConstantPower = PCONSTANT_POWER_EDEFAULT;
		pConstantPowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PConstant Power</em>' attribute is set.
	 * @see #unsetPConstantPower()
	 * @see #getPConstantPower()
	 * @see #setPConstantPower(float)
	 * @generated
	 */
	public boolean isSetPConstantPower() {
		return pConstantPowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Exponent Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent Model</em>' attribute.
	 * @see #isSetExponentModel()
	 * @see #unsetExponentModel()
	 * @see #setExponentModel(boolean)
	 * @generated
	 */
	public boolean isExponentModel() {
		return exponentModel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent Model</em>' attribute.
	 * @see #isSetExponentModel()
	 * @see #unsetExponentModel()
	 * @see #isExponentModel()
	 * @generated
	 */
	public void setExponentModel(boolean newExponentModel) {
		exponentModel = newExponentModel;
		exponentModelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExponentModel()
	 * @see #isExponentModel()
	 * @see #setExponentModel(boolean)
	 * @generated
	 */
	public void unsetExponentModel() {
		exponentModel = EXPONENT_MODEL_EDEFAULT;
		exponentModelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exponent Model</em>' attribute is set.
	 * @see #unsetExponentModel()
	 * @see #isExponentModel()
	 * @see #setExponentModel(boolean)
	 * @generated
	 */
	public boolean isSetExponentModel() {
		return exponentModelESet;
	}

	/**
	 * Returns the value of the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QFrequency Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QFrequency Exponent</em>' attribute.
	 * @see #isSetQFrequencyExponent()
	 * @see #unsetQFrequencyExponent()
	 * @see #setQFrequencyExponent(float)
	 * @generated
	 */
	public float getQFrequencyExponent() {
		return qFrequencyExponent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QFrequency Exponent</em>' attribute.
	 * @see #isSetQFrequencyExponent()
	 * @see #unsetQFrequencyExponent()
	 * @see #getQFrequencyExponent()
	 * @generated
	 */
	public void setQFrequencyExponent(float newQFrequencyExponent) {
		qFrequencyExponent = newQFrequencyExponent;
		qFrequencyExponentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQFrequencyExponent()
	 * @see #getQFrequencyExponent()
	 * @see #setQFrequencyExponent(float)
	 * @generated
	 */
	public void unsetQFrequencyExponent() {
		qFrequencyExponent = QFREQUENCY_EXPONENT_EDEFAULT;
		qFrequencyExponentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QFrequency Exponent</em>' attribute is set.
	 * @see #unsetQFrequencyExponent()
	 * @see #getQFrequencyExponent()
	 * @see #setQFrequencyExponent(float)
	 * @generated
	 */
	public boolean isSetQFrequencyExponent() {
		return qFrequencyExponentESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.EnergyConsumer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference list.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getLoadResponse
	 * @generated
	 */
	public EList<EnergyConsumer> getEnergyConsumer() {
		if (energyConsumer == null) {
			energyConsumer = new BasicInternalEList<EnergyConsumer>(EnergyConsumer.class);
		}
		return energyConsumer;
	}

	/**
	 * Returns the value of the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PVoltage Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PVoltage Exponent</em>' attribute.
	 * @see #isSetPVoltageExponent()
	 * @see #unsetPVoltageExponent()
	 * @see #setPVoltageExponent(float)
	 * @generated
	 */
	public float getPVoltageExponent() {
		return pVoltageExponent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PVoltage Exponent</em>' attribute.
	 * @see #isSetPVoltageExponent()
	 * @see #unsetPVoltageExponent()
	 * @see #getPVoltageExponent()
	 * @generated
	 */
	public void setPVoltageExponent(float newPVoltageExponent) {
		pVoltageExponent = newPVoltageExponent;
		pVoltageExponentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPVoltageExponent()
	 * @see #getPVoltageExponent()
	 * @see #setPVoltageExponent(float)
	 * @generated
	 */
	public void unsetPVoltageExponent() {
		pVoltageExponent = PVOLTAGE_EXPONENT_EDEFAULT;
		pVoltageExponentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PVoltage Exponent</em>' attribute is set.
	 * @see #unsetPVoltageExponent()
	 * @see #getPVoltageExponent()
	 * @see #setPVoltageExponent(float)
	 * @generated
	 */
	public boolean isSetPVoltageExponent() {
		return pVoltageExponentESet;
	}

	/**
	 * Returns the value of the '<em><b>QConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QConstant Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QConstant Impedance</em>' attribute.
	 * @see #isSetQConstantImpedance()
	 * @see #unsetQConstantImpedance()
	 * @see #setQConstantImpedance(float)
	 * @generated
	 */
	public float getQConstantImpedance() {
		return qConstantImpedance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QConstant Impedance</em>' attribute.
	 * @see #isSetQConstantImpedance()
	 * @see #unsetQConstantImpedance()
	 * @see #getQConstantImpedance()
	 * @generated
	 */
	public void setQConstantImpedance(float newQConstantImpedance) {
		qConstantImpedance = newQConstantImpedance;
		qConstantImpedanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQConstantImpedance()
	 * @see #getQConstantImpedance()
	 * @see #setQConstantImpedance(float)
	 * @generated
	 */
	public void unsetQConstantImpedance() {
		qConstantImpedance = QCONSTANT_IMPEDANCE_EDEFAULT;
		qConstantImpedanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QConstant Impedance</em>' attribute is set.
	 * @see #unsetQConstantImpedance()
	 * @see #getQConstantImpedance()
	 * @see #setQConstantImpedance(float)
	 * @generated
	 */
	public boolean isSetQConstantImpedance() {
		return qConstantImpedanceESet;
	}

	/**
	 * Returns the value of the '<em><b>QConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QConstant Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QConstant Power</em>' attribute.
	 * @see #isSetQConstantPower()
	 * @see #unsetQConstantPower()
	 * @see #setQConstantPower(float)
	 * @generated
	 */
	public float getQConstantPower() {
		return qConstantPower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QConstant Power</em>' attribute.
	 * @see #isSetQConstantPower()
	 * @see #unsetQConstantPower()
	 * @see #getQConstantPower()
	 * @generated
	 */
	public void setQConstantPower(float newQConstantPower) {
		qConstantPower = newQConstantPower;
		qConstantPowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQConstantPower()
	 * @see #getQConstantPower()
	 * @see #setQConstantPower(float)
	 * @generated
	 */
	public void unsetQConstantPower() {
		qConstantPower = QCONSTANT_POWER_EDEFAULT;
		qConstantPowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QConstant Power</em>' attribute is set.
	 * @see #unsetQConstantPower()
	 * @see #getQConstantPower()
	 * @see #setQConstantPower(float)
	 * @generated
	 */
	public boolean isSetQConstantPower() {
		return qConstantPowerESet;
	}

	/**
	 * Returns the value of the '<em><b>PConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PConstant Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PConstant Impedance</em>' attribute.
	 * @see #isSetPConstantImpedance()
	 * @see #unsetPConstantImpedance()
	 * @see #setPConstantImpedance(float)
	 * @generated
	 */
	public float getPConstantImpedance() {
		return pConstantImpedance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PConstant Impedance</em>' attribute.
	 * @see #isSetPConstantImpedance()
	 * @see #unsetPConstantImpedance()
	 * @see #getPConstantImpedance()
	 * @generated
	 */
	public void setPConstantImpedance(float newPConstantImpedance) {
		pConstantImpedance = newPConstantImpedance;
		pConstantImpedanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPConstantImpedance()
	 * @see #getPConstantImpedance()
	 * @see #setPConstantImpedance(float)
	 * @generated
	 */
	public void unsetPConstantImpedance() {
		pConstantImpedance = PCONSTANT_IMPEDANCE_EDEFAULT;
		pConstantImpedanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PConstant Impedance</em>' attribute is set.
	 * @see #unsetPConstantImpedance()
	 * @see #getPConstantImpedance()
	 * @see #setPConstantImpedance(float)
	 * @generated
	 */
	public boolean isSetPConstantImpedance() {
		return pConstantImpedanceESet;
	}

	/**
	 * Returns the value of the '<em><b>PConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PConstant Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PConstant Current</em>' attribute.
	 * @see #isSetPConstantCurrent()
	 * @see #unsetPConstantCurrent()
	 * @see #setPConstantCurrent(float)
	 * @generated
	 */
	public float getPConstantCurrent() {
		return pConstantCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PConstant Current</em>' attribute.
	 * @see #isSetPConstantCurrent()
	 * @see #unsetPConstantCurrent()
	 * @see #getPConstantCurrent()
	 * @generated
	 */
	public void setPConstantCurrent(float newPConstantCurrent) {
		pConstantCurrent = newPConstantCurrent;
		pConstantCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPConstantCurrent()
	 * @see #getPConstantCurrent()
	 * @see #setPConstantCurrent(float)
	 * @generated
	 */
	public void unsetPConstantCurrent() {
		pConstantCurrent = PCONSTANT_CURRENT_EDEFAULT;
		pConstantCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PConstant Current</em>' attribute is set.
	 * @see #unsetPConstantCurrent()
	 * @see #getPConstantCurrent()
	 * @see #setPConstantCurrent(float)
	 * @generated
	 */
	public boolean isSetPConstantCurrent() {
		return pConstantCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QVoltage Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QVoltage Exponent</em>' attribute.
	 * @see #isSetQVoltageExponent()
	 * @see #unsetQVoltageExponent()
	 * @see #setQVoltageExponent(float)
	 * @generated
	 */
	public float getQVoltageExponent() {
		return qVoltageExponent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QVoltage Exponent</em>' attribute.
	 * @see #isSetQVoltageExponent()
	 * @see #unsetQVoltageExponent()
	 * @see #getQVoltageExponent()
	 * @generated
	 */
	public void setQVoltageExponent(float newQVoltageExponent) {
		qVoltageExponent = newQVoltageExponent;
		qVoltageExponentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQVoltageExponent()
	 * @see #getQVoltageExponent()
	 * @see #setQVoltageExponent(float)
	 * @generated
	 */
	public void unsetQVoltageExponent() {
		qVoltageExponent = QVOLTAGE_EXPONENT_EDEFAULT;
		qVoltageExponentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QVoltage Exponent</em>' attribute is set.
	 * @see #unsetQVoltageExponent()
	 * @see #getQVoltageExponent()
	 * @see #setQVoltageExponent(float)
	 * @generated
	 */
	public boolean isSetQVoltageExponent() {
		return qVoltageExponentESet;
	}

	/**
	 * Returns the value of the '<em><b>QConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QConstant Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QConstant Current</em>' attribute.
	 * @see #isSetQConstantCurrent()
	 * @see #unsetQConstantCurrent()
	 * @see #setQConstantCurrent(float)
	 * @generated
	 */
	public float getQConstantCurrent() {
		return qConstantCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QConstant Current</em>' attribute.
	 * @see #isSetQConstantCurrent()
	 * @see #unsetQConstantCurrent()
	 * @see #getQConstantCurrent()
	 * @generated
	 */
	public void setQConstantCurrent(float newQConstantCurrent) {
		qConstantCurrent = newQConstantCurrent;
		qConstantCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQConstantCurrent()
	 * @see #getQConstantCurrent()
	 * @see #setQConstantCurrent(float)
	 * @generated
	 */
	public void unsetQConstantCurrent() {
		qConstantCurrent = QCONSTANT_CURRENT_EDEFAULT;
		qConstantCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QConstant Current</em>' attribute is set.
	 * @see #unsetQConstantCurrent()
	 * @see #getQConstantCurrent()
	 * @see #setQConstantCurrent(float)
	 * @generated
	 */
	public boolean isSetQConstantCurrent() {
		return qConstantCurrentESet;
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumer()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return ((InternalEList<?>)getEnergyConsumer()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				return getPFrequencyExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				return getPConstantPower();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				return isExponentModel();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				return getQFrequencyExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return getEnergyConsumer();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				return getPVoltageExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				return getQConstantImpedance();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				return getQConstantPower();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				return getPConstantImpedance();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				return getPConstantCurrent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				return getQVoltageExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				return getQConstantCurrent();
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				setPFrequencyExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				setPConstantPower((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				setExponentModel((Boolean)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				setQFrequencyExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				getEnergyConsumer().clear();
				getEnergyConsumer().addAll((Collection<? extends EnergyConsumer>)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				setPVoltageExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				setQConstantImpedance((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				setQConstantPower((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				setPConstantImpedance((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				setPConstantCurrent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				setQVoltageExponent((Float)newValue);
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				setQConstantCurrent((Float)newValue);
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				unsetPFrequencyExponent();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				unsetPConstantPower();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				unsetExponentModel();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				unsetQFrequencyExponent();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				getEnergyConsumer().clear();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				unsetPVoltageExponent();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				unsetQConstantImpedance();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				unsetQConstantPower();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				unsetPConstantImpedance();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				unsetPConstantCurrent();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				unsetQVoltageExponent();
				return;
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				unsetQConstantCurrent();
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
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
				return isSetPFrequencyExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
				return isSetPConstantPower();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
				return isSetExponentModel();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
				return isSetQFrequencyExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER:
				return energyConsumer != null && !energyConsumer.isEmpty();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
				return isSetPVoltageExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
				return isSetQConstantImpedance();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
				return isSetQConstantPower();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
				return isSetPConstantImpedance();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
				return isSetPConstantCurrent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
				return isSetQVoltageExponent();
			case LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
				return isSetQConstantCurrent();
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
		result.append(" (pFrequencyExponent: ");
		if (pFrequencyExponentESet) result.append(pFrequencyExponent); else result.append("<unset>");
		result.append(", pConstantPower: ");
		if (pConstantPowerESet) result.append(pConstantPower); else result.append("<unset>");
		result.append(", exponentModel: ");
		if (exponentModelESet) result.append(exponentModel); else result.append("<unset>");
		result.append(", qFrequencyExponent: ");
		if (qFrequencyExponentESet) result.append(qFrequencyExponent); else result.append("<unset>");
		result.append(", pVoltageExponent: ");
		if (pVoltageExponentESet) result.append(pVoltageExponent); else result.append("<unset>");
		result.append(", qConstantImpedance: ");
		if (qConstantImpedanceESet) result.append(qConstantImpedance); else result.append("<unset>");
		result.append(", qConstantPower: ");
		if (qConstantPowerESet) result.append(qConstantPower); else result.append("<unset>");
		result.append(", pConstantImpedance: ");
		if (pConstantImpedanceESet) result.append(pConstantImpedance); else result.append("<unset>");
		result.append(", pConstantCurrent: ");
		if (pConstantCurrentESet) result.append(pConstantCurrent); else result.append("<unset>");
		result.append(", qVoltageExponent: ");
		if (qVoltageExponentESet) result.append(qVoltageExponent); else result.append("<unset>");
		result.append(", qConstantCurrent: ");
		if (qConstantCurrentESet) result.append(qConstantCurrent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LoadResponseCharacteristic
