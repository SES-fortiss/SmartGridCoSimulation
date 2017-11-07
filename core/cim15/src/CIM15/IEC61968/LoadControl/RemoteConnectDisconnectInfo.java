/**
 */
package CIM15.IEC61968.LoadControl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Connect Disconnect Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteConnectDisconnectInfo extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #isIsArmConnect() <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmConnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARM_CONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsArmConnect() <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmConnect()
	 * @generated
	 * @ordered
	 */
	protected boolean isArmConnect = IS_ARM_CONNECT_EDEFAULT;

	/**
	 * This is true if the Is Arm Connect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isArmConnectESet;

	/**
	 * The default value of the '{@link #getEnergyUsageWarning() <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageWarning()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_USAGE_WARNING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyUsageWarning() <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageWarning()
	 * @generated
	 * @ordered
	 */
	protected float energyUsageWarning = ENERGY_USAGE_WARNING_EDEFAULT;

	/**
	 * This is true if the Energy Usage Warning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyUsageWarningESet;

	/**
	 * The default value of the '{@link #isNeedsVoltageLimitCheck() <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsVoltageLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsVoltageLimitCheck() <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsVoltageLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean needsVoltageLimitCheck = NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT;

	/**
	 * This is true if the Needs Voltage Limit Check attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needsVoltageLimitCheckESet;

	/**
	 * The default value of the '{@link #getCustomerVoltageLimit() <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float CUSTOMER_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCustomerVoltageLimit() <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected float customerVoltageLimit = CUSTOMER_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * This is true if the Customer Voltage Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customerVoltageLimitESet;

	/**
	 * The default value of the '{@link #isIsArmDisconnect() <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmDisconnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ARM_DISCONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsArmDisconnect() <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsArmDisconnect()
	 * @generated
	 * @ordered
	 */
	protected boolean isArmDisconnect = IS_ARM_DISCONNECT_EDEFAULT;

	/**
	 * This is true if the Is Arm Disconnect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isArmDisconnectESet;

	/**
	 * The default value of the '{@link #isIsEnergyLimiting() <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnergyLimiting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENERGY_LIMITING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnergyLimiting() <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnergyLimiting()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnergyLimiting = IS_ENERGY_LIMITING_EDEFAULT;

	/**
	 * This is true if the Is Energy Limiting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isEnergyLimitingESet;

	/**
	 * The default value of the '{@link #getArmedTimeout() <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmedTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final float ARMED_TIMEOUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArmedTimeout() <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmedTimeout()
	 * @generated
	 * @ordered
	 */
	protected float armedTimeout = ARMED_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Armed Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean armedTimeoutESet;

	/**
	 * The default value of the '{@link #getPowerLimit() <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerLimit() <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected float powerLimit = POWER_LIMIT_EDEFAULT;

	/**
	 * This is true if the Power Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerLimitESet;

	/**
	 * The default value of the '{@link #isNeedsPowerLimitCheck() <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsPowerLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_POWER_LIMIT_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsPowerLimitCheck() <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsPowerLimitCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean needsPowerLimitCheck = NEEDS_POWER_LIMIT_CHECK_EDEFAULT;

	/**
	 * This is true if the Needs Power Limit Check attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needsPowerLimitCheckESet;

	/**
	 * The default value of the '{@link #isUsePushbutton() <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePushbutton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_PUSHBUTTON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsePushbutton() <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePushbutton()
	 * @generated
	 * @ordered
	 */
	protected boolean usePushbutton = USE_PUSHBUTTON_EDEFAULT;

	/**
	 * This is true if the Use Pushbutton attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usePushbuttonESet;

	/**
	 * The default value of the '{@link #getEnergyLimit() <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyLimit() <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyLimit()
	 * @generated
	 * @ordered
	 */
	protected float energyLimit = ENERGY_LIMIT_EDEFAULT;

	/**
	 * This is true if the Energy Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyLimitESet;

	/**
	 * The default value of the '{@link #getEnergyUsageStartDateTime() <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENERGY_USAGE_START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnergyUsageStartDateTime() <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUsageStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date energyUsageStartDateTime = ENERGY_USAGE_START_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Energy Usage Start Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyUsageStartDateTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteConnectDisconnectInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadControlPackage.Literals.REMOTE_CONNECT_DISCONNECT_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Is Arm Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Arm Connect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Arm Connect</em>' attribute.
	 * @see #isSetIsArmConnect()
	 * @see #unsetIsArmConnect()
	 * @see #setIsArmConnect(boolean)
	 * @generated
	 */
	public boolean isIsArmConnect() {
		return isArmConnect;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Arm Connect</em>' attribute.
	 * @see #isSetIsArmConnect()
	 * @see #unsetIsArmConnect()
	 * @see #isIsArmConnect()
	 * @generated
	 */
	public void setIsArmConnect(boolean newIsArmConnect) {
		isArmConnect = newIsArmConnect;
		isArmConnectESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsArmConnect()
	 * @see #isIsArmConnect()
	 * @see #setIsArmConnect(boolean)
	 * @generated
	 */
	public void unsetIsArmConnect() {
		isArmConnect = IS_ARM_CONNECT_EDEFAULT;
		isArmConnectESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Arm Connect</em>' attribute is set.
	 * @see #unsetIsArmConnect()
	 * @see #isIsArmConnect()
	 * @see #setIsArmConnect(boolean)
	 * @generated
	 */
	public boolean isSetIsArmConnect() {
		return isArmConnectESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Usage Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Usage Warning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Usage Warning</em>' attribute.
	 * @see #isSetEnergyUsageWarning()
	 * @see #unsetEnergyUsageWarning()
	 * @see #setEnergyUsageWarning(float)
	 * @generated
	 */
	public float getEnergyUsageWarning() {
		return energyUsageWarning;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Usage Warning</em>' attribute.
	 * @see #isSetEnergyUsageWarning()
	 * @see #unsetEnergyUsageWarning()
	 * @see #getEnergyUsageWarning()
	 * @generated
	 */
	public void setEnergyUsageWarning(float newEnergyUsageWarning) {
		energyUsageWarning = newEnergyUsageWarning;
		energyUsageWarningESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyUsageWarning()
	 * @see #getEnergyUsageWarning()
	 * @see #setEnergyUsageWarning(float)
	 * @generated
	 */
	public void unsetEnergyUsageWarning() {
		energyUsageWarning = ENERGY_USAGE_WARNING_EDEFAULT;
		energyUsageWarningESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Usage Warning</em>' attribute is set.
	 * @see #unsetEnergyUsageWarning()
	 * @see #getEnergyUsageWarning()
	 * @see #setEnergyUsageWarning(float)
	 * @generated
	 */
	public boolean isSetEnergyUsageWarning() {
		return energyUsageWarningESet;
	}

	/**
	 * Returns the value of the '<em><b>Needs Voltage Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Voltage Limit Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Voltage Limit Check</em>' attribute.
	 * @see #isSetNeedsVoltageLimitCheck()
	 * @see #unsetNeedsVoltageLimitCheck()
	 * @see #setNeedsVoltageLimitCheck(boolean)
	 * @generated
	 */
	public boolean isNeedsVoltageLimitCheck() {
		return needsVoltageLimitCheck;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Voltage Limit Check</em>' attribute.
	 * @see #isSetNeedsVoltageLimitCheck()
	 * @see #unsetNeedsVoltageLimitCheck()
	 * @see #isNeedsVoltageLimitCheck()
	 * @generated
	 */
	public void setNeedsVoltageLimitCheck(boolean newNeedsVoltageLimitCheck) {
		needsVoltageLimitCheck = newNeedsVoltageLimitCheck;
		needsVoltageLimitCheckESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedsVoltageLimitCheck()
	 * @see #isNeedsVoltageLimitCheck()
	 * @see #setNeedsVoltageLimitCheck(boolean)
	 * @generated
	 */
	public void unsetNeedsVoltageLimitCheck() {
		needsVoltageLimitCheck = NEEDS_VOLTAGE_LIMIT_CHECK_EDEFAULT;
		needsVoltageLimitCheckESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Needs Voltage Limit Check</em>' attribute is set.
	 * @see #unsetNeedsVoltageLimitCheck()
	 * @see #isNeedsVoltageLimitCheck()
	 * @see #setNeedsVoltageLimitCheck(boolean)
	 * @generated
	 */
	public boolean isSetNeedsVoltageLimitCheck() {
		return needsVoltageLimitCheckESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Voltage Limit</em>' attribute.
	 * @see #isSetCustomerVoltageLimit()
	 * @see #unsetCustomerVoltageLimit()
	 * @see #setCustomerVoltageLimit(float)
	 * @generated
	 */
	public float getCustomerVoltageLimit() {
		return customerVoltageLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Voltage Limit</em>' attribute.
	 * @see #isSetCustomerVoltageLimit()
	 * @see #unsetCustomerVoltageLimit()
	 * @see #getCustomerVoltageLimit()
	 * @generated
	 */
	public void setCustomerVoltageLimit(float newCustomerVoltageLimit) {
		customerVoltageLimit = newCustomerVoltageLimit;
		customerVoltageLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomerVoltageLimit()
	 * @see #getCustomerVoltageLimit()
	 * @see #setCustomerVoltageLimit(float)
	 * @generated
	 */
	public void unsetCustomerVoltageLimit() {
		customerVoltageLimit = CUSTOMER_VOLTAGE_LIMIT_EDEFAULT;
		customerVoltageLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Customer Voltage Limit</em>' attribute is set.
	 * @see #unsetCustomerVoltageLimit()
	 * @see #getCustomerVoltageLimit()
	 * @see #setCustomerVoltageLimit(float)
	 * @generated
	 */
	public boolean isSetCustomerVoltageLimit() {
		return customerVoltageLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Arm Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Arm Disconnect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Arm Disconnect</em>' attribute.
	 * @see #isSetIsArmDisconnect()
	 * @see #unsetIsArmDisconnect()
	 * @see #setIsArmDisconnect(boolean)
	 * @generated
	 */
	public boolean isIsArmDisconnect() {
		return isArmDisconnect;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Arm Disconnect</em>' attribute.
	 * @see #isSetIsArmDisconnect()
	 * @see #unsetIsArmDisconnect()
	 * @see #isIsArmDisconnect()
	 * @generated
	 */
	public void setIsArmDisconnect(boolean newIsArmDisconnect) {
		isArmDisconnect = newIsArmDisconnect;
		isArmDisconnectESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsArmDisconnect()
	 * @see #isIsArmDisconnect()
	 * @see #setIsArmDisconnect(boolean)
	 * @generated
	 */
	public void unsetIsArmDisconnect() {
		isArmDisconnect = IS_ARM_DISCONNECT_EDEFAULT;
		isArmDisconnectESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Arm Disconnect</em>' attribute is set.
	 * @see #unsetIsArmDisconnect()
	 * @see #isIsArmDisconnect()
	 * @see #setIsArmDisconnect(boolean)
	 * @generated
	 */
	public boolean isSetIsArmDisconnect() {
		return isArmDisconnectESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Energy Limiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Energy Limiting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Energy Limiting</em>' attribute.
	 * @see #isSetIsEnergyLimiting()
	 * @see #unsetIsEnergyLimiting()
	 * @see #setIsEnergyLimiting(boolean)
	 * @generated
	 */
	public boolean isIsEnergyLimiting() {
		return isEnergyLimiting;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Energy Limiting</em>' attribute.
	 * @see #isSetIsEnergyLimiting()
	 * @see #unsetIsEnergyLimiting()
	 * @see #isIsEnergyLimiting()
	 * @generated
	 */
	public void setIsEnergyLimiting(boolean newIsEnergyLimiting) {
		isEnergyLimiting = newIsEnergyLimiting;
		isEnergyLimitingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEnergyLimiting()
	 * @see #isIsEnergyLimiting()
	 * @see #setIsEnergyLimiting(boolean)
	 * @generated
	 */
	public void unsetIsEnergyLimiting() {
		isEnergyLimiting = IS_ENERGY_LIMITING_EDEFAULT;
		isEnergyLimitingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Energy Limiting</em>' attribute is set.
	 * @see #unsetIsEnergyLimiting()
	 * @see #isIsEnergyLimiting()
	 * @see #setIsEnergyLimiting(boolean)
	 * @generated
	 */
	public boolean isSetIsEnergyLimiting() {
		return isEnergyLimitingESet;
	}

	/**
	 * Returns the value of the '<em><b>Armed Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armed Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armed Timeout</em>' attribute.
	 * @see #isSetArmedTimeout()
	 * @see #unsetArmedTimeout()
	 * @see #setArmedTimeout(float)
	 * @generated
	 */
	public float getArmedTimeout() {
		return armedTimeout;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armed Timeout</em>' attribute.
	 * @see #isSetArmedTimeout()
	 * @see #unsetArmedTimeout()
	 * @see #getArmedTimeout()
	 * @generated
	 */
	public void setArmedTimeout(float newArmedTimeout) {
		armedTimeout = newArmedTimeout;
		armedTimeoutESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArmedTimeout()
	 * @see #getArmedTimeout()
	 * @see #setArmedTimeout(float)
	 * @generated
	 */
	public void unsetArmedTimeout() {
		armedTimeout = ARMED_TIMEOUT_EDEFAULT;
		armedTimeoutESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Armed Timeout</em>' attribute is set.
	 * @see #unsetArmedTimeout()
	 * @see #getArmedTimeout()
	 * @see #setArmedTimeout(float)
	 * @generated
	 */
	public boolean isSetArmedTimeout() {
		return armedTimeoutESet;
	}

	/**
	 * Returns the value of the '<em><b>Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Limit</em>' attribute.
	 * @see #isSetPowerLimit()
	 * @see #unsetPowerLimit()
	 * @see #setPowerLimit(float)
	 * @generated
	 */
	public float getPowerLimit() {
		return powerLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Limit</em>' attribute.
	 * @see #isSetPowerLimit()
	 * @see #unsetPowerLimit()
	 * @see #getPowerLimit()
	 * @generated
	 */
	public void setPowerLimit(float newPowerLimit) {
		powerLimit = newPowerLimit;
		powerLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerLimit()
	 * @see #getPowerLimit()
	 * @see #setPowerLimit(float)
	 * @generated
	 */
	public void unsetPowerLimit() {
		powerLimit = POWER_LIMIT_EDEFAULT;
		powerLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Limit</em>' attribute is set.
	 * @see #unsetPowerLimit()
	 * @see #getPowerLimit()
	 * @see #setPowerLimit(float)
	 * @generated
	 */
	public boolean isSetPowerLimit() {
		return powerLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Needs Power Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Power Limit Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Power Limit Check</em>' attribute.
	 * @see #isSetNeedsPowerLimitCheck()
	 * @see #unsetNeedsPowerLimitCheck()
	 * @see #setNeedsPowerLimitCheck(boolean)
	 * @generated
	 */
	public boolean isNeedsPowerLimitCheck() {
		return needsPowerLimitCheck;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Power Limit Check</em>' attribute.
	 * @see #isSetNeedsPowerLimitCheck()
	 * @see #unsetNeedsPowerLimitCheck()
	 * @see #isNeedsPowerLimitCheck()
	 * @generated
	 */
	public void setNeedsPowerLimitCheck(boolean newNeedsPowerLimitCheck) {
		needsPowerLimitCheck = newNeedsPowerLimitCheck;
		needsPowerLimitCheckESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedsPowerLimitCheck()
	 * @see #isNeedsPowerLimitCheck()
	 * @see #setNeedsPowerLimitCheck(boolean)
	 * @generated
	 */
	public void unsetNeedsPowerLimitCheck() {
		needsPowerLimitCheck = NEEDS_POWER_LIMIT_CHECK_EDEFAULT;
		needsPowerLimitCheckESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Needs Power Limit Check</em>' attribute is set.
	 * @see #unsetNeedsPowerLimitCheck()
	 * @see #isNeedsPowerLimitCheck()
	 * @see #setNeedsPowerLimitCheck(boolean)
	 * @generated
	 */
	public boolean isSetNeedsPowerLimitCheck() {
		return needsPowerLimitCheckESet;
	}

	/**
	 * Returns the value of the '<em><b>Use Pushbutton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Pushbutton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Pushbutton</em>' attribute.
	 * @see #isSetUsePushbutton()
	 * @see #unsetUsePushbutton()
	 * @see #setUsePushbutton(boolean)
	 * @generated
	 */
	public boolean isUsePushbutton() {
		return usePushbutton;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Pushbutton</em>' attribute.
	 * @see #isSetUsePushbutton()
	 * @see #unsetUsePushbutton()
	 * @see #isUsePushbutton()
	 * @generated
	 */
	public void setUsePushbutton(boolean newUsePushbutton) {
		usePushbutton = newUsePushbutton;
		usePushbuttonESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsePushbutton()
	 * @see #isUsePushbutton()
	 * @see #setUsePushbutton(boolean)
	 * @generated
	 */
	public void unsetUsePushbutton() {
		usePushbutton = USE_PUSHBUTTON_EDEFAULT;
		usePushbuttonESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Pushbutton</em>' attribute is set.
	 * @see #unsetUsePushbutton()
	 * @see #isUsePushbutton()
	 * @see #setUsePushbutton(boolean)
	 * @generated
	 */
	public boolean isSetUsePushbutton() {
		return usePushbuttonESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Limit</em>' attribute.
	 * @see #isSetEnergyLimit()
	 * @see #unsetEnergyLimit()
	 * @see #setEnergyLimit(float)
	 * @generated
	 */
	public float getEnergyLimit() {
		return energyLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Limit</em>' attribute.
	 * @see #isSetEnergyLimit()
	 * @see #unsetEnergyLimit()
	 * @see #getEnergyLimit()
	 * @generated
	 */
	public void setEnergyLimit(float newEnergyLimit) {
		energyLimit = newEnergyLimit;
		energyLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyLimit()
	 * @see #getEnergyLimit()
	 * @see #setEnergyLimit(float)
	 * @generated
	 */
	public void unsetEnergyLimit() {
		energyLimit = ENERGY_LIMIT_EDEFAULT;
		energyLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Limit</em>' attribute is set.
	 * @see #unsetEnergyLimit()
	 * @see #getEnergyLimit()
	 * @see #setEnergyLimit(float)
	 * @generated
	 */
	public boolean isSetEnergyLimit() {
		return energyLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Usage Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Usage Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Usage Start Date Time</em>' attribute.
	 * @see #isSetEnergyUsageStartDateTime()
	 * @see #unsetEnergyUsageStartDateTime()
	 * @see #setEnergyUsageStartDateTime(Date)
	 * @generated
	 */
	public Date getEnergyUsageStartDateTime() {
		return energyUsageStartDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Usage Start Date Time</em>' attribute.
	 * @see #isSetEnergyUsageStartDateTime()
	 * @see #unsetEnergyUsageStartDateTime()
	 * @see #getEnergyUsageStartDateTime()
	 * @generated
	 */
	public void setEnergyUsageStartDateTime(Date newEnergyUsageStartDateTime) {
		energyUsageStartDateTime = newEnergyUsageStartDateTime;
		energyUsageStartDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyUsageStartDateTime()
	 * @see #getEnergyUsageStartDateTime()
	 * @see #setEnergyUsageStartDateTime(Date)
	 * @generated
	 */
	public void unsetEnergyUsageStartDateTime() {
		energyUsageStartDateTime = ENERGY_USAGE_START_DATE_TIME_EDEFAULT;
		energyUsageStartDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Usage Start Date Time</em>' attribute is set.
	 * @see #unsetEnergyUsageStartDateTime()
	 * @see #getEnergyUsageStartDateTime()
	 * @see #setEnergyUsageStartDateTime(Date)
	 * @generated
	 */
	public boolean isSetEnergyUsageStartDateTime() {
		return energyUsageStartDateTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				return isIsArmConnect();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				return getEnergyUsageWarning();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				return isNeedsVoltageLimitCheck();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				return getCustomerVoltageLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				return isIsArmDisconnect();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				return isIsEnergyLimiting();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				return getArmedTimeout();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				return getPowerLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				return isNeedsPowerLimitCheck();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				return isUsePushbutton();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				return getEnergyLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				return getEnergyUsageStartDateTime();
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
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				setIsArmConnect((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				setEnergyUsageWarning((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				setNeedsVoltageLimitCheck((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				setCustomerVoltageLimit((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				setIsArmDisconnect((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				setIsEnergyLimiting((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				setArmedTimeout((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				setPowerLimit((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				setNeedsPowerLimitCheck((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				setUsePushbutton((Boolean)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				setEnergyLimit((Float)newValue);
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				setEnergyUsageStartDateTime((Date)newValue);
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
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				unsetIsArmConnect();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				unsetEnergyUsageWarning();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				unsetNeedsVoltageLimitCheck();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				unsetCustomerVoltageLimit();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				unsetIsArmDisconnect();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				unsetIsEnergyLimiting();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				unsetArmedTimeout();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				unsetPowerLimit();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				unsetNeedsPowerLimitCheck();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				unsetUsePushbutton();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				unsetEnergyLimit();
				return;
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				unsetEnergyUsageStartDateTime();
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
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT:
				return isSetIsArmConnect();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING:
				return isSetEnergyUsageWarning();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK:
				return isSetNeedsVoltageLimitCheck();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT:
				return isSetCustomerVoltageLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT:
				return isSetIsArmDisconnect();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING:
				return isSetIsEnergyLimiting();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT:
				return isSetArmedTimeout();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT:
				return isSetPowerLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK:
				return isSetNeedsPowerLimitCheck();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON:
				return isSetUsePushbutton();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT:
				return isSetEnergyLimit();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME:
				return isSetEnergyUsageStartDateTime();
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
		result.append(" (isArmConnect: ");
		if (isArmConnectESet) result.append(isArmConnect); else result.append("<unset>");
		result.append(", energyUsageWarning: ");
		if (energyUsageWarningESet) result.append(energyUsageWarning); else result.append("<unset>");
		result.append(", needsVoltageLimitCheck: ");
		if (needsVoltageLimitCheckESet) result.append(needsVoltageLimitCheck); else result.append("<unset>");
		result.append(", customerVoltageLimit: ");
		if (customerVoltageLimitESet) result.append(customerVoltageLimit); else result.append("<unset>");
		result.append(", isArmDisconnect: ");
		if (isArmDisconnectESet) result.append(isArmDisconnect); else result.append("<unset>");
		result.append(", isEnergyLimiting: ");
		if (isEnergyLimitingESet) result.append(isEnergyLimiting); else result.append("<unset>");
		result.append(", armedTimeout: ");
		if (armedTimeoutESet) result.append(armedTimeout); else result.append("<unset>");
		result.append(", powerLimit: ");
		if (powerLimitESet) result.append(powerLimit); else result.append("<unset>");
		result.append(", needsPowerLimitCheck: ");
		if (needsPowerLimitCheckESet) result.append(needsPowerLimitCheck); else result.append("<unset>");
		result.append(", usePushbutton: ");
		if (usePushbuttonESet) result.append(usePushbutton); else result.append("<unset>");
		result.append(", energyLimit: ");
		if (energyLimitESet) result.append(energyLimit); else result.append("<unset>");
		result.append(", energyUsageStartDateTime: ");
		if (energyUsageStartDateTimeESet) result.append(energyUsageStartDateTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RemoteConnectDisconnectInfo
