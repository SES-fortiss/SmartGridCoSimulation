/**
 */
package CIM15.IEC61970.AuxiliaryEquipment;

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
public class AuxiliaryEquipmentFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AuxiliaryEquipmentFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AuxiliaryEquipmentFactory INSTANCE = CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuxiliaryEquipmentFactory init() {
		try {
			AuxiliaryEquipmentFactory theAuxiliaryEquipmentFactory = (AuxiliaryEquipmentFactory)EPackage.Registry.INSTANCE.getEFactory(AuxiliaryEquipmentPackage.eNS_URI);
			if (theAuxiliaryEquipmentFactory != null) {
				return theAuxiliaryEquipmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuxiliaryEquipmentFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryEquipmentFactory() {
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER: return createPotentialTransformer();
			case AuxiliaryEquipmentPackage.SENSOR: return createSensor();
			case AuxiliaryEquipmentPackage.AUXILIARY_EQUIPMENT: return createAuxiliaryEquipment();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER: return createCurrentTransformer();
			case AuxiliaryEquipmentPackage.SURGE_PROTECTOR: return createSurgeProtector();
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR: return createFaultIndicator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialTransformer createPotentialTransformer() {
		PotentialTransformer potentialTransformer = new PotentialTransformer();
		return potentialTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		Sensor sensor = new Sensor();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryEquipment createAuxiliaryEquipment() {
		AuxiliaryEquipment auxiliaryEquipment = new AuxiliaryEquipment();
		return auxiliaryEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTransformer createCurrentTransformer() {
		CurrentTransformer currentTransformer = new CurrentTransformer();
		return currentTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeProtector createSurgeProtector() {
		SurgeProtector surgeProtector = new SurgeProtector();
		return surgeProtector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicator createFaultIndicator() {
		FaultIndicator faultIndicator = new FaultIndicator();
		return faultIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryEquipmentPackage getAuxiliaryEquipmentPackage() {
		return (AuxiliaryEquipmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuxiliaryEquipmentPackage getPackage() {
		return AuxiliaryEquipmentPackage.eINSTANCE;
	}

} //AuxiliaryEquipmentFactory
