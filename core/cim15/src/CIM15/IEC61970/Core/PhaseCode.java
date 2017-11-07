/**
 */
package CIM15.IEC61970.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phase Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Core.CorePackage#getPhaseCode()
 * @generated
 */
public enum PhaseCode implements Enumerator {
	/**
	 * The '<em><b>S12N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S12_N_VALUE
	 * @generated
	 * @ordered
	 */
	S12_N(0, "s12N", "s12N"),

	/**
	 * The '<em><b>BN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BN_VALUE
	 * @generated
	 * @ordered
	 */
	BN(1, "BN", "BN"),

	/**
	 * The '<em><b>BC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BC_VALUE
	 * @generated
	 * @ordered
	 */
	BC(2, "BC", "BC"),

	/**
	 * The '<em><b>ABN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABN_VALUE
	 * @generated
	 * @ordered
	 */
	ABN(3, "ABN", "ABN"),

	/**
	 * The '<em><b>S2N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S2_N_VALUE
	 * @generated
	 * @ordered
	 */
	S2_N(4, "s2N", "s2N"),

	/**
	 * The '<em><b>N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N_VALUE
	 * @generated
	 * @ordered
	 */
	N(5, "N", "N"),

	/**
	 * The '<em><b>ACN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACN_VALUE
	 * @generated
	 * @ordered
	 */
	ACN(6, "ACN", "ACN"),

	/**
	 * The '<em><b>BCN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCN_VALUE
	 * @generated
	 * @ordered
	 */
	BCN(7, "BCN", "BCN"),

	/**
	 * The '<em><b>ABCN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABCN_VALUE
	 * @generated
	 * @ordered
	 */
	ABCN(8, "ABCN", "ABCN"),

	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(9, "AC", "AC"),

	/**
	 * The '<em><b>S1N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1_N_VALUE
	 * @generated
	 * @ordered
	 */
	S1_N(10, "s1N", "s1N"),

	/**
	 * The '<em><b>AN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AN_VALUE
	 * @generated
	 * @ordered
	 */
	AN(11, "AN", "AN"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(12, "B", "B"),

	/**
	 * The '<em><b>AB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AB_VALUE
	 * @generated
	 * @ordered
	 */
	AB(13, "AB", "AB"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(14, "C", "C"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(15, "A", "A"),

	/**
	 * The '<em><b>CN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CN_VALUE
	 * @generated
	 * @ordered
	 */
	CN(16, "CN", "CN"),

	/**
	 * The '<em><b>ABC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABC_VALUE
	 * @generated
	 * @ordered
	 */
	ABC(17, "ABC", "ABC");

	/**
	 * The '<em><b>S12N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S12N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S12_N
	 * @generated
	 * @ordered
	 */
	public static final int S12_N_VALUE = 0;

	/**
	 * The '<em><b>BN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BN
	 * @generated
	 * @ordered
	 */
	public static final int BN_VALUE = 1;

	/**
	 * The '<em><b>BC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BC
	 * @generated
	 * @ordered
	 */
	public static final int BC_VALUE = 2;

	/**
	 * The '<em><b>ABN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABN
	 * @generated
	 * @ordered
	 */
	public static final int ABN_VALUE = 3;

	/**
	 * The '<em><b>S2N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S2N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S2_N
	 * @generated
	 * @ordered
	 */
	public static final int S2_N_VALUE = 4;

	/**
	 * The '<em><b>N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N
	 * @generated
	 * @ordered
	 */
	public static final int N_VALUE = 5;

	/**
	 * The '<em><b>ACN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACN
	 * @generated
	 * @ordered
	 */
	public static final int ACN_VALUE = 6;

	/**
	 * The '<em><b>BCN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BCN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BCN
	 * @generated
	 * @ordered
	 */
	public static final int BCN_VALUE = 7;

	/**
	 * The '<em><b>ABCN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABCN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABCN
	 * @generated
	 * @ordered
	 */
	public static final int ABCN_VALUE = 8;

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AC
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 9;

	/**
	 * The '<em><b>S1N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S1N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S1_N
	 * @generated
	 * @ordered
	 */
	public static final int S1_N_VALUE = 10;

	/**
	 * The '<em><b>AN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AN
	 * @generated
	 * @ordered
	 */
	public static final int AN_VALUE = 11;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #B
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 12;

	/**
	 * The '<em><b>AB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AB
	 * @generated
	 * @ordered
	 */
	public static final int AB_VALUE = 13;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 14;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 15;

	/**
	 * The '<em><b>CN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CN
	 * @generated
	 * @ordered
	 */
	public static final int CN_VALUE = 16;

	/**
	 * The '<em><b>ABC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABC
	 * @generated
	 * @ordered
	 */
	public static final int ABC_VALUE = 17;

	/**
	 * An array of all the '<em><b>Phase Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhaseCode[] VALUES_ARRAY =
		new PhaseCode[] {
			S12_N,
			BN,
			BC,
			ABN,
			S2_N,
			N,
			ACN,
			BCN,
			ABCN,
			AC,
			S1_N,
			AN,
			B,
			AB,
			C,
			A,
			CN,
			ABC,
		};

	/**
	 * A public read-only list of all the '<em><b>Phase Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhaseCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Phase Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhaseCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhaseCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phase Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhaseCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhaseCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phase Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhaseCode get(int value) {
		switch (value) {
			case S12_N_VALUE: return S12_N;
			case BN_VALUE: return BN;
			case BC_VALUE: return BC;
			case ABN_VALUE: return ABN;
			case S2_N_VALUE: return S2_N;
			case N_VALUE: return N;
			case ACN_VALUE: return ACN;
			case BCN_VALUE: return BCN;
			case ABCN_VALUE: return ABCN;
			case AC_VALUE: return AC;
			case S1_N_VALUE: return S1_N;
			case AN_VALUE: return AN;
			case B_VALUE: return B;
			case AB_VALUE: return AB;
			case C_VALUE: return C;
			case A_VALUE: return A;
			case CN_VALUE: return CN;
			case ABC_VALUE: return ABC;
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
	private PhaseCode(int value, String name, String literal) {
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
	
} //PhaseCode
