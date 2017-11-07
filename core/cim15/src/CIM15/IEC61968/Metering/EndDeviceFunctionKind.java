/**
 */
package CIM15.IEC61968.Metering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>End Device Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.Metering.MeteringPackage#getEndDeviceFunctionKind()
 * @generated
 */
public enum EndDeviceFunctionKind implements Enumerator {
	/**
	 * The '<em><b>On Request Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_REQUEST_READ_VALUE
	 * @generated
	 * @ordered
	 */
	ON_REQUEST_READ(0, "onRequestRead", "onRequestRead"),

	/**
	 * The '<em><b>Relays Programming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAYS_PROGRAMMING_VALUE
	 * @generated
	 * @ordered
	 */
	RELAYS_PROGRAMMING(1, "relaysProgramming", "relaysProgramming"),

	/**
	 * The '<em><b>Demand Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	DEMAND_RESPONSE(2, "demandResponse", "demandResponse"),

	/**
	 * The '<em><b>Metrology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METROLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	METROLOGY(3, "metrology", "metrology"),

	/**
	 * The '<em><b>Outage History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTAGE_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	OUTAGE_HISTORY(4, "outageHistory", "outageHistory"),

	/**
	 * The '<em><b>Autonomous Dst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_DST_VALUE
	 * @generated
	 * @ordered
	 */
	AUTONOMOUS_DST(5, "autonomousDst", "autonomousDst"),

	/**
	 * The '<em><b>Reverse Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERSE_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	REVERSE_FLOW(6, "reverseFlow", "reverseFlow");

	/**
	 * The '<em><b>On Request Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Request Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_REQUEST_READ
	 * @generated
	 * @ordered
	 */
	public static final int ON_REQUEST_READ_VALUE = 0;

	/**
	 * The '<em><b>Relays Programming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relays Programming</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELAYS_PROGRAMMING
	 * @generated
	 * @ordered
	 */
	public static final int RELAYS_PROGRAMMING_VALUE = 1;

	/**
	 * The '<em><b>Demand Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Demand Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEMAND_RESPONSE
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_RESPONSE_VALUE = 2;

	/**
	 * The '<em><b>Metrology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metrology</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METROLOGY
	 * @generated
	 * @ordered
	 */
	public static final int METROLOGY_VALUE = 3;

	/**
	 * The '<em><b>Outage History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outage History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTAGE_HISTORY
	 * @generated
	 * @ordered
	 */
	public static final int OUTAGE_HISTORY_VALUE = 4;

	/**
	 * The '<em><b>Autonomous Dst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autonomous Dst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_DST
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMOUS_DST_VALUE = 5;

	/**
	 * The '<em><b>Reverse Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reverse Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERSE_FLOW
	 * @generated
	 * @ordered
	 */
	public static final int REVERSE_FLOW_VALUE = 6;

	/**
	 * An array of all the '<em><b>End Device Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EndDeviceFunctionKind[] VALUES_ARRAY =
		new EndDeviceFunctionKind[] {
			ON_REQUEST_READ,
			RELAYS_PROGRAMMING,
			DEMAND_RESPONSE,
			METROLOGY,
			OUTAGE_HISTORY,
			AUTONOMOUS_DST,
			REVERSE_FLOW,
		};

	/**
	 * A public read-only list of all the '<em><b>End Device Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EndDeviceFunctionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>End Device Function Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndDeviceFunctionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndDeviceFunctionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>End Device Function Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndDeviceFunctionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndDeviceFunctionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>End Device Function Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndDeviceFunctionKind get(int value) {
		switch (value) {
			case ON_REQUEST_READ_VALUE: return ON_REQUEST_READ;
			case RELAYS_PROGRAMMING_VALUE: return RELAYS_PROGRAMMING;
			case DEMAND_RESPONSE_VALUE: return DEMAND_RESPONSE;
			case METROLOGY_VALUE: return METROLOGY;
			case OUTAGE_HISTORY_VALUE: return OUTAGE_HISTORY;
			case AUTONOMOUS_DST_VALUE: return AUTONOMOUS_DST;
			case REVERSE_FLOW_VALUE: return REVERSE_FLOW;
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
	private EndDeviceFunctionKind(int value, String name, String literal) {
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
	
} //EndDeviceFunctionKind
