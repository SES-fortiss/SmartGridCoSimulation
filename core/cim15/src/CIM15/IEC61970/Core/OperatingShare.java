/**
 */
package CIM15.IEC61970.Core;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatingShare extends Element {
	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * The cached value of the '{@link #getOperatingParticipant() <em>Operating Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingParticipant()
	 * @generated
	 * @ordered
	 */
	protected OperatingParticipant operatingParticipant;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected float percentage = PERCENTAGE_EDEFAULT;

	/**
	 * This is true if the Percentage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingShare() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.OPERATING_SHARE;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getOperatingShare
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Operating Participant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.OperatingParticipant#getOperatingShare <em>Operating Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Participant</em>' reference.
	 * @see #setOperatingParticipant(OperatingParticipant)
	 * @see CIM15.IEC61970.Core.OperatingParticipant#getOperatingShare
	 * @generated
	 */
	public OperatingParticipant getOperatingParticipant() {
		if (operatingParticipant != null && operatingParticipant.eIsProxy()) {
			InternalEObject oldOperatingParticipant = (InternalEObject)operatingParticipant;
			operatingParticipant = (OperatingParticipant)eResolveProxy(oldOperatingParticipant);
			if (operatingParticipant != oldOperatingParticipant) {
			}
		}
		return operatingParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingParticipant basicGetOperatingParticipant() {
		return operatingParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatingParticipant(OperatingParticipant newOperatingParticipant, NotificationChain msgs) {
		OperatingParticipant oldOperatingParticipant = operatingParticipant;
		operatingParticipant = newOperatingParticipant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Participant</em>' reference.
	 * @see #getOperatingParticipant()
	 * @generated
	 */
	public void setOperatingParticipant(OperatingParticipant newOperatingParticipant) {
		if (newOperatingParticipant != operatingParticipant) {
			NotificationChain msgs = null;
			if (operatingParticipant != null)
				msgs = ((InternalEObject)operatingParticipant).eInverseRemove(this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs);
			if (newOperatingParticipant != null)
				msgs = ((InternalEObject)newOperatingParticipant).eInverseAdd(this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs);
			msgs = basicSetOperatingParticipant(newOperatingParticipant, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #isSetPercentage()
	 * @see #unsetPercentage()
	 * @see #setPercentage(float)
	 * @generated
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #isSetPercentage()
	 * @see #unsetPercentage()
	 * @see #getPercentage()
	 * @generated
	 */
	public void setPercentage(float newPercentage) {
		percentage = newPercentage;
		percentageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentage()
	 * @see #getPercentage()
	 * @see #setPercentage(float)
	 * @generated
	 */
	public void unsetPercentage() {
		percentage = PERCENTAGE_EDEFAULT;
		percentageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.OperatingShare#getPercentage <em>Percentage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percentage</em>' attribute is set.
	 * @see #unsetPercentage()
	 * @see #getPercentage()
	 * @see #setPercentage(float)
	 * @generated
	 */
	public boolean isSetPercentage() {
		return percentageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				if (operatingParticipant != null)
					msgs = ((InternalEObject)operatingParticipant).eInverseRemove(this, CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs);
				return basicSetOperatingParticipant((OperatingParticipant)otherEnd, msgs);
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
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				return basicSetOperatingParticipant(null, msgs);
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
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				if (resolve) return getOperatingParticipant();
				return basicGetOperatingParticipant();
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				return getPercentage();
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
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				setOperatingParticipant((OperatingParticipant)newValue);
				return;
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				setPercentage((Float)newValue);
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
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				setOperatingParticipant((OperatingParticipant)null);
				return;
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				unsetPercentage();
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
			case CorePackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case CorePackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
				return operatingParticipant != null;
			case CorePackage.OPERATING_SHARE__PERCENTAGE:
				return isSetPercentage();
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
		result.append(" (percentage: ");
		if (percentageESet) result.append(percentage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OperatingShare
