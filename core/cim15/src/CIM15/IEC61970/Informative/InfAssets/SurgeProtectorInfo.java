/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surge Protector Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getSurgeProtectors <em>Surge Protectors</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurgeProtectorInfo extends AssetInfo {
	/**
	 * The cached value of the '{@link #getSurgeProtectors() <em>Surge Protectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeProtectors()
	 * @generated
	 * @ordered
	 */
	protected EList<SurgeProtector> surgeProtectors;

	/**
	 * The default value of the '{@link #getMaxCurrentRating() <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrentRating()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CURRENT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxCurrentRating() <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrentRating()
	 * @generated
	 * @ordered
	 */
	protected float maxCurrentRating = MAX_CURRENT_RATING_EDEFAULT;

	/**
	 * This is true if the Max Current Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxCurrentRatingESet;

	/**
	 * The default value of the '{@link #getMaxContinousOperatingVoltage() <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContinousOperatingVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxContinousOperatingVoltage() <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContinousOperatingVoltage()
	 * @generated
	 * @ordered
	 */
	protected float maxContinousOperatingVoltage = MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Max Continous Operating Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxContinousOperatingVoltageESet;

	/**
	 * The default value of the '{@link #getNominalDesignVoltage() <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDesignVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_DESIGN_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalDesignVoltage() <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDesignVoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalDesignVoltage = NOMINAL_DESIGN_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Nominal Design Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalDesignVoltageESet;

	/**
	 * The default value of the '{@link #getMaxEnergyAbsorption() <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEnergyAbsorption()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ENERGY_ABSORPTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxEnergyAbsorption() <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEnergyAbsorption()
	 * @generated
	 * @ordered
	 */
	protected float maxEnergyAbsorption = MAX_ENERGY_ABSORPTION_EDEFAULT;

	/**
	 * This is true if the Max Energy Absorption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxEnergyAbsorptionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeProtectorInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSurgeProtectorInfo();
	}

	/**
	 * Returns the value of the '<em><b>Surge Protectors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector#getSurgeProtectorInfo <em>Surge Protector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surge Protectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surge Protectors</em>' reference list.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector#getSurgeProtectorInfo
	 * @generated
	 */
	public EList<SurgeProtector> getSurgeProtectors() {
		if (surgeProtectors == null) {
			surgeProtectors = new BasicInternalEList<SurgeProtector>(SurgeProtector.class);
		}
		return surgeProtectors;
	}

	/**
	 * Returns the value of the '<em><b>Max Current Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Current Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Current Rating</em>' attribute.
	 * @see #isSetMaxCurrentRating()
	 * @see #unsetMaxCurrentRating()
	 * @see #setMaxCurrentRating(float)
	 * @generated
	 */
	public float getMaxCurrentRating() {
		return maxCurrentRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Current Rating</em>' attribute.
	 * @see #isSetMaxCurrentRating()
	 * @see #unsetMaxCurrentRating()
	 * @see #getMaxCurrentRating()
	 * @generated
	 */
	public void setMaxCurrentRating(float newMaxCurrentRating) {
		maxCurrentRating = newMaxCurrentRating;
		maxCurrentRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxCurrentRating()
	 * @see #getMaxCurrentRating()
	 * @see #setMaxCurrentRating(float)
	 * @generated
	 */
	public void unsetMaxCurrentRating() {
		maxCurrentRating = MAX_CURRENT_RATING_EDEFAULT;
		maxCurrentRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Current Rating</em>' attribute is set.
	 * @see #unsetMaxCurrentRating()
	 * @see #getMaxCurrentRating()
	 * @see #setMaxCurrentRating(float)
	 * @generated
	 */
	public boolean isSetMaxCurrentRating() {
		return maxCurrentRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Continous Operating Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Continous Operating Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Continous Operating Voltage</em>' attribute.
	 * @see #isSetMaxContinousOperatingVoltage()
	 * @see #unsetMaxContinousOperatingVoltage()
	 * @see #setMaxContinousOperatingVoltage(float)
	 * @generated
	 */
	public float getMaxContinousOperatingVoltage() {
		return maxContinousOperatingVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Continous Operating Voltage</em>' attribute.
	 * @see #isSetMaxContinousOperatingVoltage()
	 * @see #unsetMaxContinousOperatingVoltage()
	 * @see #getMaxContinousOperatingVoltage()
	 * @generated
	 */
	public void setMaxContinousOperatingVoltage(float newMaxContinousOperatingVoltage) {
		maxContinousOperatingVoltage = newMaxContinousOperatingVoltage;
		maxContinousOperatingVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxContinousOperatingVoltage()
	 * @see #getMaxContinousOperatingVoltage()
	 * @see #setMaxContinousOperatingVoltage(float)
	 * @generated
	 */
	public void unsetMaxContinousOperatingVoltage() {
		maxContinousOperatingVoltage = MAX_CONTINOUS_OPERATING_VOLTAGE_EDEFAULT;
		maxContinousOperatingVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Continous Operating Voltage</em>' attribute is set.
	 * @see #unsetMaxContinousOperatingVoltage()
	 * @see #getMaxContinousOperatingVoltage()
	 * @see #setMaxContinousOperatingVoltage(float)
	 * @generated
	 */
	public boolean isSetMaxContinousOperatingVoltage() {
		return maxContinousOperatingVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Nominal Design Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Design Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Design Voltage</em>' attribute.
	 * @see #isSetNominalDesignVoltage()
	 * @see #unsetNominalDesignVoltage()
	 * @see #setNominalDesignVoltage(float)
	 * @generated
	 */
	public float getNominalDesignVoltage() {
		return nominalDesignVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Design Voltage</em>' attribute.
	 * @see #isSetNominalDesignVoltage()
	 * @see #unsetNominalDesignVoltage()
	 * @see #getNominalDesignVoltage()
	 * @generated
	 */
	public void setNominalDesignVoltage(float newNominalDesignVoltage) {
		nominalDesignVoltage = newNominalDesignVoltage;
		nominalDesignVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDesignVoltage()
	 * @see #getNominalDesignVoltage()
	 * @see #setNominalDesignVoltage(float)
	 * @generated
	 */
	public void unsetNominalDesignVoltage() {
		nominalDesignVoltage = NOMINAL_DESIGN_VOLTAGE_EDEFAULT;
		nominalDesignVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Design Voltage</em>' attribute is set.
	 * @see #unsetNominalDesignVoltage()
	 * @see #getNominalDesignVoltage()
	 * @see #setNominalDesignVoltage(float)
	 * @generated
	 */
	public boolean isSetNominalDesignVoltage() {
		return nominalDesignVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Energy Absorption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Energy Absorption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Energy Absorption</em>' attribute.
	 * @see #isSetMaxEnergyAbsorption()
	 * @see #unsetMaxEnergyAbsorption()
	 * @see #setMaxEnergyAbsorption(float)
	 * @generated
	 */
	public float getMaxEnergyAbsorption() {
		return maxEnergyAbsorption;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Energy Absorption</em>' attribute.
	 * @see #isSetMaxEnergyAbsorption()
	 * @see #unsetMaxEnergyAbsorption()
	 * @see #getMaxEnergyAbsorption()
	 * @generated
	 */
	public void setMaxEnergyAbsorption(float newMaxEnergyAbsorption) {
		maxEnergyAbsorption = newMaxEnergyAbsorption;
		maxEnergyAbsorptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxEnergyAbsorption()
	 * @see #getMaxEnergyAbsorption()
	 * @see #setMaxEnergyAbsorption(float)
	 * @generated
	 */
	public void unsetMaxEnergyAbsorption() {
		maxEnergyAbsorption = MAX_ENERGY_ABSORPTION_EDEFAULT;
		maxEnergyAbsorptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Energy Absorption</em>' attribute is set.
	 * @see #unsetMaxEnergyAbsorption()
	 * @see #getMaxEnergyAbsorption()
	 * @see #setMaxEnergyAbsorption(float)
	 * @generated
	 */
	public boolean isSetMaxEnergyAbsorption() {
		return maxEnergyAbsorptionESet;
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSurgeProtectors()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS:
				return ((InternalEList<?>)getSurgeProtectors()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS:
				return getSurgeProtectors();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				return getMaxCurrentRating();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				return getMaxContinousOperatingVoltage();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				return getNominalDesignVoltage();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				return getMaxEnergyAbsorption();
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS:
				getSurgeProtectors().clear();
				getSurgeProtectors().addAll((Collection<? extends SurgeProtector>)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				setMaxCurrentRating((Float)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				setMaxContinousOperatingVoltage((Float)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				setNominalDesignVoltage((Float)newValue);
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				setMaxEnergyAbsorption((Float)newValue);
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS:
				getSurgeProtectors().clear();
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				unsetMaxCurrentRating();
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				unsetMaxContinousOperatingVoltage();
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				unsetNominalDesignVoltage();
				return;
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				unsetMaxEnergyAbsorption();
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
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS:
				return surgeProtectors != null && !surgeProtectors.isEmpty();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING:
				return isSetMaxCurrentRating();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE:
				return isSetMaxContinousOperatingVoltage();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE:
				return isSetNominalDesignVoltage();
			case InfAssetsPackage.SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION:
				return isSetMaxEnergyAbsorption();
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
		result.append(" (maxCurrentRating: ");
		if (maxCurrentRatingESet) result.append(maxCurrentRating); else result.append("<unset>");
		result.append(", maxContinousOperatingVoltage: ");
		if (maxContinousOperatingVoltageESet) result.append(maxContinousOperatingVoltage); else result.append("<unset>");
		result.append(", nominalDesignVoltage: ");
		if (nominalDesignVoltageESet) result.append(nominalDesignVoltage); else result.append("<unset>");
		result.append(", maxEnergyAbsorption: ");
		if (maxEnergyAbsorptionESet) result.append(maxEnergyAbsorption); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SurgeProtectorInfo
