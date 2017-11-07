/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recloser Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecloserInfo extends SwitchInfo {
	/**
	 * The default value of the '{@link #isGroundTripNormalEnabled() <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripNormalEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUND_TRIP_NORMAL_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroundTripNormalEnabled() <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripNormalEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripNormalEnabled = GROUND_TRIP_NORMAL_ENABLED_EDEFAULT;

	/**
	 * This is true if the Ground Trip Normal Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripNormalEnabledESet;

	/**
	 * The default value of the '{@link #isGroundTripCapable() <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUND_TRIP_CAPABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroundTripCapable() <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripCapable = GROUND_TRIP_CAPABLE_EDEFAULT;

	/**
	 * This is true if the Ground Trip Capable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripCapableESet;

	/**
	 * The default value of the '{@link #getRecloseLockoutCount() <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseLockoutCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RECLOSE_LOCKOUT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecloseLockoutCount() <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseLockoutCount()
	 * @generated
	 * @ordered
	 */
	protected int recloseLockoutCount = RECLOSE_LOCKOUT_COUNT_EDEFAULT;

	/**
	 * This is true if the Reclose Lockout Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recloseLockoutCountESet;

	/**
	 * The default value of the '{@link #getPhaseTripRating() <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTripRating()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_TRIP_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseTripRating() <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTripRating()
	 * @generated
	 * @ordered
	 */
	protected float phaseTripRating = PHASE_TRIP_RATING_EDEFAULT;

	/**
	 * This is true if the Phase Trip Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseTripRatingESet;

	/**
	 * The default value of the '{@link #getGroundTripRating() <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTripRating()
	 * @generated
	 * @ordered
	 */
	protected static final float GROUND_TRIP_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGroundTripRating() <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTripRating()
	 * @generated
	 * @ordered
	 */
	protected float groundTripRating = GROUND_TRIP_RATING_EDEFAULT;

	/**
	 * This is true if the Ground Trip Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecloserInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getRecloserInfo();
	}

	/**
	 * Returns the value of the '<em><b>Ground Trip Normal Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip Normal Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip Normal Enabled</em>' attribute.
	 * @see #isSetGroundTripNormalEnabled()
	 * @see #unsetGroundTripNormalEnabled()
	 * @see #setGroundTripNormalEnabled(boolean)
	 * @generated
	 */
	public boolean isGroundTripNormalEnabled() {
		return groundTripNormalEnabled;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip Normal Enabled</em>' attribute.
	 * @see #isSetGroundTripNormalEnabled()
	 * @see #unsetGroundTripNormalEnabled()
	 * @see #isGroundTripNormalEnabled()
	 * @generated
	 */
	public void setGroundTripNormalEnabled(boolean newGroundTripNormalEnabled) {
		groundTripNormalEnabled = newGroundTripNormalEnabled;
		groundTripNormalEnabledESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundTripNormalEnabled()
	 * @see #isGroundTripNormalEnabled()
	 * @see #setGroundTripNormalEnabled(boolean)
	 * @generated
	 */
	public void unsetGroundTripNormalEnabled() {
		groundTripNormalEnabled = GROUND_TRIP_NORMAL_ENABLED_EDEFAULT;
		groundTripNormalEnabledESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ground Trip Normal Enabled</em>' attribute is set.
	 * @see #unsetGroundTripNormalEnabled()
	 * @see #isGroundTripNormalEnabled()
	 * @see #setGroundTripNormalEnabled(boolean)
	 * @generated
	 */
	public boolean isSetGroundTripNormalEnabled() {
		return groundTripNormalEnabledESet;
	}

	/**
	 * Returns the value of the '<em><b>Ground Trip Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip Capable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip Capable</em>' attribute.
	 * @see #isSetGroundTripCapable()
	 * @see #unsetGroundTripCapable()
	 * @see #setGroundTripCapable(boolean)
	 * @generated
	 */
	public boolean isGroundTripCapable() {
		return groundTripCapable;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip Capable</em>' attribute.
	 * @see #isSetGroundTripCapable()
	 * @see #unsetGroundTripCapable()
	 * @see #isGroundTripCapable()
	 * @generated
	 */
	public void setGroundTripCapable(boolean newGroundTripCapable) {
		groundTripCapable = newGroundTripCapable;
		groundTripCapableESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundTripCapable()
	 * @see #isGroundTripCapable()
	 * @see #setGroundTripCapable(boolean)
	 * @generated
	 */
	public void unsetGroundTripCapable() {
		groundTripCapable = GROUND_TRIP_CAPABLE_EDEFAULT;
		groundTripCapableESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ground Trip Capable</em>' attribute is set.
	 * @see #unsetGroundTripCapable()
	 * @see #isGroundTripCapable()
	 * @see #setGroundTripCapable(boolean)
	 * @generated
	 */
	public boolean isSetGroundTripCapable() {
		return groundTripCapableESet;
	}

	/**
	 * Returns the value of the '<em><b>Reclose Lockout Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Lockout Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Lockout Count</em>' attribute.
	 * @see #isSetRecloseLockoutCount()
	 * @see #unsetRecloseLockoutCount()
	 * @see #setRecloseLockoutCount(int)
	 * @generated
	 */
	public int getRecloseLockoutCount() {
		return recloseLockoutCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclose Lockout Count</em>' attribute.
	 * @see #isSetRecloseLockoutCount()
	 * @see #unsetRecloseLockoutCount()
	 * @see #getRecloseLockoutCount()
	 * @generated
	 */
	public void setRecloseLockoutCount(int newRecloseLockoutCount) {
		recloseLockoutCount = newRecloseLockoutCount;
		recloseLockoutCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecloseLockoutCount()
	 * @see #getRecloseLockoutCount()
	 * @see #setRecloseLockoutCount(int)
	 * @generated
	 */
	public void unsetRecloseLockoutCount() {
		recloseLockoutCount = RECLOSE_LOCKOUT_COUNT_EDEFAULT;
		recloseLockoutCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reclose Lockout Count</em>' attribute is set.
	 * @see #unsetRecloseLockoutCount()
	 * @see #getRecloseLockoutCount()
	 * @see #setRecloseLockoutCount(int)
	 * @generated
	 */
	public boolean isSetRecloseLockoutCount() {
		return recloseLockoutCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Trip Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Trip Rating</em>' attribute.
	 * @see #isSetPhaseTripRating()
	 * @see #unsetPhaseTripRating()
	 * @see #setPhaseTripRating(float)
	 * @generated
	 */
	public float getPhaseTripRating() {
		return phaseTripRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Trip Rating</em>' attribute.
	 * @see #isSetPhaseTripRating()
	 * @see #unsetPhaseTripRating()
	 * @see #getPhaseTripRating()
	 * @generated
	 */
	public void setPhaseTripRating(float newPhaseTripRating) {
		phaseTripRating = newPhaseTripRating;
		phaseTripRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseTripRating()
	 * @see #getPhaseTripRating()
	 * @see #setPhaseTripRating(float)
	 * @generated
	 */
	public void unsetPhaseTripRating() {
		phaseTripRating = PHASE_TRIP_RATING_EDEFAULT;
		phaseTripRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Trip Rating</em>' attribute is set.
	 * @see #unsetPhaseTripRating()
	 * @see #getPhaseTripRating()
	 * @see #setPhaseTripRating(float)
	 * @generated
	 */
	public boolean isSetPhaseTripRating() {
		return phaseTripRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Ground Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip Rating</em>' attribute.
	 * @see #isSetGroundTripRating()
	 * @see #unsetGroundTripRating()
	 * @see #setGroundTripRating(float)
	 * @generated
	 */
	public float getGroundTripRating() {
		return groundTripRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip Rating</em>' attribute.
	 * @see #isSetGroundTripRating()
	 * @see #unsetGroundTripRating()
	 * @see #getGroundTripRating()
	 * @generated
	 */
	public void setGroundTripRating(float newGroundTripRating) {
		groundTripRating = newGroundTripRating;
		groundTripRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundTripRating()
	 * @see #getGroundTripRating()
	 * @see #setGroundTripRating(float)
	 * @generated
	 */
	public void unsetGroundTripRating() {
		groundTripRating = GROUND_TRIP_RATING_EDEFAULT;
		groundTripRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ground Trip Rating</em>' attribute is set.
	 * @see #unsetGroundTripRating()
	 * @see #getGroundTripRating()
	 * @see #setGroundTripRating(float)
	 * @generated
	 */
	public boolean isSetGroundTripRating() {
		return groundTripRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				return isGroundTripNormalEnabled();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				return isGroundTripCapable();
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				return getRecloseLockoutCount();
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				return getPhaseTripRating();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				return getGroundTripRating();
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
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				setGroundTripNormalEnabled((Boolean)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				setGroundTripCapable((Boolean)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				setRecloseLockoutCount((Integer)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				setPhaseTripRating((Float)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				setGroundTripRating((Float)newValue);
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
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				unsetGroundTripNormalEnabled();
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				unsetGroundTripCapable();
				return;
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				unsetRecloseLockoutCount();
				return;
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				unsetPhaseTripRating();
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				unsetGroundTripRating();
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
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				return isSetGroundTripNormalEnabled();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				return isSetGroundTripCapable();
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				return isSetRecloseLockoutCount();
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				return isSetPhaseTripRating();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				return isSetGroundTripRating();
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
		result.append(" (groundTripNormalEnabled: ");
		if (groundTripNormalEnabledESet) result.append(groundTripNormalEnabled); else result.append("<unset>");
		result.append(", groundTripCapable: ");
		if (groundTripCapableESet) result.append(groundTripCapable); else result.append("<unset>");
		result.append(", recloseLockoutCount: ");
		if (recloseLockoutCountESet) result.append(recloseLockoutCount); else result.append("<unset>");
		result.append(", phaseTripRating: ");
		if (phaseTripRatingESet) result.append(phaseTripRating); else result.append("<unset>");
		result.append(", groundTripRating: ");
		if (groundTripRatingESet) result.append(groundTripRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RecloserInfo
