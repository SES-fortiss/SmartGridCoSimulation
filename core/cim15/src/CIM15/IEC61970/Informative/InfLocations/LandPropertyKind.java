/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Land Property Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfLocations.InfLocationsPackage#getLandPropertyKind()
 * @generated
 */
public enum LandPropertyKind implements Enumerator {
	/**
	 * The '<em><b>Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE_VALUE
	 * @generated
	 * @ordered
	 */
	STORE(0, "store", "store"),

	/**
	 * The '<em><b>Customer Premise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_PREMISE_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER_PREMISE(1, "customerPremise", "customerPremise"),

	/**
	 * The '<em><b>Building</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILDING_VALUE
	 * @generated
	 * @ordered
	 */
	BUILDING(2, "building", "building"),

	/**
	 * The '<em><b>External</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL(3, "external", "external"),

	/**
	 * The '<em><b>Grid Supply Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRID_SUPPLY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	GRID_SUPPLY_POINT(4, "gridSupplyPoint", "gridSupplyPoint"),

	/**
	 * The '<em><b>Substation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTATION(5, "substation", "substation"),

	/**
	 * The '<em><b>Depot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPOT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPOT(6, "depot", "depot");

	/**
	 * The '<em><b>Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Store</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORE
	 * @generated
	 * @ordered
	 */
	public static final int STORE_VALUE = 0;

	/**
	 * The '<em><b>Customer Premise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Customer Premise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_PREMISE
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_PREMISE_VALUE = 1;

	/**
	 * The '<em><b>Building</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Building</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILDING
	 * @generated
	 * @ordered
	 */
	public static final int BUILDING_VALUE = 2;

	/**
	 * The '<em><b>External</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_VALUE = 3;

	/**
	 * The '<em><b>Grid Supply Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grid Supply Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRID_SUPPLY_POINT
	 * @generated
	 * @ordered
	 */
	public static final int GRID_SUPPLY_POINT_VALUE = 4;

	/**
	 * The '<em><b>Substation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTATION
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_VALUE = 5;

	/**
	 * The '<em><b>Depot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Depot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPOT
	 * @generated
	 * @ordered
	 */
	public static final int DEPOT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Land Property Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LandPropertyKind[] VALUES_ARRAY =
		new LandPropertyKind[] {
			STORE,
			CUSTOMER_PREMISE,
			BUILDING,
			EXTERNAL,
			GRID_SUPPLY_POINT,
			SUBSTATION,
			DEPOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Land Property Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LandPropertyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Land Property Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LandPropertyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LandPropertyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Land Property Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LandPropertyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LandPropertyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Land Property Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LandPropertyKind get(int value) {
		switch (value) {
			case STORE_VALUE: return STORE;
			case CUSTOMER_PREMISE_VALUE: return CUSTOMER_PREMISE;
			case BUILDING_VALUE: return BUILDING;
			case EXTERNAL_VALUE: return EXTERNAL;
			case GRID_SUPPLY_POINT_VALUE: return GRID_SUPPLY_POINT;
			case SUBSTATION_VALUE: return SUBSTATION;
			case DEPOT_VALUE: return DEPOT;
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
	private LandPropertyKind(int value, String name, String literal) {
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
	
} //LandPropertyKind
