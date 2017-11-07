/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Main Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartMainFuelCurve extends Curve {
	/**
	 * The default value of the '{@link #getMainFuelType() <em>Main Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType MAIN_FUEL_TYPE_EDEFAULT = FuelType.OIL;

	/**
	 * The cached value of the '{@link #getMainFuelType() <em>Main Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType mainFuelType = MAIN_FUEL_TYPE_EDEFAULT;

	/**
	 * This is true if the Main Fuel Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mainFuelTypeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartMainFuelCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.START_MAIN_FUEL_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Main Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetMainFuelType()
	 * @see #unsetMainFuelType()
	 * @see #setMainFuelType(FuelType)
	 * @generated
	 */
	public FuelType getMainFuelType() {
		return mainFuelType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetMainFuelType()
	 * @see #unsetMainFuelType()
	 * @see #getMainFuelType()
	 * @generated
	 */
	public void setMainFuelType(FuelType newMainFuelType) {
		mainFuelType = newMainFuelType == null ? MAIN_FUEL_TYPE_EDEFAULT : newMainFuelType;
		mainFuelTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMainFuelType()
	 * @see #getMainFuelType()
	 * @see #setMainFuelType(FuelType)
	 * @generated
	 */
	public void unsetMainFuelType() {
		mainFuelType = MAIN_FUEL_TYPE_EDEFAULT;
		mainFuelTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Main Fuel Type</em>' attribute is set.
	 * @see #unsetMainFuelType()
	 * @see #getMainFuelType()
	 * @see #setMainFuelType(FuelType)
	 * @generated
	 */
	public boolean isSetMainFuelType() {
		return mainFuelTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Startup Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Model</em>' reference.
	 * @see #setStartupModel(StartupModel)
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}' reference.
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
				msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs);
			if (newStartupModel != null)
				msgs = ((InternalEObject)newStartupModel).eInverseAdd(this, ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs);
			msgs = basicSetStartupModel(newStartupModel, msgs);
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
			case ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
				if (startupModel != null)
					msgs = ((InternalEObject)startupModel).eInverseRemove(this, ProductionPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs);
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
			case ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
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
			case ProductionPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
				return getMainFuelType();
			case ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
				if (resolve) return getStartupModel();
				return basicGetStartupModel();
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
			case ProductionPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
				setMainFuelType((FuelType)newValue);
				return;
			case ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)newValue);
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
			case ProductionPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
				unsetMainFuelType();
				return;
			case ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
				setStartupModel((StartupModel)null);
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
			case ProductionPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
				return isSetMainFuelType();
			case ProductionPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
				return startupModel != null;
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
		result.append(" (mainFuelType: ");
		if (mainFuelTypeESet) result.append(mainFuelType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StartMainFuelCurve
