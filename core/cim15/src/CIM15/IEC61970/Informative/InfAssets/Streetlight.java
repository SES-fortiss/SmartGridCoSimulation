/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streetlight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getArmLength <em>Arm Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getPole <em>Pole</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLampKind <em>Lamp Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLightRating <em>Light Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Streetlight extends Asset {
	/**
	 * The default value of the '{@link #getArmLength() <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmLength()
	 * @generated
	 * @ordered
	 */
	protected static final float ARM_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArmLength() <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmLength()
	 * @generated
	 * @ordered
	 */
	protected float armLength = ARM_LENGTH_EDEFAULT;

	/**
	 * This is true if the Arm Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean armLengthESet;

	/**
	 * The cached value of the '{@link #getPole() <em>Pole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPole()
	 * @generated
	 * @ordered
	 */
	protected Pole pole;

	/**
	 * The default value of the '{@link #getLampKind() <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLampKind()
	 * @generated
	 * @ordered
	 */
	protected static final StreetlightLampKind LAMP_KIND_EDEFAULT = StreetlightLampKind.METAL_HALIDE;

	/**
	 * The cached value of the '{@link #getLampKind() <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLampKind()
	 * @generated
	 * @ordered
	 */
	protected StreetlightLampKind lampKind = LAMP_KIND_EDEFAULT;

	/**
	 * This is true if the Lamp Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lampKindESet;

	/**
	 * The default value of the '{@link #getLightRating() <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightRating()
	 * @generated
	 * @ordered
	 */
	protected static final float LIGHT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLightRating() <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightRating()
	 * @generated
	 * @ordered
	 */
	protected float lightRating = LIGHT_RATING_EDEFAULT;

	/**
	 * This is true if the Light Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lightRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Streetlight() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getStreetlight();
	}

	/**
	 * Returns the value of the '<em><b>Arm Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm Length</em>' attribute.
	 * @see #isSetArmLength()
	 * @see #unsetArmLength()
	 * @see #setArmLength(float)
	 * @generated
	 */
	public float getArmLength() {
		return armLength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getArmLength <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm Length</em>' attribute.
	 * @see #isSetArmLength()
	 * @see #unsetArmLength()
	 * @see #getArmLength()
	 * @generated
	 */
	public void setArmLength(float newArmLength) {
		armLength = newArmLength;
		armLengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getArmLength <em>Arm Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArmLength()
	 * @see #getArmLength()
	 * @see #setArmLength(float)
	 * @generated
	 */
	public void unsetArmLength() {
		armLength = ARM_LENGTH_EDEFAULT;
		armLengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getArmLength <em>Arm Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arm Length</em>' attribute is set.
	 * @see #unsetArmLength()
	 * @see #getArmLength()
	 * @see #setArmLength(float)
	 * @generated
	 */
	public boolean isSetArmLength() {
		return armLengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Pole</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getStreetlights <em>Streetlights</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pole</em>' reference.
	 * @see #setPole(Pole)
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getStreetlights
	 * @generated
	 */
	public Pole getPole() {
		if (pole != null && pole.eIsProxy()) {
			InternalEObject oldPole = (InternalEObject)pole;
			pole = (Pole)eResolveProxy(oldPole);
			if (pole != oldPole) {
			}
		}
		return pole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pole basicGetPole() {
		return pole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPole(Pole newPole, NotificationChain msgs) {
		Pole oldPole = pole;
		pole = newPole;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getPole <em>Pole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pole</em>' reference.
	 * @see #getPole()
	 * @generated
	 */
	public void setPole(Pole newPole) {
		if (newPole != pole) {
			NotificationChain msgs = null;
			if (pole != null)
				msgs = ((InternalEObject)pole).eInverseRemove(this, InfAssetsPackage.POLE__STREETLIGHTS, Pole.class, msgs);
			if (newPole != null)
				msgs = ((InternalEObject)newPole).eInverseAdd(this, InfAssetsPackage.POLE__STREETLIGHTS, Pole.class, msgs);
			msgs = basicSetPole(newPole, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Lamp Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lamp Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lamp Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @see #isSetLampKind()
	 * @see #unsetLampKind()
	 * @see #setLampKind(StreetlightLampKind)
	 * @generated
	 */
	public StreetlightLampKind getLampKind() {
		return lampKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLampKind <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lamp Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @see #isSetLampKind()
	 * @see #unsetLampKind()
	 * @see #getLampKind()
	 * @generated
	 */
	public void setLampKind(StreetlightLampKind newLampKind) {
		lampKind = newLampKind == null ? LAMP_KIND_EDEFAULT : newLampKind;
		lampKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLampKind <em>Lamp Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLampKind()
	 * @see #getLampKind()
	 * @see #setLampKind(StreetlightLampKind)
	 * @generated
	 */
	public void unsetLampKind() {
		lampKind = LAMP_KIND_EDEFAULT;
		lampKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLampKind <em>Lamp Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lamp Kind</em>' attribute is set.
	 * @see #unsetLampKind()
	 * @see #getLampKind()
	 * @see #setLampKind(StreetlightLampKind)
	 * @generated
	 */
	public boolean isSetLampKind() {
		return lampKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Light Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Rating</em>' attribute.
	 * @see #isSetLightRating()
	 * @see #unsetLightRating()
	 * @see #setLightRating(float)
	 * @generated
	 */
	public float getLightRating() {
		return lightRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLightRating <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Rating</em>' attribute.
	 * @see #isSetLightRating()
	 * @see #unsetLightRating()
	 * @see #getLightRating()
	 * @generated
	 */
	public void setLightRating(float newLightRating) {
		lightRating = newLightRating;
		lightRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLightRating <em>Light Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLightRating()
	 * @see #getLightRating()
	 * @see #setLightRating(float)
	 * @generated
	 */
	public void unsetLightRating() {
		lightRating = LIGHT_RATING_EDEFAULT;
		lightRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLightRating <em>Light Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Light Rating</em>' attribute is set.
	 * @see #unsetLightRating()
	 * @see #getLightRating()
	 * @see #setLightRating(float)
	 * @generated
	 */
	public boolean isSetLightRating() {
		return lightRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.STREETLIGHT__POLE:
				if (pole != null)
					msgs = ((InternalEObject)pole).eInverseRemove(this, InfAssetsPackage.POLE__STREETLIGHTS, Pole.class, msgs);
				return basicSetPole((Pole)otherEnd, msgs);
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
			case InfAssetsPackage.STREETLIGHT__POLE:
				return basicSetPole(null, msgs);
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
			case InfAssetsPackage.STREETLIGHT__ARM_LENGTH:
				return getArmLength();
			case InfAssetsPackage.STREETLIGHT__POLE:
				if (resolve) return getPole();
				return basicGetPole();
			case InfAssetsPackage.STREETLIGHT__LAMP_KIND:
				return getLampKind();
			case InfAssetsPackage.STREETLIGHT__LIGHT_RATING:
				return getLightRating();
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
			case InfAssetsPackage.STREETLIGHT__ARM_LENGTH:
				setArmLength((Float)newValue);
				return;
			case InfAssetsPackage.STREETLIGHT__POLE:
				setPole((Pole)newValue);
				return;
			case InfAssetsPackage.STREETLIGHT__LAMP_KIND:
				setLampKind((StreetlightLampKind)newValue);
				return;
			case InfAssetsPackage.STREETLIGHT__LIGHT_RATING:
				setLightRating((Float)newValue);
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
			case InfAssetsPackage.STREETLIGHT__ARM_LENGTH:
				unsetArmLength();
				return;
			case InfAssetsPackage.STREETLIGHT__POLE:
				setPole((Pole)null);
				return;
			case InfAssetsPackage.STREETLIGHT__LAMP_KIND:
				unsetLampKind();
				return;
			case InfAssetsPackage.STREETLIGHT__LIGHT_RATING:
				unsetLightRating();
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
			case InfAssetsPackage.STREETLIGHT__ARM_LENGTH:
				return isSetArmLength();
			case InfAssetsPackage.STREETLIGHT__POLE:
				return pole != null;
			case InfAssetsPackage.STREETLIGHT__LAMP_KIND:
				return isSetLampKind();
			case InfAssetsPackage.STREETLIGHT__LIGHT_RATING:
				return isSetLightRating();
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
		result.append(" (armLength: ");
		if (armLengthESet) result.append(armLength); else result.append("<unset>");
		result.append(", lampKind: ");
		if (lampKindESet) result.append(lampKind); else result.append("<unset>");
		result.append(", lightRating: ");
		if (lightRatingESet) result.append(lightRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Streetlight
