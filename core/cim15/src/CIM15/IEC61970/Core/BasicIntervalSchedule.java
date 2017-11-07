/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Domain.UnitMultiplier;
import CIM15.IEC61970.Domain.UnitSymbol;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicIntervalSchedule extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * This is true if the Start Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startTimeESet;

	/**
	 * The default value of the '{@link #getValue1Multiplier() <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier VALUE1_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getValue1Multiplier() <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier value1Multiplier = VALUE1_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Value1 Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value1MultiplierESet;

	/**
	 * The default value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol VALUE2_UNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol value2Unit = VALUE2_UNIT_EDEFAULT;

	/**
	 * This is true if the Value2 Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value2UnitESet;

	/**
	 * The default value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol VALUE1_UNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol value1Unit = VALUE1_UNIT_EDEFAULT;

	/**
	 * This is true if the Value1 Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value1UnitESet;

	/**
	 * The default value of the '{@link #getValue2Multiplier() <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier VALUE2_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getValue2Multiplier() <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier value2Multiplier = VALUE2_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Value2 Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean value2MultiplierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicIntervalSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BASIC_INTERVAL_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #isSetStartTime()
	 * @see #unsetStartTime()
	 * @see #setStartTime(Date)
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #isSetStartTime()
	 * @see #unsetStartTime()
	 * @see #getStartTime()
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		startTime = newStartTime;
		startTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartTime()
	 * @see #getStartTime()
	 * @see #setStartTime(Date)
	 * @generated
	 */
	public void unsetStartTime() {
		startTime = START_TIME_EDEFAULT;
		startTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getStartTime <em>Start Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Time</em>' attribute is set.
	 * @see #unsetStartTime()
	 * @see #getStartTime()
	 * @see #setStartTime(Date)
	 * @generated
	 */
	public boolean isSetStartTime() {
		return startTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetValue1Multiplier()
	 * @see #unsetValue1Multiplier()
	 * @see #setValue1Multiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getValue1Multiplier() {
		return value1Multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetValue1Multiplier()
	 * @see #unsetValue1Multiplier()
	 * @see #getValue1Multiplier()
	 * @generated
	 */
	public void setValue1Multiplier(UnitMultiplier newValue1Multiplier) {
		value1Multiplier = newValue1Multiplier == null ? VALUE1_MULTIPLIER_EDEFAULT : newValue1Multiplier;
		value1MultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue1Multiplier()
	 * @see #getValue1Multiplier()
	 * @see #setValue1Multiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetValue1Multiplier() {
		value1Multiplier = VALUE1_MULTIPLIER_EDEFAULT;
		value1MultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Multiplier <em>Value1 Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value1 Multiplier</em>' attribute is set.
	 * @see #unsetValue1Multiplier()
	 * @see #getValue1Multiplier()
	 * @see #setValue1Multiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetValue1Multiplier() {
		return value1MultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Value2 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetValue2Unit()
	 * @see #unsetValue2Unit()
	 * @see #setValue2Unit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getValue2Unit() {
		return value2Unit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetValue2Unit()
	 * @see #unsetValue2Unit()
	 * @see #getValue2Unit()
	 * @generated
	 */
	public void setValue2Unit(UnitSymbol newValue2Unit) {
		value2Unit = newValue2Unit == null ? VALUE2_UNIT_EDEFAULT : newValue2Unit;
		value2UnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue2Unit()
	 * @see #getValue2Unit()
	 * @see #setValue2Unit(UnitSymbol)
	 * @generated
	 */
	public void unsetValue2Unit() {
		value2Unit = VALUE2_UNIT_EDEFAULT;
		value2UnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Unit <em>Value2 Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value2 Unit</em>' attribute is set.
	 * @see #unsetValue2Unit()
	 * @see #getValue2Unit()
	 * @see #setValue2Unit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetValue2Unit() {
		return value2UnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Value1 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value1 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetValue1Unit()
	 * @see #unsetValue1Unit()
	 * @see #setValue1Unit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getValue1Unit() {
		return value1Unit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetValue1Unit()
	 * @see #unsetValue1Unit()
	 * @see #getValue1Unit()
	 * @generated
	 */
	public void setValue1Unit(UnitSymbol newValue1Unit) {
		value1Unit = newValue1Unit == null ? VALUE1_UNIT_EDEFAULT : newValue1Unit;
		value1UnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue1Unit()
	 * @see #getValue1Unit()
	 * @see #setValue1Unit(UnitSymbol)
	 * @generated
	 */
	public void unsetValue1Unit() {
		value1Unit = VALUE1_UNIT_EDEFAULT;
		value1UnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue1Unit <em>Value1 Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value1 Unit</em>' attribute is set.
	 * @see #unsetValue1Unit()
	 * @see #getValue1Unit()
	 * @see #setValue1Unit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetValue1Unit() {
		return value1UnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value2 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetValue2Multiplier()
	 * @see #unsetValue2Multiplier()
	 * @see #setValue2Multiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getValue2Multiplier() {
		return value2Multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetValue2Multiplier()
	 * @see #unsetValue2Multiplier()
	 * @see #getValue2Multiplier()
	 * @generated
	 */
	public void setValue2Multiplier(UnitMultiplier newValue2Multiplier) {
		value2Multiplier = newValue2Multiplier == null ? VALUE2_MULTIPLIER_EDEFAULT : newValue2Multiplier;
		value2MultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue2Multiplier()
	 * @see #getValue2Multiplier()
	 * @see #setValue2Multiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetValue2Multiplier() {
		value2Multiplier = VALUE2_MULTIPLIER_EDEFAULT;
		value2MultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BasicIntervalSchedule#getValue2Multiplier <em>Value2 Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value2 Multiplier</em>' attribute is set.
	 * @see #unsetValue2Multiplier()
	 * @see #getValue2Multiplier()
	 * @see #setValue2Multiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetValue2Multiplier() {
		return value2MultiplierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				return getStartTime();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				return getValue1Multiplier();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				return getValue2Unit();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				return getValue1Unit();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				return getValue2Multiplier();
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
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				setStartTime((Date)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				setValue1Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				setValue2Unit((UnitSymbol)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				setValue1Unit((UnitSymbol)newValue);
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				setValue2Multiplier((UnitMultiplier)newValue);
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
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				unsetStartTime();
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				unsetValue1Multiplier();
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				unsetValue2Unit();
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				unsetValue1Unit();
				return;
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				unsetValue2Multiplier();
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
			case CorePackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
				return isSetStartTime();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER:
				return isSetValue1Multiplier();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
				return isSetValue2Unit();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
				return isSetValue1Unit();
			case CorePackage.BASIC_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER:
				return isSetValue2Multiplier();
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
		result.append(" (startTime: ");
		if (startTimeESet) result.append(startTime); else result.append("<unset>");
		result.append(", value1Multiplier: ");
		if (value1MultiplierESet) result.append(value1Multiplier); else result.append("<unset>");
		result.append(", value2Unit: ");
		if (value2UnitESet) result.append(value2Unit); else result.append("<unset>");
		result.append(", value1Unit: ");
		if (value1UnitESet) result.append(value1Unit); else result.append("<unset>");
		result.append(", value2Multiplier: ");
		if (value2MultiplierESet) result.append(value2Multiplier); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BasicIntervalSchedule
