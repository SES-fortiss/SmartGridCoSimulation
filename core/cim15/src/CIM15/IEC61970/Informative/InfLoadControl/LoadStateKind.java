/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Load State Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadStateKind()
 * @generated
 */
public enum LoadStateKind implements Enumerator {
	/**
	 * The '<em><b>Limited Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITED_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LIMITED_LOAD(0, "limitedLoad", "limitedLoad"),

	/**
	 * The '<em><b>No Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	NO_LOAD(1, "noLoad", "noLoad"),

	/**
	 * The '<em><b>Full Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_LOAD(2, "fullLoad", "fullLoad");

	/**
	 * The '<em><b>Limited Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Limited Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIMITED_LOAD
	 * @generated
	 * @ordered
	 */
	public static final int LIMITED_LOAD_VALUE = 0;

	/**
	 * The '<em><b>No Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_LOAD
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_VALUE = 1;

	/**
	 * The '<em><b>Full Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_LOAD
	 * @generated
	 * @ordered
	 */
	public static final int FULL_LOAD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Load State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LoadStateKind[] VALUES_ARRAY =
		new LoadStateKind[] {
			LIMITED_LOAD,
			NO_LOAD,
			FULL_LOAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Load State Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LoadStateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Load State Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadStateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoadStateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Load State Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadStateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoadStateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Load State Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadStateKind get(int value) {
		switch (value) {
			case LIMITED_LOAD_VALUE: return LIMITED_LOAD;
			case NO_LOAD_VALUE: return NO_LOAD;
			case FULL_LOAD_VALUE: return FULL_LOAD;
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
	private LoadStateKind(int value, String name, String literal) {
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
	
} //LoadStateKind
