/**
 */
package CIM15.IEC61970.Informative.InfAssetModels;

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
public class InfAssetModelsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfAssetModelsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfAssetModelsFactory INSTANCE = CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfAssetModelsFactory init() {
		try {
			InfAssetModelsFactory theInfAssetModelsFactory = (InfAssetModelsFactory)EPackage.Registry.INSTANCE.getEFactory(InfAssetModelsPackage.eNS_URI);
			if (theInfAssetModelsFactory != null) {
				return theInfAssetModelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfAssetModelsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetModelsFactory() {
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
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE: return createAssetModelCatalogue();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL: return createTransformerAssetModel();
			case InfAssetModelsPackage.ASSET_MODEL_CATALOGUE_ITEM: return createAssetModelCatalogueItem();
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
			case InfAssetModelsPackage.OIL_PRESERVATION_KIND:
				return createOilPreservationKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.TRANSFORMER_CONSTRUCTION_KIND:
				return createTransformerConstructionKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.WINDING_INSULATION_KIND:
				return createWindingInsulationKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.TRANSFORMER_CORE_KIND:
				return createTransformerCoreKindFromString(eDataType, initialValue);
			case InfAssetModelsPackage.TRANSFORMER_FUNCTION_KIND:
				return createTransformerFunctionKindFromString(eDataType, initialValue);
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
			case InfAssetModelsPackage.OIL_PRESERVATION_KIND:
				return convertOilPreservationKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.TRANSFORMER_CONSTRUCTION_KIND:
				return convertTransformerConstructionKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.WINDING_INSULATION_KIND:
				return convertWindingInsulationKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.TRANSFORMER_CORE_KIND:
				return convertTransformerCoreKindToString(eDataType, instanceValue);
			case InfAssetModelsPackage.TRANSFORMER_FUNCTION_KIND:
				return convertTransformerFunctionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogue createAssetModelCatalogue() {
		AssetModelCatalogue assetModelCatalogue = new AssetModelCatalogue();
		return assetModelCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAssetModel createTransformerAssetModel() {
		TransformerAssetModel transformerAssetModel = new TransformerAssetModel();
		return transformerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelCatalogueItem createAssetModelCatalogueItem() {
		AssetModelCatalogueItem assetModelCatalogueItem = new AssetModelCatalogueItem();
		return assetModelCatalogueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OilPreservationKind createOilPreservationKindFromString(EDataType eDataType, String initialValue) {
		OilPreservationKind result = OilPreservationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOilPreservationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerConstructionKind createTransformerConstructionKindFromString(EDataType eDataType, String initialValue) {
		TransformerConstructionKind result = TransformerConstructionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerConstructionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindingInsulationKind createWindingInsulationKindFromString(EDataType eDataType, String initialValue) {
		WindingInsulationKind result = WindingInsulationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingInsulationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerCoreKind createTransformerCoreKindFromString(EDataType eDataType, String initialValue) {
		TransformerCoreKind result = TransformerCoreKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerCoreKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerFunctionKind createTransformerFunctionKindFromString(EDataType eDataType, String initialValue) {
		TransformerFunctionKind result = TransformerFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetModelsPackage getInfAssetModelsPackage() {
		return (InfAssetModelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfAssetModelsPackage getPackage() {
		return InfAssetModelsPackage.eINSTANCE;
	}

} //InfAssetModelsFactory
