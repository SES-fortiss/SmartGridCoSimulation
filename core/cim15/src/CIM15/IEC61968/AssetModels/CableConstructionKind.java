/**
 */
package CIM15.IEC61968.AssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cable Construction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableConstructionKind()
 * @generated
 */
public enum CableConstructionKind implements Enumerator {
	/**
	 * The '<em><b>Sector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SECTOR(0, "sector", "sector"),

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
	 * The '<em><b>Solid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID_VALUE
	 * @generated
	 * @ordered
	 */
	SOLID(2, "solid", "solid"),

	/**
	 * The '<em><b>Compacted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACTED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACTED(3, "compacted", "compacted"),

	/**
	 * The '<em><b>Stranded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRANDED_VALUE
	 * @generated
	 * @ordered
	 */
	STRANDED(4, "stranded", "stranded"),

	/**
	 * The '<em><b>Segmental</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENTAL(5, "segmental", "segmental"),

	/**
	 * The '<em><b>Compressed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSED(6, "compressed", "compressed");

	/**
	 * The '<em><b>Sector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECTOR
	 * @generated
	 * @ordered
	 */
	public static final int SECTOR_VALUE = 0;

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
	 * The '<em><b>Solid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLID
	 * @generated
	 * @ordered
	 */
	public static final int SOLID_VALUE = 2;

	/**
	 * The '<em><b>Compacted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compacted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPACTED
	 * @generated
	 * @ordered
	 */
	public static final int COMPACTED_VALUE = 3;

	/**
	 * The '<em><b>Stranded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stranded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRANDED
	 * @generated
	 * @ordered
	 */
	public static final int STRANDED_VALUE = 4;

	/**
	 * The '<em><b>Segmental</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segmental</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENTAL
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENTAL_VALUE = 5;

	/**
	 * The '<em><b>Compressed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compressed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSED
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Cable Construction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CableConstructionKind[] VALUES_ARRAY =
		new CableConstructionKind[] {
			SECTOR,
			OTHER,
			SOLID,
			COMPACTED,
			STRANDED,
			SEGMENTAL,
			COMPRESSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Cable Construction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CableConstructionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cable Construction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CableConstructionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableConstructionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Construction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CableConstructionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableConstructionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Construction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CableConstructionKind get(int value) {
		switch (value) {
			case SECTOR_VALUE: return SECTOR;
			case OTHER_VALUE: return OTHER;
			case SOLID_VALUE: return SOLID;
			case COMPACTED_VALUE: return COMPACTED;
			case STRANDED_VALUE: return STRANDED;
			case SEGMENTAL_VALUE: return SEGMENTAL;
			case COMPRESSED_VALUE: return COMPRESSED;
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
	private CableConstructionKind(int value, String name, String literal) {
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
	
} //CableConstructionKind
