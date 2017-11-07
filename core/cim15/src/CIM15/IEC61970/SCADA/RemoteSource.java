/**
 */
package CIM15.IEC61970.SCADA;

import CIM15.IEC61970.Meas.MeasPackage;
import CIM15.IEC61970.Meas.MeasurementValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteSource extends RemotePoint {
	/**
	 * The default value of the '{@link #getSensorMinimum() <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final float SENSOR_MINIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSensorMinimum() <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMinimum()
	 * @generated
	 * @ordered
	 */
	protected float sensorMinimum = SENSOR_MINIMUM_EDEFAULT;

	/**
	 * This is true if the Sensor Minimum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensorMinimumESet;

	/**
	 * The default value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadband()
	 * @generated
	 * @ordered
	 */
	protected static final float DEADBAND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadband()
	 * @generated
	 * @ordered
	 */
	protected float deadband = DEADBAND_EDEFAULT;

	/**
	 * This is true if the Deadband attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadbandESet;

	/**
	 * The default value of the '{@link #getSensorMaximum() <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final float SENSOR_MAXIMUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSensorMaximum() <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMaximum()
	 * @generated
	 * @ordered
	 */
	protected float sensorMaximum = SENSOR_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Sensor Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensorMaximumESet;

	/**
	 * The default value of the '{@link #getScanInterval() <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float SCAN_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScanInterval() <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanInterval()
	 * @generated
	 * @ordered
	 */
	protected float scanInterval = SCAN_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Scan Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scanIntervalESet;

	/**
	 * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValue()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue measurementValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteSource() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_SOURCE;
	}

	/**
	 * Returns the value of the '<em><b>Sensor Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Minimum</em>' attribute.
	 * @see #isSetSensorMinimum()
	 * @see #unsetSensorMinimum()
	 * @see #setSensorMinimum(float)
	 * @generated
	 */
	public float getSensorMinimum() {
		return sensorMinimum;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Minimum</em>' attribute.
	 * @see #isSetSensorMinimum()
	 * @see #unsetSensorMinimum()
	 * @see #getSensorMinimum()
	 * @generated
	 */
	public void setSensorMinimum(float newSensorMinimum) {
		sensorMinimum = newSensorMinimum;
		sensorMinimumESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensorMinimum()
	 * @see #getSensorMinimum()
	 * @see #setSensorMinimum(float)
	 * @generated
	 */
	public void unsetSensorMinimum() {
		sensorMinimum = SENSOR_MINIMUM_EDEFAULT;
		sensorMinimumESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMinimum <em>Sensor Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sensor Minimum</em>' attribute is set.
	 * @see #unsetSensorMinimum()
	 * @see #getSensorMinimum()
	 * @see #setSensorMinimum(float)
	 * @generated
	 */
	public boolean isSetSensorMinimum() {
		return sensorMinimumESet;
	}

	/**
	 * Returns the value of the '<em><b>Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband</em>' attribute.
	 * @see #isSetDeadband()
	 * @see #unsetDeadband()
	 * @see #setDeadband(float)
	 * @generated
	 */
	public float getDeadband() {
		return deadband;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband</em>' attribute.
	 * @see #isSetDeadband()
	 * @see #unsetDeadband()
	 * @see #getDeadband()
	 * @generated
	 */
	public void setDeadband(float newDeadband) {
		deadband = newDeadband;
		deadbandESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadband()
	 * @see #getDeadband()
	 * @see #setDeadband(float)
	 * @generated
	 */
	public void unsetDeadband() {
		deadband = DEADBAND_EDEFAULT;
		deadbandESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getDeadband <em>Deadband</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadband</em>' attribute is set.
	 * @see #unsetDeadband()
	 * @see #getDeadband()
	 * @see #setDeadband(float)
	 * @generated
	 */
	public boolean isSetDeadband() {
		return deadbandESet;
	}

	/**
	 * Returns the value of the '<em><b>Sensor Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Maximum</em>' attribute.
	 * @see #isSetSensorMaximum()
	 * @see #unsetSensorMaximum()
	 * @see #setSensorMaximum(float)
	 * @generated
	 */
	public float getSensorMaximum() {
		return sensorMaximum;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Maximum</em>' attribute.
	 * @see #isSetSensorMaximum()
	 * @see #unsetSensorMaximum()
	 * @see #getSensorMaximum()
	 * @generated
	 */
	public void setSensorMaximum(float newSensorMaximum) {
		sensorMaximum = newSensorMaximum;
		sensorMaximumESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensorMaximum()
	 * @see #getSensorMaximum()
	 * @see #setSensorMaximum(float)
	 * @generated
	 */
	public void unsetSensorMaximum() {
		sensorMaximum = SENSOR_MAXIMUM_EDEFAULT;
		sensorMaximumESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getSensorMaximum <em>Sensor Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sensor Maximum</em>' attribute is set.
	 * @see #unsetSensorMaximum()
	 * @see #getSensorMaximum()
	 * @see #setSensorMaximum(float)
	 * @generated
	 */
	public boolean isSetSensorMaximum() {
		return sensorMaximumESet;
	}

	/**
	 * Returns the value of the '<em><b>Scan Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Interval</em>' attribute.
	 * @see #isSetScanInterval()
	 * @see #unsetScanInterval()
	 * @see #setScanInterval(float)
	 * @generated
	 */
	public float getScanInterval() {
		return scanInterval;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Interval</em>' attribute.
	 * @see #isSetScanInterval()
	 * @see #unsetScanInterval()
	 * @see #getScanInterval()
	 * @generated
	 */
	public void setScanInterval(float newScanInterval) {
		scanInterval = newScanInterval;
		scanIntervalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScanInterval()
	 * @see #getScanInterval()
	 * @see #setScanInterval(float)
	 * @generated
	 */
	public void unsetScanInterval() {
		scanInterval = SCAN_INTERVAL_EDEFAULT;
		scanIntervalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getScanInterval <em>Scan Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scan Interval</em>' attribute is set.
	 * @see #unsetScanInterval()
	 * @see #getScanInterval()
	 * @see #setScanInterval(float)
	 * @generated
	 */
	public boolean isSetScanInterval() {
		return scanIntervalESet;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' reference.
	 * @see #setMeasurementValue(MeasurementValue)
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getRemoteSource
	 * @generated
	 */
	public MeasurementValue getMeasurementValue() {
		if (measurementValue != null && measurementValue.eIsProxy()) {
			InternalEObject oldMeasurementValue = (InternalEObject)measurementValue;
			measurementValue = (MeasurementValue)eResolveProxy(oldMeasurementValue);
			if (measurementValue != oldMeasurementValue) {
			}
		}
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue basicGetMeasurementValue() {
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValue(MeasurementValue newMeasurementValue, NotificationChain msgs) {
		MeasurementValue oldMeasurementValue = measurementValue;
		measurementValue = newMeasurementValue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value</em>' reference.
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public void setMeasurementValue(MeasurementValue newMeasurementValue) {
		if (newMeasurementValue != measurementValue) {
			NotificationChain msgs = null;
			if (measurementValue != null)
				msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs);
			if (newMeasurementValue != null)
				msgs = ((InternalEObject)newMeasurementValue).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs);
			msgs = basicSetMeasurementValue(newMeasurementValue, msgs);
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
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				if (measurementValue != null)
					msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE, MeasurementValue.class, msgs);
				return basicSetMeasurementValue((MeasurementValue)otherEnd, msgs);
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
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				return basicSetMeasurementValue(null, msgs);
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
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				return getSensorMinimum();
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				return getDeadband();
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				return getSensorMaximum();
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				return getScanInterval();
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				if (resolve) return getMeasurementValue();
				return basicGetMeasurementValue();
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
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				setSensorMinimum((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				setDeadband((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				setSensorMaximum((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				setScanInterval((Float)newValue);
				return;
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)newValue);
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
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				unsetSensorMinimum();
				return;
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				unsetDeadband();
				return;
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				unsetSensorMaximum();
				return;
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				unsetScanInterval();
				return;
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)null);
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
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MINIMUM:
				return isSetSensorMinimum();
			case SCADAPackage.REMOTE_SOURCE__DEADBAND:
				return isSetDeadband();
			case SCADAPackage.REMOTE_SOURCE__SENSOR_MAXIMUM:
				return isSetSensorMaximum();
			case SCADAPackage.REMOTE_SOURCE__SCAN_INTERVAL:
				return isSetScanInterval();
			case SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE:
				return measurementValue != null;
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
		result.append(" (sensorMinimum: ");
		if (sensorMinimumESet) result.append(sensorMinimum); else result.append("<unset>");
		result.append(", deadband: ");
		if (deadbandESet) result.append(deadband); else result.append("<unset>");
		result.append(", sensorMaximum: ");
		if (sensorMaximumESet) result.append(sensorMaximum); else result.append("<unset>");
		result.append(", scanInterval: ");
		if (scanIntervalESet) result.append(scanInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RemoteSource
