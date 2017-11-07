/**
 */
package CIM15.IEC61970.Generation.Production;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hydro Energy Conversion Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroEnergyConversionKind()
 * @generated
 */
public enum HydroEnergyConversionKind implements Enumerator {
	/**
	 * The '<em><b>Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	GENERATOR(0, "generator", "generator"),

	/**
	 * The '<em><b>Pump And Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUMP_AND_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	PUMP_AND_GENERATOR(1, "pumpAndGenerator", "pumpAndGenerator");

	/**
	 * The '<em><b>Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATOR
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_VALUE = 0;

	/**
	 * The '<em><b>Pump And Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pump And Generator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUMP_AND_GENERATOR
	 * @generated
	 * @ordered
	 */
	public static final int PUMP_AND_GENERATOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Hydro Energy Conversion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HydroEnergyConversionKind[] VALUES_ARRAY =
		new HydroEnergyConversionKind[] {
			GENERATOR,
			PUMP_AND_GENERATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Hydro Energy Conversion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HydroEnergyConversionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hydro Energy Conversion Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydroEnergyConversionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HydroEnergyConversionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hydro Energy Conversion Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydroEnergyConversionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HydroEnergyConversionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hydro Energy Conversion Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydroEnergyConversionKind get(int value) {
		switch (value) {
			case GENERATOR_VALUE: return GENERATOR;
			case PUMP_AND_GENERATOR_VALUE: return PUMP_AND_GENERATOR;
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
	private HydroEnergyConversionKind(int value, String name, String literal) {
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
	
} //HydroEnergyConversionKind
