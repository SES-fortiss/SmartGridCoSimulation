/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Equipment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtectionEquipmentInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getGroundTrip() <em>Ground Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTrip()
	 * @generated
	 * @ordered
	 */
	protected static final float GROUND_TRIP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGroundTrip() <em>Ground Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTrip()
	 * @generated
	 * @ordered
	 */
	protected float groundTrip = GROUND_TRIP_EDEFAULT;

	/**
	 * This is true if the Ground Trip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripESet;

	/**
	 * The default value of the '{@link #getPhaseTrip() <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTrip()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_TRIP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseTrip() <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTrip()
	 * @generated
	 * @ordered
	 */
	protected float phaseTrip = PHASE_TRIP_EDEFAULT;

	/**
	 * This is true if the Phase Trip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseTripESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionEquipmentInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getProtectionEquipmentInfo();
	}

	/**
	 * Returns the value of the '<em><b>Ground Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip</em>' attribute.
	 * @see #isSetGroundTrip()
	 * @see #unsetGroundTrip()
	 * @see #setGroundTrip(float)
	 * @generated
	 */
	public float getGroundTrip() {
		return groundTrip;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip</em>' attribute.
	 * @see #isSetGroundTrip()
	 * @see #unsetGroundTrip()
	 * @see #getGroundTrip()
	 * @generated
	 */
	public void setGroundTrip(float newGroundTrip) {
		groundTrip = newGroundTrip;
		groundTripESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundTrip()
	 * @see #getGroundTrip()
	 * @see #setGroundTrip(float)
	 * @generated
	 */
	public void unsetGroundTrip() {
		groundTrip = GROUND_TRIP_EDEFAULT;
		groundTripESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ground Trip</em>' attribute is set.
	 * @see #unsetGroundTrip()
	 * @see #getGroundTrip()
	 * @see #setGroundTrip(float)
	 * @generated
	 */
	public boolean isSetGroundTrip() {
		return groundTripESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Trip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Trip</em>' attribute.
	 * @see #isSetPhaseTrip()
	 * @see #unsetPhaseTrip()
	 * @see #setPhaseTrip(float)
	 * @generated
	 */
	public float getPhaseTrip() {
		return phaseTrip;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Trip</em>' attribute.
	 * @see #isSetPhaseTrip()
	 * @see #unsetPhaseTrip()
	 * @see #getPhaseTrip()
	 * @generated
	 */
	public void setPhaseTrip(float newPhaseTrip) {
		phaseTrip = newPhaseTrip;
		phaseTripESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseTrip()
	 * @see #getPhaseTrip()
	 * @see #setPhaseTrip(float)
	 * @generated
	 */
	public void unsetPhaseTrip() {
		phaseTrip = PHASE_TRIP_EDEFAULT;
		phaseTripESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Trip</em>' attribute is set.
	 * @see #unsetPhaseTrip()
	 * @see #getPhaseTrip()
	 * @see #setPhaseTrip(float)
	 * @generated
	 */
	public boolean isSetPhaseTrip() {
		return phaseTripESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__GROUND_TRIP:
				return getGroundTrip();
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__PHASE_TRIP:
				return getPhaseTrip();
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
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__GROUND_TRIP:
				setGroundTrip((Float)newValue);
				return;
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__PHASE_TRIP:
				setPhaseTrip((Float)newValue);
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
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__GROUND_TRIP:
				unsetGroundTrip();
				return;
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__PHASE_TRIP:
				unsetPhaseTrip();
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
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__GROUND_TRIP:
				return isSetGroundTrip();
			case InfAssetsPackage.PROTECTION_EQUIPMENT_INFO__PHASE_TRIP:
				return isSetPhaseTrip();
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
		result.append(" (groundTrip: ");
		if (groundTripESet) result.append(groundTrip); else result.append("<unset>");
		result.append(", phaseTrip: ");
		if (phaseTripESet) result.append(phaseTrip); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProtectionEquipmentInfo
