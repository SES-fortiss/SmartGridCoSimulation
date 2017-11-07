/**
 */
package CIM15.IEC61970.Informative.InfCustomers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Customer Billing Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage#getCustomerBillingKind()
 * @generated
 */
public enum CustomerBillingKind implements Enumerator {
	/**
	 * The '<em><b>Consolidated Udc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSOLIDATED_UDC_VALUE
	 * @generated
	 * @ordered
	 */
	CONSOLIDATED_UDC(0, "consolidatedUdc", "consolidatedUdc"),

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
	 * The '<em><b>Separate Ess Udc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATE_ESS_UDC_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATE_ESS_UDC(2, "separateEssUdc", "separateEssUdc"),

	/**
	 * The '<em><b>Consolidated Ess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSOLIDATED_ESS_VALUE
	 * @generated
	 * @ordered
	 */
	CONSOLIDATED_ESS(3, "consolidatedEss", "consolidatedEss");

	/**
	 * The '<em><b>Consolidated Udc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consolidated Udc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSOLIDATED_UDC
	 * @generated
	 * @ordered
	 */
	public static final int CONSOLIDATED_UDC_VALUE = 0;

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
	 * The '<em><b>Separate Ess Udc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Separate Ess Udc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATE_ESS_UDC
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATE_ESS_UDC_VALUE = 2;

	/**
	 * The '<em><b>Consolidated Ess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consolidated Ess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSOLIDATED_ESS
	 * @generated
	 * @ordered
	 */
	public static final int CONSOLIDATED_ESS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Customer Billing Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CustomerBillingKind[] VALUES_ARRAY =
		new CustomerBillingKind[] {
			CONSOLIDATED_UDC,
			OTHER,
			SEPARATE_ESS_UDC,
			CONSOLIDATED_ESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Customer Billing Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CustomerBillingKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Customer Billing Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomerBillingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomerBillingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Customer Billing Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomerBillingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomerBillingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Customer Billing Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomerBillingKind get(int value) {
		switch (value) {
			case CONSOLIDATED_UDC_VALUE: return CONSOLIDATED_UDC;
			case OTHER_VALUE: return OTHER;
			case SEPARATE_ESS_UDC_VALUE: return SEPARATE_ESS_UDC;
			case CONSOLIDATED_ESS_VALUE: return CONSOLIDATED_ESS;
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
	private CustomerBillingKind(int value, String name, String literal) {
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
	
} //CustomerBillingKind
