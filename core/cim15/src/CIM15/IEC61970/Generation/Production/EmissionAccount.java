/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmissionAccount extends Curve {
	/**
	 * The default value of the '{@link #getEmissionType() <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionType()
	 * @generated
	 * @ordered
	 */
	protected static final EmissionType EMISSION_TYPE_EDEFAULT = EmissionType.CARBON_DISULFIDE;

	/**
	 * The cached value of the '{@link #getEmissionType() <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionType()
	 * @generated
	 * @ordered
	 */
	protected EmissionType emissionType = EMISSION_TYPE_EDEFAULT;

	/**
	 * This is true if the Emission Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emissionTypeESet;

	/**
	 * The default value of the '{@link #getEmissionValueSource() <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionValueSource()
	 * @generated
	 * @ordered
	 */
	protected static final EmissionValueSource EMISSION_VALUE_SOURCE_EDEFAULT = EmissionValueSource.CALCULATED;

	/**
	 * The cached value of the '{@link #getEmissionValueSource() <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionValueSource()
	 * @generated
	 * @ordered
	 */
	protected EmissionValueSource emissionValueSource = EMISSION_VALUE_SOURCE_EDEFAULT;

	/**
	 * This is true if the Emission Value Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emissionValueSourceESet;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmissionAccount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.EMISSION_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Emission Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.EmissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.EmissionType
	 * @see #isSetEmissionType()
	 * @see #unsetEmissionType()
	 * @see #setEmissionType(EmissionType)
	 * @generated
	 */
	public EmissionType getEmissionType() {
		return emissionType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.EmissionType
	 * @see #isSetEmissionType()
	 * @see #unsetEmissionType()
	 * @see #getEmissionType()
	 * @generated
	 */
	public void setEmissionType(EmissionType newEmissionType) {
		emissionType = newEmissionType == null ? EMISSION_TYPE_EDEFAULT : newEmissionType;
		emissionTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmissionType()
	 * @see #getEmissionType()
	 * @see #setEmissionType(EmissionType)
	 * @generated
	 */
	public void unsetEmissionType() {
		emissionType = EMISSION_TYPE_EDEFAULT;
		emissionTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emission Type</em>' attribute is set.
	 * @see #unsetEmissionType()
	 * @see #getEmissionType()
	 * @see #setEmissionType(EmissionType)
	 * @generated
	 */
	public boolean isSetEmissionType() {
		return emissionTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Emission Value Source</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.EmissionValueSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Value Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Value Source</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.EmissionValueSource
	 * @see #isSetEmissionValueSource()
	 * @see #unsetEmissionValueSource()
	 * @see #setEmissionValueSource(EmissionValueSource)
	 * @generated
	 */
	public EmissionValueSource getEmissionValueSource() {
		return emissionValueSource;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Value Source</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.EmissionValueSource
	 * @see #isSetEmissionValueSource()
	 * @see #unsetEmissionValueSource()
	 * @see #getEmissionValueSource()
	 * @generated
	 */
	public void setEmissionValueSource(EmissionValueSource newEmissionValueSource) {
		emissionValueSource = newEmissionValueSource == null ? EMISSION_VALUE_SOURCE_EDEFAULT : newEmissionValueSource;
		emissionValueSourceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmissionValueSource()
	 * @see #getEmissionValueSource()
	 * @see #setEmissionValueSource(EmissionValueSource)
	 * @generated
	 */
	public void unsetEmissionValueSource() {
		emissionValueSource = EMISSION_VALUE_SOURCE_EDEFAULT;
		emissionValueSourceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emission Value Source</em>' attribute is set.
	 * @see #unsetEmissionValueSource()
	 * @see #getEmissionValueSource()
	 * @see #setEmissionValueSource(EmissionValueSource)
	 * @generated
	 */
	public boolean isSetEmissionValueSource() {
		return emissionValueSourceESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				return getEmissionType();
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				return getEmissionValueSource();
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				setEmissionType((EmissionType)newValue);
				return;
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				setEmissionValueSource((EmissionValueSource)newValue);
				return;
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				unsetEmissionType();
				return;
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				unsetEmissionValueSource();
				return;
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
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
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_TYPE:
				return isSetEmissionType();
			case ProductionPackage.EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE:
				return isSetEmissionValueSource();
			case ProductionPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
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
		result.append(" (emissionType: ");
		if (emissionTypeESet) result.append(emissionType); else result.append("<unset>");
		result.append(", emissionValueSource: ");
		if (emissionValueSourceESet) result.append(emissionValueSource); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EmissionAccount
