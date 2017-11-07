/**
 */
package CIM15.PackageDependencies;

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
public class PackageDependenciesFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PackageDependenciesFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PackageDependenciesFactory INSTANCE = CIM15.PackageDependencies.PackageDependenciesFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageDependenciesFactory init() {
		try {
			PackageDependenciesFactory thePackageDependenciesFactory = (PackageDependenciesFactory)EPackage.Registry.INSTANCE.getEFactory(PackageDependenciesPackage.eNS_URI);
			if (thePackageDependenciesFactory != null) {
				return thePackageDependenciesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackageDependenciesFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependenciesFactory() {
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION: return createPackageDependenciesCIMVeresion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependenciesCIMVeresion createPackageDependenciesCIMVeresion() {
		PackageDependenciesCIMVeresion packageDependenciesCIMVeresion = new PackageDependenciesCIMVeresion();
		return packageDependenciesCIMVeresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependenciesPackage getPackageDependenciesPackage() {
		return (PackageDependenciesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackageDependenciesPackage getPackage() {
		return PackageDependenciesPackage.eINSTANCE;
	}

} //PackageDependenciesFactory
