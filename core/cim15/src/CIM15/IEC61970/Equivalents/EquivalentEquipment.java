/**
 */
package CIM15.IEC61970.Equivalents;

import CIM15.IEC61970.Core.ConductingEquipment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentEquipment extends ConductingEquipment {
	/**
	 * The cached value of the '{@link #getEquivalentNetwork() <em>Equivalent Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentNetwork()
	 * @generated
	 * @ordered
	 */
	protected EquivalentNetwork equivalentNetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentEquipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_EQUIPMENT;
	}

	/**
	 * Returns the value of the '<em><b>Equivalent Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Network</em>' reference.
	 * @see #setEquivalentNetwork(EquivalentNetwork)
	 * @see CIM15.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments
	 * @generated
	 */
	public EquivalentNetwork getEquivalentNetwork() {
		if (equivalentNetwork != null && equivalentNetwork.eIsProxy()) {
			InternalEObject oldEquivalentNetwork = (InternalEObject)equivalentNetwork;
			equivalentNetwork = (EquivalentNetwork)eResolveProxy(oldEquivalentNetwork);
			if (equivalentNetwork != oldEquivalentNetwork) {
			}
		}
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentNetwork basicGetEquivalentNetwork() {
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalentNetwork(EquivalentNetwork newEquivalentNetwork, NotificationChain msgs) {
		EquivalentNetwork oldEquivalentNetwork = equivalentNetwork;
		equivalentNetwork = newEquivalentNetwork;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalent Network</em>' reference.
	 * @see #getEquivalentNetwork()
	 * @generated
	 */
	public void setEquivalentNetwork(EquivalentNetwork newEquivalentNetwork) {
		if (newEquivalentNetwork != equivalentNetwork) {
			NotificationChain msgs = null;
			if (equivalentNetwork != null)
				msgs = ((InternalEObject)equivalentNetwork).eInverseRemove(this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs);
			if (newEquivalentNetwork != null)
				msgs = ((InternalEObject)newEquivalentNetwork).eInverseAdd(this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs);
			msgs = basicSetEquivalentNetwork(newEquivalentNetwork, msgs);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				if (equivalentNetwork != null)
					msgs = ((InternalEObject)equivalentNetwork).eInverseRemove(this, EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS, EquivalentNetwork.class, msgs);
				return basicSetEquivalentNetwork((EquivalentNetwork)otherEnd, msgs);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				return basicSetEquivalentNetwork(null, msgs);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				if (resolve) return getEquivalentNetwork();
				return basicGetEquivalentNetwork();
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				setEquivalentNetwork((EquivalentNetwork)newValue);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				setEquivalentNetwork((EquivalentNetwork)null);
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
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT__EQUIVALENT_NETWORK:
				return equivalentNetwork != null;
		}
		return super.eIsSet(featureID);
	}

} // EquivalentEquipment
