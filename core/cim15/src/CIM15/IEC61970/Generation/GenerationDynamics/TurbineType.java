/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Turbine Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage#getTurbineType()
 * @generated
 */
public enum TurbineType implements Enumerator {
	/**
	 * The '<em><b>Pelton</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PELTON_VALUE
	 * @generated
	 * @ordered
	 */
	PELTON(0, "pelton", "pelton"),

	/**
	 * The '<em><b>Kaplan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	KAPLAN(1, "kaplan", "kaplan"),

	/**
	 * The '<em><b>Francis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRANCIS_VALUE
	 * @generated
	 * @ordered
	 */
	FRANCIS(2, "francis", "francis");

	/**
	 * The '<em><b>Pelton</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pelton</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PELTON
	 * @generated
	 * @ordered
	 */
	public static final int PELTON_VALUE = 0;

	/**
	 * The '<em><b>Kaplan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kaplan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KAPLAN
	 * @generated
	 * @ordered
	 */
	public static final int KAPLAN_VALUE = 1;

	/**
	 * The '<em><b>Francis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Francis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRANCIS
	 * @generated
	 * @ordered
	 */
	public static final int FRANCIS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Turbine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TurbineType[] VALUES_ARRAY =
		new TurbineType[] {
			PELTON,
			KAPLAN,
			FRANCIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Turbine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TurbineType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Turbine Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TurbineType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TurbineType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Turbine Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TurbineType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TurbineType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Turbine Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TurbineType get(int value) {
		switch (value) {
			case PELTON_VALUE: return PELTON;
			case KAPLAN_VALUE: return KAPLAN;
			case FRANCIS_VALUE: return FRANCIS;
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
	private TurbineType(int value, String name, String literal) {
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
	
} //TurbineType
