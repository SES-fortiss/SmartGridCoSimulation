/**
 */
package CIM15.IEC61970.SCADA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Remote Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.SCADA.SCADAPackage#getRemoteUnitType()
 * @generated
 */
public enum RemoteUnitType implements Enumerator {
	/**
	 * The '<em><b>Substation Control System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTATION_CONTROL_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTATION_CONTROL_SYSTEM(0, "SubstationControlSystem", "SubstationControlSystem"),

	/**
	 * The '<em><b>IED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IED_VALUE
	 * @generated
	 * @ordered
	 */
	IED(1, "IED", "IED"),

	/**
	 * The '<em><b>Control Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_CENTER(2, "ControlCenter", "ControlCenter"),

	/**
	 * The '<em><b>RTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTU_VALUE
	 * @generated
	 * @ordered
	 */
	RTU(3, "RTU", "RTU");

	/**
	 * The '<em><b>Substation Control System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substation Control System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTATION_CONTROL_SYSTEM
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_CONTROL_SYSTEM_VALUE = 0;

	/**
	 * The '<em><b>IED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IED
	 * @generated
	 * @ordered
	 */
	public static final int IED_VALUE = 1;

	/**
	 * The '<em><b>Control Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Control Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROL_CENTER
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_CENTER_VALUE = 2;

	/**
	 * The '<em><b>RTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RTU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RTU
	 * @generated
	 * @ordered
	 */
	public static final int RTU_VALUE = 3;

	/**
	 * An array of all the '<em><b>Remote Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RemoteUnitType[] VALUES_ARRAY =
		new RemoteUnitType[] {
			SUBSTATION_CONTROL_SYSTEM,
			IED,
			CONTROL_CENTER,
			RTU,
		};

	/**
	 * A public read-only list of all the '<em><b>Remote Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RemoteUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Remote Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RemoteUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RemoteUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Remote Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RemoteUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RemoteUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Remote Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RemoteUnitType get(int value) {
		switch (value) {
			case SUBSTATION_CONTROL_SYSTEM_VALUE: return SUBSTATION_CONTROL_SYSTEM;
			case IED_VALUE: return IED;
			case CONTROL_CENTER_VALUE: return CONTROL_CENTER;
			case RTU_VALUE: return RTU;
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
	private RemoteUnitType(int value, String name, String literal) {
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
	
} //RemoteUnitType
