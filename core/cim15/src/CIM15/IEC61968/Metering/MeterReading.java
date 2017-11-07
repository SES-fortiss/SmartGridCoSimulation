/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Customers.CustomerAgreement;
import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getValuesInterval <em>Values Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getReadings <em>Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getMeter <em>Meter</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeterReading extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getServiceDeliveryPoint() <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint serviceDeliveryPoint;

	/**
	 * The cached value of the '{@link #getValuesInterval() <em>Values Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval valuesInterval;

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
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreement()
	 * @generated
	 * @ordered
	 */
	protected CustomerAgreement customerAgreement;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected Meter meter;

	/**
	 * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalBlock> intervalBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterReading() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.METER_READING;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Point</em>' reference.
	 * @see #setServiceDeliveryPoint(ServiceDeliveryPoint)
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings
	 * @generated
	 */
	public ServiceDeliveryPoint getServiceDeliveryPoint() {
		if (serviceDeliveryPoint != null && serviceDeliveryPoint.eIsProxy()) {
			InternalEObject oldServiceDeliveryPoint = (InternalEObject)serviceDeliveryPoint;
			serviceDeliveryPoint = (ServiceDeliveryPoint)eResolveProxy(oldServiceDeliveryPoint);
			if (serviceDeliveryPoint != oldServiceDeliveryPoint) {
			}
		}
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetServiceDeliveryPoint() {
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint, NotificationChain msgs) {
		ServiceDeliveryPoint oldServiceDeliveryPoint = serviceDeliveryPoint;
		serviceDeliveryPoint = newServiceDeliveryPoint;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Point</em>' reference.
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public void setServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint) {
		if (newServiceDeliveryPoint != serviceDeliveryPoint) {
			NotificationChain msgs = null;
			if (serviceDeliveryPoint != null)
				msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, ServiceDeliveryPoint.class, msgs);
			if (newServiceDeliveryPoint != null)
				msgs = ((InternalEObject)newServiceDeliveryPoint).eInverseAdd(this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, ServiceDeliveryPoint.class, msgs);
			msgs = basicSetServiceDeliveryPoint(newServiceDeliveryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Values Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Interval</em>' containment reference.
	 * @see #setValuesInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getValuesInterval() {
		return valuesInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuesInterval(DateTimeInterval newValuesInterval, NotificationChain msgs) {
		DateTimeInterval oldValuesInterval = valuesInterval;
		valuesInterval = newValuesInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.MeterReading#getValuesInterval <em>Values Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Interval</em>' containment reference.
	 * @see #getValuesInterval()
	 * @generated
	 */
	public void setValuesInterval(DateTimeInterval newValuesInterval) {
		if (newValuesInterval != valuesInterval) {
			NotificationChain msgs = null;
			if (valuesInterval != null)
				msgs = ((InternalEObject)valuesInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.METER_READING__VALUES_INTERVAL, null, msgs);
			if (newValuesInterval != null)
				msgs = ((InternalEObject)newValuesInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.METER_READING__VALUES_INTERVAL, null, msgs);
			msgs = basicSetValuesInterval(newValuesInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Device Events</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceEvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceEvent#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Events</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceEvent#getMeterReading
	 * @generated
	 */
	public EList<EndDeviceEvent> getEndDeviceEvents() {
		if (endDeviceEvents == null) {
			endDeviceEvents = new BasicInternalEList<EndDeviceEvent>(EndDeviceEvent.class);
		}
		return endDeviceEvents;
	}

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.Reading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Reading#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.Reading#getMeterReadings
	 * @generated
	 */
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new BasicInternalEList<Reading>(Reading.class);
		}
		return readings;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getMeterReadings
	 * @generated
	 */
	public CustomerAgreement getCustomerAgreement() {
		if (customerAgreement != null && customerAgreement.eIsProxy()) {
			InternalEObject oldCustomerAgreement = (InternalEObject)customerAgreement;
			customerAgreement = (CustomerAgreement)eResolveProxy(oldCustomerAgreement);
			if (customerAgreement != oldCustomerAgreement) {
			}
		}
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement basicGetCustomerAgreement() {
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAgreement(CustomerAgreement newCustomerAgreement, NotificationChain msgs) {
		CustomerAgreement oldCustomerAgreement = customerAgreement;
		customerAgreement = newCustomerAgreement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.MeterReading#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	public void setCustomerAgreement(CustomerAgreement newCustomerAgreement) {
		if (newCustomerAgreement != customerAgreement) {
			NotificationChain msgs = null;
			if (customerAgreement != null)
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Meter#getMeterReadings <em>Meter Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(Meter)
	 * @see CIM15.IEC61968.Metering.Meter#getMeterReadings
	 * @generated
	 */
	public Meter getMeter() {
		if (meter != null && meter.eIsProxy()) {
			InternalEObject oldMeter = (InternalEObject)meter;
			meter = (Meter)eResolveProxy(oldMeter);
			if (meter != oldMeter) {
			}
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter basicGetMeter() {
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeter(Meter newMeter, NotificationChain msgs) {
		Meter oldMeter = meter;
		meter = newMeter;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.MeterReading#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	public void setMeter(Meter newMeter) {
		if (newMeter != meter) {
			NotificationChain msgs = null;
			if (meter != null)
				msgs = ((InternalEObject)meter).eInverseRemove(this, MeteringPackage.METER__METER_READINGS, Meter.class, msgs);
			if (newMeter != null)
				msgs = ((InternalEObject)newMeter).eInverseAdd(this, MeteringPackage.METER__METER_READINGS, Meter.class, msgs);
			msgs = basicSetMeter(newMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getMeterReading
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new BasicInternalEList<IntervalBlock>(IntervalBlock.class);
		}
		return intervalBlocks;
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
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				if (serviceDeliveryPoint != null)
					msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS, ServiceDeliveryPoint.class, msgs);
				return basicSetServiceDeliveryPoint((ServiceDeliveryPoint)otherEnd, msgs);
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceEvents()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_READING__READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case MeteringPackage.METER_READING__METER:
				if (meter != null)
					msgs = ((InternalEObject)meter).eInverseRemove(this, MeteringPackage.METER__METER_READINGS, Meter.class, msgs);
				return basicSetMeter((Meter)otherEnd, msgs);
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalBlocks()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				return basicSetServiceDeliveryPoint(null, msgs);
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				return basicSetValuesInterval(null, msgs);
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return ((InternalEList<?>)getEndDeviceEvents()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_READING__READINGS:
				return ((InternalEList<?>)getReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case MeteringPackage.METER_READING__METER:
				return basicSetMeter(null, msgs);
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return ((InternalEList<?>)getIntervalBlocks()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				return getValuesInterval();
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return getEndDeviceEvents();
			case MeteringPackage.METER_READING__READINGS:
				return getReadings();
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case MeteringPackage.METER_READING__METER:
				if (resolve) return getMeter();
				return basicGetMeter();
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return getIntervalBlocks();
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
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
				return;
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				setValuesInterval((DateTimeInterval)newValue);
				return;
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				getEndDeviceEvents().addAll((Collection<? extends EndDeviceEvent>)newValue);
				return;
			case MeteringPackage.METER_READING__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends Reading>)newValue);
				return;
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case MeteringPackage.METER_READING__METER:
				setMeter((Meter)newValue);
				return;
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
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
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
				return;
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				setValuesInterval((DateTimeInterval)null);
				return;
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				return;
			case MeteringPackage.METER_READING__READINGS:
				getReadings().clear();
				return;
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case MeteringPackage.METER_READING__METER:
				setMeter((Meter)null);
				return;
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
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
			case MeteringPackage.METER_READING__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
			case MeteringPackage.METER_READING__VALUES_INTERVAL:
				return valuesInterval != null;
			case MeteringPackage.METER_READING__END_DEVICE_EVENTS:
				return endDeviceEvents != null && !endDeviceEvents.isEmpty();
			case MeteringPackage.METER_READING__READINGS:
				return readings != null && !readings.isEmpty();
			case MeteringPackage.METER_READING__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case MeteringPackage.METER_READING__METER:
				return meter != null;
			case MeteringPackage.METER_READING__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MeterReading
