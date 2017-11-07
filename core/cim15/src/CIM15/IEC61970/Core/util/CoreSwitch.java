/**
 */
package CIM15.IEC61970.Core.util;

import CIM15.Element;

import CIM15.IEC61970.Core.*;

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
 * @see CIM15.IEC61970.Core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.POWER_SYSTEM_RESOURCE: {
				PowerSystemResource powerSystemResource = (PowerSystemResource)theEObject;
				T result = casePowerSystemResource(powerSystemResource);
				if (result == null) result = caseIdentifiedObject(powerSystemResource);
				if (result == null) result = caseElement(powerSystemResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAME_TYPE_AUTHORITY: {
				NameTypeAuthority nameTypeAuthority = (NameTypeAuthority)theEObject;
				T result = caseNameTypeAuthority(nameTypeAuthority);
				if (result == null) result = caseElement(nameTypeAuthority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUIPMENT: {
				Equipment equipment = (Equipment)theEObject;
				T result = caseEquipment(equipment);
				if (result == null) result = casePowerSystemResource(equipment);
				if (result == null) result = caseIdentifiedObject(equipment);
				if (result == null) result = caseElement(equipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONDUCTING_EQUIPMENT: {
				ConductingEquipment conductingEquipment = (ConductingEquipment)theEObject;
				T result = caseConductingEquipment(conductingEquipment);
				if (result == null) result = caseEquipment(conductingEquipment);
				if (result == null) result = casePowerSystemResource(conductingEquipment);
				if (result == null) result = caseIdentifiedObject(conductingEquipment);
				if (result == null) result = caseElement(conductingEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REGULAR_TIME_POINT: {
				RegularTimePoint regularTimePoint = (RegularTimePoint)theEObject;
				T result = caseRegularTimePoint(regularTimePoint);
				if (result == null) result = caseElement(regularTimePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONNECTIVITY_NODE: {
				ConnectivityNode connectivityNode = (ConnectivityNode)theEObject;
				T result = caseConnectivityNode(connectivityNode);
				if (result == null) result = caseIdentifiedObject(connectivityNode);
				if (result == null) result = caseElement(connectivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PSR_TYPE: {
				PSRType psrType = (PSRType)theEObject;
				T result = casePSRType(psrType);
				if (result == null) result = caseIdentifiedObject(psrType);
				if (result == null) result = caseElement(psrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONNECTIVITY_NODE_CONTAINER: {
				ConnectivityNodeContainer connectivityNodeContainer = (ConnectivityNodeContainer)theEObject;
				T result = caseConnectivityNodeContainer(connectivityNodeContainer);
				if (result == null) result = casePowerSystemResource(connectivityNodeContainer);
				if (result == null) result = caseIdentifiedObject(connectivityNodeContainer);
				if (result == null) result = caseElement(connectivityNodeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BAY: {
				Bay bay = (Bay)theEObject;
				T result = caseBay(bay);
				if (result == null) result = caseEquipmentContainer(bay);
				if (result == null) result = caseConnectivityNodeContainer(bay);
				if (result == null) result = casePowerSystemResource(bay);
				if (result == null) result = caseIdentifiedObject(bay);
				if (result == null) result = caseElement(bay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUIPMENT_CONTAINER: {
				EquipmentContainer equipmentContainer = (EquipmentContainer)theEObject;
				T result = caseEquipmentContainer(equipmentContainer);
				if (result == null) result = caseConnectivityNodeContainer(equipmentContainer);
				if (result == null) result = casePowerSystemResource(equipmentContainer);
				if (result == null) result = caseIdentifiedObject(equipmentContainer);
				if (result == null) result = caseElement(equipmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REPORTING_GROUP: {
				ReportingGroup reportingGroup = (ReportingGroup)theEObject;
				T result = caseReportingGroup(reportingGroup);
				if (result == null) result = caseIdentifiedObject(reportingGroup);
				if (result == null) result = caseElement(reportingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASE_POWER: {
				BasePower basePower = (BasePower)theEObject;
				T result = caseBasePower(basePower);
				if (result == null) result = caseIdentifiedObject(basePower);
				if (result == null) result = caseElement(basePower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PSR_LIST: {
				PsrList psrList = (PsrList)theEObject;
				T result = casePsrList(psrList);
				if (result == null) result = caseIdentifiedObject(psrList);
				if (result == null) result = caseElement(psrList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IDENTIFIED_OBJECT: {
				IdentifiedObject identifiedObject = (IdentifiedObject)theEObject;
				T result = caseIdentifiedObject(identifiedObject);
				if (result == null) result = caseElement(identifiedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASIC_INTERVAL_SCHEDULE: {
				BasicIntervalSchedule basicIntervalSchedule = (BasicIntervalSchedule)theEObject;
				T result = caseBasicIntervalSchedule(basicIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(basicIntervalSchedule);
				if (result == null) result = caseElement(basicIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CURVE: {
				Curve curve = (Curve)theEObject;
				T result = caseCurve(curve);
				if (result == null) result = caseIdentifiedObject(curve);
				if (result == null) result = caseElement(curve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GEOGRAPHICAL_REGION: {
				GeographicalRegion geographicalRegion = (GeographicalRegion)theEObject;
				T result = caseGeographicalRegion(geographicalRegion);
				if (result == null) result = caseIdentifiedObject(geographicalRegion);
				if (result == null) result = caseElement(geographicalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CURVE_DATA: {
				CurveData curveData = (CurveData)theEObject;
				T result = caseCurveData(curveData);
				if (result == null) result = caseElement(curveData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUB_GEOGRAPHICAL_REGION: {
				SubGeographicalRegion subGeographicalRegion = (SubGeographicalRegion)theEObject;
				T result = caseSubGeographicalRegion(subGeographicalRegion);
				if (result == null) result = caseIdentifiedObject(subGeographicalRegion);
				if (result == null) result = caseElement(subGeographicalRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				T result = caseNameType(nameType);
				if (result == null) result = caseElement(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBSTATION: {
				Substation substation = (Substation)theEObject;
				T result = caseSubstation(substation);
				if (result == null) result = caseEquipmentContainer(substation);
				if (result == null) result = caseConnectivityNodeContainer(substation);
				if (result == null) result = casePowerSystemResource(substation);
				if (result == null) result = caseIdentifiedObject(substation);
				if (result == null) result = caseElement(substation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAME: {
				Name name = (Name)theEObject;
				T result = caseName(name);
				if (result == null) result = caseElement(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASE_VOLTAGE: {
				BaseVoltage baseVoltage = (BaseVoltage)theEObject;
				T result = caseBaseVoltage(baseVoltage);
				if (result == null) result = caseIdentifiedObject(baseVoltage);
				if (result == null) result = caseElement(baseVoltage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseIdentifiedObject(terminal);
				if (result == null) result = caseElement(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IRREGULAR_INTERVAL_SCHEDULE: {
				IrregularIntervalSchedule irregularIntervalSchedule = (IrregularIntervalSchedule)theEObject;
				T result = caseIrregularIntervalSchedule(irregularIntervalSchedule);
				if (result == null) result = caseBasicIntervalSchedule(irregularIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(irregularIntervalSchedule);
				if (result == null) result = caseElement(irregularIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REGULAR_INTERVAL_SCHEDULE: {
				RegularIntervalSchedule regularIntervalSchedule = (RegularIntervalSchedule)theEObject;
				T result = caseRegularIntervalSchedule(regularIntervalSchedule);
				if (result == null) result = caseBasicIntervalSchedule(regularIntervalSchedule);
				if (result == null) result = caseIdentifiedObject(regularIntervalSchedule);
				if (result == null) result = caseElement(regularIntervalSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OPERATING_PARTICIPANT: {
				OperatingParticipant operatingParticipant = (OperatingParticipant)theEObject;
				T result = caseOperatingParticipant(operatingParticipant);
				if (result == null) result = caseIdentifiedObject(operatingParticipant);
				if (result == null) result = caseElement(operatingParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OPERATING_SHARE: {
				OperatingShare operatingShare = (OperatingShare)theEObject;
				T result = caseOperatingShare(operatingShare);
				if (result == null) result = caseElement(operatingShare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VOLTAGE_LEVEL: {
				VoltageLevel voltageLevel = (VoltageLevel)theEObject;
				T result = caseVoltageLevel(voltageLevel);
				if (result == null) result = caseEquipmentContainer(voltageLevel);
				if (result == null) result = caseConnectivityNodeContainer(voltageLevel);
				if (result == null) result = casePowerSystemResource(voltageLevel);
				if (result == null) result = caseIdentifiedObject(voltageLevel);
				if (result == null) result = caseElement(voltageLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REPORTING_SUPER_GROUP: {
				ReportingSuperGroup reportingSuperGroup = (ReportingSuperGroup)theEObject;
				T result = caseReportingSuperGroup(reportingSuperGroup);
				if (result == null) result = caseIdentifiedObject(reportingSuperGroup);
				if (result == null) result = caseElement(reportingSuperGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IRREGULAR_TIME_POINT: {
				IrregularTimePoint irregularTimePoint = (IrregularTimePoint)theEObject;
				T result = caseIrregularTimePoint(irregularTimePoint);
				if (result == null) result = caseElement(irregularTimePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSystemResource(PowerSystemResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type Authority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type Authority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameTypeAuthority(NameTypeAuthority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductingEquipment(ConductingEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularTimePoint(RegularTimePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityNode(ConnectivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSR Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSR Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSRType(PSRType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityNodeContainer(ConnectivityNodeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBay(Bay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipmentContainer(EquipmentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reporting Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reporting Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportingGroup(ReportingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePower(BasePower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Psr List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Psr List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePsrList(PsrList object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIntervalSchedule(BasicIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurve(Curve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicalRegion(GeographicalRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveData(CurveData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubGeographicalRegion(SubGeographicalRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType(NameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstation(Substation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseVoltage(BaseVoltage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irregular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irregular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrregularIntervalSchedule(IrregularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularIntervalSchedule(RegularIntervalSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingParticipant(OperatingParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating Share</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating Share</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingShare(OperatingShare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageLevel(VoltageLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reporting Super Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reporting Super Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportingSuperGroup(ReportingSuperGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irregular Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irregular Time Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrregularTimePoint(IrregularTimePoint object) {
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

} //CoreSwitch
