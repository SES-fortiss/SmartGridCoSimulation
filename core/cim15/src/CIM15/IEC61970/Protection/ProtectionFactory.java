/**
 */
package CIM15.IEC61970.Protection;

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
public class ProtectionFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProtectionFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProtectionFactory INSTANCE = CIM15.IEC61970.Protection.ProtectionFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtectionFactory init() {
		try {
			ProtectionFactory theProtectionFactory = (ProtectionFactory)EPackage.Registry.INSTANCE.getEFactory(ProtectionPackage.eNS_URI);
			if (theProtectionFactory != null) {
				return theProtectionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProtectionFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionFactory() {
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
			case ProtectionPackage.RECLOSE_SEQUENCE: return createRecloseSequence();
			case ProtectionPackage.SYNCHROCHECK_RELAY: return createSynchrocheckRelay();
			case ProtectionPackage.CURRENT_RELAY: return createCurrentRelay();
			case ProtectionPackage.PROTECTION_EQUIPMENT: return createProtectionEquipment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecloseSequence createRecloseSequence() {
		RecloseSequence recloseSequence = new RecloseSequence();
		return recloseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchrocheckRelay createSynchrocheckRelay() {
		SynchrocheckRelay synchrocheckRelay = new SynchrocheckRelay();
		return synchrocheckRelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentRelay createCurrentRelay() {
		CurrentRelay currentRelay = new CurrentRelay();
		return currentRelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionEquipment createProtectionEquipment() {
		ProtectionEquipment protectionEquipment = new ProtectionEquipment();
		return protectionEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionPackage getProtectionPackage() {
		return (ProtectionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProtectionPackage getPackage() {
		return ProtectionPackage.eINSTANCE;
	}

} //ProtectionFactory
