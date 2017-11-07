/**
 */
package CIM15.IEC61968.AssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cable Outer Jacket Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableOuterJacketKind()
 * @generated
 */
public enum CableOuterJacketKind implements Enumerator {
	/**
	 * The '<em><b>Pvc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PVC_VALUE
	 * @generated
	 * @ordered
	 */
	PVC(0, "pvc", "pvc"),

	/**
	 * The '<em><b>Linear Low Density Polyethylene</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_LOW_DENSITY_POLYETHYLENE_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR_LOW_DENSITY_POLYETHYLENE(1, "linearLowDensityPolyethylene", "linearLowDensityPolyethylene"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(2, "none", "none"),

	/**
	 * The '<em><b>Insulating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSULATING_VALUE
	 * @generated
	 * @ordered
	 */
	INSULATING(3, "insulating", "insulating"),

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
	 * The '<em><b>Polyethylene</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYETHYLENE_VALUE
	 * @generated
	 * @ordered
	 */
	POLYETHYLENE(5, "polyethylene", "polyethylene"),

	/**
	 * The '<em><b>Semiconducting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICONDUCTING_VALUE
	 * @generated
	 * @ordered
	 */
	SEMICONDUCTING(6, "semiconducting", "semiconducting");

	/**
	 * The '<em><b>Pvc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pvc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PVC
	 * @generated
	 * @ordered
	 */
	public static final int PVC_VALUE = 0;

	/**
	 * The '<em><b>Linear Low Density Polyethylene</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linear Low Density Polyethylene</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEAR_LOW_DENSITY_POLYETHYLENE
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_LOW_DENSITY_POLYETHYLENE_VALUE = 1;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 2;

	/**
	 * The '<em><b>Insulating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insulating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSULATING
	 * @generated
	 * @ordered
	 */
	public static final int INSULATING_VALUE = 3;

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
	 * The '<em><b>Polyethylene</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polyethylene</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYETHYLENE
	 * @generated
	 * @ordered
	 */
	public static final int POLYETHYLENE_VALUE = 5;

	/**
	 * The '<em><b>Semiconducting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semiconducting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMICONDUCTING
	 * @generated
	 * @ordered
	 */
	public static final int SEMICONDUCTING_VALUE = 6;

	/**
	 * An array of all the '<em><b>Cable Outer Jacket Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CableOuterJacketKind[] VALUES_ARRAY =
		new CableOuterJacketKind[] {
			PVC,
			LINEAR_LOW_DENSITY_POLYETHYLENE,
			NONE,
			INSULATING,
			OTHER,
			POLYETHYLENE,
			SEMICONDUCTING,
		};

	/**
	 * A public read-only list of all the '<em><b>Cable Outer Jacket Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CableOuterJacketKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cable Outer Jacket Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CableOuterJacketKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableOuterJacketKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Outer Jacket Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CableOuterJacketKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CableOuterJacketKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cable Outer Jacket Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CableOuterJacketKind get(int value) {
		switch (value) {
			case PVC_VALUE: return PVC;
			case LINEAR_LOW_DENSITY_POLYETHYLENE_VALUE: return LINEAR_LOW_DENSITY_POLYETHYLENE;
			case NONE_VALUE: return NONE;
			case INSULATING_VALUE: return INSULATING;
			case OTHER_VALUE: return OTHER;
			case POLYETHYLENE_VALUE: return POLYETHYLENE;
			case SEMICONDUCTING_VALUE: return SEMICONDUCTING;
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
	private CableOuterJacketKind(int value, String name, String literal) {
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
	
} //CableOuterJacketKind
