/**
 */
package CIM15.IEC61970.Contingency;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.Equipment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContingencyEquipment extends ContingencyElement {
	/**
	 * The default value of the '{@link #getContingentStatus() <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ContingencyEquipmentStatusKind CONTINGENT_STATUS_EDEFAULT = ContingencyEquipmentStatusKind.OUT_OF_SERVICE;

	/**
	 * The cached value of the '{@link #getContingentStatus() <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingentStatus()
	 * @generated
	 * @ordered
	 */
	protected ContingencyEquipmentStatusKind contingentStatus = CONTINGENT_STATUS_EDEFAULT;

	/**
	 * This is true if the Contingent Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contingentStatusESet;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContingencyEquipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContingencyPackage.Literals.CONTINGENCY_EQUIPMENT;
	}

	/**
	 * Returns the value of the '<em><b>Contingent Status</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingent Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingent Status</em>' attribute.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @see #isSetContingentStatus()
	 * @see #unsetContingentStatus()
	 * @see #setContingentStatus(ContingencyEquipmentStatusKind)
	 * @generated
	 */
	public ContingencyEquipmentStatusKind getContingentStatus() {
		return contingentStatus;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingent Status</em>' attribute.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipmentStatusKind
	 * @see #isSetContingentStatus()
	 * @see #unsetContingentStatus()
	 * @see #getContingentStatus()
	 * @generated
	 */
	public void setContingentStatus(ContingencyEquipmentStatusKind newContingentStatus) {
		contingentStatus = newContingentStatus == null ? CONTINGENT_STATUS_EDEFAULT : newContingentStatus;
		contingentStatusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContingentStatus()
	 * @see #getContingentStatus()
	 * @see #setContingentStatus(ContingencyEquipmentStatusKind)
	 * @generated
	 */
	public void unsetContingentStatus() {
		contingentStatus = CONTINGENT_STATUS_EDEFAULT;
		contingentStatusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contingent Status</em>' attribute is set.
	 * @see #unsetContingentStatus()
	 * @see #getContingentStatus()
	 * @see #setContingentStatus(ContingencyEquipmentStatusKind)
	 * @generated
	 */
	public boolean isSetContingentStatus() {
		return contingentStatusESet;
	}

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see CIM15.IEC61970.Core.Equipment#getContingencyEquipment
	 * @generated
	 */
	public Equipment getEquipment() {
		if (equipment != null && equipment.eIsProxy()) {
			InternalEObject oldEquipment = (InternalEObject)equipment;
			equipment = (Equipment)eResolveProxy(oldEquipment);
			if (equipment != oldEquipment) {
			}
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipment(Equipment newEquipment, NotificationChain msgs) {
		Equipment oldEquipment = equipment;
		equipment = newEquipment;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	public void setEquipment(Equipment newEquipment) {
		if (newEquipment != equipment) {
			NotificationChain msgs = null;
			if (equipment != null)
				msgs = ((InternalEObject)equipment).eInverseRemove(this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs);
			if (newEquipment != null)
				msgs = ((InternalEObject)newEquipment).eInverseAdd(this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs);
			msgs = basicSetEquipment(newEquipment, msgs);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				if (equipment != null)
					msgs = ((InternalEObject)equipment).eInverseRemove(this, CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs);
				return basicSetEquipment((Equipment)otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				return basicSetEquipment(null, msgs);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				return getContingentStatus();
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				if (resolve) return getEquipment();
				return basicGetEquipment();
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				setContingentStatus((ContingencyEquipmentStatusKind)newValue);
				return;
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				setEquipment((Equipment)newValue);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				unsetContingentStatus();
				return;
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				setEquipment((Equipment)null);
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
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
				return isSetContingentStatus();
			case ContingencyPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
				return equipment != null;
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
		result.append(" (contingentStatus: ");
		if (contingentStatusESet) result.append(contingentStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ContingencyEquipment
