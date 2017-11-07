/**
 */
package CIM15.IEC61970.Equivalents;

import CIM15.IEC61970.Core.ConnectivityNodeContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentNetwork extends ConnectivityNodeContainer {
	/**
	 * The cached value of the '{@link #getEquivalentEquipments() <em>Equivalent Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<EquivalentEquipment> equivalentEquipments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentNetwork() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_NETWORK;
	}

	/**
	 * Returns the value of the '<em><b>Equivalent Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Equivalents.EquivalentEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Equipments</em>' reference list.
	 * @see CIM15.IEC61970.Equivalents.EquivalentEquipment#getEquivalentNetwork
	 * @generated
	 */
	public EList<EquivalentEquipment> getEquivalentEquipments() {
		if (equivalentEquipments == null) {
			equivalentEquipments = new BasicInternalEList<EquivalentEquipment>(EquivalentEquipment.class);
		}
		return equivalentEquipments;
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentEquipments()).basicAdd(otherEnd, msgs);
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return ((InternalEList<?>)getEquivalentEquipments()).basicRemove(otherEnd, msgs);
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return getEquivalentEquipments();
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				getEquivalentEquipments().clear();
				getEquivalentEquipments().addAll((Collection<? extends EquivalentEquipment>)newValue);
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				getEquivalentEquipments().clear();
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
			case EquivalentsPackage.EQUIVALENT_NETWORK__EQUIVALENT_EQUIPMENTS:
				return equivalentEquipments != null && !equivalentEquipments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EquivalentNetwork
