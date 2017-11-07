/**
 */
package CIM15.IEC61970.Meas;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Discrete#getCommand <em>Command</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Discrete#getDiscreteValues <em>Discrete Values</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Discrete extends Measurement {
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
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected int minValue = MIN_VALUE_EDEFAULT;

	/**
	 * This is true if the Min Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minValueESet;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

	/**
	 * The cached value of the '{@link #getDiscreteValues() <em>Discrete Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteValue> discreteValues;

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
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * This is true if the Max Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Discrete() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.DISCRETE;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	public void setMinValue(int newMinValue) {
		minValue = newMinValue;
		minValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	public void unsetMinValue() {
		minValue = MIN_VALUE_EDEFAULT;
		minValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	public boolean isSetMinValue() {
		return minValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see CIM15.IEC61970.Meas.Command#getDiscrete
	 * @generated
	 */
	public Command getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (Command)eResolveProxy(oldCommand);
			if (command != oldCommand) {
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs) {
		Command oldCommand = command;
		command = newCommand;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, MeasPackage.COMMAND__DISCRETE, Command.class, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, MeasPackage.COMMAND__DISCRETE, Command.class, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Discrete Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.DiscreteValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.DiscreteValue#getDiscrete
	 * @generated
	 */
	public EList<DiscreteValue> getDiscreteValues() {
		if (discreteValues == null) {
			discreteValues = new BasicInternalEList<DiscreteValue>(DiscreteValue.class);
		}
		return discreteValues;
	}

	/**
	 * Returns the value of the '<em><b>Value Alias Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.ValueAliasSet#getDiscretes <em>Discretes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Alias Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Alias Set</em>' reference.
	 * @see #setValueAliasSet(ValueAliasSet)
	 * @see CIM15.IEC61970.Meas.ValueAliasSet#getDiscretes
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}' reference.
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
				msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs);
			if (newValueAliasSet != null)
				msgs = ((InternalEObject)newValueAliasSet).eInverseAdd(this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs);
			msgs = basicSetValueAliasSet(newValueAliasSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		maxValue = newMaxValue;
		maxValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	public void unsetMaxValue() {
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return maxValueESet;
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
			case MeasPackage.DISCRETE__COMMAND:
				if (command != null)
					msgs = ((InternalEObject)command).eInverseRemove(this, MeasPackage.COMMAND__DISCRETE, Command.class, msgs);
				return basicSetCommand((Command)otherEnd, msgs);
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiscreteValues()).basicAdd(otherEnd, msgs);
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				if (valueAliasSet != null)
					msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs);
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
			case MeasPackage.DISCRETE__COMMAND:
				return basicSetCommand(null, msgs);
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return ((InternalEList<?>)getDiscreteValues()).basicRemove(otherEnd, msgs);
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
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
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.DISCRETE__MIN_VALUE:
				return getMinValue();
			case MeasPackage.DISCRETE__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return getDiscreteValues();
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				if (resolve) return getValueAliasSet();
				return basicGetValueAliasSet();
			case MeasPackage.DISCRETE__MAX_VALUE:
				return getMaxValue();
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
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				setNormalValue((Integer)newValue);
				return;
			case MeasPackage.DISCRETE__MIN_VALUE:
				setMinValue((Integer)newValue);
				return;
			case MeasPackage.DISCRETE__COMMAND:
				setCommand((Command)newValue);
				return;
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				getDiscreteValues().clear();
				getDiscreteValues().addAll((Collection<? extends DiscreteValue>)newValue);
				return;
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)newValue);
				return;
			case MeasPackage.DISCRETE__MAX_VALUE:
				setMaxValue((Integer)newValue);
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
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				unsetNormalValue();
				return;
			case MeasPackage.DISCRETE__MIN_VALUE:
				unsetMinValue();
				return;
			case MeasPackage.DISCRETE__COMMAND:
				setCommand((Command)null);
				return;
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				getDiscreteValues().clear();
				return;
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)null);
				return;
			case MeasPackage.DISCRETE__MAX_VALUE:
				unsetMaxValue();
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
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				return isSetNormalValue();
			case MeasPackage.DISCRETE__MIN_VALUE:
				return isSetMinValue();
			case MeasPackage.DISCRETE__COMMAND:
				return command != null;
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return discreteValues != null && !discreteValues.isEmpty();
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				return valueAliasSet != null;
			case MeasPackage.DISCRETE__MAX_VALUE:
				return isSetMaxValue();
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
		result.append(" (normalValue: ");
		if (normalValueESet) result.append(normalValue); else result.append("<unset>");
		result.append(", minValue: ");
		if (minValueESet) result.append(minValue); else result.append("<unset>");
		result.append(", maxValue: ");
		if (maxValueESet) result.append(maxValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Discrete
