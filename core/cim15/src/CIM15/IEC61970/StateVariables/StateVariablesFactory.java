/**
 */
package CIM15.IEC61970.StateVariables;

import org.eclipse.emf.ecore.EClass;
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
public class StateVariablesFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StateVariablesFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StateVariablesFactory INSTANCE = CIM15.IEC61970.StateVariables.StateVariablesFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateVariablesFactory init() {
		try {
			StateVariablesFactory theStateVariablesFactory = (StateVariablesFactory)EPackage.Registry.INSTANCE.getEFactory(StateVariablesPackage.eNS_URI);
			if (theStateVariablesFactory != null) {
				return theStateVariablesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateVariablesFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariablesFactory() {
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
			case StateVariablesPackage.SV_VOLTAGE: return createSvVoltage();
			case StateVariablesPackage.SV_SHORT_CIRCUIT: return createSvShortCircuit();
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS: return createSvShuntCompensatorSections();
			case StateVariablesPackage.STATE_VARIABLE: return createStateVariable();
			case StateVariablesPackage.SV_TAP_STEP: return createSvTapStep();
			case StateVariablesPackage.SV_STATUS: return createSvStatus();
			case StateVariablesPackage.SV_INJECTION: return createSvInjection();
			case StateVariablesPackage.SV_POWER_FLOW: return createSvPowerFlow();
			case StateVariablesPackage.TOPOLOGICAL_ISLAND: return createTopologicalIsland();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvVoltage createSvVoltage() {
		SvVoltage svVoltage = new SvVoltage();
		return svVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShortCircuit createSvShortCircuit() {
		SvShortCircuit svShortCircuit = new SvShortCircuit();
		return svShortCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShuntCompensatorSections createSvShuntCompensatorSections() {
		SvShuntCompensatorSections svShuntCompensatorSections = new SvShuntCompensatorSections();
		return svShuntCompensatorSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable createStateVariable() {
		StateVariable stateVariable = new StateVariable();
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvTapStep createSvTapStep() {
		SvTapStep svTapStep = new SvTapStep();
		return svTapStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvStatus createSvStatus() {
		SvStatus svStatus = new SvStatus();
		return svStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvInjection createSvInjection() {
		SvInjection svInjection = new SvInjection();
		return svInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvPowerFlow createSvPowerFlow() {
		SvPowerFlow svPowerFlow = new SvPowerFlow();
		return svPowerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalIsland createTopologicalIsland() {
		TopologicalIsland topologicalIsland = new TopologicalIsland();
		return topologicalIsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariablesPackage getStateVariablesPackage() {
		return (StateVariablesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateVariablesPackage getPackage() {
		return StateVariablesPackage.eINSTANCE;
	}

} //StateVariablesFactory
