/**
 */
package CIM15.IEC61970.Informative.InfLoadControl.util;

import CIM15.Element;

import CIM15.IEC61968.Assets.AssetFunction;

import CIM15.IEC61968.Common.ActivityRecord;

import CIM15.IEC61968.Metering.EndDeviceFunction;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfLoadControl.*;

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
 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage
 * @generated
 */
public class InfLoadControlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfLoadControlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLoadControlSwitch() {
		if (modelPackage == null) {
			modelPackage = InfLoadControlPackage.eINSTANCE;
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD: {
				LoadMgmtRecord loadMgmtRecord = (LoadMgmtRecord)theEObject;
				T result = caseLoadMgmtRecord(loadMgmtRecord);
				if (result == null) result = caseActivityRecord(loadMgmtRecord);
				if (result == null) result = caseIdentifiedObject(loadMgmtRecord);
				if (result == null) result = caseElement(loadMgmtRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfLoadControlPackage.LOAD_SHED_FUNCTION: {
				LoadShedFunction loadShedFunction = (LoadShedFunction)theEObject;
				T result = caseLoadShedFunction(loadShedFunction);
				if (result == null) result = caseLoadMgmtFunction(loadShedFunction);
				if (result == null) result = caseEndDeviceFunction(loadShedFunction);
				if (result == null) result = caseAssetFunction(loadShedFunction);
				if (result == null) result = caseIdentifiedObject(loadShedFunction);
				if (result == null) result = caseElement(loadShedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION: {
				LoadMgmtFunction loadMgmtFunction = (LoadMgmtFunction)theEObject;
				T result = caseLoadMgmtFunction(loadMgmtFunction);
				if (result == null) result = caseEndDeviceFunction(loadMgmtFunction);
				if (result == null) result = caseAssetFunction(loadMgmtFunction);
				if (result == null) result = caseIdentifiedObject(loadMgmtFunction);
				if (result == null) result = caseElement(loadMgmtFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION: {
				LoadLimitFunction loadLimitFunction = (LoadLimitFunction)theEObject;
				T result = caseLoadLimitFunction(loadLimitFunction);
				if (result == null) result = caseLoadMgmtFunction(loadLimitFunction);
				if (result == null) result = caseEndDeviceFunction(loadLimitFunction);
				if (result == null) result = caseAssetFunction(loadLimitFunction);
				if (result == null) result = caseIdentifiedObject(loadLimitFunction);
				if (result == null) result = caseElement(loadLimitFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Mgmt Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Mgmt Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadMgmtRecord(LoadMgmtRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Shed Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Shed Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadShedFunction(LoadShedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Mgmt Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Mgmt Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadMgmtFunction(LoadMgmtFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Limit Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Limit Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadLimitFunction(LoadLimitFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetFunction(AssetFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceFunction(EndDeviceFunction object) {
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

} //InfLoadControlSwitch
