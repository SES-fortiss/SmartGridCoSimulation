/**
 */
package CIM15.IEC61968.PaymentMetering;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentMeteringFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PaymentMeteringFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PaymentMeteringFactory INSTANCE = CIM15.IEC61968.PaymentMetering.PaymentMeteringFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentMeteringFactory init() {
		try {
			PaymentMeteringFactory thePaymentMeteringFactory = (PaymentMeteringFactory)EPackage.Registry.INSTANCE.getEFactory(PaymentMeteringPackage.eNS_URI);
			if (thePaymentMeteringFactory != null) {
				return thePaymentMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaymentMeteringFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMeteringFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PaymentMeteringPackage.VENDOR_SHIFT: return createVendorShift();
			case PaymentMeteringPackage.TRANSACTOR: return createTransactor();
			case PaymentMeteringPackage.CASHIER_SHIFT: return createCashierShift();
			case PaymentMeteringPackage.TARIFF_PROFILE: return createTariffProfile();
			case PaymentMeteringPackage.ACCOUNTING_UNIT: return createAccountingUnit();
			case PaymentMeteringPackage.TRANSACTION: return createTransaction();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL: return createTimeTariffInterval();
			case PaymentMeteringPackage.CHARGE: return createCharge();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT: return createAuxiliaryAgreement();
			case PaymentMeteringPackage.TENDER: return createTender();
			case PaymentMeteringPackage.SERVICE_SUPPLIER: return createServiceSupplier();
			case PaymentMeteringPackage.MERCHANT_AGREEMENT: return createMerchantAgreement();
			case PaymentMeteringPackage.LINE_DETAIL: return createLineDetail();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL: return createConsumptionTariffInterval();
			case PaymentMeteringPackage.VENDOR: return createVendor();
			case PaymentMeteringPackage.CHEQUE: return createCheque();
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT: return createAccountMovement();
			case PaymentMeteringPackage.SHIFT: return createShift();
			case PaymentMeteringPackage.RECEIPT: return createReceipt();
			case PaymentMeteringPackage.DUE: return createDue();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL: return createBankAccountDetail();
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT: return createAuxiliaryAccount();
			case PaymentMeteringPackage.CASHIER: return createCashier();
			case PaymentMeteringPackage.CARD: return createCard();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT: return createMerchantAccount();
			case PaymentMeteringPackage.POINT_OF_SALE: return createPointOfSale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PaymentMeteringPackage.TENDER_KIND:
				return createTenderKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.CHEQUE_KIND:
				return createChequeKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.CHARGE_KIND:
				return createChargeKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.TRANSACTION_KIND:
				return createTransactionKindFromString(eDataType, initialValue);
			case PaymentMeteringPackage.SUPPLIER_KIND:
				return createSupplierKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PaymentMeteringPackage.TENDER_KIND:
				return convertTenderKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.CHEQUE_KIND:
				return convertChequeKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.CHARGE_KIND:
				return convertChargeKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.TRANSACTION_KIND:
				return convertTransactionKindToString(eDataType, instanceValue);
			case PaymentMeteringPackage.SUPPLIER_KIND:
				return convertSupplierKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorShift createVendorShift() {
		VendorShift vendorShift = new VendorShift();
		return vendorShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transactor createTransactor() {
		Transactor transactor = new Transactor();
		return transactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierShift createCashierShift() {
		CashierShift cashierShift = new CashierShift();
		return cashierShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TariffProfile createTariffProfile() {
		TariffProfile tariffProfile = new TariffProfile();
		return tariffProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit createAccountingUnit() {
		AccountingUnit accountingUnit = new AccountingUnit();
		return accountingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		Transaction transaction = new Transaction();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTariffInterval createTimeTariffInterval() {
		TimeTariffInterval timeTariffInterval = new TimeTariffInterval();
		return timeTariffInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge createCharge() {
		Charge charge = new Charge();
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAgreement createAuxiliaryAgreement() {
		AuxiliaryAgreement auxiliaryAgreement = new AuxiliaryAgreement();
		return auxiliaryAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tender createTender() {
		Tender tender = new Tender();
		return tender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier createServiceSupplier() {
		ServiceSupplier serviceSupplier = new ServiceSupplier();
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAgreement createMerchantAgreement() {
		MerchantAgreement merchantAgreement = new MerchantAgreement();
		return merchantAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDetail createLineDetail() {
		LineDetail lineDetail = new LineDetail();
		return lineDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumptionTariffInterval createConsumptionTariffInterval() {
		ConsumptionTariffInterval consumptionTariffInterval = new ConsumptionTariffInterval();
		return consumptionTariffInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vendor createVendor() {
		Vendor vendor = new Vendor();
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque createCheque() {
		Cheque cheque = new Cheque();
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountMovement createAccountMovement() {
		AccountMovement accountMovement = new AccountMovement();
		return accountMovement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shift createShift() {
		Shift shift = new Shift();
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt createReceipt() {
		Receipt receipt = new Receipt();
		return receipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Due createDue() {
		Due due = new Due();
		return due;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccountDetail createBankAccountDetail() {
		BankAccountDetail bankAccountDetail = new BankAccountDetail();
		return bankAccountDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryAccount createAuxiliaryAccount() {
		AuxiliaryAccount auxiliaryAccount = new AuxiliaryAccount();
		return auxiliaryAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cashier createCashier() {
		Cashier cashier = new Cashier();
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		Card card = new Card();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAccount createMerchantAccount() {
		MerchantAccount merchantAccount = new MerchantAccount();
		return merchantAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale createPointOfSale() {
		PointOfSale pointOfSale = new PointOfSale();
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TenderKind createTenderKindFromString(EDataType eDataType, String initialValue) {
		TenderKind result = TenderKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTenderKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequeKind createChequeKindFromString(EDataType eDataType, String initialValue) {
		ChequeKind result = ChequeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChequeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeKind createChargeKindFromString(EDataType eDataType, String initialValue) {
		ChargeKind result = ChargeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionKind createTransactionKindFromString(EDataType eDataType, String initialValue) {
		TransactionKind result = TransactionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierKind createSupplierKindFromString(EDataType eDataType, String initialValue) {
		SupplierKind result = SupplierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMeteringPackage getPaymentMeteringPackage() {
		return (PaymentMeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaymentMeteringPackage getPackage() {
		return PaymentMeteringPackage.eINSTANCE;
	}

} //PaymentMeteringFactory
