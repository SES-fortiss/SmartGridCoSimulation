/**
 */
package CIM15.IEC61968.Assets;

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
public class AssetsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssetsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssetsFactory INSTANCE = CIM15.IEC61968.Assets.AssetsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssetsFactory init() {
		try {
			AssetsFactory theAssetsFactory = (AssetsFactory)EPackage.Registry.INSTANCE.getEFactory(AssetsPackage.eNS_URI);
			if (theAssetsFactory != null) {
				return theAssetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssetsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsFactory() {
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
			case AssetsPackage.PRODUCT_ASSET_MODEL: return createProductAssetModel();
			case AssetsPackage.ASSET_MODEL: return createAssetModel();
			case AssetsPackage.ASSET: return createAsset();
			case AssetsPackage.COM_MEDIA: return createComMedia();
			case AssetsPackage.ASSET_CONTAINER: return createAssetContainer();
			case AssetsPackage.ASSET_FUNCTION: return createAssetFunction();
			case AssetsPackage.SEAL: return createSeal();
			case AssetsPackage.ASSET_INFO: return createAssetInfo();
			case AssetsPackage.ACCEPTANCE_TEST: return createAcceptanceTest();
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
			case AssetsPackage.CORPORATE_STANDARD_KIND:
				return createCorporateStandardKindFromString(eDataType, initialValue);
			case AssetsPackage.SEAL_CONDITION_KIND:
				return createSealConditionKindFromString(eDataType, initialValue);
			case AssetsPackage.SEAL_KIND:
				return createSealKindFromString(eDataType, initialValue);
			case AssetsPackage.ASSET_MODEL_USAGE_KIND:
				return createAssetModelUsageKindFromString(eDataType, initialValue);
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
			case AssetsPackage.CORPORATE_STANDARD_KIND:
				return convertCorporateStandardKindToString(eDataType, instanceValue);
			case AssetsPackage.SEAL_CONDITION_KIND:
				return convertSealConditionKindToString(eDataType, instanceValue);
			case AssetsPackage.SEAL_KIND:
				return convertSealKindToString(eDataType, instanceValue);
			case AssetsPackage.ASSET_MODEL_USAGE_KIND:
				return convertAssetModelUsageKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductAssetModel createProductAssetModel() {
		ProductAssetModel productAssetModel = new ProductAssetModel();
		return productAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModel createAssetModel() {
		AssetModel assetModel = new AssetModel();
		return assetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		Asset asset = new Asset();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComMedia createComMedia() {
		ComMedia comMedia = new ComMedia();
		return comMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer createAssetContainer() {
		AssetContainer assetContainer = new AssetContainer();
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetFunction createAssetFunction() {
		AssetFunction assetFunction = new AssetFunction();
		return assetFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seal createSeal() {
		Seal seal = new Seal();
		return seal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo createAssetInfo() {
		AssetInfo assetInfo = new AssetInfo();
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest createAcceptanceTest() {
		AcceptanceTest acceptanceTest = new AcceptanceTest();
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorporateStandardKind createCorporateStandardKindFromString(EDataType eDataType, String initialValue) {
		CorporateStandardKind result = CorporateStandardKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorporateStandardKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealConditionKind createSealConditionKindFromString(EDataType eDataType, String initialValue) {
		SealConditionKind result = SealConditionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSealConditionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealKind createSealKindFromString(EDataType eDataType, String initialValue) {
		SealKind result = SealKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSealKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelUsageKind createAssetModelUsageKindFromString(EDataType eDataType, String initialValue) {
		AssetModelUsageKind result = AssetModelUsageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetModelUsageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetsPackage getAssetsPackage() {
		return (AssetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssetsPackage getPackage() {
		return AssetsPackage.eINSTANCE;
	}

} //AssetsFactory
