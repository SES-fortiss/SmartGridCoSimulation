/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Joint Fill Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointFillKind()
 * @generated
 */
public enum JointFillKind implements Enumerator {
	/**
	 * The '<em><b>Epoxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPOXY_VALUE
	 * @generated
	 * @ordered
	 */
	EPOXY(0, "epoxy", "epoxy"),

	/**
	 * The '<em><b>No Fill Prefab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_FILL_PREFAB_VALUE
	 * @generated
	 * @ordered
	 */
	NO_FILL_PREFAB(1, "noFillPrefab", "noFillPrefab"),

	/**
	 * The '<em><b>Air No Filling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_NO_FILLING_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_NO_FILLING(2, "airNoFilling", "airNoFilling"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other"),

	/**
	 * The '<em><b>Asphaltic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPHALTIC_VALUE
	 * @generated
	 * @ordered
	 */
	ASPHALTIC(4, "asphaltic", "asphaltic"),

	/**
	 * The '<em><b>Insoluseal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSOLUSEAL_VALUE
	 * @generated
	 * @ordered
	 */
	INSOLUSEAL(5, "insoluseal", "insoluseal"),

	/**
	 * The '<em><b>Oil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_VALUE
	 * @generated
	 * @ordered
	 */
	OIL(6, "oil", "oil"),

	/**
	 * The '<em><b>No Void</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VOID_VALUE
	 * @generated
	 * @ordered
	 */
	NO_VOID(7, "noVoid", "noVoid"),

	/**
	 * The '<em><b>Petrolatum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETROLATUM_VALUE
	 * @generated
	 * @ordered
	 */
	PETROLATUM(8, "petrolatum", "petrolatum"),

	/**
	 * The '<em><b>Bluefill254</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUEFILL254_VALUE
	 * @generated
	 * @ordered
	 */
	BLUEFILL254(9, "bluefill254", "bluefill254");

	/**
	 * The '<em><b>Epoxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Epoxy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EPOXY
	 * @generated
	 * @ordered
	 */
	public static final int EPOXY_VALUE = 0;

	/**
	 * The '<em><b>No Fill Prefab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Fill Prefab</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_FILL_PREFAB
	 * @generated
	 * @ordered
	 */
	public static final int NO_FILL_PREFAB_VALUE = 1;

	/**
	 * The '<em><b>Air No Filling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Air No Filling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIR_NO_FILLING
	 * @generated
	 * @ordered
	 */
	public static final int AIR_NO_FILLING_VALUE = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>Asphaltic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asphaltic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASPHALTIC
	 * @generated
	 * @ordered
	 */
	public static final int ASPHALTIC_VALUE = 4;

	/**
	 * The '<em><b>Insoluseal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insoluseal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSOLUSEAL
	 * @generated
	 * @ordered
	 */
	public static final int INSOLUSEAL_VALUE = 5;

	/**
	 * The '<em><b>Oil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oil</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OIL
	 * @generated
	 * @ordered
	 */
	public static final int OIL_VALUE = 6;

	/**
	 * The '<em><b>No Void</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Void</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_VOID
	 * @generated
	 * @ordered
	 */
	public static final int NO_VOID_VALUE = 7;

	/**
	 * The '<em><b>Petrolatum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Petrolatum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PETROLATUM
	 * @generated
	 * @ordered
	 */
	public static final int PETROLATUM_VALUE = 8;

	/**
	 * The '<em><b>Bluefill254</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bluefill254</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUEFILL254
	 * @generated
	 * @ordered
	 */
	public static final int BLUEFILL254_VALUE = 9;

	/**
	 * An array of all the '<em><b>Joint Fill Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JointFillKind[] VALUES_ARRAY =
		new JointFillKind[] {
			EPOXY,
			NO_FILL_PREFAB,
			AIR_NO_FILLING,
			OTHER,
			ASPHALTIC,
			INSOLUSEAL,
			OIL,
			NO_VOID,
			PETROLATUM,
			BLUEFILL254,
		};

	/**
	 * A public read-only list of all the '<em><b>Joint Fill Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JointFillKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Joint Fill Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointFillKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JointFillKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Joint Fill Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointFillKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JointFillKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Joint Fill Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointFillKind get(int value) {
		switch (value) {
			case EPOXY_VALUE: return EPOXY;
			case NO_FILL_PREFAB_VALUE: return NO_FILL_PREFAB;
			case AIR_NO_FILLING_VALUE: return AIR_NO_FILLING;
			case OTHER_VALUE: return OTHER;
			case ASPHALTIC_VALUE: return ASPHALTIC;
			case INSOLUSEAL_VALUE: return INSOLUSEAL;
			case OIL_VALUE: return OIL;
			case NO_VOID_VALUE: return NO_VOID;
			case PETROLATUM_VALUE: return PETROLATUM;
			case BLUEFILL254_VALUE: return BLUEFILL254;
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
	private JointFillKind(int value, String name, String literal) {
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
	
} //JointFillKind
