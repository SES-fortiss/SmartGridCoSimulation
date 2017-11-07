/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeasFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeasFactory INSTANCE = CIM15.IEC61970.Meas.MeasFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasFactory init() {
		try {
			MeasFactory theMeasFactory = (MeasFactory)EPackage.Registry.INSTANCE.getEFactory(MeasPackage.eNS_URI);
			if (theMeasFactory != null) {
				return theMeasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeasFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MeasPackage.ACCUMULATOR_LIMIT: return createAccumulatorLimit();
			case MeasPackage.VALUE_TO_ALIAS: return createValueToAlias();
			case MeasPackage.MEASUREMENT_VALUE_SOURCE: return createMeasurementValueSource();
			case MeasPackage.ANALOG: return createAnalog();
			case MeasPackage.ANALOG_VALUE: return createAnalogValue();
			case MeasPackage.MEASUREMENT: return createMeasurement();
			case MeasPackage.CONTROL_TYPE: return createControlType();
			case MeasPackage.STRING_MEASUREMENT_VALUE: return createStringMeasurementValue();
			case MeasPackage.STRING_MEASUREMENT: return createStringMeasurement();
			case MeasPackage.ANALOG_LIMIT: return createAnalogLimit();
			case MeasPackage.SET_POINT: return createSetPoint();
			case MeasPackage.LIMIT: return createLimit();
			case MeasPackage.DISCRETE: return createDiscrete();
			case MeasPackage.VALUE_ALIAS_SET: return createValueAliasSet();
			case MeasPackage.QUALITY61850: return createQuality61850();
			case MeasPackage.ACCUMULATOR_VALUE: return createAccumulatorValue();
			case MeasPackage.COMMAND: return createCommand();
			case MeasPackage.ACCUMULATOR: return createAccumulator();
			case MeasPackage.MEASUREMENT_VALUE_QUALITY: return createMeasurementValueQuality();
			case MeasPackage.MEASUREMENT_VALUE: return createMeasurementValue();
			case MeasPackage.DISCRETE_VALUE: return createDiscreteValue();
			case MeasPackage.ANALOG_LIMIT_SET: return createAnalogLimitSet();
			case MeasPackage.LIMIT_SET: return createLimitSet();
			case MeasPackage.ACCUMULATOR_LIMIT_SET: return createAccumulatorLimitSet();
			case MeasPackage.CONTROL: return createControl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MeasPackage.VALIDITY:
				return createValidityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MeasPackage.VALIDITY:
				return convertValidityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorLimit createAccumulatorLimit() {
		AccumulatorLimit accumulatorLimit = new AccumulatorLimit();
		return accumulatorLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueToAlias createValueToAlias() {
		ValueToAlias valueToAlias = new ValueToAlias();
		return valueToAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueSource createMeasurementValueSource() {
		MeasurementValueSource measurementValueSource = new MeasurementValueSource();
		return measurementValueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog createAnalog() {
		Analog analog = new Analog();
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue createAnalogValue() {
		AnalogValue analogValue = new AnalogValue();
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		Measurement measurement = new Measurement();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlType() {
		ControlType controlType = new ControlType();
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurementValue createStringMeasurementValue() {
		StringMeasurementValue stringMeasurementValue = new StringMeasurementValue();
		return stringMeasurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurement createStringMeasurement() {
		StringMeasurement stringMeasurement = new StringMeasurement();
		return stringMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogLimit createAnalogLimit() {
		AnalogLimit analogLimit = new AnalogLimit();
		return analogLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetPoint createSetPoint() {
		SetPoint setPoint = new SetPoint();
		return setPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		Limit limit = new Limit();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete createDiscrete() {
		Discrete discrete = new Discrete();
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAliasSet createValueAliasSet() {
		ValueAliasSet valueAliasSet = new ValueAliasSet();
		return valueAliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality61850 createQuality61850() {
		Quality61850 quality61850 = new Quality61850();
		return quality61850;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorValue createAccumulatorValue() {
		AccumulatorValue accumulatorValue = new AccumulatorValue();
		return accumulatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		Command command = new Command();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator createAccumulator() {
		Accumulator accumulator = new Accumulator();
		return accumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValueQuality createMeasurementValueQuality() {
		MeasurementValueQuality measurementValueQuality = new MeasurementValueQuality();
		return measurementValueQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue createMeasurementValue() {
		MeasurementValue measurementValue = new MeasurementValue();
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteValue createDiscreteValue() {
		DiscreteValue discreteValue = new DiscreteValue();
		return discreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogLimitSet createAnalogLimitSet() {
		AnalogLimitSet analogLimitSet = new AnalogLimitSet();
		return analogLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitSet createLimitSet() {
		LimitSet limitSet = new LimitSet();
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorLimitSet createAccumulatorLimitSet() {
		AccumulatorLimitSet accumulatorLimitSet = new AccumulatorLimitSet();
		return accumulatorLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		Control control = new Control();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validity createValidityFromString(EDataType eDataType, String initialValue) {
		Validity result = Validity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasPackage getMeasPackage() {
		return (MeasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeasPackage getPackage() {
		return MeasPackage.eINSTANCE;
	}

} //MeasFactory
