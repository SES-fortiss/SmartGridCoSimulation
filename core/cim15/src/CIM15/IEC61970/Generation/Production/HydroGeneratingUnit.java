/**
 */
package CIM15.IEC61970.Generation.Production;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HydroGeneratingUnit extends GeneratingUnit {
	/**
	 * The default value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConversionCapability()
	 * @generated
	 * @ordered
	 */
	protected static final HydroEnergyConversionKind ENERGY_CONVERSION_CAPABILITY_EDEFAULT = HydroEnergyConversionKind.GENERATOR;

	/**
	 * The cached value of the '{@link #getEnergyConversionCapability() <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConversionCapability()
	 * @generated
	 * @ordered
	 */
	protected HydroEnergyConversionKind energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;

	/**
	 * This is true if the Energy Conversion Capability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyConversionCapabilityESet;

	/**
	 * The cached value of the '{@link #getPenstockLossCurve() <em>Penstock Loss Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenstockLossCurve()
	 * @generated
	 * @ordered
	 */
	protected PenstockLossCurve penstockLossCurve;

	/**
	 * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPowerPlant()
	 * @generated
	 * @ordered
	 */
	protected HydroPowerPlant hydroPowerPlant;

	/**
	 * The default value of the '{@link #getHydroUnitWaterCost() <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroUnitWaterCost()
	 * @generated
	 * @ordered
	 */
	protected static final float HYDRO_UNIT_WATER_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHydroUnitWaterCost() <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroUnitWaterCost()
	 * @generated
	 * @ordered
	 */
	protected float hydroUnitWaterCost = HYDRO_UNIT_WATER_COST_EDEFAULT;

	/**
	 * This is true if the Hydro Unit Water Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hydroUnitWaterCostESet;

	/**
	 * The cached value of the '{@link #getTailbayLossCurve() <em>Tailbay Loss Curve</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailbayLossCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<TailbayLossCurve> tailbayLossCurve;

	/**
	 * The cached value of the '{@link #getHydroGeneratingEfficiencyCurves() <em>Hydro Generating Efficiency Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroGeneratingEfficiencyCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroGeneratingEfficiencyCurve> hydroGeneratingEfficiencyCurves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroGeneratingUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_GENERATING_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Energy Conversion Capability</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Conversion Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Conversion Capability</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @see #isSetEnergyConversionCapability()
	 * @see #unsetEnergyConversionCapability()
	 * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
	 * @generated
	 */
	public HydroEnergyConversionKind getEnergyConversionCapability() {
		return energyConversionCapability;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Conversion Capability</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @see #isSetEnergyConversionCapability()
	 * @see #unsetEnergyConversionCapability()
	 * @see #getEnergyConversionCapability()
	 * @generated
	 */
	public void setEnergyConversionCapability(HydroEnergyConversionKind newEnergyConversionCapability) {
		energyConversionCapability = newEnergyConversionCapability == null ? ENERGY_CONVERSION_CAPABILITY_EDEFAULT : newEnergyConversionCapability;
		energyConversionCapabilityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyConversionCapability()
	 * @see #getEnergyConversionCapability()
	 * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
	 * @generated
	 */
	public void unsetEnergyConversionCapability() {
		energyConversionCapability = ENERGY_CONVERSION_CAPABILITY_EDEFAULT;
		energyConversionCapabilityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Conversion Capability</em>' attribute is set.
	 * @see #unsetEnergyConversionCapability()
	 * @see #getEnergyConversionCapability()
	 * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
	 * @generated
	 */
	public boolean isSetEnergyConversionCapability() {
		return energyConversionCapabilityESet;
	}

	/**
	 * Returns the value of the '<em><b>Penstock Loss Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penstock Loss Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penstock Loss Curve</em>' reference.
	 * @see #setPenstockLossCurve(PenstockLossCurve)
	 * @see CIM15.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit
	 * @generated
	 */
	public PenstockLossCurve getPenstockLossCurve() {
		if (penstockLossCurve != null && penstockLossCurve.eIsProxy()) {
			InternalEObject oldPenstockLossCurve = (InternalEObject)penstockLossCurve;
			penstockLossCurve = (PenstockLossCurve)eResolveProxy(oldPenstockLossCurve);
			if (penstockLossCurve != oldPenstockLossCurve) {
			}
		}
		return penstockLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenstockLossCurve basicGetPenstockLossCurve() {
		return penstockLossCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenstockLossCurve(PenstockLossCurve newPenstockLossCurve, NotificationChain msgs) {
		PenstockLossCurve oldPenstockLossCurve = penstockLossCurve;
		penstockLossCurve = newPenstockLossCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penstock Loss Curve</em>' reference.
	 * @see #getPenstockLossCurve()
	 * @generated
	 */
	public void setPenstockLossCurve(PenstockLossCurve newPenstockLossCurve) {
		if (newPenstockLossCurve != penstockLossCurve) {
			NotificationChain msgs = null;
			if (penstockLossCurve != null)
				msgs = ((InternalEObject)penstockLossCurve).eInverseRemove(this, ProductionPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs);
			if (newPenstockLossCurve != null)
				msgs = ((InternalEObject)newPenstockLossCurve).eInverseAdd(this, ProductionPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs);
			msgs = basicSetPenstockLossCurve(newPenstockLossCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Power Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #setHydroPowerPlant(HydroPowerPlant)
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits
	 * @generated
	 */
	public HydroPowerPlant getHydroPowerPlant() {
		if (hydroPowerPlant != null && hydroPowerPlant.eIsProxy()) {
			InternalEObject oldHydroPowerPlant = (InternalEObject)hydroPowerPlant;
			hydroPowerPlant = (HydroPowerPlant)eResolveProxy(oldHydroPowerPlant);
			if (hydroPowerPlant != oldHydroPowerPlant) {
			}
		}
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant basicGetHydroPowerPlant() {
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPowerPlant(HydroPowerPlant newHydroPowerPlant, NotificationChain msgs) {
		HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
		hydroPowerPlant = newHydroPowerPlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public void setHydroPowerPlant(HydroPowerPlant newHydroPowerPlant) {
		if (newHydroPowerPlant != hydroPowerPlant) {
			NotificationChain msgs = null;
			if (hydroPowerPlant != null)
				msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs);
			if (newHydroPowerPlant != null)
				msgs = ((InternalEObject)newHydroPowerPlant).eInverseAdd(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs);
			msgs = basicSetHydroPowerPlant(newHydroPowerPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Hydro Unit Water Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Unit Water Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Unit Water Cost</em>' attribute.
	 * @see #isSetHydroUnitWaterCost()
	 * @see #unsetHydroUnitWaterCost()
	 * @see #setHydroUnitWaterCost(float)
	 * @generated
	 */
	public float getHydroUnitWaterCost() {
		return hydroUnitWaterCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Unit Water Cost</em>' attribute.
	 * @see #isSetHydroUnitWaterCost()
	 * @see #unsetHydroUnitWaterCost()
	 * @see #getHydroUnitWaterCost()
	 * @generated
	 */
	public void setHydroUnitWaterCost(float newHydroUnitWaterCost) {
		hydroUnitWaterCost = newHydroUnitWaterCost;
		hydroUnitWaterCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHydroUnitWaterCost()
	 * @see #getHydroUnitWaterCost()
	 * @see #setHydroUnitWaterCost(float)
	 * @generated
	 */
	public void unsetHydroUnitWaterCost() {
		hydroUnitWaterCost = HYDRO_UNIT_WATER_COST_EDEFAULT;
		hydroUnitWaterCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hydro Unit Water Cost</em>' attribute is set.
	 * @see #unsetHydroUnitWaterCost()
	 * @see #getHydroUnitWaterCost()
	 * @see #setHydroUnitWaterCost(float)
	 * @generated
	 */
	public boolean isSetHydroUnitWaterCost() {
		return hydroUnitWaterCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Tailbay Loss Curve</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.TailbayLossCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tailbay Loss Curve</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tailbay Loss Curve</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit
	 * @generated
	 */
	public EList<TailbayLossCurve> getTailbayLossCurve() {
		if (tailbayLossCurve == null) {
			tailbayLossCurve = new BasicInternalEList<TailbayLossCurve>(TailbayLossCurve.class);
		}
		return tailbayLossCurve;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Efficiency Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Efficiency Curves</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit
	 * @generated
	 */
	public EList<HydroGeneratingEfficiencyCurve> getHydroGeneratingEfficiencyCurves() {
		if (hydroGeneratingEfficiencyCurves == null) {
			hydroGeneratingEfficiencyCurves = new BasicInternalEList<HydroGeneratingEfficiencyCurve>(HydroGeneratingEfficiencyCurve.class);
		}
		return hydroGeneratingEfficiencyCurves;
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				if (penstockLossCurve != null)
					msgs = ((InternalEObject)penstockLossCurve).eInverseRemove(this, ProductionPackage.PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT, PenstockLossCurve.class, msgs);
				return basicSetPenstockLossCurve((PenstockLossCurve)otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				if (hydroPowerPlant != null)
					msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS, HydroPowerPlant.class, msgs);
				return basicSetHydroPowerPlant((HydroPowerPlant)otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTailbayLossCurve()).basicAdd(otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroGeneratingEfficiencyCurves()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				return basicSetPenstockLossCurve(null, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				return basicSetHydroPowerPlant(null, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return ((InternalEList<?>)getTailbayLossCurve()).basicRemove(otherEnd, msgs);
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return ((InternalEList<?>)getHydroGeneratingEfficiencyCurves()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				return getEnergyConversionCapability();
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				if (resolve) return getPenstockLossCurve();
				return basicGetPenstockLossCurve();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				if (resolve) return getHydroPowerPlant();
				return basicGetHydroPowerPlant();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				return getHydroUnitWaterCost();
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return getTailbayLossCurve();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return getHydroGeneratingEfficiencyCurves();
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				setEnergyConversionCapability((HydroEnergyConversionKind)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				setPenstockLossCurve((PenstockLossCurve)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				setHydroUnitWaterCost((Float)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				getTailbayLossCurve().clear();
				getTailbayLossCurve().addAll((Collection<? extends TailbayLossCurve>)newValue);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				getHydroGeneratingEfficiencyCurves().clear();
				getHydroGeneratingEfficiencyCurves().addAll((Collection<? extends HydroGeneratingEfficiencyCurve>)newValue);
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				unsetEnergyConversionCapability();
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				setPenstockLossCurve((PenstockLossCurve)null);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)null);
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				unsetHydroUnitWaterCost();
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				getTailbayLossCurve().clear();
				return;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				getHydroGeneratingEfficiencyCurves().clear();
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
			case ProductionPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
				return isSetEnergyConversionCapability();
			case ProductionPackage.HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE:
				return penstockLossCurve != null;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT:
				return hydroPowerPlant != null;
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
				return isSetHydroUnitWaterCost();
			case ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE:
				return tailbayLossCurve != null && !tailbayLossCurve.isEmpty();
			case ProductionPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES:
				return hydroGeneratingEfficiencyCurves != null && !hydroGeneratingEfficiencyCurves.isEmpty();
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
		result.append(" (energyConversionCapability: ");
		if (energyConversionCapabilityESet) result.append(energyConversionCapability); else result.append("<unset>");
		result.append(", hydroUnitWaterCost: ");
		if (hydroUnitWaterCostESet) result.append(hydroUnitWaterCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HydroGeneratingUnit
