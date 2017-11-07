/**
 */
package CIM15.IEC61970.Meas;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfGMLSupport.GmlValue;

import CIM15.IEC61970.SCADA.RemoteSource;
import CIM15.IEC61970.SCADA.SCADAPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getGmlValues <em>Gml Values</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementValue extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlValues() <em>Gml Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlValues()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlValue> gmlValues;

	/**
	 * The cached value of the '{@link #getMeasurementValueQuality() <em>Measurement Value Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValueQuality()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValueQuality measurementValueQuality;

	/**
	 * The default value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final float SENSOR_ACCURACY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSensorAccuracy() <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorAccuracy()
	 * @generated
	 * @ordered
	 */
	protected float sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;

	/**
	 * This is true if the Sensor Accuracy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensorAccuracyESet;

	/**
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The cached value of the '{@link #getMeasurementValueSource() <em>Measurement Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValueSource()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValueSource measurementValueSource;

	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The cached value of the '{@link #getRemoteSource() <em>Remote Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSource()
	 * @generated
	 * @ordered
	 */
	protected RemoteSource remoteSource;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * This is true if the Time Stamp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeStampESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT_VALUE;
	}

	/**
	 * Returns the value of the '<em><b>Gml Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Values</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue
	 * @generated
	 */
	public EList<GmlValue> getGmlValues() {
		if (gmlValues == null) {
			gmlValues = new BasicInternalEList<GmlValue>(GmlValue.class);
		}
		return gmlValues;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Value Quality</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value Quality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value Quality</em>' reference.
	 * @see #setMeasurementValueQuality(MeasurementValueQuality)
	 * @see CIM15.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue
	 * @generated
	 */
	public MeasurementValueQuality getMeasurementValueQuality() {
		if (measurementValueQuality != null && measurementValueQuality.eIsProxy()) {
			InternalEObject oldMeasurementValueQuality = (InternalEObject)measurementValueQuality;
			measurementValueQuality = (MeasurementValueQuality)eResolveProxy(oldMeasurementValueQuality);
			if (measurementValueQuality != oldMeasurementValueQuality) {
			}
		}
		return measurementValueQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueQuality basicGetMeasurementValueQuality() {
		return measurementValueQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValueQuality(MeasurementValueQuality newMeasurementValueQuality, NotificationChain msgs) {
		MeasurementValueQuality oldMeasurementValueQuality = measurementValueQuality;
		measurementValueQuality = newMeasurementValueQuality;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value Quality</em>' reference.
	 * @see #getMeasurementValueQuality()
	 * @generated
	 */
	public void setMeasurementValueQuality(MeasurementValueQuality newMeasurementValueQuality) {
		if (newMeasurementValueQuality != measurementValueQuality) {
			NotificationChain msgs = null;
			if (measurementValueQuality != null)
				msgs = ((InternalEObject)measurementValueQuality).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs);
			if (newMeasurementValueQuality != null)
				msgs = ((InternalEObject)newMeasurementValueQuality).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs);
			msgs = basicSetMeasurementValueQuality(newMeasurementValueQuality, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Accuracy</em>' attribute.
	 * @see #isSetSensorAccuracy()
	 * @see #unsetSensorAccuracy()
	 * @see #setSensorAccuracy(float)
	 * @generated
	 */
	public float getSensorAccuracy() {
		return sensorAccuracy;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Accuracy</em>' attribute.
	 * @see #isSetSensorAccuracy()
	 * @see #unsetSensorAccuracy()
	 * @see #getSensorAccuracy()
	 * @generated
	 */
	public void setSensorAccuracy(float newSensorAccuracy) {
		sensorAccuracy = newSensorAccuracy;
		sensorAccuracyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensorAccuracy()
	 * @see #getSensorAccuracy()
	 * @see #setSensorAccuracy(float)
	 * @generated
	 */
	public void unsetSensorAccuracy() {
		sensorAccuracy = SENSOR_ACCURACY_EDEFAULT;
		sensorAccuracyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sensor Accuracy</em>' attribute is set.
	 * @see #unsetSensorAccuracy()
	 * @see #getSensorAccuracy()
	 * @see #setSensorAccuracy(float)
	 * @generated
	 */
	public boolean isSetSensorAccuracy() {
		return sensorAccuracyESet;
	}

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new BasicInternalEList<ProcedureDataSet>(ProcedureDataSet.class);
		}
		return procedureDataSets;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Value Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value Source</em>' reference.
	 * @see #setMeasurementValueSource(MeasurementValueSource)
	 * @see CIM15.IEC61970.Meas.MeasurementValueSource#getMeasurementValues
	 * @generated
	 */
	public MeasurementValueSource getMeasurementValueSource() {
		if (measurementValueSource != null && measurementValueSource.eIsProxy()) {
			InternalEObject oldMeasurementValueSource = (InternalEObject)measurementValueSource;
			measurementValueSource = (MeasurementValueSource)eResolveProxy(oldMeasurementValueSource);
			if (measurementValueSource != oldMeasurementValueSource) {
			}
		}
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource basicGetMeasurementValueSource() {
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValueSource(MeasurementValueSource newMeasurementValueSource, NotificationChain msgs) {
		MeasurementValueSource oldMeasurementValueSource = measurementValueSource;
		measurementValueSource = newMeasurementValueSource;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value Source</em>' reference.
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	public void setMeasurementValueSource(MeasurementValueSource newMeasurementValueSource) {
		if (newMeasurementValueSource != measurementValueSource) {
			NotificationChain msgs = null;
			if (measurementValueSource != null)
				msgs = ((InternalEObject)measurementValueSource).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
			if (newMeasurementValueSource != null)
				msgs = ((InternalEObject)newMeasurementValueSource).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
			msgs = basicSetMeasurementValueSource(newMeasurementValueSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getMeasurementValues
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Remote Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.SCADA.RemoteSource#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Source</em>' reference.
	 * @see #setRemoteSource(RemoteSource)
	 * @see CIM15.IEC61970.SCADA.RemoteSource#getMeasurementValue
	 * @generated
	 */
	public RemoteSource getRemoteSource() {
		if (remoteSource != null && remoteSource.eIsProxy()) {
			InternalEObject oldRemoteSource = (InternalEObject)remoteSource;
			remoteSource = (RemoteSource)eResolveProxy(oldRemoteSource);
			if (remoteSource != oldRemoteSource) {
			}
		}
		return remoteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteSource basicGetRemoteSource() {
		return remoteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteSource(RemoteSource newRemoteSource, NotificationChain msgs) {
		RemoteSource oldRemoteSource = remoteSource;
		remoteSource = newRemoteSource;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Source</em>' reference.
	 * @see #getRemoteSource()
	 * @generated
	 */
	public void setRemoteSource(RemoteSource newRemoteSource) {
		if (newRemoteSource != remoteSource) {
			NotificationChain msgs = null;
			if (remoteSource != null)
				msgs = ((InternalEObject)remoteSource).eInverseRemove(this, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs);
			if (newRemoteSource != null)
				msgs = ((InternalEObject)newRemoteSource).eInverseAdd(this, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs);
			msgs = basicSetRemoteSource(newRemoteSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #setTimeStamp(Date)
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #getTimeStamp()
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		timeStamp = newTimeStamp;
		timeStampESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeStamp()
	 * @see #getTimeStamp()
	 * @see #setTimeStamp(Date)
	 * @generated
	 */
	public void unsetTimeStamp() {
		timeStamp = TIME_STAMP_EDEFAULT;
		timeStampESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
	 * @see #unsetTimeStamp()
	 * @see #getTimeStamp()
	 * @see #setTimeStamp(Date)
	 * @generated
	 */
	public boolean isSetTimeStamp() {
		return timeStampESet;
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlValues()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				if (measurementValueQuality != null)
					msgs = ((InternalEObject)measurementValueQuality).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE, MeasurementValueQuality.class, msgs);
				return basicSetMeasurementValueQuality((MeasurementValueQuality)otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				if (measurementValueSource != null)
					msgs = ((InternalEObject)measurementValueSource).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES, MeasurementValueSource.class, msgs);
				return basicSetMeasurementValueSource((MeasurementValueSource)otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__MEASUREMENT_VALUES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				if (remoteSource != null)
					msgs = ((InternalEObject)remoteSource).eInverseRemove(this, SCADAPackage.REMOTE_SOURCE__MEASUREMENT_VALUE, RemoteSource.class, msgs);
				return basicSetRemoteSource((RemoteSource)otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return ((InternalEList<?>)getGmlValues()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				return basicSetMeasurementValueQuality(null, msgs);
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				return basicSetMeasurementValueSource(null, msgs);
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				return basicSetRemoteSource(null, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return getGmlValues();
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				if (resolve) return getMeasurementValueQuality();
				return basicGetMeasurementValueQuality();
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				return getSensorAccuracy();
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				if (resolve) return getMeasurementValueSource();
				return basicGetMeasurementValueSource();
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				if (resolve) return getRemoteSource();
				return basicGetRemoteSource();
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				return getTimeStamp();
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				getGmlValues().clear();
				getGmlValues().addAll((Collection<? extends GmlValue>)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				setMeasurementValueQuality((MeasurementValueQuality)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				setSensorAccuracy((Float)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				setMeasurementValueSource((MeasurementValueSource)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				setRemoteSource((RemoteSource)newValue);
				return;
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				setTimeStamp((Date)newValue);
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				getGmlValues().clear();
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				setMeasurementValueQuality((MeasurementValueQuality)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				unsetSensorAccuracy();
				return;
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				setMeasurementValueSource((MeasurementValueSource)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				setRemoteSource((RemoteSource)null);
				return;
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				unsetTimeStamp();
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
			case MeasPackage.MEASUREMENT_VALUE__GML_VALUES:
				return gmlValues != null && !gmlValues.isEmpty();
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY:
				return measurementValueQuality != null;
			case MeasPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
				return isSetSensorAccuracy();
			case MeasPackage.MEASUREMENT_VALUE__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE:
				return measurementValueSource != null;
			case MeasPackage.MEASUREMENT_VALUE__ERP_PERSON:
				return erpPerson != null;
			case MeasPackage.MEASUREMENT_VALUE__REMOTE_SOURCE:
				return remoteSource != null;
			case MeasPackage.MEASUREMENT_VALUE__TIME_STAMP:
				return isSetTimeStamp();
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
		result.append(" (sensorAccuracy: ");
		if (sensorAccuracyESet) result.append(sensorAccuracy); else result.append("<unset>");
		result.append(", timeStamp: ");
		if (timeStampESet) result.append(timeStamp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MeasurementValue
