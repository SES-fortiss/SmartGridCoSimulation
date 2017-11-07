/**
 */
package CIM15.IEC61970.Core;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Bay#getSubstation <em>Substation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Bay extends EquipmentContainer {
	/**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected VoltageLevel voltageLevel;

	/**
	 * The default value of the '{@link #isBayPowerMeasFlag() <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayPowerMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAY_POWER_MEAS_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBayPowerMeasFlag() <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayPowerMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean bayPowerMeasFlag = BAY_POWER_MEAS_FLAG_EDEFAULT;

	/**
	 * This is true if the Bay Power Meas Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bayPowerMeasFlagESet;

	/**
	 * The default value of the '{@link #isBayEnergyMeasFlag() <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayEnergyMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAY_ENERGY_MEAS_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBayEnergyMeasFlag() <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBayEnergyMeasFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean bayEnergyMeasFlag = BAY_ENERGY_MEAS_FLAG_EDEFAULT;

	/**
	 * This is true if the Bay Energy Meas Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bayEnergyMeasFlagESet;

	/**
	 * The default value of the '{@link #getBusBarConfiguration() <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBarConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final BusbarConfiguration BUS_BAR_CONFIGURATION_EDEFAULT = BusbarConfiguration.DOUBLE_BUS;

	/**
	 * The cached value of the '{@link #getBusBarConfiguration() <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBarConfiguration()
	 * @generated
	 * @ordered
	 */
	protected BusbarConfiguration busBarConfiguration = BUS_BAR_CONFIGURATION_EDEFAULT;

	/**
	 * This is true if the Bus Bar Configuration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean busBarConfigurationESet;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected Substation substation;

	/**
	 * The default value of the '{@link #getBreakerConfiguration() <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakerConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final BreakerConfiguration BREAKER_CONFIGURATION_EDEFAULT = BreakerConfiguration.BREAKER_AND_AHALF;

	/**
	 * The cached value of the '{@link #getBreakerConfiguration() <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakerConfiguration()
	 * @generated
	 * @ordered
	 */
	protected BreakerConfiguration breakerConfiguration = BREAKER_CONFIGURATION_EDEFAULT;

	/**
	 * This is true if the Breaker Configuration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean breakerConfigurationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bay() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BAY;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Level</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.VoltageLevel#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level</em>' reference.
	 * @see #setVoltageLevel(VoltageLevel)
	 * @see CIM15.IEC61970.Core.VoltageLevel#getBays
	 * @generated
	 */
	public VoltageLevel getVoltageLevel() {
		if (voltageLevel != null && voltageLevel.eIsProxy()) {
			InternalEObject oldVoltageLevel = (InternalEObject)voltageLevel;
			voltageLevel = (VoltageLevel)eResolveProxy(oldVoltageLevel);
			if (voltageLevel != oldVoltageLevel) {
			}
		}
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel basicGetVoltageLevel() {
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltageLevel(VoltageLevel newVoltageLevel, NotificationChain msgs) {
		VoltageLevel oldVoltageLevel = voltageLevel;
		voltageLevel = newVoltageLevel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Level</em>' reference.
	 * @see #getVoltageLevel()
	 * @generated
	 */
	public void setVoltageLevel(VoltageLevel newVoltageLevel) {
		if (newVoltageLevel != voltageLevel) {
			NotificationChain msgs = null;
			if (voltageLevel != null)
				msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, CorePackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs);
			if (newVoltageLevel != null)
				msgs = ((InternalEObject)newVoltageLevel).eInverseAdd(this, CorePackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs);
			msgs = basicSetVoltageLevel(newVoltageLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Bay Power Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bay Power Meas Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Power Meas Flag</em>' attribute.
	 * @see #isSetBayPowerMeasFlag()
	 * @see #unsetBayPowerMeasFlag()
	 * @see #setBayPowerMeasFlag(boolean)
	 * @generated
	 */
	public boolean isBayPowerMeasFlag() {
		return bayPowerMeasFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Power Meas Flag</em>' attribute.
	 * @see #isSetBayPowerMeasFlag()
	 * @see #unsetBayPowerMeasFlag()
	 * @see #isBayPowerMeasFlag()
	 * @generated
	 */
	public void setBayPowerMeasFlag(boolean newBayPowerMeasFlag) {
		bayPowerMeasFlag = newBayPowerMeasFlag;
		bayPowerMeasFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBayPowerMeasFlag()
	 * @see #isBayPowerMeasFlag()
	 * @see #setBayPowerMeasFlag(boolean)
	 * @generated
	 */
	public void unsetBayPowerMeasFlag() {
		bayPowerMeasFlag = BAY_POWER_MEAS_FLAG_EDEFAULT;
		bayPowerMeasFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Bay#isBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bay Power Meas Flag</em>' attribute is set.
	 * @see #unsetBayPowerMeasFlag()
	 * @see #isBayPowerMeasFlag()
	 * @see #setBayPowerMeasFlag(boolean)
	 * @generated
	 */
	public boolean isSetBayPowerMeasFlag() {
		return bayPowerMeasFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Bay Energy Meas Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bay Energy Meas Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay Energy Meas Flag</em>' attribute.
	 * @see #isSetBayEnergyMeasFlag()
	 * @see #unsetBayEnergyMeasFlag()
	 * @see #setBayEnergyMeasFlag(boolean)
	 * @generated
	 */
	public boolean isBayEnergyMeasFlag() {
		return bayEnergyMeasFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay Energy Meas Flag</em>' attribute.
	 * @see #isSetBayEnergyMeasFlag()
	 * @see #unsetBayEnergyMeasFlag()
	 * @see #isBayEnergyMeasFlag()
	 * @generated
	 */
	public void setBayEnergyMeasFlag(boolean newBayEnergyMeasFlag) {
		bayEnergyMeasFlag = newBayEnergyMeasFlag;
		bayEnergyMeasFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBayEnergyMeasFlag()
	 * @see #isBayEnergyMeasFlag()
	 * @see #setBayEnergyMeasFlag(boolean)
	 * @generated
	 */
	public void unsetBayEnergyMeasFlag() {
		bayEnergyMeasFlag = BAY_ENERGY_MEAS_FLAG_EDEFAULT;
		bayEnergyMeasFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Bay#isBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bay Energy Meas Flag</em>' attribute is set.
	 * @see #unsetBayEnergyMeasFlag()
	 * @see #isBayEnergyMeasFlag()
	 * @see #setBayEnergyMeasFlag(boolean)
	 * @generated
	 */
	public boolean isSetBayEnergyMeasFlag() {
		return bayEnergyMeasFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Bus Bar Configuration</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.BusbarConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Bar Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Bar Configuration</em>' attribute.
	 * @see CIM15.IEC61970.Core.BusbarConfiguration
	 * @see #isSetBusBarConfiguration()
	 * @see #unsetBusBarConfiguration()
	 * @see #setBusBarConfiguration(BusbarConfiguration)
	 * @generated
	 */
	public BusbarConfiguration getBusBarConfiguration() {
		return busBarConfiguration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Bar Configuration</em>' attribute.
	 * @see CIM15.IEC61970.Core.BusbarConfiguration
	 * @see #isSetBusBarConfiguration()
	 * @see #unsetBusBarConfiguration()
	 * @see #getBusBarConfiguration()
	 * @generated
	 */
	public void setBusBarConfiguration(BusbarConfiguration newBusBarConfiguration) {
		busBarConfiguration = newBusBarConfiguration == null ? BUS_BAR_CONFIGURATION_EDEFAULT : newBusBarConfiguration;
		busBarConfigurationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusBarConfiguration()
	 * @see #getBusBarConfiguration()
	 * @see #setBusBarConfiguration(BusbarConfiguration)
	 * @generated
	 */
	public void unsetBusBarConfiguration() {
		busBarConfiguration = BUS_BAR_CONFIGURATION_EDEFAULT;
		busBarConfigurationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bus Bar Configuration</em>' attribute is set.
	 * @see #unsetBusBarConfiguration()
	 * @see #getBusBarConfiguration()
	 * @see #setBusBarConfiguration(BusbarConfiguration)
	 * @generated
	 */
	public boolean isSetBusBarConfiguration() {
		return busBarConfigurationESet;
	}

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Substation#getBays <em>Bays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference.
	 * @see #setSubstation(Substation)
	 * @see CIM15.IEC61970.Core.Substation#getBays
	 * @generated
	 */
	public Substation getSubstation() {
		if (substation != null && substation.eIsProxy()) {
			InternalEObject oldSubstation = (InternalEObject)substation;
			substation = (Substation)eResolveProxy(oldSubstation);
			if (substation != oldSubstation) {
			}
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation basicGetSubstation() {
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstation(Substation newSubstation, NotificationChain msgs) {
		Substation oldSubstation = substation;
		substation = newSubstation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Bay#getSubstation <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' reference.
	 * @see #getSubstation()
	 * @generated
	 */
	public void setSubstation(Substation newSubstation) {
		if (newSubstation != substation) {
			NotificationChain msgs = null;
			if (substation != null)
				msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__BAYS, Substation.class, msgs);
			if (newSubstation != null)
				msgs = ((InternalEObject)newSubstation).eInverseAdd(this, CorePackage.SUBSTATION__BAYS, Substation.class, msgs);
			msgs = basicSetSubstation(newSubstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Breaker Configuration</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.BreakerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breaker Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaker Configuration</em>' attribute.
	 * @see CIM15.IEC61970.Core.BreakerConfiguration
	 * @see #isSetBreakerConfiguration()
	 * @see #unsetBreakerConfiguration()
	 * @see #setBreakerConfiguration(BreakerConfiguration)
	 * @generated
	 */
	public BreakerConfiguration getBreakerConfiguration() {
		return breakerConfiguration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaker Configuration</em>' attribute.
	 * @see CIM15.IEC61970.Core.BreakerConfiguration
	 * @see #isSetBreakerConfiguration()
	 * @see #unsetBreakerConfiguration()
	 * @see #getBreakerConfiguration()
	 * @generated
	 */
	public void setBreakerConfiguration(BreakerConfiguration newBreakerConfiguration) {
		breakerConfiguration = newBreakerConfiguration == null ? BREAKER_CONFIGURATION_EDEFAULT : newBreakerConfiguration;
		breakerConfigurationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBreakerConfiguration()
	 * @see #getBreakerConfiguration()
	 * @see #setBreakerConfiguration(BreakerConfiguration)
	 * @generated
	 */
	public void unsetBreakerConfiguration() {
		breakerConfiguration = BREAKER_CONFIGURATION_EDEFAULT;
		breakerConfigurationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Breaker Configuration</em>' attribute is set.
	 * @see #unsetBreakerConfiguration()
	 * @see #getBreakerConfiguration()
	 * @see #setBreakerConfiguration(BreakerConfiguration)
	 * @generated
	 */
	public boolean isSetBreakerConfiguration() {
		return breakerConfigurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.BAY__VOLTAGE_LEVEL:
				if (voltageLevel != null)
					msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, CorePackage.VOLTAGE_LEVEL__BAYS, VoltageLevel.class, msgs);
				return basicSetVoltageLevel((VoltageLevel)otherEnd, msgs);
			case CorePackage.BAY__SUBSTATION:
				if (substation != null)
					msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__BAYS, Substation.class, msgs);
				return basicSetSubstation((Substation)otherEnd, msgs);
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
			case CorePackage.BAY__VOLTAGE_LEVEL:
				return basicSetVoltageLevel(null, msgs);
			case CorePackage.BAY__SUBSTATION:
				return basicSetSubstation(null, msgs);
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
			case CorePackage.BAY__VOLTAGE_LEVEL:
				if (resolve) return getVoltageLevel();
				return basicGetVoltageLevel();
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				return isBayPowerMeasFlag();
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				return isBayEnergyMeasFlag();
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				return getBusBarConfiguration();
			case CorePackage.BAY__SUBSTATION:
				if (resolve) return getSubstation();
				return basicGetSubstation();
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				return getBreakerConfiguration();
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
			case CorePackage.BAY__VOLTAGE_LEVEL:
				setVoltageLevel((VoltageLevel)newValue);
				return;
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				setBayPowerMeasFlag((Boolean)newValue);
				return;
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				setBayEnergyMeasFlag((Boolean)newValue);
				return;
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				setBusBarConfiguration((BusbarConfiguration)newValue);
				return;
			case CorePackage.BAY__SUBSTATION:
				setSubstation((Substation)newValue);
				return;
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				setBreakerConfiguration((BreakerConfiguration)newValue);
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
			case CorePackage.BAY__VOLTAGE_LEVEL:
				setVoltageLevel((VoltageLevel)null);
				return;
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				unsetBayPowerMeasFlag();
				return;
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				unsetBayEnergyMeasFlag();
				return;
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				unsetBusBarConfiguration();
				return;
			case CorePackage.BAY__SUBSTATION:
				setSubstation((Substation)null);
				return;
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				unsetBreakerConfiguration();
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
			case CorePackage.BAY__VOLTAGE_LEVEL:
				return voltageLevel != null;
			case CorePackage.BAY__BAY_POWER_MEAS_FLAG:
				return isSetBayPowerMeasFlag();
			case CorePackage.BAY__BAY_ENERGY_MEAS_FLAG:
				return isSetBayEnergyMeasFlag();
			case CorePackage.BAY__BUS_BAR_CONFIGURATION:
				return isSetBusBarConfiguration();
			case CorePackage.BAY__SUBSTATION:
				return substation != null;
			case CorePackage.BAY__BREAKER_CONFIGURATION:
				return isSetBreakerConfiguration();
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
		result.append(" (bayPowerMeasFlag: ");
		if (bayPowerMeasFlagESet) result.append(bayPowerMeasFlag); else result.append("<unset>");
		result.append(", bayEnergyMeasFlag: ");
		if (bayEnergyMeasFlagESet) result.append(bayEnergyMeasFlag); else result.append("<unset>");
		result.append(", busBarConfiguration: ");
		if (busBarConfigurationESet) result.append(busBarConfiguration); else result.append("<unset>");
		result.append(", breakerConfiguration: ");
		if (breakerConfigurationESet) result.append(breakerConfiguration); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Bay
