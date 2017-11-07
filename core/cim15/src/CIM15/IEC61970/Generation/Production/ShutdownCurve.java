/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shutdown Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShutdownCurve extends Curve {
	/**
	 * The default value of the '{@link #getShutdownDate() <em>Shutdown Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHUTDOWN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShutdownDate() <em>Shutdown Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownDate()
	 * @generated
	 * @ordered
	 */
	protected Date shutdownDate = SHUTDOWN_DATE_EDEFAULT;

	/**
	 * This is true if the Shutdown Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shutdownDateESet;

	/**
	 * The default value of the '{@link #getShutdownCost() <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownCost()
	 * @generated
	 * @ordered
	 */
	protected static final float SHUTDOWN_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShutdownCost() <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownCost()
	 * @generated
	 * @ordered
	 */
	protected float shutdownCost = SHUTDOWN_COST_EDEFAULT;

	/**
	 * This is true if the Shutdown Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shutdownCostESet;

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
	protected ShutdownCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.SHUTDOWN_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Shutdown Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Date</em>' attribute.
	 * @see #isSetShutdownDate()
	 * @see #unsetShutdownDate()
	 * @see #setShutdownDate(Date)
	 * @generated
	 */
	public Date getShutdownDate() {
		return shutdownDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Date</em>' attribute.
	 * @see #isSetShutdownDate()
	 * @see #unsetShutdownDate()
	 * @see #getShutdownDate()
	 * @generated
	 */
	public void setShutdownDate(Date newShutdownDate) {
		shutdownDate = newShutdownDate;
		shutdownDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownDate()
	 * @see #getShutdownDate()
	 * @see #setShutdownDate(Date)
	 * @generated
	 */
	public void unsetShutdownDate() {
		shutdownDate = SHUTDOWN_DATE_EDEFAULT;
		shutdownDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shutdown Date</em>' attribute is set.
	 * @see #unsetShutdownDate()
	 * @see #getShutdownDate()
	 * @see #setShutdownDate(Date)
	 * @generated
	 */
	public boolean isSetShutdownDate() {
		return shutdownDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Shutdown Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Cost</em>' attribute.
	 * @see #isSetShutdownCost()
	 * @see #unsetShutdownCost()
	 * @see #setShutdownCost(float)
	 * @generated
	 */
	public float getShutdownCost() {
		return shutdownCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutdown Cost</em>' attribute.
	 * @see #isSetShutdownCost()
	 * @see #unsetShutdownCost()
	 * @see #getShutdownCost()
	 * @generated
	 */
	public void setShutdownCost(float newShutdownCost) {
		shutdownCost = newShutdownCost;
		shutdownCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShutdownCost()
	 * @see #getShutdownCost()
	 * @see #setShutdownCost(float)
	 * @generated
	 */
	public void unsetShutdownCost() {
		shutdownCost = SHUTDOWN_COST_EDEFAULT;
		shutdownCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shutdown Cost</em>' attribute is set.
	 * @see #unsetShutdownCost()
	 * @see #getShutdownCost()
	 * @see #setShutdownCost(float)
	 * @generated
	 */
	public boolean isSetShutdownCost() {
		return shutdownCostESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs);
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
			case ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, ThermalGeneratingUnit.class, msgs);
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
			case ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
				return getShutdownDate();
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
				return getShutdownCost();
			case ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
				setShutdownDate((Date)newValue);
				return;
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
				setShutdownCost((Float)newValue);
				return;
			case ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
				unsetShutdownDate();
				return;
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
				unsetShutdownCost();
				return;
			case ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_DATE:
				return isSetShutdownDate();
			case ProductionPackage.SHUTDOWN_CURVE__SHUTDOWN_COST:
				return isSetShutdownCost();
			case ProductionPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT:
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
		result.append(" (shutdownDate: ");
		if (shutdownDateESet) result.append(shutdownDate); else result.append("<unset>");
		result.append(", shutdownCost: ");
		if (shutdownCostESet) result.append(shutdownCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ShutdownCurve
