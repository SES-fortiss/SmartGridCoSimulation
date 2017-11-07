/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Protection.ProtectionEquipment;
import CIM15.IEC61970.Protection.RecloseSequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protected Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.ProtectedSwitch#getProtectionEquipments2 <em>Protection Equipments2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectedSwitch extends Switch {
	/**
	 * The cached value of the '{@link #getProtectionEquipments2() <em>Protection Equipments2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionEquipments2()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionEquipment> protectionEquipments2;

	/**
	 * The default value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float BREAKING_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBreakingCapacity() <em>Breaking Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakingCapacity()
	 * @generated
	 * @ordered
	 */
	protected float breakingCapacity = BREAKING_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Breaking Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean breakingCapacityESet;

	/**
	 * The cached value of the '{@link #getRecloseSequences() <em>Reclose Sequences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<RecloseSequence> recloseSequences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectedSwitch() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PROTECTED_SWITCH;
	}

	/**
	 * Returns the value of the '<em><b>Protection Equipments2</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Protection.ProtectionEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Equipments2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Equipments2</em>' reference list.
	 * @see CIM15.IEC61970.Protection.ProtectionEquipment#getProtectedSwitches
	 * @generated
	 */
	public EList<ProtectionEquipment> getProtectionEquipments2() {
		if (protectionEquipments2 == null) {
			protectionEquipments2 = new BasicInternalEList<ProtectionEquipment>(ProtectionEquipment.class);
		}
		return protectionEquipments2;
	}

	/**
	 * Returns the value of the '<em><b>Breaking Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breaking Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaking Capacity</em>' attribute.
	 * @see #isSetBreakingCapacity()
	 * @see #unsetBreakingCapacity()
	 * @see #setBreakingCapacity(float)
	 * @generated
	 */
	public float getBreakingCapacity() {
		return breakingCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaking Capacity</em>' attribute.
	 * @see #isSetBreakingCapacity()
	 * @see #unsetBreakingCapacity()
	 * @see #getBreakingCapacity()
	 * @generated
	 */
	public void setBreakingCapacity(float newBreakingCapacity) {
		breakingCapacity = newBreakingCapacity;
		breakingCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBreakingCapacity()
	 * @see #getBreakingCapacity()
	 * @see #setBreakingCapacity(float)
	 * @generated
	 */
	public void unsetBreakingCapacity() {
		breakingCapacity = BREAKING_CAPACITY_EDEFAULT;
		breakingCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Breaking Capacity</em>' attribute is set.
	 * @see #unsetBreakingCapacity()
	 * @see #getBreakingCapacity()
	 * @see #setBreakingCapacity(float)
	 * @generated
	 */
	public boolean isSetBreakingCapacity() {
		return breakingCapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Reclose Sequences</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Protection.RecloseSequence}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Sequences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Sequences</em>' reference list.
	 * @see CIM15.IEC61970.Protection.RecloseSequence#getProtectedSwitch
	 * @generated
	 */
	public EList<RecloseSequence> getRecloseSequences() {
		if (recloseSequences == null) {
			recloseSequences = new BasicInternalEList<RecloseSequence>(RecloseSequence.class);
		}
		return recloseSequences;
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
			case WiresPackage.PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtectionEquipments2()).basicAdd(otherEnd, msgs);
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecloseSequences()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2:
				return ((InternalEList<?>)getProtectionEquipments2()).basicRemove(otherEnd, msgs);
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return ((InternalEList<?>)getRecloseSequences()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2:
				return getProtectionEquipments2();
			case WiresPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
				return getBreakingCapacity();
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return getRecloseSequences();
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
			case WiresPackage.PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2:
				getProtectionEquipments2().clear();
				getProtectionEquipments2().addAll((Collection<? extends ProtectionEquipment>)newValue);
				return;
			case WiresPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
				setBreakingCapacity((Float)newValue);
				return;
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				getRecloseSequences().clear();
				getRecloseSequences().addAll((Collection<? extends RecloseSequence>)newValue);
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
			case WiresPackage.PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2:
				getProtectionEquipments2().clear();
				return;
			case WiresPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
				unsetBreakingCapacity();
				return;
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				getRecloseSequences().clear();
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
			case WiresPackage.PROTECTED_SWITCH__PROTECTION_EQUIPMENTS2:
				return protectionEquipments2 != null && !protectionEquipments2.isEmpty();
			case WiresPackage.PROTECTED_SWITCH__BREAKING_CAPACITY:
				return isSetBreakingCapacity();
			case WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES:
				return recloseSequences != null && !recloseSequences.isEmpty();
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
		result.append(" (breakingCapacity: ");
		if (breakingCapacityESet) result.append(breakingCapacity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProtectedSwitch
