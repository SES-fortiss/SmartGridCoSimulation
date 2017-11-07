/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Recovery Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeatRecoveryBoiler extends FossilSteamSupply {
	/**
	 * The cached value of the '{@link #getCombustionTurbines() <em>Combustion Turbines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTurbines()
	 * @generated
	 * @ordered
	 */
	protected EList<CombustionTurbine> combustionTurbines;

	/**
	 * The default value of the '{@link #getSteamSupplyRating2() <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating2()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_SUPPLY_RATING2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamSupplyRating2() <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating2()
	 * @generated
	 * @ordered
	 */
	protected float steamSupplyRating2 = STEAM_SUPPLY_RATING2_EDEFAULT;

	/**
	 * This is true if the Steam Supply Rating2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steamSupplyRating2ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeatRecoveryBoiler() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.HEAT_RECOVERY_BOILER;
	}

	/**
	 * Returns the value of the '<em><b>Combustion Turbines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Turbines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Turbines</em>' reference list.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getHeatRecoveryBoiler
	 * @generated
	 */
	public EList<CombustionTurbine> getCombustionTurbines() {
		if (combustionTurbines == null) {
			combustionTurbines = new BasicInternalEList<CombustionTurbine>(CombustionTurbine.class);
		}
		return combustionTurbines;
	}

	/**
	 * Returns the value of the '<em><b>Steam Supply Rating2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Supply Rating2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Supply Rating2</em>' attribute.
	 * @see #isSetSteamSupplyRating2()
	 * @see #unsetSteamSupplyRating2()
	 * @see #setSteamSupplyRating2(float)
	 * @generated
	 */
	public float getSteamSupplyRating2() {
		return steamSupplyRating2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Supply Rating2</em>' attribute.
	 * @see #isSetSteamSupplyRating2()
	 * @see #unsetSteamSupplyRating2()
	 * @see #getSteamSupplyRating2()
	 * @generated
	 */
	public void setSteamSupplyRating2(float newSteamSupplyRating2) {
		steamSupplyRating2 = newSteamSupplyRating2;
		steamSupplyRating2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteamSupplyRating2()
	 * @see #getSteamSupplyRating2()
	 * @see #setSteamSupplyRating2(float)
	 * @generated
	 */
	public void unsetSteamSupplyRating2() {
		steamSupplyRating2 = STEAM_SUPPLY_RATING2_EDEFAULT;
		steamSupplyRating2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steam Supply Rating2</em>' attribute is set.
	 * @see #unsetSteamSupplyRating2()
	 * @see #getSteamSupplyRating2()
	 * @see #setSteamSupplyRating2(float)
	 * @generated
	 */
	public boolean isSetSteamSupplyRating2() {
		return steamSupplyRating2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCombustionTurbines()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return ((InternalEList<?>)getCombustionTurbines()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return getCombustionTurbines();
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				return getSteamSupplyRating2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				getCombustionTurbines().clear();
				getCombustionTurbines().addAll((Collection<? extends CombustionTurbine>)newValue);
				return;
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				setSteamSupplyRating2((Float)newValue);
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				getCombustionTurbines().clear();
				return;
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				unsetSteamSupplyRating2();
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
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__COMBUSTION_TURBINES:
				return combustionTurbines != null && !combustionTurbines.isEmpty();
			case GenerationDynamicsPackage.HEAT_RECOVERY_BOILER__STEAM_SUPPLY_RATING2:
				return isSetSteamSupplyRating2();
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
		result.append(" (steamSupplyRating2: ");
		if (steamSupplyRating2ESet) result.append(steamSupplyRating2); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HeatRecoveryBoiler
