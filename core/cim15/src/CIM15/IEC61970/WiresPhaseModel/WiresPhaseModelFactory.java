/**
 */
package CIM15.IEC61970.WiresPhaseModel;

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
public class WiresPhaseModelFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WiresPhaseModelFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WiresPhaseModelFactory INSTANCE = CIM15.IEC61970.WiresPhaseModel.WiresPhaseModelFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiresPhaseModelFactory init() {
		try {
			WiresPhaseModelFactory theWiresPhaseModelFactory = (WiresPhaseModelFactory)EPackage.Registry.INSTANCE.getEFactory(WiresPhaseModelPackage.eNS_URI);
			if (theWiresPhaseModelFactory != null) {
				return theWiresPhaseModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiresPhaseModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresPhaseModelFactory() {
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
			case WiresPhaseModelPackage.SWITCH_PHASE: return createSwitchPhase();
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE: return createShuntCompensatorPhase();
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE: return createEnergyConsumerPhase();
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
			case WiresPhaseModelPackage.SINGLE_PHASE_KIND:
				return createSinglePhaseKindFromString(eDataType, initialValue);
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
			case WiresPhaseModelPackage.SINGLE_PHASE_KIND:
				return convertSinglePhaseKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchPhase createSwitchPhase() {
		SwitchPhase switchPhase = new SwitchPhase();
		return switchPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensatorPhase createShuntCompensatorPhase() {
		ShuntCompensatorPhase shuntCompensatorPhase = new ShuntCompensatorPhase();
		return shuntCompensatorPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumerPhase createEnergyConsumerPhase() {
		EnergyConsumerPhase energyConsumerPhase = new EnergyConsumerPhase();
		return energyConsumerPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePhaseKind createSinglePhaseKindFromString(EDataType eDataType, String initialValue) {
		SinglePhaseKind result = SinglePhaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSinglePhaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresPhaseModelPackage getWiresPhaseModelPackage() {
		return (WiresPhaseModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiresPhaseModelPackage getPackage() {
		return WiresPhaseModelPackage.eINSTANCE;
	}

} //WiresPhaseModelFactory
