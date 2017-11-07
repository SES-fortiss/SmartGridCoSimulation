/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.ConductorAsset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets <em>Conductor Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getCircuits <em>Circuits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitSection extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getConductorAssets() <em>Conductor Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductorAsset> conductorAssets;

	/**
	 * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final CircuitConnectionKind CONNECTION_KIND_EDEFAULT = CircuitConnectionKind.ELECTRICALLY_CONNECTED;

	/**
	 * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected CircuitConnectionKind connectionKind = CONNECTION_KIND_EDEFAULT;

	/**
	 * This is true if the Connection Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionKindESet;

	/**
	 * The cached value of the '{@link #getCircuits() <em>Circuits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuits()
	 * @generated
	 * @ordered
	 */
	protected EList<Circuit> circuits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitSection() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CIRCUIT_SECTION;
	}

	/**
	 * Returns the value of the '<em><b>Conductor Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection
	 * @generated
	 */
	public EList<ConductorAsset> getConductorAssets() {
		if (conductorAssets == null) {
			conductorAssets = new BasicInternalEList<ConductorAsset>(ConductorAsset.class);
		}
		return conductorAssets;
	}

	/**
	 * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @see #isSetConnectionKind()
	 * @see #unsetConnectionKind()
	 * @see #setConnectionKind(CircuitConnectionKind)
	 * @generated
	 */
	public CircuitConnectionKind getConnectionKind() {
		return connectionKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitConnectionKind
	 * @see #isSetConnectionKind()
	 * @see #unsetConnectionKind()
	 * @see #getConnectionKind()
	 * @generated
	 */
	public void setConnectionKind(CircuitConnectionKind newConnectionKind) {
		connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
		connectionKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionKind()
	 * @see #getConnectionKind()
	 * @see #setConnectionKind(CircuitConnectionKind)
	 * @generated
	 */
	public void unsetConnectionKind() {
		connectionKind = CONNECTION_KIND_EDEFAULT;
		connectionKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConnectionKind <em>Connection Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Kind</em>' attribute is set.
	 * @see #unsetConnectionKind()
	 * @see #getConnectionKind()
	 * @see #setConnectionKind(CircuitConnectionKind)
	 * @generated
	 */
	public boolean isSetConnectionKind() {
		return connectionKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Circuits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.Circuit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.Circuit#getCircuitSections <em>Circuit Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuits</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.Circuit#getCircuitSections
	 * @generated
	 */
	public EList<Circuit> getCircuits() {
		if (circuits == null) {
			circuits = new BasicInternalEList<Circuit>(Circuit.class);
		}
		return circuits;
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
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductorAssets()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCircuits()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return ((InternalEList<?>)getConductorAssets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				return ((InternalEList<?>)getCircuits()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return getConductorAssets();
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				return getConnectionKind();
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				return getCircuits();
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
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				getConductorAssets().addAll((Collection<? extends ConductorAsset>)newValue);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				setConnectionKind((CircuitConnectionKind)newValue);
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				getCircuits().clear();
				getCircuits().addAll((Collection<? extends Circuit>)newValue);
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
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				unsetConnectionKind();
				return;
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				getCircuits().clear();
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
			case InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS:
				return conductorAssets != null && !conductorAssets.isEmpty();
			case InfOperationsPackage.CIRCUIT_SECTION__CONNECTION_KIND:
				return isSetConnectionKind();
			case InfOperationsPackage.CIRCUIT_SECTION__CIRCUITS:
				return circuits != null && !circuits.isEmpty();
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
		result.append(" (connectionKind: ");
		if (connectionKindESet) result.append(connectionKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CircuitSection
