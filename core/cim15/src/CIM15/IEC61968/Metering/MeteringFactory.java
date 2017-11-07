/**
 */
package CIM15.IEC61968.Metering;

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
public class MeteringFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeteringFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeteringFactory INSTANCE = CIM15.IEC61968.Metering.MeteringFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeteringFactory init() {
		try {
			MeteringFactory theMeteringFactory = (MeteringFactory)EPackage.Registry.INSTANCE.getEFactory(MeteringPackage.eNS_URI);
			if (theMeteringFactory != null) {
				return theMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeteringFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringFactory() {
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
			case MeteringPackage.SDP_LOCATION: return createSDPLocation();
			case MeteringPackage.READING: return createReading();
			case MeteringPackage.SERVICE_DELIVERY_POINT: return createServiceDeliveryPoint();
			case MeteringPackage.ELECTRIC_METERING_FUNCTION: return createElectricMeteringFunction();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM: return createDemandResponseProgram();
			case MeteringPackage.READING_MULTIPLIER: return createReadingMultiplier();
			case MeteringPackage.METER_READING: return createMeterReading();
			case MeteringPackage.READING_QUALITY: return createReadingQuality();
			case MeteringPackage.END_DEVICE_EVENT: return createEndDeviceEvent();
			case MeteringPackage.INTERVAL_READING: return createIntervalReading();
			case MeteringPackage.METER: return createMeter();
			case MeteringPackage.METER_SERVICE_WORK: return createMeterServiceWork();
			case MeteringPackage.PENDING_CALCULATION: return createPendingCalculation();
			case MeteringPackage.INTERVAL_BLOCK: return createIntervalBlock();
			case MeteringPackage.END_DEVICE_FUNCTION: return createEndDeviceFunction();
			case MeteringPackage.COM_FUNCTION: return createComFunction();
			case MeteringPackage.END_DEVICE: return createEndDevice();
			case MeteringPackage.SIMPLE_END_DEVICE_FUNCTION: return createSimpleEndDeviceFunction();
			case MeteringPackage.END_DEVICE_GROUP: return createEndDeviceGroup();
			case MeteringPackage.REGISTER: return createRegister();
			case MeteringPackage.END_DEVICE_CONTROL: return createEndDeviceControl();
			case MeteringPackage.DYNAMIC_DEMAND: return createDynamicDemand();
			case MeteringPackage.READING_TYPE: return createReadingType();
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
			case MeteringPackage.END_DEVICE_FUNCTION_KIND:
				return createEndDeviceFunctionKindFromString(eDataType, initialValue);
			case MeteringPackage.READING_KIND:
				return createReadingKindFromString(eDataType, initialValue);
			case MeteringPackage.DEMAND_KIND:
				return createDemandKindFromString(eDataType, initialValue);
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
			case MeteringPackage.END_DEVICE_FUNCTION_KIND:
				return convertEndDeviceFunctionKindToString(eDataType, instanceValue);
			case MeteringPackage.READING_KIND:
				return convertReadingKindToString(eDataType, instanceValue);
			case MeteringPackage.DEMAND_KIND:
				return convertDemandKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPLocation createSDPLocation() {
		SDPLocation sdpLocation = new SDPLocation();
		return sdpLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reading createReading() {
		Reading reading = new Reading();
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint createServiceDeliveryPoint() {
		ServiceDeliveryPoint serviceDeliveryPoint = new ServiceDeliveryPoint();
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricMeteringFunction createElectricMeteringFunction() {
		ElectricMeteringFunction electricMeteringFunction = new ElectricMeteringFunction();
		return electricMeteringFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram createDemandResponseProgram() {
		DemandResponseProgram demandResponseProgram = new DemandResponseProgram();
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingMultiplier createReadingMultiplier() {
		ReadingMultiplier readingMultiplier = new ReadingMultiplier();
		return readingMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterReading createMeterReading() {
		MeterReading meterReading = new MeterReading();
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingQuality createReadingQuality() {
		ReadingQuality readingQuality = new ReadingQuality();
		return readingQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceEvent createEndDeviceEvent() {
		EndDeviceEvent endDeviceEvent = new EndDeviceEvent();
		return endDeviceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalReading createIntervalReading() {
		IntervalReading intervalReading = new IntervalReading();
		return intervalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter createMeter() {
		Meter meter = new Meter();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterServiceWork createMeterServiceWork() {
		MeterServiceWork meterServiceWork = new MeterServiceWork();
		return meterServiceWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PendingCalculation createPendingCalculation() {
		PendingCalculation pendingCalculation = new PendingCalculation();
		return pendingCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalBlock createIntervalBlock() {
		IntervalBlock intervalBlock = new IntervalBlock();
		return intervalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceFunction createEndDeviceFunction() {
		EndDeviceFunction endDeviceFunction = new EndDeviceFunction();
		return endDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComFunction createComFunction() {
		ComFunction comFunction = new ComFunction();
		return comFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDevice createEndDevice() {
		EndDevice endDevice = new EndDevice();
		return endDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEndDeviceFunction createSimpleEndDeviceFunction() {
		SimpleEndDeviceFunction simpleEndDeviceFunction = new SimpleEndDeviceFunction();
		return simpleEndDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceGroup createEndDeviceGroup() {
		EndDeviceGroup endDeviceGroup = new EndDeviceGroup();
		return endDeviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		Register register = new Register();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceControl createEndDeviceControl() {
		EndDeviceControl endDeviceControl = new EndDeviceControl();
		return endDeviceControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicDemand createDynamicDemand() {
		DynamicDemand dynamicDemand = new DynamicDemand();
		return dynamicDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType createReadingType() {
		ReadingType readingType = new ReadingType();
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceFunctionKind createEndDeviceFunctionKindFromString(EDataType eDataType, String initialValue) {
		EndDeviceFunctionKind result = EndDeviceFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndDeviceFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingKind createReadingKindFromString(EDataType eDataType, String initialValue) {
		ReadingKind result = ReadingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandKind createDemandKindFromString(EDataType eDataType, String initialValue) {
		DemandKind result = DemandKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDemandKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringPackage getMeteringPackage() {
		return (MeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeteringPackage getPackage() {
		return MeteringPackage.eINSTANCE;
	}

} //MeteringFactory
