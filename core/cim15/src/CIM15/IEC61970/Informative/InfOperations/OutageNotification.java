/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.Customer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getCustomerDatas <em>Customer Datas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageNotification extends Document {
	/**
	 * The default value of the '{@link #getExpectedInterruptionCount() <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedInterruptionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPECTED_INTERRUPTION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpectedInterruptionCount() <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedInterruptionCount()
	 * @generated
	 * @ordered
	 */
	protected int expectedInterruptionCount = EXPECTED_INTERRUPTION_COUNT_EDEFAULT;

	/**
	 * This is true if the Expected Interruption Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expectedInterruptionCountESet;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * This is true if the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationESet;

	/**
	 * The cached value of the '{@link #getCustomerDatas() <em>Customer Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customerDatas;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * This is true if the Reason attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageNotification() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_NOTIFICATION;
	}

	/**
	 * Returns the value of the '<em><b>Expected Interruption Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Interruption Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Interruption Count</em>' attribute.
	 * @see #isSetExpectedInterruptionCount()
	 * @see #unsetExpectedInterruptionCount()
	 * @see #setExpectedInterruptionCount(int)
	 * @generated
	 */
	public int getExpectedInterruptionCount() {
		return expectedInterruptionCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Interruption Count</em>' attribute.
	 * @see #isSetExpectedInterruptionCount()
	 * @see #unsetExpectedInterruptionCount()
	 * @see #getExpectedInterruptionCount()
	 * @generated
	 */
	public void setExpectedInterruptionCount(int newExpectedInterruptionCount) {
		expectedInterruptionCount = newExpectedInterruptionCount;
		expectedInterruptionCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpectedInterruptionCount()
	 * @see #getExpectedInterruptionCount()
	 * @see #setExpectedInterruptionCount(int)
	 * @generated
	 */
	public void unsetExpectedInterruptionCount() {
		expectedInterruptionCount = EXPECTED_INTERRUPTION_COUNT_EDEFAULT;
		expectedInterruptionCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getExpectedInterruptionCount <em>Expected Interruption Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expected Interruption Count</em>' attribute is set.
	 * @see #unsetExpectedInterruptionCount()
	 * @see #getExpectedInterruptionCount()
	 * @see #setExpectedInterruptionCount(int)
	 * @generated
	 */
	public boolean isSetExpectedInterruptionCount() {
		return expectedInterruptionCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	public void setDuration(float newDuration) {
		duration = newDuration;
		durationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	public void unsetDuration() {
		duration = DURATION_EDEFAULT;
		durationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	public boolean isSetDuration() {
		return durationESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.Customer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getOutageNotifications <em>Outage Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Datas</em>' reference list.
	 * @see CIM15.IEC61968.Customers.Customer#getOutageNotifications
	 * @generated
	 */
	public EList<Customer> getCustomerDatas() {
		if (customerDatas == null) {
			customerDatas = new BasicInternalEList<Customer>(Customer.class);
		}
		return customerDatas;
	}

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	public void setReason(String newReason) {
		reason = newReason;
		reasonESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public void unsetReason() {
		reason = REASON_EDEFAULT;
		reasonESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageNotification#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public boolean isSetReason() {
		return reasonESet;
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerDatas()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return ((InternalEList<?>)getCustomerDatas()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				return getExpectedInterruptionCount();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				return getDuration();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return getCustomerDatas();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				return getReason();
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				setExpectedInterruptionCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				setDuration((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				getCustomerDatas().addAll((Collection<? extends Customer>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				setReason((String)newValue);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				unsetExpectedInterruptionCount();
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				unsetDuration();
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				unsetReason();
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				return isSetExpectedInterruptionCount();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				return isSetDuration();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return customerDatas != null && !customerDatas.isEmpty();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				return isSetReason();
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
		result.append(" (expectedInterruptionCount: ");
		if (expectedInterruptionCountESet) result.append(expectedInterruptionCount); else result.append("<unset>");
		result.append(", duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", reason: ");
		if (reasonESet) result.append(reason); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OutageNotification
