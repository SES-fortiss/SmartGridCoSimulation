/**
 */
package CIM15.IEC61970.Informative.InfAssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transformer Construction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerConstructionKind()
 * @generated
 */
public enum TransformerConstructionKind implements Enumerator {
	/**
	 * The '<em><b>Dry Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DRY_TYPE(0, "dryType", "dryType"),

	/**
	 * The '<em><b>Vault Three Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAULT_THREE_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	VAULT_THREE_PHASE(1, "vaultThreePhase", "vaultThreePhase"),

	/**
	 * The '<em><b>Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(2, "network", "network"),

	/**
	 * The '<em><b>Padmounted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNTED_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNTED(3, "padmounted", "padmounted"),

	/**
	 * The '<em><b>Padmount Loop Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LOOP_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_LOOP_THROUGH(4, "padmountLoopThrough", "padmountLoopThrough"),

	/**
	 * The '<em><b>Vault</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAULT_VALUE
	 * @generated
	 * @ordered
	 */
	VAULT(5, "vault", "vault"),

	/**
	 * The '<em><b>One Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_PHASE(6, "onePhase", "onePhase"),

	/**
	 * The '<em><b>Padmount Feed Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_FEED_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_FEED_THROUGH(7, "padmountFeedThrough", "padmountFeedThrough"),

	/**
	 * The '<em><b>Aerial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	AERIAL(8, "aerial", "aerial"),

	/**
	 * The '<em><b>Three Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_PHASE(9, "threePhase", "threePhase"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(10, "unknown", "unknown"),

	/**
	 * The '<em><b>Overhead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERHEAD_VALUE
	 * @generated
	 * @ordered
	 */
	OVERHEAD(11, "overhead", "overhead"),

	/**
	 * The '<em><b>Padmount Dead Front</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_DEAD_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_DEAD_FRONT(12, "padmountDeadFront", "padmountDeadFront"),

	/**
	 * The '<em><b>Underground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERGROUND(13, "underground", "underground"),

	/**
	 * The '<em><b>Padmount Live Front</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LIVE_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	PADMOUNT_LIVE_FRONT(14, "padmountLiveFront", "padmountLiveFront"),

	/**
	 * The '<em><b>Subway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBWAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUBWAY(15, "subway", "subway");

	/**
	 * The '<em><b>Dry Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dry Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRY_TYPE
	 * @generated
	 * @ordered
	 */
	public static final int DRY_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Vault Three Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vault Three Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAULT_THREE_PHASE
	 * @generated
	 * @ordered
	 */
	public static final int VAULT_THREE_PHASE_VALUE = 1;

	/**
	 * The '<em><b>Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Network</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 2;

	/**
	 * The '<em><b>Padmounted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmounted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNTED
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNTED_VALUE = 3;

	/**
	 * The '<em><b>Padmount Loop Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Loop Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LOOP_THROUGH
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_LOOP_THROUGH_VALUE = 4;

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
	public static final int VAULT_VALUE = 5;

	/**
	 * The '<em><b>One Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_PHASE
	 * @generated
	 * @ordered
	 */
	public static final int ONE_PHASE_VALUE = 6;

	/**
	 * The '<em><b>Padmount Feed Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Feed Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_FEED_THROUGH
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_FEED_THROUGH_VALUE = 7;

	/**
	 * The '<em><b>Aerial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aerial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AERIAL
	 * @generated
	 * @ordered
	 */
	public static final int AERIAL_VALUE = 8;

	/**
	 * The '<em><b>Three Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Three Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_PHASE
	 * @generated
	 * @ordered
	 */
	public static final int THREE_PHASE_VALUE = 9;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 10;

	/**
	 * The '<em><b>Overhead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overhead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERHEAD
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_VALUE = 11;

	/**
	 * The '<em><b>Padmount Dead Front</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Dead Front</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_DEAD_FRONT
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_DEAD_FRONT_VALUE = 12;

	/**
	 * The '<em><b>Underground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underground</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_VALUE = 13;

	/**
	 * The '<em><b>Padmount Live Front</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padmount Live Front</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADMOUNT_LIVE_FRONT
	 * @generated
	 * @ordered
	 */
	public static final int PADMOUNT_LIVE_FRONT_VALUE = 14;

	/**
	 * The '<em><b>Subway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subway</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBWAY
	 * @generated
	 * @ordered
	 */
	public static final int SUBWAY_VALUE = 15;

	/**
	 * An array of all the '<em><b>Transformer Construction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransformerConstructionKind[] VALUES_ARRAY =
		new TransformerConstructionKind[] {
			DRY_TYPE,
			VAULT_THREE_PHASE,
			NETWORK,
			PADMOUNTED,
			PADMOUNT_LOOP_THROUGH,
			VAULT,
			ONE_PHASE,
			PADMOUNT_FEED_THROUGH,
			AERIAL,
			THREE_PHASE,
			UNKNOWN,
			OVERHEAD,
			PADMOUNT_DEAD_FRONT,
			UNDERGROUND,
			PADMOUNT_LIVE_FRONT,
			SUBWAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Transformer Construction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransformerConstructionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transformer Construction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformerConstructionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformerConstructionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformer Construction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformerConstructionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformerConstructionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformer Construction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformerConstructionKind get(int value) {
		switch (value) {
			case DRY_TYPE_VALUE: return DRY_TYPE;
			case VAULT_THREE_PHASE_VALUE: return VAULT_THREE_PHASE;
			case NETWORK_VALUE: return NETWORK;
			case PADMOUNTED_VALUE: return PADMOUNTED;
			case PADMOUNT_LOOP_THROUGH_VALUE: return PADMOUNT_LOOP_THROUGH;
			case VAULT_VALUE: return VAULT;
			case ONE_PHASE_VALUE: return ONE_PHASE;
			case PADMOUNT_FEED_THROUGH_VALUE: return PADMOUNT_FEED_THROUGH;
			case AERIAL_VALUE: return AERIAL;
			case THREE_PHASE_VALUE: return THREE_PHASE;
			case UNKNOWN_VALUE: return UNKNOWN;
			case OVERHEAD_VALUE: return OVERHEAD;
			case PADMOUNT_DEAD_FRONT_VALUE: return PADMOUNT_DEAD_FRONT;
			case UNDERGROUND_VALUE: return UNDERGROUND;
			case PADMOUNT_LIVE_FRONT_VALUE: return PADMOUNT_LIVE_FRONT;
			case SUBWAY_VALUE: return SUBWAY;
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
	private TransformerConstructionKind(int value, String name, String literal) {
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
	
} //TransformerConstructionKind
