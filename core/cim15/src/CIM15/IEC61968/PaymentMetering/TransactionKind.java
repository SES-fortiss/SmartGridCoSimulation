/**
 */
package CIM15.IEC61968.PaymentMetering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transaction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactionKind()
 * @generated
 */
public enum TransactionKind implements Enumerator {
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
	 * The '<em><b>Service Charge Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_CHARGE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_CHARGE_PAYMENT(1, "serviceChargePayment", "serviceChargePayment"),

	/**
	 * The '<em><b>Account Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT_PAYMENT(2, "accountPayment", "accountPayment"),

	/**
	 * The '<em><b>Token Sale Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_SALE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_SALE_PAYMENT(3, "tokenSalePayment", "tokenSalePayment"),

	/**
	 * The '<em><b>Token Cancellation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_CANCELLATION_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_CANCELLATION(4, "tokenCancellation", "tokenCancellation"),

	/**
	 * The '<em><b>Tax Charge Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_CHARGE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_CHARGE_PAYMENT(5, "taxChargePayment", "taxChargePayment"),

	/**
	 * The '<em><b>Token Exchange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_EXCHANGE(6, "tokenExchange", "tokenExchange"),

	/**
	 * The '<em><b>Token Grant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_GRANT_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_GRANT(7, "tokenGrant", "tokenGrant"),

	/**
	 * The '<em><b>Diverse Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVERSE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DIVERSE_PAYMENT(8, "diversePayment", "diversePayment"),

	/**
	 * The '<em><b>Auxiliary Charge Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CHARGE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARY_CHARGE_PAYMENT(9, "auxiliaryChargePayment", "auxiliaryChargePayment"),

	/**
	 * The '<em><b>Meter Configuration Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_CONFIGURATION_TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	METER_CONFIGURATION_TOKEN(10, "meterConfigurationToken", "meterConfigurationToken"),

	/**
	 * The '<em><b>Token Free Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_FREE_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_FREE_ISSUE(11, "tokenFreeIssue", "tokenFreeIssue"),

	/**
	 * The '<em><b>Transaction Reversal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_REVERSAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_REVERSAL(12, "transactionReversal", "transactionReversal");

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
	 * The '<em><b>Service Charge Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Charge Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_CHARGE_PAYMENT
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_CHARGE_PAYMENT_VALUE = 1;

	/**
	 * The '<em><b>Account Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Account Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_PAYMENT
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_PAYMENT_VALUE = 2;

	/**
	 * The '<em><b>Token Sale Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Sale Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_SALE_PAYMENT
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_SALE_PAYMENT_VALUE = 3;

	/**
	 * The '<em><b>Token Cancellation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Cancellation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_CANCELLATION
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_CANCELLATION_VALUE = 4;

	/**
	 * The '<em><b>Tax Charge Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Charge Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_CHARGE_PAYMENT
	 * @generated
	 * @ordered
	 */
	public static final int TAX_CHARGE_PAYMENT_VALUE = 5;

	/**
	 * The '<em><b>Token Exchange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Exchange</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_EXCHANGE
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_EXCHANGE_VALUE = 6;

	/**
	 * The '<em><b>Token Grant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Grant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_GRANT
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_GRANT_VALUE = 7;

	/**
	 * The '<em><b>Diverse Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diverse Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVERSE_PAYMENT
	 * @generated
	 * @ordered
	 */
	public static final int DIVERSE_PAYMENT_VALUE = 8;

	/**
	 * The '<em><b>Auxiliary Charge Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auxiliary Charge Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CHARGE_PAYMENT
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_CHARGE_PAYMENT_VALUE = 9;

	/**
	 * The '<em><b>Meter Configuration Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meter Configuration Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER_CONFIGURATION_TOKEN
	 * @generated
	 * @ordered
	 */
	public static final int METER_CONFIGURATION_TOKEN_VALUE = 10;

	/**
	 * The '<em><b>Token Free Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Free Issue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_FREE_ISSUE
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_FREE_ISSUE_VALUE = 11;

	/**
	 * The '<em><b>Transaction Reversal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Reversal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_REVERSAL
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_REVERSAL_VALUE = 12;

	/**
	 * An array of all the '<em><b>Transaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransactionKind[] VALUES_ARRAY =
		new TransactionKind[] {
			OTHER,
			SERVICE_CHARGE_PAYMENT,
			ACCOUNT_PAYMENT,
			TOKEN_SALE_PAYMENT,
			TOKEN_CANCELLATION,
			TAX_CHARGE_PAYMENT,
			TOKEN_EXCHANGE,
			TOKEN_GRANT,
			DIVERSE_PAYMENT,
			AUXILIARY_CHARGE_PAYMENT,
			METER_CONFIGURATION_TOKEN,
			TOKEN_FREE_ISSUE,
			TRANSACTION_REVERSAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Transaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransactionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transaction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransactionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransactionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransactionKind get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case SERVICE_CHARGE_PAYMENT_VALUE: return SERVICE_CHARGE_PAYMENT;
			case ACCOUNT_PAYMENT_VALUE: return ACCOUNT_PAYMENT;
			case TOKEN_SALE_PAYMENT_VALUE: return TOKEN_SALE_PAYMENT;
			case TOKEN_CANCELLATION_VALUE: return TOKEN_CANCELLATION;
			case TAX_CHARGE_PAYMENT_VALUE: return TAX_CHARGE_PAYMENT;
			case TOKEN_EXCHANGE_VALUE: return TOKEN_EXCHANGE;
			case TOKEN_GRANT_VALUE: return TOKEN_GRANT;
			case DIVERSE_PAYMENT_VALUE: return DIVERSE_PAYMENT;
			case AUXILIARY_CHARGE_PAYMENT_VALUE: return AUXILIARY_CHARGE_PAYMENT;
			case METER_CONFIGURATION_TOKEN_VALUE: return METER_CONFIGURATION_TOKEN;
			case TOKEN_FREE_ISSUE_VALUE: return TOKEN_FREE_ISSUE;
			case TRANSACTION_REVERSAL_VALUE: return TRANSACTION_REVERSAL;
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
	private TransactionKind(int value, String name, String literal) {
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
	
} //TransactionKind
