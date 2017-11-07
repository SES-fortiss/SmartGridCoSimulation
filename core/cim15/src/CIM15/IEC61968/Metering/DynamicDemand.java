/**
 */
package CIM15.IEC61968.Metering;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicDemand extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getSubInterval() <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float SUB_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSubInterval() <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInterval()
	 * @generated
	 * @ordered
	 */
	protected float subInterval = SUB_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Sub Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subIntervalESet;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected float interval = INTERVAL_EDEFAULT;

	/**
	 * This is true if the Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DemandKind KIND_EDEFAULT = DemandKind.FIXED_BLOCK;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DemandKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicDemand() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.DYNAMIC_DEMAND;
	}

	/**
	 * Returns the value of the '<em><b>Sub Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Interval</em>' attribute.
	 * @see #isSetSubInterval()
	 * @see #unsetSubInterval()
	 * @see #setSubInterval(float)
	 * @generated
	 */
	public float getSubInterval() {
		return subInterval;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Interval</em>' attribute.
	 * @see #isSetSubInterval()
	 * @see #unsetSubInterval()
	 * @see #getSubInterval()
	 * @generated
	 */
	public void setSubInterval(float newSubInterval) {
		subInterval = newSubInterval;
		subIntervalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubInterval()
	 * @see #getSubInterval()
	 * @see #setSubInterval(float)
	 * @generated
	 */
	public void unsetSubInterval() {
		subInterval = SUB_INTERVAL_EDEFAULT;
		subIntervalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getSubInterval <em>Sub Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Interval</em>' attribute is set.
	 * @see #unsetSubInterval()
	 * @see #getSubInterval()
	 * @see #setSubInterval(float)
	 * @generated
	 */
	public boolean isSetSubInterval() {
		return subIntervalESet;
	}

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #isSetInterval()
	 * @see #unsetInterval()
	 * @see #setInterval(float)
	 * @generated
	 */
	public float getInterval() {
		return interval;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #isSetInterval()
	 * @see #unsetInterval()
	 * @see #getInterval()
	 * @generated
	 */
	public void setInterval(float newInterval) {
		interval = newInterval;
		intervalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterval()
	 * @see #getInterval()
	 * @see #setInterval(float)
	 * @generated
	 */
	public void unsetInterval() {
		interval = INTERVAL_EDEFAULT;
		intervalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getInterval <em>Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval</em>' attribute is set.
	 * @see #unsetInterval()
	 * @see #getInterval()
	 * @see #setInterval(float)
	 * @generated
	 */
	public boolean isSetInterval() {
		return intervalESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Metering.DemandKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Metering.DemandKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(DemandKind)
	 * @generated
	 */
	public DemandKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Metering.DemandKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(DemandKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(DemandKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.DynamicDemand#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(DemandKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				return getSubInterval();
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				return getInterval();
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				return getKind();
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
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				setSubInterval((Float)newValue);
				return;
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				setInterval((Float)newValue);
				return;
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				setKind((DemandKind)newValue);
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
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				unsetSubInterval();
				return;
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				unsetInterval();
				return;
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				unsetKind();
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
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				return isSetSubInterval();
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				return isSetInterval();
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				return isSetKind();
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
		result.append(" (subInterval: ");
		if (subIntervalESet) result.append(subInterval); else result.append("<unset>");
		result.append(", interval: ");
		if (intervalESet) result.append(interval); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DynamicDemand
