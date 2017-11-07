/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmissionCurve extends Curve {
	/**
	 * The default value of the '{@link #getEmissionContent() <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionContent()
	 * @generated
	 * @ordered
	 */
	protected static final float EMISSION_CONTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmissionContent() <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissionContent()
	 * @generated
	 * @ordered
	 */
	protected float emissionContent = EMISSION_CONTENT_EDEFAULT;

	/**
	 * This is true if the Emission Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emissionContentESet;

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
	 * The default value of the '{@link #isIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetGrossP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NET_GROSS_P_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNetGrossP()
	 * @generated
	 * @ordered
	 */
	protected boolean isNetGrossP = IS_NET_GROSS_P_EDEFAULT;

	/**
	 * This is true if the Is Net Gross P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isNetGrossPESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmissionCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.EMISSION_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Emission Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emission Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Content</em>' attribute.
	 * @see #isSetEmissionContent()
	 * @see #unsetEmissionContent()
	 * @see #setEmissionContent(float)
	 * @generated
	 */
	public float getEmissionContent() {
		return emissionContent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Content</em>' attribute.
	 * @see #isSetEmissionContent()
	 * @see #unsetEmissionContent()
	 * @see #getEmissionContent()
	 * @generated
	 */
	public void setEmissionContent(float newEmissionContent) {
		emissionContent = newEmissionContent;
		emissionContentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmissionContent()
	 * @see #getEmissionContent()
	 * @see #setEmissionContent(float)
	 * @generated
	 */
	public void unsetEmissionContent() {
		emissionContent = EMISSION_CONTENT_EDEFAULT;
		emissionContentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emission Content</em>' attribute is set.
	 * @see #unsetEmissionContent()
	 * @see #getEmissionContent()
	 * @see #setEmissionContent(float)
	 * @generated
	 */
	public boolean isSetEmissionContent() {
		return emissionContentESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Net Gross P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isSetIsNetGrossP()
	 * @see #unsetIsNetGrossP()
	 * @see #setIsNetGrossP(boolean)
	 * @generated
	 */
	public boolean isIsNetGrossP() {
		return isNetGrossP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
	 * @see #isSetIsNetGrossP()
	 * @see #unsetIsNetGrossP()
	 * @see #isIsNetGrossP()
	 * @generated
	 */
	public void setIsNetGrossP(boolean newIsNetGrossP) {
		isNetGrossP = newIsNetGrossP;
		isNetGrossPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNetGrossP()
	 * @see #isIsNetGrossP()
	 * @see #setIsNetGrossP(boolean)
	 * @generated
	 */
	public void unsetIsNetGrossP() {
		isNetGrossP = IS_NET_GROSS_P_EDEFAULT;
		isNetGrossPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Net Gross P</em>' attribute is set.
	 * @see #unsetIsNetGrossP()
	 * @see #isIsNetGrossP()
	 * @see #setIsNetGrossP(boolean)
	 * @generated
	 */
	public boolean isSetIsNetGrossP() {
		return isNetGrossPESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES, ThermalGeneratingUnit.class, msgs);
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
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				return getEmissionContent();
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				return isIsNetGrossP();
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				return getEmissionType();
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				setEmissionContent((Float)newValue);
				return;
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP((Boolean)newValue);
				return;
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				setEmissionType((EmissionType)newValue);
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				unsetEmissionContent();
				return;
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				unsetIsNetGrossP();
				return;
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				unsetEmissionType();
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
			case ProductionPackage.EMISSION_CURVE__EMISSION_CONTENT:
				return isSetEmissionContent();
			case ProductionPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.EMISSION_CURVE__IS_NET_GROSS_P:
				return isSetIsNetGrossP();
			case ProductionPackage.EMISSION_CURVE__EMISSION_TYPE:
				return isSetEmissionType();
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
		result.append(" (emissionContent: ");
		if (emissionContentESet) result.append(emissionContent); else result.append("<unset>");
		result.append(", isNetGrossP: ");
		if (isNetGrossPESet) result.append(isNetGrossP); else result.append("<unset>");
		result.append(", emissionType: ");
		if (emissionTypeESet) result.append(emissionType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EmissionCurve
