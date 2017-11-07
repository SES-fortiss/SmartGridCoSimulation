/**
 */
package CIM15.IEC61968.PaymentMetering.util;

import CIM15.Element;

import CIM15.IEC61968.Common.Agreement;
import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Organisation;

import CIM15.IEC61968.PaymentMetering.*;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage
 * @generated
 */
public class PaymentMeteringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaymentMeteringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMeteringSwitch() {
		if (modelPackage == null) {
			modelPackage = PaymentMeteringPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PaymentMeteringPackage.VENDOR_SHIFT: {
				VendorShift vendorShift = (VendorShift)theEObject;
				T result = caseVendorShift(vendorShift);
				if (result == null) result = caseShift(vendorShift);
				if (result == null) result = caseIdentifiedObject(vendorShift);
				if (result == null) result = caseElement(vendorShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.TRANSACTOR: {
				Transactor transactor = (Transactor)theEObject;
				T result = caseTransactor(transactor);
				if (result == null) result = caseIdentifiedObject(transactor);
				if (result == null) result = caseElement(transactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.CASHIER_SHIFT: {
				CashierShift cashierShift = (CashierShift)theEObject;
				T result = caseCashierShift(cashierShift);
				if (result == null) result = caseShift(cashierShift);
				if (result == null) result = caseIdentifiedObject(cashierShift);
				if (result == null) result = caseElement(cashierShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.TARIFF_PROFILE: {
				TariffProfile tariffProfile = (TariffProfile)theEObject;
				T result = caseTariffProfile(tariffProfile);
				if (result == null) result = caseDocument(tariffProfile);
				if (result == null) result = caseIdentifiedObject(tariffProfile);
				if (result == null) result = caseElement(tariffProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.ACCOUNTING_UNIT: {
				AccountingUnit accountingUnit = (AccountingUnit)theEObject;
				T result = caseAccountingUnit(accountingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.TRANSACTION: {
				Transaction transaction = (Transaction)theEObject;
				T result = caseTransaction(transaction);
				if (result == null) result = caseIdentifiedObject(transaction);
				if (result == null) result = caseElement(transaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL: {
				TimeTariffInterval timeTariffInterval = (TimeTariffInterval)theEObject;
				T result = caseTimeTariffInterval(timeTariffInterval);
				if (result == null) result = caseElement(timeTariffInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.CHARGE: {
				Charge charge = (Charge)theEObject;
				T result = caseCharge(charge);
				if (result == null) result = caseIdentifiedObject(charge);
				if (result == null) result = caseElement(charge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT: {
				AuxiliaryAgreement auxiliaryAgreement = (AuxiliaryAgreement)theEObject;
				T result = caseAuxiliaryAgreement(auxiliaryAgreement);
				if (result == null) result = caseAgreement(auxiliaryAgreement);
				if (result == null) result = caseDocument(auxiliaryAgreement);
				if (result == null) result = caseIdentifiedObject(auxiliaryAgreement);
				if (result == null) result = caseElement(auxiliaryAgreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.TENDER: {
				Tender tender = (Tender)theEObject;
				T result = caseTender(tender);
				if (result == null) result = caseIdentifiedObject(tender);
				if (result == null) result = caseElement(tender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.SERVICE_SUPPLIER: {
				ServiceSupplier serviceSupplier = (ServiceSupplier)theEObject;
				T result = caseServiceSupplier(serviceSupplier);
				if (result == null) result = caseOrganisation(serviceSupplier);
				if (result == null) result = caseIdentifiedObject(serviceSupplier);
				if (result == null) result = caseElement(serviceSupplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.MERCHANT_AGREEMENT: {
				MerchantAgreement merchantAgreement = (MerchantAgreement)theEObject;
				T result = caseMerchantAgreement(merchantAgreement);
				if (result == null) result = caseAgreement(merchantAgreement);
				if (result == null) result = caseDocument(merchantAgreement);
				if (result == null) result = caseIdentifiedObject(merchantAgreement);
				if (result == null) result = caseElement(merchantAgreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.LINE_DETAIL: {
				LineDetail lineDetail = (LineDetail)theEObject;
				T result = caseLineDetail(lineDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL: {
				ConsumptionTariffInterval consumptionTariffInterval = (ConsumptionTariffInterval)theEObject;
				T result = caseConsumptionTariffInterval(consumptionTariffInterval);
				if (result == null) result = caseElement(consumptionTariffInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.VENDOR: {
				Vendor vendor = (Vendor)theEObject;
				T result = caseVendor(vendor);
				if (result == null) result = caseIdentifiedObject(vendor);
				if (result == null) result = caseElement(vendor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.CHEQUE: {
				Cheque cheque = (Cheque)theEObject;
				T result = caseCheque(cheque);
				if (result == null) result = caseElement(cheque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT: {
				AccountMovement accountMovement = (AccountMovement)theEObject;
				T result = caseAccountMovement(accountMovement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.SHIFT: {
				Shift shift = (Shift)theEObject;
				T result = caseShift(shift);
				if (result == null) result = caseIdentifiedObject(shift);
				if (result == null) result = caseElement(shift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.RECEIPT: {
				Receipt receipt = (Receipt)theEObject;
				T result = caseReceipt(receipt);
				if (result == null) result = caseIdentifiedObject(receipt);
				if (result == null) result = caseElement(receipt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.DUE: {
				Due due = (Due)theEObject;
				T result = caseDue(due);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL: {
				BankAccountDetail bankAccountDetail = (BankAccountDetail)theEObject;
				T result = caseBankAccountDetail(bankAccountDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.AUXILIARY_ACCOUNT: {
				AuxiliaryAccount auxiliaryAccount = (AuxiliaryAccount)theEObject;
				T result = caseAuxiliaryAccount(auxiliaryAccount);
				if (result == null) result = caseDocument(auxiliaryAccount);
				if (result == null) result = caseIdentifiedObject(auxiliaryAccount);
				if (result == null) result = caseElement(auxiliaryAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.CASHIER: {
				Cashier cashier = (Cashier)theEObject;
				T result = caseCashier(cashier);
				if (result == null) result = caseIdentifiedObject(cashier);
				if (result == null) result = caseElement(cashier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.CARD: {
				Card card = (Card)theEObject;
				T result = caseCard(card);
				if (result == null) result = caseElement(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.MERCHANT_ACCOUNT: {
				MerchantAccount merchantAccount = (MerchantAccount)theEObject;
				T result = caseMerchantAccount(merchantAccount);
				if (result == null) result = caseDocument(merchantAccount);
				if (result == null) result = caseIdentifiedObject(merchantAccount);
				if (result == null) result = caseElement(merchantAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PaymentMeteringPackage.POINT_OF_SALE: {
				PointOfSale pointOfSale = (PointOfSale)theEObject;
				T result = casePointOfSale(pointOfSale);
				if (result == null) result = caseIdentifiedObject(pointOfSale);
				if (result == null) result = caseElement(pointOfSale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorShift(VendorShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactor(Transactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cashier Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cashier Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCashierShift(CashierShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tariff Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tariff Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTariffProfile(TariffProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accounting Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accounting Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountingUnit(AccountingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Tariff Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Tariff Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTariffInterval(TimeTariffInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharge(Charge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryAgreement(AuxiliaryAgreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTender(Tender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSupplier(ServiceSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merchant Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merchant Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerchantAgreement(MerchantAgreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineDetail(LineDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumption Tariff Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumption Tariff Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumptionTariffInterval(ConsumptionTariffInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendor(Vendor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cheque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cheque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheque(Cheque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountMovement(AccountMovement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShift(Shift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receipt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceipt(Receipt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Due</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Due</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDue(Due object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Account Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Account Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankAccountDetail(BankAccountDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryAccount(AuxiliaryAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cashier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cashier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCashier(Cashier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merchant Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merchant Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerchantAccount(MerchantAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Of Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointOfSale(PointOfSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreement(Agreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PaymentMeteringSwitch
