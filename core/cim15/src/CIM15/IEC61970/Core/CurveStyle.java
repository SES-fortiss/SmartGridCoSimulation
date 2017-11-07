/**
 */
package CIM15.IEC61970.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Curve Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Core.CorePackage#getCurveStyle()
 * @generated
 */
public enum CurveStyle implements Enumerator {
	/**
	 * The '<em><b>Formula</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMULA_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULA(0, "formula", "formula"),

	/**
	 * The '<em><b>Constant YValue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_YVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT_YVALUE(1, "constantYValue", "constantYValue"),

	/**
	 * The '<em><b>Straight Line YValues</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_LINE_YVALUES_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_LINE_YVALUES(2, "straightLineYValues", "straightLineYValues"),

	/**
	 * The '<em><b>Ramp YValue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAMP_YVALUE_VALUE
	 * @generated
	 * @ordered
	 */
	RAMP_YVALUE(3, "rampYValue", "rampYValue");

	/**
	 * The '<em><b>Formula</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Formula</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMULA
	 * @generated
	 * @ordered
	 */
	public static final int FORMULA_VALUE = 0;

	/**
	 * The '<em><b>Constant YValue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constant YValue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_YVALUE
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_YVALUE_VALUE = 1;

	/**
	 * The '<em><b>Straight Line YValues</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Straight Line YValues</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_LINE_YVALUES
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_LINE_YVALUES_VALUE = 2;

	/**
	 * The '<em><b>Ramp YValue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ramp YValue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAMP_YVALUE
	 * @generated
	 * @ordered
	 */
	public static final int RAMP_YVALUE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Curve Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CurveStyle[] VALUES_ARRAY =
		new CurveStyle[] {
			FORMULA,
			CONSTANT_YVALUE,
			STRAIGHT_LINE_YVALUES,
			RAMP_YVALUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Curve Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CurveStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Curve Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CurveStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CurveStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Curve Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CurveStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CurveStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Curve Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CurveStyle get(int value) {
		switch (value) {
			case FORMULA_VALUE: return FORMULA;
			case CONSTANT_YVALUE_VALUE: return CONSTANT_YVALUE;
			case STRAIGHT_LINE_YVALUES_VALUE: return STRAIGHT_LINE_YVALUES;
			case RAMP_YVALUE_VALUE: return RAMP_YVALUE;
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
	private CurveStyle(int value, String name, String literal) {
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
	
} //CurveStyle
