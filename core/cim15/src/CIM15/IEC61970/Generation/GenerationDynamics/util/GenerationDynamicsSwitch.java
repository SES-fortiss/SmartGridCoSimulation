/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics.util;

import CIM15.Element;

import CIM15.IEC61970.Core.Curve;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Generation.GenerationDynamics.*;

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
 * @see CIM15.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage
 * @generated
 */
public class GenerationDynamicsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenerationDynamicsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationDynamicsSwitch() {
		if (modelPackage == null) {
			modelPackage = GenerationDynamicsPackage.eINSTANCE;
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
			case GenerationDynamicsPackage.BWR_STEAM_SUPPLY: {
				BWRSteamSupply bwrSteamSupply = (BWRSteamSupply)theEObject;
				T result = caseBWRSteamSupply(bwrSteamSupply);
				if (result == null) result = caseSteamSupply(bwrSteamSupply);
				if (result == null) result = casePowerSystemResource(bwrSteamSupply);
				if (result == null) result = caseIdentifiedObject(bwrSteamSupply);
				if (result == null) result = caseElement(bwrSteamSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.HYDRO_TURBINE: {
				HydroTurbine hydroTurbine = (HydroTurbine)theEObject;
				T result = caseHydroTurbine(hydroTurbine);
				if (result == null) result = casePrimeMover(hydroTurbine);
				if (result == null) result = casePowerSystemResource(hydroTurbine);
				if (result == null) result = caseIdentifiedObject(hydroTurbine);
				if (result == null) result = caseElement(hydroTurbine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.STEAM_TURBINE: {
				SteamTurbine steamTurbine = (SteamTurbine)theEObject;
				T result = caseSteamTurbine(steamTurbine);
				if (result == null) result = casePrimeMover(steamTurbine);
				if (result == null) result = casePowerSystemResource(steamTurbine);
				if (result == null) result = caseIdentifiedObject(steamTurbine);
				if (result == null) result = caseElement(steamTurbine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.STEAM_SUPPLY: {
				SteamSupply steamSupply = (SteamSupply)theEObject;
				T result = caseSteamSupply(steamSupply);
				if (result == null) result = casePowerSystemResource(steamSupply);
				if (result == null) result = caseIdentifiedObject(steamSupply);
				if (result == null) result = caseElement(steamSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.FOSSIL_STEAM_SUPPLY: {
				FossilSteamSupply fossilSteamSupply = (FossilSteamSupply)theEObject;
				T result = caseFossilSteamSupply(fossilSteamSupply);
				if (result == null) result = caseSteamSupply(fossilSteamSupply);
				if (result == null) result = casePowerSystemResource(fossilSteamSupply);
				if (result == null) result = caseIdentifiedObject(fossilSteamSupply);
				if (result == null) result = caseElement(fossilSteamSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.SUBCRITICAL: {
				Subcritical subcritical = (Subcritical)theEObject;
				T result = caseSubcritical(subcritical);
				if (result == null) result = caseFossilSteamSupply(subcritical);
				if (result == null) result = caseSteamSupply(subcritical);
				if (result == null) result = casePowerSystemResource(subcritical);
				if (result == null) result = caseIdentifiedObject(subcritical);
				if (result == null) result = caseElement(subcritical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.PWR_STEAM_SUPPLY: {
				PWRSteamSupply pwrSteamSupply = (PWRSteamSupply)theEObject;
				T result = casePWRSteamSupply(pwrSteamSupply);
				if (result == null) result = caseSteamSupply(pwrSteamSupply);
				if (result == null) result = casePowerSystemResource(pwrSteamSupply);
				if (result == null) result = caseIdentifiedObject(pwrSteamSupply);
				if (result == null) result = caseElement(pwrSteamSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.PRIME_MOVER: {
				PrimeMover primeMover = (PrimeMover)theEObject;
				T result = casePrimeMover(primeMover);
				if (result == null) result = casePowerSystemResource(primeMover);
				if (result == null) result = caseIdentifiedObject(primeMover);
				if (result == null) result = caseElement(primeMover);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.COMBUSTION_TURBINE: {
				CombustionTurbine combustionTurbine = (CombustionTurbine)theEObject;
				T result = caseCombustionTurbine(combustionTurbine);
				if (result == null) result = casePrimeMover(combustionTurbine);
				if (result == null) result = casePowerSystemResource(combustionTurbine);
				if (result == null) result = caseIdentifiedObject(combustionTurbine);
				if (result == null) result = caseElement(combustionTurbine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER: {
				HeatRecoveryBoiler heatRecoveryBoiler = (HeatRecoveryBoiler)theEObject;
				T result = caseHeatRecoveryBoiler(heatRecoveryBoiler);
				if (result == null) result = caseFossilSteamSupply(heatRecoveryBoiler);
				if (result == null) result = caseSteamSupply(heatRecoveryBoiler);
				if (result == null) result = casePowerSystemResource(heatRecoveryBoiler);
				if (result == null) result = caseIdentifiedObject(heatRecoveryBoiler);
				if (result == null) result = caseElement(heatRecoveryBoiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.SUPERCRITICAL: {
				Supercritical supercritical = (Supercritical)theEObject;
				T result = caseSupercritical(supercritical);
				if (result == null) result = caseFossilSteamSupply(supercritical);
				if (result == null) result = caseSteamSupply(supercritical);
				if (result == null) result = casePowerSystemResource(supercritical);
				if (result == null) result = caseIdentifiedObject(supercritical);
				if (result == null) result = caseElement(supercritical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.DRUM_BOILER: {
				DrumBoiler drumBoiler = (DrumBoiler)theEObject;
				T result = caseDrumBoiler(drumBoiler);
				if (result == null) result = caseFossilSteamSupply(drumBoiler);
				if (result == null) result = caseSteamSupply(drumBoiler);
				if (result == null) result = casePowerSystemResource(drumBoiler);
				if (result == null) result = caseIdentifiedObject(drumBoiler);
				if (result == null) result = caseElement(drumBoiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE: {
				CTTempActivePowerCurve ctTempActivePowerCurve = (CTTempActivePowerCurve)theEObject;
				T result = caseCTTempActivePowerCurve(ctTempActivePowerCurve);
				if (result == null) result = caseCurve(ctTempActivePowerCurve);
				if (result == null) result = caseIdentifiedObject(ctTempActivePowerCurve);
				if (result == null) result = caseElement(ctTempActivePowerCurve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWR Steam Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWR Steam Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWRSteamSupply(BWRSteamSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydro Turbine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydro Turbine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydroTurbine(HydroTurbine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steam Turbine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steam Turbine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteamTurbine(SteamTurbine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steam Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steam Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteamSupply(SteamSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fossil Steam Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fossil Steam Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFossilSteamSupply(FossilSteamSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subcritical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subcritical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubcritical(Subcritical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PWR Steam Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PWR Steam Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePWRSteamSupply(PWRSteamSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prime Mover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prime Mover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimeMover(PrimeMover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combustion Turbine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combustion Turbine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombustionTurbine(CombustionTurbine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heat Recovery Boiler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heat Recovery Boiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeatRecoveryBoiler(HeatRecoveryBoiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supercritical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supercritical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupercritical(Supercritical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drum Boiler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drum Boiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrumBoiler(DrumBoiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CT Temp Active Power Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CT Temp Active Power Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTTempActivePowerCurve(CTTempActivePowerCurve object) {
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

} //GenerationDynamicsSwitch
