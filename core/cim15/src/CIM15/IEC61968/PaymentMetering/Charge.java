/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getChildCharges <em>Child Charges</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getFixedPortion <em>Fixed Portion</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Charge extends IdentifiedObject {
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
	 * The default value of the '{@link #getVariablePortion() <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablePortion()
	 * @generated
	 * @ordered
	 */
	protected static final float VARIABLE_PORTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVariablePortion() <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablePortion()
	 * @generated
	 * @ordered
	 */
	protected float variablePortion = VARIABLE_PORTION_EDEFAULT;

	/**
	 * This is true if the Variable Portion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean variablePortionESet;

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
	 * The cached value of the '{@link #getAuxiliaryAccounts() <em>Auxiliary Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryAccount> auxiliaryAccounts;

	/**
	 * The cached value of the '{@link #getChildCharges() <em>Child Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> childCharges;

	/**
	 * The cached value of the '{@link #getFixedPortion() <em>Fixed Portion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPortion()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit fixedPortion;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChargeKind KIND_EDEFAULT = ChargeKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ChargeKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getParentCharge() <em>Parent Charge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCharge()
	 * @generated
	 * @ordered
	 */
	protected Charge parentCharge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Charge() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CHARGE;
	}

	/**
	 * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges
	 * @generated
	 */
	public EList<ConsumptionTariffInterval> getConsumptionTariffIntervals() {
		if (consumptionTariffIntervals == null) {
			consumptionTariffIntervals = new BasicInternalEList<ConsumptionTariffInterval>(ConsumptionTariffInterval.class);
		}
		return consumptionTariffIntervals;
	}

	/**
	 * Returns the value of the '<em><b>Variable Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Portion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Portion</em>' attribute.
	 * @see #isSetVariablePortion()
	 * @see #unsetVariablePortion()
	 * @see #setVariablePortion(float)
	 * @generated
	 */
	public float getVariablePortion() {
		return variablePortion;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Portion</em>' attribute.
	 * @see #isSetVariablePortion()
	 * @see #unsetVariablePortion()
	 * @see #getVariablePortion()
	 * @generated
	 */
	public void setVariablePortion(float newVariablePortion) {
		variablePortion = newVariablePortion;
		variablePortionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariablePortion()
	 * @see #getVariablePortion()
	 * @see #setVariablePortion(float)
	 * @generated
	 */
	public void unsetVariablePortion() {
		variablePortion = VARIABLE_PORTION_EDEFAULT;
		variablePortionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variable Portion</em>' attribute is set.
	 * @see #unsetVariablePortion()
	 * @see #getVariablePortion()
	 * @see #setVariablePortion(float)
	 * @generated
	 */
	public boolean isSetVariablePortion() {
		return variablePortionESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Tariff Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tariff Intervals</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getCharges
	 * @generated
	 */
	public EList<TimeTariffInterval> getTimeTariffIntervals() {
		if (timeTariffIntervals == null) {
			timeTariffIntervals = new BasicInternalEList<TimeTariffInterval>(TimeTariffInterval.class);
		}
		return timeTariffIntervals;
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Accounts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges
	 * @generated
	 */
	public EList<AuxiliaryAccount> getAuxiliaryAccounts() {
		if (auxiliaryAccounts == null) {
			auxiliaryAccounts = new BasicInternalEList<AuxiliaryAccount>(AuxiliaryAccount.class);
		}
		return auxiliaryAccounts;
	}

	/**
	 * Returns the value of the '<em><b>Child Charges</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Charge}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Charges</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getParentCharge
	 * @generated
	 */
	public EList<Charge> getChildCharges() {
		if (childCharges == null) {
			childCharges = new BasicInternalEList<Charge>(Charge.class);
		}
		return childCharges;
	}

	/**
	 * Returns the value of the '<em><b>Fixed Portion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Portion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Portion</em>' containment reference.
	 * @see #setFixedPortion(AccountingUnit)
	 * @generated
	 */
	public AccountingUnit getFixedPortion() {
		return fixedPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPortion(AccountingUnit newFixedPortion, NotificationChain msgs) {
		AccountingUnit oldFixedPortion = fixedPortion;
		fixedPortion = newFixedPortion;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getFixedPortion <em>Fixed Portion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Portion</em>' containment reference.
	 * @see #getFixedPortion()
	 * @generated
	 */
	public void setFixedPortion(AccountingUnit newFixedPortion) {
		if (newFixedPortion != fixedPortion) {
			NotificationChain msgs = null;
			if (fixedPortion != null)
				msgs = ((InternalEObject)fixedPortion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.CHARGE__FIXED_PORTION, null, msgs);
			if (newFixedPortion != null)
				msgs = ((InternalEObject)newFixedPortion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.CHARGE__FIXED_PORTION, null, msgs);
			msgs = basicSetFixedPortion(newFixedPortion, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.PaymentMetering.ChargeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.ChargeKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ChargeKind)
	 * @generated
	 */
	public ChargeKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.PaymentMetering.ChargeKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(ChargeKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ChargeKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ChargeKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Parent Charge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Charge#getChildCharges <em>Child Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Charge</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Charge</em>' reference.
	 * @see #setParentCharge(Charge)
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getChildCharges
	 * @generated
	 */
	public Charge getParentCharge() {
		if (parentCharge != null && parentCharge.eIsProxy()) {
			InternalEObject oldParentCharge = (InternalEObject)parentCharge;
			parentCharge = (Charge)eResolveProxy(oldParentCharge);
			if (parentCharge != oldParentCharge) {
			}
		}
		return parentCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Charge basicGetParentCharge() {
		return parentCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCharge(Charge newParentCharge, NotificationChain msgs) {
		Charge oldParentCharge = parentCharge;
		parentCharge = newParentCharge;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Charge</em>' reference.
	 * @see #getParentCharge()
	 * @generated
	 */
	public void setParentCharge(Charge newParentCharge) {
		if (newParentCharge != parentCharge) {
			NotificationChain msgs = null;
			if (parentCharge != null)
				msgs = ((InternalEObject)parentCharge).eInverseRemove(this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs);
			if (newParentCharge != null)
				msgs = ((InternalEObject)newParentCharge).eInverseAdd(this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs);
			msgs = basicSetParentCharge(newParentCharge, msgs);
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
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumptionTariffIntervals()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTimeTariffIntervals()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryAccounts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCharges()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				if (parentCharge != null)
					msgs = ((InternalEObject)parentCharge).eInverseRemove(this, PaymentMeteringPackage.CHARGE__CHILD_CHARGES, Charge.class, msgs);
				return basicSetParentCharge((Charge)otherEnd, msgs);
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
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return ((InternalEList<?>)getConsumptionTariffIntervals()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return ((InternalEList<?>)getTimeTariffIntervals()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return ((InternalEList<?>)getAuxiliaryAccounts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return ((InternalEList<?>)getChildCharges()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				return basicSetFixedPortion(null, msgs);
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				return basicSetParentCharge(null, msgs);
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
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return getConsumptionTariffIntervals();
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				return getVariablePortion();
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return getTimeTariffIntervals();
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return getAuxiliaryAccounts();
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return getChildCharges();
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				return getFixedPortion();
			case PaymentMeteringPackage.CHARGE__KIND:
				return getKind();
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				if (resolve) return getParentCharge();
				return basicGetParentCharge();
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
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				getConsumptionTariffIntervals().addAll((Collection<? extends ConsumptionTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				setVariablePortion((Float)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				getTimeTariffIntervals().addAll((Collection<? extends TimeTariffInterval>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				getAuxiliaryAccounts().addAll((Collection<? extends AuxiliaryAccount>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				getChildCharges().clear();
				getChildCharges().addAll((Collection<? extends Charge>)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				setFixedPortion((AccountingUnit)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__KIND:
				setKind((ChargeKind)newValue);
				return;
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				setParentCharge((Charge)newValue);
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
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				getConsumptionTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				unsetVariablePortion();
				return;
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				getTimeTariffIntervals().clear();
				return;
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				return;
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				getChildCharges().clear();
				return;
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				setFixedPortion((AccountingUnit)null);
				return;
			case PaymentMeteringPackage.CHARGE__KIND:
				unsetKind();
				return;
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				setParentCharge((Charge)null);
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
			case PaymentMeteringPackage.CHARGE__CONSUMPTION_TARIFF_INTERVALS:
				return consumptionTariffIntervals != null && !consumptionTariffIntervals.isEmpty();
			case PaymentMeteringPackage.CHARGE__VARIABLE_PORTION:
				return isSetVariablePortion();
			case PaymentMeteringPackage.CHARGE__TIME_TARIFF_INTERVALS:
				return timeTariffIntervals != null && !timeTariffIntervals.isEmpty();
			case PaymentMeteringPackage.CHARGE__AUXILIARY_ACCOUNTS:
				return auxiliaryAccounts != null && !auxiliaryAccounts.isEmpty();
			case PaymentMeteringPackage.CHARGE__CHILD_CHARGES:
				return childCharges != null && !childCharges.isEmpty();
			case PaymentMeteringPackage.CHARGE__FIXED_PORTION:
				return fixedPortion != null;
			case PaymentMeteringPackage.CHARGE__KIND:
				return isSetKind();
			case PaymentMeteringPackage.CHARGE__PARENT_CHARGE:
				return parentCharge != null;
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
		result.append(" (variablePortion: ");
		if (variablePortionESet) result.append(variablePortion); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Charge
