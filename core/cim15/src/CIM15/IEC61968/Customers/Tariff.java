/**
 */
package CIM15.IEC61968.Customers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.PaymentMetering.TariffProfile;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tariff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Tariff#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.Tariff#getTariffProfiles <em>Tariff Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tariff extends Document {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * This is true if the Start Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startDateESet;

	/**
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * This is true if the End Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endDateESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tariff() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.TARIFF;
	}

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #isSetStartDate()
	 * @see #unsetStartDate()
	 * @see #setStartDate(String)
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #isSetStartDate()
	 * @see #unsetStartDate()
	 * @see #getStartDate()
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		startDate = newStartDate;
		startDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartDate()
	 * @see #getStartDate()
	 * @see #setStartDate(String)
	 * @generated
	 */
	public void unsetStartDate() {
		startDate = START_DATE_EDEFAULT;
		startDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.Tariff#getStartDate <em>Start Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Date</em>' attribute is set.
	 * @see #unsetStartDate()
	 * @see #getStartDate()
	 * @see #setStartDate(String)
	 * @generated
	 */
	public boolean isSetStartDate() {
		return startDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.PricingStructure#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see CIM15.IEC61968.Customers.PricingStructure#getTariffs
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new BasicInternalEList<PricingStructure>(PricingStructure.class);
		}
		return pricingStructures;
	}

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #isSetEndDate()
	 * @see #unsetEndDate()
	 * @see #setEndDate(String)
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #isSetEndDate()
	 * @see #unsetEndDate()
	 * @see #getEndDate()
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		endDate = newEndDate;
		endDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndDate()
	 * @see #getEndDate()
	 * @see #setEndDate(String)
	 * @generated
	 */
	public void unsetEndDate() {
		endDate = END_DATE_EDEFAULT;
		endDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Customers.Tariff#getEndDate <em>End Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Date</em>' attribute is set.
	 * @see #unsetEndDate()
	 * @see #getEndDate()
	 * @see #setEndDate(String)
	 * @generated
	 */
	public boolean isSetEndDate() {
		return endDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Tariff Profiles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.TariffProfile}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tariff Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff Profiles</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffs
	 * @generated
	 */
	public EList<TariffProfile> getTariffProfiles() {
		if (tariffProfiles == null) {
			tariffProfiles = new BasicInternalEList<TariffProfile>(TariffProfile.class);
		}
		return tariffProfiles;
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
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTariffProfiles()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return ((InternalEList<?>)getTariffProfiles()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.TARIFF__START_DATE:
				return getStartDate();
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return getPricingStructures();
			case CustomersPackage.TARIFF__END_DATE:
				return getEndDate();
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return getTariffProfiles();
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
			case CustomersPackage.TARIFF__START_DATE:
				setStartDate((String)newValue);
				return;
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
				return;
			case CustomersPackage.TARIFF__END_DATE:
				setEndDate((String)newValue);
				return;
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				getTariffProfiles().clear();
				getTariffProfiles().addAll((Collection<? extends TariffProfile>)newValue);
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
			case CustomersPackage.TARIFF__START_DATE:
				unsetStartDate();
				return;
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				getPricingStructures().clear();
				return;
			case CustomersPackage.TARIFF__END_DATE:
				unsetEndDate();
				return;
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				getTariffProfiles().clear();
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
			case CustomersPackage.TARIFF__START_DATE:
				return isSetStartDate();
			case CustomersPackage.TARIFF__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
			case CustomersPackage.TARIFF__END_DATE:
				return isSetEndDate();
			case CustomersPackage.TARIFF__TARIFF_PROFILES:
				return tariffProfiles != null && !tariffProfiles.isEmpty();
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
		result.append(" (startDate: ");
		if (startDateESet) result.append(startDate); else result.append("<unset>");
		result.append(", endDate: ");
		if (endDateESet) result.append(endDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Tariff
