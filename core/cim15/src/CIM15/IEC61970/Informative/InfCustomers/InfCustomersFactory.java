/**
 */
package CIM15.IEC61970.Informative.InfCustomers;

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
public class InfCustomersFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfCustomersFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfCustomersFactory INSTANCE = CIM15.IEC61970.Informative.InfCustomers.InfCustomersFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfCustomersFactory init() {
		try {
			InfCustomersFactory theInfCustomersFactory = (InfCustomersFactory)EPackage.Registry.INSTANCE.getEFactory(InfCustomersPackage.eNS_URI);
			if (theInfCustomersFactory != null) {
				return theInfCustomersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfCustomersFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCustomersFactory() {
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
			case InfCustomersPackage.STANDARD_INDUSTRY_CODE: return createStandardIndustryCode();
			case InfCustomersPackage.OUTAGE_HISTORY: return createOutageHistory();
			case InfCustomersPackage.COMPLIANCE_EVENT: return createComplianceEvent();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO: return createCustomerBillingInfo();
			case InfCustomersPackage.SERVICE_GUARANTEE: return createServiceGuarantee();
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE: return createSubscribePowerCurve();
			case InfCustomersPackage.EXTERNAL_CUSTOMER_AGREEMENT: return createExternalCustomerAgreement();
			case InfCustomersPackage.POWER_QUALITY_PRICING: return createPowerQualityPricing();
			case InfCustomersPackage.WORK_BILLING_INFO: return createWorkBillingInfo();
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
			case InfCustomersPackage.CUSTOMER_BILLING_KIND:
				return createCustomerBillingKindFromString(eDataType, initialValue);
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
			case InfCustomersPackage.CUSTOMER_BILLING_KIND:
				return convertCustomerBillingKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardIndustryCode createStandardIndustryCode() {
		StandardIndustryCode standardIndustryCode = new StandardIndustryCode();
		return standardIndustryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageHistory createOutageHistory() {
		OutageHistory outageHistory = new OutageHistory();
		return outageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceEvent createComplianceEvent() {
		ComplianceEvent complianceEvent = new ComplianceEvent();
		return complianceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerBillingInfo createCustomerBillingInfo() {
		CustomerBillingInfo customerBillingInfo = new CustomerBillingInfo();
		return customerBillingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGuarantee createServiceGuarantee() {
		ServiceGuarantee serviceGuarantee = new ServiceGuarantee();
		return serviceGuarantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribePowerCurve createSubscribePowerCurve() {
		SubscribePowerCurve subscribePowerCurve = new SubscribePowerCurve();
		return subscribePowerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCustomerAgreement createExternalCustomerAgreement() {
		ExternalCustomerAgreement externalCustomerAgreement = new ExternalCustomerAgreement();
		return externalCustomerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerQualityPricing createPowerQualityPricing() {
		PowerQualityPricing powerQualityPricing = new PowerQualityPricing();
		return powerQualityPricing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBillingInfo createWorkBillingInfo() {
		WorkBillingInfo workBillingInfo = new WorkBillingInfo();
		return workBillingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerBillingKind createCustomerBillingKindFromString(EDataType eDataType, String initialValue) {
		CustomerBillingKind result = CustomerBillingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerBillingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCustomersPackage getInfCustomersPackage() {
		return (InfCustomersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfCustomersPackage getPackage() {
		return InfCustomersPackage.eINSTANCE;
	}

} //InfCustomersFactory
