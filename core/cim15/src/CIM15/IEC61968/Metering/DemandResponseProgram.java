/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Customers.CustomerAgreement;

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
 * A representation of the model object '<em><b>Demand Response Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.DemandResponseProgram#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.DemandResponseProgram#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups <em>End Device Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DemandResponseProgram extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceGroup> endDeviceGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemandResponseProgram() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.DEMAND_RESPONSE_PROGRAM;
	}

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new BasicInternalEList<EndDeviceControl>(EndDeviceControl.class);
		}
		return endDeviceControls;
	}

	/**
	 * Returns the value of the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Interval</em>' containment reference.
	 * @see #setValidityInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getValidityInterval() {
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityInterval(DateTimeInterval newValidityInterval, NotificationChain msgs) {
		DateTimeInterval oldValidityInterval = validityInterval;
		validityInterval = newValidityInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getValidityInterval <em>Validity Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Interval</em>' containment reference.
	 * @see #getValidityInterval()
	 * @generated
	 */
	public void setValidityInterval(DateTimeInterval newValidityInterval) {
		if (newValidityInterval != validityInterval) {
			NotificationChain msgs = null;
			if (validityInterval != null)
				msgs = ((InternalEObject)validityInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, null, msgs);
			if (newValidityInterval != null)
				msgs = ((InternalEObject)newValidityInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, null, msgs);
			msgs = basicSetValidityInterval(newValidityInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getDemandResponseProgram
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
	}

	/**
	 * Returns the value of the '<em><b>End Device Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Groups</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram
	 * @generated
	 */
	public EList<EndDeviceGroup> getEndDeviceGroups() {
		if (endDeviceGroups == null) {
			endDeviceGroups = new BasicInternalEList<EndDeviceGroup>(EndDeviceGroup.class);
		}
		return endDeviceGroups;
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceGroups()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				return basicSetValidityInterval(null, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return ((InternalEList<?>)getEndDeviceGroups()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				return getValidityInterval();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				return getType();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return getEndDeviceGroups();
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				setType((String)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
				getEndDeviceGroups().addAll((Collection<? extends EndDeviceGroup>)newValue);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				unsetType();
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				return validityInterval != null;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				return isSetType();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return endDeviceGroups != null && !endDeviceGroups.isEmpty();
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DemandResponseProgram
