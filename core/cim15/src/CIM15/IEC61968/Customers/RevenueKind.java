/**
 */
package CIM15.IEC61968.Customers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Revenue Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.Customers.CustomersPackage#getRevenueKind()
 * @generated
 */
public enum RevenueKind implements Enumerator {
	/**
	 * The '<em><b>Irrigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRRIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	IRRIGATION(0, "irrigation", "irrigation"),

	/**
	 * The '<em><b>Residential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENTIAL(1, "residential", "residential"),

	/**
	 * The '<em><b>Non Residential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_RESIDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	NON_RESIDENTIAL(2, "nonResidential", "nonResidential"),

	/**
	 * The '<em><b>Industrial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INDUSTRIAL(3, "industrial", "industrial"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other"),

	/**
	 * The '<em><b>Commercial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMERCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	COMMERCIAL(5, "commercial", "commercial"),

	/**
	 * The '<em><b>Street Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREET_LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STREET_LIGHT(6, "streetLight", "streetLight");

	/**
	 * The '<em><b>Irrigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Irrigation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRRIGATION
	 * @generated
	 * @ordered
	 */
	public static final int IRRIGATION_VALUE = 0;

	/**
	 * The '<em><b>Residential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENTIAL_VALUE = 1;

	/**
	 * The '<em><b>Non Residential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Residential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_RESIDENTIAL
	 * @generated
	 * @ordered
	 */
	public static final int NON_RESIDENTIAL_VALUE = 2;

	/**
	 * The '<em><b>Industrial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Industrial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDUSTRIAL
	 * @generated
	 * @ordered
	 */
	public static final int INDUSTRIAL_VALUE = 3;

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
	public static final int OTHER_VALUE = 4;

	/**
	 * The '<em><b>Commercial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Commercial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMERCIAL
	 * @generated
	 * @ordered
	 */
	public static final int COMMERCIAL_VALUE = 5;

	/**
	 * The '<em><b>Street Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Street Light</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREET_LIGHT
	 * @generated
	 * @ordered
	 */
	public static final int STREET_LIGHT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Revenue Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RevenueKind[] VALUES_ARRAY =
		new RevenueKind[] {
			IRRIGATION,
			RESIDENTIAL,
			NON_RESIDENTIAL,
			INDUSTRIAL,
			OTHER,
			COMMERCIAL,
			STREET_LIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Revenue Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RevenueKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Revenue Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevenueKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RevenueKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Revenue Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevenueKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RevenueKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Revenue Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevenueKind get(int value) {
		switch (value) {
			case IRRIGATION_VALUE: return IRRIGATION;
			case RESIDENTIAL_VALUE: return RESIDENTIAL;
			case NON_RESIDENTIAL_VALUE: return NON_RESIDENTIAL;
			case INDUSTRIAL_VALUE: return INDUSTRIAL;
			case OTHER_VALUE: return OTHER;
			case COMMERCIAL_VALUE: return COMMERCIAL;
			case STREET_LIGHT_VALUE: return STREET_LIGHT;
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
	private RevenueKind(int value, String name, String literal) {
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
	
} //RevenueKind
