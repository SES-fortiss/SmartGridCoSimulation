/**
 */
package CIM15.IEC61970.OperationalLimits.util;

import CIM15.Element;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.OperationalLimits.*;

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
 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage
 * @generated
 */
public class OperationalLimitsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationalLimitsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsSwitch() {
		if (modelPackage == null) {
			modelPackage = OperationalLimitsPackage.eINSTANCE;
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT: {
				ApparentPowerLimit apparentPowerLimit = (ApparentPowerLimit)theEObject;
				T result = caseApparentPowerLimit(apparentPowerLimit);
				if (result == null) result = caseOperationalLimit(apparentPowerLimit);
				if (result == null) result = caseIdentifiedObject(apparentPowerLimit);
				if (result == null) result = caseElement(apparentPowerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT: {
				ActivePowerLimit activePowerLimit = (ActivePowerLimit)theEObject;
				T result = caseActivePowerLimit(activePowerLimit);
				if (result == null) result = caseOperationalLimit(activePowerLimit);
				if (result == null) result = caseIdentifiedObject(activePowerLimit);
				if (result == null) result = caseElement(activePowerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE: {
				OperationalLimitType operationalLimitType = (OperationalLimitType)theEObject;
				T result = caseOperationalLimitType(operationalLimitType);
				if (result == null) result = caseIdentifiedObject(operationalLimitType);
				if (result == null) result = caseElement(operationalLimitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.BRANCH_GROUP: {
				BranchGroup branchGroup = (BranchGroup)theEObject;
				T result = caseBranchGroup(branchGroup);
				if (result == null) result = caseIdentifiedObject(branchGroup);
				if (result == null) result = caseElement(branchGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET: {
				OperationalLimitSet operationalLimitSet = (OperationalLimitSet)theEObject;
				T result = caseOperationalLimitSet(operationalLimitSet);
				if (result == null) result = caseIdentifiedObject(operationalLimitSet);
				if (result == null) result = caseElement(operationalLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET: {
				ActivePowerLimitSet activePowerLimitSet = (ActivePowerLimitSet)theEObject;
				T result = caseActivePowerLimitSet(activePowerLimitSet);
				if (result == null) result = caseOperationalLimitSet(activePowerLimitSet);
				if (result == null) result = caseIdentifiedObject(activePowerLimitSet);
				if (result == null) result = caseElement(activePowerLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.CURRENT_LIMIT: {
				CurrentLimit currentLimit = (CurrentLimit)theEObject;
				T result = caseCurrentLimit(currentLimit);
				if (result == null) result = caseOperationalLimit(currentLimit);
				if (result == null) result = caseIdentifiedObject(currentLimit);
				if (result == null) result = caseElement(currentLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.CURRENT_LIMIT_SET: {
				CurrentLimitSet currentLimitSet = (CurrentLimitSet)theEObject;
				T result = caseCurrentLimitSet(currentLimitSet);
				if (result == null) result = caseOperationalLimitSet(currentLimitSet);
				if (result == null) result = caseIdentifiedObject(currentLimitSet);
				if (result == null) result = caseElement(currentLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET: {
				ApparentPowerLimitSet apparentPowerLimitSet = (ApparentPowerLimitSet)theEObject;
				T result = caseApparentPowerLimitSet(apparentPowerLimitSet);
				if (result == null) result = caseOperationalLimitSet(apparentPowerLimitSet);
				if (result == null) result = caseIdentifiedObject(apparentPowerLimitSet);
				if (result == null) result = caseElement(apparentPowerLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL: {
				BranchGroupTerminal branchGroupTerminal = (BranchGroupTerminal)theEObject;
				T result = caseBranchGroupTerminal(branchGroupTerminal);
				if (result == null) result = caseElement(branchGroupTerminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET: {
				VoltageLimitSet voltageLimitSet = (VoltageLimitSet)theEObject;
				T result = caseVoltageLimitSet(voltageLimitSet);
				if (result == null) result = caseOperationalLimitSet(voltageLimitSet);
				if (result == null) result = caseIdentifiedObject(voltageLimitSet);
				if (result == null) result = caseElement(voltageLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.VOLTAGE_LIMIT: {
				VoltageLimit voltageLimit = (VoltageLimit)theEObject;
				T result = caseVoltageLimit(voltageLimit);
				if (result == null) result = caseOperationalLimit(voltageLimit);
				if (result == null) result = caseIdentifiedObject(voltageLimit);
				if (result == null) result = caseElement(voltageLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.OPERATIONAL_LIMIT: {
				OperationalLimit operationalLimit = (OperationalLimit)theEObject;
				T result = caseOperationalLimit(operationalLimit);
				if (result == null) result = caseIdentifiedObject(operationalLimit);
				if (result == null) result = caseElement(operationalLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApparentPowerLimit(ApparentPowerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivePowerLimit(ActivePowerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimitType(OperationalLimitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchGroup(BranchGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimitSet(OperationalLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Power Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Power Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivePowerLimitSet(ActivePowerLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentLimit(CurrentLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentLimitSet(CurrentLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apparent Power Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apparent Power Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApparentPowerLimitSet(ApparentPowerLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Group Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Group Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchGroupTerminal(BranchGroupTerminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageLimitSet(VoltageLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageLimit(VoltageLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimit(OperationalLimit object) {
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

} //OperationalLimitsSwitch
