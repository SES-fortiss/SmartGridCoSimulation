/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FACTS Device Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFACTSDeviceKind()
 * @generated
 */
public enum FACTSDeviceKind implements Enumerator {
	/**
	 * The '<em><b>Tcpar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCPAR_VALUE
	 * @generated
	 * @ordered
	 */
	TCPAR(0, "tcpar", "tcpar"),

	/**
	 * The '<em><b>Tssc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TSSC_VALUE
	 * @generated
	 * @ordered
	 */
	TSSC(1, "tssc", "tssc"),

	/**
	 * The '<em><b>Tsbr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TSBR_VALUE
	 * @generated
	 * @ordered
	 */
	TSBR(2, "tsbr", "tsbr"),

	/**
	 * The '<em><b>Svc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVC_VALUE
	 * @generated
	 * @ordered
	 */
	SVC(3, "svc", "svc"),

	/**
	 * The '<em><b>Tcsc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCSC_VALUE
	 * @generated
	 * @ordered
	 */
	TCSC(4, "tcsc", "tcsc"),

	/**
	 * The '<em><b>Tcvl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCVL_VALUE
	 * @generated
	 * @ordered
	 */
	TCVL(5, "tcvl", "tcvl"),

	/**
	 * The '<em><b>Statcom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATCOM_VALUE
	 * @generated
	 * @ordered
	 */
	STATCOM(6, "statcom", "statcom"),

	/**
	 * The '<em><b>Upfc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPFC_VALUE
	 * @generated
	 * @ordered
	 */
	UPFC(7, "upfc", "upfc");

	/**
	 * The '<em><b>Tcpar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tcpar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCPAR
	 * @generated
	 * @ordered
	 */
	public static final int TCPAR_VALUE = 0;

	/**
	 * The '<em><b>Tssc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tssc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TSSC
	 * @generated
	 * @ordered
	 */
	public static final int TSSC_VALUE = 1;

	/**
	 * The '<em><b>Tsbr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tsbr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TSBR
	 * @generated
	 * @ordered
	 */
	public static final int TSBR_VALUE = 2;

	/**
	 * The '<em><b>Svc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Svc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVC
	 * @generated
	 * @ordered
	 */
	public static final int SVC_VALUE = 3;

	/**
	 * The '<em><b>Tcsc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tcsc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCSC
	 * @generated
	 * @ordered
	 */
	public static final int TCSC_VALUE = 4;

	/**
	 * The '<em><b>Tcvl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tcvl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCVL
	 * @generated
	 * @ordered
	 */
	public static final int TCVL_VALUE = 5;

	/**
	 * The '<em><b>Statcom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Statcom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATCOM
	 * @generated
	 * @ordered
	 */
	public static final int STATCOM_VALUE = 6;

	/**
	 * The '<em><b>Upfc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upfc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPFC
	 * @generated
	 * @ordered
	 */
	public static final int UPFC_VALUE = 7;

	/**
	 * An array of all the '<em><b>FACTS Device Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FACTSDeviceKind[] VALUES_ARRAY =
		new FACTSDeviceKind[] {
			TCPAR,
			TSSC,
			TSBR,
			SVC,
			TCSC,
			TCVL,
			STATCOM,
			UPFC,
		};

	/**
	 * A public read-only list of all the '<em><b>FACTS Device Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FACTSDeviceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FACTS Device Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FACTSDeviceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FACTSDeviceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FACTS Device Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FACTSDeviceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FACTSDeviceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FACTS Device Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FACTSDeviceKind get(int value) {
		switch (value) {
			case TCPAR_VALUE: return TCPAR;
			case TSSC_VALUE: return TSSC;
			case TSBR_VALUE: return TSBR;
			case SVC_VALUE: return SVC;
			case TCSC_VALUE: return TCSC;
			case TCVL_VALUE: return TCVL;
			case STATCOM_VALUE: return STATCOM;
			case UPFC_VALUE: return UPFC;
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
	private FACTSDeviceKind(int value, String name, String literal) {
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
	
} //FACTSDeviceKind
