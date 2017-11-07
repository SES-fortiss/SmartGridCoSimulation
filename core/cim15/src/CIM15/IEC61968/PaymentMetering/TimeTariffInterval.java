/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.Element;

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
 * A representation of the model object '<em><b>Time Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getCharges <em>Charges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeTariffInterval extends Element {
	/**
	 * The cached value of the '{@link #getConsumptionTariffIntervals() <em>Consumption Tariff Intervals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumptionTariffIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsumptionTariffInterval> consumptionTariffIntervals;

	/**
	 * The default value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDateTime() <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date startDateTime = START_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Start Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startDateTimeESet;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

	/**
	 * The cached value of the '{@link #getTariffProfiles() <em>Tariff Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<TariffProfile> tariffProfiles;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> charges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeTariffInterval() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TIME_TARIFF_INTERVAL;
	}

	/**
	 * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTouTariffIntervals <em>Tou Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTouTariffIntervals
	 * @generated
	 */
	public EList<ConsumptionTariffInterval> getConsumptionTariffIntervals() {
		if (consumptionTariffIntervals == null) {
			consumptionTariffIntervals = new BasicInternalEList<ConsumptionTariffInterval>(ConsumptionTariffInterval.class);
		}
		return consumptionTariffIntervals;
	}

	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Time</em>' attribute.
	 * @see #isSetStartDateTime()
	 * @see #unsetStartDateTime()
	 * @see #setStartDateTime(Date)
	 * @generated
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' attribute.
	 * @see #isSetStartDateTime()
	 * @see #unsetStartDateTime()
	 * @see #getStartDateTime()
	 * @generated
	 */
	public void setStartDateTime(Date newStartDateTime) {
		startDateTime = newStartDateTime;
		startDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartDateTime()
	 * @see #getStartDateTime()
	 * @see #setStartDateTime(Date)
	 * @generated
	 */
	public void unsetStartDateTime() {
		startDateTime = START_DATE_TIME_EDEFAULT;
		startDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Date Time</em>' attribute is set.
	 * @see #unsetStartDateTime()
	 * @see #getStartDateTime()
	 * @see #setStartDateTime(Date)
	 * @generated
	 */
	public boolean isSetStartDateTime() {
		return startDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Tariff Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.TariffProfile}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Profiles</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals
	 * @generated
	 */
	public EList<TariffProfile> getTariffProfiles() {
		if (tariffProfiles == null) {
			tariffProfiles = new BasicInternalEList<TariffProfile>(TariffProfile.class);
		}
		return tariffProfiles;
	}

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals
	 * @generated
	 */
	public EList<Charge> getCharges() {
		if (charges == null) {
			charges = new BasicInternalEList<Charge>(Charge.class);
		}
		return charges;
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumptionTariffIntervals()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffProfiles()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharges()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<?>)getConsumptionTariffIntervals()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return ((InternalEList<?>)getTariffProfiles()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return ((InternalEList<?>)getCharges()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
				return getConsumptionTariffIntervals();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				return getStartDateTime();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return getTariffProfiles();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return getCharges();
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				getConsumptionTariffIntervals().addAll((Collection<? extends ConsumptionTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				setStartDateTime((Date)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				getTariffProfiles().clear();
				getTariffProfiles().addAll((Collection<? extends TariffProfile>)newValue);
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				getCharges().clear();
				getCharges().addAll((Collection<? extends Charge>)newValue);
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				unsetStartDateTime();
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				getTariffProfiles().clear();
				return;
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				getCharges().clear();
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
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS:
				return consumptionTariffIntervals != null && !consumptionTariffIntervals.isEmpty();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__START_DATE_TIME:
				return isSetStartDateTime();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__TARIFF_PROFILES:
				return tariffProfiles != null && !tariffProfiles.isEmpty();
			case PaymentMeteringPackage.TIME_TARIFF_INTERVAL__CHARGES:
				return charges != null && !charges.isEmpty();
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
		result.append(" (startDateTime: ");
		if (startDateTimeESet) result.append(startDateTime); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TimeTariffInterval
