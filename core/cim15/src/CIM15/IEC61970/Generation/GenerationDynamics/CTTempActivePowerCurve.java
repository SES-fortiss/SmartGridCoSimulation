/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CT Temp Active Power Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CTTempActivePowerCurve extends Curve {
	/**
	 * The cached value of the '{@link #getCombustionTurbine() <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTurbine()
	 * @generated
	 * @ordered
	 */
	protected CombustionTurbine combustionTurbine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTTempActivePowerCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.CT_TEMP_ACTIVE_POWER_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Combustion Turbine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Turbine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Turbine</em>' reference.
	 * @see #setCombustionTurbine(CombustionTurbine)
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getCTTempActivePowerCurve
	 * @generated
	 */
	public CombustionTurbine getCombustionTurbine() {
		if (combustionTurbine != null && combustionTurbine.eIsProxy()) {
			InternalEObject oldCombustionTurbine = (InternalEObject)combustionTurbine;
			combustionTurbine = (CombustionTurbine)eResolveProxy(oldCombustionTurbine);
			if (combustionTurbine != oldCombustionTurbine) {
			}
		}
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombustionTurbine basicGetCombustionTurbine() {
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombustionTurbine(CombustionTurbine newCombustionTurbine, NotificationChain msgs) {
		CombustionTurbine oldCombustionTurbine = combustionTurbine;
		combustionTurbine = newCombustionTurbine;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Turbine</em>' reference.
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	public void setCombustionTurbine(CombustionTurbine newCombustionTurbine) {
		if (newCombustionTurbine != combustionTurbine) {
			NotificationChain msgs = null;
			if (combustionTurbine != null)
				msgs = ((InternalEObject)combustionTurbine).eInverseRemove(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs);
			if (newCombustionTurbine != null)
				msgs = ((InternalEObject)newCombustionTurbine).eInverseAdd(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs);
			msgs = basicSetCombustionTurbine(newCombustionTurbine, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
				if (combustionTurbine != null)
					msgs = ((InternalEObject)combustionTurbine).eInverseRemove(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs);
				return basicSetCombustionTurbine((CombustionTurbine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
				return basicSetCombustionTurbine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
				if (resolve) return getCombustionTurbine();
				return basicGetCombustionTurbine();
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
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
				setCombustionTurbine((CombustionTurbine)newValue);
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
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
				setCombustionTurbine((CombustionTurbine)null);
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
			case GenerationDynamicsPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
				return combustionTurbine != null;
		}
		return super.eIsSet(featureID);
	}

} // CTTempActivePowerCurve
