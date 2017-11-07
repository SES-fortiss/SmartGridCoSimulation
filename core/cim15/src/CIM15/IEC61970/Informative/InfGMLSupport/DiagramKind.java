/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diagram Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage#getDiagramKind()
 * @generated
 */
public enum DiagramKind implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "other", "other"),

	/**
	 * The '<em><b>Geographic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOGRAPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	GEOGRAPHIC(1, "geographic", "geographic"),

	/**
	 * The '<em><b>Internal View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_VIEW(2, "internalView", "internalView"),

	/**
	 * The '<em><b>Design Sketch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_SKETCH_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN_SKETCH(3, "designSketch", "designSketch"),

	/**
	 * The '<em><b>Schematic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEMATIC(4, "schematic", "schematic");

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
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Geographic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Geographic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEOGRAPHIC
	 * @generated
	 * @ordered
	 */
	public static final int GEOGRAPHIC_VALUE = 1;

	/**
	 * The '<em><b>Internal View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Internal View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_VIEW
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VIEW_VALUE = 2;

	/**
	 * The '<em><b>Design Sketch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Design Sketch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN_SKETCH
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_SKETCH_VALUE = 3;

	/**
	 * The '<em><b>Schematic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Schematic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEMATIC
	 * @generated
	 * @ordered
	 */
	public static final int SCHEMATIC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Diagram Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiagramKind[] VALUES_ARRAY =
		new DiagramKind[] {
			OTHER,
			GEOGRAPHIC,
			INTERNAL_VIEW,
			DESIGN_SKETCH,
			SCHEMATIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Diagram Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiagramKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diagram Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagramKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagram Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiagramKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diagram Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramKind get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case GEOGRAPHIC_VALUE: return GEOGRAPHIC;
			case INTERNAL_VIEW_VALUE: return INTERNAL_VIEW;
			case DESIGN_SKETCH_VALUE: return DESIGN_SKETCH;
			case SCHEMATIC_VALUE: return SCHEMATIC;
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
	private DiagramKind(int value, String name, String literal) {
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
	
} //DiagramKind
