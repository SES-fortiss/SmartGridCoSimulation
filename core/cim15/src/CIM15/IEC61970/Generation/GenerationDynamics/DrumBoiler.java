/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drum Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrumBoiler extends FossilSteamSupply {
	/**
	 * The default value of the '{@link #getDrumBoilerRating() <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrumBoilerRating()
	 * @generated
	 * @ordered
	 */
	protected static final float DRUM_BOILER_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDrumBoilerRating() <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrumBoilerRating()
	 * @generated
	 * @ordered
	 */
	protected float drumBoilerRating = DRUM_BOILER_RATING_EDEFAULT;

	/**
	 * This is true if the Drum Boiler Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drumBoilerRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrumBoiler() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.DRUM_BOILER;
	}

	/**
	 * Returns the value of the '<em><b>Drum Boiler Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drum Boiler Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drum Boiler Rating</em>' attribute.
	 * @see #isSetDrumBoilerRating()
	 * @see #unsetDrumBoilerRating()
	 * @see #setDrumBoilerRating(float)
	 * @generated
	 */
	public float getDrumBoilerRating() {
		return drumBoilerRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drum Boiler Rating</em>' attribute.
	 * @see #isSetDrumBoilerRating()
	 * @see #unsetDrumBoilerRating()
	 * @see #getDrumBoilerRating()
	 * @generated
	 */
	public void setDrumBoilerRating(float newDrumBoilerRating) {
		drumBoilerRating = newDrumBoilerRating;
		drumBoilerRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrumBoilerRating()
	 * @see #getDrumBoilerRating()
	 * @see #setDrumBoilerRating(float)
	 * @generated
	 */
	public void unsetDrumBoilerRating() {
		drumBoilerRating = DRUM_BOILER_RATING_EDEFAULT;
		drumBoilerRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.DrumBoiler#getDrumBoilerRating <em>Drum Boiler Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drum Boiler Rating</em>' attribute is set.
	 * @see #unsetDrumBoilerRating()
	 * @see #getDrumBoilerRating()
	 * @see #setDrumBoilerRating(float)
	 * @generated
	 */
	public boolean isSetDrumBoilerRating() {
		return drumBoilerRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				return getDrumBoilerRating();
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
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				setDrumBoilerRating((Float)newValue);
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
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				unsetDrumBoilerRating();
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
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				return isSetDrumBoilerRating();
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
		result.append(" (drumBoilerRating: ");
		if (drumBoilerRatingESet) result.append(drumBoilerRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DrumBoiler
