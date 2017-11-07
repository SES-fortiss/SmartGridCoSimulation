/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.Curve;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactiveCapabilityCurve extends Curve {
	/**
	 * The cached value of the '{@link #getInitiallyUsedBySynchronousMachines() <em>Initially Used By Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiallyUsedBySynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> initiallyUsedBySynchronousMachines;

	/**
	 * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> synchronousMachines;

	/**
	 * The default value of the '{@link #getHydrogenPressure() <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydrogenPressure()
	 * @generated
	 * @ordered
	 */
	protected static final float HYDROGEN_PRESSURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHydrogenPressure() <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydrogenPressure()
	 * @generated
	 * @ordered
	 */
	protected float hydrogenPressure = HYDROGEN_PRESSURE_EDEFAULT;

	/**
	 * This is true if the Hydrogen Pressure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hydrogenPressureESet;

	/**
	 * The default value of the '{@link #getCoolantTemperature() <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float COOLANT_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoolantTemperature() <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantTemperature()
	 * @generated
	 * @ordered
	 */
	protected float coolantTemperature = COOLANT_TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Coolant Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coolantTemperatureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactiveCapabilityCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REACTIVE_CAPABILITY_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initially Used By Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initially Used By Synchronous Machines</em>' reference list.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve
	 * @generated
	 */
	public EList<SynchronousMachine> getInitiallyUsedBySynchronousMachines() {
		if (initiallyUsedBySynchronousMachines == null) {
			initiallyUsedBySynchronousMachines = new BasicInternalEList<SynchronousMachine>(SynchronousMachine.class);
		}
		return initiallyUsedBySynchronousMachines;
	}

	/**
	 * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machines</em>' reference list.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves
	 * @generated
	 */
	public EList<SynchronousMachine> getSynchronousMachines() {
		if (synchronousMachines == null) {
			synchronousMachines = new BasicInternalEList<SynchronousMachine>(SynchronousMachine.class);
		}
		return synchronousMachines;
	}

	/**
	 * Returns the value of the '<em><b>Hydrogen Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydrogen Pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydrogen Pressure</em>' attribute.
	 * @see #isSetHydrogenPressure()
	 * @see #unsetHydrogenPressure()
	 * @see #setHydrogenPressure(float)
	 * @generated
	 */
	public float getHydrogenPressure() {
		return hydrogenPressure;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydrogen Pressure</em>' attribute.
	 * @see #isSetHydrogenPressure()
	 * @see #unsetHydrogenPressure()
	 * @see #getHydrogenPressure()
	 * @generated
	 */
	public void setHydrogenPressure(float newHydrogenPressure) {
		hydrogenPressure = newHydrogenPressure;
		hydrogenPressureESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHydrogenPressure()
	 * @see #getHydrogenPressure()
	 * @see #setHydrogenPressure(float)
	 * @generated
	 */
	public void unsetHydrogenPressure() {
		hydrogenPressure = HYDROGEN_PRESSURE_EDEFAULT;
		hydrogenPressureESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hydrogen Pressure</em>' attribute is set.
	 * @see #unsetHydrogenPressure()
	 * @see #getHydrogenPressure()
	 * @see #setHydrogenPressure(float)
	 * @generated
	 */
	public boolean isSetHydrogenPressure() {
		return hydrogenPressureESet;
	}

	/**
	 * Returns the value of the '<em><b>Coolant Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coolant Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coolant Temperature</em>' attribute.
	 * @see #isSetCoolantTemperature()
	 * @see #unsetCoolantTemperature()
	 * @see #setCoolantTemperature(float)
	 * @generated
	 */
	public float getCoolantTemperature() {
		return coolantTemperature;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coolant Temperature</em>' attribute.
	 * @see #isSetCoolantTemperature()
	 * @see #unsetCoolantTemperature()
	 * @see #getCoolantTemperature()
	 * @generated
	 */
	public void setCoolantTemperature(float newCoolantTemperature) {
		coolantTemperature = newCoolantTemperature;
		coolantTemperatureESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoolantTemperature()
	 * @see #getCoolantTemperature()
	 * @see #setCoolantTemperature(float)
	 * @generated
	 */
	public void unsetCoolantTemperature() {
		coolantTemperature = COOLANT_TEMPERATURE_EDEFAULT;
		coolantTemperatureESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coolant Temperature</em>' attribute is set.
	 * @see #unsetCoolantTemperature()
	 * @see #getCoolantTemperature()
	 * @see #setCoolantTemperature(float)
	 * @generated
	 */
	public boolean isSetCoolantTemperature() {
		return coolantTemperatureESet;
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitiallyUsedBySynchronousMachines()).basicAdd(otherEnd, msgs);
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronousMachines()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getInitiallyUsedBySynchronousMachines()).basicRemove(otherEnd, msgs);
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getSynchronousMachines()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return getInitiallyUsedBySynchronousMachines();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return getSynchronousMachines();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				return getHydrogenPressure();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				return getCoolantTemperature();
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				getInitiallyUsedBySynchronousMachines().clear();
				getInitiallyUsedBySynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				getSynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				setHydrogenPressure((Float)newValue);
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				setCoolantTemperature((Float)newValue);
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				getInitiallyUsedBySynchronousMachines().clear();
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				unsetHydrogenPressure();
				return;
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				unsetCoolantTemperature();
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
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
				return initiallyUsedBySynchronousMachines != null && !initiallyUsedBySynchronousMachines.isEmpty();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
				return synchronousMachines != null && !synchronousMachines.isEmpty();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
				return isSetHydrogenPressure();
			case WiresPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
				return isSetCoolantTemperature();
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
		result.append(" (hydrogenPressure: ");
		if (hydrogenPressureESet) result.append(hydrogenPressure); else result.append("<unset>");
		result.append(", coolantTemperature: ");
		if (coolantTemperatureESet) result.append(coolantTemperature); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ReactiveCapabilityCurve
