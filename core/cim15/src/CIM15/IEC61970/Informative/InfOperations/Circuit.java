/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61970.Core.EquipmentContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.Circuit#getCircuitSections <em>Circuit Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Circuit extends EquipmentContainer {
	/**
	 * The cached value of the '{@link #getCircuitSections() <em>Circuit Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitSections()
	 * @generated
	 * @ordered
	 */
	protected EList<CircuitSection> circuitSections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Circuit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CIRCUIT;
	}

	/**
	 * Returns the value of the '<em><b>Circuit Sections</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.CircuitSection}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getCircuits <em>Circuits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Sections</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection#getCircuits
	 * @generated
	 */
	public EList<CircuitSection> getCircuitSections() {
		if (circuitSections == null) {
			circuitSections = new BasicInternalEList<CircuitSection>(CircuitSection.class);
		}
		return circuitSections;
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
			case InfOperationsPackage.CIRCUIT__CIRCUIT_SECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCircuitSections()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.CIRCUIT__CIRCUIT_SECTIONS:
				return ((InternalEList<?>)getCircuitSections()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.CIRCUIT__CIRCUIT_SECTIONS:
				return getCircuitSections();
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
			case InfOperationsPackage.CIRCUIT__CIRCUIT_SECTIONS:
				getCircuitSections().clear();
				getCircuitSections().addAll((Collection<? extends CircuitSection>)newValue);
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
			case InfOperationsPackage.CIRCUIT__CIRCUIT_SECTIONS:
				getCircuitSections().clear();
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
			case InfOperationsPackage.CIRCUIT__CIRCUIT_SECTIONS:
				return circuitSections != null && !circuitSections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Circuit
