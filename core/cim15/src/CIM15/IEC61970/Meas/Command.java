/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Command#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Command extends Control {
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
	 * The cached value of the '{@link #getValueAliasSet() <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAliasSet()
	 * @generated
	 * @ordered
	 */
	protected ValueAliasSet valueAliasSet;

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
	 * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected int normalValue = NORMAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Normal Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Command() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.COMMAND;
	}

	/**
	 * Returns the value of the '<em><b>Discrete</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Discrete#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete</em>' reference.
	 * @see #setDiscrete(Discrete)
	 * @see CIM15.IEC61970.Meas.Discrete#getCommand
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}' reference.
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
				msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__COMMAND, Discrete.class, msgs);
			if (newDiscrete != null)
				msgs = ((InternalEObject)newDiscrete).eInverseAdd(this, MeasPackage.DISCRETE__COMMAND, Discrete.class, msgs);
			msgs = basicSetDiscrete(newDiscrete, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.ValueAliasSet#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Alias Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Alias Set</em>' reference.
	 * @see #setValueAliasSet(ValueAliasSet)
	 * @see CIM15.IEC61970.Meas.ValueAliasSet#getCommands
	 * @generated
	 */
	public ValueAliasSet getValueAliasSet() {
		if (valueAliasSet != null && valueAliasSet.eIsProxy()) {
			InternalEObject oldValueAliasSet = (InternalEObject)valueAliasSet;
			valueAliasSet = (ValueAliasSet)eResolveProxy(oldValueAliasSet);
			if (valueAliasSet != oldValueAliasSet) {
			}
		}
		return valueAliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAliasSet basicGetValueAliasSet() {
		return valueAliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAliasSet(ValueAliasSet newValueAliasSet, NotificationChain msgs) {
		ValueAliasSet oldValueAliasSet = valueAliasSet;
		valueAliasSet = newValueAliasSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Alias Set</em>' reference.
	 * @see #getValueAliasSet()
	 * @generated
	 */
	public void setValueAliasSet(ValueAliasSet newValueAliasSet) {
		if (newValueAliasSet != valueAliasSet) {
			NotificationChain msgs = null;
			if (valueAliasSet != null)
				msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs);
			if (newValueAliasSet != null)
				msgs = ((InternalEObject)newValueAliasSet).eInverseAdd(this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs);
			msgs = basicSetValueAliasSet(newValueAliasSet, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Command#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Command#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Command#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #isSetNormalValue()
	 * @see #unsetNormalValue()
	 * @see #setNormalValue(int)
	 * @generated
	 */
	public int getNormalValue() {
		return normalValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #isSetNormalValue()
	 * @see #unsetNormalValue()
	 * @see #getNormalValue()
	 * @generated
	 */
	public void setNormalValue(int newNormalValue) {
		normalValue = newNormalValue;
		normalValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalValue()
	 * @see #getNormalValue()
	 * @see #setNormalValue(int)
	 * @generated
	 */
	public void unsetNormalValue() {
		normalValue = NORMAL_VALUE_EDEFAULT;
		normalValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Value</em>' attribute is set.
	 * @see #unsetNormalValue()
	 * @see #getNormalValue()
	 * @see #setNormalValue(int)
	 * @generated
	 */
	public boolean isSetNormalValue() {
		return normalValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.COMMAND__DISCRETE:
				if (discrete != null)
					msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__COMMAND, Discrete.class, msgs);
				return basicSetDiscrete((Discrete)otherEnd, msgs);
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				if (valueAliasSet != null)
					msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs);
				return basicSetValueAliasSet((ValueAliasSet)otherEnd, msgs);
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
			case MeasPackage.COMMAND__DISCRETE:
				return basicSetDiscrete(null, msgs);
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				return basicSetValueAliasSet(null, msgs);
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
			case MeasPackage.COMMAND__DISCRETE:
				if (resolve) return getDiscrete();
				return basicGetDiscrete();
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				if (resolve) return getValueAliasSet();
				return basicGetValueAliasSet();
			case MeasPackage.COMMAND__VALUE:
				return getValue();
			case MeasPackage.COMMAND__NORMAL_VALUE:
				return getNormalValue();
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
			case MeasPackage.COMMAND__DISCRETE:
				setDiscrete((Discrete)newValue);
				return;
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)newValue);
				return;
			case MeasPackage.COMMAND__VALUE:
				setValue((Integer)newValue);
				return;
			case MeasPackage.COMMAND__NORMAL_VALUE:
				setNormalValue((Integer)newValue);
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
			case MeasPackage.COMMAND__DISCRETE:
				setDiscrete((Discrete)null);
				return;
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)null);
				return;
			case MeasPackage.COMMAND__VALUE:
				unsetValue();
				return;
			case MeasPackage.COMMAND__NORMAL_VALUE:
				unsetNormalValue();
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
			case MeasPackage.COMMAND__DISCRETE:
				return discrete != null;
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				return valueAliasSet != null;
			case MeasPackage.COMMAND__VALUE:
				return isSetValue();
			case MeasPackage.COMMAND__NORMAL_VALUE:
				return isSetNormalValue();
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
		result.append(", normalValue: ");
		if (normalValueESet) result.append(normalValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Command
