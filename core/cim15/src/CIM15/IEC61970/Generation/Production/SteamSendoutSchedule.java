/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.RegularIntervalSchedule;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Sendout Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SteamSendoutSchedule extends RegularIntervalSchedule {
	/**
	 * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenerationPlant()
	 * @generated
	 * @ordered
	 */
	protected CogenerationPlant cogenerationPlant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteamSendoutSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.STEAM_SENDOUT_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogeneration Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #setCogenerationPlant(CogenerationPlant)
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule
	 * @generated
	 */
	public CogenerationPlant getCogenerationPlant() {
		if (cogenerationPlant != null && cogenerationPlant.eIsProxy()) {
			InternalEObject oldCogenerationPlant = (InternalEObject)cogenerationPlant;
			cogenerationPlant = (CogenerationPlant)eResolveProxy(oldCogenerationPlant);
			if (cogenerationPlant != oldCogenerationPlant) {
			}
		}
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CogenerationPlant basicGetCogenerationPlant() {
		return cogenerationPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCogenerationPlant(CogenerationPlant newCogenerationPlant, NotificationChain msgs) {
		CogenerationPlant oldCogenerationPlant = cogenerationPlant;
		cogenerationPlant = newCogenerationPlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public void setCogenerationPlant(CogenerationPlant newCogenerationPlant) {
		if (newCogenerationPlant != cogenerationPlant) {
			NotificationChain msgs = null;
			if (cogenerationPlant != null)
				msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs);
			if (newCogenerationPlant != null)
				msgs = ((InternalEObject)newCogenerationPlant).eInverseAdd(this, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs);
			msgs = basicSetCogenerationPlant(newCogenerationPlant, msgs);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				if (cogenerationPlant != null)
					msgs = ((InternalEObject)cogenerationPlant).eInverseRemove(this, ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs);
				return basicSetCogenerationPlant((CogenerationPlant)otherEnd, msgs);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				return basicSetCogenerationPlant(null, msgs);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				if (resolve) return getCogenerationPlant();
				return basicGetCogenerationPlant();
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)newValue);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				setCogenerationPlant((CogenerationPlant)null);
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
			case ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
				return cogenerationPlant != null;
		}
		return super.eIsSet(featureID);
	}

} // SteamSendoutSchedule
