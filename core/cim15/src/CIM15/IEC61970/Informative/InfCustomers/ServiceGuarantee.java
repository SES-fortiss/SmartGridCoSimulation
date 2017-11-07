/**
 */
package CIM15.IEC61970.Informative.InfCustomers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Domain.DateTimeInterval;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Guarantee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getApplicationPeriod <em>Application Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceGuarantee extends Document {
	/**
	 * The default value of the '{@link #isAutomaticPay() <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticPay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_PAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutomaticPay() <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticPay()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticPay = AUTOMATIC_PAY_EDEFAULT;

	/**
	 * This is true if the Automatic Pay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticPayESet;

	/**
	 * The default value of the '{@link #getPayAmount() <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PAY_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPayAmount() <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayAmount()
	 * @generated
	 * @ordered
	 */
	protected float payAmount = PAY_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Pay Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean payAmountESet;

	/**
	 * The default value of the '{@link #getServiceRequirement() <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_REQUIREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceRequirement() <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequirement()
	 * @generated
	 * @ordered
	 */
	protected String serviceRequirement = SERVICE_REQUIREMENT_EDEFAULT;

	/**
	 * This is true if the Service Requirement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceRequirementESet;

	/**
	 * The cached value of the '{@link #getApplicationPeriod() <em>Application Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval applicationPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceGuarantee() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.SERVICE_GUARANTEE;
	}

	/**
	 * Returns the value of the '<em><b>Automatic Pay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Pay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Pay</em>' attribute.
	 * @see #isSetAutomaticPay()
	 * @see #unsetAutomaticPay()
	 * @see #setAutomaticPay(boolean)
	 * @generated
	 */
	public boolean isAutomaticPay() {
		return automaticPay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Pay</em>' attribute.
	 * @see #isSetAutomaticPay()
	 * @see #unsetAutomaticPay()
	 * @see #isAutomaticPay()
	 * @generated
	 */
	public void setAutomaticPay(boolean newAutomaticPay) {
		automaticPay = newAutomaticPay;
		automaticPayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticPay()
	 * @see #isAutomaticPay()
	 * @see #setAutomaticPay(boolean)
	 * @generated
	 */
	public void unsetAutomaticPay() {
		automaticPay = AUTOMATIC_PAY_EDEFAULT;
		automaticPayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#isAutomaticPay <em>Automatic Pay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Pay</em>' attribute is set.
	 * @see #unsetAutomaticPay()
	 * @see #isAutomaticPay()
	 * @see #setAutomaticPay(boolean)
	 * @generated
	 */
	public boolean isSetAutomaticPay() {
		return automaticPayESet;
	}

	/**
	 * Returns the value of the '<em><b>Pay Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay Amount</em>' attribute.
	 * @see #isSetPayAmount()
	 * @see #unsetPayAmount()
	 * @see #setPayAmount(float)
	 * @generated
	 */
	public float getPayAmount() {
		return payAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay Amount</em>' attribute.
	 * @see #isSetPayAmount()
	 * @see #unsetPayAmount()
	 * @see #getPayAmount()
	 * @generated
	 */
	public void setPayAmount(float newPayAmount) {
		payAmount = newPayAmount;
		payAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPayAmount()
	 * @see #getPayAmount()
	 * @see #setPayAmount(float)
	 * @generated
	 */
	public void unsetPayAmount() {
		payAmount = PAY_AMOUNT_EDEFAULT;
		payAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getPayAmount <em>Pay Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pay Amount</em>' attribute is set.
	 * @see #unsetPayAmount()
	 * @see #getPayAmount()
	 * @see #setPayAmount(float)
	 * @generated
	 */
	public boolean isSetPayAmount() {
		return payAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Requirement</em>' attribute.
	 * @see #isSetServiceRequirement()
	 * @see #unsetServiceRequirement()
	 * @see #setServiceRequirement(String)
	 * @generated
	 */
	public String getServiceRequirement() {
		return serviceRequirement;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Requirement</em>' attribute.
	 * @see #isSetServiceRequirement()
	 * @see #unsetServiceRequirement()
	 * @see #getServiceRequirement()
	 * @generated
	 */
	public void setServiceRequirement(String newServiceRequirement) {
		serviceRequirement = newServiceRequirement;
		serviceRequirementESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceRequirement()
	 * @see #getServiceRequirement()
	 * @see #setServiceRequirement(String)
	 * @generated
	 */
	public void unsetServiceRequirement() {
		serviceRequirement = SERVICE_REQUIREMENT_EDEFAULT;
		serviceRequirementESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getServiceRequirement <em>Service Requirement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Requirement</em>' attribute is set.
	 * @see #unsetServiceRequirement()
	 * @see #getServiceRequirement()
	 * @see #setServiceRequirement(String)
	 * @generated
	 */
	public boolean isSetServiceRequirement() {
		return serviceRequirementESet;
	}

	/**
	 * Returns the value of the '<em><b>Application Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Period</em>' containment reference.
	 * @see #setApplicationPeriod(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getApplicationPeriod() {
		return applicationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationPeriod(DateTimeInterval newApplicationPeriod, NotificationChain msgs) {
		DateTimeInterval oldApplicationPeriod = applicationPeriod;
		applicationPeriod = newApplicationPeriod;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.ServiceGuarantee#getApplicationPeriod <em>Application Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Period</em>' containment reference.
	 * @see #getApplicationPeriod()
	 * @generated
	 */
	public void setApplicationPeriod(DateTimeInterval newApplicationPeriod) {
		if (newApplicationPeriod != applicationPeriod) {
			NotificationChain msgs = null;
			if (applicationPeriod != null)
				msgs = ((InternalEObject)applicationPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD, null, msgs);
			if (newApplicationPeriod != null)
				msgs = ((InternalEObject)newApplicationPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD, null, msgs);
			msgs = basicSetApplicationPeriod(newApplicationPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				return basicSetApplicationPeriod(null, msgs);
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
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				return isAutomaticPay();
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				return getPayAmount();
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				return getServiceRequirement();
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				return getApplicationPeriod();
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
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				setAutomaticPay((Boolean)newValue);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				setPayAmount((Float)newValue);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				setServiceRequirement((String)newValue);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				setApplicationPeriod((DateTimeInterval)newValue);
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
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				unsetAutomaticPay();
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				unsetPayAmount();
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				unsetServiceRequirement();
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				setApplicationPeriod((DateTimeInterval)null);
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
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				return isSetAutomaticPay();
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				return isSetPayAmount();
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				return isSetServiceRequirement();
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				return applicationPeriod != null;
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
		result.append(" (automaticPay: ");
		if (automaticPayESet) result.append(automaticPay); else result.append("<unset>");
		result.append(", payAmount: ");
		if (payAmountESet) result.append(payAmount); else result.append("<unset>");
		result.append(", serviceRequirement: ");
		if (serviceRequirementESet) result.append(serviceRequirement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ServiceGuarantee
