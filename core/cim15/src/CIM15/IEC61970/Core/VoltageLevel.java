/**
 */
package CIM15.IEC61970.Core;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.VoltageLevel#getBays <em>Bays</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoltageLevel extends EquipmentContainer {
	/**
	 * The default value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighVoltageLimit() <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected float highVoltageLimit = HIGH_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * This is true if the High Voltage Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highVoltageLimitESet;

	/**
	 * The cached value of the '{@link #getBays() <em>Bays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBays()
	 * @generated
	 * @ordered
	 */
	protected EList<Bay> bays;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected Substation substation;

	/**
	 * The default value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_VOLTAGE_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowVoltageLimit() <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowVoltageLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowVoltageLimit = LOW_VOLTAGE_LIMIT_EDEFAULT;

	/**
	 * This is true if the Low Voltage Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowVoltageLimitESet;

	/**
	 * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVoltage()
	 * @generated
	 * @ordered
	 */
	protected BaseVoltage baseVoltage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageLevel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VOLTAGE_LEVEL;
	}

	/**
	 * Returns the value of the '<em><b>High Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Voltage Limit</em>' attribute.
	 * @see #isSetHighVoltageLimit()
	 * @see #unsetHighVoltageLimit()
	 * @see #setHighVoltageLimit(float)
	 * @generated
	 */
	public float getHighVoltageLimit() {
		return highVoltageLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Voltage Limit</em>' attribute.
	 * @see #isSetHighVoltageLimit()
	 * @see #unsetHighVoltageLimit()
	 * @see #getHighVoltageLimit()
	 * @generated
	 */
	public void setHighVoltageLimit(float newHighVoltageLimit) {
		highVoltageLimit = newHighVoltageLimit;
		highVoltageLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighVoltageLimit()
	 * @see #getHighVoltageLimit()
	 * @see #setHighVoltageLimit(float)
	 * @generated
	 */
	public void unsetHighVoltageLimit() {
		highVoltageLimit = HIGH_VOLTAGE_LIMIT_EDEFAULT;
		highVoltageLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Voltage Limit</em>' attribute is set.
	 * @see #unsetHighVoltageLimit()
	 * @see #getHighVoltageLimit()
	 * @see #setHighVoltageLimit(float)
	 * @generated
	 */
	public boolean isSetHighVoltageLimit() {
		return highVoltageLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Bays</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Bay}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Bay#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bays</em>' reference list.
	 * @see CIM15.IEC61970.Core.Bay#getVoltageLevel
	 * @generated
	 */
	public EList<Bay> getBays() {
		if (bays == null) {
			bays = new BasicInternalEList<Bay>(Bay.class);
		}
		return bays;
	}

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Substation#getVoltageLevels <em>Voltage Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' reference.
	 * @see #setSubstation(Substation)
	 * @see CIM15.IEC61970.Core.Substation#getVoltageLevels
	 * @generated
	 */
	public Substation getSubstation() {
		if (substation != null && substation.eIsProxy()) {
			InternalEObject oldSubstation = (InternalEObject)substation;
			substation = (Substation)eResolveProxy(oldSubstation);
			if (substation != oldSubstation) {
			}
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation basicGetSubstation() {
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstation(Substation newSubstation, NotificationChain msgs) {
		Substation oldSubstation = substation;
		substation = newSubstation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substation</em>' reference.
	 * @see #getSubstation()
	 * @generated
	 */
	public void setSubstation(Substation newSubstation) {
		if (newSubstation != substation) {
			NotificationChain msgs = null;
			if (substation != null)
				msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs);
			if (newSubstation != null)
				msgs = ((InternalEObject)newSubstation).eInverseAdd(this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs);
			msgs = basicSetSubstation(newSubstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Low Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Voltage Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Voltage Limit</em>' attribute.
	 * @see #isSetLowVoltageLimit()
	 * @see #unsetLowVoltageLimit()
	 * @see #setLowVoltageLimit(float)
	 * @generated
	 */
	public float getLowVoltageLimit() {
		return lowVoltageLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Voltage Limit</em>' attribute.
	 * @see #isSetLowVoltageLimit()
	 * @see #unsetLowVoltageLimit()
	 * @see #getLowVoltageLimit()
	 * @generated
	 */
	public void setLowVoltageLimit(float newLowVoltageLimit) {
		lowVoltageLimit = newLowVoltageLimit;
		lowVoltageLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowVoltageLimit()
	 * @see #getLowVoltageLimit()
	 * @see #setLowVoltageLimit(float)
	 * @generated
	 */
	public void unsetLowVoltageLimit() {
		lowVoltageLimit = LOW_VOLTAGE_LIMIT_EDEFAULT;
		lowVoltageLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Voltage Limit</em>' attribute is set.
	 * @see #unsetLowVoltageLimit()
	 * @see #getLowVoltageLimit()
	 * @see #setLowVoltageLimit(float)
	 * @generated
	 */
	public boolean isSetLowVoltageLimit() {
		return lowVoltageLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see CIM15.IEC61970.Core.BaseVoltage#getVoltageLevel
	 * @generated
	 */
	public BaseVoltage getBaseVoltage() {
		if (baseVoltage != null && baseVoltage.eIsProxy()) {
			InternalEObject oldBaseVoltage = (InternalEObject)baseVoltage;
			baseVoltage = (BaseVoltage)eResolveProxy(oldBaseVoltage);
			if (baseVoltage != oldBaseVoltage) {
			}
		}
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage basicGetBaseVoltage() {
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVoltage(BaseVoltage newBaseVoltage, NotificationChain msgs) {
		BaseVoltage oldBaseVoltage = baseVoltage;
		baseVoltage = newBaseVoltage;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public void setBaseVoltage(BaseVoltage newBaseVoltage) {
		if (newBaseVoltage != baseVoltage) {
			NotificationChain msgs = null;
			if (baseVoltage != null)
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBays()).basicAdd(otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				if (substation != null)
					msgs = ((InternalEObject)substation).eInverseRemove(this, CorePackage.SUBSTATION__VOLTAGE_LEVELS, Substation.class, msgs);
				return basicSetSubstation((Substation)otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
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
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return ((InternalEList<?>)getBays()).basicRemove(otherEnd, msgs);
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				return basicSetSubstation(null, msgs);
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
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
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				return getHighVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return getBays();
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				if (resolve) return getSubstation();
				return basicGetSubstation();
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				return getLowVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
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
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				setHighVoltageLimit((Float)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				getBays().clear();
				getBays().addAll((Collection<? extends Bay>)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				setSubstation((Substation)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				setLowVoltageLimit((Float)newValue);
				return;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
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
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				unsetHighVoltageLimit();
				return;
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				getBays().clear();
				return;
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				setSubstation((Substation)null);
				return;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				unsetLowVoltageLimit();
				return;
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
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
			case CorePackage.VOLTAGE_LEVEL__HIGH_VOLTAGE_LIMIT:
				return isSetHighVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__BAYS:
				return bays != null && !bays.isEmpty();
			case CorePackage.VOLTAGE_LEVEL__SUBSTATION:
				return substation != null;
			case CorePackage.VOLTAGE_LEVEL__LOW_VOLTAGE_LIMIT:
				return isSetLowVoltageLimit();
			case CorePackage.VOLTAGE_LEVEL__BASE_VOLTAGE:
				return baseVoltage != null;
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
		result.append(" (highVoltageLimit: ");
		if (highVoltageLimitESet) result.append(highVoltageLimit); else result.append("<unset>");
		result.append(", lowVoltageLimit: ");
		if (lowVoltageLimitESet) result.append(lowVoltageLimit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // VoltageLevel
