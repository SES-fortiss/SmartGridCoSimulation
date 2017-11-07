/**
 */
package CIM15.IEC61968.Assets.util;

import CIM15.Element;

import CIM15.IEC61968.Assets.*;

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
 * @see CIM15.IEC61968.Assets.AssetsPackage
 * @generated
 */
public class AssetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsSwitch() {
		if (modelPackage == null) {
			modelPackage = AssetsPackage.eINSTANCE;
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
			case AssetsPackage.PRODUCT_ASSET_MODEL: {
				ProductAssetModel productAssetModel = (ProductAssetModel)theEObject;
				T result = caseProductAssetModel(productAssetModel);
				if (result == null) result = caseAssetModel(productAssetModel);
				if (result == null) result = caseIdentifiedObject(productAssetModel);
				if (result == null) result = caseElement(productAssetModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.ASSET_MODEL: {
				AssetModel assetModel = (AssetModel)theEObject;
				T result = caseAssetModel(assetModel);
				if (result == null) result = caseIdentifiedObject(assetModel);
				if (result == null) result = caseElement(assetModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseIdentifiedObject(asset);
				if (result == null) result = caseElement(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.COM_MEDIA: {
				ComMedia comMedia = (ComMedia)theEObject;
				T result = caseComMedia(comMedia);
				if (result == null) result = caseAsset(comMedia);
				if (result == null) result = caseIdentifiedObject(comMedia);
				if (result == null) result = caseElement(comMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.ASSET_CONTAINER: {
				AssetContainer assetContainer = (AssetContainer)theEObject;
				T result = caseAssetContainer(assetContainer);
				if (result == null) result = caseAsset(assetContainer);
				if (result == null) result = caseIdentifiedObject(assetContainer);
				if (result == null) result = caseElement(assetContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.ASSET_FUNCTION: {
				AssetFunction assetFunction = (AssetFunction)theEObject;
				T result = caseAssetFunction(assetFunction);
				if (result == null) result = caseIdentifiedObject(assetFunction);
				if (result == null) result = caseElement(assetFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.SEAL: {
				Seal seal = (Seal)theEObject;
				T result = caseSeal(seal);
				if (result == null) result = caseIdentifiedObject(seal);
				if (result == null) result = caseElement(seal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.ASSET_INFO: {
				AssetInfo assetInfo = (AssetInfo)theEObject;
				T result = caseAssetInfo(assetInfo);
				if (result == null) result = caseIdentifiedObject(assetInfo);
				if (result == null) result = caseElement(assetInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssetsPackage.ACCEPTANCE_TEST: {
				AcceptanceTest acceptanceTest = (AcceptanceTest)theEObject;
				T result = caseAcceptanceTest(acceptanceTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Asset Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductAssetModel(ProductAssetModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetModel(AssetModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComMedia(ComMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetContainer(AssetContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Seal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeal(Seal object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Acceptance Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptance Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptanceTest(AcceptanceTest object) {
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

} //AssetsSwitch
