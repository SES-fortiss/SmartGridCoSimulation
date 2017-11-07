/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shunt Impedance Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceControlKind()
 * @generated
 */
public enum ShuntImpedanceControlKind implements Enumerator {
	/**
	 * The '<em><b>Remote Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_ONLY(0, "remoteOnly", "remoteOnly"),

	/**
	 * The '<em><b>Remote With Local Override</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_WITH_LOCAL_OVERRIDE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_WITH_LOCAL_OVERRIDE(1, "remoteWithLocalOverride", "remoteWithLocalOverride"),

	/**
	 * The '<em><b>Local Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_ONLY(2, "localOnly", "localOnly"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(3, "fixed", "fixed");

	/**
	 * The '<em><b>Remote Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ONLY
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Remote With Local Override</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote With Local Override</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_WITH_LOCAL_OVERRIDE
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_WITH_LOCAL_OVERRIDE_VALUE = 1;

	/**
	 * The '<em><b>Local Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_ONLY
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_ONLY_VALUE = 2;

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
	public static final int FIXED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Shunt Impedance Control Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShuntImpedanceControlKind[] VALUES_ARRAY =
		new ShuntImpedanceControlKind[] {
			REMOTE_ONLY,
			REMOTE_WITH_LOCAL_OVERRIDE,
			LOCAL_ONLY,
			FIXED,
		};

	/**
	 * A public read-only list of all the '<em><b>Shunt Impedance Control Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShuntImpedanceControlKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shunt Impedance Control Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShuntImpedanceControlKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShuntImpedanceControlKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shunt Impedance Control Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShuntImpedanceControlKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShuntImpedanceControlKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shunt Impedance Control Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShuntImpedanceControlKind get(int value) {
		switch (value) {
			case REMOTE_ONLY_VALUE: return REMOTE_ONLY;
			case REMOTE_WITH_LOCAL_OVERRIDE_VALUE: return REMOTE_WITH_LOCAL_OVERRIDE;
			case LOCAL_ONLY_VALUE: return LOCAL_ONLY;
			case FIXED_VALUE: return FIXED;
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
	private ShuntImpedanceControlKind(int value, String name, String literal) {
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
	
} //ShuntImpedanceControlKind
