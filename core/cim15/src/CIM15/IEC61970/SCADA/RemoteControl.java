/**
 */
package CIM15.IEC61970.SCADA;

import CIM15.IEC61970.Meas.Control;
import CIM15.IEC61970.Meas.MeasPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteControl extends RemotePoint {
	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Control control;

	/**
	 * The default value of the '{@link #getActuatorMaximum() <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUATOR_MAXIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActuatorMaximum() <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMaximum()
	 * @generated
	 * @ordered
	 */
	protected float actuatorMaximum = ACTUATOR_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Actuator Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuatorMaximumESet;

	/**
	 * The default value of the '{@link #getActuatorMinimum() <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUATOR_MINIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActuatorMinimum() <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorMinimum()
	 * @generated
	 * @ordered
	 */
	protected float actuatorMinimum = ACTUATOR_MINIMUM_EDEFAULT;

	/**
	 * This is true if the Actuator Minimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuatorMinimumESet;

	/**
	 * The default value of the '{@link #isRemoteControlled() <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteControlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_CONTROLLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteControlled() <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteControlled()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteControlled = REMOTE_CONTROLLED_EDEFAULT;

	/**
	 * This is true if the Remote Controlled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteControlledESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteControl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_CONTROL;
	}

	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see CIM15.IEC61970.Meas.Control#getRemoteControl
	 * @generated
	 */
	public Control getControl() {
		if (control != null && control.eIsProxy()) {
			InternalEObject oldControl = (InternalEObject)control;
			control = (Control)eResolveProxy(oldControl);
			if (control != oldControl) {
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(Control newControl, NotificationChain msgs) {
		Control oldControl = control;
		control = newControl;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
	public void setControl(Control newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject)control).eInverseRemove(this, MeasPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, MeasPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Actuator Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Maximum</em>' attribute.
	 * @see #isSetActuatorMaximum()
	 * @see #unsetActuatorMaximum()
	 * @see #setActuatorMaximum(float)
	 * @generated
	 */
	public float getActuatorMaximum() {
		return actuatorMaximum;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Maximum</em>' attribute.
	 * @see #isSetActuatorMaximum()
	 * @see #unsetActuatorMaximum()
	 * @see #getActuatorMaximum()
	 * @generated
	 */
	public void setActuatorMaximum(float newActuatorMaximum) {
		actuatorMaximum = newActuatorMaximum;
		actuatorMaximumESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuatorMaximum()
	 * @see #getActuatorMaximum()
	 * @see #setActuatorMaximum(float)
	 * @generated
	 */
	public void unsetActuatorMaximum() {
		actuatorMaximum = ACTUATOR_MAXIMUM_EDEFAULT;
		actuatorMaximumESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMaximum <em>Actuator Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuator Maximum</em>' attribute is set.
	 * @see #unsetActuatorMaximum()
	 * @see #getActuatorMaximum()
	 * @see #setActuatorMaximum(float)
	 * @generated
	 */
	public boolean isSetActuatorMaximum() {
		return actuatorMaximumESet;
	}

	/**
	 * Returns the value of the '<em><b>Actuator Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator Minimum</em>' attribute.
	 * @see #isSetActuatorMinimum()
	 * @see #unsetActuatorMinimum()
	 * @see #setActuatorMinimum(float)
	 * @generated
	 */
	public float getActuatorMinimum() {
		return actuatorMinimum;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Minimum</em>' attribute.
	 * @see #isSetActuatorMinimum()
	 * @see #unsetActuatorMinimum()
	 * @see #getActuatorMinimum()
	 * @generated
	 */
	public void setActuatorMinimum(float newActuatorMinimum) {
		actuatorMinimum = newActuatorMinimum;
		actuatorMinimumESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuatorMinimum()
	 * @see #getActuatorMinimum()
	 * @see #setActuatorMinimum(float)
	 * @generated
	 */
	public void unsetActuatorMinimum() {
		actuatorMinimum = ACTUATOR_MINIMUM_EDEFAULT;
		actuatorMinimumESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#getActuatorMinimum <em>Actuator Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuator Minimum</em>' attribute is set.
	 * @see #unsetActuatorMinimum()
	 * @see #getActuatorMinimum()
	 * @see #setActuatorMinimum(float)
	 * @generated
	 */
	public boolean isSetActuatorMinimum() {
		return actuatorMinimumESet;
	}

	/**
	 * Returns the value of the '<em><b>Remote Controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Controlled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Controlled</em>' attribute.
	 * @see #isSetRemoteControlled()
	 * @see #unsetRemoteControlled()
	 * @see #setRemoteControlled(boolean)
	 * @generated
	 */
	public boolean isRemoteControlled() {
		return remoteControlled;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Controlled</em>' attribute.
	 * @see #isSetRemoteControlled()
	 * @see #unsetRemoteControlled()
	 * @see #isRemoteControlled()
	 * @generated
	 */
	public void setRemoteControlled(boolean newRemoteControlled) {
		remoteControlled = newRemoteControlled;
		remoteControlledESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteControlled()
	 * @see #isRemoteControlled()
	 * @see #setRemoteControlled(boolean)
	 * @generated
	 */
	public void unsetRemoteControlled() {
		remoteControlled = REMOTE_CONTROLLED_EDEFAULT;
		remoteControlledESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteControl#isRemoteControlled <em>Remote Controlled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote Controlled</em>' attribute is set.
	 * @see #unsetRemoteControlled()
	 * @see #isRemoteControlled()
	 * @see #setRemoteControlled(boolean)
	 * @generated
	 */
	public boolean isSetRemoteControlled() {
		return remoteControlledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				if (control != null)
					msgs = ((InternalEObject)control).eInverseRemove(this, MeasPackage.CONTROL__REMOTE_CONTROL, Control.class, msgs);
				return basicSetControl((Control)otherEnd, msgs);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				return basicSetControl(null, msgs);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				return getActuatorMaximum();
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				return getActuatorMinimum();
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				return isRemoteControlled();
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				setControl((Control)newValue);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				setActuatorMaximum((Float)newValue);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				setActuatorMinimum((Float)newValue);
				return;
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				setRemoteControlled((Boolean)newValue);
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				setControl((Control)null);
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				unsetActuatorMaximum();
				return;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				unsetActuatorMinimum();
				return;
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				unsetRemoteControlled();
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
			case SCADAPackage.REMOTE_CONTROL__CONTROL:
				return control != null;
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MAXIMUM:
				return isSetActuatorMaximum();
			case SCADAPackage.REMOTE_CONTROL__ACTUATOR_MINIMUM:
				return isSetActuatorMinimum();
			case SCADAPackage.REMOTE_CONTROL__REMOTE_CONTROLLED:
				return isSetRemoteControlled();
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
		result.append(" (actuatorMaximum: ");
		if (actuatorMaximumESet) result.append(actuatorMaximum); else result.append("<unset>");
		result.append(", actuatorMinimum: ");
		if (actuatorMinimumESet) result.append(actuatorMinimum); else result.append("<unset>");
		result.append(", remoteControlled: ");
		if (remoteControlledESet) result.append(remoteControlled); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RemoteControl
