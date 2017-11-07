/**
 */
package CIM15.IEC61968.Metering.util;

import CIM15.Element;

import CIM15.IEC61968.Assets.Asset;
import CIM15.IEC61968.Assets.AssetContainer;
import CIM15.IEC61968.Assets.AssetFunction;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Location;

import CIM15.IEC61968.Metering.*;

import CIM15.IEC61968.Work.Work;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Meas.MeasurementValue;

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
 * @see CIM15.IEC61968.Metering.MeteringPackage
 * @generated
 */
public class MeteringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeteringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringSwitch() {
		if (modelPackage == null) {
			modelPackage = MeteringPackage.eINSTANCE;
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
			case MeteringPackage.SDP_LOCATION: {
				SDPLocation sdpLocation = (SDPLocation)theEObject;
				T result = caseSDPLocation(sdpLocation);
				if (result == null) result = caseLocation(sdpLocation);
				if (result == null) result = caseIdentifiedObject(sdpLocation);
				if (result == null) result = caseElement(sdpLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.READING: {
				Reading reading = (Reading)theEObject;
				T result = caseReading(reading);
				if (result == null) result = caseMeasurementValue(reading);
				if (result == null) result = caseIdentifiedObject(reading);
				if (result == null) result = caseElement(reading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.SERVICE_DELIVERY_POINT: {
				ServiceDeliveryPoint serviceDeliveryPoint = (ServiceDeliveryPoint)theEObject;
				T result = caseServiceDeliveryPoint(serviceDeliveryPoint);
				if (result == null) result = caseIdentifiedObject(serviceDeliveryPoint);
				if (result == null) result = caseElement(serviceDeliveryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.ELECTRIC_METERING_FUNCTION: {
				ElectricMeteringFunction electricMeteringFunction = (ElectricMeteringFunction)theEObject;
				T result = caseElectricMeteringFunction(electricMeteringFunction);
				if (result == null) result = caseEndDeviceFunction(electricMeteringFunction);
				if (result == null) result = caseAssetFunction(electricMeteringFunction);
				if (result == null) result = caseIdentifiedObject(electricMeteringFunction);
				if (result == null) result = caseElement(electricMeteringFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM: {
				DemandResponseProgram demandResponseProgram = (DemandResponseProgram)theEObject;
				T result = caseDemandResponseProgram(demandResponseProgram);
				if (result == null) result = caseIdentifiedObject(demandResponseProgram);
				if (result == null) result = caseElement(demandResponseProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.READING_MULTIPLIER: {
				ReadingMultiplier readingMultiplier = (ReadingMultiplier)theEObject;
				T result = caseReadingMultiplier(readingMultiplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.METER_READING: {
				MeterReading meterReading = (MeterReading)theEObject;
				T result = caseMeterReading(meterReading);
				if (result == null) result = caseIdentifiedObject(meterReading);
				if (result == null) result = caseElement(meterReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.READING_QUALITY: {
				ReadingQuality readingQuality = (ReadingQuality)theEObject;
				T result = caseReadingQuality(readingQuality);
				if (result == null) result = caseElement(readingQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.END_DEVICE_EVENT: {
				EndDeviceEvent endDeviceEvent = (EndDeviceEvent)theEObject;
				T result = caseEndDeviceEvent(endDeviceEvent);
				if (result == null) result = caseActivityRecord(endDeviceEvent);
				if (result == null) result = caseIdentifiedObject(endDeviceEvent);
				if (result == null) result = caseElement(endDeviceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.INTERVAL_READING: {
				IntervalReading intervalReading = (IntervalReading)theEObject;
				T result = caseIntervalReading(intervalReading);
				if (result == null) result = caseMeasurementValue(intervalReading);
				if (result == null) result = caseIdentifiedObject(intervalReading);
				if (result == null) result = caseElement(intervalReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = caseEndDevice(meter);
				if (result == null) result = caseAssetContainer(meter);
				if (result == null) result = caseAsset(meter);
				if (result == null) result = caseIdentifiedObject(meter);
				if (result == null) result = caseElement(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.METER_SERVICE_WORK: {
				MeterServiceWork meterServiceWork = (MeterServiceWork)theEObject;
				T result = caseMeterServiceWork(meterServiceWork);
				if (result == null) result = caseWork(meterServiceWork);
				if (result == null) result = caseDocument(meterServiceWork);
				if (result == null) result = caseIdentifiedObject(meterServiceWork);
				if (result == null) result = caseElement(meterServiceWork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.PENDING_CALCULATION: {
				PendingCalculation pendingCalculation = (PendingCalculation)theEObject;
				T result = casePendingCalculation(pendingCalculation);
				if (result == null) result = caseElement(pendingCalculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.INTERVAL_BLOCK: {
				IntervalBlock intervalBlock = (IntervalBlock)theEObject;
				T result = caseIntervalBlock(intervalBlock);
				if (result == null) result = caseElement(intervalBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.END_DEVICE_FUNCTION: {
				EndDeviceFunction endDeviceFunction = (EndDeviceFunction)theEObject;
				T result = caseEndDeviceFunction(endDeviceFunction);
				if (result == null) result = caseAssetFunction(endDeviceFunction);
				if (result == null) result = caseIdentifiedObject(endDeviceFunction);
				if (result == null) result = caseElement(endDeviceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.COM_FUNCTION: {
				ComFunction comFunction = (ComFunction)theEObject;
				T result = caseComFunction(comFunction);
				if (result == null) result = caseEndDeviceFunction(comFunction);
				if (result == null) result = caseAssetFunction(comFunction);
				if (result == null) result = caseIdentifiedObject(comFunction);
				if (result == null) result = caseElement(comFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.END_DEVICE: {
				EndDevice endDevice = (EndDevice)theEObject;
				T result = caseEndDevice(endDevice);
				if (result == null) result = caseAssetContainer(endDevice);
				if (result == null) result = caseAsset(endDevice);
				if (result == null) result = caseIdentifiedObject(endDevice);
				if (result == null) result = caseElement(endDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.SIMPLE_END_DEVICE_FUNCTION: {
				SimpleEndDeviceFunction simpleEndDeviceFunction = (SimpleEndDeviceFunction)theEObject;
				T result = caseSimpleEndDeviceFunction(simpleEndDeviceFunction);
				if (result == null) result = caseEndDeviceFunction(simpleEndDeviceFunction);
				if (result == null) result = caseAssetFunction(simpleEndDeviceFunction);
				if (result == null) result = caseIdentifiedObject(simpleEndDeviceFunction);
				if (result == null) result = caseElement(simpleEndDeviceFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.END_DEVICE_GROUP: {
				EndDeviceGroup endDeviceGroup = (EndDeviceGroup)theEObject;
				T result = caseEndDeviceGroup(endDeviceGroup);
				if (result == null) result = caseIdentifiedObject(endDeviceGroup);
				if (result == null) result = caseElement(endDeviceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.REGISTER: {
				Register register = (Register)theEObject;
				T result = caseRegister(register);
				if (result == null) result = caseIdentifiedObject(register);
				if (result == null) result = caseElement(register);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.END_DEVICE_CONTROL: {
				EndDeviceControl endDeviceControl = (EndDeviceControl)theEObject;
				T result = caseEndDeviceControl(endDeviceControl);
				if (result == null) result = caseIdentifiedObject(endDeviceControl);
				if (result == null) result = caseElement(endDeviceControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.DYNAMIC_DEMAND: {
				DynamicDemand dynamicDemand = (DynamicDemand)theEObject;
				T result = caseDynamicDemand(dynamicDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeteringPackage.READING_TYPE: {
				ReadingType readingType = (ReadingType)theEObject;
				T result = caseReadingType(readingType);
				if (result == null) result = caseIdentifiedObject(readingType);
				if (result == null) result = caseElement(readingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDP Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDP Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDPLocation(SDPLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReading(Reading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryPoint(ServiceDeliveryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electric Metering Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electric Metering Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricMeteringFunction(ElectricMeteringFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demand Response Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demand Response Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemandResponseProgram(DemandResponseProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Multiplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Multiplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingMultiplier(ReadingMultiplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterReading(MeterReading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingQuality(ReadingQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceEvent(EndDeviceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalReading(IntervalReading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Service Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Service Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterServiceWork(MeterServiceWork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pending Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pending Calculation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePendingCalculation(PendingCalculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalBlock(IntervalBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceFunction(EndDeviceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComFunction(ComFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDevice(EndDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple End Device Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple End Device Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleEndDeviceFunction(SimpleEndDeviceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceGroup(EndDeviceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegister(Register object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Device Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Device Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndDeviceControl(EndDeviceControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicDemand(DynamicDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingType(ReadingType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetFunction(AssetFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityRecord(ActivityRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssetContainer(AssetContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWork(Work object) {
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

} //MeteringSwitch
