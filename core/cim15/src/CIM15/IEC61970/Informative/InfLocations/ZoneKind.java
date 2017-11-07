/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Zone Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfLocations.InfLocationsPackage#getZoneKind()
 * @generated
 */
public enum ZoneKind implements Enumerator {
	/**
	 * The '<em><b>Weather Zone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEATHER_ZONE_VALUE
	 * @generated
	 * @ordered
	 */
	WEATHER_ZONE(0, "weatherZone", "weatherZone"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "other", "other"),

	/**
	 * The '<em><b>Special Restriction Land</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_RESTRICTION_LAND_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_RESTRICTION_LAND(2, "specialRestrictionLand", "specialRestrictionLand"),

	/**
	 * The '<em><b>Electrical Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICAL_NETWORK(3, "electricalNetwork", "electricalNetwork");

	/**
	 * The '<em><b>Weather Zone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weather Zone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEATHER_ZONE
	 * @generated
	 * @ordered
	 */
	public static final int WEATHER_ZONE_VALUE = 0;

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
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Special Restriction Land</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special Restriction Land</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_RESTRICTION_LAND
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_RESTRICTION_LAND_VALUE = 2;

	/**
	 * The '<em><b>Electrical Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electrical Network</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICAL_NETWORK
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_NETWORK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Zone Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ZoneKind[] VALUES_ARRAY =
		new ZoneKind[] {
			WEATHER_ZONE,
			OTHER,
			SPECIAL_RESTRICTION_LAND,
			ELECTRICAL_NETWORK,
		};

	/**
	 * A public read-only list of all the '<em><b>Zone Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ZoneKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Zone Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZoneKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ZoneKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Zone Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZoneKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ZoneKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Zone Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZoneKind get(int value) {
		switch (value) {
			case WEATHER_ZONE_VALUE: return WEATHER_ZONE;
			case OTHER_VALUE: return OTHER;
			case SPECIAL_RESTRICTION_LAND_VALUE: return SPECIAL_RESTRICTION_LAND;
			case ELECTRICAL_NETWORK_VALUE: return ELECTRICAL_NETWORK;
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
	private ZoneKind(int value, String name, String literal) {
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
	
} //ZoneKind
