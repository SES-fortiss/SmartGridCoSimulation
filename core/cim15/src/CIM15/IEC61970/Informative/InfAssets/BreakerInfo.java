/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breaker Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakerInfo extends SwitchInfo {
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
	protected BreakerInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getBreakerInfo();
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}' attribute is set.
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
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
			case InfAssetsPackage.BREAKER_INFO__PHASE_TRIP:
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
		result.append(" (phaseTrip: ");
		if (phaseTripESet) result.append(phaseTrip); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BreakerInfo
