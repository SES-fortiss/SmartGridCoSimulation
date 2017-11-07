/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.RegularIntervalSchedule;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Pump Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HydroPumpOpSchedule extends RegularIntervalSchedule {
	/**
	 * The cached value of the '{@link #getHydroPump() <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPump()
	 * @generated
	 * @ordered
	 */
	protected HydroPump hydroPump;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroPumpOpSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_PUMP_OP_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Pump</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pump</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pump</em>' reference.
	 * @see #setHydroPump(HydroPump)
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule
	 * @generated
	 */
	public HydroPump getHydroPump() {
		if (hydroPump != null && hydroPump.eIsProxy()) {
			InternalEObject oldHydroPump = (InternalEObject)hydroPump;
			hydroPump = (HydroPump)eResolveProxy(oldHydroPump);
			if (hydroPump != oldHydroPump) {
			}
		}
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump basicGetHydroPump() {
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPump(HydroPump newHydroPump, NotificationChain msgs) {
		HydroPump oldHydroPump = hydroPump;
		hydroPump = newHydroPump;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Pump</em>' reference.
	 * @see #getHydroPump()
	 * @generated
	 */
	public void setHydroPump(HydroPump newHydroPump) {
		if (newHydroPump != hydroPump) {
			NotificationChain msgs = null;
			if (hydroPump != null)
				msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs);
			if (newHydroPump != null)
				msgs = ((InternalEObject)newHydroPump).eInverseAdd(this, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs);
			msgs = basicSetHydroPump(newHydroPump, msgs);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				if (hydroPump != null)
					msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs);
				return basicSetHydroPump((HydroPump)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				return basicSetHydroPump(null, msgs);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				if (resolve) return getHydroPump();
				return basicGetHydroPump();
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				setHydroPump((HydroPump)newValue);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				setHydroPump((HydroPump)null);
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
			case ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
				return hydroPump != null;
		}
		return super.eIsSet(featureID);
	}

} // HydroPumpOpSchedule
