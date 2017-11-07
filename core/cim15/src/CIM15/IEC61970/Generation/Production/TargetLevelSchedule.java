/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Level Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetLevelSchedule extends Curve {
	/**
	 * The default value of the '{@link #getLowLevelLimit() <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_LEVEL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowLevelLimit() <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowLevelLimit = LOW_LEVEL_LIMIT_EDEFAULT;

	/**
	 * This is true if the Low Level Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowLevelLimitESet;

	/**
	 * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir reservoir;

	/**
	 * The default value of the '{@link #getHighLevelLimit() <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_LEVEL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighLevelLimit() <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected float highLevelLimit = HIGH_LEVEL_LIMIT_EDEFAULT;

	/**
	 * This is true if the High Level Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highLevelLimitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetLevelSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.TARGET_LEVEL_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Low Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Level Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Level Limit</em>' attribute.
	 * @see #isSetLowLevelLimit()
	 * @see #unsetLowLevelLimit()
	 * @see #setLowLevelLimit(float)
	 * @generated
	 */
	public float getLowLevelLimit() {
		return lowLevelLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Level Limit</em>' attribute.
	 * @see #isSetLowLevelLimit()
	 * @see #unsetLowLevelLimit()
	 * @see #getLowLevelLimit()
	 * @generated
	 */
	public void setLowLevelLimit(float newLowLevelLimit) {
		lowLevelLimit = newLowLevelLimit;
		lowLevelLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowLevelLimit()
	 * @see #getLowLevelLimit()
	 * @see #setLowLevelLimit(float)
	 * @generated
	 */
	public void unsetLowLevelLimit() {
		lowLevelLimit = LOW_LEVEL_LIMIT_EDEFAULT;
		lowLevelLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Level Limit</em>' attribute is set.
	 * @see #unsetLowLevelLimit()
	 * @see #getLowLevelLimit()
	 * @see #setLowLevelLimit(float)
	 * @generated
	 */
	public boolean isSetLowLevelLimit() {
		return lowLevelLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservoir</em>' reference.
	 * @see #setReservoir(Reservoir)
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule
	 * @generated
	 */
	public Reservoir getReservoir() {
		if (reservoir != null && reservoir.eIsProxy()) {
			InternalEObject oldReservoir = (InternalEObject)reservoir;
			reservoir = (Reservoir)eResolveProxy(oldReservoir);
			if (reservoir != oldReservoir) {
			}
		}
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetReservoir() {
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservoir(Reservoir newReservoir, NotificationChain msgs) {
		Reservoir oldReservoir = reservoir;
		reservoir = newReservoir;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservoir</em>' reference.
	 * @see #getReservoir()
	 * @generated
	 */
	public void setReservoir(Reservoir newReservoir) {
		if (newReservoir != reservoir) {
			NotificationChain msgs = null;
			if (reservoir != null)
				msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs);
			if (newReservoir != null)
				msgs = ((InternalEObject)newReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs);
			msgs = basicSetReservoir(newReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>High Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Level Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Level Limit</em>' attribute.
	 * @see #isSetHighLevelLimit()
	 * @see #unsetHighLevelLimit()
	 * @see #setHighLevelLimit(float)
	 * @generated
	 */
	public float getHighLevelLimit() {
		return highLevelLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Level Limit</em>' attribute.
	 * @see #isSetHighLevelLimit()
	 * @see #unsetHighLevelLimit()
	 * @see #getHighLevelLimit()
	 * @generated
	 */
	public void setHighLevelLimit(float newHighLevelLimit) {
		highLevelLimit = newHighLevelLimit;
		highLevelLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighLevelLimit()
	 * @see #getHighLevelLimit()
	 * @see #setHighLevelLimit(float)
	 * @generated
	 */
	public void unsetHighLevelLimit() {
		highLevelLimit = HIGH_LEVEL_LIMIT_EDEFAULT;
		highLevelLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Level Limit</em>' attribute is set.
	 * @see #unsetHighLevelLimit()
	 * @see #getHighLevelLimit()
	 * @see #setHighLevelLimit(float)
	 * @generated
	 */
	public boolean isSetHighLevelLimit() {
		return highLevelLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				if (reservoir != null)
					msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs);
				return basicSetReservoir((Reservoir)otherEnd, msgs);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				return basicSetReservoir(null, msgs);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				return getLowLevelLimit();
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				if (resolve) return getReservoir();
				return basicGetReservoir();
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				return getHighLevelLimit();
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				setLowLevelLimit((Float)newValue);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				setReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				setHighLevelLimit((Float)newValue);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				unsetLowLevelLimit();
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				setReservoir((Reservoir)null);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				unsetHighLevelLimit();
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				return isSetLowLevelLimit();
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				return reservoir != null;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				return isSetHighLevelLimit();
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
		result.append(" (lowLevelLimit: ");
		if (lowLevelLimitESet) result.append(lowLevelLimit); else result.append("<unset>");
		result.append(", highLevelLimit: ");
		if (highLevelLimitESet) result.append(highLevelLimit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TargetLevelSchedule
