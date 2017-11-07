/**
 */
package CIM15.IEC61970.Wires;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Regulating Control Mode Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Wires.WiresPackage#getRegulatingControlModeKind()
 * @generated
 */
public enum RegulatingControlModeKind implements Enumerator {
	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(0, "fixed", "fixed"),

	/**
	 * The '<em><b>Time Scheduled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SCHEDULED_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_SCHEDULED(1, "timeScheduled", "timeScheduled"),

	/**
	 * The '<em><b>Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE(2, "voltage", "voltage"),

	/**
	 * The '<em><b>Admittance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMITTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ADMITTANCE(3, "admittance", "admittance"),

	/**
	 * The '<em><b>Reactive Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTIVE_POWER_VALUE
	 * @generated
	 * @ordered
	 */
	REACTIVE_POWER(4, "reactivePower", "reactivePower"),

	/**
	 * The '<em><b>Power Factor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_FACTOR(5, "powerFactor", "powerFactor"),

	/**
	 * The '<em><b>Current Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_FLOW(6, "currentFlow", "currentFlow"),

	/**
	 * The '<em><b>Active Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_POWER_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE_POWER(7, "activePower", "activePower"),

	/**
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(8, "temperature", "temperature");

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 0;

	/**
	 * The '<em><b>Time Scheduled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Scheduled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_SCHEDULED
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULED_VALUE = 1;

	/**
	 * The '<em><b>Voltage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_VALUE = 2;

	/**
	 * The '<em><b>Admittance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Admittance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMITTANCE
	 * @generated
	 * @ordered
	 */
	public static final int ADMITTANCE_VALUE = 3;

	/**
	 * The '<em><b>Reactive Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reactive Power</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REACTIVE_POWER
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_POWER_VALUE = 4;

	/**
	 * The '<em><b>Power Factor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Factor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR
	 * @generated
	 * @ordered
	 */
	public static final int POWER_FACTOR_VALUE = 5;

	/**
	 * The '<em><b>Current Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Current Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENT_FLOW
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_FLOW_VALUE = 6;

	/**
	 * The '<em><b>Active Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Active Power</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_POWER
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_VALUE = 7;

	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Regulating Control Mode Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegulatingControlModeKind[] VALUES_ARRAY =
		new RegulatingControlModeKind[] {
			FIXED,
			TIME_SCHEDULED,
			VOLTAGE,
			ADMITTANCE,
			REACTIVE_POWER,
			POWER_FACTOR,
			CURRENT_FLOW,
			ACTIVE_POWER,
			TEMPERATURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Regulating Control Mode Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegulatingControlModeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegulatingControlModeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegulatingControlModeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegulatingControlModeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegulatingControlModeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Regulating Control Mode Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegulatingControlModeKind get(int value) {
		switch (value) {
			case FIXED_VALUE: return FIXED;
			case TIME_SCHEDULED_VALUE: return TIME_SCHEDULED;
			case VOLTAGE_VALUE: return VOLTAGE;
			case ADMITTANCE_VALUE: return ADMITTANCE;
			case REACTIVE_POWER_VALUE: return REACTIVE_POWER;
			case POWER_FACTOR_VALUE: return POWER_FACTOR;
			case CURRENT_FLOW_VALUE: return CURRENT_FLOW;
			case ACTIVE_POWER_VALUE: return ACTIVE_POWER;
			case TEMPERATURE_VALUE: return TEMPERATURE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RegulatingControlModeKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RegulatingControlModeKind
