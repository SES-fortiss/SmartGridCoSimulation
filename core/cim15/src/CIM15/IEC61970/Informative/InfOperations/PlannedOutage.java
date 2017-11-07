/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.Customer;

import CIM15.IEC61970.Outage.OutageSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Outage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getCustomerDatas <em>Customer Datas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules <em>Outage Schedules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedOutage extends Document {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final OutageKind KIND_EDEFAULT = OutageKind.FIXED;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected OutageKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

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
	 * The cached value of the '{@link #getOutageSchedules() <em>Outage Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageSchedule> outageSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedOutage() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.PLANNED_OUTAGE;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfOperations.OutageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(OutageKind)
	 * @generated
	 */
	public OutageKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(OutageKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(OutageKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(OutageKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.Customer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getPlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Datas</em>' reference list.
	 * @see CIM15.IEC61968.Customers.Customer#getPlannedOutage
	 * @generated
	 */
	public EList<Customer> getCustomerDatas() {
		if (customerDatas == null) {
			customerDatas = new BasicInternalEList<Customer>(Customer.class);
		}
		return customerDatas;
	}

	/**
	 * Returns the value of the '<em><b>Outage Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Outage.OutageSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Outage.OutageSchedule#getPlannedOutage
	 * @generated
	 */
	public EList<OutageSchedule> getOutageSchedules() {
		if (outageSchedules == null) {
			outageSchedules = new BasicInternalEList<OutageSchedule>(OutageSchedule.class);
		}
		return outageSchedules;
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
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerDatas()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSchedules()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return ((InternalEList<?>)getCustomerDatas()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return ((InternalEList<?>)getOutageSchedules()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				return getKind();
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return getCustomerDatas();
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return getOutageSchedules();
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				setKind((OutageKind)newValue);
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				getCustomerDatas().addAll((Collection<? extends Customer>)newValue);
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				getOutageSchedules().clear();
				getOutageSchedules().addAll((Collection<? extends OutageSchedule>)newValue);
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				unsetKind();
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				getOutageSchedules().clear();
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				return isSetKind();
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return customerDatas != null && !customerDatas.isEmpty();
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return outageSchedules != null && !outageSchedules.isEmpty();
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PlannedOutage
