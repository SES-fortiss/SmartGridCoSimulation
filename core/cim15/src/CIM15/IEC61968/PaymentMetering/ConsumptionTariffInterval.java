/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.Element;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumption Tariff Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges <em>Charges</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTouTariffIntervals <em>Tou Tariff Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsumptionTariffInterval extends Element {
	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final float START_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected float startValue = START_VALUE_EDEFAULT;

	/**
	 * This is true if the Start Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startValueESet;

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
	 * The cached value of the '{@link #getTouTariffIntervals() <em>Tou Tariff Intervals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouTariffIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeTariffInterval> touTariffIntervals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumptionTariffInterval() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CONSUMPTION_TARIFF_INTERVAL;
	}

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' attribute.
	 * @see #isSetStartValue()
	 * @see #unsetStartValue()
	 * @see #setStartValue(float)
	 * @generated
	 */
	public float getStartValue() {
		return startValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #isSetStartValue()
	 * @see #unsetStartValue()
	 * @see #getStartValue()
	 * @generated
	 */
	public void setStartValue(float newStartValue) {
		startValue = newStartValue;
		startValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartValue()
	 * @see #getStartValue()
	 * @see #setStartValue(float)
	 * @generated
	 */
	public void unsetStartValue() {
		startValue = START_VALUE_EDEFAULT;
		startValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Value</em>' attribute is set.
	 * @see #unsetStartValue()
	 * @see #getStartValue()
	 * @see #setStartValue(float)
	 * @generated
	 */
	public boolean isSetStartValue() {
		return startValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals
	 * @generated
	 */
	public EList<Charge> getCharges() {
		if (charges == null) {
			charges = new BasicInternalEList<Charge>(Charge.class);
		}
		return charges;
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
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
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
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Profiles</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals
	 * @generated
	 */
	public EList<TariffProfile> getTariffProfiles() {
		if (tariffProfiles == null) {
			tariffProfiles = new BasicInternalEList<TariffProfile>(TariffProfile.class);
		}
		return tariffProfiles;
	}

	/**
	 * Returns the value of the '<em><b>Tou Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tou Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tou Tariff Intervals</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getConsumptionTariffIntervals
	 * @generated
	 */
	public EList<TimeTariffInterval> getTouTariffIntervals() {
		if (touTariffIntervals == null) {
			touTariffIntervals = new BasicInternalEList<TimeTariffInterval>(TimeTariffInterval.class);
		}
		return touTariffIntervals;
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
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharges()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffProfiles()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTouTariffIntervals()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
				return ((InternalEList<?>)getCharges()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
				return ((InternalEList<?>)getTariffProfiles()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
				return ((InternalEList<?>)getTouTariffIntervals()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
				return getStartValue();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
				return getCharges();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
				return getTariffProfiles();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
				return getTouTariffIntervals();
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
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
				setStartValue((Float)newValue);
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
				getCharges().clear();
				getCharges().addAll((Collection<? extends Charge>)newValue);
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
				getTariffProfiles().clear();
				getTariffProfiles().addAll((Collection<? extends TariffProfile>)newValue);
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
				getTouTariffIntervals().clear();
				getTouTariffIntervals().addAll((Collection<? extends TimeTariffInterval>)newValue);
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
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
				unsetStartValue();
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
				getCharges().clear();
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
				getTariffProfiles().clear();
				return;
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
				getTouTariffIntervals().clear();
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
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
				return isSetStartValue();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__CHARGES:
				return charges != null && !charges.isEmpty();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES:
				return tariffProfiles != null && !tariffProfiles.isEmpty();
			case PaymentMeteringPackage.CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS:
				return touTariffIntervals != null && !touTariffIntervals.isEmpty();
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
		result.append(" (startValue: ");
		if (startValueESet) result.append(startValue); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ConsumptionTariffInterval
