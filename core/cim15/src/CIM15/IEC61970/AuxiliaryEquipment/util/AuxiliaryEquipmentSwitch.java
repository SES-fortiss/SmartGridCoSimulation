/**
 */
package CIM15.IEC61970.AuxiliaryEquipment.util;

import CIM15.Element;

import CIM15.IEC61970.AuxiliaryEquipment.*;

import CIM15.IEC61970.Core.Equipment;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

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
 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage
 * @generated
 */
public class AuxiliaryEquipmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuxiliaryEquipmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryEquipmentSwitch() {
		if (modelPackage == null) {
			modelPackage = AuxiliaryEquipmentPackage.eINSTANCE;
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER: {
				PotentialTransformer potentialTransformer = (PotentialTransformer)theEObject;
				T result = casePotentialTransformer(potentialTransformer);
				if (result == null) result = caseSensor(potentialTransformer);
				if (result == null) result = caseAuxiliaryEquipment(potentialTransformer);
				if (result == null) result = caseEquipment(potentialTransformer);
				if (result == null) result = casePowerSystemResource(potentialTransformer);
				if (result == null) result = caseIdentifiedObject(potentialTransformer);
				if (result == null) result = caseElement(potentialTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuxiliaryEquipmentPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseAuxiliaryEquipment(sensor);
				if (result == null) result = caseEquipment(sensor);
				if (result == null) result = casePowerSystemResource(sensor);
				if (result == null) result = caseIdentifiedObject(sensor);
				if (result == null) result = caseElement(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuxiliaryEquipmentPackage.AUXILIARY_EQUIPMENT: {
				AuxiliaryEquipment auxiliaryEquipment = (AuxiliaryEquipment)theEObject;
				T result = caseAuxiliaryEquipment(auxiliaryEquipment);
				if (result == null) result = caseEquipment(auxiliaryEquipment);
				if (result == null) result = casePowerSystemResource(auxiliaryEquipment);
				if (result == null) result = caseIdentifiedObject(auxiliaryEquipment);
				if (result == null) result = caseElement(auxiliaryEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER: {
				CurrentTransformer currentTransformer = (CurrentTransformer)theEObject;
				T result = caseCurrentTransformer(currentTransformer);
				if (result == null) result = caseSensor(currentTransformer);
				if (result == null) result = caseAuxiliaryEquipment(currentTransformer);
				if (result == null) result = caseEquipment(currentTransformer);
				if (result == null) result = casePowerSystemResource(currentTransformer);
				if (result == null) result = caseIdentifiedObject(currentTransformer);
				if (result == null) result = caseElement(currentTransformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR: {
				SurgeProtector surgeProtector = (SurgeProtector)theEObject;
				T result = caseSurgeProtector(surgeProtector);
				if (result == null) result = caseAuxiliaryEquipment(surgeProtector);
				if (result == null) result = caseEquipment(surgeProtector);
				if (result == null) result = casePowerSystemResource(surgeProtector);
				if (result == null) result = caseIdentifiedObject(surgeProtector);
				if (result == null) result = caseElement(surgeProtector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR: {
				FaultIndicator faultIndicator = (FaultIndicator)theEObject;
				T result = caseFaultIndicator(faultIndicator);
				if (result == null) result = caseAuxiliaryEquipment(faultIndicator);
				if (result == null) result = caseEquipment(faultIndicator);
				if (result == null) result = casePowerSystemResource(faultIndicator);
				if (result == null) result = caseIdentifiedObject(faultIndicator);
				if (result == null) result = caseElement(faultIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potential Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potential Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentialTransformer(PotentialTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryEquipment(AuxiliaryEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Transformer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentTransformer(CurrentTransformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surge Protector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surge Protector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgeProtector(SurgeProtector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultIndicator(FaultIndicator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
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

} //AuxiliaryEquipmentSwitch
