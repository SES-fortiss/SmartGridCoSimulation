/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstationAsset extends Asset {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final SubstationFunctionKind FUNCTION_EDEFAULT = SubstationFunctionKind.TRANSMISSION;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected SubstationFunctionKind function = FUNCTION_EDEFAULT;

	/**
	 * This is true if the Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean functionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstationAsset() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSubstationAsset();
	}

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see #setFunction(SubstationFunctionKind)
	 * @generated
	 */
	public SubstationFunctionKind getFunction() {
		return function;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @generated
	 */
	public void setFunction(SubstationFunctionKind newFunction) {
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		functionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFunction()
	 * @see #getFunction()
	 * @see #setFunction(SubstationFunctionKind)
	 * @generated
	 */
	public void unsetFunction() {
		function = FUNCTION_EDEFAULT;
		functionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset#getFunction <em>Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Function</em>' attribute is set.
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @see #setFunction(SubstationFunctionKind)
	 * @generated
	 */
	public boolean isSetFunction() {
		return functionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SUBSTATION_ASSET__FUNCTION:
				return getFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetsPackage.SUBSTATION_ASSET__FUNCTION:
				setFunction((SubstationFunctionKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfAssetsPackage.SUBSTATION_ASSET__FUNCTION:
				unsetFunction();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfAssetsPackage.SUBSTATION_ASSET__FUNCTION:
				return isSetFunction();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (function: ");
		if (functionESet) result.append(function); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SubstationAsset
