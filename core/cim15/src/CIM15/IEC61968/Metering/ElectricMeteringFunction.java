/**
 */
package CIM15.IEC61968.Metering;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electric Metering Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getCtRatioMultiplier <em>Ct Ratio Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier <em>Billing Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getVtRatioMultiplier <em>Vt Ratio Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier <em>Demand Multiplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectricMeteringFunction extends EndDeviceFunction {
	/**
	 * The default value of the '{@link #getKWMultiplier() <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final int KW_MULTIPLIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKWMultiplier() <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWMultiplier()
	 * @generated
	 * @ordered
	 */
	protected int kWMultiplier = KW_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the KW Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kWMultiplierESet;

	/**
	 * The cached value of the '{@link #getCtRatioMultiplier() <em>Ct Ratio Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtRatioMultiplier()
	 * @generated
	 * @ordered
	 */
	protected ReadingMultiplier ctRatioMultiplier;

	/**
	 * The default value of the '{@link #getKWhMultiplier() <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWhMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final int KWH_MULTIPLIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKWhMultiplier() <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKWhMultiplier()
	 * @generated
	 * @ordered
	 */
	protected int kWhMultiplier = KWH_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the KWh Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kWhMultiplierESet;

	/**
	 * The cached value of the '{@link #getBillingMultiplier() <em>Billing Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingMultiplier()
	 * @generated
	 * @ordered
	 */
	protected ReadingMultiplier billingMultiplier;

	/**
	 * The cached value of the '{@link #getVtRatioMultiplier() <em>Vt Ratio Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVtRatioMultiplier()
	 * @generated
	 * @ordered
	 */
	protected ReadingMultiplier vtRatioMultiplier;

	/**
	 * The cached value of the '{@link #getDemandMultiplier() <em>Demand Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandMultiplier()
	 * @generated
	 * @ordered
	 */
	protected ReadingMultiplier demandMultiplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricMeteringFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.ELECTRIC_METERING_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>KW Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KW Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KW Multiplier</em>' attribute.
	 * @see #isSetKWMultiplier()
	 * @see #unsetKWMultiplier()
	 * @see #setKWMultiplier(int)
	 * @generated
	 */
	public int getKWMultiplier() {
		return kWMultiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KW Multiplier</em>' attribute.
	 * @see #isSetKWMultiplier()
	 * @see #unsetKWMultiplier()
	 * @see #getKWMultiplier()
	 * @generated
	 */
	public void setKWMultiplier(int newKWMultiplier) {
		kWMultiplier = newKWMultiplier;
		kWMultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKWMultiplier()
	 * @see #getKWMultiplier()
	 * @see #setKWMultiplier(int)
	 * @generated
	 */
	public void unsetKWMultiplier() {
		kWMultiplier = KW_MULTIPLIER_EDEFAULT;
		kWMultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWMultiplier <em>KW Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KW Multiplier</em>' attribute is set.
	 * @see #unsetKWMultiplier()
	 * @see #getKWMultiplier()
	 * @see #setKWMultiplier(int)
	 * @generated
	 */
	public boolean isSetKWMultiplier() {
		return kWMultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Ct Ratio Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Ratio Multiplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Ratio Multiplier</em>' containment reference.
	 * @see #setCtRatioMultiplier(ReadingMultiplier)
	 * @generated
	 */
	public ReadingMultiplier getCtRatioMultiplier() {
		return ctRatioMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtRatioMultiplier(ReadingMultiplier newCtRatioMultiplier, NotificationChain msgs) {
		ReadingMultiplier oldCtRatioMultiplier = ctRatioMultiplier;
		ctRatioMultiplier = newCtRatioMultiplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getCtRatioMultiplier <em>Ct Ratio Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Ratio Multiplier</em>' containment reference.
	 * @see #getCtRatioMultiplier()
	 * @generated
	 */
	public void setCtRatioMultiplier(ReadingMultiplier newCtRatioMultiplier) {
		if (newCtRatioMultiplier != ctRatioMultiplier) {
			NotificationChain msgs = null;
			if (ctRatioMultiplier != null)
				msgs = ((InternalEObject)ctRatioMultiplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER, null, msgs);
			if (newCtRatioMultiplier != null)
				msgs = ((InternalEObject)newCtRatioMultiplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER, null, msgs);
			msgs = basicSetCtRatioMultiplier(newCtRatioMultiplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>KWh Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KWh Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KWh Multiplier</em>' attribute.
	 * @see #isSetKWhMultiplier()
	 * @see #unsetKWhMultiplier()
	 * @see #setKWhMultiplier(int)
	 * @generated
	 */
	public int getKWhMultiplier() {
		return kWhMultiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KWh Multiplier</em>' attribute.
	 * @see #isSetKWhMultiplier()
	 * @see #unsetKWhMultiplier()
	 * @see #getKWhMultiplier()
	 * @generated
	 */
	public void setKWhMultiplier(int newKWhMultiplier) {
		kWhMultiplier = newKWhMultiplier;
		kWhMultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKWhMultiplier()
	 * @see #getKWhMultiplier()
	 * @see #setKWhMultiplier(int)
	 * @generated
	 */
	public void unsetKWhMultiplier() {
		kWhMultiplier = KWH_MULTIPLIER_EDEFAULT;
		kWhMultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getKWhMultiplier <em>KWh Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KWh Multiplier</em>' attribute is set.
	 * @see #unsetKWhMultiplier()
	 * @see #getKWhMultiplier()
	 * @see #setKWhMultiplier(int)
	 * @generated
	 */
	public boolean isSetKWhMultiplier() {
		return kWhMultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Billing Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Multiplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Multiplier</em>' containment reference.
	 * @see #setBillingMultiplier(ReadingMultiplier)
	 * @generated
	 */
	public ReadingMultiplier getBillingMultiplier() {
		return billingMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillingMultiplier(ReadingMultiplier newBillingMultiplier, NotificationChain msgs) {
		ReadingMultiplier oldBillingMultiplier = billingMultiplier;
		billingMultiplier = newBillingMultiplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getBillingMultiplier <em>Billing Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Multiplier</em>' containment reference.
	 * @see #getBillingMultiplier()
	 * @generated
	 */
	public void setBillingMultiplier(ReadingMultiplier newBillingMultiplier) {
		if (newBillingMultiplier != billingMultiplier) {
			NotificationChain msgs = null;
			if (billingMultiplier != null)
				msgs = ((InternalEObject)billingMultiplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER, null, msgs);
			if (newBillingMultiplier != null)
				msgs = ((InternalEObject)newBillingMultiplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER, null, msgs);
			msgs = basicSetBillingMultiplier(newBillingMultiplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Vt Ratio Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vt Ratio Multiplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vt Ratio Multiplier</em>' containment reference.
	 * @see #setVtRatioMultiplier(ReadingMultiplier)
	 * @generated
	 */
	public ReadingMultiplier getVtRatioMultiplier() {
		return vtRatioMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVtRatioMultiplier(ReadingMultiplier newVtRatioMultiplier, NotificationChain msgs) {
		ReadingMultiplier oldVtRatioMultiplier = vtRatioMultiplier;
		vtRatioMultiplier = newVtRatioMultiplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getVtRatioMultiplier <em>Vt Ratio Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vt Ratio Multiplier</em>' containment reference.
	 * @see #getVtRatioMultiplier()
	 * @generated
	 */
	public void setVtRatioMultiplier(ReadingMultiplier newVtRatioMultiplier) {
		if (newVtRatioMultiplier != vtRatioMultiplier) {
			NotificationChain msgs = null;
			if (vtRatioMultiplier != null)
				msgs = ((InternalEObject)vtRatioMultiplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER, null, msgs);
			if (newVtRatioMultiplier != null)
				msgs = ((InternalEObject)newVtRatioMultiplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER, null, msgs);
			msgs = basicSetVtRatioMultiplier(newVtRatioMultiplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Demand Multiplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Multiplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Multiplier</em>' containment reference.
	 * @see #setDemandMultiplier(ReadingMultiplier)
	 * @generated
	 */
	public ReadingMultiplier getDemandMultiplier() {
		return demandMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandMultiplier(ReadingMultiplier newDemandMultiplier, NotificationChain msgs) {
		ReadingMultiplier oldDemandMultiplier = demandMultiplier;
		demandMultiplier = newDemandMultiplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ElectricMeteringFunction#getDemandMultiplier <em>Demand Multiplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Multiplier</em>' containment reference.
	 * @see #getDemandMultiplier()
	 * @generated
	 */
	public void setDemandMultiplier(ReadingMultiplier newDemandMultiplier) {
		if (newDemandMultiplier != demandMultiplier) {
			NotificationChain msgs = null;
			if (demandMultiplier != null)
				msgs = ((InternalEObject)demandMultiplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER, null, msgs);
			if (newDemandMultiplier != null)
				msgs = ((InternalEObject)newDemandMultiplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER, null, msgs);
			msgs = basicSetDemandMultiplier(newDemandMultiplier, msgs);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER:
				return basicSetCtRatioMultiplier(null, msgs);
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				return basicSetBillingMultiplier(null, msgs);
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER:
				return basicSetVtRatioMultiplier(null, msgs);
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				return basicSetDemandMultiplier(null, msgs);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				return getKWMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER:
				return getCtRatioMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				return getKWhMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				return getBillingMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER:
				return getVtRatioMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				return getDemandMultiplier();
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				setKWMultiplier((Integer)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER:
				setCtRatioMultiplier((ReadingMultiplier)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				setKWhMultiplier((Integer)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				setBillingMultiplier((ReadingMultiplier)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER:
				setVtRatioMultiplier((ReadingMultiplier)newValue);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				setDemandMultiplier((ReadingMultiplier)newValue);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				unsetKWMultiplier();
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER:
				setCtRatioMultiplier((ReadingMultiplier)null);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				unsetKWhMultiplier();
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				setBillingMultiplier((ReadingMultiplier)null);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER:
				setVtRatioMultiplier((ReadingMultiplier)null);
				return;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				setDemandMultiplier((ReadingMultiplier)null);
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
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KW_MULTIPLIER:
				return isSetKWMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__CT_RATIO_MULTIPLIER:
				return ctRatioMultiplier != null;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__KWH_MULTIPLIER:
				return isSetKWhMultiplier();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__BILLING_MULTIPLIER:
				return billingMultiplier != null;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__VT_RATIO_MULTIPLIER:
				return vtRatioMultiplier != null;
			case MeteringPackage.ELECTRIC_METERING_FUNCTION__DEMAND_MULTIPLIER:
				return demandMultiplier != null;
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
		result.append(" (kWMultiplier: ");
		if (kWMultiplierESet) result.append(kWMultiplier); else result.append("<unset>");
		result.append(", kWhMultiplier: ");
		if (kWhMultiplierESet) result.append(kWhMultiplier); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ElectricMeteringFunction
