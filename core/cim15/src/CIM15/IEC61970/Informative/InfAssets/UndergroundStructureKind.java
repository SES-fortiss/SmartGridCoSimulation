/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Underground Structure Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureKind()
 * @generated
 */
public enum UndergroundStructureKind implements Enumerator {
	/**
	 * The '<em><b>Trench</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	TRENCH(0, "trench", "trench"),

	/**
	 * The '<em><b>Pullbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULLBOX_VALUE
	 * @generated
	 * @ordered
	 */
	PULLBOX(1, "pullbox", "pullbox"),

	/**
	 * The '<em><b>Vault</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAULT_VALUE
	 * @generated
	 * @ordered
	 */
	VAULT(2, "vault", "vault"),

	/**
	 * The '<em><b>Burd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURD_VALUE
	 * @generated
	 * @ordered
	 */
	BURD(3, "burd", "burd"),

	/**
	 * The '<em><b>Subsurface Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSURFACE_ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSURFACE_ENCLOSURE(4, "subsurfaceEnclosure", "subsurfaceEnclosure"),

	/**
	 * The '<em><b>Handhole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	HANDHOLE(5, "handhole", "handhole"),

	/**
	 * The '<em><b>Enclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	ENCLOSURE(6, "enclosure", "enclosure"),

	/**
	 * The '<em><b>Tunnel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNNEL_VALUE
	 * @generated
	 * @ordered
	 */
	TUNNEL(7, "tunnel", "tunnel"),

	/**
	 * The '<em><b>Manhole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	MANHOLE(8, "manhole", "manhole"),

	/**
	 * The '<em><b>Pad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAD_VALUE
	 * @generated
	 * @ordered
	 */
	PAD(9, "pad", "pad");

	/**
	 * The '<em><b>Trench</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trench</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRENCH
	 * @generated
	 * @ordered
	 */
	public static final int TRENCH_VALUE = 0;

	/**
	 * The '<em><b>Pullbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pullbox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PULLBOX
	 * @generated
	 * @ordered
	 */
	public static final int PULLBOX_VALUE = 1;

	/**
	 * The '<em><b>Vault</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vault</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAULT
	 * @generated
	 * @ordered
	 */
	public static final int VAULT_VALUE = 2;

	/**
	 * The '<em><b>Burd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Burd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BURD
	 * @generated
	 * @ordered
	 */
	public static final int BURD_VALUE = 3;

	/**
	 * The '<em><b>Subsurface Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subsurface Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSURFACE_ENCLOSURE
	 * @generated
	 * @ordered
	 */
	public static final int SUBSURFACE_ENCLOSURE_VALUE = 4;

	/**
	 * The '<em><b>Handhole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Handhole</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HANDHOLE
	 * @generated
	 * @ordered
	 */
	public static final int HANDHOLE_VALUE = 5;

	/**
	 * The '<em><b>Enclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enclosure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCLOSURE
	 * @generated
	 * @ordered
	 */
	public static final int ENCLOSURE_VALUE = 6;

	/**
	 * The '<em><b>Tunnel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tunnel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNNEL
	 * @generated
	 * @ordered
	 */
	public static final int TUNNEL_VALUE = 7;

	/**
	 * The '<em><b>Manhole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manhole</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANHOLE
	 * @generated
	 * @ordered
	 */
	public static final int MANHOLE_VALUE = 8;

	/**
	 * The '<em><b>Pad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAD
	 * @generated
	 * @ordered
	 */
	public static final int PAD_VALUE = 9;

	/**
	 * An array of all the '<em><b>Underground Structure Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UndergroundStructureKind[] VALUES_ARRAY =
		new UndergroundStructureKind[] {
			TRENCH,
			PULLBOX,
			VAULT,
			BURD,
			SUBSURFACE_ENCLOSURE,
			HANDHOLE,
			ENCLOSURE,
			TUNNEL,
			MANHOLE,
			PAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Underground Structure Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UndergroundStructureKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Underground Structure Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UndergroundStructureKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UndergroundStructureKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Underground Structure Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UndergroundStructureKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UndergroundStructureKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Underground Structure Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UndergroundStructureKind get(int value) {
		switch (value) {
			case TRENCH_VALUE: return TRENCH;
			case PULLBOX_VALUE: return PULLBOX;
			case VAULT_VALUE: return VAULT;
			case BURD_VALUE: return BURD;
			case SUBSURFACE_ENCLOSURE_VALUE: return SUBSURFACE_ENCLOSURE;
			case HANDHOLE_VALUE: return HANDHOLE;
			case ENCLOSURE_VALUE: return ENCLOSURE;
			case TUNNEL_VALUE: return TUNNEL;
			case MANHOLE_VALUE: return MANHOLE;
			case PAD_VALUE: return PAD;
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
	private UndergroundStructureKind(int value, String name, String literal) {
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
	
} //UndergroundStructureKind
