/**
 */
package CIM15.IEC61970.Equivalents;

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
public class EquivalentsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EquivalentsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EquivalentsFactory INSTANCE = CIM15.IEC61970.Equivalents.EquivalentsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EquivalentsFactory init() {
		try {
			EquivalentsFactory theEquivalentsFactory = (EquivalentsFactory)EPackage.Registry.INSTANCE.getEFactory(EquivalentsPackage.eNS_URI);
			if (theEquivalentsFactory != null) {
				return theEquivalentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EquivalentsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentsFactory() {
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
			case EquivalentsPackage.EQUIVALENT_SHUNT: return createEquivalentShunt();
			case EquivalentsPackage.EQUIVALENT_EQUIPMENT: return createEquivalentEquipment();
			case EquivalentsPackage.EQUIVALENT_NETWORK: return createEquivalentNetwork();
			case EquivalentsPackage.EQUIVALENT_INJECTION: return createEquivalentInjection();
			case EquivalentsPackage.EQUIVALENT_BRANCH: return createEquivalentBranch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentShunt createEquivalentShunt() {
		EquivalentShunt equivalentShunt = new EquivalentShunt();
		return equivalentShunt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentEquipment createEquivalentEquipment() {
		EquivalentEquipment equivalentEquipment = new EquivalentEquipment();
		return equivalentEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentNetwork createEquivalentNetwork() {
		EquivalentNetwork equivalentNetwork = new EquivalentNetwork();
		return equivalentNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentInjection createEquivalentInjection() {
		EquivalentInjection equivalentInjection = new EquivalentInjection();
		return equivalentInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentBranch createEquivalentBranch() {
		EquivalentBranch equivalentBranch = new EquivalentBranch();
		return equivalentBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalentsPackage getEquivalentsPackage() {
		return (EquivalentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EquivalentsPackage getPackage() {
		return EquivalentsPackage.eINSTANCE;
	}

} //EquivalentsFactory
