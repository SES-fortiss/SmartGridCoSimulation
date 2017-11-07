/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Streetlight Lamp Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightLampKind()
 * @generated
 */
public enum StreetlightLampKind implements Enumerator {
	/**
	 * The '<em><b>Metal Halide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAL_HALIDE_VALUE
	 * @generated
	 * @ordered
	 */
	METAL_HALIDE(0, "metalHalide", "metalHalide"),

	/**
	 * The '<em><b>High Pressure Sodium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_PRESSURE_SODIUM_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_PRESSURE_SODIUM(1, "highPressureSodium", "highPressureSodium"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "other", "other"),

	/**
	 * The '<em><b>Mercury Vapor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERCURY_VAPOR_VALUE
	 * @generated
	 * @ordered
	 */
	MERCURY_VAPOR(3, "mercuryVapor", "mercuryVapor");

	/**
	 * The '<em><b>Metal Halide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metal Halide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METAL_HALIDE
	 * @generated
	 * @ordered
	 */
	public static final int METAL_HALIDE_VALUE = 0;

	/**
	 * The '<em><b>High Pressure Sodium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Pressure Sodium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_PRESSURE_SODIUM
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_PRESSURE_SODIUM_VALUE = 1;

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
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Mercury Vapor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mercury Vapor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERCURY_VAPOR
	 * @generated
	 * @ordered
	 */
	public static final int MERCURY_VAPOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Streetlight Lamp Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StreetlightLampKind[] VALUES_ARRAY =
		new StreetlightLampKind[] {
			METAL_HALIDE,
			HIGH_PRESSURE_SODIUM,
			OTHER,
			MERCURY_VAPOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Streetlight Lamp Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StreetlightLampKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Streetlight Lamp Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreetlightLampKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StreetlightLampKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Streetlight Lamp Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreetlightLampKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StreetlightLampKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Streetlight Lamp Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreetlightLampKind get(int value) {
		switch (value) {
			case METAL_HALIDE_VALUE: return METAL_HALIDE;
			case HIGH_PRESSURE_SODIUM_VALUE: return HIGH_PRESSURE_SODIUM;
			case OTHER_VALUE: return OTHER;
			case MERCURY_VAPOR_VALUE: return MERCURY_VAPOR;
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
	private StreetlightLampKind(int value, String name, String literal) {
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
	
} //StreetlightLampKind
