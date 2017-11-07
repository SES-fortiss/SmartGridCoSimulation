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
 * @see CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage
 * @generated
 */
public class InfCustomersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfCustomersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCustomersSwitch() {
		if (modelPackage == null) {
			modelPackage = InfCustomersPackage.eINSTANCE;
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
			case InfCustomersPackage.STANDARD_INDUSTRY_CODE: {
				StandardIndustryCode standardIndustryCode = (StandardIndustryCode)theEObject;
				T result = caseStandardIndustryCode(standardIndustryCode);
				if (result == null) result = caseDocument(standardIndustryCode);
				if (result == null) result = caseIdentifiedObject(standardIndustryCode);
				if (result == null) result = caseElement(standardIndustryCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.OUTAGE_HISTORY: {
				OutageHistory outageHistory = (OutageHistory)theEObject;
				T result = caseOutageHistory(outageHistory);
				if (result == null) result = caseDocument(outageHistory);
				if (result == null) result = caseIdentifiedObject(outageHistory);
				if (result == null) result = caseElement(outageHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.COMPLIANCE_EVENT: {
				ComplianceEvent complianceEvent = (ComplianceEvent)theEObject;
				T result = caseComplianceEvent(complianceEvent);
				if (result == null) result = caseActivityRecord(complianceEvent);
				if (result == null) result = caseIdentifiedObject(complianceEvent);
				if (result == null) result = caseElement(complianceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.CUSTOMER_BILLING_INFO: {
				CustomerBillingInfo customerBillingInfo = (CustomerBillingInfo)theEObject;
				T result = caseCustomerBillingInfo(customerBillingInfo);
				if (result == null) result = caseDocument(customerBillingInfo);
				if (result == null) result = caseIdentifiedObject(customerBillingInfo);
				if (result == null) result = caseElement(customerBillingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.SERVICE_GUARANTEE: {
				ServiceGuarantee serviceGuarantee = (ServiceGuarantee)theEObject;
				T result = caseServiceGuarantee(serviceGuarantee);
				if (result == null) result = caseDocument(serviceGuarantee);
				if (result == null) result = caseIdentifiedObject(serviceGuarantee);
				if (result == null) result = caseElement(serviceGuarantee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.SUBSCRIBE_POWER_CURVE: {
				SubscribePowerCurve subscribePowerCurve = (SubscribePowerCurve)theEObject;
				T result = caseSubscribePowerCurve(subscribePowerCurve);
				if (result == null) result = caseCurve(subscribePowerCurve);
				if (result == null) result = caseIdentifiedObject(subscribePowerCurve);
				if (result == null) result = caseElement(subscribePowerCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.EXTERNAL_CUSTOMER_AGREEMENT: {
				ExternalCustomerAgreement externalCustomerAgreement = (ExternalCustomerAgreement)theEObject;
				T result = caseExternalCustomerAgreement(externalCustomerAgreement);
				if (result == null) result = caseAgreement(externalCustomerAgreement);
				if (result == null) result = caseDocument(externalCustomerAgreement);
				if (result == null) result = caseIdentifiedObject(externalCustomerAgreement);
				if (result == null) result = caseElement(externalCustomerAgreement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.POWER_QUALITY_PRICING: {
				PowerQualityPricing powerQualityPricing = (PowerQualityPricing)theEObject;
				T result = casePowerQualityPricing(powerQualityPricing);
				if (result == null) result = caseDocument(powerQualityPricing);
				if (result == null) result = caseIdentifiedObject(powerQualityPricing);
				if (result == null) result = caseElement(powerQualityPricing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCustomersPackage.WORK_BILLING_INFO: {
				WorkBillingInfo workBillingInfo = (WorkBillingInfo)theEObject;
				T result = caseWorkBillingInfo(workBillingInfo);
				if (result == null) result = caseDocument(workBillingInfo);
				if (result == null) result = caseIdentifiedObject(workBillingInfo);
				if (result == null) result = caseElement(workBillingInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Industry Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Industry Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardIndustryCode(StandardIndustryCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outage History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outage History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutageHistory(OutageHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compliance Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compliance Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplianceEvent(ComplianceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Billing Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Billing Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerBillingInfo(CustomerBillingInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Guarantee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Guarantee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGuarantee(ServiceGuarantee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribe Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribe Power Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribePowerCurve(SubscribePowerCurve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Customer Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Customer Agreement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalCustomerAgreement(ExternalCustomerAgreement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Quality Pricing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Quality Pricing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerQualityPricing(PowerQualityPricing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Billing Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Billing Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkBillingInfo(WorkBillingInfo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityRecord(ActivityRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
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

} //InfCustomersSwitch
