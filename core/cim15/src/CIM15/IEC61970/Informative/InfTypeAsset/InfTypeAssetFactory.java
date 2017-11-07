/**
 */
package CIM15.IEC61970.Informative.InfTypeAsset;

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
public class InfTypeAssetFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfTypeAssetFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfTypeAssetFactory INSTANCE = CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfTypeAssetFactory init() {
		try {
			InfTypeAssetFactory theInfTypeAssetFactory = (InfTypeAssetFactory)EPackage.Registry.INSTANCE.getEFactory(InfTypeAssetPackage.eNS_URI);
			if (theInfTypeAssetFactory != null) {
				return theInfTypeAssetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfTypeAssetFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfTypeAssetFactory() {
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
			case InfTypeAssetPackage.TYPE_ASSET_CATALOGUE: return createTypeAssetCatalogue();
			case InfTypeAssetPackage.GENERATOR_TYPE_ASSET: return createGeneratorTypeAsset();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssetCatalogue createTypeAssetCatalogue() {
		TypeAssetCatalogue typeAssetCatalogue = new TypeAssetCatalogue();
		return typeAssetCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorTypeAsset createGeneratorTypeAsset() {
		GeneratorTypeAsset generatorTypeAsset = new GeneratorTypeAsset();
		return generatorTypeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfTypeAssetPackage getInfTypeAssetPackage() {
		return (InfTypeAssetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfTypeAssetPackage getPackage() {
		return InfTypeAssetPackage.eINSTANCE;
	}

} //InfTypeAssetFactory
