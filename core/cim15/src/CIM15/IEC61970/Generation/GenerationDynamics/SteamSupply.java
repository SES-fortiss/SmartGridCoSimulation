/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import CIM15.IEC61970.Core.PowerSystemResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SteamSupply extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getSteamSupplyRating() <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_SUPPLY_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamSupplyRating() <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplyRating()
	 * @generated
	 * @ordered
	 */
	protected float steamSupplyRating = STEAM_SUPPLY_RATING_EDEFAULT;

	/**
	 * This is true if the Steam Supply Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steamSupplyRatingESet;

	/**
	 * The cached value of the '{@link #getSteamTurbines() <em>Steam Turbines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamTurbines()
	 * @generated
	 * @ordered
	 */
	protected EList<SteamTurbine> steamTurbines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteamSupply() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.STEAM_SUPPLY;
	}

	/**
	 * Returns the value of the '<em><b>Steam Supply Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Supply Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Supply Rating</em>' attribute.
	 * @see #isSetSteamSupplyRating()
	 * @see #unsetSteamSupplyRating()
	 * @see #setSteamSupplyRating(float)
	 * @generated
	 */
	public float getSteamSupplyRating() {
		return steamSupplyRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Supply Rating</em>' attribute.
	 * @see #isSetSteamSupplyRating()
	 * @see #unsetSteamSupplyRating()
	 * @see #getSteamSupplyRating()
	 * @generated
	 */
	public void setSteamSupplyRating(float newSteamSupplyRating) {
		steamSupplyRating = newSteamSupplyRating;
		steamSupplyRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteamSupplyRating()
	 * @see #getSteamSupplyRating()
	 * @see #setSteamSupplyRating(float)
	 * @generated
	 */
	public void unsetSteamSupplyRating() {
		steamSupplyRating = STEAM_SUPPLY_RATING_EDEFAULT;
		steamSupplyRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steam Supply Rating</em>' attribute is set.
	 * @see #unsetSteamSupplyRating()
	 * @see #getSteamSupplyRating()
	 * @see #setSteamSupplyRating(float)
	 * @generated
	 */
	public boolean isSetSteamSupplyRating() {
		return steamSupplyRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Steam Turbines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Turbines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Turbines</em>' reference list.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys
	 * @generated
	 */
	public EList<SteamTurbine> getSteamTurbines() {
		if (steamTurbines == null) {
			steamTurbines = new BasicInternalEList<SteamTurbine>(SteamTurbine.class);
		}
		return steamTurbines;
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteamTurbines()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return ((InternalEList<?>)getSteamTurbines()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				return getSteamSupplyRating();
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return getSteamTurbines();
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				setSteamSupplyRating((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				getSteamTurbines().clear();
				getSteamTurbines().addAll((Collection<? extends SteamTurbine>)newValue);
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				unsetSteamSupplyRating();
				return;
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				getSteamTurbines().clear();
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
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_SUPPLY_RATING:
				return isSetSteamSupplyRating();
			case GenerationDynamicsPackage.STEAM_SUPPLY__STEAM_TURBINES:
				return steamTurbines != null && !steamTurbines.isEmpty();
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
		result.append(" (steamSupplyRating: ");
		if (steamSupplyRatingESet) result.append(steamSupplyRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SteamSupply
