/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61970.Domain.Currency;
import CIM15.IEC61970.Domain.UnitMultiplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accounting Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountingUnit extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplierESet;

	/**
	 * The default value of the '{@link #getEnergyUnit() <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_UNIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyUnit() <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyUnit()
	 * @generated
	 * @ordered
	 */
	protected float energyUnit = ENERGY_UNIT_EDEFAULT;

	/**
	 * This is true if the Energy Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyUnitESet;

	/**
	 * The default value of the '{@link #getMonetaryUnit() <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Currency MONETARY_UNIT_EDEFAULT = Currency.CAD;

	/**
	 * The cached value of the '{@link #getMonetaryUnit() <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected Currency monetaryUnit = MONETARY_UNIT_EDEFAULT;

	/**
	 * This is true if the Monetary Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monetaryUnitESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountingUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.ACCOUNTING_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #setMultiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getMultiplier() {
		return multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @generated
	 */
	public void setMultiplier(UnitMultiplier newMultiplier) {
		multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
		multiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetMultiplier() {
		multiplier = MULTIPLIER_EDEFAULT;
		multiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplier</em>' attribute is set.
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetMultiplier() {
		return multiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Unit</em>' attribute.
	 * @see #isSetEnergyUnit()
	 * @see #unsetEnergyUnit()
	 * @see #setEnergyUnit(float)
	 * @generated
	 */
	public float getEnergyUnit() {
		return energyUnit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Unit</em>' attribute.
	 * @see #isSetEnergyUnit()
	 * @see #unsetEnergyUnit()
	 * @see #getEnergyUnit()
	 * @generated
	 */
	public void setEnergyUnit(float newEnergyUnit) {
		energyUnit = newEnergyUnit;
		energyUnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyUnit()
	 * @see #getEnergyUnit()
	 * @see #setEnergyUnit(float)
	 * @generated
	 */
	public void unsetEnergyUnit() {
		energyUnit = ENERGY_UNIT_EDEFAULT;
		energyUnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Unit</em>' attribute is set.
	 * @see #unsetEnergyUnit()
	 * @see #getEnergyUnit()
	 * @see #setEnergyUnit(float)
	 * @generated
	 */
	public boolean isSetEnergyUnit() {
		return energyUnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Monetary Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.Currency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monetary Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.Currency
	 * @see #isSetMonetaryUnit()
	 * @see #unsetMonetaryUnit()
	 * @see #setMonetaryUnit(Currency)
	 * @generated
	 */
	public Currency getMonetaryUnit() {
		return monetaryUnit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monetary Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.Currency
	 * @see #isSetMonetaryUnit()
	 * @see #unsetMonetaryUnit()
	 * @see #getMonetaryUnit()
	 * @generated
	 */
	public void setMonetaryUnit(Currency newMonetaryUnit) {
		monetaryUnit = newMonetaryUnit == null ? MONETARY_UNIT_EDEFAULT : newMonetaryUnit;
		monetaryUnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonetaryUnit()
	 * @see #getMonetaryUnit()
	 * @see #setMonetaryUnit(Currency)
	 * @generated
	 */
	public void unsetMonetaryUnit() {
		monetaryUnit = MONETARY_UNIT_EDEFAULT;
		monetaryUnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monetary Unit</em>' attribute is set.
	 * @see #unsetMonetaryUnit()
	 * @see #getMonetaryUnit()
	 * @see #setMonetaryUnit(Currency)
	 * @generated
	 */
	public boolean isSetMonetaryUnit() {
		return monetaryUnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(float newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				return getMultiplier();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				return getEnergyUnit();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				return getMonetaryUnit();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				return getValue();
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
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				setMultiplier((UnitMultiplier)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				setEnergyUnit((Float)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				setMonetaryUnit((Currency)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				setValue((Float)newValue);
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
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				unsetMultiplier();
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				unsetEnergyUnit();
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				unsetMonetaryUnit();
				return;
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				unsetValue();
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
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MULTIPLIER:
				return isSetMultiplier();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__ENERGY_UNIT:
				return isSetEnergyUnit();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__MONETARY_UNIT:
				return isSetMonetaryUnit();
			case PaymentMeteringPackage.ACCOUNTING_UNIT__VALUE:
				return isSetValue();
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
		result.append(" (multiplier: ");
		if (multiplierESet) result.append(multiplier); else result.append("<unset>");
		result.append(", energyUnit: ");
		if (energyUnitESet) result.append(energyUnit); else result.append("<unset>");
		result.append(", monetaryUnit: ");
		if (monetaryUnitESet) result.append(monetaryUnit); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AccountingUnit
