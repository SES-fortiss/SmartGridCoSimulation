/**
 */
package CIM15.IEC61968.AssetModels.util;

import CIM15.Element;

import CIM15.IEC61968.AssetModels.*;

import CIM15.IEC61968.Assets.AssetInfo;

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
 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage
 * @generated
 */
public class AssetModelsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssetModelsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsSwitch() {
		if (modelPackage == null) {
			modelPackage = AssetModelsPackage.eINSTANCE;
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
			case AssetModelsPackage.SHORT_CIRCUIT_TEST: {
				ShortCircuitTest shortCircuitTest = (ShortCircuitTest)theEObject;
				T result = caseShortCircuitTest(shortCircuitTest);
				if (result == null) result = caseTransformerTest(shortCircuitTest);
				if (result == null) result = caseIdentifiedObject(shortCircuitTest);
				if (result == null) result = caseElement(shortCircuitTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.END_DEVICE_INFO: {
				EndDeviceInfo endDeviceInfo = (EndDeviceInfo)theEObject;
				T result = caseEndDeviceInfo(endDeviceInfo);
				if (result == null) result = caseAssetInfo(endDeviceInfo);
				if (result == null) result = caseIdentifiedObject(endDeviceInfo);
				if (result == null) result = caseElement(endDeviceInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.WIRE_TYPE: {
				WireType wireType = (WireType)theEObject;
				T result = caseWireType(wireType);
				if (result == null) result = caseIdentifiedObject(wireType);
				if (result == null) result = caseElement(wireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO: {
				TapeShieldCableInfo tapeShieldCableInfo = (TapeShieldCableInfo)theEObject;
				T result = caseTapeShieldCableInfo(tapeShieldCableInfo);
				if (result == null) result = caseCableInfo(tapeShieldCableInfo);
				if (result == null) result = caseConductorInfo(tapeShieldCableInfo);
				if (result == null) result = caseAssetInfo(tapeShieldCableInfo);
				if (result == null) result = caseIdentifiedObject(tapeShieldCableInfo);
				if (result == null) result = caseElement(tapeShieldCableInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.CONDUCTOR_INFO: {
				ConductorInfo conductorInfo = (ConductorInfo)theEObject;
				T result = caseConductorInfo(conductorInfo);
				if (result == null) result = caseAssetInfo(conductorInfo);
				if (result == null) result = caseIdentifiedObject(conductorInfo);
				if (result == null) result = caseElement(conductorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TAP_CHANGER_INFO: {
				TapChangerInfo tapChangerInfo = (TapChangerInfo)theEObject;
				T result = caseTapChangerInfo(tapChangerInfo);
				if (result == null) result = caseAssetInfo(tapChangerInfo);
				if (result == null) result = caseIdentifiedObject(tapChangerInfo);
				if (result == null) result = caseElement(tapChangerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TRANSFORMER_TANK_INFO: {
				TransformerTankInfo transformerTankInfo = (TransformerTankInfo)theEObject;
				T result = caseTransformerTankInfo(transformerTankInfo);
				if (result == null) result = caseAssetInfo(transformerTankInfo);
				if (result == null) result = caseIdentifiedObject(transformerTankInfo);
				if (result == null) result = caseElement(transformerTankInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.POWER_TRANSFORMER_INFO: {
				PowerTransformerInfo powerTransformerInfo = (PowerTransformerInfo)theEObject;
				T result = casePowerTransformerInfo(powerTransformerInfo);
				if (result == null) result = caseAssetInfo(powerTransformerInfo);
				if (result == null) result = caseIdentifiedObject(powerTransformerInfo);
				if (result == null) result = caseElement(powerTransformerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.OPEN_CIRCUIT_TEST: {
				OpenCircuitTest openCircuitTest = (OpenCircuitTest)theEObject;
				T result = caseOpenCircuitTest(openCircuitTest);
				if (result == null) result = caseTransformerTest(openCircuitTest);
				if (result == null) result = caseIdentifiedObject(openCircuitTest);
				if (result == null) result = caseElement(openCircuitTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.CABLE_INFO: {
				CableInfo cableInfo = (CableInfo)theEObject;
				T result = caseCableInfo(cableInfo);
				if (result == null) result = caseConductorInfo(cableInfo);
				if (result == null) result = caseAssetInfo(cableInfo);
				if (result == null) result = caseIdentifiedObject(cableInfo);
				if (result == null) result = caseElement(cableInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TRANSFORMER_END_INFO: {
				TransformerEndInfo transformerEndInfo = (TransformerEndInfo)theEObject;
				T result = caseTransformerEndInfo(transformerEndInfo);
				if (result == null) result = caseAssetInfo(transformerEndInfo);
				if (result == null) result = caseIdentifiedObject(transformerEndInfo);
				if (result == null) result = caseElement(transformerEndInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.NO_LOAD_TEST: {
				NoLoadTest noLoadTest = (NoLoadTest)theEObject;
				T result = caseNoLoadTest(noLoadTest);
				if (result == null) result = caseTransformerTest(noLoadTest);
				if (result == null) result = caseIdentifiedObject(noLoadTest);
				if (result == null) result = caseElement(noLoadTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO: {
				OverheadConductorInfo overheadConductorInfo = (OverheadConductorInfo)theEObject;
				T result = caseOverheadConductorInfo(overheadConductorInfo);
				if (result == null) result = caseConductorInfo(overheadConductorInfo);
				if (result == null) result = caseAssetInfo(overheadConductorInfo);
				if (result == null) result = caseIdentifiedObject(overheadConductorInfo);
				if (result == null) result = caseElement(overheadConductorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO: {
				ConcentricNeutralCableInfo concentricNeutralCableInfo = (ConcentricNeutralCableInfo)theEObject;
				T result = caseConcentricNeutralCableInfo(concentricNeutralCableInfo);
				if (result == null) result = caseCableInfo(concentricNeutralCableInfo);
				if (result == null) result = caseConductorInfo(concentricNeutralCableInfo);
				if (result == null) result = caseAssetInfo(concentricNeutralCableInfo);
				if (result == null) result = caseIdentifiedObject(concentricNeutralCableInfo);
				if (result == null) result = caseElement(concentricNeutralCableInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.WIRE_ARRANGEMENT: {
				WireArrangement wireArrangement = (WireArrangement)theEObject;
				T result = caseWireArrangement(wireArrangement);
				if (result == null) result = caseIdentifiedObject(wireArrangement);
				if (result == null) result = caseElement(wireArrangement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetModelsPackage.TRANSFORMER_TEST: {
				TransformerTest transformerTest = (TransformerTest)theEObject;
				T result = caseTransformerTest(transformerTest);
				if (result == null) result = caseIdentifiedObject(transformerTest);
				if (result == null) result = caseElement(transformerTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Circuit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Circuit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortCircuitTest(ShortCircuitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceInfo(EndDeviceInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireType(WireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tape Shield Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tape Shield Cable Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapeShieldCableInfo(TapeShieldCableInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductorInfo(ConductorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Changer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Changer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapChangerInfo(TapChangerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Tank Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Tank Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerTankInfo(TransformerTankInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Transformer Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Transformer Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerTransformerInfo(PowerTransformerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Circuit Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Circuit Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenCircuitTest(OpenCircuitTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableInfo(CableInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer End Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer End Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerEndInfo(TransformerEndInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Load Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Load Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoLoadTest(NoLoadTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overhead Conductor Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overhead Conductor Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverheadConductorInfo(OverheadConductorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concentric Neutral Cable Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concentric Neutral Cable Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcentricNeutralCableInfo(ConcentricNeutralCableInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Arrangement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Arrangement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireArrangement(WireArrangement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerTest(TransformerTest object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetInfo(AssetInfo object) {
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

} //AssetModelsSwitch
