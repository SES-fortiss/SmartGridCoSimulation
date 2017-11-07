/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SVC#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SVC#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVC extends FACTSDevice {
	/**
	 * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INDUCTIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected float inductiveRating = INDUCTIVE_RATING_EDEFAULT;

	/**
	 * This is true if the Inductive Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inductiveRatingESet;

	/**
	 * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected float capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

	/**
	 * This is true if the Capacitive Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacitiveRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVC() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSVC();
	}

	/**
	 * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Rating</em>' attribute.
	 * @see #isSetInductiveRating()
	 * @see #unsetInductiveRating()
	 * @see #setInductiveRating(float)
	 * @generated
	 */
	public float getInductiveRating() {
		return inductiveRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inductive Rating</em>' attribute.
	 * @see #isSetInductiveRating()
	 * @see #unsetInductiveRating()
	 * @see #getInductiveRating()
	 * @generated
	 */
	public void setInductiveRating(float newInductiveRating) {
		inductiveRating = newInductiveRating;
		inductiveRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInductiveRating()
	 * @see #getInductiveRating()
	 * @see #setInductiveRating(float)
	 * @generated
	 */
	public void unsetInductiveRating() {
		inductiveRating = INDUCTIVE_RATING_EDEFAULT;
		inductiveRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getInductiveRating <em>Inductive Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inductive Rating</em>' attribute is set.
	 * @see #unsetInductiveRating()
	 * @see #getInductiveRating()
	 * @see #setInductiveRating(float)
	 * @generated
	 */
	public boolean isSetInductiveRating() {
		return inductiveRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #isSetCapacitiveRating()
	 * @see #unsetCapacitiveRating()
	 * @see #setCapacitiveRating(float)
	 * @generated
	 */
	public float getCapacitiveRating() {
		return capacitiveRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #isSetCapacitiveRating()
	 * @see #unsetCapacitiveRating()
	 * @see #getCapacitiveRating()
	 * @generated
	 */
	public void setCapacitiveRating(float newCapacitiveRating) {
		capacitiveRating = newCapacitiveRating;
		capacitiveRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacitiveRating()
	 * @see #getCapacitiveRating()
	 * @see #setCapacitiveRating(float)
	 * @generated
	 */
	public void unsetCapacitiveRating() {
		capacitiveRating = CAPACITIVE_RATING_EDEFAULT;
		capacitiveRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getCapacitiveRating <em>Capacitive Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacitive Rating</em>' attribute is set.
	 * @see #unsetCapacitiveRating()
	 * @see #getCapacitiveRating()
	 * @see #setCapacitiveRating(float)
	 * @generated
	 */
	public boolean isSetCapacitiveRating() {
		return capacitiveRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SVC__INDUCTIVE_RATING:
				return getInductiveRating();
			case InfAssetsPackage.SVC__CAPACITIVE_RATING:
				return getCapacitiveRating();
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
			case InfAssetsPackage.SVC__INDUCTIVE_RATING:
				setInductiveRating((Float)newValue);
				return;
			case InfAssetsPackage.SVC__CAPACITIVE_RATING:
				setCapacitiveRating((Float)newValue);
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
			case InfAssetsPackage.SVC__INDUCTIVE_RATING:
				unsetInductiveRating();
				return;
			case InfAssetsPackage.SVC__CAPACITIVE_RATING:
				unsetCapacitiveRating();
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
			case InfAssetsPackage.SVC__INDUCTIVE_RATING:
				return isSetInductiveRating();
			case InfAssetsPackage.SVC__CAPACITIVE_RATING:
				return isSetCapacitiveRating();
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
		result.append(" (inductiveRating: ");
		if (inductiveRatingESet) result.append(inductiveRating); else result.append("<unset>");
		result.append(", capacitiveRating: ");
		if (capacitiveRatingESet) result.append(capacitiveRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SVC
