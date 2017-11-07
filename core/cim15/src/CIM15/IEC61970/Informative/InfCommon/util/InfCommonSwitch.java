/**
 */
package CIM15.IEC61970.Informative.InfCommon.util;

import CIM15.Element;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Organisation;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfCommon.*;

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
 * @see CIM15.IEC61970.Informative.InfCommon.InfCommonPackage
 * @generated
 */
public class InfCommonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfCommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCommonSwitch() {
		if (modelPackage == null) {
			modelPackage = InfCommonPackage.eINSTANCE;
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
			case InfCommonPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseIdentifiedObject(role);
				if (result == null) result = caseElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.BANK: {
				Bank bank = (Bank)theEObject;
				T result = caseBank(bank);
				if (result == null) result = caseOrganisation(bank);
				if (result == null) result = caseIdentifiedObject(bank);
				if (result == null) result = caseElement(bank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.SKILL: {
				Skill skill = (Skill)theEObject;
				T result = caseSkill(skill);
				if (result == null) result = caseDocument(skill);
				if (result == null) result = caseIdentifiedObject(skill);
				if (result == null) result = caseElement(skill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.BUSINESS_ROLE: {
				BusinessRole businessRole = (BusinessRole)theEObject;
				T result = caseBusinessRole(businessRole);
				if (result == null) result = caseIdentifiedObject(businessRole);
				if (result == null) result = caseElement(businessRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.SCHEDULED_EVENT: {
				ScheduledEvent scheduledEvent = (ScheduledEvent)theEObject;
				T result = caseScheduledEvent(scheduledEvent);
				if (result == null) result = caseIdentifiedObject(scheduledEvent);
				if (result == null) result = caseElement(scheduledEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO: {
				ScheduleParameterInfo scheduleParameterInfo = (ScheduleParameterInfo)theEObject;
				T result = caseScheduleParameterInfo(scheduleParameterInfo);
				if (result == null) result = caseIdentifiedObject(scheduleParameterInfo);
				if (result == null) result = caseElement(scheduleParameterInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.DOC_PSR_ROLE: {
				DocPsrRole docPsrRole = (DocPsrRole)theEObject;
				T result = caseDocPsrRole(docPsrRole);
				if (result == null) result = caseRole(docPsrRole);
				if (result == null) result = caseIdentifiedObject(docPsrRole);
				if (result == null) result = caseElement(docPsrRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.RATIO: {
				Ratio ratio = (Ratio)theEObject;
				T result = caseRatio(ratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.BANK_ACCOUNT: {
				BankAccount bankAccount = (BankAccount)theEObject;
				T result = caseBankAccount(bankAccount);
				if (result == null) result = caseDocument(bankAccount);
				if (result == null) result = caseIdentifiedObject(bankAccount);
				if (result == null) result = caseElement(bankAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.CRAFT: {
				Craft craft = (Craft)theEObject;
				T result = caseCraft(craft);
				if (result == null) result = caseIdentifiedObject(craft);
				if (result == null) result = caseElement(craft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.DOC_DOC_ROLE: {
				DocDocRole docDocRole = (DocDocRole)theEObject;
				T result = caseDocDocRole(docDocRole);
				if (result == null) result = caseRole(docDocRole);
				if (result == null) result = caseIdentifiedObject(docDocRole);
				if (result == null) result = caseElement(docDocRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfCommonPackage.BUSINESS_PLAN: {
				BusinessPlan businessPlan = (BusinessPlan)theEObject;
				T result = caseBusinessPlan(businessPlan);
				if (result == null) result = caseDocument(businessPlan);
				if (result == null) result = caseIdentifiedObject(businessPlan);
				if (result == null) result = caseElement(businessPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBank(Bank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkill(Skill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessRole(BusinessRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledEvent(ScheduledEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Parameter Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Parameter Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleParameterInfo(ScheduleParameterInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Psr Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Psr Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocPsrRole(DocPsrRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatio(Ratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankAccount(BankAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Craft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Craft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCraft(Craft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Doc Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Doc Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocDocRole(DocDocRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessPlan(BusinessPlan object) {
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

} //InfCommonSwitch
