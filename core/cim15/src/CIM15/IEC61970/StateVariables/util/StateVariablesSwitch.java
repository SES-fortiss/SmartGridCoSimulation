/**
 */
package CIM15.IEC61970.StateVariables.util;

import CIM15.Element;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.StateVariables.*;

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
 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage
 * @generated
 */
public class StateVariablesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StateVariablesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariablesSwitch() {
		if (modelPackage == null) {
			modelPackage = StateVariablesPackage.eINSTANCE;
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
			case StateVariablesPackage.SV_VOLTAGE: {
				SvVoltage svVoltage = (SvVoltage)theEObject;
				T result = caseSvVoltage(svVoltage);
				if (result == null) result = caseStateVariable(svVoltage);
				if (result == null) result = caseElement(svVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.SV_SHORT_CIRCUIT: {
				SvShortCircuit svShortCircuit = (SvShortCircuit)theEObject;
				T result = caseSvShortCircuit(svShortCircuit);
				if (result == null) result = caseStateVariable(svShortCircuit);
				if (result == null) result = caseElement(svShortCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS: {
				SvShuntCompensatorSections svShuntCompensatorSections = (SvShuntCompensatorSections)theEObject;
				T result = caseSvShuntCompensatorSections(svShuntCompensatorSections);
				if (result == null) result = caseStateVariable(svShuntCompensatorSections);
				if (result == null) result = caseElement(svShuntCompensatorSections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.STATE_VARIABLE: {
				StateVariable stateVariable = (StateVariable)theEObject;
				T result = caseStateVariable(stateVariable);
				if (result == null) result = caseElement(stateVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.SV_TAP_STEP: {
				SvTapStep svTapStep = (SvTapStep)theEObject;
				T result = caseSvTapStep(svTapStep);
				if (result == null) result = caseStateVariable(svTapStep);
				if (result == null) result = caseElement(svTapStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.SV_STATUS: {
				SvStatus svStatus = (SvStatus)theEObject;
				T result = caseSvStatus(svStatus);
				if (result == null) result = caseStateVariable(svStatus);
				if (result == null) result = caseElement(svStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.SV_INJECTION: {
				SvInjection svInjection = (SvInjection)theEObject;
				T result = caseSvInjection(svInjection);
				if (result == null) result = caseStateVariable(svInjection);
				if (result == null) result = caseElement(svInjection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.SV_POWER_FLOW: {
				SvPowerFlow svPowerFlow = (SvPowerFlow)theEObject;
				T result = caseSvPowerFlow(svPowerFlow);
				if (result == null) result = caseStateVariable(svPowerFlow);
				if (result == null) result = caseElement(svPowerFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StateVariablesPackage.TOPOLOGICAL_ISLAND: {
				TopologicalIsland topologicalIsland = (TopologicalIsland)theEObject;
				T result = caseTopologicalIsland(topologicalIsland);
				if (result == null) result = caseIdentifiedObject(topologicalIsland);
				if (result == null) result = caseElement(topologicalIsland);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvVoltage(SvVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Short Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Short Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvShortCircuit(SvShortCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Shunt Compensator Sections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Shunt Compensator Sections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvShuntCompensatorSections(SvShuntCompensatorSections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateVariable(StateVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Tap Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Tap Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvTapStep(SvTapStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvStatus(SvStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Injection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Injection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvInjection(SvInjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv Power Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv Power Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvPowerFlow(SvPowerFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topological Island</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topological Island</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologicalIsland(TopologicalIsland object) {
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

} //StateVariablesSwitch
