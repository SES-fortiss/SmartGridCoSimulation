/**
 */
package CIM15.IEC61970.Meas.util;

import CIM15.Element;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Meas.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Meas.MeasPackage
 * @generated
 */
public class MeasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasSwitch() {
		if (modelPackage == null) {
			modelPackage = MeasPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MeasPackage.ACCUMULATOR_LIMIT: {
				AccumulatorLimit accumulatorLimit = (AccumulatorLimit)theEObject;
				T result = caseAccumulatorLimit(accumulatorLimit);
				if (result == null) result = caseLimit(accumulatorLimit);
				if (result == null) result = caseIdentifiedObject(accumulatorLimit);
				if (result == null) result = caseElement(accumulatorLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.VALUE_TO_ALIAS: {
				ValueToAlias valueToAlias = (ValueToAlias)theEObject;
				T result = caseValueToAlias(valueToAlias);
				if (result == null) result = caseIdentifiedObject(valueToAlias);
				if (result == null) result = caseElement(valueToAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.MEASUREMENT_VALUE_SOURCE: {
				MeasurementValueSource measurementValueSource = (MeasurementValueSource)theEObject;
				T result = caseMeasurementValueSource(measurementValueSource);
				if (result == null) result = caseIdentifiedObject(measurementValueSource);
				if (result == null) result = caseElement(measurementValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ANALOG: {
				Analog analog = (Analog)theEObject;
				T result = caseAnalog(analog);
				if (result == null) result = caseMeasurement(analog);
				if (result == null) result = caseIdentifiedObject(analog);
				if (result == null) result = caseElement(analog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ANALOG_VALUE: {
				AnalogValue analogValue = (AnalogValue)theEObject;
				T result = caseAnalogValue(analogValue);
				if (result == null) result = caseMeasurementValue(analogValue);
				if (result == null) result = caseIdentifiedObject(analogValue);
				if (result == null) result = caseElement(analogValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = caseIdentifiedObject(measurement);
				if (result == null) result = caseElement(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.CONTROL_TYPE: {
				ControlType controlType = (ControlType)theEObject;
				T result = caseControlType(controlType);
				if (result == null) result = caseIdentifiedObject(controlType);
				if (result == null) result = caseElement(controlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.STRING_MEASUREMENT_VALUE: {
				StringMeasurementValue stringMeasurementValue = (StringMeasurementValue)theEObject;
				T result = caseStringMeasurementValue(stringMeasurementValue);
				if (result == null) result = caseMeasurementValue(stringMeasurementValue);
				if (result == null) result = caseIdentifiedObject(stringMeasurementValue);
				if (result == null) result = caseElement(stringMeasurementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.STRING_MEASUREMENT: {
				StringMeasurement stringMeasurement = (StringMeasurement)theEObject;
				T result = caseStringMeasurement(stringMeasurement);
				if (result == null) result = caseMeasurement(stringMeasurement);
				if (result == null) result = caseIdentifiedObject(stringMeasurement);
				if (result == null) result = caseElement(stringMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ANALOG_LIMIT: {
				AnalogLimit analogLimit = (AnalogLimit)theEObject;
				T result = caseAnalogLimit(analogLimit);
				if (result == null) result = caseLimit(analogLimit);
				if (result == null) result = caseIdentifiedObject(analogLimit);
				if (result == null) result = caseElement(analogLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.SET_POINT: {
				SetPoint setPoint = (SetPoint)theEObject;
				T result = caseSetPoint(setPoint);
				if (result == null) result = caseControl(setPoint);
				if (result == null) result = caseIdentifiedObject(setPoint);
				if (result == null) result = caseElement(setPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.LIMIT: {
				Limit limit = (Limit)theEObject;
				T result = caseLimit(limit);
				if (result == null) result = caseIdentifiedObject(limit);
				if (result == null) result = caseElement(limit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.DISCRETE: {
				Discrete discrete = (Discrete)theEObject;
				T result = caseDiscrete(discrete);
				if (result == null) result = caseMeasurement(discrete);
				if (result == null) result = caseIdentifiedObject(discrete);
				if (result == null) result = caseElement(discrete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.VALUE_ALIAS_SET: {
				ValueAliasSet valueAliasSet = (ValueAliasSet)theEObject;
				T result = caseValueAliasSet(valueAliasSet);
				if (result == null) result = caseIdentifiedObject(valueAliasSet);
				if (result == null) result = caseElement(valueAliasSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.QUALITY61850: {
				Quality61850 quality61850 = (Quality61850)theEObject;
				T result = caseQuality61850(quality61850);
				if (result == null) result = caseElement(quality61850);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ACCUMULATOR_VALUE: {
				AccumulatorValue accumulatorValue = (AccumulatorValue)theEObject;
				T result = caseAccumulatorValue(accumulatorValue);
				if (result == null) result = caseMeasurementValue(accumulatorValue);
				if (result == null) result = caseIdentifiedObject(accumulatorValue);
				if (result == null) result = caseElement(accumulatorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = caseControl(command);
				if (result == null) result = caseIdentifiedObject(command);
				if (result == null) result = caseElement(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ACCUMULATOR: {
				Accumulator accumulator = (Accumulator)theEObject;
				T result = caseAccumulator(accumulator);
				if (result == null) result = caseMeasurement(accumulator);
				if (result == null) result = caseIdentifiedObject(accumulator);
				if (result == null) result = caseElement(accumulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.MEASUREMENT_VALUE_QUALITY: {
				MeasurementValueQuality measurementValueQuality = (MeasurementValueQuality)theEObject;
				T result = caseMeasurementValueQuality(measurementValueQuality);
				if (result == null) result = caseQuality61850(measurementValueQuality);
				if (result == null) result = caseElement(measurementValueQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.MEASUREMENT_VALUE: {
				MeasurementValue measurementValue = (MeasurementValue)theEObject;
				T result = caseMeasurementValue(measurementValue);
				if (result == null) result = caseIdentifiedObject(measurementValue);
				if (result == null) result = caseElement(measurementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.DISCRETE_VALUE: {
				DiscreteValue discreteValue = (DiscreteValue)theEObject;
				T result = caseDiscreteValue(discreteValue);
				if (result == null) result = caseMeasurementValue(discreteValue);
				if (result == null) result = caseIdentifiedObject(discreteValue);
				if (result == null) result = caseElement(discreteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ANALOG_LIMIT_SET: {
				AnalogLimitSet analogLimitSet = (AnalogLimitSet)theEObject;
				T result = caseAnalogLimitSet(analogLimitSet);
				if (result == null) result = caseLimitSet(analogLimitSet);
				if (result == null) result = caseIdentifiedObject(analogLimitSet);
				if (result == null) result = caseElement(analogLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.LIMIT_SET: {
				LimitSet limitSet = (LimitSet)theEObject;
				T result = caseLimitSet(limitSet);
				if (result == null) result = caseIdentifiedObject(limitSet);
				if (result == null) result = caseElement(limitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.ACCUMULATOR_LIMIT_SET: {
				AccumulatorLimitSet accumulatorLimitSet = (AccumulatorLimitSet)theEObject;
				T result = caseAccumulatorLimitSet(accumulatorLimitSet);
				if (result == null) result = caseLimitSet(accumulatorLimitSet);
				if (result == null) result = caseIdentifiedObject(accumulatorLimitSet);
				if (result == null) result = caseElement(accumulatorLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseIdentifiedObject(control);
				if (result == null) result = caseElement(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accumulator Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accumulator Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccumulatorLimit(AccumulatorLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value To Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value To Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueToAlias(ValueToAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValueSource(MeasurementValueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalog(Analog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogValue(AnalogValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlType(ControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Measurement Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringMeasurementValue(StringMeasurementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringMeasurement(StringMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogLimit(AnalogLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetPoint(SetPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscrete(Discrete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Alias Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Alias Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueAliasSet(ValueAliasSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality61850</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality61850</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuality61850(Quality61850 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accumulator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accumulator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccumulatorValue(AccumulatorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accumulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accumulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccumulator(Accumulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Value Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Value Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValueQuality(MeasurementValueQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementValue(MeasurementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteValue(DiscreteValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogLimitSet(AnalogLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimitSet(LimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accumulator Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accumulator Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccumulatorLimitSet(AccumulatorLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MeasSwitch
