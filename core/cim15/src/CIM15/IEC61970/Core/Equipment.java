/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61968.Customers.CustomerAgreement;

import CIM15.IEC61970.Contingency.ContingencyEquipment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Equipment#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Equipment#isNormallyInService <em>Normally In Service</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Equipment extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getContingencyEquipment() <em>Contingency Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingencyEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<ContingencyEquipment> contingencyEquipment;

	/**
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * The default value of the '{@link #isNormallyInService() <em>Normally In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormallyInService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMALLY_IN_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormallyInService() <em>Normally In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormallyInService()
	 * @generated
	 * @ordered
	 */
	protected boolean normallyInService = NORMALLY_IN_SERVICE_EDEFAULT;

	/**
	 * This is true if the Normally In Service attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normallyInServiceESet;

	/**
	 * The default value of the '{@link #isAggregate() <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGGREGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAggregate() <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregate()
	 * @generated
	 * @ordered
	 */
	protected boolean aggregate = AGGREGATE_EDEFAULT;

	/**
	 * This is true if the Aggregate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregateESet;

	/**
	 * The cached value of the '{@link #getEquipmentContainer() <em>Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentContainer()
	 * @generated
	 * @ordered
	 */
	protected EquipmentContainer equipmentContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Equipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EQUIPMENT;
	}

	/**
	 * Returns the value of the '<em><b>Contingency Equipment</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Contingency.ContingencyEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Contingency.ContingencyEquipment#getEquipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency Equipment</em>' reference list.
	 * @see CIM15.IEC61970.Contingency.ContingencyEquipment#getEquipment
	 * @generated
	 */
	public EList<ContingencyEquipment> getContingencyEquipment() {
		if (contingencyEquipment == null) {
			contingencyEquipment = new BasicInternalEList<ContingencyEquipment>(ContingencyEquipment.class);
		}
		return contingencyEquipment;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getEquipments
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
	}

	/**
	 * Returns the value of the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normally In Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normally In Service</em>' attribute.
	 * @see #isSetNormallyInService()
	 * @see #unsetNormallyInService()
	 * @see #setNormallyInService(boolean)
	 * @generated
	 */
	public boolean isNormallyInService() {
		return normallyInService;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Equipment#isNormallyInService <em>Normally In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normally In Service</em>' attribute.
	 * @see #isSetNormallyInService()
	 * @see #unsetNormallyInService()
	 * @see #isNormallyInService()
	 * @generated
	 */
	public void setNormallyInService(boolean newNormallyInService) {
		normallyInService = newNormallyInService;
		normallyInServiceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Equipment#isNormallyInService <em>Normally In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormallyInService()
	 * @see #isNormallyInService()
	 * @see #setNormallyInService(boolean)
	 * @generated
	 */
	public void unsetNormallyInService() {
		normallyInService = NORMALLY_IN_SERVICE_EDEFAULT;
		normallyInServiceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Equipment#isNormallyInService <em>Normally In Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normally In Service</em>' attribute is set.
	 * @see #unsetNormallyInService()
	 * @see #isNormallyInService()
	 * @see #setNormallyInService(boolean)
	 * @generated
	 */
	public boolean isSetNormallyInService() {
		return normallyInServiceESet;
	}

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' attribute.
	 * @see #isSetAggregate()
	 * @see #unsetAggregate()
	 * @see #setAggregate(boolean)
	 * @generated
	 */
	public boolean isAggregate() {
		return aggregate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' attribute.
	 * @see #isSetAggregate()
	 * @see #unsetAggregate()
	 * @see #isAggregate()
	 * @generated
	 */
	public void setAggregate(boolean newAggregate) {
		aggregate = newAggregate;
		aggregateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregate()
	 * @see #isAggregate()
	 * @see #setAggregate(boolean)
	 * @generated
	 */
	public void unsetAggregate() {
		aggregate = AGGREGATE_EDEFAULT;
		aggregateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Equipment#isAggregate <em>Aggregate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregate</em>' attribute is set.
	 * @see #unsetAggregate()
	 * @see #isAggregate()
	 * @see #setAggregate(boolean)
	 * @generated
	 */
	public boolean isSetAggregate() {
		return aggregateESet;
	}

	/**
	 * Returns the value of the '<em><b>Equipment Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.EquipmentContainer#getEquipments <em>Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Container</em>' reference.
	 * @see #setEquipmentContainer(EquipmentContainer)
	 * @see CIM15.IEC61970.Core.EquipmentContainer#getEquipments
	 * @generated
	 */
	public EquipmentContainer getEquipmentContainer() {
		if (equipmentContainer != null && equipmentContainer.eIsProxy()) {
			InternalEObject oldEquipmentContainer = (InternalEObject)equipmentContainer;
			equipmentContainer = (EquipmentContainer)eResolveProxy(oldEquipmentContainer);
			if (equipmentContainer != oldEquipmentContainer) {
			}
		}
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer basicGetEquipmentContainer() {
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipmentContainer(EquipmentContainer newEquipmentContainer, NotificationChain msgs) {
		EquipmentContainer oldEquipmentContainer = equipmentContainer;
		equipmentContainer = newEquipmentContainer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment Container</em>' reference.
	 * @see #getEquipmentContainer()
	 * @generated
	 */
	public void setEquipmentContainer(EquipmentContainer newEquipmentContainer) {
		if (newEquipmentContainer != equipmentContainer) {
			NotificationChain msgs = null;
			if (equipmentContainer != null)
				msgs = ((InternalEObject)equipmentContainer).eInverseRemove(this, CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs);
			if (newEquipmentContainer != null)
				msgs = ((InternalEObject)newEquipmentContainer).eInverseAdd(this, CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs);
			msgs = basicSetEquipmentContainer(newEquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContingencyEquipment()).basicAdd(otherEnd, msgs);
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				if (equipmentContainer != null)
					msgs = ((InternalEObject)equipmentContainer).eInverseRemove(this, CorePackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs);
				return basicSetEquipmentContainer((EquipmentContainer)otherEnd, msgs);
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
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return ((InternalEList<?>)getContingencyEquipment()).basicRemove(otherEnd, msgs);
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				return basicSetEquipmentContainer(null, msgs);
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
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return getContingencyEquipment();
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE:
				return isNormallyInService();
			case CorePackage.EQUIPMENT__AGGREGATE:
				return isAggregate();
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				if (resolve) return getEquipmentContainer();
				return basicGetEquipmentContainer();
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
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				getContingencyEquipment().clear();
				getContingencyEquipment().addAll((Collection<? extends ContingencyEquipment>)newValue);
				return;
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE:
				setNormallyInService((Boolean)newValue);
				return;
			case CorePackage.EQUIPMENT__AGGREGATE:
				setAggregate((Boolean)newValue);
				return;
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)newValue);
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
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				getContingencyEquipment().clear();
				return;
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE:
				unsetNormallyInService();
				return;
			case CorePackage.EQUIPMENT__AGGREGATE:
				unsetAggregate();
				return;
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)null);
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
			case CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
				return contingencyEquipment != null && !contingencyEquipment.isEmpty();
			case CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE:
				return isSetNormallyInService();
			case CorePackage.EQUIPMENT__AGGREGATE:
				return isSetAggregate();
			case CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER:
				return equipmentContainer != null;
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
		result.append(" (normallyInService: ");
		if (normallyInServiceESet) result.append(normallyInService); else result.append("<unset>");
		result.append(", aggregate: ");
		if (aggregateESet) result.append(aggregate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Equipment
