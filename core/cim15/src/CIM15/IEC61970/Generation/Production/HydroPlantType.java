/**
 */
package CIM15.IEC61970.Generation.Production;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hydro Plant Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPlantType()
 * @generated
 */
public enum HydroPlantType implements Enumerator {
	/**
	 * The '<em><b>Pumped Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUMPED_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PUMPED_STORAGE(0, "pumpedStorage", "pumpedStorage"),

	/**
	 * The '<em><b>Run Of River</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_OF_RIVER_VALUE
	 * @generated
	 * @ordered
	 */
	RUN_OF_RIVER(1, "runOfRiver", "runOfRiver"),

	/**
	 * The '<em><b>Minor Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_STORAGE(2, "minorStorage", "minorStorage"),

	/**
	 * The '<em><b>Major Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR_STORAGE(3, "majorStorage", "majorStorage");

	/**
	 * The '<em><b>Pumped Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pumped Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUMPED_STORAGE
	 * @generated
	 * @ordered
	 */
	public static final int PUMPED_STORAGE_VALUE = 0;

	/**
	 * The '<em><b>Run Of River</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Run Of River</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUN_OF_RIVER
	 * @generated
	 * @ordered
	 */
	public static final int RUN_OF_RIVER_VALUE = 1;

	/**
	 * The '<em><b>Minor Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minor Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR_STORAGE
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_STORAGE_VALUE = 2;

	/**
	 * The '<em><b>Major Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Major Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR_STORAGE
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_STORAGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hydro Plant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HydroPlantType[] VALUES_ARRAY =
		new HydroPlantType[] {
			PUMPED_STORAGE,
			RUN_OF_RIVER,
			MINOR_STORAGE,
			MAJOR_STORAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Hydro Plant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HydroPlantType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hydro Plant Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydroPlantType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HydroPlantType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hydro Plant Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydroPlantType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HydroPlantType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hydro Plant Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HydroPlantType get(int value) {
		switch (value) {
			case PUMPED_STORAGE_VALUE: return PUMPED_STORAGE;
			case RUN_OF_RIVER_VALUE: return RUN_OF_RIVER;
			case MINOR_STORAGE_VALUE: return MINOR_STORAGE;
			case MAJOR_STORAGE_VALUE: return MAJOR_STORAGE;
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
	private HydroPlantType(int value, String name, String literal) {
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
	
} //HydroPlantType
