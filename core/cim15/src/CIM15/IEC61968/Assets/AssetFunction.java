/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetFunction extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * This is true if the Password attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passwordESet;

	/**
	 * The default value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected String hardwareID = HARDWARE_ID_EDEFAULT;

	/**
	 * This is true if the Hardware ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hardwareIDESet;

	/**
	 * The default value of the '{@link #getFirmwareID() <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmwareID() <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareID()
	 * @generated
	 * @ordered
	 */
	protected String firmwareID = FIRMWARE_ID_EDEFAULT;

	/**
	 * This is true if the Firmware ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firmwareIDESet;

	/**
	 * The default value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramID()
	 * @generated
	 * @ordered
	 */
	protected String programID = PROGRAM_ID_EDEFAULT;

	/**
	 * This is true if the Program ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean programIDESet;

	/**
	 * The default value of the '{@link #getConfigID() <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigID() <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigID()
	 * @generated
	 * @ordered
	 */
	protected String configID = CONFIG_ID_EDEFAULT;

	/**
	 * This is true if the Config ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getAssetFunctions <em>Asset Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM15.IEC61968.Assets.Asset#getAssetFunctions
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ASSET_FUNCTIONS, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__ASSET_FUNCTIONS, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #setPassword(String)
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #getPassword()
	 * @generated
	 */
	public void setPassword(String newPassword) {
		password = newPassword;
		passwordESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassword()
	 * @see #getPassword()
	 * @see #setPassword(String)
	 * @generated
	 */
	public void unsetPassword() {
		password = PASSWORD_EDEFAULT;
		passwordESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Password</em>' attribute is set.
	 * @see #unsetPassword()
	 * @see #getPassword()
	 * @see #setPassword(String)
	 * @generated
	 */
	public boolean isSetPassword() {
		return passwordESet;
	}

	/**
	 * Returns the value of the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware ID</em>' attribute.
	 * @see #isSetHardwareID()
	 * @see #unsetHardwareID()
	 * @see #setHardwareID(String)
	 * @generated
	 */
	public String getHardwareID() {
		return hardwareID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware ID</em>' attribute.
	 * @see #isSetHardwareID()
	 * @see #unsetHardwareID()
	 * @see #getHardwareID()
	 * @generated
	 */
	public void setHardwareID(String newHardwareID) {
		hardwareID = newHardwareID;
		hardwareIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardwareID()
	 * @see #getHardwareID()
	 * @see #setHardwareID(String)
	 * @generated
	 */
	public void unsetHardwareID() {
		hardwareID = HARDWARE_ID_EDEFAULT;
		hardwareIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardware ID</em>' attribute is set.
	 * @see #unsetHardwareID()
	 * @see #getHardwareID()
	 * @see #setHardwareID(String)
	 * @generated
	 */
	public boolean isSetHardwareID() {
		return hardwareIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmware ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware ID</em>' attribute.
	 * @see #isSetFirmwareID()
	 * @see #unsetFirmwareID()
	 * @see #setFirmwareID(String)
	 * @generated
	 */
	public String getFirmwareID() {
		return firmwareID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware ID</em>' attribute.
	 * @see #isSetFirmwareID()
	 * @see #unsetFirmwareID()
	 * @see #getFirmwareID()
	 * @generated
	 */
	public void setFirmwareID(String newFirmwareID) {
		firmwareID = newFirmwareID;
		firmwareIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirmwareID()
	 * @see #getFirmwareID()
	 * @see #setFirmwareID(String)
	 * @generated
	 */
	public void unsetFirmwareID() {
		firmwareID = FIRMWARE_ID_EDEFAULT;
		firmwareIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Firmware ID</em>' attribute is set.
	 * @see #unsetFirmwareID()
	 * @see #getFirmwareID()
	 * @see #setFirmwareID(String)
	 * @generated
	 */
	public boolean isSetFirmwareID() {
		return firmwareIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program ID</em>' attribute.
	 * @see #isSetProgramID()
	 * @see #unsetProgramID()
	 * @see #setProgramID(String)
	 * @generated
	 */
	public String getProgramID() {
		return programID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program ID</em>' attribute.
	 * @see #isSetProgramID()
	 * @see #unsetProgramID()
	 * @see #getProgramID()
	 * @generated
	 */
	public void setProgramID(String newProgramID) {
		programID = newProgramID;
		programIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProgramID()
	 * @see #getProgramID()
	 * @see #setProgramID(String)
	 * @generated
	 */
	public void unsetProgramID() {
		programID = PROGRAM_ID_EDEFAULT;
		programIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Program ID</em>' attribute is set.
	 * @see #unsetProgramID()
	 * @see #getProgramID()
	 * @see #setProgramID(String)
	 * @generated
	 */
	public boolean isSetProgramID() {
		return programIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config ID</em>' attribute.
	 * @see #isSetConfigID()
	 * @see #unsetConfigID()
	 * @see #setConfigID(String)
	 * @generated
	 */
	public String getConfigID() {
		return configID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config ID</em>' attribute.
	 * @see #isSetConfigID()
	 * @see #unsetConfigID()
	 * @see #getConfigID()
	 * @generated
	 */
	public void setConfigID(String newConfigID) {
		configID = newConfigID;
		configIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigID()
	 * @see #getConfigID()
	 * @see #setConfigID(String)
	 * @generated
	 */
	public void unsetConfigID() {
		configID = CONFIG_ID_EDEFAULT;
		configIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Config ID</em>' attribute is set.
	 * @see #unsetConfigID()
	 * @see #getConfigID()
	 * @see #setConfigID(String)
	 * @generated
	 */
	public boolean isSetConfigID() {
		return configIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__ASSET_FUNCTIONS, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
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
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				return basicSetAsset(null, msgs);
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
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				return getPassword();
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				return getHardwareID();
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				return getFirmwareID();
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				return getProgramID();
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				return getConfigID();
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
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				setAsset((Asset)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				setPassword((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				setHardwareID((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				setFirmwareID((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				setProgramID((String)newValue);
				return;
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				setConfigID((String)newValue);
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
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				setAsset((Asset)null);
				return;
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				unsetPassword();
				return;
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				unsetHardwareID();
				return;
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				unsetFirmwareID();
				return;
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				unsetProgramID();
				return;
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				unsetConfigID();
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
			case AssetsPackage.ASSET_FUNCTION__ASSET:
				return asset != null;
			case AssetsPackage.ASSET_FUNCTION__PASSWORD:
				return isSetPassword();
			case AssetsPackage.ASSET_FUNCTION__HARDWARE_ID:
				return isSetHardwareID();
			case AssetsPackage.ASSET_FUNCTION__FIRMWARE_ID:
				return isSetFirmwareID();
			case AssetsPackage.ASSET_FUNCTION__PROGRAM_ID:
				return isSetProgramID();
			case AssetsPackage.ASSET_FUNCTION__CONFIG_ID:
				return isSetConfigID();
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
		result.append(" (password: ");
		if (passwordESet) result.append(password); else result.append("<unset>");
		result.append(", hardwareID: ");
		if (hardwareIDESet) result.append(hardwareID); else result.append("<unset>");
		result.append(", firmwareID: ");
		if (firmwareIDESet) result.append(firmwareID); else result.append("<unset>");
		result.append(", programID: ");
		if (programIDESet) result.append(programID); else result.append("<unset>");
		result.append(", configID: ");
		if (configIDESet) result.append(configID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AssetFunction
