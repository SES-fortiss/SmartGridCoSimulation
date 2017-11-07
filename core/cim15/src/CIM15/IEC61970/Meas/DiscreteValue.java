/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteValue extends MeasurementValue {
	/**
	 * The cached value of the '{@link #getDiscrete() <em>Discrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrete()
	 * @generated
	 * @ordered
	 */
	protected Discrete discrete;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteValue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.DISCRETE_VALUE;
	}

	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Discrete#getDiscreteValues <em>Discrete Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' reference.
	 * @see #setDiscrete(Discrete)
	 * @see CIM15.IEC61970.Meas.Discrete#getDiscreteValues
	 * @generated
	 */
	public Discrete getDiscrete() {
		if (discrete != null && discrete.eIsProxy()) {
			InternalEObject oldDiscrete = (InternalEObject)discrete;
			discrete = (Discrete)eResolveProxy(oldDiscrete);
			if (discrete != oldDiscrete) {
			}
		}
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete basicGetDiscrete() {
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscrete(Discrete newDiscrete, NotificationChain msgs) {
		Discrete oldDiscrete = discrete;
		discrete = newDiscrete;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete</em>' reference.
	 * @see #getDiscrete()
	 * @generated
	 */
	public void setDiscrete(Discrete newDiscrete) {
		if (newDiscrete != discrete) {
			NotificationChain msgs = null;
			if (discrete != null)
				msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__DISCRETE_VALUES, Discrete.class, msgs);
			if (newDiscrete != null)
				msgs = ((InternalEObject)newDiscrete).eInverseAdd(this, MeasPackage.DISCRETE__DISCRETE_VALUES, Discrete.class, msgs);
			msgs = basicSetDiscrete(newDiscrete, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(int)
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(int newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				if (discrete != null)
					msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__DISCRETE_VALUES, Discrete.class, msgs);
				return basicSetDiscrete((Discrete)otherEnd, msgs);
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				return basicSetDiscrete(null, msgs);
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				if (resolve) return getDiscrete();
				return basicGetDiscrete();
			case MeasPackage.DISCRETE_VALUE__VALUE:
				return getValue();
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				setDiscrete((Discrete)newValue);
				return;
			case MeasPackage.DISCRETE_VALUE__VALUE:
				setValue((Integer)newValue);
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				setDiscrete((Discrete)null);
				return;
			case MeasPackage.DISCRETE_VALUE__VALUE:
				unsetValue();
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				return discrete != null;
			case MeasPackage.DISCRETE_VALUE__VALUE:
				return isSetValue();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DiscreteValue
