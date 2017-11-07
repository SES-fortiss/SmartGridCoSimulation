/**
 */
package CIM15.IEC61970.Protection;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.Equipment;

import CIM15.IEC61970.Domain.UnitMultiplier;
import CIM15.IEC61970.Domain.UnitSymbol;

import CIM15.IEC61970.Wires.ProtectedSwitch;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectionEquipment extends Equipment {
	/**
	 * The default value of the '{@link #getHighLimit() <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighLimit() <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLimit()
	 * @generated
	 * @ordered
	 */
	protected float highLimit = HIGH_LIMIT_EDEFAULT;

	/**
	 * This is true if the High Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highLimitESet;

	/**
	 * The default value of the '{@link #isPowerDirectionFlag() <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowerDirectionFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POWER_DIRECTION_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPowerDirectionFlag() <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowerDirectionFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean powerDirectionFlag = POWER_DIRECTION_FLAG_EDEFAULT;

	/**
	 * This is true if the Power Direction Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerDirectionFlagESet;

	/**
	 * The default value of the '{@link #getLowLimit() <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowLimit() <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowLimit = LOW_LIMIT_EDEFAULT;

	/**
	 * This is true if the Low Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowLimitESet;

	/**
	 * The cached value of the '{@link #getConductingEquipments() <em>Conducting Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductingEquipment> conductingEquipments;

	/**
	 * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;

	/**
	 * This is true if the Unit Symbol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitSymbolESet;

	/**
	 * The cached value of the '{@link #getProtectedSwitches() <em>Protected Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectedSwitch> protectedSwitches;

	/**
	 * The default value of the '{@link #getRelayDelayTime() <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelayDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final float RELAY_DELAY_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRelayDelayTime() <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelayDelayTime()
	 * @generated
	 * @ordered
	 */
	protected float relayDelayTime = RELAY_DELAY_TIME_EDEFAULT;

	/**
	 * This is true if the Relay Delay Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relayDelayTimeESet;

	/**
	 * The default value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Unit Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitMultiplierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionEquipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.PROTECTION_EQUIPMENT;
	}

	/**
	 * Returns the value of the '<em><b>High Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Limit</em>' attribute.
	 * @see #isSetHighLimit()
	 * @see #unsetHighLimit()
	 * @see #setHighLimit(float)
	 * @generated
	 */
	public float getHighLimit() {
		return highLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Limit</em>' attribute.
	 * @see #isSetHighLimit()
	 * @see #unsetHighLimit()
	 * @see #getHighLimit()
	 * @generated
	 */
	public void setHighLimit(float newHighLimit) {
		highLimit = newHighLimit;
		highLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighLimit()
	 * @see #getHighLimit()
	 * @see #setHighLimit(float)
	 * @generated
	 */
	public void unsetHighLimit() {
		highLimit = HIGH_LIMIT_EDEFAULT;
		highLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Limit</em>' attribute is set.
	 * @see #unsetHighLimit()
	 * @see #getHighLimit()
	 * @see #setHighLimit(float)
	 * @generated
	 */
	public boolean isSetHighLimit() {
		return highLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Power Direction Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Direction Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Direction Flag</em>' attribute.
	 * @see #isSetPowerDirectionFlag()
	 * @see #unsetPowerDirectionFlag()
	 * @see #setPowerDirectionFlag(boolean)
	 * @generated
	 */
	public boolean isPowerDirectionFlag() {
		return powerDirectionFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Direction Flag</em>' attribute.
	 * @see #isSetPowerDirectionFlag()
	 * @see #unsetPowerDirectionFlag()
	 * @see #isPowerDirectionFlag()
	 * @generated
	 */
	public void setPowerDirectionFlag(boolean newPowerDirectionFlag) {
		powerDirectionFlag = newPowerDirectionFlag;
		powerDirectionFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerDirectionFlag()
	 * @see #isPowerDirectionFlag()
	 * @see #setPowerDirectionFlag(boolean)
	 * @generated
	 */
	public void unsetPowerDirectionFlag() {
		powerDirectionFlag = POWER_DIRECTION_FLAG_EDEFAULT;
		powerDirectionFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#isPowerDirectionFlag <em>Power Direction Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Direction Flag</em>' attribute is set.
	 * @see #unsetPowerDirectionFlag()
	 * @see #isPowerDirectionFlag()
	 * @see #setPowerDirectionFlag(boolean)
	 * @generated
	 */
	public boolean isSetPowerDirectionFlag() {
		return powerDirectionFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Low Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Limit</em>' attribute.
	 * @see #isSetLowLimit()
	 * @see #unsetLowLimit()
	 * @see #setLowLimit(float)
	 * @generated
	 */
	public float getLowLimit() {
		return lowLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Limit</em>' attribute.
	 * @see #isSetLowLimit()
	 * @see #unsetLowLimit()
	 * @see #getLowLimit()
	 * @generated
	 */
	public void setLowLimit(float newLowLimit) {
		lowLimit = newLowLimit;
		lowLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowLimit()
	 * @see #getLowLimit()
	 * @see #setLowLimit(float)
	 * @generated
	 */
	public void unsetLowLimit() {
		lowLimit = LOW_LIMIT_EDEFAULT;
		lowLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Limit</em>' attribute is set.
	 * @see #unsetLowLimit()
	 * @see #getLowLimit()
	 * @see #setLowLimit(float)
	 * @generated
	 */
	public boolean isSetLowLimit() {
		return lowLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Conducting Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.ConductingEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipments</em>' reference list.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getProtectionEquipments
	 * @generated
	 */
	public EList<ConductingEquipment> getConductingEquipments() {
		if (conductingEquipments == null) {
			conductingEquipments = new BasicInternalEList<ConductingEquipment>(ConductingEquipment.class);
		}
		return conductingEquipments;
	}

	/**
	 * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Symbol</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetUnitSymbol()
	 * @see #unsetUnitSymbol()
	 * @see #setUnitSymbol(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getUnitSymbol() {
		return unitSymbol;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Symbol</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetUnitSymbol()
	 * @see #unsetUnitSymbol()
	 * @see #getUnitSymbol()
	 * @generated
	 */
	public void setUnitSymbol(UnitSymbol newUnitSymbol) {
		unitSymbol = newUnitSymbol == null ? UNIT_SYMBOL_EDEFAULT : newUnitSymbol;
		unitSymbolESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitSymbol()
	 * @see #getUnitSymbol()
	 * @see #setUnitSymbol(UnitSymbol)
	 * @generated
	 */
	public void unsetUnitSymbol() {
		unitSymbol = UNIT_SYMBOL_EDEFAULT;
		unitSymbolESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Symbol</em>' attribute is set.
	 * @see #unsetUnitSymbol()
	 * @see #getUnitSymbol()
	 * @see #setUnitSymbol(UnitSymbol)
	 * @generated
	 */
	public boolean isSetUnitSymbol() {
		return unitSymbolESet;
	}

	/**
	 * Returns the value of the '<em><b>Protected Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.ProtectedSwitch}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getProtectionEquipments2 <em>Protection Equipments2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Switches</em>' reference list.
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch#getProtectionEquipments2
	 * @generated
	 */
	public EList<ProtectedSwitch> getProtectedSwitches() {
		if (protectedSwitches == null) {
			protectedSwitches = new BasicInternalEList<ProtectedSwitch>(ProtectedSwitch.class);
		}
		return protectedSwitches;
	}

	/**
	 * Returns the value of the '<em><b>Relay Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relay Delay Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relay Delay Time</em>' attribute.
	 * @see #isSetRelayDelayTime()
	 * @see #unsetRelayDelayTime()
	 * @see #setRelayDelayTime(float)
	 * @generated
	 */
	public float getRelayDelayTime() {
		return relayDelayTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relay Delay Time</em>' attribute.
	 * @see #isSetRelayDelayTime()
	 * @see #unsetRelayDelayTime()
	 * @see #getRelayDelayTime()
	 * @generated
	 */
	public void setRelayDelayTime(float newRelayDelayTime) {
		relayDelayTime = newRelayDelayTime;
		relayDelayTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelayDelayTime()
	 * @see #getRelayDelayTime()
	 * @see #setRelayDelayTime(float)
	 * @generated
	 */
	public void unsetRelayDelayTime() {
		relayDelayTime = RELAY_DELAY_TIME_EDEFAULT;
		relayDelayTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relay Delay Time</em>' attribute is set.
	 * @see #unsetRelayDelayTime()
	 * @see #getRelayDelayTime()
	 * @see #setRelayDelayTime(float)
	 * @generated
	 */
	public boolean isSetRelayDelayTime() {
		return relayDelayTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Unit Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetUnitMultiplier()
	 * @see #unsetUnitMultiplier()
	 * @see #setUnitMultiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getUnitMultiplier() {
		return unitMultiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetUnitMultiplier()
	 * @see #unsetUnitMultiplier()
	 * @see #getUnitMultiplier()
	 * @generated
	 */
	public void setUnitMultiplier(UnitMultiplier newUnitMultiplier) {
		unitMultiplier = newUnitMultiplier == null ? UNIT_MULTIPLIER_EDEFAULT : newUnitMultiplier;
		unitMultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnitMultiplier()
	 * @see #getUnitMultiplier()
	 * @see #setUnitMultiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetUnitMultiplier() {
		unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
		unitMultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Multiplier</em>' attribute is set.
	 * @see #unsetUnitMultiplier()
	 * @see #getUnitMultiplier()
	 * @see #setUnitMultiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetUnitMultiplier() {
		return unitMultiplierESet;
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipments()).basicAdd(otherEnd, msgs);
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtectedSwitches()).basicAdd(otherEnd, msgs);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return ((InternalEList<?>)getConductingEquipments()).basicRemove(otherEnd, msgs);
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				return ((InternalEList<?>)getProtectedSwitches()).basicRemove(otherEnd, msgs);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				return getHighLimit();
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				return isPowerDirectionFlag();
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				return getLowLimit();
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return getConductingEquipments();
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
				return getUnitSymbol();
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				return getProtectedSwitches();
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				return getRelayDelayTime();
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
				return getUnitMultiplier();
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				setHighLimit((Float)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				setPowerDirectionFlag((Boolean)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				setLowLimit((Float)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				getConductingEquipments().clear();
				getConductingEquipments().addAll((Collection<? extends ConductingEquipment>)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
				setUnitSymbol((UnitSymbol)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				getProtectedSwitches().clear();
				getProtectedSwitches().addAll((Collection<? extends ProtectedSwitch>)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				setRelayDelayTime((Float)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
				setUnitMultiplier((UnitMultiplier)newValue);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				unsetHighLimit();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				unsetPowerDirectionFlag();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				unsetLowLimit();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				getConductingEquipments().clear();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
				unsetUnitSymbol();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				getProtectedSwitches().clear();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				unsetRelayDelayTime();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
				unsetUnitMultiplier();
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				return isSetHighLimit();
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				return isSetPowerDirectionFlag();
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				return isSetLowLimit();
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return conductingEquipments != null && !conductingEquipments.isEmpty();
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
				return isSetUnitSymbol();
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				return protectedSwitches != null && !protectedSwitches.isEmpty();
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				return isSetRelayDelayTime();
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
				return isSetUnitMultiplier();
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
		result.append(" (highLimit: ");
		if (highLimitESet) result.append(highLimit); else result.append("<unset>");
		result.append(", powerDirectionFlag: ");
		if (powerDirectionFlagESet) result.append(powerDirectionFlag); else result.append("<unset>");
		result.append(", lowLimit: ");
		if (lowLimitESet) result.append(lowLimit); else result.append("<unset>");
		result.append(", unitSymbol: ");
		if (unitSymbolESet) result.append(unitSymbol); else result.append("<unset>");
		result.append(", relayDelayTime: ");
		if (relayDelayTimeESet) result.append(relayDelayTime); else result.append("<unset>");
		result.append(", unitMultiplier: ");
		if (unitMultiplierESet) result.append(unitMultiplier); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProtectionEquipment
