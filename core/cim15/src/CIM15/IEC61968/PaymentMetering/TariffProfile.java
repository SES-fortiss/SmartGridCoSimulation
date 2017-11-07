/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.Tariff;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tariff Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TariffProfile extends Document {
	/**
	 * The cached value of the '{@link #getTariffs() <em>Tariffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tariff> tariffs;

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
	 * The default value of the '{@link #getTariffCycle() <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String TARIFF_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTariffCycle() <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariffCycle()
	 * @generated
	 * @ordered
	 */
	protected String tariffCycle = TARIFF_CYCLE_EDEFAULT;

	/**
	 * This is true if the Tariff Cycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tariffCycleESet;

	/**
	 * The cached value of the '{@link #getTimeTariffIntervals() <em>Time Tariff Intervals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTariffIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeTariffInterval> timeTariffIntervals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TariffProfile() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.TARIFF_PROFILE;
	}

	/**
	 * Returns the value of the '<em><b>Tariffs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.Tariff}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Tariff#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariffs</em>' reference list.
	 * @see CIM15.IEC61968.Customers.Tariff#getTariffProfiles
	 * @generated
	 */
	public EList<Tariff> getTariffs() {
		if (tariffs == null) {
			tariffs = new BasicInternalEList<Tariff>(Tariff.class);
		}
		return tariffs;
	}

	/**
	 * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles
	 * @generated
	 */
	public EList<ConsumptionTariffInterval> getConsumptionTariffIntervals() {
		if (consumptionTariffIntervals == null) {
			consumptionTariffIntervals = new BasicInternalEList<ConsumptionTariffInterval>(ConsumptionTariffInterval.class);
		}
		return consumptionTariffIntervals;
	}

	/**
	 * Returns the value of the '<em><b>Tariff Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Cycle</em>' attribute.
	 * @see #isSetTariffCycle()
	 * @see #unsetTariffCycle()
	 * @see #setTariffCycle(String)
	 * @generated
	 */
	public String getTariffCycle() {
		return tariffCycle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff Cycle</em>' attribute.
	 * @see #isSetTariffCycle()
	 * @see #unsetTariffCycle()
	 * @see #getTariffCycle()
	 * @generated
	 */
	public void setTariffCycle(String newTariffCycle) {
		tariffCycle = newTariffCycle;
		tariffCycleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTariffCycle()
	 * @see #getTariffCycle()
	 * @see #setTariffCycle(String)
	 * @generated
	 */
	public void unsetTariffCycle() {
		tariffCycle = TARIFF_CYCLE_EDEFAULT;
		tariffCycleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tariff Cycle</em>' attribute is set.
	 * @see #unsetTariffCycle()
	 * @see #getTariffCycle()
	 * @see #setTariffCycle(String)
	 * @generated
	 */
	public boolean isSetTariffCycle() {
		return tariffCycleESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tariff Intervals</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles
	 * @generated
	 */
	public EList<TimeTariffInterval> getTimeTariffIntervals() {
		if (timeTariffIntervals == null) {
			timeTariffIntervals = new BasicInternalEList<TimeTariffInterval>(TimeTariffInterval.class);
		}
		return timeTariffIntervals;
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffs()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumptionTariffIntervals()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeTariffIntervals()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return ((InternalEList<?>)getTariffs()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<?>)getConsumptionTariffIntervals()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<?>)getTimeTariffIntervals()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return getTariffs();
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return getConsumptionTariffIntervals();
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				return getTariffCycle();
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return getTimeTariffIntervals();
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				getTariffs().clear();
				getTariffs().addAll((Collection<? extends Tariff>)newValue);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				getConsumptionTariffIntervals().addAll((Collection<? extends ConsumptionTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				setTariffCycle((String)newValue);
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				getTimeTariffIntervals().addAll((Collection<? extends TimeTariffInterval>)newValue);
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				getTariffs().clear();
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				unsetTariffCycle();
				return;
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
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
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFFS:
				return tariffs != null && !tariffs.isEmpty();
			case PaymentMeteringPackage.TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS:
				return consumptionTariffIntervals != null && !consumptionTariffIntervals.isEmpty();
			case PaymentMeteringPackage.TARIFF_PROFILE__TARIFF_CYCLE:
				return isSetTariffCycle();
			case PaymentMeteringPackage.TARIFF_PROFILE__TIME_TARIFF_INTERVALS:
				return timeTariffIntervals != null && !timeTariffIntervals.isEmpty();
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
		result.append(" (tariffCycle: ");
		if (tariffCycleESet) result.append(tariffCycle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TariffProfile
