/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Ign Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartIgnFuelCurve extends Curve {
	/**
	 * The cached value of the '{@link #getStartupModel() <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupModel()
	 * @generated
	 * @ordered
	 */
	protected StartupModel startupModel;

	/**
	 * The default value of the '{@link #getIgnitionFuelType() <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnitionFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType IGNITION_FUEL_TYPE_EDEFAULT = FuelType.OIL;

	/**
	 * The cached value of the '{@link #getIgnitionFuelType() <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnitionFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType ignitionFuelType = IGNITION_FUEL_TYPE_EDEFAULT;

	/**
	 * This is true if the Ignition Fuel Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignitionFuelTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartIgnFuelCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.START_IGN_FUEL_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve
	 * @generated
	 */
	public StartupModel getStartupModel() {
		if (startupModel != null && startupModel.eIsProxy()) {
			InternalEObject oldStartupModel = (InternalEObject)startupModel;
			startupModel = (StartupModel)eResolveProxy(oldStartupModel);
			if (startupModel != oldStartupModel) {
			}
		}
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartupModel basicGetStartupModel() {
		return startupModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartupModel(StartupModel newStartupModel, NotificationChain msgs) {
		StartupModel oldStartupModel = startupModel;
		startupModel = newStartupModel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Model</em>' reference.
	 * @see #getStartupModel()
	 * @generated
	 */
	public void setStartupModel(StartupModel newStartupModel) {
		if (newStartupModel != startupModel) {
			NotificationChain msgs = null;
			if (startupModel != null)
				msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, StartupModel.class, msgs);
			if (newStartupModel != null)
				msgs = ((InternalEObject)newStartupModel).eInverseAdd(this, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, StartupModel.class, msgs);
			msgs = basicSetStartupModel(newStartupModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Ignition Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignition Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignition Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetIgnitionFuelType()
	 * @see #unsetIgnitionFuelType()
	 * @see #setIgnitionFuelType(FuelType)
	 * @generated
	 */
	public FuelType getIgnitionFuelType() {
		return ignitionFuelType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignition Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetIgnitionFuelType()
	 * @see #unsetIgnitionFuelType()
	 * @see #getIgnitionFuelType()
	 * @generated
	 */
	public void setIgnitionFuelType(FuelType newIgnitionFuelType) {
		ignitionFuelType = newIgnitionFuelType == null ? IGNITION_FUEL_TYPE_EDEFAULT : newIgnitionFuelType;
		ignitionFuelTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnitionFuelType()
	 * @see #getIgnitionFuelType()
	 * @see #setIgnitionFuelType(FuelType)
	 * @generated
	 */
	public void unsetIgnitionFuelType() {
		ignitionFuelType = IGNITION_FUEL_TYPE_EDEFAULT;
		ignitionFuelTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignition Fuel Type</em>' attribute is set.
	 * @see #unsetIgnitionFuelType()
	 * @see #getIgnitionFuelType()
	 * @see #setIgnitionFuelType(FuelType)
	 * @generated
	 */
	public boolean isSetIgnitionFuelType() {
		return ignitionFuelTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				if (startupModel != null)
					msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, StartupModel.class, msgs);
				return basicSetStartupModel((StartupModel)otherEnd, msgs);
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
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				return basicSetStartupModel(null, msgs);
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
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				if (resolve) return getStartupModel();
				return basicGetStartupModel();
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				return getIgnitionFuelType();
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
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)newValue);
				return;
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				setIgnitionFuelType((FuelType)newValue);
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
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)null);
				return;
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				unsetIgnitionFuelType();
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
			case ProductionPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL:
				return startupModel != null;
			case ProductionPackage.START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE:
				return isSetIgnitionFuelType();
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
		result.append(" (ignitionFuelType: ");
		if (ignitionFuelTypeESet) result.append(ignitionFuelType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StartIgnFuelCurve
