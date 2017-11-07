/**
 */
package CIM15.IEC61970.OperationalLimits;

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
public class OperationalLimitsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OperationalLimitsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OperationalLimitsFactory INSTANCE = CIM15.IEC61970.OperationalLimits.OperationalLimitsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationalLimitsFactory init() {
		try {
			OperationalLimitsFactory theOperationalLimitsFactory = (OperationalLimitsFactory)EPackage.Registry.INSTANCE.getEFactory(OperationalLimitsPackage.eNS_URI);
			if (theOperationalLimitsFactory != null) {
				return theOperationalLimitsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationalLimitsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsFactory() {
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT: return createApparentPowerLimit();
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT: return createActivePowerLimit();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE: return createOperationalLimitType();
			case OperationalLimitsPackage.BRANCH_GROUP: return createBranchGroup();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET: return createOperationalLimitSet();
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET: return createActivePowerLimitSet();
			case OperationalLimitsPackage.CURRENT_LIMIT: return createCurrentLimit();
			case OperationalLimitsPackage.CURRENT_LIMIT_SET: return createCurrentLimitSet();
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET: return createApparentPowerLimitSet();
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL: return createBranchGroupTerminal();
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET: return createVoltageLimitSet();
			case OperationalLimitsPackage.VOLTAGE_LIMIT: return createVoltageLimit();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT: return createOperationalLimit();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
				return createOperationalLimitDirectionKindFromString(eDataType, initialValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_DIRECTION_KIND:
				return convertOperationalLimitDirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApparentPowerLimit createApparentPowerLimit() {
		ApparentPowerLimit apparentPowerLimit = new ApparentPowerLimit();
		return apparentPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivePowerLimit createActivePowerLimit() {
		ActivePowerLimit activePowerLimit = new ActivePowerLimit();
		return activePowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitType createOperationalLimitType() {
		OperationalLimitType operationalLimitType = new OperationalLimitType();
		return operationalLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroup createBranchGroup() {
		BranchGroup branchGroup = new BranchGroup();
		return branchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet createOperationalLimitSet() {
		OperationalLimitSet operationalLimitSet = new OperationalLimitSet();
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivePowerLimitSet createActivePowerLimitSet() {
		ActivePowerLimitSet activePowerLimitSet = new ActivePowerLimitSet();
		return activePowerLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentLimit createCurrentLimit() {
		CurrentLimit currentLimit = new CurrentLimit();
		return currentLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentLimitSet createCurrentLimitSet() {
		CurrentLimitSet currentLimitSet = new CurrentLimitSet();
		return currentLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApparentPowerLimitSet createApparentPowerLimitSet() {
		ApparentPowerLimitSet apparentPowerLimitSet = new ApparentPowerLimitSet();
		return apparentPowerLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroupTerminal createBranchGroupTerminal() {
		BranchGroupTerminal branchGroupTerminal = new BranchGroupTerminal();
		return branchGroupTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLimitSet createVoltageLimitSet() {
		VoltageLimitSet voltageLimitSet = new VoltageLimitSet();
		return voltageLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLimit createVoltageLimit() {
		VoltageLimit voltageLimit = new VoltageLimit();
		return voltageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimit createOperationalLimit() {
		OperationalLimit operationalLimit = new OperationalLimit();
		return operationalLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitDirectionKind createOperationalLimitDirectionKindFromString(EDataType eDataType, String initialValue) {
		OperationalLimitDirectionKind result = OperationalLimitDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalLimitDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsPackage getOperationalLimitsPackage() {
		return (OperationalLimitsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationalLimitsPackage getPackage() {
		return OperationalLimitsPackage.eINSTANCE;
	}

} //OperationalLimitsFactory
