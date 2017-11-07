/**
 */
package CIM15.IEC62325;

import CIM15.IEC61968.Common.Organisation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC62325.MarketParticipant#getMarketRoles <em>Market Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarketParticipant extends Organisation {
	/**
	 * The cached value of the '{@link #getMarketRoles() <em>Market Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketRole> marketRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketParticipant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IEC62325Package.Literals.MARKET_PARTICIPANT;
	}

	/**
	 * Returns the value of the '<em><b>Market Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC62325.MarketRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC62325.MarketRole#getMarketParticipants <em>Market Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market Roles</em>' reference list.
	 * @see CIM15.IEC62325.MarketRole#getMarketParticipants
	 * @generated
	 */
	public EList<MarketRole> getMarketRoles() {
		if (marketRoles == null) {
			marketRoles = new BasicInternalEList<MarketRole>(MarketRole.class);
		}
		return marketRoles;
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
			case IEC62325Package.MARKET_PARTICIPANT__MARKET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarketRoles()).basicAdd(otherEnd, msgs);
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
			case IEC62325Package.MARKET_PARTICIPANT__MARKET_ROLES:
				return ((InternalEList<?>)getMarketRoles()).basicRemove(otherEnd, msgs);
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
			case IEC62325Package.MARKET_PARTICIPANT__MARKET_ROLES:
				return getMarketRoles();
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
			case IEC62325Package.MARKET_PARTICIPANT__MARKET_ROLES:
				getMarketRoles().clear();
				getMarketRoles().addAll((Collection<? extends MarketRole>)newValue);
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
			case IEC62325Package.MARKET_PARTICIPANT__MARKET_ROLES:
				getMarketRoles().clear();
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
			case IEC62325Package.MARKET_PARTICIPANT__MARKET_ROLES:
				return marketRoles != null && !marketRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MarketParticipant
