/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Common.ActivityRecord;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceEvent#getEndDeviceFunction <em>End Device Function</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndDeviceEvent extends ActivityRecord {
	/**
	 * The cached value of the '{@link #getEndDeviceFunction() <em>End Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceFunction()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceFunction endDeviceFunction;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * This is true if the User ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userIDESet;

	/**
	 * The cached value of the '{@link #getMeterReading() <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReading()
	 * @generated
	 * @ordered
	 */
	protected MeterReading meterReading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceEvent() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_EVENT;
	}

	/**
	 * Returns the value of the '<em><b>End Device Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Function</em>' reference.
	 * @see #setEndDeviceFunction(EndDeviceFunction)
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getEndDeviceEvents
	 * @generated
	 */
	public EndDeviceFunction getEndDeviceFunction() {
		if (endDeviceFunction != null && endDeviceFunction.eIsProxy()) {
			InternalEObject oldEndDeviceFunction = (InternalEObject)endDeviceFunction;
			endDeviceFunction = (EndDeviceFunction)eResolveProxy(oldEndDeviceFunction);
			if (endDeviceFunction != oldEndDeviceFunction) {
			}
		}
		return endDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceFunction basicGetEndDeviceFunction() {
		return endDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceFunction(EndDeviceFunction newEndDeviceFunction, NotificationChain msgs) {
		EndDeviceFunction oldEndDeviceFunction = endDeviceFunction;
		endDeviceFunction = newEndDeviceFunction;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getEndDeviceFunction <em>End Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Function</em>' reference.
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public void setEndDeviceFunction(EndDeviceFunction newEndDeviceFunction) {
		if (newEndDeviceFunction != endDeviceFunction) {
			NotificationChain msgs = null;
			if (endDeviceFunction != null)
				msgs = ((InternalEObject)endDeviceFunction).eInverseRemove(this, MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS, EndDeviceFunction.class, msgs);
			if (newEndDeviceFunction != null)
				msgs = ((InternalEObject)newEndDeviceFunction).eInverseAdd(this, MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS, EndDeviceFunction.class, msgs);
			msgs = basicSetEndDeviceFunction(newEndDeviceFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #isSetUserID()
	 * @see #unsetUserID()
	 * @see #setUserID(String)
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #isSetUserID()
	 * @see #unsetUserID()
	 * @see #getUserID()
	 * @generated
	 */
	public void setUserID(String newUserID) {
		userID = newUserID;
		userIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserID()
	 * @see #getUserID()
	 * @see #setUserID(String)
	 * @generated
	 */
	public void unsetUserID() {
		userID = USER_ID_EDEFAULT;
		userIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getUserID <em>User ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User ID</em>' attribute is set.
	 * @see #unsetUserID()
	 * @see #getUserID()
	 * @see #setUserID(String)
	 * @generated
	 */
	public boolean isSetUserID() {
		return userIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Meter Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterReading#getEndDeviceEvents <em>End Device Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Reading</em>' reference.
	 * @see #setMeterReading(MeterReading)
	 * @see CIM15.IEC61968.Metering.MeterReading#getEndDeviceEvents
	 * @generated
	 */
	public MeterReading getMeterReading() {
		if (meterReading != null && meterReading.eIsProxy()) {
			InternalEObject oldMeterReading = (InternalEObject)meterReading;
			meterReading = (MeterReading)eResolveProxy(oldMeterReading);
			if (meterReading != oldMeterReading) {
			}
		}
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterReading basicGetMeterReading() {
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterReading(MeterReading newMeterReading, NotificationChain msgs) {
		MeterReading oldMeterReading = meterReading;
		meterReading = newMeterReading;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Reading</em>' reference.
	 * @see #getMeterReading()
	 * @generated
	 */
	public void setMeterReading(MeterReading newMeterReading) {
		if (newMeterReading != meterReading) {
			NotificationChain msgs = null;
			if (meterReading != null)
				msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs);
			if (newMeterReading != null)
				msgs = ((InternalEObject)newMeterReading).eInverseAdd(this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs);
			msgs = basicSetMeterReading(newMeterReading, msgs);
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
			case MeteringPackage.END_DEVICE_EVENT__END_DEVICE_FUNCTION:
				if (endDeviceFunction != null)
					msgs = ((InternalEObject)endDeviceFunction).eInverseRemove(this, MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS, EndDeviceFunction.class, msgs);
				return basicSetEndDeviceFunction((EndDeviceFunction)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				if (meterReading != null)
					msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__END_DEVICE_EVENTS, MeterReading.class, msgs);
				return basicSetMeterReading((MeterReading)otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_EVENT__END_DEVICE_FUNCTION:
				return basicSetEndDeviceFunction(null, msgs);
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				return basicSetMeterReading(null, msgs);
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
			case MeteringPackage.END_DEVICE_EVENT__END_DEVICE_FUNCTION:
				if (resolve) return getEndDeviceFunction();
				return basicGetEndDeviceFunction();
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				return getUserID();
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				if (resolve) return getMeterReading();
				return basicGetMeterReading();
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
			case MeteringPackage.END_DEVICE_EVENT__END_DEVICE_FUNCTION:
				setEndDeviceFunction((EndDeviceFunction)newValue);
				return;
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				setUserID((String)newValue);
				return;
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				setMeterReading((MeterReading)newValue);
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
			case MeteringPackage.END_DEVICE_EVENT__END_DEVICE_FUNCTION:
				setEndDeviceFunction((EndDeviceFunction)null);
				return;
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				unsetUserID();
				return;
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				setMeterReading((MeterReading)null);
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
			case MeteringPackage.END_DEVICE_EVENT__END_DEVICE_FUNCTION:
				return endDeviceFunction != null;
			case MeteringPackage.END_DEVICE_EVENT__USER_ID:
				return isSetUserID();
			case MeteringPackage.END_DEVICE_EVENT__METER_READING:
				return meterReading != null;
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
		result.append(" (userID: ");
		if (userIDESet) result.append(userID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EndDeviceEvent
