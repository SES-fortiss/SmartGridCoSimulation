/**
 */
package CIM15.IEC61970.Wires;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tap Changer Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Wires.WiresPackage#getTapChangerKind()
 * @generated
 */
public enum TapChangerKind implements Enumerator {
	/**
	 * The '<em><b>Voltage And Phase Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_AND_PHASE_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE_AND_PHASE_CONTROL(0, "voltageAndPhaseControl", "voltageAndPhaseControl"),

	/**
	 * The '<em><b>Phase Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	PHASE_CONTROL(1, "phaseControl", "phaseControl"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(2, "fixed", "fixed"),

	/**
	 * The '<em><b>Voltage Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE_CONTROL(3, "voltageControl", "voltageControl");

	/**
	 * The '<em><b>Voltage And Phase Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage And Phase Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_AND_PHASE_CONTROL
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_AND_PHASE_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>Phase Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phase Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASE_CONTROL
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_CONTROL_VALUE = 1;

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
	public static final int FIXED_VALUE = 2;

	/**
	 * The '<em><b>Voltage Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_CONTROL
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_CONTROL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tap Changer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TapChangerKind[] VALUES_ARRAY =
		new TapChangerKind[] {
			VOLTAGE_AND_PHASE_CONTROL,
			PHASE_CONTROL,
			FIXED,
			VOLTAGE_CONTROL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tap Changer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TapChangerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tap Changer Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TapChangerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TapChangerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tap Changer Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TapChangerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TapChangerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tap Changer Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TapChangerKind get(int value) {
		switch (value) {
			case VOLTAGE_AND_PHASE_CONTROL_VALUE: return VOLTAGE_AND_PHASE_CONTROL;
			case PHASE_CONTROL_VALUE: return PHASE_CONTROL;
			case FIXED_VALUE: return FIXED;
			case VOLTAGE_CONTROL_VALUE: return VOLTAGE_CONTROL;
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
	private TapChangerKind(int value, String name, String literal) {
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
	
} //TapChangerKind
