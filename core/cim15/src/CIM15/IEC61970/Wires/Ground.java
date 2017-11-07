/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.ConductingEquipment;

import CIM15.IEC61970.Informative.InfAssets.WindingInsulation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.Ground#getWindingInsulations <em>Winding Insulations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Ground extends ConductingEquipment {
	/**
	 * The cached value of the '{@link #getWindingInsulations() <em>Winding Insulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulations()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> windingInsulations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ground() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.GROUND;
	}

	/**
	 * Returns the value of the '<em><b>Winding Insulations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Insulations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Insulations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getGround
	 * @generated
	 */
	public EList<WindingInsulation> getWindingInsulations() {
		if (windingInsulations == null) {
			windingInsulations = new BasicInternalEList<WindingInsulation>(WindingInsulation.class);
		}
		return windingInsulations;
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindingInsulations()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return ((InternalEList<?>)getWindingInsulations()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return getWindingInsulations();
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				getWindingInsulations().clear();
				getWindingInsulations().addAll((Collection<? extends WindingInsulation>)newValue);
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				getWindingInsulations().clear();
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
			case WiresPackage.GROUND__WINDING_INSULATIONS:
				return windingInsulations != null && !windingInsulations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Ground
