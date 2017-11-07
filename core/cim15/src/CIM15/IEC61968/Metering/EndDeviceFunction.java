/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Assets.AssetFunction;

import CIM15.IEC61970.Informative.InfAssets.ComEquipment;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceFunction#getRegisters <em>Registers</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceFunction#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceFunction#getComEquipment <em>Com Equipment</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceFunction#isSupported <em>Supported</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDevice <em>End Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndDeviceFunction extends AssetFunction {
	/**
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<Register> registers;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The cached value of the '{@link #getComEquipment() <em>Com Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComEquipment()
	 * @generated
	 * @ordered
	 */
	protected ComEquipment comEquipment;

	/**
	 * The default value of the '{@link #isSupported() <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupported() <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean supported = SUPPORTED_EDEFAULT;

	/**
	 * This is true if the Supported attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean supportedESet;

	/**
	 * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceEvent> endDeviceEvents;

	/**
	 * The cached value of the '{@link #getEndDevice() <em>End Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDevice()
	 * @generated
	 * @ordered
	 */
	protected EndDevice endDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.Register}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Register#getEndDeviceFunction <em>End Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' reference list.
	 * @see CIM15.IEC61968.Metering.Register#getEndDeviceFunction
	 * @generated
	 */
	public EList<Register> getRegisters() {
		if (registers == null) {
			registers = new BasicInternalEList<Register>(Register.class);
		}
		return registers;
	}

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
		enabledESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	public void unsetEnabled() {
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * Returns the value of the '<em><b>Com Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ComEquipment#getEndDeviceFunctions <em>End Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Equipment</em>' reference.
	 * @see #setComEquipment(ComEquipment)
	 * @see CIM15.IEC61970.Informative.InfAssets.ComEquipment#getEndDeviceFunctions
	 * @generated
	 */
	public ComEquipment getComEquipment() {
		if (comEquipment != null && comEquipment.eIsProxy()) {
			InternalEObject oldComEquipment = (InternalEObject)comEquipment;
			comEquipment = (ComEquipment)eResolveProxy(oldComEquipment);
			if (comEquipment != oldComEquipment) {
			}
		}
		return comEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComEquipment basicGetComEquipment() {
		return comEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComEquipment(ComEquipment newComEquipment, NotificationChain msgs) {
		ComEquipment oldComEquipment = comEquipment;
		comEquipment = newComEquipment;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getComEquipment <em>Com Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Equipment</em>' reference.
	 * @see #getComEquipment()
	 * @generated
	 */
	public void setComEquipment(ComEquipment newComEquipment) {
		if (newComEquipment != comEquipment) {
			NotificationChain msgs = null;
			if (comEquipment != null)
				msgs = ((InternalEObject)comEquipment).eInverseRemove(this, InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS, ComEquipment.class, msgs);
			if (newComEquipment != null)
				msgs = ((InternalEObject)newComEquipment).eInverseAdd(this, InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS, ComEquipment.class, msgs);
			msgs = basicSetComEquipment(newComEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported</em>' attribute.
	 * @see #isSetSupported()
	 * @see #unsetSupported()
	 * @see #setSupported(boolean)
	 * @generated
	 */
	public boolean isSupported() {
		return supported;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isSupported <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported</em>' attribute.
	 * @see #isSetSupported()
	 * @see #unsetSupported()
	 * @see #isSupported()
	 * @generated
	 */
	public void setSupported(boolean newSupported) {
		supported = newSupported;
		supportedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isSupported <em>Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupported()
	 * @see #isSupported()
	 * @see #setSupported(boolean)
	 * @generated
	 */
	public void unsetSupported() {
		supported = SUPPORTED_EDEFAULT;
		supportedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#isSupported <em>Supported</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Supported</em>' attribute is set.
	 * @see #unsetSupported()
	 * @see #isSupported()
	 * @see #setSupported(boolean)
	 * @generated
	 */
	public boolean isSetSupported() {
		return supportedESet;
	}

	/**
	 * Returns the value of the '<em><b>End Device Events</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceEvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getEndDeviceFunction <em>End Device Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Events</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent#getEndDeviceFunction
	 * @generated
	 */
	public EList<EndDeviceEvent> getEndDeviceEvents() {
		if (endDeviceEvents == null) {
			endDeviceEvents = new BasicInternalEList<EndDeviceEvent>(EndDeviceEvent.class);
		}
		return endDeviceEvents;
	}

	/**
	 * Returns the value of the '<em><b>End Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceFunctions <em>End Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device</em>' reference.
	 * @see #setEndDevice(EndDevice)
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceFunctions
	 * @generated
	 */
	public EndDevice getEndDevice() {
		if (endDevice != null && endDevice.eIsProxy()) {
			InternalEObject oldEndDevice = (InternalEObject)endDevice;
			endDevice = (EndDevice)eResolveProxy(oldEndDevice);
			if (endDevice != oldEndDevice) {
			}
		}
		return endDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDevice basicGetEndDevice() {
		return endDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDevice(EndDevice newEndDevice, NotificationChain msgs) {
		EndDevice oldEndDevice = endDevice;
		endDevice = newEndDevice;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDevice <em>End Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device</em>' reference.
	 * @see #getEndDevice()
	 * @generated
	 */
	public void setEndDevice(EndDevice newEndDevice) {
		if (newEndDevice != endDevice) {
			NotificationChain msgs = null;
			if (endDevice != null)
				msgs = ((InternalEObject)endDevice).eInverseRemove(this, MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS, EndDevice.class, msgs);
			if (newEndDevice != null)
				msgs = ((InternalEObject)newEndDevice).eInverseAdd(this, MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS, EndDevice.class, msgs);
			msgs = basicSetEndDevice(newEndDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case MeteringPackage.END_DEVICE_FUNCTION__REGISTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisters()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT:
				if (comEquipment != null)
					msgs = ((InternalEObject)comEquipment).eInverseRemove(this, InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS, ComEquipment.class, msgs);
				return basicSetComEquipment((ComEquipment)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceEvents()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE:
				if (endDevice != null)
					msgs = ((InternalEObject)endDevice).eInverseRemove(this, MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS, EndDevice.class, msgs);
				return basicSetEndDevice((EndDevice)otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_FUNCTION__REGISTERS:
				return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT:
				return basicSetComEquipment(null, msgs);
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return ((InternalEList<?>)getEndDeviceEvents()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE:
				return basicSetEndDevice(null, msgs);
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
			case MeteringPackage.END_DEVICE_FUNCTION__REGISTERS:
				return getRegisters();
			case MeteringPackage.END_DEVICE_FUNCTION__ENABLED:
				return isEnabled();
			case MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT:
				if (resolve) return getComEquipment();
				return basicGetComEquipment();
			case MeteringPackage.END_DEVICE_FUNCTION__SUPPORTED:
				return isSupported();
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return getEndDeviceEvents();
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE:
				if (resolve) return getEndDevice();
				return basicGetEndDevice();
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
			case MeteringPackage.END_DEVICE_FUNCTION__REGISTERS:
				getRegisters().clear();
				getRegisters().addAll((Collection<? extends Register>)newValue);
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT:
				setComEquipment((ComEquipment)newValue);
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__SUPPORTED:
				setSupported((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				getEndDeviceEvents().addAll((Collection<? extends EndDeviceEvent>)newValue);
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE:
				setEndDevice((EndDevice)newValue);
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
			case MeteringPackage.END_DEVICE_FUNCTION__REGISTERS:
				getRegisters().clear();
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__ENABLED:
				unsetEnabled();
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT:
				setComEquipment((ComEquipment)null);
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__SUPPORTED:
				unsetSupported();
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				return;
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE:
				setEndDevice((EndDevice)null);
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
			case MeteringPackage.END_DEVICE_FUNCTION__REGISTERS:
				return registers != null && !registers.isEmpty();
			case MeteringPackage.END_DEVICE_FUNCTION__ENABLED:
				return isSetEnabled();
			case MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT:
				return comEquipment != null;
			case MeteringPackage.END_DEVICE_FUNCTION__SUPPORTED:
				return isSetSupported();
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return endDeviceEvents != null && !endDeviceEvents.isEmpty();
			case MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE:
				return endDevice != null;
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
		result.append(" (enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", supported: ");
		if (supportedESet) result.append(supported); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EndDeviceFunction
