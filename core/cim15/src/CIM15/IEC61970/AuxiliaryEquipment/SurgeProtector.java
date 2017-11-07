/**
 */
package CIM15.IEC61970.AuxiliaryEquipment;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surge Protector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector#getSurgeProtectorInfo <em>Surge Protector Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurgeProtector extends AuxiliaryEquipment {
	/**
	 * The cached value of the '{@link #getSurgeProtectorInfo() <em>Surge Protector Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 * @ordered
	 */
	protected SurgeProtectorInfo surgeProtectorInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeProtector() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuxiliaryEquipmentPackage.Literals.SURGE_PROTECTOR;
	}

	/**
	 * Returns the value of the '<em><b>Surge Protector Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getSurgeProtectors <em>Surge Protectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surge Protector Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surge Protector Info</em>' reference.
	 * @see #setSurgeProtectorInfo(SurgeProtectorInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getSurgeProtectors
	 * @generated
	 */
	public SurgeProtectorInfo getSurgeProtectorInfo() {
		if (surgeProtectorInfo != null && surgeProtectorInfo.eIsProxy()) {
			InternalEObject oldSurgeProtectorInfo = (InternalEObject)surgeProtectorInfo;
			surgeProtectorInfo = (SurgeProtectorInfo)eResolveProxy(oldSurgeProtectorInfo);
			if (surgeProtectorInfo != oldSurgeProtectorInfo) {
			}
		}
		return surgeProtectorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeProtectorInfo basicGetSurgeProtectorInfo() {
		return surgeProtectorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurgeProtectorInfo(SurgeProtectorInfo newSurgeProtectorInfo, NotificationChain msgs) {
		SurgeProtectorInfo oldSurgeProtectorInfo = surgeProtectorInfo;
		surgeProtectorInfo = newSurgeProtectorInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector#getSurgeProtectorInfo <em>Surge Protector Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surge Protector Info</em>' reference.
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	public void setSurgeProtectorInfo(SurgeProtectorInfo newSurgeProtectorInfo) {
		if (newSurgeProtectorInfo != surgeProtectorInfo) {
			NotificationChain msgs = null;
			if (surgeProtectorInfo != null)
				msgs = ((InternalEObject)surgeProtectorInfo).eInverseRemove(this, InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS, SurgeProtectorInfo.class, msgs);
			if (newSurgeProtectorInfo != null)
				msgs = ((InternalEObject)newSurgeProtectorInfo).eInverseAdd(this, InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS, SurgeProtectorInfo.class, msgs);
			msgs = basicSetSurgeProtectorInfo(newSurgeProtectorInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR__SURGE_PROTECTOR_INFO:
				if (surgeProtectorInfo != null)
					msgs = ((InternalEObject)surgeProtectorInfo).eInverseRemove(this, InfAssetsPackage.SURGE_PROTECTOR_INFO__SURGE_PROTECTORS, SurgeProtectorInfo.class, msgs);
				return basicSetSurgeProtectorInfo((SurgeProtectorInfo)otherEnd, msgs);
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
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR__SURGE_PROTECTOR_INFO:
				return basicSetSurgeProtectorInfo(null, msgs);
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
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR__SURGE_PROTECTOR_INFO:
				if (resolve) return getSurgeProtectorInfo();
				return basicGetSurgeProtectorInfo();
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
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR__SURGE_PROTECTOR_INFO:
				setSurgeProtectorInfo((SurgeProtectorInfo)newValue);
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
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR__SURGE_PROTECTOR_INFO:
				setSurgeProtectorInfo((SurgeProtectorInfo)null);
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
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR__SURGE_PROTECTOR_INFO:
				return surgeProtectorInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // SurgeProtector
