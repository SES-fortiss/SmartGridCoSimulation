/**
 */
package CIM15.IEC61970.Generation.Production;

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
 * A representation of the model object '<em><b>Fossil Fuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FossilFuel extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getFuelSulfur() <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSulfur()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_SULFUR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelSulfur() <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelSulfur()
	 * @generated
	 * @ordered
	 */
	protected float fuelSulfur = FUEL_SULFUR_EDEFAULT;

	/**
	 * This is true if the Fuel Sulfur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelSulfurESet;

	/**
	 * The default value of the '{@link #getFuelCost() <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelCost() <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelCost()
	 * @generated
	 * @ordered
	 */
	protected float fuelCost = FUEL_COST_EDEFAULT;

	/**
	 * This is true if the Fuel Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelCostESet;

	/**
	 * The default value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType FOSSIL_FUEL_TYPE_EDEFAULT = FuelType.OIL;

	/**
	 * The cached value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;

	/**
	 * This is true if the Fossil Fuel Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fossilFuelTypeESet;

	/**
	 * The default value of the '{@link #getLowBreakpointP() <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_BREAKPOINT_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowBreakpointP() <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected float lowBreakpointP = LOW_BREAKPOINT_P_EDEFAULT;

	/**
	 * This is true if the Low Breakpoint P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowBreakpointPESet;

	/**
	 * The default value of the '{@link #getFuelDispatchCost() <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDispatchCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_DISPATCH_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelDispatchCost() <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelDispatchCost()
	 * @generated
	 * @ordered
	 */
	protected float fuelDispatchCost = FUEL_DISPATCH_COST_EDEFAULT;

	/**
	 * This is true if the Fuel Dispatch Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelDispatchCostESet;

	/**
	 * The default value of the '{@link #getFuelHandlingCost() <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHandlingCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_HANDLING_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelHandlingCost() <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHandlingCost()
	 * @generated
	 * @ordered
	 */
	protected float fuelHandlingCost = FUEL_HANDLING_COST_EDEFAULT;

	/**
	 * This is true if the Fuel Handling Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelHandlingCostESet;

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
	 * The default value of the '{@link #getFuelHeatContent() <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHeatContent()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_HEAT_CONTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelHeatContent() <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelHeatContent()
	 * @generated
	 * @ordered
	 */
	protected float fuelHeatContent = FUEL_HEAT_CONTENT_EDEFAULT;

	/**
	 * This is true if the Fuel Heat Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelHeatContentESet;

	/**
	 * The default value of the '{@link #getFuelEffFactor() <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelEffFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_EFF_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelEffFactor() <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelEffFactor()
	 * @generated
	 * @ordered
	 */
	protected float fuelEffFactor = FUEL_EFF_FACTOR_EDEFAULT;

	/**
	 * This is true if the Fuel Eff Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelEffFactorESet;

	/**
	 * The default value of the '{@link #getFuelMixture() <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMixture()
	 * @generated
	 * @ordered
	 */
	protected static final float FUEL_MIXTURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFuelMixture() <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMixture()
	 * @generated
	 * @ordered
	 */
	protected float fuelMixture = FUEL_MIXTURE_EDEFAULT;

	/**
	 * This is true if the Fuel Mixture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelMixtureESet;

	/**
	 * The cached value of the '{@link #getFuelAllocationSchedules() <em>Fuel Allocation Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<FuelAllocationSchedule> fuelAllocationSchedules;

	/**
	 * The default value of the '{@link #getHighBreakpointP() <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_BREAKPOINT_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighBreakpointP() <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighBreakpointP()
	 * @generated
	 * @ordered
	 */
	protected float highBreakpointP = HIGH_BREAKPOINT_P_EDEFAULT;

	/**
	 * This is true if the High Breakpoint P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highBreakpointPESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FossilFuel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.FOSSIL_FUEL;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Sulfur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Sulfur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Sulfur</em>' attribute.
	 * @see #isSetFuelSulfur()
	 * @see #unsetFuelSulfur()
	 * @see #setFuelSulfur(float)
	 * @generated
	 */
	public float getFuelSulfur() {
		return fuelSulfur;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Sulfur</em>' attribute.
	 * @see #isSetFuelSulfur()
	 * @see #unsetFuelSulfur()
	 * @see #getFuelSulfur()
	 * @generated
	 */
	public void setFuelSulfur(float newFuelSulfur) {
		fuelSulfur = newFuelSulfur;
		fuelSulfurESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelSulfur()
	 * @see #getFuelSulfur()
	 * @see #setFuelSulfur(float)
	 * @generated
	 */
	public void unsetFuelSulfur() {
		fuelSulfur = FUEL_SULFUR_EDEFAULT;
		fuelSulfurESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Sulfur</em>' attribute is set.
	 * @see #unsetFuelSulfur()
	 * @see #getFuelSulfur()
	 * @see #setFuelSulfur(float)
	 * @generated
	 */
	public boolean isSetFuelSulfur() {
		return fuelSulfurESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Cost</em>' attribute.
	 * @see #isSetFuelCost()
	 * @see #unsetFuelCost()
	 * @see #setFuelCost(float)
	 * @generated
	 */
	public float getFuelCost() {
		return fuelCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Cost</em>' attribute.
	 * @see #isSetFuelCost()
	 * @see #unsetFuelCost()
	 * @see #getFuelCost()
	 * @generated
	 */
	public void setFuelCost(float newFuelCost) {
		fuelCost = newFuelCost;
		fuelCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelCost()
	 * @see #getFuelCost()
	 * @see #setFuelCost(float)
	 * @generated
	 */
	public void unsetFuelCost() {
		fuelCost = FUEL_COST_EDEFAULT;
		fuelCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Cost</em>' attribute is set.
	 * @see #unsetFuelCost()
	 * @see #getFuelCost()
	 * @see #setFuelCost(float)
	 * @generated
	 */
	public boolean isSetFuelCost() {
		return fuelCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Fossil Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fossil Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fossil Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetFossilFuelType()
	 * @see #unsetFossilFuelType()
	 * @see #setFossilFuelType(FuelType)
	 * @generated
	 */
	public FuelType getFossilFuelType() {
		return fossilFuelType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fossil Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetFossilFuelType()
	 * @see #unsetFossilFuelType()
	 * @see #getFossilFuelType()
	 * @generated
	 */
	public void setFossilFuelType(FuelType newFossilFuelType) {
		fossilFuelType = newFossilFuelType == null ? FOSSIL_FUEL_TYPE_EDEFAULT : newFossilFuelType;
		fossilFuelTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFossilFuelType()
	 * @see #getFossilFuelType()
	 * @see #setFossilFuelType(FuelType)
	 * @generated
	 */
	public void unsetFossilFuelType() {
		fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;
		fossilFuelTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fossil Fuel Type</em>' attribute is set.
	 * @see #unsetFossilFuelType()
	 * @see #getFossilFuelType()
	 * @see #setFossilFuelType(FuelType)
	 * @generated
	 */
	public boolean isSetFossilFuelType() {
		return fossilFuelTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Low Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Breakpoint P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Breakpoint P</em>' attribute.
	 * @see #isSetLowBreakpointP()
	 * @see #unsetLowBreakpointP()
	 * @see #setLowBreakpointP(float)
	 * @generated
	 */
	public float getLowBreakpointP() {
		return lowBreakpointP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Breakpoint P</em>' attribute.
	 * @see #isSetLowBreakpointP()
	 * @see #unsetLowBreakpointP()
	 * @see #getLowBreakpointP()
	 * @generated
	 */
	public void setLowBreakpointP(float newLowBreakpointP) {
		lowBreakpointP = newLowBreakpointP;
		lowBreakpointPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowBreakpointP()
	 * @see #getLowBreakpointP()
	 * @see #setLowBreakpointP(float)
	 * @generated
	 */
	public void unsetLowBreakpointP() {
		lowBreakpointP = LOW_BREAKPOINT_P_EDEFAULT;
		lowBreakpointPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Breakpoint P</em>' attribute is set.
	 * @see #unsetLowBreakpointP()
	 * @see #getLowBreakpointP()
	 * @see #setLowBreakpointP(float)
	 * @generated
	 */
	public boolean isSetLowBreakpointP() {
		return lowBreakpointPESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Dispatch Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Dispatch Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Dispatch Cost</em>' attribute.
	 * @see #isSetFuelDispatchCost()
	 * @see #unsetFuelDispatchCost()
	 * @see #setFuelDispatchCost(float)
	 * @generated
	 */
	public float getFuelDispatchCost() {
		return fuelDispatchCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Dispatch Cost</em>' attribute.
	 * @see #isSetFuelDispatchCost()
	 * @see #unsetFuelDispatchCost()
	 * @see #getFuelDispatchCost()
	 * @generated
	 */
	public void setFuelDispatchCost(float newFuelDispatchCost) {
		fuelDispatchCost = newFuelDispatchCost;
		fuelDispatchCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelDispatchCost()
	 * @see #getFuelDispatchCost()
	 * @see #setFuelDispatchCost(float)
	 * @generated
	 */
	public void unsetFuelDispatchCost() {
		fuelDispatchCost = FUEL_DISPATCH_COST_EDEFAULT;
		fuelDispatchCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Dispatch Cost</em>' attribute is set.
	 * @see #unsetFuelDispatchCost()
	 * @see #getFuelDispatchCost()
	 * @see #setFuelDispatchCost(float)
	 * @generated
	 */
	public boolean isSetFuelDispatchCost() {
		return fuelDispatchCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Handling Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Handling Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Handling Cost</em>' attribute.
	 * @see #isSetFuelHandlingCost()
	 * @see #unsetFuelHandlingCost()
	 * @see #setFuelHandlingCost(float)
	 * @generated
	 */
	public float getFuelHandlingCost() {
		return fuelHandlingCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Handling Cost</em>' attribute.
	 * @see #isSetFuelHandlingCost()
	 * @see #unsetFuelHandlingCost()
	 * @see #getFuelHandlingCost()
	 * @generated
	 */
	public void setFuelHandlingCost(float newFuelHandlingCost) {
		fuelHandlingCost = newFuelHandlingCost;
		fuelHandlingCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelHandlingCost()
	 * @see #getFuelHandlingCost()
	 * @see #setFuelHandlingCost(float)
	 * @generated
	 */
	public void unsetFuelHandlingCost() {
		fuelHandlingCost = FUEL_HANDLING_COST_EDEFAULT;
		fuelHandlingCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Handling Cost</em>' attribute is set.
	 * @see #unsetFuelHandlingCost()
	 * @see #getFuelHandlingCost()
	 * @see #setFuelHandlingCost(float)
	 * @generated
	 */
	public boolean isSetFuelHandlingCost() {
		return fuelHandlingCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Fuel Heat Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Heat Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Heat Content</em>' attribute.
	 * @see #isSetFuelHeatContent()
	 * @see #unsetFuelHeatContent()
	 * @see #setFuelHeatContent(float)
	 * @generated
	 */
	public float getFuelHeatContent() {
		return fuelHeatContent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Heat Content</em>' attribute.
	 * @see #isSetFuelHeatContent()
	 * @see #unsetFuelHeatContent()
	 * @see #getFuelHeatContent()
	 * @generated
	 */
	public void setFuelHeatContent(float newFuelHeatContent) {
		fuelHeatContent = newFuelHeatContent;
		fuelHeatContentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelHeatContent()
	 * @see #getFuelHeatContent()
	 * @see #setFuelHeatContent(float)
	 * @generated
	 */
	public void unsetFuelHeatContent() {
		fuelHeatContent = FUEL_HEAT_CONTENT_EDEFAULT;
		fuelHeatContentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Heat Content</em>' attribute is set.
	 * @see #unsetFuelHeatContent()
	 * @see #getFuelHeatContent()
	 * @see #setFuelHeatContent(float)
	 * @generated
	 */
	public boolean isSetFuelHeatContent() {
		return fuelHeatContentESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Eff Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Eff Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Eff Factor</em>' attribute.
	 * @see #isSetFuelEffFactor()
	 * @see #unsetFuelEffFactor()
	 * @see #setFuelEffFactor(float)
	 * @generated
	 */
	public float getFuelEffFactor() {
		return fuelEffFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Eff Factor</em>' attribute.
	 * @see #isSetFuelEffFactor()
	 * @see #unsetFuelEffFactor()
	 * @see #getFuelEffFactor()
	 * @generated
	 */
	public void setFuelEffFactor(float newFuelEffFactor) {
		fuelEffFactor = newFuelEffFactor;
		fuelEffFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelEffFactor()
	 * @see #getFuelEffFactor()
	 * @see #setFuelEffFactor(float)
	 * @generated
	 */
	public void unsetFuelEffFactor() {
		fuelEffFactor = FUEL_EFF_FACTOR_EDEFAULT;
		fuelEffFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Eff Factor</em>' attribute is set.
	 * @see #unsetFuelEffFactor()
	 * @see #getFuelEffFactor()
	 * @see #setFuelEffFactor(float)
	 * @generated
	 */
	public boolean isSetFuelEffFactor() {
		return fuelEffFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Mixture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Mixture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Mixture</em>' attribute.
	 * @see #isSetFuelMixture()
	 * @see #unsetFuelMixture()
	 * @see #setFuelMixture(float)
	 * @generated
	 */
	public float getFuelMixture() {
		return fuelMixture;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Mixture</em>' attribute.
	 * @see #isSetFuelMixture()
	 * @see #unsetFuelMixture()
	 * @see #getFuelMixture()
	 * @generated
	 */
	public void setFuelMixture(float newFuelMixture) {
		fuelMixture = newFuelMixture;
		fuelMixtureESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelMixture()
	 * @see #getFuelMixture()
	 * @see #setFuelMixture(float)
	 * @generated
	 */
	public void unsetFuelMixture() {
		fuelMixture = FUEL_MIXTURE_EDEFAULT;
		fuelMixtureESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Mixture</em>' attribute is set.
	 * @see #unsetFuelMixture()
	 * @see #getFuelMixture()
	 * @see #setFuelMixture(float)
	 * @generated
	 */
	public boolean isSetFuelMixture() {
		return fuelMixtureESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel
	 * @generated
	 */
	public EList<FuelAllocationSchedule> getFuelAllocationSchedules() {
		if (fuelAllocationSchedules == null) {
			fuelAllocationSchedules = new BasicInternalEList<FuelAllocationSchedule>(FuelAllocationSchedule.class);
		}
		return fuelAllocationSchedules;
	}

	/**
	 * Returns the value of the '<em><b>High Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Breakpoint P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Breakpoint P</em>' attribute.
	 * @see #isSetHighBreakpointP()
	 * @see #unsetHighBreakpointP()
	 * @see #setHighBreakpointP(float)
	 * @generated
	 */
	public float getHighBreakpointP() {
		return highBreakpointP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Breakpoint P</em>' attribute.
	 * @see #isSetHighBreakpointP()
	 * @see #unsetHighBreakpointP()
	 * @see #getHighBreakpointP()
	 * @generated
	 */
	public void setHighBreakpointP(float newHighBreakpointP) {
		highBreakpointP = newHighBreakpointP;
		highBreakpointPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighBreakpointP()
	 * @see #getHighBreakpointP()
	 * @see #setHighBreakpointP(float)
	 * @generated
	 */
	public void unsetHighBreakpointP() {
		highBreakpointP = HIGH_BREAKPOINT_P_EDEFAULT;
		highBreakpointPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Breakpoint P</em>' attribute is set.
	 * @see #unsetHighBreakpointP()
	 * @see #getHighBreakpointP()
	 * @see #setHighBreakpointP(float)
	 * @generated
	 */
	public boolean isSetHighBreakpointP() {
		return highBreakpointPESet;
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
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFuelAllocationSchedules()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return ((InternalEList<?>)getFuelAllocationSchedules()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				return getFuelSulfur();
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				return getFuelCost();
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				return getFossilFuelType();
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				return getLowBreakpointP();
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				return getFuelDispatchCost();
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				return getFuelHandlingCost();
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				return getFuelHeatContent();
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				return getFuelEffFactor();
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				return getFuelMixture();
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return getFuelAllocationSchedules();
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				return getHighBreakpointP();
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				setFuelSulfur((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				setFuelCost((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				setFossilFuelType((FuelType)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				setLowBreakpointP((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				setFuelDispatchCost((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				setFuelHandlingCost((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				setFuelHeatContent((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				setFuelEffFactor((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				setFuelMixture((Float)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				getFuelAllocationSchedules().addAll((Collection<? extends FuelAllocationSchedule>)newValue);
				return;
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				setHighBreakpointP((Float)newValue);
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				unsetFuelSulfur();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				unsetFuelCost();
				return;
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				unsetFossilFuelType();
				return;
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				unsetLowBreakpointP();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				unsetFuelDispatchCost();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				unsetFuelHandlingCost();
				return;
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				unsetFuelHeatContent();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				unsetFuelEffFactor();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				unsetFuelMixture();
				return;
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				getFuelAllocationSchedules().clear();
				return;
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				unsetHighBreakpointP();
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
			case ProductionPackage.FOSSIL_FUEL__FUEL_SULFUR:
				return isSetFuelSulfur();
			case ProductionPackage.FOSSIL_FUEL__FUEL_COST:
				return isSetFuelCost();
			case ProductionPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
				return isSetFossilFuelType();
			case ProductionPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
				return isSetLowBreakpointP();
			case ProductionPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
				return isSetFuelDispatchCost();
			case ProductionPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
				return isSetFuelHandlingCost();
			case ProductionPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
				return isSetFuelHeatContent();
			case ProductionPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
				return isSetFuelEffFactor();
			case ProductionPackage.FOSSIL_FUEL__FUEL_MIXTURE:
				return isSetFuelMixture();
			case ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
				return fuelAllocationSchedules != null && !fuelAllocationSchedules.isEmpty();
			case ProductionPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
				return isSetHighBreakpointP();
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
		result.append(" (fuelSulfur: ");
		if (fuelSulfurESet) result.append(fuelSulfur); else result.append("<unset>");
		result.append(", fuelCost: ");
		if (fuelCostESet) result.append(fuelCost); else result.append("<unset>");
		result.append(", fossilFuelType: ");
		if (fossilFuelTypeESet) result.append(fossilFuelType); else result.append("<unset>");
		result.append(", lowBreakpointP: ");
		if (lowBreakpointPESet) result.append(lowBreakpointP); else result.append("<unset>");
		result.append(", fuelDispatchCost: ");
		if (fuelDispatchCostESet) result.append(fuelDispatchCost); else result.append("<unset>");
		result.append(", fuelHandlingCost: ");
		if (fuelHandlingCostESet) result.append(fuelHandlingCost); else result.append("<unset>");
		result.append(", fuelHeatContent: ");
		if (fuelHeatContentESet) result.append(fuelHeatContent); else result.append("<unset>");
		result.append(", fuelEffFactor: ");
		if (fuelEffFactorESet) result.append(fuelEffFactor); else result.append("<unset>");
		result.append(", fuelMixture: ");
		if (fuelMixtureESet) result.append(fuelMixture); else result.append("<unset>");
		result.append(", highBreakpointP: ");
		if (highBreakpointPESet) result.append(highBreakpointP); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FossilFuel
