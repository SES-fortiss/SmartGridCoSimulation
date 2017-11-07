/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAES Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CAESPlant extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getAirCompressor() <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressor()
	 * @generated
	 * @ordered
	 */
	protected AirCompressor airCompressor;

	/**
	 * The default value of the '{@link #getRatedCapacityP() <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCapacityP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CAPACITY_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCapacityP() <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCapacityP()
	 * @generated
	 * @ordered
	 */
	protected float ratedCapacityP = RATED_CAPACITY_P_EDEFAULT;

	/**
	 * This is true if the Rated Capacity P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedCapacityPESet;

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
	 * The default value of the '{@link #getEnergyStorageCapacity() <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_STORAGE_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyStorageCapacity() <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected float energyStorageCapacity = ENERGY_STORAGE_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Energy Storage Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyStorageCapacityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAESPlant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.CAES_PLANT;
	}

	/**
	 * Returns the value of the '<em><b>Air Compressor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Compressor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Compressor</em>' reference.
	 * @see #setAirCompressor(AirCompressor)
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor#getCAESPlant
	 * @generated
	 */
	public AirCompressor getAirCompressor() {
		if (airCompressor != null && airCompressor.eIsProxy()) {
			InternalEObject oldAirCompressor = (InternalEObject)airCompressor;
			airCompressor = (AirCompressor)eResolveProxy(oldAirCompressor);
			if (airCompressor != oldAirCompressor) {
			}
		}
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirCompressor basicGetAirCompressor() {
		return airCompressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirCompressor(AirCompressor newAirCompressor, NotificationChain msgs) {
		AirCompressor oldAirCompressor = airCompressor;
		airCompressor = newAirCompressor;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Compressor</em>' reference.
	 * @see #getAirCompressor()
	 * @generated
	 */
	public void setAirCompressor(AirCompressor newAirCompressor) {
		if (newAirCompressor != airCompressor) {
			NotificationChain msgs = null;
			if (airCompressor != null)
				msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs);
			if (newAirCompressor != null)
				msgs = ((InternalEObject)newAirCompressor).eInverseAdd(this, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs);
			msgs = basicSetAirCompressor(newAirCompressor, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Rated Capacity P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Capacity P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Capacity P</em>' attribute.
	 * @see #isSetRatedCapacityP()
	 * @see #unsetRatedCapacityP()
	 * @see #setRatedCapacityP(float)
	 * @generated
	 */
	public float getRatedCapacityP() {
		return ratedCapacityP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Capacity P</em>' attribute.
	 * @see #isSetRatedCapacityP()
	 * @see #unsetRatedCapacityP()
	 * @see #getRatedCapacityP()
	 * @generated
	 */
	public void setRatedCapacityP(float newRatedCapacityP) {
		ratedCapacityP = newRatedCapacityP;
		ratedCapacityPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedCapacityP()
	 * @see #getRatedCapacityP()
	 * @see #setRatedCapacityP(float)
	 * @generated
	 */
	public void unsetRatedCapacityP() {
		ratedCapacityP = RATED_CAPACITY_P_EDEFAULT;
		ratedCapacityPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Capacity P</em>' attribute is set.
	 * @see #unsetRatedCapacityP()
	 * @see #getRatedCapacityP()
	 * @see #setRatedCapacityP(float)
	 * @generated
	 */
	public boolean isSetRatedCapacityP() {
		return ratedCapacityPESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant
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
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
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
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Energy Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Storage Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Storage Capacity</em>' attribute.
	 * @see #isSetEnergyStorageCapacity()
	 * @see #unsetEnergyStorageCapacity()
	 * @see #setEnergyStorageCapacity(float)
	 * @generated
	 */
	public float getEnergyStorageCapacity() {
		return energyStorageCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Storage Capacity</em>' attribute.
	 * @see #isSetEnergyStorageCapacity()
	 * @see #unsetEnergyStorageCapacity()
	 * @see #getEnergyStorageCapacity()
	 * @generated
	 */
	public void setEnergyStorageCapacity(float newEnergyStorageCapacity) {
		energyStorageCapacity = newEnergyStorageCapacity;
		energyStorageCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyStorageCapacity()
	 * @see #getEnergyStorageCapacity()
	 * @see #setEnergyStorageCapacity(float)
	 * @generated
	 */
	public void unsetEnergyStorageCapacity() {
		energyStorageCapacity = ENERGY_STORAGE_CAPACITY_EDEFAULT;
		energyStorageCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Storage Capacity</em>' attribute is set.
	 * @see #unsetEnergyStorageCapacity()
	 * @see #getEnergyStorageCapacity()
	 * @see #setEnergyStorageCapacity(float)
	 * @generated
	 */
	public boolean isSetEnergyStorageCapacity() {
		return energyStorageCapacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				if (airCompressor != null)
					msgs = ((InternalEObject)airCompressor).eInverseRemove(this, ProductionPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs);
				return basicSetAirCompressor((AirCompressor)otherEnd, msgs);
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs);
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
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				return basicSetAirCompressor(null, msgs);
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
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
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				if (resolve) return getAirCompressor();
				return basicGetAirCompressor();
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				return getRatedCapacityP();
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				return getEnergyStorageCapacity();
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
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)newValue);
				return;
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				setRatedCapacityP((Float)newValue);
				return;
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
				return;
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				setEnergyStorageCapacity((Float)newValue);
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
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				setAirCompressor((AirCompressor)null);
				return;
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				unsetRatedCapacityP();
				return;
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
				return;
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				unsetEnergyStorageCapacity();
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
			case ProductionPackage.CAES_PLANT__AIR_COMPRESSOR:
				return airCompressor != null;
			case ProductionPackage.CAES_PLANT__RATED_CAPACITY_P:
				return isSetRatedCapacityP();
			case ProductionPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
			case ProductionPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
				return isSetEnergyStorageCapacity();
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
		result.append(" (ratedCapacityP: ");
		if (ratedCapacityPESet) result.append(ratedCapacityP); else result.append("<unset>");
		result.append(", energyStorageCapacity: ");
		if (energyStorageCapacityESet) result.append(energyStorageCapacity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CAESPlant
