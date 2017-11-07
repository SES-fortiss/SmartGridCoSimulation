/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Input Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeatInputCurve extends Curve {
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
	 * The default value of the '{@link #getHeatInputEff() <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputEff()
	 * @generated
	 * @ordered
	 */
	protected static final float HEAT_INPUT_EFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeatInputEff() <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputEff()
	 * @generated
	 * @ordered
	 */
	protected float heatInputEff = HEAT_INPUT_EFF_EDEFAULT;

	/**
	 * This is true if the Heat Input Eff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heatInputEffESet;

	/**
	 * The default value of the '{@link #getHeatInputOffset() <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float HEAT_INPUT_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeatInputOffset() <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatInputOffset()
	 * @generated
	 * @ordered
	 */
	protected float heatInputOffset = HEAT_INPUT_OFFSET_EDEFAULT;

	/**
	 * This is true if the Heat Input Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heatInputOffsetESet;

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
	 * The default value of the '{@link #getAuxPowerOffset() <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerOffset() <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerOffset()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerOffset = AUX_POWER_OFFSET_EDEFAULT;

	/**
	 * This is true if the Aux Power Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxPowerOffsetESet;

	/**
	 * The default value of the '{@link #getAuxPowerMult() <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerMult()
	 * @generated
	 * @ordered
	 */
	protected static final float AUX_POWER_MULT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAuxPowerMult() <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPowerMult()
	 * @generated
	 * @ordered
	 */
	protected float auxPowerMult = AUX_POWER_MULT_EDEFAULT;

	/**
	 * This is true if the Aux Power Mult attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxPowerMultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeatInputCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HEAT_INPUT_CURVE;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Heat Input Eff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Input Eff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Input Eff</em>' attribute.
	 * @see #isSetHeatInputEff()
	 * @see #unsetHeatInputEff()
	 * @see #setHeatInputEff(float)
	 * @generated
	 */
	public float getHeatInputEff() {
		return heatInputEff;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Input Eff</em>' attribute.
	 * @see #isSetHeatInputEff()
	 * @see #unsetHeatInputEff()
	 * @see #getHeatInputEff()
	 * @generated
	 */
	public void setHeatInputEff(float newHeatInputEff) {
		heatInputEff = newHeatInputEff;
		heatInputEffESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeatInputEff()
	 * @see #getHeatInputEff()
	 * @see #setHeatInputEff(float)
	 * @generated
	 */
	public void unsetHeatInputEff() {
		heatInputEff = HEAT_INPUT_EFF_EDEFAULT;
		heatInputEffESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heat Input Eff</em>' attribute is set.
	 * @see #unsetHeatInputEff()
	 * @see #getHeatInputEff()
	 * @see #setHeatInputEff(float)
	 * @generated
	 */
	public boolean isSetHeatInputEff() {
		return heatInputEffESet;
	}

	/**
	 * Returns the value of the '<em><b>Heat Input Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat Input Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat Input Offset</em>' attribute.
	 * @see #isSetHeatInputOffset()
	 * @see #unsetHeatInputOffset()
	 * @see #setHeatInputOffset(float)
	 * @generated
	 */
	public float getHeatInputOffset() {
		return heatInputOffset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat Input Offset</em>' attribute.
	 * @see #isSetHeatInputOffset()
	 * @see #unsetHeatInputOffset()
	 * @see #getHeatInputOffset()
	 * @generated
	 */
	public void setHeatInputOffset(float newHeatInputOffset) {
		heatInputOffset = newHeatInputOffset;
		heatInputOffsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeatInputOffset()
	 * @see #getHeatInputOffset()
	 * @see #setHeatInputOffset(float)
	 * @generated
	 */
	public void unsetHeatInputOffset() {
		heatInputOffset = HEAT_INPUT_OFFSET_EDEFAULT;
		heatInputOffsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heat Input Offset</em>' attribute is set.
	 * @see #unsetHeatInputOffset()
	 * @see #getHeatInputOffset()
	 * @see #setHeatInputOffset(float)
	 * @generated
	 */
	public boolean isSetHeatInputOffset() {
		return heatInputOffsetESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Aux Power Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Offset</em>' attribute.
	 * @see #isSetAuxPowerOffset()
	 * @see #unsetAuxPowerOffset()
	 * @see #setAuxPowerOffset(float)
	 * @generated
	 */
	public float getAuxPowerOffset() {
		return auxPowerOffset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Offset</em>' attribute.
	 * @see #isSetAuxPowerOffset()
	 * @see #unsetAuxPowerOffset()
	 * @see #getAuxPowerOffset()
	 * @generated
	 */
	public void setAuxPowerOffset(float newAuxPowerOffset) {
		auxPowerOffset = newAuxPowerOffset;
		auxPowerOffsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxPowerOffset()
	 * @see #getAuxPowerOffset()
	 * @see #setAuxPowerOffset(float)
	 * @generated
	 */
	public void unsetAuxPowerOffset() {
		auxPowerOffset = AUX_POWER_OFFSET_EDEFAULT;
		auxPowerOffsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Power Offset</em>' attribute is set.
	 * @see #unsetAuxPowerOffset()
	 * @see #getAuxPowerOffset()
	 * @see #setAuxPowerOffset(float)
	 * @generated
	 */
	public boolean isSetAuxPowerOffset() {
		return auxPowerOffsetESet;
	}

	/**
	 * Returns the value of the '<em><b>Aux Power Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Power Mult</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Power Mult</em>' attribute.
	 * @see #isSetAuxPowerMult()
	 * @see #unsetAuxPowerMult()
	 * @see #setAuxPowerMult(float)
	 * @generated
	 */
	public float getAuxPowerMult() {
		return auxPowerMult;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Power Mult</em>' attribute.
	 * @see #isSetAuxPowerMult()
	 * @see #unsetAuxPowerMult()
	 * @see #getAuxPowerMult()
	 * @generated
	 */
	public void setAuxPowerMult(float newAuxPowerMult) {
		auxPowerMult = newAuxPowerMult;
		auxPowerMultESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxPowerMult()
	 * @see #getAuxPowerMult()
	 * @see #setAuxPowerMult(float)
	 * @generated
	 */
	public void unsetAuxPowerMult() {
		auxPowerMult = AUX_POWER_MULT_EDEFAULT;
		auxPowerMultESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Power Mult</em>' attribute is set.
	 * @see #unsetAuxPowerMult()
	 * @see #getAuxPowerMult()
	 * @see #setAuxPowerMult(float)
	 * @generated
	 */
	public boolean isSetAuxPowerMult() {
		return auxPowerMultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, ThermalGeneratingUnit.class, msgs);
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
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				return isIsNetGrossP();
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				return getHeatInputEff();
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				return getHeatInputOffset();
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				return getAuxPowerOffset();
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				return getAuxPowerMult();
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
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				setIsNetGrossP((Boolean)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				setHeatInputEff((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				setHeatInputOffset((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				setAuxPowerOffset((Float)newValue);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				setAuxPowerMult((Float)newValue);
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
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				unsetIsNetGrossP();
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				unsetHeatInputEff();
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				unsetHeatInputOffset();
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				unsetAuxPowerOffset();
				return;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				unsetAuxPowerMult();
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
			case ProductionPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
				return isSetIsNetGrossP();
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
				return isSetHeatInputEff();
			case ProductionPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
				return isSetHeatInputOffset();
			case ProductionPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
				return isSetAuxPowerOffset();
			case ProductionPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
				return isSetAuxPowerMult();
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
		result.append(" (isNetGrossP: ");
		if (isNetGrossPESet) result.append(isNetGrossP); else result.append("<unset>");
		result.append(", heatInputEff: ");
		if (heatInputEffESet) result.append(heatInputEff); else result.append("<unset>");
		result.append(", heatInputOffset: ");
		if (heatInputOffsetESet) result.append(heatInputOffset); else result.append("<unset>");
		result.append(", auxPowerOffset: ");
		if (auxPowerOffsetESet) result.append(auxPowerOffset); else result.append("<unset>");
		result.append(", auxPowerMult: ");
		if (auxPowerMultESet) result.append(auxPowerMult); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HeatInputCurve
