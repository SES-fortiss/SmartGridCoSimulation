/**
 */
package CIM15.IEC61970.Informative.InfCustomers.util;

import CIM15.Element;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.Agreement;
import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Core.Curve;
import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfCustomers.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage
 * @generated
 */
public class InfCustomersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfCustomersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCustomersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfCustomersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfCustomersSwitch<Adapter> modelSwitch =
		new InfCustomersSwitch<Adapter>() {
			@Override
			public Adapter caseStandardIndustryCode(StandardIndustryCode object) {
				return createStandardIndustryCodeAdapter();
			}
			@Override
			public Adapter caseOutageHistory(OutageHistory object) {
				return createOutageHistoryAdapter();
			}
			@Override
			public Adapter caseComplianceEvent(ComplianceEvent object) {
				return createComplianceEventAdapter();
			}
			@Override
			public Adapter caseCustomerBillingInfo(CustomerBillingInfo object) {
				return createCustomerBillingInfoAdapter();
			}
			@Override
			public Adapter caseServiceGuarantee(ServiceGuarantee object) {
				return createServiceGuaranteeAdapter();
			}
			@Override
			public Adapter caseSubscribePowerCurve(SubscribePowerCurve object) {
				return createSubscribePowerCurveAdapter();
			}
			@Override
			public Adapter caseExternalCustomerAgreement(ExternalCustomerAgreement object) {
				return createExternalCustomerAgreementAdapter();
			}
			@Override
			public Adapter casePowerQualityPricing(PowerQualityPricing object) {
				return createPowerQualityPricingAdapter();
			}
			@Override
			public Adapter caseWorkBillingInfo(WorkBillingInfo object) {
				return createWorkBillingInfoAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseActivityRecord(ActivityRecord object) {
				return createActivityRecordAdapter();
			}
			@Override
			public Adapter caseCurve(Curve object) {
				return createCurveAdapter();
			}
			@Override
			public Adapter caseAgreement(Agreement object) {
				return createAgreementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.StandardIndustryCode <em>Standard Industry Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.StandardIndustryCode
	 * @generated
	 */
	public Adapter createStandardIndustryCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.OutageHistory <em>Outage History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.OutageHistory
	 * @generated
	 */
	public Adapter createOutageHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.ComplianceEvent <em>Compliance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.ComplianceEvent
	 * @generated
	 */
	public Adapter createComplianceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo <em>Customer Billing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo
	 * @generated
	 */
	public Adapter createCustomerBillingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee <em>Service Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee
	 * @generated
	 */
	public Adapter createServiceGuaranteeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.SubscribePowerCurve <em>Subscribe Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.SubscribePowerCurve
	 * @generated
	 */
	public Adapter createSubscribePowerCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.ExternalCustomerAgreement <em>External Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.ExternalCustomerAgreement
	 * @generated
	 */
	public Adapter createExternalCustomerAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.PowerQualityPricing <em>Power Quality Pricing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.PowerQualityPricing
	 * @generated
	 */
	public Adapter createPowerQualityPricingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo <em>Work Billing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo
	 * @generated
	 */
	public Adapter createWorkBillingInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.ActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.ActivityRecord
	 * @generated
	 */
	public Adapter createActivityRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.Curve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.Curve
	 * @generated
	 */
	public Adapter createCurveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.Agreement
	 * @generated
	 */
	public Adapter createAgreementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InfCustomersAdapterFactory
